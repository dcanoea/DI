/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ejemplo;

import java.awt.Desktop;
import java.io.File;
import net.sf.jasperreports.engine.*;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author David Cano Escario
 */

public class GeneradorFacturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // 1. Solicitar ID_Cliente
            System.out.println("------------------------------");
            System.out.print("Ingrese el ID del cliente: ");
            int idCliente = scanner.nextInt();
            
            // 2. Cargar el informe compilado
            InputStream reportStream = GeneradorFacturas.class
                .getClassLoader()
                .getResourceAsStream("informes/facturas_con_parametro.jasper");
            
            if (reportStream == null) {
                System.err.println("Error: No se encontró el archivo .jasper");
                return;
            }

            // 3. Conexión a MySQL (configura tus credenciales)
            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/fabrica",
                    "root",
                    "")) {
                
                // 4. Parámetros del informe
                Map<String, Object> params = new HashMap<>();
                params.put("ID_Cliente", idCliente);

                // 5. Generar PDF
                JasperPrint jasperPrint = JasperFillManager.fillReport(
                    (JasperReport) JRLoader.loadObject(reportStream),
                    params,
                    conn
                );

                // 6. Guardar PDF
                String outputFile = "factura_" + idCliente + ".pdf";
                JasperExportManager.exportReportToPdfFile(jasperPrint, outputFile);
                
                System.out.println("PDF generado: " + outputFile);
                System.out.println("-------------------------------");

                // 7. Abrir con el visor predeterminado del sistema
                System.out.print("¿Abrir PDF? (s/n): ");
                if (scanner.next().equalsIgnoreCase("s")) {
                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().open(new File(outputFile));
                    } else {
                        System.out.println("No se puede abrir el PDF automáticamente");
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error al generar la factura:");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}