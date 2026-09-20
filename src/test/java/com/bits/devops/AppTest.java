package com.bits.devops;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AppTest {

    @Test
    public void testMessageIsNotNull() {
        assertNotNull(App.getMessage());
    }

    @Test
    public void testAddition() {
        assertEquals(12, App.add(5, 7));
    }

    @Test
    public void testAdditionWithZero() {
        assertEquals(9, App.add(9, 0));
    }
}
