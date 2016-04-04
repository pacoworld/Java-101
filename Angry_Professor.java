//Francisco Sanchez Enriquez
import java.util.Scanner; 

public class Lerning {     
  
        public static void main(String[] arguments) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();        
                
        
        for(int j=0; j<cases; j++){  
        int minimum[] = new int[cases];    
        int students = keyboard.nextInt();    
        int counter=0;  
        int result[] = new int[students];
        int time[] = new int[students];
        
        minimum[j] = keyboard.nextInt();                       
        
        for(int i=0; i<students; i++){            
        time[i]= keyboard.nextInt();        
        
        if(time[i]<=0){
        counter++;        
        }            
        
    }
        result[j]=counter;
        if (result[j]>=minimum[j]){
        System.out.println("NO");
        }
        else
        {
        System.out.println("YES");        
        }
        }
  }             
}