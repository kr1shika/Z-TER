package ZTERmodel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author haseena
 */
<<<<<<< HEAD
import java.awt.Color;
=======
//import ZTERmodel.Imageicon;
import view.*;
import ZTERmodel.database;
import java.awt.Dimension;
>>>>>>> origin/Haseena
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
<<<<<<< HEAD
=======
import java.io.BufferedOutputStream;
>>>>>>> origin/Haseena
import java.io.ByteArrayOutputStream;
import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
<<<<<<< HEAD
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.JTableHeader;
=======
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
>>>>>>> origin/Haseena

//import image.image;

public class AddMovies extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    DefaultTableModel dtm = null;
     DefaultTableModel model = new DefaultTableModel(); 
    /**
     * Creates new form AddMovies
     */
    public AddMovies() {
        initComponents();
        populateTable();
        
        tblmoviecollection.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent event) {
        if (!event.getValueIsAdjusting()) {
            int selectedRow = tblmoviecollection.getSelectedRow();
            if (selectedRow >= 0) {
                DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
                String movieTitle = (String) model.getValueAt(selectedRow, 0);

                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "0212hk");
                    byte[] imageBytes = getImageBytesForMovieTitle(conn, movieTitle);

                    // Display the image in lblimg
                    if (imageBytes != null) {
                        ImageIcon imageIcon = new ImageIcon(imageBytes);
                        lblimg.setIcon(imageIcon);
                    } else {
                        lblimg.setIcon(null);
                    }

                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error retrieving image");
                }
            }
        }
    }
});
        


        tblmoviecollection.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int selectedRow = tblmoviecollection.getSelectedRow();
                if (selectedRow >= 0) {

                    String movieTitle = tblmoviecollection.getValueAt(selectedRow, 0).toString();
                    String genre = tblmoviecollection.getValueAt(selectedRow, 1).toString();
                    String duration = tblmoviecollection.getValueAt(selectedRow, 2).toString();
                    String publishDate = tblmoviecollection.getValueAt(selectedRow, 3).toString();

                    lblimg.setText(movieTitle);
                    txtMovieTitle.setText(movieTitle);
                    txtgenre.setText(genre);
                    txtDuration.setText(duration);
                    txtPublishDate.setText(publishDate);
                }
            }
        });

    }

    private void populateTable() {
<<<<<<< HEAD
        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "0212hk");

            String selectSql = "SELECT * FROM movietable";
            PreparedStatement selectStatement = conn.prepareStatement(selectSql);
=======
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "0212hk");

        String selectSql = "SELECT * FROM movietable";
        PreparedStatement selectStatement = conn.prepareStatement(selectSql);
>>>>>>> origin/Haseena

        ResultSet resultSet = selectStatement.executeQuery();

        DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
        model.setRowCount(0);

<<<<<<< HEAD
            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getString("MovieTitle"),
                    resultSet.getString("Genre"),
                    resultSet.getString("Duration"),
                    resultSet.getDate("PublishDate")
                };
                model.addRow(rowData);
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
=======
        while (resultSet.next()) {
            Object[] rowData = {
                resultSet.getString("MovieTitle"),
                resultSet.getString("Genre"),
                resultSet.getString("Duration"),
                resultSet.getDate("PublishDate")
            };
            model.addRow(rowData);
>>>>>>> origin/Haseena
        }

        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
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

        lblMovieTitle = new javax.swing.JLabel();
        txtMovieTitle = new javax.swing.JTextField();
        lblGenre = new javax.swing.JLabel();
        txtgenre = new javax.swing.JTextField();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        txtPublishDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        img_import = new javax.swing.JButton();
        btninsertandview = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblmoviecollection = new javax.swing.JTable();
        btndelete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMovieTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/MOVIE TITLE_.png"))); // NOI18N
        getContentPane().add(lblMovieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        txtMovieTitle.setBorder(null);
        txtMovieTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovieTitleActionPerformed(evt);
            }
        });
        getContentPane().add(txtMovieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 483, 240, 30));

        lblGenre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/GENRE_.png"))); // NOI18N
        getContentPane().add(lblGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 535, 60, 50));

        txtgenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenreActionPerformed(evt);
            }
        });
        getContentPane().add(txtgenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 240, 30));

        lblDuration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/DURATION_.png"))); // NOI18N
        getContentPane().add(lblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, -1));

        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });
        getContentPane().add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 240, 30));

        txtPublishDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPublishDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtPublishDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 240, 30));

