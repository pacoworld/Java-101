//Francisco Sanchez   All Domains > Data Structures > Arrays > Arrays - DS
import java.util.*;

public class Lerning{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();    
    int array[] = new int [size];
    
    for(int i=0; i<array.length; i++){
    array [i] = in.nextInt();
    }
    
    for(int i=array.length-1; i>=0; i--){
    System.out.printf("%d ", array[i]);
    }
    }
}