module com.example.cafeteria {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.swing;
    requires javafx.media;


    opens com.example.cafeteria to javafx.fxml;
    exports com.example.cafeteria;
}