//Francisco Sanchez Enriquez
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class Lerning {
	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           int testCases = Integer.parseInt(in.nextLine());
           while(testCases>0){
           String username = in.nextLine();
         
           String pattern = "^\\p{Alpha}\\w{7,29}$";           
           Pattern r = Pattern.compile(pattern);
           Matcher m = r.matcher(username);
          
         if (m.find( )) {
            System.out.println("Valid");
         } else {
            System.out.println("Invalid");
         }
         testCases--;
      }
         
    }
}