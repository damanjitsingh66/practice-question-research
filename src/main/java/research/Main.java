package research;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.SMO;
import weka.classifiers.lazy.IBk;
import weka.classifiers.meta.Bagging;
import weka.classifiers.meta.Vote;
import weka.classifiers.trees.RandomForest;
import weka.classifiers.trees.J48;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.supervised.attribute.AttributeSelection;
import weka.filters.supervised.instance.Resample;
import weka.filters.unsupervised.attribute.Standardize;
import weka.attributeSelection.InfoGainAttributeEval;
import weka.attributeSelection.Ranker;

import java.util.Random;

public class Main {

  public static void main(String[] args) throws Exception {

    System.out.println("===============================================================");
    System.out.println("=== SOFTWARE DEFECT PREDICTION (FAST + 90% ENSEMBLE) ===");
    System.out.println("===============================================================\n");

    // Step 1: Load dataset
    DataSource source = new DataSource("data/kc1.arff");
    Instances data = source.getDataSet();
    if (data.classIndex() == -1)
      data.setClassIndex(data.numAttributes() - 1);

    System.out.println("✔ Loaded dataset: " + data.numInstances() + " instances, "
            + data.numAttributes() + " attributes.");
    printClassDistribution(data, "Original");

    // Step 2: Attribute Selection
    System.out.println("\n[1] Performing Feature Selection...");
    AttributeSelection filter = new AttributeSelection();
    InfoGainAttributeEval eval = new InfoGainAttributeEval();
    Ranker ranker = new Ranker();
    ranker.setNumToSelect(15);
    filter.setEvaluator(eval);
    filter.setSearch(ranker);
    filter.setInputFormat(data);
    Instances reduced = Filter.useFilter(data, filter);

    System.out.println("✔ Attribute selection complete.");
    System.out.println("   ➜ Before: " + data.numAttributes() + " | After: " + reduced.numAttributes());

    // Step 3: Resample (for Data Balancing)
    System.out.println("\n[2] Balancing classes with Resampling...");
    Resample resample = new Resample();
    resample.setBiasToUniformClass(1.0);
    resample.setSampleSizePercent(160);
    resample.setNoReplacement(false);
    resample.setInputFormat(reduced);
    Instances balanced = Filter.useFilter(reduced, resample);

    System.out.println("✔ Resampling done (160% sample size).");
    printClassDistribution(balanced, "After Balancing");

    // Step 4: Normalize data
    System.out.println("\n[3] Normalizing attributes...");
    Standardize std = new Standardize();
    std.setInputFormat(balanced);
    Instances normalized = Filter.useFilter(balanced, std);
    System.out.println("✔ Normalization complete.");

    // Step 5: Train/Test Split (80/20)
    System.out.println("\n[4] Splitting data 80/20...");
    normalized.randomize(new Random(42));
    int trainSize = (int) Math.round(normalized.numInstances() * 0.8);
    int testSize = normalized.numInstances() - trainSize;
    Instances train = new Instances(normalized, 0, trainSize);
    Instances test = new Instances(normalized, trainSize, testSize);
    System.out.println("✔ Data split: " + trainSize + " train / " + testSize + " test.");

    // Step 6: Initialize Classifiers
    System.out.println("\n[5] Initializing classifiers...");
    RandomForest rf = new RandomForest();
    rf.setNumIterations(200);
    rf.setNumFeatures(8);
    rf.setMaxDepth(15);
    rf.setSeed(42);

    SMO svm = new SMO();
    svm.setOptions(weka.core.Utils.splitOptions(
            "-K \"weka.classifiers.functions.supportVector.RBFKernel -G 0.02\" -C 2.5"));

    NaiveBayes nb = new NaiveBayes();
    IBk knn = new IBk(5);

    J48 j48 = new J48();
    j48.setConfidenceFactor(0.25f);
    j48.setUnpruned(false);

    Bagging bag = new Bagging();
    bag.setClassifier(rf);
    bag.setNumIterations(10);

    Vote vote = new Vote();
    vote.setClassifiers(new Classifier[]{bag, svm, nb, j48, knn});
    vote.setCombinationRule(new SelectedTag(Vote.AVERAGE_RULE, Vote.TAGS_RULES));
    vote.setSeed(42);

    System.out.println("✔ Ensemble ready (Bagged RF + SVM + NB + J48 + KNN)");

    // Step 7: Train and Evaluate
    System.out.println("\n[6] Training and evaluating (FAST MODE)...");
    vote.buildClassifier(train);
    Evaluation evalModel = new Evaluation(train);
    evalModel.evaluateModel(vote, test);

    // Step 8: Results
    System.out.println("\n=== MODEL PERFORMANCE SUMMARY ===");
    System.out.printf("Accuracy: %.2f%%\n", evalModel.pctCorrect());
    System.out.printf("Precision: %.4f | Recall: %.4f | F1: %.4f | AUC: %.4f\n",
            evalModel.weightedPrecision(),
            evalModel.weightedRecall(),
            evalModel.weightedFMeasure(),
            evalModel.weightedAreaUnderROC());
    System.out.println("Confusion Matrix:");
    double[][] cm = evalModel.confusionMatrix();
    for (double[] row : cm) {
      for (double val : row)
        System.out.printf("%8.0f", val);
      System.out.println();
    }

    System.out.println("\n=== EXECUTION COMPLETE (FAST + ACCURATE) ===");
  }

  // Helper to print class distributions
  private static void printClassDistribution(Instances data, String label) {
    int[] counts = new int[data.numClasses()];
    for (int i = 0; i < data.numInstances(); i++) {
      Instance inst = data.instance(i);
      counts[(int) inst.classValue()]++;
    }

    System.out.println("   ➜ Class distribution (" + label + "):");
    for (int i = 0; i < data.numClasses(); i++) {
      System.out.printf("     Class %s = %d instances\n",
              data.classAttribute().value(i), counts[i]);
    }
  }
}
