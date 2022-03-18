/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q1s6434459223;

/**
 *
 * @author arm
 */
public class Car {

    private double gas;
    private double efficiency;

    public Car(double gas, double efficiency) {

        this.gas = gas;
        this.efficiency = efficiency;
    

    }

    public void setGas(double amount) {
        this.gas = amount;
    }

    public void drive(double distance) {
        double fuel_to_use = distance / this.efficiency;

        if (fuel_to_use <= this.gas) {
            this.gas = this.gas   - fuel_to_use;
        } else {
            System.out.println("You cannot drive too far, please add gas");
        }
    }

    public double getEfficiency() {
        return this.efficiency;
    }
 
    public double getGas() {
        return this.gas;
    }

    public void addGas(double amount) {
        this.gas = this.gas + amount;
    }

}
