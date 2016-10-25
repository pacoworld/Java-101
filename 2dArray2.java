//  Data Structures < 2D Array - DS
import java.util.*;

class Lerning{ 
        public static void main(String []args){
	int array [][]= new int[6][6]; 	
        Scanner sc=new Scanner(System.in);
        int temp, index=0;
        int array2 []= new int [16];
            for (int i=0; i<array.length; i++) {
                for (int j = 0; j<array.length; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            
            for(int x=1; x<5; x++){
                for(int y=1; y<5; y++){
                temp = array[x-1][y-1];
                temp = temp + array[x-1][y];
                temp = temp + array[x-1][y+1];
                temp = temp + array[x][y];
                temp = temp + array[x+1][y-1];
                temp = temp + array[x+1][y];
                temp = temp + array[x+1][y+1];
                array2[index]=temp;
                index++;
                }
            }
            Arrays.sort(array2);
            System.out.println(array2[15]);
     
    }
}