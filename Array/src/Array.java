// @author elmira amanollahi
   

public class Array {

    public static void main(String[] args) {
        //random numbers in aray
        int[] myInt = new int[10];

        for (int i = 0; i < 10; i++) {

            myInt[i] = (int) (Math.random() * 50 + 1);

        }
        System.out.println("The random numbers are:");
        for (int i = 0; i < 10; i++) {

            System.out.print(myInt[i] + "  ");
        }
        System.out.println("  ");
        System.out.println("  ");
        
        
//max 
        int max = myInt[0];
        for (int i = 0; i < myInt.length; i++) {
            if (myInt[i] > max) {
                max = myInt[i];
            }
        }
        System.out.println("");
        System.out.println("The max Number is: " + max);
      
        
        System.out.println("  ");
        System.out.println("  ");
        
        
//min

        int min = myInt[0];
        for (int i = 0; i < myInt.length; i++) {
            if (myInt[i] < min) {
                min = myInt[i];

            }
        }
        System.out.println("The min Number is: " + min);
        
        System.out.println("  ");
        System.out.println("  ");
        
 //Swapping the elements in array 
        
        int[] myInt1 = {2, 5, 4, 3, 7};
             
        System.out.println("2  5  4  3  7");

       for (int i = 0; i<myInt1.length; i++) {  
        int temp = 0;
        temp = myInt1[0];
        myInt1[0] = myInt1[4];
        myInt1[4] = temp;
           //System.out.print(myInt[i] + "  ");
        System.out.print(myInt1[i] + "  ");
       }
    }
}
