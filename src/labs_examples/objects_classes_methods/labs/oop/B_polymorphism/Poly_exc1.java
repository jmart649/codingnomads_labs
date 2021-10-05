package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Poly_exc1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Julie", "Math", 23);
        Teacher teacher1 = new Teacher("Joannne", 24);
        System.out.println(teacher.toString());
        teacher1.displayInfo();
        teacher1.staff();
    }
}

abstract class Staff implements Personnel{
    String position;
    Teacher teacher;

    public Staff(){}

    public Staff(Teacher teacher){
        this.teacher = teacher;
    }

    public Staff(String position){
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "position='" + position + '\'' +
                '}';
    }
}

class Teacher extends Staff implements Personnel{
    String name;
    String subject;
    int age;

    Teacher(){}

    Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }

    Teacher(String name, String subject, int age){
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void displayInfo() {
        System.out.println("Hello There");
    }

    public void staff(){};

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", age=" + age +
                '}';
    }
}
