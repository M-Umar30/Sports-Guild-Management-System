package com.example.i200444_i200518_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EcDashboard {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private AnchorPane view_pane;
    @FXML
    private Button anouncement_btn;

    @FXML
    private Button logout;

    @FXML
    private Button meeting_btn;

    @FXML
    private Button profile_btn;

    @FXML
    private Label side_name;

    @FXML
    private Label user_desc;

    @FXML
    private Label user_name;

    @FXML
    private Label user_phone;

    @FXML
    private Label user_rollnum;

    @FXML
    void Logout(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
            stage = (Stage) logout.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void gotoAnnouncement(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view-announcements.fxml")));
            view_pane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void gotoMeeting(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("add-meeting.fxml")));
            view_pane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void gotoProfile(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("profile.fxml")));
            view_pane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void goToEvents(ActionEvent actionEvent) {
        try {
            AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("add-event.fxml")));
            view_pane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
