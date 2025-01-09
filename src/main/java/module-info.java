module serj.nppnha {
    requires javafx.controls;
    requires javafx.fxml;


    opens s.nppnha to javafx.fxml;
    exports s.nppnha;
    exports s.nppnha.controllers;
    opens s.nppnha.controllers to javafx.fxml;
}