/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4q1s6434459223;

/**
 *
 * @author arm
 */
public class Calculator {

    private double centroid_x, centroid_y, x, y;

    public Calculator() {

    }

    public double distance(double centroid_x, double centroid_y, double x, double y) {

        double diff_x = Math.pow(x-centroid_x,2);

        double diff_y = Math.pow(y-centroid_y,2);

        double result = diff_x + diff_y;

        double distance = Math.sqrt(result);

        return distance;

    }

    public double[] centroids(double sum_x, double sum_y) {

        double[] centroid = new double[2];

        double centroid_x = sum_x / 4;

        double centroid_y = sum_y / 4;

        centroid[0] = centroid_x;
        centroid[1] = centroid_y;

        return centroid;
    }
    
    public static double getMaxValue(double[] array) {
    double maxValue = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > maxValue) {
            maxValue = array[i];
        }
    }
    return maxValue;
}

// getting the miniumum value
    public static double getMinValue(double[] array) {
    double minValue = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] < minValue) {
            minValue = array[i];
        }
    }
    return minValue;
}
}
