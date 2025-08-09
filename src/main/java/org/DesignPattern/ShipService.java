package org.DesignPattern;
import org.DesignPattern.Ship;


public class ShipService {
    public void loadShip(Ship ship, double tons){
        if(!ship.loadOil(tons)){
            System.out.println("Can not load.Capacity exceed.");
        }
        else{
            System.out.println("Ship Loaded Success.");
        }
    }

    public void unloadShip(Ship ship, double tons){
        if(!ship.unload(tons)){
            System.out.println("can not unload. Check current Load.");
        }
        else{
            System.out.println("Unload Successfully.");
        }
    }

    public void printShipStatus(Ship ship){
        System.out.println(ship.getName());
    }

}
