//Francisco Sanchez Enriquez
import java.util.Scanner;


public class Lerning {
	public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);
	    String a=in.next();
	    String b=in.next();		
            String character, uppercase, uppercase1;            
            
            int c = a.length();
            int d = b.length();           
            int sum = c+d;
            
            String array[]= new String [c];
            String array2[]= new String [d];
            
            character = a.substring(0 , 1);            
            uppercase = character.toUpperCase();
            character = b.substring(0 , 1);
            uppercase1 = character.toUpperCase();
            
            for(int y=0; y<c; y++){ 
            character = a.substring(y,y+1);
            array[y] = character;            
            }
            
            for(int y=0; y<d; y++){ 
            character = b.substring(y,y+1);
            array2[y] = character;            
            }                                   
            
            //Prim tghe Sum
            System.out.println(sum);
            
            //Compare
            int compare = a.compareTo(b);
            if(compare <= 0) {
            System.out.println("No");
            }else{
            System.out.println("Yes");
            }
            
            //Print it with the firts letter in uppercase
            System.out.printf(uppercase);
            for(int i=1; i<c; i++){
            System.out.printf(array[i]);
            }
            
            System.out.printf(" ");
            
            System.out.printf(uppercase1);
            for(int i=1; i<d; i++){
            System.out.printf(array2[i]);
            }
            System.out.println(); 
    }	
}       