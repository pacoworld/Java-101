//Francisco Sanchez Enriquez    30 Days of Code > 2D Arrays
import java.util.*;

public class Lerning{    
    
    	public static void main(String[] args){                 
        Scanner in = new Scanner(System.in);
        int array [][] = new int[6][6];
        int results [] = new int [16];
        int a=0, max;
        
        for(int x=0; x<6; x++){
            for(int y=0; y<6; y++){
                array[x][y] = in.nextInt();
            }
        }
        
        for(int x=1; x<=4; x++){
            for(int y=1; y<=4; y++){
                results [a] = array[x-1][y-1];
                results [a] = results [a] + array[x-1][y];
                results [a] = results [a] + array[x-1][y+1];
                results [a] = results [a] + array[x][y];
                results [a] = results [a] + array[x+1][y-1];
                results [a] = results [a] + array[x+1][y];
                results [a] = results [a] + array[x+1][y+1];
                a++;
            }
        }
        
            Arrays.sort(results);            
            System.out.println(results[15]);
    }
}