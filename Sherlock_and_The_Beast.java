//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments) {

        Scanner keyboard = new Scanner(System.in);
        int tests = keyboard.nextInt(); 
        int d;
        int b;
        
        for (int i=0; i<tests; i++){
            int digits = keyboard.nextInt();
            int z = digits;
            
            if (digits==1 || digits==2 || digits==4 || digits==7){
            System.out.println("-1");
            }else{
                
            b=digits%5;
            d=digits%3;
           
            switch (d){
                
                case 0:
                     for (int j=0; j<z; j++){
                     System.out.printf("5");            
                     }
                     System.out.println();
                     break;
                
            case 1:
                z=z-10;
                for (int j=0; j<z; j++){
                System.out.printf("5");            
                }
                for (int j=0; j<digits-z; j++){
                System.out.printf("3");
                }
                System.out.println();
                break;
            
            case 2:
                z=z-5;
                for (int j=0; j<z; j++){
                System.out.printf("5");            
                }
                for (int j=0; j<digits-z; j++){
                System.out.printf("3");
                }
                System.out.println();
                break;                                                      
            }            
    }
    }
  }
}