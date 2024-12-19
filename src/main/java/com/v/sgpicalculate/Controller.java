package com.v.sgpicalculate;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private RadioButton sem1;
    @FXML
    private RadioButton sem2;

    public void switchScene(ActionEvent event) throws IOException {
        if(sem1.isSelected()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
            root = loader.load();
//            Image image = new Image("bgm.png")
//            BackgroundImage image = new BackgroundImage(new Image("bgm.png"));

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
            else if(sem2.isSelected()){
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
                root = loader.load();
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

        }
    }

}
