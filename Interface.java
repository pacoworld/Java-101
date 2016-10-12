//Francisco Sanchez Enriquez    30 Days of Code < Interfaces
import java.util.*;

     interface AdvancedArithmetic{
     int divisorSum(int n);
}
             
        class Calculator implements AdvancedArithmetic{
            private int sum=0;
            public int divisorSum(int n){
            int sum = 1;
            for(int i = 2; i <= n; i++) {
                if(n % i == 0) {
                    sum += i;
                }
            }
        return sum;
           }
         }
        
  public class Lerning{        
        
     
    	public static void main(String[] args){   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }       
}