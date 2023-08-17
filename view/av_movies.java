package view;

import java.awt.Color;
import javax.swing.JPanel;
import controller.av_movies_controller;
import java.awt.Toolkit;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import model.reciept_model;


public class av_movies extends javax.swing.JFrame {
    public av_movies() {
        initComponents();
        setTitle("Available Movies");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/movie-projector 2.png")));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        time_chooser = new javax.swing.JComboBox<>();
        special_ticket = new javax.swing.JButton();
        sp_quantity = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        special_info = new javax.swing.JLabel();
        normal_info = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        normal_ticket = new javax.swing.JButton();
        purchaseticket_frame = new javax.swing.JLabel();
        info_name = new javax.swing.JLabel();
        genre_info = new javax.swing.JLabel();
        date_info = new javax.swing.JLabel();
        mv_info = new javax.swing.JLabel();
        pnl_dasboard = new javax.swing.JPanel();
        lbl_dashboard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl_avmovie = new javax.swing.JPanel();
        lbl_avmovie = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        edit_screeningpnl = new javax.swing.JPanel();
        lbl_editscreen = new javax.swing.JLabel();
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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_admovie1.setBackground(new java.awt.Color(46, 74, 81));
        pnl_admovie1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl_admovie1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_admovie1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 20)); // NOI18N
        lbl_admovie1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_admovie1.setText("Add Movies");
        lbl_admovie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_admovie1MouseClicked(evt);
            }
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
        pnl_admovie1.add(lbl_admovie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 3, -1, -1));

        getContentPane().add(pnl_admovie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 130, 30));

        date.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 25)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("DATE :");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        genre.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 25)); // NOI18N
        genre.setForeground(new java.awt.Color(255, 255, 255));
        genre.setText("GENRE :");
        getContentPane().add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        mv.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 25)); // NOI18N
        mv.setForeground(new java.awt.Color(255, 255, 255));
        mv.setText("MOVIE :");
        getContentPane().add(mv, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MOVIE INFORMATION");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        rs_n.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        rs_n.setForeground(new java.awt.Color(255, 255, 255));
        rs_n.setText("Rs.");
        getContentPane().add(rs_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, -1, -1));

        rs_sp.setBackground(new java.awt.Color(204, 204, 204));
        rs_sp.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        rs_sp.setForeground(new java.awt.Color(255, 255, 255));
        rs_sp.setText("Rs.");
        getContentPane().add(rs_sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

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

        getContentPane().add(for_tbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 720, 460));

        np_quantity.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        getContentPane().add(np_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 70, -1));
        np_quantity.setValue(1);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SHOWTIME :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Price(Rs.)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NORMAL CLASS : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SPECIAL CLASS :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, -1, -1));

        time_chooser.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 17)); // NOI18N
        time_chooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "morning show", "afternoon show", "evening show" }));
        time_chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_chooserActionPerformed(evt);
            }
        });
        getContentPane().add(time_chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        special_ticket.setBackground(new java.awt.Color(102, 102, 102));
        special_ticket.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        special_ticket.setForeground(new java.awt.Color(255, 255, 255));
        special_ticket.setText("VIEW TICKET");
        special_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                special_ticketActionPerformed(evt);
            }
        });
        getContentPane().add(special_ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, -1, -1));

        sp_quantity.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        sp_quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_quantityStateChanged(evt);
            }
        });
        getContentPane().add(sp_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 70, -1));
        sp_quantity.setValue(1);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PURCHASE TICKETS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        special_info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        special_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(special_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 110, 30));

        normal_info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        normal_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(normal_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 120, 30));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RECEIPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, -1, -1));

        normal_ticket.setBackground(new java.awt.Color(102, 102, 102));
        normal_ticket.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        normal_ticket.setForeground(new java.awt.Color(255, 255, 255));
        normal_ticket.setText("VIEW TICKET");
        normal_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normal_ticketActionPerformed(evt);
            }
        });
        getContentPane().add(normal_ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, -1, -1));

        purchaseticket_frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallframes/av_rec_invisi.png"))); // NOI18N
        getContentPane().add(purchaseticket_frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 580, -1));

        info_name.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        info_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(info_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 190, 20));

        genre_info.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        genre_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(genre_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 200, 20));

        date_info.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        date_info.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(date_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 170, 20));

        mv_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallframes/av_greeninsible.png"))); // NOI18N
        getContentPane().add(mv_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 560, 230));

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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_dasboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/dbframe.png"))); // NOI18N
        jLabel2.setText("\\");
            getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 1380, -1));

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
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            getContentPane().add(pnl_avmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 180, 30));

            jLabel1.setText("jLabel1");
            getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, 90, -1));

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
        }// </editor-fold>//GEN-END:initComponents

