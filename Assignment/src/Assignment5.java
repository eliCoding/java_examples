//@author elmira amanollahi
import java.util.Scanner;
public class Assignment5 {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int Largest;
       title();
       int i,j;
       System.out.println("Please enter the first number:");
       i = input.nextInt();
       System.out.println("Please enter the second:");
       j = input.nextInt();
       Largest = max(i, j);
       System.out.println("The largest number is: " + Largest);
   }

   public static void title() {
       System.out.println("****************");
       System.out.println("* This is my TITLE *");
       System.out.println("****************");
       System.out.println();
       System.out.println();
   }

   public static int max(int i, int j) {
       if (i>= j) {
           return i;
       } else {
           return j;
       }

   }
}