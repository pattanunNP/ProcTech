
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Random;


public class q3 {


    public static void main(String[] args) {

        
        var Sc = new Scanner(System.in); 
        
        var rand = new Random();
//        Build new scanner
        
        var current_date = new  GregorianCalendar();
        
        
        System.out.println("Current Date: "+
               current_date.get(Calendar.DATE) +
                ", " + current_date.get(Calendar.MONTH) +
                ", " + current_date.get(Calendar.YEAR));

        System.out.print("Enter name: ");
        String name = Sc.nextLine();
        
        int day = (int) ((Math.random() * (28 - 1)) + 1);
        int month = (int) ((Math.random() * (11 - 0)) + 0);
        int year = (int) ((Math.random() * (2021 - 2000)) + 2000);
        
        var brith_date = new  GregorianCalendar(year,month,day);
        
        long day_diff =  Math.abs(brith_date.getTimeInMillis() - current_date.getTimeInMillis());
       
        
//   
        System.out.println(name + " birth date is " + brith_date.get(Calendar.YEAR) + "-" + brith_date.get(Calendar.MONTH) + "-" + brith_date.get(Calendar.DATE));
        System.out.println("Days: " + (day_diff/ (1000 * 60 * 60* 24)));
        
         
        
        
        
        
        
        
        
        
        
 
        
    }
    
}
