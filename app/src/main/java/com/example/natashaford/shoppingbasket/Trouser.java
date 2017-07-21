package com.example.natashaford.shoppingbasket;

/**
 * Created by natashaford on 21/07/2017.
 */

public class Trouser implements Product {

    int id;
    int cost;

    public Trouser(int id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
