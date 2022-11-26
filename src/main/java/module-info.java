module com.example.i200444_i200518_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.i200444_i200518_project to javafx.fxml;
    exports com.example.i200444_i200518_project;
    exports com.example.i200444_i200518_project.Controllers;
    opens com.example.i200444_i200518_project.Controllers to javafx.fxml;
}