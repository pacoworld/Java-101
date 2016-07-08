import java.util.Scanner;
import java.math.BigInteger;

//Francisco Sanchez Enriquez
public class Lerning {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();        
        BigInteger a1 = new BigInteger(a);
        boolean itis;
        Integer certainty = 1;
        
        itis = a1.isProbablePrime(certainty);
        
        if (itis==true){
        System.out.println("prime");
        }else{
        System.out.println("not prime");        
        }
    }
}