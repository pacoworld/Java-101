//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments) {

        Scanner keyboard = new Scanner(System.in);
        int tests = keyboard.nextInt();        
        
        for (int i=0; i<tests; i++){
        int rows = keyboard.nextInt();
        int columns = keyboard.nextInt();        
        int array[][]= new int[rows][columns];    
        int same=0;
        int yes=0;       
                
        for (int x=0; x<rows; x++){ 
            String numberstring;
            String character;
            numberstring = (keyboard.next());
            int y;
            for(y=0; y<columns; y++){ 
            character = numberstring.substring(y,y+1);
            int temp;
            temp = Integer.parseInt(character);
            array [x][y] = temp;
            }
        }
        
        
        int rows2 = keyboard.nextInt();
        int columns2 = keyboard.nextInt();        
        int array2[][]= new int[rows2][columns2];                
               
                
        for (int x=0; x<rows2; x++){ 
            String numberstring;
            String character;
            numberstring = (keyboard.next());
            int y;
            for(y=0; y<columns2; y++){ 
            character = numberstring.substring(y,y+1);
            int temp;
            temp = Integer.parseInt(character);
            array2 [x][y] = temp;
            }
        }
        
    for (int y=0; y<rows; y++){  
    int w=0;
    int z=0;
    int b;
    int x=0;
    int c=0;
    int d=0;
    
        for(x=0; x<columns; x++){    
        same=0;
            if(array[y][x]==array2[w][z]){                     
                if(columns-x>=columns2 && rows-y>=rows2){
                    c=0;
                    for(int a=y; a<y+rows2; a++){  
                     for(b=x; b<x+columns2; b++){                        
                     if(array[a][b]==array2[c][d]){
                        same++;
                            if(d<columns2-1){
                            d++;    
                            }else{
                            d=0;
                            c++;
                            }
                        if(same==(columns2*rows2)){
                        System.out.println("YES"); 
                        yes=1;
                        break;
                        }
                        else{                   
                        }
                     }else{ 
                       break;
                    }                                      
                      } 
                       z=0;
                       d=0;
                    }                  
                }else {   
                x++;
                      }   
            }
        }   
    }
    if(yes==1){
    }else
    System.out.println("NO");        
                
        }             
      }       
    }