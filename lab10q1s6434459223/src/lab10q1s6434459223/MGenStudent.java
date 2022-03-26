/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q1s6434459223;

/**
 *
 * @author arm
 */
public class MGenStudent extends MGenCard {

    public static final int discount = 20;

    public MGenStudent(String name) {
        super(name);

    }

    @Override
    public void buyTicket(Cinema c, int n_ticket) {
        super.buyTicket(c, n_ticket);
        
        double priceWDiscount = (c.getTicketPrice()* n_ticket * 0.2 );
        
        System.out.println("You got " + priceWDiscount +" discount");
        
    }
   
}
