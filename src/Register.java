import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.*;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SHIKHON
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtcheck = new javax.swing.JTextField();
        txtsusername = new javax.swing.JTextField();
        txtsid = new javax.swing.JTextField();
        txtspassword = new javax.swing.JPasswordField();
        txtsaddress = new javax.swing.JTextField();
        txtsemail = new javax.swing.JTextField();
        txtsmobile = new javax.swing.JTextField();
        txtsbanking = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnsregister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Admin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 150, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel3.setText("    Registration");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 360, 60));

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButton3.setText("Back ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 100, 40));

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel18.setText("    Student Mess Management System");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 700, 70));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel9.setText("User Name          :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 210, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel12.setText("Password             :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, 22));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel13.setText("Nid                          :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel14.setText("Address                :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel15.setText("Email                      :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel16.setText("Mobile Number   :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel17.setText("Banking Details :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        txtcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcheckActionPerformed(evt);
            }
        });
        getContentPane().add(txtcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 240, 30));
        getContentPane().add(txtsusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 239, -1));

        txtsid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsidActionPerformed(evt);
            }
        });
        getContentPane().add(txtsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 239, -1));

        txtspassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtspassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 239, -1));
        getContentPane().add(txtsaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 239, -1));

        txtsemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtsemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 239, -1));
        getContentPane().add(txtsmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 239, -1));

        txtsbanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsbankingActionPerformed(evt);
            }
        });
        getContentPane().add(txtsbanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 239, -1));

        jPanel1.setBackground(new java.awt.Color(204, 153, 0,80));

        btnsregister.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnsregister.setText("Register");
        btnsregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(btnsregister, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(btnsregister)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 540, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\w3.4.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        setSize(new java.awt.Dimension(812, 624));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       Connection con1;
       PreparedStatement insert;
    private void btnsregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsregisterActionPerformed
        // TODO add your handling code here:
        
        String id =txtsid.getText();
        String username =txtsusername.getText();
        String password =txtspassword.getText();
        String mobile =txtsmobile.getText();
        String address =txtsaddress.getText();
        String banking =txtsbanking.getText();
        String email =txtsemail.getText();
        String check=txtcheck.getText();
        String a="Student";
        if(check.isEmpty()||username.isEmpty()||password.isEmpty()||banking.isEmpty()||password.isEmpty()||mobile.isEmpty()||address.isEmpty()||email.isEmpty()){
            JOptionPane.showMessageDialog(this,"Every field must be filled.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
                if(check.equals(a)){
                     insert = con1.prepareStatement("insert into users (id,username,password,mobile,address,banking,email)values(?,?,?,?,?,?,?)");
                }
                else{
                     insert = con1.prepareStatement("insert into owners (id,username,password,mobile,address,banking,email)values(?,?,?,?,?,?,?)");
                }
          //  insert = con1.prepareStatement("insert into users (id,username,password,mobile,address,banking,email)values(?,?,?,?,?,?,?)");
            insert.setString(1,id);
            insert.setString(2,username);
            insert.setString(3,password);
            insert.setString(4,mobile);
            insert.setString(5,address);
            insert.setString(6,banking);
            insert.setString(7,email);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registration Completed.");
            
            
            txtsusername.setText("");
            txtsid.setText("");
            txtspassword.setText("");
            txtsmobile.setText("");
            txtsaddress.setText("");
            txtsbanking.setText("");
            txtsemail.setText("");
            txtsusername.requestFocus();
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"You have to change the Username", "Error", JOptionPane.ERROR_MESSAGE);
                java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnsregisterActionPerformed

    private void txtsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsidActionPerformed

    private void txtsemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsemailActionPerformed

    private void txtsbankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsbankingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsbankingActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LOGIN reg = new LOGIN();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcheckActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selected=jComboBox1.getSelectedItem().toString();
        txtcheck.setText(selected);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtspasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtspasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsregister;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcheck;
    private javax.swing.JTextField txtsaddress;
    private javax.swing.JTextField txtsbanking;
    private javax.swing.JTextField txtsemail;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txtsmobile;
    private javax.swing.JPasswordField txtspassword;
    private javax.swing.JTextField txtsusername;
    // End of variables declaration//GEN-END:variables
}