<<<<<<< HEAD
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/SHOWING DATE_.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 665, -1, -1));
        getContentPane().add(lblimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 170, 220));
=======
        jLabel4.setText("PublishDate");
>>>>>>> origin/Haseena

        img_import.setText("Import");
        img_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_importActionPerformed(evt);
            }
        });
        getContentPane().add(img_import, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        btninsertandview.setText("insert");
        btninsertandview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertandviewActionPerformed(evt);
            }
        });
        getContentPane().add(btninsertandview, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 720, -1, -1));

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 720, -1, -1));

        tblmoviecollection.setBackground(new java.awt.Color(46, 74, 81));
        tblmoviecollection.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        tblmoviecollection.setForeground(new java.awt.Color(255, 255, 255));
        tblmoviecollection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MovieTitle", "Genre", "Duration", "PublishDate"
            }
        ));
<<<<<<< HEAD
        tblmoviecollection.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblmoviecollection.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        tblmoviecollection.setGridColor(new java.awt.Color(0, 153, 153));
        tblmoviecollection.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblmoviecollection.setShowGrid(true);
=======
        tblmoviecollection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmoviecollectionMouseClicked(evt);
            }
        });
>>>>>>> origin/Haseena
        jScrollPane3.setViewportView(tblmoviecollection);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 690, 520));

        btndelete.setText("delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 720, -1, -1));

<<<<<<< HEAD
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Admin icon.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 20, 60, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Customer.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Edit streaming.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 160, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Available movies.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/home/haseena/Downloads/movie ticketing/Add Movie.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 120, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/boader.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 190, 235));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/table.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 750, 566));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/dataentry.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 576, 566));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Add movie.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1480, 640));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/BGBG.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 800));
=======
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(106, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btninsertandview)
                                .addGap(23, 23, 23)
                                .addComponent(btnupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMovieTitle)
                                    .addComponent(lblGenre)
                                    .addComponent(lblDuration))
                                .addGap(19, 19, 19)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPublishDate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgenre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMovieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(56, 56, 56))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(img_import)
                        .addGap(24, 24, 24)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img_import, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMovieTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMovieTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtgenre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDuration, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDuration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPublishDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btninsertandview)
                            .addComponent(btnupdate))
                        .addContainerGap())
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
>>>>>>> origin/Haseena

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPublishDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublishDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPublishDateActionPerformed

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationActionPerformed

    private void img_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_importActionPerformed

        JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Select an image file");

    int result = fileChooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "0212hk")) {
            byte[] imageBytes = Files.readAllBytes(selectedFile.toPath());

            String sql = "INSERT INTO movietable (image) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBytes(1, imageBytes);

            System.out.println("Image imported and stored in the database successfully.");

            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            Image scaledImage = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            lblimg.setIcon(new ImageIcon(scaledImage));
            lblimg.setPreferredSize(new Dimension(200, 200));
            lblimg.setMaximumSize(new Dimension(200, 200));
            lblimg.setMinimumSize(new Dimension(200, 200));
            lblimg.setHorizontalAlignment(SwingConstants.CENTER);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }


    }//GEN-LAST:event_img_importActionPerformed

    private void txtgenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenreActionPerformed

    private void txtMovieTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovieTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovieTitleActionPerformed

    private byte[] convertImageToByteArray(Image image) {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, 0, 0, null);
        g2.dispose();
        ImageIO.write(bufferedImage, "jpg", baos);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return baos.toByteArray();
}
    
    private void btninsertandviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertandviewActionPerformed
