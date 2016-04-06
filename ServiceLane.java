//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments) {
        Scanner keyboard = new Scanner(System.in);
        int lenght = keyboard.nextInt();   
        int cases = keyboard.nextInt();   
          
        int k[] = new int [lenght];
        for (int i=0; i<lenght; i++){
        k[i] = keyboard.nextInt();              
        }
        
        for (int i=0; i<cases; i++){
        int entry = keyboard.nextInt();
        int exit = keyboard.nextInt();
        int max = k[entry];
        int min = k[entry];
                
        max = k[entry];
        for(int j=entry; j<=exit; j++){
           if(k[j] > max){
           max = k[j] ;
           }        
        }
        
        min = k[entry];
        for (int m=entry; m<=exit; m++){
           if(k[m] < min){
           min = k[m] ;
           }
        }   
        
            if(min==1){
                System.out.println(min);
                }else
                    if(min==2){
                        System.out.println(min);
                            }else
                                {
                                System.out.println(min);
                                }
        
        }                
    }                         
}