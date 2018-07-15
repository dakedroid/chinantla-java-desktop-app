/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinantla;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import sun.awt.resources.awt;

/**
 *
 * @author proxc
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home14
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void showEntradas(){
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        users1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_sent = new javax.swing.JLabel();
        lbl_inbox1 = new javax.swing.JLabel();
        lbl_trash = new javax.swing.JLabel();
        lbl_mark = new javax.swing.JLabel();
        lbl_outbox = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        indicator = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        indicator1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 680));

        users1.setBackground(new java.awt.Color(255, 255, 255));
        users1.setForeground(new java.awt.Color(255, 255, 255));
        users1.setPreferredSize(new java.awt.Dimension(1200, 680));

        jPanel1.setBackground(new java.awt.Color(245, 227, 189));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 680));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_sent.setBackground(new java.awt.Color(245, 227, 189));
        lbl_sent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_sent.setForeground(new java.awt.Color(0, 0, 0));
        lbl_sent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_sent.setText("Salidas");
        lbl_sent.setIconTextGap(10);
        lbl_sent.setOpaque(true);
        lbl_sent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_sentMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_sent, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 225, 217, 23));

        lbl_inbox1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_inbox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_inbox1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_inbox1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_inbox1.setText("Inicio");
        lbl_inbox1.setIconTextGap(10);
        lbl_inbox1.setOpaque(true);
        lbl_inbox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_inbox1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_inbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 162, 215, 23));

        lbl_trash.setBackground(new java.awt.Color(245, 227, 189));
        lbl_trash.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_trash.setForeground(new java.awt.Color(0, 0, 0));
        lbl_trash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_trash.setText("Inventario");
        lbl_trash.setIconTextGap(10);
        lbl_trash.setOpaque(true);
        lbl_trash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_trashMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_trash, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 254, 217, 23));

        lbl_mark.setBackground(new java.awt.Color(245, 227, 189));
        lbl_mark.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_mark.setForeground(new java.awt.Color(0, 0, 0));
        lbl_mark.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_mark.setText("Entradas");
        lbl_mark.setIconTextGap(10);
        lbl_mark.setOpaque(true);
        lbl_mark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_markMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_mark, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 196, 217, 23));

        lbl_outbox.setBackground(new java.awt.Color(245, 227, 189));
        lbl_outbox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_outbox.setForeground(new java.awt.Color(0, 0, 0));
        lbl_outbox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_outbox.setText("Ajustes");
        lbl_outbox.setIconTextGap(10);
        lbl_outbox.setOpaque(true);
        lbl_outbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_outboxMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_outbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 289, 217, 23));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chinantla_logo.png"))); // NOI18N
        jLabel15.setText("HELLO");
        jLabel15.setPreferredSize(new java.awt.Dimension(200, 99));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 99));

        users.setBackground(new java.awt.Color(255, 255, 255));
        users.setForeground(new java.awt.Color(255, 255, 255));
        users.setPreferredSize(new java.awt.Dimension(240, 680));

        jPanel2.setBackground(new java.awt.Color(245, 227, 189));
        jPanel2.setPreferredSize(new java.awt.Dimension(204, 79));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("Dias transcurridos: 4");

        jLabel7.setText("Utilidad del Mes");

        indicator.setBackground(new java.awt.Color(62, 224, 188));
        indicator.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel11.setText("Ganancia: $4000.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(indicator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(indicator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(245, 227, 189));
        jPanel4.setPreferredSize(new java.awt.Dimension(196, 79));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("Fecha de cafucidad: 21-Julio");

        jLabel8.setText("Estado del Cafe");

        indicator1.setBackground(new java.awt.Color(62, 224, 188));
        indicator1.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel12.setText("Fecha de entrada: 1 - Julio ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel12)))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(245, 227, 189));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setText("cafe-chinantla@gmail.com");

        jLabel9.setText("Contacto");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel13.setText("2871551830");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(245, 227, 189));
        jPanel6.setPreferredSize(new java.awt.Dimension(216, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("Numero de ventas: 120");

        jLabel6.setText("Ventas en el dia");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout usersLayout = new javax.swing.GroupLayout(users);
        users.setLayout(usersLayout);
        usersLayout.setHorizontalGroup(
            usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        usersLayout.setVerticalGroup(
            usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        content.setForeground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(710, 680));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setBackground(new java.awt.Color(33, 63, 86));
        close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(33, 63, 86));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        content.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 31, 25));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Cafe Chinantla");
        content.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 155, -1));
        content.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 222, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("12/04/18");
        content.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 130, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Fecha");
        content.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 110, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Hora");
        content.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel18.setText("20:10 ");
        content.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 160, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        jLabel19.setPreferredSize(new java.awt.Dimension(710, 680));
        content.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        javax.swing.GroupLayout users1Layout = new javax.swing.GroupLayout(users1);
        users1.setLayout(users1Layout);
        users1Layout.setHorizontalGroup(
            users1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(users1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        users1Layout.setVerticalGroup(
            users1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_inbox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_inbox1MouseClicked
        // TODO add your handling code here:

        setLblColor(lbl_inbox1);
        resetLblColor(lbl_mark);
        resetLblColor(lbl_sent);
        resetLblColor(lbl_trash);
        resetLblColor(lbl_outbox);

        content.setVisible(true);
        users.setVisible(true);

    }//GEN-LAST:event_lbl_inbox1MouseClicked

    private void lbl_markMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_markMouseClicked
        // TODO add your handling code here:
        setLblColor(lbl_mark);
        resetLblColor(lbl_inbox1);
        resetLblColor(lbl_sent);
        resetLblColor(lbl_trash);
        resetLblColor(lbl_outbox);

        content.setVisible(false);
        users.setVisible(false);
        
        
    }//GEN-LAST:event_lbl_markMouseClicked

    private void lbl_sentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_sentMouseClicked
        // TODO add your handling code here:
        setLblColor(lbl_sent);
        resetLblColor(lbl_inbox1);
        resetLblColor(lbl_mark);
        resetLblColor(lbl_trash);
        resetLblColor(lbl_outbox);
    }//GEN-LAST:event_lbl_sentMouseClicked

    private void lbl_trashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_trashMouseClicked
        // TODO add your handling code here:
        setLblColor(lbl_trash);
        resetLblColor(lbl_inbox1);
        resetLblColor(lbl_mark);
        resetLblColor(lbl_sent);
        resetLblColor(lbl_outbox);
    }//GEN-LAST:event_lbl_trashMouseClicked

    private void lbl_outboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_outboxMouseClicked
        // TODO add your handling code here:
        setLblColor(lbl_outbox);
        resetLblColor(lbl_inbox1);
        resetLblColor(lbl_mark);
        resetLblColor(lbl_sent);
        resetLblColor(lbl_trash);

    }//GEN-LAST:event_lbl_outboxMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    int xy;
    int xx;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    void doMove(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - evt.getX(), y - evt.getY());

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    public void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(255, 255, 255));
    }

    public void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(245, 227, 189));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JPanel content;
    private javax.swing.JLabel img;
    private javax.swing.JLabel indicator;
    private javax.swing.JLabel indicator1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_inbox1;
    private javax.swing.JLabel lbl_mark;
    private javax.swing.JLabel lbl_outbox;
    private javax.swing.JLabel lbl_sent;
    private javax.swing.JLabel lbl_trash;
    private javax.swing.JPanel users;
    private javax.swing.JPanel users1;
    // End of variables declaration//GEN-END:variables
}