package org.example.dp.creational.factory;

public class CycleManufactureFactory implements VehicleManufactureFactory{

    @Override
    public Vehicle buildVehicle() {

        return new Cycle();

    }
}
