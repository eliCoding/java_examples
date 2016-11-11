import java.util.Scanner;
public class RandomNUmbers1 {

    public static void main(String[] args) {
       
        int gussNumber = 0;
       
        
       Scanner elmira = new Scanner (System.in);
        System.out.println("Guess the number:");
       gussNumber = elmira.nextInt();
        int myRandom1 = 0;
         myRandom1 = (int)(Math.random() * 20 );
         System.out.println("First Random number (1 to 20):" + myRandom1 );
       if ( gussNumber>myRandom1) {
           System.out.println("ais greater than random number");
       }
       else {
           System.out.println("a is less than random number");
       }
    }
    
}
