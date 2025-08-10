package org.DesignPattern;
import org.DesignPattern.Ship;
import org.DesignPattern.ShipService;
import org.DesignPattern.ShipFactory;

public class MainApp {
    public static void main(String[] args) {
        ShipService service = new ShipService();

        // Create ship using factory
        Ship shipObject1 = ShipFactory.createShip("oil","OceanTitan_OIL",1000);
        Ship shipObject2 = ShipFactory.createShip("cargo","OceanRock_CARGO",1000);
        Ship shipObject3 = ShipFactory.createShip("ship","Octopas_Ship",1000);

        service.printShipStatus(shipObject1);

        // Operations for Ship1
        service.loadShip(shipObject1,500);
        service.checkOverLoad(shipObject1);
        service.unloadShip(shipObject1, 400);

        service.printTotalShipCount();

    }
}
