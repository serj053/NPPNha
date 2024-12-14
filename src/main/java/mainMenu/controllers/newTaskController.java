package mainMenu.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mainMenu.windows.NewTaskTable;

import java.net.URL;
import java.util.ResourceBundle;

public class newTaskController implements Initializable {
    @FXML
    private TableView<NewTaskTable> resultTable;

    @FXML
    private TableColumn<NewTaskTable, Integer> position;

    @FXML
    private TableColumn<NewTaskTable, String> numberQL;

    @FXML
    private TableColumn<NewTaskTable, String> nameEquipment;

    @FXML
    private TableColumn<NewTaskTable, Integer> amount;

    @FXML
    private TableColumn<NewTaskTable, Integer> pipeD;

    @FXML
    private TableColumn<NewTaskTable, Integer> DN;

    @FXML
    private TableColumn<NewTaskTable, Integer> PN;

    @FXML
    private TableColumn<NewTaskTable, Integer> Kvy;

    @FXML
    private TableColumn<NewTaskTable, String> positioner;

    ObservableList<NewTaskTable> data = FXCollections.observableArrayList(
            new NewTaskTable(1, "1", "1", 1, 1, 1,"p"),
            new NewTaskTable(2, "2", "2", 2, 2, 2,"p"),
            new NewTaskTable(3, "3", "3", 3, 3, 3,"p"),
            new NewTaskTable(4, "4", "4", 4, 4, 4,"p")
    );

    public void initialize(URL url, ResourceBundle rb) {
        position.setCellValueFactory(new PropertyValueFactory<NewTaskTable, Integer>("position"));
        numberQL.setCellValueFactory(new PropertyValueFactory<NewTaskTable, String>("numberQL"));
        nameEquipment.setCellValueFactory(new PropertyValueFactory<NewTaskTable, String>("nameEquipment"));
        amount.setCellValueFactory(new PropertyValueFactory<NewTaskTable, Integer>("amount"));
        pipeD.setCellValueFactory(new PropertyValueFactory<NewTaskTable, Integer>("pipeD"));
        DN.setCellValueFactory(new PropertyValueFactory<NewTaskTable, Integer>("DN"));
        PN.setCellValueFactory(new PropertyValueFactory<NewTaskTable, Integer>("PN"));
        Kvy.setCellValueFactory(new PropertyValueFactory<NewTaskTable, Integer>("Kvy"));
        positioner.setCellValueFactory(new PropertyValueFactory<NewTaskTable, String>("positioner"));
        resultTable.setItems(data);
    }

}
