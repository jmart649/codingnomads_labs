package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Threads threads = new Threads();
        threads.setName("myThread");
        threads.start();
    }
}

class Threads extends Thread{
    @Override
    public void run(){
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