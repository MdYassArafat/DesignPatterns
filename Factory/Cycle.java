package org.example.dp.creational.factory;

public class Cycle implements Vehicle{

    @Override
    public void build() {
        System.out.println("I am a Cycle");
    }
}
