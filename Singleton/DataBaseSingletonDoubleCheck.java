package org.example.dp.creational.Singleton;

// Implementation of Singleton design pattern in Multi-threaded environment - Double Checking Method
public class DataBaseSingletonDoubleCheck {

    //1. create a static member to hold the instance value.

    private static DataBaseSingletonDoubleCheck dataBaseSingleton = null;

    //2. create a private constructor - so that no can call the constructor to create an object.

    private DataBaseSingletonDoubleCheck(){

    }

    //3. create a getInstance method to get the instance of an object - Multi-threaded environment

    public static DataBaseSingletonDoubleCheck getInstance(){

        if(dataBaseSingleton == null){ // T1, T2
            synchronized (DataBaseSingletonDoubleCheck.class) { // T1
                if(dataBaseSingleton == null){
                    dataBaseSingleton = new DataBaseSingletonDoubleCheck();
                }
            }
        }
        return dataBaseSingleton;
    }
}
