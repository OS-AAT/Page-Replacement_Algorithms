/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_r;

import java.awt.Color;

/**
 *
 * @author shreehari
 */
public class algorithm extends javax.swing.JFrame {

    /**
     * Creates new form algorithm
     */
    public algorithm() {
        initComponents();
        tab1_al.setBackground(new Color(255,255,255));
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1 = new javax.swing.JPanel();
        tab3_al = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab1_al = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        jLabel1_al = new javax.swing.JLabel();
        fifo = new javax.swing.JButton();
        lru = new javax.swing.JButton();
        optimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jp1.setBackground(new java.awt.Color(11, 110, 226));
        jp1.setForeground(new java.awt.Color(81, 123, 215));

        tab3_al.setBackground(new java.awt.Color(158, 200, 242));
        tab3_al.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3_alMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel2.setText("HOME");

        javax.swing.GroupLayout tab3_alLayout = new javax.swing.GroupLayout(tab3_al);
        tab3_al.setLayout(tab3_alLayout);
        tab3_alLayout.setHorizontalGroup(
            tab3_alLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3_alLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab3_alLayout.setVerticalGroup(
            tab3_alLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3_alLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab1_al.setBackground(new java.awt.Color(158, 200, 242));
        tab1_al.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1_alMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel3.setText("ALGORITHM");

        javax.swing.GroupLayout tab1_alLayout = new javax.swing.GroupLayout(tab1_al);
        tab1_al.setLayout(tab1_alLayout);
        tab1_alLayout.setHorizontalGroup(
            tab1_alLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1_alLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab1_alLayout.setVerticalGroup(
            tab1_alLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1_alLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("OS AAT");

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab3_al, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab1_al, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label1)
                .addGap(95, 95, 95)
                .addComponent(tab3_al, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab1_al, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp2.setBackground(new java.awt.Color(59, 128, 94));
        jp2.setForeground(java.awt.Color.yellow);

        jLabel1_al.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel1_al.setForeground(java.awt.Color.white);
        jLabel1_al.setText("       ALGORITHM");

        fifo.setBackground(java.awt.Color.lightGray);
        fifo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/f.jpeg"))); // NOI18N
        fifo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifoActionPerformed(evt);
            }
        });

        lru.setBackground(new java.awt.Color(255, 255, 255));
        lru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lru_finally_final.jpeg"))); // NOI18N
        lru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lruActionPerformed(evt);
            }
        });

        optimal.setBackground(new java.awt.Color(245, 255, 255));
        optimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/optimal.jpeg"))); // NOI18N
        optimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                        .addComponent(fifo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lru, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(optimal, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                        .addComponent(jLabel1_al, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1_al)
                .addGap(88, 88, 88)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lru, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fifo, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optimal, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab3_alMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3_alMouseClicked

        jp2.setVisible(true);
        page p=new page();
        p.setVisible(true);
        setVisible(false);

        tab3_al.setBackground(Color.WHITE);
        tab1_al.setBackground(new Color(158,200,242));


    }//GEN-LAST:event_tab3_alMouseClicked

    private void tab1_alMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1_alMouseClicked

        //  jp2.setVisible(false);
        tab1_al.setBackground(Color.WHITE);
        tab3_al.setBackground(new Color(158,200,242));
        

    }//GEN-LAST:event_tab1_alMouseClicked

    private void fifoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifoActionPerformed

        fifo f=new fifo();
        f.setVisible(true);
    }//GEN-LAST:event_fifoActionPerformed

    private void lruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lruActionPerformed
        lru l=new lru();
        l.setVisible(true);
    }//GEN-LAST:event_lruActionPerformed

    private void optimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optimalActionPerformed
        optimal o=new optimal();
        o.setVisible(true);
    }//GEN-LAST:event_optimalActionPerformed

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
            java.util.logging.Logger.getLogger(algorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(algorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(algorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(algorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new algorithm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fifo;
    private javax.swing.JLabel jLabel1_al;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JLabel label1;
    private javax.swing.JButton lru;
    private javax.swing.JButton optimal;
    private javax.swing.JPanel tab1_al;
    private javax.swing.JPanel tab3_al;
    // End of variables declaration//GEN-END:variables
}