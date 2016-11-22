//@ author elmira
// if the guessed number and random numbered are equal

import java.util.*;

public class arrays {

    public static void main(String[] args) {
        Scanner elmira = new Scanner(System.in);
        
        int[][] myTable = new int[5][5];
        System.out.print("Plese enter " + myTable [4].length + " rows and " + myTable[0].length + " colomns: ");
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                myTable[row][column] = elmira.nextInt();
            }
        }
        
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.print(myTable[row][column]);
            }
            System.out.println();
        }

    }

}
