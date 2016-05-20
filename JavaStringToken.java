//Francisco Sanchez Enriquez
import java.util.Scanner;


public class Lerning {
	public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
	    String main = in.nextLine();	                
            int size = main.length();
            String array[] = new String[size];
            String word="", temp=""; 
            int counter=0, counter1=0;
            
            for (int i=0; i<size; i++){
            String character;
            character = main.substring(i, i+1);
            array[i]=character;
            }    
             for (int i=0; i<size; i++){            
            if(" ".equals(array[i]) ||  ",".equals(array[i]) || "'".equals(array[i]) || "!".equals(array[i]) || "?".equals(array[i]) || ".".equals(array[i]) || "_".equals(array[i]) || "@".equals(array[i]) || i+1==size){              
                if(i+1==size || (!" ".equals(array[i+1]) &&  !",".equals(array[i+1]) && !"'".equals(array[i+1]) && !"!".equals(array[i+1]) && !"?".equals(array[i+1]) && !".".equals(array[i+1]) && !"_".equals(array[i+1]) && !"@".equals(array[i+1])) ){                    
                    if(counter1>0){
                    counter++;
                    }
                }else{                  
                           
                }
               }else
              counter1++;
             }
            System.out.println(counter);
            
            for (int i=0; i<size; i++){            
            if((!" ".equals(array[i]) &&  !",".equals(array[i]) && !"'".equals(array[i]) && !"!".equals(array[i]) && !"?".equals(array[i]) && !".".equals(array[i]) && !"_".equals(array[i]) && !"@".equals(array[i]))){                
                word=word.concat(array[i]);                
            }else{                                                         
                if(i+1==size || /*" ".equals(array[i+1]) ||*/ (!" ".equals(array[i+1]) && !",".equals(array[i+1]) && !"'".equals(array[i+1]) && !"!".equals(array[i+1]) && !"?".equals(array[i+1]) && !".".equals(array[i+1]) && !"_".equals(array[i+1]) && !"@".equals(array[i+1]))){                  
                    if("".equals(word)){
                    
                    }else{
                    System.out.println(word);             
                word="";        
                    }      
                    }
                }
            }
        System.out.println(word);            
    }	
}   