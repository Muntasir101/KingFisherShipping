package org.DesignPattern;
import org.DesignPattern.Ship;
import org.DesignPattern.ShipService;
import org.DesignPattern.ShipFactory;

public class MainApp {
    public static void main(String[] args) {
        ShipService service = new ShipService();

        // Create ship using factory
        Ship ship1 = ShipFactory.createShip("OceanTitan",1000);

        service.printShipStatus(ship1);

        // Operations for Ship1
        service.loadShip(ship1,1500);
        service.checkOverLoad(ship1);
        service.unloadShip(ship1, 400);

    }
}
