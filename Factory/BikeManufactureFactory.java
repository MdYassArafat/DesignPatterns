package org.example.dp.creational.factory;

public class BikeManufactureFactory implements VehicleManufactureFactory{

    @Override
    public Vehicle buildVehicle() {

        return new Bike();

    }
}
