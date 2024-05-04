package org.example.dp.creational.abstractFactory;

public class Flutter {

    private static Flutter flutter = null;


    private Flutter(){
    }

    public static Flutter getInstance(){
        if(flutter==null){
            flutter = new Flutter();
        }
        return flutter;
    }

    public UIFactory createUIFactory(String platform){

       return UIFactoryCreator.getUIFactory(platform);
    }

}
