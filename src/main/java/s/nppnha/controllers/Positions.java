package s.nppnha.controllers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Optional;

public class Positions {
    public Label label ;

    public void addPosition(ActionEvent event) throws IOException {
        label = (Label)
        ((Node)event.getTarget()).getScene().lookup("#envLabel");

        ChoiceDialog<String> dialog = new ChoiceDialog<>();
        Text liquid = new Text("Жидкие среды");
        liquid.setFont(new Font(20.0));
        dialog.getItems().add("Жидкие среды");
        dialog.getItems().add("Газообразные среды");
        dialog.getItems().add("Жидкость+Газ");
        dialog.getItems().add("");
        dialog.setTitle("Жидкость, Газ, Газ+Жидкость");
        dialog.setHeaderText("Агрегатное состояние");
        //  dialog.setContentText("");
        dialog.setSelectedItem("Выбрать значение");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent() && !result.get().equals("Выбрать значение")) {
            System.out.println(label);
            label.setText(result.get());
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Продолжить без выбора??", ButtonType.OK, ButtonType.CANCEL);
            alert.setTitle("Внимание!");
            alert.setHeaderText("Значение не выбрано.");
            alert.setContentText("Продолжить без выбора?");
            Optional<ButtonType> alertResult = alert.showAndWait();
            if (alertResult.isPresent() && alertResult.get() == ButtonType.OK) {
                System.out.println("Продолжено");
            } else {
                dialog.showAndWait();
                System.out.println("Отменено");
            }

        }
        //  dialog.show();
    }
}
