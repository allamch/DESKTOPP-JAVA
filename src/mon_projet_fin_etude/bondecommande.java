/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.bna;
import mon_projet_fin_etude.recherchecarnedecheque;

public class bondecommande
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    String matt = "";
    String datedeb="";
    String datefin="";  
    String datepayement="";
    String montpmois="";
    String etat ="0";
    int Ref = 0;
    String TypePaie = "";
    String NumeroPaie = "";
    int years; 
    int lastmonth;
    int yearfin;
    String typetranche="Bon Commande";
    int Ac = 0;
    int Md = 0;
    int Mb = 0;
    int k = 0;
    int kk = 0;
    int anedebut = 0;
    String type = "";
    private JRadioButton CH;
    private JRadioButton CS;
    private JPanel INFO;
    private JLabel MOIS;
    private JRadioButton VR;
    private JLabel aabc;
    private JRadioButton acc;
    private JTextField accompte;
    private JLabel bq;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JTextField codebc;
    private JLabel dt;
    private JRadioButton esp;
    private JRadioButton g2;
    private JButton jButton1;
    private JButton jButton2;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel2;
    private JLabel jLabel25;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel38;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabelref;
    private JLabel jLabelreg;
    private JLabel jLabelreg1;
    private JPanel jPanel1;
    private JPanel jPanel16;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JSeparator jSeparator3;
    private JLabel matff;
    private JTextField matriculefr;
    private JLabel mcc;
    private JTextField mecano;
    private JLabel mecanomadh;
    private JTextField moisdebut;
    private JLabel mont;
    private JTextField montantdevis;
    private JLabel montbon;
    private JLabel montparmois;
    private JLabel nb;
    private JTextField nbbc;
    private JLabel nbc;
    private JTextField nbmoi;
    private JLabel nnbc;
    private JLabel nomadh;
    private JLabel nomadherant;
    private JLabel nomf;
    private JLabel noms;
    private JLabel nomscc;
    private JTextField ref;
    private JTextField reg;
    private JLabel remisee;
    private JLabel remisee1;
    private JLabel sommeletre;

    public bondecommande() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.buttonGroup2 = new ButtonGroup();
        this.INFO = new JPanel();
        this.jSeparator3 = new JSeparator();
        this.nomf = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel7 = new JLabel();
        this.noms = new JLabel();
        this.remisee = new JLabel();
        this.jLabel10 = new JLabel();
        this.nb = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel13 = new JLabel();
        this.MOIS = new JLabel();
        this.remisee1 = new JLabel();
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel25 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel28 = new JLabel();
        this.montantdevis = new JTextField();
        this.jLabel34 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel29 = new JLabel();
        this.nomadh = new JLabel();
        this.nbmoi = new JTextField();
        this.jLabel42 = new JLabel();
        this.jLabelreg = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel41 = new JLabel();
        this.codebc = new JTextField();
        this.jComboBox1 = new JComboBox();
        this.jLabel31 = new JLabel();
        this.jRadioButton1 = new JRadioButton();
        this.jRadioButton2 = new JRadioButton();
        this.jRadioButton3 = new JRadioButton();
        this.jLabel32 = new JLabel();
        this.accompte = new JTextField();
        this.jLabel35 = new JLabel();
        this.nbc = new JLabel();
        this.matff = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.montbon = new JLabel();
        this.jLabel40 = new JLabel();
        this.montparmois = new JLabel();
        this.moisdebut = new JTextField();
        this.jLabel43 = new JLabel();
        this.CH = new JRadioButton();
        this.VR = new JRadioButton();
        this.CS = new JRadioButton();
        this.g2 = new JRadioButton();
        this.reg = new JTextField();
        this.jLabel44 = new JLabel();
        this.jLabelref = new JLabel();
        this.ref = new JTextField();
        this.acc = new JRadioButton();
        this.esp = new JRadioButton();
        this.jLabelreg1 = new JLabel();
        this.nbbc = new JTextField();
        this.matriculefr = new JTextField();
        this.jLabel3 = new JLabel();
        this.jPanel1 = new JPanel();
        this.nnbc = new JLabel();
        this.aabc = new JLabel();
        this.mcc = new JLabel();
        this.nomscc = new JLabel();
        this.mont = new JLabel();
        this.bq = new JLabel();
        this.sommeletre = new JLabel();
        this.nomadherant = new JLabel();
        this.mecanomadh = new JLabel();
        this.dt = new JLabel();
        this.jLabel2 = new JLabel();
        this.setLayout(null);
        this.INFO.setBorder(BorderFactory.createTitledBorder(null, "Information Fornisseur", 0, 0, new Font("Agency FB", 1, 14), new Color(0, 0, 255)));
        this.INFO.setLayout(null);
        this.INFO.add(this.jSeparator3);
        this.jSeparator3.setBounds(132, 91, 4, 2);
        this.nomf.setFont(new Font("Tahoma", 1, 13));
        this.nomf.setForeground(new Color(153, 0, 0));
        this.nomf.setText("............................");
        this.INFO.add(this.nomf);
        this.nomf.setBounds(10, 90, 190, 28);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Nom fournisseur :");
        this.INFO.add(this.jLabel4);
        this.jLabel4.setBounds(10, 60, 130, 17);
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setText("Nom Sociter:");
        this.INFO.add(this.jLabel7);
        this.jLabel7.setBounds(10, 130, 130, 17);
        this.noms.setFont(new Font("Tahoma", 1, 13));
        this.noms.setForeground(new Color(153, 0, 0));
        this.noms.setText("............................");
        this.INFO.add(this.noms);
        this.noms.setBounds(10, 160, 190, 28);
        this.remisee.setFont(new Font("Tahoma", 1, 18));
        this.remisee.setForeground(new Color(153, 0, 0));
        this.remisee.setText("..........");
        this.INFO.add(this.remisee);
        this.remisee.setBounds(110, 190, 40, 28);
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("Remise :");
        this.INFO.add(this.jLabel10);
        this.jLabel10.setBounds(10, 200, 130, 17);
        this.nb.setFont(new Font("Tahoma", 1, 18));
        this.nb.setForeground(new Color(153, 0, 0));
        this.nb.setText("..........");
        this.INFO.add(this.nb);
        this.nb.setBounds(110, 230, 90, 28);
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("Jour d\u00e9but :");
        this.INFO.add(this.jLabel12);
        this.jLabel12.setBounds(10, 270, 90, 30);
        this.jLabel1.setBackground(new Color(153, 153, 153));
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/image2.png")));
        this.INFO.add(this.jLabel1);
        this.jLabel1.setBounds(20, 310, 160, 150);
        this.jLabel13.setFont(new Font("Tahoma", 1, 14));
        this.jLabel13.setText("Nb de mois:");
        this.INFO.add(this.jLabel13);
        this.jLabel13.setBounds(10, 240, 90, 17);
        this.MOIS.setFont(new Font("Tahoma", 1, 14));
        this.MOIS.setForeground(new Color(153, 0, 0));
        this.MOIS.setText("..............");
        this.INFO.add(this.MOIS);
        this.MOIS.setBounds(110, 264, 90, 40);
        this.remisee1.setFont(new Font("Tahoma", 1, 18));
        this.remisee1.setForeground(new Color(153, 0, 0));
        this.remisee1.setText("%");
        this.INFO.add(this.remisee1);
        this.remisee1.setBounds(150, 190, 30, 28);
        this.add(this.INFO);
        this.INFO.setBounds(0, 80, 210, 480);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel25.setBackground(new Color(153, 153, 255));
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setForeground(new Color(0, 0, 255));
        this.jLabel25.setText("Montant de bon :");
        this.jPanel16.add(this.jLabel25);
        this.jLabel25.setBounds(330, 230, 120, 40);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.mecano.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.mecanoMouseClicked(evt);
            }
        });
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommande.this.mecanoActionPerformed(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                bondecommande.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(130, 150, 170, 30);
        this.jLabel28.setBackground(new Color(153, 153, 255));
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setForeground(new Color(0, 0, 255));
        this.jLabel28.setText("Nom Sociter :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(10, 90, 110, 40);
        this.montantdevis.setFont(new Font("Tahoma", 0, 14));
        this.montantdevis.setEnabled(false);
        this.montantdevis.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.montantdevisMouseClicked(evt);
            }
        });
        this.montantdevis.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommande.this.montantdevisActionPerformed(evt);
            }
        });
        this.montantdevis.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                bondecommande.this.montantdevisKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.montantdevis);
        this.montantdevis.setBounds(130, 240, 170, 30);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText("Montant Devis :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(10, 240, 110, 30);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setForeground(new Color(0, 0, 255));
        this.jLabel38.setText("Nom et prenom :");
        this.jPanel16.add(this.jLabel38);
        this.jLabel38.setBounds(340, 150, 120, 30);
        this.jLabel6.setFont(new Font("Snap ITC", 1, 24));
        this.jLabel6.setForeground(new Color(0, 0, 153));
        this.jLabel6.setText(" Bon de Commande");
        this.jPanel16.add(this.jLabel6);
        this.jLabel6.setBounds(240, 10, 280, 30);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("N\u00b0 BC :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(620, 90, 60, 30);
        this.nomadh.setBackground(new Color(153, 153, 255));
        this.nomadh.setFont(new Font("Tahoma", 1, 14));
        this.nomadh.setForeground(new Color(153, 0, 0));
        this.nomadh.setText("................");
        this.jPanel16.add(this.nomadh);
        this.nomadh.setBounds(470, 150, 270, 30);
        this.nbmoi.setFont(new Font("Tahoma", 0, 14));
        this.nbmoi.setEnabled(false);
        this.nbmoi.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.nbmoiMouseClicked(evt);
            }
        });
        this.nbmoi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommande.this.nbmoiActionPerformed(evt);
            }
        });
        this.nbmoi.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                bondecommande.this.nbmoiKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.nbmoi);
        this.nbmoi.setBounds(130, 290, 100, 30);
        this.jLabel42.setBackground(new Color(153, 153, 255));
        this.jLabel42.setFont(new Font("Tahoma", 1, 14));
        this.jLabel42.setForeground(new Color(0, 0, 255));
        this.jLabel42.setText("Code banque :");
        this.jPanel16.add(this.jLabel42);
        this.jLabel42.setBounds(10, 370, 110, 30);
        this.jLabelreg.setBackground(new Color(153, 153, 255));
        this.jLabelreg.setFont(new Font("Tahoma", 1, 14));
        this.jLabelreg.setForeground(new Color(0, 0, 255));
        this.jLabelreg.setText("Nombre de bc :");
        this.jPanel16.add(this.jLabelreg);
        this.jLabelreg.setBounds(440, 410, 130, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("Mat Fournisseur :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(390, 87, 130, 30);
        this.jLabel41.setBackground(new Color(153, 153, 255));
        this.jLabel41.setFont(new Font("Tahoma", 1, 14));
        this.jLabel41.setForeground(new Color(0, 0, 255));
        this.jLabel41.setText("Mois debut:");
        this.jPanel16.add(this.jLabel41);
        this.jLabel41.setBounds(590, 240, 90, 30);
        this.codebc.setFont(new Font("Tahoma", 0, 14));
        this.codebc.setEnabled(false);
        this.codebc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.codebcMouseClicked(evt);
            }
        });
        this.codebc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyPressed(KeyEvent evt) {
                bondecommande.this.codebcKeyPressed(evt);
            }
        });
        this.jPanel16.add(this.codebc);
        this.codebc.setBounds(120, 370, 80, 30);
        this.jComboBox1.setFont(new Font("Tahoma", 1, 14));
        this.jComboBox1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.jComboBox1MouseClicked(evt);
            }
        });
        this.jComboBox1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommande.this.jComboBox1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jComboBox1);
        this.jComboBox1.setBounds(130, 90, 230, 40);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setForeground(new Color(0, 0, 255));
        this.jLabel31.setText("Mode :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(340, 187, 80, 30);
        this.buttonGroup1.add(this.jRadioButton1);
        this.jRadioButton1.setFont(new Font("Tahoma", 1, 14));
        this.jRadioButton1.setText("Solde");
        this.jRadioButton1.setCursor(new Cursor(0));
        this.jPanel16.add(this.jRadioButton1);
        this.jRadioButton1.setBounds(460, 190, 110, 25);
        this.buttonGroup1.add(this.jRadioButton2);
        this.jRadioButton2.setFont(new Font("Tahoma", 1, 14));
        this.jRadioButton2.setText("Non solde");
        this.jRadioButton2.setContentAreaFilled(false);
        this.jRadioButton2.setCursor(new Cursor(0));
        this.jPanel16.add(this.jRadioButton2);
        this.jRadioButton2.setBounds(590, 190, 120, 25);
        this.buttonGroup1.add(this.jRadioButton3);
        this.jRadioButton3.setText("jRadioButton3");
        this.jPanel16.add(this.jRadioButton3);
        this.jRadioButton3.setBounds(753, 190, 30, 23);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("Mecano :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(10, 160, 80, 17);
        this.accompte.setFont(new Font("Tahoma", 0, 14));
        this.accompte.setEnabled(false);
        this.accompte.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.accompteMouseClicked(evt);
            }
        });
        this.accompte.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommande.this.accompteActionPerformed(evt);
            }
        });
        this.accompte.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                bondecommande.this.accompteKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.accompte);
        this.accompte.setBounds(130, 200, 170, 30);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setForeground(new Color(0, 0, 255));
        this.jLabel35.setText("Accompte : ");
        this.jPanel16.add(this.jLabel35);
        this.jLabel35.setBounds(10, 200, 90, 30);
        this.nbc.setFont(new Font("Tahoma", 1, 18));
        this.nbc.setForeground(new Color(102, 0, 0));
        this.nbc.setText(".....");
        this.jPanel16.add(this.nbc);
        this.nbc.setBounds(680, 90, 60, 30);
        this.matff.setFont(new Font("Tahoma", 1, 18));
        this.matff.setForeground(new Color(102, 0, 0));
        this.matff.setText(".......");
        this.jPanel16.add(this.matff);
        this.matff.setBounds(520, 80, 90, 40);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommande.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(610, 330, 130, 40);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton2.setText("Vider");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommande.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton2);
        this.jButton2.setBounds(480, 330, 130, 40);
        this.montbon.setFont(new Font("Tahoma", 1, 18));
        this.montbon.setForeground(new Color(0, 102, 0));
        this.montbon.setText("............");
        this.jPanel16.add(this.montbon);
        this.montbon.setBounds(460, 230, 130, 40);
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Tahoma", 1, 14));
        this.jLabel40.setForeground(new Color(0, 0, 255));
        this.jLabel40.setText("Montant par mois :");
        this.jPanel16.add(this.jLabel40);
        this.jLabel40.setBounds(330, 290, 140, 30);
        this.montparmois.setFont(new Font("Tahoma", 1, 16));
        this.montparmois.setForeground(new Color(0, 102, 0));
        this.montparmois.setText(".......................");
        this.jPanel16.add(this.montparmois);
        this.montparmois.setBounds(480, 280, 120, 40);
        this.moisdebut.setFont(new Font("Tahoma", 1, 18));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setEnabled(false);
        this.jPanel16.add(this.moisdebut);
        this.moisdebut.setBounds(680, 240, 60, 30);
        this.jLabel43.setBackground(new Color(153, 153, 255));
        this.jLabel43.setFont(new Font("Tahoma", 1, 14));
        this.jLabel43.setForeground(new Color(0, 0, 255));
        this.jLabel43.setText("NB mois :");
        this.jPanel16.add(this.jLabel43);
        this.jLabel43.setBounds(10, 290, 80, 30);
        this.buttonGroup2.add(this.CH);
        this.CH.setFont(new Font("Tahoma", 1, 14));
        this.CH.setText("cheque");
        this.CH.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.CHMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                bondecommande.this.CHMouseEntered(evt);
            }
        });
        this.jPanel16.add(this.CH);
        this.CH.setBounds(160, 340, 93, 20);
        this.buttonGroup2.add(this.VR);
        this.VR.setFont(new Font("Tahoma", 1, 14));
        this.VR.setText("Virment");
        this.VR.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.VRMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                bondecommande.this.VRMouseEntered(evt);
            }
        });
        this.jPanel16.add(this.VR);
        this.VR.setBounds(260, 340, 93, 25);
        this.buttonGroup2.add(this.CS);
        this.CS.setFont(new Font("Tahoma", 1, 14));
        this.CS.setText("Cession");
        this.CS.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.CSMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.CS);
        this.CS.setBounds(350, 340, 93, 25);
        this.buttonGroup2.add(this.g2);
        this.g2.setText("jRadioButton7");
        this.jPanel16.add(this.g2);
        this.g2.setBounds(343, 360, 0, 23);
        this.reg.setFont(new Font("Tahoma", 1, 12));
        this.jPanel16.add(this.reg);
        this.reg.setBounds(320, 410, 110, 30);
        this.jLabel44.setBackground(new Color(153, 153, 255));
        this.jLabel44.setFont(new Font("Tahoma", 1, 14));
        this.jLabel44.setForeground(new Color(0, 0, 255));
        this.jLabel44.setText("Mode de paiement :");
        this.jPanel16.add(this.jLabel44);
        this.jLabel44.setBounds(10, 330, 140, 40);
        this.jLabelref.setBackground(new Color(153, 153, 255));
        this.jLabelref.setFont(new Font("Tahoma", 1, 14));
        this.jLabelref.setForeground(new Color(0, 0, 255));
        this.jLabelref.setText("R\u00e9ference :");
        this.jPanel16.add(this.jLabelref);
        this.jLabelref.setBounds(10, 410, 80, 40);
        this.ref.setFont(new Font("Tahoma", 1, 12));
        this.jPanel16.add(this.ref);
        this.ref.setBounds(100, 410, 110, 30);
        this.buttonGroup2.add(this.acc);
        this.acc.setFont(new Font("Tahoma", 1, 14));
        this.acc.setText("/COMPT");
        this.acc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.accMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.acc);
        this.acc.setBounds(210, 370, 85, 25);
        this.buttonGroup2.add(this.esp);
        this.esp.setFont(new Font("Tahoma", 1, 14));
        this.esp.setText("Esp\u00e9ce");
        this.esp.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.espMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.esp);
        this.esp.setBounds(320, 370, 73, 25);
        this.jLabelreg1.setBackground(new Color(153, 153, 255));
        this.jLabelreg1.setFont(new Font("Tahoma", 1, 14));
        this.jLabelreg1.setForeground(new Color(0, 0, 255));
        this.jLabelreg1.setText("Registre :");
        this.jPanel16.add(this.jLabelreg1);
        this.jLabelreg1.setBounds(230, 410, 80, 30);
        this.nbbc.setFont(new Font("Tahoma", 1, 12));
        this.nbbc.setText("1");
        this.nbbc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommande.this.nbbcActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nbbc);
        this.nbbc.setBounds(560, 410, 60, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(210, 0, 750, 550);
        this.matriculefr.setFont(new Font("Tahoma", 1, 14));
        this.matriculefr.setForeground(new Color(153, 153, 153));
        this.matriculefr.setText("         Matricule");
        this.matriculefr.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                bondecommande.this.matriculefrMouseClicked(evt);
            }
        });
        this.matriculefr.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommande.this.matriculefrActionPerformed(evt);
            }
        });
        this.matriculefr.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                bondecommande.this.matriculefrKeyReleased(evt);
            }
        });
        this.add(this.matriculefr);
        this.matriculefr.setBounds(50, 20, 140, 40);
        this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/53734.png")));
        this.add(this.jLabel3);
        this.jLabel3.setBounds(0, 10, 50, 50);
        this.jPanel1.setLayout(null);
        this.nnbc.setFont(new Font("Tahoma", 1, 12));
        this.nnbc.setText("........");
        this.jPanel1.add(this.nnbc);
        this.nnbc.setBounds(260, 0, 60, 30);
        this.aabc.setFont(new Font("Tahoma", 1, 12));
        this.aabc.setText("........");
        this.jPanel1.add(this.aabc);
        this.aabc.setBounds(340, 0, 80, 30);
        this.mcc.setFont(new Font("Tahoma", 1, 12));
        this.mcc.setText("...........");
        this.jPanel1.add(this.mcc);
        this.mcc.setBounds(480, 30, 70, 20);
        this.nomscc.setFont(new Font("Tahoma", 1, 12));
        this.nomscc.setText("........................................");
        this.jPanel1.add(this.nomscc);
        this.nomscc.setBounds(170, 34, 260, 40);
        this.mont.setFont(new Font("Tahoma", 1, 12));
        this.mont.setText("................");
        this.jPanel1.add(this.mont);
        this.mont.setBounds(480, 4, 110, 20);
        this.bq.setFont(new Font("Tahoma", 1, 12));
        this.bq.setText(".............");
        this.jPanel1.add(this.bq);
        this.bq.setBounds(480, 50, 70, 20);
        this.sommeletre.setFont(new Font("Tahoma", 1, 12));
        this.sommeletre.setText("......................................");
        this.jPanel1.add(this.sommeletre);
        this.sommeletre.setBounds(170, 94, 470, 30);
        this.nomadherant.setFont(new Font("Tahoma", 1, 12));
        this.nomadherant.setText("............................................");
        this.jPanel1.add(this.nomadherant);
        this.nomadherant.setBounds(80, 120, 310, 40);
        this.mecanomadh.setFont(new Font("Tahoma", 1, 12));
        this.mecanomadh.setText("...............");
        this.jPanel1.add(this.mecanomadh);
        this.mecanomadh.setBounds(450, 124, 80, 30);
        this.dt.setFont(new Font("Tahoma", 1, 12));
        this.dt.setText("...............");
        this.jPanel1.add(this.dt);
        this.dt.setBounds(450, 174, 100, 30);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/image/bc/a.jpg")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(0, 0, 660, 261);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(260, 640, 680, 10);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void matriculefrKeyReleased(KeyEvent evt) {
        this.jRadioButton3.setSelected(true);
        this.jRadioButton2.setSelected(false);
        this.jRadioButton1.setAutoscrolls(false);
        DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
        cmbModel.removeAllElements();
        cmbModel.removeAllElements();
        this.matff.setText(".....");
        this.nbc.setText(".....");
        this.moisdebut.setText("");
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean test = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.matriculefr.getText());
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nomf.setText(result3.getString("NOMSOC"));
                this.noms.setText(result3.getString("NOMSOC"));
                this.remisee.setText(result3.getString("remise"));
                this.nb.setText(result3.getString("nbmois"));
                this.matff.setText(this.matriculefr.getText());
                this.matt = this.matriculefr.getText();
                this.MOIS.setText(result3.getString("mois"));
                test = true;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
        }
        
        
        if (test) {
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            int i = 0;
            int n = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.jComboBox1.addItem("");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur ORDER BY NOMSOC ");
                while (result2.next()) {
                    ++i;
                    this.jComboBox1.addItem(result2.getString("NOMSOC"));
                    if (!this.matff.getText().equals(result2.getString("MATRIC"))) continue;
                    n = i;
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
            System.out.println("n= " + n);
            this.jComboBox1.setSelectedIndex(n);
            Date actuellEe = new Date();
            SimpleDateFormat dateFormatt = new SimpleDateFormat("yyyy");
            String datdd = dateFormatt.format(actuellEe);
            System.out.println("date = " + datdd);
            SimpleDateFormat dateFormattMois = new SimpleDateFormat("MM");
            String datmm = dateFormattMois.format(actuellEe);
            int moiscour = Integer.parseInt(datmm);
            SimpleDateFormat dateFormatft = new SimpleDateFormat("dd");
            String jours = dateFormatft.format(actuellEe);
            int j = Integer.parseInt(jours);
            try {
                
                    if (this.MOIS.getText().equals("13")) {
                    if(moiscour+1 > 12){
                            if(j >= 14){  
                                int dattt = Integer.parseInt(datdd)+1;
                                datdd=String.valueOf(dattt);
                                 System.out.println("date2 = " + datdd);

                            }else{
                               datdd=datdd;
                                }
                             }}
                    else
                    {
                         if(moiscour+1 > 12){
 
                                int dattt = Integer.parseInt(datdd)+1;
                                datdd=String.valueOf(dattt);
                                 System.out.println("date2 = " + datdd);

                            }else{
                               datdd=datdd;
                                }
                             }
                        
                System.out.println("new"+datdd );
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc WHERE matf='" + this.matff.getText() + "' AND anneesdebut='" + datdd + "'");
                String nbn = "0";
                while (result2.next()) {
                    nbn = result2.getString("nbc");
                }
                int m = Integer.parseInt(nbn) + 1;
                System.out.println("nbn= " + nbn);
                this.nbc.setText("" + m + "");
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
        }
    }

    private void matriculefrMouseClicked(MouseEvent evt) {
        DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
        cmbModel.removeAllElements();
        cmbModel.removeAllElements();
        this.jRadioButton3.setSelected(true);
        this.jRadioButton2.setSelected(false);
        this.jRadioButton1.setAutoscrolls(false);
        this.jButton1.setVisible(false);
        this.jRadioButton1.enable(false);
        this.jRadioButton2.enable(false);
        this.matff.setText(".......");
        this.nbc.setText(".....");
        this.matriculefr.setText("");
        this.mecano.setText("");
        this.montantdevis.setText("");
        this.montantdevis.enable(false);
        this.nomadh.setText("................");
        this.accompte.setText("");
        this.accompte.enable(false);
        this.montbon.setText("................");
        this.moisdebut.enable(false);
        this.moisdebut.setText("");
        this.nbmoi.enable(false);
        this.nbmoi.setText("");
        this.montparmois.setText("................");
        this.codebc.setText("");
        this.codebc.enable(false);
        this.nomf.setText("............................");
        this.noms.setText("............................");
        this.remisee.setText("..........");
        this.nb.setText("..........");
        this.MOIS.setText("..............");
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(true);
        this.jLabelreg.setVisible(true);
        this.g2.setSelected(true);
        this.CH.setSelected(false);
        this.VR.setSelected(false);
        this.CS.setSelected(false);
        this.esp.setSelected(false);
        this.acc.setSelected(false);
        this.nbbc.setVisible(false);
        this.jLabelreg.setVisible(false);
        this.jLabelreg.setVisible(false);
    }

    private void matriculefrActionPerformed(ActionEvent evt) {
    }

    private void montantdevisMouseClicked(MouseEvent evt) {
        boolean t = false;
        if (this.jRadioButton1.isSelected()) {
            t = true;
        } else if (this.jRadioButton2.isSelected()) {
            t = true;
        } else {
            JOptionPane.showMessageDialog(null, "Choisir la mode : Solde / non sold\u00e9");
            t = false;
        }
        if (t) {
            if (this.accompte.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Saisir un acompte (0)");
            } else {
                this.montantdevis.enable(true);
            }
        }
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        Connection conn2 = null;
        this.kk = 0;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement state3;
            ResultSetMetaData resultMeta3;
            ResultSet result3;
            int montantnet = Integer.parseInt(this.mecano.getText());
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.kk = 1;
                    this.t = "S";
                    this.nomadh.setText(result3.getString("nom"));
                }
            }
            catch (Exception e) {
                // empty catch block
            }
            if (this.kk == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        this.kk = 1;
                        this.t = "R";
                        this.nomadh.setText(result3.getString("nom"));
                    }
                }
                catch (Exception e) {
                    // empty catch block
                }
            }
            if (this.kk == 0) {
                this.nomadh.setText(".................");
            }
            System.out.println("k=" + this.k);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.mecano.setText("");
        }
    }

    private void nbmoiMouseClicked(MouseEvent evt) {
        try {
            this.Ac = Integer.parseInt(this.accompte.getText());
            System.out.println("Ac --------------------" + this.Ac);
            this.Mb = Integer.parseInt(this.montbon.getText());
            System.out.println("Mb --------------------" + this.Mb);
            this.Md = Integer.parseInt(this.montantdevis.getText());
            if (this.montantdevis.getText().length() <= 3) {
                JOptionPane.showMessageDialog(null, "Erreure : il faut ajouter trois 000 pour le montant de Montant Net");
                this.montbon.enable(false);
            } else {
                if (this.Ac > 0) {
                    String stac = Integer.toString(this.Ac);
                    stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                    System.out.println("str --------****------------" + stac);
                    this.accompte.setText(stac);
                }
                String str = Integer.toString(this.Md);
                str = new StringBuilder(str).insert(str.length() - 3, ".").toString();
                System.out.println("str --------****------------" + str);
                this.montantdevis.setText(str);
                String mb = Integer.toString(this.Mb);
                mb = new StringBuilder(mb).insert(mb.length() - 3, ".").toString();
                System.out.println("montbon ----------***----------" + mb);
                this.montbon.setText(mb);
                this.codebc.enable(true);
                this.nbmoi.enable(true);
            }
        }
        catch (Exception ex) {
            // empty catch block
        }
    }

    private void montantdevisActionPerformed(ActionEvent evt) {
    }

    private void nbmoiActionPerformed(ActionEvent evt) {
    }

    private void montantdevisKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.montantdevis.getText());
            if (this.jRadioButton1.isSelected()) {
                this.montbon.setText(this.montantdevis.getText());
            } else if (this.jRadioButton2.isSelected()) {
                int montdevi = Integer.parseInt(this.montantdevis.getText());
                System.out.println("montdevi =" + montdevi);
                int r = Integer.parseInt(this.remisee.getText());
                System.out.println("remisee =" + this.remisee.getText());
                int rem = montdevi * r / 100;
                System.out.println("rem =" + rem);
                int acc = Integer.parseInt(this.accompte.getText());
                int montantbon = montdevi - rem;
                System.out.println("montantbon =" + montantbon);
                this.montbon.setText("" + montantbon + "");
            }
            this.moisdebut.enable(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.montantdevis.setText("");
        }
    }

    private void nbmoiKeyReleased(KeyEvent evt) {
        try {
            int nbb = Integer.parseInt(this.nbmoi.getText());
            int n = Integer.parseInt(this.nb.getText());
            if (nbb <= n) {
                System.out.println("MB =" + this.Mb);
                System.out.println("Md =" + this.Md);
                System.out.println("Ac =" + this.Ac);
                int montbonn = this.Mb;
                int accomptte = this.Ac;
                int mois2 = (montbonn - accomptte) / nbb;
                System.out.println("nb =" + mois2);
                String stac = Integer.toString(mois2);
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                montpmois=stac;
                System.out.println("str --------****------------" + stac);
                this.montparmois.setText(stac + " DT");
            } else {
                JOptionPane.showMessageDialog(null, "Nombre de mois supperieur a " + n);
                this.nbmoi.setText("");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!" + e);
            this.nbmoi.setText("");
        }
    }

    private void jComboBox1MouseClicked(MouseEvent evt) {
        DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
        cmbModel.removeAllElements();
        cmbModel.removeAllElements();
        this.jRadioButton3.setSelected(true);
        this.jRadioButton2.setSelected(false);
        this.jRadioButton1.setAutoscrolls(false);
        this.jButton1.setVisible(false);
        this.matff.setText(".......");
        this.nbc.setText(".....");
        this.matriculefr.setText("         Matricule");
        this.mecano.setText("");
        this.montantdevis.setText("");
        this.montantdevis.enable(false);
        this.nomadh.setText("................");
        this.accompte.setText("");
        this.accompte.enable(false);
        this.montbon.setText("................");
        this.moisdebut.enable(false);
        this.moisdebut.setText("");
        this.nbmoi.enable(false);
        this.nbmoi.setText("");
        this.montparmois.setText("................");
        this.codebc.setText("");
        this.codebc.enable(false);
        this.nomf.setText("............................");
        this.noms.setText("............................");
        this.remisee.setText("..........");
        this.nb.setText("..........");
        this.MOIS.setText("..............");
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(true);
        this.jLabelreg.setVisible(true);
        this.g2.setSelected(true);
        this.CH.setSelected(false);
        this.VR.setSelected(false);
        this.CS.setSelected(false);
        this.esp.setSelected(false);
        this.acc.setSelected(false);
        this.nbbc.setVisible(false);
        this.jLabelreg.setVisible(false);
        this.jLabelreg1.setVisible(false);
        this.jLabelref.setVisible(false);
        this.matff.setText(".......");
        this.nbc.setText(".......");
        this.matriculefr.setText("         Matricule");
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.jComboBox1.addItem("");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur ORDER BY NOMSOC ");
            while (result2.next()) {
                this.jComboBox1.addItem(result2.getString("NOMSOC"));
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
    }

    private void accompteMouseClicked(MouseEvent evt) {
        if (this.matff.equals(".......")) {
            JOptionPane.showMessageDialog(null, "choisire le fournisseur ! ");
        } else {
            if (this.kk == 1) {
                this.accompte.enable(true);
                this.accompte.setText("000");
            }
            if (this.accompte.getText().equals("000")) {
                this.jRadioButton3.setSelected(true);
                this.jRadioButton2.setSelected(false);
                this.jRadioButton1.setAutoscrolls(false);
                this.montantdevis.setText("");
                this.montantdevis.enable(false);
                this.montbon.setText(".......");
                this.nbmoi.setText("");
                this.nbmoi.enable(false);
                this.montantdevis.setText("");
                this.montantdevis.enable(false);
                this.montparmois.setText(".......");
            }
            this.kk = 0;
        }
    }

    private void accompteActionPerformed(ActionEvent evt) {
    }

    private void accompteKeyReleased(KeyEvent evt) {
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
    }

    private void mecanoMouseClicked(MouseEvent evt) {
        JOptionPane jop3;
        this.jRadioButton1.enable(true);
        this.jRadioButton2.enable(true);
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        String mat = "";
        System.out.println("---------------------------");
        String ch = this.jComboBox1.getSelectedItem().toString();
        System.out.print("-------------jkopkol--------------");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur WHERE NOMSOC='" + ch + "'");
            while (result2.next()) {
                mat = result2.getString("MATRIC");
                this.type = result2.getString("type");
                this.matff.setText(mat);
            }
        }
        catch (Exception e) {
            JOptionPane jop32 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("yyyy");
        String datdd = dateFormatt.format(actuellEe);
        System.out.append("date = " + datdd);
        System.out.println("date = " + datdd);
        SimpleDateFormat dateFormattMois = new SimpleDateFormat("MM");
        String datmm = dateFormattMois.format(actuellEe);
        int moiscour = Integer.parseInt(datmm);
        SimpleDateFormat dateFormatft2 = new SimpleDateFormat("dd");
        String jours2 = dateFormatft2.format(actuellEe);
        int j2 = Integer.parseInt(jours2);
        try {
              // if (this.MOIS.getText().equals("13")) 
                  //  if(moiscour+1 > 12){
                //                                          
                           //     int dattt = Integer.parseInt(datdd)+1;
                          //      datdd=String.valueOf(dattt);
                             //    System.out.println("date2 = " + datdd);}
                        //    else{
                        
                            //   datdd=datdd;
                            // }
               
               
               
               
                if (this.MOIS.getText().equals("13")) {
                    if(moiscour+1 > 12){
                            if(j2 >= 14){  
                                int dattt = Integer.parseInt(datdd)+1;
                                datdd=String.valueOf(dattt);
                                 System.out.println("date2 = " + datdd);

                            }else{
                               datdd=datdd;
                                }
                             }}
                    else
                    {
                         if(moiscour+1 > 12){
 
                                int dattt = Integer.parseInt(datdd)+1;
                                datdd=String.valueOf(dattt);
                                 System.out.println("date2 = " + datdd);

                            }else{
                               datdd=datdd;
                                }
                             }
               
               
               
               
               
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc WHERE matf='" + this.matff.getText() + "' AND anneesdebut='" + datdd + "'");
            String nbn = "0";
            while (result2.next()) {
                nbn = result2.getString("nbc");
            }
            int m = Integer.parseInt(nbn) + 1;
            this.nbc.setText("" + m + "");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.matff.getText());
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nomf.setText(result3.getString("NOMSOC"));
                this.noms.setText(result3.getString("NOMSOC"));
                this.remisee.setText(result3.getString("remise"));
                this.nb.setText(result3.getString("nbmois"));
                this.MOIS.setText(result3.getString("mois"));
                this.matt = this.matriculefr.getText();
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
        }
        Date actuellEee = new Date();
        SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
        String datddf = dateFormatft.format(actuellEee);
        System.out.println("date = " + datddf);
        String jours = datddf.substring(0, datddf.length() - 8);
        System.out.println("jours = " + jours);
        int j = Integer.parseInt(jours);
        System.out.println("j = " + j);
        String mois2 = datddf.substring(3, datddf.length() - 5);
        System.out.println("mois = " + mois2);
        int ms = Integer.parseInt(mois2);
        System.out.println("ms = " + ms);
        String ann\u00e9es = datddf.substring(6, datddf.length());
        System.out.println("ann\u00e9es = " + ann\u00e9es);
        int moiscourant = Integer.parseInt(mois2);
        this.anedebut = Integer.parseInt(ann\u00e9es);
        System.out.println("moiscourant = " + moiscourant);
        if (this.MOIS.getText().equals("13")) {
            if( moiscourant+1 > 12){
                if(j >= 14){
                    moiscourant = 1;
                    ++this.anedebut;
                }else{
                    moiscourant = moiscourant;
                    this.anedebut = this.anedebut;
                }
            }else {
                if(j >= 14){
                    moiscourant= moiscourant+1;
                    this.anedebut=this.anedebut;
                }else{
                    moiscourant = moiscourant;
                    this.anedebut = this.anedebut;
                }
            }
//                if (j >= 14 && ++moiscourant > 12) {
//                moiscourant = 1;
//                ++this.anedebut;
//            }
        }else{
            // numero mois comptable  = 01 de chaque mois
            int m = moiscourant+1;
            if(m > 12){
                    moiscourant = 1;
                    ++this.anedebut;
            }else{
                   // moiscourant= moiscourant+1;
                   // this.anedebut=this.anedebut;
                   
                    moiscourant= moiscourant+1;
                    this.anedebut=this.anedebut;
                
                    this.anedebut = this.anedebut;
                }
                   
  
                
            }
        
        this.moisdebut.enable(true);
        if (moiscourant < 10) {
            this.moisdebut.setText("0" + moiscourant);
        } else {
            this.moisdebut.setText("" + moiscourant);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean kk = false;
        int i = 1;
        int j = 0;
        try {
            j = Integer.parseInt(this.nbbc.getText());
            kk = true;
        }
        catch (Exception e) {
            kk = false;
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur nombre de bc " + e.getMessage());
        }
        if (kk) {
            String modpaim;
            String mode;
            if (j > 1) {
                while (i <= j) {
                    mode = "";
                    if (this.jRadioButton1.isSelected()) {
                        mode = "solde";
                    } else if (this.jRadioButton2.isSelected()) {
                        mode = "non solde";
                    }
                    modpaim = "";
                    boolean t = false;
                    if (this.CH.isSelected()) {
                        t = true;
                        modpaim = "cheque";
                    } else if (this.CS.isSelected()) {
                        JOptionPane jop1;
                        modpaim = "cs";
                        t = true;
                        if (this.ref.getText().equals("")) {
                            t = false;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "attention il faut saisir reference", "Information", 1);
                        }
                        if (this.reg.getText().equals("")) {
                            t = false;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "attention il faut saisir N\u00b0 registre", "Information", 1);
                        }
                    } else if (this.VR.isSelected()) {
                        modpaim = "Vr";
                        t = true;
                    } else if (this.acc.isSelected()) {
                        modpaim = "/cmpt";
                        t = true;
                    } else if (this.esp.isSelected()) {
                        modpaim = "esp";
                        t = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Choisir la mode de paiement");
                        t = false;
                    }
                    if (!t) continue;
                    JOptionPane jop12 = new JOptionPane();
                    int option = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment imprimer ce bonde de commande", "Quitter", 0, 3);
                    if (option == 0) {
                        String adi;
                        String referencee = this.ref.getText() + "/" + this.reg.getText();
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state2 = conn2.createStatement();
                            this.k = 1;
                            String nb = "1";
                            String imprimeborde = "1";
                            String p = "0";
                            String f = "1";
                            state2.executeUpdate("UPDATE cessionfournisseur SET ref='" + referencee + "' WHERE Mecano='" + this.mecano.getText() + "'AND Matricule='" + this.matff.getText() + "'AND pv='" + p + "'");
                            state2.executeUpdate("UPDATE cessionfournisseur SET pv='" + f + "' WHERE Mecano='" + this.mecano.getText() + "'AND Matricule='" + this.matff.getText() + "'AND pv='" + p + "'");
                            String numcarnet = "";
                        }
                        catch (Exception e) {
                            this.k = 0;
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                        }
                        int tt = 0;
                        String m = "" + this.Mb + "";
                        try {
                            tt = m.length() - 3;
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "!!!!!!!!!!!!!!!!!!!!!!!!!!!" + e.getMessage());
                        }
                        String di = m.substring(0, m.length() - 3);
                        String mil = m.substring(tt, m.length());
                        String mmmm = di + mil;
                        int nndi = Integer.parseInt(di);
                        int nnmi = Integer.parseInt(mil);
                        String montt = "";
                        String s = "";
                        if (mil.equals("000")) {
                            adi = null;
                            try {
                                adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            }
                            catch (Exception ex) {
                                Logger.getLogger(bondecommande.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            montt = adi.toUpperCase();
                        } else {
                            adi = null;
                            try {
                                adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            }
                            catch (Exception ex) {
                                Logger.getLogger(bondecommande.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            String adi2 = adi.toUpperCase();
                            montt = adi2 + " Et " + nnmi + " MILLIMES";
                        }
                        System.out.println("mm = " + montt);
                        this.sommeletre.setText(montt);
                        Date actuellEee = new Date();
                        SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
                        String datddf = dateFormatft.format(actuellEee);
                        this.dt.setText(datddf);
                        this.nnbc.setText(this.nbc.getText());
                        this.aabc.setText("" + this.anedebut + "");
                        this.bq.setText(this.codebc.getText());
                        this.mcc.setText(this.moisdebut.getText());
                        this.mont.setText(this.montparmois.getText() + " DT");
                        this.nomscc.setText(this.noms.getText());
                        this.nomadherant.setText(this.nomadh.getText());
                        this.mecanomadh.setText(this.mecano.getText());
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state = conn2.createStatement();
                            Statement state2 = conn2.createStatement();
                            String nbm = "0";
                            String nnp = "1";
                            
                            datedeb="01/"+this.moisdebut.getText()+"/"+this.aabc.getText();
                            System.out.println("date de debut"+datedeb);
                            lastmonth= Integer.parseInt(this.moisdebut.getText())+Integer.parseInt(this.nbmoi.getText());
                            System.out.println("last"+lastmonth);
                            this.yearfin=Integer.parseInt(this.aabc.getText());
                            System.out.println("Fin"+yearfin);
                            if (lastmonth > 12){
                             while (lastmonth > 12)
                             {
                             lastmonth= lastmonth - 12;
                             yearfin = Integer.parseInt(this.aabc.getText()) + 1;
                             }
                            }
                            datefin = "01/" + lastmonth + "/" + yearfin;  
                            System.out.println("date de fin"+datefin);               
                            int moisincrement = Integer.parseInt(this.moisdebut.getText()) - 1;
                            System.out.println("moisincrement init "+moisincrement);
                            int yearincrement = Integer.parseInt(this.aabc.getText());
                            System.out.println("yearincrement "+yearincrement);
                            int n =  Integer.parseInt(this.nbmoi.getText());
                            System.err.println("n "+n);
                            for (int p = 0; p < n; p++)
                              {
                              moisincrement = moisincrement + 1;
                              System.out.println("moisincrement init "+moisincrement);
                              yearincrement = yearincrement;
                              System.out.println("yearincrement "+yearincrement);
                              if (moisincrement > 12)
                                  {
                                 moisincrement = moisincrement - 12;
                                 yearincrement = yearincrement + 1;
                               }
                            datepayement = "15/" + moisincrement + "/" + yearincrement;
                            System.out.println("date de payement"+datepayement);
                            state2.executeUpdate("INSERT INTO tranche(Mecano,Nom,montantparmois,montant,etat,matf,datedebut,datefin,nbc,nombredemois,datepayement,codebanque,type,Ref,TypePaie,NumeroPaie) VALUES('" + this.mecano.getText() + "','" + this.nomadh.getText() + "','" + montpmois + "','" + this.montbon.getText() + "','" + etat + "','" + this.matff.getText() + "','" + datedeb + "','" + datefin + "','" + this.nbc.getText() + "','" + this.nbmoi.getText() + "','" + datepayement + "','" +  this.codebc.getText() + "','" + modpaim + "','" + Ref + "','" + typetranche + "','" + NumeroPaie + "')");
                                 }
                            state.executeUpdate("INSERT INTO bc(Mecano,matf,nbc,datebc,moisdebut,anneesdebut,accompte,montantbc,montantdevis,nbmois,codeb,paimenpar,mode) VALUES('" + this.mecano.getText() + "','" + this.matff.getText() + "','" + this.nbc.getText() + "','" + datddf + "','" + this.moisdebut.getText() + "','" + this.aabc.getText() + "','" + this.Ac + "','" + mmmm + "','" + this.Md + "','" + nnp + "','" + this.codebc.getText() + "','" + modpaim + "','" + modpaim + "')");
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Succes d'ajouter  ", "Information", 1);
                          
                            Impression1 sv = new Impression1(this.jPanel1);
                            sv.actionPerformed(evt);
                        }
                        catch (Exception e) {
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout  :bon de commande d\u00e9ja exicte " + e.getMessage());
                        }
                    } else {
                        kk = false;
                    }
                    ++i;
                    int mm = Integer.parseInt(this.moisdebut.getText());
                    this.moisdebut.setText("" + ++mm + "");
                    int nn = Integer.parseInt(this.nbc.getText());
                    this.nbc.setText("" + ++nn + "");
                }
            } else {
                mode = "";
                if (this.jRadioButton1.isSelected()) {
                    mode = "solde";
                } else if (this.jRadioButton2.isSelected()) {
                    mode = "non solde";
                }
                modpaim = "";
                boolean t = false;
                if (this.CH.isSelected()) {
                    t = true;
                    modpaim = "cheque";
                } else if (this.CS.isSelected()) {
                    JOptionPane jop1;
                    modpaim = "cs";
                    t = true;
                    if (this.ref.getText().equals("")) {
                        t = false;
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "attention il faut saisir reference", "Information", 1);
                    }
                    if (this.reg.getText().equals("")) {
                        t = false;
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "attention il faut saisir N\u00b0 registre", "Information", 1);
                    }
                } else if (this.VR.isSelected()) {
                    modpaim = "Vr";
                    t = true;
                } else if (this.acc.isSelected()) {
                    modpaim = "/cmpt";
                    t = true;
                } else if (this.esp.isSelected()) {
                    modpaim = "esp";
                    t = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Choisir la mode de paiement");
                    t = false;
                }
                if (t) {
                    JOptionPane jop12 = new JOptionPane();
                    int option = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment imprimer ce bonde de commande", "Quitter", 0, 3);
                    if (option == 0) {
                        String adi;
                        String referencee = this.ref.getText() + "/" + this.reg.getText();
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state2 = conn2.createStatement();
                            this.k = 1;
                            String nb = "1";
                            String imprimeborde = "1";
                            String p = "0";
                            String f = "1";
                            state2.executeUpdate("UPDATE cessionfournisseur SET ref='" + referencee + "' WHERE Mecano='" + this.mecano.getText() + "'AND Matricule='" + this.matff.getText() + "'AND pv='" + p + "'");
                            state2.executeUpdate("UPDATE cessionfournisseur SET pv='" + f + "' WHERE Mecano='" + this.mecano.getText() + "'AND Matricule='" + this.matff.getText() + "'AND pv='" + p + "'");
                            String numcarnet = "";
                        }
                        catch (Exception e) {
                            this.k = 0;
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                        }
                        int tt = 0;
                        String m = "" + this.Mb + "";
                        try {
                            tt = m.length() - 3;
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "!!!!!!!!!!!!!!!!!!!!!!!!!!!" + e.getMessage());
                        }
                        String di = m.substring(0, m.length() - 3);
                        String mil = m.substring(tt, m.length());
                        String mmmm = di + mil;
                        this.mont.setText("#" + di + "," + mil + "#");
                        int nndi = Integer.parseInt(di);
                        int nnmi = Integer.parseInt(mil);
                        String montt = "";
                        String s = "";
                        if (mil.equals("000")) {
                            adi = null;
                            try {
                                adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            }
                            catch (Exception ex) {
                                Logger.getLogger(bondecommande.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            montt = adi.toUpperCase();
                        } else {
                            adi = null;
                            try {
                                adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            }
                            catch (Exception ex) {
                                Logger.getLogger(bondecommande.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            String adi2 = adi.toUpperCase();
                            montt = adi2 + " Et " + nnmi + " MILLIMES";
                        }
                        System.out.println("mm = " + montt);
                        this.sommeletre.setText(montt);
                        Date actuellEee = new Date();
                        SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
                        String datddf = dateFormatft.format(actuellEee);
                        this.dt.setText(datddf);
                        
                        Date actuellEe = new Date();
                        SimpleDateFormat dateFormatt = new SimpleDateFormat("yyyy");
                        String datdd = dateFormatt.format(actuellEe);
                        System.out.append("date = " + datdd);
                        System.out.println("date = " + datdd);
                        SimpleDateFormat dateFormattMois = new SimpleDateFormat("MM");
                        String datmm = dateFormattMois.format(actuellEe);
                        int moiscour = Integer.parseInt(datmm);
                        SimpleDateFormat dateFormatft2 = new SimpleDateFormat("dd");
                        String jours2 = dateFormatft2.format(actuellEe);
                        int j2 = Integer.parseInt(jours2);
                        if (this.MOIS.getText().equals("13")) 
                        if(moiscour+1 > 12){
                            if(j2 >= 14){  
                                this.anedebut=Integer.parseInt(datdd)+1;
                            }else{
                               this.anedebut=anedebut;
                                }
                             }
                         else {
                          this.anedebut=this.anedebut;
                              }
               
                        System.out.println("la nouvelle date dat + "+anedebut);
                        
                        this.nnbc.setText(this.nbc.getText());
                        this.aabc.setText("" + this.anedebut + "");
                        this.bq.setText(this.codebc.getText());
                        this.mcc.setText(this.moisdebut.getText());
                        this.mont.setText(this.montbon.getText() + " DT");
                        this.nomscc.setText(this.noms.getText());
                        this.nomadherant.setText(this.nomadh.getText());
                        this.mecanomadh.setText(this.mecano.getText());
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state = conn2.createStatement();
                            Statement state2 = conn2.createStatement();
                            String nbm = "0";
                            
                            datedeb="01/"+this.moisdebut.getText()+"/"+this.aabc.getText();
                            System.out.println("date de debut"+datedeb);
                            lastmonth= Integer.parseInt(this.moisdebut.getText())+Integer.parseInt(this.nbmoi.getText());
                            System.out.println("last"+lastmonth);
                            this.yearfin=Integer.parseInt(this.aabc.getText());
                            System.out.println("Fin"+yearfin);
                            if (lastmonth > 12){
                             while (lastmonth > 12)
                             {
                             lastmonth= lastmonth - 12;
                             yearfin = Integer.parseInt(this.aabc.getText()) + 1;
                             }
                            }
                 
                            datefin = "01/" + lastmonth + "/" + yearfin;  
                            System.out.println("date de fin"+datefin);
                            
                            int moisincrement = Integer.parseInt(this.moisdebut.getText()) - 1;
                              System.out.println("moisincrement init "+moisincrement);
                            int yearincrement = Integer.parseInt(this.aabc.getText());
                             System.out.println("yearincrement "+yearincrement);
                            int n =  Integer.parseInt(this.nbmoi.getText());
                            System.err.println("n "+n);
                            for (int p = 0; p < n; p++)
                              {
                              moisincrement = moisincrement + 1;
                              System.out.println("moisincrement init "+moisincrement);
                              yearincrement = yearincrement;
                               System.out.println("yearincrement "+yearincrement);
                              if (moisincrement > 12)
                                  {
                                 moisincrement = moisincrement - 12;
                                  yearincrement = yearincrement + 1;
                               }
                                 datepayement = "15/" + moisincrement + "/" + yearincrement;
                                  System.out.println("date de payement"+datepayement);
                    
                            state2.executeUpdate("INSERT INTO tranche(Mecano,Nom,montantparmois,montant,etat,matf,datedebut,datefin,nbc,nombredemois,datepayement,codebanque,type,Ref,TypePaie,NumeroPaie) VALUES('" + this.mecano.getText() + "','" + this.nomadh.getText() + "','" + montpmois + "','" + this.montbon.getText() + "','" + etat + "','" + this.matff.getText() + "','" + datedeb + "','" + datefin + "','" + this.nbc.getText() + "','" + this.nbmoi.getText() + "','" + datepayement + "','" +  this.codebc.getText() + "','" + modpaim + "','" + Ref + "','" + typetranche + "','" + NumeroPaie + "')");
                 
                                 }
                                    
                            state.executeUpdate("INSERT INTO bc(Mecano,matf,nbc,datebc,moisdebut,anneesdebut,accompte,montantbc,montantdevis,nbmois,codeb,paimenpar,mode) VALUES('" + this.mecano.getText() + "','" + this.matff.getText() + "','" + this.nbc.getText() + "','" + datddf + "','" + this.moisdebut.getText() + "','" + this.aabc.getText() + "','" + this.Ac + "','" + mmmm + "','" + this.Md + "','" + this.nbmoi.getText() + "','" + this.codebc.getText() + "','" + modpaim + "','" + modpaim + "')");
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Succes d'ajouter  ", "Information", 1);        
                            Impression1 sv = new Impression1(this.jPanel1);
                            sv.actionPerformed(evt);
                          
                            
                        }
                        catch (Exception e) {
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout  :bon de commande d\u00e9ja exicte " + e.getMessage());
                        }
                    } else {
                        kk = false;
                    }
                }
                kk = true;
            }
            if (kk) {
                DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
                cmbModel.removeAllElements();
                cmbModel.removeAllElements();
                this.jRadioButton3.setSelected(true);
                this.jRadioButton2.setSelected(false);
                this.jRadioButton1.setAutoscrolls(false);
                this.jButton1.setVisible(false);
                this.matff.setText(".......");
                this.nbc.setText(".....");
                this.matriculefr.setText("         Matricule");
                this.mecano.setText("");
                this.montantdevis.setText("");
                this.montantdevis.enable(false);
                this.nomadh.setText("................");
                this.accompte.setText("");
                this.accompte.enable(false);
                this.montbon.setText("................");
                this.moisdebut.enable(false);
                this.moisdebut.setText("");
                this.nbmoi.enable(false);
                this.nbmoi.setText("");
                this.montparmois.setText("................");
                this.codebc.setText("");
                this.codebc.enable(false);
                this.nomf.setText("............................");
                this.noms.setText("............................");
                this.remisee.setText("..........");
                this.nb.setText("..........");
                this.MOIS.setText("..............");
                this.ref.setVisible(false);
                this.reg.setVisible(false);
                this.jRadioButton1.enable(false);
                this.jRadioButton2.enable(false);
                this.jLabelref.setVisible(true);
                this.jLabelreg.setVisible(true);
                this.g2.setSelected(true);
                this.CH.setSelected(false);
                this.VR.setSelected(false);
                this.CS.setSelected(false);
                this.esp.setSelected(false);
                this.acc.setSelected(false);
                this.nbbc.setVisible(false);
                this.jLabelreg.setVisible(false);
                this.jLabelref.setVisible(false);
            }
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane jop12 = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment vider l'\u00e9cran", "Quitter", 0, 3);
        if (option == 0) {
            DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
            cmbModel.removeAllElements();
            cmbModel.removeAllElements();
            this.jRadioButton3.setSelected(true);
            this.jRadioButton2.setSelected(false);
            this.jRadioButton1.setAutoscrolls(false);
            this.jButton1.setVisible(false);
            this.jRadioButton1.enable(false);
            this.jRadioButton2.enable(false);
            this.matff.setText(".......");
            this.nbc.setText(".....");
            this.matriculefr.setText("         Matricule");
            this.mecano.setText("");
            this.montantdevis.setText("");
            this.montantdevis.enable(false);
            this.nomadh.setText("................");
            this.accompte.setText("");
            this.accompte.enable(false);
            this.montbon.setText("................");
            this.moisdebut.enable(false);
            this.moisdebut.setText("");
            this.nbmoi.enable(false);
            this.nbmoi.setText("");
            this.montparmois.setText("................");
            this.codebc.setText("");
            this.codebc.enable(false);
            this.nomf.setText("............................");
            this.noms.setText("............................");
            this.remisee.setText("..........");
            this.nb.setText("..........");
            this.MOIS.setText("..............");
            this.ref.setVisible(false);
            this.reg.setVisible(false);
            this.jLabelref.setVisible(false);
            this.jLabelreg.setVisible(false);
            this.g2.setSelected(true);
            this.CH.setSelected(false);
            this.VR.setAutoscrolls(false);
            this.CS.setVisible(false);
            this.esp.setAutoscrolls(false);
            this.acc.setSelected(false);
        }
    }

    private void codebcMouseClicked(MouseEvent evt) {
        if (this.nbmoi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Saisir le Nombre de mois");
        } else {
            this.codebc.enable(true);
        }
    }

    private void codebcKeyPressed(KeyEvent evt) {
    }

    private void CSMouseClicked(MouseEvent evt) {
        this.codebc.enable(false);
        this.jButton1.setVisible(true);
        this.ref.setVisible(true);
        this.jLabelreg1.setVisible(true);
        this.reg.setVisible(true);
        this.nbbc.setVisible(true);
        this.jLabelreg.setVisible(true);
        this.jLabelref.setVisible(true);
        this.jLabelreg.setVisible(true);
        this.codebc.setText("CS");
    }

    private void CHMouseClicked(MouseEvent evt) {
        this.codebc.enable(true);
        this.jButton1.setVisible(true);
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(false);
        this.jLabelreg.setVisible(false);
        this.nbbc.setVisible(false);
        Connection conn2 = null;
        this.kk = 0;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        String bq = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.kk = 1;
                bq = result3.getString("banque");
            }
        }
        catch (Exception e) {
            // empty catch block
        }
        if (this.k == 1) {
            // empty if block
        }
    }

    private void VRMouseClicked(MouseEvent evt) {
        Connection conn2;
        ResultSet result3;
        this.codebc.enable(true);
        this.nbbc.setVisible(false);
        this.jButton1.setVisible(true);
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(false);
        this.jLabelreg.setVisible(false);
        String nbbb = "";
        this.kk = 0;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            result3 = state.executeQuery("SELECT nbm FROM adherent  WHERE  MECANO='" + this.mecano.getText() + "'");
            while (result3.next()) {
                this.kk = 1;
                nbbb = result3.getString("nbm");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.kk == 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT nbm FROM  retretait WHERE  mecano='" + this.mecano.getText() + "'");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.kk = 1;
                    nbbb = result3.getString("nbm");
                }
            }
            catch (Exception e) {
                // empty catch block
            }
        }
        System.out.println("nbm =" + nbbb);
        int nnb = 0;
        try {
            nnb = Integer.parseInt(nbbb);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EREEURE : " + e.getMessage());
        }
        int nb = Integer.parseInt(this.nbmoi.getText());
        if (nnb < nb) {
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Attention : il faut imprimer au moins " + (nb -= nnb) + " autres virment", "Information", 1);
            this.jButton1.setVisible(false);
            this.g2.setSelected(true);
            this.VR.setAutoscrolls(false);
        }
    }

    private void accMouseClicked(MouseEvent evt) {
        this.codebc.enable(false);
        this.nbbc.setVisible(false);
        this.jButton1.setVisible(true);
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(false);
        this.jLabelreg.setVisible(false);
        this.codebc.setText("400");
    }

    private void espMouseClicked(MouseEvent evt) {
        this.codebc.enable(false);
        this.nbbc.setVisible(false);
        this.jButton1.setVisible(true);
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(false);
        this.jLabelreg.setVisible(false);
        this.codebc.setText("221");
    }

    private void VRMouseEntered(MouseEvent evt) {
    }

    private void nbbcActionPerformed(ActionEvent evt) {
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void CHMouseEntered(MouseEvent evt) {
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

