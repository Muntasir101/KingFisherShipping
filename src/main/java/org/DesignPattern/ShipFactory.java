package org.DesignPattern;

import org.DesignPattern.Ship;

public class ShipFactory {
    public static Ship createShip(String name, double capacityMT){
        return new Ship(name, capacityMT);
    }
}

