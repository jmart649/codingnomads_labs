package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        double r = 3.14;
        double h = 5;
        double pi = 3.14;

        double volume = pi * Math.pow(r, 2) * h;
        double area = 2 * pi * r * h + 2 * pi * Math.pow(r, 2);

        System.out.println(volume);
        System.out.println(area);

    }
}