package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args){
        int[][] intArray = {
                {25,28},
                {33, 543, 484},
                {64, 74}
        };

        for(int[] num : intArray){
            for(int x : num){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
