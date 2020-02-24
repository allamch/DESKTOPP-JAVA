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
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.etatcession;

public class Atestationdepriseencharge
extends JPanel {
    String nomadh = "";
    String ch = "";
    String mont = "";
    String parmois = "";
    int k = 1;
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    int num = 0;
    double Nch;
    double Nfin;
    String numcarnetreserver = "";
    private JLabel DatedebutK;
    private JLabel Datefin;
    private JPanel cheque10;
    private JLabel cinetat;
    private JLabel cnretat;
    private JLabel date1;
    private JLabel date2;
    private JLabel dateactuele;
    private JLabel dateatt;
    private JLabel datecheque1;
    private JLabel dateetat;
    private JLabel delivd;
    private JLabel derniermoisd;
    private JLabel etabd;
    private JLabel globale;
    private JLabel idend;
    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel100;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel48;
    private JLabel jLabel5;
    private JLabel jLabel58;
    private JLabel jLabel6;
    private JLabel jLabel61;
    private JLabel jLabel62;
    private JLabel jLabel67;
    private JLabel jLabel68;
    private JLabel jLabel7;
    private JLabel jLabel70;
    private JLabel jLabel71;
    private JLabel jLabel72;
    private JLabel jLabel73;
    private JLabel jLabel74;
    private JLabel jLabel75;
    private JLabel jLabel76;
    private JLabel jLabel77;
    private JLabel jLabel78;
    private JLabel jLabel79;
    private JLabel jLabel8;
    private JLabel jLabel80;
    private JLabel jLabel81;
    private JLabel jLabel82;
    private JLabel jLabel83;
    private JLabel jLabel84;
    private JLabel jLabel85;
    private JLabel jLabel86;
    private JLabel jLabel87;
    private JLabel jLabel88;
    private JLabel jLabel89;
    private JLabel jLabel9;
    private JLabel jLabel90;
    private JLabel jLabel91;
    private JLabel jLabel92;
    private JLabel jLabel93;
    private JLabel jLabel94;
    private JLabel jLabel95;
    private JLabel jLabel96;
    private JLabel jLabel97;
    private JLabel jLabel98;
    private JLabel jLabel99;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel13;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTextField jTextField1;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField12;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    private JTextField mat;
    private JLabel matricule;
    private JLabel matriculeetat;
    private JTextField mecano;
    private JLabel mecanod;
    private JLabel mecanoetat;
    private JLabel mecanoetat1;
    private JLabel mecat;
    private JLabel mecc1;
    private JTextField mensualit\u00e9;
    private JLabel montantchiffrek;
    private JLabel montantetat;
    private JLabel montantletrechiffd;
    private JLabel montantlettreK;
    private JLabel montantlettrecheque1;
    private JLabel montantparmoisd;
    private JLabel montchiffrechequecheque;
    private JLabel nbbmois;
    private JLabel nbmd;
    private JTextField nbmois;
    private JLabel ncinddemande;
    private JLabel nomadhK;
    private JLabel nomadhchequecheque;
    private JLabel nomd;
    private JLabel nometat;
    private JLabel nometattab;
    private JLabel nometprenom;
    private JLabel numces;
    private JLabel numchequeetat;
    private JLabel numcompteadhK;
    private JLabel premmoid;

    public Atestationdepriseencharge() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.nbmois = new JTextField();
        this.mensualit\u00e9 = new JTextField();
        this.jButton1 = new JButton();
        this.jButton6 = new JButton();
        this.mat = new JTextField();
        this.jLabel28 = new JLabel();
        this.jButton3 = new JButton();
        this.jLabel5 = new JLabel();
        this.jPanel4 = new JPanel();
        this.jLabel6 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel37 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jLabel40 = new JLabel();
        this.jLabel41 = new JLabel();
        this.nometprenom = new JLabel();
        this.date2 = new JLabel();
        this.matricule = new JLabel();
        this.jLabel58 = new JLabel();
        this.globale = new JLabel();
        this.jLabel62 = new JLabel();
        this.jLabel67 = new JLabel();
        this.nbbmois = new JLabel();
        this.jLabel70 = new JLabel();
        this.jLabel71 = new JLabel();
        this.date1 = new JLabel();
        this.jLabel99 = new JLabel();
        this.jLabel100 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel68 = new JLabel();
        this.dateatt = new JLabel();
        this.jLabel42 = new JLabel();
        this.mecat = new JLabel();
        this.jPanel3 = new JPanel();
        this.jPanel5 = new JPanel();
        this.jLabel13 = new JLabel();
        this.dateactuele = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel48 = new JLabel();
        this.etabd = new JLabel();
        this.jLabel61 = new JLabel();
        this.nbmd = new JLabel();
        this.jLabel72 = new JLabel();
        this.montantletrechiffd = new JLabel();
        this.jLabel73 = new JLabel();
        this.nomd = new JLabel();
        this.jLabel74 = new JLabel();
        this.derniermoisd = new JLabel();
        this.jLabel75 = new JLabel();
        this.idend = new JLabel();
        this.jLabel76 = new JLabel();
        this.montantparmoisd = new JLabel();
        this.jLabel77 = new JLabel();
        this.jLabel78 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel79 = new JLabel();
        this.jLabel80 = new JLabel();
        this.jLabel81 = new JLabel();
        this.jLabel82 = new JLabel();
        this.jLabel83 = new JLabel();
        this.jLabel84 = new JLabel();
        this.jLabel85 = new JLabel();
        this.jLabel86 = new JLabel();
        this.jLabel87 = new JLabel();
        this.jLabel88 = new JLabel();
        this.jPanel6 = new JPanel();
        this.jLabel43 = new JLabel();
        this.jLabel89 = new JLabel();
        this.premmoid = new JLabel();
        this.jLabel90 = new JLabel();
        this.ncinddemande = new JLabel();
        this.jLabel92 = new JLabel();
        this.delivd = new JLabel();
        this.jLabel91 = new JLabel();
        this.mecanod = new JLabel();
        this.numces = new JLabel();
        this.jPanel7 = new JPanel();
        this.jPanel8 = new JPanel();
        this.dateetat = new JLabel();
        this.jLabel22 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jLabel23 = new JLabel();
        this.jLabel93 = new JLabel();
        this.nometat = new JLabel();
        this.matriculeetat = new JLabel();
        this.jLabel95 = new JLabel();
        this.numchequeetat = new JLabel();
        this.jLabel96 = new JLabel();
        this.jLabel97 = new JLabel();
        this.jPanel9 = new JPanel();
        this.jLabel94 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.jLabel98 = new JLabel();
        this.jTextField1 = new JTextField();
        this.mecanoetat = new JLabel();
        this.cnretat = new JLabel();
        this.montantetat = new JLabel();
        this.nometattab = new JLabel();
        this.cinetat = new JLabel();
        this.jTextField2 = new JTextField();
        this.jTextField3 = new JTextField();
        this.jTextField4 = new JTextField();
        this.jTextField5 = new JTextField();
        this.jTextField6 = new JTextField();
        this.jTextField7 = new JTextField();
        this.jTextField8 = new JTextField();
        this.jTextField9 = new JTextField();
        this.jTextField10 = new JTextField();
        this.jTextField11 = new JTextField();
        this.jTextField12 = new JTextField();
        this.mecanoetat1 = new JLabel();
        this.jPanel10 = new JPanel();
        this.jPanel11 = new JPanel();
        this.jLabel8 = new JLabel();
        this.montantchiffrek = new JLabel();
        this.numcompteadhK = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.montantlettreK = new JLabel();
        this.nomadhK = new JLabel();
        this.jLabel12 = new JLabel();
        this.DatedebutK = new JLabel();
        this.Datefin = new JLabel();
        this.jPanel13 = new JPanel();
        this.cheque10 = new JPanel();
        this.montantlettrecheque1 = new JLabel();
        this.montchiffrechequecheque = new JLabel();
        this.nomadhchequecheque = new JLabel();
        this.mecc1 = new JLabel();
        this.jLabel32 = new JLabel();
        this.datecheque1 = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(153, 0, 0));
        this.jLabel1.setText("MAHDIA");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(10, 130, 140, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Mecano :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(10, 44, 70, 20);
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.mecanoActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(80, 40, 170, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("1 er mois :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(220, 80, 80, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Montant :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(260, 40, 90, 30);
        this.nbmois.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.nbmoisActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.nbmois);
        this.nbmois.setBounds(100, 80, 80, 30);
        this.mensualit\u00e9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.mensualit\u00e9ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mensualit\u00e9);
        this.mensualit\u00e9.setBounds(340, 40, 170, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("imprimer cession");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(400, 80, 150, 40);
        this.jButton6.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton6.setText("vider");
        this.jButton6.setToolTipText("Quitter");
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jButton6ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton6);
        this.jButton6.setBounds(460, 120, 90, 40);
        this.mat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.matActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mat);
        this.mat.setBounds(310, 80, 80, 30);
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setText("NB de mois :");
        this.jPanel1.add(this.jLabel28);
        this.jLabel28.setBounds(10, 80, 90, 30);
        this.jButton3.setFont(new Font("Tahoma", 1, 12));
        this.jButton3.setText("Etat Cession");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(320, 120, 120, 40);
        this.jLabel5.setFont(new Font("Tahoma", 1, 30));
        this.jLabel5.setForeground(new Color(51, 51, 255));
        this.jLabel5.setText("Attestation de prise en charge");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(60, 0, 470, 30);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.jPanel4.setLayout(null);
        this.jLabel6.setFont(new Font("Tahoma", 1, 20));
        this.jLabel6.setText("ATTESTATION DE PRISE EN CHARGE");
        this.jLabel6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jLabel6);
        this.jLabel6.setBounds(90, 120, 380, 30);
        this.jLabel9.setText("LA FATERNITE");
        this.jPanel4.add(this.jLabel9);
        this.jLabel9.setBounds(20, 30, 230, 14);
        this.jLabel15.setText("MUTUELLE DES RETRAITES");
        this.jPanel4.add(this.jLabel15);
        this.jLabel15.setBounds(340, 30, 190, 14);
        this.jLabel33.setFont(new Font("Tahoma", 0, 14));
        this.jLabel33.setText("LA Mutuelle des Retraites de Mahdia, prend en charge le payement des Mensualit\u00e9s");
        this.jPanel4.add(this.jLabel33);
        this.jLabel33.setBounds(40, 220, 500, 30);
        this.jLabel35.setFont(new Font("Tahoma", 0, 14));
        this.jLabel35.setText("Mle");
        this.jPanel4.add(this.jLabel35);
        this.jLabel35.setBounds(10, 260, 30, 30);
        this.jLabel36.setFont(new Font("Tahoma", 0, 14));
        this.jLabel36.setText("Adh\u00e9rant a la Mutuelle.");
        this.jPanel4.add(this.jLabel36);
        this.jLabel36.setBounds(360, 260, 150, 30);
        this.jLabel37.setFont(new Font("Tahoma", 0, 14));
        this.jLabel37.setText("Valeur du pret:");
        this.jPanel4.add(this.jLabel37);
        this.jLabel37.setBounds(10, 290, 100, 17);
        this.jLabel38.setFont(new Font("Tahoma", 0, 14));
        this.jLabel38.setText("Payable sur :");
        this.jPanel4.add(this.jLabel38);
        this.jLabel38.setBounds(10, 310, 100, 20);
        this.jLabel39.setFont(new Font("Tahoma", 0, 14));
        this.jLabel39.setText("Mecano :");
        this.jPanel4.add(this.jLabel39);
        this.jLabel39.setBounds(380, 290, 60, 30);
        this.jLabel40.setFont(new Font("Tahoma", 0, 14));
        this.jLabel40.setText("Ces Mensualit\u00e9s seront vers\u00e9es au profil de FRATERNITE a son CCB ");
        this.jPanel4.add(this.jLabel40);
        this.jLabel40.setBounds(10, 360, 550, 30);
        this.jLabel41.setFont(new Font("Tahoma", 0, 14));
        this.jLabel41.setText("N\u00b0: 29 556 390 BT Tunis au d\u00e9but de chaque mois.");
        this.jPanel4.add(this.jLabel41);
        this.jLabel41.setBounds(10, 380, 490, 30);
        this.nometprenom.setFont(new Font("Tahoma", 1, 14));
        this.nometprenom.setText("...............................................................");
        this.jPanel4.add(this.nometprenom);
        this.nometprenom.setBounds(190, 240, 260, 20);
        this.date2.setFont(new Font("Tahoma", 1, 14));
        this.date2.setText("......................");
        this.jPanel4.add(this.date2);
        this.date2.setBounds(340, 330, 210, 30);
        this.matricule.setFont(new Font("Tahoma", 1, 14));
        this.matricule.setText("..............................");
        this.jPanel4.add(this.matricule);
        this.matricule.setBounds(40, 260, 310, 30);
        this.jLabel58.setFont(new Font("Tahoma", 0, 14));
        this.jLabel58.setText("De la mutuelle de Retraiter");
        this.jPanel4.add(this.jLabel58);
        this.jLabel58.setBounds(320, 540, 170, 20);
        this.globale.setFont(new Font("Tahoma", 1, 14));
        this.globale.setText("............");
        this.jPanel4.add(this.globale);
        this.globale.setBounds(110, 290, 140, 20);
        this.jLabel62.setFont(new Font("Tahoma", 0, 14));
        this.jLabel62.setText("Au:");
        this.jPanel4.add(this.jLabel62);
        this.jLabel62.setBounds(310, 330, 30, 30);
        this.jLabel67.setFont(new Font("Tahoma", 0, 14));
        this.jLabel67.setText("Rue de Monastir N\u00b011  - 1er Etage - Bab Saadoun - Tunis 1006- t\u00e9l : 71572 098");
        this.jPanel4.add(this.jLabel67);
        this.jLabel67.setBounds(10, 700, 520, 30);
        this.nbbmois.setFont(new Font("Tahoma", 1, 14));
        this.nbbmois.setText("......................");
        this.jPanel4.add(this.nbbmois);
        this.nbbmois.setBounds(90, 310, 70, 20);
        this.jLabel70.setFont(new Font("Tahoma", 0, 14));
        this.jLabel70.setText("J.S.GANDOURA");
        this.jPanel4.add(this.jLabel70);
        this.jLabel70.setBounds(360, 570, 110, 17);
        this.jLabel71.setFont(new Font("Tahoma", 0, 14));
        this.jLabel71.setText("A compter du");
        this.jPanel4.add(this.jLabel71);
        this.jLabel71.setBounds(10, 330, 90, 30);
        this.date1.setFont(new Font("Tahoma", 1, 14));
        this.date1.setText(".....................................................");
        this.jPanel4.add(this.date1);
        this.date1.setBounds(110, 330, 190, 30);
        this.jLabel99.setFont(new Font("Tahoma", 0, 14));
        this.jLabel99.setText("Mensualit\u00e9s.");
        this.jPanel4.add(this.jLabel99);
        this.jLabel99.setBounds(170, 300, 80, 40);
        this.jLabel100.setFont(new Font("Tahoma", 0, 14));
        this.jLabel100.setText("aff\u00e9rentes au pret octroy\u00e9 a");
        this.jPanel4.add(this.jLabel100);
        this.jLabel100.setBounds(10, 240, 180, 30);
        this.jLabel7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jLabel7);
        this.jLabel7.setBounds(0, 686, 550, 2);
        this.jLabel68.setFont(new Font("Tahoma", 0, 14));
        this.jLabel68.setText("Le D\u00e9l\u00e9gue R\u00e9gional");
        this.jPanel4.add(this.jLabel68);
        this.jLabel68.setBounds(340, 510, 140, 30);
        this.dateatt.setFont(new Font("Tahoma", 1, 12));
        this.dateatt.setText("..................");
        this.jPanel4.add(this.dateatt);
        this.dateatt.setBounds(130, 70, 140, 15);
        this.jLabel42.setFont(new Font("Tahoma", 0, 14));
        this.jLabel42.setText("Mahdia le :");
        this.jPanel4.add(this.jLabel42);
        this.jLabel42.setBounds(50, 60, 70, 30);
        this.mecat.setFont(new Font("Tahoma", 1, 14));
        this.mecat.setText("............");
        this.jPanel4.add(this.mecat);
        this.mecat.setBounds(450, 290, 90, 30);
        this.jPanel3.setBackground(new Color(204, 204, 204));
        this.jPanel3.setLayout(null);
        this.jPanel5.setBackground(new Color(255, 255, 255));
        this.jPanel5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel5.setLayout(null);
        this.jLabel13.setText("Mahdia le :");
        this.jPanel5.add(this.jLabel13);
        this.jLabel13.setBounds(360, 10, 61, 14);
        this.dateactuele.setFont(new Font("Tahoma", 1, 11));
        this.dateactuele.setText("....................");
        this.jPanel5.add(this.dateactuele);
        this.dateactuele.setBounds(430, 4, 110, 20);
        this.jLabel20.setFont(new Font("Tahoma", 1, 24));
        this.jLabel20.setText("A Mr Le Pr\u00e9sident de la Mutuelle ");
        this.jPanel5.add(this.jLabel20);
        this.jLabel20.setBounds(60, 70, 450, 30);
        this.jLabel21.setFont(new Font("Tahoma", 1, 18));
        this.jLabel21.setText("Reserv\u00e9 a l'administration");
        this.jPanel5.add(this.jLabel21);
        this.jLabel21.setBounds(130, 460, 270, 22);
        this.jLabel48.setFont(new Font("Tahoma", 0, 14));
        this.jLabel48.setText("Etablissement:");
        this.jPanel5.add(this.jLabel48);
        this.jLabel48.setBounds(280, 180, 90, 30);
        this.etabd.setFont(new Font("Tahoma", 1, 14));
        this.etabd.setText(".......................................");
        this.jPanel5.add(this.etabd);
        this.etabd.setBounds(370, 180, 170, 30);
        this.jLabel61.setFont(new Font("Tahoma", 0, 14));
        this.jLabel61.setText("solicit\u00e9 un pr\u00e9t de ");
        this.jPanel5.add(this.jLabel61);
        this.jLabel61.setBounds(10, 240, 120, 20);
        this.nbmd.setFont(new Font("Tahoma", 1, 14));
        this.nbmd.setText("......");
        this.jPanel5.add(this.nbmd);
        this.nbmd.setBounds(490, 240, 40, 20);
        this.jLabel72.setFont(new Font("Tahoma", 0, 14));
        this.jLabel72.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel5.add(this.jLabel72);
        this.jLabel72.setBounds(190, 520, 150, 90);
        this.montantletrechiffd.setFont(new Font("Tahoma", 1, 14));
        this.montantletrechiffd.setText(".......................................");
        this.jPanel5.add(this.montantletrechiffd);
        this.montantletrechiffd.setBounds(130, 240, 240, 20);
        this.jLabel73.setFont(new Font("Tahoma", 0, 14));
        this.jLabel73.setText("Au :");
        this.jPanel5.add(this.jLabel73);
        this.jLabel73.setBounds(210, 300, 30, 20);
        this.nomd.setFont(new Font("Tahoma", 1, 14));
        this.nomd.setText(".......................................");
        this.jPanel5.add(this.nomd);
        this.nomd.setBounds(110, 180, 170, 30);
        this.jLabel74.setFont(new Font("Tahoma", 0, 14));
        this.jLabel74.setText("Identifiant N\u00b0 :");
        this.jPanel5.add(this.jLabel74);
        this.jLabel74.setBounds(10, 210, 90, 20);
        this.derniermoisd.setFont(new Font("Tahoma", 1, 14));
        this.derniermoisd.setText(".......................................");
        this.jPanel5.add(this.derniermoisd);
        this.derniermoisd.setBounds(250, 300, 170, 20);
        this.jLabel75.setFont(new Font("Tahoma", 0, 14));
        this.jLabel75.setText("remboursable sur :");
        this.jPanel5.add(this.jLabel75);
        this.jLabel75.setBounds(370, 240, 120, 20);
        this.idend.setFont(new Font("Tahoma", 1, 14));
        this.idend.setText(".......................................");
        this.jPanel5.add(this.idend);
        this.idend.setBounds(100, 210, 160, 20);
        this.jLabel76.setFont(new Font("Tahoma", 0, 14));
        this.jLabel76.setText("Veuillez agreer , mes salutations distingu\u00e9es .");
        this.jPanel5.add(this.jLabel76);
        this.jLabel76.setBounds(10, 330, 370, 20);
        this.montantparmoisd.setFont(new Font("Tahoma", 1, 14));
        this.montantparmoisd.setText(".......................................");
        this.jPanel5.add(this.montantparmoisd);
        this.montantparmoisd.setBounds(90, 270, 430, 20);
        this.jLabel77.setFont(new Font("Tahoma", 0, 14));
        this.jLabel77.setText("a raison de  :");
        this.jPanel5.add(this.jLabel77);
        this.jLabel77.setBounds(10, 270, 80, 20);
        this.jLabel78.setFont(new Font("Tahoma", 1, 14));
        this.jLabel78.setText("Objet : Demande de pret.");
        this.jPanel5.add(this.jLabel78);
        this.jLabel78.setBounds(20, 150, 190, 30);
        this.jLabel29.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel5.add(this.jLabel29);
        this.jLabel29.setBounds(0, 448, 540, 2);
        this.jLabel30.setFont(new Font("Tahoma", 1, 24));
        this.jLabel30.setText("Des Retrait\u00e9s \"La FRATERNITE\"");
        this.jPanel5.add(this.jLabel30);
        this.jLabel30.setBounds(70, 100, 430, 29);
        this.jLabel79.setFont(new Font("Tahoma", 0, 14));
        this.jLabel79.setText("Avis Du Service Pret");
        this.jPanel5.add(this.jLabel79);
        this.jLabel79.setBounds(30, 520, 130, 30);
        this.jLabel80.setFont(new Font("Tahoma", 0, 12));
        this.jLabel80.setText("Mecano :");
        this.jPanel5.add(this.jLabel80);
        this.jLabel80.setBounds(10, 50, 70, 20);
        this.jLabel81.setFont(new Font("Tahoma", 0, 14));
        this.jLabel81.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel5.add(this.jLabel81);
        this.jLabel81.setBounds(370, 520, 150, 90);
        this.jLabel82.setFont(new Font("Tahoma", 0, 14));
        this.jLabel82.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel5.add(this.jLabel82);
        this.jLabel82.setBounds(290, 630, 230, 120);
        this.jLabel83.setFont(new Font("Tahoma", 0, 14));
        this.jLabel83.setText("D\u00e9cission De La Responsable");
        this.jPanel5.add(this.jLabel83);
        this.jLabel83.setBounds(320, 630, 180, 20);
        this.jLabel84.setFont(new Font("Tahoma", 0, 14));
        this.jLabel84.setText("Avis Du Service Suivi");
        this.jPanel5.add(this.jLabel84);
        this.jLabel84.setBounds(200, 520, 150, 30);
        this.jLabel85.setFont(new Font("Tahoma", 0, 14));
        this.jLabel85.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel5.add(this.jLabel85);
        this.jLabel85.setBounds(20, 520, 150, 90);
        this.jLabel86.setFont(new Font("Tahoma", 0, 14));
        this.jLabel86.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel5.add(this.jLabel86);
        this.jLabel86.setBounds(20, 630, 230, 120);
        this.jLabel87.setFont(new Font("Tahoma", 0, 14));
        this.jLabel87.setText("Avis De La Commission");
        this.jPanel5.add(this.jLabel87);
        this.jLabel87.setBounds(370, 520, 170, 30);
        this.jLabel88.setFont(new Font("Tahoma", 0, 14));
        this.jLabel88.setText("Avis D\u00e9finitif du Service Pr\u00e9t");
        this.jPanel5.add(this.jLabel88);
        this.jLabel88.setBounds(40, 630, 170, 30);
        this.jPanel6.setBackground(new Color(255, 255, 255));
        this.jPanel6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jLabel43.setFont(new Font("Tahoma", 1, 14));
        this.jLabel43.setText("Signature ");
        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addContainerGap(52, 32767).addComponent(this.jLabel43, -2, 80, -2).addGap(46, 46, 46)));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel43, -2, 30, -2).addContainerGap(78, 32767)));
        this.jPanel5.add(this.jPanel6);
        this.jPanel6.setBounds(340, 330, 180, 110);
        this.jLabel89.setFont(new Font("Tahoma", 0, 14));
        this.jLabel89.setText("Du :");
        this.jPanel5.add(this.jLabel89);
        this.jLabel89.setBounds(10, 300, 30, 20);
        this.premmoid.setFont(new Font("Tahoma", 1, 14));
        this.premmoid.setText(".......................................");
        this.jPanel5.add(this.premmoid);
        this.premmoid.setBounds(40, 300, 170, 20);
        this.jLabel90.setFont(new Font("Tahoma", 0, 14));
        this.jLabel90.setText("Je soussign\u00e9 :");
        this.jPanel5.add(this.jLabel90);
        this.jLabel90.setBounds(20, 180, 90, 30);
        this.ncinddemande.setFont(new Font("Tahoma", 0, 12));
        this.ncinddemande.setText("..................................");
        this.jPanel5.add(this.ncinddemande);
        this.ncinddemande.setBounds(50, 10, 160, 20);
        this.jLabel92.setFont(new Font("Tahoma", 0, 12));
        this.jLabel92.setText("N CIN:");
        this.jPanel5.add(this.jLabel92);
        this.jLabel92.setBounds(10, 10, 40, 20);
        this.delivd.setFont(new Font("Tahoma", 0, 12));
        this.delivd.setText("..................................");
        this.jPanel5.add(this.delivd);
        this.delivd.setBounds(80, 30, 160, 20);
        this.jLabel91.setFont(new Font("Tahoma", 0, 12));
        this.jLabel91.setText("d\u00e9livr\u00e9e le :");
        this.jPanel5.add(this.jLabel91);
        this.jLabel91.setBounds(10, 30, 70, 20);
        this.mecanod.setFont(new Font("Tahoma", 0, 12));
        this.mecanod.setText("..................................");
        this.jPanel5.add(this.mecanod);
        this.mecanod.setBounds(80, 50, 160, 20);
        this.numces.setFont(new Font("Tahoma", 1, 12));
        this.numces.setText("...............");
        this.jPanel5.add(this.numces);
        this.numces.setBounds(350, 30, 170, 20);
        this.jPanel3.add(this.jPanel5);
        this.jPanel5.setBounds(0, 10, 540, 760);
        this.jPanel7.setBackground(new Color(102, 153, 255));
        this.jPanel7.setLayout(null);
        this.jPanel8.setBackground(new Color(255, 255, 255));
        this.jPanel8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.setLayout(null);
        this.dateetat.setText(".........");
        this.jPanel8.add(this.dateetat);
        this.dateetat.setBounds(20, 150, 40, 30);
        this.jLabel22.setFont(new Font("Tahoma", 1, 24));
        this.jLabel22.setText("PHOTOCOPIE DU CHEQUE");
        this.jPanel8.add(this.jLabel22);
        this.jLabel22.setBounds(120, 550, 320, 30);
        this.jSeparator1.setBackground(new Color(0, 0, 0));
        this.jSeparator1.setForeground(new Color(0, 0, 0));
        this.jPanel8.add(this.jSeparator1);
        this.jSeparator1.setBounds(0, 230, 580, 10);
        this.jLabel23.setFont(new Font("Tahoma", 1, 24));
        this.jLabel23.setText("ETAT DE  PAYEMENT EN ESPECE");
        this.jPanel8.add(this.jLabel23);
        this.jLabel23.setBounds(70, 40, 420, 30);
        this.jLabel93.setFont(new Font("Tahoma", 0, 14));
        this.jLabel93.setText("Matricule :");
        this.jPanel8.add(this.jLabel93);
        this.jLabel93.setBounds(320, 310, 70, 30);
        this.nometat.setFont(new Font("Tahoma", 1, 14));
        this.nometat.setText("......................");
        this.jPanel8.add(this.nometat);
        this.nometat.setBounds(110, 310, 200, 30);
        this.matriculeetat.setFont(new Font("Tahoma", 1, 14));
        this.matriculeetat.setText("......................");
        this.jPanel8.add(this.matriculeetat);
        this.matriculeetat.setBounds(430, 310, 140, 30);
        this.jLabel95.setFont(new Font("Tahoma", 0, 14));
        this.jLabel95.setText("Je Soussign\u00e9 :");
        this.jPanel8.add(this.jLabel95);
        this.jLabel95.setBounds(20, 310, 90, 30);
        this.numchequeetat.setFont(new Font("Tahoma", 1, 14));
        this.numchequeetat.setText("......................");
        this.jPanel8.add(this.numchequeetat);
        this.numchequeetat.setBounds(270, 340, 260, 30);
        this.jLabel96.setFont(new Font("Tahoma", 0, 14));
        this.jLabel96.setText("Certifie avoir recu l'original du ch\u00e9que N\u00b0");
        this.jPanel8.add(this.jLabel96);
        this.jLabel96.setBounds(10, 340, 250, 30);
        this.jLabel97.setFont(new Font("Tahoma", 0, 14));
        this.jLabel97.setText("tir\u00e9 sur B.T mahdia a titre de pret .");
        this.jPanel8.add(this.jLabel97);
        this.jLabel97.setBounds(10, 370, 250, 30);
        this.jPanel9.setBackground(new Color(255, 255, 255));
        this.jPanel9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jLabel94.setFont(new Font("Tahoma", 1, 14));
        this.jLabel94.setText("Signature ");
        GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
        this.jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup().addContainerGap(52, 32767).addComponent(this.jLabel94, -2, 80, -2).addGap(46, 46, 46)));
        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.jLabel94, -2, 30, -2).addContainerGap(78, 32767)));
        this.jPanel8.add(this.jPanel9);
        this.jPanel9.setBounds(330, 410, 180, 110);
        this.jSeparator2.setBackground(new Color(0, 0, 0));
        this.jSeparator2.setForeground(new Color(0, 0, 0));
        this.jPanel8.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 532, 560, 10);
        this.jLabel98.setFont(new Font("Tahoma", 1, 24));
        this.jLabel98.setText("ACCUSE DE RECEPTION ");
        this.jPanel8.add(this.jLabel98);
        this.jLabel98.setBounds(120, 260, 320, 30);
        this.jTextField1.setFont(new Font("Tahoma", 1, 12));
        this.jTextField1.setText("  Date");
        this.jTextField1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField1);
        this.jTextField1.setBounds(10, 100, 60, 30);
        this.mecanoetat.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat.setText(".........");
        this.jPanel8.add(this.mecanoetat);
        this.mecanoetat.setBounds(79, 147, 30, 30);
        this.cnretat.setFont(new Font("Tahoma", 0, 12));
        this.cnretat.setText("...............");
        this.jPanel8.add(this.cnretat);
        this.cnretat.setBounds(280, 150, 90, 27);
        this.montantetat.setFont(new Font("Tahoma", 0, 10));
        this.montantetat.setText("..........");
        this.jPanel8.add(this.montantetat);
        this.montantetat.setBounds(390, 150, 60, 27);
        this.nometattab.setFont(new Font("Tahoma", 0, 10));
        this.nometattab.setText("..............");
        this.jPanel8.add(this.nometattab);
        this.nometattab.setBounds(130, 150, 140, 30);
        this.cinetat.setFont(new Font("Tahoma", 0, 10));
        this.cinetat.setText("...........");
        this.jPanel8.add(this.cinetat);
        this.cinetat.setBounds(470, 150, 60, 27);
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField2);
        this.jTextField2.setBounds(120, 130, 150, 60);
        this.jTextField3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jTextField3ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField3);
        this.jTextField3.setBounds(10, 130, 60, 60);
        this.jTextField4.setFont(new Font("Tahoma", 1, 12));
        this.jTextField4.setText("    Nom et Prenom");
        this.jTextField4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jTextField4ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField4);
        this.jTextField4.setBounds(120, 100, 150, 30);
        this.jTextField5.setFont(new Font("Tahoma", 1, 12));
        this.jTextField5.setText("N\u00b0CIN");
        this.jTextField5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jTextField5ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField5);
        this.jTextField5.setBounds(460, 100, 90, 30);
        this.jTextField6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField6);
        this.jTextField6.setBounds(460, 130, 90, 60);
        this.jTextField7.setFont(new Font("Tahoma", 1, 12));
        this.jTextField7.setText("Mecano");
        this.jTextField7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jTextField7ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField7);
        this.jTextField7.setBounds(70, 100, 50, 30);
        this.jTextField8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField8);
        this.jTextField8.setBounds(70, 130, 50, 60);
        this.jTextField9.setFont(new Font("Tahoma", 1, 12));
        this.jTextField9.setText("     CNR");
        this.jTextField9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jTextField9ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField9);
        this.jTextField9.setBounds(270, 100, 100, 30);
        this.jTextField10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField10);
        this.jTextField10.setBounds(270, 130, 100, 60);
        this.jTextField11.setFont(new Font("Tahoma", 1, 12));
        this.jTextField11.setText("Montant");
        this.jTextField11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField11.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Atestationdepriseencharge.this.jTextField11ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField11);
        this.jTextField11.setBounds(370, 100, 90, 30);
        this.jTextField12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField12);
        this.jTextField12.setBounds(370, 130, 90, 60);
        this.mecanoetat1.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat1.setText(".............");
        this.jPanel8.add(this.mecanoetat1);
        this.mecanoetat1.setBounds(80, 150, 50, 27);
        this.jPanel7.add(this.jPanel8);
        this.jPanel8.setBounds(0, 10, 580, 720);
        this.jPanel10.setBackground(new Color(0, 153, 204));
        this.jPanel11.setBackground(new Color(255, 255, 255));
        this.jPanel11.setLayout(null);
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setText("Mahdia");
        this.jPanel11.add(this.jLabel8);
        this.jLabel8.setBounds(240, 20, 120, 20);
        this.montantchiffrek.setFont(new Font("Tahoma", 1, 14));
        this.montantchiffrek.setText(".................");
        this.jPanel11.add(this.montantchiffrek);
        this.montantchiffrek.setBounds(394, 64, 110, 30);
        this.numcompteadhK.setFont(new Font("Tahoma", 1, 14));
        this.numcompteadhK.setText("05501000014534634714");
        this.jPanel11.add(this.numcompteadhK);
        this.numcompteadhK.setBounds(134, 67, 210, 20);
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("C.S.Mahdia");
        this.jPanel11.add(this.jLabel10);
        this.jLabel10.setBounds(20, 104, 100, 30);
        this.jLabel11.setFont(new Font("Tahoma", 1, 14));
        this.jLabel11.setText("Centre Social Mahdia");
        this.jPanel11.add(this.jLabel11);
        this.jLabel11.setBounds(200, 114, 170, 20);
        this.montantlettreK.setFont(new Font("Tahoma", 1, 14));
        this.montantlettreK.setText("MILLE   Dinars");
        this.jPanel11.add(this.montantlettreK);
        this.montantlettreK.setBounds(20, 134, 460, 30);
        this.nomadhK.setFont(new Font("Tahoma", 1, 14));
        this.nomadhK.setText("Ali ouaz");
        this.jPanel11.add(this.nomadhK);
        this.nomadhK.setBounds(200, 224, 300, 30);
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("Mahdia");
        this.jPanel11.add(this.jLabel12);
        this.jLabel12.setBounds(370, 184, 100, 30);
        this.DatedebutK.setText("Date debut");
        this.jPanel11.add(this.DatedebutK);
        this.DatedebutK.setBounds(240, 40, 100, 20);
        this.jPanel11.add(this.Datefin);
        this.Datefin.setBounds(120, 40, 100, 20);
        GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
        this.jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 547, 32767).addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addGap(0, 13, 32767).addComponent(this.jPanel11, -2, 520, -2).addGap(0, 14, 32767))));
        jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 364, 32767).addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addGap(0, 27, 32767).addComponent(this.jPanel11, -2, 310, -2).addGap(0, 27, 32767))));
        this.jPanel13.setBackground(new Color(153, 153, 0));
        this.cheque10.setBackground(new Color(255, 255, 255));
        this.cheque10.setLayout(null);
        this.montantlettrecheque1.setFont(new Font("Tahoma", 0, 12));
        this.montantlettrecheque1.setText("................");
        this.cheque10.add(this.montantlettrecheque1);
        this.montantlettrecheque1.setBounds(80, 50, 390, 20);
        this.montchiffrechequecheque.setFont(new Font("Arial Black", 0, 12));
        this.montchiffrechequecheque.setText("................");
        this.cheque10.add(this.montchiffrechequecheque);
        this.montchiffrechequecheque.setBounds(350, 0, 110, 20);
        this.nomadhchequecheque.setFont(new Font("Tahoma", 1, 14));
        this.nomadhchequecheque.setText(".................................................................................");
        this.cheque10.add(this.nomadhchequecheque);
        this.nomadhchequecheque.setBounds(80, 70, 350, 20);
        this.cheque10.add(this.mecc1);
        this.mecc1.setBounds(180, 0, 60, 20);
        this.jLabel32.setText("Mahdia ");
        this.cheque10.add(this.jLabel32);
        this.jLabel32.setBounds(150, 160, 50, 14);
        this.datecheque1.setFont(new Font("Tahoma", 0, 12));
        this.datecheque1.setText("..............................");
        this.cheque10.add(this.datecheque1);
        this.datecheque1.setBounds(210, 160, 160, 15);
        GroupLayout jPanel13Layout = new GroupLayout(this.jPanel13);
        this.jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addContainerGap().addComponent(this.cheque10, -2, 538, -2).addContainerGap(-1, 32767)));
        jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup().addComponent(this.cheque10, -2, 217, -2).addContainerGap(-1, 32767)));
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel7, -1, 582, 32767).addComponent(this.jPanel10, -2, -1, -2).addComponent(this.jPanel1, -2, 582, -2).addComponent(this.jPanel3, -2, 554, -2))).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel13, -2, 537, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.jPanel4, -1, 570, 32767))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, 168, -2).addGap(18, 18, 18).addComponent(this.jPanel4, -2, 789, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel3, -2, 361, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel7, -2, 373, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel10, -2, -1, -2).addGap(68, 68, 68).addComponent(this.jPanel13, -1, -1, 32767).addContainerGap()));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addContainerGap(328, 32767)));
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void nbmoisActionPerformed(ActionEvent evt) {
    }

    private void mensualit\u00e9ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean g;
        JOptionPane jop2;
        Date actuellEed = new Date();
        SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
        String datddd = dateFormattd.format(actuellEed);
        this.dateatt.setText(datddd);
        this.DatedebutK.setText(datddd);
        this.datecheque1.setText(datddd);
        this.dateactuele.setText(datddd);
        this.dateetat.setText(datddd);
        String dateS = datddd.substring(3, datddd.length());
        this.k = 1;
        boolean bl = g = this.mecano.getText().equals("") || this.mensualit\u00e9.getText().equals("") || this.nbmois.getText().equals("");
        if (g) {
            this.k = 0;
            jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        } else if (this.mensualit\u00e9.getText().length() < 4) {
            jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Montant Incorrecte", "Attention", 0);
            this.k = 0;
        }
        String mec = this.mecano.getText();
        this.mecat.setText(mec);
        this.mecanod.setText(mec);
        String ch1 = "";
        int nbm = Integer.parseInt(this.nbmois.getText());
        int montglobale = Integer.parseInt(this.mensualit\u00e9.getText());
        int somme = montglobale / nbm;
        String ss = "" + montglobale + "";
        String ssV = "" + somme + "";
        int tV = ssV.length() - 3;
        String diiV = ssV.substring(0, ssV.length() - 3);
        String miilV = ssV.substring(tV, ssV.length());
        this.parmois = diiV + "," + miilV;
        this.montantparmoisd.setText(this.parmois + " DT");
        int tt = ss.length() - 3;
        String dii = ss.substring(0, ss.length() - 3);
        String miil = ss.substring(tt, ss.length());
        this.ch = "( " + dii + "," + miil + " DT )";
        this.montchiffrechequecheque.setText(dii + "," + miil);
        this.globale.setText(dii + "," + miil);
        String mmontant = "" + montglobale + "";
        int t = mmontant.length() - 3;
        String di = mmontant.substring(0, mmontant.length() - 3);
        String mil = mmontant.substring(t, mmontant.length());
        this.mont = di + "," + mil;
        int mon = Integer.parseInt(di);
        String adi = "";
        try {
            adi = Nombre.CALCULATE.getValue(mon, " Dinars ");
        }
        catch (Exception ex) {
            Logger.getLogger(Atestationdepriseencharge.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.montantlettrecheque1.setText("#" + adi + "#");
        this.montantlettreK.setText(adi);
        String mff = this.mensualit\u00e9.getText();
        this.montantetat.setText(this.mont);
        this.montantletrechiffd.setText(this.mont);
        this.montantchiffrek.setText(this.mont);
        this.nbmd.setText(this.nbmois.getText());
        try {
            int monm = Integer.parseInt(mff);
            String mchbd = "";
            mchbd = Nombre.CALCULATE.getValue(monm, " Dinars ");
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erreur convertire montant en lettre ");
        }
        if (this.k == 1) {
            int aa;
            Date actuellEe = new Date();
            SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
            String datdd = dateFormatt.format(actuellEe);
            String jours = datdd.substring(0, datdd.length() - 8);
            System.out.println("jours =" + jours);
            int j = Integer.parseInt(jours);
            String mois2 = datdd.substring(3, datdd.length() - 5);
            String ann\u00e9es = datdd.substring(6, datdd.length());
            System.out.println("mois =" + mois2);
            int ms = Integer.parseInt(mois2);
            System.out.println("ann\u00e9es =" + ann\u00e9es);
            int moiaci = Integer.parseInt(mois2);
            System.out.println("mois 1 =" + moiaci);
            dateS = mois2 + "/" + ann\u00e9es;
            boolean kl = false;
            if (this.mat.getText().equals("")) {
                kl = true;
                System.out.println("****************************");
            } else {
                kl = false;
                moiaci = Integer.parseInt(this.mat.getText());
            }
            if (kl && j > 5) {
                moiaci = moiaci + 1 < 13 ? ++moiaci : 1;
            }
            int moisresu = Integer.parseInt(this.nbmois.getText());
            int aaa = aa = Integer.parseInt(ann\u00e9es);
            if (ms > moiaci) {
                ++aaa;
                ++aa;
            }
            System.out.println("moiaci = " + moiaci);
            System.out.println("moisresu = " + moisresu);
            int kk = moiaci + moisresu;
            System.out.println("kk=" + kk);
            System.out.println("anne premier = " + aa);
            System.out.println("anne dernier = " + aaa);
            while (kk > 12) {
                kk -= 12;
                ++aaa;
            }
            System.out.println("-----------------------------");
            System.out.println("anne premier = " + aa);
            System.out.println("anne dernier = " + aaa);
            System.out.println("kk = " + kk);
            String moiddebut = "";
            switch (moiaci) {
                case 1: {
                    moiddebut = "Janvier  " + aa;
                    break;
                }
                case 2: {
                    moiddebut = "F\u00e9vrier  " + aa;
                    break;
                }
                case 3: {
                    moiddebut = "Mars  " + aa;
                    break;
                }
                case 4: {
                    moiddebut = "Avril  " + aa;
                    break;
                }
                case 5: {
                    moiddebut = "Mai  " + aa;
                    break;
                }
                case 6: {
                    moiddebut = "Juin  " + aa;
                    break;
                }
                case 7: {
                    moiddebut = "Juillet  " + aa;
                    break;
                }
                case 8: {
                    moiddebut = "Ao\u00fbt  " + aa;
                    break;
                }
                case 9: {
                    moiddebut = "Septembre  " + aa;
                    break;
                }
                case 10: {
                    moiddebut = "Octobre  " + aa;
                    break;
                }
                case 11: {
                    moiddebut = "Novembre  " + aa;
                    break;
                }
                case 12: {
                    moiddebut = "D\u00e9cembre  " + aa;
                    break;
                }
                default: {
                    moiddebut = "Erreur";
                }
            }
            this.date1.setText(moiddebut);
            this.premmoid.setText(moiddebut);
            if (kk == 1) {
                kk = 12;
                --aaa;
            } else {
                --kk;
            }
            String moisfin = "";
            System.out.println("-----------------------------");
            System.out.println("anne dernier = " + aaa);
            System.out.println("kk = " + kk);
            switch (kk) {
                case 1: {
                    moisfin = "Janvier  " + aaa;
                    break;
                }
                case 2: {
                    moisfin = "F\u00e9vrier  " + aaa;
                    break;
                }
                case 3: {
                    moisfin = "Mars  " + aaa;
                    break;
                }
                case 4: {
                    moisfin = "Avril  " + aaa;
                    break;
                }
                case 5: {
                    moisfin = "Mai  " + aaa;
                    break;
                }
                case 6: {
                    moisfin = "Juin  " + aaa;
                    break;
                }
                case 7: {
                    moisfin = "Juillet  " + aaa;
                    break;
                }
                case 8: {
                    moisfin = "Ao\u00fbt  " + aaa;
                    break;
                }
                case 9: {
                    moisfin = "Septembre  " + aaa;
                    break;
                }
                case 10: {
                    moisfin = "Octobre  " + aaa;
                    break;
                }
                case 11: {
                    moisfin = "Novembre  " + aaa;
                    break;
                }
                case 12: {
                    moisfin = "D\u00e9cembre  " + aaa;
                    break;
                }
                default: {
                    moisfin = "";
                }
            }
            System.out.println("moisfin =" + moisfin);
            this.date2.setText(moisfin);
            this.derniermoisd.setText(moisfin);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                String p = "1";
                ResultSet result2 = state2.executeQuery("SELECT * FROM cessionattestation WHERE annenbc='" + aaa + "'");
                String anneac = datddd.substring(datddd.length() - 4, datddd.length());
                while (result2.next()) {
                    this.k = 1;
                    String n = result2.getString("NBM");
                    int r = Integer.parseInt(n);
                    if (r <= this.num) continue;
                    this.num = r;
                }
            }
            catch (Exception e) {
                this.k = 0;
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de terminer num " + e.getMessage());
            }
            if (this.k == 1) {
                JOptionPane jop1;
                block112 : {
                    Connection conn3;
                    JOptionPane jop3;
                    String p;
                    JOptionPane jop12;
                    Statement state2;
                    Connection conn2;
                    ResultSet result2;
                    ++this.num;
                    this.numces.setText("DC :" + this.num + "/ 407 / " + aaa);
                    this.nbbmois.setText(this.nbmois.getText());
                    this.mecanoetat.setText(mec);
                    String typcarnet = "";
                    typcarnet = "Pr\u00e9ts Retrait\u00e9";
                    System.out.println("type de compte 2 =" + typcarnet);
                    String numcc = "";
                    String deb = "";
                    int typena = 0;
                    System.out.println("type de compte 2 =" + typcarnet);
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn3.createStatement();
                        String p2 = "0";
                        result2 = state2.executeQuery("SELECT * FROM comptecourant  WHERE observation='" + typcarnet + "' AND f='" + p2 + "'");
                        typena = 1;
                        while (result2.next()) {
                            this.numcarnet = result2.getString("num");
                            this.numerocheq = result2.getString("debut");
                            deb = result2.getString("datedebut");
                            this.k = 1;
                        }
                    }
                    catch (Exception e) {
                        this.k = 0;
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                    }
                    if (deb.equals("")) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn2.createStatement();
                            p = "0";
                            state2.executeUpdate("UPDATE  talondescheque SET p='" + p + "' WHERE p='1'");
                            this.k = 1;
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop12 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn3.createStatement();
                            state2.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                    } else {
                        typena = 2;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn3.createStatement();
                            p = "1";
                            result2 = state2.executeQuery("SELECT * FROM talondescheque  WHERE type='" + typcarnet + "' AND p='" + p + "'");
                            System.out.println("********************************** =");
                            while (result2.next()) {
                                this.numerocheq = result2.getString("numcheque");
                                System.out.println("numero de cheque talon des cheque  =" + this.numerocheq);
                                this.numcarnet = result2.getString("Numcarnet");
                                this.k = 1;
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur montant numcheque et num carnet " + e.getMessage());
                        }
                    }
                    if (this.k == 1) {
                        try {
                            this.Nch = Integer.parseInt(this.numerocheq);
                            if (typena == 2) {
                                this.Nch += 1.0;
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 1 " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn3.createStatement();
                            p = "1";
                            System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                            result2 = state2.executeQuery("SELECT * FROM comptecourant  WHERE num='" + this.numcarnet + "'");
                            while (result2.next()) {
                                this.numfin = result2.getString("fin");
                                System.out.println("numero de cheque fin =" + this.numfin);
                                this.k = 1;
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                        }
                        try {
                            this.Nfin = Integer.parseInt(this.numfin);
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 2  " + e.getMessage());
                        }
                        if (this.Nfin >= this.Nch) {
                            Connection conn22;
                            JOptionPane jop13;
                            Statement state22;
                            if (this.Nfin == this.Nch) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn2.createStatement();
                                    p = "1";
                                    state2.executeUpdate("UPDATE  comptecourant SET f='" + p + "' WHERE num='" + this.numcarnet + "'");
                                    state2.executeUpdate("UPDATE  comptecourant SET datefin='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                                    this.k = 1;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn222 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement state222 = conn222.createStatement();
                                        System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                                        ResultSet result22 = state2.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
                                        int kkk = 1;
                                        while (result22.next()) {
                                            if (kkk == 1) {
                                                String nauveaucarnet = result22.getString("num");
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    Connection conn21 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                                    Statement state21 = conn21.createStatement();
                                                    state21.executeUpdate("UPDATE  comptecourant SET observation='" + typcarnet + "' WHERE num='" + nauveaucarnet + "'");
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    JOptionPane jop32 = new JOptionPane();
                                                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                                }
                                            }
                                            ++kkk;
                                        }
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        JOptionPane jop33 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                    }
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop12 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                            this.firstcheque = "" + this.Nch + "";
                            int ji = 0;
                            ji = this.firstcheque.indexOf(".");
                            if (ji != -1) {
                                System.out.println("ji =" + ji);
                                this.firstcheque = this.firstcheque.substring(0, this.firstcheque.length() - 2);
                                System.out.println("firstcheque =" + this.firstcheque);
                            }
                            if (this.k == 1) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state22 = conn22.createStatement();
                                    String p3 = "0";
                                    state22.executeUpdate("UPDATE  talondescheque SET p='" + p3 + "' WHERE numcheque='" + this.numerocheq + "'");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop13 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                            if (this.k == 1) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state22 = conn22.createStatement();
                                    String banque = "BT";
                                    String mdi = di + "000";
                                    String p4 = "1";
                                    state22.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnet + "','" + this.mecano.getText() + "','" + mdi + "','" + datdd + "','" + typcarnet + "','" + p4 + "','" + banque + "')");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop13 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                }
                            }
                        } else {
                            this.k = 0;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                state2 = conn3.createStatement();
                                p = "0";
                                System.out.println("type type  =" + typcarnet);
                                result2 = state2.executeQuery("SELECT * FROM comptecourant  WHERE f='" + p + "' AND observation ='" + typcarnet + "'");
                                while (result2.next()) {
                                    this.numcarnetreserver = result2.getString("num");
                                    this.firstcheque = result2.getString("debut");
                                    System.out.println("numero de carnet cheque reserve 1 =" + this.numcarnetreserver);
                                    this.k = 1;
                                }
                            }
                            catch (Exception e) {
                                this.k = 0;
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                            }
                            if (this.numcarnetreserver.equals("")) {
                                System.out.println("numero de carnet cheque reserve 2 =" + this.numcarnetreserver);
                                JOptionPane jop14 = new JOptionPane();
                                this.k = 0;
                                JOptionPane.showMessageDialog(null, "Aucune carnet de cheque: il faut ajouter un nouveaux carnet");
                            } else {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn2.createStatement();
                                    p = "0";
                                    state2.executeUpdate("UPDATE  talondescheque SET p='" + p + "' WHERE numcheque='" + this.numerocheq + "'");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop12 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn2.createStatement();
                                    String banque = "BT";
                                    String mmff = mff + "000";
                                    String p5 = "1";
                                    state2.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnetreserver + "','" + this.mecano.getText() + "','" + mmff + "','" + datdd + "','" + typcarnet + "','" + p5 + "','" + banque + "')");
                                    this.k = 1;
                                    this.numcarnet = this.numcarnetreserver;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop12 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                }
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn2.createStatement();
                                    p = "0";
                                    state2.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnetreserver + "'");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop12 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                        }
                    }
                    String numchequecession = this.firstcheque;
                    this.numchequeetat.setText(numchequecession);
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state = conn4.createStatement();
                        ResultSet result = state.executeQuery("SELECT MECANO  FROM  retretait WHERE mecano=" + mec);
                        ResultSetMetaData resultMeta = result.getMetaData();
                        while (result.next()) {
                            for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                                ch1 = result.getObject(i).toString();
                            }
                        }
                        if (ch1.equals("")) {
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Adheron n'existe pas  ", "Information", 1);
                            this.k = 0;
                            break block112;
                        }
                        ch1 = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state3 = conn4.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                System.out.println("*********************1111111111111*****************");
                                this.nometprenom.setText(result3.getString("nom"));
                                this.nomadh = result3.getString("nom");
                                this.nomadhchequecheque.setText(this.nomadh);
                                this.nometattab.setText(this.nomadh);
                                System.out.println("*********************2222222222*****************");
                                this.nomd.setText(this.nomadh);
                                this.nometat.setText(this.nomadh);
                                this.nomadhK.setText(this.nomadh);
                                System.out.println("*********************333333333333333*****************");
                                this.matricule.setText(result3.getString("rib"));
                                this.numcompteadhK.setText(result3.getString("rib"));
                                System.out.println("*********************4444444444*****************");
                                this.cinetat.setText(result3.getString("cin"));
                                this.ncinddemande.setText(result3.getString("cin"));
                                this.delivd.setText(result3.getString("datecin"));
                                System.out.println("*********************55555555555555*****************");
                                String eta = result3.getString("etab");
                                System.out.println("*********************6666666666666666666*****************");
                                this.etabd.setText(eta);
                                this.idend.setText(result3.getString("cnr"));
                                this.cnretat.setText(result3.getString("cnr"));
                                this.matriculeetat.setText(result3.getString("cnr"));
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop34 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                            this.k = 0;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop35 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                        this.k = 0;
                    }
                }
                if (this.k == 1) {
                    JOptionPane jop = new JOptionPane();
                    int option = JOptionPane.showConfirmDialog(null, "Adherent " + this.nomadh + " / Montant= " + this.parmois + "DT Par Mois ( N\u00b0 :" + this.num + ")", "Attention", 0, 3);
                    if (option == 0) {
                        Impression1 s = new Impression1(this.jPanel4);
                        s.actionPerformed(evt);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            this.k = 1;
                            String p = "0";
                            state2.executeUpdate("INSERT INTO cessionattestation(NBM,annenbc,mois,date,Mecano,Nom,Montant,Nbmois,premiermois,derniermois,montantparmois,ncheque,pv) VALUES('" + this.num + "','" + aaa + "','" + dateS + "','" + datddd + "','" + this.mecano.getText() + "','" + this.nomadh + "','" + montglobale + "','" + nbm + "','" + moiddebut + "','" + moisfin + "','" + this.parmois + "','" + this.firstcheque + "','" + p + "')");
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                        }
                        if (this.k == 1) {
                            this.mecano.setText("");
                            this.mensualit\u00e9.setText("");
                            this.nbmois.setText("");
                            this.mat.setText("");
                            this.nometprenom.setText("................................");
                            this.matricule.setText("................................");
                            JOptionPane.showMessageDialog(null, "Attention : Impression De Demande ", "Information", 1);
                            Impression1 sd = new Impression1(this.jPanel5);
                            sd.actionPerformed(evt);
                            JOptionPane.showMessageDialog(null, "Attention :  Impression De L'etat ", "Information", 1);
                            Impression1 se = new Impression1(this.jPanel8);
                            se.actionPerformed(evt);
                            JOptionPane jop12 = new JOptionPane();
                            int option12 = JOptionPane.showConfirmDialog(null, "Attention :  Impression De LA TRAITE (\u0643\u0645\u0628\u064a\u0627\u0644\u0629) ", "Information", 0, 3);
                            if (option12 == 0) {
                                Impression1 s12 = new Impression1(this.jPanel11);
                                s12.actionPerformed(evt);
                            }
                            JOptionPane jop22 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Attention :  carnet de cheque N\u00b0:" + this.numcarnet + "  et N\u00b0 cheque :" + this.firstcheque + "", "Information", 1);
                            Impression1 s2 = new Impression1(this.cheque10);
                            s2.actionPerformed(evt);
                        }
                    }
                }
            }
        }
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment vider l'ecran?", "Quitter", 0, 3);
        if (option == 0) {
            this.mecano.setText("");
            this.mensualit\u00e9.setText("");
            this.nbmois.setText("");
            this.mat.setText("");
        }
    }

    private void matActionPerformed(ActionEvent evt) {
    }

    private void jTextField7ActionPerformed(ActionEvent evt) {
    }

    private void jTextField5ActionPerformed(ActionEvent evt) {
    }

    private void jTextField4ActionPerformed(ActionEvent evt) {
    }

    private void jTextField3ActionPerformed(ActionEvent evt) {
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField9ActionPerformed(ActionEvent evt) {
    }

    private void jTextField11ActionPerformed(ActionEvent evt) {
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        etatcession a = new etatcession();
        a.show();
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

