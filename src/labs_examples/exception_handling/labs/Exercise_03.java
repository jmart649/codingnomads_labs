package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        int[] array = {2,3,4};

        try{
            int a = array[5];
        }catch (IndexOutOfBoundsException e){
            e.getStackTrace();
            System.out.println("Does not exist");
        }catch (Exception l){
            System.out.println("Oh Well");
        }finally {
            System.out.println("Program completed");
        }
    }
}