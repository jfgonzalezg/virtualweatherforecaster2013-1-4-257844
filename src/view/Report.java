/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Algorithms;
import controller.Control;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
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

        lblWeather = new javax.swing.JLabel();
        lblValues = new javax.swing.JLabel();
        txtWeather = new javax.swing.JTextField();
        txtValues = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDeleteLast = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        btnForecast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCurrent = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWeather.setText("Weather Report");

        lblValues.setText("Values to Forecast");

        txtWeather.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWeather.setText("Input weather value");

        txtValues.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValues.setText("0");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDeleteLast.setText("Delete Last");
        btnDeleteLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLastActionPerformed(evt);
            }
        });

        btnDeleteAll.setText("Delete All");
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        btnForecast.setText("Forecast");
        btnForecast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForecastActionPerformed(evt);
            }
        });

        txtCurrent.setColumns(20);
        txtCurrent.setRows(5);
        txtCurrent.setText("Current Data:");
        jScrollPane1.setViewportView(txtCurrent);

        jButton1.setText("ShowAllConsole");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWeather)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblValues)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnAdd)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnDeleteLast)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDeleteAll))
                                    .addComponent(txtWeather, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValues, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnForecast)))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeather)
                    .addComponent(txtWeather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValues)
                    .addComponent(txtValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDeleteLast)
                    .addComponent(btnDeleteAll))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnForecast)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jDate.setDateFormatString("   dd / MMMMM / yyyy ");
        java.util.Date datenow = new java.util.Date();
        jDate.setDate( datenow);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            double d = Double.parseDouble(txtWeather.getText());
            Control.addElement(d);
            txtCurrent.setText(txtCurrent.getText() + "\n" + d);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Formato de número no válido en 'Weather report'. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            txtWeather.setText("Input weather value");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLastActionPerformed
        Control.deleteElement();
        txtCurrent.setText("Current Data:" + "\n");
        for (int i = 0; i <= Control.getVwfs().getTemps().size() - 1; i++) {
            txtCurrent.setText(txtCurrent.getText() + "\n" + Control.getVwfs().getTemps().get(i).getTemperature());
        }
    }//GEN-LAST:event_btnDeleteLastActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        Control.deleteAll();
        txtCurrent.setText("Current Data:" + "\n");
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Control.showAll();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnForecastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForecastActionPerformed
        try {
            int value = Integer.parseInt(txtValues.getText());
            Algorithms.setValueForecast(value);
            Results report = new Results(jDate.getDate());
            report.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Formato de número no válido en 'Values to Forecast'. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            txtValues.setText("0");
        }
    }//GEN-LAST:event_btnForecastActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnDeleteLast;
    private javax.swing.JButton btnForecast;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValues;
    private javax.swing.JLabel lblWeather;
    private javax.swing.JTextArea txtCurrent;
    private javax.swing.JTextField txtValues;
    private javax.swing.JTextField txtWeather;
    // End of variables declaration//GEN-END:variables
}
