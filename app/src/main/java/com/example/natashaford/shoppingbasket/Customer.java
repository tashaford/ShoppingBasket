package com.example.natashaford.shoppingbasket;

public class Customer {

    String name;
    Boolean loyal;

    public Customer(String name, Boolean loyal) {
        this.name = name;
        this.loyal = loyal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getLoyal() {
        return loyal;
    }

    public void setLoyal(Boolean loyal) {
        this.loyal = loyal;
    }
}
