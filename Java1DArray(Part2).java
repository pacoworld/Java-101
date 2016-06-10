//Francisco Sanchez Enriquez
import java.util.Scanner;

public class Lerning {
        @SuppressWarnings("empty-statement")
	public static void main(String[] args) {



           Scanner in = new Scanner(System.in);
           int cases = in.nextInt();
           int m, n, index=0, flag = 0, inarow=0, a=0, b=0;
           boolean win = false;
           String array2[] = new String[cases];
          
          
           for (int i=0; i<cases ; i++){
           n = in.nextInt();
           m = in.nextInt();
           int array[] = new int [n];
           int array3[] = new int [n];
               
               for (int x=0; x<n; x++){
               array [x] = in.nextInt();
               }
               do{
                   
               if (array[index+1]==0 && index<n ){
               index++;                                 
               inarow++;
                            if((index+1)<n){
                            if(array[index+1]==1){
                            array3[a]=index-(inarow-1);
                            a++;
                            array3[a]=index;
                            a++;
                            }
                                    }
               }else{
                  if((index+m)>=n){
                  win=true;                      
                  index=index+m;
                  break;
                  }else{
                      if(array[index+m]==0){
                      index=index+m;
                      }else{
                      if(index==0){
                      win = false;
                      break;
                      }else{
                            if(array[index-1]==0 && array[(index-1)+m] == 0 && m > 1){
                            index=index-1;
                            index=index + m;         
                             }else{  
                         
                            index = 0;
                          do{
                          if((index+m)<n){                                                       
                             if(array[index+m]==0){
                             index= index+m;
                             } 
                            else{       
                                        
                                         index=array3[a-2];
                                        do{                                                   
                                    if((index+m)<n) {       
                                        if(array[(index+1)+m]==0 && array[index+1]==0){
                                          index=index+m+1;
                                        }else{
                                            if(array[index+m]==0){
                                                index=index+m;
                                                    }                                            
                                                }
                                            }
                                    else{
                                    win = true;
                                    index= n;
                                    flag = 1;
                                    break;
                                    }
                                        }while(index<n);
                             
                            if(index<n)   {         
                            win = false;
                            index=n;
                            break;
                            }
                          }                 
                                                 
                          }else{
                          win = true;
                          flag = 1;
                          break;
                          }                          
                          }while(index<n);  
                            if(index>n){
                            win = true;
                            break;
                            }else
                                                                                                                                              
                            {
                                if(flag==0){
                                 win = false;
                                 break;
                                }
                            }
                      }
                     }
                  }
                  }  inarow=1;              
               }
              
               
               
               if(index==n-1){
               win = true;
               break;
               }
               }while(index<n);
               
               if(win==true){
                   array2[i]="YES"; 
                   index=0;           
                    }
                    else
                    {
                   array2[i]="NO"; 
                   index=0; 
                    }
                }           
           
           for(int j=0; j<cases; j++ ){
           System.out.println(array2[j]);
           }           
    }
}