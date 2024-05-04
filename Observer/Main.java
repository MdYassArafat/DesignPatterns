package org.example;

import org.example.dp.behavioural.interfaces.impl.InventoryProcessor;
import org.example.dp.behavioural.interfaces.impl.InvoiceCalculator;
import org.example.dp.behavioural.service.AmazonOnOrderPlaced;

public class Main {
    public static void main(String[] args) {

        AmazonOnOrderPlaced client = new AmazonOnOrderPlaced();
        InvoiceCalculator invoiceCalculator = new InvoiceCalculator();
        InventoryProcessor inventoryProcessor = new InventoryProcessor();
        client.executeOrderPlacedSubscribers();
    }
}