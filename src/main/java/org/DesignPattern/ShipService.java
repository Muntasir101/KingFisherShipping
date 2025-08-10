package org.DesignPattern;
import org.DesignPattern.Ship;


public class ShipService {
    public void loadShip(Ship name, double tons){
        if(!name.loadOil(tons)){
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

    public void checkOverLoad(Ship ship){
        if(ship.isOverLoaded()){
            System.out.println("Ship is OverLoaded !!!!");
        }
    }

    public void printShipStatus(Ship ship){
        System.out.println("Ship Name: " + ship.getName());
    }

    public void printTotalShipCount(){
        System.out.println("Total Ship Created: "+Ship.getTotalShips());
    }

}
