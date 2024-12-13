package mainMenu.controllers;

import javafx.event.ActionEvent;
import mainMenu.Main;

public class mainController {

    public void itemNewTask(ActionEvent actionEvent) {
        Main.setPane(0);
    }

    public void itemOpenTask(ActionEvent actionEvent) {
        Main.setPane(1);
    }

    public void itemSaveTask(ActionEvent actionEvent) {
        Main.setPane(2);
    }

    public void itemExportToCRM(ActionEvent actionEvent) {
        Main.setPane(3);
    }

    public void itemExportRequest(ActionEvent actionEvent) {
        Main.setPane(4);
    }
}