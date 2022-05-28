package com.iam2kabhishek.cakebake;

import java.util.HashMap;

public class Cake {

    private final double priceSmall = 450.00;
    private final double priceMedium = 650.00;
    private final double priceBig = 800.00;

    private HashMap<String, Double> prices;

    private String size;
    private int quantity;
    private String name;
    private String[] toppings;

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

    public double getTotalPrice() {
        return (prices.get(size) * quantity + (toppings.length * 10));
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nCake Order Details:\n");
        sb.append("\n-------------------------------------------");
        sb.append("\nName: " + name);
        sb.append("\nQuantity: " + quantity);
        sb.append("\nSize : " + size);
        sb.append("\nToppings :");
        sb.append(String.join(", ", toppings));
        sb.append("\n-------------------------------------------");
        sb.append("\nTotal Price: RM" + getTotalPrice());
        sb.append("\n-------------------------------------------");
        return sb.toString();
    }
}
