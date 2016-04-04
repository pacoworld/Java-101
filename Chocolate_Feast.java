
//Francisco Sanchez Enriquez
import java.util.Scanner; 

public class Lerning {     
  
        public static void main(String[] arguments) {
    
        Scanner keyboard = new Scanner(System.in);
        int testcases = keyboard.nextInt();
       
        int money[] = new int[testcases];
        int price[] = new int[testcases];
        int wrappers[] = new int[testcases];
        int total [] = new int[testcases];
        
        for(int i=0; i<testcases; i++){     
        money[i] = keyboard.nextInt();
        price[i] = keyboard.nextInt();
        wrappers[i] = keyboard.nextInt();
        
        int chocoBought[] = new int[testcases];
        int extras[] = new int[testcases];
        int residual[] = new int[testcases];
        
       chocoBought[i] = money[i]/price[i];
       extras[i] = chocoBought[i]/wrappers[i];
       residual[i] = chocoBought[i]%wrappers[i];
       
       int pilon[] = new int[testcases];
       int plus[] = new int[testcases];
       int aa[] = new int[testcases];
       int bb[] = new int[testcases]; 
              
       plus[i] = residual[i]+extras[i];
        do{            
            bb[i]=plus[i]/wrappers[i]; 
            aa[i]= plus[i]%wrappers[i];              
            pilon[i]=pilon[i]+bb[i];
            plus[i]=aa[i]+bb[i];
                        
        }while(plus[i]>=wrappers[i]);
        
        total[i] = chocoBought[i]+extras[i]+pilon[i];
        }
        
         for(int i=0; i<testcases; i++){
        System.out.println(total[i]);
         }
    }             
}
