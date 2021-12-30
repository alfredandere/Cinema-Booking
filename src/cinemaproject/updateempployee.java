/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author My PC
 */
public class updateempployee extends javax.swing.JFrame {

    /**
     * Creates new form Createaccount
     */
        public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
            System.out.print("Connected To Database");

        } catch (Exception e) {
            System.out.println("Database connection error:   " + e.getMessage());
        }

        return con;
    }
    public void UpdateEmployee(){
        String Mname =firstnametextbox.getText();
        String salary =lastnametextbox.getText();
          PreparedStatement ps;
        String query = "UPDATE login SET salary=? where name =? ";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, salary);
            ps.setString(2, Mname);
          
            if (ps.executeUpdate() > 0) {
               JOptionPane option = new JOptionPane();
                option.showMessageDialog(null, "Employee Data Updated");
                ManageAccount L = new ManageAccount ();
                L.setVisible(true);
                 this.setVisible(false);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
               JOptionPane option = new JOptionPane();
                option.showMessageDialog(null, "Error with Employee Data Updated"+ex);
        }

        
    }
    public updateempployee() {
        initComponents();
         setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        fillnamelabel = new javax.swing.JLabel();
        lastnametextbox = new javax.swing.JTextField();
        lastnamelabel1 = new javax.swing.JLabel();
        firstnametextbox = new javax.swing.JTextField();
        signupbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Employee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 190, 30));

        fillnamelabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fillnamelabel.setForeground(new java.awt.Color(255, 255, 255));
        fillnamelabel.setText("Full Name");
        jPanel1.add(fillnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lastnametextbox.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(lastnametextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 297, -1));

        lastnamelabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lastnamelabel1.setForeground(new java.awt.Color(255, 255, 255));
        lastnamelabel1.setText("Salary");
        jPanel1.add(lastnamelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        firstnametextbox.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(firstnametextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 297, -1));

        signupbutton.setBackground(new java.awt.Color(153, 0, 0));
        signupbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signupbutton.setText("Update");
        signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(signupbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 410));

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

    private void signupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbuttonActionPerformed
        // TODO add your handling code here:
        UpdateEmployee();
    }//GEN-LAST:event_signupbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(updateempployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateempployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateempployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateempployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateempployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fillnamelabel;
    private javax.swing.JTextField firstnametextbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnamelabel1;
    private javax.swing.JTextField lastnametextbox;
    private javax.swing.JButton signupbutton;
    // End of variables declaration//GEN-END:variables
}