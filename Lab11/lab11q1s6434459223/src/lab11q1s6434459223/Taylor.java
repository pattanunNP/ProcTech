/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434459223;

/**
 *
 * @author arm
 */
public abstract class Taylor {

    private int k;
    private double x;

    public Taylor(int k, double x) {
        this.k = k;
        this.x = x;

    }

    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;
    }

    public int getIteration() {
        return this.k;
    }

    public double getValue() {
        return this.x;
    }

    public abstract void printValue();

    public abstract double getApprox();

}
