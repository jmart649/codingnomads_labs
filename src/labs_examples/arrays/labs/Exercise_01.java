package labs_examples.arrays.labs;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] arrNum = new double[10];
        double sum = 0;

        for(int i =0; i< arrNum.length; i++){
            System.out.print("Enter number: ");
            arrNum[i] = scanner.nextInt();
            sum += arrNum[i];
        }
        double avg = sum / arrNum.length;
        System.out.println("The sum of the array: "+ sum);
        System.out.println("The average of the array: " + avg);
    }
}