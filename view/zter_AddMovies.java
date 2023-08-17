package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author haseena
 */
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controller.add_movies_controller;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import database.DbConnection;

public class zter_AddMovies extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    DefaultTableModel dtm = null;
     DefaultTableModel model = new DefaultTableModel(); 
    /**
     * Creates new form AddMovies
     */
    public zter_AddMovies() {
        initComponents();
        setTitle("Add Movies");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/movie-projector 2.png")));
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
                    Connection conn = DbConnection.dbConnect();
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
        
        searchBar.addKeyListener(new KeyAdapter() {
    @Override
    public void keyReleased(KeyEvent e) {
        String keyword = searchBar.getText();
        searchMovie(keyword);
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
        try {
            DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
            model.setRowCount(0);
            add_movies_controller avc1=new add_movies_controller();
            ResultSet resultSet=avc1.fetch_data();
            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getString("title"),
                    resultSet.getString("genre"),
                    resultSet.getString("duration"),
                    resultSet.getDate("showing_date")
                };
                model.addRow(rowData);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
        private void searchMovie(String keyword) {
    DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    tblmoviecollection.setRowSorter(sorter);

 

    List<RowFilter<Object, Object>> filters = new ArrayList<>();
    filters.add(RowFilter.regexFilter(keyword, 0)); // Search in the MovieTitle column

 

    sorter.setRowFilter(RowFilter.andFilter(filters));

 

    if (tblmoviecollection.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Movie not found", "Not found", JOptionPane.INFORMATION_MESSAGE);
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
        searchBar = new javax.swing.JTextField();
        lblMovieTitle1 = new javax.swing.JLabel();
        img_import = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btninsertandview = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        txtMovieTitle = new javax.swing.JTextField();
        lblGenre = new javax.swing.JLabel();
        txtgenre = new javax.swing.JTextField();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        txtPublishDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblmoviecollection = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMovieTitle.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 30)); // NOI18N
        lblMovieTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieTitle.setText("MOVIE ENTRY ");
        getContentPane().add(lblMovieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 170, 30));

        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        getContentPane().add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 500, -1));

        lblMovieTitle1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        lblMovieTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieTitle1.setText("MOVIE TITLE :");
        getContentPane().add(lblMovieTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 140, 20));

        img_import.setBackground(new java.awt.Color(51, 51, 51));
        img_import.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 16)); // NOI18N
        img_import.setForeground(new java.awt.Color(255, 255, 255));
        img_import.setText("IMPORT ");
        img_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_importActionPerformed(evt);
            }
        });
        getContentPane().add(img_import, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, -1, -1));

        btnupdate.setBackground(new java.awt.Color(51, 51, 51));
        btnupdate.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 16)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, -1, -1));

        btninsertandview.setBackground(new java.awt.Color(51, 51, 51));
        btninsertandview.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 16)); // NOI18N
        btninsertandview.setForeground(new java.awt.Color(255, 255, 255));
        btninsertandview.setText("INSERT ");
        btninsertandview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertandviewActionPerformed(evt);
            }
        });
        getContentPane().add(btninsertandview, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, -1, -1));

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 16)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 630, -1, -1));

        txtMovieTitle.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        txtMovieTitle.setBorder(null);
        txtMovieTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovieTitleActionPerformed(evt);
            }
        });
        getContentPane().add(txtMovieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 210, 30));

        lblGenre.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        lblGenre.setForeground(new java.awt.Color(255, 255, 255));
        lblGenre.setText("GENRE : ");
        getContentPane().add(lblGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 90, 50));

        txtgenre.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        txtgenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenreActionPerformed(evt);
            }
        });
        getContentPane().add(txtgenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 210, 30));

        lblDuration.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(255, 255, 255));
        lblDuration.setText("DURATION :");
        getContentPane().add(lblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        txtDuration.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });
        getContentPane().add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 210, 30));

        txtPublishDate.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        txtPublishDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPublishDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtPublishDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 210, 30));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PUBLISH DATE :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, -1));
        getContentPane().add(lblimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 260, 340));

        tblmoviecollection.setBackground(new java.awt.Color(46, 74, 81));
        tblmoviecollection.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        tblmoviecollection.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
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
        tblmoviecollection.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblmoviecollection.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        tblmoviecollection.setGridColor(new java.awt.Color(255, 255, 255));
        tblmoviecollection.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblmoviecollection.setShowGrid(true);
        jScrollPane3.setViewportView(tblmoviecollection);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 570, 460));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallframes/add_frame.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 770, 566));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/dbframe.png"))); // NOI18N
        jLabel2.setText("\\");
            getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 1380, -1));

            dashboard_btn.setBackground(new java.awt.Color(46, 74, 81));
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

            getContentPane().add(dashboard_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 120, 30));

            pnl_admovie3.setBackground(new java.awt.Color(0, 0, 0));
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

            getContentPane().add(pnl_admovie3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 130, 30));

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

            getContentPane().add(edit_screeningpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 160, 30));

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

            getContentPane().add(pnl_avmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 180, 30));

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

            getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 80, 30));

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

            getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 50, 80, 0));

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

            getContentPane().add(customer_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 70, 130, 30));

            bg_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/BGBG.png"))); // NOI18N
            bg_pic.setText("jLabel1");
            getContentPane().add(bg_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 800));

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void txtMovieTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovieTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovieTitleActionPerformed

    private void txtgenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenreActionPerformed

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationActionPerformed

    private void txtPublishDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublishDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPublishDateActionPerformed

    private void lbl_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseEntered
        setColor(dashboard_btn);
    }//GEN-LAST:event_lbl_dashboardMouseEntered

    private void lbl_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseExited
        resetColor(dashboard_btn);
    }//GEN-LAST:event_lbl_dashboardMouseExited

    private void lbl_dashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMousePressed
        Dashboard_1 dash2= new Dashboard_1();
        dash2.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lbl_dashboardMousePressed

    private void lbl_admovie3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie3MouseEntered
