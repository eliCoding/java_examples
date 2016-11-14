
import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        double t = 0;
        double c = 0;
        Scanner elmira = new Scanner(System.in);
        System.out.println("Please enter the tempereture in Fahrenheit:");
        t = elmira.nextDouble();
        c = (t - 32) * 5 / 9;
        double c1 = Math.round(c *100)/100.0;
        System.out.println("the tempreture in celsius is:" +Math.round(c *100)/100.0);

        if (c <= -15.0) {
            System.out.println("it's " + c1 + " degrees Celsius,Let get out of here!");
        } else if (c > -15.0 && c <= 0.0) {
            System.out.println("it's " + c1 + " degrees Celsius,Get your boots and gloves");}
            else if (c > 0.0 && c <= 15.0) 
            {System.out.println("it's " + c1 + " degrees Celsius,I have my sweater!");}
            else if (c > 15.0) {
                System.out.println("it's " + c1 + " degrees Celsius,it is BBQ time!");
            }

        }

    }

