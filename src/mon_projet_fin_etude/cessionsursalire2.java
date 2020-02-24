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
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.anciencession;
import mon_projet_fin_etude.impressionchequecession;
import mon_projet_fin_etude.miseajourmontant;
import mon_projet_fin_etude.recherchecarnedecheque;

public class cessionsursalire2
extends JPanel {
    String montantcheque = "";
    String tt = "";
    String lit = "";
    String nomadh = "";
    String ch = "";
    String mont = "";
    String parmois = "";
    String r = "";
    String travaille = "";
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    String m = "";
    int k = 1;
    int test = 0;
    int testmain = 0;
    double Nch;
    double Nfin;
    String numcarnetreserver = "";
    String lieutrv = "";
    int montantglobalee = 0;
    int montglobale;
    int num = 0;
    private JLabel Adresse;
    private JLabel addrr;
    private JComboBox atitre;
    private ButtonGroup buttonGroup1;
    private JCheckBox cession;
    private JLabel cin;
    private JLabel cin2;
    private JLabel cinetat;
    private JLabel cinetat1;
    private JLabel cinetat2;
    private JLabel cinetat4;
    private JLabel cnretat;
    private JLabel cnretat1;
    private JLabel cnretat2;
    private JLabel cnretat4;
    private JTextField codeb;
    private JLabel codepostal;
    private JRadioButton cs;
    private JLabel d1re;
    private JLabel date1;
    private JLabel date2;
    private JLabel dateactuele;
    private JLabel dateatt;
    private JTextField datederrede;
    private JLabel datefinetatredev;
    private JLabel dateimpression;
    private JLabel datemleve;
    private JLabel datenai;
    private JTextField datepremiredevance;
    private JLabel dateredevance;
    private JLabel delivd;
    private JLabel derniermoisd;
    private JLabel derredevvv;
   // private JRadioButton esp;
    private JRadioButton direct;
    private JLabel etabd;
    private JLabel etabetat;
    private JLabel etabetat1;
    private JLabel etabetat2;
    private JLabel etabetat4;
    private JLabel etabmain;
    private JPanel etatmainleve;
    private JLabel etatmoisredv;
    private JLabel globale;
    private JLabel globale1;
    private JLabel grade;
    private JLabel hopital;
    private JLabel idend;
    private JButton imprimer;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel100;
    private JLabel jLabel101;
    private JLabel jLabel102;
    private JLabel jLabel103;
    private JLabel jLabel104;
    private JLabel jLabel105;
    private JLabel jLabel106;
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
    private JLabel jLabel121;
    private JLabel jLabel122;
    private JLabel jLabel123;
    private JLabel jLabel124;
    private JLabel jLabel125;
    private JLabel jLabel126;
    private JLabel jLabel127;
    private JLabel jLabel128;
    private JLabel jLabel129;
    private JLabel jLabel13;
    private JLabel jLabel130;
    private JLabel jLabel131;
    private JLabel jLabel132;
    private JLabel jLabel133;
    private JLabel jLabel134;
    private JLabel jLabel135;
    private JLabel jLabel136;
    private JLabel jLabel137;
    private JLabel jLabel138;
    private JLabel jLabel139;
    private JLabel jLabel14;
    private JLabel jLabel140;
    private JLabel jLabel141;
    private JLabel jLabel142;
    private JLabel jLabel143;
    private JLabel jLabel145;
    private JLabel jLabel146;
    private JLabel jLabel147;
    private JLabel jLabel148;
    private JLabel jLabel15;
    private JLabel jLabel151;
    private JLabel jLabel152;
    private JLabel jLabel153;
    private JLabel jLabel154;
    private JLabel jLabel155;
    private JLabel jLabel156;
    private JLabel jLabel158;
    private JLabel jLabel16;
    private JLabel jLabel167;
    private JLabel jLabel168;
    private JLabel jLabel169;
    private JLabel jLabel17;
    private JLabel jLabel170;
    private JLabel jLabel171;
    private JLabel jLabel172;
    private JLabel jLabel173;
    private JLabel jLabel174;
    private JLabel jLabel175;
    private JLabel jLabel176;
    private JLabel jLabel177;
    private JLabel jLabel178;
    private JLabel jLabel179;
    private JLabel jLabel18;
    private JLabel jLabel180;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
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
    private JLabel jLabel44;
    private JLabel jLabel45;
    private JLabel jLabel46;
    private JLabel jLabel47;
    private JLabel jLabel48;
    private JLabel jLabel49;
    private JLabel jLabel5;
    private JLabel jLabel50;
    private JLabel jLabel51;
    private JLabel jLabel52;
    private JLabel jLabel53;
    private JLabel jLabel54;
    private JLabel jLabel55;
    private JLabel jLabel56;
    private JLabel jLabel57;
    private JLabel jLabel58;
    private JLabel jLabel59;
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
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel14;
    private JPanel jPanel15;
    private JPanel jPanel16;
    private JPanel jPanel17;
    private JPanel jPanel18;
    private JPanel jPanel2;
    private JPanel jPanel21;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator11;
    private JSeparator jSeparator12;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JSeparator jSeparator5;
    private JSeparator jSeparator6;
    private JSeparator jSeparator8;
    private JSeparator jSeparator9;
    private JTextField jTextField1;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField12;
    private JTextField jTextField13;
    private JTextField jTextField14;
    private JTextField jTextField15;
    private JTextField jTextField16;
    private JTextField jTextField17;
    private JTextField jTextField18;
    private JTextField jTextField19;
    private JTextField jTextField2;
    private JTextField jTextField20;
    private JTextField jTextField21;
    private JTextField jTextField22;
    private JTextField jTextField23;
    private JTextField jTextField24;
    private JTextField jTextField25;
    private JTextField jTextField26;
    private JTextField jTextField27;
    private JTextField jTextField28;
    private JTextField jTextField29;
    private JTextField jTextField3;
    private JTextField jTextField30;
    private JTextField jTextField31;
    private JTextField jTextField32;
    private JTextField jTextField33;
    private JTextField jTextField34;
    private JTextField jTextField35;
    private JTextField jTextField36;
    private JTextField jTextField37;
    private JTextField jTextField38;
    private JTextField jTextField39;
    private JTextField jTextField4;
    private JTextField jTextField40;
    private JTextField jTextField41;
    private JTextField jTextField42;
    private JTextField jTextField43;
    private JTextField jTextField44;
    private JTextField jTextField45;
    private JTextField jTextField46;
    private JTextField jTextField47;
    private JTextField jTextField48;
    private JTextField jTextField49;
    private JTextField jTextField5;
    private JTextField jTextField50;
    private JTextField jTextField51;
    private JTextField jTextField52;
    private JTextField jTextField53;
    private JTextField jTextField54;
    private JTextField jTextField55;
    private JTextField jTextField56;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    private JLabel lieunai;
    private JLabel livcin;
    private JPanel mainleveeee;
    private JCheckBox mainlev\u00e9e;
    private JTextField mat;
    private JLabel matricule;
    private JLabel matriculeetat;
    private JLabel matriculeetat1;
    private JLabel matriculeetat4;
    private JLabel matriculemain;
    private JLabel matriculeredevence;
    private JTextField mc;
    private JTextField mecano;
    private JLabel mecanod;
    private JLabel mecanoetat;
    private JLabel mecanoetat1;
    private JLabel mecanoetat2;
    private JLabel mecanoetat3;
    private JLabel mecanoetat4;
    private JLabel mecanoetat5;
    private JLabel mecanoetat6;
    private JLabel mecanoetat7;
    private JLabel mecanoo;
    private JLabel mecat;
    private JTextField mensualit\u00e9;
    private JLabel moisrester;
    private JLabel montantetat;
    private JLabel montantetat1;
    private JLabel montantetat2;
    private JLabel montantetat4;
    private JLabel montantglo;
    private JLabel montantletrechiffd;
    private JLabel montantparmoisd;
    private JTextField montantpayment;
    private JLabel montantredevanceetat;
    private JLabel mparmois;
    private JLabel nbbmois;
    private JLabel nbmd;
    private JTextField nbmois;
    private JLabel nbmoisetat;
    private JLabel ncina;
    private JLabel ncinddemande;
    private JLabel especes;
    private JLabel nomd;
    private JLabel nometat;
    private JLabel nometat1;
    private JLabel nometat4;
    private JLabel nometattab;
    private JLabel nometattab1;
    private JLabel nometattab2;
    private JLabel nometattab4;
    private JLabel nometprenom;
    private JLabel nometprenommain;
    private JLabel nomredevance;
    private JLabel numces;
    private JLabel numchequeetat;
    private JLabel numchequeetat1;
    private JLabel numchequeetat4;
    private JLabel numpret;
    private JLabel premmoid;
    private JTable pret;
    private JLabel profession;
    private JLabel rabais;
    private JPanel redev;
    private JCheckBox redevance;
    private JTextField reference1;
    private JLabel refetatredev;
    private JLabel refredevance;
    private JLabel registre;
    private JTextField registre1;
    private JLabel resteredevance;
    private JLabel restmain;
    private JLabel solderlepret;
    private JLabel somredevance;
    private JRadioButton t;
    private JLabel titre;
    private JLabel titredepayment;
    private JLabel total;

    public cessionsursalire2() {
        this.initComponents();
    }

    private void initComponents() {
        this.jRadioButton2 = new JRadioButton();
        this.jRadioButton3 = new JRadioButton();
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel2 = new JPanel();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.especes = new JLabel();
        this.nbmois = new JTextField();
        this.mensualit\u00e9 = new JTextField();
        this.imprimer = new JButton();
        this.jLabel28 = new JLabel();
        this.jButton2 = new JButton();
        this.jButton4 = new JButton();
        this.jPanel10 = new JPanel();
        this.cession = new JCheckBox();
        this.mainlev\u00e9e = new JCheckBox();
        this.redevance = new JCheckBox();
        this.jSeparator6 = new JSeparator();
        this.jButton5 = new JButton();
        this.jButton1 = new JButton();
        this.jLabel5 = new JLabel();
        this.montantpayment = new JTextField();
        this.jLabel18 = new JLabel();
        this.atitre = new JComboBox();
        this.jLabel152 = new JLabel();
        this.datederrede = new JTextField();
        this.datepremiredevance = new JTextField();
        this.jLabel154 = new JLabel();
        this.jSeparator8 = new JSeparator();
        this.jSeparator9 = new JSeparator();
        this.jLabel155 = new JLabel();
        this.jLabel153 = new JLabel();
        this.reference1 = new JTextField();
        this.jLabel156 = new JLabel();
        this.registre1 = new JTextField();
        this.titre = new JLabel();
        this.jLabel158 = new JLabel();
        this.mat = new JTextField();
        this.jLabel108 = new JLabel();
        this.cs = new JRadioButton();
        this.direct = new JRadioButton();
        this.t = new JRadioButton();
        this.jLabel136 = new JLabel();
        this.codeb = new JTextField();
        this.mc = new JTextField();
        this.jLabel138 = new JLabel();
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
        this.etabetat = new JLabel();
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
        this.jTextField13 = new JTextField();
        this.jTextField14 = new JTextField();
        this.jTextField9 = new JTextField();
        this.jTextField10 = new JTextField();
        this.jTextField11 = new JTextField();
        this.jTextField12 = new JTextField();
        this.mecanoetat1 = new JLabel();
        this.jPanel11 = new JPanel();
        this.jPanel12 = new JPanel();
        this.jSeparator3 = new JSeparator();
        this.jLabel25 = new JLabel();
        this.jLabel106 = new JLabel();
        this.jTextField15 = new JTextField();
        this.mecanoetat2 = new JLabel();
        this.cnretat1 = new JLabel();
        this.etabetat1 = new JLabel();
        this.montantetat1 = new JLabel();
        this.nometattab1 = new JLabel();
        this.cinetat1 = new JLabel();
        this.jTextField16 = new JTextField();
        this.jTextField17 = new JTextField();
        this.jTextField18 = new JTextField();
        this.jTextField19 = new JTextField();
        this.jTextField20 = new JTextField();
        this.jTextField21 = new JTextField();
        this.jTextField22 = new JTextField();
        this.jTextField23 = new JTextField();
        this.jTextField24 = new JTextField();
        this.jTextField25 = new JTextField();
        this.jTextField26 = new JTextField();
        this.jTextField27 = new JTextField();
        this.jTextField28 = new JTextField();
        this.mecanoetat3 = new JLabel();
        this.mainleveeee = new JPanel();
        this.jLabel19 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jLabel101 = new JLabel();
        this.jLabel102 = new JLabel();
        this.jLabel103 = new JLabel();
        this.jLabel104 = new JLabel();
        this.jLabel105 = new JLabel();
        this.jLabel107 = new JLabel();
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
        this.jLabel116 = new JLabel();
        this.dateimpression = new JLabel();
        this.jLabel117 = new JLabel();
        this.montantglo = new JLabel();
        this.jLabel118 = new JLabel();
        this.registre = new JLabel();
        this.jLabel119 = new JLabel();
        this.jLabel120 = new JLabel();
        this.etabmain = new JLabel();
        this.etatmainleve = new JPanel();
        this.jLabel26 = new JLabel();
        this.jSeparator4 = new JSeparator();
        this.jLabel27 = new JLabel();
        this.jLabel121 = new JLabel();
        this.nometat4 = new JLabel();
        this.matriculeetat4 = new JLabel();
        this.jLabel122 = new JLabel();
        this.numchequeetat4 = new JLabel();
        this.jLabel123 = new JLabel();
        this.jLabel124 = new JLabel();
        this.jPanel14 = new JPanel();
        this.jLabel125 = new JLabel();
        this.jSeparator5 = new JSeparator();
        this.jLabel126 = new JLabel();
        this.jTextField29 = new JTextField();
        this.mecanoetat4 = new JLabel();
        this.cnretat4 = new JLabel();
        this.etabetat4 = new JLabel();
        this.montantetat4 = new JLabel();
        this.nometattab4 = new JLabel();
        this.cinetat4 = new JLabel();
        this.jTextField30 = new JTextField();
        this.jTextField31 = new JTextField();
        this.jTextField32 = new JTextField();
        this.jTextField33 = new JTextField();
        this.jTextField34 = new JTextField();
        this.jTextField35 = new JTextField();
        this.jTextField36 = new JTextField();
        this.jTextField37 = new JTextField();
        this.jTextField38 = new JTextField();
        this.jTextField39 = new JTextField();
        this.jTextField40 = new JTextField();
        this.jTextField41 = new JTextField();
        this.jTextField42 = new JTextField();
        this.mecanoetat5 = new JLabel();
        this.jLabel127 = new JLabel();
        this.moisrester = new JLabel();
        this.jLabel128 = new JLabel();
        this.jLabel129 = new JLabel();
        this.restmain = new JLabel();
        this.jLabel130 = new JLabel();
        this.numpret = new JLabel();
        this.jLabel131 = new JLabel();
        this.mparmois = new JLabel();
        this.jLabel132 = new JLabel();
        this.jLabel133 = new JLabel();
        this.datemleve = new JLabel();
        this.nbmoisetat = new JLabel();
        this.jLabel134 = new JLabel();
        this.jLabel135 = new JLabel();
        this.jPanel13 = new JPanel();
        this.jPanel15 = new JPanel();
        this.jLabel137 = new JLabel();
        this.dateredevance = new JLabel();
        this.jLabel139 = new JLabel();
        this.titredepayment = new JLabel();
        this.jLabel140 = new JLabel();
        this.somredevance = new JLabel();
        this.jLabel141 = new JLabel();
        this.jLabel142 = new JLabel();
        this.jLabel143 = new JLabel();
        this.jLabel145 = new JLabel();
        this.refredevance = new JLabel();
        this.jLabel146 = new JLabel();
        this.nomredevance = new JLabel();
        this.matriculeredevence = new JLabel();
        this.jLabel147 = new JLabel();
        this.jLabel148 = new JLabel();
        this.jLabel151 = new JLabel();
        this.d1re = new JLabel();
        this.derredevvv = new JLabel();
        this.jPanel16 = new JPanel();
        this.redev = new JPanel();
        this.jLabel167 = new JLabel();
        this.jSeparator11 = new JSeparator();
        this.jLabel168 = new JLabel();
        this.jLabel169 = new JLabel();
        this.nometat1 = new JLabel();
        this.matriculeetat1 = new JLabel();
        this.jLabel170 = new JLabel();
        this.numchequeetat1 = new JLabel();
        this.jLabel171 = new JLabel();
        this.jLabel172 = new JLabel();
        this.jPanel21 = new JPanel();
        this.jLabel173 = new JLabel();
        this.jSeparator12 = new JSeparator();
        this.jLabel174 = new JLabel();
        this.jTextField43 = new JTextField();
        this.mecanoetat6 = new JLabel();
        this.cnretat2 = new JLabel();
        this.etabetat2 = new JLabel();
        this.montantetat2 = new JLabel();
        this.nometattab2 = new JLabel();
        this.cinetat2 = new JLabel();
        this.jTextField44 = new JTextField();
        this.jTextField45 = new JTextField();
        this.jTextField46 = new JTextField();
        this.jTextField47 = new JTextField();
        this.jTextField48 = new JTextField();
        this.jTextField49 = new JTextField();
        this.jTextField50 = new JTextField();
        this.jTextField51 = new JTextField();
        this.jTextField52 = new JTextField();
        this.jTextField53 = new JTextField();
        this.jTextField54 = new JTextField();
        this.jTextField55 = new JTextField();
        this.jTextField56 = new JTextField();
        this.mecanoetat7 = new JLabel();
        this.jLabel175 = new JLabel();
        this.refetatredev = new JLabel();
        this.jLabel176 = new JLabel();
        this.montantredevanceetat = new JLabel();
        this.jLabel177 = new JLabel();
        this.resteredevance = new JLabel();
        this.jLabel178 = new JLabel();
        this.datefinetatredev = new JLabel();
        this.jLabel179 = new JLabel();
        this.jLabel180 = new JLabel();
        this.solderlepret = new JLabel();
        this.etatmoisredv = new JLabel();
        this.jPanel17 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.pret = new JTable();
        this.jPanel18 = new JPanel();
        this.jPanel4 = new JPanel();
        this.jLabel6 = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.hopital = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jLabel34 = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel37 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jLabel40 = new JLabel();
        this.jLabel41 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel42 = new JLabel();
        this.nometprenom = new JLabel();
        this.datenai = new JLabel();
        this.jLabel44 = new JLabel();
        this.lieunai = new JLabel();
        this.jLabel45 = new JLabel();
        this.jLabel46 = new JLabel();
        this.ncina = new JLabel();
        this.jLabel47 = new JLabel();
        this.date2 = new JLabel();
        this.total = new JLabel();
        this.jLabel49 = new JLabel();
        this.addrr = new JLabel();
        this.jLabel50 = new JLabel();
        this.codepostal = new JLabel();
        this.jLabel51 = new JLabel();
        this.jLabel52 = new JLabel();
        this.matricule = new JLabel();
        this.jLabel53 = new JLabel();
        this.jLabel54 = new JLabel();
        this.jLabel55 = new JLabel();
        this.grade = new JLabel();
        this.jLabel57 = new JLabel();
        this.jLabel58 = new JLabel();
        this.globale = new JLabel();
        this.jLabel59 = new JLabel();
        this.jLabel60 = new JLabel();
        this.jLabel62 = new JLabel();
        this.jLabel63 = new JLabel();
        this.jLabel64 = new JLabel();
        this.jLabel65 = new JLabel();
        this.jLabel66 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel67 = new JLabel();
        this.jLabel68 = new JLabel();
        this.nbbmois = new JLabel();
        this.jLabel69 = new JLabel();
        this.jLabel70 = new JLabel();
        this.livcin = new JLabel();
        this.rabais = new JLabel();
        this.jLabel71 = new JLabel();
        //this.esp = new JRadioButton();
        this.date1 = new JLabel();
        this.cin2 = new JLabel();
        this.jLabel56 = new JLabel();
        this.mecanoo = new JLabel();
        this.jLabel99 = new JLabel();
        this.jLabel100 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jRadioButton2.setText("jRadioButton2");
        this.jRadioButton3.setText("jRadioButton3");
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Cession Sur Salaire ");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(210, 0, 290, 20);
        
        
        
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("paiement par :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(10, 70, 110, 20);
       
        
        
        this.mecano.setEnabled(false);
        this.mecano.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                cessionsursalire2.this.mecanoMouseClicked(evt);
            }
        });
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.mecanoActionPerformed(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                cessionsursalire2.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(80, 120, 90, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("1 er mois :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(550, 120, 80, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Montant de pret :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(180, 130, 122, 20);
        this.nbmois.setEnabled(false);
        this.nbmois.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.nbmoisActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.nbmois);
        this.nbmois.setBounds(490, 120, 50, 30);
        this.mensualit\u00e9.setEnabled(false);
        this.mensualit\u00e9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.mensualit\u00e9ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mensualit\u00e9);
        this.mensualit\u00e9.setBounds(310, 120, 80, 30);
        this.imprimer.setFont(new Font("Tahoma", 1, 12));
        this.imprimer.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.imprimer.setText("imprimer ");
        this.imprimer.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.imprimerActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.imprimer);
        this.imprimer.setBounds(550, 300, 130, 30);
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setText("NB de mois :");
        this.jPanel1.add(this.jLabel28);
        this.jLabel28.setBounds(400, 120, 90, 30);
        this.jButton2.setFont(new Font("Tahoma", 1, 11));
        this.jButton2.setText("Mise a jour montant");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(300, 300, 150, 30);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setForeground(new Color(51, 0, 255));
        this.jButton4.setText("Impression de cheque");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton4);
        this.jButton4.setBounds(130, 300, 170, 30);
        this.jPanel10.setLayout(null);
        this.cession.setFont(new Font("Tahoma", 1, 14));
        this.cession.setForeground(new Color(0, 0, 204));
        this.cession.setText("Cession sur salire");
        this.jPanel10.add(this.cession);
        this.cession.setBounds(17, 9, 150, 20);
        this.mainlev\u00e9e.setFont(new Font("Tahoma", 1, 14));
        this.mainlev\u00e9e.setForeground(new Color(0, 0, 204));
        this.mainlev\u00e9e.setText("Main lev\u00e9e");
        this.jPanel10.add(this.mainlev\u00e9e);
        this.mainlev\u00e9e.setBounds(210, 10, 100, 20);
        this.redevance.setFont(new Font("Tahoma", 1, 14));
        this.redevance.setForeground(new Color(0, 0, 204));
        this.redevance.setText("Redevance ");
        this.jPanel10.add(this.redevance);
        this.redevance.setBounds(340, 10, 150, 20);
        this.jPanel10.add(this.jSeparator6);
        this.jSeparator6.setBounds(0, 40, 640, 10);
        this.jButton5.setFont(new Font("Tahoma", 1, 11));
        this.jButton5.setForeground(new Color(51, 51, 255));
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton5.setText("Valider");
        this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jButton5ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton5);
        this.jButton5.setBounds(530, 10, 107, 30);
        this.jPanel1.add(this.jPanel10);
        this.jPanel10.setBounds(10, 20, 670, 50);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/cession/vcard-ajouter-icone-9305-32.png")));
        this.jButton1.setText("Ajouter ");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(20, 300, 110, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("Montant  de payment:");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(290, 180, 160, 30);
        this.montantpayment.setEnabled(false);
        this.montantpayment.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.montantpaymentActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.montantpayment);
        this.montantpayment.setBounds(450, 180, 140, 30);
        this.jLabel18.setFont(new Font("Tahoma", 1, 12));
        this.jLabel18.setForeground(new Color(51, 0, 255));
        this.jLabel18.setText("A titre de :");
        this.jPanel1.add(this.jLabel18);
        this.jLabel18.setBounds(20, 180, 70, 30);
        this.atitre.setFont(new Font("Tahoma", 1, 14));
        this.atitre.setModel(new DefaultComboBoxModel<String>(new String[]{"Pret    Cession", "Pret    Fournisseur", "Pret    FDD"}));
        this.atitre.setEnabled(false);
        this.atitre.setLightWeightPopupEnabled(false);
        this.jPanel1.add(this.atitre);
        this.atitre.setBounds(90, 180, 190, 30);
        this.jLabel152.setFont(new Font("Tahoma", 1, 14));
        this.jLabel152.setText("Dernier mois de redevance  :");
        this.jPanel1.add(this.jLabel152);
        this.jLabel152.setBounds(20, 260, 210, 30);
        this.datederrede.setEnabled(false);
        this.datederrede.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.datederredeActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.datederrede);
        this.datederrede.setBounds(230, 260, 120, 30);
        this.datepremiredevance.setEnabled(false);
        this.datepremiredevance.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.datepremiredevanceActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.datepremiredevance);
        this.datepremiredevance.setBounds(230, 220, 120, 30);
        this.jLabel154.setForeground(new Color(153, 0, 0));
        this.jLabel154.setText("exemple 05/2016");
        this.jPanel1.add(this.jLabel154);
        this.jLabel154.setBounds(30, 240, 130, 20);
        this.jPanel1.add(this.jSeparator8);
        this.jSeparator8.setBounds(10, 192, 0, 0);
        this.jPanel1.add(this.jSeparator9);
        this.jSeparator9.setBounds(0, 160, 680, 10);
        this.jLabel155.setFont(new Font("Tahoma", 1, 14));
        this.jLabel155.setText("Premier mois de redevance  :");
        this.jPanel1.add(this.jLabel155);
        this.jLabel155.setBounds(20, 220, 210, 30);
        this.jLabel153.setFont(new Font("Tahoma", 1, 14));
        this.jLabel153.setText("Reference :");
        this.jPanel1.add(this.jLabel153);
        this.jLabel153.setBounds(360, 220, 90, 30);
        this.reference1.setEnabled(false);
        this.reference1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.reference1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.reference1);
        this.reference1.setBounds(450, 220, 140, 30);
        this.jLabel156.setFont(new Font("Tahoma", 1, 14));
        this.jLabel156.setText("Registre :");
        this.jPanel1.add(this.jLabel156);
        this.jLabel156.setBounds(370, 260, 70, 30);
        this.registre1.setEnabled(false);
        this.registre1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.registre1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.registre1);
        this.registre1.setBounds(450, 260, 90, 30);
        this.titre.setFont(new Font("Tahoma", 1, 12));
        this.titre.setForeground(new Color(102, 0, 0));
        this.titre.setText("Cession Sur Salire");
        this.jPanel1.add(this.titre);
        this.titre.setBounds(200, 100, 290, 30);
        this.jLabel158.setFont(new Font("Tahoma", 1, 12));
        this.jLabel158.setForeground(new Color(102, 0, 0));
        this.jLabel158.setText("Ordre de payment d'une ancienne  redevance sur pr\u00e8t");
        this.jPanel1.add(this.jLabel158);
        this.jLabel158.setBounds(130, 160, 390, 20);
        this.mat.setEnabled(false);
        this.mat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.matActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mat);
        this.mat.setBounds(630, 120, 50, 30);
        this.jLabel108.setFont(new Font("Tahoma", 1, 14));
        this.jLabel108.setText("Mecano :");
        this.jPanel1.add(this.jLabel108);
        this.jLabel108.setBounds(10, 130, 70, 20);
        this.buttonGroup1.add(this.cs);
        this.cs.setFont(new Font("Tahoma", 1, 14));
        this.cs.setForeground(new Color(153, 0, 0));
        this.cs.setText("Cession");
        this.jPanel1.add(this.cs);
        this.cs.setBounds(120, 70, 79, 25);
        this.buttonGroup1.add(this.direct);
        this.direct.setFont(new Font("Tahoma", 1, 14));
        this.direct.setForeground(new Color(153, 0, 0));
        this.direct.setText("Direct (406)");
        this.jPanel1.add(this.direct);
        this.direct.setBounds(230, 70, 110, 25);
        
        
     
        
        
        
        
        
        
        
        //this.esp.setFont(new Font("Tahoma", 1, 14));
       // this.esp.setForeground(new Color(153, 0, 0));
       // this.esp.setText("Espèces");
       // this.jPanel1.add(this.esp);
       // this.esp.setBounds(65, 100, 110, 20);
       // this.esp.hide();
       
        
        
        
        
        this.buttonGroup1.add(this.t);
        this.t.setText("jRadioButton1");
        this.jPanel1.add(this.t);
        this.t.setBounds(440, 70, 0, 23);
        this.jLabel136.setFont(new Font("Tahoma", 1, 14));
        this.jLabel136.setText("Code banque :");
        this.jPanel1.add(this.jLabel136);
        this.jLabel136.setBounds(510, 70, 110, 30);
        this.codeb.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.codebActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.codeb);
        this.codeb.setBounds(620, 70, 60, 30);
        this.mc.setEnabled(false);
        this.mc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.mcActionPerformed(evt);
            }
        });
        
        
            
 
        
        
        
        this.jPanel1.add(this.mc);
        this.mc.setBounds(430, 70, 60, 30);
        this.jLabel138.setFont(new Font("Tahoma", 1, 14));
        this.jLabel138.setText("Mc :");
        this.jPanel1.add(this.jLabel138);
        this.jLabel138.setBounds(390, 70, 50, 30);
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
        this.jLabel20.setText("A Mme La Pr\u00e9sidente de la Mutuelle ");
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
        this.jLabel30.setText("De la Sant\u00e9 Publique \"La Solidarite\"");
        this.jPanel5.add(this.jLabel30);
        this.jLabel30.setBounds(60, 100, 440, 29);
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
        this.delivd.setText("...................");
        this.jPanel5.add(this.delivd);
        this.delivd.setBounds(80, 30, 130, 20);
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
        this.numces.setBounds(350, 40, 170, 20);
        this.jPanel3.add(this.jPanel5);
        this.jPanel5.setBounds(0, 10, 540, 780);
        this.jPanel7.setBackground(new Color(102, 153, 255));
        this.jPanel7.setLayout(null);
        this.jPanel8.setBackground(new Color(255, 255, 255));
        this.jPanel8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.setLayout(null);
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
        this.jLabel93.setBounds(380, 310, 70, 30);
        this.nometat.setFont(new Font("Tahoma", 1, 14));
        this.nometat.setText("......................");
        this.jPanel8.add(this.nometat);
        this.nometat.setBounds(110, 310, 260, 30);
        this.matriculeetat.setFont(new Font("Tahoma", 1, 14));
        this.matriculeetat.setText("......................");
        this.jPanel8.add(this.matriculeetat);
        this.matriculeetat.setBounds(460, 310, 110, 30);
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
                cessionsursalire2.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField1);
        this.jTextField1.setBounds(10, 100, 60, 30);
        this.mecanoetat.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat.setText(".........");
        this.jPanel8.add(this.mecanoetat);
        this.mecanoetat.setBounds(79, 150, 30, 27);
        this.cnretat.setFont(new Font("Tahoma", 0, 12));
        this.cnretat.setText("...............");
        this.jPanel8.add(this.cnretat);
        this.cnretat.setBounds(280, 150, 70, 27);
        this.etabetat.setFont(new Font("Tahoma", 0, 12));
        this.etabetat.setText(".....................");
        this.jPanel8.add(this.etabetat);
        this.etabetat.setBounds(360, 150, 74, 27);
        this.montantetat.setFont(new Font("Tahoma", 0, 10));
        this.montantetat.setText("..........");
        this.jPanel8.add(this.montantetat);
        this.montantetat.setBounds(450, 150, 50, 27);
        this.nometattab.setFont(new Font("Tahoma", 0, 10));
        this.nometattab.setText("..............");
        this.jPanel8.add(this.nometattab);
        this.nometattab.setBounds(130, 140, 140, 40);
        this.cinetat.setFont(new Font("Tahoma", 0, 10));
        this.cinetat.setText("...........");
        this.jPanel8.add(this.cinetat);
        this.cinetat.setBounds(510, 150, 60, 27);
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField2);
        this.jTextField2.setBounds(120, 130, 150, 60);
        this.jTextField3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField3ActionPerformed(evt);
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
                cessionsursalire2.this.jTextField4ActionPerformed(evt);
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
                cessionsursalire2.this.jTextField5ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField5);
        this.jTextField5.setBounds(500, 100, 70, 30);
        this.jTextField6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField6);
        this.jTextField6.setBounds(500, 130, 70, 60);
        this.jTextField7.setFont(new Font("Tahoma", 1, 12));
        this.jTextField7.setText("Mecano");
        this.jTextField7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField7ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField7);
        this.jTextField7.setBounds(70, 100, 50, 30);
        this.jTextField8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField8);
        this.jTextField8.setBounds(70, 130, 50, 60);
        this.jTextField13.setFont(new Font("Tahoma", 1, 12));
        this.jTextField13.setText("Etablissement");
        this.jTextField13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField13.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField13ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField13);
        this.jTextField13.setBounds(350, 100, 90, 30);
        this.jTextField14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField14);
        this.jTextField14.setBounds(350, 130, 90, 60);
        this.jTextField9.setFont(new Font("Tahoma", 1, 12));
        this.jTextField9.setText("     CNR");
        this.jTextField9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField9ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField9);
        this.jTextField9.setBounds(270, 100, 80, 30);
        this.jTextField10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField10);
        this.jTextField10.setBounds(270, 130, 80, 60);
        this.jTextField11.setFont(new Font("Tahoma", 1, 12));
        this.jTextField11.setText("Montant");
        this.jTextField11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField11.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField11ActionPerformed(evt);
            }
        });
        this.jPanel8.add(this.jTextField11);
        this.jTextField11.setBounds(440, 100, 60, 30);
        this.jTextField12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel8.add(this.jTextField12);
        this.jTextField12.setBounds(440, 130, 60, 60);
        this.mecanoetat1.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat1.setText(".............");
        this.jPanel8.add(this.mecanoetat1);
        this.mecanoetat1.setBounds(80, 150, 50, 27);
        this.jPanel7.add(this.jPanel8);
        this.jPanel8.setBounds(0, 10, 580, 730);
        this.jPanel11.setBackground(new Color(0, 153, 255));
        this.jPanel12.setBackground(new Color(255, 255, 255));
        this.jPanel12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel12.setLayout(null);
        this.jSeparator3.setBackground(new Color(0, 0, 0));
        this.jSeparator3.setForeground(new Color(0, 0, 0));
        this.jPanel12.add(this.jSeparator3);
        this.jSeparator3.setBounds(0, 230, 580, 10);
        this.jLabel25.setFont(new Font("Tahoma", 1, 24));
        this.jLabel25.setText("ETAT DE  PAYEMENT EN ESPECE");
        this.jPanel12.add(this.jLabel25);
        this.jLabel25.setBounds(70, 40, 420, 30);
        this.jLabel106.setFont(new Font("Tahoma", 1, 24));
        this.jLabel106.setText("SERVICE DES PRETS");
        this.jPanel12.add(this.jLabel106);
        this.jLabel106.setBounds(160, 260, 280, 30);
        this.jTextField15.setFont(new Font("Tahoma", 1, 12));
        this.jTextField15.setText("  Date");
        this.jTextField15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField15ActionPerformed(evt);
            }
        });
        this.jPanel12.add(this.jTextField15);
        this.jTextField15.setBounds(10, 100, 60, 30);
        this.mecanoetat2.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat2.setText(".........");
        this.jPanel12.add(this.mecanoetat2);
        this.mecanoetat2.setBounds(79, 150, 30, 27);
        this.cnretat1.setFont(new Font("Tahoma", 0, 12));
        this.cnretat1.setText("...............");
        this.jPanel12.add(this.cnretat1);
        this.cnretat1.setBounds(280, 150, 70, 27);
        this.etabetat1.setFont(new Font("Tahoma", 0, 12));
        this.etabetat1.setText(".....................");
        this.jPanel12.add(this.etabetat1);
        this.etabetat1.setBounds(360, 150, 74, 27);
        this.montantetat1.setFont(new Font("Tahoma", 0, 10));
        this.montantetat1.setText("..........");
        this.jPanel12.add(this.montantetat1);
        this.montantetat1.setBounds(450, 150, 50, 27);
        this.nometattab1.setFont(new Font("Tahoma", 0, 10));
        this.nometattab1.setText("..............");
        this.jPanel12.add(this.nometattab1);
        this.nometattab1.setBounds(130, 140, 140, 40);
        this.cinetat1.setFont(new Font("Tahoma", 0, 10));
        this.cinetat1.setText("...........");
        this.jPanel12.add(this.cinetat1);
        this.cinetat1.setBounds(510, 150, 60, 27);
        this.jTextField16.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel12.add(this.jTextField16);
        this.jTextField16.setBounds(120, 130, 150, 60);
        this.jTextField17.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField17.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField17ActionPerformed(evt);
            }
        });
        this.jPanel12.add(this.jTextField17);
        this.jTextField17.setBounds(10, 130, 60, 60);
        this.jTextField18.setFont(new Font("Tahoma", 1, 12));
        this.jTextField18.setText("    Nom et Prenom");
        this.jTextField18.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField18.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField18ActionPerformed(evt);
            }
        });
        this.jPanel12.add(this.jTextField18);
        this.jTextField18.setBounds(120, 100, 150, 30);
        this.jTextField19.setFont(new Font("Tahoma", 1, 12));
        this.jTextField19.setText("N\u00b0CIN");
        this.jTextField19.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField19ActionPerformed(evt);
            }
        });
        this.jPanel12.add(this.jTextField19);
        this.jTextField19.setBounds(500, 100, 70, 30);
        this.jTextField20.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel12.add(this.jTextField20);
        this.jTextField20.setBounds(500, 130, 70, 60);
        this.jTextField21.setFont(new Font("Tahoma", 1, 12));
        this.jTextField21.setText("Mecano");
        this.jTextField21.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField21.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField21ActionPerformed(evt);
            }
        });
        this.jPanel12.add(this.jTextField21);
        this.jTextField21.setBounds(70, 100, 50, 30);
        this.jTextField22.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel12.add(this.jTextField22);
        this.jTextField22.setBounds(70, 130, 50, 60);
        this.jTextField23.setFont(new Font("Tahoma", 1, 12));
        this.jTextField23.setText("Etablissement");
        this.jTextField23.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField23.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField23ActionPerformed(evt);
            }
        });
        this.jPanel12.add(this.jTextField23);
        this.jTextField23.setBounds(350, 100, 90, 30);
        this.jTextField24.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel12.add(this.jTextField24);
        this.jTextField24.setBounds(350, 130, 90, 60);
        this.jTextField25.setFont(new Font("Tahoma", 1, 12));
        this.jTextField25.setText("     CNR");
        this.jTextField25.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField25.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField25ActionPerformed(evt);
            }
        });
        this.jPanel12.add(this.jTextField25);
        this.jTextField25.setBounds(270, 100, 80, 30);
        this.jTextField26.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel12.add(this.jTextField26);
        this.jTextField26.setBounds(270, 130, 80, 60);
        this.jTextField27.setFont(new Font("Tahoma", 1, 12));
        this.jTextField27.setText("Montant");
        this.jTextField27.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField27.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField27ActionPerformed(evt);
            }
        });
        this.jPanel12.add(this.jTextField27);
        this.jTextField27.setBounds(440, 100, 60, 30);
        this.jTextField28.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel12.add(this.jTextField28);
        this.jTextField28.setBounds(440, 130, 60, 60);
        this.mecanoetat3.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat3.setText(".............");
        this.jPanel12.add(this.mecanoetat3);
        this.mecanoetat3.setBounds(80, 150, 50, 27);
        GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
        this.jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel12, -2, 580, -2)));
        jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel12, -2, 78, -2).addContainerGap(-1, 32767)));
        this.mainleveeee.setBackground(new Color(255, 255, 255));
        this.mainleveeee.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.mainleveeee.setLayout(null);
        this.jLabel19.setFont(new Font("Tahoma", 1, 20));
        this.jLabel19.setText("MAIN  LEVEE");
        this.jLabel19.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.mainleveeee.add(this.jLabel19);
        this.jLabel19.setBounds(200, 120, 140, 30);
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
        this.jLabel110.setBounds(350, 570, 140, 20);
        this.jLabel111.setFont(new Font("Tahoma", 0, 14));
        this.jLabel111.setText("et d'informer les services comp\u00e9tents du Minist\u00e9re de la Sant\u00e9 pour ex\u00e9cution .");
        this.mainleveeee.add(this.jLabel111);
        this.jLabel111.setBounds(10, 510, 530, 20);
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
        this.jLabel116.setFont(new Font("Tahoma", 0, 14));
        this.jLabel116.setText("Pour solder la cession sur salaire ");
        this.mainleveeee.add(this.jLabel116);
        this.jLabel116.setBounds(10, 410, 197, 20);
        this.dateimpression.setFont(new Font("Tahoma", 1, 14));
        this.dateimpression.setText("............");
        this.mainleveeee.add(this.dateimpression);
        this.dateimpression.setBounds(130, 470, 400, 20);
        this.jLabel117.setFont(new Font("Tahoma", 0, 14));
        this.jLabel117.setText("Etablisement :");
        this.mainleveeee.add(this.jLabel117);
        this.jLabel117.setBounds(10, 370, 90, 20);
        this.montantglo.setFont(new Font("Tahoma", 1, 14));
        this.montantglo.setText("............");
        this.mainleveeee.add(this.montantglo);
        this.montantglo.setBounds(210, 410, 320, 20);
        this.jLabel118.setFont(new Font("Tahoma", 0, 14));
        this.jLabel118.setText("qui \u00e9t\u00e9 effectu\u00e9e le");
        this.mainleveeee.add(this.jLabel118);
        this.jLabel118.setBounds(10, 470, 120, 20);
        this.registre.setFont(new Font("Tahoma", 1, 14));
        this.registre.setText("......................");
        this.mainleveeee.add(this.registre);
        this.registre.setBounds(70, 440, 450, 20);
        this.jLabel119.setFont(new Font("Tahoma", 0, 14));
        this.jLabel119.setText("Mr le greffier du TRIBUNAL CANTONAL DE MAHDIA est pri\u00e9 d'accepter ce Main Lev\u00e9e");
        this.mainleveeee.add(this.jLabel119);
        this.jLabel119.setBounds(10, 490, 530, 20);
        this.jLabel120.setFont(new Font("Tahoma", 0, 14));
        this.jLabel120.setText("sous n\u00b0 :");
        this.mainleveeee.add(this.jLabel120);
        this.jLabel120.setBounds(10, 430, 60, 40);
        this.etabmain.setFont(new Font("Tahoma", 1, 14));
        this.etabmain.setText("............");
        this.mainleveeee.add(this.etabmain);
        this.etabmain.setBounds(100, 370, 190, 20);
        this.etatmainleve.setBackground(new Color(255, 255, 255));
        this.etatmainleve.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etatmainleve.setLayout(null);
        this.jLabel26.setFont(new Font("Tahoma", 1, 24));
        this.jLabel26.setText("PHOTOCOPIE DU CHEQUE");
        this.etatmainleve.add(this.jLabel26);
        this.jLabel26.setBounds(120, 570, 320, 30);
        this.jSeparator4.setBackground(new Color(0, 0, 0));
        this.jSeparator4.setForeground(new Color(0, 0, 0));
        this.etatmainleve.add(this.jSeparator4);
        this.jSeparator4.setBounds(0, 230, 580, 10);
        this.jLabel27.setFont(new Font("Tahoma", 1, 24));
        this.jLabel27.setText("ETAT DE  PAYEMENT EN ESPECE");
        this.etatmainleve.add(this.jLabel27);
        this.jLabel27.setBounds(70, 40, 420, 30);
        this.jLabel121.setFont(new Font("Tahoma", 0, 14));
        this.jLabel121.setText("Matricule :");
        this.etatmainleve.add(this.jLabel121);
        this.jLabel121.setBounds(380, 310, 70, 30);
        this.nometat4.setFont(new Font("Tahoma", 1, 14));
        this.nometat4.setText("......................");
        this.etatmainleve.add(this.nometat4);
        this.nometat4.setBounds(110, 310, 260, 30);
        this.matriculeetat4.setFont(new Font("Tahoma", 1, 14));
        this.matriculeetat4.setText("......................");
        this.etatmainleve.add(this.matriculeetat4);
        this.matriculeetat4.setBounds(460, 310, 110, 30);
        this.jLabel122.setFont(new Font("Tahoma", 0, 14));
        this.jLabel122.setText("Je Soussign\u00e9 :");
        this.etatmainleve.add(this.jLabel122);
        this.jLabel122.setBounds(20, 310, 90, 30);
        this.numchequeetat4.setFont(new Font("Tahoma", 1, 14));
        this.numchequeetat4.setText("......................");
        this.etatmainleve.add(this.numchequeetat4);
        this.numchequeetat4.setBounds(280, 340, 230, 30);
        this.jLabel123.setFont(new Font("Tahoma", 0, 14));
        this.jLabel123.setText("Certifie avoir recu l'original du ch\u00e9que N\u00b0");
        this.etatmainleve.add(this.jLabel123);
        this.jLabel123.setBounds(10, 340, 250, 30);
        this.jLabel124.setFont(new Font("Tahoma", 0, 14));
        this.jLabel124.setText("/ mois");
        this.etatmainleve.add(this.jLabel124);
        this.jLabel124.setBounds(190, 490, 50, 20);
        this.jPanel14.setBackground(new Color(255, 255, 255));
        this.jPanel14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jLabel125.setFont(new Font("Tahoma", 1, 14));
        this.jLabel125.setText("Signature ");
        GroupLayout jPanel14Layout = new GroupLayout(this.jPanel14);
        this.jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup().addContainerGap(29, 32767).addComponent(this.jLabel125, -2, 99, -2).addContainerGap()));
        jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addComponent(this.jLabel125).addContainerGap(71, 32767)));
        this.etatmainleve.add(this.jPanel14);
        this.jPanel14.setBounds(420, 470, 140, 90);
        this.jSeparator5.setBackground(new Color(0, 0, 0));
        this.jSeparator5.setForeground(new Color(0, 0, 0));
        this.etatmainleve.add(this.jSeparator5);
        this.jSeparator5.setBounds(0, 560, 560, 10);
        this.jLabel126.setFont(new Font("Tahoma", 1, 24));
        this.jLabel126.setText("ACCUSE DE RECEPTION ");
        this.etatmainleve.add(this.jLabel126);
        this.jLabel126.setBounds(120, 260, 320, 30);
        this.jTextField29.setFont(new Font("Tahoma", 1, 12));
        this.jTextField29.setText("  Date");
        this.jTextField29.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField29.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField29ActionPerformed(evt);
            }
        });
        this.etatmainleve.add(this.jTextField29);
        this.jTextField29.setBounds(10, 100, 60, 30);
        this.mecanoetat4.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat4.setText(".........");
        this.etatmainleve.add(this.mecanoetat4);
        this.mecanoetat4.setBounds(79, 150, 30, 27);
        this.cnretat4.setFont(new Font("Tahoma", 0, 12));
        this.cnretat4.setText("...............");
        this.etatmainleve.add(this.cnretat4);
        this.cnretat4.setBounds(280, 150, 70, 27);
        this.etabetat4.setFont(new Font("Tahoma", 0, 12));
        this.etabetat4.setText(".....................");
        this.etatmainleve.add(this.etabetat4);
        this.etabetat4.setBounds(360, 150, 74, 27);
        this.montantetat4.setFont(new Font("Tahoma", 0, 10));
        this.montantetat4.setText("..........");
        this.etatmainleve.add(this.montantetat4);
        this.montantetat4.setBounds(450, 150, 50, 27);
        this.nometattab4.setFont(new Font("Tahoma", 0, 10));
        this.nometattab4.setText("..............");
        this.etatmainleve.add(this.nometattab4);
        this.nometattab4.setBounds(130, 140, 140, 40);
        this.cinetat4.setFont(new Font("Tahoma", 0, 10));
        this.cinetat4.setText("...........");
        this.etatmainleve.add(this.cinetat4);
        this.cinetat4.setBounds(510, 150, 60, 27);
        this.jTextField30.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etatmainleve.add(this.jTextField30);
        this.jTextField30.setBounds(120, 130, 150, 60);
        this.jTextField31.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField31.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField31ActionPerformed(evt);
            }
        });
        this.etatmainleve.add(this.jTextField31);
        this.jTextField31.setBounds(10, 130, 60, 60);
        this.jTextField32.setFont(new Font("Tahoma", 1, 12));
        this.jTextField32.setText("    Nom et Prenom");
        this.jTextField32.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField32.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField32ActionPerformed(evt);
            }
        });
        this.etatmainleve.add(this.jTextField32);
        this.jTextField32.setBounds(120, 100, 150, 30);
        this.jTextField33.setFont(new Font("Tahoma", 1, 12));
        this.jTextField33.setText("N\u00b0CIN");
        this.jTextField33.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField33.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField33ActionPerformed(evt);
            }
        });
        this.etatmainleve.add(this.jTextField33);
        this.jTextField33.setBounds(500, 100, 70, 30);
        this.jTextField34.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etatmainleve.add(this.jTextField34);
        this.jTextField34.setBounds(500, 130, 70, 60);
        this.jTextField35.setFont(new Font("Tahoma", 1, 12));
        this.jTextField35.setText("Mecano");
        this.jTextField35.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField35.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField35ActionPerformed(evt);
            }
        });
        this.etatmainleve.add(this.jTextField35);
        this.jTextField35.setBounds(70, 100, 50, 30);
        this.jTextField36.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etatmainleve.add(this.jTextField36);
        this.jTextField36.setBounds(70, 130, 50, 60);
        this.jTextField37.setFont(new Font("Tahoma", 1, 12));
        this.jTextField37.setText("Etablissement");
        this.jTextField37.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField37.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField37ActionPerformed(evt);
            }
        });
        this.etatmainleve.add(this.jTextField37);
        this.jTextField37.setBounds(350, 100, 90, 30);
        this.jTextField38.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etatmainleve.add(this.jTextField38);
        this.jTextField38.setBounds(350, 130, 90, 60);
        this.jTextField39.setFont(new Font("Tahoma", 1, 12));
        this.jTextField39.setText("     CNR");
        this.jTextField39.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField39.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField39ActionPerformed(evt);
            }
        });
        this.etatmainleve.add(this.jTextField39);
        this.jTextField39.setBounds(270, 100, 80, 30);
        this.jTextField40.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etatmainleve.add(this.jTextField40);
        this.jTextField40.setBounds(270, 130, 80, 60);
        this.jTextField41.setFont(new Font("Tahoma", 1, 12));
        this.jTextField41.setText("Montant");
        this.jTextField41.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField41.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField41ActionPerformed(evt);
            }
        });
        this.etatmainleve.add(this.jTextField41);
        this.jTextField41.setBounds(440, 100, 60, 30);
        this.jTextField42.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etatmainleve.add(this.jTextField42);
        this.jTextField42.setBounds(440, 130, 60, 60);
        this.mecanoetat5.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat5.setText(".............");
        this.etatmainleve.add(this.mecanoetat5);
        this.mecanoetat5.setBounds(80, 150, 50, 27);
        this.jLabel127.setFont(new Font("Tahoma", 0, 14));
        this.jLabel127.setText("tir\u00e9 sur B.T mahdia a titre de pret .");
        this.etatmainleve.add(this.jLabel127);
        this.jLabel127.setBounds(10, 370, 250, 30);
        this.moisrester.setFont(new Font("Tahoma", 1, 14));
        this.moisrester.setText("......................");
        this.etatmainleve.add(this.moisrester);
        this.moisrester.setBounds(40, 460, 360, 30);
        this.jLabel128.setFont(new Font("Tahoma", 0, 14));
        this.jLabel128.setText("Le reste soit:");
        this.etatmainleve.add(this.jLabel128);
        this.jLabel128.setBounds(10, 400, 90, 30);
        this.jLabel129.setFont(new Font("Tahoma", 0, 14));
        this.jLabel129.setText("est retenue pour r\u00e9gler les \u00e9ch\u00e9ances mon r\u00e9volus");
        this.etatmainleve.add(this.jLabel129);
        this.jLabel129.setBounds(240, 400, 320, 30);
        this.restmain.setFont(new Font("Tahoma", 1, 14));
        this.restmain.setText("......................");
        this.etatmainleve.add(this.restmain);
        this.restmain.setBounds(90, 400, 140, 30);
        this.jLabel130.setFont(new Font("Tahoma", 0, 14));
        this.jLabel130.setText("du dernier pr\u00e9t n\u00b0:");
        this.etatmainleve.add(this.jLabel130);
        this.jLabel130.setBounds(10, 430, 120, 30);
        this.numpret.setFont(new Font("Tahoma", 1, 14));
        this.numpret.setText("......................");
        this.etatmainleve.add(this.numpret);
        this.numpret.setBounds(140, 430, 130, 30);
        this.jLabel131.setFont(new Font("Tahoma", 0, 14));
        this.jLabel131.setText("Prochains");
        this.etatmainleve.add(this.jLabel131);
        this.jLabel131.setBounds(460, 430, 100, 30);
        this.mparmois.setFont(new Font("Tahoma", 1, 14));
        this.mparmois.setText("......................");
        this.etatmainleve.add(this.mparmois);
        this.mparmois.setBounds(90, 490, 100, 20);
        this.jLabel132.setFont(new Font("Tahoma", 0, 14));
        this.jLabel132.setText("voir Main lev\u00e9e du :");
        this.etatmainleve.add(this.jLabel132);
        this.jLabel132.setBounds(10, 520, 130, 20);
        this.jLabel133.setFont(new Font("Tahoma", 0, 14));
        this.jLabel133.setText("du :");
        this.etatmainleve.add(this.jLabel133);
        this.jLabel133.setBounds(10, 460, 30, 30);
        this.datemleve.setFont(new Font("Tahoma", 1, 14));
        this.datemleve.setText("......................");
        this.etatmainleve.add(this.datemleve);
        this.datemleve.setBounds(130, 520, 180, 20);
        this.nbmoisetat.setFont(new Font("Tahoma", 1, 14));
        this.nbmoisetat.setText("......................");
        this.etatmainleve.add(this.nbmoisetat);
        this.nbmoisetat.setBounds(350, 430, 110, 30);
        this.jLabel134.setFont(new Font("Tahoma", 0, 14));
        this.jLabel134.setText("\u00e0 raison de:");
        this.etatmainleve.add(this.jLabel134);
        this.jLabel134.setBounds(10, 490, 80, 20);
        this.jLabel135.setFont(new Font("Tahoma", 0, 14));
        this.jLabel135.setText("pour les :");
        this.etatmainleve.add(this.jLabel135);
        this.jLabel135.setBounds(280, 430, 60, 30);
        this.jPanel15.setBackground(new Color(255, 255, 255));
        this.jPanel15.setLayout(null);
        this.jLabel137.setFont(new Font("Tahoma", 0, 12));
        this.jLabel137.setText("Mahdia le ");
        this.jPanel15.add(this.jLabel137);
        this.jLabel137.setBounds(20, 20, 60, 15);
        this.dateredevance.setFont(new Font("Tahoma", 0, 12));
        this.dateredevance.setText("......................");
        this.jPanel15.add(this.dateredevance);
        this.dateredevance.setBounds(80, 14, 140, 20);
        this.jLabel139.setFont(new Font("Tahoma", 1, 18));
        this.jLabel139.setForeground(new Color(0, 51, 204));
        this.jLabel139.setText("           redevance sur pr\u00e8t");
        this.jPanel15.add(this.jLabel139);
        this.jLabel139.setBounds(110, 70, 400, 30);
        this.titredepayment.setFont(new Font("Tahoma", 1, 14));
        this.titredepayment.setText("..........................");
        this.jPanel15.add(this.titredepayment);
        this.titredepayment.setBounds(170, 190, 330, 30);
        this.jLabel140.setFont(new Font("Tahoma", 0, 14));
        this.jLabel140.setText("au");
        this.jPanel15.add(this.jLabel140);
        this.jLabel140.setBounds(280, 220, 20, 20);
        this.somredevance.setFont(new Font("Tahoma", 1, 14));
        this.somredevance.setText(".................................................................");
        this.jPanel15.add(this.somredevance);
        this.somredevance.setBounds(430, 173, 100, 20);
        this.jLabel141.setFont(new Font("Tahoma", 0, 14));
        this.jLabel141.setText("a titre de payment de ");
        this.jPanel15.add(this.jLabel141);
        this.jLabel141.setBounds(0, 190, 150, 30);
        this.jLabel142.setFont(new Font("Tahoma", 0, 14));
        this.jLabel142.setText("pour les mois de :");
        this.jPanel15.add(this.jLabel142);
        this.jLabel142.setBounds(0, 210, 120, 30);
        this.jLabel143.setFont(new Font("Tahoma", 0, 14));
        this.jLabel143.setText("et ce sur le pr\u00e9t n\u00b0");
        this.jPanel15.add(this.jLabel143);
        this.jLabel143.setBounds(0, 240, 130, 30);
        this.jLabel145.setFont(new Font("Tahoma", 0, 14));
        this.jLabel145.setText("Autorise par ce ordre de Centre Social Mahdia de retenir la somme de ");
        this.jPanel15.add(this.jLabel145);
        this.jLabel145.setBounds(0, 170, 430, 30);
        this.refredevance.setFont(new Font("Tahoma", 1, 14));
        this.refredevance.setText("..........................");
        this.jPanel15.add(this.refredevance);
        this.refredevance.setBounds(120, 240, 190, 30);
        this.jLabel146.setFont(new Font("Tahoma", 0, 14));
        this.jLabel146.setText("je soussign\u00e9 :");
        this.jPanel15.add(this.jLabel146);
        this.jLabel146.setBounds(0, 150, 90, 30);
        this.nomredevance.setFont(new Font("Tahoma", 1, 14));
        this.nomredevance.setText(".....................................");
        this.jPanel15.add(this.nomredevance);
        this.nomredevance.setBounds(90, 150, 280, 30);
        this.matriculeredevence.setFont(new Font("Tahoma", 1, 14));
        this.matriculeredevence.setText("..........................");
        this.jPanel15.add(this.matriculeredevence);
        this.matriculeredevence.setBounds(450, 150, 80, 30);
        this.jLabel147.setFont(new Font("Tahoma", 0, 14));
        this.jLabel147.setText("Matricule");
        this.jPanel15.add(this.jLabel147);
        this.jLabel147.setBounds(380, 150, 60, 30);
        this.jLabel148.setText("Signature ");
        this.jPanel15.add(this.jLabel148);
        this.jLabel148.setBounds(270, 280, 80, 14);
        this.jLabel151.setFont(new Font("Tahoma", 1, 18));
        this.jLabel151.setForeground(new Color(0, 51, 204));
        this.jLabel151.setText("Ordre de payment d'une ancienne");
        this.jPanel15.add(this.jLabel151);
        this.jLabel151.setBounds(110, 40, 400, 30);
        this.d1re.setFont(new Font("Tahoma", 1, 14));
        this.d1re.setText("..........................");
        this.jPanel15.add(this.d1re);
        this.d1re.setBounds(110, 220, 140, 20);
        this.derredevvv.setFont(new Font("Tahoma", 1, 14));
        this.derredevvv.setText("..........................");
        this.jPanel15.add(this.derredevvv);
        this.derredevvv.setBounds(310, 220, 190, 20);
        GroupLayout jPanel13Layout = new GroupLayout(this.jPanel13);
        this.jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 564, 32767).addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel15, -2, 544, -2).addContainerGap(-1, 32767))));
        jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 612, 32767).addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel13Layout.createSequentialGroup().addGap(38, 38, 38).addComponent(this.jPanel15, -2, 574, -2).addContainerGap(-1, 32767))));
        this.jPanel16.setLayout(null);
        this.redev.setBackground(new Color(255, 255, 255));
        this.redev.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.redev.setLayout(null);
        this.jLabel167.setFont(new Font("Tahoma", 1, 24));
        this.jLabel167.setText("PHOTOCOPIE DU CHEQUE");
        this.redev.add(this.jLabel167);
        this.jLabel167.setBounds(120, 550, 320, 30);
        this.jSeparator11.setBackground(new Color(0, 0, 0));
        this.jSeparator11.setForeground(new Color(0, 0, 0));
        this.redev.add(this.jSeparator11);
        this.jSeparator11.setBounds(0, 230, 580, 10);
        this.jLabel168.setFont(new Font("Tahoma", 1, 24));
        this.jLabel168.setText("ETAT DE  PAYEMENT EN ESPECE");
        this.redev.add(this.jLabel168);
        this.jLabel168.setBounds(70, 40, 420, 30);
        this.jLabel169.setFont(new Font("Tahoma", 0, 14));
        this.jLabel169.setText("Matricule :");
        this.redev.add(this.jLabel169);
        this.jLabel169.setBounds(380, 310, 70, 30);
        this.nometat1.setFont(new Font("Tahoma", 1, 14));
        this.nometat1.setText("......................");
        this.redev.add(this.nometat1);
        this.nometat1.setBounds(110, 310, 260, 30);
        this.matriculeetat1.setFont(new Font("Tahoma", 1, 14));
        this.matriculeetat1.setText("......................");
        this.redev.add(this.matriculeetat1);
        this.matriculeetat1.setBounds(460, 310, 110, 30);
        this.jLabel170.setFont(new Font("Tahoma", 0, 14));
        this.jLabel170.setText("Je Soussign\u00e9 :");
        this.redev.add(this.jLabel170);
        this.jLabel170.setBounds(20, 310, 90, 30);
        this.numchequeetat1.setFont(new Font("Tahoma", 1, 14));
        this.numchequeetat1.setText("......................");
        this.redev.add(this.numchequeetat1);
        this.numchequeetat1.setBounds(270, 340, 260, 30);
        this.jLabel171.setFont(new Font("Tahoma", 0, 14));
        this.jLabel171.setText("pour les mois du :");
        this.redev.add(this.jLabel171);
        this.jLabel171.setBounds(10, 490, 120, 30);
        this.jLabel172.setFont(new Font("Tahoma", 0, 14));
        this.jLabel172.setText("tir\u00e9 sur B.T mahdia a titre de pret .");
        this.redev.add(this.jLabel172);
        this.jLabel172.setBounds(10, 370, 250, 30);
        this.jPanel21.setBackground(new Color(255, 255, 255));
        this.jPanel21.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jLabel173.setFont(new Font("Tahoma", 1, 14));
        this.jLabel173.setText("Signature ");
        GroupLayout jPanel21Layout = new GroupLayout(this.jPanel21);
        this.jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup().addContainerGap(28, 32767).addComponent(this.jLabel173, -2, 80, -2).addContainerGap()));
        jPanel21Layout.setVerticalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addComponent(this.jLabel173, -2, 30, -2).addContainerGap(78, 32767)));
        this.redev.add(this.jPanel21);
        this.jPanel21.setBounds(450, 410, 120, 110);
        this.jSeparator12.setBackground(new Color(0, 0, 0));
        this.jSeparator12.setForeground(new Color(0, 0, 0));
        this.redev.add(this.jSeparator12);
        this.jSeparator12.setBounds(0, 532, 560, 10);
        this.jLabel174.setFont(new Font("Tahoma", 1, 24));
        this.jLabel174.setText("ACCUSE DE RECEPTION ");
        this.redev.add(this.jLabel174);
        this.jLabel174.setBounds(120, 260, 320, 30);
        this.jTextField43.setFont(new Font("Tahoma", 1, 12));
        this.jTextField43.setText("  Date");
        this.jTextField43.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField43.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField43ActionPerformed(evt);
            }
        });
        this.redev.add(this.jTextField43);
        this.jTextField43.setBounds(10, 100, 60, 30);
        this.mecanoetat6.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat6.setText(".........");
        this.redev.add(this.mecanoetat6);
        this.mecanoetat6.setBounds(79, 150, 30, 27);
        this.cnretat2.setFont(new Font("Tahoma", 0, 12));
        this.cnretat2.setText("...............");
        this.redev.add(this.cnretat2);
        this.cnretat2.setBounds(280, 150, 70, 27);
        this.etabetat2.setFont(new Font("Tahoma", 0, 12));
        this.etabetat2.setText(".....................");
        this.redev.add(this.etabetat2);
        this.etabetat2.setBounds(360, 150, 74, 27);
        this.montantetat2.setFont(new Font("Tahoma", 0, 10));
        this.montantetat2.setText("..........");
        this.redev.add(this.montantetat2);
        this.montantetat2.setBounds(450, 150, 50, 27);
        this.nometattab2.setFont(new Font("Tahoma", 0, 10));
        this.nometattab2.setText("..............");
        this.redev.add(this.nometattab2);
        this.nometattab2.setBounds(130, 140, 140, 40);
        this.cinetat2.setFont(new Font("Tahoma", 0, 10));
        this.cinetat2.setText("...........");
        this.redev.add(this.cinetat2);
        this.cinetat2.setBounds(510, 150, 60, 27);
        this.jTextField44.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.redev.add(this.jTextField44);
        this.jTextField44.setBounds(120, 130, 150, 60);
        this.jTextField45.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField45.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField45ActionPerformed(evt);
            }
        });
        this.redev.add(this.jTextField45);
        this.jTextField45.setBounds(10, 130, 60, 60);
        this.jTextField46.setFont(new Font("Tahoma", 1, 12));
        this.jTextField46.setText("    Nom et Prenom");
        this.jTextField46.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField46.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField46ActionPerformed(evt);
            }
        });
        this.redev.add(this.jTextField46);
        this.jTextField46.setBounds(120, 100, 150, 30);
        this.jTextField47.setFont(new Font("Tahoma", 1, 12));
        this.jTextField47.setText("N\u00b0CIN");
        this.jTextField47.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField47.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField47ActionPerformed(evt);
            }
        });
        this.redev.add(this.jTextField47);
        this.jTextField47.setBounds(500, 100, 70, 30);
        this.jTextField48.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.redev.add(this.jTextField48);
        this.jTextField48.setBounds(500, 130, 70, 60);
        this.jTextField49.setFont(new Font("Tahoma", 1, 12));
        this.jTextField49.setText("Mecano");
        this.jTextField49.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField49.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField49ActionPerformed(evt);
            }
        });
        this.redev.add(this.jTextField49);
        this.jTextField49.setBounds(70, 100, 50, 30);
        this.jTextField50.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.redev.add(this.jTextField50);
        this.jTextField50.setBounds(70, 130, 50, 60);
        this.jTextField51.setFont(new Font("Tahoma", 1, 12));
        this.jTextField51.setText("Etablissement");
        this.jTextField51.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField51.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField51ActionPerformed(evt);
            }
        });
        this.redev.add(this.jTextField51);
        this.jTextField51.setBounds(350, 100, 90, 30);
        this.jTextField52.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.redev.add(this.jTextField52);
        this.jTextField52.setBounds(350, 130, 90, 60);
        this.jTextField53.setFont(new Font("Tahoma", 1, 12));
        this.jTextField53.setText("     CNR");
        this.jTextField53.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField53.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField53ActionPerformed(evt);
            }
        });
        this.redev.add(this.jTextField53);
        this.jTextField53.setBounds(270, 100, 80, 30);
        this.jTextField54.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.redev.add(this.jTextField54);
        this.jTextField54.setBounds(270, 130, 80, 60);
        this.jTextField55.setFont(new Font("Tahoma", 1, 12));
        this.jTextField55.setText("Montant");
        this.jTextField55.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField55.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cessionsursalire2.this.jTextField55ActionPerformed(evt);
            }
        });
        this.redev.add(this.jTextField55);
        this.jTextField55.setBounds(440, 100, 60, 30);
        this.jTextField56.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.redev.add(this.jTextField56);
        this.jTextField56.setBounds(440, 130, 60, 60);
        this.mecanoetat7.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat7.setText(".............");
        this.redev.add(this.mecanoetat7);
        this.mecanoetat7.setBounds(80, 150, 50, 27);
        this.jLabel175.setFont(new Font("Tahoma", 0, 14));
        this.jLabel175.setText("Certifie avoir recu l'original du ch\u00e9que N\u00b0");
        this.redev.add(this.jLabel175);
        this.jLabel175.setBounds(10, 340, 250, 30);
        this.refetatredev.setFont(new Font("Tahoma", 1, 14));
        this.refetatredev.setText("......................");
        this.redev.add(this.refetatredev);
        this.refetatredev.setBounds(352, 460, 88, 30);
        this.jLabel176.setFont(new Font("Tahoma", 0, 14));
        this.jLabel176.setText("avec un montant de :");
        this.redev.add(this.jLabel176);
        this.jLabel176.setBounds(10, 400, 140, 30);
        this.montantredevanceetat.setFont(new Font("Tahoma", 1, 14));
        this.montantredevanceetat.setText("......................");
        this.redev.add(this.montantredevanceetat);
        this.montantredevanceetat.setBounds(90, 430, 320, 30);
        this.jLabel177.setFont(new Font("Tahoma", 0, 14));
        this.jLabel177.setText("N\u00b0:");
        this.redev.add(this.jLabel177);
        this.jLabel177.setBounds(320, 460, 30, 30);
        this.resteredevance.setFont(new Font("Tahoma", 1, 14));
        this.resteredevance.setText("......................");
        this.redev.add(this.resteredevance);
        this.resteredevance.setBounds(150, 400, 290, 30);
        this.jLabel178.setFont(new Font("Tahoma", 0, 14));
        this.jLabel178.setText("au :");
        this.redev.add(this.jLabel178);
        this.jLabel178.setBounds(240, 490, 40, 30);
        this.datefinetatredev.setFont(new Font("Tahoma", 1, 14));
        this.datefinetatredev.setText("......................");
        this.redev.add(this.datefinetatredev);
        this.datefinetatredev.setBounds(270, 490, 100, 30);
        this.jLabel179.setFont(new Font("Tahoma", 0, 14));
        this.jLabel179.setText("est retenu pour solder le  ");
        this.redev.add(this.jLabel179);
        this.jLabel179.setBounds(10, 460, 160, 30);
        this.jLabel180.setFont(new Font("Tahoma", 0, 14));
        this.jLabel180.setText("le reste soit :");
        this.redev.add(this.jLabel180);
        this.jLabel180.setBounds(10, 430, 80, 30);
        this.solderlepret.setFont(new Font("Tahoma", 1, 14));
        this.solderlepret.setText("......................");
        this.redev.add(this.solderlepret);
        this.solderlepret.setBounds(170, 460, 140, 30);
        this.etatmoisredv.setFont(new Font("Tahoma", 1, 14));
        this.etatmoisredv.setText("......................");
        this.redev.add(this.etatmoisredv);
        this.etatmoisredv.setBounds(120, 490, 100, 30);
        this.jPanel16.add(this.redev);
        this.redev.setBounds(10, 10, 580, 730);
        this.jPanel17.setLayout(null);
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 12));
        this.pret.setFont(new Font("Tahoma", 0, 14));
        this.pret.setModel(new DefaultTableModel(new Object[0][], new String[]{"N\u00b0", "Date", "Ref", "Montant", "NB.M", "1er remmbours", "Dernier rembours", "valider"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Boolean.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.pret.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                cessionsursalire2.this.pretMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.pret);
        this.jPanel17.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 1, 670, 210);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.jPanel4.setLayout(null);
        this.jLabel6.setFont(new Font("Tahoma", 1, 24));
        this.jLabel6.setText("Cession Sur Salaire");
        this.jPanel4.add(this.jLabel6);
        this.jLabel6.setBounds(160, 80, 230, 30);
        this.jLabel32.setFont(new Font("Tahoma", 0, 14));
        this.jLabel32.setText("a:");
        this.jPanel4.add(this.jLabel32);
        this.jLabel32.setBounds(230, 330, 20, 30);
        this.jLabel7.setText("Matricule : ");
        this.jPanel4.add(this.jLabel7);
        this.jLabel7.setBounds(10, 60, 60, 30);
        this.jLabel9.setText("R\u00e9publique Tunisienne .");
        this.jPanel4.add(this.jLabel9);
        this.jLabel9.setBounds(10, 20, 230, 14);
        this.jLabel10.setText("Minist\u00e9re de la justice et des droits de l'homme .");
        this.jPanel4.add(this.jLabel10);
        this.jLabel10.setBounds(10, 30, 300, 20);
        this.hopital.setFont(new Font("Tahoma", 1, 14));
        this.hopital.setText("..............................");
        this.jPanel4.add(this.hopital);
        this.hopital.setBounds(400, 410, 120, 30);
        this.jLabel14.setText("Date :");
        this.jPanel4.add(this.jLabel14);
        this.jLabel14.setBounds(370, 66, 60, 14);
        this.jLabel15.setText("Dossier N\u00b0 :");
        this.jPanel4.add(this.jLabel15);
        this.jLabel15.setBounds(370, 20, 100, 14);
        this.jLabel16.setText("Cession N\u00b0:");
        this.jPanel4.add(this.jLabel16);
        this.jLabel16.setBounds(370, 30, 150, 20);
        this.jLabel33.setFont(new Font("Tahoma", 0, 14));
        this.jLabel33.setText("Conform\u00e9ment aux exigences du chapitre 2 loi du 20/07/1950 remani\u00e9 dans ");
        this.jPanel4.add(this.jLabel33);
        this.jLabel33.setBounds(40, 130, 500, 30);
        this.jLabel34.setFont(new Font("Tahoma", 0, 14));
        this.jLabel34.setText("les textes juridiques effectivement r\u00e9vis\u00e9s et en particulier la loi n\u00b0 61/42 du 11/07/1961");
        this.jPanel4.add(this.jLabel34);
        this.jLabel34.setBounds(10, 150, 550, 30);
        this.jLabel35.setFont(new Font("Tahoma", 0, 14));
        this.jLabel35.setText("jugeant que la Cession sur salaire ne peut \u00e9tre effectu\u00e9e quel que soit le montant , que ");
        this.jPanel4.add(this.jLabel35);
        this.jLabel35.setBounds(10, 170, 550, 30);
        this.jLabel36.setFont(new Font("Tahoma", 0, 14));
        this.jLabel36.setText("par le biais d'une d\u00e9claration effectu\u00e9e par le c\u00e9dant lui-m\u00e9me au bureau du greffier de ");
        this.jPanel4.add(this.jLabel36);
        this.jLabel36.setBounds(10, 190, 550, 30);
        this.jLabel37.setFont(new Font("Tahoma", 0, 14));
        this.jLabel37.setText("la cour cantonnale de sa r\u00e9sidence qui lui d\u00e9livre un recu et assume de diriger un avis ");
        this.jPanel4.add(this.jLabel37);
        this.jLabel37.setBounds(10, 210, 550, 30);
        this.jLabel38.setFont(new Font("Tahoma", 0, 14));
        this.jLabel38.setText("d'autorisation sous 48 heures au salarie d\u00e9biteur et son adjoint en charge du salaire et ");
        this.jPanel4.add(this.jLabel38);
        this.jLabel38.setBounds(10, 230, 550, 30);
        this.jLabel39.setFont(new Font("Tahoma", 0, 14));
        this.jLabel39.setText("ce au lieu ou le c\u00e9dant travaille.");
        this.jPanel4.add(this.jLabel39);
        this.jLabel39.setBounds(10, 250, 550, 30);
        this.jLabel40.setFont(new Font("Tahoma", 0, 14));
        this.jLabel40.setText("Cette Cession est bas\u00e9e uniquement sur les informations mentionn\u00e9es.");
        this.jPanel4.add(this.jLabel40);
        this.jLabel40.setBounds(10, 270, 550, 30);
        this.jLabel41.setFont(new Font("Tahoma", 0, 14));
        this.jLabel41.setText("Nous greffier du tribunal contonnal de : Mahdia");
        this.jPanel4.add(this.jLabel41);
        this.jLabel41.setBounds(10, 290, 550, 30);
        this.jLabel17.setFont(new Font("Tahoma", 1, 14));
        this.jLabel17.setText("30231 F");
        this.jPanel4.add(this.jLabel17);
        this.jLabel17.setBounds(70, 64, 140, 20);
        this.jLabel42.setFont(new Font("Tahoma", 0, 14));
        this.jLabel42.setText("S'est pr\u00e9sent\u00e9 devant ce Tribunal M(me) :");
        this.jPanel4.add(this.jLabel42);
        this.jLabel42.setBounds(10, 310, 260, 30);
        this.nometprenom.setFont(new Font("Tahoma", 1, 14));
        this.nometprenom.setText("...............................................................");
        this.jPanel4.add(this.nometprenom);
        this.nometprenom.setBounds(270, 314, 260, 20);
        this.datenai.setFont(new Font("Tahoma", 1, 14));
        this.datenai.setText("....................................");
        this.jPanel4.add(this.datenai);
        this.datenai.setBounds(70, 330, 150, 30);
        this.jLabel44.setFont(new Font("Tahoma", 0, 14));
        this.jLabel44.setText("A l'hopital :");
        this.jPanel4.add(this.jLabel44);
        this.jLabel44.setBounds(320, 410, 80, 30);
        this.lieunai.setFont(new Font("Tahoma", 1, 14));
        this.lieunai.setText("....................................");
        this.jPanel4.add(this.lieunai);
        this.lieunai.setBounds(250, 330, 260, 30);
        this.jLabel45.setFont(new Font("Tahoma", 0, 14));
        this.jLabel45.setText("Titulaire de la carte d'identit\u00e9 nationale num\u00e9ro :");
        this.jPanel4.add(this.jLabel45);
        this.jLabel45.setBounds(10, 350, 300, 30);
        this.jLabel46.setFont(new Font("Tahoma", 0, 14));
        this.jLabel46.setText("N\u00e9(e) le:");
        this.jPanel4.add(this.jLabel46);
        this.jLabel46.setBounds(10, 330, 60, 30);
        this.ncina.setFont(new Font("Tahoma", 1, 14));
        this.ncina.setText("..............................");
        this.jPanel4.add(this.ncina);
        this.ncina.setBounds(310, 350, 200, 30);
        this.jLabel47.setFont(new Font("Tahoma", 0, 14));
        this.jLabel47.setText("d\u00e9livr\u00e9e le");
        this.jPanel4.add(this.jLabel47);
        this.jLabel47.setBounds(10, 370, 70, 30);
        this.date2.setFont(new Font("Tahoma", 1, 14));
        this.date2.setText("......................");
        this.jPanel4.add(this.date2);
        this.date2.setBounds(330, 570, 210, 30);
        this.total.setFont(new Font("Tahoma", 1, 14));
        this.total.setText("........................................................................");
        this.jPanel4.add(this.total);
        this.total.setBounds(110, 450, 390, 30);
        this.jLabel49.setFont(new Font("Tahoma", 0, 14));
        this.jLabel49.setText("demeurant a ");
        this.jPanel4.add(this.jLabel49);
        this.jLabel49.setBounds(10, 390, 90, 30);
        this.addrr.setFont(new Font("Tahoma", 1, 14));
        this.addrr.setText("..............................");
        this.jPanel4.add(this.addrr);
        this.addrr.setBounds(90, 390, 220, 30);
        this.jLabel50.setFont(new Font("Tahoma", 0, 14));
        this.jLabel50.setText("Code Postal :");
        this.jPanel4.add(this.jLabel50);
        this.jLabel50.setBounds(310, 390, 90, 30);
        this.codepostal.setFont(new Font("Tahoma", 1, 14));
        this.codepostal.setText("................");
        this.jPanel4.add(this.codepostal);
        this.codepostal.setBounds(400, 390, 80, 30);
        this.jLabel51.setFont(new Font("Tahoma", 0, 14));
        this.jLabel51.setText("Sa profession :");
        this.jPanel4.add(this.jLabel51);
        this.jLabel51.setBounds(10, 410, 90, 30);
        this.jLabel52.setFont(new Font("Tahoma", 0, 14));
        this.jLabel52.setText("Mecano :");
        this.jPanel4.add(this.jLabel52);
        this.jLabel52.setBounds(330, 430, 60, 30);
        this.matricule.setFont(new Font("Tahoma", 1, 14));
        this.matricule.setText("..............................");
        this.jPanel4.add(this.matricule);
        this.matricule.setBounds(150, 430, 170, 30);
        this.jLabel53.setFont(new Font("Tahoma", 0, 14));
        this.jLabel53.setText("La somme de :");
        this.jPanel4.add(this.jLabel53);
        this.jLabel53.setBounds(10, 450, 100, 30);
        this.jLabel54.setFont(new Font("Tahoma", 0, 14));
        this.jLabel54.setText("Autorisons l'employeur ci-dessous mentionn\u00e9 un rabais mensuel de son salaire et des ");
        this.jPanel4.add(this.jLabel54);
        this.jLabel54.setBounds(10, 470, 530, 30);
        this.jLabel55.setFont(new Font("Tahoma", 0, 14));
        this.jLabel55.setText("primes relatives au salaire comme suit:");
        this.jPanel4.add(this.jLabel55);
        this.jLabel55.setBounds(10, 490, 530, 30);
        this.grade.setFont(new Font("Tahoma", 1, 14));
        this.grade.setText("..............................");
        this.jPanel4.add(this.grade);
        this.grade.setBounds(100, 410, 210, 30);
        this.jLabel57.setFont(new Font("Tahoma", 0, 14));
        this.jLabel57.setText("mensuelle:");
        this.jPanel4.add(this.jLabel57);
        this.jLabel57.setBounds(210, 550, 70, 17);
        this.jLabel58.setFont(new Font("Tahoma", 0, 14));
        this.jLabel58.setText(" de Tranche ");
        this.jPanel4.add(this.jLabel58);
        this.jLabel58.setBounds(10, 530, 90, 20);
        this.globale.setFont(new Font("Tahoma", 1, 14));
        this.globale.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.globale);
        this.globale.setBounds(440, 520, 80, 50);
        this.jLabel59.setFont(new Font("Tahoma", 0, 14));
        this.jLabel59.setText("des reception d'une copie de cette Cession enregistr\u00e9e au tribunal conform\u00e9ment a la loi");
        this.jPanel4.add(this.jLabel59);
        this.jLabel59.setBounds(10, 670, 540, 30);
        this.jLabel60.setFont(new Font("Tahoma", 0, 14));
        this.jLabel60.setText("Global:");
        this.jPanel4.add(this.jLabel60);
        this.jLabel60.setBounds(380, 540, 50, 30);
        this.jLabel62.setFont(new Font("Tahoma", 0, 14));
        this.jLabel62.setText("Au:");
        this.jPanel4.add(this.jLabel62);
        this.jLabel62.setBounds(300, 570, 30, 30);
        this.jLabel63.setFont(new Font("Tahoma", 0, 14));
        this.jLabel63.setText("Bas\u00e9 sur ce fait. il/elle d\u00e9clare qu'il autorise a l'administration g\u00e9nerale du secr\u00e9t\u00e9riat");
        this.jPanel4.add(this.jLabel63);
        this.jLabel63.setBounds(10, 590, 530, 30);
        this.jLabel64.setFont(new Font("Tahoma", 0, 14));
        this.jLabel64.setText("g\u00e9nerale de transf\u00e9rer les sommes enti\u00e9res au compte courant N\u00b0 : 7040440103/2");
        this.jPanel4.add(this.jLabel64);
        this.jLabel64.setBounds(10, 610, 520, 30);
        this.jLabel65.setFont(new Font("Tahoma", 0, 14));
        this.jLabel65.setText("a  : Attijari Bank sise a Tunis El Mechtel au nom de la Mutuelle de la Sante");
        this.jPanel4.add(this.jLabel65);
        this.jLabel65.setBounds(10, 630, 520, 30);
        this.jLabel66.setFont(new Font("Tahoma", 0, 14));
        this.jLabel66.setText("Bublique  \" la Solidarit\u00e9 \".");
        this.jPanel4.add(this.jLabel66);
        this.jLabel66.setBounds(10, 650, 520, 30);
        this.jLabel8.setFont(new Font("Tahoma", 1, 10));
        this.jLabel8.setText("l'adh\u00e9rent");
        this.jPanel4.add(this.jLabel8);
        this.jLabel8.setBounds(440, 700, 100, 20);
        this.jLabel11.setFont(new Font("Tahoma", 1, 10));
        this.jLabel11.setText("Le greffier du tribunal");
        this.jPanel4.add(this.jLabel11);
        this.jLabel11.setBounds(20, 700, 150, 20);
        this.jLabel12.setFont(new Font("Tahoma", 1, 10));
        this.jLabel12.setText("Pr/La pr\u00e9sidente de la mutuelle");
        this.jPanel4.add(this.jLabel12);
        this.jLabel12.setBounds(190, 700, 170, 20);
        this.jLabel67.setFont(new Font("Tahoma", 0, 14));
        this.jLabel67.setText("Nombre ");
        this.jPanel4.add(this.jLabel67);
        this.jLabel67.setBounds(20, 510, 60, 30);
        this.jLabel68.setFont(new Font("Tahoma", 0, 14));
        this.jLabel68.setText("Rabais ");
        this.jPanel4.add(this.jLabel68);
        this.jLabel68.setBounds(220, 520, 43, 30);
        this.nbbmois.setFont(new Font("Tahoma", 1, 14));
        this.nbbmois.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.nbbmois);
        this.nbbmois.setBounds(90, 520, 80, 50);
        this.jLabel69.setFont(new Font("Tahoma", 0, 14));
        this.jLabel69.setText("Montant");
        this.jPanel4.add(this.jLabel69);
        this.jLabel69.setBounds(380, 510, 51, 30);
        this.jLabel70.setFont(new Font("Tahoma", 0, 14));
        this.jLabel70.setText("mensuelle:");
        this.jPanel4.add(this.jLabel70);
        this.jLabel70.setBounds(20, 550, 70, 17);
        this.livcin.setFont(new Font("Tahoma", 1, 14));
        this.livcin.setText("..............................");
        this.jPanel4.add(this.livcin);
        this.livcin.setBounds(80, 370, 210, 30);
        this.rabais.setFont(new Font("Tahoma", 1, 14));
        this.rabais.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.rabais);
        this.rabais.setBounds(280, 520, 80, 50);
        this.jLabel71.setFont(new Font("Tahoma", 0, 14));
        this.jLabel71.setText("Et ce a compte du:");
        this.jPanel4.add(this.jLabel71);
        this.jLabel71.setBounds(10, 570, 120, 30);
        this.date1.setFont(new Font("Tahoma", 1, 14));
        this.date1.setText(".....................................................");
        this.jPanel4.add(this.date1);
        this.date1.setBounds(130, 570, 160, 30);
        this.cin2.setFont(new Font("Tahoma", 0, 14));
        this.cin2.setText("...................");
        this.jPanel4.add(this.cin2);
        this.cin2.setBounds(440, 44, 90, 20);
        this.jLabel56.setFont(new Font("Tahoma", 0, 14));
        this.jLabel56.setText("N\u00b0 identifiant unique :");
        this.jPanel4.add(this.jLabel56);
        this.jLabel56.setBounds(10, 430, 140, 30);
        this.mecanoo.setFont(new Font("Tahoma", 1, 14));
        this.mecanoo.setText("................");
        this.jPanel4.add(this.mecanoo);
        this.mecanoo.setBounds(400, 430, 80, 30);
        this.jLabel99.setText("Tribunal Cantonnal de : ");
        this.jPanel4.add(this.jLabel99);
        this.jLabel99.setBounds(10, 40, 150, 30);
        this.jLabel100.setFont(new Font("Tahoma", 1, 11));
        this.jLabel100.setText("Mahdia");
        this.jPanel4.add(this.jLabel100);
        this.jLabel100.setBounds(150, 50, 50, 14);
        this.jLabel31.setText("C.I.N      N\u00b0:");
        this.jPanel4.add(this.jLabel31);
        this.jLabel31.setBounds(370, 50, 70, 10);
        GroupLayout jPanel18Layout = new GroupLayout(this.jPanel18);
        this.jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jPanel4, -2, 556, -2).addContainerGap(87, 32767)));
        jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel4, -2, 828, -2).addContainerGap(-1, 32767)));
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel16, -1, 713, 32767).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel11, -2, 556, -2)).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap(149, 32767).addComponent(this.jPanel13, -2, -1, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.jPanel7, -1, 694, 32767)).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.mainleveeee, -2, 546, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel18, -2, -1, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, 703, 32767)).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel17, -2, 685, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.etatmainleve, -2, 573, -2).addComponent(this.jPanel3, -2, 572, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 130, 32767))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.jPanel1, -2, 344, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel17, -2, 225, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel18, -2, 37, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jPanel3, -2, 567, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel13, -2, 69, -2).addGap(18, 18, 18).addComponent(this.jPanel16, -2, 792, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel7, -2, 478, -2).addGap(231, 231, 231).addComponent(this.jPanel11, -2, 83, -2).addGap(35, 35, 35).addComponent(this.mainleveeee, -2, 648, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.etatmainleve, -2, 575, -2).addGap(198, 198, 198)));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, 4172, -2).addContainerGap(4193, 32767)));
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void nbmoisActionPerformed(ActionEvent evt) {
    }

    private void mensualit\u00e9ActionPerformed(ActionEvent evt) {
    }

    private void imprimerActionPerformed(ActionEvent evt) {
        SimpleDateFormat dateFormattd;
        Date actuellEed;
        this.numces.setText("ytyuu");
        this.num = 0;
        System.out.println("test ============************************========" + this.test);
        Date actuellEeddc = new Date();
        SimpleDateFormat dateFormattddcd = new SimpleDateFormat("dd/MM/yyyy");
        String datdddc = dateFormattddcd.format(actuellEeddc);
        String anneaccccc = datdddc.substring(datdddc.length() - 4, datdddc.length());
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn22 = null;
        try {
            conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        String num406 = "0";
        String anne406 = "";
        String bq406 = "";
        
        if (this.direct.isSelected()) {
            int n406 = 0;
            actuellEed = new Date();
            dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
            String dat = dateFormattd.format(actuellEed);
            String anneactuel = dat.substring(0, dat.length() - 2);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String p = "1";
                ResultSet result2 = state2.executeQuery("SELECT * FROM cession2 WHERE anne406='" + anneaccccc + "'");
                while (result2.next()) {
                    this.k = 1;
                    String n = result2.getString("n406");
                    int r = Integer.parseInt(n);
                    System.out.println("r = " + r);
                    if (r <= n406) continue;
                    System.out.println("num = " + this.num);
                    n406 = r;
                }
            }
            catch (Exception e) {
                this.k = 0;
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de terminer num " + e.getMessage());
            }
            num406 = "" + ++n406 + "";
            anne406 = anneaccccc;
            if (this.codeb.getText().equals("")) {
                this.k = 0;
                JOptionPane.showMessageDialog(null, "Sasir code BANQUE ");
            } else {
                this.k = 1;
                bq406 = this.codeb.getText();
            }
        }
       
        
        
        
        if (this.k == 1) {
            JOptionPane jop3;
            JOptionPane jop32;
            String di;
            JOptionPane jop33;
            String moisfin;
            JOptionPane jop34;
            ResultSet result;
            Date actuellEe;
            ResultSet result3;
            Statement state;
            String adi;
            Statement state2;
            String n;
            int r;
            String dateS;
            String datddd;
            String p;
            String mchbd;
            String datdd;
            String mec;
            JOptionPane jop35;
            ResultSetMetaData resultMeta;
            int r2;
            String miilV;
            int i;
            String mois2;
            int monm;
            JOptionPane jop1;
            String ch1;
            ResultSetMetaData resultMeta3;
            JOptionPane jop36;
            String jours;
            Statement state22;
            SimpleDateFormat dateFormatt;
            ResultSetMetaData resultMeta2;
            ResultSet result2;
            int i2;
            String mil;
            ResultSet result22;
            Statement state3;
            String anneac;
            int ms;
            JOptionPane jop2;
            String dii;
            String p2;
            System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            System.out.println("N\u00b0 =" + this.num);
            this.numces.setText("DC :" + this.num + "/ 300 / " + anneaccccc);
            if (this.test == 1) {
                block567 : {
                    this.k = 0;
                    actuellEed = new Date();
                    dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
                    datddd = dateFormattd.format(actuellEed);
                    dateS = datddd.substring(3, datddd.length());
                    SimpleDateFormat dateactuelle = new SimpleDateFormat("yyyyMM");
                    this.dateatt.setText(datddd);
                    this.datemleve.setText(datddd);
                    String dat = dateactuelle.format(actuellEed);
                    String moisactuel = dat.substring(dat.length() - 2, dat.length());
                    String anneactuel = dat.substring(0, dat.length() - 2);
                    Date actuellEee = new Date();
                    SimpleDateFormat dateFormatt2 = new SimpleDateFormat("dd/MM/yyyy");
                    String datddj = dateFormatt2.format(actuellEee);
                    String joursj = datddj.substring(0, datddj.length() - 8);
                    System.out.println("mois actuelle :" + moisactuel + "--");
                    System.out.println("anne actuelle :" + anneactuel + "--");
                    String moiactueleenlettre = "";
                    if (moisactuel.equals("01")) {
                        moiactueleenlettre = "F\u00e9vrier  ";
                    } else if (moisactuel.equals("02")) {
                        moiactueleenlettre = "Mars  ";
                    } else if (moisactuel.equals("03")) {
                        moiactueleenlettre = "Avril  ";
                    } else if (moisactuel.equals("04")) {
                        moiactueleenlettre = "Mai  ";
                    } else if (moisactuel.equals("05")) {
                        moiactueleenlettre = "Juin  ";
                    } else if (moisactuel.equals("06")) {
                        moiactueleenlettre = "Juillet  ";
                    } else if (moisactuel.equals("07")) {
                        moiactueleenlettre = "Ao\u00fbt  ";
                    } else if (moisactuel.equals("08")) {
                        moiactueleenlettre = "Septembre  ";
                    } else if (moisactuel.equals("09")) {
                        moiactueleenlettre = "Octobre  ";
                    } else if (moisactuel.equals("10")) {
                        moiactueleenlettre = "Novembre  ";
                    } else if (moisactuel.equals("11")) {
                        moiactueleenlettre = "D\u00e9cembre  ";
                    } else if (moisactuel.equals("12")) {
                        moiactueleenlettre = "Janvier  ";
                        int a = Integer.parseInt(anneactuel);
                        anneactuel = "" + ++a + "";
                    } else {
                        moiactueleenlettre = "!!!!!!!!!!!";
                    }
                    this.mecat.setText(this.mecano.getText());
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state23 = conn22.createStatement();
                        ResultSet result23 = state23.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                        ResultSetMetaData resultMeta22 = result23.getMetaData();
                        while (result23.next()) {
                            this.k = 1;
                            this.nometprenommain.setText(result23.getString("NOM"));
                            this.matriculemain.setText(result23.getString("NCNR"));
                            this.cin.setText(result23.getString("CIN"));
                            this.Adresse.setText(result23.getString("ADRES"));
                            this.profession.setText(result23.getString("TRVAIL"));
                            this.tt = result23.getString("TRVAIL");
                            this.lit = result23.getString("LIEUTRAVAIL");
                            this.etabmain.setText(result23.getString("etab"));
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop37 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adherant n'existe pas" + e.getMessage());
                        this.k = 0;
                    }
                    if (this.k == 1) {
                        int moisa = 0;
                        int aneact = 0;
                        int moisf = 0;
                        int anef = 0;
                        int nbdemois = 0;
                        try {
                            this.k = 0;
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state4 = conn2.createStatement();
                            String totamoisreste = "";
                            String ii = "1";
                            ResultSet result32 = state4.executeQuery("SELECT * FROM cession2  WHERE Mecano='" + this.mecano.getText() + "' AND pv='" + ii + "'");
                            String mm = null;
                            String annedenier = null;
                            String moiddebut = "";
                            String derniermois = null;
                            String montantparsmois = "";
                            while (result32.next()) {
                                this.k = 1;
                                derniermois = result32.getString("derniermois");
                                this.moisrester.setText(moiactueleenlettre + "" + anneactuel + "  \u00e0  " + derniermois);
                                montantparsmois = result32.getString("montantparmois");
                                this.mparmois.setText(montantparsmois);
                                String montantglobale = result32.getString("Montant");
                                montantglobale = montantglobale.substring(0, montantglobale.length() - 3);
                                this.montantglo.setText(montantglobale + ",000");
                                this.restmain.setText(montantglobale + ",000");
                                System.out.println("montant globale ******** " + montantglobale + ",000");
                                System.out.println("---------------------------");
                                this.r = result32.getString("ref");
                                System.out.println("Mecano ******** " + this.mecano.getText() + " --");
                                System.out.println("Registre ******** " + this.r + " --");
                                String rr = this.r.substring(0, this.r.length() - 3);
                                String num = this.r.substring(this.r.length() - 2, this.r.length());
                                System.out.println("Num registre ****** " + num + " --");
                                this.numpret.setText(rr + "/" + num);
                                this.registre.setText(rr);
                                this.dateimpression.setText(result32.getString("date"));
                            }
                            if (this.k == 1) {
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
                                    mm = "05";
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
                                System.out.println("***Anne actuelle *****" + aneact);
                                moisf = Integer.parseInt(mm);
                                anef = Integer.parseInt(annedenier);
                                System.out.println("***************" + moisf + "--");
                                System.out.println("******Anne fin*********" + anef + "--");
                                mm = annedenier + mm;
                                System.out.println("***************" + mm + "--");
                                System.out.println("***************" + dat + "--");
                                int a = anef - aneact;
                                System.out.println("****a =*******" + a + "--");
                                int nb = 0;
                                if (a >= 1) {
                                    nb = 12 - moisa;
                                    nbdemois = moisf;
                                    System.out.println("********nbdemois*******" + nbdemois);
                                } else if (a == 0) {
                                    int jj = this.lit.indexOf("SFAR");
                                    int jactuele = Integer.parseInt(joursj);
                                    nb = this.tt.equals("Ouvrier") && jj > -1 ? (jactuele > 6 ? moisf - moisa : moisf - moisa + 1) : moisf - moisa;
                                }
                                System.out.println("********nb*******" + nb);
                                System.out.println("********nombre de mois = " + (nbdemois += nb));
                                this.nbmoisetat.setText("" + nbdemois + " mois ");
                                this.montantglobalee = nbdemois * m;
                                System.out.println("********Montant par mois = " + m);
                                System.out.println("********Montant globale = " + this.montantglobalee);
                                System.out.println("********Montant de main lev\u00e9e *******" + this.montantglobalee);
                                String adii = Nombre.CALCULATE.getValue(this.montantglobalee, " Dinars ");
                                this.globale1.setText("" + this.montantglobalee + ",000 (" + adii.toUpperCase() + ")");
                                this.restmain.setText("" + this.montantglobalee + ",000 Dinar ");
                                JOptionPane jop = new JOptionPane();
                                this.testmain = 0;
                                String montantmainlevve = "" + this.montantglobalee + "";
                                String datedebutmainleve\u00e9 = "";
                                String datefinmainleve\u00e9 = "" + moisf + "/" + anef;
                                String nbmoismainleve = "" + nb + "";
                                int option = JOptionPane.showConfirmDialog(null, "Attention : Impression De Main lev\u00e9e ( Montant=" + this.montantglobalee + " )", "Attention", 0, 3);
                                if (option == 0) {
                                    Statement state24;
                                    this.testmain = 1;
                                    Impression1 sd = new Impression1(this.mainleveeee);
                                    sd.actionPerformed(evt);
                                    int nummainleve = 0;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state24 = conn2.createStatement();
                                        result22 = state24.executeQuery("SELECT * FROM Mainleveetat  WHERE aanne=" + aneact);
                                        while (result22.next()) {
                                            String nummainle = result22.getString("num");
                                            int nn = Integer.parseInt(nummainle);
                                            if (nn <= nummainleve) continue;
                                            nummainleve = nn;
                                        }
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        jop34 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur montant F " + e.getMessage());
                                    }
                                    ++nummainleve;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state24 = conn2.createStatement();
                                        String mml = moiactueleenlettre + "" + anneactuel + "  \u00e0  " + derniermois;
                                        state24.executeUpdate("INSERT INTO Mainleveetat(num,anne,mecano,Date,mont,bq,nbmois,mc) VALUES('" + nummainleve + "','" + aneact + "','" + this.mecano.getText() + "','" + datddd + "','" + montantmainlevve + "','" + this.codeb.getText() + "','" + mml + "','" + this.mc.getText() + "')");
                                        this.k = 1;
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        JOptionPane jop12 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                    }
                                }
                                if (this.testmain == 1) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state25 = conn22.createStatement();
                                        String p3 = "2";
                                        state25.executeUpdate("UPDATE  cession2 SET pv='" + p3 + "' WHERE MECANO='" + this.mecano.getText() + "'AND ref='" + this.r + "'");
                                    }
                                    catch (Exception e) {
                                        jop1 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur d'ajout le main lev\u00e9e a l'etat : " + e.getMessage());
                                    }
                                }
                                break block567;
                            }
                            JOptionPane jop13 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Aucune ceesion !!! ");
                        }
                        catch (Exception e) {
                            JOptionPane jop38 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                        }
                    }
                }
                if (this.testmain == 1) {
                    String ch12;
                    String di2;
                    int nbm;
                    block568 : {
                        boolean g;
                        JOptionPane jop22;
                        this.dateactuele.setText(datddd);
                        this.k = 1;
                        boolean bl = g = this.mecano.getText().equals("") || this.mensualit\u00e9.getText().equals("") || this.nbmois.getText().equals("");
                        if (g) {
                            this.k = 0;
                            jop22 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
                        } else if (this.mensualit\u00e9.getText().length() < 4) {
                            jop22 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Montant Incorrecte", "Attention", 0);
                            this.k = 0;
                        }
                        ch12 = "";
                        nbm = Integer.parseInt(this.nbmois.getText());
                        this.montglobale = Integer.parseInt(this.mensualit\u00e9.getText());
                        int somme = this.montglobale / nbm;
                        String ss = "" + this.montglobale + "";
                        String ssV = "" + somme + "";
                        int tV = ssV.length() - 3;
                        String diiV = ssV.substring(0, ssV.length() - 3);
                        String miilV2 = ssV.substring(tV, ssV.length());
                        this.rabais.setText(diiV + "," + miilV2);
                        this.parmois = diiV + "," + miilV2;
                        this.montantparmoisd.setText(this.parmois + " DT");
                        int tt = ss.length() - 3;
                        String dii2 = ss.substring(0, ss.length() - 3);
                        String miil = ss.substring(tt, ss.length());
                        this.ch = "( " + dii2 + "," + miil + " DT )";
                        this.globale.setText(dii2 + "," + miil);
                        String mmontant = "" + this.montglobale + "";
                        int t = mmontant.length() - 3;
                        di2 = mmontant.substring(0, mmontant.length() - 3);
                        String mil2 = mmontant.substring(t, mmontant.length());
                        this.mont = di2 + "," + mil2;
                        int mon = Integer.parseInt(di2);
                        String adi2 = "";
                        try {
                            adi2 = Nombre.CALCULATE.getValue(mon, " Dinars ");
                        }
                        catch (Exception ex) {
                            Logger.getLogger(cessionsursalire2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        this.total.setText(adi2 + " (" + this.mont + " )");
                        this.montantletrechiffd.setText(adi2 + " (" + this.mont + " )");
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state5 = conn2.createStatement();
                            ResultSet result4 = state5.executeQuery("SELECT md  FROM  montantcession2 WHERE md=" + di2);
                            ResultSetMetaData resultMeta4 = result4.getMetaData();
                            while (result4.next()) {
                                for (int i3 = 1; i3 <= resultMeta4.getColumnCount(); ++i3) {
                                    ch12 = result4.getObject(i3).toString();
                                }
                            }
                            if (ch12.equals("")) {
                                jop1 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Montant n'existe ps  ", "Information", 1);
                                this.k = 0;
                                break block568;
                            }
                            this.k = 1;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                ResultSet result33 = state5.executeQuery("SELECT * FROM montantcession2  WHERE md=" + di2);
                                ResultSetMetaData resultMeta32 = result33.getMetaData();
                                String mff = "";
                                while (result33.next()) {
                                    mff = result33.getString("mf");
                                    this.m = mff + "000";
                                    this.montantetat.setText(mff + ",000");
                                    this.montantetat1.setText(mff + ",000");
                                    this.montantetat4.setText(mff + ",000");
                                }
                                String mchbd2 = "";
                                try {
                                    int monm2 = Integer.parseInt(mff);
                                    mchbd2 = Nombre.CALCULATE.getValue(monm2, " Dinars ");
                                }
                                catch (Exception ex) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur convertire montant en lettre ");
                                }
                            }
                            catch (Exception e) {
                                JOptionPane jop39 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur montant F " + e.getMessage());
                                this.k = 0;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop310 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur montant D " + e.getMessage());
                            this.k = 0;
                        }
                    }
                    if (this.k == 1) {
                        JOptionPane jop311;
                        int aa;
                        ResultSet result24;
                        String n2;
                        Date actuellEe2 = new Date();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        String datdd2 = dateFormat.format(actuellEe2);
                        String anneac2 = datddd.substring(datddd.length() - 4, datddd.length());
                        String jours2 = datdd2.substring(0, datdd2.length() - 8);
                        System.out.println("jours =" + jours2);
                        int j = Integer.parseInt(jours2);
                        String mois3 = datdd2.substring(3, datdd2.length() - 5);
                        String ann\u00e9es = datdd2.substring(6, datdd2.length());
                        System.out.println("mois =" + mois3);
                        int ms2 = Integer.parseInt(mois3);
                        System.out.println("ann\u00e9es =" + ann\u00e9es);
                        int moiaci = Integer.parseInt(mois3);
                        System.out.println("mois 1 =" + moiaci);
                        dateS = mois3 + "/" + ann\u00e9es;
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
                        if (ms2 > moiaci) {
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
                        String moisfin2 = "";
                        System.out.println("-----------------------------");
                        System.out.println("anne dernier = " + aaa);
                        System.out.println("kk = " + kk);
                        switch (kk) {
                            case 1: {
                                moisfin2 = "Janvier  " + aaa;
                                break;
                            }
                            case 2: {
                                moisfin2 = "F\u00e9vrier  " + aaa;
                                break;
                            }
                            case 3: {
                                moisfin2 = "Mars  " + aaa;
                                break;
                            }
                            case 4: {
                                moisfin2 = "Avril  " + aaa;
                                break;
                            }
                            case 5: {
                                moisfin2 = "Mai  " + aaa;
                                break;
                            }
                            case 6: {
                                moisfin2 = "Juin  " + aaa;
                                break;
                            }
                            case 7: {
                                moisfin2 = "Juillet  " + aaa;
                                break;
                            }
                            case 8: {
                                moisfin2 = "Ao\u00fbt  " + aaa;
                                break;
                            }
                            case 9: {
                                moisfin2 = "Septembre  " + aaa;
                                break;
                            }
                            case 10: {
                                moisfin2 = "Octobre  " + aaa;
                                break;
                            }
                            case 11: {
                                moisfin2 = "Novembre  " + aaa;
                                break;
                            }
                            case 12: {
                                moisfin2 = "D\u00e9cembre  " + aaa;
                                break;
                            }
                            default: {
                                moisfin2 = "";
                            }
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state2 = conn2.createStatement();
                            p = "1";
                            result24 = state2.executeQuery("SELECT * FROM cession2 WHERE annenbc='" + anneac2 + "'");
                            this.num = 0;
                            while (result24.next()) {
                                this.k = 1;
                                n2 = result24.getString("NBC");
                                r2 = Integer.parseInt(n2);
                                System.out.println("r = " + (int)r2);
                                if (r2 <= this.num) continue;
                                System.out.println("num = " + this.num);
                                this.num = r2;
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop311 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de terminer num " + e.getMessage());
                        }
                        if (this.k == 1) {
                            ++this.num;
                            this.numces.setText("DC :" + this.num + "/ 300 / " + anneaccccc);
                            System.out.print("---------------------------  DC :" + this.num + "/ 300 / " + anneac2);
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state2 = conn2.createStatement();
                                p = "1";
                                result24 = state2.executeQuery("SELECT * FROM cession2 WHERE annenbc='" + anneac2 + "'");
                                while (result24.next()) {
                                    this.k = 1;
                                    n2 = result24.getString("NBC");
                                    r2 = Integer.parseInt(n2);
                                    System.out.println("r = " + (int)r2);
                                    if (r2 <= this.num) continue;
                                    System.out.println("num = " + this.num);
                                    this.num = r2;
                                }
                            }
                            catch (Exception e) {
                                this.k = 0;
                                jop311 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur de terminer num " + e.getMessage());
                            }
                            if (this.k == 1) {
                                block569 : {
                                    System.out.println("moisfin =" + moisfin2);
                                    this.date2.setText(moisfin2);
                                    this.derniermoisd.setText(moisfin2);
                                    this.nbbmois.setText(this.nbmois.getText());
                                    this.nbmd.setText(this.nbmois.getText());
                                    String mec2 = this.mecano.getText();
                                    this.mecanod.setText(mec2);
                                    this.mecanoetat.setText(mec2);
                                    this.mecanoetat2.setText(mec2);
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state6 = conn2.createStatement();
                                        ResultSet result5 = state6.executeQuery("SELECT MECANO  FROM  adherent WHERE MECANO=" + mec2);
                                        ResultSetMetaData resultMeta5 = result5.getMetaData();
                                        while (result5.next()) {
                                            for (int i4 = 1; i4 <= resultMeta5.getColumnCount(); ++i4) {
                                                ch12 = result5.getObject(i4).toString();
                                            }
                                        }
                                        if (ch12.equals("")) {
                                            jop1 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "Adheron n'existe pas (N dossier) ", "Information", 1);
                                            this.k = 0;
                                            break block569;
                                        }
                                        ch12 = "";
                                        this.mecanoo.setText(this.mecano.getText());
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            this.mecanoetat4.setText(this.mecano.getText());
                                            ResultSet result34 = state6.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                                            ResultSetMetaData resultMeta33 = result34.getMetaData();
                                            while (result34.next()) {
                                                this.nometprenom.setText(result34.getString("NOM"));
                                                this.nomadh = result34.getString("NOM");
                                                this.nomd.setText(this.nomadh);
                                                this.nometattab.setText(this.nomadh);
                                                this.nometattab1.setText(this.nomadh);
                                                this.nometat.setText(this.nomadh);
                                                this.nometat4.setText(this.nomadh);
                                                this.nometattab4.setText(this.nomadh);
                                                this.matricule.setText(result34.getString("NCNR"));
                                                this.idend.setText(result34.getString("NCNR"));
                                                this.cnretat.setText(result34.getString("NCNR"));
                                                this.cnretat1.setText(result34.getString("NCNR"));
                                                this.matriculeetat.setText(result34.getString("NCNR"));
                                                this.matriculeetat4.setText(result34.getString("NCNR"));
                                                this.cnretat4.setText(result34.getString("NCNR"));
                                                this.ncina.setText(result34.getString("CIN"));
                                                this.cin2.setText(result34.getString("CIN"));
                                                this.cinetat4.setText(result34.getString("CIN"));
                                                this.ncinddemande.setText(result34.getString("CIN"));
                                                this.cinetat.setText(result34.getString("CIN"));
                                                this.cinetat1.setText(result34.getString("CIN"));
                                                this.codepostal.setText(result34.getString("codepostale"));
                                                this.livcin.setText(result34.getString("LIVCIN"));
                                                this.delivd.setText(result34.getString("LIVCIN"));
                                                this.datenai.setText(result34.getString("DATNAI"));
                                                this.lieunai.setText(result34.getString("LIEUNAI"));
                                                this.addrr.setText(result34.getString("ADRES"));
                                                this.grade.setText(result34.getString("TRVAIL"));
                                                this.travaille = result34.getString("TRVAIL");
                                                this.etabd.setText(result34.getString("LIEUTRAVAIL"));
                                                this.hopital.setText(result34.getString("LIEUTRAVAIL"));
                                                this.etabetat.setText(result34.getString("LIEUTRAVAIL"));
                                                this.etabetat1.setText(result34.getString("LIEUTRAVAIL"));
                                                this.lieutrv = result34.getString("LIEUTRAVAIL");
                                                this.etabetat4.setText(result34.getString("LIEUTRAVAIL"));
                                            }
                                        }
                                        catch (Exception e) {
                                            jop3 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                                            this.k = 0;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop36 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                                        this.k = 0;
                                    }
                                }
                                System.out.println(" profession  = " + this.travaille);
                                if (this.travaille.equals("")) {
                                    System.out.println(" profession  = " + this.travaille);
                                    this.k = 0;
                                    jop311 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, " Aucune Profession pour cette adh\u00e9rent !!!");
                                }
                                if (this.k == 1) {
                                    JOptionPane jop = new JOptionPane();
                                    int option = JOptionPane.showConfirmDialog(null, "Adherent " + this.nomadh + " / Montant= " + this.parmois + "DT Par Mois -- (N\u00b0 Cession : " + this.num + " )", "Attention", 0, 3);
                                    if (option == 0) {
                                        ResultSet result25;
                                        JOptionPane jop312;
                                        Statement state26;
                                        String p4;
                                        String p5;
                                        int jj;
                                        Statement state27;
                                        this.k = 1;
                                        Impression1 s = new Impression1(this.jPanel4);
                                        s.actionPerformed(evt);
                                        String gu = "" + this.montglobale + "";
                                        String gg = gu.substring(0, gu.length() - 3);
                                        int montantcession = Integer.parseInt(gg);
                                        int montantmainlev\u00e9e = this.montantglobalee;
                                        String ml = "" + montantmainlev\u00e9e + "";
                                        String mmleve = ml.substring(0, ml.length() - 3);
                                        montantmainlev\u00e9e = Integer.parseInt(ml);
                                        String mff = "";
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Statement state28 = conn2.createStatement();
                                            ResultSet result26 = state28.executeQuery("SELECT * FROM montantcession2  WHERE md=" + montantcession);
                                            while (result26.next()) {
                                                mff = result26.getString("mf");
                                                System.out.println("mf=" + mff);
                                            }
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            JOptionPane jop313 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur montant F " + e.getMessage());
                                        }
                                        montantcession = Integer.parseInt(mff);
                                        int montfinale = montantcession - montantmainlev\u00e9e;
                                        String mont = "" + montfinale + ",000";
                                        System.out.println("montant finale =" + montfinale);
                                        String montantmain = "" + montfinale + "";
                                        String typcarnet = "";
                                        typcarnet = this.travaille.equals("Ouvrier") ? ((jj = this.lieutrv.indexOf("SFAR")) != -1 ? "Pr\u00e9ts Ouvries" : "Pr\u00e9ts Personnels") : "Pr\u00e9ts Personnels";
                                        System.out.println("type de compte 2 =" + typcarnet);
                                        String numcc = "";
                                        String deb = "";
                                        int typena = 0;
                                        System.out.println("type de compte 2 =" + typcarnet);
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state27 = conn2.createStatement();
                                            p4 = "0";
                                            result25 = state27.executeQuery("SELECT * FROM comptecourant  WHERE observation='" + typcarnet + "' AND f='" + p4 + "'");
                                            typena = 1;
                                            while (result25.next()) {
                                                this.numcarnet = result25.getString("num");
                                                this.numerocheq = result25.getString("debut");
                                                deb = result25.getString("datedebut");
                                                this.k = 1;
                                            }
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop312 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                                        }
                                        if (deb.equals("")) {
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state27 = conn22.createStatement();
                                                p4 = "0";
                                                state27.executeUpdate("UPDATE  talondescheque SET p='" + p4 + "' WHERE p='1'");
                                                this.k = 1;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                            }
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state27 = conn2.createStatement();
                                                state27.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd2 + "' WHERE num='" + this.numcarnet + "'");
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop312 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                                            }
                                        } else {
                                            typena = 2;
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state27 = conn2.createStatement();
                                                p4 = "1";
                                                result25 = state27.executeQuery("SELECT * FROM talondescheque  WHERE type='" + typcarnet + "' AND p='" + p4 + "'");
                                                System.out.println("********************************** =");
                                                while (result25.next()) {
                                                    this.numerocheq = result25.getString("numcheque");
                                                    System.out.println("numero de cheque talon des cheque  =" + this.numerocheq);
                                                    this.numcarnet = result25.getString("Numcarnet");
                                                    this.k = 1;
                                                }
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop312 = new JOptionPane();
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
                                                jop312 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 1 " + e.getMessage());
                                            }
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state27 = conn2.createStatement();
                                                p4 = "1";
                                                System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                                                result25 = state27.executeQuery("SELECT * FROM comptecourant  WHERE num='" + this.numcarnet + "'");
                                                while (result25.next()) {
                                                    this.numfin = result25.getString("fin");
                                                    System.out.println("numero de cheque fin =" + this.numfin);
                                                    this.k = 1;
                                                }
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop312 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                            }
                                            try {
                                                this.Nfin = Integer.parseInt(this.numfin);
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop312 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 2  " + e.getMessage());
                                            }
                                            if (this.Nfin >= this.Nch) {
                                                if (this.Nfin == this.Nch) {
                                                    try {
                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        state27 = conn22.createStatement();
                                                        p4 = "1";
                                                        state27.executeUpdate("UPDATE  comptecourant SET f='" + p4 + "' WHERE num='" + this.numcarnet + "'");
                                                        state27.executeUpdate("UPDATE  comptecourant SET datefin='" + datdd2 + "' WHERE num='" + this.numcarnet + "'");
                                                        this.k = 1;
                                                        try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Statement state222 = conn2.createStatement();
                                                            System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                                                            ResultSet result222 = state222.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
                                                            int kkk = 1;
                                                            while (result222.next()) {
                                                                if (kkk == 1) {
                                                                    String nauveaucarnet = result222.getString("num");
                                                                    try {
                                                                        Class.forName("com.mysql.jdbc.Driver");
                                                                        Connection conn21 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                                                        Statement state21 = conn21.createStatement();
                                                                        state21.executeUpdate("UPDATE  comptecourant SET observation='" + typcarnet + "' WHERE num='" + nauveaucarnet + "'");
                                                                    }
                                                                    catch (Exception e) {
                                                                        this.k = 0;
                                                                        JOptionPane jop314 = new JOptionPane();
                                                                        JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                                                    }
                                                                }
                                                                ++kkk;
                                                            }
                                                        }
                                                        catch (Exception e) {
                                                            this.k = 0;
                                                            JOptionPane jop315 = new JOptionPane();
                                                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                                        }
                                                    }
                                                    catch (Exception e) {
                                                        this.k = 0;
                                                        jop1 = new JOptionPane();
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
                                                        state26 = conn22.createStatement();
                                                        p5 = "0";
                                                        state26.executeUpdate("UPDATE  talondescheque SET p='" + p5 + "' WHERE numcheque='" + this.numerocheq + "'");
                                                        this.k = 1;
                                                    }
                                                    catch (Exception e) {
                                                        this.k = 0;
                                                        jop1 = new JOptionPane();
                                                        JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                                    }
                                                }
                                                if (this.k == 1) {
                                                    try {
                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        state26 = conn22.createStatement();
                                                        p5 = "1";
                                                        String banque = "BT";
                                                        String mdi = di2 + "000";
                                                        state26.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnet + "','" + this.mecano.getText() + "','" + mdi + "','" + datdd2 + "','" + typcarnet + "','" + p5 + "','" + banque + "')");
                                                        this.k = 1;
                                                    }
                                                    catch (Exception e) {
                                                        this.k = 0;
                                                        jop1 = new JOptionPane();
                                                        JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                                    }
                                                }
                                            } else {
                                                this.k = 0;
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    state27 = conn2.createStatement();
                                                    p4 = "0";
                                                    System.out.println("type type  =" + typcarnet);
                                                    result25 = state27.executeQuery("SELECT * FROM comptecourant  WHERE f='" + p4 + "' AND observation ='" + typcarnet + "'");
                                                    while (result25.next()) {
                                                        this.numcarnetreserver = result25.getString("num");
                                                        this.firstcheque = result25.getString("debut");
                                                        System.out.println("numero de carnet cheque reserve 1 =" + this.numcarnetreserver);
                                                        this.k = 1;
                                                    }
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    jop312 = new JOptionPane();
                                                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                                }
                                                if (this.numcarnetreserver.equals("")) {
                                                    System.out.println("numero de carnet cheque reserve 2 =" + this.numcarnetreserver);
                                                    jop1 = new JOptionPane();
                                                    this.k = 0;
                                                    JOptionPane.showMessageDialog(null, "Aucune carnet de cheque: il faut ajouter un nouveaux carnet");
                                                } else {
                                                    try {
                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        state27 = conn22.createStatement();
                                                        p4 = "0";
                                                        state27.executeUpdate("UPDATE  talondescheque SET p='" + p4 + "' WHERE numcheque='" + this.numerocheq + "'");
                                                        this.k = 1;
                                                    }
                                                    catch (Exception e) {
                                                        this.k = 0;
                                                        jop1 = new JOptionPane();
                                                        JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                                    }
                                                    try {
                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        state27 = conn22.createStatement();
                                                        p4 = "1";
                                                        String banque = "BT";
                                                        String mffd = mff + "000";
                                                        state27.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnetreserver + "','" + this.mecano.getText() + "','" + mffd + "','" + datdd2 + "','" + typcarnet + "','" + p4 + "','" + banque + "')");
                                                        this.k = 1;
                                                        this.numcarnet = this.numcarnetreserver;
                                                    }
                                                    catch (Exception e) {
                                                        this.k = 0;
                                                        jop1 = new JOptionPane();
                                                        JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                                    }
                                                    try {
                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        state27 = conn22.createStatement();
                                                        p4 = "0";
                                                        state27.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd2 + "' WHERE num='" + this.numcarnetreserver + "'");
                                                        this.k = 1;
                                                    }
                                                    catch (Exception e) {
                                                        this.k = 0;
                                                        jop1 = new JOptionPane();
                                                        JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state27 = conn22.createStatement();
                                            this.k = 1;
                                            this.numchequeetat4.setText(this.firstcheque);
                                            this.numchequeetat.setText(this.firstcheque);
                                            p4 = "0";
                                            String cas406 = "000";
                                            String pv406 = "0";
                                            state27.executeUpdate("INSERT INTO cession2(NBC,annenbc,mois,date,Mecano,Nom,Montant,Nbmois,premiermois,derniermois,montantparmois,ncheque,pv,MONT,valider,n406,anne406,bq406,pv406,cas406) VALUES('" + this.num + "','" + anneac2 + "','" + dateS + "','" + datddd + "','" + this.mecano.getText() + "','" + this.nomadh + "','" + this.montglobale + "','" + nbm + "','" + moiddebut + "','" + moisfin2 + "','" + this.parmois + "','" + this.firstcheque + "','" + p4 + "','" + mont + "','" + p4 + "','" + num406 + "','" + anne406 + "','" + bq406 + "','" + pv406 + "','" + cas406 + "')");
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop1 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                                        }
                                        if (this.k == 1) {
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state27 = conn22.createStatement();
                                                this.k = 1;
                                                String pv = "1";
                                                this.numchequeetat.setText(this.firstcheque);
                                                String mffd = mff + "000";
                                                state27.executeUpdate("INSERT INTO etatdeschequepretmasp(Mecano,date,montant,pv,numch) VALUES('" + this.mecano.getText() + "','" + datdd2 + "','" + mffd + "','" + pv + "','" + this.firstcheque + "')");
                                                this.num = 0;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur d'ajout a etatdeschequepretmasp : " + e.getMessage());
                                            }
                                        }
                                        if (this.k == 1) {
                                            int total = 0;
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state26 = conn2.createStatement();
                                                p5 = "1";
                                                ResultSet result27 = state26.executeQuery("SELECT * FROM caissemasp  WHERE n='" + p5 + "'");
                                                while (result27.next()) {
                                                    String ttt = result27.getString("total");
                                                    total = Integer.parseInt(ttt);
                                                }
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                JOptionPane jop316 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant 66666666666666666666" + e.getMessage());
                                            }
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state26 = conn22.createStatement();
                                                p5 = "0";
                                                state26.executeUpdate("UPDATE  caissemasp SET n='0' ");
                                                this.k = 1;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur de modification caisse: " + e.getMessage());
                                            }
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state26 = conn22.createStatement();
                                                this.k = 1;
                                                String pret = "1";
                                                String prime = "0";
                                                System.out.println("m2 =" + this.m);
                                                int tm = Integer.parseInt(this.m);
                                                String mm = "" + (total -= tm) + "";
                                                this.numchequeetat.setText(this.firstcheque);
                                                state26.executeUpdate("INSERT INTO caissemasp(date,mecano,pret,prime,debit,credit,total,n) VALUES('" + datdd2 + "','" + this.mecano.getText() + "','" + pret + "','" + prime + "','" + this.m + "','0','" + mm + "','1')");
                                                this.num = 0;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse : " + e.getMessage());
                                            }
                                        }
                                        if (this.k == 1) {
                                            JOptionPane.showMessageDialog(null, "Attention : Impression De Demande ", "Information", 1);
                                            Impression1 sd = new Impression1(this.jPanel5);
                                            sd.actionPerformed(evt);
                                            JOptionPane.showMessageDialog(null, "Attention : Impression De l'etat ", "Information", 1);
                                            Impression1 sd2 = new Impression1(this.etatmainleve);
                                            sd2.actionPerformed(evt);
                                            JOptionPane.showMessageDialog(null, "Attention :  Impression De L'etat (service des prets) ", "Information", 1);
                                            Impression1 se1 = new Impression1(this.jPanel12);
                                            se1.actionPerformed(evt);
                                            JOptionPane.showMessageDialog(null, "Attention :  carnet de cheque N\u00b0:" + this.numcarnet + "  et N\u00b0 cheque :" + this.firstcheque + "", "Information", 1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.test == 2) {
                int montglobale;
                int nbm;
                block571 : {
                    boolean g;
                    System.out.println("------------------------------------------------------------");
                    actuellEed = new Date();
                    dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
                    datddd = dateFormattd.format(actuellEed);
                    dateS = datddd.substring(3, datddd.length());
                    this.dateactuele.setText(datddd);
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
                    ch1 = "";
                    nbm = Integer.parseInt(this.nbmois.getText());
                    montglobale = Integer.parseInt(this.mensualit\u00e9.getText());
                    int somme = montglobale / nbm;
                    String ss = "" + montglobale + "";
                    String ssV = "" + somme + "";
                    int tV = ssV.length() - 3;
                    String diiV = ssV.substring(0, ssV.length() - 3);
                    miilV = ssV.substring(tV, ssV.length());
                    this.rabais.setText(diiV + "," + miilV);
                    this.parmois = diiV + "," + miilV;
                    this.montantparmoisd.setText(this.parmois + " DT");
                    int tt = ss.length() - 3;
                    dii = ss.substring(0, ss.length() - 3);
                    String miil = ss.substring(tt, ss.length());
                    this.ch = "( " + dii + "," + miil + " DT )";
                    this.globale.setText(dii + "," + miil);
                    String mmontant = "" + montglobale + "";
                    int t = mmontant.length() - 3;
                    di = mmontant.substring(0, mmontant.length() - 3);
                    mil = mmontant.substring(t, mmontant.length());
                    this.mont = di + "," + mil;
                    int mon = Integer.parseInt(di);
                    adi = "";
                    try {
                        adi = Nombre.CALCULATE.getValue(mon, " Dinars ");
                    }
                    catch (Exception ex) {
                        Logger.getLogger(cessionsursalire2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.total.setText(adi + " (" + this.mont + " )");
                    this.montantletrechiffd.setText(adi + " (" + this.mont + " )");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result2 = state3.executeQuery("SELECT md  FROM  montantcession2 WHERE md=" + di);
                        resultMeta2 = result2.getMetaData();
                        while (result2.next()) {
                            for (i2 = 1; i2 <= resultMeta2.getColumnCount(); ++i2) {
                                ch1 = result2.getObject(i2).toString();
                            }
                        }
                        if (ch1.equals("")) {
                            JOptionPane jop14 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Montant n'existe ps  ", "Information", 1);
                            this.k = 0;
                            break block571;
                        }
                        this.k = 1;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state32 = conn2.createStatement();
                            result3 = state32.executeQuery("SELECT * FROM montantcession2  WHERE md=" + di);
                            ResultSetMetaData resultMeta34 = result3.getMetaData();
                            while (result3.next()) {
                                this.mff = result3.getString("mf");
                                this.montantetat.setText(this.mff + ",000");
                                this.montantetat1.setText(this.mff + ",000");
                            }
                            mchbd = "";
                            try {
                                monm = Integer.parseInt(this.mff);
                                System.out.println("mf =" + this.mff);
                                this.m = this.mff + "000";
                                System.out.println("m =" + this.m);
                                mchbd = Nombre.CALCULATE.getValue(monm, " Dinars ");
                            }
                            catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "erreur convertire montant en lettre ");
                            }
                        }
                        catch (Exception e) {
                            jop35 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur montant F " + e.getMessage());
                            this.k = 0;
                        }
                    }
                    catch (Exception e) {
                        jop32 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur montant D " + e.getMessage());
                        this.k = 0;
                    }
                }
                if (this.k == 1) {
                    int aa;
                    actuellEe = new Date();
                    dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
                    datdd = dateFormatt.format(actuellEe);
                    anneac = datddd.substring(datddd.length() - 4, datddd.length());
                    jours = datdd.substring(0, datdd.length() - 8);
                    int j = Integer.parseInt(jours);
                    mois2 = datdd.substring(3, datdd.length() - 5);
                    String ann\u00e9es = datdd.substring(6, datdd.length());
                    ms = Integer.parseInt(mois2);
                    int moiaci = Integer.parseInt(mois2);
                    dateS = mois2 + "/" + ann\u00e9es;
                    boolean kl = false;
                    if (this.mat.getText().equals("")) {
                        kl = true;
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
                    int kk = moiaci + moisresu;
                    while (kk > 12) {
                        kk -= 12;
                        ++aaa;
                    }
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
                    moisfin = "";
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
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state22 = conn2.createStatement();
                        p2 = "1";
                        result22 = state22.executeQuery("SELECT * FROM cession2 WHERE annenbc='" + anneac + "'");
                        this.num = 0;
                        while (result22.next()) {
                            this.k = 1;
                            n = result22.getString("NBC");
                            r = Integer.parseInt(n);
                            if (r <= this.num) continue;
                            this.num = r;
                        }
                    }
                    catch (Exception e) {
                        this.k = 0;
                        jop33 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur de terminer num " + e.getMessage());
                    }
                    if (this.k == 1) {
                        block572 : {
                            ++this.num;
                            this.numces.setText("DC :" + this.num + "/ 300 / " + anneaccccc);
                            this.date2.setText(moisfin);
                            this.derniermoisd.setText(moisfin);
                            this.nbbmois.setText(this.nbmois.getText());
                            this.nbmd.setText(this.nbmois.getText());
                            mec = this.mecano.getText();
                            this.mecanod.setText(mec);
                            this.mecanoetat.setText(mec);
                            this.mecanoetat2.setText(mec);
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state = conn2.createStatement();
                                result = state.executeQuery("SELECT MECANO  FROM  adherent WHERE MECANO=" + mec);
                                resultMeta = result.getMetaData();
                                while (result.next()) {
                                    for (i = 1; i <= resultMeta.getColumnCount(); ++i) {
                                        ch1 = result.getObject(i).toString();
                                    }
                                }
                                if (ch1.equals("")) {
                                    jop1 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Adheron n'existe pas (N dossier) ", "Information", 1);
                                    this.k = 0;
                                    break block572;
                                }
                                ch1 = "";
                                this.mecanoo.setText(this.mecano.getText());
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Statement state33 = conn2.createStatement();
                                    ResultSet result35 = state33.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                                    resultMeta3 = result35.getMetaData();
                                    while (result35.next()) {
                                        this.nometprenom.setText(result35.getString("NOM"));
                                        this.nomadh = result35.getString("NOM");
                                        this.nomd.setText(this.nomadh);
                                        this.nometattab.setText(this.nomadh);
                                        this.nometattab1.setText(this.nomadh);
                                        this.nometat.setText(this.nomadh);
                                        this.matricule.setText(result35.getString("NCNR"));
                                        this.idend.setText(result35.getString("NCNR"));
                                        this.cnretat.setText(result35.getString("NCNR"));
                                        this.cnretat1.setText(result35.getString("NCNR"));
                                        this.matriculeetat.setText(result35.getString("NCNR"));
                                        this.ncina.setText(result35.getString("CIN"));
                                        this.cin2.setText(result35.getString("CIN"));
                                        this.ncinddemande.setText(result35.getString("CIN"));
                                        this.cinetat.setText(result35.getString("CIN"));
                                        this.cinetat1.setText(result35.getString("CIN"));
                                        this.codepostal.setText(result35.getString("codepostale"));
                                        this.livcin.setText(result35.getString("LIVCIN"));
                                        this.delivd.setText(result35.getString("LIVCIN"));
                                        this.datenai.setText(result35.getString("DATNAI"));
                                        this.lieunai.setText(result35.getString("LIEUNAI"));
                                        this.addrr.setText(result35.getString("ADRES"));
                                        this.grade.setText(result35.getString("TRVAIL"));
                                        this.travaille = result35.getString("TRVAIL");
                                        this.etabd.setText(result35.getString("LIEUTRAVAIL"));
                                        this.hopital.setText(result35.getString("LIEUTRAVAIL"));
                                        this.etabetat.setText(result35.getString("LIEUTRAVAIL"));
                                        this.etabetat1.setText(result35.getString("LIEUTRAVAIL"));
                                        this.lieutrv = result35.getString("LIEUTRAVAIL");
                                    }
                                }
                                catch (Exception e) {
                                    JOptionPane jop317 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                                    this.k = 0;
                                }
                            }
                            catch (Exception e) {
                                jop34 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                                this.k = 0;
                            }
                        }
                        if (this.travaille.equals("")) {
                            this.k = 0;
                            jop33 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, " Aucune Profession pour cette adh\u00e9rent !!!");
                        }
                        if (this.k == 1) {
                            JOptionPane jop = new JOptionPane();
                            int option = JOptionPane.showConfirmDialog(null, "Adherent " + this.nomadh + " / Montant= " + this.parmois + "DT Par Mois -- (N\u00b0 Cession : " + this.num + " )", "Attention", 0, 3);
                            if (option == 0) {
                                ResultSet result28;
                                JOptionPane jop318;
                                Statement state29;
                                String p6;
                                String p7;
                                int jj;
                                String typcarnet = "";
                                typcarnet = this.travaille.equals("Ouvrier") ? ((jj = this.lieutrv.indexOf("SFAR")) != -1 ? "Pr\u00e9ts Ouvries" : "Pr\u00e9ts Personnels") : "Pr\u00e9ts Personnels";
                                String numcc = "";
                                String deb = "";
                                int typena = 0;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state29 = conn2.createStatement();
                                    p7 = "0";
                                    result28 = state29.executeQuery("SELECT * FROM comptecourant  WHERE observation='" + typcarnet + "' AND f='" + p7 + "'");
                                    typena = 1;
                                    while (result28.next()) {
                                        this.numcarnet = result28.getString("num");
                                        this.numerocheq = result28.getString("debut");
                                        deb = result28.getString("datedebut");
                                        this.k = 1;
                                    }
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop318 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                                }
                                if (deb.equals("")) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state29 = conn2.createStatement();
                                        state29.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        jop318 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                                    }
                                } else {
                                    typena = 2;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state29 = conn2.createStatement();
                                        p7 = "1";
                                        result28 = state29.executeQuery("SELECT * FROM talondescheque  WHERE type='" + typcarnet + "' AND p='" + p7 + "'");
                                        while (result28.next()) {
                                            this.numerocheq = result28.getString("numcheque");
                                            this.numcarnet = result28.getString("Numcarnet");
                                            this.k = 1;
                                        }
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        jop318 = new JOptionPane();
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
                                        jop318 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 1 " + e.getMessage());
                                    }
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state29 = conn2.createStatement();
                                        p7 = "1";
                                        result28 = state29.executeQuery("SELECT * FROM comptecourant  WHERE num='" + this.numcarnet + "'");
                                        while (result28.next()) {
                                            this.numfin = result28.getString("fin");
                                            this.k = 1;
                                        }
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        jop318 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur montant comptecourant 12122222222" + e.getMessage());
                                    }
                                    try {
                                        this.Nfin = Integer.parseInt(this.numfin);
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        jop318 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 2  " + e.getMessage());
                                    }
                                    if (this.Nfin >= this.Nch) {
                                        if (this.Nfin == this.Nch) {
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state29 = conn22.createStatement();
                                                p7 = "1";
                                                state29.executeUpdate("UPDATE  comptecourant SET f='" + p7 + "' WHERE num='" + this.numcarnet + "'");
                                                state29.executeUpdate("UPDATE  comptecourant SET datefin='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                                                this.k = 1;
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    Connection conn222 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                                    Statement state223 = conn222.createStatement();
                                                    ResultSet result223 = state29.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
                                                    int kkk = 1;
                                                    while (result223.next()) {
                                                        if (kkk == 1) {
                                                            String nauveaucarnet = result223.getString("num");
                                                            try {
                                                                Class.forName("com.mysql.jdbc.Driver");
                                                                Statement state21 = conn2.createStatement();
                                                                state21.executeUpdate("UPDATE  comptecourant SET observation='" + typcarnet + "' WHERE num='" + nauveaucarnet + "'");
                                                            }
                                                            catch (Exception e) {
                                                                this.k = 0;
                                                                JOptionPane jop319 = new JOptionPane();
                                                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant 3636" + e.getMessage());
                                                            }
                                                        }
                                                        ++kkk;
                                                    }
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    jop36 = new JOptionPane();
                                                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant 988888888" + e.getMessage());
                                                }
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                            }
                                        }
                                        this.firstcheque = "" + this.Nch + "";
                                        int ji = 0;
                                        ji = this.firstcheque.indexOf(".");
                                        if (ji != -1) {
                                            this.firstcheque = this.firstcheque.substring(0, this.firstcheque.length() - 2);
                                        }
                                        if (this.k == 1) {
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state2 = conn22.createStatement();
                                                p = "0";
                                                state2.executeUpdate("UPDATE  talondescheque SET p='" + p + "' WHERE numcheque='" + this.numerocheq + "'");
                                                this.k = 1;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                            }
                                        }
                                        if (this.k == 1) {
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state2 = conn22.createStatement();
                                                String banque = "BT";
                                                p6 = "1";
                                                String mdi = di + "000";
                                                state2.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnet + "','" + this.mecano.getText() + "','" + mdi + "','" + datdd + "','" + typcarnet + "','" + p6 + "','" + banque + "')");
                                                this.k = 1;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                            }
                                        }
                                    } else {
                                        this.k = 0;
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state29 = conn2.createStatement();
                                            p7 = "0";
                                            result28 = state29.executeQuery("SELECT * FROM comptecourant  WHERE f='" + p7 + "' AND observation ='" + typcarnet + "'");
                                            while (result28.next()) {
                                                this.numcarnetreserver = result28.getString("num");
                                                this.firstcheque = result28.getString("debut");
                                                this.k = 1;
                                            }
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop318 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant 66666666666666666666" + e.getMessage());
                                        }
                                        if (this.numcarnetreserver.equals("")) {
                                            jop1 = new JOptionPane();
                                            this.k = 0;
                                            JOptionPane.showMessageDialog(null, "Aucune carnet de cheque: il faut ajouter un nouveaux carnet");
                                        } else {
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state29 = conn22.createStatement();
                                                p7 = "0";
                                                state29.executeUpdate("UPDATE  talondescheque SET p='" + p7 + "' WHERE numcheque='" + this.numerocheq + "'");
                                                this.k = 1;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                            }
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state29 = conn22.createStatement();
                                                String banque = "BT";
                                                p = "1";
                                                String mdi = this.mff + "000";
                                                state29.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnetreserver + "','" + this.mecano.getText() + "','" + mdi + "','" + datdd + "','" + typcarnet + "','" + p + "','" + banque + "')");
                                                this.k = 1;
                                                this.numcarnet = this.numcarnetreserver;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                            }
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state29 = conn22.createStatement();
                                                p7 = "0";
                                                state29.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnetreserver + "'");
                                                this.k = 1;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                            }
                                        }
                                    }
                                }
                                if (this.k == 1) {
                                    Impression1 s = new Impression1(this.jPanel4);
                                    s.actionPerformed(evt);
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state2 = conn22.createStatement();
                                        this.k = 1;
                                        p = "0";
                                        this.numchequeetat.setText(this.firstcheque);
                                        String cas406 = "000";
                                        String pv406 = "0";
                                        state2.executeUpdate("INSERT INTO cession2(NBC,annenbc,mois,date,Mecano,Nom,Montant,Nbmois,premiermois,derniermois,montantparmois,ncheque,valider,pv,n406,anne406,bq406,cas406,pv406) VALUES('" + this.num + "','" + anneac + "','" + dateS + "','" + datddd + "','" + this.mecano.getText() + "','" + this.nomadh + "','" + montglobale + "','" + nbm + "','" + moiddebut + "','" + moisfin + "','" + this.parmois + "','" + this.firstcheque + "','" + p + "','" + p + "','" + num406 + "','" + anne406 + "','" + bq406 + "','" + cas406 + "','" + pv406 + "')");
                                        this.num = 0;
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        jop1 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                                    }
                                    if (this.k == 1) {
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state2 = conn22.createStatement();
                                            this.k = 1;
                                            String pv = "1";
                                            this.numchequeetat.setText(this.firstcheque);
                                            String mffd = this.mff + "000";
                                            state2.executeUpdate("INSERT INTO etatdeschequepretmasp(Mecano,date,montant,pv,numch) VALUES('" + this.mecano.getText() + "','" + datdd + "','" + mffd + "','" + pv + "','" + this.firstcheque + "')");
                                            this.num = 0;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop1 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur d'ajout a etatdeschequepretmasp : " + e.getMessage());
                                        }
                                    }
                                    if (this.k == 1) {
                                        Statement state210;
                                        int total = 0;
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state210 = conn2.createStatement();
                                            p6 = "1";
                                            ResultSet result29 = state210.executeQuery("SELECT * FROM caissemasp  WHERE n='" + p6 + "'");
                                            while (result29.next()) {
                                                String ttt = result29.getString("total");
                                                total = Integer.parseInt(ttt);
                                            }
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop36 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant 66666666666666666666" + e.getMessage());
                                        }
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state210 = conn22.createStatement();
                                            p6 = "0";
                                            state210.executeUpdate("UPDATE  caissemasp SET n='0' ");
                                            this.k = 1;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop1 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur de modification caisse: " + e.getMessage());
                                        }
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state210 = conn22.createStatement();
                                            this.k = 1;
                                            String pret = "1";
                                            String prime = "0";
                                            System.out.println("m2 =" + this.m);
                                            int tm = Integer.parseInt(this.m);
                                            String mm = "" + (total -= tm) + "";
                                            this.numchequeetat.setText(this.firstcheque);
                                            state210.executeUpdate("INSERT INTO caissemasp(date,mecano,pret,prime,debit,credit,total,n) VALUES('" + datdd + "','" + this.mecano.getText() + "','" + pret + "','" + prime + "','" + this.m + "','0','" + mm + "','1')");
                                            this.num = 0;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop1 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse : " + e.getMessage());
                                        }
                                    }
                                    if (this.k == 1) {
                                        this.mecano.setText("");
                                        this.mensualit\u00e9.setText("");
                                        this.nbmois.setText("");
                                        this.mat.setText("");
                                        this.nometprenom.setText("................................");
                                        this.matricule.setText("................................");
                                        this.ncina.setText("................................");
                                        this.grade.setText("................................");
                                        this.addrr.setText("..................................................");
                                        if (this.k == 1) {
                                            JOptionPane.showMessageDialog(null, "Attention : Impression De Demande ", "Information", 1);
                                            Impression1 sd = new Impression1(this.jPanel5);
                                            sd.actionPerformed(evt);
                                            JOptionPane.showMessageDialog(null, "Attention :  Impression De L'etat ", "Information", 1);
                                            Impression1 se = new Impression1(this.jPanel8);
                                            se.actionPerformed(evt);
                                            JOptionPane.showMessageDialog(null, "Attention :  Impression De L'etat (service des prets) ", "Information", 1);
                                            Impression1 se1 = new Impression1(this.jPanel12);
                                            se1.actionPerformed(evt);
                                            JOptionPane.showMessageDialog(null, "Attention :  carnet de cheque N\u00b0:" + this.numcarnet + "  et N\u00b0 cheque :" + this.firstcheque + "", "Information", 1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (this.test == 3) {
                String anneactuel = "";
                String derniermois = "";
                int y = 0;
                Date actuellEed2 = new Date();
                SimpleDateFormat dateFormattd2 = new SimpleDateFormat("dd/MM/yyyy");
                String datddd2 = dateFormattd2.format(actuellEed2);
                int totaledemontant = 0;
                int j = 0;
                String rr = "";
                boolean pp = false;
                int nbn = 0;
                for (int i5 = 0; i5 < this.pret.getRowCount(); ++i5) {
                    Object jb = this.pret.getModel().getValueAt(i5, 7);
                    if (jb.equals(true)) {
                        Object ref = this.pret.getModel().getValueAt(i5, 2);
                        this.k = 0;
                        String dateS2 = datddd2.substring(3, datddd2.length());
                        SimpleDateFormat dateactuelle = new SimpleDateFormat("yyyyMM");
                        this.dateatt.setText(datddd2);
                        this.datemleve.setText(datddd2);
                        String dat = dateactuelle.format(actuellEed2);
                        String moisactuel = dat.substring(dat.length() - 2, dat.length());
                        anneactuel = dat.substring(0, dat.length() - 2);
                        System.out.println("mois actuelle :" + moisactuel + "--");
                        System.out.println("anne actuelle :" + anneactuel + "--");
                        String moiactueleenlettre = "";
                        if (moisactuel.equals("01")) {
                            moiactueleenlettre = "F\u00e9vrier  ";
                        } else if (moisactuel.equals("02")) {
                            moiactueleenlettre = "Mars  ";
                        } else if (moisactuel.equals("03")) {
                            moiactueleenlettre = "Avril  ";
                        } else if (moisactuel.equals("04")) {
                            moiactueleenlettre = "Mai  ";
                        } else if (moisactuel.equals("05")) {
                            moiactueleenlettre = "Juin  ";
                        } else if (moisactuel.equals("06")) {
                            moiactueleenlettre = "Juillet  ";
                        } else if (moisactuel.equals("07")) {
                            moiactueleenlettre = "Ao\u00fbt  ";
                        } else if (moisactuel.equals("08")) {
                            moiactueleenlettre = "Septembre  ";
                        } else if (moisactuel.equals("09")) {
                            moiactueleenlettre = "Octobre  ";
                        } else if (moisactuel.equals("10")) {
                            moiactueleenlettre = "Novembre  ";
                        } else if (moisactuel.equals("11")) {
                            moiactueleenlettre = "D\u00e9cembre  ";
                        } else if (moisactuel.equals("12")) {
                            moiactueleenlettre = "Janvier  ";
                            int a = Integer.parseInt(anneactuel);
                            anneactuel = "" + ++a + "";
                        } else {
                            moiactueleenlettre = "!!!!!!!!!!!";
                        }
                        this.mecat.setText(this.mecano.getText());
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state211 = conn2.createStatement();
                            ResultSet result210 = state211.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                            ResultSetMetaData resultMeta23 = result210.getMetaData();
                            while (result210.next()) {
                                int jj;
                                this.k = 1;
                                this.nometprenommain.setText(result210.getString("NOM"));
                                this.matriculemain.setText(result210.getString("NCNR"));
                                this.cin.setText(result210.getString("CIN"));
                                this.tt = result210.getString("TRVAIL");
                                this.Adresse.setText(result210.getString("ADRES"));
                                this.lit = result210.getString("LIEUTRAVAIL");
                                this.profession.setText(result210.getString("TRVAIL"));
                                this.travaille = result210.getString("TRVAIL");
                                this.lieutrv = result210.getString("LIEUTRAVAIL");
                                y = this.travaille.equals("Ouvrier") ? ((jj = this.lieutrv.indexOf("SFAR")) != -1 ? 1 : 2) : 2;
                                this.etabmain.setText(result210.getString("etab"));
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop320 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Adherant n'existe pas" + e.getMessage());
                            this.k = 0;
                        }
                        if (this.k == 1) {
                            int moisa = 0;
                            int aneact = 0;
                            int moisf = 0;
                            int anef = 0;
                            int nbdemois = 0;
                            try {
                                this.k = 0;
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement state7 = conn2.createStatement();
                                String totamoisreste = "";
                                String ii = "1";
                                result3 = state7.executeQuery("SELECT * FROM cession2  WHERE Mecano='" + this.mecano.getText() + "' AND pv='" + ii + "'AND ref='" + ref + "'");
                                String mm = null;
                                String annedenier = null;
                                String moiddebut = "";
                                String montantparsmois = "";
                                String dd = "";
                                while (result3.next()) {
                                    pp = true;
                                    this.k = 1;
                                    derniermois = result3.getString("derniermois");
                                    this.moisrester.setText(moiactueleenlettre + "" + anneactuel + "  \u00e0  " + derniermois);
                                    montantparsmois = result3.getString("montantparmois");
                                    this.mparmois.setText(montantparsmois);
                                    String montantglobale = result3.getString("Montant");
                                    montantglobale = montantglobale.substring(0, montantglobale.length() - 3);
                                    this.montantglo.setText(montantglobale + ",000");
                                    this.restmain.setText(montantglobale + ",000");
                                    String d = result3.getString("date");
                                    if (++j == 1) {
                                        this.r = ref + "";
                                        dd = d;
                                    } else {
                                        this.r = this.r + " et " + ref;
                                        dd = dd + " et le " + d;
                                    }
                                    this.registre.setText(this.r + "");
                                    this.dateimpression.setText(d);
                                }
                                if (this.k == 1) {
                                    String montant = montantparsmois.substring(0, montantparsmois.length() - 4);
                                    int m = Integer.parseInt(montant);
                                    String moisdenier = derniermois.substring(0, derniermois.length() - 6);
                                    annedenier = derniermois.substring(derniermois.length() - 4, derniermois.length());
                                    if (moisdenier.equals("Janvier")) {
                                        mm = "01";
                                    } else if (moisdenier.equals("F\u00e9vrier")) {
                                        mm = "02";
                                    } else if (moisdenier.equals("Mars")) {
                                        mm = "03";
                                    } else if (moisdenier.equals("Avril")) {
                                        mm = "04";
                                    } else if (moisdenier.equals("Mai")) {
                                        mm = "05";
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
                                    moisf = Integer.parseInt(mm);
                                    anef = Integer.parseInt(annedenier);
                                    mm = annedenier + mm;
                                    Date actuellEee = new Date();
                                    SimpleDateFormat dateFormatt3 = new SimpleDateFormat("dd/MM/yyyy");
                                    String datddj = dateFormatt3.format(actuellEee);
                                    String joursj = datddj.substring(0, datddj.length() - 8);
                                    int a = anef - aneact;
                                    System.out.println("lit  =" + this.lit);
                                    System.out.println("tt  =" + this.tt);
                                    int nb = 0;
                                    if (a >= 1) {
                                        nb = 12 - moisa;
                                        nbdemois = moisf;
                                        System.out.println("11111111111111111111111111111111111");
                                    } else if (a == 0) {
                                        System.out.println("222222222222222222222222222222222222");
                                        int jj = this.lit.indexOf("SFAR");
                                        System.out.println("jj  =" + jj);
                                        int jactuele = Integer.parseInt(joursj);
                                        nb = this.tt.equals("Ouvrier") && jj > -1 ? (jactuele > 6 ? moisf - moisa : moisf - moisa + 1) : moisf - moisa;
                                    }
                                    nbdemois += nb;
                                    if (y == 2) {
                                        ++nbdemois;
                                    }
                                    this.montantglobalee = nbdemois * m;
                                    nbn += nbdemois;
                                    totaledemontant = this.montantglobalee + totaledemontant;
                                    String adii = Nombre.CALCULATE.getValue(totaledemontant, " Dinars ");
                                    this.globale1.setText("" + totaledemontant + ",000 (" + adii.toUpperCase() + ")");
                                    this.testmain = 0;
                                } else {
                                    JOptionPane jop15 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "cession d\u00e9ja pay\u00e9e");
                                }
                            }
                            catch (Exception e) {
                                JOptionPane jop321 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                        }
                        System.out.println("ligne n\u00b0 =" + i5 + " =>true  valeur : " + jb);
                        continue;
                    }
                    System.out.println("ligne n\u00b0 =" + i5 + " =>false valeur : " + jb);
                }
                if (pp) {
                    JOptionPane jop = new JOptionPane();
                    int option = JOptionPane.showConfirmDialog(null, "Attention : Impression De Main lev\u00e9e Nombre de mois " + nbn + "( Montant=" + totaledemontant + " )", "Attention", 0, 3);
                    if (option == 0) {
                        this.testmain = 1;
                        Impression1 sd = new Impression1(this.mainleveeee);
                        sd.actionPerformed(evt);
                    }
                    if (this.testmain == 1) {
                        System.out.println("aaaaaaaaaaaa");
                        String rrr = "";
                        int jj = 0;
                        for (int i6 = 0; i6 < this.pret.getRowCount(); ++i6) {
                            Object jb = this.pret.getModel().getValueAt(i6, 7);
                            if (!jb.equals(true)) continue;
                            Object r3 = this.pret.getModel().getValueAt(i6, 2);
                            rr = jj == 0 ? r3 + "" : rr + " - " + r3;
                            ++jj;
                            System.out.println("aaaaaabbbbaaaaaa");
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement state212 = conn2.createStatement();
                                String p8 = "2";
                                state212.executeUpdate("UPDATE  cession2 SET pv='" + p8 + "' WHERE MECANO='" + this.mecano.getText() + "'AND ref='" + r3 + "'");
                                continue;
                            }
                            catch (Exception e) {
                                JOptionPane jop16 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur de modification main lev\u00e9e a l'etat : " + e.getMessage());
                            }
                        }
                        System.out.println("aaaaaaaaaadddddddddddddaa");
                        int nummainleve = 0;
                        ++nummainleve;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state213 = conn2.createStatement();
                            this.k = 1;
                            this.moisrester.setText(rrr);
                        }
                        catch (Exception e) {
                            this.k = 0;
                            JOptionPane jop17 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                        }
                    }
                }
            }
            if (this.test == 4) {
                boolean g;
                actuellEed = new Date();
                dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
                String datddd3 = dateFormattd.format(actuellEed);
                this.dateredevance.setText(datddd3);
                dateS = datddd3.substring(3, datddd3.length());
                this.dateactuele.setText(datddd3);
                this.k = 1;
                boolean bl = g = this.mecano.getText().equals("") || this.mensualit\u00e9.getText().equals("") || this.nbmois.getText().equals("") || this.montantpayment.getText().equals("");
                if (g) {
                    this.k = 0;
                    jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
                } else if (this.mensualit\u00e9.getText().length() < 4) {
                    jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Montant Incorrecte", "Attention", 0);
                    this.k = 0;
                } else if (this.montantpayment.getText().length() < 4) {
                    jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Montant Incorrecte", "Attention", 0);
                    this.k = 0;
                }
                if (this.k == 1) {
                    double montpay = Integer.parseInt(this.montantpayment.getText());
                    double montpret = Integer.parseInt(this.mensualit\u00e9.getText());
                    if (montpret < montpay) {
                        this.k = 0;
                        JOptionPane jop23 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Montant de pret inf\u00e9rieur a montant qu'il faut payer !! ", "Attention", 0);
                    }
                }
                if (this.k == 1) {
                    int montglobale;
                    int nbm;
                    block574 : {
                        ch1 = "";
                        nbm = Integer.parseInt(this.nbmois.getText());
                        montglobale = Integer.parseInt(this.mensualit\u00e9.getText());
                        int somme = montglobale / nbm;
                        String ss = "" + montglobale + "";
                        String ssV = "" + somme + "";
                        int tV = ssV.length() - 3;
                        String diiV = ssV.substring(0, ssV.length() - 3);
                        miilV = ssV.substring(tV, ssV.length());
                        this.rabais.setText(diiV + "," + miilV);
                        this.parmois = diiV + "," + miilV;
                        this.montantparmoisd.setText(this.parmois + " DT");
                        int tt = ss.length() - 3;
                        dii = ss.substring(0, ss.length() - 3);
                        String miil = ss.substring(tt, ss.length());
                        this.ch = "( " + dii + "," + miil + " DT )";
                        this.globale.setText(dii + "," + miil);
                        String mmontant = "" + montglobale + "";
                        int t = mmontant.length() - 3;
                        di = mmontant.substring(0, mmontant.length() - 3);
                        mil = mmontant.substring(t, mmontant.length());
                        this.mont = di + "," + mil;
                        int mon = Integer.parseInt(di);
                        adi = "";
                        try {
                            adi = Nombre.CALCULATE.getValue(mon, " Dinars ");
                        }
                        catch (Exception ex) {
                            Logger.getLogger(cessionsursalire2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        this.total.setText(adi + " (" + this.mont + " )");
                        this.montantletrechiffd.setText(adi + " (" + this.mont + " )");
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result2 = state3.executeQuery("SELECT md  FROM  montantcession2 WHERE md=" + di);
                            resultMeta2 = result2.getMetaData();
                            while (result2.next()) {
                                for (i2 = 1; i2 <= resultMeta2.getColumnCount(); ++i2) {
                                    ch1 = result2.getObject(i2).toString();
                                }
                            }
                            if (ch1.equals("")) {
                                JOptionPane jop24 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Montant n'existe ps  ", "Information", 1);
                                this.k = 0;
                                break block574;
                            }
                            this.k = 1;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement state34 = conn2.createStatement();
                                result3 = state34.executeQuery("SELECT * FROM montantcession2  WHERE md=" + di);
                                ResultSetMetaData resultMeta35 = result3.getMetaData();
                                while (result3.next()) {
                                    this.mff = result3.getString("mf");
                                    this.montantetat.setText(this.mff + ",000");
                                    this.montantetat1.setText(this.mff + ",000");
                                    this.montantetat2.setText(this.mff + ",000");
                                }
                                mchbd = "";
                                try {
                                    monm = Integer.parseInt(this.mff);
                                    this.m = this.mff + "000";
                                    mchbd = Nombre.CALCULATE.getValue(monm, " Dinars ");
                                }
                                catch (Exception ex) {
                                    JOptionPane.showMessageDialog(null, "erreur convertire montant en lettre ");
                                }
                            }
                            catch (Exception e) {
                                jop35 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur montant F " + e.getMessage());
                                this.k = 0;
                            }
                        }
                        catch (Exception e) {
                            jop32 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur montant D " + e.getMessage());
                            this.k = 0;
                        }
                    }
                    if (this.k == 1) {
                        int aa;
                        actuellEe = new Date();
                        dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
                        datdd = dateFormatt.format(actuellEe);
                        anneac = datddd3.substring(datddd3.length() - 4, datddd3.length());
                        jours = datdd.substring(0, datdd.length() - 8);
                        System.out.println("jours =" + jours);
                        int j = Integer.parseInt(jours);
                        mois2 = datdd.substring(3, datdd.length() - 5);
                        String ann\u00e9es = datdd.substring(6, datdd.length());
                        System.out.println("mois =" + mois2);
                        ms = Integer.parseInt(mois2);
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
                        moisfin = "";
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
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state22 = conn2.createStatement();
                            p2 = "1";
                            result22 = state22.executeQuery("SELECT * FROM cession2 WHERE annenbc='" + anneac + "'");
                            this.num = 0;
                            while (result22.next()) {
                                this.k = 1;
                                n = result22.getString("NBC");
                                r = Integer.parseInt(n);
                                System.out.println("r = " + r);
                                if (r <= this.num) continue;
                                System.out.println("num = " + this.num);
                                this.num = r;
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop33 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de terminer num " + e.getMessage());
                        }
                        if (this.k == 1) {
                            block575 : {
                                ++this.num;
                                this.numces.setText("DC :" + this.num + "/ 300 / " + anneaccccc);
                                System.out.print("---------------------------  DC :" + this.num + "/ 300 / " + anneac);
                                this.date2.setText(moisfin);
                                this.derniermoisd.setText(moisfin);
                                this.nbbmois.setText(this.nbmois.getText());
                                this.nbmd.setText(this.nbmois.getText());
                                mec = this.mecano.getText();
                                this.mecanod.setText(mec);
                                this.mecanoetat.setText(mec);
                                this.mecanoetat2.setText(mec);
                                this.matriculeredevence.setText(mec);
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state = conn2.createStatement();
                                    result = state.executeQuery("SELECT MECANO  FROM  adherent WHERE MECANO=" + mec);
                                    resultMeta = result.getMetaData();
                                    while (result.next()) {
                                        for (i = 1; i <= resultMeta.getColumnCount(); ++i) {
                                            ch1 = result.getObject(i).toString();
                                        }
                                    }
                                    if (ch1.equals("")) {
                                        JOptionPane jop25 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas (N dossier) ", "Information", 1);
                                        this.k = 0;
                                        break block575;
                                    }
                                    ch1 = "";
                                    this.mecanoetat6.setText(this.mecano.getText());
                                    this.mecanoo.setText(this.mecano.getText());
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state35 = conn2.createStatement();
                                        ResultSet result36 = state35.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                                        resultMeta3 = result36.getMetaData();
                                        while (result36.next()) {
                                            this.nometprenom.setText(result36.getString("NOM"));
                                            this.nomadh = result36.getString("NOM");
                                            this.nomd.setText(this.nomadh);
                                            this.nometattab2.setText(this.nomadh);
                                            this.nometattab1.setText(this.nomadh);
                                            this.nometat1.setText(this.nomadh);
                                            this.nomredevance.setText(this.nomadh);
                                            this.matricule.setText(result36.getString("NCNR"));
                                            this.idend.setText(result36.getString("NCNR"));
                                            this.cnretat2.setText(result36.getString("NCNR"));
                                            this.cnretat1.setText(result36.getString("NCNR"));
                                            this.matriculeetat1.setText(result36.getString("NCNR"));
                                            this.ncina.setText(result36.getString("CIN"));
                                            this.cin2.setText(result36.getString("CIN"));
                                            this.ncinddemande.setText(result36.getString("CIN"));
                                            this.cinetat2.setText(result36.getString("CIN"));
                                            this.cinetat1.setText(result36.getString("CIN"));
                                            this.codepostal.setText(result36.getString("codepostale"));
                                            this.livcin.setText(result36.getString("LIVCIN"));
                                            this.delivd.setText(result36.getString("LIVCIN"));
                                            this.datenai.setText(result36.getString("DATNAI"));
                                            this.lieunai.setText(result36.getString("LIEUNAI"));
                                            this.addrr.setText(result36.getString("ADRES"));
                                            this.grade.setText(result36.getString("TRVAIL"));
                                            this.travaille = result36.getString("TRVAIL");
                                            this.etabd.setText(result36.getString("LIEUTRAVAIL"));
                                            this.hopital.setText(result36.getString("LIEUTRAVAIL"));
                                            this.etabetat2.setText(result36.getString("LIEUTRAVAIL"));
                                            this.etabetat1.setText(result36.getString("LIEUTRAVAIL"));
                                            this.lieutrv = result36.getString("LIEUTRAVAIL");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop322 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                                        this.k = 0;
                                    }
                                }
                                catch (Exception e) {
                                    jop34 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                                    this.k = 0;
                                }
                            }
                            System.out.println(" profession  = " + this.travaille);
                            if (this.travaille.equals("")) {
                                System.out.println(" profession  = " + this.travaille);
                                this.k = 0;
                                jop33 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, " Aucune Profession pour cette adh\u00e9rent !!!");
                            }
                            if (this.k == 1) {
                                String montpayyy = this.montantpayment.getText();
                                String diipay = montpayyy.substring(0, montpayyy.length() - 3);
                                int montche = Integer.parseInt(this.mff) - Integer.parseInt(diipay);
                                this.montantcheque = "" + montche + "000";
                                this.resteredevance.setText(this.montantcheque + " DT");
                                JOptionPane jop = new JOptionPane();
                                int option = JOptionPane.showConfirmDialog(null, "Adherent " + this.nomadh + " / Montant= " + this.parmois + "DT Par Mois -- (N\u00b0 Cession : " + this.num + " )  -- Montant de cheque =" + this.montantcheque, "Attention", 0, 3);
                                if (option == 0) {
                                    ResultSet result211;
                                    Statement state214;
                                    Statement state215;
                                    JOptionPane jop323;
                                    String p9;
                                    String p10;
                                    JOptionPane jop26;
                                    int jj;
                                    String typcarnet = "";
                                    typcarnet = this.travaille.equals("Ouvrier") ? ((jj = this.lieutrv.indexOf("SFAR")) != -1 ? "Pr\u00e9ts Ouvries" : "Pr\u00e9ts Personnels") : "Pr\u00e9ts Personnels";
                                    System.out.println("type de compte 2 =" + typcarnet);
                                    String numcc = "";
                                    String deb = "";
                                    int typena = 0;
                                    System.out.println("type de compte 2 =" + typcarnet);
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state215 = conn2.createStatement();
                                        p10 = "0";
                                        ResultSet result212 = state215.executeQuery("SELECT * FROM comptecourant  WHERE observation='" + typcarnet + "' AND f='" + p10 + "'");
                                        typena = 1;
                                        while (result212.next()) {
                                            this.numcarnet = result212.getString("num");
                                            this.numerocheq = result212.getString("debut");
                                            deb = result212.getString("datedebut");
                                            this.k = 1;
                                        }
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        jop323 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                                    }
                                    if (deb.equals("")) {
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state215 = conn22.createStatement();
                                            p10 = "0";
                                            state215.executeUpdate("UPDATE  talondescheque SET p='" + p10 + "' WHERE p='1'");
                                            this.k = 1;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop26 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                        }
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state215 = conn2.createStatement();
                                            state215.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop323 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                                        }
                                    } else {
                                        typena = 2;
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state215 = conn2.createStatement();
                                            p10 = "1";
                                            result211 = state215.executeQuery("SELECT * FROM talondescheque  WHERE type='" + typcarnet + "' AND p='" + p10 + "'");
                                            System.out.println("********************************** =");
                                            while (result211.next()) {
                                                this.numerocheq = result211.getString("numcheque");
                                                System.out.println("numero de cheque talon des cheque  =" + this.numerocheq);
                                                this.numcarnet = result211.getString("Numcarnet");
                                                this.k = 1;
                                            }
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop323 = new JOptionPane();
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
                                            jop323 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 1 " + e.getMessage());
                                        }
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state215 = conn2.createStatement();
                                            p10 = "1";
                                            System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                                            result211 = state215.executeQuery("SELECT * FROM comptecourant  WHERE num='" + this.numcarnet + "'");
                                            while (result211.next()) {
                                                this.numfin = result211.getString("fin");
                                                System.out.println("numero de cheque fin =" + this.numfin);
                                                this.k = 1;
                                            }
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop323 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                        }
                                        try {
                                            this.Nfin = Integer.parseInt(this.numfin);
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop323 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 2  " + e.getMessage());
                                        }
                                        if (this.Nfin >= this.Nch) {
                                            JOptionPane jop27;
                                            if (this.Nfin == this.Nch) {
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    state215 = conn22.createStatement();
                                                    p10 = "1";
                                                    state215.executeUpdate("UPDATE  comptecourant SET f='" + p10 + "' WHERE num='" + this.numcarnet + "'");
                                                    state215.executeUpdate("UPDATE  comptecourant SET datefin='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                                                    this.k = 1;
                                                    try {
                                                        Class.forName("com.mysql.jdbc.Driver");
                                                        Connection conn223 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                                        Statement state224 = conn223.createStatement();
                                                        System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                                                        ResultSet result224 = state215.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
                                                        int kkk = 1;
                                                        while (result224.next()) {
                                                            if (kkk == 1) {
                                                                String nauveaucarnet = result224.getString("num");
                                                                try {
                                                                    Class.forName("com.mysql.jdbc.Driver");
                                                                    Statement state21 = conn2.createStatement();
                                                                    state21.executeUpdate("UPDATE  comptecourant SET observation='" + typcarnet + "' WHERE num='" + nauveaucarnet + "'");
                                                                }
                                                                catch (Exception e) {
                                                                    this.k = 0;
                                                                    JOptionPane jop324 = new JOptionPane();
                                                                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                                                }
                                                            }
                                                            ++kkk;
                                                        }
                                                    }
                                                    catch (Exception e) {
                                                        this.k = 0;
                                                        jop3 = new JOptionPane();
                                                        JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                                    }
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    jop26 = new JOptionPane();
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
                                                    state214 = conn22.createStatement();
                                                    p9 = "0";
                                                    state214.executeUpdate("UPDATE  talondescheque SET p='" + p9 + "' WHERE numcheque='" + this.numerocheq + "'");
                                                    this.k = 1;
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    jop27 = new JOptionPane();
                                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                                }
                                            }
                                            if (this.k == 1) {
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    state214 = conn22.createStatement();
                                                    String banque = "BT";
                                                    String p11 = "1";
                                                    String mdi = di + "000";
                                                    state214.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnet + "','" + this.mecano.getText() + "','" + this.montantcheque + "','" + datdd + "','" + typcarnet + "','" + p11 + "','" + banque + "')");
                                                    this.k = 1;
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    jop27 = new JOptionPane();
                                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                                }
                                            }
                                        } else {
                                            this.k = 0;
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state215 = conn2.createStatement();
                                                p10 = "0";
                                                System.out.println("type type  =" + typcarnet);
                                                result211 = state215.executeQuery("SELECT * FROM comptecourant  WHERE f='" + p10 + "' AND observation ='" + typcarnet + "'");
                                                while (result211.next()) {
                                                    this.numcarnetreserver = result211.getString("num");
                                                    this.firstcheque = result211.getString("debut");
                                                    System.out.println("numero de carnet cheque reserve 1 =" + this.numcarnetreserver);
                                                    this.k = 1;
                                                }
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop323 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                            }
                                            if (this.numcarnetreserver.equals("")) {
                                                System.out.println("numero de carnet cheque reserve 2 =" + this.numcarnetreserver);
                                                this.k = 0;
                                                JOptionPane jop28 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "Aucune carnet de cheque: il faut ajouter un nouveaux carnet");
                                            } else {
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    state215 = conn22.createStatement();
                                                    p10 = "0";
                                                    state215.executeUpdate("UPDATE  talondescheque SET p='" + p10 + "' WHERE numcheque='" + this.numerocheq + "'");
                                                    this.k = 1;
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    jop26 = new JOptionPane();
                                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                                }
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    state215 = conn22.createStatement();
                                                    String banque = "BT";
                                                    p9 = "1";
                                                    String mdi = this.mff + "000";
                                                    state215.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnetreserver + "','" + this.mecano.getText() + "','" + this.montantcheque + "','" + datdd + "','" + typcarnet + "','" + p9 + "','" + banque + "')");
                                                    this.k = 1;
                                                    this.numcarnet = this.numcarnetreserver;
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    jop26 = new JOptionPane();
                                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                                }
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    state215 = conn22.createStatement();
                                                    p10 = "0";
                                                    state215.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnetreserver + "'");
                                                    this.k = 1;
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    jop26 = new JOptionPane();
                                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                                }
                                            }
                                        }
                                    }
                                    if (this.k == 1) {
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state215 = conn22.createStatement();
                                            this.k = 1;
                                            String red = "1";
                                            p9 = "0";
                                            String nref = "";
                                            this.numchequeetat.setText(this.firstcheque);
                                            String referencese = this.reference1.getText() + "/" + this.registre1.getText();
                                            state215.executeUpdate("INSERT INTO redevance(mecano,sommedepayment,atitrede,moisdebut,moisfin,ancienref,nouveauxref,nouvauxpret,montantpret,date,montantdecheque) VALUES('" + this.matriculeredevence.getText() + "','" + this.montantpayment.getText() + "','" + this.atitre.getSelectedItem().toString() + "','" + this.datepremiredevance.getText() + "','" + this.datederrede.getText() + "','" + referencese + "','" + nref + "','" + typcarnet + "','" + this.mensualit\u00e9.getText() + "','" + this.dateredevance.getText() + "','" + this.montantcheque + "')");
                                            JOptionPane jop29 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "succerrrrrrrrrrrr d'ajout a l'etat : ");
                                            this.k = 1;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            jop26 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur d'ajout a redevance : " + e.getMessage());
                                        }
                                        if (this.k == 1) {
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state215 = conn22.createStatement();
                                                this.k = 1;
                                                String pv = "1";
                                                this.numchequeetat.setText(this.firstcheque);
                                                String mffd = this.mff + "000";
                                                state215.executeUpdate("INSERT INTO etatdeschequepretmasp(Mecano,date,montant,pv,numch) VALUES('" + this.mecano.getText() + "','" + datdd + "','" + mffd + "','" + pv + "','" + this.firstcheque + "')");
                                                this.num = 0;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur d'ajout a etatdeschequepretmasp : " + e.getMessage());
                                            }
                                        }
                                        if (this.k == 1) {
                                            int total = 0;
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state214 = conn2.createStatement();
                                                p9 = "1";
                                                ResultSet result213 = state214.executeQuery("SELECT * FROM caissemasp  WHERE n='" + p9 + "'");
                                                while (result213.next()) {
                                                    String ttt = result213.getString("total");
                                                    total = Integer.parseInt(ttt);
                                                }
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                JOptionPane jop325 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant 66666666666666666666" + e.getMessage());
                                            }
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state214 = conn22.createStatement();
                                                p9 = "0";
                                                state214.executeUpdate("UPDATE  caissemasp SET n='0' ");
                                                this.k = 1;
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur de modification caisse: " + e.getMessage());
                                            }
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                state214 = conn22.createStatement();
                                                this.k = 1;
                                                String pret = "1";
                                                String prime = "0";
                                                System.out.println("m2 =" + this.m);
                                                int tm = Integer.parseInt(this.m);
                                                String mm = "" + (total -= tm) + "";
                                                this.numchequeetat.setText(this.firstcheque);
                                                state214.executeUpdate("INSERT INTO caissemasp(date,mecano,pret,prime,debit,credit,total,n) VALUES('" + datdd + "','" + this.mecano.getText() + "','" + pret + "','" + prime + "','" + this.m + "','0','" + mm + "','1')");
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                jop1 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse masp (redev): " + e.getMessage());
                                            }
                                        }
                                    }
                                    if (this.k == 1) {
                                        String referencee = this.reference1.getText() + "/" + this.registre1.getText();
                                        this.refredevance.setText(referencee);
                                        String atitrederedev = this.atitre.getSelectedItem().toString();
                                        if (atitrederedev.equals("Pret    FDD")) {
                                            this.jLabel177.setText("");
                                            this.refetatredev.setText("");
                                        } else {
                                            this.jLabel177.setText("N\u00b0 :");
                                            this.refetatredev.setText(referencee);
                                        }
                                        this.solderlepret.setText(this.atitre.getSelectedItem().toString());
                                        this.titredepayment.setText(this.atitre.getSelectedItem().toString());
                                        this.d1re.setText(this.datepremiredevance.getText());
                                        this.etatmoisredv.setText(this.datepremiredevance.getText());
                                        this.derredevvv.setText(this.datederrede.getText());
                                        this.datefinetatredev.setText(this.datederrede.getText());
                                        this.montantredevanceetat.setText(this.montantpayment.getText() + "DT");
                                        this.somredevance.setText(this.montantpayment.getText() + "DT");
                                        JOptionPane.showMessageDialog(null, "Attention : Impression De l'ordre de payment  ", "Information", 1);
//                                        r2 = new Impression1(this.jPanel15);
//                                        r2.actionPerformed(evt);
                                        JOptionPane.showMessageDialog(null, "Attention : Impression De Cession ", "Information", 1);
                                        Impression1 s = new Impression1(this.jPanel4);
                                        s.actionPerformed(evt);
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Statement state216 = conn22.createStatement();
                                            this.k = 1;
                                            String red = this.montantcheque;
                                            String p12 = "0";
                                            this.numchequeetat1.setText(this.firstcheque);
                                            String cas406 = "000";
                                            String pv406 = "0";
                                            state216.executeUpdate("INSERT INTO cession2(NBC,\tannenbc,mois,date,Mecano,Nom,Montant,Nbmois,premiermois,derniermois,montantparmois,ncheque,pv,valider,redevance,cas406,pv406) VALUES('" + this.num + "','" + anneac + "','" + dateS + "','" + datddd3 + "','" + this.mecano.getText() + "','" + this.nomadh + "','" + montglobale + "','" + nbm + "','" + moiddebut + "','" + moisfin + "','" + this.parmois + "','" + this.firstcheque + "','" + p12 + "','" + p12 + "','" + red + "','" + cas406 + "','" + pv406 + "')");
                                            this.num = 0;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            JOptionPane jop210 = new JOptionPane();
                                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                                        }
                                        if (this.k == 1) {
                                            this.mecano.setText("");
                                            this.mensualit\u00e9.setText("");
                                            this.nbmois.setText("");
                                            this.mat.setText("");
                                            this.nometprenom.setText("................................");
                                            this.matricule.setText("................................");
                                            this.ncina.setText("................................");
                                            this.grade.setText("................................");
                                            this.addrr.setText("..................................................");
                                            if (this.k == 1) {
                                                JOptionPane.showMessageDialog(null, "Attention : Impression De Demande ", "Information", 1);
                                                Impression1 sd = new Impression1(this.jPanel5);
                                                sd.actionPerformed(evt);
                                                JOptionPane.showMessageDialog(null, "Attention :  Impression De L'etat ", "Information", 1);
                                                Impression1 se = new Impression1(this.redev);
                                                se.actionPerformed(evt);
                                                JOptionPane.showMessageDialog(null, "Attention :  Impression De L'etat (service des prets) ", "Information", 1);
                                                Impression1 se1 = new Impression1(this.jPanel12);
                                                se1.actionPerformed(evt);
                                                JOptionPane.showMessageDialog(null, "Attention :  carnet de cheque N\u00b0:" + this.numcarnet + "  et N\u00b0 cheque :" + this.firstcheque + "", "Information", 1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.mecano.enable(false);
            this.mensualit\u00e9.enable(false);
            this.nbmois.enable(false);
            this.mat.enable(false);
            this.cession.setSelected(false);
            this.mainlev\u00e9e.setSelected(false);
            this.redevance.setSelected(false);
            this.datepremiredevance.enable(false);
            this.datederrede.enable(false);
            this.reference1.enable(false);
            this.registre1.enable(false);
            this.montantpayment.enable(false);
            this.atitre.enable(false);
            this.montantpayment.setText("");
            this.mecano.setText("");
            this.mensualit\u00e9.setText("");
            this.datepremiredevance.setText("");
            this.datederrede.setText("");
            this.reference1.setText("");
            this.registre1.setText("");
            this.nbmois.setText("");
            this.mat.setText("");
            this.nometprenom.setText("................................");
            this.matricule.setText("................................");
            this.ncina.setText("................................");
            this.grade.setText("................................");
            this.addrr.setText("..................................................");
        }
        /******new case direct 406 and esp*******/
        
        
        
        
        
    }

    private void jTextField13ActionPerformed(ActionEvent evt) {
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

    private void jTextField15ActionPerformed(ActionEvent evt) {
    }

    private void jTextField17ActionPerformed(ActionEvent evt) {
    }

    private void jTextField18ActionPerformed(ActionEvent evt) {
    }

    private void jTextField19ActionPerformed(ActionEvent evt) {
    }

    private void jTextField21ActionPerformed(ActionEvent evt) {
    }

    private void jTextField23ActionPerformed(ActionEvent evt) {
    }

    private void jTextField25ActionPerformed(ActionEvent evt) {
    }

    private void jTextField27ActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        miseajourmontant a = new miseajourmontant();
        a.show();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        impressionchequecession a = new impressionchequecession();
        a.show();
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        boolean k = false;
        this.t.setSelected(true);
        if (this.cession.isSelected() && this.mainlev\u00e9e.isSelected()) {
            this.titre.setText("Cession Sur Salire + Main lev\u00e9e");
            this.test = 1;
            k = true;
            this.mc.enable(true);
            this.mecano.enable(true);
            this.mensualit\u00e9.enable(true);
            this.nbmois.enable(true);
            this.atitre.enable(false);
            this.mat.enable(true);
            this.cs.enable(true);
            this.direct.enable(true);
           // this.esp.enable(true);
            this.datepremiredevance.enable(false);
            this.datederrede.enable(false);
            this.reference1.enable(false);
            this.registre1.enable(false);
        } else if (this.cession.isSelected() && this.redevance.isSelected()) {
            this.titre.setText("Cession Sur Salaire ");
            this.cs.enable(true);
            this.direct.enable(true);
            k = true;
            this.mecano.enable(true);
            this.mensualit\u00e9.enable(true);
            this.nbmois.enable(true);
            this.jLabel18.setVisible(true);
            this.mat.enable(true);
            this.test = 4;
            this.datepremiredevance.enable(true);
            this.datederrede.enable(true);
            this.reference1.enable(true);
            this.registre1.enable(true);
            this.atitre.enable(true);
            this.montantpayment.enable(true);
            System.out.println("lkjlkjkldjhfkdfgdfsdsgfdfgdfsg");
        } else if (this.mainlev\u00e9e.isSelected() && this.redevance.isSelected()) {
            k = false;
            this.datepremiredevance.enable(false);
            this.datederrede.enable(false);
            this.reference1.enable(false);
            this.registre1.enable(false);
            this.mc.enable(true);
            this.mecano.enable(false);
            this.mensualit\u00e9.enable(false);
            this.nbmois.enable(false);
            this.atitre.enable(false);
            this.mat.enable(false);
            this.imprimer.enable(false);
            this.cs.enable(false);
            this.direct.enable(false);
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "choix incorrecte !!!!!");
        } else if (this.cession.isSelected()) {
            this.titre.setText("Cession Sur Salaire ");
            this.test = 2;
            System.out.println("test ====================" + this.test);
            this.datepremiredevance.enable(false);
            this.datederrede.enable(false);
            this.reference1.enable(false);
            this.registre1.enable(false);
            this.mecano.enable(true);
            this.mensualit\u00e9.enable(true);
            this.nbmois.enable(true);
            this.atitre.enable(false);
            this.mat.enable(true);
            this.imprimer.enable(true);
            this.cs.enable(true);
            this.direct.enable(true);
        } else if (this.mainlev\u00e9e.isSelected()) {
            this.titre.setText("Main lev\u00e9e");
            this.test = 3;
            this.datepremiredevance.enable(false);
            this.datederrede.enable(false);
            this.reference1.enable(false);
            this.registre1.enable(false);
            this.mc.enable(true);
            this.mecano.enable(true);
            this.mensualit\u00e9.enable(false);
            this.nbmois.enable(false);
            this.atitre.enable(false);
            this.mat.enable(false);
            this.imprimer.enable(true);
            this.cs.enable(false);
            this.direct.enable(false);
        } else if (this.redevance.isSelected()) {
            k = false;
            this.datepremiredevance.enable(false);
            this.datederrede.enable(false);
            this.reference1.enable(false);
            this.registre1.enable(false);
            this.mecano.enable(false);
            this.mensualit\u00e9.enable(false);
            this.nbmois.enable(false);
            this.atitre.enable(false);
            this.mat.enable(false);
            this.imprimer.enable(false);
            this.cs.enable(false);
            this.direct.enable(false);
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "choix incorrecte !!!!!");
        }
    }

    private void jTextField29ActionPerformed(ActionEvent evt) {
    }

    private void jTextField31ActionPerformed(ActionEvent evt) {
    }

    private void jTextField32ActionPerformed(ActionEvent evt) {
    }

    private void jTextField33ActionPerformed(ActionEvent evt) {
    }

    private void jTextField35ActionPerformed(ActionEvent evt) {
    }

    private void jTextField37ActionPerformed(ActionEvent evt) {
    }

    private void jTextField39ActionPerformed(ActionEvent evt) {
    }

    private void jTextField41ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        anciencession a = new anciencession();
        a.show();
    }

    private void matActionPerformed(ActionEvent evt) {
    }

    private void montantpaymentActionPerformed(ActionEvent evt) {
    }

    private void datederredeActionPerformed(ActionEvent evt) {
    }

    private void datepremiredevanceActionPerformed(ActionEvent evt) {
    }

    private void reference1ActionPerformed(ActionEvent evt) {
    }

    private void registre1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField43ActionPerformed(ActionEvent evt) {
    }

    private void jTextField45ActionPerformed(ActionEvent evt) {
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
        boolean pp = false;
        if (this.cession.isSelected() && this.cs.isSelected() || this.cession.isSelected() && this.direct.isSelected() || this.mainlev\u00e9e.isSelected() || this.redevance.isSelected()) {
            pp = true;
        } else {
            pp = false;
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choisire  type de paiment par cession ou direct !!!!!");
        }
        if (pp) {
            DefaultTableModel model = (DefaultTableModel)this.pret.getModel();
            if (this.mainlev\u00e9e.isSelected()) {
                System.out.println("----------------------fgdfgh--------");
                Connection conn2 = null;
                try {
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                }
                catch (SQLException ex) {
                    Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    DefaultTableModel medelo = (DefaultTableModel)this.pret.getModel();
                    while (medelo.getRowCount() > 0) {
                        for (int i = 0; i < model.getRowCount(); ++i) {
                            model.removeRow(i);
                        }
                    }
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT * FROM cession2  WHERE mecano='" + this.mecano.getText() + "'");
                    ResultSetMetaData resultMeta2 = result2.getMetaData();
                    System.out.println("------------------------------");
                    while (result2.next()) {
                        String NBC = result2.getString("NBC");
                        System.out.println("-------------------------NBC-" + NBC);
                        String d = result2.getString("date");
                        String ref = result2.getString("ref");
                        String Montant = result2.getString("Montant");
                        String Nbmois = result2.getString("Nbmois");
                        String premiermois = result2.getString("premiermois");
                        String derniermois = result2.getString("derniermois");
                        medelo.addRow(new Object[]{NBC, d, ref, Montant, Nbmois, premiermois, derniermois, false});
                        ColumnsAutoSizer.sizeColumnsToFit(this.pret);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Adherant n'existe pas" + e.getMessage());
                    this.k = 0;
                }
            }
        }
    }

    private void pretMouseClicked(MouseEvent evt) {
        System.out.println("rtertyrety");
    }

    private void mecanoMouseClicked(MouseEvent evt) {
        
     
        
        if (!(this.cession.isSelected() && this.cs.isSelected() || this.cession.isSelected() && this.direct.isSelected() || this.mainlev\u00e9e.isSelected() || this.redevance.isSelected())) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choisire  type de paiment par cession ou direct !!!!!");
        }
    }

    private void codebActionPerformed(ActionEvent evt) {
    }

    private void mcActionPerformed(ActionEvent evt) {
    }

    private static class DefaultTableModelImpl
    extends DefaultTableModel {
        public DefaultTableModelImpl(Object[][] os, Object[] os1) {
            super(os, os1);
        }

        @Override
        public Class<?> getColumnClass(int column) {
            if (column == 1) {
                return Boolean.class;
            }
            return String.class;
        }
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

