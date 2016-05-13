//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {  //Class solution                 
        //Scanner input = new Scanner(System.in);               
        public static boolean flag = true;        
        public static Scanner input = new Scanner(System.in);
        public static int B = input.nextInt();
        public static int H = input.nextInt();
        static{
            try{
        if(B <= 0 || H<=0){
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
            }catch(Exception e){
            
            }        
        }

        public static void main(String[] args){
        if(flag){
	int area=B*H;
	System.out.print(area);
	}
    }//end of main
}//end of class