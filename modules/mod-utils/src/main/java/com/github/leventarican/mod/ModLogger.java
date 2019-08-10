package com.github.leventarican.mod;

import org.apache.log4j.Logger;

/**
 * @author Levent
 */
public class ModLogger {
    private static final Logger LOG = Logger.getLogger(ModLogger.class);
    
    public String log() {
        String message = "just a sample log.";
        LOG.debug(message);
        return message;
    }

    public static Logger getLogger() {
        return LOG;
    }
}
