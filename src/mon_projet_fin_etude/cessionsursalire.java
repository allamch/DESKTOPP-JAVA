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
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.anciencessionfournisseure;
import mon_projet_fin_etude.etatcession;

public class cessionsursalire
extends JPanel {
    String nomadh = "";
    String ch = "";
    String mont = "";
    String r = "";
    int k = 1;
    int test = 0;
    private JLabel Adresse;
    private JLabel addrr;
    private JCheckBox cession;
    private JLabel chaquemois;
    private JLabel cin;
    private JLabel date1;
    private JLabel date2;
    private JLabel dateatt;
    private JLabel dateimpression;
    private JTextField diii;
    private JLabel direction;
    private JLabel etabmain;
    private JLabel ff;
    private JLabel globale1;
    private JLabel grade;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton5;
    private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel101;
    private JLabel jLabel102;
    private JLabel jLabel103;
    private JLabel jLabel104;
    private JLabel jLabel105;
    private JLabel jLabel107;
    private JLabel jLabel108;
    private JLabel jLabel109;
    private JLabel jLabel11;
    private JLabel jLabel110;
    private JLabel jLabel111;
    private JLabel jLabel112;
    private JLabel jLabel113;
    private JLabel jLabel114;
    private JLabel jLabel115;
    private JLabel jLabel116;
    private JLabel jLabel117;
    private JLabel jLabel118;
    private JLabel jLabel119;
    private JLabel jLabel12;
    private JLabel jLabel120;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel37;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel5;
    private JLabel jLabel54;
    private JLabel jLabel55;
    private JLabel jLabel56;
    private JLabel jLabel57;
    private JLabel jLabel6;
    private JLabel jLabel60;
    private JLabel jLabel61;
    private JLabel jLabel62;
    private JLabel jLabel63;
    private JLabel jLabel64;
    private JLabel jLabel65;
    private JLabel jLabel66;
    private JLabel jLabel67;
    private JLabel jLabel68;
    private JLabel jLabel69;
    private JLabel jLabel7;
    private JLabel jLabel70;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JSeparator jSeparator1;
    private JTextField jTextField5;
    private JPanel mainleveeee;
    private JCheckBox mainlev\u00e9e;
    private JTextField mat;
    private JTextField mat1;
    private JLabel matricule;
    private JLabel matriculemain;
    private JTextField mecano;
    private JLabel mecat;
    private JTextField mensualit\u00e9;
    private JCheckBox modification1;
    private JLabel montantglo;
    private JLabel nbbmois;
    private JTextField nbmois;
    private JLabel ncina;
    private JLabel nometprenom;
    private JLabel nometprenommain;
    private JLabel numr;
    private JLabel profession;
    private JLabel registre;
    private JLabel total;

    public cessionsursalire() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel3 = new JLabel();
        this.diii = new JTextField();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.nbmois = new JTextField();
        this.mensualit\u00e9 = new JTextField();
        this.jButton2 = new JButton();
        this.jButton1 = new JButton();
        this.jButton6 = new JButton();
        this.jLabel61 = new JLabel();
        this.mat = new JTextField();
        this.jLabel9 = new JLabel();
        this.mat1 = new JTextField();
        this.jPanel10 = new JPanel();
        this.cession = new JCheckBox();
        this.mainlev\u00e9e = new JCheckBox();
        this.jButton5 = new JButton();
        this.modification1 = new JCheckBox();
        this.jButton3 = new JButton();
        this.jSeparator1 = new JSeparator();
        this.jPanel4 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel8 = new JLabel();
        this.date2 = new JLabel();
        this.nometprenom = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel16 = new JLabel();
        this.addrr = new JLabel();
        this.ncina = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel20 = new JLabel();
        this.grade = new JLabel();
        this.matricule = new JLabel();
        this.jLabel23 = new JLabel();
        this.direction = new JLabel();
        this.jTextField5 = new JTextField();
        this.jLabel25 = new JLabel();
        this.jLabel27 = new JLabel();
        this.jLabel28 = new JLabel();
        this.jLabel30 = new JLabel();
        this.ff = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jLabel34 = new JLabel();
        this.nbbmois = new JLabel();
        this.jLabel37 = new JLabel();
        this.jLabel40 = new JLabel();
        this.chaquemois = new JLabel();
        this.jLabel54 = new JLabel();
        this.jLabel26 = new JLabel();
        this.jLabel55 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jLabel56 = new JLabel();
        this.jLabel57 = new JLabel();
        this.date1 = new JLabel();
        this.total = new JLabel();
        this.jLabel60 = new JLabel();
        this.jLabel62 = new JLabel();
        this.jLabel63 = new JLabel();
        this.jLabel64 = new JLabel();
        this.jLabel65 = new JLabel();
        this.jLabel66 = new JLabel();
        this.jLabel67 = new JLabel();
        this.jLabel68 = new JLabel();
        this.jLabel69 = new JLabel();
        this.jLabel70 = new JLabel();
        this.jPanel3 = new JPanel();
        this.mainleveeee = new JPanel();
        this.jLabel21 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jLabel101 = new JLabel();
        this.jLabel102 = new JLabel();
        this.jLabel103 = new JLabel();
        this.jLabel104 = new JLabel();
        this.jLabel105 = new JLabel();
        this.jLabel107 = new JLabel();
        this.jLabel108 = new JLabel();
        this.jLabel109 = new JLabel();
        this.nometprenommain = new JLabel();
        this.matriculemain = new JLabel();
        this.jLabel110 = new JLabel();
        this.jLabel111 = new JLabel();
        this.jLabel112 = new JLabel();
        this.jLabel113 = new JLabel();
        this.jLabel114 = new JLabel();
        this.dateatt = new JLabel();
        this.jLabel115 = new JLabel();
        this.mecat = new JLabel();
        this.globale1 = new JLabel();
        this.cin = new JLabel();
        this.Adresse = new JLabel();
        this.profession = new JLabel();
        this.numr = new JLabel();
        this.jLabel116 = new JLabel();
        this.dateimpression = new JLabel();
        this.jLabel117 = new JLabel();
        this.montantglo = new JLabel();
        this.jLabel118 = new JLabel();
        this.registre = new JLabel();
        this.jLabel119 = new JLabel();
        this.jLabel120 = new JLabel();
        this.etabmain = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 30));
        this.jLabel1.setForeground(new Color(51, 51, 255));
        this.jLabel1.setText("Cession Sur Salaire \"Fournisseur\" ");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(30, 0, 520, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Mecano :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(10, 130, 70, 20);
        this.mecano.setEnabled(false);
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.mecanoActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(80, 120, 160, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("Fournissure :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(10, 200, 90, 30);
        this.diii.setEnabled(false);
        this.diii.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.diiiActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.diii);
        this.diii.setBounds(80, 160, 160, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Montant :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(310, 120, 90, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("NB de mois :");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(310, 160, 90, 30);
        this.nbmois.setEnabled(false);
        this.nbmois.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.nbmoisActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.nbmois);
        this.nbmois.setBounds(400, 160, 160, 30);
        this.mensualit\u00e9.setEnabled(false);
        this.mensualit\u00e9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.mensualit\u00e9ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mensualit\u00e9);
        this.mensualit\u00e9.setBounds(400, 120, 160, 30);
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/cession/vcard-ajouter-icone-9305-32.png")));
        this.jButton2.setText("Ajouter ");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(290, 250, 130, 40);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(430, 250, 110, 40);
        this.jButton6.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton6.setText("vider");
        this.jButton6.setToolTipText("Quitter");
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.jButton6ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton6);
        this.jButton6.setBounds(190, 250, 90, 40);
        this.jLabel61.setFont(new Font("Tahoma", 1, 14));
        this.jLabel61.setText("Direction :");
        this.jPanel1.add(this.jLabel61);
        this.jLabel61.setBounds(10, 160, 70, 30);
        this.mat.setEnabled(false);
        this.mat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.matActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mat);
        this.mat.setBounds(110, 200, 130, 30);
        this.jLabel9.setFont(new Font("Tahoma", 1, 14));
        this.jLabel9.setText("1 er mois :");
        this.jPanel1.add(this.jLabel9);
        this.jLabel9.setBounds(320, 200, 90, 30);
        this.mat1.setEnabled(false);
        this.mat1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.mat1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mat1);
        this.mat1.setBounds(410, 200, 80, 30);
        this.jPanel10.setLayout(null);
        this.cession.setFont(new Font("Tahoma", 1, 12));
        this.cession.setForeground(new Color(0, 0, 204));
        this.cession.setText("Cession sur salire");
        this.jPanel10.add(this.cession);
        this.cession.setBounds(50, 0, 160, 40);
        this.mainlev\u00e9e.setFont(new Font("Tahoma", 1, 12));
        this.mainlev\u00e9e.setForeground(new Color(0, 0, 204));
        this.mainlev\u00e9e.setText("Main lev\u00e9e");
        this.jPanel10.add(this.mainlev\u00e9e);
        this.mainlev\u00e9e.setBounds(50, 40, 120, 30);
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.jButton5ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton5);
        this.jButton5.setBounds(530, 10, 40, 50);
        this.modification1.setFont(new Font("Tahoma", 1, 12));
        this.modification1.setForeground(new Color(0, 0, 204));
        this.modification1.setText("Demande de modification");
        this.jPanel10.add(this.modification1);
        this.modification1.setBounds(270, 10, 250, 30);
        this.jPanel1.add(this.jPanel10);
        this.jPanel10.setBounds(-10, 30, 590, 70);
        this.jButton3.setFont(new Font("Tahoma", 1, 12));
        this.jButton3.setText("Etat Cession");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(40, 250, 140, 40);
        this.jPanel1.add(this.jSeparator1);
        this.jSeparator1.setBounds(0, 102, 600, 10);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.jPanel4.setLayout(null);
        this.jLabel7.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/bgbg.PNG")));
        this.jPanel4.add(this.jLabel7);
        this.jLabel7.setBounds(50, 10, 500, 50);
        this.jLabel6.setFont(new Font("Tahoma", 1, 24));
        this.jLabel6.setText("Cession Sur Salaire");
        this.jPanel4.add(this.jLabel6);
        this.jLabel6.setBounds(160, 90, 230, 30);
        this.jLabel8.setFont(new Font("Tahoma", 0, 14));
        this.jLabel8.setText("Adresse  : ");
        this.jPanel4.add(this.jLabel8);
        this.jLabel8.setBounds(20, 200, 70, 30);
        this.date2.setFont(new Font("Tahoma", 1, 14));
        this.date2.setText("...................................");
        this.jPanel4.add(this.date2);
        this.date2.setBounds(330, 380, 180, 30);
        this.nometprenom.setFont(new Font("Tahoma", 1, 14));
        this.nometprenom.setText("....................................................................");
        this.jPanel4.add(this.nometprenom);
        this.nometprenom.setBounds(130, 140, 380, 30);
        this.jLabel11.setFont(new Font("Tahoma", 0, 14));
        this.jLabel11.setText("Nom et Pr\u00e9nom : ");
        this.jPanel4.add(this.jLabel11);
        this.jLabel11.setBounds(20, 140, 120, 30);
        this.jLabel12.setFont(new Font("Tahoma", 0, 14));
        this.jLabel12.setText("Grade : ");
        this.jPanel4.add(this.jLabel12);
        this.jLabel12.setBounds(280, 180, 80, 40);
        this.jLabel13.setText("M/F :34918/z");
        this.jPanel4.add(this.jLabel13);
        this.jLabel13.setBounds(20, 70, 80, 14);
        this.jLabel14.setText("Page N\u00b0 :");
        this.jPanel4.add(this.jLabel14);
        this.jLabel14.setBounds(400, 100, 70, 20);
        this.jLabel15.setText("Date :");
        this.jPanel4.add(this.jLabel15);
        this.jLabel15.setBounds(400, 60, 50, 20);
        this.jLabel16.setText("Registre N\u00b0 :");
        this.jPanel4.add(this.jLabel16);
        this.jLabel16.setBounds(400, 80, 70, 20);
        this.addrr.setFont(new Font("Tahoma", 1, 14));
        this.addrr.setText("......................................");
        this.jPanel4.add(this.addrr);
        this.addrr.setBounds(90, 210, 440, 17);
        this.ncina.setFont(new Font("Tahoma", 1, 14));
        this.ncina.setText("......................................");
        this.jPanel4.add(this.ncina);
        this.ncina.setBounds(340, 170, 190, 17);
        this.jLabel19.setFont(new Font("Tahoma", 0, 14));
        this.jLabel19.setText("Matricule : ");
        this.jPanel4.add(this.jLabel19);
        this.jLabel19.setBounds(20, 160, 80, 30);
        this.jLabel20.setFont(new Font("Tahoma", 0, 14));
        this.jLabel20.setText("N\u00b0 CIN : ");
        this.jPanel4.add(this.jLabel20);
        this.jLabel20.setBounds(280, 160, 80, 30);
        this.grade.setFont(new Font("Tahoma", 1, 14));
        this.grade.setText("......................................");
        this.jPanel4.add(this.grade);
        this.grade.setBounds(340, 190, 190, 20);
        this.matricule.setFont(new Font("Tahoma", 1, 14));
        this.matricule.setText("......................................");
        this.jPanel4.add(this.matricule);
        this.matricule.setBounds(90, 170, 160, 17);
        this.jLabel23.setFont(new Font("Tahoma", 0, 14));
        this.jLabel23.setText("Direction : ");
        this.jPanel4.add(this.jLabel23);
        this.jLabel23.setBounds(20, 180, 70, 30);
        this.direction.setFont(new Font("Tahoma", 1, 14));
        this.direction.setText("......................................");
        this.jPanel4.add(this.direction);
        this.direction.setBounds(90, 190, 160, 17);
        this.jPanel4.add(this.jTextField5);
        this.jTextField5.setBounds(260, 170, 6, 40);
        this.jLabel25.setFont(new Font("Tahoma", 0, 14));
        this.jLabel25.setText("Je soussign\u00e9 Mme ");
        this.jPanel4.add(this.jLabel25);
        this.jLabel25.setBounds(20, 120, 120, 30);
        this.jLabel27.setFont(new Font("Tahoma", 0, 14));
        this.jLabel27.setText("Faisant partie de la Direction");
        this.jPanel4.add(this.jLabel27);
        this.jLabel27.setBounds(20, 220, 190, 30);
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setText("Publique");
        this.jPanel4.add(this.jLabel28);
        this.jLabel28.setBounds(20, 280, 60, 30);
        this.jLabel30.setFont(new Font("Tahoma", 0, 14));
        this.jLabel30.setText("mois D'une somme totale de ");
        this.jPanel4.add(this.jLabel30);
        this.jLabel30.setBounds(190, 320, 180, 30);
        this.ff.setFont(new Font("Tahoma", 1, 14));
        this.ff.setText("....................");
        this.jPanel4.add(this.ff);
        this.ff.setBounds(400, 400, 140, 30);
        this.jLabel32.setFont(new Font("Tahoma", 0, 14));
        this.jLabel32.setText("Je m'engage d'autoriser ");
        this.jPanel4.add(this.jLabel32);
        this.jLabel32.setBounds(20, 260, 150, 30);
        this.jLabel33.setFont(new Font("Tahoma", 0, 14));
        this.jLabel33.setText("de virer d'une facon irr\u00e9vocable et irr\u00e9versible, la cession sur salaire le ");
        this.jPanel4.add(this.jLabel33);
        this.jLabel33.setBounds(80, 280, 460, 30);
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setText("Mr le Payeur d\u00e9partementale du minist\u00e9re de la Sant\u00e9");
        this.jPanel4.add(this.jLabel34);
        this.jLabel34.setBounds(170, 260, 370, 30);
        this.nbbmois.setFont(new Font("Tahoma", 1, 14));
        this.nbbmois.setText("............");
        this.jPanel4.add(this.nbbmois);
        this.nbbmois.setBounds(160, 320, 30, 30);
        this.jLabel37.setFont(new Font("Tahoma", 0, 14));
        this.jLabel37.setText("montant de");
        this.jPanel4.add(this.jLabel37);
        this.jLabel37.setBounds(20, 300, 80, 30);
        this.jLabel40.setFont(new Font("Tahoma", 0, 14));
        this.jLabel40.setText("au profit de :");
        this.jPanel4.add(this.jLabel40);
        this.jLabel40.setBounds(20, 340, 140, 30);
        this.chaquemois.setFont(new Font("Tahoma", 1, 14));
        this.chaquemois.setText(".............................................................................................................");
        this.jPanel4.add(this.chaquemois);
        this.chaquemois.setBounds(100, 300, 440, 30);
        this.jLabel54.setFont(new Font("Tahoma", 0, 14));
        this.jLabel54.setText("Signature du B\u00e9n\u00e9ficiaire");
        this.jPanel4.add(this.jLabel54);
        this.jLabel54.setBounds(340, 580, 170, 30);
        this.jLabel26.setFont(new Font("Tahoma", 1, 16));
        this.jLabel26.setText("Minist\u00e9re De La Sante Publique");
        this.jPanel4.add(this.jLabel26);
        this.jLabel26.setBounds(20, 240, 270, 30);
        this.jLabel55.setFont(new Font("Tahoma", 0, 14));
        this.jLabel55.setText("chaque mois pendant");
        this.jPanel4.add(this.jLabel55);
        this.jLabel55.setBounds(20, 320, 140, 30);
        this.jLabel29.setFont(new Font("Tahoma", 1, 16));
        this.jLabel29.setText("Centre Social De Mahdia");
        this.jPanel4.add(this.jLabel29);
        this.jLabel29.setBounds(20, 360, 220, 30);
        this.jLabel56.setFont(new Font("Tahoma", 1, 14));
        this.jLabel56.setText("Au");
        this.jPanel4.add(this.jLabel56);
        this.jLabel56.setBounds(300, 380, 30, 30);
        this.jLabel57.setFont(new Font("Tahoma", 1, 14));
        this.jLabel57.setText("BIAT Agence Mahdia                                RIB : 08501 00021 10 50813 4 77");
        this.jPanel4.add(this.jLabel57);
        this.jLabel57.setBounds(10, 540, 530, 30);
        this.date1.setFont(new Font("Tahoma", 1, 14));
        this.date1.setText("...................................");
        this.jPanel4.add(this.date1);
        this.date1.setBounds(140, 380, 150, 30);
        this.total.setFont(new Font("Tahoma", 1, 14));
        this.total.setText("....................");
        this.jPanel4.add(this.total);
        this.total.setBounds(370, 320, 150, 30);
        this.jLabel60.setFont(new Font("Tahoma", 0, 14));
        this.jLabel60.setText("Cite De La Mutuelle De la Sante BP 22 5111 Mahdia hiboun");
        this.jPanel4.add(this.jLabel60);
        this.jLabel60.setBounds(180, 490, 360, 30);
        this.jLabel62.setFont(new Font("Tahoma", 0, 14));
        this.jLabel62.setText("Correspondant au forfait choisi dans le cadre de la convention");
        this.jPanel4.add(this.jLabel62);
        this.jLabel62.setBounds(20, 400, 380, 30);
        this.jLabel63.setFont(new Font("Tahoma", 0, 14));
        this.jLabel63.setText("Renouvelable automatiquement sauf demande de main lev\u00e9e d\u00e9livr\u00e9e par le Centre");
        this.jPanel4.add(this.jLabel63);
        this.jLabel63.setBounds(20, 440, 510, 30);
        this.jLabel64.setFont(new Font("Tahoma", 1, 14));
        this.jLabel64.setText("Et ce a partir du ");
        this.jPanel4.add(this.jLabel64);
        this.jLabel64.setBounds(20, 380, 114, 30);
        this.jLabel65.setFont(new Font("Tahoma", 0, 14));
        this.jLabel65.setText("Social De Mahdia");
        this.jPanel4.add(this.jLabel65);
        this.jLabel65.setBounds(20, 460, 510, 30);
        this.jLabel66.setFont(new Font("Tahoma", 1, 14));
        this.jLabel66.setText("Adresse De La Mutuelle :");
        this.jPanel4.add(this.jLabel66);
        this.jLabel66.setBounds(10, 490, 170, 30);
        this.jLabel67.setFont(new Font("Tahoma", 1, 14));
        this.jLabel67.setText("Compte courant du Centre social de mahdia:");
        this.jPanel4.add(this.jLabel67);
        this.jLabel67.setBounds(10, 510, 340, 30);
        this.jLabel68.setFont(new Font("Tahoma", 0, 14));
        this.jLabel68.setText("avec le Centre Social De Mahdia.");
        this.jPanel4.add(this.jLabel68);
        this.jLabel68.setBounds(20, 420, 200, 30);
        this.jLabel69.setFont(new Font("Tahoma", 0, 14));
        this.jLabel69.setText("Cachet du Centre Social");
        this.jPanel4.add(this.jLabel69);
        this.jLabel69.setBounds(10, 580, 150, 30);
        this.jLabel70.setFont(new Font("Tahoma", 0, 14));
        this.jLabel70.setText("Le Tribunal");
        this.jPanel4.add(this.jLabel70);
        this.jLabel70.setBounds(230, 580, 80, 30);
        this.mainleveeee.setBackground(new Color(255, 255, 255));
        this.mainleveeee.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.mainleveeee.setLayout(null);
        this.jLabel21.setFont(new Font("Tahoma", 1, 20));
        this.jLabel21.setText("MAIN  LEVEE");
        this.jLabel21.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.mainleveeee.add(this.jLabel21);
        this.jLabel21.setBounds(200, 120, 140, 30);
        this.jLabel24.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/ENTET.PNG")));
        this.mainleveeee.add(this.jLabel24);
        this.jLabel24.setBounds(20, 10, 510, 52);
        this.jLabel101.setFont(new Font("Tahoma", 0, 14));
        this.jLabel101.setText("La pr\u00e9sidente du conseil d'administration de la Mutuelle de la Sant\u00e9 \"LA SOLIDARITE\"");
        this.mainleveeee.add(this.jLabel101);
        this.jLabel101.setBounds(10, 220, 530, 30);
        this.jLabel102.setFont(new Font("Tahoma", 0, 14));
        this.jLabel102.setText("d\u00e9clare certifie avoir re\u00e7ue toutes les garanties de la Main Lev\u00e9e");
        this.mainleveeee.add(this.jLabel102);
        this.jLabel102.setBounds(10, 260, 410, 20);
        this.jLabel103.setFont(new Font("Tahoma", 0, 14));
        this.jLabel103.setText("Demeurant \u00e0 :");
        this.mainleveeee.add(this.jLabel103);
        this.jLabel103.setBounds(10, 350, 100, 20);
        this.jLabel104.setFont(new Font("Tahoma", 0, 14));
        this.jLabel104.setText("A Monsieur / Madame:");
        this.mainleveeee.add(this.jLabel104);
        this.jLabel104.setBounds(10, 290, 140, 17);
        this.jLabel105.setFont(new Font("Tahoma", 0, 14));
        this.jLabel105.setText("Titulaire de carte d'identit\u00e9 n\u00b0:");
        this.mainleveeee.add(this.jLabel105);
        this.jLabel105.setBounds(10, 310, 190, 20);
        this.jLabel107.setFont(new Font("Tahoma", 0, 14));
        this.jLabel107.setText("Mecano :");
        this.mainleveeee.add(this.jLabel107);
        this.jLabel107.setBounds(370, 310, 60, 30);
        this.jLabel108.setFont(new Font("Tahoma", 0, 14));
        this.jLabel108.setText("Registre n\u00b0 :");
        this.mainleveeee.add(this.jLabel108);
        this.jLabel108.setBounds(330, 440, 80, 20);
        this.jLabel109.setFont(new Font("Tahoma", 0, 14));
        this.jLabel109.setText("Montant :");
        this.mainleveeee.add(this.jLabel109);
        this.jLabel109.setBounds(10, 390, 70, 20);
        this.nometprenommain.setFont(new Font("Tahoma", 1, 14));
        this.nometprenommain.setText("...............................................................");
        this.mainleveeee.add(this.nometprenommain);
        this.nometprenommain.setBounds(150, 290, 260, 20);
        this.matriculemain.setFont(new Font("Tahoma", 1, 14));
        this.matriculemain.setText("..............................");
        this.mainleveeee.add(this.matriculemain);
        this.matriculemain.setBounds(80, 330, 200, 20);
        this.jLabel110.setFont(new Font("Tahoma", 0, 14));
        this.jLabel110.setText("Dr / Le Service pr\u00e9t");
        this.mainleveeee.add(this.jLabel110);
        this.jLabel110.setBounds(350, 540, 140, 20);
        this.jLabel111.setFont(new Font("Tahoma", 0, 14));
        this.jLabel111.setText("et d'informer les services comp\u00e9tents du Minist\u00e9re de la Sant\u00e9 pour ex\u00e9cution .");
        this.mainleveeee.add(this.jLabel111);
        this.jLabel111.setBounds(10, 480, 530, 20);
        this.jLabel112.setFont(new Font("Tahoma", 0, 14));
        this.jLabel112.setText("Matricule :");
        this.mainleveeee.add(this.jLabel112);
        this.jLabel112.setBounds(10, 330, 70, 20);
        this.jLabel113.setFont(new Font("Tahoma", 0, 14));
        this.jLabel113.setText("Profession :");
        this.mainleveeee.add(this.jLabel113);
        this.jLabel113.setBounds(320, 370, 71, 20);
        this.jLabel114.setFont(new Font("Tahoma", 0, 14));
        this.jLabel114.setText("dont le si\u00e9ge social est \u00e0 TUNIS 7, Rue de Pologne -Bab Sadoun Tunis 1005 ");
        this.mainleveeee.add(this.jLabel114);
        this.jLabel114.setBounds(10, 240, 510, 30);
        this.dateatt.setFont(new Font("Tahoma", 1, 12));
        this.dateatt.setText("..................");
        this.mainleveeee.add(this.dateatt);
        this.dateatt.setBounds(130, 70, 140, 15);
        this.jLabel115.setFont(new Font("Tahoma", 0, 14));
        this.jLabel115.setText("Mahdia le :");
        this.mainleveeee.add(this.jLabel115);
        this.jLabel115.setBounds(50, 60, 70, 30);
        this.mecat.setFont(new Font("Tahoma", 1, 14));
        this.mecat.setText("............");
        this.mainleveeee.add(this.mecat);
        this.mecat.setBounds(430, 310, 90, 30);
        this.globale1.setFont(new Font("Tahoma", 1, 14));
        this.globale1.setText("............");
        this.mainleveeee.add(this.globale1);
        this.globale1.setBounds(80, 390, 450, 20);
        this.cin.setFont(new Font("Tahoma", 1, 14));
        this.cin.setText("............");
        this.mainleveeee.add(this.cin);
        this.cin.setBounds(200, 310, 170, 17);
        this.Adresse.setFont(new Font("Tahoma", 1, 14));
        this.Adresse.setText("......................");
        this.mainleveeee.add(this.Adresse);
        this.Adresse.setBounds(110, 350, 420, 20);
        this.profession.setFont(new Font("Tahoma", 1, 14));
        this.profession.setText("...............................................");
        this.mainleveeee.add(this.profession);
        this.profession.setBounds(400, 370, 140, 17);
        this.numr.setFont(new Font("Tahoma", 1, 14));
        this.numr.setText("............");
        this.mainleveeee.add(this.numr);
        this.numr.setBounds(410, 440, 120, 20);
        this.jLabel116.setFont(new Font("Tahoma", 0, 14));
        this.jLabel116.setText("Pour solder la cession sur salaire ");
        this.mainleveeee.add(this.jLabel116);
        this.jLabel116.setBounds(10, 410, 197, 20);
        this.dateimpression.setFont(new Font("Tahoma", 1, 14));
        this.dateimpression.setText("............");
        this.mainleveeee.add(this.dateimpression);
        this.dateimpression.setBounds(130, 440, 190, 20);
        this.jLabel117.setFont(new Font("Tahoma", 0, 14));
        this.jLabel117.setText("Etablisement :");
        this.mainleveeee.add(this.jLabel117);
        this.jLabel117.setBounds(10, 370, 90, 20);
        this.montantglo.setFont(new Font("Tahoma", 1, 14));
        this.montantglo.setText("............");
        this.mainleveeee.add(this.montantglo);
        this.montantglo.setBounds(210, 410, 110, 20);
        this.jLabel118.setFont(new Font("Tahoma", 0, 14));
        this.jLabel118.setText("qui \u00e9t\u00e9 effectu\u00e9e le");
        this.mainleveeee.add(this.jLabel118);
        this.jLabel118.setBounds(10, 440, 120, 20);
        this.registre.setFont(new Font("Tahoma", 1, 14));
        this.registre.setText("......................");
        this.mainleveeee.add(this.registre);
        this.registre.setBounds(410, 410, 120, 20);
        this.jLabel119.setFont(new Font("Tahoma", 0, 14));
        this.jLabel119.setText("Mr le greffier du TRIBUNAL CANTONAL DE MAHDIA est pri\u00e9 d'accepter ce Main Lev\u00e9e");
        this.mainleveeee.add(this.jLabel119);
        this.jLabel119.setBounds(10, 460, 530, 20);
        this.jLabel120.setFont(new Font("Tahoma", 0, 14));
        this.jLabel120.setText("sous n\u00b0 :");
        this.mainleveeee.add(this.jLabel120);
        this.jLabel120.setBounds(330, 410, 60, 20);
        this.etabmain.setFont(new Font("Tahoma", 1, 14));
        this.etabmain.setText("............");
        this.mainleveeee.add(this.etabmain);
        this.etabmain.setBounds(100, 370, 190, 20);
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 580, 32767).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.mainleveeee, -2, 546, -2).addContainerGap(24, 32767))));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 636, 32767).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.mainleveeee, -2, 614, -2).addContainerGap())));
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.jPanel4, -2, 551, -2)).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 580, -2).addComponent(this.jPanel3, -1, -1, 32767)))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, 299, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel4, -2, 625, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel3, -1, -1, 32767).addContainerGap()));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, 583, -2).addContainerGap(20, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -1, 521, 32767).addContainerGap()));
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void diiiActionPerformed(ActionEvent evt) {
    }

    private void nbmoisActionPerformed(ActionEvent evt) {
    }

    private void mensualit\u00e9ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String datdd;
        boolean g;
        int aaa;
        String jours;
        SimpleDateFormat dateFormatt;
        String ann\u00e9es;
        JOptionPane jop2;
        Date actuellEe;
        String mois2;
        int j;
        if (this.test == 1) {
            this.k = 1;
            boolean bl = g = this.mecano.getText().equals("") || this.mensualit\u00e9.getText().equals("") || this.diii.getText().equals("") || this.nbmois.getText().equals("") || this.mat.getText().equals("");
            if (g) {
                this.k = 0;
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
            } else if (this.mensualit\u00e9.getText().length() < 4) {
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Montant Incorrecte", "Attention", 0);
                this.k = 0;
            }
            if (this.k == 1) {
                String datedebut;
                String datefin;
                String dateS;
                int nbm;
                actuellEe = new Date();
                dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
                datdd = dateFormatt.format(actuellEe);
                jours = datdd.substring(0, datdd.length() - 8);
                System.out.println("jours =" + jours);
                j = Integer.parseInt(jours);
                mois2 = datdd.substring(3, datdd.length() - 5);
                ann\u00e9es = datdd.substring(6, datdd.length());
                System.out.println("mois =" + mois2);
                System.out.println("ann\u00e9es =" + ann\u00e9es);
                int moiaci = Integer.parseInt(mois2);
                System.out.println("mois 1 =" + moiaci);
                dateS = mois2 + "/" + ann\u00e9es;
                boolean kl = false;
                if (this.mat1.getText().equals("")) {
                    kl = true;
                    System.out.println("****************************");
                } else {
                    kl = false;
                    moiaci = Integer.parseInt(this.mat1.getText());
                    System.out.println("mois 2  = " + moiaci);
                }
                if (kl && j > 5) {
                    moiaci = moiaci + 1 < 13 ? ++moiaci : 1;
                }
                int moisresu = Integer.parseInt(this.nbmois.getText());
                int aa = Integer.parseInt(ann\u00e9es);
                int kk = moiaci + moisresu;
                aaa = aa;
                while (kk > 12) {
                    kk -= 12;
                    ++aaa;
                }
                datedebut = "";
                System.out.println("mois debut  =" + moiaci);
                switch (moiaci) {
                    case 1: {
                        datedebut = "Janvier  " + aa;
                        break;
                    }
                    case 2: {
                        datedebut = "F\u00e9vrier  " + aa;
                        break;
                    }
                    case 3: {
                        datedebut = "Mars  " + aa;
                        break;
                    }
                    case 4: {
                        datedebut = "Avril  " + aa;
                        break;
                    }
                    case 5: {
                        datedebut = "Mai  " + aa;
                        break;
                    }
                    case 6: {
                        datedebut = "Juin  " + aa;
                        break;
                    }
                    case 7: {
                        datedebut = "Juillet  " + aa;
                        break;
                    }
                    case 8: {
                        datedebut = "Ao\u00fbt  " + aa;
                        break;
                    }
                    case 9: {
                        datedebut = "Septembre  " + aa;
                        break;
                    }
                    case 10: {
                        datedebut = "Octobre  " + aa;
                        break;
                    }
                    case 11: {
                        datedebut = "Novembre  " + aa;
                        break;
                    }
                    case 12: {
                        datedebut = "D\u00e9cembre  " + aa;
                        break;
                    }
                    default: {
                        datedebut = "";
                    }
                }
                this.date1.setText(datedebut);
                if (kk == 1) {
                    kk = 12;
                    --aaa;
                } else {
                    --kk;
                }
                datefin = "";
                switch (kk) {
                    case 1: {
                        datefin = "Janvier  " + aaa;
                        break;
                    }
                    case 2: {
                        datefin = "F\u00e9vrier  " + aaa;
                        break;
                    }
                    case 3: {
                        datefin = "Mars  " + aaa;
                        break;
                    }
                    case 4: {
                        datefin = "Avril  " + aaa;
                        break;
                    }
                    case 5: {
                        datefin = "Mai  " + aaa;
                        break;
                    }
                    case 6: {
                        datefin = "Juin  " + aaa;
                        break;
                    }
                    case 7: {
                        datefin = "Juillet  " + aaa;
                        break;
                    }
                    case 8: {
                        datefin = "Ao\u00fbt  " + aaa;
                        break;
                    }
                    case 9: {
                        datefin = "Septembre  " + aaa;
                        break;
                    }
                    case 10: {
                        datefin = "Octobre  " + aaa;
                        break;
                    }
                    case 11: {
                        datefin = "Novembre  " + aaa;
                        break;
                    }
                    case 12: {
                        datefin = "D\u00e9cembre  " + aaa;
                        break;
                    }
                    default: {
                        datefin = "";
                    }
                }
                this.date2.setText(datefin);
                this.direction.setText(this.diii.getText());
                this.nbbmois.setText(this.nbmois.getText());
                String mec = this.mecano.getText();
                String ch1 = "";
                nbm = Integer.parseInt(this.nbmois.getText());
                int montparmoi = Integer.parseInt(this.mensualit\u00e9.getText());
                int somme = montparmoi / nbm;
                String ss = "" + montparmoi + "";
                int tt = ss.length() - 3;
                String dii = ss.substring(0, ss.length() - 3);
                String miil = ss.substring(tt, ss.length());
                this.ch = "( " + dii + "," + miil + " DT )";
                this.total.setText("( " + dii + "," + miil + " DT )");
                String mmontant = "" + somme + "";
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
                    Logger.getLogger(cessionsursalire.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.chaquemois.setText(adi + " (" + this.mont + " )");
                try {
                    JOptionPane jop3;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT MECANO  FROM  adherent WHERE MECANO=" + mec);
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas (N dossier) ", "Information", 1);
                        this.k = 0;
                    } else {
                        ch1 = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state3 = conn2.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                this.nometprenom.setText(result3.getString("NOM"));
                                this.nomadh = result3.getString("NOM");
                                this.matricule.setText(result3.getString("NCNR"));
                                this.ncina.setText(result3.getString("CIN"));
                                this.addrr.setText(result3.getString("ADRES"));
                                this.grade.setText(result3.getString("TRVAIL"));
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                            this.k = 0;
                        }
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state7 = conn2.createStatement();
                        ResultSet result7 = state7.executeQuery("SELECT * FROM ffournis  WHERE MATRIC=" + this.mat.getText());
                        ResultSetMetaData resultMeta7 = result7.getMetaData();
                        while (result7.next()) {
                            this.ff.setText(result7.getString("NOMSOC"));
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur  info fourisseure!!: " + e.getMessage());
                        this.k = 0;
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                    this.k = 0;
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    this.k = 1;
                    String p = "0";
                    state2.executeUpdate("INSERT INTO cessionfournisseur(mois,date,Mecano,Nom,Montant,Nbmois,premiermois,derniermois,montantparmois,pv,Matricule) VALUES('" + dateS + "','" + datdd + "','" + this.mecano.getText() + "','" + this.nomadh + "','" + this.mensualit\u00e9.getText() + "','" + nbm + "','" + datedebut + "','" + datefin + "','" + this.mont + "','" + p + "','" + this.mat.getText() + "')");
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                }
                if (this.k == 1) {
                    JOptionPane jop = new JOptionPane();
                    int option = JOptionPane.showConfirmDialog(null, "Adherent " + this.nomadh + " / Montant= " + this.mont + "DT Par Mois", "Quitter", 0, 3);
                    if (option == 0) {
                        JOptionPane jop1 = new JOptionPane();
                        Impression1 s = new Impression1(this.jPanel4);
                        s.actionPerformed(evt);
                    }
                }
            }
        }
        if (this.test == 2) {
            this.k = 1;
            boolean bl = g = this.mecano.getText().equals("") || this.mensualit\u00e9.getText().equals("") || this.diii.getText().equals("") || this.nbmois.getText().equals("") || this.mat.getText().equals("");
            if (g) {
                this.k = 0;
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
            } else if (this.mensualit\u00e9.getText().length() < 4) {
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Montant Incorrecte", "Attention", 0);
                this.k = 0;
            }
            if (this.k == 1) {
                block155 : {
                    int aa;
                    actuellEe = new Date();
                    dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
                    datdd = dateFormatt.format(actuellEe);
                    jours = datdd.substring(0, datdd.length() - 8);
                    System.out.println("jours =" + jours);
                    j = Integer.parseInt(jours);
                    mois2 = datdd.substring(3, datdd.length() - 5);
                    ann\u00e9es = datdd.substring(6, datdd.length());
                    System.out.println("mois =" + mois2);
                    int ms = Integer.parseInt(mois2);
                    System.out.println("ann\u00e9es =" + ann\u00e9es);
                    int moiaci = Integer.parseInt(mois2);
                    System.out.println("mois 1 =" + moiaci);
                    String dateS = mois2 + "/" + ann\u00e9es;
                    boolean kl = false;
                    if (this.mat1.getText().equals("")) {
                        kl = true;
                        System.out.println("****************************");
                    } else {
                        kl = false;
                        moiaci = Integer.parseInt(this.mat1.getText());
                    }
                    if (kl && j > 5) {
                        moiaci = moiaci + 1 < 13 ? ++moiaci : 1;
                    }
                    int moisresu = Integer.parseInt(this.nbmois.getText());
                    aaa = aa = Integer.parseInt(ann\u00e9es);
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
                    String datedebut = "";
                    switch (moiaci) {
                        case 1: {
                            datedebut = "Janvier  " + aa;
                            break;
                        }
                        case 2: {
                            datedebut = "F\u00e9vrier  " + aa;
                            break;
                        }
                        case 3: {
                            datedebut = "Mars  " + aa;
                            break;
                        }
                        case 4: {
                            datedebut = "Avril  " + aa;
                            break;
                        }
                        case 5: {
                            datedebut = "Mai  " + aa;
                            break;
                        }
                        case 6: {
                            datedebut = "Juin  " + aa;
                            break;
                        }
                        case 7: {
                            datedebut = "Juillet  " + aa;
                            break;
                        }
                        case 8: {
                            datedebut = "Ao\u00fbt  " + aa;
                            break;
                        }
                        case 9: {
                            datedebut = "Septembre  " + aa;
                            break;
                        }
                        case 10: {
                            datedebut = "Octobre  " + aa;
                            break;
                        }
                        case 11: {
                            datedebut = "Novembre  " + aa;
                            break;
                        }
                        case 12: {
                            datedebut = "D\u00e9cembre  " + aa;
                            break;
                        }
                        default: {
                            datedebut = "";
                        }
                    }
                    this.date1.setText(datedebut);
                    if (kk == 1) {
                        kk = 12;
                        --aaa;
                    } else {
                        --kk;
                    }
                    String datefin = "";
                    System.out.println("-----------------------------");
                    System.out.println("anne dernier = " + aaa);
                    System.out.println("kk = " + kk);
                    switch (kk) {
                        case 1: {
                            datefin = "Janvier  " + aaa;
                            break;
                        }
                        case 2: {
                            datefin = "F\u00e9vrier  " + aaa;
                            break;
                        }
                        case 3: {
                            datefin = "Mars  " + aaa;
                            break;
                        }
                        case 4: {
                            datefin = "Avril  " + aaa;
                            break;
                        }
                        case 5: {
                            datefin = "Mai  " + aaa;
                            break;
                        }
                        case 6: {
                            datefin = "Juin  " + aaa;
                            break;
                        }
                        case 7: {
                            datefin = "Juillet  " + aaa;
                            break;
                        }
                        case 8: {
                            datefin = "Ao\u00fbt  " + aaa;
                            break;
                        }
                        case 9: {
                            datefin = "Septembre  " + aaa;
                            break;
                        }
                        case 10: {
                            datefin = "Octobre  " + aaa;
                            break;
                        }
                        case 11: {
                            datefin = "Novembre  " + aaa;
                            break;
                        }
                        case 12: {
                            datefin = "D\u00e9cembre  " + aaa;
                            break;
                        }
                        default: {
                            datefin = "";
                        }
                    }
                    this.date2.setText(datefin);
                    this.direction.setText(this.diii.getText());
                    this.nbbmois.setText(this.nbmois.getText());
                    String mec = this.mecano.getText();
                    String ch1 = "";
                    int nbm = Integer.parseInt(this.nbmois.getText());
                    int montparmoi = Integer.parseInt(this.mensualit\u00e9.getText());
                    int somme = montparmoi / nbm;
                    String ss = "" + montparmoi + "";
                    int tt = ss.length() - 3;
                    String dii = ss.substring(0, ss.length() - 3);
                    String miil = ss.substring(tt, ss.length());
                    this.ch = "( " + dii + "," + miil + " DT )";
                    this.total.setText("( " + dii + "," + miil + " DT )");
                    String mmontant = "" + somme + "";
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
                        Logger.getLogger(cessionsursalire.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.chaquemois.setText(adi + " (" + this.mont + " )");
                    try {
                        JOptionPane jop3;
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state = conn3.createStatement();
                        ResultSet result = state.executeQuery("SELECT MECANO  FROM  adherent WHERE MECANO=" + mec);
                        ResultSetMetaData resultMeta = result.getMetaData();
                        while (result.next()) {
                            for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                                ch1 = result.getObject(i).toString();
                            }
                        }
                        if (ch1.equals("")) {
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Adheron n'existe pas (N dossier) ", "Information", 1);
                            this.k = 0;
                        } else if (this.k == 1) {
                            ch1 = "";
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement state3 = conn3.createStatement();
                                ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                                ResultSetMetaData resultMeta3 = result3.getMetaData();
                                while (result3.next()) {
                                    this.nometprenom.setText(result3.getString("NOM"));
                                    this.nomadh = result3.getString("NOM");
                                    this.matricule.setText(result3.getString("NCNR"));
                                    this.ncina.setText(result3.getString("CIN"));
                                    this.addrr.setText(result3.getString("ADRES"));
                                    this.grade.setText(result3.getString("TRVAIL"));
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                                this.k = 0;
                            }
                        }
                        if (this.k != 1) break block155;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state7 = conn3.createStatement();
                            ResultSet result7 = state7.executeQuery("SELECT * FROM ffournis  WHERE MATRIC=" + this.mat.getText());
                            ResultSetMetaData resultMeta7 = result7.getMetaData();
                            while (result7.next()) {
                                this.ff.setText(result7.getString("NOMSOC"));
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur  info fourisseure!!: " + e.getMessage());
                            this.k = 0;
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            this.k = 1;
                            String p = "0";
                            state2.executeUpdate("INSERT INTO cessionfournisseur(mois,date,Mecano,Nom,Montant,Nbmois,premiermois,derniermois,montantparmois,pv,Matricule) VALUES('" + dateS + "','" + datdd + "','" + this.mecano.getText() + "','" + this.nomadh + "','" + this.mensualit\u00e9.getText() + "','" + nbm + "','" + datedebut + "','" + datefin + "','" + this.mont + "','" + p + "','" + this.mat.getText() + "')");
                        }
                        catch (Exception e) {
                            this.k = 0;
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                        this.k = 0;
                    }
                }
                if (this.k == 1) {
                    JOptionPane jop = new JOptionPane();
                    int option = JOptionPane.showConfirmDialog(null, "Adherent " + this.nomadh + " / Montant= " + this.mont + "DT Par Mois", "Quitter", 0, 3);
                    if (option == 0) {
                        JOptionPane jop1 = new JOptionPane();
                        Impression1 s = new Impression1(this.jPanel4);
                        s.actionPerformed(evt);
                    }
                }
            }
        }
        if (this.test == 3) {
            Date actuellEed = new Date();
            SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
            String datddd = dateFormattd.format(actuellEed);
            SimpleDateFormat dateactuelle = new SimpleDateFormat("yyyyMM");
            this.dateatt.setText(datddd);
            String dat = dateactuelle.format(actuellEed);
            String moisactuel = dat.substring(dat.length() - 2, dat.length());
            String anneactuel = dat.substring(0, dat.length() - 2);
            System.out.println("mois actuelle :" + moisactuel + "--");
            System.out.println("anne actuelle :" + anneactuel + "--");
            boolean g2 = this.mecano.getText().equals("");
            if (g2) {
                JOptionPane jop22 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Saisire le Mecano ", "Attention", 0);
            } else {
                this.mecat.setText(this.mecano.getText());
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                    ResultSetMetaData resultMeta2 = result2.getMetaData();
                    while (result2.next()) {
                        this.nometprenommain.setText(result2.getString("NOM"));
                        this.matriculemain.setText(result2.getString("NCNR"));
                        this.cin.setText(result2.getString("CIN"));
                        this.Adresse.setText(result2.getString("ADRES"));
                        this.profession.setText(result2.getString("TRVAIL"));
                        this.etabmain.setText(result2.getString("etab"));
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                }
                int moisa = 0;
                int aneact = 0;
                int moisf = 0;
                int anef = 0;
                int nbdemois = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn4.createStatement();
                    ResultSet result3 = state.executeQuery("SELECT * FROM cessionfournisseur  WHERE Mecano='" + this.mecano.getText() + "'");
                    String mm = null;
                    String annedenier = null;
                    String moiddebut = "";
                    String derniermois = null;
                    String montantparsmois = "";
                    int jj = -1;
                    while (result3.next()) {
                        System.out.println("-------------------------------------------------");
                        String nn = result3.getString("ref");
                        System.out.println("ref =" + nn);
                        String nr = this.diii.getText();
                        System.out.println("nr" + nr);
                        jj = nn.indexOf(nr);
                        System.out.println("jj" + jj);
                        if (jj <= -1) continue;
                        derniermois = result3.getString("derniermois");
                        montantparsmois = result3.getString("montantparmois");
                        String montantglobale = result3.getString("Montant");
                        montantglobale = montantglobale.substring(0, montantglobale.length() - 3);
                        this.montantglo.setText(montantglobale + ",000");
                        System.out.println("montant globale ******** " + montantglobale + ",000");
                        System.out.println("---------------------------");
                        this.r = result3.getString("ref");
                        System.out.println("-----Reference :----------" + this.r);
                        String rr = this.r.substring(0, this.r.length() - 3);
                        String num = this.r.substring(this.r.length() - 2, this.r.length());
                        System.out.println("Registre ******** " + rr + " --");
                        System.out.println("Num registre ****** " + num + " --");
                        this.registre.setText(rr);
                        this.numr.setText(num);
                        this.dateimpression.setText(result3.getString("date"));
                    }
                    if (jj > -1) {
                        int nb;
                        String montant = montantparsmois.substring(0, montantparsmois.length() - 4);
                        int m = Integer.parseInt(montant);
                        String moisdenier = derniermois.substring(0, derniermois.length() - 6);
                        annedenier = derniermois.substring(derniermois.length() - 4, derniermois.length());
                        System.out.println("***************" + moisdenier + "--");
                        System.out.println("***************" + annedenier + "--");
                        if (moisdenier.equals("Janvier")) {
                            mm = "01";
                        } else if (moisdenier.equals("F\u00e9vrier")) {
                            mm = "02";
                        } else if (moisdenier.equals("Mars")) {
                            mm = "03";
                        } else if (moisdenier.equals("Avril")) {
                            mm = "04";
                        } else if (moisdenier.equals("Mai")) {
                            mm = "03";
                        } else if (moisdenier.equals("Juin")) {
                            mm = "06";
                        } else if (moisdenier.equals("Juillet")) {
                            mm = "07";
                        } else if (moisdenier.equals("Ao\u00fbt")) {
                            mm = "08";
                        } else if (moisdenier.equals("Septembre")) {
                            mm = "09";
                        } else if (moisdenier.equals("Octobre")) {
                            mm = "10";
                        } else if (moisdenier.equals("Novembre")) {
                            mm = "11";
                        } else if (moisdenier.equals("D\u00e9cembre")) {
                            mm = "12";
                        } else {
                            mm = "0";
                            moisdenier.equals("Erreure");
                        }
                        moisa = Integer.parseInt(moisactuel);
                        aneact = Integer.parseInt(anneactuel);
                        System.out.println("***************");
                        moisf = Integer.parseInt(mm);
                        anef = Integer.parseInt(annedenier);
                        System.out.println("***************" + moisf + "--");
                        System.out.println("***************" + anef + "--");
                        mm = annedenier + mm;
                        System.out.println("***************" + mm + "--");
                        System.out.println("***************" + dat + "--");
                        int a = anef - aneact;
                        if (a >= 1) {
                            nb = 12 - moisa;
                            nbdemois = moisf;
                            System.out.println("********nbdemois*******" + nbdemois);
                        } else {
                            nb = moisf - moisa;
                        }
                        System.out.println("********nb*******" + nb);
                        nbdemois += nb;
                        nbdemois = 5;
                        System.out.println("********nombre de mois = " + nbdemois);
                        int montantglobalee = nbdemois * m;
                        System.out.println("********Montant par mois = " + m);
                        System.out.println("********Montant globale = " + montantglobalee);
                        System.out.println("********Montant de main lev\u00e9e *******" + montantglobalee);
                        String adi = Nombre.CALCULATE.getValue(montantglobalee, " Dinars ");
                        this.globale1.setText("" + montantglobalee + ",000(" + adi.toUpperCase() + ")");
                        JOptionPane.showMessageDialog(null, "Attention : Impression De Main lev\u00e9e ", "Information", 1);
                        Impression1 sd = new Impression1(this.mainleveeee);
                        sd.actionPerformed(evt);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            String p = "2";
                            state2.executeUpdate("UPDATE  cessionfournisseur SET pv='" + p + "' WHERE MECANO='" + this.mecano.getText() + "'AND ref='" + this.r + "'");
                        }
                        catch (Exception e) {
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout le main lev\u00e9e a l'etat : " + e.getMessage());
                        }
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur: cession n'existe pas " + e.getMessage());
                }
            }
        }
        this.mecano.setText("");
        this.mensualit\u00e9.setText("");
        this.diii.setText("");
        this.nbmois.setText("");
        this.mat.setText("");
        this.nometprenom.setText("................................");
        this.matricule.setText("................................");
        this.direction.setText("................................");
        this.ncina.setText("................................");
        this.grade.setText("................................");
        this.addrr.setText("..................................................");
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment vider l'ecran?", "Quitter", 0, 3);
        if (option == 0) {
            this.mecano.setText("");
            this.mensualit\u00e9.setText("");
            this.diii.setText("");
            this.nbmois.setText("");
            this.mat.setText("");
            this.nometprenom.setText("................................");
            this.matricule.setText("................................");
            this.direction.setText("................................");
            this.ncina.setText("................................");
            this.grade.setText("................................");
            this.addrr.setText("..................................................");
        }
    }

    private void matActionPerformed(ActionEvent evt) {
    }

    private void mat1ActionPerformed(ActionEvent evt) {
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        boolean k = false;
        if (this.cession.isSelected() && this.mainlev\u00e9e.isSelected()) {
            this.test = 1;
            k = true;
            this.jLabel61.setText("Direction :");
            this.mecano.enable(true);
            this.mensualit\u00e9.enable(true);
            this.nbmois.enable(true);
            this.diii.enable(true);
            this.mat.enable(true);
            this.mat1.enable(true);
        } else if (this.cession.isSelected()) {
            this.test = 2;
            this.jLabel61.setText("Direction :");
            this.mecano.enable(true);
            this.mensualit\u00e9.enable(true);
            this.nbmois.enable(true);
            this.diii.enable(true);
            this.mat.enable(true);
            this.mat1.enable(true);
            this.jButton1.enable(true);
        } else if (this.mainlev\u00e9e.isSelected()) {
            this.test = 3;
            this.jLabel61.setText("Page N\u00b0:");
            this.mecano.enable(true);
            this.mensualit\u00e9.enable(false);
            this.nbmois.enable(false);
            this.diii.enable(true);
            this.mat.enable(false);
            this.jButton1.enable(true);
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        etatcession a = new etatcession();
        a.show();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        anciencessionfournisseure a = new anciencessionfournisseure();
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

