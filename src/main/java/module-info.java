module it.unitn.emeliyanov.fakeminecraft {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.unitn.emeliyanov.main to javafx.fxml;
    exports it.unitn.emeliyanov.main;
}