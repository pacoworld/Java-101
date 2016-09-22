//Francisco Sanchez Enriquez   All Domains > Tutorials > 30 Days of Code > Day 1: Data Types
import java.util.*;

public class Lerning{
    public static void main(String[] args){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);        
        int i1 = scan.nextInt();
        double d1 = scan.nextDouble();
        scan.nextLine();
        String s1 = scan.nextLine();
        
        int sum = i + i1;
        double sumd = d + d1;
        String concatenated = s.concat(s1);
        System.out.println(sum);
        System.out.println(sumd);
        System.out.println(concatenated);
        scan.close();
    }
}