package mainMenu;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main extends Application {

    private static List<AnchorPane> anchorPanes = new ArrayList<>();
    private static BorderPane node;

    public static void setPane(int idWindow) {//выбираем окно из коллекции
        node.setCenter(anchorPanes.get(idWindow));
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("main.fxml")));

        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("newTask.fxml"))));
        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("openTask.fxml"))));
        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("saveTask.fxml"))));
        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("exportToCRM.fxml"))));
        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("exportRequest.fxml"))));

        //передаем в список все узлы на главной панели
        ObservableList<Node> nodes = root.getChildrenUnmodifiable();
        //выбираем узел в который будут вставляться окна в зависимости от нажатой кнопки
        node = (BorderPane) nodes.get(1);

        Scene scene = new Scene(root);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}