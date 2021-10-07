package labs_examples.input_output.labs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\leek2\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";
        byteSteam(filePath);
    }

    public static void byteSteam(String filePath){
        FileInputStream in = null;

        try{
            in = new FileInputStream(filePath);
            int c;

            while((c = in.read()) != -1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(in != null){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}