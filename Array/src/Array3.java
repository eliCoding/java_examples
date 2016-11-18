
 //@author Elmira
 import java.util.Scanner;
public class Array3 {

   
    public static void main(String[] args) {
        int [] myArray = {2,3,4,2,5};
       
        int total = 0;
        
        for (int i=0; i<5; i++) {
            total = total + myArray[i];
            System.out.println(total);
        }
        Scanner input = new Scanner(System.in);
         System.out.println("Enter " +myArray.length + " values: ");
       
         for(int i = 0; i<myArray.length; i++) {
             System.out.println("Enter value: ");
            myArray[i] = input.nextInt();}
        
       for (int i = 0; i<5; i++) {
        myArray[i] = (int)(Math.random() * 100+1);
        
        System.out.print(myArray[i] + "  ");
    
       
    } 
}
}
