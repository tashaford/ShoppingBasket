package com.example.natashaford.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by natashaford on 21/07/2017.
 */

public class CustomerTest {

    Customer cust;

    @Before
    public void setup(){
        cust = new Customer ("Natasha");
    }

    @Test
    public void checkGetName() throws Exception {
        assertEquals("Natasha", cust.getName());
    }

    @Test
    public void checkSetName() throws Exception {
        cust.setName("Tasha");
        assertEquals("Tasha", cust.getName());
    }

}
