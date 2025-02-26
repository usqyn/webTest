package org.example;

public class SingletonPattern {
    private static SingletonPattern instance;
    // make private constructor
    private SingletonPattern(){

    }

    public SingletonPattern getInstance() {
        if(instance == null){
            instance = new SingletonPattern();
        }
        return instance;
    }
}
