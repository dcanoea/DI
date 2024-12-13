/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.di_ud02_scenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;

/**
 *
 * @author David Cano Escario
 */
public class SecondaryController1 {
    @FXML
    private TextField Campo_Texto;
    @FXML
    private ProgressIndicator Indicador_Progreso;
    @FXML
    private ProgressBar Barra_Progreso;
    @FXML
    private void Nuevo2(){
        System.out.println(Campo_Texto.getText());
        Campo_Texto.setText("Cambio");
        Indicador_Progreso.setProgress(0.25F);
        Barra_Progreso.setProgress(0.50F);
    }
}
