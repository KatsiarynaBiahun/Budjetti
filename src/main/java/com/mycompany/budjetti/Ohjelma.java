package com.mycompany.budjetti;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;

public class Ohjelma extends javax.swing.JFrame {

    public ReadFile readMenot = new ReadFile();
    public ReadFile readTulot = new ReadFile();
    public DefaultTableModel modelMenot;
    public DefaultTableModel modelTulot;
    public String menot;
    public String tulot;

    public Ohjelma(String tunnus, String MenotTiedostonNimi, String TulotTiedostonNimi) {
        initComponents();
        this.setTitle("Tervetuloa: " + tunnus);

        this.menot = MenotTiedostonNimi;
        this.tulot = TulotTiedostonNimi;

        //ota taustakuva käyttöön
        jLabel27.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\budjetti\\taustakuva.jpg"));
        jLabel28.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\budjetti\\taustakuva.jpg"));

        modelMenot = (DefaultTableModel) jtblMenot.getModel();
        modelTulot = (DefaultTableModel) jtblTulot.getModel();
        readMenot.addLista(this.menot);
        readTulot.addLista(this.tulot);

        //metodit, jotka suorittavat suoraan
        kaikki(modelMenot, readMenot, this.menot);
        kaikki(modelTulot, readTulot, this.tulot);
        summa();
    }

    public Ohjelma() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jtxtRuoka = new javax.swing.JTextField();
        jtxtAsunnonVuokra = new javax.swing.JTextField();
        jtxtLääkkeet = new javax.swing.JTextField();
        jtxtMatkakortti = new javax.swing.JTextField();
        jtxtPuhelimenMaksu = new javax.swing.JTextField();
        jtxtSuoratoistapalvelunMaksu = new javax.swing.JTextField();
        jtxtPalkka = new javax.swing.JTextField();
        jtxtLahja = new javax.swing.JTextField();
        jtxtTuki = new javax.swing.JTextField();
        jtxtMaksunPalautus = new javax.swing.JTextField();
        jtxtKiinteistöjenTulot = new javax.swing.JTextField();
        jtxtInvestoinnit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblRuoka = new javax.swing.JLabel();
        jlblAsunnonVuokraSumma = new javax.swing.JLabel();
        jlblPuhelimenMaksuSumma = new javax.swing.JLabel();
        jlblMatkakorttiSumma = new javax.swing.JLabel();
        jlblLaakkeetSumma = new javax.swing.JLabel();
        jlblSuoratoistapalvelunMaksuSumma = new javax.swing.JLabel();
        jlblPalkkaSumma = new javax.swing.JLabel();
        jlblLahjaSumma = new javax.swing.JLabel();
        jlblTukiSumma = new javax.swing.JLabel();
        jlblMaksunPalautusSumma = new javax.swing.JLabel();
        jlblKiinteistöjenTulotSumma = new javax.swing.JLabel();
        jlblInvestoinnitSumma = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblMenot = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtblTulot = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setPreferredSize(new java.awt.Dimension(1000, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        jtxtRuoka.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtRuoka.setEnabled(false);
        jtxtRuoka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRuokaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtRuoka);
        jtxtRuoka.setBounds(240, 140, 70, 30);

        jtxtAsunnonVuokra.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtAsunnonVuokra.setEnabled(false);
        getContentPane().add(jtxtAsunnonVuokra);
        jtxtAsunnonVuokra.setBounds(240, 170, 70, 30);

        jtxtLääkkeet.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtLääkkeet.setEnabled(false);
        getContentPane().add(jtxtLääkkeet);
        jtxtLääkkeet.setBounds(240, 260, 70, 30);

        jtxtMatkakortti.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtMatkakortti.setEnabled(false);
        jtxtMatkakortti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMatkakorttiActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtMatkakortti);
        jtxtMatkakortti.setBounds(240, 230, 70, 30);

