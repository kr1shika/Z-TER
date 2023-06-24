
package view;
import view.Dashboard;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import database.DbConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import controller.av_movies_controller;
import java.util.LinkedHashSet;
import java.util.Set;
import java.lang.String;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.av_movies_model;
import view.reciept;
import model.reciept_model;
//import controller.reciept_controller;

public class av_movies extends javax.swing.JFrame {
    public av_movies() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnl_buy = new javax.swing.JPanel();
        lbl_receipt1 = new javax.swing.JLabel();
        pnl_clear = new javax.swing.JPanel();
        lbl_clear = new javax.swing.JLabel();
        pnl_admovie1 = new javax.swing.JPanel();
        lbl_admovie1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        genre = new javax.swing.JLabel();
        mv = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rs_n = new javax.swing.JLabel();
        rs_sp = new javax.swing.JLabel();
        for_tbl = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        np_quantity = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sp_quantity = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        special_info = new javax.swing.JLabel();
        normal_info = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        purchaseticket_frame = new javax.swing.JLabel();
        picture_display = new javax.swing.JLabel();
        info_name = new javax.swing.JLabel();
        genre_info = new javax.swing.JLabel();
        date_info = new javax.swing.JLabel();
        mv_info = new javax.swing.JLabel();
        pnl_dasboard = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl_customer = new javax.swing.JPanel();
        lbl_customer = new javax.swing.JLabel();
        pnl_editscr = new javax.swing.JPanel();
        lbl_editscr = new javax.swing.JLabel();
        pnl_avmovie = new javax.swing.JPanel();
        lbl_avmovie = new javax.swing.JLabel();
        bg_pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_buy.setBackground(new java.awt.Color(0, 0, 0));
        pnl_buy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_receipt1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        lbl_receipt1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_receipt1.setText("BUY");
        lbl_receipt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_receipt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_receipt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_receipt1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_receipt1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_buyLayout = new javax.swing.GroupLayout(pnl_buy);
        pnl_buy.setLayout(pnl_buyLayout);
        pnl_buyLayout.setHorizontalGroup(
            pnl_buyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(pnl_buyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_buyLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_receipt1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl_buyLayout.setVerticalGroup(
            pnl_buyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(pnl_buyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_buyLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_receipt1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(pnl_buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 660, 60, 30));

        pnl_clear.setBackground(new java.awt.Color(0, 0, 0));
        pnl_clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_clear.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        lbl_clear.setForeground(new java.awt.Color(255, 255, 255));
        lbl_clear.setText("CLEAR");
        lbl_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_clearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_clearMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_clearLayout = new javax.swing.GroupLayout(pnl_clear);
        pnl_clear.setLayout(pnl_clearLayout);
        pnl_clearLayout.setHorizontalGroup(
            pnl_clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_clear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_clearLayout.setVerticalGroup(
            pnl_clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_clearLayout.createSequentialGroup()
                .addComponent(lbl_clear)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, 90, 30));

        pnl_admovie1.setBackground(new java.awt.Color(46, 74, 81));
        pnl_admovie1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_admovie1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        lbl_admovie1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_admovie1.setText("Add Movies");
        lbl_admovie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_admovie1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_admovie1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_admovie1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_admovie1Layout = new javax.swing.GroupLayout(pnl_admovie1);
        pnl_admovie1.setLayout(pnl_admovie1Layout);
        pnl_admovie1Layout.setHorizontalGroup(
            pnl_admovie1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
            .addGroup(pnl_admovie1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_admovie1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_admovie1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl_admovie1Layout.setVerticalGroup(
            pnl_admovie1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(pnl_admovie1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_admovie1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_admovie1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(pnl_admovie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 130, 30));

        date.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date:");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        genre.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        genre.setForeground(new java.awt.Color(255, 255, 255));
        genre.setText("Genre:");
        getContentPane().add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        mv.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        mv.setForeground(new java.awt.Color(255, 255, 255));
        mv.setText("Movie:");
        getContentPane().add(mv, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MOVIE INFO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        rs_n.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        rs_n.setForeground(new java.awt.Color(255, 255, 255));
        rs_n.setText("Rs.");
        getContentPane().add(rs_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 610, -1, -1));

        rs_sp.setBackground(new java.awt.Color(204, 204, 204));
        rs_sp.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        rs_sp.setForeground(new java.awt.Color(255, 255, 255));
        rs_sp.setText("Rs.");
        getContentPane().add(rs_sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, -1, -1));

        for_tbl.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        for_tbl.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        // Get the data from the movie_data() method
        av_movies_controller av_bro = new av_movies_controller();
        Set<String> stringSet = av_bro.movie_data();
        String[] stringArray = stringSet.toArray(new String[stringSet.size()]);
        String[][] data = new String[stringArray.length][3];
        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        int row = 0;
        for (String rowData : stringArray) { // Corrected the loop variable type
            data[row] = rowData.split(","); // Assuming rowData is a comma-separated string
            row++;
        }
        String[] columnNames = {"Movie", "Genre", "Showing date"};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTable2.setModel(model
        );
        System.out.println(stringSet);
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable2.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        for_tbl.setViewportView(jTable2);

        getContentPane().add(for_tbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 810, 190));
        getContentPane().add(np_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 70, -1));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Price(Rs.)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NORMAL CLASS: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SPECIAL CLASS:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, -1, -1));

        sp_quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_quantityStateChanged(evt);
            }
        });
        getContentPane().add(sp_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 70, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PURCHASE TICKETS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, -1, -1));

        special_info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        special_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(special_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 540, 110, 30));

        normal_info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        normal_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(normal_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 600, 120, 30));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RECEIPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 670, -1, -1));

        purchaseticket_frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallframes/r3.png"))); // NOI18N
        purchaseticket_frame.setText("jLabel3");
        getContentPane().add(purchaseticket_frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 940, -1));

        picture_display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallframes/r4.png"))); // NOI18N
        getContentPane().add(picture_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        info_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        info_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(info_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 190, 20));

        genre_info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genre_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(genre_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 200, 20));

        date_info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(date_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 90, 20));

        mv_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallframes/r1.png"))); // NOI18N
        getContentPane().add(mv_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 350, -1));

        pnl_dasboard.setBackground(new java.awt.Color(46, 74, 81));
        pnl_dasboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_dashboard.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        lbl_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dashboard.setText("DashBoard");
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

        javax.swing.GroupLayout pnl_dasboardLayout = new javax.swing.GroupLayout(pnl_dasboard);
        pnl_dasboard.setLayout(pnl_dasboardLayout);
        pnl_dasboardLayout.setHorizontalGroup(
            pnl_dasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dasboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dashboard)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnl_dasboardLayout.setVerticalGroup(
            pnl_dasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dasboardLayout.createSequentialGroup()
                .addComponent(lbl_dashboard)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_dasboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/dbframe.png"))); // NOI18N
        jLabel2.setText("\\");
            getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 1380, -1));

            pnl_customer.setBackground(new java.awt.Color(46, 74, 81));
            pnl_customer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            lbl_customer.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
            lbl_customer.setForeground(new java.awt.Color(255, 255, 255));
            lbl_customer.setText("CUSTOMERS ");
            lbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lbl_customerMouseClicked(evt);
                }
            });

            javax.swing.GroupLayout pnl_customerLayout = new javax.swing.GroupLayout(pnl_customer);
            pnl_customer.setLayout(pnl_customerLayout);
            pnl_customerLayout.setHorizontalGroup(
                pnl_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_customerLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            pnl_customerLayout.setVerticalGroup(
                pnl_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_customerLayout.createSequentialGroup()
                    .addComponent(lbl_customer)
                    .addGap(0, 13, Short.MAX_VALUE))
            );

            getContentPane().add(pnl_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 70, 130, 30));

            pnl_editscr.setBackground(new java.awt.Color(46, 74, 81));
            pnl_editscr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            lbl_editscr.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
            lbl_editscr.setForeground(new java.awt.Color(255, 255, 255));
            lbl_editscr.setText("EDIT SCREENING");
            lbl_editscr.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    lbl_editscrMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    lbl_editscrMouseExited(evt);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    lbl_editscrMousePressed(evt);
                }
            });

            javax.swing.GroupLayout pnl_editscrLayout = new javax.swing.GroupLayout(pnl_editscr);
            pnl_editscr.setLayout(pnl_editscrLayout);
            pnl_editscrLayout.setHorizontalGroup(
                pnl_editscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 156, Short.MAX_VALUE)
                .addGroup(pnl_editscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_editscrLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_editscr)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );
            pnl_editscrLayout.setVerticalGroup(
                pnl_editscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(pnl_editscrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_editscrLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_editscr)
                        .addGap(0, 0, Short.MAX_VALUE)))
            );

            getContentPane().add(pnl_editscr, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 160, 30));

            pnl_avmovie.setBackground(new java.awt.Color(0, 0, 0));
            pnl_avmovie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            lbl_avmovie.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
            lbl_avmovie.setForeground(new java.awt.Color(255, 255, 255));
            lbl_avmovie.setText("Available movies ");

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
                    .addGap(0, 2, Short.MAX_VALUE))
            );

            getContentPane().add(pnl_avmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 180, 30));

            bg_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/BGBG.png"))); // NOI18N
            bg_pic.setText("jLabel1");
            getContentPane().add(bg_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 800));

            jLabel1.setText("jLabel1");
            getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, 90, -1));

            pack();
        }// </editor-fold>//GEN-END:initComponents

