//Francisco Sanchez Enriquez  Compare the Triplets

import java.util.*;

public class Lerning {

    public static void main(String[] args) {
         
        Scanner keyboard = new Scanner(System.in);
        int alice[]= new int [3];
        int bob[]= new int [3];
        int alicescore = 0, bobscore = 0;
        
        for (int i=0; i<3; i++){
        alice[i]= keyboard.nextInt();
        }
        
        for (int i=0; i<3; i++){
        bob[i]= keyboard.nextInt();
        }
        
        for (int i=0; i<3; i++){
            if (alice[i] > bob[i]){
            alicescore++;
            }
                if(alice[i] < bob[i]){
                bobscore++;
                }                    
        } 
        
        System.out.printf("%d %d", alicescore, bobscore);
        }
    }