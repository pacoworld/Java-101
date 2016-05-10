package lerning;

//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
            
        Scanner input = new Scanner(System.in);        
        int cases = input.nextInt();
        int sum=0, number;
        double residual;
        
        for (int i=0; i<cases; i++){
        int n = input.nextInt();   
        int array[] = new int[n];
            
        for(int x=0; x<n; x++){
            array[x] = input.nextInt();                            
            }
        
        sum=0;
        for(int p=0; p< array.length-1; p++){            
        number = array[p];
               for(int k=p+1; k<array.length ; k++){
                if(number>array[k]){
                sum++;        
            }
        }                 
    }                
         residual= sum%2;
         if(residual==0){
         System.out.println("YES"); 
         }else
        System.out.println("NO");             
        }       
  
    }
}