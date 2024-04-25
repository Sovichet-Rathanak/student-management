package com.example.ipeproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static javafx.application.Application.launch;

public class loginController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button button_logout;

    @FXML
    private Label label_welcome;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        button_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DB.changeScene(event, "login.fxml", "Log in!", null);
            }
        });

    }

    public void setUserInformation(String username) {
        label_welcome.setText(username);
    }

}