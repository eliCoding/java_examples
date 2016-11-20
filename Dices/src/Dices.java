
import java.util.Scanner;

public class Dices {

    public static void main(String[] args) {
        int Dice1 = 0;
        int Dice2 = 0;
        int n1 = 0;
        int Dices = 0;
        Scanner elmira = new Scanner(System.in);
        System.out.println("How many tosses?");
        n1 = elmira.nextInt();
        while (n1 < 1 || n1 > 6) {
            System.out.println("How many tosses?");
            n1 = elmira.nextInt();
        }

        do {
            Dice1 = (int) (Math.random() * 6 + 1);
            System.out.println("First toss Number From (1 to 6): " + Dice1);

            Dice2 = (int) (Math.random() * 6 + 1);
            System.out.println("Second toss Number From (1 to 6): " + Dice2);

            Dices = Dice1 + Dice2;
            System.out.println("Dices " + Dices);
            n1--;

        } while (n1 > 0 && Dices != 7);
    }
}
