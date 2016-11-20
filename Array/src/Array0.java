
         // @author Elmira
//method in arrays
public class Array0 {

    public static void main(String[] args) {
        int[] myInt = {2, 5, 4, 3, 7};
        printArray(myInt);

    }

    public static void printArray(int[] array) {
        int[] myInt = new int[5];

        for (int i = 0; i < myInt.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

}
