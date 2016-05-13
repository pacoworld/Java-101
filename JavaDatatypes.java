//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
                          
        Scanner input = new Scanner(System.in); 
        int cases = input.nextInt();
                
        for(int i=0; i<cases; i++){   
            try{
            long number = input.nextLong();  
               
        System.out.println(number + " can be fitted in:");
        if(number>= -128 && number <= 127)
        {
        System.out.println("* byte");                           
        }
        
        if(number>= -Math.pow(2, 15) && number <= Math.pow(2, 15)-1)
        {
         System.out.println("* short");             
        }
        
        if(number >= -Math.pow(2, 31) && number <= Math.pow(2, 31)-1)
        {
        System.out.println("* int");               
        }
        
        if(number>= -Math.pow(2, 63) && number <= Math.pow(2,63)-1)
        {
        System.out.println("* long");                        
        }                                    
     }
            catch(Exception e)
                {
            System.out.println(input.next()+" can't be fitted anywhere.");
                }
                
        }
    }
}
