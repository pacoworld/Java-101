//Francisco Sanchez Enriquez    30 Days of Code > Recursion
import java.util.*;

public class Lerning{
        
            public static int factorial(int counter, int sofar){                                
                sofar = sofar * counter;                
                return sofar;
            }       
    
    	public static void main(String[] args){                 
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int result=1;
                
                for(int i=1 ; i<=n; i++){
                result = Lerning.factorial(i, result);                
                }
            System.out.println(result);
    }
}