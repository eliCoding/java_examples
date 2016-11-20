
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;
//* @author Elmira

public class q2 {

    public static void main(String[] args) {

        File myFile = new File("myintegers.txt"); // path

        Scanner input = new Scanner(System.in);

        int n = 0;
        try {
            PrintWriter fileoutput = new PrintWriter(myFile); //object 

            for (int i = 0; i < 10; i++) {
                System.out.println("Enter a number:  ");
                n = input.nextInt();
                fileoutput.print(n);
                fileoutput.print(" ");

            }

            fileoutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
