import java.util.Scanner; 

public class Lerning {     
  
        public static void main(String[] arguments) {
    
        Scanner keyboard = new Scanner(System.in);
        int sizeofArray= keyboard.nextInt();
                
        String array = keyboard.nextLine();  
        int paco[] = new int[sizeofArray];
        
        int result = 0;
        
        for (int i=0; i<paco.length; i++){
        paco[i] = keyboard.nextInt();               
        result = result + paco[i];         
        }
        
        System.out.println(result);
    }
} 