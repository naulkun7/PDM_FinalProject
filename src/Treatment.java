/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Treatment extends javax.swing.JFrame {

    /**
     * Creates new form Treatment
     */
    public Treatment() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable100 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TreatmentDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        TreatmentAdd = new javax.swing.JButton();
        doctorID = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        patientID = new javax.swing.JTextField();
        TreatmentShow1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable101 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable102 = new javax.swing.JTable();
        TreatmentShow2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable100.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Doctor ID"
            }
        ));
        jScrollPane3.setViewportView(jTable100);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Treatment");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Doctor ID");

        TreatmentDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TreatmentDelete.setText("Delete");
        TreatmentDelete.setToolTipText("");
        TreatmentDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatmentDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Patient ID");

        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        TreatmentAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TreatmentAdd.setText("Add");
        TreatmentAdd.setToolTipText("");
        TreatmentAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatmentAddActionPerformed(evt);
            }
        });

        doctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIDActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        TreatmentShow1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TreatmentShow1.setText("Show Treatment");
        TreatmentShow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatmentShow1ActionPerformed(evt);
            }
        });

        jTable101.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Disease"
            }
        ));
        jScrollPane4.setViewportView(jTable101);

        jTable102.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Department"
            }
        ));
        jScrollPane5.setViewportView(jTable102);

        TreatmentShow2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TreatmentShow2.setText("Show Information");
        TreatmentShow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatmentShow2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addGap(97, 97, 97)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(doctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TreatmentDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TreatmentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(TreatmentShow1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(TreatmentShow2)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Back))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(TreatmentDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TreatmentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TreatmentShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TreatmentShow2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TreatmentDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatmentDeleteActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/HDSNEW?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "troixanhmaytrang0412");
            Statement stmt = connection.createStatement();
            stmt.execute("SET foreign_key_checks = 0");
            int row = jTable100.getSelectedRow();
            String value = patientID.getText();

            String  sql = "DELETE FROM patient WHERE PatientID ="+value;
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable100.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "DELETE Complete");
            stmt.execute("SET foreign_key_checks = 1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_TreatmentDeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        patientID.setText("");
        doctorID.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void TreatmentAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatmentAddActionPerformed

        String P_Id = patientID.getText();
        String DoctorId= doctorID.getText();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/HDSNEW?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "troixanhmaytrang0412");

            String  sqlquery = "INSERT INTO treat(PatientID,DoctorID) VALUES ('"+P_Id+"','"+DoctorId+"')";

            PreparedStatement pst = connection.prepareStatement(sqlquery);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Patient Added For Check-Up");

            ////////////////Clear The Text Field

            patientID.setText("");
            doctorID.setText("");
            // this.hide();
            // new login().show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_TreatmentAddActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Admin().show();
    }//GEN-LAST:event_BackActionPerformed

    private void TreatmentShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatmentShow1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable100.getModel();
        model.setRowCount(0);
        
         try{
              
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HDSNEW?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "troixanhmaytrang0412");
   
   
 
       Statement st = connection.createStatement();
       String sql = "select * from treat";
       
       ResultSet rs = st.executeQuery(sql);
           
       while(rs.next()){
           
           String P_Id = String.valueOf(rs.getInt("PatientID"));
           String D_Id = String.valueOf(rs.getString("DoctorID"));
   
  
          
           String tbData[] = {P_Id ,D_Id};
           
           DefaultTableModel tblModel = (DefaultTableModel)jTable100.getModel();
           
           tblModel.addRow(tbData);
           
       }
       
       
        
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_TreatmentShow1ActionPerformed

    private void doctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorIDActionPerformed

    private void TreatmentShow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatmentShow2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable101.getModel();
        model.setRowCount(0);
        
        
        
        try{
              
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HDSNEW?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "troixanhmaytrang0412");
   
   
 
       Statement st = connection.createStatement();
       String sql = "select * from patient";
       
       ResultSet rs = st.executeQuery(sql);
           
       while(rs.next()){
           
           String P_Id = String.valueOf(rs.getInt("PatientID"));
           String Disease = String.valueOf(rs.getString("Disease"));
           
              
          
           String tbData[] = {P_Id, Disease};
           
           DefaultTableModel tblModel = (DefaultTableModel)jTable101.getModel();
           
           tblModel.addRow(tbData);
           
       }
       
       
        
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        //table102
        DefaultTableModel model1 = (DefaultTableModel) jTable102.getModel();
        model1.setRowCount(0);
        
        
        
        try{
              
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HDSNEW?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "troixanhmaytrang0412");
   
   
 
       Statement st = connection.createStatement();
       String sql = "select * from doctor";
       
       ResultSet rs = st.executeQuery(sql);
           
       while(rs.next()){
           
           String D_Id = String.valueOf(rs.getInt("DoctorID"));
           String Department = String.valueOf(rs.getString("Department"));
           
              
          
           String tbData[] = {D_Id, Department};
           
           DefaultTableModel tblModel = (DefaultTableModel)jTable102.getModel();
           
           tblModel.addRow(tbData);
           
       }
       
       
        
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_TreatmentShow2ActionPerformed

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
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treatment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JButton TreatmentAdd;
    private javax.swing.JButton TreatmentDelete;
    private javax.swing.JButton TreatmentShow1;
    private javax.swing.JButton TreatmentShow2;
    private javax.swing.JTextField doctorID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable100;
    private javax.swing.JTable jTable101;
    private javax.swing.JTable jTable102;
    private javax.swing.JTextField patientID;
    // End of variables declaration//GEN-END:variables
}
