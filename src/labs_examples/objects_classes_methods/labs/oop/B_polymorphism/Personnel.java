package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public interface Personnel {
    public void displayInfo();
    public default void staff(){
        System.out.println("Default");
    }
}
