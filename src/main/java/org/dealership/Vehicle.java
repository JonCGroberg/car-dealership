package org.dealership;

public class Vehicle {

    private int vin;
    private int year;
    int odometer;
    double price;
    private  String color;
    private  String make;
    private  String model;
    private  String vehicleType;

    public Vehicle(int vin, int year, int odometer, double price, String color, String make, String model, String vehicleType) {
        this.vin = vin;
        this.year = year;
        this.odometer = odometer;
        this.price = price;
        this.color = color;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
    }


}