//        setColor(customer_pnl);
    }//GEN-LAST:event_lbl_admovie3MouseEntered

    private void lbl_admovie3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie3MouseExited
//        resetColor(customer_pnl);
    }//GEN-LAST:event_lbl_admovie3MouseExited

    private void lbl_admovie3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie3MousePressed
//                        zter_AddMovies added= new zter_AddMovies();
//                        this.hide();
//                        added.setVisible(true);
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

    private void img_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_importActionPerformed
                                       
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Select an image file");

    int result = fileChooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();

        add_movies_controller controller = new add_movies_controller();
        controller.importImage(selectedFile);
        ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
        lblimg.setIcon(imageIcon);
    }


    }//GEN-LAST:event_img_importActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
                                         
    int selectedRow = tblmoviecollection.getSelectedRow();
    if (selectedRow >= 0) {
        try {
            add_movies_controller controller = new add_movies_controller();

            String updatedMovieTitle = txtMovieTitle.getText();
            String updatedGenre = txtgenre.getText();
            String updatedDuration = txtDuration.getText();
            String updatedPublishDate = txtPublishDate.getText();

            boolean isUpdated = controller.updateMovie(selectedRow + 1, updatedMovieTitle, updatedGenre, updatedDuration, updatedPublishDate, lblimg.getIcon());

            if (isUpdated) {
                DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
                model.setValueAt(updatedMovieTitle, selectedRow, 0);
                model.setValueAt(updatedGenre, selectedRow, 1);
                model.setValueAt(updatedDuration, selectedRow, 2);
                model.setValueAt(updatedPublishDate, selectedRow, 3);
                JOptionPane.showMessageDialog(this, "Successfully updated data");
            } else {
                JOptionPane.showMessageDialog(this, "Error updating data");
            }
        } catch (ParseException | IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating data");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No row selected");
    }


    }//GEN-LAST:event_btnupdateActionPerformed

    private void btninsertandviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertandviewActionPerformed
                                                
    String movieTitle = txtMovieTitle.getText();
    String genre = txtgenre.getText();
    String duration = txtDuration.getText();
    String publishDate = txtPublishDate.getText();
    
    Icon imageIcon = lblimg.getIcon();
    if (imageIcon != null && imageIcon instanceof ImageIcon) {
        ImageIcon image = (ImageIcon) imageIcon;
        byte[] imageBytes = convertImageToByteArray(image.getImage());

        add_movies_controller controller = new add_movies_controller();
        int rowsInserted = controller.insertMovie(movieTitle, genre, duration, publishDate, imageBytes);

        if (rowsInserted > 0) {
            DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
            model.addRow(new Object[]{movieTitle, genre, duration, java.sql.Date.valueOf(publishDate)});
            JOptionPane.showMessageDialog(this, "Data inserted successfully");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Image missing");
    }


    }//GEN-LAST:event_btninsertandviewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

    int selectedRow = tblmoviecollection.getSelectedRow();
    if (selectedRow >= 0) {
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this movie?");
        if (confirm == JOptionPane.YES_OPTION) {
            String movieTitle = tblmoviecollection.getValueAt(selectedRow, 0).toString();
            add_movies_controller controller = new add_movies_controller();
            controller.deleteMovie(movieTitle);

            DefaultTableModel model = (DefaultTableModel) tblmoviecollection.getModel();
            model.removeRow(selectedRow);

            System.out.println("Movie deleted successfully.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a movie to delete.", "No Movie Selected", JOptionPane.WARNING_MESSAGE);
    }


    }//GEN-LAST:event_deleteActionPerformed
    public void setColor(JPanel p){
    p.setBackground(new Color(24, 28, 31));
}
    public void resetColor(JPanel p1){
    p1.setBackground(new Color(46,74,81));}
    
    public void menu_btncolor(JPanel p2){
    p2.setBackground(new Color(0,0,0));}
    
    public void remenu_btncolor(JPanel p2){
    p2.setBackground(new Color(46,74,81));}
    
    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
    String keyboard = searchBar.getText();
        searchMovie(keyboard);
    
    }//GEN-LAST:event_searchBarActionPerformed

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
    
    private byte[] getImageBytesForMovieTitle(Connection conn, String movieTitle) throws SQLException {
    String sql = "SELECT image FROM movies WHERE title=?";
    PreparedStatement statement = conn.prepareStatement(sql);
    statement.setString(1, movieTitle);
    ResultSet resultSet = statement.executeQuery();
    if (resultSet.next()) {
        return resultSet.getBytes("image");
    }
    return null;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zter_AddMovies().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_pic;
    private javax.swing.JButton btninsertandview;
    private javax.swing.JButton btnupdate;
    private javax.swing.JPanel customer_pnl;
    private javax.swing.JPanel dashboard_btn;
    private javax.swing.JButton delete;
    private javax.swing.JPanel edit_screeningpnl;
    private javax.swing.JButton img_import;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblMovieTitle;
    private javax.swing.JLabel lblMovieTitle1;
    private javax.swing.JLabel lbl_admovie3;
    private javax.swing.JLabel lbl_avmovie;
    private javax.swing.JLabel lbl_customer1;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_editscreen;
    private javax.swing.JLabel lblimg;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logout_lbl;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menu_lbl;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnl_admovie3;
    private javax.swing.JPanel pnl_avmovie;
    private javax.swing.JLabel profile_lbl1;
    private javax.swing.JPanel profile_panel1;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTable tblmoviecollection;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtMovieTitle;
    private javax.swing.JTextField txtPublishDate;
    private javax.swing.JTextField txtgenre;
    // End of variables declaration//GEN-END:variables

   
}
