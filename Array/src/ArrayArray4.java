//10 randoms 1 in a 10 * 10 array [10][10];
// @author elmira amanollahi
public class ArrayArray4 {

    public static void main(String[] args) {
        int[][] myTable = new int[10][10];
          int ones = 10;
          int xrand;
          int yrand;
       
       for (int i =0; i<10; i++) {
        xrand = (int) (Math.random()*10);
        yrand = (int) (Math.random()*10);
        myTable[xrand][yrand] = 1;
                
                
       }
        for (int i =0; i<10; i++) {
            for (int j =0 ; j<10; j++) {
                System.out.print(" " + myTable[i][j] + "  ");  
            }
            System.out.println("     "+"     " +"  ");
        }
        }
       
             
               
            
        }
       
    


