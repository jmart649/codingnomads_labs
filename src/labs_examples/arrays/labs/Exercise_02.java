package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        System.out.print("Enter the index number: ");
        int i = scanner.nextInt();
        int num = array[i];
        System.out.println("The index of the array is: " + num);



    }
}