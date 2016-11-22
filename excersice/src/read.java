
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;
//* @author Elmira

public class read {

    public static void main(String[] args) {

        File myFile = new File("test.txt"); // path

        Scanner input = new Scanner(System.in);
        String name;
        try {
            Scanner fileinput = new Scanner(myFile); //object 

            while (fileinput.hasNext()) {
                name = fileinput.next();
                System.out.println(name);
            }

            fileinput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
                
        }

    }


