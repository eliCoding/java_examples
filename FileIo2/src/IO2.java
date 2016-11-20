
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;
//* @author Elmira

public class IO2 {

    public static void main(String[] args) {

        File myFile = new File("mytextfile.txt"); // path

        Scanner input = new Scanner(System.in);
        String name;
        try {
            PrintWriter fileoutput = new PrintWriter(myFile); //object 

            for (int i = 0; i < 10; i++) {
                System.out.println("Enter a Name: ");
                name = input.next();
                fileoutput.println(name);
                fileoutput.println(" ");

            }

            fileoutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
