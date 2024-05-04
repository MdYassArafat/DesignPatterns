package org.example.dp.behavioural.strategy;

public class BikeModeRouteCalculator implements TransportModeStrategy{
    @Override
    public void getTransportModeRoute(String Source, String Destination) {
        System.out.println("This is a Bike Mode Route!!");
    }
}