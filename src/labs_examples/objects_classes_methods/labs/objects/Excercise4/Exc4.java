package labs_examples.objects_classes_methods.labs.objects.Excercise4;

public class Exc4 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("Karla");
        Student student3 = new Student("Carlos", 25);

        student.name = "Jesse";

        System.out.println(student.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}

class Student{
    String name;
    int age;

    public Student(){}

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
