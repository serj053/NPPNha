module org.example.nppnha {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens mainMenu to javafx.fxml;
    exports mainMenu;
    exports mainMenu.controllers;
    opens mainMenu.controllers to javafx.fxml;
    exports mainMenu.windows;
    opens mainMenu.windows to javafx.fxml;
}