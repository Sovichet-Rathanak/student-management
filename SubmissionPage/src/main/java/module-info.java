module com.example.submissionpage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.submissionpage to javafx.fxml;
    exports com.example.submissionpage;
}