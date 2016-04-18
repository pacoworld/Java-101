//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments) {

        Scanner keyboard = new Scanner(System.in);
        int tests = keyboard.nextInt();        
        
        for (int i=0; i<tests; i++){
            long black = keyboard.nextInt();
            long white = keyboard.nextInt();
            long priceBlack = keyboard.nextInt();
            long priceWhite = keyboard.nextInt();  
            long converting = keyboard.nextInt();
            long a, b,c, d, total, op1, op2;
            
            long lower = Math.min(priceWhite, priceBlack);
            a=white*priceWhite;
            b=priceBlack*black;
            
            if(priceWhite==priceBlack){                
                total=a+b;
            }
            else{            
            if (lower == priceBlack){                              
           c=white*priceBlack;
           d=converting*white;
            if((c+d)<=a){
                   total= b+c+d;                  
                }else{
                total=a+b;
                }            
   
            }else{      
           c=black*priceWhite;
           d=converting*black;                      
                if((c+d)<=b){
                   total= a+c+d;                  
                }else{
                total=a+b;
                }                                            
            }
        }
      System.out.println(total);        
    }                
  }
}