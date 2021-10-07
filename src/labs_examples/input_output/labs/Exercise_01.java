package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        FileInputStream file = null;
        BufferedInputStream in = null;
        String filePath = "C:\\Users\\leek2\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";

        try{
            file = new FileInputStream(filePath);
            in = new BufferedInputStream(file);

            byte[] buffer = new byte[5];
            int byteR = 0;

            while((byteR = in.read(buffer)) != -1){
                System.out.print(new String(buffer, 0, byteR));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                in.close();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}