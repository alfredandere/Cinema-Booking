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
public class Time extends javax.swing.JFrame {

    /**
     * Creates new form Time
     */
    public Time() {
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
        timebutton1 = new javax.swing.JButton();
        timebutton3 = new javax.swing.JButton();
        timebutton4 = new javax.swing.JButton();
        timebutton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Check Available Operational Time :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        timebutton1.setBackground(new java.awt.Color(204, 204, 204));
        timebutton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        timebutton1.setText("6:00pm - 8:00pm");
        jPanel1.add(timebutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 204, 32));

        timebutton3.setBackground(new java.awt.Color(204, 204, 204));
        timebutton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        timebutton3.setText("10:00pm - 12:00pm");
        jPanel1.add(timebutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 183, 204, 32));

        timebutton4.setBackground(new java.awt.Color(204, 204, 204));
        timebutton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        timebutton4.setText("12:00pm - 2:00am");
        jPanel1.add(timebutton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 226, 204, 32));

        timebutton2.setBackground(new java.awt.Color(204, 204, 204));
        timebutton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        timebutton2.setText("8:00pm - 10:00pm");
        jPanel1.add(timebutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 204, 32));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 480, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Time().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton timebutton1;
    private javax.swing.JButton timebutton2;
    private javax.swing.JButton timebutton3;
    private javax.swing.JButton timebutton4;
    // End of variables declaration//GEN-END:variables
}
