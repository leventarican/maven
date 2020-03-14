package com.github.leventarican;

import java.io.File;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        App app = new App();
        
        app.createSchemaObject();
        app.createData();
        app.serialize();
        app.deserialize();

        assertTrue(true);
    }
}
