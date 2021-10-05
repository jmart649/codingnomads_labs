package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] array = {2,3,4};

        try{
            int a = array[5];
        }catch (Exception e){
            System.out.println("Does not exist");
        }
    }
}
