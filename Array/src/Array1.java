// @author elmira amanollahi
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner elmira = new Scanner(System.in);

        int[] lotNum = new int[6];
        int[] number = new int[6];
        int sameNum = 0;
        for (int i = 0; i < lotNum.length; i++) {
            lotNum[i] = (int) (Math.random() * 50 + 1);

            System.out.println("the random number is: " + lotNum[i]);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter your number: ");

            number[i] = elmira.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("your numbers are: " + number[i]);
        }

        for (int i = 0; i < 6; i++) {
            if (lotNum[i]== number[i]) {
                sameNum = sameNum+1;
            }
             
        }

      
        System.out.println("the same numbers are: " + sameNum);

    }
}

