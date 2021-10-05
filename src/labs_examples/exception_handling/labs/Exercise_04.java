package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[] array = {5,6,4};

        try{
            int a = array[6];
        }catch (IndexOutOfBoundsException e){
            System.out.println("Did not work");
                try{
                    int a = array[5];
                }catch(IndexOutOfBoundsException n){
                    System.out.println("Still does not work");
                }
        }
    }
}