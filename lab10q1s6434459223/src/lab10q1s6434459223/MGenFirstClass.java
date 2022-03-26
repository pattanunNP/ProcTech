/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10q1s6434459223;

/**
 *
 * @author arm
 */
public class MGenFirstClass extends MGenCard {

    private int freeTicket;

    public MGenFirstClass(String name) {
        super(name);
        this.freeTicket = 2;
    }

    public void getFreeTicket() {

        if (this.freeTicket == 2) {

            this.freeTicket -= 2;

            System.out.println("You got 2 Cinema tickets");

        } else {
            System.out.println("You alreaday got the free tickets");
        }
         System.out.println(toString());
    }

    @Override
    public String toString() {
        String str = super.toString() + "[free ticket :" + this.freeTicket + "]";
        return str;
    }
}
