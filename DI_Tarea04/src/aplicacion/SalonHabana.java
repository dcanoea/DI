/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package aplicacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author David Cano Escario
 */
public class SalonHabana extends javax.swing.JDialog {

    public static SalonHabana dialog = new SalonHabana(new javax.swing.JFrame(), false);
    Confirmacion confirm;

    /**
     * Creates new form SalonHabana
     */
    public SalonHabana(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        parent.setVisible(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        confirm = new Confirmacion(parent, rootPaneCheckingEnabled);
        initComponents();
        spinnerFecha();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCocina = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelTipoCocina = new javax.swing.JPanel();
        jRadioBufe = new javax.swing.JRadioButton();
        jRadioCarta = new javax.swing.JRadioButton();
        jRadioCitaChef = new javax.swing.JRadioButton();
        jRadioNoPrecisa = new javax.swing.JRadioButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jLabelPresentacion = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelFecha = new javax.swing.JLabel();
        jSpinnerFecha = new javax.swing.JSpinner();
        jLabelPersonas = new javax.swing.JLabel();
        jSpinnerPersonas = new javax.swing.JSpinner();
        jComboBoxTipoBanquete = new javax.swing.JComboBox<>();
        jLabelTipoReserva = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldCongreso = new javax.swing.JTextField();
        jLabelDiasCongreso = new javax.swing.JLabel();
        jCheckBoxAlojamiento = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reserva Sal�n Habana");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(400, 150));
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(248, 228, 191));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 500));

        jPanelTipoCocina.setBackground(new java.awt.Color(248, 228, 191));
        jPanelTipoCocina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo cocina", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", 0, 18))); // NOI18N
        jPanelTipoCocina.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanelTipoCocina.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroupCocina.add(jRadioBufe);
        jRadioBufe.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jRadioBufe.setText("Buf�");
        jRadioBufe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioBufe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelTipoCocina.add(jRadioBufe);

        buttonGroupCocina.add(jRadioCarta);
        jRadioCarta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jRadioCarta.setText("Carta");
        jRadioCarta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioCarta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelTipoCocina.add(jRadioCarta);

        buttonGroupCocina.add(jRadioCitaChef);
        jRadioCitaChef.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jRadioCitaChef.setText("Cita Chef");
        jRadioCitaChef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioCitaChef.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelTipoCocina.add(jRadioCitaChef);

        buttonGroupCocina.add(jRadioNoPrecisa);
        jRadioNoPrecisa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jRadioNoPrecisa.setText("No precisa");
        jRadioNoPrecisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioNoPrecisa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelTipoCocina.add(jRadioNoPrecisa);

        jLabelNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelImagen.setBackground(new java.awt.Color(248, 228, 191));
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/habana.jpg"))); // NOI18N
        jLabelImagen.setPreferredSize(new java.awt.Dimension(1080, 762));

        jLabelPresentacion.setBackground(new java.awt.Color(248, 228, 191));
        jLabelPresentacion.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabelPresentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPresentacion.setText("Bienvenido a la central de reservas de Sal�n Habana");
        jLabelPresentacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextFieldNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldNombre.setToolTipText("Nombre");

        jLabelTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelTelefono.setText("Tel�fono");

        jTextFieldTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldTelefono.setToolTipText("Tel�fono");
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });

        jLabelFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelFecha.setText("Fecha reserva");

        jSpinnerFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFecha.setToolTipText("Fecha reserva");

        jLabelPersonas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelPersonas.setText("N� Personas");

        jSpinnerPersonas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jSpinnerPersonas.setModel(new javax.swing.SpinnerNumberModel());
        jSpinnerPersonas.setToolTipText("N� Personas");

        jComboBoxTipoBanquete.setBackground(new java.awt.Color(204, 204, 204));
        jComboBoxTipoBanquete.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBoxTipoBanquete.setForeground(new java.awt.Color(204, 204, 204));
        jComboBoxTipoBanquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banquete", "Jornada", "Congreso" }));
        jComboBoxTipoBanquete.setToolTipText("Tipo reserva");
        jComboBoxTipoBanquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoBanqueteActionPerformed(evt);
            }
        });

        jLabelTipoReserva.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelTipoReserva.setText("Tipo reserva");

        jTextFieldCongreso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextFieldCongreso.setToolTipText("N� Dias Congreso");
        jTextFieldCongreso.setEnabled(false);

        jLabelDiasCongreso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelDiasCongreso.setText("N� Dias Congreso");
        jLabelDiasCongreso.setEnabled(false);

        jCheckBoxAlojamiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCheckBoxAlojamiento.setText("�Necesita alojamiento?");
        jCheckBoxAlojamiento.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setText("RESERVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox1.setText("Modo Alto Contraste");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabelDiasCongreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCongreso, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxAlojamiento))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanelTipoCocina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelFecha)
                                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                            .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(70, 70, 70)
                                            .addComponent(jLabelTipoReserva)
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBoxTipoBanquete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                            .addComponent(jLabelPersonas)
                                            .addGap(18, 18, 18)
                                            .addComponent(jSpinnerPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                            .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(330, 330, 330))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPresentacion)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSpinnerPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPersonas)
                    .addComponent(jComboBoxTipoBanquete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoReserva)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTipoCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCongreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDiasCongreso)
                    .addComponent(jCheckBoxAlojamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //m�todo del jCheckBox para aplicar el modo de alto contraste
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            //Cambiamos el color de fondo de los paneles
            jPanelPrincipal.setBackground(Color.BLACK);
            jPanelTipoCocina.setBackground(Color.BLACK);

            //Cambiamos el color del borde del jPanelTipoCocina, incluido el t�tulo
            LineBorder lineBorder = new LineBorder(Color.YELLOW, 2); // Creamos el borde de 2 p�xeles y color AMARILLO
            TitledBorder border = new TitledBorder(lineBorder, "Tipo Cocina"); //Creamos el texto al titulo
            Font customFont = new Font("Century Gothic", Font.PLAIN, 18); //Creamos la fuente del titulo, el tipo y el tama�o
            border.setTitleColor(Color.yellow);// Cambiamos el color del texto del titulo
            border.setTitleFont(customFont);//Cambiamos la fuente
            border.setTitleJustification(TitledBorder.CENTER);//Centramos el titulo
            jPanelTipoCocina.setBorder(border);//A�adimos el borde al panel

            //Cambiamos el color de todos los textos
            jCheckBox1.setForeground(Color.YELLOW);
            jCheckBoxAlojamiento.setForeground(Color.YELLOW);
            jLabelDiasCongreso.setForeground(Color.YELLOW);
            jLabelFecha.setForeground(Color.YELLOW);
            jLabelImagen.setForeground(Color.YELLOW);
            jLabelNombre.setForeground(Color.YELLOW);
            jLabelPersonas.setForeground(Color.YELLOW);
            jLabelPresentacion.setForeground(Color.YELLOW);
            jLabelTelefono.setForeground(Color.YELLOW);
            jLabelTipoReserva.setForeground(Color.YELLOW);
            jRadioBufe.setForeground(Color.YELLOW);
            jRadioCarta.setForeground(Color.YELLOW);
            jRadioCitaChef.setForeground(Color.YELLOW);
            jRadioNoPrecisa.setForeground(Color.YELLOW);

        } else {
            //Cambiamos el color de fondo de los paneles
            Color color = new Color(248, 228, 191); //Color personalizado de origen
            jPanelPrincipal.setBackground(color);
            jPanelTipoCocina.setBackground(color);

            //Cambiamos el color del borde del jPanelTipoCocina, incluido el t�tulo
            LineBorder lineBorder = new LineBorder(Color.BLACK, 2);
            TitledBorder border = new TitledBorder(lineBorder, "Tipo Cocina");
            Font customFont = new Font("Century Gothic", Font.PLAIN, 18);
            border.setTitleColor(Color.BLACK);
            border.setTitleFont(customFont);
            border.setTitleJustification(TitledBorder.CENTER);
            jPanelTipoCocina.setBorder(border);

            //Cambiamos el color de todos los textos
            jCheckBox1.setForeground(Color.black);
            jCheckBoxAlojamiento.setForeground(Color.black);
            jLabelDiasCongreso.setForeground(Color.black);
            jLabelFecha.setForeground(Color.black);
            jLabelImagen.setForeground(Color.black);
            jLabelNombre.setForeground(Color.black);
            jLabelPersonas.setForeground(Color.black);
            jLabelPresentacion.setForeground(Color.black);
            jLabelTelefono.setForeground(Color.black);
            jLabelTipoReserva.setForeground(Color.black);
            jRadioBufe.setForeground(Color.black);
            jRadioCarta.setForeground(Color.black);
            jRadioCitaChef.setForeground(Color.black);
            jRadioNoPrecisa.setForeground(Color.black);

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBoxTipoBanqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoBanqueteActionPerformed
        if (jComboBoxTipoBanquete.getSelectedItem().toString().equals("Congreso")) {
            jLabelDiasCongreso.setEnabled(rootPaneCheckingEnabled);
            jTextFieldCongreso.setEnabled(rootPaneCheckingEnabled);
            jCheckBoxAlojamiento.setEnabled(rootPaneCheckingEnabled);
        } else {
            jLabelDiasCongreso.setEnabled(false);
            jTextFieldCongreso.setEnabled(false);
            jCheckBoxAlojamiento.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxTipoBanqueteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombreReserva = jTextFieldNombre.getText();
        String telefono = jTextFieldTelefono.getText();

        SimpleDateFormat sdf = new SimpleDateFormat("dd / MM / yyyy");
        String fechaReserva = sdf.format(jSpinnerFecha.getValue());

        String tipoCocina = "";
        if (jRadioBufe.isSelected()) {
            tipoCocina = jRadioBufe.getText();
            confirm.mostrarBoton();
        } else if (jRadioCarta.isSelected()) {
            tipoCocina = jRadioCarta.getText();
            confirm.mostrarBoton();
        } else if (jRadioCitaChef.isSelected()) {
            tipoCocina = jRadioCitaChef.getText();
            confirm.mostrarBoton();
        } else if (jRadioNoPrecisa.isSelected()) {
            tipoCocina = jRadioNoPrecisa.getText();
            confirm.mostrarBoton();
        } else {
            tipoCocina = "ERROR";
            confirm.ocultarBoton();
        }
        String tipoReserva = jComboBoxTipoBanquete.getSelectedItem().toString();
        String numPersonas = jSpinnerPersonas.getValue().toString();
        String congreso = jTextFieldCongreso.getText();

        if (jComboBoxTipoBanquete.getSelectedItem().toString().equalsIgnoreCase("congreso")) {
            confirm.congresoSi();
            if (congreso.isBlank()) {
                congreso = "ERROR";
                confirm.ocultarBoton();
            }
        } else {
            confirm.congresoNo();
        }

        String alojamiento;
        if (jCheckBoxAlojamiento.isSelected()) {
            alojamiento = "SI";
        } else {
            alojamiento = "NO";
        }

        if (nombreReserva.isBlank()) {
            nombreReserva = "ERROR";
            confirm.ocultarBoton();
        }
        if (telefono.isBlank()) {
            telefono = "ERROR";
            confirm.ocultarBoton();
        }
        if (numPersonas.equals("0")) {
            numPersonas = "ERROR";
            confirm.ocultarBoton();
        }

        confirm.setDatos(nombreReserva, telefono, fechaReserva, tipoCocina, tipoReserva, numPersonas, congreso, alojamiento);

        confirm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(SalonHabana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalonHabana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalonHabana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalonHabana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialog.setVisible(true);
            }
        });
    }

    //M�todo que crea la imagen para el icono de ventana
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/img.png"));

        return retValue;
    }

    Calendar calendar = Calendar.getInstance();//Instancia Calendar para el m�todo del spinner

    //M�todo para que el spinner de la fecha sea en formato DD/MM/AAAA
    private void spinnerFecha() {
        //Obtenemos una fecha de inicio, ser� la fecha actual del sistema
        Date inicio = calendar.getTime();
        //Indicamos a�o hasta -100 del actual
        calendar.add(Calendar.YEAR, -100);
        //Guardamos la configuraci�n en un DATE
        Date fechaAnterior = calendar.getTime();
        //Indicamos a�o hasta +200 del actual
        calendar.add(Calendar.YEAR, 200);
        //Guardamos la configuraci�n en un DATE
        Date fechaPosterior = calendar.getTime();
        //Usamos el contructor de abajo para crear un modelo para el Spinner
        //SpinnerDateModel(Date value, Comparable start, Comparable end, int calendarField)
        //Utilizamos los datos que creamos m�s arriba
        //Para fecha utilizamos Calendar.YEAR y para hora Calendar.HOUR, el resto puede ser igual
        SpinnerModel fechaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.YEAR);
        //Indicamos el model para cada Spinner adem�s del formato de fecha y hora seg�n corresponda.
        jSpinnerFecha.setModel(fechaModel);
        jSpinnerFecha.setEditor(new JSpinner.DateEditor(jSpinnerFecha, "dd/MM/yyyy"));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCocina;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBoxAlojamiento;
    private javax.swing.JComboBox<String> jComboBoxTipoBanquete;
    private javax.swing.JLabel jLabelDiasCongreso;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPersonas;
    private javax.swing.JLabel jLabelPresentacion;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoReserva;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTipoCocina;
    private javax.swing.JRadioButton jRadioBufe;
    private javax.swing.JRadioButton jRadioCarta;
    private javax.swing.JRadioButton jRadioCitaChef;
    private javax.swing.JRadioButton jRadioNoPrecisa;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JSpinner jSpinnerPersonas;
    private javax.swing.JTextField jTextFieldCongreso;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
