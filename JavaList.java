//Francisco Sanchez Enriquez
import java.util.*; 

public class Lerning {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> array = new ArrayList<Integer>();
        String a;
        int w;
        
        for(int i=0; i<n; i++){
        int temp = scan.nextInt();
        array.add(temp);        
        }
        
        int q = scan.nextInt();
       
        for(int i=0; i<q; i++){
        a = scan.next();
        
        if("Insert".equals(a)){
        int x = scan.nextInt();
        int y = scan.nextInt(); 
        
        array.add(x, y);
        }else{
        
        int delete= scan.nextInt();
        array.remove(delete);                
                }        
        }

        int print[] = new int[array.size()];
        
        for (int i=0; i<array.size(); i++){
        w = array.get(i);
        print[i]=w;
        }
        
        for(int i=0; i<array.size(); i++){
        System.out.printf("%d ", print[i]);
        }
    }
}  