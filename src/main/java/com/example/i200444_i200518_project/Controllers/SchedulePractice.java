package com.example.i200444_i200518_project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SchedulePractice {

    @FXML
    private Label date;

    @FXML
    private Button date_btn;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TextField sport;
    @FXML
    private TextField time;

    @FXML
    private Button submit_btn;

    @FXML
    void execButton(ActionEvent event) {

    }

    @FXML
    void getDate(ActionEvent event) {
        date.setText(datepicker.getValue().toString() + " " + datepicker.getValue().getDayOfWeek().toString());
    }

}
