/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434459223;

/**
 *
 * @author arm
 */
public class Sine extends Taylor {

    public Sine(int k, double x) {
        super(k, x);
    }

    @Override
    public double getApprox() {
        double sin = 0;

        for (int n = 0; n <= this.getIteration(); n++) {
            double fact1 = (Math.pow(-1, n) * Math.pow(this.getValue(), (2 * n) + 1));
            double fact2 = this.factorial((2 * n) + 1);
            sin += (fact1 / fact2);

        }

        return sin;

    }

    @Override
    public void printValue() {

        System.out.println("Value from Math.sine() is " + Math.sin(this.getValue()));
        System.out.println("Approximated value is " + this.getApprox());

    }

}
