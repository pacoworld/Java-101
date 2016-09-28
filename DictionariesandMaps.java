import java.util.*;

public class Lerning{
    	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                Map<String,String> phonebook = new HashMap<String, String>();
                String name, phone;
                String searchname, result;
                
                for(int a=0 ; a<n; a++){
                name = sc.next();
                phone = sc.next();
                phonebook.put(name, phone);
                }

                while(sc.hasNext()){
                searchname = sc.next();
                result=phonebook.get(searchname);
                if(result==null){
                System.out.println("Not found");
                }else{
                System.out.println(searchname + "=" + phonebook.get(searchname));
                }
                }
                sc.close();
    }
}