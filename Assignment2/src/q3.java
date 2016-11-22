
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;
//* @author Elmira

public class q3 {

    public static void main(String[] args) {

        File myFile = new File("myintegers.txt"); // path

        int n = 0;
        try {
            Scanner fileinput = new Scanner(myFile); //object 

            while (fileinput.hasNext()) {
                n = fileinput.nextInt();
                System.out.println(n);

            }

            fileinput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + n;
        }
        System.out.println("The total is: " + sum);
    }

}