//label-button actions 
    private void lbl_dashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMousePressed
        Dashboard dsbd= new Dashboard();
        dsbd.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lbl_dashboardMousePressed

    public void setColor(JPanel p){
    p.setBackground(new Color(24, 28, 31));
}
    public void resetColor(JPanel p1){
    p1.setBackground(new Color(46,74,81));
}
    private void lbl_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseEntered
        setColor(pnl_dasboard);
    }//GEN-LAST:event_lbl_dashboardMouseEntered

    private void lbl_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseExited
        resetColor(pnl_dasboard);
    }//GEN-LAST:event_lbl_dashboardMouseExited

   
    private void lbl_admovie1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie1MouseEntered
        setColor(pnl_admovie1);
    }//GEN-LAST:event_lbl_admovie1MouseEntered

    private void lbl_admovie1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie1MouseExited
        resetColor(pnl_admovie1);
    }//GEN-LAST:event_lbl_admovie1MouseExited

    private void lbl_admovie1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie1MousePressed
//        AddMovies added1= new AddMovies();
//        added1.setVisible(true);
//        this.hide();
    }//GEN-LAST:event_lbl_admovie1MousePressed

    private void lbl_clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_clearMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_clearMouseEntered

    private void lbl_clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_clearMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_clearMouseExited

    private void lbl_clearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_clearMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_clearMousePressed

    private void lbl_receipt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_receipt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_receipt1MouseEntered

    private void lbl_receipt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_receipt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_receipt1MouseExited

    private void lbl_receipt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_receipt1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_receipt1MousePressed

    private void lbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_customerMouseClicked
