package com.company;

public class Vehicle {
    private String marca;
    private String model;
    private float price;

    public Vehicle(String marca, String model, float price) {
        this.marca = marca;
        this.model = model;
        this.price = price;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModel() {
        return this.model;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }
}
