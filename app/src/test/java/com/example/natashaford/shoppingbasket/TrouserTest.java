package com.example.natashaford.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by natashaford on 21/07/2017.
 */

public class TrouserTest {
    Trouser trouser;

    @Before
    public void setUp() throws Exception {
        trouser = new Trouser(2, 31);
    }

    @Test
    public void checkGetId() throws Exception {
        assertEquals(2, trouser.getId());
    }

    @Test
    public void checkGetCost() throws Exception {
        assertEquals(31, trouser.getCost());
    }
}
