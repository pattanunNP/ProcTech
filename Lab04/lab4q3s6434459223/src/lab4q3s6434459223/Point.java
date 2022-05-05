/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4q3s6434459223;

/**
 *
 * @author arm
 */
public class Point {

    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point pointObj) {

        double diff_x = Math.pow(this.x- pointObj.x,2);

        double diff_y = Math.pow(this.y - pointObj.y,2);

        double result = diff_x + diff_y;

        double distance = Math.sqrt(result);

        return distance;

    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public void translate(float dist_x, float dist_y) {
        this.x = this.x + dist_x;
        this.y = this.y + dist_y;

    }

    public boolean equals(Point pointObj) {
        return this.x == pointObj.x && this.y == pointObj.y;
    }

    public String checkPos(boolean equals) {
        if (equals == true) {
            return "are same position";
        } else {
            return "are not at the same position";
        }
    }
}
