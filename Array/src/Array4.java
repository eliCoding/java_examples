
import java.util.Scanner;
//@author Elmira

public class Array4 {

    public static void main(String[] args) {
        int[] myInt = new int[5];
        int myNum[] = new int[5];
        int n = 0;
        Scanner elmira = new Scanner(System.in);

        for (int i = 0; i < myInt.length; i++) {
            myInt[i] = (int) (Math.random() * 10 + 1);
            System.out.print(myInt[i] + "  ");

        }

        System.out.println("  ");

        System.out.println("Please enter a numbers: ");
        for (int i = 0; i < 5; i++) {
            myNum[i] = elmira.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (myInt[i] == myNum[i]) {
                //  n = n + 1;
                n++;
                System.out.println("you win $100");

            }
        }

        System.out.println("the same numbers are: " + n);

    }
}
