package org.example.dp.creational.factory;

public class Main {

    public static void main(String[] args) {

        VehicleManufactureFactory vehicleManufactureFactory = new BikeManufactureFactory();
        Vehicle bike = vehicleManufactureFactory.buildVehicle();
        bike.build();
    }
}
