package s.nppnha.controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

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
}