package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lower bound number: ");
        int lowNum = scanner.nextInt();
        System.out.print("\nEnter a upper bound number: ");
        int uppNum = scanner.nextInt();

        int sum = 0;

        for (int i = lowNum; i <= uppNum; i++) {
            sum += i + uppNum;
        }

        System.out.println(sum);
        int avg = sum / uppNum;
        System.out.println(avg);
    }
}
