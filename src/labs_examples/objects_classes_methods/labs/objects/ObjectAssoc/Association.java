package labs_examples.objects_classes_methods.labs.objects.ObjectAssoc;

import javax.sound.midi.SysexMessage;

public class Association {
    public static void main(String[] args) {
        Employee employee = new Employee("Jeff");
        Supervisor supervisor = new Supervisor("Karla");
        System.out.println("The supervisor " + supervisor.name + " is in charge of " + employee.name);
    }
}

class Employee{
    String name;

    Employee(String name){
        this.name = name;
    }
}

class Supervisor{
    String name;

    Supervisor(String name){
        this.name = name;
    }
}
