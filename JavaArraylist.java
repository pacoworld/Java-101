//Francisco Sanchez Enriquez
import java.util.Scanner;
import java.util.ArrayList;

public class Lerning {
        
	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           int lines = in.nextInt();                     
           ArrayList<Integer> elements = new ArrayList<>();
           int d, number, x, y, row=0, a, b, c;
           int begin[]= new int [lines];
           int size[]= new int [lines];
           
           for(int i=0; i<lines; i++){
           d = in.nextInt();
           begin[i]=row;
           c=0;
                for(int j=0; j<d; j++){
                number = in.nextInt();
                elements.add(number);
                row++;
                c++;
                }                
               size[i]=c;
           }
            
            int querys = in.nextInt();		    
            
            for(int i=0; i<querys ;i++){
                x = in.nextInt();
                y = in.nextInt();
                a = begin[x-1];
                b = a+(y-1);
                if(size[x-1]>=y)
                System.out.println(elements.get(b));
                else
                 System.out.println("ERROR!");   
            }	
    }
}