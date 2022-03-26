/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10q1s6434459223;

import java.util.ArrayList;

public class IconCineconic {

    public static void main(String[] args) {
        var c1 = new Cinema("Cinema", 250);
        var c2 = new Cinema("IMAX", 350);
        var c3 = new Cinema("4DX", 450);

        var cardAL = new ArrayList<MGenCard>();

        cardAL.add(new MGenCard("Sasipa"));
        cardAL.add(new MGenFirstClass("Monnat"));
        cardAL.add(new MGenStudent("Mike"));

        System.out.println(MGenCard.memberFee);

        System.out.println("Test Run: Sasipa buys ticket(s) at cinema");
        cardAL.get(0).buyTicket(c1, 2);
        
        System.out.println("Test run : Monnat buys ticket(s) at 4DX");
        cardAL.get(0).buyTicket(c3, 2);

        System.out.println("Test run : Monnat buys ticket(s) at IMAX");
        cardAL.get(1).buyTicket(c2, 2);

        System.out.println("Test run : Monnat buys ticket(s) at 4DX");
        cardAL.get(1).buyTicket(c3, 4);

        System.out.println("Test run : Mike buys ticket(s) at cinema");
        cardAL.get(2).buyTicket(c1, 2);

        System.out.println("Test run : Monnat gets 2 free tickets");

        if (cardAL.get(1) instanceof MGenFirstClass mGenFirstClass){
            mGenFirstClass.getFreeTicket();
        
        }
        
        System.out.println("Test run : Call usePoint() of every object in the array list");
        for (int i = 0; i < cardAL.size(); i++) {
            cardAL.get(i).usePoint();
        }
    }

}
