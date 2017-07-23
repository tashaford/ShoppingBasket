package com.example.natashaford.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrouserTest {

    private Trouser trouser;

    @Before
    public void setUp() throws Exception {
        trouser = new Trouser("trouserOne", 31);
    }

    @Test
    public void checkGetName() throws Exception {
        assertEquals("trouserOne", trouser.getName());
    }

    @Test
    public void checkGetCost() throws Exception {
        assertEquals(31, trouser.getCost(), 0.01);
    }
}
