//Francisco Sanchez Enriquez    30 Days of Code  Day 14: Scope
import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
        
        public Difference(int [] elements){
            this.elements = elements; 
        }
        
        public void computeDifference(){
            int temp, max=0;
            for(int i=0; i<elements.length; i++){
                for(int k=i ; k<elements.length; k++){                     
                    temp = Math.abs(elements[i]-elements[k]);
                    if(temp>max){
                    max=temp;
                    }                    
                }
            }  
            maximumDifference=max;
        }
    }

public class Lerning{    
    
    	public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
       
    }        
}