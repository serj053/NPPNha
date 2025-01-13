package s.nppnha.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Parameters {
    private int n = 0;

    public CheckBox MIN;
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
    public Label l1;
    public VBox maxPosition;
    public HBox nomPosition;
    public HBox minPosition;


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
        loader.setLocation(getClass().getResource("/s/nppnha/vboxInputParam.fxml"));
        VBox vb = (VBox) loader.load();
        Label lable = (Label) vb.lookup("#mode");
        n++;
        lable.setText("NOM" + n);
        nomPosition.getChildren().add(vb);
    }

    public void removeColumn(ActionEvent event) {
        if ((dataHBox.getChildren().size() > 3) && (!nomPosition.getChildren().isEmpty())) {
            nomPosition.getChildren().removeLast();
            n--;
        }
    }

    public void addMIN(ActionEvent event) throws IOException {
        System.out.println("1 " + dataHBox.getChildren());//.get(2).lookup("#mode").toString());
        if (MIN.isSelected() && minPosition.lookup("#dataColumn") == null) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/s/nppnha/vboxInputParam.fxml"));
            VBox vb = (VBox) loader.load();
            Label lable = (Label) vb.lookup("#mode");
            lable.setText("MIN");
            minPosition.getChildren().add(vb);
        } else {
            //      minPosition.getChildren().getFirst();
            minPosition.getChildren().removeFirst();
        }
//        ObservableList<Node> data = dataHBox.getChildren();
//        System.out.println(data);
//        int n =0;
//        for (Node node : data) {
//            if (node.lookup("#mode") != null) {
//                if (!node.lookup("#mode").toString().equals("MIN")) {
//                    System.out.println("in if  "+node.lookup("#mode").toString());
//                    n++;
//                }
//            }
//        }
//        System.out.println("n  "+n);
//        if(n == 1){

//        }
    }
}
//FXMLLoader loader = new FXMLLoader();
//                    loader.setLocation(getClass().getResource("/s/nppnha/vboxInputParam.fxml"));
//VBox vb = (VBox) loader.load();
//Label lable = (Label) vb.lookup("#mode");
//                    lable.setText("MIN");
//                    dataHBox.getChildren().add(vb);