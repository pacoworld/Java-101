//Francisco Sanchez Enriquez    Algorithms > Implementation > Sock Merchant
import java.util.*;

public class Lerning{    
    
    	public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int [n];
        int flags[] = new int [n];
        int pairs=0;
        
        for (int i=0; i<array.length; i++){
        array[i] = sc.nextInt();
        }
        
        for(int x=0; x<array.length; x++){
            for(int y=x+1; y<array.length; y++){
                if(array[x]==array[y] && flags[x]!=-1 && flags[y]!=-1){
                   pairs++;
                   flags[x]=-1;
                   flags[y]=-1;
                }                
            }
        }        
        System.out.println(pairs);       
    }        
}