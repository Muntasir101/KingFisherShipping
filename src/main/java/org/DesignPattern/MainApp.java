package org.DesignPattern;
import org.DesignPattern.Ship;
import org.DesignPattern.ShipService;
import org.DesignPattern.ShipFactory;

public class MainApp {
    public static void main(String[] args) {
        ShipService service = new ShipService();

        // Create ship using factory
        Ship oilShip = ShipFactory.createShip("oil","OceanTitan_OIL",1000);
        Ship cargoShip = ShipFactory.createShip("cargo","OceanRock_CARGO",1000);
        Ship normalShip = ShipFactory.createShip("ship","Octopus_Ship",1000);

        oilShip.sail();
        cargoShip.sail();
        normalShip.sail();

        service.printShipStatus(oilShip);

        // Operations for Ship1
        service.loadShip(oilShip,500);
        service.checkOverLoad(oilShip);
        service.unloadShip(oilShip, 400);

        service.printTotalShipCount();

    }
}
