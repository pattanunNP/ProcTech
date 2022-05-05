/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434459223;

/**
 *
 * @author arm
 */

public class Cosine extends Taylor {

    public Cosine (int k, int x) {
        super(k, x);
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.cos() is " + Math.cos(this.getValue()));
        System.out.println("Approximated value is " + this.getApprox());
    }

    @Override
    public double getApprox() {
        double cos = 0;
      for (int n = 0; n <= super.getIteration(); n++) {
            double fact1 = (Math.pow(-1, n) * Math.pow(super.getValue(), (2 * n)));
            double fact2 = this.factorial((2 * n));
            cos += (fact1 / fact2);

        }
      return cos;
    }
}
