//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
                          
        Scanner input = new Scanner(System.in); 
        int cases = input.nextInt();
        double result;
        
        for(int x=0; x<cases; x++){
        int a  = input.nextInt();
        int b  = input.nextInt();
        int n  = input.nextInt();
        result=a;
            for(int y=0; y<n; y++){
            result=result+(Math.pow(2, y)*b);          
            System.out.printf("%.0f ", result);
            }      
            System.out.println();
        }
  
    }
}