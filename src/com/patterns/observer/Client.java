package com.patterns.observer;

/**
 * Created by alexg on 12.06.2015.
 */
public class Client {
    public static void main(String[] args) {
        Screen screen = new Screen();
        DataStore dataStore = new DataStore();
        // register observer
        dataStore.addObserver(screen);
        // send a notification
        dataStore.notifyObservers();
    }
}
