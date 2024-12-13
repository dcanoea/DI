/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.di_ud02_scenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author David Cano Escario
 */
public class Boton_OK {
    
    @FXML
    private TextField Campo_Texto;
    @FXML
    private void Cod_Boton_OK(){
            System.out.println(Campo_Texto.getText());
            Campo_Texto.setText("Texto cambiado");
}
}
