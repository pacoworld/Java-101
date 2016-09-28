//All Domains  Tutorials  30 Days of Code  - Array

import java.util.*;

public class Lerning{
    	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                int array[] = new int [t];
                
                for(int a=0 ; a<t; a++){
                array[a]= sc.nextInt();
                }

                for(int i=t-1; i>=0; i--){
                System.out.printf("%d ", array[i]);
                }
                
                System.out.println();
    }
}