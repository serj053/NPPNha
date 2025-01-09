package s.nppnha.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Parameters {

    public ChoiceBox<String> T;
    public ChoiceBox<String> P2;
    public ChoiceBox<String> P1;
    public ChoiceBox<String> Q;
    public static Label envLabel;
    public SplitMenuButton selectedEquipment;
    public SplitMenuButton nodeType;
    public SplitMenuButton diameter;
    public VBox dataColumn;
    public HBox dataHBox;// * подключение
    public ObservableList<String> listQ
            = FXCollections.observableArrayList("м³/ч", "кг/ч", "т/ч", "л/ч");
    public ObservableList<String> listP1
            = FXCollections.observableArrayList("кг/см²", "мПа", "кПа", "бар", "атм", "мм вод. ст.", "psi");
    public ObservableList<String> listP2
            = FXCollections.observableArrayList("кг/см²", "мПа", "кПа", "бар", "атм", "мм вод. ст.", "psi");
    public ObservableList<String> listT
            = FXCollections.observableArrayList("°C", "°K");

    public void initialize() {
        Q.setItems(listQ);
        P1.setItems(listP1);
        P2.setItems(listP2);
        T.setItems(listT);
    }

    public void selectEquipment(ActionEvent event) {
        selectedEquipment.setText("Выберите тип клапана");
    }

    public void selectNodeType(ActionEvent event) {
        nodeType.setText("Выберите тип  узла");
    }

    public void controlValve(ActionEvent event) {
        selectedEquipment.setText("Клапан регулирующий");
    }

    public void shutOffControlValve(ActionEvent event) {
        selectedEquipment.setText("Клапан запорно-регулирующий");
    }

    public void cutOffControlValve(ActionEvent event) {
        selectedEquipment.setText("Клапан регулирующе-отсечной");
    }

    public void shutOffValve(ActionEvent event) {
        selectedEquipment.setText("Клапан запорный");
    }

    public void cutOffValve(ActionEvent event) {
        selectedEquipment.setText("Клапан отсечной");
    }

    public void notUnloaded(ActionEvent event) {
        nodeType.setText("Неразгруженный");
    }

    public void unloaded(ActionEvent event) {
        nodeType.setText("Разгруженный");
    }

    public void addColumn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/s/nppnha/vboxParameters.fxml"));
        VBox vb = (VBox) loader.load();
        Label lable = (Label)vb.lookup("#mode");
        lable.setText("NOM");
        dataHBox.getChildren().add(vb);
    }

    public void removeColumn(ActionEvent event) {
        if ((dataHBox.getChildren().size() > 3)) {
            dataHBox.getChildren().removeLast();
        }
    }

}
