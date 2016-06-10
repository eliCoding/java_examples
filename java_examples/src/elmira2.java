
 
public class elmira2{
    public static void main(String[] args) 
    {
       int count = 0;
       double sum = 0;
       int lowerbound = 5;
       int upperbound = 10;
       for ( int number = lowerbound; number <=upperbound; number++)
       {
           if ( number % 3 == 0){
              sum = number + sum ; 
              count = count + 1;
           }
       
        }
        System.out.println("the sum is:" + sum);
       double average = (sum / (upperbound - lowerbound + 1) );
        System.out.println("average is: " + average);
        System.out.println("the count is:" + count);
            }
    
    
}
    

     
        
   


