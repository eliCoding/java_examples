// @author elmira amanollahi
import java.util.Scanner;


// @author Elmira
public class Array2 {

    public static void main(String[] args) {
          int k =6;
        int[] myInt = new int[10];
        for (int i = 0; i < myInt.length;i++ ) {
            myInt[k] = k;
           
        System.out.println(myInt[k]);
    }
            myInt[7]= 100;
             System.out.println( myInt[7]);
             
             
          // how can I limit the numbers of row and column   
             
             
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
