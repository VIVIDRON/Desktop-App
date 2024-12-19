package com.v.sgpicalculate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2Controller {
    @FXML
    private TextField m2;
    @FXML
    private TextField mi;
    @FXML
    private TextField p2;
    @FXML
    private TextField pi;
    @FXML
    private TextField c2;
    @FXML
    private TextField ci;
    @FXML
    private TextField eg;
    @FXML
    private TextField egi;
    @FXML
    private TextField cp;
    @FXML
    private TextField cpi;
    @FXML
    private TextField pce;
    @FXML
    private TextField pcei;
    @FXML
    private TextField ws;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMain(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void calculate(ActionEvent event) {
        Scene1Controller.total = Scene1Controller.total + Integer.parseInt(m2.getText());
        Scene1Controller.total = Scene1Controller.total + Integer.parseInt(mi.getText());
        Scene1Controller.total = Scene1Controller.total + Integer.parseInt(c2.getText());
        Scene1Controller.total = Scene1Controller.total + Integer.parseInt(ci.getText());
        Scene1Controller.total = Scene1Controller.total + Integer.parseInt(m2.getText());

    }

}
