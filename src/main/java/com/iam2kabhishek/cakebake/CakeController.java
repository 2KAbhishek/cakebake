package com.iam2kabhishek.cakebake;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;

public class CakeController {
    @FXML
    private javafx.scene.control.TextField nameText;

    @FXML
    private javafx.scene.control.CheckBox lavaCheck;

    @FXML
    private javafx.scene.control.CheckBox butterCheck;

    @FXML
    private javafx.scene.control.CheckBox creamCheck;

    @FXML
    private javafx.scene.control.CheckBox fondueCheck;

    @FXML
    private javafx.scene.control.ChoiceBox<Integer> quantityCombo;

    @FXML
    private javafx.scene.control.ChoiceBox<String> sizeCombo;

    @FXML
    private javafx.scene.control.Label priceLabel;

    private boolean isInitialized = false;
    private ArrayList<String> toppings = new ArrayList<>();
    private Cake cake;
    private final String ORDERS_FILE = "orders.txt";

    @FXML
    private void placeOrder() throws IOException {
        BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(ORDERS_FILE, true));
        writer.write(cake.toString());
        writer.close();
    }

    @FXML
    private void refresh() throws IOException {
        if (!isInitialized) {
            isInitialized = true;
            quantityCombo.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            quantityCombo.getSelectionModel().selectFirst();

            sizeCombo.getItems().addAll("Small", "Medium", "Large");
            sizeCombo.getSelectionModel().selectFirst();

            priceLabel.setText("₹45.00");

            cake = new Cake();
        }
        cake.setName(nameText.getText());
        cake.setQuantity(quantityCombo.getValue());
        cake.setSize(sizeCombo.getValue());
        toppings.clear();
        if (lavaCheck.isSelected()) {
            toppings.add("Lava Chocolate");
        }
        if (butterCheck.isSelected()) {
            toppings.add("Butter Cream");
        }
        if (creamCheck.isSelected()) {
            toppings.add("Cream Cheese");
        }
        if (fondueCheck.isSelected()) {
            toppings.add("Fondue");
        }
        cake.setToppings(toppings.toArray(new String[toppings.size()]));
        priceLabel.setText("₹" + cake.getTotalPrice());
    }
}
