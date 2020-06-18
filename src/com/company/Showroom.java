package com.company;
import java.util.*;

public class Showroom {
    private String name;
    private List<Vehicle> list = new ArrayList<>();

    public Showroom(String name) {
        this.name = name;
    }

    public void addVehicle(String marca, String model, float price) {
        Vehicle temp = new Vehicle(marca, model, price);
        list.add(temp);
    }

    public void sellVehicle(int index) {
        if(index >= this.list.size()) {
            System.out.println("we couldn't find that vehicle in our showroom.\n");
        }
        else {
            list.remove(list.get(index));
            System.out.printf("we sold a vehicle. ID(%d)\n", index);
        }
    }

    public void update(int percentage) {
        for(Vehicle elem : this.list) {
            elem.setPrice((float)(elem.getPrice() + elem.getPrice() * (percentage / 100.0)));
        }
    }
    
    public void printStock() {
        if(list.size() == 0) {
            System.out.println("There are no vehicles in the showroom.");
            return;
        }
        int i=0;
        for(Vehicle elem : list) {
            System.out.printf("ID:%d, " + elem.getMarca() + ' ' + elem.getModel() + " $%f\n", i, elem.getPrice());
            i+=1;
        }
    }

    public int getSize() {
        return this.list.size();
    }
}
