//Francisco Sanchez Enriquez
import java.util.Scanner;
import java.util.regex.Pattern;


public class Lerning {
	public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
			int tests = in.nextInt();	
            String drop = in.nextLine();
           
            for (int i=0; i < tests; i++){
                  String first = in.nextLine();              
                try{
                    
                    Pattern p = Pattern.compile(first);               
                    System.out.println("Valid");                                   
                }catch(Exception e){
                 System.out.println("Invalid");
                }
            } 
    }	
}