//        Customer c1= new Customer();
//        c1.setVisible(true);
//        this.hide();
        
    }//GEN-LAST:event_lbl_customerMouseClicked

    private void lbl_editscrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editscrMouseEntered
        setColor(pnl_editscr);
    }//GEN-LAST:event_lbl_editscrMouseEntered

    private void lbl_editscrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editscrMouseExited
        resetColor(pnl_editscr);
    }//GEN-LAST:event_lbl_editscrMouseExited

    private void lbl_editscrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_editscrMousePressed
//        EditStreaming es22= new EditStreaming();
//        es22.show();
//        this.hide();
    }//GEN-LAST:event_lbl_editscrMousePressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index=jTable2.getSelectedRow();
        String title=jTable2.getValueAt(index,0).toString();
//        System.out.println(title);
        av_movies_controller av1=new av_movies_controller();
        String info_of_movies=av1.get_info(title);
        String[] array_info=info_of_movies.split(",");
        info_name.setText(array_info[0]);
        genre_info.setText(array_info[1]);
        date_info.setText(array_info[2]);
        special_info.setText(array_info[3]);
        normal_info.setText(array_info[4]);
    }//GEN-LAST:event_jTable2MouseClicked

    private void sp_quantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_quantityStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_sp_quantityStateChanged

    private void lbl_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_clearMouseClicked
        // TODO add your handling code here:
        special_info.setText(" ");
        normal_info.setText("");
        sp_quantity.setValue(0);
        np_quantity.setValue(0);
    }//GEN-LAST:event_lbl_clearMouseClicked

    private void lbl_receipt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_receipt1MouseClicked
        // TODO add your handling code here:

        
    }//GEN-LAST:event_lbl_receipt1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    int index = jTable2.getSelectedRow();
    reciept_model rm1 = new reciept_model();
    int index_1 = jTable2.getSelectedRow();
    String title = jTable2.getValueAt(index_1, 0).toString();
    rm1.setTitle(title);
    rm1.setQuantity_np((int) sp_quantity.getValue());
    rm1.setQuantity_sp((int) np_quantity.getValue());
    
    String price_np = normal_info.getText().trim();
    int rate_np = Integer.parseInt(price_np);
    rm1.setRate_np(rate_np);
    
    String price_sp = special_info.getText().trim();
    int rate_sp = Integer.parseInt(price_sp);
    rm1.setRate_sp(rate_sp);
    
    av_movies_controller av1 = new av_movies_controller();
    String info_of_movies = av1.get_info(title);
    String[] array_info = info_of_movies.split(",");
    String date_show = array_info[2];
    rm1.setShowing_date(date_show);
    
    reciept r1 = new reciept();
    // Pass rm1 instance to the reciept constructor
    r1.setRecieptModel(rm1);
    r1.show();
    
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
            java.util.logging.Logger.getLogger(av_movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(av_movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(av_movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(av_movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new av_movies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_pic;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date_info;
    private javax.swing.JScrollPane for_tbl;
    private javax.swing.JLabel genre;
    private javax.swing.JLabel genre_info;
    private javax.swing.JLabel info_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_admovie1;
    private javax.swing.JLabel lbl_avmovie;
    private javax.swing.JLabel lbl_clear;
    private javax.swing.JLabel lbl_customer;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_editscr;
    private javax.swing.JLabel lbl_receipt1;
    private javax.swing.JLabel mv;
    private javax.swing.JLabel mv_info;
    private javax.swing.JLabel normal_info;
    private javax.swing.JSpinner np_quantity;
    private javax.swing.JLabel picture_display;
    private javax.swing.JPanel pnl_admovie1;
    private javax.swing.JPanel pnl_avmovie;
    private javax.swing.JPanel pnl_buy;
    private javax.swing.JPanel pnl_clear;
    private javax.swing.JPanel pnl_customer;
    private javax.swing.JPanel pnl_dasboard;
    private javax.swing.JPanel pnl_editscr;
    private javax.swing.JLabel purchaseticket_frame;
    private javax.swing.JLabel rs_n;
    private javax.swing.JLabel rs_sp;
    private javax.swing.JSpinner sp_quantity;
    private javax.swing.JLabel special_info;
    // End of variables declaration//GEN-END:variables
}
