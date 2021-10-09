package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

public class Exercise_05 {
    public static void main(String[] args) {
        myRunnable2 runnable2 = new myRunnable2("myRunnable");
        myRunnable2 runnable21 = new myRunnable2("myRunnable21");
        try {
            runnable2.wait();
            runnable21.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            Thread.currentThread().notifyAll();
        }
    }
}

class myRunnable2 implements Runnable{
    Thread t;
    public Boolean bool = true;

    public myRunnable2(String name){
        t = new Thread (this, name);
        t.start();
    }

    public synchronized void Method(){
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    @Override
    public void run(){
        Method();
    }
}