module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.demo.Models to javafx.base;
    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.Controllers;
    opens com.example.demo.Controllers to javafx.fxml;
}