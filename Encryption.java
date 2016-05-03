//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
            
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
        int number = phrase.length();
        int lenght=0, clot=0;
        String stringarray [] = new String[number];        
        String character;
       
        for (int i=0; i<number; i++){
            character = phrase.substring(i,i+1);  
                    if(!" ".equals(character)){
                  stringarray [clot]=character; 
                  clot++;
                    } else{                    
                    }
                lenght=clot;      
              }
        
        double square = Math.sqrt(lenght);
        int row = (int)Math.round(square);
        int column; 
        int i=0;
        if(row>=square){
        column = row;
        }else{
        column = row+1;
        }
        String nospaces [][] = new String[row][column];
        
                                                   
                  for (int x=0;x<row; x++){
                      for(int y=0;y<column; y++){
                          if(i<clot){
                        nospaces [x][y]=stringarray[i];
                       i++;
                          }else
                              break;
        }                
    }
                  
            for(int y=0; y<column; y++){
                for(int x=0; x<row; x++)  {
                    if (nospaces[x][y]!= null){
                  System.out.print(nospaces [x][y]);
                }
                }
                System.out.printf(" ");
            }
    System.out.println();
  }
}
