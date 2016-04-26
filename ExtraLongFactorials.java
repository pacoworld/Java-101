//Francisco Sanchez Enriquez
import java.util.Scanner;
import java.math.BigInteger;


public class Lerning {     
  
        public static void main(String[] arguments){

        int n;
        int c=1;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
 
    Scanner input = new Scanner(System.in); 
    n = input.nextInt();
 
    do{
      fact = fact.multiply(inc);
      inc = inc.add(BigInteger.ONE);
      c++;
    }while(c<=n);    
    
 
    System.out.println(fact);
    }
  }