package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int total = multiply(4,5);
        System.out.println(total);
        total = divide(20, 5);
        System.out.println(total);
        joke();
        total = sec(5);
        System.out.println("How many seconds in 5 years?: " + total);
        total = arguments("Hello", "There", "My", "Name", "Jesus", "Martinez");
        System.out.println(total);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b){
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int a, int b){
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("Knock Knock");
        System.out.println("Who's there?");
        System.out.println("Jesus");
        System.out.println("Jesus who?");
        System.out.println("Jesus Martinez");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int sec(int years){
        int SecYear = 31536000;
        return years * SecYear;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int arguments(String ...v){
        int total = 0;
        for(String x : v){
            total +=1;
        }
        return total;
    }






}
