//Francisco Sanchez Enriquez  Save the Prisoner!

import java.util.*;

public class Lerning {

    public static void main(String[] args) {
         
        Scanner keyboard = new Scanner(System.in);
        
        int cases = keyboard.nextInt();    
        
        for (int x=0; x<cases; x++){
        int prisioners, sweets, id;
        prisioners = keyboard.nextInt();
        sweets = keyboard.nextInt();
        id = keyboard.nextInt();
             
             int last = (id+sweets-1) % prisioners;
             
             if(last == 0){
             System.out.println(prisioners); 
             }else{
             System.out.println(last);
             }      
            }         
        }
    }