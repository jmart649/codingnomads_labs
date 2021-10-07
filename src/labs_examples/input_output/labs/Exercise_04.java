package labs_examples.input_output.labs;

import labs_examples.input_output.examples.csv_parser.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();
        String filePath = "C:\\Users\\leek2\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\employee.csv";
        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                employees.add(EmployeeObj(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Employee employee : employees){
            System.out.println(employee.toString());
        }

    }

    public static Employee EmployeeObj(String[] values) {

        Employee employee = new Employee();

        employee.setId(Integer.parseInt(values[0]));
        employee.setfName(values[1]);
        employee.setlName(values[2]);
        employee.setPosition(values[3]);
        employee.setAge(Integer.parseInt(values[4]));

        return employee;

    }

}