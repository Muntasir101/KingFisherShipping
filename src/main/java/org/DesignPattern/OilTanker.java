package org.DesignPattern;

public class OilTanker extends Ship{
    private double oilQuality;

    // constructor
    public OilTanker(String name, double capacityMT) {
        super(name, capacityMT);
    }

    public double getOilQuality(){
        return oilQuality;
    }

    @Override
    public void sail(){
        System.out.println("Oil Tanker is Sailing.....");
    }

}
