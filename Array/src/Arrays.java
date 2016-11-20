// @author elmira amanollahi

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
//for loop from 0 to 9
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println("   ");
        System.out.println(" ");
// assigning the elements from 0 to 9 to the elements of the array 
// or assigning the element to the sepecific array 

        int[] myInt = new int[10];
        for (int i = 0; i < 10; i++) {
            myInt[5] = 54;
            myInt[8] = 23;
            myInt[9] = 12;
            // myInt [i] = i;
            System.out.print(myInt[i] + " ");
        }

        System.out.println("  ");
        System.out.println(" ");

        //the array with 4 element : myArray [0] = 23; 
        int[] myArray = {23, 45, 1, 55};
        System.out.print(myArray[3] + " ");
        System.out.print(myArray[0] + " ");

        System.out.println(" ");
        System.out.println(" ");

        //prompt the user to enter 5 values 
        //instead of repeating one sentence use the arrays
        int[] myNum = new int[5];

        Scanner elmira = new Scanner(System.in);
        System.out.println("Please enter " + myNum.length + " numbers:");
        for (int i = 0; i < 5; i++) {

            myNum[4] = elmira.nextInt();
            //or   myNum[i] = elmira.nextInt();
        }
        System.out.println(" ");
        System.out.println(" ");

        // 1 random number between 1 to 50
        int randomnum = 0;
        randomnum = (int) (Math.random() * 50 + 1);
        System.out.println("the random number is " + randomnum);
        System.out.println(" ");

        // 10 random number 
        int[] randomNum = new int[10];
        for (int i = 0; i < 10; i++) {
            randomNum[i] = (int) (Math.random() * 50 + 1);
        }
        System.out.println("the 10 random numbers are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(randomNum[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //sum up the arrays 
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total = total + randomNum[i];
            total++;
        }
        //for (int i = 0; i < randomNum.length; i++) {
        System.out.println("the sum of the arrays are: " + total);

        System.out.println(" ");
        System.out.println(" ");

        //copying arrays
        int[] myArray1 = {2, 3, 4, 5};
        int[] myArray2 = new int[myArray1.length];
        for (int i = 0; i < 4; i++) {
            myArray2[i] = myArray1[i];
            System.out.print(myArray2[i] + "  ");
        }

    }

}
