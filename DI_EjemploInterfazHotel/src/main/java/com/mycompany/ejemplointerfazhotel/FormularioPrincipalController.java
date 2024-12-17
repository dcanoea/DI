/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.ejemplointerfazhotel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author David Cano Escario
 */
public class FormularioPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private Button btnReservas;
    @FXML 
    private Button btnSalir;
    
   @FXML
    public void handlerReservar(ActionEvent event) throws IOException {
        // Cargar el archivo FXML de la ventana existente
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml")); 
        Parent root = loader.load();

        // Crear un nuevo Stage (ventana)
        Stage stage = new Stage();
        stage.setTitle("Gestión de Reservas"); // Título de la ventana
        stage.setScene(new Scene(root)); // Configurar la escena con el FXML cargado
        stage.show(); // Mostrar la nueva ventana
    }
    
    @FXML
    public void handlerSalir(ActionEvent event){
        Platform.exit();
        System.exit(0);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
