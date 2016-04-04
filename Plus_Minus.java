import java.util.Scanner; 

public class Lerning {     
  
        public static void main(String[] arguments) {
    
        Scanner keyboard = new Scanner(System.in);
        int sizeofArray= keyboard.nextInt();
                
        String array = keyboard.nextLine();  
        int numbers[] = new int[sizeofArray];
        
       float positives =0;
       float negatives =0;
       float zeros =0;
       
       for (int i =0; i<numbers.length; i++){
       numbers[i] = keyboard.nextInt();
       
       if (numbers[i]>0){       
       positives++;
       }else{
           if (numbers[i]<0){
               negatives++;           
           }else{
           zeros++;
           }   
        }             
    }
       
        float percPositives = positives/sizeofArray;
        float percNegatives = negatives/sizeofArray;
        float percZeros= zeros/sizeofArray;
        
        System.out.println(percPositives);
        System.out.println(percNegatives);
        System.out.println(percZeros);
    }
}   