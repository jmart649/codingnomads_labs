package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.List;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList();
        list.add("Karla");
        list.add("Jesse");
        list.add("Amelia");
        list.add("Joanne");

        for(String s : list){
            System.out.print(s + " ");
        }

        list.remove("Joanne");
        boolean val = list.isEmpty();
        System.out.println("\nIs the list empty now? " + val);
        int num = list.size();
        System.out.println("How many names are still on the list? " + num);
        list.clear();
        val = list.isEmpty();
        System.out.println("Is the list empty now? " + val);

    }
}
