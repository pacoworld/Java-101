//Francisco Sanchez Enriquez    30 Days of Code > Day 16: Exceptions - String to Integer
import java.util.*;

public class Lerning{  
    
    	public static void main(String[] args){  
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        int conv;
        
        try{
        conv = Integer.parseInt(s);
        System.out.println(conv);
         }catch (NumberFormatException e){
        System.out.println("Bad String");
        }  
    }       
}