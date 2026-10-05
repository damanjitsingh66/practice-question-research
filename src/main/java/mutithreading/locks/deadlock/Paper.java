package mutithreading.locks.deadlock;

public class Paper {

    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println("Current thread - " + Thread.currentThread().getName() + "is using the pen" + pen);
        pen.finishedWriting();
    }
    public synchronized void finishedWriting(){
        System.out.println("Current thread - "+ Thread.currentThread().getName() + "finished the writing");
    }
}
