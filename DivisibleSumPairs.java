//Francisco Sanchez Enriquez  Implementation < Divisible Sum Pairs
import java.util.*;

public class Lerning {

    public static void main(String[] args) {
         
        Scanner keyboard = new Scanner(System.in);        
        int n = keyboard.nextInt(); 
        int k = keyboard.nextInt(); 
        int array [] = new int [n];
        int a, b, counter=0, residual;
        
        for(int i=0; i<array.length; i++){
        array[i] = keyboard.nextInt();
        }
        
        for(a=0; a<n; a++){
            for(b=a+1; b<n; b++){
                residual=(array[a]+array[b])%k;
                if (a<b && residual==0 )
                {
                counter++;
                }
            }
        }
        
        System.out.println(counter);
    }   
}