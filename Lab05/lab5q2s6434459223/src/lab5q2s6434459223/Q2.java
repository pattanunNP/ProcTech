/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5q2s6434459223;

/**
 *
 * @author arm
 */
import java.util.Scanner;
import lab5q2s6434459223.Course;

public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var Sc = new Scanner(System.in);
        System.out.println("Enter course ID, course name, credit:");

        var input = Sc.nextLine().trim();
        String[] info1 = input.trim().split(" ", 0);

        System.out.println("Enter course ID, course name: ");

        var input2 = Sc.nextLine().trim();
        String[] info2 = input2.trim().split(" ", 0);

        // Define obj;
        var course1 = new Course(info1[0], info1[1], Integer.parseInt(info1[2]));

        var course2 = new Course(info2[0], info2[1]);
        System.out.println(course1.result(course1.equals(course2)));
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println("Total credit: " + (course1.getCredit() + course2.getCredit()));

        // 2301260 ProgTech 4
        // 2301170 CompProg

        Sc.close();
    }

}
