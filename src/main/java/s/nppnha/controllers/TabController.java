package s.nppnha.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TabController {
    public Tab parameters;
    public Tab calculations;
    public Tab equipments;
    public Tab positions;
    @FXML
    private Label welcomeText;


    public void getParameters(Event event) throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/s/nppnha/parameters.fxml"));
//        AnchorPane par = loader.load();
//        parameters.setContent(par);
    }

    public void getCalculations(Event event) throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/s/nppnha/calculations.fxml"));
//        AnchorPane par = loader.load();
//        calculations.setContent(par);
    }

    public void getEquipments(Event event) throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/s/nppnha/equipments.fxml"));
//        AnchorPane par = loader.load();
//        equipments.setContent(par);
    }

    public void getPositions(Event event) throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/s/nppnha/positions.fxml"));
//        AnchorPane par = loader.load();
//        positions.setContent(par);
    }

}
