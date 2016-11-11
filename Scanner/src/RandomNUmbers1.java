import java.util.Scanner;
public class RandomNUmbers1 {

    public static void main(String[] args) {
       
        int guessNumber = 0;
       Scanner elmira = new Scanner (System.in);
        System.out.println("Guess a number:");
       guessNumber = elmira.nextInt();
        int myRandom1 = 0;
         myRandom1 = (int)(Math.random() * 20 );
         System.out.println("First Random number (1 to 20):" + myRandom1 );
       if ( guessNumber> myRandom1) {
           System.out.println("guessedNumber is higher than  random number");
       }
       else if (guessNumber == myRandom1) {
           System.out.println("guessedNumber is equal to random number");
       }
       else {
           System.out.println("guessedNumber is less than random number");
       }
               
    }
    
}
