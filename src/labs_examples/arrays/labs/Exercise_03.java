package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int num = 3;
        int multi = 1;
        int[][] intArray = new int[5][5];
        for(int i = 0; i < intArray.length; i++ ){
            for(int j = 0; j < intArray[i].length; j++){
                intArray[i][j] = num * multi;
                multi += 1;
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
