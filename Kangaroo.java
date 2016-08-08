//Francisco Sanchez Enriquez  Implementation < Minimum Distances

import java.util.*;

public class Lerning {

    public static void main(String[] args) {
         
        Scanner keyboard = new Scanner(System.in);        
        int x1 = keyboard.nextInt(); 
        int v1 = keyboard.nextInt();
        int x2 = keyboard.nextInt();
        int v2 = keyboard.nextInt();
        
        int a = x1-x2;
        int b = v2-v1;
        
        if (b==0){
            System.out.println("NO");    
        }
        else
                
        if (a%b==0 && a/b>0 ){
        System.out.println("YES");
        }
        else{
        System.out.println("NO");
        }
    }   
}