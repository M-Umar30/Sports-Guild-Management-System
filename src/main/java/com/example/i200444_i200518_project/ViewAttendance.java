package com.example.i200444_i200518_project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewAttendance implements Initializable {

    @FXML
    private TableView<?> attendanceTableView;

    @FXML
    private TableColumn<?, ?> isPresentCol;

    @FXML
    private TableColumn<?, ?> practiceDate;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label progressLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        progressBar.setProgress(0.8);
    }
}