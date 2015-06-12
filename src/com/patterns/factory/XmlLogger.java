package com.patterns.factory;

/**
 * Created by alexg on 12.06.2015.
 */
public class XmlLogger implements Logger{
    @Override
    public void log(String message) {
        System.err.println("logging");
    }
}
