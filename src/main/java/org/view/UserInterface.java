package org.view;

import org.controller.DealershipFileManager;
import org.models.Dealership;

import java.io.FileNotFoundException;

public class UserInterface {
    Dealership dealership;
    DealershipFileManager controller;

    public UserInterface() {

    }

    private void init() throws FileNotFoundException {
        controller = new DealershipFileManager();
        dealership = controller.getDealership();
    }

    public void display() throws FileNotFoundException {
        init();
        showMenu();
    }

    public void showMenu() {
        String menu = "Dealership Menu" +
                "\n---------------" +
                "\n\t1 - Find vehicles within a price range" +
                "\n\t2 - Find vehicles by make / model" +
                "\n\t3 - Find vehicles by year range" +
                "\n\t4 - Find vehicles by color" +
                "\n\t5 - Find vehicles by mileage range" +
                "\n\t6 - Find vehicles by  type (car, truck, SUV, van" +
                "\n\t7 - Find ALL vehicles" +
                "\n\t8 - Add a vehicle" +
                "\n\t9 - Remove a vehicle" +
                "\n99 - Quit";

        System.out.print(menu);
    }

    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {
    }

    public void processGetByMileageRequest() {
    }

    public void processGetByVehicleTypeRequest() {
    }

    public void processGetAllVehicleRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }
}
