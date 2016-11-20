import java.util.Scanner;

public class SumProduct {

    public static void main(String[] args) {
      
       
        int num1 = 0;
        int num2 = 0;
        int theSum = 0;
        int theProduct = 0;
         Scanner elmira = new Scanner(System.in);
        
        System.out.print("please enter first number:");
        num1 = elmira.nextInt();
        
        System.out.print("please enter the second number:");
        num2 = elmira.nextInt();
        
        theSum = num1 + num2;
        theProduct = num1 *num2;
        
        System.out.println("The sum of the numbers is " + theSum);
         System.out.println("The product of the numbers is " + theProduct);
        
    }
    
}
