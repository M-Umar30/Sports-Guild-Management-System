package com.example.i200444_i200518_project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
        User user1 = user.initiateLogin();
        if (user1 == null){
            Alert a = new Alert(Alert.AlertType.ERROR, "Invalid Credentials");
            a.show();
        }
        else {
            try {
                root = FXMLLoader.load(getClass().getResource(user1.getType() + "-dashboard.fxml"));
                stage = (Stage) submit_btn.getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
               }
        }
    }

}
