package com.example.natashaford.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopTest {

    private Top top;

    @Before
    public void setUp() throws Exception {
        top = new Top("topOne",15);
    }

    @Test
    public void checkGetName() throws Exception {
        assertEquals("topOne", top.getName());
    }

    @Test
    public void checkGetCost() throws Exception {
        assertEquals(15, top.getCost(), 0.01);
    }
}
