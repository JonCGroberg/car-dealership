package org.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public List<Vehicle> getVehiclesByPrice(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {

        return null;
    }

    public List<Vehicle> getVehiclesByYear(String min, String max) {

        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;

    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;

    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {

        return null;
    }

    public List<Vehicle> getAllVehicles() {
        return null;

    }

    public void addVehicle() {

    }

    public void removeVehicle() {

    }

}
