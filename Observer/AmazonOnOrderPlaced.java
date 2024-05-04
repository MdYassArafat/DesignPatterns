package org.example.dp.behavioural.service;

import org.example.dp.behavioural.interfaces.OrderOnPlaced;
import org.example.dp.behavioural.interfaces.impl.InventoryProcessor;
import org.example.dp.behavioural.interfaces.impl.InvoiceCalculator;

import java.util.ArrayList;
import java.util.List;

public class AmazonOnOrderPlaced {

    // It's a parent class which will generate an event - Publisher

    static List<OrderOnPlaced> subscribers = new ArrayList<>();

    // add the subscribers to this event

    public static void addOrderPlacedSubscribers(OrderOnPlaced orderOnPlaced){
        subscribers.add(orderOnPlaced);
    }

    // remove the subscribers to this event

    public void removeOrderPlacedSubscribers(OrderOnPlaced orderOnPlaced){
        subscribers.remove(orderOnPlaced);
    }

    // execute the events

    public void executeOrderPlacedSubscribers(){

        for(OrderOnPlaced orderOnPlaced : subscribers){
            orderOnPlaced.OrderOnPlaced();
        }
    }

}
