package labs_examples.static_nonstatic.labs;

public class Hello {
    public static void main(String[] args) {
        method();

        Hello hello = new Hello();
        hello.method2();

        Animal.method3();

        Animal animal = new Animal();
        animal.method4();
    }

    public static void method(){
        System.out.println("Static method");
    }

    public void method2(){
        System.out.println("Non-static method");
    }

}

class Animal {
    public static void method3(){
        System.out.println("Static method");
    }

    public void method4(){
        System.out.println("Non-static method");
    }
}
