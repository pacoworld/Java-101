//Francisco Sanchez Enriquez  Jumping on the Clouds: Revisited

import java.util.*;

public class Lerning {

    public static void main(String[] args) {
         
        Scanner keyboard = new Scanner(System.in);
        int n= keyboard.nextInt();
        int k= keyboard.nextInt();
        int array[] = new int [n];
        int E = 100;
        int index = 0;
        
        for(int i=0; i<n; i++){
        array[i]= keyboard.nextInt();
        }
        
        do{
            if ((index+k)>=n){
                index = (index + k) - n; 
                E--;
                if(array[index]==1){
                E=E-2;
                } 
                    if (index == 0)
                    break;  
            }            
            
        index = index + k;
        E--;
        if(array[index]==1){
        E=E-2;
        }  
        
    }while (index != 0);        
        
        System.out.println(E);
        }
    }