package labs_examples.packages.example1;

import labs_examples.packages.example2.Example2;

public class Example1 {
    public static void main(String[] args) {
        meme();
        // was unable to use the protected method from example2 class
    }

    public static void meme(){
        System.out.println("Hello World");
    }
}
