/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.historiquevirment;

public class montantvirement
extends JPanel {
    String ch = "";
    String montant = "";
    private JLabel ATBlettre;
    private JLabel BNAchiffre;
    private JTextField Mecano;
    private JTextField Mecano1;
    private JLabel STBchiffre;
    private JLabel STBlettre;
    private JLabel atbchiffre;
    private JLabel bhchiffre;
    private JLabel bhletre;
    private JLabel bnalettre;
    private JLabel btchiffre;
    private JLabel btenlettre;
    private JLabel cin1;
    private JLabel cin10;
    private JLabel cin11;
    private JLabel cin12;
    private JLabel cin13;
    private JLabel cin14;
    private JLabel cin15;
    private JLabel cin16;
    private JLabel cin17;
    private JLabel cin2;
    private JLabel cin3;
    private JLabel cin4;
    private JLabel cin5;
    private JLabel cin6;
    private JLabel cin7;
    private JLabel cin8;
    private JLabel cin9;
    private JLabel cinetat10;
    private JLabel cinetat11;
    private JLabel cinetat12;
    private JLabel cinetat13;
    private JLabel cinetat8;
    private JLabel cinetat9;
    private JLabel cnr1;
    private JLabel cnr10;
    private JLabel cnr11;
    private JLabel cnr12;
    private JLabel cnr13;
    private JLabel cnr14;
    private JLabel cnr15;
    private JLabel cnr16;
    private JLabel cnr17;
    private JLabel cnr2;
    private JLabel cnr3;
    private JLabel cnr4;
    private JLabel cnr5;
    private JLabel cnr6;
    private JLabel cnr7;
    private JLabel cnr8;
    private JLabel cnr9;
    private JLabel cnretat10;
    private JLabel cnretat11;
    private JLabel cnretat12;
    private JLabel cnretat13;
    private JLabel cnretat14;
    private JLabel cnretat8;
    private JLabel cnretat9;
    private JLabel dateetat22;
    private JLabel dateetat23;
    private JLabel dateetat26;
    private JLabel dateetat27;
    private JLabel dateetat28;
    private JLabel dateetat29;
    private JLabel dateetat32;
    private JLabel dateetat33;
    private JLabel dateetat34;
    private JLabel dateetat35;
    private JLabel dateetat38;
    private JLabel dateetat39;
    private JToggleButton imprimer;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox jComboBox1;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField100;
    private JTextField jTextField101;
    private JTextField jTextField102;
    private JTextField jTextField103;
    private JTextField jTextField104;
    private JTextField jTextField105;
    private JTextField jTextField108;
    private JTextField jTextField109;
    private JTextField jTextField110;
    private JTextField jTextField111;
    private JTextField jTextField113;
    private JTextField jTextField114;
    private JTextField jTextField115;
    private JTextField jTextField116;
    private JTextField jTextField117;
    private JTextField jTextField118;
    private JTextField jTextField119;
    private JTextField jTextField120;
    private JTextField jTextField122;
    private JTextField jTextField123;
    private JTextField jTextField124;
    private JTextField jTextField125;
    private JTextField jTextField127;
    private JTextField jTextField128;
    private JTextField jTextField129;
    private JTextField jTextField13;
    private JTextField jTextField130;
    private JTextField jTextField131;
    private JTextField jTextField132;
    private JTextField jTextField133;
    private JTextField jTextField134;
    private JTextField jTextField136;
    private JTextField jTextField137;
    private JTextField jTextField138;
    private JTextField jTextField139;
    private JTextField jTextField14;
    private JTextField jTextField141;
    private JTextField jTextField142;
    private JTextField jTextField143;
    private JTextField jTextField144;
    private JTextField jTextField145;
    private JTextField jTextField146;
    private JTextField jTextField147;
    private JTextField jTextField148;
    private JTextField jTextField15;
    private JTextField jTextField150;
    private JTextField jTextField151;
    private JTextField jTextField152;
    private JTextField jTextField153;
    private JTextField jTextField154;
    private JTextField jTextField155;
    private JTextField jTextField157;
    private JTextField jTextField158;
    private JTextField jTextField159;
    private JTextField jTextField16;
    private JTextField jTextField160;
    private JTextField jTextField161;
    private JTextField jTextField162;
    private JTextField jTextField163;
    private JTextField jTextField165;
    private JTextField jTextField167;
    private JTextField jTextField169;
    private JTextField jTextField17;
    private JTextField jTextField170;
    private JTextField jTextField171;
    private JTextField jTextField172;
    private JTextField jTextField173;
    private JTextField jTextField174;
    private JTextField jTextField175;
    private JTextField jTextField176;
    private JTextField jTextField178;
    private JTextField jTextField179;
    private JTextField jTextField18;
    private JTextField jTextField180;
    private JTextField jTextField19;
    private JTextField jTextField2;
    private JTextField jTextField20;
    private JTextField jTextField22;
    private JTextField jTextField23;
    private JTextField jTextField24;
    private JTextField jTextField25;
    private JTextField jTextField26;
    private JTextField jTextField27;
    private JTextField jTextField28;
    private JTextField jTextField29;
    private JTextField jTextField30;
    private JTextField jTextField31;
    private JTextField jTextField33;
    private JTextField jTextField34;
    private JTextField jTextField35;
    private JTextField jTextField36;
    private JTextField jTextField38;
    private JTextField jTextField40;
    private JTextField jTextField41;
    private JTextField jTextField42;
    private JTextField jTextField43;
    private JTextField jTextField44;
    private JTextField jTextField45;
    private JTextField jTextField47;
    private JTextField jTextField48;
    private JTextField jTextField49;
    private JTextField jTextField50;
    private JTextField jTextField51;
    private JTextField jTextField52;
    private JTextField jTextField54;
    private JTextField jTextField55;
    private JTextField jTextField56;
    private JTextField jTextField57;
    private JTextField jTextField58;
    private JTextField jTextField59;
    private JTextField jTextField61;
    private JTextField jTextField62;
    private JTextField jTextField63;
    private JTextField jTextField64;
    private JTextField jTextField65;
    private JTextField jTextField66;
    private JTextField jTextField69;
    private JTextField jTextField70;
    private JTextField jTextField71;
    private JTextField jTextField72;
    private JTextField jTextField73;
    private JTextField jTextField74;
    private JTextField jTextField77;
    private JTextField jTextField78;
    private JTextField jTextField79;
    private JTextField jTextField80;
    private JTextField jTextField83;
    private JTextField jTextField84;
    private JTextField jTextField85;
    private JTextField jTextField86;
    private JTextField jTextField87;
    private JTextField jTextField88;
    private JTextField jTextField91;
    private JTextField jTextField92;
    private JTextField jTextField93;
    private JTextField jTextField95;
    private JTextField jTextField99;
    private JLabel mecano1;
    private JLabel mecano10;
    private JLabel mecano11;
    private JLabel mecano12;
    private JLabel mecano13;
    private JLabel mecano14;
    private JLabel mecano15;
    private JLabel mecano16;
    private JLabel mecano17;
    private JLabel mecano2;
    private JLabel mecano3;
    private JLabel mecano4;
    private JLabel mecano5;
    private JLabel mecano6;
    private JLabel mecano7;
    private JLabel mecano8;
    private JLabel mecano9;
    private JLabel montant1;
    private JLabel montant10;
    private JLabel montant11;
    private JLabel montant12;
    private JLabel montant13;
    private JLabel montant14;
    private JLabel montant15;
    private JLabel montant16;
    private JLabel montant17;
    private JLabel montant2;
    private JLabel montant3;
    private JLabel montant4;
    private JLabel montant5;
    private JLabel montant6;
    private JLabel montant7;
    private JLabel montant8;
    private JLabel montant9;
    private JLabel montantetat10;
    private JLabel montantetat11;
    private JLabel montantetat13;
    private JLabel montantetat14;
    private JLabel montantetat8;
    private JLabel montantetat9;
    private JLabel ne1;
    private JLabel ne10;
    private JLabel ne11;
    private JLabel ne12;
    private JLabel ne13;
    private JLabel ne14;
    private JLabel ne15;
    private JLabel ne16;
    private JLabel ne17;
    private JLabel ne2;
    private JLabel ne3;
    private JLabel ne4;
    private JLabel ne5;
    private JLabel ne6;
    private JLabel ne7;
    private JLabel ne8;
    private JLabel ne9;
    private JLabel nom1;
    private JLabel nom10;
    private JLabel nom11;
    private JLabel nom12;
    private JLabel nom13;
    private JLabel nom14;
    private JLabel nom15;
    private JLabel nom16;
    private JLabel nom17;
    private JLabel nom2;
    private JLabel nom3;
    private JLabel nom4;
    private JLabel nom5;
    private JLabel nom6;
    private JLabel nom7;
    private JLabel nom8;
    private JLabel nom9;
    private JLabel numpage;
    private JTextField oppio;
    private JLabel somme;
    private JTextField total;
    private JLabel uibchiffre;
    private JLabel uiblettre;

    public montantvirement() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jComboBox1 = new JComboBox();
        this.jLabel5 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel2 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jButton2 = new JButton();
        this.imprimer = new JToggleButton();
        this.jPanel2 = new JPanel();
        this.uibchiffre = new JLabel();
        this.uiblettre = new JLabel();
        this.btenlettre = new JLabel();
        this.btchiffre = new JLabel();
        this.bhletre = new JLabel();
        this.bhchiffre = new JLabel();
        this.atbchiffre = new JLabel();
        this.ATBlettre = new JLabel();
        this.BNAchiffre = new JLabel();
        this.bnalettre = new JLabel();
        this.STBlettre = new JLabel();
        this.STBchiffre = new JLabel();
        this.jTextField2 = new JTextField();
        this.jButton1 = new JButton();
        this.jButton3 = new JButton();
        this.jPanel3 = new JPanel();
        this.jPanel4 = new JPanel();
        this.jLabel10 = new JLabel();
        this.nom1 = new JLabel();
        this.jTextField13 = new JTextField();
        this.jTextField14 = new JTextField();
        this.jTextField15 = new JTextField();
        this.cnr1 = new JLabel();
        this.jTextField16 = new JTextField();
        this.cin1 = new JLabel();
        this.jTextField17 = new JTextField();
        this.jTextField18 = new JTextField();
        this.jTextField19 = new JTextField();
        this.montant1 = new JLabel();
        this.jTextField20 = new JTextField();
        this.mecano1 = new JLabel();
        this.Mecano = new JTextField();
        this.jTextField22 = new JTextField();
        this.Mecano1 = new JTextField();
        this.ne1 = new JLabel();
        this.jTextField23 = new JTextField();
        this.somme = new JLabel();
        this.cnretat12 = new JLabel();
        this.total = new JTextField();
        this.jTextField99 = new JTextField();
        this.ne2 = new JLabel();
        this.jTextField24 = new JTextField();
        this.mecano2 = new JLabel();
        this.jTextField25 = new JTextField();
        this.nom2 = new JLabel();
        this.jTextField26 = new JTextField();
        this.cnr2 = new JLabel();
        this.cin2 = new JLabel();
        this.jTextField27 = new JTextField();
        this.jTextField28 = new JTextField();
        this.montant2 = new JLabel();
        this.jTextField29 = new JTextField();
        this.ne3 = new JLabel();
        this.jTextField30 = new JTextField();
        this.mecano3 = new JLabel();
        this.jTextField31 = new JTextField();
        this.nom3 = new JLabel();
        this.jTextField33 = new JTextField();
        this.cnr3 = new JLabel();
        this.cin3 = new JLabel();
        this.jTextField34 = new JTextField();
        this.jTextField35 = new JTextField();
        this.montant3 = new JLabel();
        this.jTextField36 = new JTextField();
        this.ne4 = new JLabel();
        this.oppio = new JTextField();
        this.mecano4 = new JLabel();
        this.jTextField38 = new JTextField();
        this.nom4 = new JLabel();
        this.jTextField40 = new JTextField();
        this.cnr4 = new JLabel();
        this.cin4 = new JLabel();
        this.jTextField41 = new JTextField();
        this.jTextField42 = new JTextField();
        this.montant4 = new JLabel();
        this.jTextField43 = new JTextField();
        this.ne5 = new JLabel();
        this.jTextField44 = new JTextField();
        this.mecano5 = new JLabel();
        this.jTextField45 = new JTextField();
        this.nom5 = new JLabel();
        this.jTextField47 = new JTextField();
        this.cnr5 = new JLabel();
        this.cin5 = new JLabel();
        this.jTextField48 = new JTextField();
        this.jTextField49 = new JTextField();
        this.montant5 = new JLabel();
        this.jTextField50 = new JTextField();
        this.ne6 = new JLabel();
        this.jTextField51 = new JTextField();
        this.mecano6 = new JLabel();
        this.jTextField52 = new JTextField();
        this.nom6 = new JLabel();
        this.jTextField54 = new JTextField();
        this.cnr6 = new JLabel();
        this.cin6 = new JLabel();
        this.jTextField55 = new JTextField();
        this.jTextField56 = new JTextField();
        this.montant6 = new JLabel();
        this.jTextField57 = new JTextField();
        this.ne7 = new JLabel();
        this.jTextField58 = new JTextField();
        this.mecano7 = new JLabel();
        this.jTextField59 = new JTextField();
        this.nom7 = new JLabel();
        this.jTextField61 = new JTextField();
        this.cnr7 = new JLabel();
        this.cin7 = new JLabel();
        this.jTextField62 = new JTextField();
        this.jTextField63 = new JTextField();
        this.montant7 = new JLabel();
        this.jTextField64 = new JTextField();
        this.jTextField65 = new JTextField();
        this.dateetat22 = new JLabel();
        this.jTextField66 = new JTextField();
        this.dateetat23 = new JLabel();
        this.cnretat8 = new JLabel();
        this.jTextField69 = new JTextField();
        this.montantetat8 = new JLabel();
        this.jTextField70 = new JTextField();
        this.cinetat8 = new JLabel();
        this.jTextField71 = new JTextField();
        this.cinetat9 = new JLabel();
        this.jTextField72 = new JTextField();
        this.montantetat9 = new JLabel();
        this.jTextField73 = new JTextField();
        this.cnretat9 = new JLabel();
        this.jTextField74 = new JTextField();
        this.dateetat26 = new JLabel();
        this.jTextField77 = new JTextField();
        this.dateetat27 = new JLabel();
        this.jTextField78 = new JTextField();
        this.dateetat28 = new JLabel();
        this.jTextField79 = new JTextField();
        this.dateetat29 = new JLabel();
        this.jTextField80 = new JTextField();
        this.cnretat10 = new JLabel();
        this.jTextField83 = new JTextField();
        this.montantetat10 = new JLabel();
        this.jTextField84 = new JTextField();
        this.cinetat10 = new JLabel();
        this.jTextField85 = new JTextField();
        this.cinetat11 = new JLabel();
        this.jTextField86 = new JTextField();
        this.montantetat11 = new JLabel();
        this.jTextField87 = new JTextField();
        this.cnretat11 = new JLabel();
        this.jTextField88 = new JTextField();
        this.dateetat32 = new JLabel();
        this.jTextField91 = new JTextField();
        this.dateetat33 = new JLabel();
        this.jTextField92 = new JTextField();
        this.dateetat34 = new JLabel();
        this.jTextField93 = new JTextField();
        this.dateetat35 = new JLabel();
        this.jTextField95 = new JTextField();
        this.cnretat13 = new JLabel();
        this.jTextField100 = new JTextField();
        this.montantetat13 = new JLabel();
        this.jTextField101 = new JTextField();
        this.cinetat12 = new JLabel();
        this.jTextField102 = new JTextField();
        this.cinetat13 = new JLabel();
        this.jTextField103 = new JTextField();
        this.montantetat14 = new JLabel();
        this.jTextField104 = new JTextField();
        this.cnretat14 = new JLabel();
        this.jTextField105 = new JTextField();
        this.dateetat38 = new JLabel();
        this.jTextField108 = new JTextField();
        this.dateetat39 = new JLabel();
        this.ne8 = new JLabel();
        this.jTextField109 = new JTextField();
        this.jTextField110 = new JTextField();
        this.mecano8 = new JLabel();
        this.jTextField111 = new JTextField();
        this.nom8 = new JLabel();
        this.jTextField113 = new JTextField();
        this.cnr8 = new JLabel();
        this.jTextField114 = new JTextField();
        this.cin8 = new JLabel();
        this.jTextField115 = new JTextField();
        this.montant8 = new JLabel();
        this.jTextField116 = new JTextField();
        this.montant9 = new JLabel();
        this.jTextField117 = new JTextField();
        this.cin9 = new JLabel();
        this.jTextField118 = new JTextField();
        this.cnr9 = new JLabel();
        this.jTextField119 = new JTextField();
        this.nom9 = new JLabel();
        this.jTextField120 = new JTextField();
        this.mecano9 = new JLabel();
        this.jTextField122 = new JTextField();
        this.ne9 = new JLabel();
        this.jTextField123 = new JTextField();
        this.ne10 = new JLabel();
        this.jTextField124 = new JTextField();
        this.mecano10 = new JLabel();
        this.jTextField125 = new JTextField();
        this.nom10 = new JLabel();
        this.jTextField127 = new JTextField();
        this.cnr10 = new JLabel();
        this.jTextField128 = new JTextField();
        this.cin10 = new JLabel();
        this.jTextField129 = new JTextField();
        this.montant10 = new JLabel();
        this.jTextField130 = new JTextField();
        this.montant11 = new JLabel();
        this.jTextField131 = new JTextField();
        this.cin11 = new JLabel();
        this.jTextField132 = new JTextField();
        this.cnr11 = new JLabel();
        this.jTextField133 = new JTextField();
        this.nom11 = new JLabel();
        this.jTextField134 = new JTextField();
        this.mecano11 = new JLabel();
        this.jTextField136 = new JTextField();
        this.ne11 = new JLabel();
        this.jTextField137 = new JTextField();
        this.ne12 = new JLabel();
        this.jTextField138 = new JTextField();
        this.mecano12 = new JLabel();
        this.jTextField139 = new JTextField();
        this.nom12 = new JLabel();
        this.jTextField141 = new JTextField();
        this.cnr12 = new JLabel();
        this.jTextField142 = new JTextField();
        this.cin12 = new JLabel();
        this.jTextField143 = new JTextField();
        this.montant12 = new JLabel();
        this.jTextField144 = new JTextField();
        this.montant13 = new JLabel();
        this.jTextField145 = new JTextField();
        this.cin13 = new JLabel();
        this.jTextField146 = new JTextField();
        this.cnr13 = new JLabel();
        this.jTextField147 = new JTextField();
        this.nom13 = new JLabel();
        this.jTextField148 = new JTextField();
        this.mecano13 = new JLabel();
        this.jTextField150 = new JTextField();
        this.ne13 = new JLabel();
        this.jTextField151 = new JTextField();
        this.montant15 = new JLabel();
        this.jTextField152 = new JTextField();
        this.cin15 = new JLabel();
        this.jTextField153 = new JTextField();
        this.cnr15 = new JLabel();
        this.jTextField154 = new JTextField();
        this.nom15 = new JLabel();
        this.jTextField155 = new JTextField();
        this.mecano15 = new JLabel();
        this.jTextField157 = new JTextField();
        this.ne15 = new JLabel();
        this.jTextField158 = new JTextField();
        this.ne14 = new JLabel();
        this.jTextField159 = new JTextField();
        this.mecano14 = new JLabel();
        this.nom14 = new JLabel();
        this.jTextField160 = new JTextField();
        this.cnr14 = new JLabel();
        this.jTextField161 = new JTextField();
        this.cin14 = new JLabel();
        this.jTextField162 = new JTextField();
        this.montant14 = new JLabel();
        this.jTextField163 = new JTextField();
        this.jTextField165 = new JTextField();
        this.mecano17 = new JLabel();
        this.jTextField167 = new JTextField();
        this.nom17 = new JLabel();
        this.jTextField169 = new JTextField();
        this.cnr17 = new JLabel();
        this.jTextField170 = new JTextField();
        this.cin17 = new JLabel();
        this.jTextField171 = new JTextField();
        this.montant17 = new JLabel();
        this.jTextField172 = new JTextField();
        this.montant16 = new JLabel();
        this.jTextField173 = new JTextField();
        this.cin16 = new JLabel();
        this.jTextField174 = new JTextField();
        this.cnr16 = new JLabel();
        this.jTextField175 = new JTextField();
        this.nom16 = new JLabel();
        this.jTextField176 = new JTextField();
        this.mecano16 = new JLabel();
        this.jTextField178 = new JTextField();
        this.ne16 = new JLabel();
        this.ne17 = new JLabel();
        this.jTextField179 = new JTextField();
        this.jTextField180 = new JTextField();
        this.numpage = new JLabel();
        this.jLabel12 = new JLabel();
        this.setLayout(null);
        this.jPanel1.setLayout(null);
        this.jLabel3.setFont(new Font("Tahoma", 0, 18));
        this.jLabel3.setForeground(new Color(0, 153, 255));
        this.jLabel3.setText("Numero Dossier");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(4, 16, 125, 22);
        this.jLabel4.setFont(new Font("Tahoma", 0, 18));
        this.jLabel4.setForeground(new Color(0, 153, 255));
        this.jLabel4.setText("Montant :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(320, 20, 77, 22);
        this.jTextField1.setFont(new Font("Tahoma", 0, 14));
        this.jTextField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jTextField1);
        this.jTextField1.setBounds(168, 11, 121, 35);
        this.jComboBox1.setFont(new Font("Tahoma", 0, 24));
        this.jComboBox1.setForeground(new Color(255, 0, 0));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{"aucune", "BT", "BNA", "UIB", "BH", "ATB", "STB"}));
        this.jComboBox1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jComboBox1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jComboBox1);
        this.jComboBox1.setBounds(170, 60, 116, 35);
        this.jLabel5.setFont(new Font("Tahoma", 0, 18));
        this.jLabel5.setForeground(new Color(0, 153, 255));
        this.jLabel5.setText("Banque");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(10, 70, 59, 22);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "liste des adherents", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                montantvirement.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setBorder(BorderFactory.createTitledBorder(null, "", 2, 0));
        this.jTable1.setFont(new Font("Tahoma", 0, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"N dosier", "Nom ET PRENOM", "N\u00b0 de virement", "montant"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{String.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                montantvirement.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                montantvirement.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                montantvirement.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 190, 660, 330);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Liste des adherents de la banque:");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(60, 120, 258, 21);
        this.jLabel6.setFont(new Font("Tahoma", 1, 24));
        this.jLabel6.setForeground(new Color(204, 0, 0));
        this.jLabel6.setText("..........");
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(360, 110, 80, 29);
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(330, 60, 73, 33);
        this.imprimer.setFont(new Font("Tahoma", 1, 12));
        this.imprimer.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.imprimer.setText("Imprimer");
        this.imprimer.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.imprimerActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.imprimer);
        this.imprimer.setBounds(500, 150, 115, 40);
        this.jPanel2.setBackground(new Color(255, 255, 255));
        this.jPanel2.setLayout(null);
        this.uibchiffre.setFont(new Font("Tahoma", 1, 12));
        this.jPanel2.add(this.uibchiffre);
        this.uibchiffre.setBounds(350, 110, 250, 20);
        this.uiblettre.setFont(new Font("Tahoma", 1, 18));
        this.jPanel2.add(this.uiblettre);
        this.uiblettre.setBounds(69, 125, 410, 30);
        this.btenlettre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.btenlettre);
        this.btenlettre.setBounds(10, 160, 490, 20);
        this.btchiffre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.btchiffre);
        this.btchiffre.setBounds(90, 190, 170, 30);
        this.bhletre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.bhletre);
        this.bhletre.setBounds(10, 130, 340, 20);
        this.bhchiffre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.bhchiffre);
        this.bhchiffre.setBounds(370, 140, 130, 20);
        this.atbchiffre.setFont(new Font("Tahoma", 1, 12));
        this.jPanel2.add(this.atbchiffre);
        this.atbchiffre.setBounds(400, 310, 150, 30);
        this.ATBlettre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.ATBlettre);
        this.ATBlettre.setBounds(10, 220, 310, 30);
        this.BNAchiffre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.BNAchiffre);
        this.BNAchiffre.setBounds(120, 260, 100, 30);
        this.bnalettre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.bnalettre);
        this.bnalettre.setBounds(100, 300, 300, 30);
        this.STBlettre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.STBlettre);
        this.STBlettre.setBounds(20, 264, 430, 40);
        this.STBchiffre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.STBchiffre);
        this.STBchiffre.setBounds(110, 144, 300, 40);
        this.jPanel1.add(this.jPanel2);
        this.jPanel2.setBounds(0, 423, 640, 10);
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jTextField2);
        this.jTextField2.setBounds(410, 10, 220, 32);
        this.jButton1.setFont(new Font("Tahoma", 1, 11));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/ajouter rdv.png")));
        this.jButton1.setText("Ajouter");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(500, 50, 111, 41);
        this.jButton3.setFont(new Font("Tahoma", 1, 12));
        this.jButton3.setText("Historique");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(500, 100, 110, 40);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(10, 0, 667, 530);
        this.jPanel3.setLayout(null);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setLayout(null);
        this.jLabel10.setFont(new Font("Tahoma", 1, 24));
        this.jLabel10.setText("ETAT DES Virment Bancair ");
        this.jPanel4.add(this.jLabel10);
        this.jLabel10.setBounds(120, 10, 400, 20);
        this.nom1.setFont(new Font("Tahoma", 0, 10));
        this.nom1.setText(".....................");
        this.jPanel4.add(this.nom1);
        this.nom1.setBounds(100, 100, 130, 20);
        this.jTextField13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField13);
        this.jTextField13.setBounds(90, 90, 160, 40);
        this.jTextField14.setFont(new Font("Tahoma", 1, 14));
        this.jTextField14.setText("     Nom et Prenom");
        this.jTextField14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField14.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jTextField14ActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.jTextField14);
        this.jTextField14.setBounds(90, 60, 160, 30);
        this.jTextField15.setFont(new Font("Tahoma", 1, 14));
        this.jTextField15.setText("     RIB");
        this.jTextField15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jTextField15ActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.jTextField15);
        this.jTextField15.setBounds(250, 60, 130, 30);
        this.cnr1.setFont(new Font("Tahoma", 0, 10));
        this.cnr1.setText("....................");
        this.jPanel4.add(this.cnr1);
        this.cnr1.setBounds(260, 90, 110, 40);
        this.jTextField16.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField16);
        this.jTextField16.setBounds(250, 90, 130, 40);
        this.cin1.setFont(new Font("Tahoma", 0, 10));
        this.cin1.setText("..................");
        this.jPanel4.add(this.cin1);
        this.cin1.setBounds(390, 90, 54, 40);
        this.jTextField17.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField17);
        this.jTextField17.setBounds(380, 90, 90, 40);
        this.jTextField18.setFont(new Font("Tahoma", 1, 14));
        this.jTextField18.setText("  Montant");
        this.jTextField18.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField18.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jTextField18ActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.jTextField18);
        this.jTextField18.setBounds(380, 60, 90, 30);
        this.jTextField19.setFont(new Font("Tahoma", 1, 14));
        this.jTextField19.setText("  Profession");
        this.jTextField19.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.jTextField19ActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.jTextField19);
        this.jTextField19.setBounds(470, 60, 90, 30);
        this.montant1.setFont(new Font("Tahoma", 0, 10));
        this.montant1.setText("...........");
        this.jPanel4.add(this.montant1);
        this.montant1.setBounds(480, 100, 70, 20);
        this.jTextField20.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField20);
        this.jTextField20.setBounds(470, 90, 90, 40);
        this.mecano1.setFont(new Font("Tahoma", 0, 10));
        this.mecano1.setText("...............");
        this.jPanel4.add(this.mecano1);
        this.mecano1.setBounds(40, 90, 40, 40);
        this.Mecano.setFont(new Font("Tahoma", 1, 14));
        this.Mecano.setText("Mecano");
        this.Mecano.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.Mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.MecanoActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.Mecano);
        this.Mecano.setBounds(30, 60, 60, 30);
        this.jTextField22.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField22);
        this.jTextField22.setBounds(30, 90, 60, 40);
        this.Mecano1.setFont(new Font("Tahoma", 1, 14));
        this.Mecano1.setText("N\u00b0");
        this.Mecano1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.Mecano1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirement.this.Mecano1ActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.Mecano1);
        this.Mecano1.setBounds(0, 60, 30, 30);
        this.ne1.setFont(new Font("Tahoma", 0, 10));
        this.ne1.setText("1");
        this.jPanel4.add(this.ne1);
        this.ne1.setBounds(10, 90, 20, 40);
        this.jTextField23.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField23);
        this.jTextField23.setBounds(0, 90, 30, 40);
        this.somme.setFont(new Font("Tahoma", 0, 12));
        this.somme.setForeground(new Color(153, 0, 0));
        this.somme.setText("..................");
        this.jPanel4.add(this.somme);
        this.somme.setBounds(472, 770, 80, 40);
        this.cnretat12.setFont(new Font("Tahoma", 1, 14));
        this.cnretat12.setForeground(new Color(153, 0, 0));
        this.cnretat12.setText("Total");
        this.jPanel4.add(this.cnretat12);
        this.cnretat12.setBounds(400, 770, 60, 30);
        this.total.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.total);
        this.total.setBounds(470, 770, 90, 40);
        this.jTextField99.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField99);
        this.jTextField99.setBounds(380, 770, 90, 40);
        this.ne2.setFont(new Font("Tahoma", 0, 10));
        this.ne2.setText("2");
        this.jPanel4.add(this.ne2);
        this.ne2.setBounds(10, 130, 20, 40);
        this.jTextField24.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField24);
        this.jTextField24.setBounds(0, 130, 30, 40);
        this.mecano2.setFont(new Font("Tahoma", 0, 10));
        this.mecano2.setText("...............");
        this.jPanel4.add(this.mecano2);
        this.mecano2.setBounds(40, 130, 40, 40);
        this.jTextField25.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField25);
        this.jTextField25.setBounds(30, 130, 60, 40);
        this.nom2.setFont(new Font("Tahoma", 0, 10));
        this.nom2.setText(".....................");
        this.jPanel4.add(this.nom2);
        this.nom2.setBounds(100, 140, 140, 20);
        this.jTextField26.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField26);
        this.jTextField26.setBounds(90, 130, 160, 40);
        this.cnr2.setFont(new Font("Tahoma", 0, 10));
        this.cnr2.setText("....................");
        this.jPanel4.add(this.cnr2);
        this.cnr2.setBounds(260, 130, 110, 40);
        this.cin2.setFont(new Font("Tahoma", 0, 10));
        this.cin2.setText("..................");
        this.jPanel4.add(this.cin2);
        this.cin2.setBounds(390, 130, 54, 40);
        this.jTextField27.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField27);
        this.jTextField27.setBounds(250, 130, 130, 40);
        this.jTextField28.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField28);
        this.jTextField28.setBounds(380, 130, 90, 40);
        this.montant2.setFont(new Font("Tahoma", 0, 10));
        this.montant2.setText("...........");
        this.jPanel4.add(this.montant2);
        this.montant2.setBounds(480, 140, 70, 30);
        this.jTextField29.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField29);
        this.jTextField29.setBounds(470, 130, 90, 40);
        this.ne3.setFont(new Font("Tahoma", 0, 10));
        this.ne3.setText("3");
        this.jPanel4.add(this.ne3);
        this.ne3.setBounds(10, 170, 20, 40);
        this.jTextField30.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField30);
        this.jTextField30.setBounds(0, 170, 30, 40);
        this.mecano3.setFont(new Font("Tahoma", 0, 10));
        this.mecano3.setText("...............");
        this.jPanel4.add(this.mecano3);
        this.mecano3.setBounds(40, 170, 40, 40);
        this.jTextField31.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField31);
        this.jTextField31.setBounds(30, 170, 60, 40);
        this.nom3.setFont(new Font("Tahoma", 0, 10));
        this.nom3.setText(".....................");
        this.jPanel4.add(this.nom3);
        this.nom3.setBounds(100, 180, 130, 20);
        this.jTextField33.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField33);
        this.jTextField33.setBounds(90, 170, 160, 40);
        this.cnr3.setFont(new Font("Tahoma", 0, 10));
        this.cnr3.setText("....................");
        this.jPanel4.add(this.cnr3);
        this.cnr3.setBounds(260, 170, 110, 40);
        this.cin3.setFont(new Font("Tahoma", 0, 10));
        this.cin3.setText("..................");
        this.jPanel4.add(this.cin3);
        this.cin3.setBounds(390, 170, 54, 40);
        this.jTextField34.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField34);
        this.jTextField34.setBounds(250, 170, 130, 40);
        this.jTextField35.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField35);
        this.jTextField35.setBounds(380, 170, 90, 40);
        this.montant3.setFont(new Font("Tahoma", 0, 10));
        this.montant3.setText("...........");
        this.jPanel4.add(this.montant3);
        this.montant3.setBounds(480, 180, 70, 30);
        this.jTextField36.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField36);
        this.jTextField36.setBounds(470, 170, 90, 40);
        this.ne4.setFont(new Font("Tahoma", 0, 10));
        this.ne4.setText("4");
        this.jPanel4.add(this.ne4);
        this.ne4.setBounds(10, 210, 20, 40);
        this.oppio.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.oppio);
        this.oppio.setBounds(0, 210, 30, 40);
        this.mecano4.setFont(new Font("Tahoma", 0, 10));
        this.mecano4.setText("...............");
        this.jPanel4.add(this.mecano4);
        this.mecano4.setBounds(40, 210, 40, 40);
        this.jTextField38.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField38);
        this.jTextField38.setBounds(30, 210, 60, 40);
        this.nom4.setFont(new Font("Tahoma", 0, 10));
        this.nom4.setText(".....................");
        this.jPanel4.add(this.nom4);
        this.nom4.setBounds(100, 220, 130, 20);
        this.jTextField40.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField40);
        this.jTextField40.setBounds(90, 210, 160, 40);
        this.cnr4.setFont(new Font("Tahoma", 0, 10));
        this.cnr4.setText("....................");
        this.jPanel4.add(this.cnr4);
        this.cnr4.setBounds(260, 210, 110, 40);
        this.cin4.setFont(new Font("Tahoma", 0, 10));
        this.cin4.setText("..................");
        this.jPanel4.add(this.cin4);
        this.cin4.setBounds(390, 210, 54, 40);
        this.jTextField41.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField41);
        this.jTextField41.setBounds(250, 210, 130, 40);
        this.jTextField42.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField42);
        this.jTextField42.setBounds(380, 210, 90, 40);
        this.montant4.setFont(new Font("Tahoma", 0, 10));
        this.montant4.setText("...........");
        this.jPanel4.add(this.montant4);
        this.montant4.setBounds(480, 220, 70, 30);
        this.jTextField43.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField43);
        this.jTextField43.setBounds(470, 210, 90, 40);
        this.ne5.setFont(new Font("Tahoma", 0, 10));
        this.ne5.setText("5");
        this.jPanel4.add(this.ne5);
        this.ne5.setBounds(10, 250, 20, 40);
        this.jTextField44.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField44);
        this.jTextField44.setBounds(0, 250, 30, 40);
        this.mecano5.setFont(new Font("Tahoma", 0, 10));
        this.mecano5.setText("...............");
        this.jPanel4.add(this.mecano5);
        this.mecano5.setBounds(40, 250, 40, 40);
        this.jTextField45.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField45);
        this.jTextField45.setBounds(30, 250, 60, 40);
        this.nom5.setFont(new Font("Tahoma", 0, 10));
        this.nom5.setText(".....................");
        this.jPanel4.add(this.nom5);
        this.nom5.setBounds(100, 260, 130, 20);
        this.jTextField47.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField47);
        this.jTextField47.setBounds(90, 250, 160, 40);
        this.cnr5.setFont(new Font("Tahoma", 0, 10));
        this.cnr5.setText("....................");
        this.jPanel4.add(this.cnr5);
        this.cnr5.setBounds(260, 250, 110, 40);
        this.cin5.setFont(new Font("Tahoma", 0, 10));
        this.cin5.setText("..................");
        this.jPanel4.add(this.cin5);
        this.cin5.setBounds(390, 250, 54, 40);
        this.jTextField48.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField48);
        this.jTextField48.setBounds(250, 250, 130, 40);
        this.jTextField49.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField49);
        this.jTextField49.setBounds(380, 250, 90, 40);
        this.montant5.setFont(new Font("Tahoma", 0, 10));
        this.montant5.setText("...........");
        this.jPanel4.add(this.montant5);
        this.montant5.setBounds(480, 260, 70, 30);
        this.jTextField50.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField50);
        this.jTextField50.setBounds(470, 250, 90, 40);
        this.ne6.setFont(new Font("Tahoma", 0, 10));
        this.ne6.setText("6");
        this.jPanel4.add(this.ne6);
        this.ne6.setBounds(10, 290, 20, 40);
        this.jTextField51.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField51);
        this.jTextField51.setBounds(0, 290, 30, 40);
        this.mecano6.setFont(new Font("Tahoma", 0, 10));
        this.mecano6.setText("...............");
        this.jPanel4.add(this.mecano6);
        this.mecano6.setBounds(40, 290, 40, 40);
        this.jTextField52.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField52);
        this.jTextField52.setBounds(30, 290, 60, 40);
        this.nom6.setFont(new Font("Tahoma", 0, 10));
        this.nom6.setText(".....................");
        this.jPanel4.add(this.nom6);
        this.nom6.setBounds(100, 300, 130, 20);
        this.jTextField54.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField54);
        this.jTextField54.setBounds(90, 290, 160, 40);
        this.cnr6.setFont(new Font("Tahoma", 0, 10));
        this.cnr6.setText("....................");
        this.jPanel4.add(this.cnr6);
        this.cnr6.setBounds(260, 290, 110, 40);
        this.cin6.setFont(new Font("Tahoma", 0, 10));
        this.cin6.setText("..................");
        this.jPanel4.add(this.cin6);
        this.cin6.setBounds(390, 290, 54, 40);
        this.jTextField55.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField55);
        this.jTextField55.setBounds(250, 290, 130, 40);
        this.jTextField56.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField56);
        this.jTextField56.setBounds(380, 290, 90, 40);
        this.montant6.setFont(new Font("Tahoma", 0, 10));
        this.montant6.setText("...........");
        this.jPanel4.add(this.montant6);
        this.montant6.setBounds(480, 300, 70, 30);
        this.jTextField57.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField57);
        this.jTextField57.setBounds(470, 290, 90, 40);
        this.ne7.setFont(new Font("Tahoma", 0, 10));
        this.ne7.setText("7");
        this.jPanel4.add(this.ne7);
        this.ne7.setBounds(10, 330, 20, 40);
        this.jTextField58.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField58);
        this.jTextField58.setBounds(0, 330, 30, 40);
        this.mecano7.setFont(new Font("Tahoma", 0, 10));
        this.mecano7.setText("...............");
        this.jPanel4.add(this.mecano7);
        this.mecano7.setBounds(40, 330, 40, 40);
        this.jTextField59.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField59);
        this.jTextField59.setBounds(30, 330, 60, 40);
        this.nom7.setFont(new Font("Tahoma", 0, 10));
        this.nom7.setText(".....................");
        this.jPanel4.add(this.nom7);
        this.nom7.setBounds(100, 340, 130, 20);
        this.jTextField61.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField61);
        this.jTextField61.setBounds(90, 330, 160, 40);
        this.cnr7.setFont(new Font("Tahoma", 0, 10));
        this.cnr7.setText("....................");
        this.jPanel4.add(this.cnr7);
        this.cnr7.setBounds(260, 330, 110, 40);
        this.cin7.setFont(new Font("Tahoma", 0, 10));
        this.cin7.setText("..................");
        this.jPanel4.add(this.cin7);
        this.cin7.setBounds(390, 330, 54, 40);
        this.jTextField62.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField62);
        this.jTextField62.setBounds(250, 330, 130, 40);
        this.jTextField63.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField63);
        this.jTextField63.setBounds(380, 330, 90, 40);
        this.montant7.setFont(new Font("Tahoma", 0, 10));
        this.montant7.setText("...........");
        this.jPanel4.add(this.montant7);
        this.montant7.setBounds(480, 340, 70, 30);
        this.jTextField64.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField64);
        this.jTextField64.setBounds(470, 330, 90, 40);
        this.jTextField65.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField65);
        this.jTextField65.setBounds(0, 90, 30, 40);
        this.dateetat22.setFont(new Font("Tahoma", 0, 10));
        this.dateetat22.setText("...............");
        this.jPanel4.add(this.dateetat22);
        this.dateetat22.setBounds(40, 90, 40, 40);
        this.jTextField66.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField66);
        this.jTextField66.setBounds(30, 90, 60, 40);
        this.dateetat23.setFont(new Font("Tahoma", 0, 10));
        this.dateetat23.setText("1");
        this.jPanel4.add(this.dateetat23);
        this.dateetat23.setBounds(10, 90, 20, 40);
        this.cnretat8.setFont(new Font("Tahoma", 0, 12));
        this.cnretat8.setText("....................");
        this.jPanel4.add(this.cnretat8);
        this.cnretat8.setBounds(300, 90, 70, 40);
        this.jTextField69.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField69);
        this.jTextField69.setBounds(290, 90, 90, 40);
        this.montantetat8.setFont(new Font("Tahoma", 0, 12));
        this.montantetat8.setText("..................");
        this.jPanel4.add(this.montantetat8);
        this.montantetat8.setBounds(390, 90, 72, 40);
        this.jTextField70.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField70);
        this.jTextField70.setBounds(380, 90, 90, 40);
        this.cinetat8.setFont(new Font("Tahoma", 0, 10));
        this.cinetat8.setText("...........");
        this.jPanel4.add(this.cinetat8);
        this.cinetat8.setBounds(480, 100, 60, 30);
        this.jTextField71.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField71);
        this.jTextField71.setBounds(470, 90, 80, 40);
        this.cinetat9.setFont(new Font("Tahoma", 0, 10));
        this.cinetat9.setText("...........");
        this.jPanel4.add(this.cinetat9);
        this.cinetat9.setBounds(480, 140, 60, 30);
        this.jTextField72.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField72);
        this.jTextField72.setBounds(470, 130, 80, 40);
        this.montantetat9.setFont(new Font("Tahoma", 0, 12));
        this.montantetat9.setText("..................");
        this.jPanel4.add(this.montantetat9);
        this.montantetat9.setBounds(390, 130, 72, 40);
        this.jTextField73.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField73);
        this.jTextField73.setBounds(380, 130, 90, 40);
        this.cnretat9.setFont(new Font("Tahoma", 0, 12));
        this.cnretat9.setText("....................");
        this.jPanel4.add(this.cnretat9);
        this.cnretat9.setBounds(300, 130, 70, 40);
        this.jTextField74.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField74);
        this.jTextField74.setBounds(290, 130, 90, 40);
        this.dateetat26.setFont(new Font("Tahoma", 0, 10));
        this.dateetat26.setText("...............");
        this.jPanel4.add(this.dateetat26);
        this.dateetat26.setBounds(40, 130, 40, 40);
        this.jTextField77.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField77);
        this.jTextField77.setBounds(30, 130, 60, 40);
        this.dateetat27.setFont(new Font("Tahoma", 0, 10));
        this.dateetat27.setText("2");
        this.jPanel4.add(this.dateetat27);
        this.dateetat27.setBounds(10, 130, 20, 40);
        this.jTextField78.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField78);
        this.jTextField78.setBounds(0, 130, 30, 40);
        this.dateetat28.setFont(new Font("Tahoma", 0, 10));
        this.dateetat28.setText("3");
        this.jPanel4.add(this.dateetat28);
        this.dateetat28.setBounds(10, 170, 20, 40);
        this.jTextField79.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField79);
        this.jTextField79.setBounds(0, 170, 30, 40);
        this.dateetat29.setFont(new Font("Tahoma", 0, 10));
        this.dateetat29.setText("...............");
        this.jPanel4.add(this.dateetat29);
        this.dateetat29.setBounds(40, 170, 40, 40);
        this.jTextField80.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField80);
        this.jTextField80.setBounds(30, 170, 60, 40);
        this.cnretat10.setFont(new Font("Tahoma", 0, 12));
        this.cnretat10.setText("....................");
        this.jPanel4.add(this.cnretat10);
        this.cnretat10.setBounds(300, 170, 70, 40);
        this.jTextField83.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField83);
        this.jTextField83.setBounds(290, 170, 90, 40);
        this.montantetat10.setFont(new Font("Tahoma", 0, 12));
        this.montantetat10.setText("..................");
        this.jPanel4.add(this.montantetat10);
        this.montantetat10.setBounds(390, 170, 72, 40);
        this.jTextField84.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField84);
        this.jTextField84.setBounds(380, 170, 90, 40);
        this.cinetat10.setFont(new Font("Tahoma", 0, 10));
        this.cinetat10.setText("...........");
        this.jPanel4.add(this.cinetat10);
        this.cinetat10.setBounds(480, 180, 60, 30);
        this.jTextField85.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField85);
        this.jTextField85.setBounds(470, 170, 80, 40);
        this.cinetat11.setFont(new Font("Tahoma", 0, 10));
        this.cinetat11.setText("...........");
        this.jPanel4.add(this.cinetat11);
        this.cinetat11.setBounds(480, 220, 60, 30);
        this.jTextField86.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField86);
        this.jTextField86.setBounds(470, 210, 80, 40);
        this.montantetat11.setFont(new Font("Tahoma", 0, 12));
        this.montantetat11.setText("..................");
        this.jPanel4.add(this.montantetat11);
        this.montantetat11.setBounds(390, 210, 72, 40);
        this.jTextField87.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField87);
        this.jTextField87.setBounds(380, 210, 90, 40);
        this.cnretat11.setFont(new Font("Tahoma", 0, 12));
        this.cnretat11.setText("....................");
        this.jPanel4.add(this.cnretat11);
        this.cnretat11.setBounds(300, 210, 70, 40);
        this.jTextField88.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField88);
        this.jTextField88.setBounds(290, 210, 90, 40);
        this.dateetat32.setFont(new Font("Tahoma", 0, 10));
        this.dateetat32.setText("...............");
        this.jPanel4.add(this.dateetat32);
        this.dateetat32.setBounds(40, 210, 40, 40);
        this.jTextField91.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField91);
        this.jTextField91.setBounds(30, 210, 60, 40);
        this.dateetat33.setFont(new Font("Tahoma", 0, 10));
        this.dateetat33.setText("4");
        this.jPanel4.add(this.dateetat33);
        this.dateetat33.setBounds(10, 210, 20, 40);
        this.jTextField92.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField92);
        this.jTextField92.setBounds(0, 210, 30, 40);
        this.dateetat34.setFont(new Font("Tahoma", 0, 10));
        this.dateetat34.setText("5");
        this.jPanel4.add(this.dateetat34);
        this.dateetat34.setBounds(10, 250, 20, 40);
        this.jTextField93.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField93);
        this.jTextField93.setBounds(0, 250, 30, 40);
        this.dateetat35.setFont(new Font("Tahoma", 0, 10));
        this.dateetat35.setText("...............");
        this.jPanel4.add(this.dateetat35);
        this.dateetat35.setBounds(40, 250, 40, 40);
        this.jTextField95.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField95);
        this.jTextField95.setBounds(30, 250, 60, 40);
        this.cnretat13.setFont(new Font("Tahoma", 0, 12));
        this.cnretat13.setText("....................");
        this.jPanel4.add(this.cnretat13);
        this.cnretat13.setBounds(300, 250, 70, 40);
        this.jTextField100.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField100);
        this.jTextField100.setBounds(290, 250, 90, 40);
        this.montantetat13.setFont(new Font("Tahoma", 0, 12));
        this.montantetat13.setText("..................");
        this.jPanel4.add(this.montantetat13);
        this.montantetat13.setBounds(390, 250, 72, 40);
        this.jTextField101.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField101);
        this.jTextField101.setBounds(380, 250, 90, 40);
        this.cinetat12.setFont(new Font("Tahoma", 0, 10));
        this.cinetat12.setText("...........");
        this.jPanel4.add(this.cinetat12);
        this.cinetat12.setBounds(480, 260, 60, 30);
        this.jTextField102.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField102);
        this.jTextField102.setBounds(470, 250, 80, 40);
        this.cinetat13.setFont(new Font("Tahoma", 0, 10));
        this.cinetat13.setText("...........");
        this.jPanel4.add(this.cinetat13);
        this.cinetat13.setBounds(480, 300, 60, 30);
        this.jTextField103.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField103);
        this.jTextField103.setBounds(470, 290, 80, 40);
        this.montantetat14.setFont(new Font("Tahoma", 0, 12));
        this.montantetat14.setText("..................");
        this.jPanel4.add(this.montantetat14);
        this.montantetat14.setBounds(390, 290, 72, 40);
        this.jTextField104.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField104);
        this.jTextField104.setBounds(380, 290, 90, 40);
        this.cnretat14.setFont(new Font("Tahoma", 0, 12));
        this.cnretat14.setText("....................");
        this.jPanel4.add(this.cnretat14);
        this.cnretat14.setBounds(300, 290, 70, 40);
        this.jTextField105.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField105);
        this.jTextField105.setBounds(290, 290, 90, 40);
        this.dateetat38.setFont(new Font("Tahoma", 0, 10));
        this.dateetat38.setText("...............");
        this.jPanel4.add(this.dateetat38);
        this.dateetat38.setBounds(40, 290, 40, 40);
        this.jTextField108.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField108);
        this.jTextField108.setBounds(30, 290, 60, 40);
        this.dateetat39.setFont(new Font("Tahoma", 0, 10));
        this.dateetat39.setText("6");
        this.jPanel4.add(this.dateetat39);
        this.dateetat39.setBounds(10, 290, 20, 40);
        this.ne8.setFont(new Font("Tahoma", 0, 10));
        this.ne8.setText("8");
        this.jPanel4.add(this.ne8);
        this.ne8.setBounds(10, 370, 20, 40);
        this.jTextField109.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField109);
        this.jTextField109.setBounds(0, 290, 30, 40);
        this.jTextField110.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField110);
        this.jTextField110.setBounds(0, 370, 30, 40);
        this.mecano8.setFont(new Font("Tahoma", 0, 10));
        this.mecano8.setText("...............");
        this.jPanel4.add(this.mecano8);
        this.mecano8.setBounds(40, 370, 40, 40);
        this.jTextField111.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField111);
        this.jTextField111.setBounds(30, 370, 60, 40);
        this.nom8.setFont(new Font("Tahoma", 0, 10));
        this.nom8.setText(".....................");
        this.jPanel4.add(this.nom8);
        this.nom8.setBounds(100, 380, 130, 20);
        this.jTextField113.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField113);
        this.jTextField113.setBounds(90, 370, 160, 40);
        this.cnr8.setFont(new Font("Tahoma", 0, 10));
        this.cnr8.setText("....................");
        this.jPanel4.add(this.cnr8);
        this.cnr8.setBounds(260, 370, 110, 40);
        this.jTextField114.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField114);
        this.jTextField114.setBounds(250, 370, 130, 40);
        this.cin8.setFont(new Font("Tahoma", 0, 10));
        this.cin8.setText("..................");
        this.jPanel4.add(this.cin8);
        this.cin8.setBounds(390, 370, 54, 40);
        this.jTextField115.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField115);
        this.jTextField115.setBounds(380, 370, 90, 40);
        this.montant8.setFont(new Font("Tahoma", 0, 10));
        this.montant8.setText("...........");
        this.jPanel4.add(this.montant8);
        this.montant8.setBounds(480, 380, 70, 30);
        this.jTextField116.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField116);
        this.jTextField116.setBounds(470, 370, 90, 40);
        this.montant9.setFont(new Font("Tahoma", 0, 10));
        this.montant9.setText("...........");
        this.jPanel4.add(this.montant9);
        this.montant9.setBounds(480, 420, 70, 30);
        this.jTextField117.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField117);
        this.jTextField117.setBounds(470, 410, 90, 40);
        this.cin9.setFont(new Font("Tahoma", 0, 10));
        this.cin9.setText("..................");
        this.jPanel4.add(this.cin9);
        this.cin9.setBounds(390, 410, 54, 40);
        this.jTextField118.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField118);
        this.jTextField118.setBounds(380, 410, 90, 40);
        this.cnr9.setFont(new Font("Tahoma", 0, 10));
        this.cnr9.setText("....................");
        this.jPanel4.add(this.cnr9);
        this.cnr9.setBounds(260, 410, 110, 40);
        this.jTextField119.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField119);
        this.jTextField119.setBounds(250, 410, 130, 40);
        this.nom9.setFont(new Font("Tahoma", 0, 10));
        this.nom9.setText(".....................");
        this.jPanel4.add(this.nom9);
        this.nom9.setBounds(100, 420, 130, 20);
        this.jTextField120.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField120);
        this.jTextField120.setBounds(90, 410, 160, 40);
        this.mecano9.setFont(new Font("Tahoma", 0, 10));
        this.mecano9.setText("...............");
        this.jPanel4.add(this.mecano9);
        this.mecano9.setBounds(40, 410, 40, 40);
        this.jTextField122.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField122);
        this.jTextField122.setBounds(30, 410, 60, 40);
        this.ne9.setFont(new Font("Tahoma", 0, 10));
        this.ne9.setText("9");
        this.jPanel4.add(this.ne9);
        this.ne9.setBounds(10, 410, 20, 40);
        this.jTextField123.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField123);
        this.jTextField123.setBounds(0, 410, 30, 40);
        this.ne10.setFont(new Font("Tahoma", 0, 10));
        this.ne10.setText("10");
        this.jPanel4.add(this.ne10);
        this.ne10.setBounds(10, 450, 20, 40);
        this.jTextField124.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField124);
        this.jTextField124.setBounds(0, 450, 30, 40);
        this.mecano10.setFont(new Font("Tahoma", 0, 10));
        this.mecano10.setText("...............");
        this.jPanel4.add(this.mecano10);
        this.mecano10.setBounds(40, 450, 40, 40);
        this.jTextField125.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField125);
        this.jTextField125.setBounds(30, 450, 60, 40);
        this.nom10.setFont(new Font("Tahoma", 0, 10));
        this.nom10.setText(".....................");
        this.jPanel4.add(this.nom10);
        this.nom10.setBounds(100, 460, 130, 20);
        this.jTextField127.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField127);
        this.jTextField127.setBounds(90, 450, 160, 40);
        this.cnr10.setFont(new Font("Tahoma", 0, 10));
        this.cnr10.setText("....................");
        this.jPanel4.add(this.cnr10);
        this.cnr10.setBounds(260, 450, 110, 40);
        this.jTextField128.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField128);
        this.jTextField128.setBounds(250, 450, 130, 40);
        this.cin10.setFont(new Font("Tahoma", 0, 10));
        this.cin10.setText("..................");
        this.jPanel4.add(this.cin10);
        this.cin10.setBounds(390, 450, 54, 40);
        this.jTextField129.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField129);
        this.jTextField129.setBounds(380, 450, 90, 40);
        this.montant10.setFont(new Font("Tahoma", 0, 10));
        this.montant10.setText("...........");
        this.jPanel4.add(this.montant10);
        this.montant10.setBounds(480, 460, 70, 30);
        this.jTextField130.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField130);
        this.jTextField130.setBounds(470, 450, 90, 40);
        this.montant11.setFont(new Font("Tahoma", 0, 10));
        this.montant11.setText("...........");
        this.jPanel4.add(this.montant11);
        this.montant11.setBounds(480, 500, 70, 30);
        this.jTextField131.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField131);
        this.jTextField131.setBounds(470, 490, 90, 40);
        this.cin11.setFont(new Font("Tahoma", 0, 10));
        this.cin11.setText("..................");
        this.jPanel4.add(this.cin11);
        this.cin11.setBounds(390, 490, 54, 40);
        this.jTextField132.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField132);
        this.jTextField132.setBounds(380, 490, 90, 40);
        this.cnr11.setFont(new Font("Tahoma", 0, 10));
        this.cnr11.setText("....................");
        this.jPanel4.add(this.cnr11);
        this.cnr11.setBounds(260, 490, 110, 40);
        this.jTextField133.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField133);
        this.jTextField133.setBounds(250, 490, 130, 40);
        this.nom11.setFont(new Font("Tahoma", 0, 10));
        this.nom11.setText(".....................");
        this.jPanel4.add(this.nom11);
        this.nom11.setBounds(100, 500, 130, 20);
        this.jTextField134.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField134);
        this.jTextField134.setBounds(90, 490, 160, 40);
        this.mecano11.setFont(new Font("Tahoma", 0, 10));
        this.mecano11.setText("...............");
        this.jPanel4.add(this.mecano11);
        this.mecano11.setBounds(40, 490, 40, 40);
        this.jTextField136.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField136);
        this.jTextField136.setBounds(30, 490, 60, 40);
        this.ne11.setFont(new Font("Tahoma", 0, 10));
        this.ne11.setText("11");
        this.jPanel4.add(this.ne11);
        this.ne11.setBounds(10, 490, 20, 40);
        this.jTextField137.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField137);
        this.jTextField137.setBounds(0, 490, 30, 40);
        this.ne12.setFont(new Font("Tahoma", 0, 10));
        this.ne12.setText("12");
        this.jPanel4.add(this.ne12);
        this.ne12.setBounds(10, 530, 20, 40);
        this.jTextField138.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField138);
        this.jTextField138.setBounds(0, 530, 30, 40);
        this.mecano12.setFont(new Font("Tahoma", 0, 10));
        this.mecano12.setText("...............");
        this.jPanel4.add(this.mecano12);
        this.mecano12.setBounds(40, 530, 40, 40);
        this.jTextField139.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField139);
        this.jTextField139.setBounds(30, 530, 60, 40);
        this.nom12.setFont(new Font("Tahoma", 0, 10));
        this.nom12.setText(".....................");
        this.jPanel4.add(this.nom12);
        this.nom12.setBounds(100, 540, 130, 20);
        this.jTextField141.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField141);
        this.jTextField141.setBounds(90, 530, 160, 40);
        this.cnr12.setFont(new Font("Tahoma", 0, 10));
        this.cnr12.setText("....................");
        this.jPanel4.add(this.cnr12);
        this.cnr12.setBounds(260, 530, 110, 40);
        this.jTextField142.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField142);
        this.jTextField142.setBounds(250, 530, 130, 40);
        this.cin12.setFont(new Font("Tahoma", 0, 10));
        this.cin12.setText("..................");
        this.jPanel4.add(this.cin12);
        this.cin12.setBounds(390, 530, 54, 40);
        this.jTextField143.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField143);
        this.jTextField143.setBounds(380, 530, 90, 40);
        this.montant12.setFont(new Font("Tahoma", 0, 10));
        this.montant12.setText("...........");
        this.jPanel4.add(this.montant12);
        this.montant12.setBounds(480, 540, 70, 30);
        this.jTextField144.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField144);
        this.jTextField144.setBounds(470, 530, 90, 40);
        this.montant13.setFont(new Font("Tahoma", 0, 10));
        this.montant13.setText("...........");
        this.jPanel4.add(this.montant13);
        this.montant13.setBounds(480, 580, 70, 30);
        this.jTextField145.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField145);
        this.jTextField145.setBounds(470, 570, 90, 40);
        this.cin13.setFont(new Font("Tahoma", 0, 10));
        this.cin13.setText("..................");
        this.jPanel4.add(this.cin13);
        this.cin13.setBounds(390, 570, 54, 40);
        this.jTextField146.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField146);
        this.jTextField146.setBounds(380, 570, 90, 40);
        this.cnr13.setFont(new Font("Tahoma", 0, 10));
        this.cnr13.setText("....................");
        this.jPanel4.add(this.cnr13);
        this.cnr13.setBounds(260, 570, 110, 40);
        this.jTextField147.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField147);
        this.jTextField147.setBounds(250, 570, 130, 40);
        this.nom13.setFont(new Font("Tahoma", 0, 10));
        this.nom13.setText(".....................");
        this.jPanel4.add(this.nom13);
        this.nom13.setBounds(100, 580, 130, 20);
        this.jTextField148.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField148);
        this.jTextField148.setBounds(90, 570, 160, 40);
        this.mecano13.setFont(new Font("Tahoma", 0, 10));
        this.mecano13.setText("...............");
        this.jPanel4.add(this.mecano13);
        this.mecano13.setBounds(40, 570, 40, 40);
        this.jTextField150.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField150);
        this.jTextField150.setBounds(30, 570, 60, 40);
        this.ne13.setFont(new Font("Tahoma", 0, 10));
        this.ne13.setText("13");
        this.jPanel4.add(this.ne13);
        this.ne13.setBounds(10, 570, 20, 40);
        this.jTextField151.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField151);
        this.jTextField151.setBounds(0, 570, 30, 40);
        this.montant15.setFont(new Font("Tahoma", 0, 10));
        this.montant15.setText("...........");
        this.jPanel4.add(this.montant15);
        this.montant15.setBounds(480, 660, 70, 30);
        this.jTextField152.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField152);
        this.jTextField152.setBounds(470, 650, 90, 40);
        this.cin15.setFont(new Font("Tahoma", 0, 10));
        this.cin15.setText("..................");
        this.jPanel4.add(this.cin15);
        this.cin15.setBounds(390, 650, 54, 40);
        this.jTextField153.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField153);
        this.jTextField153.setBounds(380, 650, 90, 40);
        this.cnr15.setFont(new Font("Tahoma", 0, 10));
        this.cnr15.setText("....................");
        this.jPanel4.add(this.cnr15);
        this.cnr15.setBounds(260, 650, 110, 40);
        this.jTextField154.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField154);
        this.jTextField154.setBounds(250, 650, 130, 40);
        this.nom15.setFont(new Font("Tahoma", 0, 10));
        this.nom15.setText(".....................");
        this.jPanel4.add(this.nom15);
        this.nom15.setBounds(100, 660, 130, 20);
        this.jTextField155.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField155);
        this.jTextField155.setBounds(90, 650, 160, 40);
        this.mecano15.setFont(new Font("Tahoma", 0, 10));
        this.mecano15.setText("...............");
        this.jPanel4.add(this.mecano15);
        this.mecano15.setBounds(40, 650, 40, 40);
        this.jTextField157.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField157);
        this.jTextField157.setBounds(30, 650, 60, 40);
        this.ne15.setFont(new Font("Tahoma", 0, 10));
        this.ne15.setText("15");
        this.jPanel4.add(this.ne15);
        this.ne15.setBounds(10, 650, 20, 40);
        this.jTextField158.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField158);
        this.jTextField158.setBounds(0, 650, 30, 40);
        this.ne14.setFont(new Font("Tahoma", 0, 10));
        this.ne14.setText("14");
        this.jPanel4.add(this.ne14);
        this.ne14.setBounds(10, 610, 20, 40);
        this.jTextField159.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField159);
        this.jTextField159.setBounds(0, 610, 30, 40);
        this.mecano14.setFont(new Font("Tahoma", 0, 10));
        this.mecano14.setText("...............");
        this.jPanel4.add(this.mecano14);
        this.mecano14.setBounds(40, 610, 40, 40);
        this.nom14.setFont(new Font("Tahoma", 0, 10));
        this.nom14.setText(".....................");
        this.jPanel4.add(this.nom14);
        this.nom14.setBounds(100, 620, 130, 20);
        this.jTextField160.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField160);
        this.jTextField160.setBounds(90, 610, 160, 40);
        this.cnr14.setFont(new Font("Tahoma", 0, 10));
        this.cnr14.setText("....................");
        this.jPanel4.add(this.cnr14);
        this.cnr14.setBounds(260, 610, 110, 40);
        this.jTextField161.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField161);
        this.jTextField161.setBounds(250, 610, 130, 40);
        this.cin14.setFont(new Font("Tahoma", 0, 10));
        this.cin14.setText("..................");
        this.jPanel4.add(this.cin14);
        this.cin14.setBounds(390, 610, 54, 40);
        this.jTextField162.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField162);
        this.jTextField162.setBounds(380, 610, 90, 40);
        this.montant14.setFont(new Font("Tahoma", 0, 10));
        this.montant14.setText("...........");
        this.jPanel4.add(this.montant14);
        this.montant14.setBounds(480, 620, 70, 30);
        this.jTextField163.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField163);
        this.jTextField163.setBounds(470, 610, 90, 40);
        this.jTextField165.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField165);
        this.jTextField165.setBounds(30, 610, 60, 40);
        this.mecano17.setFont(new Font("Tahoma", 0, 10));
        this.mecano17.setText("...............");
        this.jPanel4.add(this.mecano17);
        this.mecano17.setBounds(40, 730, 40, 40);
        this.jTextField167.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField167);
        this.jTextField167.setBounds(30, 730, 60, 40);
        this.nom17.setFont(new Font("Tahoma", 0, 10));
        this.nom17.setText(".....................");
        this.jPanel4.add(this.nom17);
        this.nom17.setBounds(100, 740, 130, 20);
        this.jTextField169.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField169);
        this.jTextField169.setBounds(90, 730, 160, 40);
        this.cnr17.setFont(new Font("Tahoma", 0, 10));
        this.cnr17.setText("....................");
        this.jPanel4.add(this.cnr17);
        this.cnr17.setBounds(260, 730, 110, 40);
        this.jTextField170.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField170);
        this.jTextField170.setBounds(250, 730, 130, 40);
        this.cin17.setFont(new Font("Tahoma", 0, 10));
        this.cin17.setText("..................");
        this.jPanel4.add(this.cin17);
        this.cin17.setBounds(390, 730, 54, 40);
        this.jTextField171.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField171);
        this.jTextField171.setBounds(380, 730, 90, 40);
        this.montant17.setFont(new Font("Tahoma", 0, 10));
        this.montant17.setText("...........");
        this.jPanel4.add(this.montant17);
        this.montant17.setBounds(480, 740, 70, 30);
        this.jTextField172.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField172);
        this.jTextField172.setBounds(470, 730, 90, 40);
        this.montant16.setFont(new Font("Tahoma", 0, 10));
        this.montant16.setText("...........");
        this.jPanel4.add(this.montant16);
        this.montant16.setBounds(480, 700, 70, 30);
        this.jTextField173.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField173);
        this.jTextField173.setBounds(470, 690, 90, 40);
        this.cin16.setFont(new Font("Tahoma", 0, 10));
        this.cin16.setText("..................");
        this.jPanel4.add(this.cin16);
        this.cin16.setBounds(390, 690, 54, 40);
        this.jTextField174.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField174);
        this.jTextField174.setBounds(380, 690, 90, 40);
        this.cnr16.setFont(new Font("Tahoma", 0, 10));
        this.cnr16.setText("....................");
        this.jPanel4.add(this.cnr16);
        this.cnr16.setBounds(260, 690, 110, 40);
        this.jTextField175.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField175);
        this.jTextField175.setBounds(250, 690, 130, 40);
        this.nom16.setFont(new Font("Tahoma", 0, 10));
        this.nom16.setText(".....................");
        this.jPanel4.add(this.nom16);
        this.nom16.setBounds(100, 700, 130, 20);
        this.jTextField176.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField176);
        this.jTextField176.setBounds(90, 690, 160, 40);
        this.mecano16.setFont(new Font("Tahoma", 0, 10));
        this.mecano16.setText("...............");
        this.jPanel4.add(this.mecano16);
        this.mecano16.setBounds(40, 690, 40, 40);
        this.jTextField178.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField178);
        this.jTextField178.setBounds(30, 690, 60, 40);
        this.ne16.setFont(new Font("Tahoma", 0, 10));
        this.ne16.setText("16");
        this.jPanel4.add(this.ne16);
        this.ne16.setBounds(10, 690, 20, 40);
        this.ne17.setFont(new Font("Tahoma", 0, 10));
        this.ne17.setText("17");
        this.jPanel4.add(this.ne17);
        this.ne17.setBounds(10, 730, 20, 40);
        this.jTextField179.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField179);
        this.jTextField179.setBounds(0, 730, 30, 40);
        this.jTextField180.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jTextField180);
        this.jTextField180.setBounds(0, 690, 30, 40);
        this.numpage.setFont(new Font("Tahoma", 1, 12));
        this.numpage.setText("........");
        this.jPanel4.add(this.numpage);
        this.numpage.setBounds(80, 780, 40, 30);
        this.jLabel12.setFont(new Font("Tahoma", 1, 12));
        this.jLabel12.setText("Page N\u00b0 :");
        this.jPanel4.add(this.jLabel12);
        this.jLabel12.setBounds(10, 784, 60, 20);
        this.jPanel3.add(this.jPanel4);
        this.jPanel4.setBounds(0, 10, 610, 820);
        this.add(this.jPanel3);
        this.jPanel3.setBounds(22, 539, 630, 850);
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
        String[] messageStrings = new String[]{"bt", "bna", "biat"};
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        if (this.jComboBox1.getSelectedItem().equals("BT")) {
            this.ch = "BT";
        } else if (this.jComboBox1.getSelectedItem().equals("BNA")) {
            this.ch = "BNA";
        } else if (this.jComboBox1.getSelectedItem().equals("UIB")) {
            this.ch = "UIB";
        } else if (this.jComboBox1.getSelectedItem().equals("BH")) {
            this.ch = "BH";
        } else if (this.jComboBox1.getSelectedItem().equals("ATB")) {
            this.ch = "ATB";
        } else if (this.jComboBox1.getSelectedItem().equals("aucune")) {
            this.ch = "";
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choisire la banque", "Attention", 0);
        }
        this.jLabel6.setText(this.ch);
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N dossier");
        dt1.addColumn("nom et prenom");
        dt1.addColumn("N\u00b0 de virement");
        dt1.addColumn("montant");
        this.jTable1.setModel(dt1);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("----------------------------");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state3 = conn2.createStatement();
            System.out.println("**********************************");
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE typbanque='" + this.ch + "'");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                int f = 0;
                String nbv = result3.getString("nbm");
                int n = Integer.parseInt(nbv);
                String fin = result3.getString("fin");
                f = Integer.parseInt(fin);
                if (n <= 0 || f != 1) continue;
                String nd = result3.getString("MECANO");
                String monntant = result3.getString("montant");
                String NOM = result3.getString("NOM");
                Object[] stg = new Object[]{nd, NOM, nbv, monntant};
                dt1.addRow(stg);
            }
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    private void imprimerActionPerformed(ActionEvent evt) {
        Date actuelle = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String datd = dateFormat.format(actuelle);
        String dateS = datd.substring(3, datd.length());
        System.out.println("date System= " + datd);
        System.out.println("date S = " + dateS);
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Attention il faut choisire l'imprimente HP par defaut", "Attention", 0, 3);
        if (option == 0) {
            if (this.jComboBox1.getSelectedItem().equals("BT")) {
                this.ch = "BT";
            } else if (this.jComboBox1.getSelectedItem().equals("BNA")) {
                this.ch = "BNA";
            } else if (this.jComboBox1.getSelectedItem().equals("UIB")) {
                this.ch = "UIB";
            } else if (this.jComboBox1.getSelectedItem().equals("BH")) {
                this.ch = "BH";
            } else if (this.jComboBox1.getSelectedItem().equals("ATB")) {
                this.ch = "ATB";
            } else if (this.jComboBox1.getSelectedItem().equals("STB")) {
                this.ch = "STB";
            } else if (this.jComboBox1.getSelectedItem().equals("aucune")) {
                this.ch = "";
            }
            if (this.ch == "") {
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Il faut choisire la banque", "Attention", 0);
            } else {
                try {
                    System.out.println("-----------------------------------");
                    System.out.println("BH =" + this.ch);
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    String bb = this.ch;
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE typbanque='" + bb + "' ORDER BY MECANO");
                    while (result3.next()) {
                        String adi;
                        Statement stat;
                        Connection conn22;
                        JOptionPane jop3;
                        String nmb = result3.getString("nbm");
                        String ff = result3.getString("fin");
                        int fff = Integer.parseInt(ff);
                        String nd = result3.getString("MECANO");
                        String nomadh = result3.getString("NOM");
                        int n = Integer.parseInt(nd);
                        int nombv = Integer.parseInt(nmb);
                        if (nombv <= 0 || fff != 1) continue;
                        System.out.println("Mecano =" + nd);
                        System.out.println("Nom =" + nomadh);
                        System.out.println("-----------------------------------");
                        this.montant = result3.getString("montant");
                        int fin = 0;
                        String b = "" + --nombv + "";
                        try {
                            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            stat = conn3.createStatement();
                            stat.executeUpdate("UPDATE adherent SET fin='" + fin + "' WHERE MECANO='" + n + "'");
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modife fin : " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn22.createStatement();
                            String nb = "1";
                            String imprimeborde = "1";
                            String f = "0";
                            state2.executeUpdate("INSERT INTO etatvirment(mois,banque,montant,MECANO,nom,fin) VALUES('" + dateS + "','" + this.ch + "','" + this.montant + "','" + nd + "','" + nomadh + "','" + f + "')");
                        }
                        catch (Exception e) {
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                        }
                        try {
                            conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            stat = conn22.createStatement();
                            stat.executeUpdate("UPDATE adherent SET nbm='" + b + "' WHERE MECANO='" + n + "'");
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modife nbm : " + e.getMessage());
                        }
                        System.out.println("montant =" + this.montant);
                        int t = this.montant.length() - 3;
                        System.out.println("long " + t);
                        String di = this.montant.substring(0, this.montant.length() - 3);
                        String mil = this.montant.substring(t, this.montant.length());
                        String mf = "#" + di + "," + mil + "#";
                        int nndi = Integer.parseInt(di);
                        int nnmi = Integer.parseInt(mil);
                        String mont = "";
                        String s = "";
                        if (mil.equals("000")) {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            mont = adi.toUpperCase();
                        } else {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            mont = adi + " et " + nnmi + " Millimes";
                        }
                        Impression1 ss = new Impression1(this.jPanel2);
                        try {
                            if (this.ch == "UIB") {
                                this.uibchiffre.setText(mf);
                                this.uiblettre.setText(mont);
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            } else if (this.ch == "BT") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText(mf);
                                this.btenlettre.setText(mont);
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            } else if (this.ch == "BH") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.bhchiffre.setText(mf);
                                this.bhletre.setText(mont);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            } else if (this.ch == "ATB") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.atbchiffre.setText(mf);
                                this.ATBlettre.setText(mont);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                            } else if (this.ch == "BNA") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.BNAchiffre.setText(mf);
                                this.bnalettre.setText(mont);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            } else if (this.ch == "STB") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.STBchiffre.setText(mf);
                                this.STBlettre.setText(mont);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            }
                            ss.jiji(evt);
                            System.out.println("******************* montant **************** =" + this.montant);
                        }
                        catch (Exception e) {}
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                }
            }
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean b = true;
        if (this.jTextField1.getText().equals("") || this.jTextField2.getText().equals("")) {
            b = false;
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire tous les champs", "Attention", 0);
        } else {
            if (this.jComboBox1.getSelectedItem().equals("BH")) {
                this.ch = "BH";
            } else if (this.jComboBox1.getSelectedItem().equals("aucune")) {
                this.ch = "";
                b = false;
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Choisire la banque", "Attention", 0);
            }
            if (b) {
                JOptionPane jop3 = new JOptionPane();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result3 = state.executeQuery("SELECT * FROM adherent  WHERE MECANO='" + this.jTextField1.getText() + "' ORDER BY MECANO");
                    while (result3.next()) {
                        String nbv = result3.getString("nbm");
                        int n = Integer.parseInt(nbv);
                        String NOMA = result3.getString("NOM");
                        System.out.println("**********************************************");
                        System.out.println("ch =" + this.ch);
                        System.out.println("WHERE MECANO =" + this.jTextField1.getText());
                        System.out.println("Nom =" + NOMA);
                        System.out.println("Nombre de virment =" + n);
                        if (n > 0) {
                            try {
                                Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state2 = conn22.createStatement();
                                state2.executeUpdate("UPDATE adherent SET montant='" + this.jTextField2.getText() + "' WHERE MECANO=" + this.jTextField1.getText());
                                state2.executeUpdate("UPDATE adherent SET typbanque='" + this.ch + "' WHERE MECANO=" + this.jTextField1.getText());
                                int fin = 1;
                                state2.executeUpdate("UPDATE adherent SET fin='" + fin + "' WHERE MECANO=" + this.jTextField1.getText());
                            }
                            catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                            DefaultTableModel dt1 = new DefaultTableModel();
                            dt1.addColumn("N dossier");
                            dt1.addColumn("nom et prenom");
                            dt1.addColumn("N\u00b0 de virement");
                            dt1.addColumn("montant");
                            System.out.println("**********************************************");
                            this.jTable1.setModel(dt1);
                            try {
                                System.out.println("ch2222222222 = " + this.ch);
                                Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state4 = conn4.createStatement();
                                ResultSet result4 = state4.executeQuery("SELECT * FROM adherent  WHERE typbanque='" + this.ch + "' ORDER BY MECANO");
                                while (result4.next()) {
                                    String nbvv = result4.getString("nbm");
                                    int nn = Integer.parseInt(nbvv);
                                    String ff = result4.getString("fin");
                                    String montant = result4.getString("montant");
                                    int fff = Integer.parseInt(ff);
                                    String nd = result4.getString("MECANO");
                                    System.out.println("Mecano =" + nd);
                                    System.out.println("Mecano =" + this.jTextField1.getText());
                                    if (nn <= 0 || fff != 1) continue;
                                    System.out.println("*******************nb>0***********************");
                                    String NOM = result4.getString("NOM");
                                    Object[] stg = new Object[]{nd, NOM, nbvv, montant};
                                    dt1.addRow(stg);
                                }
                                continue;
                            }
                            catch (Exception e) {
                                continue;
                            }
                        }
                        JOptionPane jop2 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Nombre de virment =0 => Adherent= " + NOMA, "Attention", 0);
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                }
            }
        }
        this.jTextField2.setText("");
        this.jTextField1.setText("");
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        historiquevirment a = new historiquevirment();
        a.show();
    }

    private void Mecano1ActionPerformed(ActionEvent evt) {
    }

    private void MecanoActionPerformed(ActionEvent evt) {
    }

    private void jTextField19ActionPerformed(ActionEvent evt) {
    }

    private void jTextField18ActionPerformed(ActionEvent evt) {
    }

    private void jTextField15ActionPerformed(ActionEvent evt) {
    }

    private void jTextField14ActionPerformed(ActionEvent evt) {
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

