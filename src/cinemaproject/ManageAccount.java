/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaproject;

/**
 *
 * @author My PC
 */
public class ManageAccount extends javax.swing.JFrame {

    /**
     * Creates new form ManageAccount
     */
    public ManageAccount() {
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
        addemployeebutton = new javax.swing.JButton();
        updateemployeebutton1 = new javax.swing.JButton();
        removeemployeebutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 58, 200, -1));

        addemployeebutton.setBackground(new java.awt.Color(153, 153, 153));
        addemployeebutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addemployeebutton.setText("Add Employee");
        addemployeebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployeebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(addemployeebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 214, -1));

        updateemployeebutton1.setBackground(new java.awt.Color(153, 153, 153));
        updateemployeebutton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateemployeebutton1.setText("Update Employee");
        updateemployeebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateemployeebutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(updateemployeebutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 214, -1));

        removeemployeebutton.setBackground(new java.awt.Color(153, 153, 153));
        removeemployeebutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        removeemployeebutton.setText("Employee List and Remove Employee");
        removeemployeebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeemployeebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(removeemployeebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 310, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 551, 410));

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

    private void updateemployeebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateemployeebutton1ActionPerformed
        // TODO add your handling code here:
        updateempployee d = new updateempployee();
        d.setVisible(true);
         this.setVisible(false);
        
    }//GEN-LAST:event_updateemployeebutton1ActionPerformed

    private void removeemployeebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeemployeebuttonActionPerformed
        // TODO add your handling code here:
        ListEmployees m =new ListEmployees();
        m.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_removeemployeebuttonActionPerformed

    private void addemployeebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployeebuttonActionPerformed
        // TODO add your handling code here:
        Addemployee A = new Addemployee();
        A.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_addemployeebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addemployeebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton removeemployeebutton;
    private javax.swing.JButton updateemployeebutton1;
    // End of variables declaration//GEN-END:variables
}