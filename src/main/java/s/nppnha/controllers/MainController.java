package s.nppnha.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import s.nppnha.MainWin;

import java.io.IOException;

import static s.nppnha.MainWin.getTabPane;

public class MainController {
    //button
    public void getNewTask(ActionEvent event) throws IOException {
        getTabPane();//load FXML file tab.fxml
    }

    //button
    public void openOldTask(ActionEvent event) {
    }

    //button
    public void saveTask(ActionEvent event) {
    }

    public void setLight(ActionEvent event) {
        Scene scene = MainWin.root.getScene();
          if (scene.getRoot().lookup("#AnchEnvParam") != null) {
        scene.getRoot().lookup("#dataHBox").setStyle("-fx-background-color: #e9e9e9");
        scene.getStylesheets().remove("main.css");
          }
    }

    public void setDark(ActionEvent event) {
        Scene scene = MainWin.root.getScene();
        if (scene.getRoot().lookup("#AnchEnvParam") != null) {
            scene.getRoot().lookup("#dataHBox").setStyle("-fx-background-color: #2c3e50");
            scene.getStylesheets().add("main.css");
        }
    }

    public void getReference(ActionEvent event) {

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