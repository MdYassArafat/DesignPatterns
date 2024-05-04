package org.example.dp.behavioural.interfaces.impl;

import org.example.dp.behavioural.interfaces.OrderOnPlaced;
import org.example.dp.behavioural.service.Amazon;

public class InventoryProcessor implements OrderOnPlaced {

    public InventoryProcessor(){
        Amazon amazon = Amazon.getInstance();
        amazon.addOrderPlacedSubscribers(this);
    }
    @Override
    public void OrderOnPlaced() {
        System.out.println("Im in Inventory Processor class");
    }
}
