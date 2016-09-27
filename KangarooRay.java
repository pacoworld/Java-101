//Francisco Sanchez Enriquez   30 Days of Code > Operators
import java.util.*;

public class Lerning{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        
        for(int j=0; j<times; j++){
            int n = in.nextInt();
            int m = in.nextInt();
            int caja[] = new int[n];
            String answer = "YES";
            int counter;
            int k;
            
            for(int q=0; q<n; q++){
            caja[q] = in.nextInt();            
            }
            
           int i = -1;
            do{
            i++;
            if( 0 == caja [i+1]){
              i++;
            }else{
            if(i+m < n){
            if( 0 == caja [i+m]){            
            i=i+m;
                    }
                }
            }
            k = i;
            for(counter = 1; counter < n; counter++){    
                if((i+m-counter < n) && (i+m-counter >= 0) && (i-counter >= 0)){
            if((0 == caja[i-counter]) && (0 == caja[i+m-counter])){
                i=i+m-counter;
            } 
                }
            if(counter == n){
            answer = "NO";
                }            
            }                     
            i = k;            
            }while((i+m)<n);
        
        System.out.println(answer);
        }
    }
}