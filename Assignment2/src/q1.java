
//@author Elmira
public class q1 {

    public static void main(String[] args) {
        int[] array01 = new int[10];
        int[] array02 = new int[10];
        int myNumber;
        int count = 0;

        while (count < array01.length) {
            //Generate Random number
            myNumber = (int) (Math.random() * 20 + 1);

            //check where to place the number if it is not there
            for (int i = 0; i < array01.length; i++) {
                if (array01[i] == 0) {
                    array01[i] = myNumber;
                    count++;
                    break;
                }
                if (array01[i] == myNumber) {
                    break;
                }

            }

        }
        for (int i = 0; i < array01.length; i++) {
            System.out.print(array01[i] + "   ");
        }
        System.out.println();
        int k = 9;
        for (int i = 0; i < array01.length; i++) {

            array02[k] = array01[i];
            k--;
        }

        for (int i = 0; i < array02.length; i++) {
            System.out.print(array02[i] + "   ");
        }
    }
}
