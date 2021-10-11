package labs_examples.generics.labs;

import java.awt.*;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Generics<Integer, Double> generics = new Generics<Integer, Double>(25,2.0);
        double val = generics.getValue1() * generics.value2;
        System.out.println(val);
    }
}

class Generics <T, V> {
    T value1;
    V value2;

    public Generics(T value1, V value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }
}