package com.mycompany.ejemplointerfazhotel;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDocumentController {

    @FXML
    private ComboBox comboBox;
    @FXML
    private CheckBox checkBoxFumador;
    @FXML
    private Label lblAviso;

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.getItems().addAll("Doble de uso individual", "Doble", "Junior Suite", "Suite");
        lblAviso.setVisible(false);
    }

    @FXML
    public void handleCheckBox() {
        if (checkBoxFumador.isSelected()) {
            lblAviso.setVisible(true);
        } else {
            lblAviso.setVisible(false);
        }
    }
}
