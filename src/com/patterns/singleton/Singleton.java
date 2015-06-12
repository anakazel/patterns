package com.patterns.singleton;

/**
 * Thread safe implementation of a singleton (no synchronized needed and will not fix the issue anyway, no double lock checking..).
 * Initialization on demand idiom. Inner classes are not loaded until referenced.
 */
public class Singleton {
    private Singleton () {}

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}

// or double checked locking using volatile variable...