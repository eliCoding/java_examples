
// @author Elmira
public class ArrayArray5 {

    public static void main(String[] args) {
        int[] myArray1 = new int[10];
       
        int randomNum = 0;
        boolean validate = true;
        for (int i = 0; i < 10; i++) {
            myArray1[i] = (int) (Math.random() * 20 + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(myArray1[i] + " ");
        }
     

        while (validate)  { 
        randomNum = (int) (Math.random() * 20 + 1);
         
            for (int i = 0; i < 10; i++) {
                if (randomNum == myArray1[i]) {
                    validate = true;
                    
                }
                }
            }
        }

    }


