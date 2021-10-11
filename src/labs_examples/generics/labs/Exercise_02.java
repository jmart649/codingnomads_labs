package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

class Demo{
    public static void main(String[] args) {
        Integer[] array = {5, 6, 2};
        Generics1 generics = new Generics1();
        int val = generics.Method(array);
        System.out.println(val);
    }
}

class Generics1 {
    public <E extends Number> int Method(E[] array){
        int sum = 0;

        for(E element : array){
            sum += element.intValue();
        }

        return sum;
    }
}