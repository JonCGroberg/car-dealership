package org.dealership;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        DealershipFileManager controller = new DealershipFileManager();

        Dealership dealer = controller.getDealership();

        System.out.println(dealer);
    }
}