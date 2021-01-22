package com.mycompany.budjetti;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Kirjautuminen extends javax.swing.JFrame {

    ReadFile read = new ReadFile();
    String tunnus;
    char[] salasana;
    char[] vahvista;
    String txt = "tiedot.txt";
    String MenotTiedostonNimi;
    String TulotTiedostonNimi;

    public Kirjautuminen() {
        initComponents();
        jPanel1.setVisible(false);

        //ota taustakuva käyttöön
        jLabel9.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\budjetti\\taustakuva.jpg"));
        jLabel5.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\budjetti\\taustakuva.jpg"));

        jpswSalasana.setEchoChar('');
        jpswSalasana1.setEchoChar('');
        jpswSalasana2.setEchoChar('');
    }

    public void sulje() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnRekisteröidy = new javax.swing.JButton();
        jchkSalasana1 = new javax.swing.JCheckBox();
        jtxtTunnus1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblVahvista1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpswSalasana1 = new javax.swing.JPasswordField();
        jpswSalasana2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTunnus = new javax.swing.JTextField();
        jbtnKirjaudu = new javax.swing.JButton();
        jbtnLuo = new javax.swing.JButton();
        jpswSalasana = new javax.swing.JPasswordField();
        jchkSalasana = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jbtnRekisteröidy.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jbtnRekisteröidy.setText("Rekisteröidy");
        jbtnRekisteröidy.setMaximumSize(new java.awt.Dimension(129, 29));
        jbtnRekisteröidy.setMinimumSize(new java.awt.Dimension(129, 29));
        jbtnRekisteröidy.setPreferredSize(new java.awt.Dimension(129, 29));
        jbtnRekisteröidy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRekisteröidyActionPerformed(evt);
            }
        });

        jchkSalasana1.setFont(new java.awt.Font("Kristen ITC", 0, 10)); // NOI18N
        jchkSalasana1.setText("Näytä salasana");
        jchkSalasana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkSalasana1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jLabel6.setText("Tunnus :");

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jLabel7.setText("Salasana :");

        jlblVahvista1.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jlblVahvista1.setText("Vahvista salasana : ");

        jLabel8.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel8.setText("Tervetuloa oman Budjettiin");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblVahvista1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpswSalasana2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpswSalasana1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtTunnus1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnRekisteröidy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jchkSalasana1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtTunnus1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpswSalasana1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jchkSalasana1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblVahvista1)
                    .addComponent(jpswSalasana2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRekisteröidy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 350);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel1.setText("Tervetuloa oman Budjettiin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 100, 500, 40);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jLabel2.setText("Tunnus :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 170, 90, 25);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jLabel3.setText("Salasana :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 210, 100, 25);
        getContentPane().add(jtxtTunnus);
        jtxtTunnus.setBounds(200, 170, 178, 30);

        jbtnKirjaudu.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jbtnKirjaudu.setText("Kirjaudu sisään");
        jbtnKirjaudu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnKirjauduActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnKirjaudu);
        jbtnKirjaudu.setBounds(400, 170, 150, 29);

        jbtnLuo.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jbtnLuo.setText("Luo kääyttäjä");
        jbtnLuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLuoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLuo);
        jbtnLuo.setBounds(400, 20, 150, 29);
        getContentPane().add(jpswSalasana);
        jpswSalasana.setBounds(200, 210, 180, 30);

        jchkSalasana.setFont(new java.awt.Font("Kristen ITC", 0, 10)); // NOI18N
        jchkSalasana.setText("Näytä salasana");
        jchkSalasana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkSalasanaActionPerformed(evt);
            }
        });
        getContentPane().add(jchkSalasana);
        jchkSalasana.setBounds(400, 210, 150, 30);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 600, 160);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 160, 600, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnKirjauduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnKirjauduActionPerformed
        tunnus = jtxtTunnus.getText();
        salasana = jpswSalasana.getPassword();

        MenotTiedostonNimi = jtxtTunnus.getText() + "Menot.txt";
        TulotTiedostonNimi = jtxtTunnus.getText() + "Tulot.txt";

        boolean onLista = false;
        //käyttäjätietojen syötö verrataan jo tiedoston kirjoittaviin tietoihin
        if (read.read(tunnus, String.valueOf(salasana), txt)) {
            Ohjelma profiili = new Ohjelma(tunnus, MenotTiedostonNimi, TulotTiedostonNimi);
            profiili.setVisible(true);
            onLista = true;
            sulje();
        }

        if (onLista == false) {
            JOptionPane.showMessageDialog(this, "Tunnus tai salasana on väärin. Yritä uudelleen.");
            jtxtTunnus.requestFocus();
            return;
        }
    }//GEN-LAST:event_jbtnKirjauduActionPerformed

    private void jbtnLuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLuoActionPerformed
        //jPanel1 ilmestyy ja käyttäjä voi rekisteröidä
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jbtnLuoActionPerformed

    private void jbtnRekisteröidyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRekisteröidyActionPerformed
        tunnus = jtxtTunnus1.getText();
        salasana = jpswSalasana1.getPassword();
        vahvista = jpswSalasana2.getPassword();

        try {
            if (tunnus.length() == 0 || salasana.length == 0) {
                JOptionPane.showMessageDialog(null, "Merkintä jostakin kentästä puuttuu. Yritä uudelleen.", "Virhe", JOptionPane.ERROR_MESSAGE);
            } else {
                if (String.valueOf(salasana).equals(String.valueOf(vahvista))) {
                    ReadFile.saveToFile(jtxtTunnus1.getText(), jpswSalasana1.getPassword(), txt);

                    MenotTiedostonNimi = jtxtTunnus1.getText() + "Menot.txt";
                    TulotTiedostonNimi = jtxtTunnus1.getText() + "Tulot.txt";
                    File MenotTiedosto = new File(MenotTiedostonNimi);
                    File TulotTiedosto = new File(TulotTiedostonNimi);
                    MenotTiedosto.createNewFile();
                    TulotTiedosto.createNewFile();
                    JOptionPane.showMessageDialog(this, "Käyttäjä " + tunnus + " on luotu. \n Rekisteröinti onnistui.");
                    jPanel1.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Käyttäjä " + tunnus + " ei ole luotu. \n Vahvista salasana uudelleen.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Käyttäjä " + tunnus + " ei ole luotu. \n Yrittä uudelleen.");
        }

    }//GEN-LAST:event_jbtnRekisteröidyActionPerformed

    private void jchkSalasana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkSalasana1ActionPerformed
        if (jchkSalasana1.isSelected()) {
            jpswSalasana1.setEchoChar((char) 0);
            jpswSalasana2.setEchoChar((char) 0);
            jchkSalasana1.setSelected(true);
        } else {
            jpswSalasana1.setEchoChar('');
            jpswSalasana2.setEchoChar('');
            jchkSalasana1.setSelected(false);
        }
    }//GEN-LAST:event_jchkSalasana1ActionPerformed

    private void jchkSalasanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkSalasanaActionPerformed
        if (jchkSalasana.isSelected()) {
            jpswSalasana.setEchoChar((char) 0);
            jchkSalasana.setSelected(true);
        } else {
            jpswSalasana.setEchoChar('');
            jchkSalasana.setSelected(false);
        }
    }//GEN-LAST:event_jchkSalasanaActionPerformed

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
            java.util.logging.Logger.getLogger(Kirjautuminen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kirjautuminen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kirjautuminen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kirjautuminen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kirjautuminen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnKirjaudu;
    private javax.swing.JButton jbtnLuo;
    private javax.swing.JButton jbtnRekisteröidy;
    private javax.swing.JCheckBox jchkSalasana;
    private javax.swing.JCheckBox jchkSalasana1;
    private javax.swing.JLabel jlblVahvista1;
    private javax.swing.JPasswordField jpswSalasana;
    private javax.swing.JPasswordField jpswSalasana1;
    private javax.swing.JPasswordField jpswSalasana2;
    private javax.swing.JTextField jtxtTunnus;
    private javax.swing.JTextField jtxtTunnus1;
    // End of variables declaration//GEN-END:variables
}
