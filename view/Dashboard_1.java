package view;
import controller.dashboard_controller;
import database.DbConnection;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.sql.Connection;
import java.util.Collections;
import java.util.List;
import java.sql.SQLException;
/**
 *
 * @author haseena
 */
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Dashboard_1 extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard_1() {
       initComponents();
       setTitle("Dashboard");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/movie-projector 2.png")));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                displayRandomImages();
            }
        });

    }
    
    private List<Integer> getMovieIds() {
    dashboard_controller dc= new dashboard_controller();
    return dc.getMovieIds();
}
    
public class getImgIds {

    public static void main(String[] args) {
        dashboard_controller imageController = new dashboard_controller();
        List<Integer> imgIds = imageController.getImgIds();
        
        for (Integer imgId : imgIds) {
            System.out.println("Image ID: " + imgId);
        }
    }
}

private void displayRandomImages() {
    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        // Get the list of img_ids from the database
        List<Integer> imgIds = getMovieIds();

        // Shuffle the imgIds to get a random order
        Collections.shuffle(imgIds);

        // Connect to the database
        conn = DbConnection.dbConnect();

        // Retrieve the first 7 random imgIds from the shuffled list (for 7 JLabels)
        List<Integer> randomImgIds = imgIds.subList(0, Math.min(7, imgIds.size()));

        // Prepare the SQL statement to retrieve the image data
        String sql = "SELECT image FROM image WHERE img_id = ?";
        pstmt = conn.prepareStatement(sql);

        int i = 0;
        for (int imgId : randomImgIds) {
            // Set the parameter value for the imgId
            pstmt.setInt(1, imgId);

            // Execute the query
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Retrieve the image data from the result set
                byte[] imageData = rs.getBytes("image");

                // Convert the image data to an Image object
                ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
                Image image = ImageIO.read(bis);

                // Scale the image to fit the label
                JLabel imageLabel = getImageLabel(i);
                int labelWidth = imageLabel.getWidth();
                int labelHeight = imageLabel.getHeight();
                Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

                // Create an ImageIcon from the scaled image
                ImageIcon icon = new ImageIcon(scaledImage);

                // Set the icon as the image of the label
                imageLabel.setIcon(icon);

                i++;
            }

            // Close the result set
            rs.close();
        }
        
        // Clear remaining labels if there are fewer images
        for (; i < 7; i++) {
            JLabel emptyLabel = getImageLabel(i);
            emptyLabel.setIcon(null);
        }
    } catch (SQLException | IOException e) {
        e.printStackTrace();
    } finally {
        try {
            // Close the prepared statement
            if (pstmt != null) {
                pstmt.close();
            }

            // Close the connection
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




    private JLabel getImageLabel(int index) {
    switch (index) {
        case 0:
            return fstimage;
        case 1:
            return secmovie;
        // Add more cases for additional labels if needed
        case 2:
            return thrdmovie;
        case 3:
            return fourmovie;
        case 4:
            return fifthmovie;
        case 5:
            return sixthmovie;
        case 6:
            return seventhmovie;
//        case 7:
//            return eighthmovie;
            
        default:
            return null;
    }
}

private JLabel getTitleLabel(int index) {
    switch (index) {
        case 0:
            return fstmovietitle;
        // Add more cases for additional labels if needed
        case 1:
            return secmovietile;
      
        case 2:
            return thirdmovietitle;
        case 3:
            return fourthmovietitle;
        case 4:
            return fifthmovietitle;
        case 5:
            return sixthmovietitle;
        case 6:
            return seventhmovietitle;
//        case 7:
//            return eightjmovietitle;
        default:
            return null;
    }
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frstpanel = new javax.swing.JPanel();
        fstimage = new javax.swing.JLabel();
        secmovie = new javax.swing.JLabel();
        fstmovietitle = new javax.swing.JLabel();
        seventhmovie = new javax.swing.JLabel();
        sixthmovie = new javax.swing.JLabel();
        fourmovie = new javax.swing.JLabel();
        fifthmovietitle = new javax.swing.JLabel();
        secmovietile = new javax.swing.JLabel();
        sixthmovietitle = new javax.swing.JLabel();
        fourthmovietitle = new javax.swing.JLabel();
        seventhmovietitle = new javax.swing.JLabel();
        thirdmovietitle = new javax.swing.JLabel();
        thrdmovie = new javax.swing.JLabel();
        fifthmovie = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dashboard_btn = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        pnl_admovie3 = new javax.swing.JPanel();
        lbl_admovie3 = new javax.swing.JLabel();
        edit_screeningpnl = new javax.swing.JPanel();
        lbl_editscreen = new javax.swing.JLabel();
        pnl_avmovie = new javax.swing.JPanel();
        lbl_avmovie = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        menu_lbl = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        logout = new javax.swing.JPanel();
        logout_lbl = new javax.swing.JLabel();
        profile_panel1 = new javax.swing.JPanel();
        profile_lbl1 = new javax.swing.JLabel();
        customer_pnl = new javax.swing.JPanel();
        lbl_customer1 = new javax.swing.JLabel();
        bg_pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Main frame"); // NOI18N
        setResizable(false);

        frstpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fstimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/iibg.png"))); // NOI18N
        fstimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        fstimage.setPreferredSize(new java.awt.Dimension(180, 230));
        fstimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fstimageMouseClicked(evt);
            }
        });
        frstpanel.add(fstimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 210, 260));

        secmovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/iibg.png"))); // NOI18N
        frstpanel.add(secmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 210, 260));

        fstmovietitle.setFont(new java.awt.Font("MathJax_Fraktur", 3, 24)); // NOI18N
        fstmovietitle.setForeground(new java.awt.Color(0, 153, 153));
        frstpanel.add(fstmovietitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 180, 30));

        seventhmovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/iibg.png"))); // NOI18N
        seventhmovie.setText("jLabel5");
        frstpanel.add(seventhmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 200, 250));

        sixthmovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/iibg.png"))); // NOI18N
        frstpanel.add(sixthmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 200, 250));

        fourmovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/iibg.png"))); // NOI18N
        frstpanel.add(fourmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 200, 250));

        fifthmovietitle.setFont(new java.awt.Font("MathJax_Fraktur", 0, 24)); // NOI18N
        fifthmovietitle.setForeground(new java.awt.Color(0, 102, 102));
        frstpanel.add(fifthmovietitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 180, 40));

        secmovietile.setFont(new java.awt.Font("MathJax_Fraktur", 3, 24)); // NOI18N
        secmovietile.setForeground(new java.awt.Color(0, 102, 102));
        frstpanel.add(secmovietile, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 180, 30));

        sixthmovietitle.setFont(new java.awt.Font("MathJax_Math", 3, 24)); // NOI18N
        sixthmovietitle.setForeground(new java.awt.Color(0, 102, 102));
        frstpanel.add(sixthmovietitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, 190, 40));

        fourthmovietitle.setFont(new java.awt.Font("MathJax_Math", 3, 24)); // NOI18N
        fourthmovietitle.setForeground(new java.awt.Color(0, 102, 102));
        frstpanel.add(fourthmovietitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 680, 200, 40));

        seventhmovietitle.setFont(new java.awt.Font("MathJax_Fraktur", 3, 24)); // NOI18N
        seventhmovietitle.setForeground(new java.awt.Color(0, 102, 102));
        frstpanel.add(seventhmovietitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 680, 170, 40));

        thirdmovietitle.setFont(new java.awt.Font("MathJax_Fraktur", 3, 24)); // NOI18N
        thirdmovietitle.setForeground(new java.awt.Color(0, 102, 102));
        frstpanel.add(thirdmovietitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 180, 30));

        thrdmovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/iibg.png"))); // NOI18N
        frstpanel.add(thrdmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 180, 210, 260));

        fifthmovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/iibg.png"))); // NOI18N
        fifthmovie.setText("jLabel3");
        frstpanel.add(fifthmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 200, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/dbframe.png"))); // NOI18N
        jLabel2.setText("\\");
            frstpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 1380, -1));

            dashboard_btn.setBackground(new java.awt.Color(0, 0, 0));
            dashboard_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            dashboard_btn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lbl_dashboard.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
            lbl_dashboard.setForeground(new java.awt.Color(255, 255, 255));
            lbl_dashboard.setText("Dashboard");
            lbl_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    lbl_dashboardMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    lbl_dashboardMouseExited(evt);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    lbl_dashboardMousePressed(evt);
                }
            });
            dashboard_btn.add(lbl_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -6, -1, 40));

            frstpanel.add(dashboard_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 120, 30));

            pnl_admovie3.setBackground(new java.awt.Color(46, 74, 81));
            pnl_admovie3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            lbl_admovie3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
            lbl_admovie3.setForeground(new java.awt.Color(255, 255, 255));
            lbl_admovie3.setText("Add Movies");
            lbl_admovie3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    lbl_admovie3MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    lbl_admovie3MouseExited(evt);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    lbl_admovie3MousePressed(evt);
                }
            });

            javax.swing.GroupLayout pnl_admovie3Layout = new javax.swing.GroupLayout(pnl_admovie3);
            pnl_admovie3.setLayout(pnl_admovie3Layout);
            pnl_admovie3Layout.setHorizontalGroup(
                pnl_admovie3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_admovie3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbl_admovie3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            pnl_admovie3Layout.setVerticalGroup(
                pnl_admovie3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_admovie3Layout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(lbl_admovie3))
            );

            frstpanel.add(pnl_admovie3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 130, 30));

            edit_screeningpnl.setBackground(new java.awt.Color(46, 74, 81));
            edit_screeningpnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            lbl_editscreen.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
            lbl_editscreen.setForeground(new java.awt.Color(255, 255, 255));
            lbl_editscreen.setText("EDIT SCREENING");
            lbl_editscreen.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_editscreenMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    lbl_editscreenMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    lbl_editscreenMouseExited(evt);
                }
            });

            javax.swing.GroupLayout edit_screeningpnlLayout = new javax.swing.GroupLayout(edit_screeningpnl);
            edit_screeningpnl.setLayout(edit_screeningpnlLayout);
            edit_screeningpnlLayout.setHorizontalGroup(
                edit_screeningpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 156, Short.MAX_VALUE)
                .addGroup(edit_screeningpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_screeningpnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_editscreen)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );
            edit_screeningpnlLayout.setVerticalGroup(
                edit_screeningpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(edit_screeningpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_screeningpnlLayout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(lbl_editscreen)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );

            frstpanel.add(edit_screeningpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 160, 30));

            pnl_avmovie.setBackground(new java.awt.Color(46, 74, 81));
            pnl_avmovie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            lbl_avmovie.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
            lbl_avmovie.setForeground(new java.awt.Color(255, 255, 255));
            lbl_avmovie.setText("Available movies ");
            lbl_avmovie.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    lbl_avmovieMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    lbl_avmovieMouseExited(evt);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    lbl_avmovieMousePressed(evt);
                }
            });

            javax.swing.GroupLayout pnl_avmovieLayout = new javax.swing.GroupLayout(pnl_avmovie);
            pnl_avmovie.setLayout(pnl_avmovieLayout);
            pnl_avmovieLayout.setHorizontalGroup(
                pnl_avmovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_avmovieLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_avmovie)
                    .addContainerGap())
            );
            pnl_avmovieLayout.setVerticalGroup(
                pnl_avmovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_avmovieLayout.createSequentialGroup()
                    .addComponent(lbl_avmovie)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            frstpanel.add(pnl_avmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 180, 30));

            menu.setBackground(new java.awt.Color(46, 74, 81));
            menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
            menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            menu_lbl.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
            menu_lbl.setForeground(new java.awt.Color(255, 255, 255));
            menu_lbl.setText("    MORE");
            menu_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    menu_lblMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    menu_lblMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    menu_lblMouseExited(evt);
                }
            });
            menu.add(menu_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 80, 30));

            frstpanel.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 80, 30));

            panel.setBackground(new java.awt.Color(0, 0, 0));
            panel.setForeground(new java.awt.Color(0, 102, 102));
            panel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    panelMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    panelMouseExited(evt);
                }
            });
            panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            logout.setBackground(new java.awt.Color(39, 88, 88));
            logout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            logout.setForeground(new java.awt.Color(255, 255, 255));
            logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            logout_lbl.setBackground(new java.awt.Color(59, 87, 94));
            logout_lbl.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 15)); // NOI18N
            logout_lbl.setForeground(new java.awt.Color(255, 255, 255));
            logout_lbl.setText("  LOG OUT");
            logout_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    logout_lblMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    logout_lblMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    logout_lblMouseExited(evt);
                }
            });
            logout.add(logout_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

            panel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 80, 20));

            profile_panel1.setBackground(new java.awt.Color(39, 88, 88));
            profile_panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            profile_panel1.setForeground(new java.awt.Color(255, 255, 255));
            profile_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            profile_lbl1.setBackground(new java.awt.Color(46, 74, 81));
            profile_lbl1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 15)); // NOI18N
            profile_lbl1.setForeground(new java.awt.Color(255, 255, 255));
            profile_lbl1.setText("  PROFILE");
            profile_lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    profile_lbl1MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    profile_lbl1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    profile_lbl1MouseExited(evt);
                }
            });
            profile_panel1.add(profile_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

            panel.add(profile_panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 20));

            frstpanel.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 50, 80, 0));

            customer_pnl.setBackground(new java.awt.Color(46, 74, 81));
            customer_pnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            customer_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lbl_customer1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
            lbl_customer1.setForeground(new java.awt.Color(255, 255, 255));
            lbl_customer1.setText("CUSTOMERS ");
            lbl_customer1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_customer1MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    lbl_customer1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    lbl_customer1MouseExited(evt);
                }
            });
            customer_pnl.add(lbl_customer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 117, 30));

            frstpanel.add(customer_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 70, 130, 30));

            bg_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/BGBG.png"))); // NOI18N
            bg_pic.setText("jLabel1");
            frstpanel.add(bg_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 800));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(frstpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(frstpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            setSize(new java.awt.Dimension(1524, 832));
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents
//dashboard_model dm1=new dashboard_model();
dashboard_controller dm1=new dashboard_controller();
    
      public void setColor(JPanel p){
    p.setBackground(new Color(24, 28, 31));
}
    public void resetColor(JPanel p1){
    p1.setBackground(new Color(46,74,81));}
    
    public void menu_btncolor(JPanel p2){
    p2.setBackground(new Color(0,0,0));}
    
    public void remenu_btncolor(JPanel p2){
    p2.setBackground(new Color(46,74,81));}
    
    private void fstimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fstimageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fstimageMouseClicked

    private void lbl_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_dashboardMouseEntered

    private void lbl_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_dashboardMouseExited

    private void lbl_dashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_dashboardMousePressed

    private void lbl_admovie3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie3MouseEntered
        setColor(pnl_admovie3);
    }//GEN-LAST:event_lbl_admovie3MouseEntered

    private void lbl_admovie3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie3MouseExited
        resetColor(pnl_admovie3);
    }//GEN-LAST:event_lbl_admovie3MouseExited

    private void lbl_admovie3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie3MousePressed
                        zter_AddMovies added= new zter_AddMovies();
                        this.hide();
                        added.setVisible(true);
    }//GEN-LAST:event_lbl_admovie3MousePressed

    private void lbl_editscreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editscreenMouseClicked
        edit_screening es= new edit_screening();
        this.hide();
        es.setVisible(true);
    }//GEN-LAST:event_lbl_editscreenMouseClicked

    private void lbl_editscreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editscreenMouseEntered
        setColor(edit_screeningpnl);
    }//GEN-LAST:event_lbl_editscreenMouseEntered

    private void lbl_editscreenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editscreenMouseExited
        resetColor(edit_screeningpnl);
    }//GEN-LAST:event_lbl_editscreenMouseExited

    private void lbl_avmovieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_avmovieMouseEntered
        setColor(pnl_avmovie);
    }//GEN-LAST:event_lbl_avmovieMouseEntered

    private void lbl_avmovieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_avmovieMouseExited
        resetColor(pnl_avmovie);
    }//GEN-LAST:event_lbl_avmovieMouseExited

    private void lbl_avmovieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_avmovieMousePressed
        av_movies av1=new av_movies();
        av1.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lbl_avmovieMousePressed

    private void menu_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_lblMouseClicked
        panel.setSize(80,0);
    }//GEN-LAST:event_menu_lblMouseClicked

    private void menu_lblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_lblMouseEntered
        panel.setSize(80,70);
        setColor(menu);
    }//GEN-LAST:event_menu_lblMouseEntered

    private void menu_lblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_lblMouseExited
        //       panel.setSize(0,0);
        resetColor(menu);
    }//GEN-LAST:event_menu_lblMouseExited

    private void logout_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_lblMouseClicked
        Landing101 lan1 = new Landing101();
        lan1.setVisible(true);
        this.hide();
    }//GEN-LAST:event_logout_lblMouseClicked

    private void logout_lblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_lblMouseEntered
        menu_btncolor(logout);
        panel.setSize(80,70);
        setColor(menu);
    }//GEN-LAST:event_logout_lblMouseEntered

    private void logout_lblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_lblMouseExited
        remenu_btncolor(logout);
        panel.setSize(80,0);
    }//GEN-LAST:event_logout_lblMouseExited

    private void profile_lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_lbl1MouseClicked
        Profile_1 pro1 = new Profile_1();
        pro1.setVisible(true);
        this.hide();
    }//GEN-LAST:event_profile_lbl1MouseClicked

    private void profile_lbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_lbl1MouseEntered
        panel.setSize(80,70);
        menu_btncolor(profile_panel1);

        setColor(menu);
    }//GEN-LAST:event_profile_lbl1MouseEntered

    private void profile_lbl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_lbl1MouseExited
        remenu_btncolor(profile_panel1);
    }//GEN-LAST:event_profile_lbl1MouseExited

    private void panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseEntered
        panel.setSize(80,70);
        setColor(menu);
    }//GEN-LAST:event_panelMouseEntered

    private void panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseExited
        panel.setSize(80,0);
        resetColor(menu);
    }//GEN-LAST:event_panelMouseExited

    private void lbl_customer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_customer1MouseClicked
        Customer c1= new Customer();
        c1.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lbl_customer1MouseClicked

    private void lbl_customer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_customer1MouseEntered
        setColor(customer_pnl);
        panel.setSize(80,0);

    }//GEN-LAST:event_lbl_customer1MouseEntered

    private void lbl_customer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_customer1MouseExited
        resetColor(customer_pnl);
    }//GEN-LAST:event_lbl_customer1MouseExited

    
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
            java.util.logging.Logger.getLogger(Dashboard_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_pic;
    private javax.swing.JPanel customer_pnl;
    private javax.swing.JPanel dashboard_btn;
    private javax.swing.JPanel edit_screeningpnl;
    private javax.swing.JLabel fifthmovie;
    private javax.swing.JLabel fifthmovietitle;
    private javax.swing.JLabel fourmovie;
    private javax.swing.JLabel fourthmovietitle;
    private javax.swing.JPanel frstpanel;
    private javax.swing.JLabel fstimage;
    private javax.swing.JLabel fstmovietitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_admovie3;
    private javax.swing.JLabel lbl_avmovie;
    private javax.swing.JLabel lbl_customer1;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_editscreen;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logout_lbl;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menu_lbl;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnl_admovie3;
    private javax.swing.JPanel pnl_avmovie;
    private javax.swing.JLabel profile_lbl1;
    private javax.swing.JPanel profile_panel1;
    private javax.swing.JLabel secmovie;
    private javax.swing.JLabel secmovietile;
    private javax.swing.JLabel seventhmovie;
    private javax.swing.JLabel seventhmovietitle;
    private javax.swing.JLabel sixthmovie;
    private javax.swing.JLabel sixthmovietitle;
    private javax.swing.JLabel thirdmovietitle;
    private javax.swing.JLabel thrdmovie;
    // End of variables declaration//GEN-END:variables


}

