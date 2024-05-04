package org.example.dp.creational.abstractFactory;

public class Client {

    public static void main(String[] args) {

        Flutter flutter = Flutter.getInstance();
        UIFactory uiFactory = flutter.createUIFactory("ANDROID");

        Menu menu = uiFactory.createMenu();
        Button button = uiFactory.createButton();

        menu.displayMenu();
        button.displayButton();
    }
}
