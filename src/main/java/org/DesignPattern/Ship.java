package org.DesignPattern;

public class Ship {
    private final String name;
    private final double capacityMT;
    private double receivedFrom;
    private double currentLoadMT;
    private String destination;

    private static int totalShips = 0;
    private static final String SAFETY_STANDARD = "IMO 2020";

    // constructor
    public Ship(String name, double capacityMT)
    {
        this.name = name;
        this.capacityMT = capacityMT;
        this.currentLoadMT = 0.0;
        totalShips++;
    }

    // core business Login/rules
    public boolean loadOil(double tons){
        if (tons<=0) return false;
        if (currentLoadMT + tons > capacityMT) return false;
        currentLoadMT +=tons;
        return true;
    }

    public boolean unload(double tons){
        if (tons<=0) return false;
        if (tons > currentLoadMT) return false;
        currentLoadMT -=tons;
        return true;
    }

    public boolean isOverLoaded(){
        return currentLoadMT > capacityMT;
    }

    public String getName(){
        return name;
    }

    public static int getTotalShips(){
        return totalShips;
    }
}
