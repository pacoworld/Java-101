//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();   
          
                  
        for (int i=0; i<cases; i++){
            int count=0;
            int number1 = keyboard.nextInt();
            int number2 = keyboard.nextInt();
            int power;
            double squareroot;
            int integer;
            int next;
            int pointer;
            
            do{                       
            squareroot = Math.sqrt(number1);
            integer = (int)squareroot;
            
            power = integer * integer;
            number1++;
            }while(power!=number1-1); 
            
            if(number1>number2){
            if(number1-1==number2){
             count++;   
            }
            }else {
            count++;
            }
            
            do{
            integer++;
            next = integer * integer;
            count++;
            }while(next<=number2);
       
        System.out.println(count-1);    
      }  
                
    }                         
}