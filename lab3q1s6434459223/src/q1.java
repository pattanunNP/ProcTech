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
      
        String s1_info = Sc.nextLine();
        String[] s1_info_array = s1_info.split("\\s+", 0);
        
        String s1_studentid = s1_info_array[0];
        String s1_name = s1_info_array[1];
        
        
        
        var Student1 = new Student(s1_studentid, s1_name);
        
        System.out.println("Student 2: Enter ID, birthday, name ");
        String s2_info = Sc.nextLine();
        String[] s2_info_array = s2_info.split(" ", 0);
        
        String s2_studentid = s2_info_array[0];
        int s2_brithday = Integer.parseInt(s2_info_array[1]);
        int s2_month =  Integer.parseInt(s2_info_array[2]) - 1 ;
        int s2_year =  Integer.parseInt(s2_info_array[3]);
        String s2_name = s2_info_array[4];
        
        var Student2 = new Student(s2_studentid,s2_name,
                                    s2_brithday,s2_month, s2_year);
        
        System.out.println("Student1: "+Student1.toString()+" "+ Student1.getAge() + " years old");
        System.out.println("Student2: "+ Student2.toString()+" "+ Student2.getAge()+ " years old");
        
        Boolean ismatch = Student1.equals(Student2);
        System.out.println(Student1.matchinfo(ismatch));
        
        
        System.out.println("Enter name and birthday for Student 2");
        String s2edit_info = Sc.nextLine();
        String[] s2edit_info_array = s2edit_info.split(" ", 0);
        
        String s2edit_name = s2edit_info_array[0];
        int s2edit_brithday = Integer.parseInt(s2edit_info_array[1]);
        int s2edit_month =  Integer.parseInt(s2edit_info_array[2]) - 1 ;
        int s2edit_year =  Integer.parseInt(s2edit_info_array[3]);
        
        Student2.setBD(s2edit_brithday,s2edit_month,s2edit_year);
        Student2.setName(s2edit_name);
        
        Boolean ismatch2 = Student1.equals(Student2);
        System.out.println(Student1.matchinfo(ismatch2));
 
        
    }
    
}
