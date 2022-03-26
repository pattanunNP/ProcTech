/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q2s6434459223;

/**
 *
 * @author arm
 */
public class GoldCustomer extends Customer {

    private double discount;

    public GoldCustomer(String name, String tel, double discount) {

        super(name, tel);
        this.discount = discount;

    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {

        return super.toString() + " discount : " + this.discount;
    }

}
