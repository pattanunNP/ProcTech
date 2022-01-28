/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author arm
 */


import java.util.Scanner;
import Student.Student;
        
public class q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var Sc = new Scanner(System.in);
        
    
        System.out.println("Student 1: Enter ID, name ");
        String s1_studentid = Sc.nextLine();
        String s1_name = Sc.nextLine();
        
        
        
        Student Student1 = new Student(s1_studentid, s1_name);
        
        System.out.println("Student 2: Enter ID, birthday, name ");
        String s2_studentid = Sc.nextLine();
        int s2_brithday = Sc.nextInt();
        int s2_month = Sc.nextInt();
        int s2_year = Sc.nextInt();
        String s2_name = Sc.nextLine();
        
        var Student2 = new Student(s2_name,s2_studentid,
                                    s2_brithday,s2_month, s2_year);
        
        System.out.println("Student1 is name "+Student1.getName());
        System.out.println("Student1 is id "+ Student1.getID());
      
        
    }
    
}
