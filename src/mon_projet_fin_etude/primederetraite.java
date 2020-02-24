/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.recherchecarnedecheque;

public class primederetraite
extends JPanel {
    String nomenfant = "";
    String dateenfant = "";
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    String montt = "";
    double Nch;
    double Nfin;
    String numcarnetreserver = "";
    private JPanel ETATPRIME;
    private JLabel adh3;
    private JLabel adh4;
    private ButtonGroup buttonGroup1;
    private JLabel cinetat2;
    private JLabel cnr1;
    private JLabel cnr2;
    private JLabel d11;
    private JTextField d2;
    private JLabel datesy;
    private JCheckBox droitfixe;
    private JTextField etabetat2;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel167;
    private JLabel jLabel168;
    private JLabel jLabel169;
    private JLabel jLabel170;
    private JLabel jLabel172;
    private JLabel jLabel173;
    private JLabel jLabel174;
    private JLabel jLabel175;
    private JLabel jLabel176;
    private JLabel jLabel177;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel22;
    private JLabel jLabel24;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel21;
    private JPanel jPanel22;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JSeparator jSeparator11;
    private JSeparator jSeparator12;
    private JTextField jTextField43;
    private JTextField jTextField44;
    private JTextField jTextField46;
    private JTextField jTextField47;
    private JTextField jTextField48;
    private JTextField jTextField49;
    private JTextField jTextField50;
    private JTextField jTextField51;
    private JTextField jTextField53;
    private JTextField jTextField54;
    private JTextField jTextField55;
    private JTextField jTextField56;
    private JLabel m1;
    private JLabel m2;
    private JLabel m3;
    private JTextField mecano;
    private JLabel mecanoetat7;
    private JLabel mecc1;
    private JTextField mont;
    private JLabel mont1;
    private JLabel mont2;
    private JLabel montletcheque;
    private JLabel monttchifrecheque;
    private JLabel nn;
    private JLabel nomad3;
    private JLabel nomadh;
    private JLabel nomadherentcheque;
    private JLabel nu;
    private JLabel numchequeetat1;
    private JCheckBox prime;

    public primederetraite() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel4 = new JLabel();
        this.mont = new JTextField();
        this.nomadh = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel27 = new JLabel();
        this.jLabel6 = new JLabel();
        this.droitfixe = new JCheckBox();
        this.prime = new JCheckBox();
        this.jPanel3 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.d11 = new JLabel();
        this.nu = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jLabel28 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jPanel22 = new JPanel();
        this.jLabel177 = new JLabel();
        this.nn = new JLabel();
        this.jLabel12 = new JLabel();
        this.nomad3 = new JLabel();
        this.cnr1 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jLabel22 = new JLabel();
        this.m1 = new JLabel();
        this.ETATPRIME = new JPanel();
        this.jLabel167 = new JLabel();
        this.jSeparator11 = new JSeparator();
        this.jLabel168 = new JLabel();
        this.jLabel169 = new JLabel();
        this.adh3 = new JLabel();
        this.m3 = new JLabel();
        this.jLabel170 = new JLabel();
        this.numchequeetat1 = new JLabel();
        this.jLabel172 = new JLabel();
        this.jPanel21 = new JPanel();
        this.jLabel173 = new JLabel();
        this.jSeparator12 = new JSeparator();
        this.jLabel174 = new JLabel();
        this.jTextField43 = new JTextField();
        this.m2 = new JLabel();
        this.cnr2 = new JLabel();
        this.mont1 = new JLabel();
        this.adh4 = new JLabel();
        this.cinetat2 = new JLabel();
        this.jTextField44 = new JTextField();
        this.d2 = new JTextField();
        this.jTextField46 = new JTextField();
        this.jTextField47 = new JTextField();
        this.jTextField48 = new JTextField();
        this.jTextField49 = new JTextField();
        this.jTextField50 = new JTextField();
        this.jTextField51 = new JTextField();
        this.etabetat2 = new JTextField();
        this.jTextField53 = new JTextField();
        this.jTextField54 = new JTextField();
        this.jTextField55 = new JTextField();
        this.jTextField56 = new JTextField();
        this.mecanoetat7 = new JLabel();
        this.jLabel175 = new JLabel();
        this.jLabel176 = new JLabel();
        this.mont2 = new JLabel();
        this.jPanel4 = new JPanel();
        this.montletcheque = new JLabel();
        this.monttchifrecheque = new JLabel();
        this.nomadherentcheque = new JLabel();
        this.mecc1 = new JLabel();
        this.jLabel11 = new JLabel();
        this.datesy = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tempus Sans ITC", 1, 36));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Prime de Retraite");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(120, 0, 328, 60);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/prime/ret.png")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(440, 40, 180, 150);
        this.jLabel3.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel3.setForeground(new Color(51, 0, 204));
        this.jLabel3.setText("Objet :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(20, 130, 60, 29);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.mecanoActionPerformed(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyPressed(KeyEvent evt) {
                primederetraite.this.mecanoKeyPressed(evt);
            }

            @Override
            public void keyReleased(KeyEvent evt) {
                primederetraite.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(110, 60, 90, 30);
        this.jLabel4.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel4.setForeground(new Color(51, 0, 204));
        this.jLabel4.setText("Montant :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(210, 60, 80, 29);
        this.mont.setFont(new Font("Tahoma", 0, 14));
        this.mont.setEnabled(false);
        this.mont.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.montActionPerformed(evt);
            }
        });
        this.mont.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                primederetraite.this.montKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mont);
        this.mont.setBounds(290, 60, 100, 30);
        this.nomadh.setFont(new Font("Traditional Arabic", 0, 16));
        this.nomadh.setForeground(new Color(102, 0, 51));
        this.nomadh.setText(".........................................");
        this.jPanel1.add(this.nomadh);
        this.nomadh.setBounds(150, 100, 290, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/prime/valider2.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(370, 200, 120, 40);
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/prime/quitter .PNG")));
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(490, 200, 120, 40);
        this.jLabel27.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel27.setForeground(new Color(51, 0, 204));
        this.jLabel27.setText("Nom adherant :");
        this.jPanel1.add(this.jLabel27);
        this.jLabel27.setBounds(20, 100, 140, 29);
        this.jLabel6.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel6.setForeground(new Color(51, 0, 204));
        this.jLabel6.setText("Mecano :");
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(20, 60, 80, 29);
        this.droitfixe.setFont(new Font("Tahoma", 1, 14));
        this.droitfixe.setText("Droit Fixe");
        this.jPanel1.add(this.droitfixe);
        this.droitfixe.setBounds(250, 130, 170, 25);
        this.prime.setFont(new Font("Tahoma", 1, 14));
        this.prime.setText("Prime de retraite");
        this.jPanel1.add(this.prime);
        this.prime.setBounds(90, 130, 150, 25);
        this.jPanel3.setLayout(null);
        this.jPanel2.setBackground(new Color(255, 255, 255));
        this.jPanel2.setLayout(null);
        this.jLabel7.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/ENTET.PNG")));
        this.jPanel2.add(this.jLabel7);
        this.jLabel7.setBounds(50, 10, 480, 52);
        this.jLabel9.setFont(new Font("Tahoma", 0, 18));
        this.jLabel9.setForeground(new Color(0, 0, 204));
        this.jLabel9.setText("A Mme la pr\u00e9sidente de la Mutuelle de la sant\u00e9 Tunis");
        this.jPanel2.add(this.jLabel9);
        this.jLabel9.setBounds(90, 90, 420, 22);
        this.jLabel10.setFont(new Font("Tahoma", 0, 12));
        this.jLabel10.setText("Prime N\u00b0:");
        this.jPanel2.add(this.jLabel10);
        this.jLabel10.setBounds(410, 60, 60, 15);
        this.d11.setFont(new Font("Tahoma", 0, 12));
        this.d11.setText("......................");
        this.jPanel2.add(this.d11);
        this.d11.setBounds(60, 60, 120, 15);
        this.nu.setFont(new Font("Tahoma", 0, 12));
        this.nu.setText("......................");
        this.jPanel2.add(this.nu);
        this.nu.setBounds(470, 60, 80, 15);
        this.jLabel13.setFont(new Font("Tahoma", 0, 12));
        this.jLabel13.setText("Mahdia le :");
        this.jPanel2.add(this.jLabel13);
        this.jLabel13.setBounds(0, 60, 70, 15);
        this.jLabel14.setFont(new Font("Tahoma", 1, 14));
        this.jLabel14.setText("Pi\u00e9ce jointes :");
        this.jPanel2.add(this.jLabel14);
        this.jLabel14.setBounds(40, 167, 100, 20);
        this.jLabel15.setFont(new Font("Tahoma", 0, 14));
        this.jLabel15.setText("D\u00e9cision de mise \u00e0 la Retraite");
        this.jPanel2.add(this.jLabel15);
        this.jLabel15.setBounds(140, 167, 350, 20);
        this.jLabel16.setFont(new Font("Tahoma", 0, 14));
        this.jLabel16.setText("J'ai l'honneur de venir par la pr\u00e9sente vous demander de bien vouloir m'actrroyer la prime");
        this.jPanel2.add(this.jLabel16);
        this.jLabel16.setBounds(10, 210, 580, 17);
        this.jLabel24.setFont(new Font("Tahoma", 1, 14));
        this.jLabel24.setText("MERCI D'AVANCE ");
        this.jPanel2.add(this.jLabel24);
        this.jLabel24.setBounds(310, 350, 180, 30);
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setText("Objet:");
        this.jPanel2.add(this.jLabel28);
        this.jLabel28.setBounds(40, 140, 50, 17);
        this.jLabel29.setFont(new Font("Tahoma", 0, 14));
        this.jLabel29.setText("..................................................");
        this.jPanel2.add(this.jLabel29);
        this.jLabel29.setBounds(90, 140, 460, 17);
        this.jPanel22.setBackground(new Color(255, 255, 255));
        this.jPanel22.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jLabel177.setFont(new Font("Tahoma", 1, 14));
        this.jLabel177.setText("Signature ");
        GroupLayout jPanel22Layout = new GroupLayout(this.jPanel22);
        this.jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup().addContainerGap(30, 32767).addComponent(this.jLabel177, -2, 80, -2).addGap(28, 28, 28)));
        jPanel22Layout.setVerticalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.jLabel177, -2, 30, -2).addContainerGap(78, 32767)));
        this.jPanel2.add(this.jPanel22);
        this.jPanel22.setBounds(410, 380, 140, 110);
        this.nn.setFont(new Font("Tahoma", 1, 14));
        this.nn.setText("..........................................................................................");
        this.jPanel2.add(this.nn);
        this.nn.setBounds(10, 240, 560, 17);
        this.jLabel12.setFont(new Font("Tahoma", 0, 14));
        this.jLabel12.setText("Je suis le (a) nom\u00e9 :");
        this.jPanel2.add(this.jLabel12);
        this.jLabel12.setBounds(10, 300, 130, 17);
        this.nomad3.setFont(new Font("Tahoma", 1, 14));
        this.nomad3.setText(".............................");
        this.jPanel2.add(this.nomad3);
        this.nomad3.setBounds(140, 290, 440, 20);
        this.cnr1.setFont(new Font("Tahoma", 1, 14));
        this.cnr1.setText(".............................");
        this.jPanel2.add(this.cnr1);
        this.cnr1.setBounds(80, 330, 190, 17);
        this.jLabel18.setFont(new Font("Tahoma", 0, 14));
        this.jLabel18.setText("N\u00b0 CNR :");
        this.jPanel2.add(this.jLabel18);
        this.jLabel18.setBounds(20, 330, 60, 17);
        this.jLabel22.setFont(new Font("Tahoma", 0, 14));
        this.jLabel22.setText("Mecano:");
        this.jPanel2.add(this.jLabel22);
        this.jLabel22.setBounds(320, 330, 60, 17);
        this.m1.setFont(new Font("Tahoma", 1, 14));
        this.m1.setText(".............................");
        this.jPanel2.add(this.m1);
        this.m1.setBounds(380, 330, 170, 17);
        this.jPanel3.add(this.jPanel2);
        this.jPanel2.setBounds(0, 20, 590, 520);
        this.ETATPRIME.setBackground(new Color(255, 255, 255));
        this.ETATPRIME.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.setLayout(null);
        this.jLabel167.setFont(new Font("Tahoma", 1, 24));
        this.jLabel167.setText("PHOTOCOPIE DU CHEQUE");
        this.ETATPRIME.add(this.jLabel167);
        this.jLabel167.setBounds(120, 550, 320, 30);
        this.jSeparator11.setBackground(new Color(0, 0, 0));
        this.jSeparator11.setForeground(new Color(0, 0, 0));
        this.ETATPRIME.add(this.jSeparator11);
        this.jSeparator11.setBounds(0, 230, 580, 10);
        this.jLabel168.setFont(new Font("Tahoma", 1, 24));
        this.jLabel168.setText("ETAT DE  PAYEMENT EN ESPECE");
        this.ETATPRIME.add(this.jLabel168);
        this.jLabel168.setBounds(70, 40, 420, 30);
        this.jLabel169.setFont(new Font("Tahoma", 0, 14));
        this.jLabel169.setText("Matricule :");
        this.ETATPRIME.add(this.jLabel169);
        this.jLabel169.setBounds(420, 310, 70, 30);
        this.adh3.setFont(new Font("Tahoma", 1, 14));
        this.adh3.setText("......................");
        this.ETATPRIME.add(this.adh3);
        this.adh3.setBounds(110, 310, 310, 30);
        this.m3.setFont(new Font("Tahoma", 1, 14));
        this.m3.setText("......................");
        this.ETATPRIME.add(this.m3);
        this.m3.setBounds(490, 310, 80, 30);
        this.jLabel170.setFont(new Font("Tahoma", 0, 14));
        this.jLabel170.setText("Je Soussign\u00e9 :");
        this.ETATPRIME.add(this.jLabel170);
        this.jLabel170.setBounds(20, 310, 90, 30);
        this.numchequeetat1.setFont(new Font("Tahoma", 1, 14));
        this.numchequeetat1.setText("......................");
        this.ETATPRIME.add(this.numchequeetat1);
        this.numchequeetat1.setBounds(270, 340, 260, 30);
        this.jLabel172.setFont(new Font("Tahoma", 0, 14));
        this.jLabel172.setText("tir\u00e9 sur B.T mahdia a titre de prime de naissance.");
        this.ETATPRIME.add(this.jLabel172);
        this.jLabel172.setBounds(10, 370, 310, 30);
        this.jPanel21.setBackground(new Color(255, 255, 255));
        this.jPanel21.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jLabel173.setFont(new Font("Tahoma", 1, 14));
        this.jLabel173.setText("Signature ");
        GroupLayout jPanel21Layout = new GroupLayout(this.jPanel21);
        this.jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup().addContainerGap(28, 32767).addComponent(this.jLabel173, -2, 80, -2).addContainerGap()));
        jPanel21Layout.setVerticalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addComponent(this.jLabel173, -2, 30, -2).addContainerGap(78, 32767)));
        this.ETATPRIME.add(this.jPanel21);
        this.jPanel21.setBounds(450, 410, 120, 110);
        this.jSeparator12.setBackground(new Color(0, 0, 0));
        this.jSeparator12.setForeground(new Color(0, 0, 0));
        this.ETATPRIME.add(this.jSeparator12);
        this.jSeparator12.setBounds(0, 532, 580, 10);
        this.jLabel174.setFont(new Font("Tahoma", 1, 24));
        this.jLabel174.setText("SERVICE DES  PRIMES ");
        this.ETATPRIME.add(this.jLabel174);
        this.jLabel174.setBounds(120, 260, 320, 30);
        this.jTextField43.setFont(new Font("Tahoma", 1, 12));
        this.jTextField43.setText("  Date");
        this.jTextField43.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField43.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.jTextField43ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField43);
        this.jTextField43.setBounds(10, 100, 60, 30);
        this.m2.setFont(new Font("Tahoma", 0, 10));
        this.m2.setText(".........");
        this.ETATPRIME.add(this.m2);
        this.m2.setBounds(79, 150, 30, 27);
        this.cnr2.setFont(new Font("Tahoma", 0, 12));
        this.cnr2.setText("...............");
        this.ETATPRIME.add(this.cnr2);
        this.cnr2.setBounds(280, 150, 70, 27);
        this.mont1.setFont(new Font("Tahoma", 0, 10));
        this.mont1.setText("..........");
        this.ETATPRIME.add(this.mont1);
        this.mont1.setBounds(450, 150, 50, 27);
        this.adh4.setFont(new Font("Tahoma", 0, 10));
        this.adh4.setText("..............");
        this.ETATPRIME.add(this.adh4);
        this.adh4.setBounds(130, 140, 140, 40);
        this.cinetat2.setFont(new Font("Tahoma", 0, 10));
        this.cinetat2.setText("...........");
        this.ETATPRIME.add(this.cinetat2);
        this.cinetat2.setBounds(510, 150, 60, 27);
        this.jTextField44.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField44);
        this.jTextField44.setBounds(120, 130, 150, 60);
        this.d2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.d2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.d2ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.d2);
        this.d2.setBounds(10, 130, 60, 60);
        this.jTextField46.setFont(new Font("Tahoma", 1, 12));
        this.jTextField46.setText("    Nom et Prenom");
        this.jTextField46.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField46.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.jTextField46ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField46);
        this.jTextField46.setBounds(120, 100, 150, 30);
        this.jTextField47.setFont(new Font("Tahoma", 1, 12));
        this.jTextField47.setText("  N\u00b0CIN");
        this.jTextField47.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField47.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.jTextField47ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField47);
        this.jTextField47.setBounds(500, 100, 70, 30);
        this.jTextField48.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField48);
        this.jTextField48.setBounds(500, 130, 70, 60);
        this.jTextField49.setFont(new Font("Tahoma", 1, 12));
        this.jTextField49.setText("Mecano");
        this.jTextField49.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField49.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.jTextField49ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField49);
        this.jTextField49.setBounds(70, 100, 50, 30);
        this.jTextField50.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField50);
        this.jTextField50.setBounds(70, 130, 50, 60);
        this.jTextField51.setFont(new Font("Tahoma", 1, 12));
        this.jTextField51.setText("Etablissement");
        this.jTextField51.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField51.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.jTextField51ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField51);
        this.jTextField51.setBounds(350, 100, 90, 30);
        this.etabetat2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.etabetat2);
        this.etabetat2.setBounds(350, 130, 90, 60);
        this.jTextField53.setFont(new Font("Tahoma", 1, 12));
        this.jTextField53.setText("    N\u00b0 CNR");
        this.jTextField53.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField53.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.jTextField53ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField53);
        this.jTextField53.setBounds(270, 100, 80, 30);
        this.jTextField54.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField54);
        this.jTextField54.setBounds(270, 130, 80, 60);
        this.jTextField55.setFont(new Font("Tahoma", 1, 12));
        this.jTextField55.setText("Montant");
        this.jTextField55.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField55.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primederetraite.this.jTextField55ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField55);
        this.jTextField55.setBounds(440, 100, 60, 30);
        this.jTextField56.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField56);
        this.jTextField56.setBounds(440, 130, 60, 60);
        this.mecanoetat7.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat7.setText(".............");
        this.ETATPRIME.add(this.mecanoetat7);
        this.mecanoetat7.setBounds(80, 150, 50, 27);
        this.jLabel175.setFont(new Font("Tahoma", 0, 14));
        this.jLabel175.setText("Certifie avoir recu l'original du ch\u00e9que N\u00b0");
        this.ETATPRIME.add(this.jLabel175);
        this.jLabel175.setBounds(10, 340, 250, 30);
        this.jLabel176.setFont(new Font("Tahoma", 0, 14));
        this.jLabel176.setText("avec un montant de :");
        this.ETATPRIME.add(this.jLabel176);
        this.jLabel176.setBounds(10, 400, 140, 30);
        this.mont2.setFont(new Font("Tahoma", 1, 14));
        this.mont2.setText("......................");
        this.ETATPRIME.add(this.mont2);
        this.mont2.setBounds(150, 400, 290, 30);
        this.jPanel3.add(this.ETATPRIME);
        this.ETATPRIME.setBounds(10, 550, 580, 740);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setLayout(null);
        this.montletcheque.setFont(new Font("Tahoma", 0, 12));
        this.montletcheque.setText("................");
        this.jPanel4.add(this.montletcheque);
        this.montletcheque.setBounds(80, 50, 370, 20);
        this.monttchifrecheque.setFont(new Font("Arial Black", 0, 12));
        this.monttchifrecheque.setText("................");
        this.jPanel4.add(this.monttchifrecheque);
        this.monttchifrecheque.setBounds(350, 0, 110, 20);
        this.nomadherentcheque.setFont(new Font("Tahoma", 1, 14));
        this.nomadherentcheque.setText(".........................................................");
        this.jPanel4.add(this.nomadherentcheque);
        this.nomadherentcheque.setBounds(120, 70, 300, 20);
        this.jPanel4.add(this.mecc1);
        this.mecc1.setBounds(180, 0, 60, 20);
        this.jLabel11.setText("Mahdia ");
        this.jPanel4.add(this.jLabel11);
        this.jLabel11.setBounds(150, 160, 60, 14);
        this.datesy.setFont(new Font("Tahoma", 0, 12));
        this.datesy.setText("..............................");
        this.jPanel4.add(this.datesy);
        this.datesy.setBounds(200, 160, 170, 15);
        this.jPanel3.add(this.jPanel4);
        this.jPanel4.setBounds(30, 1310, 420, 160);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, 610, -2)).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jPanel3, -1, 600, 32767))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 241, -2).addGap(108, 108, 108).addComponent(this.jPanel3, -2, 1438, -2).addContainerGap(-1, 32767)));
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void montActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean k = false;
        if (this.mont.getText().indexOf("DT") == -1) {
            if (this.mont.getText().length() < 5) {
                k = false;
                JOptionPane.showMessageDialog(null, "Ajoutez 000");
            } else {
                String stac;
                this.montt = stac = this.mont.getText();
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                this.monttchifrecheque.setText("# " + stac + " #");
                k = true;
                this.mont.setText(stac + " DT");
                this.mont1.setText(this.mont.getText());
                this.mont2.setText(this.mont.getText());
            }
        }
        if (k) {
            String objet = "";
            if (this.prime.isSelected() && this.droitfixe.isSelected()) {
                objet = "de Primr \u00e0 la retraite et droit fixe";
            } else if (this.prime.isSelected()) {
                objet = "Prime de Retraite";
                k = true;
            } else if (this.droitfixe.isSelected()) {
                k = true;
                objet = " le droit fixe retenu sur mes pret ";
            } else {
                k = false;
                JOptionPane.showMessageDialog(null, "Selection l'objet");
            }
            this.nn.setText(objet);
            this.jLabel29.setText(objet);
        }
        if (k) {
            JOptionPane jop = new JOptionPane();
            int option = JOptionPane.showConfirmDialog(null, "Attention :voulez vouz vraiment imprimer une prime de" + this.mont.getText() + ")", "Attention", 0, 3);
            if (option == 0) {
                k = true;
            }
            if (k) {
                Date actuellEee = new Date();
                SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
                String datsystem = dateFormatft.format(actuellEee);
                String ann\u00e9es = datsystem.substring(6, datsystem.length());
                this.d11.setText(datsystem);
                this.d2.setText(datsystem);
                this.datesy.setText(datsystem);
                if (k) {
                    String nummm = "";
                    String n = "";
                    boolean i = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT n FROM primesante  WHERE annee='" + ann\u00e9es + "'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nummm = result3.getString("n");
                            i = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                        i = false;
                    }
                    if (!i) {
                        n = "1";
                    } else {
                        int ni = Integer.parseInt(nummm);
                        n = "" + ++ni + "";
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state = conn2.createStatement();
                        this.nu.setText(n + "/" + ann\u00e9es);
                        String type = "prime de retraite";
                        System.out.println("aaaaaaaaaaaaaaa");
                        state.executeUpdate("INSERT INTO  primesante (n,annee,Mecano,Montant,type,date) VALUES ('" + n + "','" + ann\u00e9es + "','" + this.mecano.getText() + "','" + this.montt + "','" + type + "','" + datsystem + "')");
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Succes d'ajout ", "Information", 1);
                        Impression1 s = new Impression1(this.jPanel2);
                        s.actionPerformed(evt);
                        Impression1 sS = new Impression1(this.ETATPRIME);
                        sS.actionPerformed(evt);
                    }
                    catch (Exception e) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'ajout :" + e.getMessage());
                    }
                    String di = this.montt.substring(0, this.montt.length() - 3);
                    String mchbd = "";
                    this.montletcheque.setText(mchbd);
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state2 = conn2.createStatement();
                        String p = "0";
                        state2.executeUpdate("UPDATE  adherent SET enfant='" + this.nomenfant + "' WHERE MECANO='" + this.mecano.getText() + "'");
                        state2.executeUpdate("UPDATE  adherent SET dateenfant='" + this.dateenfant + "' WHERE MECANO='" + this.mecano.getText() + "'");
                        this.mecano.setText("");
                        this.mont.setText("");
                        this.nomadh.setText("");
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane.showMessageDialog(null, "erreur de modification nom d'enfant: " + e.getMessage());
                    }
                }
            }
        }
    }

    private void jTextField43ActionPerformed(ActionEvent evt) {
    }

    private void d2ActionPerformed(ActionEvent evt) {
    }

    private void jTextField46ActionPerformed(ActionEvent evt) {
    }

    private void jTextField47ActionPerformed(ActionEvent evt) {
    }

    private void jTextField49ActionPerformed(ActionEvent evt) {
    }

    private void jTextField51ActionPerformed(ActionEvent evt) {
    }

    private void jTextField53ActionPerformed(ActionEvent evt) {
    }

    private void jTextField55ActionPerformed(ActionEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        this.m1.setText(this.mecano.getText());
        this.m2.setText(this.mecano.getText());
        this.m3.setText(this.mecano.getText());
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean k = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                k = true;
                this.nomadh.setText(result3.getString("nom"));
                this.nomadherentcheque.setText(result3.getString("nom"));
                this.adh3.setText(result3.getString("nom"));
                this.nomad3.setText(result3.getString("nom"));
                this.adh4.setText(result3.getString("nom"));
                this.cnr1.setText(result3.getString("NCNR"));
                this.cnr2.setText(result3.getString("NCNR"));
                this.etabetat2.setText(result3.getString("etab"));
                this.cinetat2.setText(result3.getString("CIN"));
                this.nomenfant = result3.getString("enfant");
                this.dateenfant = result3.getString("dateenfant");
            }
        }
        catch (Exception e) {
            // empty catch block
        }
        if (k) {
            this.mont.enable(true);
        }
    }

    private void montKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.mont.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.mont.setText("");
        }
    }

    private void mecanoKeyPressed(KeyEvent evt) {
    }

    public static enum Nombre {
        ZERO(0, "zero"),
        UN(1, "un"),
        DEUX(2, "deux"),
        TROIX(3, "trois"),
        QUATRE(4, "quatre"),
        CINQ(5, "cinq"),
        SIX(6, "six"),
        SEPT(7, "sept"),
        HUIT(8, "huit"),
        NEUF(9, "neuf"),
        DIX(10, "dix"),
        ONZE(11, "onze"),
        DOUZE(12, "douze"),
        TREIZE(13, "treize"),
        QUATORZE(14, "quatorze"),
        QUINZE(15, "quinze"),
        SEIZE(16, "seize"),
        DIXSEPT(17, "dix-sept"),
        DIXHUIT(18, "dix-huit"),
        DIXNEUF(19, "dix-neuf"),
        VINGT(20, 29, "vingt"),
        TRENTE(30, 39, "trente"),
        QUARANTE(40, 49, "quarante"),
        CINQUANTE(50, 59, "cinquante"),
        SOIXANTE(60, 69, "soixante"),
        SOIXANTEDIX(70, 79, "soixante-dix", SOIXANTE),
        QUATREVINGT(80, 89, "quatre-vingt", "s"),
        QUATREVINGTDIX(90, 99, "quatre-vingt-dix", QUATREVINGT),
        DIXAINE(10, 99),
        CENT(100, 999, "cent", DIXAINE),
        MILLE(1000, 999999, "mille", CENT),
        MILLION(1000000, 99999999, "million", MILLE),
        MILLIARD(1000000000, Long.MAX_VALUE, "milliard", MILLION),
        CALCULATE{

            @Override
            protected String getValue(long value) throws Exception {
                if (value == 0) {
                    return ZERO.label;
                }
                return (value < 0 ? "moins " : "") + MILLIARD.getStringValue(Math.abs(value));
            }

            @Override
            protected String getValue(double value, String separator) throws Exception {
                if (value == 0.0) {
                    return ZERO.label + " " + separator;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(value < 0.0 ? "moins " : "");
                String vstr = Double.toString(value);
                int indexOf = vstr.indexOf(46);
                if (indexOf == -1) {
                    sb.append(MILLIARD.getStringValue((long)Math.abs(value)));
                    sb.append(" ");
                    sb.append(separator);
                } else {
                    sb.append(MILLIARD.getStringValue(Long.parseLong(vstr.substring(0, indexOf))));
                    sb.append(" ");
                    sb.append(separator);
                    String floatting = vstr.substring(indexOf + 1, indexOf + 3 >= vstr.length() ? vstr.length() : indexOf + 3) + (indexOf + 3 >= vstr.length() ? "0" : "");
                    long v = Long.parseLong(floatting);
                    if (v != 0) {
                        sb.append(" ");
                        sb.append(MILLIARD.getStringValue(v));
                    }
                }
                return sb.toString();
            }
        };
        
        protected long min;
        protected long max;
        protected String label;
        protected Nombre before;
        private String addMin;

        private Nombre() {
        }

        private Nombre(long v, String s) {
            this(v, v, s);
        }

        private Nombre(long min, long max) {
            this.min = min;
            this.max = max;
        }

        private Nombre(long min, long max, String label, Nombre before) {
            this(min, max, label);
            this.before = before;
        }

        private Nombre(long min, long max, String label, String addMin) {
            this(min, max, label);
            this.addMin = addMin;
        }

        private Nombre(long min, long max, String label) {
            this(min, max);
            this.label = label;
        }

        protected String getValue(long value) throws Exception {
            throw new Exception("Vous devez appeller la m\u00e9thode par l'\u00e9num\u00e9ration Chiffre.CALCULATE");
        }

        protected String getValue(double value, String separator) throws Exception {
            throw new Exception("Vous devez appeller la m\u00e9thode par l'\u00e9num\u00e9ration Chiffre.CALCULATE");
        }

        private String getStringValue(long value) {
            long v1 = value / this.min;
            if (v1 == 0 && this.before != null) {
                return this.before.getStringValue(value);
            }
            StringBuilder add = new StringBuilder();
            Nombre[] values = Nombre.values();
            if (value < 20) {
                return values[(int)value].label;
            }
            for (int i = 0; i < values.length; ++i) {
                Nombre nombre = values[i];
                if (value < 100 && nombre.min <= value && nombre.max >= value) {
                    if (value == nombre.min) {
                        return nombre.label + (nombre.addMin != null ? nombre.addMin : "");
                    }
                    if (nombre.before != null) {
                        StringBuilder sb = new StringBuilder(nombre.before.label);
                        sb.append(value - nombre.min + 10 == 11 && nombre.equals((Object)SOIXANTEDIX) ? " et " : "-");
                        sb.append(DIXAINE.getStringValue(value - nombre.min + 10));
                        return sb.toString();
                    }
                    StringBuilder sb = new StringBuilder(nombre.label);
                    sb.append(value - nombre.min == 1 && !nombre.equals((Object)QUATREVINGT) ? " et " : "-");
                    sb.append(value - nombre.min > 0 ? DIXAINE.getStringValue(value - nombre.min) : "");
                    return sb.toString();
                }
                if (nombre.min > v1 || nombre.max < v1 || value < 100) continue;
                if ((this.equals((Object)MILLE) || this.equals((Object)CENT)) && UN.equals((Object)nombre)) {
                    add.append(this.label);
                } else {
                    add.append(nombre.getStringValue(v1));
                    add.append(MILLIARD.equals((Object)this) && (MILLION.equals((Object)nombre) || MILLIARD.equals((Object)nombre)) ? " de" : "");
                    add.append(this.label != null ? " " + this.label : "");
                }
                add.append(value - v1 * this.min > 0 ? " " + this.before.getStringValue(value - v1 * this.min) : (v1 > 1 ? "s" : ""));
                return add.toString();
            }
            return add.toString();
        }

    }

}

