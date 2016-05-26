//Francisco Sanchez Enriquez
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class Lerning {
	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           int testCases = Integer.parseInt(in.nextLine());
           String text;
           int count;
           
           for (int i=0; i<testCases; i++){
           count=0;
           text = in.nextLine();
           Pattern p = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
           Matcher m = p.matcher(text);
           while(m.find()){
            if (m.group(2).length() !=0) {
                System.out.println(m.group(2));
                count++;
             }           
           }                            
            if (count == 0) 
                System.out.println("None");
           }                  
    }
}