/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author arm
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in); 
//        Build new scanner
        
        GregorianCalendar current_date = new  GregorianCalendar();
        
        
        System.out.println("Current Date: "+
               current_date.get(Calendar.DATE) +
                ", " + current_date.get(Calendar.MONTH) +
                ", " + current_date.get(Calendar.YEAR));

        System.out.print("Enter Day: ");
        int day = Sc.nextInt();
        
        System.out.print("Enter month: ");
        int month = Sc.nextInt();
        
        System.out.print("Enter year: ");
        int year = Sc.nextInt();
        
        GregorianCalendar date = new  GregorianCalendar(year, month,day);
        
        
        long day_diff =  Math.abs(current_date.getTimeInMillis() - date.getTimeInMillis());

        System.out.println("Number of date: " + day_diff/ (1000 * 60 * 60* 24) + " Days");
        
        
    }
    
}
