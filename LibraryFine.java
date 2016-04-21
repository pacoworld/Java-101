//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments) {

        Scanner keyboard = new Scanner(System.in);
        int actualDay = keyboard.nextInt();        
        int actualMonth = keyboard.nextInt();
        int actualYear = keyboard.nextInt();
        int expectedDay = keyboard.nextInt();
        int expectedMonth = keyboard.nextInt();
        int expectedYear = keyboard.nextInt();
        int tempDay, tempMonth, tempYear;
        int yearFine=10000;
        int fine=0;
        
        tempDay=actualDay-expectedDay;
        tempMonth=actualMonth-expectedMonth;
        tempYear=actualYear-expectedYear;
        
        
        if(tempYear<0){
        System.out.println(fine);
        }else{
            if(tempYear>0){
            System.out.println(yearFine);
            }else{
                if(tempMonth<0){
                System.out.println(fine);                
                }else
                    if(tempMonth>0){
                    fine= tempMonth*500;
                    System.out.println(fine);             
                    }else{
                    if(tempDay<=0){
                System.out.println(fine);
                }else{
                fine=tempDay*15;
                System.out.println(fine);
                }
            }
        }
    }
  }
}