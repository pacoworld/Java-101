//Francisco Sanchez Enriquez
import java.util.Scanner;


public class Lerning {     
  
        public static void main(String[] arguments) {

        Scanner keyboard = new Scanner(System.in);
        int chapters = keyboard.nextInt();
        int problems = keyboard.nextInt();
        int max[] = new int[chapters];
        int z, index=0, specials=0, page=1, counter=1, sum=0;
        
        for(int i=0; i<max.length; i++){
            max[i]= keyboard.nextInt();
        }
        
        for( int num : max) {
          sum = sum+num;
      }        
       
            int longarray[]= new int[sum];        
            
            for (int x=0; x<chapters; x++){                       
               for(int y=0; y<max[x]; y++){   
               z=x+y+index;    
               longarray[z]=y+1;  
               
               if(longarray[z]==page){
               specials++;
               }                
               
               if(counter%problems==0){
               page++;
               counter=1;
               }else{               
               counter++;
               }                            
            }
               
            index=(index+max[x])-1;
            if(counter>1){
            page++;
            counter=1;
                }
            }            
            System.out.println(specials);
    }        
}