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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
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
import mon_projet_fin_etude.chequeretretait;
import mon_projet_fin_etude.effectueepar;
import mon_projet_fin_etude.etatcheque;
import mon_projet_fin_etude.modifiercheque;
import mon_projet_fin_etude.recherchecarnedecheque;

public class cheque
extends JPanel {
    public int nb;
    public int k = 0;
    public int b = 1;
    public int anp = 0;
    public int fnp = 0;
    public int nbch = 0;
    public int kj = 0;
    public int bj = 0;
    public String ch;
    public String montant;
    public String banquee;
    public String ban;
    public String nomeff = "";
    public String hf = "";
    public String ncineffe = "";
    public String delivrele = "";
    public String aa = "";
    String nb2 = "1";
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    String numcarnetreserver = "";
    double Nch;
    double Nfin;
    int ji = 0;
    private JLabel BT1;
    private JLabel BT10;
    private JLabel BT2;
    private JLabel BT3;
    private JLabel BT4;
    private JLabel BT5;
    private JLabel BT6;
    private JLabel BT7;
    private JLabel BT8;
    private JLabel BT9;
    private JLabel C1;
    private JLabel C10;
    private JLabel C2;
    private JLabel C3;
    private JLabel C4;
    private JLabel C5;
    private JLabel C6;
    private JLabel C7;
    private JLabel C8;
    private JLabel C9;
    private JLabel CU1;
    private JLabel CU2;
    private JLabel CU3;
    private JLabel CU4;
    private JLabel CU5;
    private JLabel CU6;
    private JLabel CU7;
    private JLabel CU8;
    private JLabel DATEOPERATION;
    private JLabel DATEOPERATIONU;
    private JLabel M1;
    private JLabel M10;
    private JLabel M2;
    private JLabel M3;
    private JLabel M4;
    private JLabel M5;
    private JLabel M6;
    private JLabel M7;
    private JLabel M8;
    private JLabel M9;
    private JTextField MECCC;
    private JLabel MU1;
    private JLabel MU2;
    private JLabel MU3;
    private JLabel MU4;
    private JLabel MU5;
    private JLabel MU6;
    private JLabel MU7;
    private JLabel MU8;
    private JLabel T1;
    private JLabel T10;
    private JLabel T2;
    private JLabel T3;
    private JLabel T4;
    private JLabel T5;
    private JLabel T6;
    private JLabel T7;
    private JLabel T8;
    private JLabel T9;
    private JLabel TOTAL;
    private JLabel TOTAL1;
    private JLabel TOTAL2U;
    private JLabel TOTALU;
    private JLabel TU1;
    private JLabel TU2;
    private JLabel TU3;
    private JLabel TU4;
    private JLabel TU5;
    private JLabel TU6;
    private JLabel TU7;
    private JLabel TU8;
    private JLabel UIB1;
    private JLabel UIB2;
    private JLabel UIB3;
    private JLabel UIB4;
    private JLabel UIB5;
    private JLabel UIB6;
    private JLabel UIB7;
    private JLabel UIB8;
    private JLabel a;
    private JButton ajouter;
    private JComboBox bq;
    private JComboBox bq1;
    private ButtonGroup buttonGroup1;
    private JLabel cinu;
    private JLabel datesy;
    private JLabel datesy1;
    private JLabel du;
    private JComboBox forni;
    private JPanel hhhhhhhhhhhh;
    private JToggleButton imprimerch;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel lordre;
    private JLabel lordre1;
    private JLabel mecc;
    private JLabel mecc1;
    private JLabel mont;
    private JLabel mont1;
    private JLabel montlet;
    private JLabel montlet1;
    private JLabel nbdevir;
    private JTextField ncin;
    private JLabel nn;
    private JLabel numcompbt;
    private JLabel numcompbt1;
    private JLabel numcompbt2;
    private JLabel numcompbt3;
    private JTextField numdossier;
    private JButton ok;
    private JTextField payment;
    private JLabel pieccin;
    private JButton recherche;
    private JLabel tirreure;
    private JLabel tirreure1;
    private JLabel tirreureu;

    public cheque() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel6 = new JPanel();
        this.jLabel2 = new JLabel();
        this.hhhhhhhhhhhh = new JPanel();
        this.jPanel3 = new JPanel();
        this.numcompbt = new JLabel();
        this.numcompbt1 = new JLabel();
        this.C1 = new JLabel();
        this.C2 = new JLabel();
        this.C3 = new JLabel();
        this.C4 = new JLabel();
        this.BT8 = new JLabel();
        this.T1 = new JLabel();
        this.M1 = new JLabel();
        this.C5 = new JLabel();
        this.C6 = new JLabel();
        this.C7 = new JLabel();
        this.C8 = new JLabel();
        this.BT1 = new JLabel();
        this.BT2 = new JLabel();
        this.BT3 = new JLabel();
        this.BT4 = new JLabel();
        this.BT5 = new JLabel();
        this.BT6 = new JLabel();
        this.M2 = new JLabel();
        this.M3 = new JLabel();
        this.M4 = new JLabel();
        this.M5 = new JLabel();
        this.M6 = new JLabel();
        this.M7 = new JLabel();
        this.M8 = new JLabel();
        this.BT7 = new JLabel();
        this.C9 = new JLabel();
        this.C10 = new JLabel();
        this.BT10 = new JLabel();
        this.BT9 = new JLabel();
        this.M9 = new JLabel();
        this.TOTAL = new JLabel();
        this.T2 = new JLabel();
        this.T3 = new JLabel();
        this.T4 = new JLabel();
        this.T5 = new JLabel();
        this.T6 = new JLabel();
        this.T7 = new JLabel();
        this.T8 = new JLabel();
        this.T9 = new JLabel();
        this.T10 = new JLabel();
        this.M10 = new JLabel();
        this.TOTAL1 = new JLabel();
        this.DATEOPERATION = new JLabel();
        this.tirreure = new JLabel();
        this.pieccin = new JLabel();
        this.du = new JLabel();
        this.a = new JLabel();
        this.jPanel4 = new JPanel();
        this.numcompbt2 = new JLabel();
        this.numcompbt3 = new JLabel();
        this.tirreure1 = new JLabel();
        this.CU1 = new JLabel();
        this.UIB1 = new JLabel();
        this.MU1 = new JLabel();
        this.TU1 = new JLabel();
        this.TU2 = new JLabel();
        this.MU2 = new JLabel();
        this.UIB2 = new JLabel();
        this.CU2 = new JLabel();
        this.CU3 = new JLabel();
        this.UIB3 = new JLabel();
        this.MU3 = new JLabel();
        this.TU3 = new JLabel();
        this.MU4 = new JLabel();
        this.TU4 = new JLabel();
        this.UIB4 = new JLabel();
        this.CU4 = new JLabel();
        this.CU5 = new JLabel();
        this.UIB5 = new JLabel();
        this.MU5 = new JLabel();
        this.TU5 = new JLabel();
        this.TU6 = new JLabel();
        this.MU7 = new JLabel();
        this.MU6 = new JLabel();
        this.MU8 = new JLabel();
        this.TU8 = new JLabel();
        this.TU7 = new JLabel();
        this.UIB8 = new JLabel();
        this.UIB7 = new JLabel();
        this.UIB6 = new JLabel();
        this.CU6 = new JLabel();
        this.CU7 = new JLabel();
        this.CU8 = new JLabel();
        this.TOTAL2U = new JLabel();
        this.TOTALU = new JLabel();
        this.DATEOPERATIONU = new JLabel();
        this.tirreureu = new JLabel();
        this.cinu = new JLabel();
        this.nbdevir = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jPanel5 = new JPanel();
        this.montlet1 = new JLabel();
        this.mont1 = new JLabel();
        this.lordre1 = new JLabel();
        this.mecc1 = new JLabel();
        this.jLabel8 = new JLabel();
        this.datesy1 = new JLabel();
        this.jPanel2 = new JPanel();
        this.montlet = new JLabel();
        this.mont = new JLabel();
        this.lordre = new JLabel();
        this.mecc = new JLabel();
        this.jLabel5 = new JLabel();
        this.datesy = new JLabel();
        this.jPanel1 = new JPanel();
        this.nn = new JLabel();
        this.jLabel4 = new JLabel();
        this.jComboBox1 = new JComboBox();
        this.MECCC = new JTextField();
        this.ajouter = new JButton();
        this.imprimerch = new JToggleButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel6 = new JLabel();
        this.bq = new JComboBox();
        this.numdossier = new JTextField();
        this.ok = new JButton();
        this.jLabel1 = new JLabel();
        this.forni = new JComboBox();
        this.bq1 = new JComboBox();
        this.jLabel13 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jButton3 = new JButton();
        this.recherche = new JButton();
        this.jLabel3 = new JLabel();
        this.ncin = new JTextField();
        this.jLabel9 = new JLabel();
        this.payment = new JTextField();
        this.jButton2 = new JButton();
        this.jButton1 = new JButton();
        this.jPanel6.setLayout(null);
        this.jLabel2.setFont(new Font("Tahoma", 1, 24));
        this.jLabel2.setForeground(new Color(51, 51, 255));
        this.jLabel2.setText("Imprimer Montant Cheque");
        this.jPanel6.add(this.jLabel2);
        this.jLabel2.setBounds(200, 0, 340, 30);
        this.hhhhhhhhhhhh.setBackground(new Color(204, 204, 204));
        this.jPanel3.setBackground(new Color(255, 255, 255));
        this.jPanel3.setLayout(null);
        this.numcompbt.setFont(new Font("Tahoma", 1, 14));
        this.numcompbt.setText("CENTRE SOCIAL MAHDIA");
        this.jPanel3.add(this.numcompbt);
        this.numcompbt.setBounds(100, 150, 210, 30);
        this.numcompbt1.setFont(new Font("Tahoma", 1, 14));
        this.numcompbt1.setText("     14            313            499");
        this.jPanel3.add(this.numcompbt1);
        this.numcompbt1.setBounds(40, 120, 290, 30);
        this.C1.setFont(new Font("Arial", 0, 12));
        this.C1.setText("C1");
        this.jPanel3.add(this.C1);
        this.C1.setBounds(30, 250, 70, 15);
        this.C2.setFont(new Font("Arial", 0, 12));
        this.C2.setText("C1");
        this.jPanel3.add(this.C2);
        this.C2.setBounds(30, 265, 70, 15);
        this.C3.setFont(new Font("Arial", 0, 12));
        this.C3.setText("C1");
        this.jPanel3.add(this.C3);
        this.C3.setBounds(30, 285, 70, 10);
        this.C4.setFont(new Font("Arial", 0, 12));
        this.C4.setText("C1");
        this.jPanel3.add(this.C4);
        this.C4.setBounds(30, 300, 70, 15);
        this.BT8.setFont(new Font("Arial", 0, 12));
        this.BT8.setText("bt");
        this.jPanel3.add(this.BT8);
        this.BT8.setBounds(100, 360, 70, 10);
        this.T1.setFont(new Font("Arial", 0, 12));
        this.T1.setText("tIRREURE");
        this.jPanel3.add(this.T1);
        this.T1.setBounds(270, 250, 260, 15);
        this.M1.setFont(new Font("Arial", 0, 12));
        this.M1.setText("MONTANT");
        this.jPanel3.add(this.M1);
        this.M1.setBounds(190, 250, 120, 10);
        this.C5.setFont(new Font("Arial", 0, 12));
        this.C5.setText("C1");
        this.jPanel3.add(this.C5);
        this.C5.setBounds(30, 310, 70, 20);
        this.C6.setFont(new Font("Arial", 0, 12));
        this.C6.setText("C1");
        this.jPanel3.add(this.C6);
        this.C6.setBounds(30, 330, 70, 15);
        this.C7.setFont(new Font("Arial", 0, 12));
        this.C7.setText("C1");
        this.jPanel3.add(this.C7);
        this.C7.setBounds(30, 345, 70, 10);
        this.C8.setFont(new Font("Arial", 0, 12));
        this.C8.setText("C1");
        this.jPanel3.add(this.C8);
        this.C8.setBounds(30, 360, 70, 10);
        this.BT1.setFont(new Font("Arial", 0, 12));
        this.BT1.setText("bt");
        this.jPanel3.add(this.BT1);
        this.BT1.setBounds(100, 250, 70, 15);
        this.BT2.setFont(new Font("Arial", 0, 12));
        this.BT2.setText("bt");
        this.jPanel3.add(this.BT2);
        this.BT2.setBounds(100, 265, 70, 15);
        this.BT3.setFont(new Font("Arial", 0, 12));
        this.BT3.setText("bt");
        this.jPanel3.add(this.BT3);
        this.BT3.setBounds(100, 285, 70, 10);
        this.BT4.setFont(new Font("Arial", 0, 12));
        this.BT4.setText("bt");
        this.jPanel3.add(this.BT4);
        this.BT4.setBounds(100, 300, 70, 15);
        this.BT5.setFont(new Font("Arial", 0, 12));
        this.BT5.setText("bt");
        this.jPanel3.add(this.BT5);
        this.BT5.setBounds(100, 310, 70, 20);
        this.BT6.setFont(new Font("Arial", 0, 12));
        this.BT6.setText("bt");
        this.jPanel3.add(this.BT6);
        this.BT6.setBounds(100, 320, 70, 30);
        this.M2.setFont(new Font("Arial", 0, 12));
        this.M2.setText("MONTANT");
        this.jPanel3.add(this.M2);
        this.M2.setBounds(190, 265, 120, 15);
        this.M3.setFont(new Font("Arial", 0, 12));
        this.M3.setText("MONTANT");
        this.jPanel3.add(this.M3);
        this.M3.setBounds(190, 285, 120, 10);
        this.M4.setFont(new Font("Arial", 0, 12));
        this.M4.setText("MONTANT");
        this.jPanel3.add(this.M4);
        this.M4.setBounds(190, 295, 120, 20);
        this.M5.setFont(new Font("Arial", 0, 12));
        this.M5.setText("MONTANT");
        this.jPanel3.add(this.M5);
        this.M5.setBounds(190, 315, 120, 15);
        this.M6.setFont(new Font("Arial", 0, 12));
        this.M6.setText("MONTANT");
        this.jPanel3.add(this.M6);
        this.M6.setBounds(190, 330, 120, 10);
        this.M7.setFont(new Font("Arial", 0, 12));
        this.M7.setText("MONTANT");
        this.jPanel3.add(this.M7);
        this.M7.setBounds(190, 340, 120, 20);
        this.M8.setFont(new Font("Arial", 0, 12));
        this.M8.setText("MONTANT");
        this.jPanel3.add(this.M8);
        this.M8.setBounds(190, 360, 120, 10);
        this.BT7.setFont(new Font("Arial", 0, 12));
        this.BT7.setText("bt");
        this.jPanel3.add(this.BT7);
        this.BT7.setBounds(100, 345, 70, 10);
        this.C9.setFont(new Font("Arial", 0, 12));
        this.C9.setText("C1");
        this.jPanel3.add(this.C9);
        this.C9.setBounds(30, 375, 70, 10);
        this.C10.setFont(new Font("Arial", 0, 12));
        this.C10.setText("C1");
        this.jPanel3.add(this.C10);
        this.C10.setBounds(30, 390, 70, 10);
        this.BT10.setFont(new Font("Arial", 0, 12));
        this.BT10.setText("bt");
        this.jPanel3.add(this.BT10);
        this.BT10.setBounds(100, 390, 70, 10);
        this.BT9.setFont(new Font("Arial", 0, 12));
        this.BT9.setText("bt");
        this.jPanel3.add(this.BT9);
        this.BT9.setBounds(100, 375, 70, 10);
        this.M9.setFont(new Font("Arial", 0, 12));
        this.M9.setText("MONTANT");
        this.jPanel3.add(this.M9);
        this.M9.setBounds(190, 375, 120, 10);
        this.TOTAL.setFont(new Font("Arial", 1, 14));
        this.TOTAL.setText("DSD");
        this.jPanel3.add(this.TOTAL);
        this.TOTAL.setBounds(50, 440, 450, 30);
        this.T2.setFont(new Font("Arial", 0, 12));
        this.T2.setText("tIRREURE");
        this.jPanel3.add(this.T2);
        this.T2.setBounds(270, 265, 260, 15);
        this.T3.setFont(new Font("Arial", 0, 12));
        this.T3.setText("tIRREURE");
        this.jPanel3.add(this.T3);
        this.T3.setBounds(270, 280, 260, 15);
        this.T4.setFont(new Font("Arial", 0, 12));
        this.T4.setText("tIRREURE");
        this.jPanel3.add(this.T4);
        this.T4.setBounds(270, 290, 260, 30);
        this.T5.setFont(new Font("Arial", 0, 12));
        this.T5.setText("tIRREURE");
        this.jPanel3.add(this.T5);
        this.T5.setBounds(270, 315, 260, 10);
        this.T6.setFont(new Font("Arial", 0, 12));
        this.T6.setText("tIRREURE");
        this.jPanel3.add(this.T6);
        this.T6.setBounds(270, 330, 260, 10);
        this.T7.setFont(new Font("Arial", 0, 12));
        this.T7.setText("tIRREURE");
        this.jPanel3.add(this.T7);
        this.T7.setBounds(270, 340, 260, 20);
        this.T8.setFont(new Font("Arial", 0, 12));
        this.T8.setText("tIRREURE");
        this.jPanel3.add(this.T8);
        this.T8.setBounds(270, 360, 260, 10);
        this.T9.setFont(new Font("Arial", 0, 12));
        this.T9.setText("tIRREURE");
        this.jPanel3.add(this.T9);
        this.T9.setBounds(270, 370, 260, 20);
        this.T10.setFont(new Font("Arial", 0, 12));
        this.T10.setText("tIRREURE");
        this.jPanel3.add(this.T10);
        this.T10.setBounds(270, 390, 260, 10);
        this.M10.setFont(new Font("Arial", 0, 12));
        this.M10.setText("MONTANT");
        this.jPanel3.add(this.M10);
        this.M10.setBounds(190, 390, 120, 10);
        this.TOTAL1.setFont(new Font("Arial", 1, 14));
        this.TOTAL1.setText("MONTANT");
        this.jPanel3.add(this.TOTAL1);
        this.TOTAL1.setBounds(190, 390, 140, 40);
        this.DATEOPERATION.setFont(new Font("Arial", 1, 14));
        this.DATEOPERATION.setText("Date");
        this.jPanel3.add(this.DATEOPERATION);
        this.DATEOPERATION.setBounds(70, 480, 140, 30);
        this.tirreure.setFont(new Font("Tahoma", 0, 12));
        this.jPanel3.add(this.tirreure);
        this.tirreure.setBounds(100, 180, 330, 30);
        this.pieccin.setFont(new Font("Tahoma", 0, 12));
        this.jPanel3.add(this.pieccin);
        this.pieccin.setBounds(70, 204, 140, 20);
        this.jPanel3.add(this.du);
        this.du.setBounds(190, 200, 120, 30);
        this.jPanel3.add(this.a);
        this.a.setBounds(310, 200, 100, 20);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setLayout(null);
        this.numcompbt2.setFont(new Font("Tahoma", 1, 18));
        this.numcompbt2.setText("12   407   0000093001200 39");
        this.jPanel4.add(this.numcompbt2);
        this.numcompbt2.setBounds(150, 50, 320, 30);
        this.numcompbt3.setFont(new Font("Tahoma", 1, 14));
        this.numcompbt3.setText("CENTRE SOCIAL MAHDIA");
        this.jPanel4.add(this.numcompbt3);
        this.numcompbt3.setBounds(170, 90, 210, 20);
        this.tirreure1.setFont(new Font("Tahoma", 0, 12));
        this.jPanel4.add(this.tirreure1);
        this.tirreure1.setBounds(110, 110, 330, 20);
        this.CU1.setFont(new Font("Arial", 0, 12));
        this.CU1.setText("C1");
        this.jPanel4.add(this.CU1);
        this.CU1.setBounds(140, 170, 70, 20);
        this.UIB1.setFont(new Font("Arial", 0, 12));
        this.UIB1.setText("bt");
        this.jPanel4.add(this.UIB1);
        this.UIB1.setBounds(50, 170, 50, 20);
        this.MU1.setFont(new Font("Arial", 1, 14));
        this.MU1.setText("MONTANT");
        this.jPanel4.add(this.MU1);
        this.MU1.setBounds(470, 160, 110, 20);
        this.TU1.setFont(new Font("Arial", 0, 12));
        this.TU1.setText("tIRREURE");
        this.jPanel4.add(this.TU1);
        this.TU1.setBounds(230, 160, 220, 30);
        this.TU2.setFont(new Font("Arial", 0, 12));
        this.TU2.setText("tIRREURE");
        this.jPanel4.add(this.TU2);
        this.TU2.setBounds(230, 180, 220, 20);
        this.MU2.setFont(new Font("Arial", 1, 14));
        this.MU2.setText("MONTANT");
        this.jPanel4.add(this.MU2);
        this.MU2.setBounds(470, 175, 110, 30);
        this.UIB2.setFont(new Font("Arial", 0, 12));
        this.UIB2.setText("bt");
        this.jPanel4.add(this.UIB2);
        this.UIB2.setBounds(50, 190, 50, 10);
        this.CU2.setFont(new Font("Arial", 0, 12));
        this.CU2.setText("C1");
        this.jPanel4.add(this.CU2);
        this.CU2.setBounds(140, 180, 70, 30);
        this.CU3.setFont(new Font("Arial", 0, 12));
        this.CU3.setText("C1");
        this.jPanel4.add(this.CU3);
        this.CU3.setBounds(140, 200, 70, 20);
        this.UIB3.setFont(new Font("Arial", 0, 12));
        this.UIB3.setText("bt");
        this.jPanel4.add(this.UIB3);
        this.UIB3.setBounds(50, 200, 50, 20);
        this.MU3.setFont(new Font("Arial", 1, 14));
        this.MU3.setText("MONTANT");
        this.jPanel4.add(this.MU3);
        this.MU3.setBounds(470, 190, 110, 30);
        this.TU3.setFont(new Font("Arial", 0, 12));
        this.TU3.setText("tIRREURE");
        this.jPanel4.add(this.TU3);
        this.TU3.setBounds(230, 190, 220, 30);
        this.MU4.setFont(new Font("Arial", 1, 14));
        this.MU4.setText("MONTANT");
        this.jPanel4.add(this.MU4);
        this.MU4.setBounds(470, 210, 110, 20);
        this.TU4.setFont(new Font("Arial", 0, 12));
        this.TU4.setText("tIRREURE");
        this.jPanel4.add(this.TU4);
        this.TU4.setBounds(230, 210, 220, 20);
        this.UIB4.setFont(new Font("Arial", 0, 12));
        this.UIB4.setText("bt");
        this.jPanel4.add(this.UIB4);
        this.UIB4.setBounds(50, 220, 50, 10);
        this.CU4.setFont(new Font("Arial", 0, 12));
        this.CU4.setText("C1");
        this.jPanel4.add(this.CU4);
        this.CU4.setBounds(140, 210, 70, 30);
        this.CU5.setFont(new Font("Arial", 0, 12));
        this.CU5.setText("C1");
        this.jPanel4.add(this.CU5);
        this.CU5.setBounds(140, 230, 70, 20);
        this.UIB5.setFont(new Font("Arial", 0, 12));
        this.UIB5.setText("bt");
        this.jPanel4.add(this.UIB5);
        this.UIB5.setBounds(50, 230, 50, 20);
        this.MU5.setFont(new Font("Arial", 1, 14));
        this.MU5.setText("MONTANT");
        this.jPanel4.add(this.MU5);
        this.MU5.setBounds(470, 220, 110, 30);
        this.TU5.setFont(new Font("Arial", 0, 12));
        this.TU5.setText("tIRREURE");
        this.jPanel4.add(this.TU5);
        this.TU5.setBounds(230, 230, 220, 20);
        this.TU6.setFont(new Font("Arial", 0, 12));
        this.TU6.setText("tIRREURE");
        this.jPanel4.add(this.TU6);
        this.TU6.setBounds(230, 250, 220, 10);
        this.MU7.setFont(new Font("Arial", 1, 14));
        this.MU7.setText("MONTANT");
        this.jPanel4.add(this.MU7);
        this.MU7.setBounds(470, 260, 110, 20);
        this.MU6.setFont(new Font("Arial", 1, 14));
        this.MU6.setText("MONTANT");
        this.jPanel4.add(this.MU6);
        this.MU6.setBounds(470, 240, 110, 30);
        this.MU8.setFont(new Font("Arial", 1, 14));
        this.MU8.setText("MONTANT");
        this.jPanel4.add(this.MU8);
        this.MU8.setBounds(470, 270, 110, 30);
        this.TU8.setFont(new Font("Arial", 0, 12));
        this.TU8.setText("tIRREURE");
        this.jPanel4.add(this.TU8);
        this.TU8.setBounds(230, 280, 220, 10);
        this.TU7.setFont(new Font("Arial", 0, 12));
        this.TU7.setText("tIRREURE");
        this.jPanel4.add(this.TU7);
        this.TU7.setBounds(230, 260, 220, 20);
        this.UIB8.setFont(new Font("Arial", 0, 12));
        this.UIB8.setText("bt");
        this.jPanel4.add(this.UIB8);
        this.UIB8.setBounds(50, 270, 50, 30);
        this.UIB7.setFont(new Font("Arial", 0, 12));
        this.UIB7.setText("bt");
        this.jPanel4.add(this.UIB7);
        this.UIB7.setBounds(50, 260, 50, 20);
        this.UIB6.setFont(new Font("Arial", 0, 12));
        this.UIB6.setText("bt");
        this.jPanel4.add(this.UIB6);
        this.UIB6.setBounds(50, 250, 50, 10);
        this.CU6.setFont(new Font("Arial", 0, 12));
        this.CU6.setText("C1");
        this.jPanel4.add(this.CU6);
        this.CU6.setBounds(140, 240, 70, 30);
        this.CU7.setFont(new Font("Arial", 0, 12));
        this.CU7.setText("C1");
        this.jPanel4.add(this.CU7);
        this.CU7.setBounds(140, 260, 70, 20);
        this.CU8.setFont(new Font("Arial", 0, 12));
        this.CU8.setText("C1");
        this.jPanel4.add(this.CU8);
        this.CU8.setBounds(140, 280, 70, 10);
        this.TOTAL2U.setFont(new Font("Arial", 1, 14));
        this.TOTAL2U.setText("MONTANT");
        this.jPanel4.add(this.TOTAL2U);
        this.TOTAL2U.setBounds(460, 290, 120, 40);
        this.TOTALU.setFont(new Font("Arial", 1, 12));
        this.TOTALU.setText("DSD");
        this.jPanel4.add(this.TOTALU);
        this.TOTALU.setBounds(100, 300, 350, 30);
        this.DATEOPERATIONU.setFont(new Font("Arial", 1, 14));
        this.DATEOPERATIONU.setText("Date");
        this.jPanel4.add(this.DATEOPERATIONU);
        this.DATEOPERATIONU.setBounds(40, 350, 140, 30);
        this.jPanel4.add(this.tirreureu);
        this.tirreureu.setBounds(197, 106, 241, 30);
        this.jPanel4.add(this.cinu);
        this.cinu.setBounds(464, 102, 110, 28);
        this.nbdevir.setFont(new Font("Tahoma", 1, 12));
        this.jPanel4.add(this.nbdevir);
        this.nbdevir.setBounds(20, 300, 60, 30);
        this.jLabel11.setText("Mahdia");
        this.jPanel4.add(this.jLabel11);
        this.jLabel11.setBounds(480, 70, 80, 20);
        this.jLabel12.setText("Mahdia");
        this.jPanel4.add(this.jLabel12);
        this.jLabel12.setBounds(480, 20, 60, 20);
        this.jPanel5.setBackground(new Color(255, 255, 255));
        this.jPanel5.setLayout(null);
        this.montlet1.setFont(new Font("Tahoma", 0, 12));
        this.montlet1.setText("................");
        this.jPanel5.add(this.montlet1);
        this.montlet1.setBounds(80, 50, 370, 20);
        this.mont1.setFont(new Font("Arial Black", 0, 12));
        this.mont1.setText("................");
        this.jPanel5.add(this.mont1);
        this.mont1.setBounds(350, 0, 110, 20);
        this.lordre1.setFont(new Font("Tahoma", 1, 14));
        this.lordre1.setText("Center Social Mahdia");
        this.jPanel5.add(this.lordre1);
        this.lordre1.setBounds(120, 70, 270, 20);
        this.jPanel5.add(this.mecc1);
        this.mecc1.setBounds(180, 0, 60, 20);
        this.jLabel8.setText("Mahdia ");
        this.jPanel5.add(this.jLabel8);
        this.jLabel8.setBounds(150, 160, 60, 14);
        this.datesy1.setFont(new Font("Tahoma", 0, 12));
        this.datesy1.setText("..............................");
        this.jPanel5.add(this.datesy1);
        this.datesy1.setBounds(200, 160, 170, 15);
        this.jPanel2.setBackground(new Color(255, 255, 255));
        this.jPanel2.setLayout(null);
        this.montlet.setFont(new Font("Tahoma", 0, 12));
        this.montlet.setText("................");
        this.jPanel2.add(this.montlet);
        this.montlet.setBounds(80, 50, 370, 20);
        this.mont.setFont(new Font("Arial Black", 0, 12));
        this.mont.setText("................");
        this.jPanel2.add(this.mont);
        this.mont.setBounds(350, 0, 110, 20);
        this.lordre.setFont(new Font("Tahoma", 1, 14));
        this.lordre.setText("Centre Social Mahdia");
        this.jPanel2.add(this.lordre);
        this.lordre.setBounds(120, 70, 350, 20);
        this.jPanel2.add(this.mecc);
        this.mecc.setBounds(180, 0, 60, 20);
        this.jLabel5.setText("Mahdia ");
        this.jPanel2.add(this.jLabel5);
        this.jLabel5.setBounds(150, 160, 60, 14);
        this.datesy.setFont(new Font("Tahoma", 0, 12));
        this.datesy.setText("..............................");
        this.jPanel2.add(this.datesy);
        this.datesy.setBounds(200, 160, 170, 15);
        GroupLayout hhhhhhhhhhhhLayout = new GroupLayout(this.hhhhhhhhhhhh);
        this.hhhhhhhhhhhh.setLayout(hhhhhhhhhhhhLayout);
        hhhhhhhhhhhhLayout.setHorizontalGroup(hhhhhhhhhhhhLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(hhhhhhhhhhhhLayout.createSequentialGroup().addContainerGap().addComponent(this.jPanel3, -2, 530, -2).addContainerGap(148, 32767)).addGroup(hhhhhhhhhhhhLayout.createSequentialGroup().addContainerGap().addComponent(this.jPanel4, -2, 643, -2).addContainerGap(35, 32767)).addGroup(GroupLayout.Alignment.TRAILING, hhhhhhhhhhhhLayout.createSequentialGroup().addContainerGap(18, 32767).addComponent(this.jPanel5, -2, 660, -2).addContainerGap()).addGroup(hhhhhhhhhhhhLayout.createSequentialGroup().addComponent(this.jPanel2, -2, 660, -2).addContainerGap(28, 32767)));
        hhhhhhhhhhhhLayout.setVerticalGroup(hhhhhhhhhhhhLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(hhhhhhhhhhhhLayout.createSequentialGroup().addComponent(this.jPanel2, -2, 176, -2).addGap(11, 11, 11).addComponent(this.jPanel5, -2, 43, -2).addGap(18, 18, 18).addComponent(this.jPanel3, -2, 117, -2).addGap(38, 38, 38).addComponent(this.jPanel4, -2, 108, -2).addContainerGap(-1, 32767)));
        this.jPanel6.add(this.hhhhhhhhhhhh);
        this.hhhhhhhhhhhh.setBounds(20, 490, 688, 180);
        this.jPanel1.setLayout(null);
        this.nn.setFont(new Font("Tahoma", 0, 18));
        this.nn.setForeground(new Color(0, 153, 255));
        this.nn.setText("Mecano :");
        this.jPanel1.add(this.nn);
        this.nn.setBounds(20, 50, 120, 22);
        this.jLabel4.setFont(new Font("Tahoma", 0, 18));
        this.jLabel4.setForeground(new Color(0, 153, 255));
        this.jLabel4.setText("Montant :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(430, 40, 77, 22);
        this.jComboBox1.setFont(new Font("Tahoma", 0, 24));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{".........", "Centre", "Fournisseur", "Non adherent", "Gestion de centre"}));
        this.jComboBox1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.jComboBox1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jComboBox1);
        this.jComboBox1.setBounds(140, 0, 280, 35);
        this.MECCC.setEnabled(false);
        this.MECCC.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.MECCCActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.MECCC);
        this.MECCC.setBounds(510, 40, 220, 32);
        this.ajouter.setFont(new Font("Tahoma", 1, 11));
        this.ajouter.setIcon(new ImageIcon(this.getClass().getResource("/image/ajouter rdv.png")));
        this.ajouter.setText("Ajouter");
        this.ajouter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.ajouterActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.ajouter);
        this.ajouter.setBounds(600, 150, 120, 40);
        this.imprimerch.setFont(new Font("Tahoma", 1, 12));
        this.imprimerch.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.imprimerch.setText("Imprimer");
        this.imprimerch.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.imprimerchActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.imprimerch);
        this.imprimerch.setBounds(10, 150, 120, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                cheque.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setBorder(BorderFactory.createTitledBorder(null, "", 2, 0));
        this.jTable1.setFont(new Font("Tahoma", 0, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3"}));
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                cheque.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                cheque.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                cheque.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 192, 720, 280);
        this.jLabel6.setFont(new Font("Tahoma", 0, 18));
        this.jLabel6.setForeground(new Color(0, 153, 255));
        this.jLabel6.setText("Banque :");
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(200, 120, 80, 22);
        this.bq.setFont(new Font("Tahoma", 0, 24));
        this.bq.setForeground(new Color(255, 0, 0));
        this.bq.setModel(new DefaultComboBoxModel<String>(new String[]{"", "BT", "UIB", "STB", "BH", "BIAT", "BNA", "ATB", "BZ", "UBCI", "Attijari", "AMEN BANK", "Poste"}));
        this.bq.setEnabled(false);
        this.bq.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.bqActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.bq);
        this.bq.setBounds(290, 115, 150, 30);
        this.numdossier.setFont(new Font("Tahoma", 0, 14));
        this.numdossier.setEnabled(false);
        this.numdossier.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.numdossierActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.numdossier);
        this.numdossier.setBounds(150, 40, 190, 35);
        this.ok.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.ok.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.okActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.ok);
        this.ok.setBounds(440, 0, 50, 30);
        this.jLabel1.setFont(new Font("Tahoma", 1, 12));
        this.jLabel1.setText("fournisseur :");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(0, 130, 80, 20);
        this.forni.setFont(new Font("Tahoma", 0, 14));
        this.forni.setModel(new DefaultComboBoxModel<String>(new String[]{".........", "Nom", "Sociter"}));
        this.forni.setEnabled(false);
        this.jPanel1.add(this.forni);
        this.forni.setBounds(90, 120, 100, 30);
        this.bq1.setFont(new Font("Tahoma", 0, 24));
        this.bq1.setForeground(new Color(255, 0, 0));
        this.bq1.setModel(new DefaultComboBoxModel<String>(new String[]{"", "BT", "UIB"}));
        this.bq1.setEnabled(false);
        this.bq1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.bq1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.bq1);
        this.bq1.setBounds(580, 115, 80, 30);
        this.jLabel13.setFont(new Font("Tahoma", 0, 18));
        this.jLabel13.setForeground(new Color(0, 153, 255));
        this.jLabel13.setText("versemment :");
        this.jPanel1.add(this.jLabel13);
        this.jLabel13.setBounds(450, 120, 120, 22);
        this.jLabel7.setFont(new Font("Tahoma", 0, 18));
        this.jLabel7.setForeground(new Color(0, 153, 255));
        this.jLabel7.setText("A l'ordre de :");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(20, 10, 110, 22);
        this.jButton3.setFont(new Font("Tahoma", 1, 11));
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/annuler/dessiner-modifier-crayon-ecrivez-icone-5630-32.png")));
        this.jButton3.setText("Modifier ");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(140, 150, 117, 30);
        this.recherche.setFont(new Font("Tahoma", 1, 11));
        this.recherche.setIcon(new ImageIcon(this.getClass().getResource("/image/search-purple-dark-icon.png")));
        this.recherche.setText("Recherche");
        this.recherche.setEnabled(false);
        this.recherche.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.rechercheActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.recherche);
        this.recherche.setBounds(520, 0, 129, 30);
        this.jLabel3.setFont(new Font("Tahoma", 0, 18));
        this.jLabel3.setForeground(new Color(0, 153, 255));
        this.jLabel3.setText("N\u00b0 CIN :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(0, 80, 70, 30);
        this.ncin.setEnabled(false);
        this.jPanel1.add(this.ncin);
        this.ncin.setBounds(80, 80, 200, 30);
        this.jLabel9.setFont(new Font("Tahoma", 0, 18));
        this.jLabel9.setForeground(new Color(0, 153, 255));
        this.jLabel9.setText("Payment de :");
        this.jPanel1.add(this.jLabel9);
        this.jLabel9.setBounds(287, 80, 120, 22);
        this.payment.setEnabled(false);
        this.jPanel1.add(this.payment);
        this.payment.setBounds(400, 80, 330, 30);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setText("Afficher l'historique");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(270, 150, 158, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setText("Effectuee Par ?");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cheque.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(450, 150, 125, 35);
        this.jPanel6.add(this.jPanel1);
        this.jPanel1.setBounds(10, 39, 741, 480);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel6, -2, 747, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel6, -1, 689, 32767));
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
    }

    private void MECCCActionPerformed(ActionEvent evt) {
    }

    private void ajouterActionPerformed(ActionEvent evt) {
        JOptionPane jop2;
        boolean g;
        JOptionPane jop22;
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
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
        String datdd = dateFormatt.format(actuellEe);
        this.datesy.setText(datdd);
        this.ch = "C";
        if (this.jComboBox1.getSelectedItem().equals("Centre")) {
            this.lordre.setText("CENTRE SOCIAL MAHDIA");
            this.k = 1;
            this.imprimerch.setVisible(true);
        } else if (this.jComboBox1.getSelectedItem().equals("Adherent")) {
            this.imprimerch.setVisible(false);
            this.k = 2;
        } else if (this.jComboBox1.getSelectedItem().equals("Fournisseur")) {
            this.imprimerch.setVisible(true);
            this.k = 3;
        } else if (this.jComboBox1.getSelectedItem().equals("Non adherent")) {
            this.imprimerch.setVisible(false);
            this.k = 4;
        } else if (this.jComboBox1.getSelectedItem().equals("Gestion de centre")) {
            this.imprimerch.setVisible(false);
            this.k = 5;
        } else {
            this.ch = "";
            this.b = 0;
            jop22 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "A l'ordre de ???", "Attention", 0);
        }
        this.ban = (String)this.bq.getSelectedItem();
        if (this.bq.getSelectedItem().equals("BT")) {
            this.banquee = "BT";
        } else if (this.bq.getSelectedItem().equals("BNA")) {
            this.banquee = "BNA";
        } else if (this.bq.getSelectedItem().equals("UIB")) {
            this.banquee = "UIB";
        } else if (this.bq.getSelectedItem().equals("BH")) {
            this.banquee = "BH";
        } else if (this.bq.getSelectedItem().equals("STB")) {
            this.banquee = "STB";
        } else if (this.bq.getSelectedItem().equals("ATB")) {
            this.banquee = "ATB";
        } else if (this.bq.getSelectedItem().equals("BZ")) {
            this.banquee = "zitouna";
        } else if (this.bq.getSelectedItem().equals("UBCI")) {
            this.banquee = "UBCI";
        } else if (this.bq.getSelectedItem().equals("Attijari")) {
            this.banquee = "Attijari";
        } else if (this.bq.getSelectedItem().equals("Poste")) {
            this.banquee = "Poste";
        } else if (this.bq.getSelectedItem().equals("BIAT")) {
            this.banquee = "BIAT";
        } else if (this.bq.getSelectedItem().equals("AMEN BANK")) {
            this.banquee = "AMEN BANK";
        } else if (this.k == 1) {
            this.banquee = "";
            this.b = 0;
            jop22 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choisire la banque", "Attention", 0);
        }
        boolean k1 = true;
        if (this.k == 1) {
            if (this.bq1.getSelectedItem().equals("BT")) {
                k1 = true;
            } else if (this.bq1.getSelectedItem().equals("UIB")) {
                k1 = true;
            } else {
                k1 = false;
                JOptionPane jop23 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Vesement  ??", "Attention", 0);
            }
        }
        if (this.k == 1) {
            boolean g2;
            boolean bl = g2 = this.numdossier.getText().equals("") || this.MECCC.getText().equals("");
            if (g2) {
                this.b = 0;
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
            }
        } else if (this.k == 2) {
            boolean g3;
            boolean bl = g3 = this.numdossier.getText().equals("") || this.MECCC.getText().equals("");
            if (g3) {
                this.b = 0;
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
            }
        } else if (this.k == 3) {
            boolean g4;
            boolean bl = g4 = this.numdossier.getText().equals("") || this.MECCC.getText().equals("");
            if (g4) {
                this.b = 0;
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
            }
        }
        if (this.k == 4 && (g = this.MECCC.getText().equals(""))) {
            this.b = 0;
            jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        }
        boolean i = true;
        if (this.MECCC.getText().length() < 4) {
            jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Montant Incorrecte", "Attention", 0);
            i = false;
        }
        this.mecc.setText("");
        if (this.b == 1 && i) {
            JOptionPane jop3 = new JOptionPane();
            if (this.k == 2) {
                DefaultTableModel dt1;
                ResultSet result3;
                String NOMA;
                String mecano;
                Statement state;
                Object[] stg;
                this.kj = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state = conn2.createStatement();
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N dossier");
                    dt1.addColumn("nom et prenom");
                    dt1.addColumn("montant");
                    this.jTable1.setModel(dt1);
                    result3 = state.executeQuery("SELECT * FROM adherent  WHERE MECANO='" + this.numdossier.getText() + "'");
                    while (result3.next()) {
                        this.kj = 1;
                        NOMA = result3.getString("NOM");
                        mecano = result3.getString("MECANO");
                        this.mecc.setText(mecano);
                        this.lordre.setText(NOMA);
                        stg = new Object[]{this.numdossier.getText(), NOMA, this.MECCC.getText()};
                        dt1.addRow(stg);
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Base De Donn\u00e9es fermer  ");
                }
                if (this.kj == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state = conn2.createStatement();
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N dossier");
                        dt1.addColumn("nom et prenom");
                        dt1.addColumn("montant");
                        this.jTable1.setModel(dt1);
                        result3 = state.executeQuery("SELECT * FROM retretait  WHERE mecano='" + this.numdossier.getText() + "'");
                        while (result3.next()) {
                            this.kj = 1;
                            NOMA = result3.getString("nom");
                            mecano = result3.getString("mecano");
                            this.mecc.setText(mecano);
                            this.lordre.setText(NOMA);
                            stg = new Object[]{this.numdossier.getText(), NOMA, this.MECCC.getText()};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Base De Donn\u00e9es fermer  ");
                    }
                }
                if (this.kj == 1) {
                    String adi;
                    String mmontant = this.MECCC.getText();
                    System.out.println("montant =" + mmontant);
                    int t = mmontant.length() - 3;
                    System.out.println("long " + t);
                    String di = mmontant.substring(0, mmontant.length() - 3);
                    String mil = mmontant.substring(t, mmontant.length());
                    this.mont.setText("#" + di + "," + mil + "#");
                    int nndi = Integer.parseInt(di);
                    int nnmi = Integer.parseInt(mil);
                    String montt = "";
                    String s = "";
                    if (mil.equals("000")) {
                        try {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            montt = adi.toUpperCase();
                        }
                        catch (Exception ex) {
                            Logger.getLogger(cheque.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            montt = adi.toUpperCase() + " ET " + nnmi + " MILLIMES";
                        }
                        catch (Exception ex) {
                            Logger.getLogger(cheque.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    this.montlet.setText(montt);
                    Impression1 ss = new Impression1(this.jPanel2);
                    ss.actionPerformed(evt);
                }
            } else if (this.k == 1) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state = conn2.createStatement();
                    ResultSet result3 = state.executeQuery("SELECT * FROM adherent  WHERE MECANO='" + this.numdossier.getText() + "'");
                    Date actuelle = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    String datd = dateFormat.format(actuelle);
                    String dateS = datd.substring(3, datd.length());
                    System.out.println("date System= " + datd);
                    System.out.println("date S = " + dateS);
                    String numcheque = this.ncin.getText();
                    String mmonttant = this.MECCC.getText();
                    int jt = 0;
                    System.out.println("bb**");
                    while (result3.next()) {
                        Statement state2;
                        System.out.println("jt** " + ++jt);
                        String TIREUR = result3.getString("NOM");
                        try {
                            state2 = conn22.createStatement();
                            state2.executeUpdate("UPDATE adherent SET montant='" + this.MECCC.getText() + "' WHERE mecano=" + this.numdossier.getText());
                            state2.executeUpdate("UPDATE adherent SET typbanque='" + this.ch + "' WHERE mecano=" + this.numdossier.getText());
                            int fin = 1;
                            state2.executeUpdate("UPDATE adherent SET fin='" + fin + "' WHERE mecano=" + this.numdossier.getText());
                            state2.executeUpdate("UPDATE adherent SET banque='" + this.banquee + "' WHERE mecano=" + this.numdossier.getText());
                            state2.executeUpdate("UPDATE adherent SET numcheque='" + numcheque + "' WHERE mecano=" + this.numdossier.getText());
                        }
                        catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "ereure DE MODIFICATION " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state2 = conn22.createStatement();
                            String nb = "1";
                            String imprimeborde = "1";
                            state2.executeUpdate("INSERT INTO etatchequeretr(mois,numcheque,banque,montant,TIREUR,nbch,ban,MECANO) VALUES('" + dateS + "','" + numcheque + "','" + this.banquee + "','" + mmonttant + "','" + TIREUR + "','" + nb + "','" + this.ban + "','" + this.numdossier.getText() + "')");
                        }
                        catch (Exception e) {
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                        }
                        DefaultTableModel dt1 = new DefaultTableModel();
                        dt1.addColumn("mecano");
                        dt1.addColumn("TIREUR");
                        dt1.addColumn("banque");
                        dt1.addColumn("Montant");
                        dt1.addColumn("N\u00b0cheque");
                        this.jTable1.setModel(dt1);
                        try {
                            Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state4 = conn4.createStatement();
                            ResultSet result4 = state4.executeQuery("SELECT * FROM adherent  WHERE typbanque='" + this.ch + "'");
                            while (result4.next()) {
                                String ff = result4.getString("fin");
                                int fff = Integer.parseInt(ff);
                                if (fff != 1) continue;
                                String mm = result4.getString("MECANO");
                                String bb = result4.getString("banque");
                                String montantt = result4.getString("montant");
                                String NOM = result4.getString("NOM");
                                String numc = result4.getString("numcheque");
                                System.out.println("nom =" + NOM);
                                System.out.println("---------------");
                                Object[] stg = new Object[]{mm, NOM, bb, montantt, numc};
                                dt1.addRow(stg);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "erreur d'affichage *1* " + e.getMessage());
                        }
                    }
                    if (jt == 0) {
                        JOptionPane jop24 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adherent n'existe pas ", "Attention", 0);
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                }
            } else if (this.k == 4) {
                String adi;
                this.lordre.setText(this.numdossier.getText());
                String mmontant = this.MECCC.getText();
                this.mont.setText(mmontant);
                System.out.println("montant =" + mmontant);
                int t = mmontant.length() - 3;
                System.out.println("long " + t);
                String di = mmontant.substring(0, mmontant.length() - 3);
                String mil = mmontant.substring(t, mmontant.length());
                this.mont.setText("#" + di + "," + mil + "#");
                int nndi = Integer.parseInt(di);
                int nnmi = Integer.parseInt(mil);
                String montt = "";
                String s = "";
                if (mil.equals("000")) {
                    try {
                        adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                        montt = adi.toUpperCase();
                    }
                    catch (Exception ex) {
                        Logger.getLogger(cheque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                        montt = adi.toUpperCase() + " ET " + nnmi + " MILLIMES";
                    }
                    catch (Exception ex) {
                        Logger.getLogger(cheque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                this.montlet.setText(montt);
                Impression1 ss = new Impression1(this.jPanel2);
                ss.actionPerformed(evt);
            } else if (this.k == 3) {
                boolean fo = false;
                if (this.forni.getSelectedItem().equals("Nom") || this.forni.getSelectedItem().equals("Sociter")) {
                    fo = true;
                } else {
                    JOptionPane jop25 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Par Nom / Par Sociter", "Attention", 0);
                }
                if (fo) {
                    if (this.forni.getSelectedItem().equals("Nom")) {
                        this.ji = 1;
                    } else if (this.forni.getSelectedItem().equals("Sociter")) {
                        this.ji = 2;
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state = conn2.createStatement();
                        ResultSet result3 = state.executeQuery("SELECT * FROM ffournis  WHERE MATRIC='" + this.numdossier.getText() + "' ORDER BY MATRIC");
                        Date actuelle = new Date();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        String datd = dateFormat.format(actuelle);
                        String dateS = datd.substring(3, datd.length());
                        System.out.println("date System= " + datd);
                        System.out.println("date S = " + dateS);
                        String mmonttant = this.MECCC.getText();
                        System.out.println("jijijijiji");
                        this.fnp = 0;
                        while (result3.next()) {
                            Statement state2;
                            Statement state22;
                            String p;
                            ResultSet result2;
                            String p2;
                            this.fnp = 1;
                            String TIREUR = "";
                            if (this.ji == 1) {
                                TIREUR = result3.getString("NOM");
                            } else if (this.ji == 2) {
                                TIREUR = result3.getString("NOMSOC");
                            }
                            try {
                                Statement state23 = conn22.createStatement();
                                state23.executeUpdate("UPDATE ffournis SET montant='" + this.MECCC.getText() + "' WHERE MATRIC=" + this.numdossier.getText());
                                state23.executeUpdate("UPDATE ffournis SET typbanque='" + this.ch + "' WHERE MATRIC=" + this.numdossier.getText());
                                int fin = 1;
                                state23.executeUpdate("UPDATE ffournis SET jik='" + this.ji + "' WHERE MATRIC=" + this.numdossier.getText());
                                state23.executeUpdate("UPDATE ffournis SET fin='" + fin + "' WHERE MATRIC=" + this.numdossier.getText());
                                state23.executeUpdate("UPDATE ffournis SET banque='" + this.banquee + "' WHERE MATRIC=" + this.numdossier.getText());
                            }
                            catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "ereure de modification fornisseure " + e.getMessage());
                            }
                            String typcarnet = "Fournisseurs";
                            String numcc = "";
                            String deb = "";
                            int typena = 0;
                            System.out.println("type de compte 2 =" + typcarnet);
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state22 = conn2.createStatement();
                                p = "0";
                                ResultSet result22 = state22.executeQuery("SELECT * FROM comptecourant  WHERE observation='" + typcarnet + "' AND f='" + p + "'");
                                typena = 1;
                                while (result22.next()) {
                                    this.numcarnet = result22.getString("num");
                                    System.out.println("N\u00b0 de carnet =" + this.numcarnet);
                                    this.numerocheq = result22.getString("debut");
                                    deb = result22.getString("datedebut");
                                    this.k = 1;
                                }
                            }
                            catch (Exception e) {
                                this.k = 0;
                                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                            }
                            if (deb.equals("")) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn6.createStatement();
                                    state2.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                                }
                            } else {
                                typena = 2;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection conn7 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn7.createStatement();
                                    p2 = "1";
                                    result2 = state2.executeQuery("SELECT * FROM talondescheque  WHERE type='" + typcarnet + "' AND p='" + p2 + "'");
                                    System.out.println("********************************** =");
                                    while (result2.next()) {
                                        this.numerocheq = result2.getString("numcheque");
                                        System.out.println("*********************** numero de cheque =" + this.numerocheq);
                                        this.numcarnet = result2.getString("Numcarnet");
                                        this.k = 1;
                                    }
                                }
                                catch (Exception e) {
                                    this.k = 0;
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
                                    JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 1 " + e.getMessage());
                                }
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection conn8 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn8.createStatement();
                                    p2 = "1";
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
                                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                }
                                try {
                                    this.Nfin = Integer.parseInt(this.numfin);
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 2  " + e.getMessage());
                                }
                                if (this.Nfin >= this.Nch) {
                                    if (this.Nfin == this.Nch) {
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state22 = conn22.createStatement();
                                            p = "1";
                                            state22.executeUpdate("UPDATE  comptecourant SET f='" + p + "' WHERE num='" + this.numcarnet + "'");
                                            state22.executeUpdate("UPDATE  comptecourant SET datefin='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                                            this.k = 1;
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                Statement state222 = conn2.createStatement();
                                                System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                                                ResultSet result22 = state222.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
                                                int kkk = 1;
                                                while (result22.next()) {
                                                    if (kkk == 1) {
                                                        String nauveaucarnet = result22.getString("num");
                                                        try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection conn21 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                                            Statement state21 = conn21.createStatement();
                                                            String o = "Fournisseurs";
                                                            state21.executeUpdate("UPDATE  comptecourant SET observation='" + o + "' WHERE num='" + nauveaucarnet + "'");
                                                        }
                                                        catch (Exception e) {
                                                            this.k = 0;
                                                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                                        }
                                                    }
                                                    ++kkk;
                                                }
                                            }
                                            catch (Exception e) {
                                                this.k = 0;
                                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                            }
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                        }
                                    }
                                    this.firstcheque = "" + this.Nch + "";
                                    int jii = 0;
                                    this.ji = this.firstcheque.indexOf(".");
                                    if (jii != -1) {
                                        System.out.println("ji =" + jii);
                                        this.firstcheque = this.firstcheque.substring(0, this.firstcheque.length() - 2);
                                        System.out.println("firstcheque =" + this.firstcheque);
                                    }
                                    if (this.k == 1) {
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state2 = conn22.createStatement();
                                            p2 = "0";
                                            state2.executeUpdate("UPDATE  talondescheque SET p='" + p2 + "' WHERE numcheque='" + this.numerocheq + "'");
                                            this.k = 1;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                        }
                                    }
                                    if (this.k == 1) {
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            p = "1";
                                            Statement state24 = conn22.createStatement();
                                            state24.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnet + "','" + this.numdossier.getText() + "','" + this.MECCC.getText() + "','" + datdd + "','" + typcarnet + "','" + p + "','" + this.ban + "')");
                                            this.k = 1;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque g : " + e.getMessage());
                                        }
                                    }
                                } else {
                                    this.k = 0;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn9 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        state2 = conn9.createStatement();
                                        p2 = "0";
                                        System.out.println("type type  =" + typcarnet);
                                        result2 = state2.executeQuery("SELECT * FROM comptecourant  WHERE f='" + p2 + "' AND observation ='" + typcarnet + "'");
                                        while (result2.next()) {
                                            this.numcarnetreserver = result2.getString("num");
                                            this.firstcheque = result2.getString("debut");
                                            System.out.println("numero de carnet cheque reserve 1 =" + this.numcarnetreserver);
                                            this.k = 1;
                                        }
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                    }
                                    if (this.numcarnetreserver.equals("")) {
                                        System.out.println("numero de carnet cheque reserve 2 =" + this.numcarnetreserver);
                                        this.k = 0;
                                        JOptionPane.showMessageDialog(null, "Aucune carnet de cheque: il faut ajouter un nouveaux carnet");
                                    } else {
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state22 = conn22.createStatement();
                                            p = "0";
                                            state22.executeUpdate("UPDATE  talondescheque SET p='" + p + "' WHERE numcheque='" + this.numerocheq + "'");
                                            this.k = 1;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                        }
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state22 = conn22.createStatement();
                                            System.out.println("banque " + this.ban);
                                            p = "1";
                                            state22.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnetreserver + "','" + this.numdossier.getText() + "','" + this.MECCC.getText() + "','" + datdd + "','" + typcarnet + "','" + p + "','" + this.ban + "'");
                                            this.k = 1;
                                            this.numcarnet = this.numcarnetreserver;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                        }
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            state22 = conn22.createStatement();
                                            p = "0";
                                            state22.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnetreserver + "'");
                                            this.k = 1;
                                        }
                                        catch (Exception e) {
                                            this.k = 0;
                                            JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                        }
                                    }
                                }
                            }
                            System.out.println("-----------------------------------------------------");
                            System.out.println("-----------------------------------------------------");
                            System.out.println("-----------------------------------------------------");
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state22 = conn22.createStatement();
                                String f = "1";
                                state22.executeUpdate("INSERT INTO etatchequef(mois,banque,montant,TIREUR,matric,numcheque,f) VALUES('" + dateS + "','" + this.banquee + "','" + mmonttant + "','" + TIREUR + "','" + this.numdossier.getText() + "','" + this.firstcheque + "','" + f + "')");
                            }
                            catch (Exception e) {
                                JOptionPane jop1 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Le fournisseur eu un cheque pour cette mois: en cas de modification cliquer sur modif cheque");
                            }
                            DefaultTableModel dt1 = new DefaultTableModel();
                            dt1.addColumn("Matricule");
                            dt1.addColumn("nom F");
                            dt1.addColumn("banque");
                            dt1.addColumn("Montant");
                            dt1.addColumn("N\u00b0 cheque");
                            this.jTable1.setModel(dt1);
                            try {
                                System.out.println("11111111111112222222222222222222221111111111111111");
                                Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state4 = conn4.createStatement();
                                ResultSet result4 = state4.executeQuery("SELECT * FROM etatchequef  WHERE f='1' ORDER BY matric");
                                while (result4.next()) {
                                    String NOM = result4.getString("TIREUR");
                                    String mm = result4.getString("matric");
                                    String bb = result4.getString("banque");
                                    String monntant = result4.getString("montant");
                                    String numc = result4.getString("numcheque");
                                    System.out.println("nom =" + NOM);
                                    System.out.println("---------------");
                                    Object[] stg = new Object[]{mm, NOM, bb, monntant, numc};
                                    dt1.addRow(stg);
                                }
                                System.out.println("111111111999999999999999999999999999999999111111111");
                            }
                            catch (Exception e) {
                                System.out.println("111111111!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!111111111");
                                JOptionPane.showMessageDialog(null, "*j==3*  " + e.getMessage());
                            }
                        }
                        if (this.fnp == 0) {
                            JOptionPane jop26 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Fournissure  n'existe pas ", "Attention", 0);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "erreur  *j=3* " + e.getMessage());
                    }
                }
            } else if (this.k == 5) {
                boolean g5;
                boolean bl = g5 = this.numdossier.getText().equals("") || this.MECCC.getText().equals("") || this.ncin.getText().equals("");
                if (g5) {
                    this.b = 0;
                    JOptionPane jop27 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
                } else if (this.MECCC.getText().length() <= 2) {
                    JOptionPane jop28 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Montant incorecte", "Attention", 0);
                } else {
                    String p;
                    Statement state2;
                    String p3;
                    ResultSet result2;
                    Statement state25;
                    String typcarnet = "Gestion de centre";
                    String numcc = "";
                    String deb = "";
                    int typena = 0;
                    System.out.println("type de compte 2 =" + typcarnet);
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state25 = conn2.createStatement();
                        p3 = "0";
                        ResultSet result23 = state25.executeQuery("SELECT * FROM comptecourant  WHERE observation='" + typcarnet + "' AND f='" + p3 + "'");
                        typena = 1;
                        while (result23.next()) {
                            this.numcarnet = result23.getString("num");
                            System.out.println("N\u00b0 de carnet =" + this.numcarnet);
                            this.numerocheq = result23.getString("debut");
                            deb = result23.getString("datedebut");
                            this.k = 1;
                        }
                    }
                    catch (Exception e) {
                        this.k = 0;
                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                    }
                    if (deb.equals("")) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn6.createStatement();
                            state2.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                        }
                        catch (Exception e) {
                            this.k = 0;
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                    } else {
                        typena = 2;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn7 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn7.createStatement();
                            p = "1";
                            result2 = state2.executeQuery("SELECT * FROM talondescheque  WHERE type='" + typcarnet + "' AND p='" + p + "'");
                            System.out.println("********************************** =");
                            while (result2.next()) {
                                this.numerocheq = result2.getString("numcheque");
                                System.out.println("*********************** numero de cheque  11111 =" + this.numerocheq);
                                this.numcarnet = result2.getString("Numcarnet");
                                System.out.println("*********************** numero de numcarnet 11111 =" + this.numcarnet);
                                this.k = 1;
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
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
                            JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 1 " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn8 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn8.createStatement();
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
                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                        }
                        try {
                            this.Nfin = Integer.parseInt(this.numfin);
                        }
                        catch (Exception e) {
                            this.k = 0;
                            JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 2  " + e.getMessage());
                        }
                        if (this.Nfin >= this.Nch) {
                            if (this.Nfin == this.Nch) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state25 = conn22.createStatement();
                                    p3 = "1";
                                    state25.executeUpdate("UPDATE  comptecourant SET f='" + p3 + "' WHERE num='" + this.numcarnet + "'");
                                    state25.executeUpdate("UPDATE  comptecourant SET datefin='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                                    this.k = 1;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state22 = conn2.createStatement();
                                        System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                                        ResultSet result22 = state22.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
                                        int kkk = 1;
                                        while (result22.next()) {
                                            if (kkk == 1) {
                                                String nauveaucarnet = result22.getString("num");
                                                try {
                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    Connection conn21 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                                    Statement state21 = conn21.createStatement();
                                                    String o = "Gestion de centre";
                                                    state21.executeUpdate("UPDATE  comptecourant SET observation='" + o + "' WHERE num='" + nauveaucarnet + "'");
                                                }
                                                catch (Exception e) {
                                                    this.k = 0;
                                                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                                }
                                            }
                                            ++kkk;
                                        }
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                    }
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                            this.firstcheque = "" + this.Nch + "";
                            int jii = 0;
                            this.ji = this.firstcheque.indexOf(".");
                            if (jii != -1) {
                                System.out.println("ji =" + jii);
                                this.firstcheque = this.firstcheque.substring(0, this.firstcheque.length() - 2);
                                System.out.println("firstcheque =" + this.firstcheque);
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
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                            if (this.k == 1) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    p3 = "1";
                                    Statement state26 = conn22.createStatement();
                                    state26.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnet + "','" + this.numdossier.getText() + "','" + this.MECCC.getText() + "','" + datdd + "','" + typcarnet + "','" + p3 + "','" + this.ban + "')");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque g : " + e.getMessage());
                                }
                            }
                        } else {
                            this.k = 0;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn9 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                state2 = conn9.createStatement();
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
                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                            }
                            if (this.numcarnetreserver.equals("")) {
                                System.out.println("numero de carnet cheque reserve 2 =" + this.numcarnetreserver);
                                this.k = 0;
                                JOptionPane.showMessageDialog(null, "Aucune carnet de cheque: il faut ajouter un nouveaux carnet");
                            } else {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state25 = conn22.createStatement();
                                    p3 = "0";
                                    state25.executeUpdate("UPDATE  talondescheque SET p='" + p3 + "' WHERE numcheque='" + this.numerocheq + "'");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state25 = conn22.createStatement();
                                    System.out.println("banque " + this.ban);
                                    p3 = "1";
                                    state25.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnetreserver + "','" + this.numdossier.getText() + "','" + this.MECCC.getText() + "','" + datdd + "','" + typcarnet + "','" + p3 + "','" + this.ban + "'");
                                    this.k = 1;
                                    this.numcarnet = this.numcarnetreserver;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                }
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state25 = conn22.createStatement();
                                    p3 = "0";
                                    state25.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnetreserver + "'");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                        }
                    }
                    if (this.k == 0) {
                        JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer le N\u00b0 cheque");
                    } else {
                        String adi;
                        this.lordre.setText(this.numdossier.getText());
                        String mmontant = this.MECCC.getText();
                        this.mont.setText(mmontant);
                        System.out.println("montant =" + mmontant);
                        int t = mmontant.length() - 3;
                        System.out.println("long " + t);
                        String di = mmontant.substring(0, mmontant.length() - 3);
                        String mil = mmontant.substring(t, mmontant.length());
                        this.mont.setText("#" + di + "," + mil + "#");
                        int nndi = Integer.parseInt(di);
                        int nnmi = Integer.parseInt(mil);
                        String montt = "";
                        String s = "";
                        if (mil.equals("000")) {
                            try {
                                adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                                montt = adi.toUpperCase();
                            }
                            catch (Exception ex) {
                                Logger.getLogger(cheque.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                                montt = adi.toUpperCase() + " ET " + nnmi + " MILLIMES";
                            }
                            catch (Exception ex) {
                                Logger.getLogger(cheque.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        this.montlet.setText(montt);
                        JOptionPane jop29 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Attention :  carnet de cheque N\u00b0:" + this.numcarnet + "  et N\u00b0 cheque :" + this.firstcheque + "", "Information", 1);
                        Impression1 ss = new Impression1(this.jPanel2);
                        ss.actionPerformed(evt);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            String p4 = "1";
                            Statement state27 = conn22.createStatement();
                            state27.executeUpdate("INSERT INTO historiquedegestiondecentre(nom,ncin,date,ncheque,paymentde) VALUES('" + this.numdossier.getText() + "','" + this.ncin.getText() + "','" + datdd + "','" + this.firstcheque + "','" + this.payment.getText() + "')");
                            this.k = 1;
                        }
                        catch (Exception e) {
                            this.k = 0;
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a table historique gestion : " + e.getMessage());
                        }
                    }
                }
            }
            this.payment.setText("");
            this.bq.setToolTipText("");
            this.ncin.setText("");
            this.numdossier.setText("");
            this.MECCC.setText("");
        }
    }

    private void imprimerchActionPerformed(ActionEvent evt) {
        block78 : {
            Date actuellEe = new Date();
            SimpleDateFormat dateFormatt = new SimpleDateFormat("dd-MM-yyyy");
            String datdd = dateFormatt.format(actuellEe);
            this.datesy.setText(datdd);
            int jiji = 0;
            if (this.jComboBox1.getSelectedItem().equals("Fournisseur")) {
                jiji = 1;
            } else if (this.jComboBox1.getSelectedItem().equals("Centre")) {
                jiji = 2;
            }
            if (jiji == 2) {
                try {
                    JOptionPane jop2;
                    this.lordre.setText("CENTRE SOCIAL MAHDIA");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    String bb = this.ch;
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE typbanque='" + bb + "'");
                    boolean jj = false;
                    while (result3.next()) {
                        String adi;
                        String ff = result3.getString("fin");
                        int fff = Integer.parseInt(ff);
                        String nd = result3.getString("MECANO");
                        this.mecc.setText(nd);
                        int n = Integer.parseInt(nd);
                        if (fff != 1) continue;
                        jj = true;
                        ++this.nbch;
                        this.montant = result3.getString("montant");
                        int fin = 0;
                        try {
                            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement stat = conn3.createStatement();
                            stat.executeUpdate("UPDATE adherent SET fin='" + fin + "' WHERE MECANO='" + n + "'");
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modife fin : " + e.getMessage());
                        }
                        int t = 0;
                        try {
                            t = this.montant.length() - 3;
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "!!!!!!!!!!!!!!!!!!!!!!!!!!!" + e.getMessage());
                        }
                        System.out.println("long " + t);
                        String di = this.montant.substring(0, this.montant.length() - 3);
                        String mil = this.montant.substring(t, this.montant.length());
                        this.mont.setText("#" + di + "," + mil + "#");
                        int nndi = Integer.parseInt(di);
                        int nnmi = Integer.parseInt(mil);
                        String montt = "";
                        String s = "";
                        if (mil.equals("000")) {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            montt = adi.toUpperCase();
                        } else {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            String adi2 = adi.toUpperCase();
                            montt = adi2 + " Et " + nnmi + " MILLIMES";
                        }
                        this.montlet.setText(montt);
                        Impression1 ss = new Impression1(this.jPanel2);
                        ss.actionPerformed(evt);
                        System.out.println("******************* montant **************** =" + this.montant);
                    }
                    this.bj = 1;
                    if (this.bj != 0) {
                        this.bj = 0;
                        try {
                            this.lordre.setText("CENTRE SOCIAL MAHDIA");
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state5 = conn5.createStatement();
                            ResultSet result5 = state5.executeQuery("SELECT * FROM effectue ");
                            while (result5.next()) {
                                this.nomeff = result5.getString("nom");
                                this.ncineffe = result5.getString("cin");
                                this.delivrele = result5.getString("delivre");
                                this.aa = result5.getString("a");
                            }
                        }
                        catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "erreur : " + ex.getMessage());
                        }
                        if (this.nomeff.equals("")) {
                            JOptionPane.showMessageDialog(null, "Effectuee Par : ??");
                            break block78;
                        }
                        jop2 = new JOptionPane();
                        int optionr = JOptionPane.showConfirmDialog(null, " Effectuee par " + this.nomeff + " )", "Attention", 0, 3);
                        if (optionr == 0) {
                            try {
                                Impression1 ss2;
                                String adi;
                                JOptionPane jop1;
                                this.lordre.setText("CENTRE SOCIAL MAHDIA");
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state4 = conn22.createStatement();
                                ResultSet result4 = state4.executeQuery("SELECT * FROM etatchequeretr WHERE nbch='" + this.nb2 + "'");
                                int test = 0;
                                int kk = 0;
                                int som = 0;
                                int bord = 0;
                                while (result4.next()) {
                                    String mil;
                                    String nbnb;
                                    String numcheque;
                                    String nbcc;
                                    String montch;
                                    String tir;
                                    Statement stat;
                                    String mm;
                                    int t;
                                    Connection conn3;
                                    int monTt;
                                    String di;
                                    int nnbcc;
                                    System.out.println("kk== " + kk);
                                    String banquee = result4.getString("banque");
                                    String bann = "BT";
                                    if (bann.equals("BT")) {
                                        bord = 1;
                                        System.out.println("uuuuuu");
                                        this.tirreure.setText(this.nomeff);
                                        this.hf = this.nomeff;
                                        this.pieccin.setText(this.ncineffe);
                                        this.du.setText(this.delivrele);
                                        this.a.setText(this.aa);
                                        System.out.printf("*********************************************", new Object[0]);
                                        if (kk >= 10) continue;
                                        nbcc = result4.getString("nbch");
                                        tir = result4.getString("TIREUR");
                                        System.out.println("/////  " + tir);
                                        nnbcc = Integer.parseInt(nbcc);
                                        System.out.println("TIREUR == " + tir);
                                        System.out.println("nbch == " + nnbcc);
                                        if (nnbcc != 1) continue;
                                        ++test;
                                        System.out.println("----------");
                                        numcheque = result4.getString("numcheque");
                                        montch = result4.getString("montant");
                                        t = 0;
                                        try {
                                            t = montch.length() - 3;
                                        }
                                        catch (Exception e) {
                                            JOptionPane.showMessageDialog(null, "erreur de modife fin nbch : " + e.getMessage());
                                        }
                                        di = montch.substring(0, montch.length() - 3);
                                        mil = montch.substring(t, montch.length());
                                        mm = di + "," + mil;
                                        monTt = Integer.parseInt(montch);
                                        som += monTt;
                                        try {
                                            nbnb = "0";
                                            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                            stat = conn3.createStatement();
                                            stat.executeUpdate("UPDATE etatchequeretr SET nbch='" + nbnb + "' WHERE numcheque='" + numcheque + "'");
                                        }
                                        catch (Exception e) {
                                            JOptionPane.showMessageDialog(null, "erreur de modife fin nbch : " + e.getMessage());
                                        }
                                        if (++kk == 1) {
                                            this.C1.setText(numcheque);
                                            this.M1.setText(mm);
                                            this.T1.setText(tir);
                                            this.BT1.setText(banquee);
                                            this.C2.setText("");
                                            this.M2.setText("");
                                            this.T2.setText("");
                                            this.BT2.setText("");
                                            this.C3.setText("");
                                            this.M3.setText("");
                                            this.T3.setText("");
                                            this.BT3.setText("");
                                            this.C4.setText("");
                                            this.M4.setText("");
                                            this.T4.setText("");
                                            this.BT4.setText("");
                                            this.C5.setText("");
                                            this.M5.setText("");
                                            this.T5.setText("");
                                            this.BT5.setText("");
                                            this.C6.setText("");
                                            this.M6.setText("");
                                            this.T6.setText("");
                                            this.BT6.setText("");
                                            this.C7.setText("");
                                            this.M7.setText("");
                                            this.T7.setText("");
                                            this.BT7.setText("");
                                            this.C8.setText("");
                                            this.M8.setText("");
                                            this.T8.setText("");
                                            this.BT8.setText("");
                                            this.C9.setText("");
                                            this.M9.setText("");
                                            this.T9.setText("");
                                            this.BT9.setText("");
                                            this.C10.setText("");
                                            this.M10.setText("");
                                            this.T10.setText("");
                                            this.BT10.setText("");
                                            continue;
                                        }
                                        if (kk == 2) {
                                            this.C2.setText(numcheque);
                                            this.M2.setText(mm);
                                            this.T2.setText(tir);
                                            this.BT2.setText(banquee);
                                            this.C3.setText("");
                                            this.M3.setText("");
                                            this.T3.setText("");
                                            this.BT3.setText("");
                                            this.C4.setText("");
                                            this.M4.setText("");
                                            this.T4.setText("");
                                            this.BT4.setText("");
                                            this.C5.setText("");
                                            this.M5.setText("");
                                            this.T5.setText("");
                                            this.BT5.setText("");
                                            this.C6.setText("");
                                            this.M6.setText("");
                                            this.T6.setText("");
                                            this.BT6.setText("");
                                            this.C7.setText("");
                                            this.M7.setText("");
                                            this.T7.setText("");
                                            this.BT7.setText("");
                                            this.C8.setText("");
                                            this.M8.setText("");
                                            this.T8.setText("");
                                            this.BT8.setText("");
                                            this.C9.setText("");
                                            this.M9.setText("");
                                            this.T9.setText("");
                                            this.BT9.setText("");
                                            this.C10.setText("");
                                            this.M10.setText("");
                                            this.T10.setText("");
                                            this.BT10.setText("");
                                            continue;
                                        }
                                        if (kk == 3) {
                                            this.C3.setText(numcheque);
                                            this.M3.setText(mm);
                                            this.T3.setText(tir);
                                            this.BT3.setText(banquee);
                                            this.C4.setText("");
                                            this.M4.setText("");
                                            this.T4.setText("");
                                            this.BT4.setText("");
                                            this.C5.setText("");
                                            this.M5.setText("");
                                            this.T5.setText("");
                                            this.BT5.setText("");
                                            this.C6.setText("");
                                            this.M6.setText("");
                                            this.T6.setText("");
                                            this.BT6.setText("");
                                            this.C7.setText("");
                                            this.M7.setText("");
                                            this.T7.setText("");
                                            this.BT7.setText("");
                                            this.C8.setText("");
                                            this.M8.setText("");
                                            this.T8.setText("");
                                            this.BT8.setText("");
                                            this.C9.setText("");
                                            this.M9.setText("");
                                            this.T9.setText("");
                                            this.BT9.setText("");
                                            this.C10.setText("");
                                            this.M10.setText("");
                                            this.T10.setText("");
                                            this.BT10.setText("");
                                            continue;
                                        }
                                        if (kk == 4) {
                                            this.C4.setText(numcheque);
                                            this.M4.setText(mm);
                                            this.T4.setText(tir);
                                            this.BT4.setText(banquee);
                                            this.C5.setText("");
                                            this.M5.setText("");
                                            this.T5.setText("");
                                            this.BT5.setText("");
                                            this.C6.setText("");
                                            this.M6.setText("");
                                            this.T6.setText("");
                                            this.BT6.setText("");
                                            this.C7.setText("");
                                            this.M7.setText("");
                                            this.T7.setText("");
                                            this.BT7.setText("");
                                            this.C8.setText("");
                                            this.M8.setText("");
                                            this.T8.setText("");
                                            this.BT8.setText("");
                                            this.C9.setText("");
                                            this.M9.setText("");
                                            this.T9.setText("");
                                            this.BT9.setText("");
                                            this.C10.setText("");
                                            this.M10.setText("");
                                            this.T10.setText("");
                                            this.BT10.setText("");
                                            continue;
                                        }
                                        if (kk == 5) {
                                            this.C5.setText(numcheque);
                                            this.M5.setText(mm);
                                            this.T5.setText(tir);
                                            this.BT5.setText(banquee);
                                            this.C6.setText("");
                                            this.M6.setText("");
                                            this.T6.setText("");
                                            this.BT6.setText("");
                                            this.C7.setText("");
                                            this.M7.setText("");
                                            this.T7.setText("");
                                            this.BT7.setText("");
                                            this.C8.setText("");
                                            this.M8.setText("");
                                            this.T8.setText("");
                                            this.BT8.setText("");
                                            this.C9.setText("");
                                            this.M9.setText("");
                                            this.T9.setText("");
                                            this.BT9.setText("");
                                            this.C10.setText("");
                                            this.M10.setText("");
                                            this.T10.setText("");
                                            this.BT10.setText("");
                                            continue;
                                        }
                                        if (kk == 6) {
                                            this.C6.setText(numcheque);
                                            this.M6.setText(mm);
                                            this.T6.setText(tir);
                                            this.BT6.setText(banquee);
                                            this.C7.setText("");
                                            this.M7.setText("");
                                            this.T7.setText("");
                                            this.BT7.setText("");
                                            this.C8.setText("");
                                            this.M8.setText("");
                                            this.T8.setText("");
                                            this.BT8.setText("");
                                            this.C9.setText("");
                                            this.M9.setText("");
                                            this.T9.setText("");
                                            this.BT9.setText("");
                                            this.C10.setText("");
                                            this.M10.setText("");
                                            this.T10.setText("");
                                            this.BT10.setText("");
                                            continue;
                                        }
                                        if (kk == 7) {
                                            this.C7.setText(numcheque);
                                            this.M7.setText(mm);
                                            this.T7.setText(tir);
                                            this.BT7.setText(banquee);
                                            this.C8.setText("");
                                            this.M8.setText("");
                                            this.T8.setText("");
                                            this.BT8.setText("");
                                            this.C9.setText("");
                                            this.M9.setText("");
                                            this.T9.setText("");
                                            this.BT9.setText("");
                                            this.C10.setText("");
                                            this.M10.setText("");
                                            this.T10.setText("");
                                            this.BT10.setText("");
                                            continue;
                                        }
                                        if (kk == 8) {
                                            this.C8.setText(numcheque);
                                            this.M8.setText(mm);
                                            this.T8.setText(tir);
                                            this.BT8.setText(banquee);
                                            this.C9.setText("");
                                            this.M9.setText("");
                                            this.T9.setText("");
                                            this.BT9.setText("");
                                            this.C10.setText("");
                                            this.M10.setText("");
                                            this.T10.setText("");
                                            this.BT10.setText("");
                                            continue;
                                        }
                                        if (kk == 9) {
                                            this.C9.setText(numcheque);
                                            this.M9.setText(mm);
                                            this.T9.setText(tir);
                                            this.BT9.setText(banquee);
                                            this.C10.setText("");
                                            this.M10.setText("");
                                            this.T10.setText("");
                                            this.BT10.setText("");
                                            continue;
                                        }
                                        if (kk != 10) continue;
                                        this.C10.setText(numcheque);
                                        this.M10.setText(mm);
                                        this.T10.setText(tir);
                                        this.BT10.setText(banquee);
                                        continue;
                                    }
                                    if (!bann.equals("UIB")) continue;
                                    bord = 2;
                                    this.tirreureu.setText(this.nomeff);
                                    this.cinu.setText(this.ncineffe);
                                    if (kk >= 8) continue;
                                    nbcc = result4.getString("nbch");
                                    tir = result4.getString("TIREUR");
                                    nnbcc = Integer.parseInt(nbcc);
                                    if (nnbcc != 1) continue;
                                    test = 2;
                                    numcheque = result4.getString("numcheque");
                                    montch = result4.getString("montant");
                                    System.out.println("mmmm =" + montch);
                                    t = montch.length() - 3;
                                    System.out.println("--UIB 2---- T =" + t);
                                    di = montch.substring(0, montch.length() - 3);
                                    mil = montch.substring(t, montch.length());
                                    System.out.println("--UIB 3----");
                                    mm = di + "," + mil;
                                    monTt = Integer.parseInt(montch);
                                    som += monTt;
                                    try {
                                        nbnb = "0";
                                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        stat = conn3.createStatement();
                                        stat.executeUpdate("UPDATE etatchequeretr SET nbch='" + nbnb + "' WHERE numcheque='" + numcheque + "'");
                                    }
                                    catch (Exception e) {
                                        JOptionPane.showMessageDialog(null, "erreur de modife fin nbch : " + e.getMessage());
                                    }
                                    if (++kk == 1) {
                                        this.CU1.setText(numcheque);
                                        this.MU1.setText(mm);
                                        this.TU1.setText(tir);
                                        this.UIB1.setText(banquee);
                                        this.CU2.setText("");
                                        this.MU2.setText("");
                                        this.TU2.setText("");
                                        this.UIB2.setText("");
                                        this.CU3.setText("");
                                        this.MU3.setText("");
                                        this.TU3.setText("");
                                        this.UIB3.setText("");
                                        this.CU4.setText("");
                                        this.MU4.setText("");
                                        this.TU4.setText("");
                                        this.UIB4.setText("");
                                        this.CU5.setText("");
                                        this.MU5.setText("");
                                        this.TU5.setText("");
                                        this.UIB5.setText("");
                                        this.CU6.setText("");
                                        this.MU6.setText("");
                                        this.TU6.setText("");
                                        this.UIB6.setText("");
                                        this.CU7.setText("");
                                        this.MU7.setText("");
                                        this.TU7.setText("");
                                        this.UIB7.setText("");
                                        this.CU8.setText("");
                                        this.MU8.setText("");
                                        this.TU8.setText("");
                                        this.UIB8.setText("");
                                    } else if (kk == 2) {
                                        this.CU2.setText(numcheque);
                                        this.MU2.setText(mm);
                                        this.TU2.setText(tir);
                                        this.UIB2.setText(banquee);
                                        this.CU3.setText("");
                                        this.MU3.setText("");
                                        this.TU3.setText("");
                                        this.UIB3.setText("");
                                        this.CU4.setText("");
                                        this.MU4.setText("");
                                        this.TU4.setText("");
                                        this.UIB4.setText("");
                                        this.CU5.setText("");
                                        this.MU5.setText("");
                                        this.TU5.setText("");
                                        this.UIB5.setText("");
                                        this.CU6.setText("");
                                        this.MU6.setText("");
                                        this.TU6.setText("");
                                        this.UIB6.setText("");
                                        this.CU7.setText("");
                                        this.MU7.setText("");
                                        this.TU7.setText("");
                                        this.UIB7.setText("");
                                        this.CU8.setText("");
                                        this.MU8.setText("");
                                        this.TU8.setText("");
                                        this.UIB8.setText("");
                                    } else if (kk == 3) {
                                        this.CU3.setText(numcheque);
                                        this.MU3.setText(mm);
                                        this.TU3.setText(tir);
                                        this.UIB3.setText(banquee);
                                        this.CU4.setText("");
                                        this.MU4.setText("");
                                        this.TU4.setText("");
                                        this.UIB4.setText("");
                                        this.CU5.setText("");
                                        this.MU5.setText("");
                                        this.TU5.setText("");
                                        this.UIB5.setText("");
                                        this.CU6.setText("");
                                        this.MU6.setText("");
                                        this.TU6.setText("");
                                        this.UIB6.setText("");
                                        this.CU7.setText("");
                                        this.MU7.setText("");
                                        this.TU7.setText("");
                                        this.UIB7.setText("");
                                        this.CU8.setText("");
                                        this.MU8.setText("");
                                        this.TU8.setText("");
                                        this.UIB8.setText("");
                                    } else if (kk == 4) {
                                        this.CU4.setText(numcheque);
                                        this.MU4.setText(mm);
                                        this.TU4.setText(tir);
                                        this.UIB4.setText(banquee);
                                        this.CU5.setText("");
                                        this.MU5.setText("");
                                        this.TU5.setText("");
                                        this.UIB5.setText("");
                                        this.CU6.setText("");
                                        this.MU6.setText("");
                                        this.TU6.setText("");
                                        this.UIB6.setText("");
                                        this.CU7.setText("");
                                        this.MU7.setText("");
                                        this.TU7.setText("");
                                        this.UIB7.setText("");
                                        this.CU8.setText("");
                                        this.MU8.setText("");
                                        this.TU8.setText("");
                                        this.UIB8.setText("");
                                    } else if (kk == 5) {
                                        this.CU5.setText(numcheque);
                                        this.MU5.setText(mm);
                                        this.TU5.setText(tir);
                                        this.UIB5.setText(banquee);
                                        this.CU6.setText("");
                                        this.MU6.setText("");
                                        this.TU6.setText("");
                                        this.UIB6.setText("");
                                        this.CU7.setText("");
                                        this.MU7.setText("");
                                        this.TU7.setText("");
                                        this.UIB7.setText("");
                                        this.CU8.setText("");
                                        this.MU8.setText("");
                                        this.TU8.setText("");
                                        this.UIB8.setText("");
                                    } else if (kk == 6) {
                                        this.CU6.setText(numcheque);
                                        this.MU6.setText(mm);
                                        this.TU6.setText(tir);
                                        this.UIB6.setText(banquee);
                                        this.CU7.setText("");
                                        this.MU7.setText("");
                                        this.TU7.setText("");
                                        this.UIB7.setText("");
                                        this.CU8.setText("");
                                        this.MU8.setText("");
                                        this.TU8.setText("");
                                        this.UIB8.setText("");
                                    } else if (kk == 7) {
                                        this.CU7.setText(numcheque);
                                        this.MU7.setText(mm);
                                        this.TU7.setText(tir);
                                        this.UIB7.setText(banquee);
                                        this.CU8.setText("");
                                        this.MU8.setText("");
                                        this.TU8.setText("");
                                        this.UIB8.setText("");
                                    } else if (kk == 8) {
                                        this.CU8.setText(numcheque);
                                        this.MU8.setText(mm);
                                        this.TU8.setText(tir);
                                        this.UIB8.setText(banquee);
                                    }
                                    this.nbdevir.setText("" + kk + "");
                                }
                                System.out.println("UIB 1 YYYY");
                                String st = "" + som + "";
                                System.out.println("montant =" + st);
                                int tt = st.length() - 3;
                                System.out.println("long " + tt);
                                String di = st.substring(0, st.length() - 3);
                                System.out.println("UIB 2 YYYY");
                                String mil = st.substring(tt, st.length());
                                if (bord == 1) {
                                    System.out.println("UIB 3 YYYY");
                                    this.TOTAL1.setText(di + "," + mil);
                                } else if (bord == 2) {
                                    this.TOTAL2U.setText(di + "," + mil);
                                    System.out.println("UIB 3 YYYY");
                                }
                                int nndi = Integer.parseInt(di);
                                int nnmi = Integer.parseInt(mil);
                                String montt = "";
                                String s = "";
                                if (mil.equals("000")) {
                                    try {
                                        adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                                        montt = adi.toUpperCase();
                                    }
                                    catch (Exception ex) {
                                        Logger.getLogger(chequeretretait.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                } else {
                                    try {
                                        adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                                        montt = adi.toUpperCase() + " ET " + nnmi + " MILLIMES";
                                    }
                                    catch (Exception ex) {
                                        Logger.getLogger(chequeretretait.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                if (bord == 1) {
                                    this.TOTAL.setText(montt);
                                    this.DATEOPERATION.setText(datdd);
                                    if (test != 0) {
                                        jop1 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "Impreesion de l'etat BT ", "Information", 1);
                                        ss2 = new Impression1(this.jPanel3);
                                        ss2.actionPerformed(evt);
                                        this.C1.setText("");
                                        this.M1.setText("");
                                        this.T1.setText("");
                                        this.C2.setText("");
                                        this.M2.setText("");
                                        this.T2.setText("");
                                        this.C3.setText("");
                                        this.M3.setText("");
                                        this.T3.setText("");
                                        this.C4.setText("");
                                        this.M4.setText("");
                                        this.T4.setText("");
                                        this.C5.setText("");
                                        this.M5.setText("");
                                        this.T5.setText("");
                                        this.C6.setText("");
                                        this.M6.setText("");
                                        this.T6.setText("");
                                        this.C7.setText("");
                                        this.M7.setText("");
                                        this.T7.setText("");
                                        this.C8.setText("");
                                        this.M8.setText("");
                                        this.T8.setText("");
                                        this.C9.setText("");
                                        this.M9.setText("");
                                        this.T9.setText("");
                                        this.C10.setText("");
                                        this.M10.setText("");
                                        this.T10.setText("");
                                    } else {
                                        jop1 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "Aucune etat a imprimer 111", "Attention", 1);
                                    }
                                    break block78;
                                }
                                if (bord != 2) break block78;
                                this.TOTALU.setText(montt);
                                this.DATEOPERATIONU.setText(datdd);
                                if (test != 0) {
                                    jop1 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Impression de l'etat UIB", "Information", 1);
                                    ss2 = new Impression1(this.jPanel4);
                                    ss2.actionPerformed(evt);
                                    this.CU1.setText("");
                                    this.MU1.setText("");
                                    this.TU1.setText("");
                                    this.UIB1.setText("");
                                    this.CU2.setText("");
                                    this.MU2.setText("");
                                    this.TU2.setText("");
                                    this.UIB2.setText("");
                                    this.CU3.setText("");
                                    this.MU3.setText("");
                                    this.TU3.setText("");
                                    this.UIB3.setText("");
                                    this.CU4.setText("");
                                    this.MU4.setText("");
                                    this.TU4.setText("");
                                    this.UIB4.setText("");
                                    this.CU5.setText("");
                                    this.MU5.setText("");
                                    this.TU5.setText("");
                                    this.UIB5.setText("");
                                    this.CU6.setText("");
                                    this.MU6.setText("");
                                    this.TU6.setText("");
                                    this.UIB6.setText("");
                                    this.CU7.setText("");
                                    this.MU7.setText("");
                                    this.TU7.setText("");
                                    this.UIB7.setText("");
                                    this.CU8.setText("");
                                    this.MU8.setText("");
                                    this.TU8.setText("");
                                    this.UIB8.setText("");
                                    break block78;
                                }
                                JOptionPane jop = new JOptionPane();
                                int option = JOptionPane.showConfirmDialog(null, "Aucune etat a imprimer", "Attention", 0, 3);
                            }
                            catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "erreur 1 NGN: " + e.getMessage());
                            }
                            break block78;
                        }
                        effectueepar a = new effectueepar();
                        a.show();
                        break block78;
                    }
                    jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Aucune \u00e9tat a imprimer 2", "Attention", 0);
                }
                catch (Exception e) {}
            } else if (jiji == 1) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    String bb = this.ch;
                    Statement state3 = conn3.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM etatchequef WHERE f='1' ORDER BY matric");
                    this.mecc.setText("");
                    while (result3.next()) {
                        String adi;
                        String NOM = result3.getString("TIREUR");
                        this.lordre.setText(NOM);
                        String numcheque = result3.getString("numcheque");
                        String nd = result3.getString("matric");
                        this.mecc.setText(nd);
                        this.montant = result3.getString("montant");
                        System.out.println("Tireure :" + NOM);
                        System.out.println("Tireure :" + nd);
                        System.out.println("numcheque :" + numcheque);
                        try {
                            Connection conn32 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement stat = conn32.createStatement();
                            stat.executeUpdate("UPDATE etatchequef SET f='0' WHERE numcheque='" + numcheque + "'");
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modife fin imp : " + e.getMessage());
                        }
                        int t = this.montant.length() - 3;
                        String di = this.montant.substring(0, this.montant.length() - 3);
                        String mil = this.montant.substring(t, this.montant.length());
                        this.mont.setText("#" + di + "," + mil + "#");
                        int nndi = Integer.parseInt(di);
                        int nnmi = Integer.parseInt(mil);
                        String montt = "";
                        String s = "";
                        if (mil.equals("000")) {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            montt = adi.toUpperCase();
                        } else {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            String adi2 = adi.toUpperCase();
                            montt = adi2 + " Et " + nnmi + " MILLIMES";
                        }
                        this.montlet.setText(montt);
                        Impression1 ss = new Impression1(this.jPanel2);
                        ss.actionPerformed(evt);
                        DefaultTableModel dt1 = new DefaultTableModel();
                        dt1.addColumn("Matricule");
                        dt1.addColumn("nom F");
                        dt1.addColumn("banque");
                        dt1.addColumn("Montant");
                        dt1.addColumn("N\u00b0 cheque");
                        this.jTable1.setModel(dt1);
                        try {
                            Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state4 = conn4.createStatement();
                            ResultSet result4 = state4.executeQuery("SELECT * FROM etatchequef  WHERE f='1' ORDER BY matric");
                            while (result4.next()) {
                                String NOMM = "";
                                String mm = result4.getString("matric");
                                String bA = result4.getString("banque");
                                String monntant = result4.getString("montant");
                                String numc = result4.getString("numcheque");
                                System.out.println("nom =" + NOM);
                                System.out.println("-------55555--------");
                                Object[] stg = new Object[]{mm, NOMM, bA, monntant, numc};
                                dt1.addRow(stg);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "*j==3*  " + e.getMessage());
                        }
                    }
                }
                catch (Exception e) {
                    // empty catch block
                }
            }
        }
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void numdossierActionPerformed(ActionEvent evt) {
    }

    private void okActionPerformed(ActionEvent evt) {
        if (this.jComboBox1.getSelectedItem().equals("Centre")) {
            this.nn.setText("Num dossier");
            this.lordre.setText("CENTRE SOCIAL MAHDIA");
            this.k = 1;
            this.bq.enable(true);
            this.bq1.enable(true);
            this.ncin.enable(true);
            this.numdossier.enable(true);
            this.MECCC.enable(true);
            this.imprimerch.setVisible(true);
            this.payment.enable(false);
            this.forni.enable(false);
        } else if (this.jComboBox1.getSelectedItem().equals("Adherent")) {
            this.nn.setText("MECANO");
            this.k = 2;
            this.bq.enable(false);
            this.bq1.enable(false);
            this.ncin.enable(false);
            this.numdossier.enable(true);
            this.MECCC.enable(true);
            this.imprimerch.setVisible(false);
            this.forni.enable(false);
            this.payment.enable(false);
        } else if (this.jComboBox1.getSelectedItem().equals("Fournisseur")) {
            this.nn.setText("Matricule :");
            this.recherche.enable(true);
            this.forni.enable(true);
            this.bq.enable(true);
            this.bq1.enable(false);
            this.ncin.enable(false);
            this.numdossier.enable(true);
            this.MECCC.enable(true);
            this.payment.enable(false);
            this.imprimerch.setVisible(false);
            this.k = 3;
        } else if (this.jComboBox1.getSelectedItem().equals("Gestion de centre")) {
            this.imprimerch.setVisible(false);
            this.ncin.enable(true);
            this.k = 4;
            this.nn.setText("Nom :");
            this.payment.enable(true);
            this.forni.enable(false);
            this.numdossier.enable(true);
            this.MECCC.enable(true);
            this.bq.enable(false);
            this.bq1.enable(false);
        } else if (this.jComboBox1.getSelectedItem().equals("Non adherent")) {
            this.payment.enable(false);
            this.imprimerch.setVisible(false);
            this.ncin.enable(false);
            this.k = 4;
            this.nn.setText("Nom et prenom");
            this.forni.enable(false);
            this.numdossier.enable(true);
            this.MECCC.enable(true);
            this.bq.enable(false);
            this.bq1.enable(false);
        } else {
            this.ch = "";
            this.b = 0;
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "A l'ordre de ???", "Attention", 0);
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        etatcheque a = new etatcheque();
        a.show();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        effectueepar a = new effectueepar();
        a.show();
    }

    private void bq1ActionPerformed(ActionEvent evt) {
    }

    private void bqActionPerformed(ActionEvent evt) {
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        modifiercheque a = new modifiercheque();
        a.show();
    }

    private void rechercheActionPerformed(ActionEvent evt) {
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("Matricule");
        dt1.addColumn("nom F");
        dt1.addColumn("banque");
        dt1.addColumn("Montant");
        dt1.addColumn("N\u00b0 cheque");
        this.jTable1.setModel(dt1);
        try {
            Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state4 = conn4.createStatement();
            ResultSet result4 = state4.executeQuery("SELECT * FROM etatchequef  WHERE f='1' ORDER BY matric");
            while (result4.next()) {
                String NOM = result4.getString("TIREUR");
                String mm = result4.getString("matric");
                String bb = result4.getString("banque");
                String monntant = result4.getString("montant");
                String numc = result4.getString("numcheque");
                System.out.println("nom =" + NOM);
                System.out.println("---------------");
                Object[] stg = new Object[]{mm, NOM, bb, monntant, numc};
                dt1.addRow(stg);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "*j==3*  " + e.getMessage());
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

