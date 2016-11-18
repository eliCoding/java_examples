
//* @author Elmira
public class ArrayArray3 {

    public static void main(String[] args) {

        int[][] myTable = new int[6][6];
       

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                if ((i % 2 == 0) && (j % 2 == 0)) {
                    myTable[i][j] = 1;
                } else if ((i % 2 == 1) && (j % 2 == 1)) {
                    myTable[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(myTable[i][j]);

            }
            System.out.println();
        }

    }
}
