package org.DesignPattern;

public class CargoShip extends Ship {

    private int numberOfContainers;

    // constructor
    public CargoShip(String name, double capacityMT) {
        super(name, capacityMT);
    }

    public int getNumberOfContainers(){
        return numberOfContainers;
    }

}
