package labs_examples.input_output.labs;

public class Employee {
    public int id;
    public String fName;
    public String lName;
    public String position;
    public int age;

    public Employee(){
    }

    public Employee(int id, String fName, String lName, String position, int age){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.position = position;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }
}
