import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
       
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5/8);
        System.out.println(5+15/3*2-8%3);
        int a = 25;
        int b = 5;
        System.out.println( "25 * 5 =" + a*b);
       int n = 0;
       int n1 = 0;
        Scanner elmira = new Scanner (System.in);
        System.out.println("first number:");
         n = elmira.nextInt();
         System.out.println("second number:");
         n1 = elmira.nextInt();
         System.out.println(n + " * "+ n1 + "=" + n * n1);
         int num1 = 8;
         for (int i=0; i< 10; i++){
   System.out.println(num1 + " x " + (i+1) + " = " + 
     (num1 * (i+1)));
  }
         int num2=5;
         for (int i=0; i<5; i++) {
             System.out.println( num2 + "*" + (i+1)+ "=" + (num2 * (i+1)));
         }
                 
         
          
       
       
               
    }
    
}
