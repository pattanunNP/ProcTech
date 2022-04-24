/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab12q2s6434459223;

/**
 *
 * @author arm
 */

import java.util.ArrayList;


public class BusTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Bus> arr = new ArrayList<>();

        arr.add(new Hybrid(45, 1200000, 600, 150, 1));
        arr.add(new CNGBus(50, 1000000, 200, 2));

        arr.forEach((Bus bus) -> {
            System.out.println("ID: " + bus.getID());
            if (bus instanceof CNGBus cngbus) {
                System.out.println("Emission Tier: " + cngbus.getEmissionTier());
            } else if (bus instanceof Hybrid hybrid){
                System.out.println("Emission Tier: " + hybrid.getEmissionTier());
            }
            System.out.println("Accel: " + bus.getAccel());
        });
    }
    
}
