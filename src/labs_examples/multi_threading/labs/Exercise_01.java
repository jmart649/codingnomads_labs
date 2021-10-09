package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable("myRunnable");
        MyRunnable myRunnable1 = new MyRunnable();
        Thread t = new Thread(myRunnable1);
        t.setName("myRunnable2");
        t.start();
    }
}

class MyRunnable implements Runnable {
    Thread t;

    public MyRunnable(){
        t = new Thread(this);
    }

    public MyRunnable(String name){
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(400, 100);
                System.out.println(i + ": " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error!!!");
        }
    }
}
