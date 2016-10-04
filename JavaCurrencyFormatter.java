//Francisco Sanchez Enriquez    Java > Introduction > Java Currency Formatter
import java.util.*;
import java.text.NumberFormat;

public class Lerning{    
    
    	public static void main(String[] args){                 
        Scanner in = new Scanner (System.in);
        double payment = in.nextDouble();
        Locale IN = new Locale("en", "IN");
        
        System.out.println("US format = " + NumberFormat.getCurrencyInstance().format(payment));
        System.out.println("India format = " +NumberFormat.getCurrencyInstance(IN).format(payment));
    }        
}