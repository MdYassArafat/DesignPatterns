package org.example.dp.behavioural.service;

import org.example.dp.behavioural.interfaces.OrderOnPlaced;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    // It's a parent class which will generate an event - Publisher

    private static Amazon instance = null;
    private List<OrderOnPlaced> subscribers = new ArrayList<>();

    private Amazon(){
    }

    // get Instance of Amazon
    public static Amazon getInstance() {
        if (instance == null) {
            instance = new Amazon();
        }
        return instance;
    }


    // add the subscribers to this event
    public void addOrderPlacedSubscribers(OrderOnPlaced orderOnPlaced){
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
