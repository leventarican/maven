package com.github.leventarican.mod;

import org.apache.log4j.Logger;

public class App {
    public static final String id = "mod-utils";
    
    public static void main( String[] args ) {
        System.out.println(id + "implementation");
        ModLogger logger = new ModLogger();
        logger.log();
    }
    
    public String ping() {
        return id + "pong";
    }
}
