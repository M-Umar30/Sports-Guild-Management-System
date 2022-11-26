package com.example.i200444_i200518_project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class takeAttendance implements Initializable {

    @FXML
    private DatePicker datepicker;
    @FXML
    private Button date_btn;
    @FXML
    private Label date;
    @FXML
    private TableView<attendanceTable> attendance_sheet;

    @FXML
    private TableColumn<attendanceTable, String> player_name;

    @FXML
    private TableColumn<attendanceTable, String> player_roll;

    @FXML
    private TableColumn<attendanceTable, CheckBox> present_check;

    @FXML
    private CheckBox allbtn;

    @FXML
    private Button update_btn;

    ObservableList<attendanceTable> list = FXCollections.observableArrayList(
            new attendanceTable("A", "1"),
            new attendanceTable("B", "2"),
            new attendanceTable("C", "3")
    );
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        player_name.setCellValueFactory(new PropertyValueFactory<attendanceTable, String>("name"));
        player_roll.setCellValueFactory(new PropertyValueFactory<attendanceTable, String>("roll"));
        present_check.setCellValueFactory(new PropertyValueFactory<attendanceTable, CheckBox>("present"));

        attendance_sheet.setItems(list);
    }

    @FXML
    public void allPresent() {
        for (attendanceTable attendanceTable : list) {
            attendanceTable.getPresent().setSelected(true);
        }
    }
    @FXML
    public ArrayList updateAttendance(){
        ArrayList<String> rollnumbers = new ArrayList<>();
        // get all selected checkboxes
        for(attendanceTable a : attendance_sheet.getItems()){
            if(a.getPresent().isSelected()){
                rollnumbers.add(a.getRoll());
            }
        }
        return rollnumbers;
    }

    public void getDate(ActionEvent actionEvent) {
        date.setText(datepicker.getValue().toString() + " " + datepicker.getValue().getDayOfWeek().toString());
    }
}
