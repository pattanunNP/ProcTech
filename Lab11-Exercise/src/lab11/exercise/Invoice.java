/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11.exercise;

/**
 *
 * @author arm
 */
public class Invoice implements Payable {

    private String partNumber;
    private String partDesscription;

    private int quantity;

    private double pricePerItem;

    public Invoice(String partNumber, String description, int count, double price) {

        this.partNumber = partNumber;

        this.partDesscription = description;

    }

    public void setPartNumber(String part) {

        this.partNumber = part;
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public void setPartDescription(String description) {
        this.partDesscription = description;
    }

    public String getPartDescription() {
        return this.partDesscription;
    }

    public void setQuantity(int count) {
        this.quantity = (count < 0) ? 0 : count;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setPricePerItem(double price) {
        pricePerItem = (price < 0.0) ? 0.0 : price;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public String toString() {
        return "invoice: \npart number: " + getPartNumber() + "(" + getPartDescription() + ")\nquantity: " + getQuantity() + "\nprice per item: " + getPricePerItem();
    }

    /* method required to carry out contract with interface Payable */
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem(); // calculate total cost}
    }
}