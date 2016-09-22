//Francisco Sanchez Enriquez   30 Days of Code > Operators
import java.util.*;

public class Lerning{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        double mealCoast = in.nextDouble();
        double tipPercent = in.nextInt();
        double taxPercent = in.nextInt();
        in.close();
        
        double a = mealCoast*(tipPercent/100);
        double b = mealCoast*(taxPercent/100);
        double subtotal = mealCoast + a + b;
        int totalCost = (int) Math.round(subtotal);
        System.out.printf( "The total meal cost is %d dollars.\n" , totalCost);        
    }
}