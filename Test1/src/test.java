
// @author Elmira
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int n = 0;

        Scanner elmira = new Scanner(System.in);

        System.out.println("Welcome to IDP");
        System.out.println("****************");
        System.out.println("1 - Guess a number");
        System.out.println("2 - Try your luck");
        System.out.println("3 - Exit");
        System.out.println("Enter your choice: ");
        n = elmira.nextInt();
        do {
            if (n == 1) {
                System.out.println("Welcome to the guessing Game");
                System.out.println("******************************");
                guessingGame();
            } else if (n == 2) {

                System.out.println("Welcome to try your luck");

                luckGame();
            } else {
                System.out.println("Exit");
            }

        } while (n < 3);
        while (n < 1 || n > 3) {
            System.out.println("Enter Your Choice:");
            n = elmira.nextInt();
        }
    }

    public static void guessingGame() {
        int randomNum = 0;
        int guessedNum = 0;
        int n1 = 0;
        Scanner elmira = new Scanner(System.in);
        randomNum = (int) (Math.random() * 100 + 1);

        System.out.println("the random number is " + randomNum);

        do {
            System.out.println("Guess a number: ");
            guessedNum = elmira.nextInt();
            if (guessedNum == randomNum) {
                System.out.println("You are a winner");

            } else {
                System.out.println("Better luck next time!Play again");
            }

            if (guessedNum > randomNum) {

                System.out.println("Guessed number is higher than random Number ");
            } else if (guessedNum < randomNum) {
                System.out.println("Guessed number is lower than random Number");

                n1++;

            }

        } while (n1 != 7);

    }

    public static void luckGame() {
        Scanner elmira = new Scanner(System.in);
        int[] myInt = new int[6];
        int number = 0;
        for (int i = 0; i < myInt.length; i++) {

            myInt[i] = (int) (Math.random() * 50 + 1);
            System.out.print(myInt[i] + " ");

        }
        int max = myInt[0];
        for (int i = 0; i < myInt.length; i++) {
            if (myInt[i] > max) {
                max = myInt[i];
            }
        }
        System.out.println("   the max Number is: " + max);

        int min = myInt[0];
        for (int i = 0; i < myInt.length; i++) {
            if (myInt[i] < min) {
                min = myInt[i];

            }
        }
        System.out.print("the min Number is: " + min);

        int diff = 0;
        diff = max - min;
        System.out.println("     The Difference is: " + diff);
        System.out.println("enter a number: ");
        number = elmira.nextInt();

       for (int i = 0; i < 10; i++) {
            if (number == myInt[i]) {
                System.out.println("The number " + number + " is found at position " + (i + 1));
                return;
            }

        }
        System.out.println("The number is not found in the array");
    }
    }

