//Francisco Sanchez Enriquez    30 Days of Code  Day 17: More Exceptions
import java.util.*;

class Calculator{
    
    public int power(int nn, int pp) throws Exception{
        double np = Math.pow(nn, pp);
        
        if( nn < 0 || pp < 0){
        throw new Exception("n and p should be non-negative");
        }else{
        return (int)Math.pow(nn, pp);
        }
    }
}
    

 public class Lerning{   
    	public static void main(String[] args){  
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }       
}