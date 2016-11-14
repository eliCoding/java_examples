
public class Assignment2 {

    public static void main(String[] args) {
        int Dice1 = 0;
        int Dice2 = 0;
        int Sum = 0;
        int n = 0;

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
            if (Sum == 7) {
                System.out.println("You are a winner");
            }
            if (n > 5) {
                System.out.println("Better luck next time!Play again");
            }

        } while (Sum != 7 && n < 6);
    }

}
