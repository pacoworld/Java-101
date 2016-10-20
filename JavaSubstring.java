//Francisco Sanchez Enriquez    30 Days of Code <  Java Substring
import java.util.*;

class Lerning{ 
        public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
                int start = sc.nextInt();
                int end = sc.nextInt();
                
                for (int i= start; i<end; i++){
                System.out.print(s.substring(i, i+1));
                }
                System.out.println();                
    }
}