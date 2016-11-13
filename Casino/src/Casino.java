
import java.util.Scanner;

public class Casino {

   
    public static void main(String[] args) {
        int n = 0;
        
        Scanner elmira = new Scanner(System.in);       
            System.out.println("Welcome to IPD casino ");
            System.out.println("-----------------------");
            System.out.println("1.play Craps");
            System.out.println("2.play MaxNumber");
            System.out.println("3.Exit");
             while (n< 1 || n > 3) {
            System.out.println("Please Enter Your Choise:");
            n= elmira.nextInt();
        }
           do{ System.out.println("Please Enter Your Choise:");
            n = elmira.nextInt();

            switch (n) {
                case 1:
                    System.out.println(".........................");
                    System.out.println("Welcome to the Carps Game");
                    System.out.println(".........................");
                    break;
                case 2:
                    System.out.println(".........................");
                    System.out.println("Welcome to the MaxNumber");
                    System.out.println(".........................");
                    break;
                default:
                    System.out.println("Exit");
                    break;
                    
            }
           
           
        } while (n<3);
           
    
       
    
    
}
       

    }



