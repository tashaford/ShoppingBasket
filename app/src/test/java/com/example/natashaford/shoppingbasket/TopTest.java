package com.example.natashaford.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by natashaford on 21/07/2017.
 */

public class TopTest {

    Top top;

    @Before
    public void setUp() throws Exception {
        top = new Top(1, 15);
    }

    @Test
    public void checkGetId() throws Exception {
        assertEquals(1, top.getId());
    }

    @Test
    public void checkGetCost() throws Exception {
        assertEquals(15, top.getCost());
    }
}
