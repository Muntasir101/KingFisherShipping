package org.DesignPattern;
import org.DesignPattern.Ship;

public class OilTanker extends Ship{
    private double oilQuality;

    // constructor
    public OilTanker(String name, double capacityMT) {
        super(name, capacityMT);
    }

    public double getOilQuality(){
        return oilQuality;
    }

}
