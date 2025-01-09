package s.nppnha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainWin extends Application {
    static BorderPane root;
    public static void getTabPane() throws IOException {
        TabPane tab = FXMLLoader.load(Objects.requireNonNull(MainWin.class.getResource("tab.fxml")));
        tab.getSelectionModel().select(3);
        root.setCenter(tab);
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainWin.class.getResource("mainWin.fxml"));
        root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}