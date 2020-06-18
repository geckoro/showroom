package com.company;

public class Boat extends Vehicle {
    private int weight;
    Boat(String marca, String model, int price, int weight) {
        super(marca,model, price);
        this.weight = weight;
    }
}
