/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q3s6434459223;

/**
 *
 * @author arm
 */
import java.util.Scanner;

public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       var Sc = new Scanner(System.in);
       
       System.out.println("Point A:");
       var point_a = Sc.nextLine();
       
       var cord_a = point_a.split(" ",0);
       
       System.out.println("Point B:");
       
       var point_b = Sc.nextLine();
       
       var cord_b = point_b.split(" ",0);
       
       var pointA = new Point(Float.parseFloat(cord_a[0]), Float.parseFloat(cord_a[1]));
       
       var pointB = new Point(Float.parseFloat(cord_b[0]), Float.parseFloat(cord_b[1]));
       
       var distance = pointA.distance(pointB);
       
       System.out.println("A = " + pointA.toString() + " B = " + pointB.toString() + " Distance = " + distance);
       
       System.out.println("Move the points: ");
       
       var move_point = Sc.nextLine();
       
       var move = move_point.split(" ",0);
       
       pointA.translate(Float.parseFloat(move[0]),Float.parseFloat(move[1]));
       
       pointB.translate(Float.parseFloat(move[0]),Float.parseFloat(move[1]));
       
       System.out.println("A = " + pointA.toString() + " B = " + pointB.toString() + " Distance = " + distance);
       
       
       System.out.println("A and B "+ pointA.checkPos(pointA.equals(pointB)));
       
       
    }
    
}
