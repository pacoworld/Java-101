import java.util.Scanner; 

public class Lerning {     
  
        public static void main(String[] arguments) {
    
        Scanner keyboard = new Scanner(System.in);
        int sizeofArray= keyboard.nextInt();
                
        String array = keyboard.nextLine();  
        int numbers[] = new int[sizeofArray];
        
        long result = 0;
        
        for (int i=0; i<numbers.length; i++){
        numbers[i] = keyboard.nextInt();               
        result = result + numbers[i];         
        }
        
        System.out.println(result);
    }
} 