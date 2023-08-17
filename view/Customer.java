/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.customer_controller;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form CustomerModel
     */
    private DefaultTableModel model;
    private Timer timer;
    private SimpleDateFormat dateFormat;
    public Customer() {
        initComponents();
        setTitle("Customer Page");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/movie-projector 2.png")));
        
    model = new DefaultTableModel();
    sold_tickets.setModel(model);
    model.addColumn("movieId");
    model.addColumn("receipt_id");
    model.addColumn("total_payment");
    model.addColumn("quantity"); 
    fetchDataFromDatabase();    

    }


private void fetchDataFromDatabase() {
    // Clear existing rows from the table
    model.setRowCount(0);


customer_controller cs1=new customer_controller();
ResultSet rs=cs1.fetchDataFromDatabase();
    try {
        while (rs.next()) {
            int movieId = rs.getInt("movieId");
            String receipt = rs.getString("recieptid");
            String total = rs.getString("total_payment");
            int quantity = rs.getInt("quantity");

            model.addRow(new Object[]{movieId,receipt,total,quantity});
        }
    } catch (SQLException ex) {
        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
    }


}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sold_tickets = new javax.swing.JTable();
        txt_movieId = new javax.swing.JTextField();
        total_paymentlbl = new javax.swing.JLabel();
        receiptid_label = new javax.swing.JLabel();
        lblquantity = new javax.swing.JLabel();
        lblmovieId = new javax.swing.JLabel();
        txt_receipt = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        cancelbtn = new javax.swing.JButton();
        txt_payment = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entryllbl = new javax.swing.JLabel();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sold_tickets.setBackground(new java.awt.Color(46, 74, 81));
        sold_tickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "movieId", "receipt_id", "quantity", "total", "time checked"
            }
        ));
        sold_tickets.setShowGrid(true);
        sold_tickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sold_ticketsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sold_tickets);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 730, 480));

        txt_movieId.setEditable(false);
        txt_movieId.setFont(new java.awt.Font("Franklin Gothic Book", 1, 15)); // NOI18N
        txt_movieId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_movieIdActionPerformed(evt);
            }
        });
        jPanel1.add(txt_movieId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 200, 30));

        total_paymentlbl.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 23)); // NOI18N
        total_paymentlbl.setForeground(new java.awt.Color(255, 255, 255));
        total_paymentlbl.setText("MOVIE ID :");
        jPanel1.add(total_paymentlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 110, 20));

        receiptid_label.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 23)); // NOI18N
        receiptid_label.setForeground(new java.awt.Color(255, 255, 255));
        receiptid_label.setText("RECEIPT ID:");
        jPanel1.add(receiptid_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 120, 30));

        lblquantity.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 23)); // NOI18N
        lblquantity.setForeground(new java.awt.Color(255, 255, 255));
        lblquantity.setText("QUALITY:");
        jPanel1.add(lblquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 110, 20));

        lblmovieId.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 23)); // NOI18N
        lblmovieId.setForeground(new java.awt.Color(255, 255, 255));
        lblmovieId.setText("PAYMENT:");
        jPanel1.add(lblmovieId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 140, 30));

        txt_receipt.setFont(new java.awt.Font("Franklin Gothic Book", 1, 15)); // NOI18N
        txt_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_receiptActionPerformed(evt);
            }
        });
        jPanel1.add(txt_receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 200, 30));

        txt_quantity.setFont(new java.awt.Font("Franklin Gothic Book", 1, 15)); // NOI18N
        txt_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantityActionPerformed(evt);
            }
        });
        jPanel1.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 200, 30));

        cancelbtn.setBackground(new java.awt.Color(51, 51, 51));
        cancelbtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setText("CANCEL");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, -1, -1));

        txt_payment.setFont(new java.awt.Font("Franklin Gothic Book", 1, 15)); // NOI18N
        txt_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paymentActionPerformed(evt);
            }
        });
        jPanel1.add(txt_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Rectangle 29.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 390, 360));

        entryllbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/Rectangle 46.png"))); // NOI18N
        jPanel1.add(entryllbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 490, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zter images/movie ticketing/dbframe.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 1480, 640));

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

        jPanel1.add(dashboard_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 120, 30));

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

        jPanel1.add(pnl_admovie3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 130, 30));

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

        jPanel1.add(edit_screeningpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 160, 30));

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
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel1.add(pnl_avmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 180, 30));

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

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 80, 30));

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

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 50, 80, 0));

        customer_pnl.setBackground(new java.awt.Color(0, 0, 0));
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

        jPanel1.add(customer_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 70, 130, 30));

        bg_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZterView/BGBG.png"))); // NOI18N
        bg_pic.setText("jLabel1");
        jPanel1.add(bg_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_movieIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_movieIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_movieIdActionPerformed

    private void txt_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_receiptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_receiptActionPerformed

    private void txt_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paymentActionPerformed

    private void txt_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
     int selectedRowIndex = sold_tickets.getSelectedRow();
        if (selectedRowIndex != -1) {
            int movieId = (int) sold_tickets.getValueAt(selectedRowIndex, 0);

            // Delete the row from the database
            customer_controller cs1=new customer_controller();
//            CustomerModel cm1=new CustomerModel();
            int rowsAffected=cs1.cancel(movieId);

                if (rowsAffected > 0) {
                    // Delete the row from the table model
                    model.removeRow(selectedRowIndex);
                    JOptionPane.showMessageDialog(this, "Data canceled successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to cancel data.", "Error", JOptionPane.ERROR_MESSAGE);
                }

        } else {
            JOptionPane.showMessageDialog(this, "No row selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void sold_ticketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sold_ticketsMouseClicked
 int selectedRowIndex = sold_tickets.getSelectedRow();
        if (selectedRowIndex != -1) {
            int movieId = (int) sold_tickets.getValueAt(selectedRowIndex, 0);
            String receipt = (String) sold_tickets.getValueAt(selectedRowIndex, 1);
            String total = (String) sold_tickets.getValueAt(selectedRowIndex, 2);
            int quantity = (int) sold_tickets.getValueAt(selectedRowIndex, 3);

            txt_movieId.setText(Integer.toString(movieId));
            txt_receipt.setText(receipt);
            txt_payment.setText(total);
            txt_quantity.setText(Integer.toString(quantity));
        }
    }//GEN-LAST:event_sold_ticketsMouseClicked

         public void setColor(JPanel p){
    p.setBackground(new Color(24, 28, 31));
}
    public void resetColor(JPanel p1){
    p1.setBackground(new Color(46,74,81));}
    
    public void menu_btncolor(JPanel p2){
    p2.setBackground(new Color(0,0,0));}
    
    public void remenu_btncolor(JPanel p2){
    p2.setBackground(new Color(46,74,81));}
    
 
    private void lbl_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseEntered
        setColor(pnl_admovie3);
    }//GEN-LAST:event_lbl_dashboardMouseEntered

    private void lbl_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMouseExited
        resetColor(pnl_admovie3);
    }//GEN-LAST:event_lbl_dashboardMouseExited

    private void lbl_dashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dashboardMousePressed
        Dashboard_1 dash1= new Dashboard_1();
        dash1.setVisible(true);
        this.hide();
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
//        Customer c1= new Customer();
//        c1.setVisible(true);
//        this.hide();
    }//GEN-LAST:event_lbl_customer1MouseClicked

    private void lbl_customer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_customer1MouseEntered
