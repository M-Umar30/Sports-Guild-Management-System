package com.example.i200444_i200518_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class AddEquipment {
    @FXML
    private AnchorPane view_pane;
    @FXML
    private TextField equip_name;

    @FXML
    private TextField quantity;

    @FXML
    private Button submit_btn;

    @FXML
    void execButton(ActionEvent event) {

    }

    public void goToRemove(MouseEvent mouseEvent) {
        try {
            AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("remove-equipment.fxml")));
            view_pane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
