///Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {     
  
        public static void main(String[] arguments){        
            
        Scanner input = new Scanner(System.in);
       int from = input.nextInt();
       int to = input.nextInt();
       int longitude, left, right, leftint=0, rightint=0, many=0;
       long square;
       String sqstring, character;
       
       for(long i=from; i<=to; i++){
               
       square=i*i;
       sqstring= String.valueOf(square);
       longitude=sqstring.length();
       
       if(longitude%2!=0){
       right=(longitude/2)+1;
       left=right-1;
       }else{
       right=longitude/2;
       left=right;
       }
       
       String leftside="", rightside="";
       for(int a=0; a<left; a++){
       character=sqstring.substring(a,a+1);
       leftside=leftside.concat(character);
       leftint = Integer.parseInt(leftside);
       }
       
       for(int a=left; a<longitude; a++){
       character=sqstring.substring(a,a+1);
       rightside=rightside.concat(character);
       rightint =Integer.parseInt(rightside);
       }
       
       if(leftint+rightint==i){
       System.out.print(i+ " ");
       many++;       
       }
       
       }
       if(many==0){
       System.out.println("INVALID RANGE");
       }
    }
}