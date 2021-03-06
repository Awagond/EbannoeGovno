package com.example.ebannoegovno;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Authentication {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button enter;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    void initialize() {
        enter.setOnAction(event -> {
            String loginText = usernameTextField.getText().trim();
            String passwordText = passwordTextField.getText().trim();

            if(!loginText.equals("") && !passwordText.equals("")){
                loginUser(loginText,passwordText);
            } else{
                System.out.println("Emoty");
            }
        });
    }

    private void loginUser(String loginText, String passwordText) {

    }
    @FXML
    void registration() throws IOException {
        App.setRoot("registration");
    }
}
