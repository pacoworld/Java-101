
//Francisco Sanchez Enriquez
import java.util.*;

public class Lerning {
        
	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           HashMap<String, String> book = new HashMap <String, String>();
           in.nextLine();
                                
           for(int i=0; i<n; i++){
               String name=in.nextLine();
               String phone=in.nextLine();
               book.put(name, phone);              
           }
          
           while(in.hasNext()){
              String query =in.nextLine().trim();
           System.out.println(book.containsKey(query) ? query+"="+book.get(query) : "Not found");                       
           }          
    }
}