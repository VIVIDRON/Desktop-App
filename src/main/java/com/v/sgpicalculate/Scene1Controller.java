package com.v.sgpicalculate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;


public class Scene1Controller {
    @FXML
    private TextField m1;
    @FXML
    private TextField mi;
    @FXML
    private TextField p1;
    @FXML
    private TextField pi;
    @FXML
    private TextField c1;
    @FXML
    private TextField ci;
    @FXML
    private TextField mech;
    @FXML
    private TextField mechi;
    @FXML
    private TextField bee;
    @FXML
    private TextField beei;
    @FXML
    private TextField ws;
    @FXML
    private Label sum;
    @FXML
    private Button back;
    @FXML
    private Button cal;
    @FXML
    private ProgressIndicator progress;

    private Stage stage;
    private Scene scene;
    private Parent root;
    static double total = 0;

    public void switchToMain(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void refresh(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    public void calculate(ActionEvent event) {
        try {
            total += Sem1Calculation.for100(Integer.parseInt(m1.getText()));
            total += Sem1Calculation.for25M(Integer.parseInt(mi.getText()));
            progress.setProgress(0.2);
            total += Sem1Calculation.for75(Integer.parseInt(p1.getText()));
            total += Sem1Calculation.for25(Integer.parseInt(pi.getText()));
            progress.setProgress(0.4);
            total += Sem1Calculation.for75(Integer.parseInt(c1.getText()));
            total += Sem1Calculation.for25(Integer.parseInt(ci.getText()));
            progress.setProgress(0.6);
            total += Sem1Calculation.for100(Integer.parseInt(mech.getText()));
            total += Sem1Calculation.for50(Integer.parseInt(mechi.getText()));
            progress.setProgress(0.8);
            total += Sem1Calculation.for100(Integer.parseInt(bee.getText()));
            total += Sem1Calculation.for50(Integer.parseInt(beei.getText()));
            progress.setProgress(0.9);
            total += Sem1Calculation.for50(Integer.parseInt(ws.getText()));
            progress.setProgress(1);
            total = total / 18;
            String result = String.format("%.2f", total);
            sum.setText(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
