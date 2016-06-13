//Francisco Sanchez Enriquez
import java.util.Arrays;
import java.util.Scanner;


public class Lerning {
        
	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
                                
           int array[] []= new int [6] [6];
           int values [] = new int [16];
           int m, n, i, j=0, counterx=-1, countery=0, max;
           
           for (m=0; m<6; m++){
               for(n=0; n<6; n++){
                array[m][n] = in.nextInt();
               }           
           }
           
        for(int k=0; k<16; k++){   
            if (counterx > 2)
            {
            counterx=0;
            countery++;
            }
            else{
            counterx++;
            }
           for(i=counterx; i<counterx+3; i+=2){
               for(j=countery; j<countery+3; j++){
               values[k]=values[k]+array[i][j];
               }                     
           }values[k]=values[k]+array[i-3][j-2];
        }   
        
           Arrays.sort(values);
           System.out.println(values[15]);
           	
    }
}