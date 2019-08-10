package com.github.leventarican.mod;

import static org.junit.Assert.assertTrue;
import org.junit.Before;

import org.junit.Test;

public class AppTest {
    
    private App cut;
    
    @Before
    public void init() {
        cut = new App();
    }
    
    @Test
    public void testStep0() {
        String expected = App.id + "pong";
        String actual = cut.ping();
        assertTrue(actual.equals(expected));
    }
    
}
