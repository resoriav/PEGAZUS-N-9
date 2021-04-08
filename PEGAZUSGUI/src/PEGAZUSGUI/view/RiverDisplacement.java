/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PEGAZUSGUI.view;

import PEGAZUSGUI.controler.pegazusController;

/**
 *
 * @author Rodrigo Soria
 */
public class RiverDisplacement extends javax.swing.JInternalFrame {

    /**
     * Creates new form RiverDisplacement
     */
    public RiverDisplacement() {
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

        jLabel6 = new javax.swing.JLabel();
        txtVelocity = new javax.swing.JTextField();
        btnDeleteall1 = new javax.swing.JButton();
        txtWeather = new javax.swing.JTextField();
        txtAcceleration = new javax.swing.JTextField();
        txtDisplacement = new javax.swing.JTextField();
        btmResult = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("River Displacement");

        jLabel6.setText(" The Displacement is (x) --->");

        txtVelocity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDeleteall1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnDeleteall1.setText("DELETE ALL");
        btnDeleteall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteall1ActionPerformed(evt);
            }
        });

        txtWeather.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAcceleration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcceleration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccelerationActionPerformed(evt);
            }
        });

        txtDisplacement.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btmResult.setBackground(new java.awt.Color(51, 204, 255));
        btmResult.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btmResult.setText("RESULT");
        btmResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmResultActionPerformed(evt);
            }
        });

        jLabel3.setText(" Initial Velocity (Vo) ->");

        jLabel4.setText("Weather (t) ->");

        jLabel5.setText("Acceleration (a) ->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtWeather, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAcceleration, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDisplacement, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btmResult)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDeleteall1)))
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtVelocity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtWeather, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtAcceleration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtDisplacement, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteall1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btmResult))
                    .addGap(94, 94, 94)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteall1ActionPerformed
        int integer = 0;

        txtAcceleration.setText("");
        txtVelocity.setText("");
        txtDisplacement.setText("");
        txtWeather.setText("");
    }//GEN-LAST:event_btnDeleteall1ActionPerformed

    private void txtAccelerationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccelerationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccelerationActionPerformed

    private void btmResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmResultActionPerformed

        double speed;
        double time2;
        double aceleration2;

        pegazusController pegazusController = new pegazusController();
        speed = Double.parseDouble(txtVelocity.getText());
        time2 = Double.parseDouble(txtWeather.getText());
        aceleration2 = Double.parseDouble(txtAcceleration.getText());
        pegazusController.calculateRiverDisplacement(speed, time2,aceleration2);

        txtDisplacement.setText(String.valueOf(pegazusController.result));
    }//GEN-LAST:event_btmResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmResult;
    private javax.swing.JButton btnDeleteall1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAcceleration;
    private javax.swing.JTextField txtDisplacement;
    private javax.swing.JTextField txtVelocity;
    private javax.swing.JTextField txtWeather;
    // End of variables declaration//GEN-END:variables
}
