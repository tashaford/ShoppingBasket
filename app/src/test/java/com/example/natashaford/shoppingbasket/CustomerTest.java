package com.example.natashaford.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer cust;

    @Before
    public void setup(){
        cust = new Customer ("Natasha", true);
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

    @Test
    public void checkLoyal() throws Exception {
        assertEquals(true, cust.getLoyal());
    }

    @Test
    public void checkSetLoyal() throws Exception {
        cust.setLoyal(false);
        assertEquals(false, cust.getLoyal());
    }
}
