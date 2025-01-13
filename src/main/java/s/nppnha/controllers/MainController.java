package s.nppnha.controllers;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import s.nppnha.MainWindow;

import java.io.File;
import java.io.IOException;

import static s.nppnha.MainWindow.getTabPane;

public class MainController {
    private Application host;

    public void setHost(Application host) {
        this.host = host;
    }
    //button
    public void getNewTask() throws IOException {
        getTabPane();//load FXML file tab.fxml
    }

    //button
    public void openOldTask(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.setInitialDirectory(new File("c:\\"));
        File file = fileChooser.showOpenDialog(new Stage());
        HostServices hostServices = host.getHostServices();
        if (file != null) {
            hostServices.showDocument(file.getAbsolutePath());
        }
    }

    //button
    public void saveTask(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Resource File");
        fileChooser.setInitialDirectory(new File("c:\\"));
        File file = fileChooser.showSaveDialog(new Stage());
        HostServices hostServices = host.getHostServices();
        if (file != null) {
            hostServices.showDocument(file.getAbsolutePath());
        }
    }


    public void setDark() {

        Scene scene = MainWindow.root.getScene();
        if (scene.getRoot().lookup("#AnchEnvParam") != null) {
            scene.getRoot().lookup("#dataHBox").setStyle("-fx-background-color: #2c3e50");
            scene.getStylesheets().add("main.css");
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText(null);
            alert.setContentText("Необходимо сначала создать сделку либо загрузить.");
            alert.showAndWait();
        }
    }

    public void setLight() {

        Scene scene = MainWindow.root.getScene();
        if (scene.getRoot().lookup("#AnchEnvParam") != null) {
            scene.getRoot().lookup("#dataHBox").setStyle("-fx-background-color: #e9e9e9");
            scene.getStylesheets().remove("main.css");
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText(null);
            alert.setContentText("Необходимо сначала создать сделку, либо загрузить.");
            alert.showAndWait();
        }
    }
    public void getReference(ActionEvent event) {

    }

    public void exportCRM(ActionEvent event) {
    }

    public void exporttElectriсDrive(ActionEvent event) {
    }
}
/*
*  BorderPane root = MainWin.root;
        root.setStyle("-fx-background-color: #2c3e50");
* System.out.println(scene.getRoot().getChildrenUnmodifiable());
            ObservableList<Node> children = scene.getRoot().getChildrenUnmodifiable();
            for (Node node : children) {
                node.setStyle("-fx-background-color: #2c3e50; -fx-text-fill: #cdcdcd");
            }
*
* */