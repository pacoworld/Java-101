//Francisco Sanchez Enriquez
import java.util.Arrays;
import java.util.Scanner;


public class Lerning {
	public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
	    String a = in.next();	    
            String b = in.next();
            
            int sizea = a.length();
            int sizeb = b.length();
            String array1[]= new String[sizea];
            String array2[]= new String[sizeb];
            int counter=0;
            
            for(int i=0; i<sizea; i++){
            String temp = a.substring(i, i+1);
            String lowercase = temp.toLowerCase();
            array1[i]= lowercase;
            }
            
            for(int i=0; i<sizeb; i++){
            String temp = b.substring(i, i+1);
            String lowercase = temp.toLowerCase();
            array2[i]= lowercase;
            }
            
           Arrays.sort(array1);
           Arrays.sort(array2);
           boolean result = Arrays.equals(array1, array2);
           if(result == true ){
           System.out.println("Anagrams");
           }else{
           System.out.println("Not Anagrams");
           }            
    }	
}        