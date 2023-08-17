
package view;

//imports
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Landing101 extends javax.swing.JFrame {


    public Landing101() {
        initComponents();
        setTitle("ZTer");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/movie-projector 2.png")));
        show(position);
        
    }
    int position=0;
 
public String[] takeImage()
{
     try {
        InputStream resourceStream = getClass().getResourceAsStream("/poster");
        if (resourceStream != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(resourceStream));
            List<String> imageList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                imageList.add(line);
            }
            return imageList.toArray(new String[0]);
        } else {
            System.err.println("Resource not found: /poster");
            return new String[0];
        }
    } catch (IOException e) {
        e.printStackTrace();
        return new String[0];
    }
}

public void show(int index) {
    String[] images = takeImage();
    
    if (images != null && index >= 0 && index < images.length) {
        String img = images[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/poster/" + img));
        Image image = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
    } else {
        
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        reg = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        log = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bg_label = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setText("jLpbel2");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 220, 260, 410));

        reg.setBackground(new java.awt.Color(0, 0, 0));
        reg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 25, 25), 1, true));
        reg.setForeground(new java.awt.Color(255, 255, 255));
        reg.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" REGISTER");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        reg.add(jLabel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 120, 30));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backhead.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrowhead.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 390, -1, -1));

        log.setBackground(new java.awt.Color(0, 0, 0));
        log.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 25, 25), 1, true));
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" LOGIN");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        log.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 80, 30));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setBorder(null);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgpaper.png"))); // NOI18N
        bg_label.setMaximumSize(new java.awt.Dimension(1477, 780));
        bg_label.setPreferredSize(new java.awt.Dimension(1477, 795));
        jScrollPane2.setViewportView(bg_label);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1480, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        new Thread();
            try{
                Thread.sleep(100);
                
            }catch(InterruptedException ex){
                Logger.getLogger(Landing101.class.getName()).log(Level.SEVERE,null,ex);
            }
            int p=this.label.getX();
            
            if (p>-1){
                
                Animacion.Animacion.mover_izquierda(900,915,1,2,label);
            }
            position = position-1;
            if(position<0){
                position=0;
            }
            show(position);
            
    }//GEN-LAST:event_backMousePressed

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
        new Thread();
            try {
        Thread.sleep(100);
    } catch (InterruptedException ex) {
        Logger.getLogger(Landing101.class.getName()).log(Level.SEVERE, null, ex);
    }

    int p = this.label.getX();

    if (p > -1) {
        Animacion.Animacion.mover_izquierda(900, 915, 1, 2, label);
    }
    position = position+1;
    if (position>=takeImage().length){
    position= takeImage().length-1;
    }
    show(position);

      
    }//GEN-LAST:event_nextMousePressed

      public void setColor(JPanel p){
    p.setBackground(new Color(24, 28, 31));
}
    public void resetColor(JPanel p1){
    p1.setBackground(new Color(46,74,81));}
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        registration_page reg1= new registration_page();
        reg1.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        login lgg1= new login();
        lgg1.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        resetColor(log);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       resetColor(reg);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        setColor(reg);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        setColor(log);
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(Landing101.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Landing101.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Landing101.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Landing101.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Landing101().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bg_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JPanel log;
    private javax.swing.JLabel next;
    private javax.swing.JPanel reg;
    // End of variables declaration//GEN-END:variables
}
