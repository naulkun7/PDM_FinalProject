public class Admin extends javax.swing.JFrame {
    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PatientButton = new javax.swing.JButton();
        DoctorButton = new javax.swing.JButton();
        RoomButton = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        LabButton1 = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        END = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Admin ");
        jLabel2.setToolTipText("");

        PatientButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PatientButton.setText("Patient");
        PatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonActionPerformed(evt);
            }
        });

        DoctorButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DoctorButton.setText("Doctor");
        DoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorButtonActionPerformed(evt);
            }
        });

        RoomButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RoomButton.setText("Room");
        RoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomButtonActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        LabButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabButton1.setText("Lab");
        LabButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabButton1ActionPerformed(evt);
            }
        });

        Back1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back1.setText("Generate Bill");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        END.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        END.setText("END");
        END.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENDActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Treatment");
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(Exit)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(END))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(278, 278, 278)
                                                .addComponent(jLabel2)
                                                .addGap(0, 295, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(PatientButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 147,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(DoctorButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 126,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(78, 78, 78)
                                                                .addComponent(jButton1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 229,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(LabButton1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 134,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(44, 44, 44)
                                                                .addComponent(RoomButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 124,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Exit)
                                        .addComponent(END))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PatientButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Patient().show();
    }// GEN-LAST:event_PatientButtonActionPerformed

    private void DoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DoctorButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Doctor().show();
    }// GEN-LAST:event_DoctorButtonActionPerformed

    private void RoomButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RoomButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Room().show();
    }// GEN-LAST:event_RoomButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_ExitActionPerformed

    private void LabButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LabButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Lab().show();
    }// GEN-LAST:event_LabButton1ActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Back1ActionPerformed
        // TODO add your handling code here:

        this.hide();
        new Patient_Release().show();

    }// GEN-LAST:event_Back1ActionPerformed

    private void ENDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ENDActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Welcome().show();
    }// GEN-LAST:event_ENDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        new Treatment().show();
    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton DoctorButton;
    private javax.swing.JButton END;
    private javax.swing.JButton Exit;
    private javax.swing.JButton LabButton1;
    private javax.swing.JButton PatientButton;
    private javax.swing.JButton RoomButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
