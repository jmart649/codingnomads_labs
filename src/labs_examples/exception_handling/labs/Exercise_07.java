package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {
    public static void main(String[] args) throws Custom {
        int a = method(5,0);
    }

    public static int method(int a, int b) throws Custom {
        if(b == 0){
            throw new Custom();
        }
        else{
            return a/b;
        }
    }
}

class Custom extends Exception{
    @Override
    public String toString(){
        return "Does not make sense!!!";
    }
}