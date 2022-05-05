/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5q1s6434459223;

/**
 *
 * @author arm
 */
import java.util.Scanner;
import lab5q1s6434459223.Cal;

public class Q1 {

    public static void main(String[] args) {
        var Sc = new Scanner(System.in);
        var Cal = new Cal();

        System.out.println("Press 1 to sum three intregers");
        System.out.println("Press 2 to find roots of a quadratiuc equation");
        System.out.println("Press 3 to find the areaa of a rectangle");
        System.out.println("Press 4 to print A's");

        String choice = Sc.nextLine();

        int choices = Integer.parseInt(choice);

        switch (choices) {
            case 1:
                System.out.println("Enter 3 intregers");
                var inputs = Sc.nextLine();
                String[] x = inputs.split(" ", 0);

                var x1 = Integer.parseInt(x[0]);
                var x2 = Integer.parseInt(x[1]);
                var x3 = Integer.parseInt(x[2]);

                var sum = Cal.sum_of_three(x1, x2, x3);
                System.out.println(sum);

                break;

            case 2:

                System.out.println("Enter a, b,c for ax^2+bx+c=0: ");

                var input_2 = Sc.nextLine();

                String[] y = input_2.split(" ", 0);

                var a = Double.parseDouble(y[0]);
                var b = Double.parseDouble(y[1]);
                var c = Double.parseDouble(y[2]);

                var result = Cal.roots_of_quadratic_equation(a, b, c);

                System.out.println("Two roots: " + result[0] + " , " + result[1]);

                break;

            case 3:

                System.out.println("Enter the length of 2 sides of the rectangle:");
                var input_3 = Sc.nextLine();

                String[] w = input_3.split(" ", 0);

                var width = Float.parseFloat(w[0]);

                var height = Float.parseFloat(w[1]);

                var area = Cal.area(width, height);
                System.out.println("Area: " + area);
                break;

            case 4:
                System.out.println("How many A?");
                
                var time = Sc.nextLine();

                String a_time = "A";

                System.out.println(a_time.repeat(Integer.parseInt(time)));
                break;

            default:
                System.out.println("Invalid Choices");
                break;

        }

    }

}
