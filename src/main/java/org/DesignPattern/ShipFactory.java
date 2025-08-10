package org.DesignPattern;


public class ShipFactory {
    public static Ship createShip(String shipType,String name, double capacityMT){
        return switch (shipType.toLowerCase()) {
            case "oil" -> new OilTanker(name, capacityMT);
            case "cargo" -> new CargoShip(name, capacityMT);
            default -> new Ship(name, capacityMT);
        };
    }
}

