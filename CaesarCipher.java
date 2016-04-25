//Francisco Sanchez Enriquez
import java.util.Scanner;


public class Lerning {     
  
        public static void main(String[] arguments) {

        Scanner keyboard = new Scanner(System.in);
        int length  = keyboard.nextInt();
        String message = keyboard.next();
        int key  = keyboard.nextInt();
        String messa[] = new String[length];
        String alphabetarray[] = new String[52];
        String encriptedarray[] = new String[length];
        String character;
        String alphabet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        int same=0;
        
        for(int i=0; i<alphabetarray.length ; i++){
          character = alphabet.substring(i,i+1);          
          alphabetarray[i]=character;
        }        
        
        for(int i=0; i<length ; i++){
          character = message.substring(i,i+1);
          messa[i]=character;           
        }
        
        for (int i=0; i<length ; i++){
            for(int j=0; j<alphabetarray.length; j++){ 
                same=0;
        if(messa[i].equals(alphabetarray[j])){
                int index;
                same=1;
                index=j+key;
                               
                    //lowercase
                    if(j<26 && index>=25){
                         do{
                            index=index-26;
                           }while(index>=26);
                    }
                    
                    if(j>25 && index>=52){
                      do{
                    index=index-26;
                }while(index>25 && index>=52);
                    }
                    
               
                  encriptedarray[i]=alphabetarray[index];
                  break;
                }  
                    
                }
                    if(same==0){
                encriptedarray[i]=messa[i];
                same=0;                    
            }          
        }
        
        for(int i=0; i<length ; i++){
          System.out.print(encriptedarray[i]);          
        }
          System.out.println();
    }        
}