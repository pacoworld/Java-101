//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){         
         
        Scanner keyboard = new Scanner(System.in);
        int tests = keyboard.nextInt();
        
        for(int i=0; i<tests; i++){
        int stones = keyboard.nextInt();    
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();    
        
       
        if(a==b){
        System.out.println((stones-1)*a);
        }else{
        if(a>b){    
        int temp=a;
            a=b;
            b=temp;
        }
        for(int x=0;x<stones; x++){
            System.out.print(x*b+(stones-1-x)*a+" ");
        }
        System.out.println();
        
            }  
        }               
    }
  }

