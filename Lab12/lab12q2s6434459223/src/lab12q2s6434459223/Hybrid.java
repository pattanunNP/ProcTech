/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12q2s6434459223;

/**
 *
 * @author arm
 */
public class Hybrid extends Bus implements LiquidFuel, Electric {
      private double voltage;
    private double range;
    private int emissionTier;

    public Hybrid(int capacity, double cost, double voltage, double range, int emissionTier) {
        super(capacity, cost);

        voltage = voltage < LOW_VOLTAGE ? LOW_VOLTAGE : voltage;
        voltage = voltage > HIGH_VOLTAGE ? HIGH_VOLTAGE : voltage;

        this.voltage = voltage;
        this.range = range;
        this.emissionTier = emissionTier;
    }

    @Override
    public double getAccel() {
        return 4.0;
    }

    @Override
    public double getRange() {
        return this.range;
    }

    @Override
    public int getEmissionTier() {
        return this.emissionTier;
    }

    @Override
    public double getVoltage() {
        return this.voltage;
    }
}
