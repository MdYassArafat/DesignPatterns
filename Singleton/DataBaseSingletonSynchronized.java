package org.example.dp.creational.Singleton;

// Implementation of Singleton design pattern in Multi-threaded environment.
public class DataBaseSingletonSynchronized {

    //1. create a static member to hold the instance value.

    private static DataBaseSingletonSynchronized dataBaseSingleton = null;

    //2. create a private constructor - so that no can call the constructor to create an object.

    private DataBaseSingletonSynchronized(){

    }

    //3. create a getInstance method to get the instance of an object - Multi-threaded environment

    public static synchronized DataBaseSingletonSynchronized getInstance(){

        if(dataBaseSingleton == null){
            dataBaseSingleton = new DataBaseSingletonSynchronized();
        }
        return dataBaseSingleton;
    }
}
