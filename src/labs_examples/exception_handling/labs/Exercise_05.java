package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        int[] array = {5,6,7};

        method(array);
    }

    public static void method(int[] array) throws IndexOutOfBoundsException{
        int a = 5;

        if(a > array.length){
            throw new IndexOutOfBoundsException("OutofBounds");
        }
        else{
            System.out.println(array[a]);
        }
    }

}