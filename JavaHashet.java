//Francisco Sanchez Enriquez    Java > Data Structures > Java Hashset
import java.util.*;


public class Lerning{ 
        public static void main(String []args){
	Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }    
               
        Set FirstSet = new HashSet();
        String concat, concat1;
        int result;
        
        for(int i=0; i<t; i++){
        concat= pair_left[i].concat("+");
        concat1= concat.concat(pair_right[i]);
        FirstSet.add(concat1);
        result = FirstSet.size();
        System.out.println(result);        
        }
    }
}