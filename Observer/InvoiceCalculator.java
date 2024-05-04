package org.example.dp.behavioural.interfaces.impl;

import org.example.dp.behavioural.interfaces.OrderOnPlaced;
import org.example.dp.behavioural.service.AmazonOnOrderPlaced;

public class InvoiceCalculator implements OrderOnPlaced {

    public InvoiceCalculator(){
        AmazonOnOrderPlaced.addOrderPlacedSubscribers(this);
    }


    @Override
    public void OrderOnPlaced() {

        System.out.println("Im in Invoice Calculator class");
    }
}
