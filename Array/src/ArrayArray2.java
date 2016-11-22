//@author Elmira

public class ArrayArray2 {

    public static void main(String[] args) {
        int[][] myTable = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(myTable[i][j]);
            }
            System.out.println();
        }
        
        
        
        

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                myTable[i][j] = 1;
                System.out.print(myTable[i][j]);

            }
            System.out.println();
        }
        int k = 0;
        int l = 0;
//?
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myTable[i][j] = i;
               // k++;
                
                System.out.print(i + j);
              //  System.out.print(myTable[i][j]);

            }
            System.out.println();

        }
            

    }
}
