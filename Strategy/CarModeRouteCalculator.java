package org.example.dp.behavioural.strategy;

public class CarModeRouteCalculator implements TransportModeStrategy{
    @Override
    public void getTransportModeRoute(String Source, String Destination) {
        System.out.println("This is a Car Mode Route!!");
    }
}
