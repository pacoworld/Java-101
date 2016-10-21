package lerning;

//Francisco Sanchez Enriquez    30 Days of Code <  Java Exception Handling
import java.util.*;

class MyCalculator{
        int power(int a,int b) throws Exception{
        double x=Math.pow(a, b);
        if( a < 0 || b < 0){
            throw new Exception("n and p should be non-negative");
        }
        
        int y = (int) x;
        return y;        
        }
}

class Lerning{ 
        public static void main(String []args){
		
		Scanner in = new Scanner(System.in);
                  while ( in .hasNextInt()) {
                  int n = in .nextInt();
                  int p = in .nextInt();
                  MyCalculator my_calculator = new MyCalculator();
                  try {
                  System.out.println(my_calculator.power(n, p));
                  } catch (Exception e) {
                  System.out.println(e);
                       }
                    }
    }
}