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

    @FXML
    private void refresh() throws IOException {
        if (!isInitialized) {
            isInitialized = true;
            quantityCombo.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            quantityCombo.getSelectionModel().selectFirst();

            sizeCombo.getItems().addAll("Small", "Medium", "Large");
            sizeCombo.getSelectionModel().selectFirst();

            priceLabel.setText("RM45.00");

            cake = new Cake();
        }
    }
}
