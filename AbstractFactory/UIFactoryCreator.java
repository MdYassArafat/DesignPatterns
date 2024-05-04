package org.example.dp.creational.abstractFactory;

public class UIFactoryCreator {

    public static UIFactory getUIFactory(String platform){

        if(platform.equalsIgnoreCase("ANDROID")){
            return new AndroidUIFactory();
        }
        else if(platform.equalsIgnoreCase("IOS")){
            return new IOSUIFactory();
        }
        return null;
    }

}
