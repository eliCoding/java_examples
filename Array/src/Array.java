// @author elmira amanollahi
public class Array {

    public static void main(String[] args) {
        int[] myInt = new int[10];

        for (int i = 0; i < 10; i++) {

            myInt[i] = (int) (Math.random() * 50 + 1);

        }
        for (int i = 0; i < 10; i++) {

            System.out.print(myInt[i] + "  ");
        }

        int max = myInt[0];
        for (int i = 0; i < myInt.length; i++) {
            if (myInt[i] > max) {
                max = myInt[i];
            }
        }
        System.out.println("");
        System.out.println("the max NUmber is: " + max);

        int min = myInt[0];
        for (int i = 0; i < myInt.length; i++) {
            if (myInt[i] < min) {
                min = myInt[i];

            }
        }
        System.out.println("the min Number is: " + min);

    }
}
