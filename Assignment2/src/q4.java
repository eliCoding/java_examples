
import java.util.*;
import java.io.*;

public class q4 {

    /*Rewrite (refactor) the program in question 4 and read the numbers 
into an array and then display the numbers, the sum of the numbers, 
the average, the max and min. */
    public static void main(String[] args) {

        File myFile = new File("myintegers.txt"); // path
        Scanner input = new Scanner(System.in);
        int n = 0;

        int[] array = new int[10];
        try {
            Scanner fileinput = new Scanner(myFile); //object 

            while (fileinput.hasNext()) {
                array[n] = fileinput.nextInt();
                n++;
            }
            fileinput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        //Sum of elements
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of elements : " + sum);
        //Average of elements
        double average = 0;
        average = (double) sum / n;

        System.out.println("Average of elements :" + average);
        //Min element
        int min = array[0];
        for (int i = 0; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min of elements is: " + min);
        //Max element
        int max = array[0];
        for (int i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max of elements is: " + max + "");

    }

}
