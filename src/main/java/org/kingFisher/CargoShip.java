package org.kingFisher;

public class CargoShip extends KingShip {

    // Constructor
    public CargoShip(String name, double capacityMT){
        super(name, capacityMT);
    }
    public void displayInfo(){
        System.out.println("Cargo SHip Name: "+ name);
        System.out.println("Cargo SHip Capacity: "+ capacityMT);
    }

    public static void main(String[] args) {
        CargoShip cs = new CargoShip("CargoShip1",5000);
        cs.displayInfo();
    }
}
