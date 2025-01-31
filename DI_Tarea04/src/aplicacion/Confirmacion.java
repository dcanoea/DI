/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package aplicacion;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author David Cano Escario
 */
public class Confirmacion extends javax.swing.JDialog {

    /**
     * Creates new form Confirmaci�n
     */
    public Confirmacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombreReserva = new javax.swing.JLabel();
        jLabelFechaReserva = new javax.swing.JLabel();
        jLabelTipoCocina = new javax.swing.JLabel();
        jLabelTipoReserva = new javax.swing.JLabel();
        jLabelNumPersonas = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        tipoReserva = new javax.swing.JLabel();
        tipoCocina = new javax.swing.JLabel();
        numPersonas = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jLabelDiasCongreso = new javax.swing.JLabel();
        diasCongreso = new javax.swing.JLabel();
        jLabelAlojamiento = new javax.swing.JLabel();
        alojamiento = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONFIRMAR RESERVA");
        setBackground(new java.awt.Color(248, 228, 191));
        setBounds(new java.awt.Rectangle(600, 300, 0, 0));
        setForeground(new java.awt.Color(248, 221, 192));

        jPanel1.setBackground(new java.awt.Color(248, 228, 191));
        jPanel1.setForeground(new java.awt.Color(248, 228, 191));

        jLabelNombreReserva.setText("Nombre");

        jLabelFechaReserva.setText("Fecha");

        jLabelTipoCocina.setText("Tipo de Cocina");

        jLabelTipoReserva.setText("Tipo de Reserva ");

        jLabelNumPersonas.setText("N� Personas");

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        nombre.setText("jLabel1");

        fecha.setText("jLabel1");

        tipoReserva.setText("jLabel1");

        tipoCocina.setText("jLabel1");

        numPersonas.setText("jLabel1");

        jLabelError.setBackground(new java.awt.Color(255, 51, 51));
        jLabelError.setText("ddd");

        jLabelDiasCongreso.setText("N� Dias Congreso");

        diasCongreso.setText("jLabel1");

        jLabelAlojamiento.setText("�Alojamiento?");

        alojamiento.setText("jLabel1");

        jLabelTelefono.setText("Tel�fono");

        telefono.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelError)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonConfirmar)
                        .addGap(24, 24, 24)
                        .addComponent(jButtonVolver)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumPersonas)
                            .addComponent(jLabelTipoCocina)
                            .addComponent(jLabelTipoReserva)
                            .addComponent(jLabelFechaReserva)
                            .addComponent(jLabelNombreReserva)
                            .addComponent(jLabelDiasCongreso)
                            .addComponent(jLabelAlojamiento)
                            .addComponent(jLabelTelefono))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fecha)
                                    .addComponent(nombre)
                                    .addComponent(tipoReserva)
                                    .addComponent(tipoCocina)
                                    .addComponent(numPersonas)
                                    .addComponent(telefono)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(alojamiento)
                                    .addComponent(diasCongreso))))
                        .addGap(405, 405, 405))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreReserva)
                    .addComponent(nombre))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaReserva)
                    .addComponent(fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoReserva)
                    .addComponent(tipoReserva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoCocina)
                    .addComponent(tipoCocina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumPersonas)
                    .addComponent(numPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiasCongreso)
                    .addComponent(diasCongreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlojamiento)
                    .addComponent(alojamiento))
                .addGap(18, 18, 18)
                .addComponent(jLabelError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonVolver))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
           JOptionPane.showMessageDialog(null, "�Gracias!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
           System.exit(0);
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Confirmacion dialog = new Confirmacion(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
    }

    // M�todo para establecer los datos en los JLabel
    public void setDatos(String nombreReserva, String telefono, String fechaReserva, String tipoCocina, String tipoReserva, String numPersonas, String congreso, String alojamiento) {
        // Establece el texto de los labels
        this.nombre.setText(nombreReserva);
        this.telefono.setText(telefono);
        this.fecha.setText(fechaReserva);
        this.tipoCocina.setText(tipoCocina);
        this.tipoReserva.setText(tipoReserva);
        this.numPersonas.setText(numPersonas);
        this.diasCongreso.setText(congreso);
        this.alojamiento.setText(alojamiento);
    }

    public void ocultarBoton() {
        jButtonConfirmar.setEnabled(false);
        jLabelError.setText("ERROR Revise los campos");
        jLabelError.setForeground(Color.red);
    }

    public void mostrarBoton() {
        jButtonConfirmar.setEnabled(true);
        jLabelError.setText("");
    }

    public void congresoSi() {
        jLabelDiasCongreso.setVisible(true);
        diasCongreso.setVisible(true);
        alojamientoSi();
    }

    public void congresoNo() {
        jLabelDiasCongreso.setVisible(false);
        diasCongreso.setVisible(false);
        jLabelAlojamiento.setVisible(false);
        alojamiento.setVisible(false);
    }

    public void alojamientoSi() {
        jLabelAlojamiento.setVisible(true);
        alojamiento.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alojamiento;
    private javax.swing.JLabel diasCongreso;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAlojamiento;
    private javax.swing.JLabel jLabelDiasCongreso;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelFechaReserva;
    private javax.swing.JLabel jLabelNombreReserva;
    private javax.swing.JLabel jLabelNumPersonas;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoCocina;
    private javax.swing.JLabel jLabelTipoReserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numPersonas;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel tipoCocina;
    private javax.swing.JLabel tipoReserva;
    // End of variables declaration//GEN-END:variables
}