//label-button actions 
    private void lbl_dashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMousePressed
        Dashboard_1 dsbd= new Dashboard_1();
        dsbd.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lbl_dashboardMousePressed

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
//        zter_AddMovies added1= new zter_AddMovies();
//        added1.setVisible(true);
//        this.hide();
    }//GEN-LAST:event_lbl_admovie1MousePressed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    int index = jTable2.getSelectedRow();
    reciept_model rm1 = new reciept_model();
    int index_1 = jTable2.getSelectedRow();
    String title = jTable2.getValueAt(index_1, 0).toString();
    rm1.setTitle(title);
    int np_num=(int) np_quantity.getValue();
    int sp_num=(int) sp_quantity.getValue();
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
    rm1.setMovie(title);

    reciept r1 = new reciept();
    // Pass rm1 instance to the reciept constructor
    r1.setRecieptModel(rm1);
    r1.show();
    
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void special_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_special_ticketActionPerformed
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
    String selectedOption;
    selectedOption=time_chooser.getSelectedItem().toString();
    rm1.setShowtime(selectedOption);
    reciept r1 = new reciept();
    // Pass rm1 instance to the reciept constructor
    r1.setRecieptModel(rm1);
    normal_ticket t1=new normal_ticket(rm1);
    t1.show();
    dispose();  
    }//GEN-LAST:event_special_ticketActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        special_info.setText(" ");
        normal_info.setText("");
        sp_quantity.setValue(0);
        np_quantity.setValue(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void normal_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normal_ticketActionPerformed
   
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
    String selectedOption;
    selectedOption=time_chooser.getSelectedItem().toString();
    rm1.setShowtime(selectedOption);
    
    reciept r1 = new reciept();
    // Pass rm1 instance to the reciept constructor
    r1.setRecieptModel(rm1);
    special_ticket t1=new special_ticket(rm1);
    t1.show();
    dispose(); 
    }//GEN-LAST:event_normal_ticketActionPerformed

      public void setColor(JPanel p){
    p.setBackground(new Color(24, 28, 31));
}
    public void resetColor(JPanel p1){
    p1.setBackground(new Color(46,74,81));}
    
    public void menu_btncolor(JPanel p2){
    p2.setBackground(new Color(0,0,0));}
    
    public void remenu_btncolor(JPanel p2){
    p2.setBackground(new Color(46,74,81));}
    
 
    private void time_chooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_chooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time_chooserActionPerformed

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

    private void lbl_admovie1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admovie1MouseClicked
        // TODO add your handling code here:
        zter_AddMovies ad= new zter_AddMovies();
        ad.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_lbl_admovie1MouseClicked

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
    private javax.swing.JPanel customer_pnl;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date_info;
    private javax.swing.JPanel edit_screeningpnl;
    private javax.swing.JScrollPane for_tbl;
    private javax.swing.JLabel genre;
    private javax.swing.JLabel genre_info;
    private javax.swing.JLabel info_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_admovie1;
    private javax.swing.JLabel lbl_avmovie;
    private javax.swing.JLabel lbl_customer1;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_editscreen;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logout_lbl;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menu_lbl;
    private javax.swing.JLabel mv;
    private javax.swing.JLabel mv_info;
    private javax.swing.JLabel normal_info;
    private javax.swing.JButton normal_ticket;
    private javax.swing.JSpinner np_quantity;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnl_admovie1;
    private javax.swing.JPanel pnl_avmovie;
    private javax.swing.JPanel pnl_dasboard;
    private javax.swing.JLabel profile_lbl1;
    private javax.swing.JPanel profile_panel1;
    private javax.swing.JLabel purchaseticket_frame;
    private javax.swing.JLabel rs_n;
    private javax.swing.JLabel rs_sp;
    private javax.swing.JSpinner sp_quantity;
    private javax.swing.JLabel special_info;
    private javax.swing.JButton special_ticket;
    private javax.swing.JComboBox<String> time_chooser;
    // End of variables declaration//GEN-END:variables
}