<<<<<<< HEAD
String movieTitle = txtMovieTitle.getText();
    String genre = txtgenre.getText();
    String duration = txtDuration.getText();
    String publishDate = txtPublishDate.getText();
    byte[] imageBytes = null;

    Icon imageIcon = lblimg.getIcon();
    if (imageIcon != null && imageIcon instanceof ImageIcon) {
        ImageIcon image = (ImageIcon) imageIcon;
        imageBytes = convertImageToByteArray(image.getImage());
    } else {
        JOptionPane.showMessageDialog(this, "Image missing");
        return;
    }

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "0212hk");

        String sql = "INSERT INTO movietable (MovieTitle, Genre, Duration, PublishDate, image) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, movieTitle);
        statement.setString(2, genre);
        statement.setString(3, duration);
        statement.setDate(4, java.sql.Date.valueOf(publishDate));
        statement.setBytes(5, imageBytes);

        int affectedRows = statement.executeUpdate();

        if (affectedRows > 0) {
            DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
            model.addRow(new Object[]{movieTitle, genre, duration, java.sql.Date.valueOf(publishDate)});

            JOptionPane.showMessageDialog(this, "Data inserted successfully");
        }

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error inserting data");
=======
Connection conn = database.dbConn();
    if (conn != null) {
        try {
            String movieTitle = txtMovieTitle.getText();
            String genre = txtgenre.getText();
            String duration = txtDuration.getText();
            String publishDate = txtPublishDate.getText();

            // Retrieve the image data from the label
            Icon icon = lblimg.getIcon();
            if (icon instanceof ImageIcon) {
                Image image = ((ImageIcon) icon).getImage();
                BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2 = bufferedImage.createGraphics();
                g2.drawImage(image, 0, 0, null);
                g2.dispose();

                // Convert the buffered image to bytes
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(bufferedImage, "png", baos);
                byte[] imageBytes = baos.toByteArray();

                String sql = "INSERT INTO movietable (MovieTitle, Genre, Duration, PublishDate, image) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, movieTitle);
                statement.setString(2, genre);
                statement.setString(3, duration);
                statement.setString(4, publishDate);
                statement.setBytes(5, imageBytes);

                statement.executeUpdate();
                System.out.println("Data inserted successfully.");

                // Update 
                // ...
            } else {
                System.out.println("No image selected.");
            }
        } catch (SQLException | IOException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    } else {
        System.out.println("Failed to establish database connection.");
>>>>>>> origin/Haseena
    }

    }//GEN-LAST:event_btninsertandviewActionPerformed

<<<<<<< HEAD
    private byte[] getImageBytesForMovieTitle(Connection conn, String movieTitle) throws SQLException {
    String sql = "SELECT image FROM movietable WHERE MovieTitle=?";
    PreparedStatement statement = conn.prepareStatement(sql);
    statement.setString(1, movieTitle);
    ResultSet resultSet = statement.executeQuery();
    if (resultSet.next()) {
        return resultSet.getBytes("image");
    }
    return null;
}
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
 int selectedRow = tblmoviecollection.getSelectedRow();
    if (selectedRow >= 0) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "0212hk");

            // update gareko data lai linene new variables ma 
