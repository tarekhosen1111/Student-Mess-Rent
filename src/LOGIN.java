

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
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
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

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtcheck = new javax.swing.JTextField();
        txtsusername = new javax.swing.JTextField();
        txtspassword = new javax.swing.JPasswordField();
        btnslogin = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setMinimumSize(new java.awt.Dimension(939, 491));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jButton2.setText("Contact Us");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 190, 50));

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jButton1.setText("Forget Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 210, 50));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jLabel9.setText("System");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 240, 70));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jLabel3.setText("Student Mess Management ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 850, 70));

        btnregister.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        btnregister.setText(" Register Now!!");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 220, 50));

        jPanel1.setBackground(new java.awt.Color(204, 153, 0,80));

        txtcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcheckActionPerformed(evt);
            }
        });

        txtsusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsusernameActionPerformed(evt);
            }
        });

        txtspassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspasswordActionPerformed(evt);
            }
        });

        btnslogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        btnslogin.setText("LOG IN");
        btnslogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsloginActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Admin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        jLabel7.setText("Username :");

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        jLabel8.setText("Passwords :");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel2.setText("   LOG IN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsusername, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtspassword, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnslogin)
                        .addGap(222, 222, 222))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtspassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnslogin)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 590, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\w3.3.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        setSize(new java.awt.Dimension(1082, 631));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtsusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsusernameActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        Register reg = new Register();
        reg.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregisterActionPerformed

    private void btnsloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsloginActionPerformed
        // TODO add your handling code here:
        String username =txtsusername.getText();
        String password =txtspassword.getText();
        String check=txtcheck.getText();
        String a="Student";
        if(username.isEmpty()||password.isEmpty()||check.isEmpty()){
            JOptionPane.showMessageDialog(this,"Every Field Must Be Filled Up !!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
                if(check.equals(a)){
                    insert = con1.prepareStatement("Select * from users WHERE username = ? AND password = ?");
                }
                else{
                    insert = con1.prepareStatement("Select * from owners WHERE username = ? AND password = ?");
                }
           // insert = con1.prepareStatement("Select * from users WHERE username = ? AND password = ?");
            insert.setString(1,username);
            insert.setString(2,password);
            
            
            ResultSet res = insert.executeQuery();
            if(res.next()){
                if(check.equals(a)){
                    dispose();
                    SDashboard d = new SDashboard();
                    d.setVisible(true);
                }
                else{
                    dispose();
                    ODashboard d = new ODashboard();
                    d.setVisible(true);
                }
               
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Username / Password not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnsloginActionPerformed
        Connection con1;
        PreparedStatement insert;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ContactUs reg = new ContactUs();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ForgetPassword reg = new ForgetPassword();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         String selected=jComboBox1.getSelectedItem().toString();
        txtcheck.setText(selected);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcheckActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnslogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcheck;
    private javax.swing.JPasswordField txtspassword;
    private javax.swing.JTextField txtsusername;
    // End of variables declaration//GEN-END:variables
}
