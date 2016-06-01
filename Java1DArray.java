//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {
	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int array[] = new int[n];
           int sum = 0, sum1=0, sum3=0;
          
          for(int i=0; i<n; i++){
          array[i] = in.nextInt();
          }
          
          for(int i=0; i<n; i++){
              for(int j=i; j<n; j++){
                  if(i==j){
                  sum1= array[i];
                  }else{
                      sum=0;
                      for(int k=i; k<=j; k++){                          
                            sum = sum + array[k];                          
                  }
                  sum1=sum;
                  }                  
                 if(sum1<0){
                    sum3++;
                    }
              }          
          }                             
          System.out.println(sum3);
    }
}