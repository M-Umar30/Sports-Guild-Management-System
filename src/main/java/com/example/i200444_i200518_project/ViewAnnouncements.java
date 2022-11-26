package com.example.i200444_i200518_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class ViewAnnouncements {

    @FXML
    private AnchorPane view_pane;
    @FXML
    private Button add_announcement;

    @FXML
    private ListView<String> content_list;

    @FXML
    private ListView<String> title_list;

    String[] titles = {"Announcement 1", "Announcement 2", "Announcement 3"};
    String[] contents = {"This is the first announcementLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", "This is the second announcement", "This is the third announcement"};

    @FXML
    void initialize() {
        for (int i = 0; i < titles.length; i++) {
            title_list.getItems().add(titles[i]);
            content_list.getItems().add(contents[i]);
            ;
            //make content_list wrap text

        }
    }

    public void gotoAdd(ActionEvent actionEvent) {
        try {
            AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("add-announcement.fxml")));
            view_pane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}