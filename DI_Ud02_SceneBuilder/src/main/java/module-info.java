module com.mycompany.di_ud02_scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.di_ud02_scenebuilder to javafx.fxml;
    exports com.mycompany.di_ud02_scenebuilder;
}
