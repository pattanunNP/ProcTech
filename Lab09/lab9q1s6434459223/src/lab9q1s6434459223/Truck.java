/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q1s6434459223;

/**
 *
 * @author arm
 */
public class Truck extends Car {

    private double M_weight;
    private double weight;

    public Truck(double gas, double efficiency, double weight, double M_weight) {
        super(gas, efficiency);
        this.M_weight = M_weight;

        if (weight >= M_weight) {
            this.weight = M_weight;
        } else {
            this.weight = weight;
        }

    }

    @Override
    public void drive(double distance) {

        double fuel_to_use = distance / this.getEfficiency();

        if (this.weight < 1) {
            fuel_to_use = fuel_to_use * 1.0;

        } else if (this.weight <= 10) {
            fuel_to_use = fuel_to_use * 1.1;

        } else if (this.weight <= 20) {
            fuel_to_use = fuel_to_use * 1.2;

        } else {
            fuel_to_use = fuel_to_use * 1.3;
        }

        if (fuel_to_use > super.getGas()) {
            System.out.println("You cannot drive too far, please add gas");
        } else {

            super.setGas(super.getGas() - fuel_to_use);
        }

    }

}
