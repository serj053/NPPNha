package s.nppnha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import s.nppnha.controllers.MainController;

import java.io.IOException;
import java.util.Objects;

public class MainWindow extends Application {
    public static BorderPane root;
    public static void getTabPane() throws IOException {
        TabPane tab = FXMLLoader.load(Objects.requireNonNull(MainWindow.class.getResource("tab.fxml")));
        tab.getSelectionModel().select(3);
        root.setCenter(tab);
    }
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        stage.getIcons().add(new javafx.scene.image.Image("nppnha.png"));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainWindow.class.getResource("mainWin.fxml"));
        root = loader.load();
        MainController mainController = loader.getController();
        mainController.setHost(this);
   //     mainController.getNewTask();
  //      mainController.setDark();

        Scene scene = new Scene(root);
        stage.setTitle("Привет!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}