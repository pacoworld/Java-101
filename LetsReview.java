//All Domains  Tutorials  30 Days of Code  - Day 6: Let's Review

import java.util.*;

public class Lerning{
    	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                
                for(int a=0 ; a<t; a++){
                String s = sc.next();
                int l = s.length();
                String arr[] = new String [a];
                
                for(int i=0; i < l; i+=2){
                 System.out.printf(s.substring(i, i+1));
                }
                
                System.out.printf(" ");
                
                for(int i=1; i < l; i+=2){
                 System.out.printf(s.substring(i, i+1));
                }
                
                System.out.println();
        }                
    }
}