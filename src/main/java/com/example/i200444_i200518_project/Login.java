package com.example.i200444_i200518_project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private PasswordField pass;
    @FXML
    private TextField username;

    @FXML
    private Button submit_btn;

    @FXML
    private void execButton() {
        User user = new User(username.getText(), pass.getText());
        user.initiateLogin();
    }

}
