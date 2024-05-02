module org.example.submissionpage {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.submissionpage to javafx.fxml;
    exports org.example.submissionpage;
}