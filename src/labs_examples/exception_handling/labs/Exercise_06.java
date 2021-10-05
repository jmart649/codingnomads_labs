package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int[]array = {5,6,3};
        try{
            method();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] array = {4,5,6};
        try{
            int a = array[8];
        }catch (ArrayIndexOutOfBoundsException e){
            throw e;
        }
    }
}