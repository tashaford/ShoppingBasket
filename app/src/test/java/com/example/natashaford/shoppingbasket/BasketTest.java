package com.example.natashaford.shoppingbasket;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BasketTest {
    private Customer cust1;
    private Customer cust2;
    private Basket basket1;
    private Basket basket2;
    private Product top;
    private Product top2;

    private Product trouser;


    @Before
    public void setUp() throws Exception {
        cust1 = new Customer("Natasha", false);
        cust2 = new Customer("Euan", true);
        basket1 = new Basket(cust1);
        basket2 = new Basket(cust2);
        top = new Top("topOne", 5);
        top2 = new Top("topTwo", 6);
        trouser = new Trouser("trouserOne", 20);
    }

    @Test
    public void checkBasketSize() throws Exception {
        assertEquals(0, basket1.basketSize());
    }

    @Test
    public void checkAddToBasket() throws Exception {
        basket1.addToBasket(top);
        assertEquals(1, basket1.basketSize());
    }

    @Test
    public void checkRemoveFromBasket() throws Exception {
        basket1.addToBasket(top);
        basket1.addToBasket(trouser);
        basket1.removeFromBasket(trouser);
        assertEquals(1, basket1.basketSize());
    }

    @Test
    public void checkEmptyBasket() throws Exception {
        basket1.addToBasket(top);
        basket1.addToBasket(trouser);
        basket1.emptyBasket();
        assertEquals(0, basket1.basketSize());
    }

    @Test
    public void getBasketTotal() throws Exception {
        basket1.addToBasket(top);
        assertEquals(5, basket1.getBasketTotal(), 0.01);
    }

    @Test
    public void checkBogof() throws Exception {
        basket1.addToBasket(top);
        basket1.addToBasket(top);
        basket1.addToBasket(top);
        basket1.addToBasket(top);
        assertEquals(10, basket1.getBasketTotal(), 0.01);
    }


    @Test
    public void checkDealDiscount() throws Exception {
        basket1.addToBasket(top);
        basket1.addToBasket(trouser);
        assertEquals(22.50, basket1.getBasketTotal(), 0.01);
    }

    @Test
    public void checkLoyaltyDiscount() throws Exception {
        basket2.addToBasket(top);
        basket2.addToBasket(trouser);
        assertEquals(22.05, basket2.getBasketTotal(), 0.01);
    }

    @Test
    public void checkEverything() throws Exception {
        basket2.addToBasket(top);
        basket2.addToBasket(top);
        basket2.addToBasket(trouser);
        basket2.addToBasket(trouser);
        assertEquals(39.69, basket2.getBasketTotal(), 0.01);
    }

    @Test
    public void checkLargerCosts() throws Exception {
        basket1.addToBasket(top);
        basket1.addToBasket(top2);
        assertEquals(6, basket1.getBasketTotal(), 0.01);
    }
}