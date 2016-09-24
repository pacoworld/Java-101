import java.util.*;

public class Lerning{
    public static void main(String[] args){
        
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       
       double a = n%2;
       if(a != 0){
       System.out.println("Weird");
       }else{
           if(n> 1 && n < 6 ){
           System.out.println("Not Weird");
           }else{
               if(n > 6 && n < 21 ){
                   System.out.println("Weird");
                    }else{
                   if (n > 20){
                   System.out.println("Not Weird");
                }
            }
          }
       }       
    }
}