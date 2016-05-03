//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
            
        Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       double answer;
       
       answer = number%2;
       
       if(answer!=0){
       System.out.println("Weird");
       }else{
           if (number>20){
             System.out.println("Not Weird");
              }else{
               if(number>6){
           System.out.println("Weird");
               }else
                   if(number>=2){
                   System.out.println("Not Weird");
                   }
           }                      
        }
    }
}