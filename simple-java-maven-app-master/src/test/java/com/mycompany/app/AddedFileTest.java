package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AddedFileTest
{
    @Test
    public void testAppConstructor() {
        AddedFile app1 = new AddedFile();
        AddedFile app2 = new AddedFile();
        assertEquals(app1.getMessage("Test"), app2.getMessage("Test"));
    }

    @Test
    public void testAppMessage()
    {
        AddedFile app = new AddedFile();
        assertEquals("Hello World!", app.getMessage("Hello World!"));
    }

     @Test
    public void testAppMessagew()
    {
        AddedFile app = new AddedFile();
        assertEquals("Hello World!", app.getMessage("Hello World!"));
    }
}