=======
    
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
 int selectedRow = tblmoviecollection.getSelectedRow();
    if (selectedRow >= 0) {
        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to make changes?");
        if (confirm == JOptionPane.YES_OPTION) {

>>>>>>> origin/Haseena
            String updatedMovieTitle = txtMovieTitle.getText();
            String updatedGenre = txtgenre.getText();
            String updatedDuration = txtDuration.getText();
            String updatedPublishDate = txtPublishDate.getText();

<<<<<<< HEAD
            // user le lekhako data lai SQL formate ma convert garne
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsedDate = dateFormat.parse(updatedPublishDate);
            java.sql.Date updatedPublishDateSql = new java.sql.Date(parsedDate.getTime());
=======
            tblmoviecollection.setValueAt(updatedMovieTitle, selectedRow, 0);
            tblmoviecollection.setValueAt(updatedGenre, selectedRow, 1);
            tblmoviecollection.setValueAt(updatedDuration, selectedRow, 2);
            tblmoviecollection.setValueAt(updatedPublishDate, selectedRow, 3);

            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "0212hk");
                String updateSql = "UPDATE movietable SET MovieTitle=?, Genre=?, Duration=?, PublishDate=?, image=? WHERE MovieTitle=?";
                PreparedStatement updateStatement = conn.prepareStatement(updateSql);
                updateStatement.setString(1, updatedMovieTitle);
                updateStatement.setString(2, updatedGenre);
                updateStatement.setString(3, updatedDuration);
                updateStatement.setString(4, updatedPublishDate);

           
                Icon icon = lblimg.getIcon();
                if (icon instanceof ImageIcon) {
                    Image image = ((ImageIcon) icon).getImage();

                
                    BufferedImage bufferedImage = new BufferedImage(
                            image.getWidth(null),
                            image.getHeight(null),
                            BufferedImage.TYPE_INT_ARGB);
                    Graphics2D g = bufferedImage.createGraphics();
                    g.drawImage(image, 0, 0, null);
                    g.dispose();

           
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    try {
                        ImageIO.write(bufferedImage, "png", baos);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    byte[] imageData = baos.toByteArray();
                    updateStatement.setBytes(5, imageData);
                } else {
                    updateStatement.setNull(5, Types.BLOB);
                }

                updateStatement.setString(6, updatedMovieTitle);
                updateStatement.executeUpdate();
>>>>>>> origin/Haseena

            // table ko data update garna ko lagi 
            String updateSql = "UPDATE movietable SET MovieTitle=?, Genre=?, Duration=?, PublishDate=? WHERE Movie_id=?";
            PreparedStatement updateStatement = conn.prepareStatement(updateSql);
            updateStatement.setString(1, updatedMovieTitle);
            updateStatement.setString(2, updatedGenre);
            updateStatement.setString(3, updatedDuration);
            updateStatement.setDate(4, updatedPublishDateSql);
            updateStatement.setInt(5, selectedRow + 1); // Assuming the movie ID starts from 1
            updateStatement.executeUpdate();
            
            
            //database ma update gareko image 
            ImageIcon currentImageIcon = (ImageIcon) lblimg.getIcon();
            if (currentImageIcon != null) {
                Image currentImage = currentImageIcon.getImage();
                BufferedImage bufferedImage = new BufferedImage(currentImage.getWidth(null), currentImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
                Graphics2D graphics = bufferedImage.createGraphics();
                graphics.drawImage(currentImage, 0, 0, null);
                graphics.dispose();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(bufferedImage, "jpg", baos);
                byte[] imageBytes = baos.toByteArray();

                String updateImageSql = "UPDATE movietable SET Image=? WHERE Movie_id=?";
                PreparedStatement updateImageStatement = conn.prepareStatement(updateImageSql);
                updateImageStatement.setBytes(1, imageBytes);
                updateImageStatement.setInt(2, selectedRow + 1); 
                updateImageStatement.executeUpdate();
            }
DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
            
           //selected row to value table row bata select garne 
            model.setValueAt(updatedMovieTitle, selectedRow, 0);
            model.setValueAt(updatedGenre, selectedRow, 1);
            model.setValueAt(updatedDuration, selectedRow, 2);
            model.setValueAt(updatedPublishDate, selectedRow, 3);

            conn.close();
            JOptionPane.showMessageDialog(this, "Successfully updated data");
        } catch (SQLException | ParseException | IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating data");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No row selected");
    }
<<<<<<< HEAD

=======
        
>>>>>>> origin/Haseena
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
         int selectedRow = tblmoviecollection.getSelectedRow();
    if (selectedRow >= 0) {
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this movie?");
        if (confirm == JOptionPane.YES_OPTION) {
            String movieTitle = tblmoviecollection.getValueAt(selectedRow, 0).toString();

            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "0212hk");
                String deleteSql = "DELETE FROM movietable WHERE MovieTitle=?";
                PreparedStatement deleteStatement = conn.prepareStatement(deleteSql);
                deleteStatement.setString(1, movieTitle);
                deleteStatement.executeUpdate();

                DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
                model.removeRow(selectedRow);

                System.out.println("Movie deleted successfully.");
            } catch (SQLException ex) {
                System.out.println("Error deleting movie: " + ex.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a movie to delete.", "No Movie Selected", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void tblmoviecollectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmoviecollectionMouseClicked
    
    }//GEN-LAST:event_tblmoviecollectionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMovies().setVisible(true);

            }
        });
    }
<<<<<<< HEAD


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
=======
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
>>>>>>> origin/Haseena
    private javax.swing.JButton btninsertandview;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton img_import;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblMovieTitle;
    private javax.swing.JLabel lblimg;
    private javax.swing.JTable tblmoviecollection;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtMovieTitle;
    private javax.swing.JTextField txtPublishDate;
    private javax.swing.JTextField txtgenre;
    // End of variables declaration//GEN-END:variables

}
