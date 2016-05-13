//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
                          
        Scanner input = new Scanner(System.in); 
        String phrase;
        int counter=0;
        
        while (input.hasNext()){
        phrase = input.nextLine();
        counter++;
        System.out.println(counter+ " "+ phrase);        
        }
        }
}
