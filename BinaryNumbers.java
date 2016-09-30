//Francisco Sanchez Enriquez    30 Days of Code > Binary Numbers
import java.util.*;

public class Lerning{    
    
    	public static void main(String[] args){                 
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int binary[] = new int[100];
            int q=1, counter, pass=0;
            int position=0;
            
            do{
            if(x>=q){
            position++;
            q=q*2;
            }else{
                binary[position-1]=1;
               position=0;
               x=x-(q/2);
               q=1;
              }            
            }while (x!=0);
                
            for(int i=0; i<100; i++){
                if(binary[i]==1){
                    counter=0;
                 do{
                 counter++;
                 i++;
                 }while(binary[i]==1);
                 
                 if(counter>pass){
                 pass=counter;
                 }                 
                }
            }          
            System.out.println(pass);
    }
}