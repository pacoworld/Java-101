//Francisco Sanchez Enriquez  Implementation < Minimum Distances

import java.util.*;

public class Lerning {

    public static void main(String[] args) {
         
        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();        
        int array[] = new int [n];
        int distance=-1, lower=0;
        
        for(int i=0; i<n; i++){
            array[i] = keyboard.nextInt();
            }   
        
        for (int i=0; i<n; i++){
            int sample = array[i];
            for (int j=i+1; j<n; j++){
                if (array[j]==sample){
                    if(distance==-1){
                         distance = j-i;
                    }else{
                        if((j-i)<distance){
                             distance=j-i;
                        }
                    }
                }                
            }
        }
        
        System.out.println(distance);
        }
    }