
// @author Elmira
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;

public class Function {

    public static void main(String[] args) {

        File myFile = new File("test.txt"); // path

        int myInt[] = new int[10];
        for (int i = 0; i < 10; i++) {

            myInt[i] = (int) (Math.random() * 20 + 1);
            System.out.print(myInt[i]);
            System.out.print(" ");

        }
        try {
            PrintWriter fileoutput = new PrintWriter(myFile); //object 

            for (int i = 0; i < 10; i++) {

                fileoutput.print(myInt[i]);
                fileoutput.println(" ");

            }

            fileoutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        int sum = 0;
      
        int count = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + myInt[i];
            count++;}
            System.out.println( "the sum is"+sum);
        

    }
}
