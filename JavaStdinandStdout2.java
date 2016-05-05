//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
            
        Scanner input = new Scanner(System.in);
        
        int one = input.nextInt();
        double two = input.nextDouble();
        input.nextLine();
        String three =input.nextLine();
        
        System.out.println("String: " + three);
        System.out.println("Double: " + two);
        System.out.println("Int: " + one);
       
    }
}