//        setColor(customer_pnl);
        panel.setSize(80,0);

    }//GEN-LAST:event_lbl_customer1MouseEntered

    private void lbl_customer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_customer1MouseExited
//        resetColor(customer_pnl);
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_pic;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JPanel customer_pnl;
    private javax.swing.JPanel dashboard_btn;
    private javax.swing.JPanel edit_screeningpnl;
    private javax.swing.JLabel entryllbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_admovie3;
    private javax.swing.JLabel lbl_avmovie;
    private javax.swing.JLabel lbl_customer1;
    private javax.swing.JLabel lbl_dashboard;
    private javax.swing.JLabel lbl_editscreen;
    private javax.swing.JLabel lblmovieId;
    private javax.swing.JLabel lblquantity;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel logout_lbl;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menu_lbl;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnl_admovie3;
    private javax.swing.JPanel pnl_avmovie;
    private javax.swing.JLabel profile_lbl1;
    private javax.swing.JPanel profile_panel1;
    private javax.swing.JLabel receiptid_label;
    private javax.swing.JTable sold_tickets;
    private javax.swing.JLabel total_paymentlbl;
    private javax.swing.JTextField txt_movieId;
    private javax.swing.JTextField txt_payment;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_receipt;
    // End of variables declaration//GEN-END:variables

   
}
