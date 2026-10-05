package mutithreading.locks.deadlock;

public class Pen {

    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println("Current thread - " + Thread.currentThread().getName() + "is using the paper" + paper);
        paper.finishedWriting();
    }
    public synchronized void finishedWriting(){
        System.out.println("Current thread - "+ Thread.currentThread().getName() + "finished the writing");
    }
}
