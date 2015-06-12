package com.patterns.factory;

/**
 * Created by alexg on 12.06.2015.
 */
public abstract class AbstractLoggerCreator {
    public abstract Logger createLogger();

    public Logger getLogger() {
        Logger logger = createLogger();
        return logger;
    }
}
