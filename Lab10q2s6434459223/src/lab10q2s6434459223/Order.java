/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q2s6434459223;

import java.util.ArrayList;

/**
 *
 * @author arm
 */
public class Order {

    public static int cntOrder = 0;
    private int id;
    private Customer c;
    private ArrayList<Pizza> p;

    public Order(Customer c) {
        cntOrder++;
        this.id = cntOrder;
        this.c = c;
        this.p = new ArrayList<Pizza>();
    }

    public void addPizza(Pizza p) {
        this.p.add(p);

    }

    public String getOrderDetail() {
        String orderDetials = "Order id :" + this.id + "\n";
        orderDetials += c.toString() + "\n";
        for (Pizza pizza : p) {
            orderDetials += pizza.toString() + "\n";
        }
        orderDetials  += "Total pieces : " + this.p.size() + "\n";
        orderDetials += "Total cost : " + calculatePayment();
      
        return orderDetials;
    }
     public double calculatePayment() {
        double total = 0;

        for (Pizza pizza : p) {
            total += pizza.getPrice();
        }

        if (c instanceof  GoldCustomer goldCustomer) {
          total -= (goldCustomer.getDiscount() / 100) * total;
            
        }

        return total;
    }
    
    

}
