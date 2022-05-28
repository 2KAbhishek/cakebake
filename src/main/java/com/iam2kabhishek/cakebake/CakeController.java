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

}
