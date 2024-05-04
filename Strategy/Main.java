package org.example;

import org.example.dp.behavioural.interfaces.impl.InventoryProcessor;
import org.example.dp.behavioural.interfaces.impl.InvoiceCalculator;
import org.example.dp.behavioural.service.Amazon;
import org.example.dp.behavioural.strategy.GoogleMap;

public class Main {
    public static void main(String[] args) {

        GoogleMap navigator = GoogleMap.getInstance();
        navigator.getRouteByMode("Chennai", "Mumbai", "BIKE");

    }
}