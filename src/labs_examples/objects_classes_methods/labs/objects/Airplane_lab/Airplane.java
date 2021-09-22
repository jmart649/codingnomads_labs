package labs_examples.objects_classes_methods.labs.objects.Airplane_lab;

public class Airplane {
    public static void main(String[] args) {
        Crew crew = new Crew("Pilot", "Jeff");
        Engine engine = new Engine(1341);
        FoodService food = new FoodService("Lubys", "Chicken");
        Passenger passenger = new Passenger("Karla");
        Plane plane = new Plane(crew, engine, food, passenger, 500, 250);
        System.out.println(plane.toString());
    }
}

class Plane{
    private double fuelCapicity;
    private double currentFuelLevel;
    private Crew crew;
    private Engine engine;
    private FoodService foodService;
    private Passenger passenger;

    public Plane(Crew crew, Engine engine, FoodService foodService, Passenger passenger, double fuelCapicity, double currentFuelLevel){
        this.crew = crew;
        this.engine = engine;
        this.foodService = foodService;
        this.passenger = passenger;
        this.currentFuelLevel = currentFuelLevel;
        this.fuelCapicity = fuelCapicity;
    }


    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public double getFuelCapicity() {
        return fuelCapicity;
    }

    public void setFuelCapicity(double fuelCapicity) {
        this.fuelCapicity = fuelCapicity;
    }

    public Crew getCrew() {
        return crew;
    }

    public Engine getEngine() {
        return engine;
    }

    public FoodService getFoodService() {
        return foodService;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFoodService(FoodService foodService) {
        this.foodService = foodService;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "fuelCapicity=" + fuelCapicity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", crew=" + crew +
                ", engine=" + engine +
                ", foodService=" + foodService +
                ", passenger=" + passenger +
                '}';
    }
}

class Crew{
    private String position;
    private String name;

    public Crew(String position, String name){
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class FoodService{
    private String company;
    private String food;

    public FoodService(String company, String food){
        this.company = company;
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "FoodService{" +
                "company='" + company + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}

class Passenger{
    private String name;
    private double occupants = 0;

    public Passenger(String name){
        this.name = name;
        this.occupants += 1;
    }

    public double getOccupants() {
        return occupants;
    }

    public void setOccupants(double occupants) {
        this.occupants = occupants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", occupants=" + occupants +
                '}';
    }
}

class Engine{
    private int horsepower;

    public Engine(int horsepower){
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                '}';
    }
}
