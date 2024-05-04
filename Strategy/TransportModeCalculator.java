package org.example.dp.behavioural.strategy;

public class TransportModeCalculator {

    public static TransportModeStrategy getPathCalculator(String TransportMode){

        TransportModeStrategy transportModeStrategy = null;

        if(TransportMode.equalsIgnoreCase("CAR")){
            transportModeStrategy = new CarModeRouteCalculator();
        }
        else if(TransportMode.equalsIgnoreCase("BIKE")){
            transportModeStrategy = new BikeModeRouteCalculator();
        }
        return transportModeStrategy;
    }

}
