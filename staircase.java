import java.util.Scanner; 

public class Lerning {     
  
        public static void main(String[] arguments) {
    
        Scanner keyboard = new Scanner(System.in);
        int sizeofStair= keyboard.nextInt();
        
        int dashes = 1;
        int spaces=sizeofStair-1;

        for (int i=0; i<sizeofStair; i++){                 
                          
        for(int d=0; d<spaces; d++){
        System.out.printf(" ");
        }
        
        for(int d=0; d<dashes; d++){
        System.out.printf("#");
        }  
        
        System.out.println("");
        dashes++;
        spaces--;
        
        }                        
    }   
}