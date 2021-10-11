package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        double sum = Method(25 , 20.50);
        System.out.println(sum);
        String[] stringArray = {"121", "757", "858", "949", "545"};
        Method2(stringArray);
        Method3(stringArray);
    }

    public static <E extends Number, V extends Number> double Method(E val1, V val2){
        return val1.doubleValue() + val2.doubleValue();
    }

    public static <E> void Method2(E[] array){
        int sum = 0;
        for(E element : array){
            sum++;
        }
        System.out.println(sum);
    }

    public static <E> void Method3(E[] array){
        E val = (E) array[0];
        E val2 = (E) array[4];

        array[4] = (E) val;
        array[0] = (E) val2;

        for(E element : array){
            System.out.print(element + " ");
        }
    }
}