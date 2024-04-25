module com.example.ipeproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.ipeproject to javafx.fxml;
    exports com.example.ipeproject;
}