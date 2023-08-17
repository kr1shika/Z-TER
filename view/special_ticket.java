package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFrame;
import model.reciept_model;
/**
 *
 * @author acer
 */
public class special_ticket extends javax.swing.JFrame {
    private reciept_model rm1;

    /**
     * Creates new form special_ticket
     */
    public special_ticket(reciept_model rm1) {
        initComponents();
        this.rm1 = rm1;
        updateLabels();
    }

    private void updateLabels() {
    if (rm1 != null) {
        String title = rm1.getTitle();
        String date = rm1.getShowing_date();
        String showtime=rm1.getShowtime();
        title_label.setText(title);
        showing_date_label.setText(date);
       showtime_label.setText(showtime);

    }
}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        title_label = new javax.swing.JLabel();
        showing_date_label = new javax.swing.JLabel();
        showtime_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        generatePDFButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1021, 328));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MOVIE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 45, 80, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SHOW DATE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 98, 110, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 156, 70, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLASS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 215, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("4th Floor NLIC City Center Mall, 33, Kamalpokhari");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 460, -1));

        title_label.setForeground(new java.awt.Color(255, 255, 255));
        title_label.setText("TITLE");
        getContentPane().add(title_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 45, 90, -1));

        showing_date_label.setForeground(new java.awt.Color(255, 255, 255));
        showing_date_label.setText("SHOWING_DATE");
        getContentPane().add(showing_date_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 98, 110, -1));

        showtime_label.setForeground(new java.awt.Color(255, 255, 255));
        showtime_label.setText("TIME");
        getContentPane().add(showtime_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 156, 220, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SPECIAL");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 215, 160, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MORE INFO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SCAN HERE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 120, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        generatePDFButton.setBackground(new java.awt.Color(102, 102, 102));
        generatePDFButton.setForeground(new java.awt.Color(255, 255, 255));
        generatePDFButton.setText("DOWNLOAD PDF");
        generatePDFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePDFButtonActionPerformed(evt);
            }
        });
        getContentPane().add(generatePDFButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 160, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/special_ticket1.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private BufferedImage captureScreenshot(JFrame frame) {
    BufferedImage screenshot = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics = screenshot.createGraphics();
    frame.paint(graphics);
    graphics.dispose();
    return screenshot;
}
private void generatePDF() {
    Document document = new Document();
    try {
        generatePDFButton.setVisible(false);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("ticket.pdf"));
        document.open();
        
        // Capture the screenshot of the JFrame form
        BufferedImage screenshot = captureScreenshot(this); // Replace 'frame' with the reference to your JFrame instance

        // Create an Image instance from the screenshot
        Image image = Image.getInstance(writer, screenshot, 1.0f);
        image.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());

        // Add the image to the PDF document
        document.add(image);

        document.close();
        System.out.println("PDF generated successfully!");
        generatePDFButton.setVisible(true);
    } catch (DocumentException | IOException e) {
        e.printStackTrace();
    }
}

    
    
    private void generatePDFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePDFButtonActionPerformed
        // TODO add your handling code here:
        generatePDF();
    }//GEN-LAST:event_generatePDFButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        av_movies av1=new av_movies();
        av1.show();
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(special_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(special_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(special_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(special_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new special_ticket(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generatePDFButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel showing_date_label;
    private javax.swing.JLabel showtime_label;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}