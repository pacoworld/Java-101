import java.util.Scanner; 
import java.lang.*;

public class Lerning {     
  
        public static void main(String[] arguments) {
    
        Scanner keyboard = new Scanner(System.in);
        int sizeofArray = keyboard.nextInt();
        
        int array2dims [][] = new int[sizeofArray][sizeofArray];
        
        for (int i=0; i<array2dims.length; i++){
            for (int j=0; j<array2dims.length; j++ ) {
             array2dims [i][j] = keyboard.nextInt();
            }            
        }
        
        int primary =0;
        int secundary = 0;
        int counter;
        
        for (int i=0; i<sizeofArray; i++){        
        primary = primary + array2dims[i][i];      
        }
        
        for (int i=0; i<sizeofArray; i++){
        counter = sizeofArray-(i+1);
                
        secundary = secundary + array2dims[i][counter]; 
        counter--;
        }
        
        int sum = primary - secundary;
        System.out.println(Math.abs(sum));
        }                         
}