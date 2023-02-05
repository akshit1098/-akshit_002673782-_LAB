/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Application;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshit Saxena
 */
public class CreateJPanel extends javax.swing.JPanel {

    private Application application;
    CreateJPanel(Application application) {
        initComponents();
        
        this.application = application;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldObservationID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldBloodPressure = new javax.swing.JTextField();
        fieldTemperature1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addObseravationBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CREATE VITAL SIGNS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 40));
        add(fieldObservationID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, 30));

        jLabel2.setText("Blood Pressure");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        add(fieldBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, 30));
        add(fieldTemperature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 120, 30));

        jLabel3.setText("ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setText("Temperature");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        addObseravationBtn.setText("CREATE NEW OBSERVATION");
        addObseravationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObseravationBtnActionPerformed(evt);
            }
        });
        add(addObseravationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addObseravationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObseravationBtnActionPerformed
        // TODO add your handling code here:
        VitalSignHistory history = this.application.getHistory(); 
        String id = fieldObservationID.getText();
        String temperature = fieldTemperature1.getText();
        String bloodPressure = fieldBloodPressure.getText();
        history.createObservation(Integer.valueOf(id), Double.valueOf(bloodPressure), Double.valueOf(temperature));
        JOptionPane.showMessageDialog(null, "Created observation successfully!!!");
    }//GEN-LAST:event_addObseravationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addObseravationBtn;
    private javax.swing.JTextField fieldBloodPressure;
    private javax.swing.JTextField fieldObservationID;
    private javax.swing.JTextField fieldTemperature1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
