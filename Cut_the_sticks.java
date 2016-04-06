//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments) {
        Scanner keyboard = new Scanner(System.in);
        int sticks = keyboard.nextInt();          
        int size[] = new int[sticks];
        
        for (int i=0; i<size.length; i++){
        size[i] = keyboard.nextInt();
        }
        
        int min;
        int left=0;
        do{
           int x=-1;
           do{
           x++;
           }while(size[x]==0 && x<size.length);
           min = size[x];           
             for (int i=0; i<size.length; i++){
             if(size[i]<min){                    
                if(size[i]==0){                   
                }else{
           min = size[i];
               }
           }           
        } 
        
        int cuts=0;
        for (int i=0; i<size.length; i++){
            if(size[i]>0){
            size[i]= size[i]-min;
            cuts++;
            }
        }
        
        left=0;
        for (int i=0; i<size.length; i++){
        left= left+size[i];        
        }        
        System.out.println(cuts);
        }while(left>0);         
    }                        
}