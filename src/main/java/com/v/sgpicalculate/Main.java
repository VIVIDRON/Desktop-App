package com.v.sgpicalculate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root , Color.BLACK);
//      Image icon  = new Image("E:\\Coding files\\Projects\\Sgpi\\icon.png");
//      Stage.getIcons().add(icon); // not working don't know why
//        Image image1 = new Image("icon.png");
//        stage.getIcons().add(image1);

        stage.setTitle("Sgpi calculator");
        stage.setScene(scene);

        stage.show();
    }
}