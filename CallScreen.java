/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package police;

/**
 *
 * @author user
 */
public class CallScreen extends javax.swing.JFrame {
   
    /**
     * Creates new form CallScreen
     */
    public CallScreen() {
        initComponents();
         }

    
    void callphonecitizen(String phone)
    {
        txt.setText(phone);
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
        EndCall = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        second = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EndCall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/images/icons8_end_call_50px.png"))); // NOI18N
        EndCall.setText("jLabel10");
        EndCall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EndCallMouseClicked(evt);
            }
        });
        jPanel1.add(EndCall, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 50, 60));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("End Call");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 326, -1, -1));

        txt.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setText(" ");
        jPanel1.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 98, 161, 35));

        hour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hour.setForeground(new java.awt.Color(255, 255, 255));
        hour.setText("0:");
        jPanel1.add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 20, 20));

        minute.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        minute.setForeground(new java.awt.Color(255, 255, 255));
        minute.setText(" 00 :");
        jPanel1.add(minute, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, 20));

        second.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        second.setForeground(new java.awt.Color(255, 255, 255));
        second.setText("  00");
        jPanel1.add(second, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 30, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EndCallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndCallMouseClicked
        
        
        
        
        CallCitizen.situation=false;
        
          CallScreen.second.setText("00" );
          CallScreen.minute.setText("00:"); 
          CallScreen.hour.setText("00:");
                           
        
        
        this.dispose();
        
        
       
                
        
        
       
    }//GEN-LAST:event_EndCallMouseClicked

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
            java.util.logging.Logger.getLogger(CallScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CallScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CallScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CallScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CallScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EndCall;
    public static javax.swing.JLabel hour;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel minute;
    public static javax.swing.JLabel second;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
