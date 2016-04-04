import java.util.Scanner; 
import java.lang.*;

public class Lerning {     
  
        public static void main(String[] arguments) {
    
        Scanner keyboard = new Scanner(System.in);
        String time = keyboard.next();
        
        int lenght = time.length();
        String AMorPM = time.substring(lenght-2);
        String AMorPMuppercase = AMorPM.toUpperCase();
       
            if(AMorPMuppercase.equals("AM")){
            String hour = time.substring(0, 2);
            int timeInt = Integer.parseInt(hour);
            String timeinAM;
                if(timeInt==12){
                timeinAM = time.replace("12", "00");  
                timeinAM = timeinAM.replace(AMorPM, "");
                System.out.println(timeinAM);
                }else{ 
                                  
            timeinAM = time.replace(AMorPM, "");
            System.out.println(timeinAM);
                }
            }
            else
            { 
             String hour = time.substring(0, 2);
             int timeInt = Integer.parseInt(hour); 
             if(timeInt==12){
             int hourInt = timeInt;
             String hourMilitay = Integer.toString(hourInt);        
             String finalHour = time.replace(hour, hourMilitay);
             finalHour = finalHour.replace(AMorPM, "");
             System.out.println(finalHour); 
                 
             }else{                 
             int hourInt = timeInt + 12;
             String hourMilitay = Integer.toString(hourInt);        
             String finalHour = time.replace(hour, hourMilitay);
             finalHour = finalHour.replace(AMorPM, "");
             System.out.println(finalHour);             
             }
        }                       
    }             
}