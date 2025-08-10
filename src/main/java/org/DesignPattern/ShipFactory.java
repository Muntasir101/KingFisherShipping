package org.DesignPattern;

import org.DesignPattern.Ship;

public class ShipFactory {
    public static Ship createShip(String shipType,String name, double capacityMT){
        switch(shipType.toLowerCase()){
            case "oil":
                return new OilTanker(name, capacityMT);

            case "cargo":
                return new CargoShip(name, capacityMT);

            default:
                return new Ship(name, capacityMT);
        }
    }
}

