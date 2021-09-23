package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class lab1 {
    public static void main(String[] args) {
        Animals animals = new Animals("Dog");
        animals.displayAnimal();

        System.out.println();

        Dogs dog = new Dogs("Dog", "Husky");
        dog.displayAnimal();

        System.out.println();

        Husky husky = new Husky("Dog", "Husky", "Lexi", 60, "White");
        husky.displayAnimal();
    }
}

class Animals{
     protected String type;

     public Animals(){}

    public Animals(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void displayAnimal(){
         System.out.println("Type of Animal: " + getType());
    }
}

class Dogs extends Animals{
    String breed;

    public Dogs(String type, String breed){
        super(type);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void displayAnimal(){
        System.out.println("Type of Animal: " + getType());
        System.out.println("Dog Breed: " + getBreed());
    }
}

class Husky extends Dogs{
    String name;
    double weight;
    String color;

    public Husky(String type, String breed, String Name, double weight, String color){
        super(type, breed);
        this.name = Name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void displayAnimal(){
        System.out.println("Type of Animal: " + getType());
        System.out.println("Dog Breed: " + getBreed());
        System.out.println("Name: " + getName());
        System.out.println("Weight: " + getWeight());
        System.out.println("Color: " + getColor());
    }
}

