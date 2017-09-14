package com.example.natashaford.shoppingbasket;

import java.util.ArrayList;
import java.util.Collections;


public class Basket {

    Customer customer;
    ArrayList<Product> products;

    public Basket(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<Product>();
    }

    public int basketSize() {
        return this.products.size();
    }

    public void addToBasket(Product product) {
        products.add(product);
    }

    public void removeFromBasket(Product product) {
        products.remove(product);
    }

    public void emptyBasket() {
        products.clear();
    }

    public double getBasketTotal() {
        double total = 0;
        for (Product item : products) {
            total = total + item.getCost();
        }
        total = total - checkBogof();
        total = dealDiscount(total);
        total = loyaltyDiscount(total);
        return total;
    }

    public double checkBogof() {
        double discount = 0;
        int number = 0;
        ArrayList<Double> discounts = new ArrayList<Double>();
        for (Product item : products) {
            if (item instanceof Top) {
                discounts.add(item.getCost());
                number++;
            }
        }
        if (number >= 2) {
            number = number / 2;
            Collections.sort(discounts);
            Collections.reverse(discounts);
            while (number != 0) {
                for (int i = 0; i < discounts.size(); i++) {
                    discounts.remove(i);
                    number --;
                }
            }
            for (double price : discounts) {
                discount += price;
            }
        }
        return discount;
    }


    public double dealDiscount(double total) {
        // Deal discount set here, currently 10%
        double discount = 0.1;
        // IF the basket total > £20 THEN
        if (total >= 20) {
            // The current basket has the discount removed and the new total is returned.
            return total - (total * discount);
            // ELSE
        } else {
            // The original total is returned.
            return total;
        } // END
    }

    public double loyaltyDiscount(double total) {
        // Loyalty discount set here, currently 2%
        double discount = 0.02;
        // IF the basket total > £20 THEN
        if (customer.getLoyal()) {
            // The current basket has the discount removed and the new total is returned.
            return total - (total * discount);
            // ELSE
        } else {
            // The original total is returned.
            return total;
        } // END
    }
}