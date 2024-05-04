package org.example;

import org.example.dp.behavioural.interfaces.impl.InventoryProcessor;
import org.example.dp.behavioural.interfaces.impl.InvoiceCalculator;
import org.example.dp.behavioural.service.Amazon;

public class Main {
    public static void main(String[] args) {

        Amazon client = Amazon.getInstance();
        InvoiceCalculator invoiceCalculator = new InvoiceCalculator();
        InventoryProcessor inventoryProcessor = new InventoryProcessor();
        client.executeOrderPlacedSubscribers();
    }
}