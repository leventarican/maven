package com.github.leventarican.mod;

import org.apache.log4j.Logger;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Levent
 */
public class ModLoggerTest {

    @Test
    public void testLog() {
        System.out.println("log");
        ModLogger instance = new ModLogger();
        String expResult = "just a sample log.";
        String result = instance.log();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogger method, of class ModLogger.
     */
    @Test
    public void testGetLogger() {
        System.out.println("getLogger");
        // fail
//        Expected: an instance of java.util.logging.Logger
//             but: <org.apache.log4j.Logger@12aa33bb> is a org.apache.log4j.Logger
//        assertThat(cut.getLogger(), IsInstanceOf.instanceOf(java.util.logging.Logger.class));
        // success
        assertThat(ModLogger.getLogger(), IsInstanceOf.instanceOf(org.apache.log4j.Logger.class));
    }
    
}
