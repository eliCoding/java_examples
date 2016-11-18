
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;
//* @author Elmira

public class IO {

    public static void main(String[] args) {

        File myFile = new File("mytextfile.txt"); // path
        try {
            PrintWriter fileoutput = new PrintWriter(myFile); //object 
            fileoutput.println("Lorena Gamarra");
            fileoutput.println("Matthew Stinis");
            fileoutput.close(); 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
