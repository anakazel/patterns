package com.patterns.factory;

/**
 * Created by alexg on 12.06.2015.
 */
public class Client {
    private void someMethodThatLogs(AbstractLoggerCreator logCreator)
    {
        Logger logger = logCreator.createLogger();
        logger.log("message");

    }

    public static void main(String[] args)
    {
        //for the purposes of this example, create an XMLLoggerCreator directly,
        //but this would normally be passed to constructor for use.
        AbstractLoggerCreator creator = new XmlLoggerCreator();

        Client client = new Client();
        client.someMethodThatLogs(creator);
    }

}
