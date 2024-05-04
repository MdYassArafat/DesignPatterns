package org.example.dp.creational.Singleton;

// Implementation of Singleton design pattern in Non Multi-threaded environment.
public class DataBaseSingleton {

    //1. create a static member to hold the instance value.

    private static DataBaseSingleton dataBaseSingleton = null;

    //2. create a private constructor - so that no can call the constructor to create an object.

    private DataBaseSingleton(){

    }

    //3. create a getInstance method to get the instance of an object - Non Multi-threaded environment

    public static DataBaseSingleton getInstance(){

        if(dataBaseSingleton == null){
            dataBaseSingleton = new DataBaseSingleton();
        }
        return dataBaseSingleton;
    }
}
