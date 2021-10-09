package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

public class Exercise_03 {
    public static void main(String[] args) {
        Th th = new Th();
        th.setName("myThread");
        th.setPriority(1);
        th.start();

        Th th2 = new Th();
        th2.setName("myThread2");
        th2.setPriority(10);
        th2.start();
    }
}

class Th extends Thread{
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