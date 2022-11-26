package com.example.i200444_i200518_project.Controllers;

import javafx.application.Application;
import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Dialog;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AddTeam{
    @FXML
    private TextField teamname;
    @FXML
    private TextField sport;
    @FXML
    private ListView<String> member_list;

    ArrayList<String> a = new ArrayList<>();

    @FXML
    void initialize() {
        populateData();
        for (String item : a) {
            member_list.getItems().add(item);
        }
        handleclicks();
    }

    private void handleclicks() {
        member_list.setOnMouseClicked(mouseEvent -> {
            String selectedMember = member_list.getSelectionModel().getSelectedItem().toString();
            Dialog d = new Alert(Alert.AlertType.INFORMATION, selectedMember);
            d.show();
        });
    }

    private void populateData(){
        a.add("Babar Azam");
        a.add("Shaheen Shah");
        a.add("Usman Qadir");
        a.add("Muhammad Rizwan");
        a.add("Haris Rauf");
        a.add("Shadab Khan");
        a.add("Naseem Shah");
        a.add("Yasir Shah");
        a.add("Sarfaraz Ahmed");
        a.add("David Warner");
        a.add("Alex Hales");
        a.add("Dale Steyn");
        a.add("Umar Gul");
        a.add("Wasim Akram");
        a.add("Waqar Younis");
        a.add("Brian Lara");
        a.add("Curtley Ambrose");
        a.add("Chris Gayle");
        a.add("Shahnawaz Dahani");
        a.add("Joe Root");
        a.add("Aaron Finch");


    }

    public void execButton(ActionEvent actionEvent) {

    }


}
