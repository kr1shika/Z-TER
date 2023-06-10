
package z_ter_land;

//imports
import javax.swing.JFrame;
import java.awt.Image;
import java.io.File;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.ImageIcon;

public class Landing101 extends javax.swing.JFrame {

    /**
     * Creates new form Landing101
     */
    public Landing101() {
        initComponents();
        show(position);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    int position=0;
 
public String[] takeImage()
{
    File f= new File(getClass().getResource("/posters").getFile());
    String[] Images= f.list();
    return Images;
}

public void show(int index) {
        String[] images = takeImage();
        String img = images[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/posters/" + img));
        Image image = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 25, 25), 1, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" LOGIN");
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 80, 30));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setBorder(null);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgpaper.png"))); // NOI18N
        bg_label.setMaximumSize(new java.awt.Dimension(1477, 780));
        bg_label.setPreferredSize(new java.awt.Dimension(1477, 795));
        jScrollPane2.setViewportView(bg_label);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1480, -1));

        pack();
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
            try{
                Thread.sleep(100);
                
            }catch(InterruptedException ex){
                Logger.getLogger(Landing101.class.getName()).log(Level.SEVERE,null,ex);
            }
            int p=this.label.getX();
            
            if (p>-1){
                
                Animacion.Animacion.mover_izquierda(900,915,1,2,label);
            }
            position = position+1;
            if(position>=takeImage().length){
                position=takeImage().length-1;
            }
            show(position);
    }//GEN-LAST:event_nextMousePressed

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel next;
    // End of variables declaration//GEN-END:variables
}
