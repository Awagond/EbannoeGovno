package com.example.ebannoegovno;

import database.DatabaseHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Registration {

    @FXML
    private Button enter;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        enter.setOnAction(actionEvent -> {
            dbHandler.signUp(passwordTextField.getText(), usernameTextField.getText());
        });
    }
}
