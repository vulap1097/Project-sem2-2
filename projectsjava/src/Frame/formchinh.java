/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import DataControl.AutoLoadChat;
import static Frame.loginForm.txtuser;
import Util.contentchats;
import Util.covertJson;
import Util.ketnoi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class formchinh extends javax.swing.JFrame {
public static int iduser=0;
public static String userName="";
public static String userPass="";
public static String CurrentFriend="";
    /**
     * Creates new form formchinh
     */
    public formchinh() {
        initComponents();
        this.setLocationRelativeTo(null);
        loginForm lg=new loginForm(this);        
        lg.setVisible(true);                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txtsearch = new javax.swing.JTextField();
        bntsearch = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblfriend = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtnamefriend = new javax.swing.JTextField();
        bntmore = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bntuser = new javax.swing.JButton();
        bntmess = new javax.swing.JButton();
        bntfriends = new javax.swing.JButton();
        bntcontact = new javax.swing.JButton();
        bntsetting = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txttext = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtsend = new javax.swing.JTextArea();
        bntsend = new javax.swing.JButton();
        bntlike = new javax.swing.JButton();
        bnticon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bntexit = new javax.swing.JButton();
        bnthide = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtsearch.setBackground(new java.awt.Color(204, 204, 255));
        txtsearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtsearch.setCaretColor(new java.awt.Color(204, 0, 0));
        txtsearch.setDisabledTextColor(new java.awt.Color(153, 153, 255));
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        bntsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-search-40.png"))); // NOI18N
        bntsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntsearchActionPerformed(evt);
            }
        });

        tblfriend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Bạn bè"
            }
        ));
        tblfriend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblfriendMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblfriend);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(bntsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtnamefriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamefriendActionPerformed(evt);
            }
        });

        bntmore.setBackground(new java.awt.Color(255, 255, 255));
        bntmore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-more-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtnamefriend, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(bntmore, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntmore, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtnamefriend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-50 (1).png"))); // NOI18N
        bntuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntuserActionPerformed(evt);
            }
        });

        bntmess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-bbm-messenger-50.png"))); // NOI18N
        bntmess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntmessActionPerformed(evt);
            }
        });

        bntfriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-search-property-50.png"))); // NOI18N
        bntfriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntfriendsActionPerformed(evt);
            }
        });

        bntcontact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-contact-50.png"))); // NOI18N
        bntcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntcontactActionPerformed(evt);
            }
        });

        bntsetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-automatic-50.png"))); // NOI18N
        bntsetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntsettingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntfriends, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntuser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntmess, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntsetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntuser, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntmess, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntfriends, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntsetting, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txttext.setColumns(20);
        txttext.setRows(5);
        jScrollPane2.setViewportView(txttext);

        txtsend.setColumns(20);
        txtsend.setRows(5);
        txtsend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsendKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsendKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(txtsend);

        bntsend.setBackground(new java.awt.Color(51, 0, 255));
        bntsend.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bntsend.setForeground(new java.awt.Color(255, 255, 255));
        bntsend.setText("Gửi");
        bntsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntsendActionPerformed(evt);
            }
        });

        bntlike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-facebook-like-48.png"))); // NOI18N

        bnticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-grinning-face-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntsend)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnticon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntlike, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(bnticon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bntlike, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(bntsend, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Cchat");

        bntexit.setText("X");
        bntexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntexitMouseClicked(evt);
            }
        });
        bntexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntexitActionPerformed(evt);
            }
        });

        bnthide.setText("-");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bnthide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntexit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntexit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnthide, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(803, 803, 803)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       formcaidat cd= new formcaidat();
       cd.setVisible(false);
        // TODO add your handling code here:
//        System.exit(0);
    }//GEN-LAST:event_formMouseClicked

    private void bntexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntexitMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_bntexitMouseClicked

    private void bntsettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsettingActionPerformed
       formcaidat cd= new formcaidat();
       cd.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_bntsettingActionPerformed

    private void txtsendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsendKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsendKeyPressed

    private void txtsendKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsendKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsendKeyTyped

    private void bntuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntuserActionPerformed
        // TODO add your handling code here:
        formuser fuser = new formuser(this);
        fuser.setVisible(true);
       
        //this.setVisible(false);
    }//GEN-LAST:event_bntuserActionPerformed

    private void bntmessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntmessActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bntmessActionPerformed

    private void bntcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntcontactActionPerformed
        // TODO add your handling code here:
        formcontacts fcontact = new formcontacts();
        fcontact.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bntcontactActionPerformed

    private void bntfriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntfriendsActionPerformed
        // TODO add your handling code here:
        formtimkiem ftimkiem = new formtimkiem();
        ftimkiem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntfriendsActionPerformed

    private void bntexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bntexitActionPerformed

    private void txtnamefriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamefriendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamefriendActionPerformed

    private void bntsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsendActionPerformed
        // TODO add your handling code here:
        contentchats ct = new contentchats();
        ct.getcontent();
        
        
    }//GEN-LAST:event_bntsendActionPerformed

    private void bntsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntsearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bntsearchActionPerformed

    private void tblfriendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblfriendMouseClicked
        // TODO add your handling code here:
        String f;
        f = tblfriend.getValueAt(tblfriend.getSelectedRow(), 0).toString();
        txtnamefriend.setText(f);
    }//GEN-LAST:event_tblfriendMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String user, sql, sql2;
        int idu=0,idf=0;
        user  = txtuser.getText();
        ketnoi kn = new ketnoi();
        
        sql = "select idu from username where taikhoan  = '"+user+"'";
        ResultSet rs = kn.TruyVan(sql);        
        
        rs = kn.TruyVan(sql);
        try {
            while (rs.next())
            {
                idu = rs.getInt("idu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(formtimkiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //String sql, sql2;
        sql="select username.taikhoan from connectuf inner join username on connectuf.idf = username.idu where connectuf.request = 1 and connectuf.idu = "+idu+" ";
        laydulieubb(sql);
        
    }//GEN-LAST:event_formWindowOpened

    
    public void laydulieubb(String sql){
        String header[] = {"Friends"};
        DefaultTableModel tblmodel= new DefaultTableModel(header, 0);
        try {
            Vector data = null;
            tblmodel.setRowCount(0);
            ketnoi kn = new ketnoi();
            ResultSet rs = kn.TruyVan(sql);
            while(rs.next()){
                data = new Vector();
                data.add(rs.getString("taikhoan"));
         
                tblmodel.addRow(data);
            }
            tblfriend.setModel(tblmodel);
        } catch (Exception e) {
            System.out.println("loi lay du lieu ds ban;" +e);
        }
    }
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
            java.util.logging.Logger.getLogger(formchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formchinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntcontact;
    private javax.swing.JButton bntexit;
    private javax.swing.JButton bntfriends;
    private javax.swing.JButton bnthide;
    private javax.swing.JButton bnticon;
    private javax.swing.JButton bntlike;
    private javax.swing.JButton bntmess;
    private javax.swing.JButton bntmore;
    private javax.swing.JButton bntsearch;
    private javax.swing.JButton bntsend;
    private javax.swing.JButton bntsetting;
    private javax.swing.JButton bntuser;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblfriend;
    public static javax.swing.JTextField txtnamefriend;
    private javax.swing.JTextField txtsearch;
    public static javax.swing.JTextArea txtsend;
    public static javax.swing.JTextArea txttext;
    // End of variables declaration//GEN-END:variables
}
