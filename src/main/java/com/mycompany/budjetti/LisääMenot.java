package com.mycompany.budjetti;

import javax.swing.JOptionPane;

public class LisääMenot extends javax.swing.JFrame {

    private Ohjelma paa;
    private String txt;
    
    public LisääMenot(Object ohjelma, String txt) {
        initComponents();
        this.setTitle("Lisää menot, ole hyvä!");
        paa = (Ohjelma) ohjelma;
        this.txt = txt;
        
        //ota taustakuva käyttöön
        jLabel5.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\budjetti\\taustakuva.jpg"));
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jtxtLasku);
        jtxtLasku.setBounds(150, 300, 55, 30);

        buttonGroup1.add(jradioMatkakortti);
        jradioMatkakortti.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioMatkakortti.setText("Matkakortti");
        getContentPane().add(jradioMatkakortti);
        jradioMatkakortti.setBounds(150, 210, 113, 29);
        getContentPane().add(jtxtMuistiinpano);
        jtxtMuistiinpano.setBounds(150, 340, 184, 40);

        buttonGroup1.add(jradioLääkkeet);
        jradioLääkkeet.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioLääkkeet.setText("Lääkkeet");
        getContentPane().add(jradioLääkkeet);
        jradioLääkkeet.setBounds(150, 240, 91, 29);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel2.setText("Lasku, € :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 300, 90, 25);

        buttonGroup1.add(jradioSuoratoistapalvelunMaksu);
        jradioSuoratoistapalvelunMaksu.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioSuoratoistapalvelunMaksu.setText("Suoratoistapalvelun maksu");
        getContentPane().add(jradioSuoratoistapalvelunMaksu);
        jradioSuoratoistapalvelunMaksu.setBounds(150, 270, 230, 21);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel3.setText("Muistiinpano :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 340, 130, 25);

        buttonGroup1.add(jradioRuoka);
        jradioRuoka.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioRuoka.setText("Ruoka");
        getContentPane().add(jradioRuoka);
        jradioRuoka.setBounds(150, 120, 120, 29);

        buttonGroup1.add(jradioAsunnonVuokra);
        jradioAsunnonVuokra.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioAsunnonVuokra.setText("Asunnon vuokra");
        getContentPane().add(jradioAsunnonVuokra);
        jradioAsunnonVuokra.setBounds(150, 150, 137, 30);

        jbtnLisaa.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jbtnLisaa.setText("Lisää");
        jbtnLisaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLisaaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLisaa);
        jbtnLisaa.setBounds(150, 390, 80, 30);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel1.setText("Kategoria :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 120, 100, 19);

        buttonGroup1.add(jradioPuhelimenMaksu);
        jradioPuhelimenMaksu.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jradioPuhelimenMaksu.setText("Puhelimen maksu");
        getContentPane().add(jradioPuhelimenMaksu);
        jradioPuhelimenMaksu.setBounds(150, 180, 167, 31);

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel4.setText("Meno");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 40, 140, 49);

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
        jradioRuoka.setActionCommand("Ruoka");
        jradioAsunnonVuokra.setActionCommand("AsunnonVuokra");
        jradioPuhelimenMaksu.setActionCommand("PuhelimenMaksu");
        jradioMatkakortti.setActionCommand("Matkakortti");
        jradioLääkkeet.setActionCommand("Laakkeet");
        jradioSuoratoistapalvelunMaksu.setActionCommand("SuoratoistapalvelunMaksu");

        String kategoria = "";
        double lasku = Double.valueOf(jtxtLasku.getText());
        String muistiinpano = jtxtMuistiinpano.getText();

        if (buttonGroup1.getSelection().getActionCommand() == "Ruoka") {
            kategoria = "Ruoka";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "AsunnonVuokra") {
            kategoria = "Asunnon vuokra";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "PuhelimenMaksu") {
            kategoria = "Puhelimen maksu";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "Matkakortti") {
            kategoria = "Matkakortti";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "Laakkeet") {
            kategoria = "Laakkeet";
        }
        if (buttonGroup1.getSelection().getActionCommand() == "SuoratoistapalvelunMaksu") {
            kategoria = "Suoratoistapalvelun maksu";
        }

        //tapahtuma luetaan oikeassa muodossa Tapahtuma luokan avulla
        Tapahtuma tapahtuma = new Tapahtuma(kategoria, lasku, muistiinpano);
        String merkkijono = tapahtuma.toString();
        
        //tapahtuma lisää Menot.txt -asiakirjaan
        ReadFile.lisaaMerkkijono(merkkijono, this.txt);
  
        //tapahtuma-merkkijono välitetään Ohjelma pääluokalle
        paa.timer(merkkijono, this.txt, paa.modelMenot, paa.readMenot);
        
        JOptionPane.showMessageDialog(this, "Lisääminen onnistui. Lisä uudellen tai sulje ikkuna.");
       
        buttonGroup1.clearSelection();
        jtxtLasku.setText("");
        jtxtMuistiinpano.setText("");
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
                new LisääMenot("","").setVisible(true);
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