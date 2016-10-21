//Francisco Sanchez Enriquez    30 Days of Code <  Java Exception Handling (Try-catch)
import java.util.*;

class Lerning{ 
        public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		try{
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                System.out.println(x/y);
                }
                catch(java.util.InputMismatchException e){
                System.out.println("java.util.InputMismatchException");
                }
                catch(java.lang.ArithmeticException e){
                System.out.println("java.lang.ArithmeticException: / by zero");
                }
                
    }
}