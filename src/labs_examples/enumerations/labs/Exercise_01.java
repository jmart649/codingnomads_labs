package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

public class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("    MY SCHEDULE");
        for(Schedule s : Schedule.values()){
            System.out.println(s + ": " + s.getSchedule());
        }
    }
}

enum Schedule{
    MONDAY("7AM - 3PM"),
    TUESDAY("8AM - 4PM"),
    WEDNESDAY("8AM - 4PM"),
    THURSDAY("8AM - 4PM"),
    FRIDAY("7AM - 3PM"),
    SATURDAY("OFF"),
    SUNDAY("OFF");

    private final String schedule;

    Schedule(String schedule){
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }
}