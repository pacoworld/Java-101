//Francisco Sanchez Enriquez
import java.util.Scanner; 


public class Lerning {     
  
        public static void main(String[] arguments) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();    
                  
        for (int i=0; i<cases; i++){
        String number = keyboard.next();
        int numberint = Integer.parseInt(number);
        int counter=0; 
        
          for (int x=0; x<number.length(); x++){
              char digits = number.charAt(x);
              int aa=Character.getNumericValue(digits);
              if (aa>0){            
                 int residual = numberint%aa;
                 if(residual==0){
                     counter = counter + 1;
                 }else{
                        counter = counter + 0;
                    }                 
                 }else {              
              }
          }
          System.out.println(counter);   
        }         
    }                         
}