package com.iam2kabhishek.cakebake;

import java.util.HashMap;

public class Cake {

    private final double priceSmall = 45.00;
    private final double priceMedium = 65.00;
    private final double priceBig = 80.00;

    private HashMap<String, Double> prices;

    private String size;
    private int quantity;
    private String name;
    private String[] toppings;
    private double totalPrice;

    public Cake(String name, int quantity, String size, String[] toppings) {
        this.name = name;
        this.toppings = toppings;
        this.quantity = quantity;
        this.size = size;

        prices = new HashMap<>();
        prices.put("Small", priceSmall);
        prices.put("Medium", priceMedium);
        prices.put("Large", priceBig);
    }

    public Cake() {
        this("", 1, "Small", new String[] {});
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }
}
