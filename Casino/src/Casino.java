
import java.util.Scanner;

public class Casino {

    public static void main(String[] args) {
        int n = 0;
        
        Scanner elmira = new Scanner(System.in);

        do {
            System.out.println("Welcome to IPD casino ");
            System.out.println("-----------------------");
            System.out.println("1.play Craps");
            System.out.println("2.play MaxNumber");
            System.out.println("3.Exit");

            System.out.println("Please Enter Your Choise:");
            n = elmira.nextInt();

            if (n == 1) {
                System.out.println(".........................");
                System.out.println("Welcome to the Carps Game");
                System.out.println(".........................");
            } else if (n == 2) {
                System.out.println(".........................");
                System.out.println("Welcome to the MaxNumber");
                System.out.println(".........................");
            } else {
                System.out.println("Exit");
            }
        } while (n < 3);

    }

}

