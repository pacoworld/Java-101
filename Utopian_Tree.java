import java.util.Scanner; 


public class Lerning {     
  
        public static void main(String[] arguments) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();   
        
                  
        for (int i=0; i<cases; i++){
        int cycles = keyboard.nextInt();
        int height=1;    
        
        if (cycles==0){
           
            
        }else{
            for(int k=0; k<cycles; k++){
                if(cycles==1){
                height=2;                
                }else{
                int even = k%2;
                if (even==0){                    
                height= height*2;       
                }else{   
            height = height +1;   
                    }
                }
            }        
        } 
        System.out.println(height);
    }                
  }             
}