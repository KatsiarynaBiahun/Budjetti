package com.mycompany.budjetti;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class LisääMenot extends javax.swing.JFrame {

    public LisääMenot() {
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
        jradioMatkakortti = new javax.swing.JRadioButton();
        jtxtMuistiinpano = new javax.swing.JTextField();
        jradioLääkkeet = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jradioSuoratoistapalvelunMaksu = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jradioRuoka = new javax.swing.JRadioButton();
        jradioAsunnonVuokra = new javax.swing.JRadioButton();
        jbtnLisaa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jradioPuhelimenMaksu = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(jradioMatkakortti);
        jradioMatkakortti.setText("Matkakortti");

        buttonGroup1.add(jradioLääkkeet);
        jradioLääkkeet.setText("Lääkkeet");

        jLabel2.setText("Lasku, €:");

        buttonGroup1.add(jradioSuoratoistapalvelunMaksu);
        jradioSuoratoistapalvelunMaksu.setText("Suoratoistapalvelun maksu");

        jLabel3.setText("Muistiinpano:");

        buttonGroup1.add(jradioRuoka);
        jradioRuoka.setText("Ruoka");

        buttonGroup1.add(jradioAsunnonVuokra);
        jradioAsunnonVuokra.setText("Asunnon vuokra");

        jbtnLisaa.setText("Lisää");
        jbtnLisaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLisaaActionPerformed(evt);
            }
        });

        jLabel1.setText("Kategoria :");

        buttonGroup1.add(jradioPuhelimenMaksu);
        jradioPuhelimenMaksu.setText("Puhelimen maksu");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Meno");

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
                            .addComponent(jradioAsunnonVuokra)
                            .addComponent(jradioPuhelimenMaksu)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jradioRuoka))
                            .addComponent(jradioMatkakortti)
                            .addComponent(jradioLääkkeet)
                            .addComponent(jradioSuoratoistapalvelunMaksu))))
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
                        .addComponent(jradioRuoka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jradioAsunnonVuokra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jradioPuhelimenMaksu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradioMatkakortti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradioLääkkeet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jradioSuoratoistapalvelunMaksu)
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
        jradioRuoka.setActionCommand("Ruoka");
        jradioAsunnonVuokra.setActionCommand("AsunnonVuokra");
        jradioPuhelimenMaksu.setActionCommand("PuhelimenMaksu");
        jradioMatkakortti.setActionCommand("Matkakortti");
        jradioLääkkeet.setActionCommand("Lääkkeet");
        jradioSuoratoistapalvelunMaksu.setActionCommand("SuoratoistapalvelunMaksu");

        String kategoria = "";
        double lasku = Double.valueOf(jtxtLasku.getText());
        String muistiinpano = jtxtMuistiinpano.getText();

        if (buttonGroup1.getSelection().getActionCommand() == "Ruoka") {
            kategoria = "Ruoka";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "AsunnonVuokra") {
            kategoria = "AsunnonVuokra";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "PuhelimenMaksu") {
            kategoria = "PuhelimenMaksu";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "Matkakortti") {
            kategoria = "Matkakortti";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "Lääkkeet") {
            kategoria = "Lääkkeet";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "SuoratoistapalvelunMaksu") {
            kategoria = "SuoratoistapalvelunMaksu";
        }

        Tapahtuma tapahtuma = new Tapahtuma(kategoria, lasku, muistiinpano);

        Ohjelma rev = new Ohjelma();

        if (kategoria.equals("Ruoka")) {
            rev.ruoka.lisaa(tapahtuma);
        }
        if (kategoria.equals("AsunnonVuokra")) {
            rev.asunnonVuokra.lisaa(tapahtuma);
        }
        if (kategoria.equals("PuhelimenMaksu")) {
            rev.puhelimenMaksu.lisaa(tapahtuma);
        }
        if (kategoria.equals("Matkakortti")) {
            rev.matkakortti.lisaa(tapahtuma);
        }
        if (kategoria.equals("Lääkkeet")) {
            rev.lääkkeet.lisaa(tapahtuma);
        }
        if (kategoria.equals("SuoratoistapalvelunMaksu")) {
            rev.suoratoistapalvelunMaksu.lisaa(tapahtuma);
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
            java.util.logging.Logger.getLogger(LisääMenot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LisääMenot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LisääMenot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LisääMenot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LisääMenot().setVisible(true);
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
    private javax.swing.JRadioButton jradioAsunnonVuokra;
    private javax.swing.JRadioButton jradioLääkkeet;
    private javax.swing.JRadioButton jradioMatkakortti;
    private javax.swing.JRadioButton jradioPuhelimenMaksu;
    private javax.swing.JRadioButton jradioRuoka;
    private javax.swing.JRadioButton jradioSuoratoistapalvelunMaksu;
    private javax.swing.JTextField jtxtLasku;
    private javax.swing.JTextField jtxtMuistiinpano;
    // End of variables declaration//GEN-END:variables
}
