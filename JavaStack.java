// Data Structures > Java Stack

import java.util.*;

class Lerning{ 
        public static void main(String []args){
	Scanner sc = new Scanner(System.in);
        int counter = 0, lenght, parentesis=0, llave=0, corchete=0; 
        String ch;
        
         while (sc.hasNext()) {
         String input=sc.next();
         lenght=input.length();
         String array[] = new String[lenght]; 
         parentesis=0; 
         llave=0; 
         corchete=0;
         
         for(int i=0; i<array.length; i++){
         ch = input.substring(i, i+1);
         array[i]=ch;
         }
         
         for(int a=0; a<array.length; a++){
         
         switch(array[a]){
         
             case "(":
             parentesis= parentesis+1;                 
             break;
         
             case ")":
             parentesis= parentesis-1;                 
             break;
         
             case "{":
             llave= llave+1;                 
             break;
             
             case "}":
             llave= llave-1;                 
             break;
             
             case "[":
             corchete= corchete+1;                 
             break;
             
             case "]":
             corchete= corchete-1;                 
             break;         
            }
         
        }
		
         if(parentesis==0 && llave==0 && corchete==0){
         System.out.println("true");
         }else{
         System.out.println("false");
         }
       }
    }
}