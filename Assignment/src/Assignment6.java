//@author elmira amanollahi
import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) 
    {
        
        
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
                System.out.println("Welcome to the game of craps");
                playcraps();
            } else if (n == 2) {
                System.out.println("Looking for your Chinese sign");
                chinesesign();
            } else {
                System.out.println("Exit");
            }

        } while (n < 3);
        while (n < 1 || n > 3) {
            System.out.println("Enter Your Choice:");
            n = elmira.nextInt();
        } 
        
       
    }
    public static void playcraps() {
        int Dice1 = 0;
        int Dice2 = 0;
        int Sum = 0;
        int n = 1;

        do {
            Dice1 = (int) (Math.random() * 6 + 1);
            {
                System.out.println("First toss:" + Dice1);
            }

            Dice2 = (int) (Math.random() * 6 + 1);
            {
                System.out.println("Second toss:" + Dice2);
            }

            Sum = Dice1 + Dice2;
            {
                System.out.println("Sum:" + Sum);
            }
            n++;

        } while (Sum != 7 && n < 7);
        if (Sum == 7) {
            System.out.println("You are a winner");
        } else {
            System.out.println("Better luck next time!Play again");
        }

    }

    public static void chinesesign() {
        
        int y = 0;
        Scanner elmira = new Scanner(System.in);
        System.out.println("Please enter your Birth Year:");
        y = elmira.nextInt();

        switch (y % 12) {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;

        }
    }
}

