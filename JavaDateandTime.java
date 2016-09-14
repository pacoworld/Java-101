//Francisco Sanchez Enriquez   Java < Introduction < Java Date and Time
import java.util.*;
import java.time.LocalDate;

public class Lerning
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int month = in.nextInt();
      int day = in.nextInt();
      int year = in.nextInt();
      
      LocalDate dt = LocalDate.of(year, month, day);
      System.out.print(dt.getDayOfWeek());
   }
}