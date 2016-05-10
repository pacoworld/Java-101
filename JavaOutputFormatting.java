//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
        
       String chain, chain2, chain3;
       int number, number2, number3, size, spaces, display=0;
            
        Scanner input = new Scanner(System.in); 
        
        for(int x=0; x<3; x++){
        chain = input.next();
        number = input.nextInt();
        size = chain.length();
        spaces = 15-size;
        
        if(display==0){
        System.out.println("================================");
        display++;
        }
        System.out.printf("%s", chain);
        
        for(int i=0; i<spaces; i++){
        System.out.printf(" ");
        }
        System.out.printf("%03d\n", number);        
        }      
        
        System.out.println("================================");  
    }
}