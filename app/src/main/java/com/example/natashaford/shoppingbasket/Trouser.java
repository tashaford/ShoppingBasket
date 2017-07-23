package com.example.natashaford.shoppingbasket;

public class Trouser implements Product {

    final double cost;
    final String name;

    public Trouser(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }
}