package com.company;

public class Car extends Vehicle {
    private int nrSeats;
    private int nrDoors;
    public Car(String marca, String model, int price, int nrDoors, int nrSeats) {
        super(marca, model, price);
        this.nrSeats = nrSeats;
        this.nrDoors = nrDoors;
    }
}
