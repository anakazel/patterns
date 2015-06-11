package com.patterns.facade;

/**
 * Created by alexg on 11.06.2015.
 */
public class Cpu {
    public void freeze() {
        System.out.println("CPU: freeze()");
    }
    public void jump(long position) {
        System.out.println("CPU: jump(" + position + ")");
    }
    public void execute() {
        System.out.println("CPU: execute()");
    }
}
