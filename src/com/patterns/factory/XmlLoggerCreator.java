package com.patterns.factory;

/**
 * Created by alexg on 12.06.2015.
 */
public class XmlLoggerCreator extends AbstractLoggerCreator {
    @Override
    public Logger createLogger() {
        XmlLogger logger = new XmlLogger();
        return logger;
    }
}
