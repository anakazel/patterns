package com.patterns.facade;

/**
 * Created by alexg on 11.06.2015.
 */
public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("read()");
        return null;
    }
}
