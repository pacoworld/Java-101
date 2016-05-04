//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
            
        Scanner input = new Scanner(System.in);
       int people = input.nextInt();
       int topics = input.nextInt();
       int array[][] = new int[people][topics];          
       
       for (int x=0; x<people; x++){ 
            String numberstring;
            String character;
            numberstring = (input.next());
            int y;
            for(y=0; y<topics; y++){ 
            character = numberstring.substring(y,y+1);
            int temp;
            temp = Integer.parseInt(character);
            array [x][y] = temp;
            }
        }
       int count=0, count2=0, k, bigger=0;
       
       for(int i=0; i<people; i++){
           k=i+1;
           for(int j=k; j<people; j++){
               count=0;
               for(int l=0; l<topics; l++){
           if (array [i][l]==1 || array [j][l]==1){
               count++;
             }
           }
              if(count>bigger){
                  count2=0;
             bigger=count;
             count2++;                
          }else{
              if(count==bigger){
              count2++;
              }
              }
             }
       }
           
           
       System.out.println(bigger);
       System.out.println(count2);
    }
}