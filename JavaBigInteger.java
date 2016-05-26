//Francisco Sanchez Enriquez
import java.util.Scanner;
import java.math.BigInteger;



public class Lerning {
	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           String a = in.nextLine();
           String b = in.nextLine();
           BigInteger resultadd, resultmult;
           BigInteger a1 = new BigInteger(a);
           BigInteger b1 = new BigInteger(b);
           
           resultadd = a1.add(b1);
           resultmult = a1.multiply(b1);
           
           System.out.println(resultadd);
           System.out.println(resultmult);
    }
}