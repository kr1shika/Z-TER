/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ZTERmodel;

import view.AddMovies;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.ImageIcon;

/**
 *
 * @author haseena
 */
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frstpanel = new javax.swing.JPanel();
        lbl_Zter = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        Profile_btn = new javax.swing.JButton();
        fstMovie_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SecMovie_btn = new javax.swing.JButton();
        TrdMovie_btn = new javax.swing.JButton();
        EghMovie_btn = new javax.swing.JButton();
        FourthMovie_btn = new javax.swing.JButton();
        fifthMovie_btn = new javax.swing.JButton();
        sixthMovie_btn = new javax.swing.JButton();
        SeventhMovie_btn = new javax.swing.JButton();
        NinethMovies_btn = new javax.swing.JButton();
        TenthMovie_btn = new javax.swing.JButton();
        collectMovie_lbl = new javax.swing.JLabel();
        Availablemovie_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Main frame"); // NOI18N
        getContentPane().setLayout(new java.awt.FlowLayout());

        frstpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Zter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Z-TER.png"))); // NOI18N
        frstpanel.add(lbl_Zter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 90, 60));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/movie-projector 2.png"))); // NOI18N
        frstpanel.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 80));

        Profile_btn.setBackground(new java.awt.Color(0, 0, 0));
        Profile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Admin icon.png"))); // NOI18N
        Profile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Profile_btnActionPerformed(evt);
            }
        });
        frstpanel.add(Profile_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 60, 60));

        fstMovie_btn.setIcon(new javax.swing.ImageIcon("/home/haseena/Downloads/movie ticketing/tarMOviename.png")); // NOI18N
        fstMovie_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fstMovie_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fstMovie_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fstMovie_btnMouseEntered(evt);
            }
        });
        fstMovie_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fstMovie_btnActionPerformed(evt);
            }
        });
        frstpanel.add(fstMovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Add Movie.png"))); // NOI18N
        frstpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Available movies.png"))); // NOI18N
        frstpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Edit streaming.png"))); // NOI18N
        frstpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 170, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZTERmodel/Customer.png"))); // NOI18N
        frstpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 100, 30));

        SecMovie_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/the-handmaiden-movie-poster 1.png"))); // NOI18N
        SecMovie_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecMovie_btnMouseClicked(evt);
            }
        });
        SecMovie_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecMovie_btnActionPerformed(evt);
            }
        });
        frstpanel.add(SecMovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 200, 230));

        TrdMovie_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Shin kamen rider 1.png"))); // NOI18N
        TrdMovie_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrdMovie_btnMouseClicked(evt);
            }
        });
        TrdMovie_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrdMovie_btnActionPerformed(evt);
            }
        });
        frstpanel.add(TrdMovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 190, 230));

        EghMovie_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Exo.png"))); // NOI18N
        EghMovie_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EghMovie_btnMouseClicked(evt);
            }
        });
        frstpanel.add(EghMovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 200, 280));

        FourthMovie_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/doctor-strange-in-the-universe-of-madness-i127944 2.png"))); // NOI18N
        FourthMovie_btn.setText("jButton9");
        FourthMovie_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FourthMovie_btnMouseClicked(evt);
            }
        });
        frstpanel.add(FourthMovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 170, 250));

        fifthMovie_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/kill-bill-vol-1-md-web 1.png"))); // NOI18N
        fifthMovie_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fifthMovie_btnMouseClicked(evt);
            }
        });
        frstpanel.add(fifthMovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 160, 240));

        sixthMovie_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/poster (4) 3.png"))); // NOI18N
        sixthMovie_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixthMovie_btnMouseClicked(evt);
            }
        });
        frstpanel.add(sixthMovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 190, 280));

        SeventhMovie_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/section 1.png"))); // NOI18N
        SeventhMovie_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeventhMovie_btnMouseClicked(evt);
            }
        });
        frstpanel.add(SeventhMovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 200, 280));

        NinethMovies_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Hannibal 1.png"))); // NOI18N
        NinethMovies_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NinethMovies_btnMouseClicked(evt);
            }
        });
        frstpanel.add(NinethMovies_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 190, 280));

        TenthMovie_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/slenderman 1.png"))); // NOI18N
        TenthMovie_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TenthMovie_btnMouseClicked(evt);
            }
        });
        frstpanel.add(TenthMovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, 170, 270));

        collectMovie_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Dashboardlessvisible.png"))); // NOI18N
        collectMovie_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collectMovie_lblMouseClicked(evt);
            }
        });
        frstpanel.add(collectMovie_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1100, 620));

        Availablemovie_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/playing.png"))); // NOI18N
        frstpanel.add(Availablemovie_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 760));

        getContentPane().add(frstpanel);

        setSize(new java.awt.Dimension(1129, 782));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Profile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Profile_btnActionPerformed
        Profile p = new Profile();
        p.setVisible(true);
    }//GEN-LAST:event_Profile_btnActionPerformed

    private void fstMovie_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fstMovie_btnActionPerformed
       
    }//GEN-LAST:event_fstMovie_btnActionPerformed

    private void SecMovie_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecMovie_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecMovie_btnActionPerformed

    private void TrdMovie_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrdMovie_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrdMovie_btnActionPerformed

    private void fstMovie_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fstMovie_btnMouseEntered

    }//GEN-LAST:event_fstMovie_btnMouseEntered

    private void fstMovie_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fstMovie_btnMouseClicked
         ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_fstMovie_btnMouseClicked

    private void collectMovie_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collectMovie_lblMouseClicked
                 ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_collectMovie_lblMouseClicked

    private void TrdMovie_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrdMovie_btnMouseClicked
                 ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_TrdMovie_btnMouseClicked

    private void FourthMovie_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FourthMovie_btnMouseClicked
                 ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_FourthMovie_btnMouseClicked

    private void fifthMovie_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fifthMovie_btnMouseClicked
         ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_fifthMovie_btnMouseClicked

    private void sixthMovie_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixthMovie_btnMouseClicked
         ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_sixthMovie_btnMouseClicked

    private void SeventhMovie_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeventhMovie_btnMouseClicked
         ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_SeventhMovie_btnMouseClicked

    private void EghMovie_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EghMovie_btnMouseClicked
          ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_EghMovie_btnMouseClicked

    private void NinethMovies_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NinethMovies_btnMouseClicked
   ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_NinethMovies_btnMouseClicked

    private void TenthMovie_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TenthMovie_btnMouseClicked
   ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_TenthMovie_btnMouseClicked

    private void SecMovie_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecMovie_btnMouseClicked
           ImageIcon icon = new ImageIcon(getClass().getResource("movie-projector 2.png"));
    
    // Display a JOptionPane with a message and custom icon
    JOptionPane.showMessageDialog(this, "Button clicked", "Movie info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_SecMovie_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Availablemovie_btn;
    private javax.swing.JButton EghMovie_btn;
    private javax.swing.JButton FourthMovie_btn;
    private javax.swing.JButton NinethMovies_btn;
    private javax.swing.JButton Profile_btn;
    private javax.swing.JButton SecMovie_btn;
    private javax.swing.JButton SeventhMovie_btn;
    private javax.swing.JButton TenthMovie_btn;
    private javax.swing.JButton TrdMovie_btn;
    private javax.swing.JLabel collectMovie_lbl;
    private javax.swing.JButton fifthMovie_btn;
    private javax.swing.JPanel frstpanel;
    private javax.swing.JButton fstMovie_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_Zter;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JButton sixthMovie_btn;
    // End of variables declaration//GEN-END:variables
}

