package org.example.dp.behavioural.strategy;

public class GoogleMap {

    private static GoogleMap instance = null;

    private TransportModeStrategy transportModeStrategy;

    private GoogleMap(){
    }

    public static GoogleMap getInstance(){
        if(instance == null){
            instance = new GoogleMap();
        }
        return instance;
    }


    // 1. getRoute - Source , Destination, Transport Mode
    public void getRouteByMode(String source, String dest, String TransportMode){

        transportModeStrategy = TransportModeCalculator.getPathCalculator(TransportMode);
        transportModeStrategy.getTransportModeRoute(source, dest);
    }


}
