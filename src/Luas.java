
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
public class Luas extends javax.swing.JFrame {

    /**
     * Creates new form Luas
     */
    public Luas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jsisi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpanjangpp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jlebarpp = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jalas = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jtinggi = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jjari = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jd1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jd2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jalas1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jtinggi1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel3.setText("Cm");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 40, 130, 40);
        jPanel1.add(jsisi);
        jsisi.setBounds(20, 40, 70, 30);

        jLabel4.setText("Masukan panjang sisi");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 10, 130, 40);

        jButton4.setText("Hitung");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 80, 80, 30);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(0, -10, 470, 210);

        jTabbedPane1.addTab("PERSEGI", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setLayout(null);

        jLabel5.setText("Cm");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 10, 130, 40);

        jpanjangpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpanjangppActionPerformed(evt);
            }
        });
        jPanel2.add(jpanjangpp);
        jpanjangpp.setBounds(120, 10, 70, 30);

        jLabel6.setText("Masukan panjang :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 10, 130, 40);

        jButton5.setText("Hitung");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(250, 40, 80, 30);

        jLabel15.setText("Cm");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(200, 50, 130, 40);

        jlebarpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlebarppActionPerformed(evt);
            }
        });
        jPanel2.add(jlebarpp);
        jlebarpp.setBounds(120, 50, 70, 30);

        jLabel16.setText("Masukan lebar :");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(20, 50, 130, 40);

        jTabbedPane1.addTab("PERSEGI PANJANG", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(null);

        jLabel17.setText("Cm");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(200, 10, 130, 40);

        jalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalasActionPerformed(evt);
            }
        });
        jPanel3.add(jalas);
        jalas.setBounds(120, 10, 70, 30);

        jLabel18.setText("Masukan alas :");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(20, 10, 130, 40);

        jButton10.setText("Hitung");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(250, 40, 80, 30);

        jLabel19.setText("Cm");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(200, 50, 130, 40);

        jtinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtinggiActionPerformed(evt);
            }
        });
        jPanel3.add(jtinggi);
        jtinggi.setBounds(120, 50, 70, 30);

        jLabel20.setText("Masukan tinggi :");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(20, 50, 130, 40);

        jTabbedPane1.addTab("SEGITIGA", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(null);

        jLabel13.setText("Cm");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(100, 40, 130, 40);
        jPanel4.add(jjari);
        jjari.setBounds(20, 40, 70, 30);

        jLabel14.setText("Masukan panjang jari - jari");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(20, 10, 190, 40);

        jButton9.setText("Hitung");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9);
        jButton9.setBounds(20, 80, 80, 30);

        jTabbedPane1.addTab("LINGKARAN", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(null);

        jLabel7.setText("Cm");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(220, 10, 130, 40);

        jd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jd1ActionPerformed(evt);
            }
        });
        jPanel5.add(jd1);
        jd1.setBounds(140, 10, 70, 30);

        jLabel8.setText("Masukan diagonal 1 :");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(10, 10, 130, 40);

        jButton6.setText("Hitung");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(270, 40, 80, 30);

        jLabel21.setText("Cm");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(220, 50, 130, 40);

        jd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jd2ActionPerformed(evt);
            }
        });
        jPanel5.add(jd2);
        jd2.setBounds(140, 50, 70, 30);

        jLabel22.setText("Masukan diagonal 2 :");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(10, 50, 130, 40);

        jTabbedPane1.addTab("LAYANG LAYANG", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setLayout(null);

        jLabel23.setText("Cm");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(200, 10, 130, 40);

        jalas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalas1ActionPerformed(evt);
            }
        });
        jPanel6.add(jalas1);
        jalas1.setBounds(120, 10, 70, 30);

        jLabel24.setText("Masukan alas :");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(20, 10, 130, 40);

        jButton11.setText("Hitung");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11);
        jButton11.setBounds(250, 40, 80, 30);

        jLabel25.setText("Cm");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(200, 50, 130, 40);

        jtinggi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtinggi1ActionPerformed(evt);
            }
        });
        jPanel6.add(jtinggi1);
        jtinggi1.setBounds(120, 50, 70, 30);

        jLabel26.setText("Masukan tinggi :");
        jPanel6.add(jLabel26);
        jLabel26.setBounds(20, 50, 130, 40);

        jTabbedPane1.addTab("JAJAR GENJANG", jPanel6);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 80, 420, 170);

        jButton1.setText("EXIT");
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 260, 70, 40);

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        jLabel1.setText("LUAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 40, 50, 50);

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        jLabel2.setText("PROGRAM PENGHITUNG LUAS, LUAS PERMUKAAN, DAN VOLUME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 400, 50);

        jPanel9.setBackground(new java.awt.Color(153, 255, 255));

        jButton2.setText("VOLUME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("LUAS PERMUKAAN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 240, 470, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    int sisi;
    sisi=Integer.parseInt(jsisi.getText());
    int hasil=sisi*sisi;
    try {
        JOptionPane.showMessageDialog(null,"Luas persegi adalah :"+hasil,"luas",
                JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error :"+e,"gagal",
                JOptionPane.WARNING_MESSAGE);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jlebarppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlebarppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlebarppActionPerformed

    private void jpanjangppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpanjangppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpanjangppActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    int pjg,lbr;
    pjg=Integer.parseInt(jpanjangpp.getText());
    lbr=Integer.parseInt(jlebarpp.getText());
    int hasil=pjg*lbr;
    try {
        JOptionPane.showMessageDialog(null,"Luas Persegi Panjang Adalah :"+hasil,"luas",
                JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error :"+e,"gagal",
                JOptionPane.WARNING_MESSAGE);
    }             // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jalasActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    float alas,tinggi;
    alas=Integer.parseInt(jalas.getText());
    tinggi=Integer.parseInt(jtinggi.getText());
    float hasil=(float) (alas*tinggi/2);
    try {
        JOptionPane.showMessageDialog(null,"Luas Segitiga Adalah :"+hasil,"luas",
                JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error :"+e,"gagal",
                JOptionPane.WARNING_MESSAGE);
    }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jtinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtinggiActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     float jari;
    jari=Integer.parseInt(jjari.getText());
    float hasil=(float) (3.14*jari*jari);
    try {
        JOptionPane.showMessageDialog(null,"Luas Lingkaran Adalah :"+hasil,"luas",
                JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error :"+e,"gagal",
                JOptionPane.WARNING_MESSAGE);
    }       // TODO         // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jd1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    float d1,d2;
    d1=Integer.parseInt(jd1.getText());
    d2=Integer.parseInt(jd2.getText());
    float hasil=(float) (d1*d2/2);
    try {
        JOptionPane.showMessageDialog(null,"Luas layangan Adalah :"+hasil,"luas",
                JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error :"+e,"gagal",
                JOptionPane.WARNING_MESSAGE);
    }             // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jd2ActionPerformed

    private void jalas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jalas1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    int alasjg,tinggijg;
    alasjg=Integer.parseInt(jalas1.getText());
    tinggijg=Integer.parseInt(jtinggi1.getText());
    int hasil=alasjg*tinggijg;
    try {
        JOptionPane.showMessageDialog(null,"Luas Jajar Genjang Panjang Adalah :"+hasil,"luas",
                JOptionPane.INFORMATION_MESSAGE);
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error :"+e,"gagal",
                JOptionPane.WARNING_MESSAGE);
    }                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jtinggi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtinggi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtinggi1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    new LuasPermukaan ().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new Volume ().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Luas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Luas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Luas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Luas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Luas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jalas;
    private javax.swing.JTextField jalas1;
    private javax.swing.JTextField jd1;
    private javax.swing.JTextField jd2;
    private javax.swing.JTextField jjari;
    private javax.swing.JTextField jlebarpp;
    private javax.swing.JTextField jpanjangpp;
    private javax.swing.JTextField jsisi;
    private javax.swing.JTextField jtinggi;
    private javax.swing.JTextField jtinggi1;
    // End of variables declaration//GEN-END:variables
}
