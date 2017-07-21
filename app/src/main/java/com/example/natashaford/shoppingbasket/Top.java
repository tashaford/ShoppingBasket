package com.example.natashaford.shoppingbasket;

/**
 * Created by natashaford on 21/07/2017.
 */

public class Top implements Product {

    final int id;
    final int cost;

    public Top(int id, int cost) {
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
