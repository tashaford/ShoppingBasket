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
        double discount = 0.9;
        if (total >= 20) {
            return total * discount;
        } else {
            return total;
        }
    }

    public double loyaltyDiscount(double total) {
        double discount = 0.98;
        if (customer.getLoyal()) {
            return total * discount;
        } else {
            return total;
        }
    }
}