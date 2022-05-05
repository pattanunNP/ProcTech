/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434459223;

/**
 *
 * @author arm
 */

public class Expo extends Taylor {

    public Expo(int k, double x) {
        super(k, x);
    }

    @Override
    public double getApprox() {
        double exp=0;

        for (int n = 0; n <= super.getIteration(); n++) {
               exp += Math.pow(super.getValue(),n)/ super.factorial(n);

        }

        return exp;

    }

    @Override
    public void printValue() {

        System.out.println("Value from Math.exp() is " + Math.exp(this.getValue()));
        System.out.println("Approximated value is " + this.getApprox());
    }

}
