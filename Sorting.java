import java.util.*;
        
  public class Lerning{        
        
     
    	public static void main(String[] args){   
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int temp, swaps=0;
        int iteration=0;
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        
        do{
            iteration = 0;
        for(int pointer=0; pointer<n-1; pointer++) {            
        if(a[pointer]>a[pointer+1]){
            temp=a[pointer];
            a[pointer]=a[pointer+1];
            a[pointer+1]=temp;
            swaps++;
            iteration=1;
            }        
        }
        }while(iteration==1);
        
        
        System.out.println("Array is sorted in " + swaps +" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}