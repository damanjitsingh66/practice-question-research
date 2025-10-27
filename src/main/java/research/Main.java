package research;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.ReplaceMissingValues;
import weka.filters.supervised.attribute.AttributeSelection;
import weka.attributeSelection.InfoGainAttributeEval;
import weka.attributeSelection.Ranker;
import weka.filters.supervised.instance.SMOTE;
import weka.classifiers.trees.RandomForest;
import weka.classifiers.functions.SMO; // SVM
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.trees.RandomTree;
import weka.classifiers.lazy.IBk;
import weka.classifiers.meta.Vote;
import weka.classifiers.Evaluation;
import weka.classifiers.Classifier;

import java.util.Random;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("=== SOFTWARE DEFECT PREDICTION (HYBRID MODEL with DATA BALANCING) ===");

    // Load NASA KC1 dataset
    String datasetPath = "data/kc1.arff";
    DataSource source = new DataSource(datasetPath);
    Instances data = source.getDataSet();

    if (data.classIndex() == -1)
      data.setClassIndex(data.numAttributes() - 1);

    // 1️⃣ Handle missing values
    ReplaceMissingValues replaceMissing = new ReplaceMissingValues();
    replaceMissing.setInputFormat(data);
    Instances noMissing = Filter.useFilter(data, replaceMissing);

    // 2️⃣ Feature selection using Information Gain
    AttributeSelection attrSel = new AttributeSelection();
    InfoGainAttributeEval eval = new InfoGainAttributeEval();
    Ranker ranker = new Ranker();
    ranker.setNumToSelect(10);
    attrSel.setEvaluator(eval);
    attrSel.setSearch(ranker);
    attrSel.setInputFormat(noMissing);
    Instances reduced = Filter.useFilter(noMissing, attrSel);

    // 3️⃣ Apply SMOTE for Data Balancing
    SMOTE smote = new SMOTE();
    smote.setInputFormat(reduced);
    smote.setPercentage(200); // increases minority class samples by 200%
    smote.setNearestNeighbors(5);
    Instances balanced = Filter.useFilter(reduced, smote);

    System.out.println("\nDataset after preprocessing:");
    System.out.println("Instances: " + balanced.numInstances());
    System.out.println("Attributes: " + balanced.numAttributes());

    // 4️⃣ Build individual base models
    RandomForest rf = new RandomForest();
    rf.setNumIterations(200);
    rf.setSeed(42);

    SMO svm = new SMO();
    NaiveBayes nb = new NaiveBayes();

    RandomTree rt = new RandomTree();
    rt.setSeed(42);

    IBk knn = new IBk();
    knn.setKNN(5);

    // 5️⃣ Create Hybrid Ensemble using Majority Voting
    Vote hybrid = new Vote();
    Classifier[] classifiers = {rf, svm, nb, rt, knn};
    hybrid.setClassifiers(classifiers);
    hybrid.setOptions(new String[]{"-R", "MAJ"}); // majority voting

    System.out.println("\n=== TRAINING HYBRID ENSEMBLE MODEL ===");
    evaluateCombinedHybrid(hybrid, balanced);
  }

  private static void evaluateCombinedHybrid(Classifier classifier, Instances data) throws Exception {
    Evaluation eval = new Evaluation(data);
    Random random = new Random(1);

    // Perform 10-fold cross-validation
    eval.crossValidateModel(classifier, data, 10, random);

    System.out.println("\n=== COMBINED HYBRID MODEL PERFORMANCE ===");
    System.out.printf("Accuracy: %.2f%%\n", (1 - eval.errorRate()) * 100);
    System.out.printf("Precision: %.4f | Recall: %.4f | F1: %.4f | AUC: %.4f\n",
            eval.weightedPrecision(),
            eval.weightedRecall(),
            eval.weightedFMeasure(),
            eval.weightedAreaUnderROC());

    System.out.println("\nThis accuracy represents the performance of ALL FIVE classifiers working together\n" +
            "under a Majority Voting ensemble — a true hybrid combination with balanced data.");
  }
}
