/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q1s6434459223;

/**
 *
 * @author arm
 */
import java.util.Scanner;

import java.lang.*;

import java.util.Arrays;
import java.util.Collections;

import lab4q1s6434459223.Calculator;

public class Q1 {

    public static void main(String[] args) {

        String[] Inputs = {"Frist point", "Second point", "Thrid point", "Forth point"};

        int i, j;

        String input_no;

        double sum_x = 0;
        double sum_y = 0;
        double sum_dist = 0;

        double[][] arr = new double[4][2];

        double[] dist_list = new double[4];

        double centroid_x, centroid_y;

        var Sc = new Scanner(System.in);

        for (i = 0; i < Inputs.length; i++) {

            input_no = Inputs[i];

            System.out.print(input_no + ": ");

            String temp = Sc.nextLine();

            String[] cord = temp.split(" ", 0);

            double x = Double.parseDouble(cord[0]);

            double y = Double.parseDouble(cord[1]);

            sum_x = sum_x + x;
            sum_y = sum_y + y;

            arr[i][0] = x;
            arr[i][1] = y;

        }

        var C = new Calculator();

        var centroid = C.centroids(sum_x, sum_y);

        for (j = 0; j < arr.length; j++) {
            
            // System.out.println("x " + arr[j][0] +" y "+ arr[j][1]);

            double distance = C.distance(centroid[0], centroid[1], arr[j][0], arr[j][1]);


            sum_dist = sum_dist + distance;

            dist_list[j] = distance;

        }

        var max = C.getMaxValue( dist_list);
        var min = C.getMinValue( dist_list);
        
        System.out.println("The centroid is" + "( " + centroid[0] + "," + centroid[1] + " )");
        System.out.println("sum of distance  is " + sum_dist );
        
        System.out.println("Shortest distance is "+min);
        System.out.println("Longest distance is "+max);

    }

}
