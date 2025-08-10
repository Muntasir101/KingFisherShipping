package org.DesignPattern;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ShipService service = new ShipService();

        // Create ship using factory
        // List
        // Ship[] ship = new Ship[3] // this array size with 3 slots
        List<Ship> ships = new ArrayList<>();

        //Ship oilShip = ShipFactory.createShip("oil","OceanTitan_OIL",1000);
        //Ship cargoShip = ShipFactory.createShip("cargo","OceanRock_CARGO",1000);
        //Ship normalShip = ShipFactory.createShip("ship","Octopus_Ship",1000);

        ships.add(ShipFactory.createShip("oil","OceanTitan_OIL",1000));
        ships.add(ShipFactory.createShip("cargo","OceanRock_CARGO",1000));
        ships.add(ShipFactory.createShip("ship","Octopus_Ship",1000));
        // Loop through ships and perform operations
        for(Ship ship : ships){
            ship.sail();
            // oilShip.sail();
            // cargoShip.sail();
            // normalShip.sail();

            //service.printShipStatus(oilShip);
            service.printShipStatus(ship);

            // Operations for Ship1
            //service.loadShip(oilShip,500);
            //service.checkOverLoad(oilShip);
            //service.unloadShip(oilShip, 400);
            service.loadShip(ship,500);
            service.checkOverLoad(ship);
            service.unloadShip(ship, 400);

        }

        service.printTotalShipCount();

    }
}
