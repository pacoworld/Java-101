//Francisco Sanchez Enriquez   Java < Introduction < Java Loops I
    import java.util.*;

    public class Lerning {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int table = s.nextInt();
            int result;

            for (int i=1; i<=10; i++){
                result = i * table;
                System.out.printf("%d x %d = %d\n", table, i, result);            
            }       
        }   
    }