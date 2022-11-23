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

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField username;
    @FXML
    private TextField pass;
    @FXML
    private TextField email;
    @FXML
    private TextField rollnum;

    @FXML
    private Label haveaccount;

    @FXML
    private Button submit_btn;

    @FXML
    private void execButton() {
        System.out.println("Username: " + username.getText());
        System.out.println("Password: " + pass.getText());
        System.out.println("Email: " + email.getText());
        System.out.println("Roll Number: " + rollnum.getText());
    }

    public void switchtoLogin(MouseEvent mouseEvent) {
        try {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
            stage = (Stage) haveaccount.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}