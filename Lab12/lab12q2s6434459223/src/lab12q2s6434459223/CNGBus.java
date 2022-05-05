/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12q2s6434459223;

/**
 *
 * @author arm
 */
public class CNGBus extends Bus implements LiquidFuel {
     
    private double range;
    private int emissionTier;

    public CNGBus(int capacity, double cost, double range, int emissionTier) {
        super(capacity, cost);
        this.range = range;
        this.emissionTier = emissionTier;
    }

    @Override
    public double getAccel() {
       return 3.0;
    }

    @Override
    public double getRange() {
        return this.range;
    }

    @Override
    public int getEmissionTier() {
        return this.emissionTier;
    }
}
