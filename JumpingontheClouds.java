//Francisco Sanchez Enriquez  Implementation < Jumping on the Clouds
import java.util.*;

public class Lerning {

    public static void main(String[] args) {
         
        Scanner keyboard = new Scanner(System.in);        
        int n = keyboard.nextInt(); 
        int array [] = new int [n];
        int a, b, jump=0, position=0;
        
        for (int i=0; i<array.length; i++){
        array[i] = keyboard.nextInt();
        }
        
        do{
        if(position+2<n && array[position+2]==0 ){
             position=position+2;
             jump++;
             }
        else{
             position=position+1;
             jump++;
        }
            }while(position+1<n);
            
        System.out.println(jump);
    }   
}