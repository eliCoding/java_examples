
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        int n = 0;
        int n1 = 0;
        
        Scanner elmira = new Scanner(System.in);
        System.out.println("Please enter a number:");
        n = elmira.nextInt();
        
        System.out.println("n%3 = " + n % 3);
       n1 = n % 3;

        switch (n1) {
            case 0:
                System.out.println("Number " + n + " is devisible by 3");
                break;
            case 1:
                System.out.println("the remainder is 1");
                break;
            case 2:
                System.out.println("the remainder is 2");
        }
    }
}
