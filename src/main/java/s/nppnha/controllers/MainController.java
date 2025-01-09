package s.nppnha.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void getParameters(Event event) {
    }

    public void getCalculations(Event event) {
    }

    public void getEquipments(Event event) {
    }

    public void getPositions(Event event) {
    }
}