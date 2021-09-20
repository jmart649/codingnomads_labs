package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args){
        int[] intArray = {1,2,3,4,5,6};

        for(int i = intArray.length; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
}
