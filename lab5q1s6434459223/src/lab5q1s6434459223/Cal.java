/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5q1s6434459223;

import java.util.Scanner;

/**
 *
 * @author arm
 */
public class Cal {

    public Cal() {

    }

    public int sum_of_three(int x1, int x2, int x3) {
        int sum = 0;

        sum = x1 + x2 + x3;

        return sum;
    }

    public double[] roots_of_quadratic_equation(double a, double b, double c) {

        double[] arr = new double[2];

        double x_pos = ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));

        double x_neg = ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));

        arr[0] = x_pos;
        arr[1] = x_neg;

        return arr;
    }

    public float area(float width, float heigh) {

        float result = width * heigh;

        return result;
    }

}
