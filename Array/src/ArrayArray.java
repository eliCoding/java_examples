
// @author Elmira

//nested loop 
public class ArrayArray {

    public static void main(String[] args) {
        int[][] myTable = new int[5][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + " " + j + " ");
                // System.out.print(myTable[i][j]);

            }
            System.out.println("hi");
        }
        System.out.println(" ");
        System.out.println("  ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println("hi");
        }

    }
}
