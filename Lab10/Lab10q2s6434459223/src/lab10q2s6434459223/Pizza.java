/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q2s6434459223;

/**
 *
 * @author arm
 */
public class Pizza {

    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {

        return this.name + " price : " + this.price;
    }
}
