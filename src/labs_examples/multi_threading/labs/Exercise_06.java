package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

public class Exercise_06 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("myThread1");
        MyThread myThread2 = new MyThread("myThread2");
        myThread1.setPriority(1);
        myThread2.setPriority(2);
    }
}

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        for (int i = Thread.currentThread().getPriority(); i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + "- " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}