//Francisco Sanchez Enriquez
import java.util.Scanner;
import java.math.*;


public class Lerning {
	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           String[] array = new String[n];           
           BigDecimal[] bignumber = new BigDecimal[n];          
           String a, b;
           BigDecimal a1,a2,b1, b2;
           
           for (int i=0; i<n; i++){
           array[i] = in.next();           
           }
           
           for (int i=0; i<n-1; i++){
           b1 = new BigDecimal(array[i+1]);
           b2 = new BigDecimal(array[i]); 
           if(b1.compareTo(b2) == 1) 
           {
             b = array[i+1];
             array[i+1] = array[i];
             array[i] = b;
            for(int j = i ; j>=1; j=j-1)
            {
            a1 = new BigDecimal(array[j]);
            a2 = new BigDecimal(array[j-1]);

            if(a1.compareTo(a2) == 1)
            {
                b = array[j];
                array[j] = array[j-1];
                array[j-1] = b;
            }
        }
    }
}                                
           
           for (int i=0; i<n; i++){
           System.out.println(array[i]);
           }
    }
}