package com.example.submissionpage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Image icon = new Image("file:src/ITC.png");
        stage.setHeight(800);
        stage.setWidth(1440);

        stage.getIcons().add(icon);
        stage.setTitle("LOLEI");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}

