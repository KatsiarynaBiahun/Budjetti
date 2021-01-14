package com.mycompany.budjetti;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class Kirjautuminen extends javax.swing.JFrame {

    String tunnus;
    String salasana;

    public Kirjautuminen() {
        initComponents();
        jtxtVahvista.setVisible(false);
        jlblVahvista.setVisible(false);
    }

    public void sulje() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTunnus = new javax.swing.JTextField();
        jbtnKirjaudu = new javax.swing.JButton();
        jbtnLuo = new javax.swing.JButton();
        jtxtSalasana = new javax.swing.JTextField();
        jlblVahvista = new javax.swing.JLabel();
        jtxtVahvista = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel1.setText("Tervetuloa oman Budjettiin");

        jLabel2.setText("Tunnus:");

        jLabel3.setText("Salasana:");

        jbtnKirjaudu.setText(" Kirjaudu sisään");
        jbtnKirjaudu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnKirjauduActionPerformed(evt);
            }
        });

        jbtnLuo.setText("Luo kääyttäjä");
        jbtnLuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLuoActionPerformed(evt);
            }
        });

        jlblVahvista.setText("Vahvista salasana: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jtxtTunnus, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jtxtSalasana)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblVahvista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtVahvista)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnLuo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnKirjaudu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtTunnus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLuo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtSalasana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnKirjaudu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblVahvista)
                    .addComponent(jtxtVahvista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnKirjauduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnKirjauduActionPerformed

        tunnus = jtxtTunnus.getText();
        salasana = jtxtSalasana.getText();
        String txt = "tiedot.txt";

        boolean onLista = false;
        if (ReadFile.read(tunnus, salasana, txt)) {
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

        // lukeminen näppäimistöltä
        /*Tunnistetiedot käyttäjä = new Tunnistetiedot(tunnus, salasana);
        boolean onLista = false;
        for (Tunnistetiedot luku : käyttäjät) {
            if (luku.equals(käyttäjä)) {
                Ohjelma g = new Ohjelma(tunnus);
                g.setVisible(true);
                sulje();
                onLista = true;
                break;
            }
        }

        if (onLista == false) {
            JOptionPane.showMessageDialog(this, "Tunnus tai salasana on väärin. Yritä uudelleen.");
            jtxtTunnus.requestFocus();
            return;
        }*/

    }//GEN-LAST:event_jbtnKirjauduActionPerformed


    private void jbtnLuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLuoActionPerformed
        jtxtVahvista.setVisible(true);
        jlblVahvista.setVisible(true);

        String new_path = "C:\\Users\\94630\\OneDrive\\Tiedostot\\NetBeansProjects\\Budjetti\\tiedot.txt";

        tunnus = jtxtTunnus.getText();
        salasana = jtxtSalasana.getText();
        // käyttäjät.add(käyttäjä); // näppäimistöltä
        String vahvista = jtxtVahvista.getText();
        if (salasana.equals(vahvista)) {
            Tunnistetiedot käyttäjä = new Tunnistetiedot(tunnus, salasana);
            String merkkijono = käyttäjä.toString();
            //lukeminen tiedostosta 
            ReadFile.lisaaMerkkijono(merkkijono, new_path);
            JOptionPane.showMessageDialog(this, "Käyttäjä " + tunnus + " on luotu. \n Rekisteröinti onnistui.");
        } else {
            JOptionPane.showMessageDialog(this, "Käyttäjä " + tunnus + " ei ole luotu. \n Vahvista salasana uudelleen.");
        }


    }//GEN-LAST:event_jbtnLuoActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtnKirjaudu;
    private javax.swing.JButton jbtnLuo;
    private javax.swing.JLabel jlblVahvista;
    private javax.swing.JTextField jtxtSalasana;
    private javax.swing.JTextField jtxtTunnus;
    private javax.swing.JTextField jtxtVahvista;
    // End of variables declaration//GEN-END:variables
}
