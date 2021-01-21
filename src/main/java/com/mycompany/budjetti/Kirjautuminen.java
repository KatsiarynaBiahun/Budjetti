package com.mycompany.budjetti;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class Kirjautuminen extends javax.swing.JFrame {

    ReadFile read = new ReadFile();
    String tunnus;
    String salasana;

    public Kirjautuminen() {
        initComponents();
        jPanel1.setVisible(false);
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
        jtxtTunnus1 = new javax.swing.JTextField();
        jtxtSalasana1 = new javax.swing.JTextField();
        jtxtVahvista1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblVahvista1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTunnus = new javax.swing.JTextField();
        jbtnKirjaudu = new javax.swing.JButton();
        jbtnLuo = new javax.swing.JButton();
        jtxtSalasana = new javax.swing.JTextField();
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

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jLabel6.setText("Tunnus :");

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jLabel7.setText("Salasana :");

        jlblVahvista1.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        jlblVahvista1.setText("Vahvista salasana : ");

        jLabel8.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel8.setText("Tervetuloa oman Budjettiin");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\94630\\OneDrive\\Työpöytä\\gettyimages-472297015-2048x2048.jpg")); // NOI18N
        jLabel9.setText("jLabel5");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jtxtTunnus1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jtxtSalasana1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblVahvista1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jtxtVahvista1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnRekisteröidy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jtxtTunnus1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jtxtSalasana1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblVahvista1)
                            .addComponent(jtxtVahvista1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbtnRekisteröidy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
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
        jbtnLuo.setBounds(400, 210, 150, 29);
        getContentPane().add(jtxtSalasana);
        jtxtSalasana.setBounds(200, 210, 178, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\94630\\OneDrive\\Työpöytä\\gettyimages-472297015-2048x2048.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
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
        salasana = jtxtSalasana.getText();
        String txt = "tiedot.txt";

        boolean onLista = false;
        //käyttäjätietojen syötö verrataan jo tiedoston kirjoittaviin tietoihin
        if (read.read(tunnus, salasana, txt)) {
            Ohjelma g = new Ohjelma(tunnus);
            g.setVisible(true);
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
        String new_path = "tiedot.txt";
        tunnus = jtxtTunnus1.getText();
        salasana = jtxtSalasana1.getText();
        String vahvista = jtxtVahvista1.getText();

        if (tunnus.length() == 0 || salasana.length() == 0) {
            JOptionPane.showMessageDialog(null, "Merkintä jostakin kentästä puuttuu. Yritä uudelleen.", "Virhe", JOptionPane.ERROR_MESSAGE);
        } else {
            if (salasana.equals(vahvista)) {
                //käyttäjätiedot luetaan oikeassa muodossa Tunnistetiedot luokan avulla
                Tunnistetiedot käyttäjä = new Tunnistetiedot(tunnus, salasana);
                String merkkijono = käyttäjä.toString();
                
                //käyttäjätiedot lisää tiedot.txt -asiakirjaan 
                ReadFile.lisaaMerkkijono(merkkijono, new_path);
                
                JOptionPane.showMessageDialog(this, "Käyttäjä " + tunnus + " on luotu. \n Rekisteröinti onnistui.");
                jPanel1.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Käyttäjä " + tunnus + " ei ole luotu. \n Vahvista salasana uudelleen.");
            }
        }
    }//GEN-LAST:event_jbtnRekisteröidyActionPerformed

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
            java.util.logging.Logger.getLogger(Kirjautuminen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kirjautuminen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kirjautuminen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kirjautuminen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jlblVahvista1;
    private javax.swing.JTextField jtxtSalasana;
    private javax.swing.JTextField jtxtSalasana1;
    private javax.swing.JTextField jtxtTunnus;
    private javax.swing.JTextField jtxtTunnus1;
    private javax.swing.JTextField jtxtVahvista1;
    // End of variables declaration//GEN-END:variables
}