package com.github.leventarican;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Apache Log4J 2 demo - https://logging.apache.org/log4j/2.x/manual/configuration.html.
 * 
 * @author Levent
 */
public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);
    
    public static void main( String[] args ) {
        LOGGER.error("Apache Log4J 2");
        LOGGER.error("Log4J 2 is using default configuration if no configuration file is defined.");
    }
}
