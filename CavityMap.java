//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments) {

        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();        
        String array [][] = new String [size][size];
        int temp, temp1, temp2, temp3, temp4;
        String ex="X";
        
        
        for (int x=0; x<size; x++){ 
            String numberstring;
            String character;
            numberstring = (keyboard.next());
            int y;
            for(y=0; y<size; y++){ 
            character = numberstring.substring(y,y+1);
            array[x][y] = character;
            }
        }
               
        for (int x=0; x<size; x++){
            int y;            
            for(y=0; y<size; y++){                  
                if(y==0 || y==size-1 || x==0 || x== size-1){
                System.out.printf(array[x][y]);
                }
                else{
                temp = Integer.parseInt(array[x][y]);
                temp1 = Integer.parseInt(array[x-1][y]);
                temp2 = Integer.parseInt(array[x][y-1]);
                temp3 = Integer.parseInt(array[x][y+1]);
                temp4 = Integer.parseInt(array[x+1][y]);
                        if(temp>temp1 && temp>temp2 && temp>temp3 && temp>temp4){
                             System.out.printf("X");                   
                        }else
                             System.out.printf(array[x][y]);                      
                    }
            }System.out.println();
        }
        System.out.println();
        
  }
}