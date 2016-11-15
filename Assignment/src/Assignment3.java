
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        int n = 0;
        Scanner elmira = new Scanner(System.in);
        do {
            
            System.out.println("Welcome to the IDP Menu");
            System.out.println("------------------------");
            System.out.println("1.  Play the game of craps");
            System.out.println("2.  What is your Chinese Sign?");
            System.out.println("3.  Exit");
            System.out.println("Enter your choice:");
            n = elmira.nextInt();
            if (n == 1) {
                System.out.println("Welcome to the game of craps");}
            else if (n==2) {
                    System.out.println("Looking for your Chinese sign");
                    }
            else {
                System.out.println("Exit");
            }
           
        } while (n<3);
           while (n < 1 || n > 3) {
            System.out.println("Enter Your Choice:");
            n = elmira.nextInt();} 
        }
        
    }

    


