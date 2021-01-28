package com.mycompany.budjetti;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LisääTulot extends javax.swing.JFrame {

    private Ohjelma paa;
    private String txt;

    public LisääTulot(Object ohjelma, String txt) {
        initComponents();
        this.setTitle("Lisää tulot, ole hyvä!");
        paa = (Ohjelma) ohjelma;
        this.txt = txt;

        //ota taustakuva käyttöön
        Image uusi = new Image();
        ImageIcon label5 = uusi.loadIcon("/taustakuva.jpg");
        jLabel5.setIcon(label5);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jtxtLasku);
        jtxtLasku.setBounds(150, 300, 55, 30);

        buttonGroup1.add(jradioMaksunPalautus);
        jradioMaksunPalautus.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioMaksunPalautus.setText("Maksun palautus ");
        getContentPane().add(jradioMaksunPalautus);
        jradioMaksunPalautus.setBounds(150, 210, 160, 29);
        getContentPane().add(jtxtMuistiinpano);
        jtxtMuistiinpano.setBounds(150, 340, 184, 40);

        buttonGroup1.add(jradioKiinteistöjenTulot);
        jradioKiinteistöjenTulot.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioKiinteistöjenTulot.setText("Kiinteistöjen tulot");
        getContentPane().add(jradioKiinteistöjenTulot);
        jradioKiinteistöjenTulot.setBounds(150, 240, 160, 29);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel2.setText("Summa, € *");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 300, 110, 25);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel3.setText("Muistiinpano ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 340, 130, 25);

        buttonGroup1.add(jradioPalkka);
        jradioPalkka.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioPalkka.setText("Palkka");
        getContentPane().add(jradioPalkka);
        jradioPalkka.setBounds(150, 120, 71, 29);

        buttonGroup1.add(jradioLahja);
        jradioLahja.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioLahja.setText("Lahja");
        getContentPane().add(jradioLahja);
        jradioLahja.setBounds(150, 150, 65, 29);

        jbtnLisaa.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jbtnLisaa.setText("Lisää");
        jbtnLisaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLisaaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLisaa);
        jbtnLisaa.setBounds(150, 390, 79, 33);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel1.setText("Kategoria *");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 120, 110, 19);

        buttonGroup1.add(jradioTuki);
        jradioTuki.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioTuki.setText("Tuki");
        getContentPane().add(jradioTuki);
        jradioTuki.setBounds(150, 180, 57, 29);

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel4.setText("Tulo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 40, 100, 49);

        buttonGroup1.add(jradioInvestoinnit);
        jradioInvestoinnit.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioInvestoinnit.setText("Investoinnit");
        getContentPane().add(jradioInvestoinnit);
        jradioInvestoinnit.setBounds(150, 270, 130, 29);

        jLabel5.setPreferredSize(new java.awt.Dimension(400, 450));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 110);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 110, 400, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLisaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLisaaActionPerformed
        jradioPalkka.setActionCommand("Palkka");
        jradioLahja.setActionCommand("Lahja");
        jradioTuki.setActionCommand("Tuki");
        jradioMaksunPalautus.setActionCommand("Maksun Palautus");
        jradioKiinteistöjenTulot.setActionCommand("Kiinteistöjen Tulot");
        jradioInvestoinnit.setActionCommand("Investoinnit");

        try {
            Double.parseDouble(jtxtLasku.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lasku on pakko olla lukuna.");
            return;
        }

        double lasku = Double.valueOf(jtxtLasku.getText());
        if (lasku <= 0) {
            JOptionPane.showMessageDialog(this, "Lasku on pakko olla ennemmän kuin nolla.");
            return;
        }
        
        if (!(buttonGroup1.getSelection() == null || jtxtLasku.getText().isEmpty())) {

            String kategoria = "";
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
                kategoria = "Maksun palautus";
            }
            if (buttonGroup1.getSelection().getActionCommand() == "Kiinteistöjen Tulot") {
                kategoria = "Kiinteistöjen tulot";
            }
            if (buttonGroup1.getSelection().getActionCommand() == "Investoinnit") {
                kategoria = "Investoinnit";
            }

            //tapahtuma luetaan oikeassa muodossa Tapahtuma luokan avulla
            Tapahtuma tapahtuma = new Tapahtuma(kategoria, lasku, muistiinpano);
            String merkkijono = tapahtuma.toString();

            //tapahtuma lisää Tulot.txt -asiakirjaan
            ReadFile.lisaaMerkkijono(merkkijono, txt);

            //tapahtuma-merkkijono välitetään Ohjelma pääluokalle
            paa.timer(merkkijono, this.txt, paa.modelTulot, paa.readTulot);

            JOptionPane.showMessageDialog(this, "Lisääminen onnistui. Lisä uudellen tai sulje ikkuna.");

            buttonGroup1.clearSelection();
            jtxtLasku.setText("");
            jtxtMuistiinpano.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Kategoria tai laskun summa on tyhjä. Kirjoita sen ja yritä uudelleen.");
        }
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
                new LisääTulot("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
