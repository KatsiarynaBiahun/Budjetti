package com.mycompany.budjetti;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class LisääTulot extends javax.swing.JFrame {

    public LisääTulot() {
        initComponents();
        this.setTitle("Lisää menot, ole hyvä!");
    }

    public void sulje() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtxtLasku = new javax.swing.JTextField();
        jradioMaksunPalautus = new javax.swing.JRadioButton();
        jtxtMuistiinpano = new javax.swing.JTextField();
        jradioKiinteistöjenTulot = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jradioPalkka = new javax.swing.JRadioButton();
        jradioLahja = new javax.swing.JRadioButton();
        jbtnLisaa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jradioTuki = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jradioInvestoinnit = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(jradioMaksunPalautus);
        jradioMaksunPalautus.setText("Maksun palautus ");

        buttonGroup1.add(jradioKiinteistöjenTulot);
        jradioKiinteistöjenTulot.setText("Kiinteistöjen tulot");

        jLabel2.setText("Lasku, €:");

        jLabel3.setText("Muistiinpano:");

        buttonGroup1.add(jradioPalkka);
        jradioPalkka.setText("Palkka");

        buttonGroup1.add(jradioLahja);
        jradioLahja.setText("Lahja");

        jbtnLisaa.setText("Lisää");
        jbtnLisaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLisaaActionPerformed(evt);
            }
        });

        jLabel1.setText("Kategoria :");

        buttonGroup1.add(jradioTuki);
        jradioTuki.setText("Tuki");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Tulo");

        jradioInvestoinnit.setText("Investoinnit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtLasku, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLisaa)
                            .addComponent(jtxtMuistiinpano, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jradioLahja)
                            .addComponent(jradioTuki)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jradioPalkka))
                            .addComponent(jradioMaksunPalautus)
                            .addComponent(jradioKiinteistöjenTulot)
                            .addComponent(jradioInvestoinnit))))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jradioPalkka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jradioLahja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jradioTuki)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradioMaksunPalautus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradioKiinteistöjenTulot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradioInvestoinnit)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtLasku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtMuistiinpano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addComponent(jbtnLisaa)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLisaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLisaaActionPerformed
        jradioPalkka.setActionCommand("Palkka");
        jradioLahja.setActionCommand("Lahja");
        jradioTuki.setActionCommand("Tuki");
        jradioMaksunPalautus.setActionCommand("Maksun Palautus");
        jradioKiinteistöjenTulot.setActionCommand("Kiinteistöjen Tulot");
        jradioInvestoinnit.setActionCommand("Investoinnit");

        String kategoria = "";
        double lasku = Double.valueOf(jtxtLasku.getText());
        String muistiinpano = jtxtMuistiinpano.getText();

        if (buttonGroup1.getSelection().getActionCommand() == "Palkka") {
            kategoria = "Palkka";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "Lahja") {
            kategoria = "Lahja";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "Tuki") {
            kategoria = "Tuki";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "Maksun Palautus") {
            kategoria = "Maksun Palautus";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "Kiinteistöjen Tulot") {
            kategoria = "Kiinteistöjen Tulot";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "Investoinnit") {
            kategoria = "Investoinnit";
        }

        Tapahtuma tapahtuma = new Tapahtuma(kategoria, lasku, muistiinpano);

        Ohjelma rev = new Ohjelma();

        if (kategoria.equals("Palkka")) {
            rev.palkka.lisaa(tapahtuma);
        }
        if (kategoria.equals("Lahja")) {
            rev.lahja.lisaa(tapahtuma);
        }
        if (kategoria.equals("Tuki")) {
            rev.tuki.lisaa(tapahtuma);
        }
        if (kategoria.equals("Maksun Palautus")) {
            rev.maksunPalautus.lisaa(tapahtuma);
        }
        if (kategoria.equals("Kiinteistöjen Tulot")) {
            rev.kiinteistöjenTulot.lisaa(tapahtuma);
        }
        if (kategoria.equals("Investoinnit")) {
            rev.investoinnit.lisaa(tapahtuma);
        }

        Ohjelma g = new Ohjelma();
        g.setVisible(true);
        sulje();
    }//GEN-LAST:event_jbtnLisaaActionPerformed

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
            java.util.logging.Logger.getLogger(LisääTulot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LisääTulot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LisääTulot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LisääTulot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LisääTulot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnLisaa;
    private javax.swing.JRadioButton jradioInvestoinnit;
    private javax.swing.JRadioButton jradioKiinteistöjenTulot;
    private javax.swing.JRadioButton jradioLahja;
    private javax.swing.JRadioButton jradioMaksunPalautus;
    private javax.swing.JRadioButton jradioPalkka;
    private javax.swing.JRadioButton jradioTuki;
    private javax.swing.JTextField jtxtLasku;
    private javax.swing.JTextField jtxtMuistiinpano;
    // End of variables declaration//GEN-END:variables
}
