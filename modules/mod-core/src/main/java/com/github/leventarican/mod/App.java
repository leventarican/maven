package com.github.leventarican.mod;

import org.apache.log4j.Logger;

public class App {
    public static final String id = "mod-core";
    
    public static void main( String[] args ) {
        System.out.println(id + " implementation");
        
        Logger logger = ModLogger.getLogger();
        logger.debug("hello from " + id);
    }
    
    public String ping() {
        return id + "pong";
    }
}
