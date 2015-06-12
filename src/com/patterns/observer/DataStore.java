package com.patterns.observer;

import java.util.Observable;

/**
 * Created by alexg on 12.06.2015.
 */
public class DataStore extends Observable{

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        // mark the observable as changed
        setChanged();
    }
}
