//Francisco Sanchez Enriquez
import java.util.Scanner;


public class Lerning {
	public static void main(String[] args) {
		

            Scanner in = new Scanner(System.in);
	    String a = in.next();
	    int k = in.nextInt();
            int lenght = a.length();
            String array[] = new String [(lenght-k)+1];
            int borl, lower=0, higher=0, counter =0;
            
            for(int i=0; i<=lenght-k; i++){
            String character;
            character = a.substring(i, i+k);
            array[i]=character;            
            }
                           
            for(int x=1; x<=lenght-k; x++){              
                borl=array[counter].compareTo(array[x]);                
                if(borl<0){
                lower=counter;
                }else{
                counter=x;
                lower=counter;
                } 
            }
                
                counter=0;
                for(int x=1; x<=lenght-k; x++ ){
                borl=array[counter].compareTo(array[x]);                
                if(borl>0){
                higher=counter;
                }else{
                counter=x;
                higher=counter;
                }                        
            }
            System.out.println(array[lower]);
            System.out.println(array[higher]);
    }	
}       