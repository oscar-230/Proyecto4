/**
 * @author Oscar David Cuaical 
 * @author 
 * Grupo: 01
 * N° Laboratorio: 04
 * Profesor: Luis Yovany Romo Portilla
 */

package View;

import javax.swing.JOptionPane;


public class NominaView extends javax.swing.JFrame {

    
    public NominaView() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tipocañabox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nombrestext = new javax.swing.JTextField();
        Apellidostext = new javax.swing.JTextField();
        DireccionText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FechacorteText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DiastrabajadosText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Campodedatos = new javax.swing.JTextArea();
        procesarbtn = new javax.swing.JButton();
        limpiarbtn = new javax.swing.JButton();
        volverbtn = new javax.swing.JButton();
        salirbtn = new javax.swing.JButton();
        Si_jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        No_jCheckBox2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        identificacionText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        toneladas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nombres: ");

        jLabel2.setText("Apellidos: ");

        jLabel3.setText("Direccion:");

        Tipocañabox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quemada ordinaria", "Quemada festiva", "Cruda ordinaria", "Cruda festivo" }));
        Tipocañabox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipocañaboxActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de caña: ");

        jLabel5.setText("Fecha de corte: ");

        FechacorteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechacorteTextActionPerformed(evt);
            }
        });

        jLabel6.setText("Dias trabajados: ");

        DiastrabajadosText.setEditable(false);
        DiastrabajadosText.setText("15");

        Campodedatos.setEditable(false);
        Campodedatos.setColumns(20);
        Campodedatos.setRows(5);
        jScrollPane1.setViewportView(Campodedatos);

        procesarbtn.setText("Procesar");
        procesarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarbtnActionPerformed(evt);
            }
        });

        limpiarbtn.setText("Limpiar");
        limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtnActionPerformed(evt);
            }
        });

        volverbtn.setText("Volver");
        volverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverbtnActionPerformed(evt);
            }
        });

        salirbtn.setText("Salir");
        salirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtnActionPerformed(evt);
            }
        });

        Si_jCheckBox1.setText("Si");

        jLabel7.setText("Prestamo: ");

        No_jCheckBox2.setText("No");
        No_jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Salario minimo:");

        jTextField1.setEditable(false);
        jTextField1.setText("1´500,000.00");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Cedula: ");

        jLabel10.setText("Toneladas cosechadas: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(Si_jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(No_jCheckBox2))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(procesarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpiarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(volverbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(toneladas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Apellidostext)
                                    .addComponent(DireccionText)
                                    .addComponent(nombrestext)
                                    .addComponent(identificacionText, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DiastrabajadosText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tipocañabox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechacorteText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombrestext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Tipocañabox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Apellidostext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechacorteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DireccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(DiastrabajadosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(identificacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(toneladas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Si_jCheckBox1)
                    .addComponent(jLabel7)
                    .addComponent(No_jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(procesarbtn)
                        .addGap(18, 18, 18)
                        .addComponent(limpiarbtn)
                        .addGap(18, 18, 18)
                        .addComponent(volverbtn)
                        .addGap(26, 26, 26)
                        .addComponent(salirbtn)))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipocañaboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipocañaboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipocañaboxActionPerformed

    private void FechacorteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechacorteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechacorteTextActionPerformed

    private void salirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirbtnActionPerformed

    private void volverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverbtnActionPerformed
        EmpleadoView empleado = new EmpleadoView();
        empleado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverbtnActionPerformed

    private void No_jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_No_jCheckBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void procesarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarbtnActionPerformed
        try {
            double totalPrestamo = 0;
            String nombres = nombrestext.getText();
            String apellidos = Apellidostext.getText();
            String direccion = DireccionText.getText();
            String identificacion = identificacionText.getText();
            String tipoDeCaña = Tipocañabox.getSelectedItem().toString();
            String toneladasText = toneladas.getText();

            if (nombres.isEmpty() || apellidos.isEmpty() || direccion.isEmpty() || identificacion.isEmpty() || tipoDeCaña.isEmpty() || toneladasText.isEmpty()) {
                throw new Exception("Debe llenar todos los campos");
            }

            int toneladas = Integer.parseInt(toneladasText);

            // Calcular los devengos
            double tarifaPorTonelada = 0.0;
            if (tipoDeCaña.equals("Cruda ordinaria")) {
                tarifaPorTonelada = 2000000.0;
            } else if (tipoDeCaña.equals("Quemada ordinaria")) {
                tarifaPorTonelada = 1000000.0;
            } else if (tipoDeCaña.equals("Quemada festiva")) {
                tarifaPorTonelada = 2000000.0;
            } else if (tipoDeCaña.equals("Cruda festiva")) {
                tarifaPorTonelada = 3000000.0;
            }
            double devengos = tarifaPorTonelada * toneladas;

            // Calcular las deducciones
            double deduccionesAutomaticas = (devengos * 0.04) * 2; // Salud y Fondo de pensión
            double deduccionesPorValor = 0.0;

            // Verificar si tiene préstamo
            if (Si_jCheckBox1.isSelected()) {
                String pagoPrestamoText = JOptionPane.showInputDialog(this, "Ingrese el monto del préstamo a pagar:");
                if (pagoPrestamoText != null && !pagoPrestamoText.isEmpty()) {
                    try {
                        double pagoPrestamo = Double.parseDouble(pagoPrestamoText);
                        deduccionesPorValor = pagoPrestamo;
                        Campodedatos.append("Deducción por préstamo: " + pagoPrestamo + "\n");
                        totalPrestamo -= pagoPrestamo;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "El monto del préstamo ingresado no es válido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Debe ingresar el monto del préstamo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            double totalDeducciones = deduccionesAutomaticas + deduccionesPorValor;

            // Calcular las prestaciones sociales
            double cesantias = devengos * 0.0833;
            double interesCesantias = devengos * 0.01;
            double primas = devengos * 0.0833;
            double vacaciones = devengos * 0.0417;
            double totalPagar = devengos - totalDeducciones - totalPrestamo;


            Campodedatos.append("Información del empleado:\n");
            Campodedatos.append("Nombres: " + nombres + "\n");
            Campodedatos.append("Apellidos: " + apellidos + "\n");
            Campodedatos.append("Dirección: " + direccion + "\n");
            Campodedatos.append("Identificación: " + identificacion + "\n\n");

            Campodedatos.append("Devengos:\n");
            Campodedatos.append("Tipo de caña: " + tipoDeCaña + "\n");
            Campodedatos.append("Tarifa por tonelada: " + tarifaPorTonelada + "\n");
            Campodedatos.append("Toneladas: " + toneladas + "\n");
            Campodedatos.append("Total devengos: " + devengos + "\n\n");

            Campodedatos.append("Deducciones:\n");
            Campodedatos.append("Deducciones automáticas (Salud y Fondo de pensión): " + deduccionesAutomaticas + "\n");
            Campodedatos.append("Deducciones por préstamo: " + deduccionesPorValor + "\n");
            Campodedatos.append("Total deducciones: " + totalDeducciones + "\n\n");

            Campodedatos.append("Prestaciones sociales:\n");
            Campodedatos.append("Cesantías: " + cesantias + "\n");
            Campodedatos.append("Interés de cesantías: " + interesCesantias + "\n");
            Campodedatos.append("Primas: " + primas + "\n");
            Campodedatos.append("Vacaciones: " + vacaciones + "\n");
            Campodedatos.append("\n");
            Campodedatos.append("Total a pagar: " + totalPagar + "\n");
            Campodedatos.append("\n");
            Campodedatos.append("----------------------------------\n");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor numérico válido para las toneladas", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_procesarbtnActionPerformed

    private void limpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtnActionPerformed

        nombrestext.setText("");
        Apellidostext.setText("");
        DireccionText.setText("");
        identificacionText.setText("");
        toneladas.setText("");
        FechacorteText.setText("");
        Tipocañabox.setSelectedIndex(0);
        Si_jCheckBox1.setSelected(false);
        No_jCheckBox2.setSelected(false);

    }//GEN-LAST:event_limpiarbtnActionPerformed


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
            java.util.logging.Logger.getLogger(NominaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NominaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NominaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NominaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NominaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidostext;
    private javax.swing.JTextArea Campodedatos;
    private javax.swing.JTextField DiastrabajadosText;
    private javax.swing.JTextField DireccionText;
    private javax.swing.JTextField FechacorteText;
    private javax.swing.JCheckBox No_jCheckBox2;
    private javax.swing.JCheckBox Si_jCheckBox1;
    private javax.swing.JComboBox<String> Tipocañabox;
    private javax.swing.JTextField identificacionText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton limpiarbtn;
    private javax.swing.JTextField nombrestext;
    private javax.swing.JButton procesarbtn;
    private javax.swing.JButton salirbtn;
    private javax.swing.JTextField toneladas;
    private javax.swing.JButton volverbtn;
    // End of variables declaration//GEN-END:variables
}
