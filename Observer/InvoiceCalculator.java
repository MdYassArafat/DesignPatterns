package org.example.dp.behavioural.interfaces.impl;

import org.example.dp.behavioural.interfaces.OrderOnPlaced;
import org.example.dp.behavioural.service.Amazon;

public class InvoiceCalculator implements OrderOnPlaced {

    public InvoiceCalculator(){
        Amazon amazon = Amazon.getInstance();
        amazon.addOrderPlacedSubscribers(this);
    }

    @Override
    public void OrderOnPlaced() {
        System.out.println("Im in Invoice Calculator class");
    }
}