        jtxtPuhelimenMaksu.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtPuhelimenMaksu.setEnabled(false);
        jtxtPuhelimenMaksu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPuhelimenMaksuActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtPuhelimenMaksu);
        jtxtPuhelimenMaksu.setBounds(240, 200, 70, 30);

        jtxtSuoratoistapalvelunMaksu.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtSuoratoistapalvelunMaksu.setEnabled(false);
        getContentPane().add(jtxtSuoratoistapalvelunMaksu);
        jtxtSuoratoistapalvelunMaksu.setBounds(240, 290, 70, 30);

        jtxtPalkka.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtPalkka.setEnabled(false);
        getContentPane().add(jtxtPalkka);
        jtxtPalkka.setBounds(690, 140, 70, 30);

        jtxtLahja.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtLahja.setEnabled(false);
        getContentPane().add(jtxtLahja);
        jtxtLahja.setBounds(690, 170, 70, 30);

        jtxtTuki.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtTuki.setEnabled(false);
        getContentPane().add(jtxtTuki);
        jtxtTuki.setBounds(690, 200, 70, 30);

        jtxtMaksunPalautus.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtMaksunPalautus.setEnabled(false);
        getContentPane().add(jtxtMaksunPalautus);
        jtxtMaksunPalautus.setBounds(690, 230, 70, 30);

        jtxtKiinteistöjenTulot.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtKiinteistöjenTulot.setEnabled(false);
        getContentPane().add(jtxtKiinteistöjenTulot);
        jtxtKiinteistöjenTulot.setBounds(690, 260, 70, 30);

        jtxtInvestoinnit.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jtxtInvestoinnit.setEnabled(false);
        getContentPane().add(jtxtInvestoinnit);
        jtxtInvestoinnit.setBounds(690, 290, 70, 30);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel1.setText("Menot");
        jLabel1.setPreferredSize(new java.awt.Dimension(119, 49));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 50, 130, 49);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel2.setText("Tulot");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(650, 50, 110, 50);

        jlblRuoka.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblRuoka.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblRuoka);
        jlblRuoka.setBounds(310, 140, 210, 30);

        jlblAsunnonVuokraSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblAsunnonVuokraSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblAsunnonVuokraSumma);
        jlblAsunnonVuokraSumma.setBounds(310, 170, 210, 30);

        jlblPuhelimenMaksuSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblPuhelimenMaksuSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblPuhelimenMaksuSumma);
        jlblPuhelimenMaksuSumma.setBounds(310, 200, 210, 30);

        jlblMatkakorttiSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblMatkakorttiSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblMatkakorttiSumma);
        jlblMatkakorttiSumma.setBounds(310, 230, 210, 30);

        jlblLaakkeetSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblLaakkeetSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblLaakkeetSumma);
        jlblLaakkeetSumma.setBounds(310, 260, 210, 30);

        jlblSuoratoistapalvelunMaksuSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblSuoratoistapalvelunMaksuSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblSuoratoistapalvelunMaksuSumma);
        jlblSuoratoistapalvelunMaksuSumma.setBounds(310, 290, 210, 30);

        jlblPalkkaSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblPalkkaSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblPalkkaSumma);
        jlblPalkkaSumma.setBounds(760, 140, 210, 30);

        jlblLahjaSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblLahjaSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblLahjaSumma);
        jlblLahjaSumma.setBounds(760, 170, 210, 30);

        jlblTukiSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblTukiSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblTukiSumma);
        jlblTukiSumma.setBounds(760, 200, 210, 30);

        jlblMaksunPalautusSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblMaksunPalautusSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblMaksunPalautusSumma);
        jlblMaksunPalautusSumma.setBounds(760, 230, 210, 30);

        jlblKiinteistöjenTulotSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblKiinteistöjenTulotSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblKiinteistöjenTulotSumma);
        jlblKiinteistöjenTulotSumma.setBounds(760, 260, 210, 30);

        jlblInvestoinnitSumma.setFont(new java.awt.Font("Webdings", 0, 16)); // NOI18N
        jlblInvestoinnitSumma.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jlblInvestoinnitSumma);
        jlblInvestoinnitSumma.setBounds(760, 290, 210, 30);

        jtblMenot.setFont(new java.awt.Font("Kristen ITC", 0, 10)); // NOI18N
        jtblMenot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategoria", "Summa", "Muistio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtblMenot);
        if (jtblMenot.getColumnModel().getColumnCount() > 0) {
            jtblMenot.getColumnModel().getColumn(0).setResizable(false);
            jtblMenot.getColumnModel().getColumn(1).setResizable(false);
            jtblMenot.getColumnModel().getColumn(1).setPreferredWidth(5);
            jtblMenot.getColumnModel().getColumn(2).setResizable(false);
            jtblMenot.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(90, 350, 340, 307);

        jtblTulot.setFont(new java.awt.Font("Kristen ITC", 0, 10)); // NOI18N
        jtblTulot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategoria", "Summa", "Muistio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtblTulot);
        if (jtblTulot.getColumnModel().getColumnCount() > 0) {
            jtblTulot.getColumnModel().getColumn(0).setResizable(false);
            jtblTulot.getColumnModel().getColumn(1).setResizable(false);
            jtblTulot.getColumnModel().getColumn(1).setPreferredWidth(5);
            jtblTulot.getColumnModel().getColumn(2).setResizable(false);
            jtblTulot.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(540, 350, 340, 307);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel3.setText("Ruoka :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 140, 60, 20);

        jLabel15.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel15.setText("Asunnon vuokra :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(110, 170, 130, 20);

        jLabel16.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel16.setText("Puhelimen maksu :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(110, 200, 130, 20);

        jLabel17.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel17.setText("Matkakortti : ");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(140, 230, 99, 20);

        jLabel18.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel18.setText("Lääkkeet :");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(160, 260, 80, 20);

        jLabel19.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel19.setText("Suoratoistapalvelun maksu :");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(40, 290, 200, 20);

        jLabel20.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel20.setText("Palkka : ");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(630, 140, 60, 20);

        jLabel21.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel21.setText("Lahja :");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(640, 170, 50, 20);

        jLabel22.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel22.setText("Tuki :");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(640, 200, 50, 20);

        jLabel23.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel23.setText("Maksun palautus :");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(560, 230, 130, 20);

        jLabel24.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel24.setText("Kiinteistöjen tulot :");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(550, 260, 140, 20);

        jLabel25.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel25.setText("Investoinnit :");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(590, 290, 100, 20);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel26.setOpaque(true);
        getContentPane().add(jLabel26);
        jLabel26.setBounds(0, 120, 990, 220);
        getContentPane().add(jLabel27);
        jLabel27.setBounds(0, 340, 990, 340);

        jLabel28.setOpaque(true);
        getContentPane().add(jLabel28);
        jLabel28.setBounds(0, 0, 990, 120);

        jMenu2.setText("Lisää tapahtuma ");

        jMenuItem2.setText("Lisää Menot");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Lisää Tulot");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Katso kaikki tapahtumat ");

        jMenu1.setText("Valitse Menot-kategoriasta");

        jMenuItem1.setText("Kaikki Menot-tapahtumat");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Kaikki Ruoan tapahtumat");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Kaikki Asunnon vuokran tapahtumat");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Kaikki Puhelimen maksun tapahtumat");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Kaikki Matkakortin tapahtumat");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Kaikki Lääkkeiden tapahtumat");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem16.setText("Kaikki Suoratoistapalvelun maksun tapahtumat");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenu7.add(jMenu1);

        jMenu3.setText("Valitse Tulot-kategoriasta");

        jMenuItem9.setText("Kaikki Tulot-tapahtumat");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Kaikki Palkan tapahtumat");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Kaikki Lahjan tapahtumat");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Kaikki Tuen tapahtumat");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Kaikki Maksun palautuksen tapahtumat");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Kaikki Kiinteistöjen tulojen tapahtumat");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Kaikki Investointien tapahtumat");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenu7.add(jMenu3);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("Kirjaudu ulos");

        jMenuItem17.setText("Kirjaudu ulos profiilista");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void timer(String merkkijono, String txt, DefaultTableModel model, ReadFile read) {
        read.addMerkkijono(merkkijono);

        TimerTask task = new TimerTask() {
            public void run() {
                kaikki(model, read, txt);
                summa();
            }
        };
        Timer timer = new Timer("Timer");
        long delay = 1000L;
        timer.schedule(task, delay);

    }

    public void summa() {
        //valittujen Menot -kategorian tapahtumien summa 

        double ruokaSumma = readMenot.summa(this.menot, "Ruoka");
        jtxtRuoka.setText(String.valueOf(ruokaSumma));

        double asunnonVuokraSumma = readMenot.summa(this.menot, "Asunnon vuokra");
        jtxtAsunnonVuokra.setText(String.valueOf(asunnonVuokraSumma));

        double puhelimenMaksuSumma = readMenot.summa(this.menot, "Puhelimen maksu");
        jtxtPuhelimenMaksu.setText(String.valueOf(puhelimenMaksuSumma));

        double matkakorttiSumma = readMenot.summa(this.menot, "Matkakortti");
        jtxtMatkakortti.setText(String.valueOf(matkakorttiSumma));

        double lääkkeetSumma = readMenot.summa(this.menot, "Laakkeet");
        jtxtLääkkeet.setText(String.valueOf(lääkkeetSumma));

        double suoratoistapalvelunMaksuSumma = readMenot.summa(this.menot, "Suoratoistapalvelun maksu");
        jtxtSuoratoistapalvelunMaksu.setText(String.valueOf(suoratoistapalvelunMaksuSumma));

        //kuinka suuri prosenttiosuus tästä luokasta menojen kokonaismäärästä
        double kaavioMenot = ruokaSumma + asunnonVuokraSumma + puhelimenMaksuSumma + matkakorttiSumma + lääkkeetSumma + suoratoistapalvelunMaksuSumma;
        kaavio(kaavioMenot, ruokaSumma, jlblRuoka);
        kaavio(kaavioMenot, asunnonVuokraSumma, jlblAsunnonVuokraSumma);
        kaavio(kaavioMenot, puhelimenMaksuSumma, jlblPuhelimenMaksuSumma);
        kaavio(kaavioMenot, matkakorttiSumma, jlblMatkakorttiSumma);
        kaavio(kaavioMenot, lääkkeetSumma, jlblLaakkeetSumma);
        kaavio(kaavioMenot, suoratoistapalvelunMaksuSumma, jlblSuoratoistapalvelunMaksuSumma);

        //valittujen Tulot -kategorian tapahtumien summa 
        double palkkaSumma = readTulot.summa(this.tulot, "Palkka");
        jtxtPalkka.setText(String.valueOf(palkkaSumma));

        double lahjaSumma = readTulot.summa(this.tulot, "Lahja");
        jtxtLahja.setText(String.valueOf(lahjaSumma));

        double tukiSumma = readTulot.summa(this.tulot, "Tuki");
        jtxtTuki.setText(String.valueOf(tukiSumma));

        double maksunPalautusSumma = readTulot.summa(this.tulot, "Maksun palautus");
        jtxtMaksunPalautus.setText(String.valueOf(maksunPalautusSumma));

        double kiinteistöjenTulotSumma = readTulot.summa(this.tulot, "Kiinteistöjen tulot");
        jtxtKiinteistöjenTulot.setText(String.valueOf(kiinteistöjenTulotSumma));

        double investoinnitSumma = readTulot.summa(this.tulot, "Investoinnit");
        jtxtInvestoinnit.setText(String.valueOf(investoinnitSumma));

        //kuinka suuri prosenttiosuus tästä luokasta menojen kokonaismäärästä
        double kaavioTulot = palkkaSumma + lahjaSumma + tukiSumma + maksunPalautusSumma + kiinteistöjenTulotSumma + investoinnitSumma;
        kaavio(kaavioTulot, palkkaSumma, jlblPalkkaSumma);
        kaavio(kaavioTulot, lahjaSumma, jlblLahjaSumma);
        kaavio(kaavioTulot, tukiSumma, jlblTukiSumma);
        kaavio(kaavioTulot, maksunPalautusSumma, jlblMaksunPalautusSumma);
        kaavio(kaavioTulot, kiinteistöjenTulotSumma, jlblKiinteistöjenTulotSumma);
        kaavio(kaavioTulot, investoinnitSumma, jlblInvestoinnitSumma);
    }

    public void kaavio(double kaavio, double summa, javax.swing.JLabel label) {
        //kuinka suuri prosenttiosuus valitusta luokasta menojen kokonaismäärästä
        double prosentti = summa / kaavio * 100;
        if (prosentti == 0) {
            label.setText("");
        } else if (10 >= prosentti && prosentti > 0) {
            label.setText("");
        } else if (20 >= prosentti && prosentti > 10) {
            label.setText("");
        } else if (30 >= prosentti && prosentti > 20) {
            label.setText("");
        } else if (40 >= prosentti && prosentti > 30) {
            label.setText("");
        } else if (50 >= prosentti && prosentti > 40) {
            label.setText("");
        } else if (60 >= prosentti && prosentti > 50) {
            label.setText("");
        } else if (70 >= prosentti && prosentti > 60) {
            label.setText("");
        } else if (80 >= prosentti && prosentti > 70) {
            label.setText("");
        } else if (90 >= prosentti && prosentti > 80) {
            label.setText("");
        } else if (100 >= prosentti && prosentti > 90) {
            label.setText("");
        }
    }
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        LisääMenot menot = new LisääMenot(this, this.menot);
        menot.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jtxtPuhelimenMaksuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPuhelimenMaksuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPuhelimenMaksuActionPerformed

    private void jtxtMatkakorttiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMatkakorttiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMatkakorttiActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        LisääTulot tulot = new LisääTulot(this, this.tulot);
        tulot.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Kaikki Menot-tapahtumat
        kaikki(modelMenot, readMenot, this.menot);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void kaikki(DefaultTableModel model, ReadFile read, String tiedostonNimi) {
        // Kaikki Menot -tapahtumat ilmestyy JTableen
        model.setRowCount(0);
        String file = read.readKaikkiTapahtumat(tiedostonNimi);
        String[] palat = file.split("\n");

        for (String pala : palat) {
            String[] pikkupalat = pala.split(",");
            if (pikkupalat.length == 2) {
                String[] data = {pikkupalat[0], pikkupalat[1]};
                model.addRow(data);
            } else if (pikkupalat.length == 3) {
                String[] data = {pikkupalat[0], pikkupalat[1], pikkupalat[2]};
                model.addRow(data);
            }
        }
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String kategoria = "Ruoka";
        Taulukko(modelMenot, readMenot, this.menot, kategoria);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public void Taulukko(DefaultTableModel model, ReadFile read, String txt, String kategoria) {
        // Vain vallitun kategorian tapahtumat ilmestyy JTableen
        model.setRowCount(0);
        String file = read.readTapahtuma(txt, kategoria);
        String[] palat = file.split("\n");

        for (String pala : palat) {
            String[] pikkupalat = pala.split(",");
            if (pikkupalat.length == 2) {
                String[] data = {pikkupalat[0], pikkupalat[1]};
                model.addRow(data);
            } else if (pikkupalat.length == 3) {
                String[] dataTulot = {pikkupalat[0], pikkupalat[1], pikkupalat[2]};
                model.addRow(dataTulot);
            } else {
                break;
            }
        }
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String kategoria = "Asunnon vuokra";
        Taulukko(modelMenot, readMenot, this.menot, kategoria);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        String kategoria = "Puhelimen maksu";
        Taulukko(modelMenot, readMenot, this.menot, kategoria);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        String kategoria = "Matkakortti";
        Taulukko(modelMenot, readMenot, this.menot, kategoria);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        String kategoria = "Laakkeet";
        Taulukko(modelMenot, readMenot, this.menot, kategoria);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        String kategoria = "Suoratoistapalvelun maksu";
        Taulukko(modelMenot, readMenot, this.menot, kategoria);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jtxtRuokaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRuokaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRuokaActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        kaikki(modelTulot, readTulot, this.tulot);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        String kategoria = "Palkka";
        Taulukko(modelTulot, readTulot, this.tulot, kategoria);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        String kategoria = "Lahja";
        Taulukko(modelTulot, readTulot, this.tulot, kategoria);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        String kategoria = "Tuki";
        Taulukko(modelTulot, readTulot, this.tulot, kategoria);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        String kategoria = "Maksun palautus";
        Taulukko(modelTulot, readTulot, this.tulot, kategoria);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        String kategoria = "Kiinteistöjen tulot";
        Taulukko(modelTulot, readTulot, this.tulot, kategoria);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        String kategoria = "Investoinnit";
        Taulukko(modelTulot, readTulot, this.tulot, kategoria);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        Kirjautuminen ikkuna = new Kirjautuminen();
        ikkuna.setVisible(true);
        sulje();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    public void sulje() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
            java.util.logging.Logger.getLogger(Ohjelma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ohjelma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ohjelma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ohjelma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ohjelma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel jlblAsunnonVuokraSumma;
    private javax.swing.JLabel jlblInvestoinnitSumma;
    private javax.swing.JLabel jlblKiinteistöjenTulotSumma;
    private javax.swing.JLabel jlblLaakkeetSumma;
    private javax.swing.JLabel jlblLahjaSumma;
    private javax.swing.JLabel jlblMaksunPalautusSumma;
    private javax.swing.JLabel jlblMatkakorttiSumma;
    private javax.swing.JLabel jlblPalkkaSumma;
    private javax.swing.JLabel jlblPuhelimenMaksuSumma;
    private javax.swing.JLabel jlblRuoka;
    private javax.swing.JLabel jlblSuoratoistapalvelunMaksuSumma;
    private javax.swing.JLabel jlblTukiSumma;
    private javax.swing.JTable jtblMenot;
    private javax.swing.JTable jtblTulot;
    private javax.swing.JTextField jtxtAsunnonVuokra;
    private javax.swing.JTextField jtxtInvestoinnit;
    private javax.swing.JTextField jtxtKiinteistöjenTulot;
    private javax.swing.JTextField jtxtLahja;
    private javax.swing.JTextField jtxtLääkkeet;
    private javax.swing.JTextField jtxtMaksunPalautus;
    private javax.swing.JTextField jtxtMatkakortti;
    private javax.swing.JTextField jtxtPalkka;
    private javax.swing.JTextField jtxtPuhelimenMaksu;
    private javax.swing.JTextField jtxtRuoka;
    private javax.swing.JTextField jtxtSuoratoistapalvelunMaksu;
    private javax.swing.JTextField jtxtTuki;
    // End of variables declaration//GEN-END:variables
}
