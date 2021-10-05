package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        int[] array = {2,3,4};

        try{
            int a = array[5];
        }catch (IndexOutOfBoundsException e){
            e.getStackTrace();
            System.out.println("Does not exist");
        }catch (Exception l){
            System.out.println("Oh Well");
        }
    }
}


