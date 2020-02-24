/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
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
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.Impression1;

public class recherchecarnedecheque
extends JPanel {
    int ok = 0;
    int test = 0;
    int existe = 0;
    int totale = 0;
    String numcarnetetat = "";
    String mecanoetat = "";
    String matricetat = "";
    private DefaultTableModel dt;
    private DefaultTableModel dt1;
    private int nump;
    private String nom;
    private String NOM;
    private String CINN;
    private String mecano;
    private String GSM;
    private String CSM;
    private String prenom;
    private String CNR;
    private Date dateR;
    private JTextField a1;
    private JTextField a2;
    private JLabel annedebut;
    private JLabel annefin;
    private JLabel banquee;
    private JPanel certificatat;
    private JLabel cin;
    private JLabel d;
    private JLabel datecheque;
    private JLabel datedebut;
    private JLabel datefin;
    private JButton imprimer;
    private JLabel j1;
    private JLabel j2;
    private JLabel j3;
    private JLabel j4;
    private JLabel j5;
    private JComboBox jComboBox3;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel17;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel21;
    private JLabel jLabel23;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel18;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator4;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JComboBox m1;
    private JComboBox m2;
    private JLabel mc;
    private JTextField me;
    private JLabel moisdebut;
    private JLabel moisfin;
    private JLabel monatant;
    private JLabel n1;
    private JLabel n2;
    private JLabel nc;
    private JLabel nn2;
    private JLabel nomad;
    private JLabel num;
    private JLabel numdebut;
    private JLabel numfin;
    private JLabel observ;
    private JLabel observation;
    private JButton ok1;
    private JButton recherchee;

    public recherchecarnedecheque() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel18 = new JPanel();
        this.jLabel15 = new JLabel();
        this.jSeparator4 = new JSeparator();
        this.j4 = new JLabel();
        this.observ = new JLabel();
        this.numdebut = new JLabel();
        this.num = new JLabel();
        this.datedebut = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.datefin = new JLabel();
        this.j5 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.nc = new JLabel();
        this.j3 = new JLabel();
        this.j1 = new JLabel();
        this.j2 = new JLabel();
        this.numfin = new JLabel();
        this.jComboBox3 = new JComboBox();
        this.jTextField1 = new JTextField();
        this.recherchee = new JButton();
        this.imprimer = new JButton();
        this.jPanel1 = new JPanel();
        this.certificatat = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.n1 = new JLabel();
        this.jLabel4 = new JLabel();
        this.nomad = new JLabel();
        this.jLabel6 = new JLabel();
        this.n2 = new JLabel();
        this.jLabel9 = new JLabel();
        this.mc = new JLabel();
        this.jLabel11 = new JLabel();
        this.datecheque = new JLabel();
        this.jLabel14 = new JLabel();
        this.cin = new JLabel();
        this.jLabel17 = new JLabel();
        this.monatant = new JLabel();
        this.jLabel19 = new JLabel();
        this.d = new JLabel();
        this.jLabel21 = new JLabel();
        this.observation = new JLabel();
        this.jLabel23 = new JLabel();
        this.nn2 = new JLabel();
        this.me = new JTextField();
        this.jLabel3 = new JLabel();
        this.banquee = new JLabel();
        this.ok1 = new JButton();
        this.moisdebut = new JLabel();
        this.jLabel7 = new JLabel();
        this.a1 = new JTextField();
        this.annedebut = new JLabel();
        this.m1 = new JComboBox();
        this.jLabel13 = new JLabel();
        this.moisfin = new JLabel();
        this.m2 = new JComboBox();
        this.annefin = new JLabel();
        this.a2 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jPanel18.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel18.setPreferredSize(new Dimension(684, 274));
        this.jPanel18.setLayout(null);
        this.jLabel15.setFont(new Font("Tahoma", 3, 14));
        this.jPanel18.add(this.jLabel15);
        this.jLabel15.setBounds(10, 240, 130, 0);
        this.jPanel18.add(this.jSeparator4);
        this.jSeparator4.setBounds(0, 190, 720, 0);
        this.j4.setBackground(new Color(153, 153, 255));
        this.j4.setFont(new Font("Tahoma", 1, 14));
        this.j4.setText("Date debut :");
        this.jPanel18.add(this.j4);
        this.j4.setBounds(10, 190, 120, 20);
        this.observ.setFont(new Font("Tahoma", 1, 14));
        this.observ.setForeground(new Color(0, 51, 204));
        this.observ.setText(".............................................");
        this.jPanel18.add(this.observ);
        this.observ.setBounds(140, 130, 270, 20);
        this.numdebut.setFont(new Font("Tahoma", 1, 14));
        this.numdebut.setForeground(new Color(0, 51, 204));
        this.numdebut.setText("............................");
        this.jPanel18.add(this.numdebut);
        this.numdebut.setBounds(140, 150, 270, 30);
        this.num.setFont(new Font("Tahoma", 1, 14));
        this.num.setForeground(new Color(0, 51, 204));
        this.num.setText("............................");
        this.jPanel18.add(this.num);
        this.num.setBounds(120, 90, 190, 30);
        this.datedebut.setFont(new Font("Tahoma", 1, 14));
        this.datedebut.setForeground(new Color(0, 51, 204));
        this.datedebut.setText("............................................................");
        this.jPanel18.add(this.datedebut);
        this.datedebut.setBounds(140, 190, 270, 20);
        this.jPanel18.add(this.jSeparator1);
        this.jSeparator1.setBounds(10, 120, 780, 10);
        this.datefin.setFont(new Font("Tahoma", 1, 14));
        this.datefin.setForeground(new Color(0, 51, 204));
        this.datefin.setText("............................");
        this.jPanel18.add(this.datefin);
        this.datefin.setBounds(530, 190, 160, 20);
        this.j5.setBackground(new Color(153, 153, 255));
        this.j5.setFont(new Font("Tahoma", 1, 14));
        this.j5.setText("Date fin :");
        this.jPanel18.add(this.j5);
        this.j5.setBounds(430, 190, 70, 20);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "liste des cheques", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchecarnedecheque.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"N\u00b0 cheque", "Date d'impression", "Nom Adherent", "Montant"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchecarnedecheque.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                recherchecarnedecheque.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                recherchecarnedecheque.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel18.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 270, 770, 290);
        this.nc.setBackground(new Color(153, 153, 255));
        this.nc.setFont(new Font("Tahoma", 1, 14));
        this.nc.setForeground(new Color(0, 0, 255));
        this.nc.setText("N\u00b0 Carnet :");
        this.jPanel18.add(this.nc);
        this.nc.setBounds(20, 90, 80, 30);
        this.j3.setBackground(new Color(153, 153, 255));
        this.j3.setFont(new Font("Tahoma", 1, 14));
        this.j3.setText("N\u00b0 Cheque Fin :");
        this.jPanel18.add(this.j3);
        this.j3.setBounds(430, 150, 150, 30);
        this.j1.setBackground(new Color(153, 153, 255));
        this.j1.setFont(new Font("Tahoma", 1, 14));
        this.j1.setText("Observation :");
        this.jPanel18.add(this.j1);
        this.j1.setBounds(10, 130, 110, 20);
        this.j2.setBackground(new Color(153, 153, 255));
        this.j2.setFont(new Font("Tahoma", 1, 14));
        this.j2.setText("N\u00b0 cheque Debut :");
        this.jPanel18.add(this.j2);
        this.j2.setBounds(10, 160, 130, 20);
        this.numfin.setFont(new Font("Tahoma", 1, 14));
        this.numfin.setForeground(new Color(0, 51, 204));
        this.numfin.setText(".............................................");
        this.jPanel18.add(this.numfin);
        this.numfin.setBounds(600, 150, 180, 30);
        this.jComboBox3.setBackground(new Color(0, 153, 153));
        this.jComboBox3.setFont(new Font("Tahoma", 1, 14));
        this.jComboBox3.setForeground(new Color(0, 153, 153));
        this.jComboBox3.setModel(new DefaultComboBoxModel<String>(new String[]{"N\u00b0carnet", "N\u00b0cheque", "Mecano", "Matricule fournisseur", "Les nauveaux carnets", "Pr\u00e9ts Personnels", "Pr\u00e9ts Ouvries", "Pr\u00e9ts FDD", "Pr\u00e9ts Retrait\u00e9", "Fournisseurs", "Primes Scolaires", "Gestion de centre", "Carnet adh\u00e9rent", "Les cheques annul\u00e9s", "Banque BNA", "Banque BH", "Banque UIB", "Banque BIAT", " "}));
        this.jComboBox3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchecarnedecheque.this.jComboBox3ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jComboBox3);
        this.jComboBox3.setBounds(160, 10, 200, 30);
        this.jTextField1.setEnabled(false);
        this.jTextField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchecarnedecheque.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.jTextField1);
        this.jTextField1.setBounds(100, 50, 190, 29);
        this.recherchee.setFont(new Font("Tahoma", 1, 12));
        this.recherchee.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.recherchee.setText("Recherche");
        this.recherchee.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchecarnedecheque.this.rechercheeMouseClicked(evt);
            }
        });
        this.recherchee.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchecarnedecheque.this.rechercheeActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.recherchee);
        this.recherchee.setBounds(440, 10, 130, 30);
        this.imprimer.setFont(new Font("Tahoma", 1, 10));
        this.imprimer.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.imprimer.setText("Certificat de validation");
        this.imprimer.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchecarnedecheque.this.imprimerActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.imprimer);
        this.imprimer.setBounds(580, 10, 200, 30);
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
        this.jPanel18.add(this.jPanel1);
        this.jPanel1.setBounds(520, 260, 100, 100);
        this.certificatat.setBackground(new Color(255, 255, 255));
        this.certificatat.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Certificat de Validation");
        this.certificatat.add(this.jLabel1);
        this.jLabel1.setBounds(150, 10, 316, 29);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Du cheque N\u00b0 :");
        this.certificatat.add(this.jLabel2);
        this.jLabel2.setBounds(160, 50, 104, 17);
        this.n1.setFont(new Font("Tahoma", 1, 14));
        this.n1.setText("....................................");
        this.certificatat.add(this.n1);
        this.n1.setBounds(270, 50, 156, 24);
        this.jLabel4.setFont(new Font("Tahoma", 0, 14));
        this.jLabel4.setText("a \u00e9t\u00e9 attribu\u00e9  a Mr (Me) :");
        this.certificatat.add(this.jLabel4);
        this.jLabel4.setBounds(0, 110, 160, 30);
        this.nomad.setFont(new Font("Tahoma", 1, 14));
        this.nomad.setText("..........................");
        this.certificatat.add(this.nomad);
        this.nomad.setBounds(160, 110, 410, 20);
        this.jLabel6.setFont(new Font("Tahoma", 0, 14));
        this.jLabel6.setText("Le Centre Social de Mahdia atteste que le cheque N\u00b0 ");
        this.certificatat.add(this.jLabel6);
        this.jLabel6.setBounds(30, 80, 321, 25);
        this.n2.setFont(new Font("Tahoma", 1, 14));
        this.n2.setText("..........................");
        this.certificatat.add(this.n2);
        this.n2.setBounds(360, 80, 110, 21);
        this.jLabel9.setFont(new Font("Tahoma", 0, 14));
        this.jLabel9.setText("Mecano :");
        this.certificatat.add(this.jLabel9);
        this.jLabel9.setBounds(390, 140, 70, 30);
        this.mc.setFont(new Font("Tahoma", 1, 14));
        this.mc.setText("............");
        this.certificatat.add(this.mc);
        this.mc.setBounds(460, 140, 110, 30);
        this.jLabel11.setFont(new Font("Tahoma", 0, 14));
        this.jLabel11.setText("Date de cheque :");
        this.certificatat.add(this.jLabel11);
        this.jLabel11.setBounds(0, 200, 110, 30);
        this.datecheque.setFont(new Font("Tahoma", 1, 14));
        this.datecheque.setText("..........................");
        this.certificatat.add(this.datecheque);
        this.datecheque.setBounds(110, 200, 200, 30);
        this.jLabel14.setFont(new Font("Tahoma", 0, 14));
        this.jLabel14.setText("N\u00b0 carte d'identit\u00e9 nationale : ");
        this.certificatat.add(this.jLabel14);
        this.jLabel14.setBounds(0, 140, 181, 30);
        this.cin.setFont(new Font("Tahoma", 1, 14));
        this.cin.setText("..........................");
        this.certificatat.add(this.cin);
        this.cin.setBounds(190, 140, 190, 30);
        this.jLabel17.setFont(new Font("Tahoma", 0, 14));
        this.jLabel17.setText("Montant du cheque :");
        this.certificatat.add(this.jLabel17);
        this.jLabel17.setBounds(0, 170, 140, 30);
        this.monatant.setFont(new Font("Tahoma", 1, 14));
        this.monatant.setText("..........................");
        this.certificatat.add(this.monatant);
        this.monatant.setBounds(140, 170, 460, 30);
        this.jLabel19.setFont(new Font("Tahoma", 1, 14));
        this.jLabel19.setText("Le ch\u00e9fe du centre :");
        this.certificatat.add(this.jLabel19);
        this.jLabel19.setBounds(260, 300, 140, 30);
        this.d.setFont(new Font("Tahoma", 1, 14));
        this.d.setText("..........................");
        this.certificatat.add(this.d);
        this.d.setBounds(350, 270, 150, 30);
        this.jLabel21.setFont(new Font("Tahoma", 0, 14));
        this.jLabel21.setText("Imput\u00e9 sur  :");
        this.certificatat.add(this.jLabel21);
        this.jLabel21.setBounds(0, 230, 90, 30);
        this.observation.setFont(new Font("Tahoma", 1, 14));
        this.observation.setText("..........................");
        this.certificatat.add(this.observation);
        this.observation.setBounds(100, 230, 300, 30);
        this.jLabel23.setFont(new Font("Tahoma", 1, 14));
        this.jLabel23.setText("Mahdia Le :");
        this.certificatat.add(this.jLabel23);
        this.jLabel23.setBounds(260, 270, 90, 30);
        this.jPanel18.add(this.certificatat);
        this.certificatat.setBounds(20, 530, 620, 10);
        this.nn2.setFont(new Font("Tahoma", 1, 14));
        this.nn2.setText("Reference :");
        this.jPanel18.add(this.nn2);
        this.nn2.setBounds(10, 220, 80, 30);
        this.me.setEnabled(false);
        this.jPanel18.add(this.me);
        this.me.setBounds(100, 220, 150, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("Banque :");
        this.jPanel18.add(this.jLabel3);
        this.jLabel3.setBounds(430, 130, 70, 20);
        this.banquee.setFont(new Font("Tahoma", 1, 14));
        this.banquee.setForeground(new Color(0, 0, 153));
        this.banquee.setText(".......................................");
        this.jPanel18.add(this.banquee);
        this.banquee.setBounds(500, 120, 110, 30);
        this.ok1.setFont(new Font("Tahoma", 1, 14));
        this.ok1.setForeground(new Color(51, 51, 255));
        this.ok1.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.ok1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchecarnedecheque.this.ok1ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.ok1);
        this.ok1.setBounds(370, 10, 50, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setText("Mois :");
        this.jPanel18.add(this.moisdebut);
        this.moisdebut.setBounds(300, 50, 90, 30);
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setForeground(new Color(153, 0, 0));
        this.jLabel7.setText("N\u00b0 cheque :");
        this.jPanel18.add(this.jLabel7);
        this.jLabel7.setBounds(10, 50, 90, 30);
        this.a1.setEnabled(false);
        this.jPanel18.add(this.a1);
        this.a1.setBounds(620, 50, 150, 30);
        this.annedebut.setFont(new Font("Tahoma", 1, 14));
        this.annedebut.setForeground(new Color(153, 0, 0));
        this.annedebut.setText("Ann\u00e9 :");
        this.jPanel18.add(this.annedebut);
        this.annedebut.setBounds(490, 50, 120, 30);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.setEnabled(false);
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchecarnedecheque.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel18.add(this.m1);
        this.m1.setBounds(400, 50, 50, 30);
        this.jLabel13.setFont(new Font("Tahoma", 1, 18));
        this.jLabel13.setText("Recherche par :");
        this.jPanel18.add(this.jLabel13);
        this.jLabel13.setBounds(10, 10, 150, 30);
        this.moisfin.setFont(new Font("Tahoma", 1, 14));
        this.moisfin.setForeground(new Color(153, 0, 0));
        this.moisfin.setText("Mois :");
        this.jPanel18.add(this.moisfin);
        this.moisfin.setBounds(300, 90, 90, 30);
        this.m2.setFont(new Font("Tahoma", 1, 12));
        this.m2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", ""}));
        this.m2.setEnabled(false);
        this.jPanel18.add(this.m2);
        this.m2.setBounds(400, 90, 50, 30);
        this.annefin.setFont(new Font("Tahoma", 1, 14));
        this.annefin.setForeground(new Color(153, 0, 0));
        this.annefin.setText("Ann\u00e9 :");
        this.jPanel18.add(this.annefin);
        this.annefin.setBounds(490, 90, 120, 30);
        this.a2.setEnabled(false);
        this.jPanel18.add(this.a2);
        this.a2.setBounds(620, 90, 150, 30);
        this.jTextField2.setBackground(new Color(240, 240, 240));
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel18.add(this.jTextField2);
        this.jTextField2.setBounds(460, 40, 10, 80);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel18, -1, 795, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel18, -1, 587, 32767));
    }

    private void rechercheeMouseClicked(MouseEvent evt) {
    }

    private void rechercheeActionPerformed(ActionEvent evt) {
        String mmm1 = "";
        String mmm2 = "";
        String aaa1 = "";
        String aaa2 = "";
        mmm1 = this.m1.getSelectedItem().toString();
        mmm2 = this.m2.getSelectedItem().toString();
        aaa1 = this.a1.getText();
        aaa2 = this.a2.getText();
        System.out.println("mmmmmmm1 =" + mmm1);
        System.out.println("mmmmmmm1 =" + mmm2);
        System.out.println("A1 =" + aaa1);
        System.out.println("A2 =" + aaa2);
        this.test = 1;
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
        if (this.ok == 1) {
            JOptionPane jop2;
            DefaultTableModel dt1;
            String num;
            int adebutt;
            String debut;
            String ch = "";
            if (this.jComboBox3.getSelectedItem().equals("N\u00b0carnet")) {
                ch = "1";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat de carnet");
                this.numcarnetetat = this.jTextField1.getText();
            } else if (this.jComboBox3.getSelectedItem().equals("Carnet adh\u00e9rent")) {
                ch = "18";
                this.imprimer.setVisible(true);
            } else if (this.jComboBox3.getSelectedItem().equals("N\u00b0cheque")) {
                ch = "2";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Certificat de validation");
            } else if (this.jComboBox3.getSelectedItem().equals("Mecano")) {
                ch = "3";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat de l'adherent");
                this.mecanoetat = this.jTextField1.getText();
            } else if (this.jComboBox3.getSelectedItem().equals("Les nauveaux carnets")) {
                ch = "4";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Imprimer l'etat ");
            } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts Personnels")) {
                ch = "5";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat des Pr\u00e9ts Personnels ");
            } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts Ouvries")) {
                ch = "6";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat des Pr\u00e9ts Ouvries ");
            } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts FDD")) {
                ch = "7";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat des Pr\u00e9ts FDD ");
            } else if (this.jComboBox3.getSelectedItem().equals("Fournisseurs")) {
                ch = "8";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat des Fournisseurs ");
            } else if (this.jComboBox3.getSelectedItem().equals("Matricule fournisseur")) {
                ch = "9";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat Fournisseurs");
            } else if (this.jComboBox3.getSelectedItem().equals("Primes Scolaires")) {
                ch = "10";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat Primes Scolaires");
            } else if (this.jComboBox3.getSelectedItem().equals("Les cheques annul\u00e9s")) {
                ch = "11";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat des cheques annul\u00e9s");
            } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts Retrait\u00e9")) {
                ch = "12";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat Pr\u00e9ts Retrait\u00e9");
            } else if (this.jComboBox3.getSelectedItem().equals("Banque BNA")) {
                ch = "13";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat Banque BNA");
            } else if (this.jComboBox3.getSelectedItem().equals("Banque BH")) {
                ch = "14";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat Banque BH");
            } else if (this.jComboBox3.getSelectedItem().equals("Banque UIB")) {
                ch = "15";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat Banque UIB");
            } else if (this.jComboBox3.getSelectedItem().equals("Banque BIAT")) {
                ch = "16";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat Banque BIAT");
            } else if (this.jComboBox3.getSelectedItem().equals("Gestion de centre")) {
                ch = "17";
                this.imprimer.setVisible(true);
                this.imprimer.setText("Etat de G-CENTRE");
            } else {
                this.test = 0;
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Choisire recherche par ??  cliquez sur ok et remplire tous les champs puis cliquez sur le button recherche", "Attention", 0);
            }
            System.out.println("ch = " + ch);
            if (ch.equals("2")) {
                if (this.jTextField1.getText().equals("")) {
                    jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Saisir le N\u00b0cheque", "Attention", 0);
                } else {
                    this.existe = 0;
                    this.dt1 = new DefaultTableModel();
                    this.jTable1.setModel(this.dt1);
                    String type = "";
                    String reference = "";
                    String d = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE numcheque=" + this.jTextField1.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            ResultSet result2;
                            Statement state2;
                            ResultSet result22;
                            Statement state22;
                            ResultSetMetaData resultMeta2;
                            JOptionPane jop3;
                            JOptionPane jop32;
                            ResultSetMetaData resultMeta22;
                            this.existe = 1;
                            type = result3.getString("type");
                            this.num.setText(result3.getString("Numcarnet"));
                            this.observ.setText(result3.getString("type"));
                            d = result3.getString("date");
                            this.numdebut.setText(result3.getString("date"));
                            this.numfin.setText(result3.getString("Montant"));
                            String nomadh = result3.getString("Mecano");
                            this.banquee.setText(result3.getString("banque"));
                            reference = nomadh + "/";
                            this.datefin.setText(nomadh);
                            if (type.equals("Fournisseurs")) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state22 = conn2.createStatement();
                                    result22 = state22.executeQuery("SELECT * FROM ffournis WHERE MATRIC=" + nomadh);
                                    resultMeta22 = result22.getMetaData();
                                    while (result22.next()) {
                                        this.datedebut.setText(result22.getString("NOM"));
                                        reference = reference + "F   " + d;
                                    }
                                    continue;
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "carnet n'existe pas 1 !!" + e.getMessage());
                                    continue;
                                }
                            }
                            if (type.equals("Primes Scolaires")) {
                                boolean ii = false;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state2 = conn2.createStatement();
                                    result2 = state2.executeQuery("SELECT * FROM adherent WHERE MECANO=" + nomadh);
                                    resultMeta2 = result2.getMetaData();
                                    while (result2.next()) {
                                        ii = true;
                                        this.datedebut.setText(result2.getString("NOM"));
                                        reference = reference + "A   213";
                                    }
                                }
                                catch (Exception e) {
                                    jop32 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "carnet n'existe pas 2!!" + e.getMessage());
                                }
                                if (ii) continue;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state2 = conn2.createStatement();
                                    result2 = state2.executeQuery("SELECT * FROM retretait WHERE mecano=" + nomadh);
                                    resultMeta2 = result2.getMetaData();
                                    while (result2.next()) {
                                        ii = true;
                                        this.datedebut.setText(result2.getString("nom"));
                                        reference = reference + "R   413";
                                    }
                                    continue;
                                }
                                catch (Exception e) {
                                    jop32 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "carnet n'existe pas 3!!" + e.getMessage());
                                    continue;
                                }
                            }
                            if (type.equals("Pr\u00e9ts FDD")) {
                                reference = reference + "A   230";
                                continue;
                            }
                            if (type.equals("Pr\u00e9ts Retrait\u00e9s")) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state22 = conn2.createStatement();
                                    result22 = state22.executeQuery("SELECT * FROM retretait WHERE mecano=" + nomadh);
                                    resultMeta22 = result22.getMetaData();
                                    while (result22.next()) {
                                        this.datedebut.setText(result22.getString("nom"));
                                        reference = reference + "R   407";
                                    }
                                    continue;
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "carnet n'existe pas 6!!" + e.getMessage());
                                    continue;
                                }
                            }
                            if (type.equals("Gestion Centre")) {
                                boolean ii = false;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state2 = conn2.createStatement();
                                    result2 = state2.executeQuery("SELECT * FROM adherent WHERE MECANO=" + nomadh);
                                    resultMeta2 = result2.getMetaData();
                                    while (result2.next()) {
                                        ii = true;
                                        this.datedebut.setText(result2.getString("NOM"));
                                        reference = reference + "A   224";
                                    }
                                }
                                catch (Exception e) {
                                    jop32 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "carnet n'existe pas7 !!" + e.getMessage());
                                }
                                if (ii) continue;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state2 = conn2.createStatement();
                                    result2 = state2.executeQuery("SELECT * FROM retretait WHERE mecano=" + nomadh);
                                    resultMeta2 = result2.getMetaData();
                                    while (result2.next()) {
                                        ii = true;
                                        this.datedebut.setText(result2.getString("nom"));
                                        reference = reference + "R   224";
                                    }
                                    continue;
                                }
                                catch (Exception e) {
                                    jop32 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "carnet n'existe pas 8!!" + e.getMessage());
                                    continue;
                                }
                            }
                            boolean ii = false;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state2 = conn2.createStatement();
                                result2 = state2.executeQuery("SELECT * FROM adherent WHERE MECANO=" + nomadh);
                                resultMeta2 = result2.getMetaData();
                                while (result2.next()) {
                                    ii = true;
                                    this.datedebut.setText(result2.getString("NOM"));
                                    reference = reference + "A   300";
                                }
                            }
                            catch (Exception e) {
                                jop32 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "carnet n'existe pas 9!!" + e.getMessage());
                            }
                            if (ii) continue;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state2 = conn2.createStatement();
                                result2 = state2.executeQuery("SELECT * FROM retretait WHERE mecano=" + nomadh);
                                resultMeta2 = result2.getMetaData();
                                while (result2.next()) {
                                    ii = true;
                                    this.datedebut.setText(result2.getString("nom"));
                                    reference = reference + "R   300";
                                }
                            }
                            catch (Exception e) {
                                jop32 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "carnet n'existe pas 10!!" + e.getMessage());
                            }
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "N\u00b0cheque n'existe pas !!" + e.getMessage());
                    }
                    this.me.setText(reference);
                    if (this.existe == 0) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "N\u00b0cheque n'existe pas !!");
                    }
                }
            } else if (ch.equals("1")) {
                if (this.jTextField1.getText().equals("")) {
                    jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Saisir le N\u00b0carnet de cheque", "Attention", 0);
                } else {
                    JOptionPane jop3;
                    String ncing = "";
                    String paymentg = "";
                    String nomadh = "";
                    String sr = "";
                    String nomsc = "";
                    boolean pp = false;
                    String observv = "";
                    this.num.setText(this.jTextField1.getText());
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state2 = conn22.createStatement();
                        ResultSet result2 = state2.executeQuery("SELECT * FROM comptecourant WHERE num=" + this.jTextField1.getText());
                        ResultSetMetaData resultMeta2 = result2.getMetaData();
                        while (result2.next()) {
                            pp = true;
                            this.observ.setText(result2.getString("observation"));
                            observv = result2.getString("observation");
                            this.numdebut.setText(result2.getString("debut"));
                            this.numfin.setText(result2.getString("fin"));
                            this.datedebut.setText(result2.getString("datedebut"));
                            this.datefin.setText(result2.getString("datefin"));
                            this.banquee.setText(result2.getString("banque"));
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "ereure !!" + e.getMessage());
                        pp = false;
                    }
                    if (!pp) {
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!");
                    } else {
                        if (observv.equals("Fournisseurs")) {
                            this.dt1 = new DefaultTableModel();
                            this.dt1.addColumn("N\u00b0Cheque");
                            this.dt1.addColumn("Matricule");
                            this.dt1.addColumn("Nom fournisseur ");
                            this.dt1.addColumn("socite");
                            this.dt1.addColumn("Montant ");
                            this.dt1.addColumn("date d'impression ");
                            this.jTable1.setModel(this.dt1);
                        } else if (observv.equals("Gestion de centre")) {
                            this.dt1 = new DefaultTableModel();
                            this.dt1.addColumn("N\u00b0Cheque");
                            this.dt1.addColumn("N\u00b0 cin");
                            this.dt1.addColumn("Nom et prenom");
                            this.dt1.addColumn("date");
                            this.dt1.addColumn("Montant ");
                            this.dt1.addColumn("payment de ");
                            this.jTable1.setModel(this.dt1);
                        } else {
                            this.dt1 = new DefaultTableModel();
                            this.dt1.addColumn("N\u00b0Cheque");
                            this.dt1.addColumn("N\u00b0 adherent");
                            this.dt1.addColumn("Nom ");
                            this.dt1.addColumn("Montant ");
                            this.dt1.addColumn("date d'impression ");
                            this.dt1.addColumn("Sant\u00e9/Retrait\u00e9");
                            this.jTable1.setModel(this.dt1);
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state3 = conn2.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Numcarnet=" + this.jTextField1.getText());
                            String numch = "";
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                Object[] stg;
                                JOptionPane jop33;
                                Statement state2;
                                ResultSet result2;
                                ResultSetMetaData resultMeta2;
                                pp = false;
                                numch = result3.getString("Numcheque");
                                String mecano = result3.getString("Mecano");
                                String montant = result3.getString("montant");
                                String date = result3.getString("date");
                                this.banquee.setText(result3.getString("banque"));
                                montant = montant + " DT";
                                if (observv.equals("Fournisseurs")) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state2 = conn2.createStatement();
                                        result2 = state2.executeQuery("SELECT * FROM ffournis WHERE MATRIC=" + mecano);
                                        resultMeta2 = result2.getMetaData();
                                        while (result2.next()) {
                                            nomadh = result2.getString("NOM");
                                            nomsc = result2.getString("NOMSOC");
                                            sr = "Sant\u00e9";
                                            pp = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop33 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                                    }
                                    stg = new Object[]{numch, mecano, nomadh, nomsc, montant, date};
                                    this.dt1.addRow(stg);
                                    continue;
                                }
                                if (observv.equals("Gestion de centre")) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state2 = conn2.createStatement();
                                        result2 = state2.executeQuery("SELECT * FROM historiquedegestiondecentre WHERE ncheque=" + numch);
                                        resultMeta2 = result2.getMetaData();
                                        while (result2.next()) {
                                            ncing = result2.getString("ncin");
                                            paymentg = result2.getString("paymentde");
                                            sr = "Sant\u00e9";
                                            pp = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop33 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                                    }
                                    stg = new Object[]{numch, ncing, mecano, date, montant, paymentg};
                                    this.dt1.addRow(stg);
                                    continue;
                                }
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state2 = conn2.createStatement();
                                    result2 = state2.executeQuery("SELECT * FROM adherent WHERE MECANO=" + mecano);
                                    resultMeta2 = result2.getMetaData();
                                    while (result2.next()) {
                                        nomadh = result2.getString("NOM");
                                        sr = "Sant\u00e9";
                                        pp = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop33 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                                }
                                if (!pp) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state2 = conn22.createStatement();
                                        result2 = state2.executeQuery("SELECT * FROM retretait WHERE mecano=" + mecano);
                                        resultMeta2 = result2.getMetaData();
                                        while (result2.next()) {
                                            nomadh = result2.getString("NOM");
                                            sr = "Retrait\u00e9";
                                            pp = false;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop33 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                                    }
                                }
                                stg = new Object[]{numch, mecano, nomadh, montant, date, sr};
                                this.dt1.addRow(stg);
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                        }
                    }
                }
            } else if (ch.equals("3")) {
                this.dt1 = new DefaultTableModel();
                this.dt1.addColumn("Date d'impression");
                this.dt1.addColumn("N\u00b0 Carnet");
                this.dt1.addColumn("N\u00b0 Cheque");
                this.dt1.addColumn("Observation");
                this.dt1.addColumn("Banque");
                this.dt1.addColumn("Montant");
                this.jTable1.setModel(this.dt1);
                String nomadh = "";
                String sr = "";
                boolean pp = false;
                if (this.jTextField1.getText().equals("")) {
                    JOptionPane jop22 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Saisir Mecano de l'adh\u00e9rent", "Attention", 0);
                } else {
                    this.existe = 0;
                    if (mmm1.equals("00") && mmm2.equals("00") && aaa1.equals("") && aaa2.equals("")) {
                        Statement state2;
                        ResultSet result2;
                        JOptionPane jop3;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state2 = conn22.createStatement();
                            result2 = state2.executeQuery("SELECT * FROM adherent WHERE MECANO=" + this.jTextField1.getText());
                            pp = false;
                            while (result2.next()) {
                                this.existe = 1;
                                nomadh = result2.getString("NOM");
                                sr = "Sant\u00e9";
                                this.num.setText(nomadh);
                                pp = true;
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas dans la mutuelle de la Sant\u00e9" + e.getMessage());
                            pp = false;
                        }
                        if (!pp) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state2 = conn22.createStatement();
                                result2 = state2.executeQuery("SELECT * FROM retretait WHERE mecano=" + this.jTextField1.getText());
                                while (result2.next()) {
                                    this.existe = 1;
                                    nomadh = result2.getString("nom");
                                    System.out.println("nom =" + this.nom);
                                    sr = "retraite";
                                    this.num.setText(nomadh);
                                    pp = true;
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas " + e.getMessage());
                                pp = false;
                            }
                            if (!pp) {
                                JOptionPane jop34 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas dans la mutuelle de la Sant\u00e9");
                            }
                        }
                        if (pp) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement state3 = conn2.createStatement();
                                ResultSet result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Mecano=" + this.jTextField1.getText() + " ORDER BY Numcarnet");
                                ResultSetMetaData resultMeta3 = result3.getMetaData();
                                while (result3.next()) {
                                    pp = false;
                                    String obse = result3.getString("type");
                                    if (obse.equals("Fournisseurs")) continue;
                                    String numca = result3.getString("Numcarnet");
                                    String numch = result3.getString("Numcheque");
                                    String date = result3.getString("date");
                                    this.banquee.setText("");
                                    String montant = result3.getString("montant");
                                    this.totale += Integer.parseInt(montant);
                                    String b = result3.getString("banque");
                                    montant = montant + " DT";
                                    Object[] stg = new Object[]{date, numca, numch, obse, b, montant};
                                    this.dt1.addRow(stg);
                                }
                                this.numfin.setText("" + this.totale + " DT");
                                Object[] stg = new Object[]{"*******", "*******", "*******", "*******", "*******", "*******"};
                                this.dt1.addRow(stg);
                                Object[] stg2 = new Object[]{"", "", "", "", "Total =", "" + this.totale + " DT"};
                                this.dt1.addRow(stg2);
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                            }
                        }
                        this.existe = 1;
                    } else if (mmm2.equals("00") && aaa1.equals("") && aaa2.equals("")) {
                        Statement state2;
                        ResultSet result2;
                        JOptionPane jop3;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state2 = conn22.createStatement();
                            result2 = state2.executeQuery("SELECT * FROM adherent WHERE MECANO=" + this.jTextField1.getText());
                            while (result2.next()) {
                                this.existe = 1;
                                nomadh = result2.getString("NOM");
                                sr = "Sant\u00e9";
                                this.num.setText(nomadh);
                                pp = true;
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas dans la mutuelle de la Sant\u00e9" + e.getMessage());
                            pp = false;
                        }
                        if (!pp) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state2 = conn22.createStatement();
                                result2 = state2.executeQuery("SELECT * FROM retretait WHERE mecano=" + this.jTextField1.getText());
                                while (result2.next()) {
                                    this.existe = 1;
                                    nomadh = result2.getString("nom");
                                    sr = "retraite";
                                    this.num.setText(nomadh);
                                    pp = true;
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas " + e.getMessage());
                                pp = false;
                            }
                            if (!pp) {
                                JOptionPane jop35 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas !!!!!!!!!!!!!!!");
                            }
                        }
                        if (pp) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement state3 = conn2.createStatement();
                                ResultSet result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Mecano=" + this.jTextField1.getText() + " ORDER BY Numcarnet");
                                ResultSetMetaData resultMeta3 = result3.getMetaData();
                                while (result3.next()) {
                                    pp = false;
                                    String date = result3.getString("date");
                                    String mois2 = date.substring(3, date.length() - 5);
                                    if (!mois2.equals(mmm1)) continue;
                                    pp = false;
                                    String obse = result3.getString("type");
                                    if (obse.equals("Fournisseurs")) continue;
                                    String numca = result3.getString("Numcarnet");
                                    String numch = result3.getString("Numcheque");
                                    this.banquee.setText("");
                                    String montant = result3.getString("montant");
                                    System.out.println("Montant =" + montant);
                                    this.totale += Integer.parseInt(montant);
                                    String b = result3.getString("banque");
                                    montant = montant + " DT";
                                    Object[] stg = new Object[]{date, numca, numch, obse, b, montant};
                                    this.dt1.addRow(stg);
                                }
                                this.numfin.setText("" + this.totale + " DT");
                                Object[] stg = new Object[]{"*******", "*******", "*******", "*******", "*******", "*******"};
                                this.dt1.addRow(stg);
                                Object[] stg2 = new Object[]{"", "", "", "", "Total =", "" + this.totale + " DT"};
                                this.dt1.addRow(stg2);
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                            }
                        }
                        this.existe = 1;
                    } else if (mmm2.equals("00") && aaa2.equals("")) {
                        ResultSet result2;
                        Statement state2;
                        JOptionPane jop3;
                        System.out.println("jghffvnhj");
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state2 = conn22.createStatement();
                            result2 = state2.executeQuery("SELECT * FROM adherent WHERE MECANO=" + this.jTextField1.getText());
                            while (result2.next()) {
                                this.existe = 1;
                                nomadh = result2.getString("NOM");
                                sr = "Sant\u00e9";
                                this.num.setText(nomadh);
                                pp = true;
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas dans la mutuelle de la Sant\u00e9" + e.getMessage());
                            pp = false;
                        }
                        if (!pp) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state2 = conn22.createStatement();
                                result2 = state2.executeQuery("SELECT * FROM retretait WHERE mecano=" + this.jTextField1.getText());
                                while (result2.next()) {
                                    this.existe = 1;
                                    nomadh = result2.getString("nom");
                                    System.out.println("nom =" + this.nom);
                                    sr = "retraite";
                                    this.num.setText(nomadh);
                                    pp = true;
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas " + e.getMessage());
                                pp = false;
                            }
                            if (!pp) {
                                JOptionPane jop36 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas !!!!!!!!!!!");
                            }
                        }
                        if (pp) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement state3 = conn2.createStatement();
                                ResultSet result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Mecano=" + this.jTextField1.getText());
                                ResultSetMetaData resultMeta3 = result3.getMetaData();
                                while (result3.next()) {
                                    pp = false;
                                    String date = result3.getString("date");
                                    String mois3 = date.substring(3, date.length() - 5);
                                    String ann\u00e9es = date.substring(6, date.length());
                                    String datechoisire = mmm1 + aaa1;
                                    System.out.println("----------------------------------");
                                    System.out.println(" date choisire : mois => " + mmm1 + "  annes  =>" + aaa1);
                                    int ac = Integer.parseInt(aaa1);
                                    int mc = Integer.parseInt(mmm1);
                                    double MMch = Integer.parseInt(datechoisire);
                                    String datebase = mois3 + ann\u00e9es;
                                    double MMbd = Integer.parseInt(datebase);
                                    int ab = Integer.parseInt(ann\u00e9es);
                                    int mb = Integer.parseInt(mois3);
                                    System.out.println(" date de base : mois => " + mois3 + "  annes  =>" + ann\u00e9es);
                                    try {
                                        if (ab != ac || mc > mb) continue;
                                        pp = false;
                                        String obse = result3.getString("type");
                                        if (obse.equals("Fournisseurs")) continue;
                                        String numca = result3.getString("Numcarnet");
                                        String numch = result3.getString("Numcheque");
                                        this.banquee.setText("");
                                        String montant = result3.getString("montant");
                                        this.totale += Integer.parseInt(montant);
                                        String b = result3.getString("banque");
                                        montant = montant + " DT";
                                        Object[] stg = new Object[]{date, numca, numch, obse, b, montant};
                                        this.dt1.addRow(stg);
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop37 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreure :p " + e.getMessage());
                                    }
                                }
                                this.numfin.setText("" + this.totale + " DT");
                                Object[] stg = new Object[]{"*******", "*******", "*******", "*******", "*******", "*******"};
                                this.dt1.addRow(stg);
                                Object[] stg2 = new Object[]{"", "", "", "", "Total =", "" + this.totale + " DT"};
                                this.dt1.addRow(stg2);
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                            }
                        }
                    } else {
                        boolean g;
                        boolean bl = g = mmm2.equals("00") || aaa2.equals("");
                        if (g) {
                            this.existe = 0;
                        } else {
                            ResultSet result2;
                            Statement state2;
                            JOptionPane jop3;
                            System.out.println("jghffvnhj");
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state2 = conn22.createStatement();
                                result2 = state2.executeQuery("SELECT * FROM adherent WHERE MECANO=" + this.jTextField1.getText());
                                while (result2.next()) {
                                    this.existe = 1;
                                    nomadh = result2.getString("NOM");
                                    sr = "Sant\u00e9";
                                    this.num.setText(nomadh);
                                    pp = true;
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas dans la mutuelle de la Sant\u00e9 1 " + e.getMessage());
                                pp = false;
                            }
                            if (!pp) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state2 = conn22.createStatement();
                                    result2 = state2.executeQuery("SELECT * FROM retretait WHERE mecano=" + this.jTextField1.getText());
                                    while (result2.next()) {
                                        this.existe = 1;
                                        nomadh = result2.getString("nom");
                                        System.out.println("nom =" + this.nom);
                                        sr = "retraite";
                                        this.num.setText(nomadh);
                                        pp = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas " + e.getMessage());
                                    pp = false;
                                }
                                if (!pp) {
                                    JOptionPane jop38 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Adh\u00e9rent n'existe pas !!!!!!!!!!!");
                                }
                            }
                            if (pp) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Statement state3 = conn2.createStatement();
                                    ResultSet result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Mecano=" + this.jTextField1.getText());
                                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                                    int A1 = Integer.parseInt(aaa1);
                                    int A2 = Integer.parseInt(aaa2);
                                    boolean k = true;
                                    if (A1 <= A2) {
                                        while (result3.next()) {
                                            pp = false;
                                            String date = result3.getString("date");
                                            String mois4 = date.substring(3, date.length() - 5);
                                            String ann\u00e9es = date.substring(6, date.length());
                                            int adebut = Integer.parseInt(aaa1);
                                            int afin = Integer.parseInt(aaa2);
                                            int abaase = Integer.parseInt(ann\u00e9es);
                                            int mdebut = Integer.parseInt(mmm1);
                                            int mfin = Integer.parseInt(mmm2);
                                            int mbase = Integer.parseInt(mois4);
                                            try {
                                                if (abaase < adebut || abaase > afin || mbase < mdebut || mbase > mfin) continue;
                                                pp = false;
                                                String obse = result3.getString("type");
                                                if (obse.equals("Fournisseurs")) continue;
                                                String numca = result3.getString("Numcarnet");
                                                String numch = result3.getString("Numcheque");
                                                this.banquee.setText("");
                                                String montant = result3.getString("montant");
                                                this.totale += Integer.parseInt(montant);
                                                String b = result3.getString("banque");
                                                montant = montant + " DT";
                                                Object[] stg = new Object[]{date, numca, numch, obse, b, montant};
                                                this.dt1.addRow(stg);
                                            }
                                            catch (Exception e) {
                                                JOptionPane jop39 = new JOptionPane();
                                                JOptionPane.showMessageDialog(null, "erreure :p " + e.getMessage());
                                            }
                                        }
                                    }
                                    this.numfin.setText("" + this.totale + " DT");
                                    Object[] stg = new Object[]{"*******", "*******", "*******", "*******", "*******", "*******"};
                                    this.dt1.addRow(stg);
                                    Object[] stg2 = new Object[]{"", "", "", "", "Total =", "" + this.totale + " DT"};
                                    this.dt1.addRow(stg2);
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                                }
                            }
                        }
                    }
                }
                if (this.existe == 0) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "!!");
                }
            } else if (ch.equals("4")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                this.jTable1.setModel(dt1);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    String ff = "1";
                    ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        String num2 = result3.getString("num");
                        String debut2 = result3.getString("debut");
                        String fin = result3.getString("fin");
                        Object[] stg = new Object[]{num2, debut2, fin};
                        dt1.addRow(stg);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                }
            } else if (ch.equals("5")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                if (aaa1.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Pr\u00e9ts Personnels'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String num3 = result3.getString("num");
                            String debut3 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            Object[] stg = new Object[]{num3, debut3, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Pr\u00e9ts Personnels'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            if (datdebut.equals("") && datfin.equals("")) continue;
                            if (datfin.equals("")) {
                                int achoisiree;
                                String ann\u00e9esdebutt = datdebut.substring(6, datdebut.length());
                                adebutt = Integer.parseInt(ann\u00e9esdebutt);
                                if (adebutt > (achoisiree = Integer.parseInt(aaa1))) continue;
                                num = result3.getString("num");
                                debut = result3.getString("debut");
                                String fin = result3.getString("fin");
                                Object[] stg = new Object[]{num, debut, fin, datdebut, datfin};
                                dt1.addRow(stg);
                                continue;
                            }
                            String ann\u00e9esdebut = datdebut.substring(6, datdebut.length());
                            String ann\u00e9esfin = datfin.substring(6, datfin.length());
                            int adebut = Integer.parseInt(ann\u00e9esdebut);
                            int afin = Integer.parseInt(ann\u00e9esfin);
                            int achoisire = Integer.parseInt(aaa1);
                            if (adebut > achoisire || afin < achoisire) continue;
                            String num4 = result3.getString("num");
                            String debut4 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            Object[] stg = new Object[]{num4, debut4, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                }
            } else if (ch.equals("6")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                if (aaa1.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Pr\u00e9ts Ouvries'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String num5 = result3.getString("num");
                            String debut5 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            Object[] stg = new Object[]{num5, debut5, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Pr\u00e9ts Ouvries'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            if (datdebut.equals("") && datfin.equals("")) continue;
                            if (datfin.equals("")) {
                                int achoisiree;
                                String ann\u00e9esdebutt = datdebut.substring(6, datdebut.length());
                                adebutt = Integer.parseInt(ann\u00e9esdebutt);
                                if (adebutt > (achoisiree = Integer.parseInt(aaa1))) continue;
                                num = result3.getString("num");
                                debut = result3.getString("debut");
                                String fin = result3.getString("fin");
                                Object[] stg = new Object[]{num, debut, fin, datdebut, datfin};
                                dt1.addRow(stg);
                                continue;
                            }
                            String ann\u00e9esdebut = datdebut.substring(6, datdebut.length());
                            String ann\u00e9esfin = datfin.substring(6, datfin.length());
                            int adebut = Integer.parseInt(ann\u00e9esdebut);
                            int afin = Integer.parseInt(ann\u00e9esfin);
                            int achoisire = Integer.parseInt(aaa1);
                            if (adebut > achoisire || afin < achoisire) continue;
                            String num6 = result3.getString("num");
                            String debut6 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            Object[] stg = new Object[]{num6, debut6, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                }
            } else if (ch.equals("7")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                if (aaa1.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Pr\u00e9ts FDD'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String num7 = result3.getString("num");
                            String debut7 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            Object[] stg = new Object[]{num7, debut7, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Pr\u00e9ts FDD'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            if (datdebut.equals("") && datfin.equals("")) continue;
                            if (datfin.equals("")) {
                                int achoisiree;
                                String ann\u00e9esdebutt = datdebut.substring(6, datdebut.length());
                                adebutt = Integer.parseInt(ann\u00e9esdebutt);
                                if (adebutt > (achoisiree = Integer.parseInt(aaa1))) continue;
                                num = result3.getString("num");
                                debut = result3.getString("debut");
                                String fin = result3.getString("fin");
                                Object[] stg = new Object[]{num, debut, fin, datdebut, datfin};
                                dt1.addRow(stg);
                                continue;
                            }
                            String ann\u00e9esdebut = datdebut.substring(6, datdebut.length());
                            String ann\u00e9esfin = datfin.substring(6, datfin.length());
                            int adebut = Integer.parseInt(ann\u00e9esdebut);
                            int afin = Integer.parseInt(ann\u00e9esfin);
                            int achoisire = Integer.parseInt(aaa1);
                            if (adebut > achoisire || afin < achoisire) continue;
                            String num8 = result3.getString("num");
                            String debut8 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            Object[] stg = new Object[]{num8, debut8, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                }
            } else if (ch.equals("8")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                if (aaa1.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Fournisseurs'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String num9 = result3.getString("num");
                            String debut9 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            Object[] stg = new Object[]{num9, debut9, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Fournisseurs'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            if (datdebut.equals("") && datfin.equals("")) continue;
                            if (datfin.equals("")) {
                                int achoisiree;
                                String ann\u00e9esdebutt = datdebut.substring(6, datdebut.length());
                                adebutt = Integer.parseInt(ann\u00e9esdebutt);
                                if (adebutt > (achoisiree = Integer.parseInt(aaa1))) continue;
                                num = result3.getString("num");
                                debut = result3.getString("debut");
                                String fin = result3.getString("fin");
                                Object[] stg = new Object[]{num, debut, fin, datdebut, datfin};
                                dt1.addRow(stg);
                                continue;
                            }
                            String ann\u00e9esdebut = datdebut.substring(6, datdebut.length());
                            String ann\u00e9esfin = datfin.substring(6, datfin.length());
                            int adebut = Integer.parseInt(ann\u00e9esdebut);
                            int afin = Integer.parseInt(ann\u00e9esfin);
                            int achoisire = Integer.parseInt(aaa1);
                            if (adebut > achoisire || afin < achoisire) continue;
                            String num10 = result3.getString("num");
                            String debut10 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            Object[] stg = new Object[]{num10, debut10, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                }
            } else if (ch.equals("9")) {
                System.out.println("1111111111111111");
                this.dt1 = new DefaultTableModel();
                this.dt1.addColumn("Date");
                this.dt1.addColumn("N\u00b0carnet");
                this.dt1.addColumn("N\u00b0cheque");
                this.dt1.addColumn("Montant");
                this.matricetat = this.jTextField1.getText();
                this.jTable1.setModel(this.dt1);
                this.imprimer.setVisible(true);
                this.imprimer.setText("Impression d'etat");
                boolean pp = false;
                if (mmm1.equals("00") && mmm2.equals("00") && aaa1.equals("") && aaa2.equals("")) {
                    ResultSetMetaData resultMeta3;
                    ResultSet result3;
                    Statement state3;
                    JOptionPane jop3;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM ffournis WHERE MATRIC=" + this.jTextField1.getText());
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            pp = false;
                            String nom = result3.getString("NOM");
                            this.num.setText(nom);
                            this.numdebut.setText(result3.getString("NOMSOC"));
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Mecano='" + this.jTextField1.getText() + "' AND type='Fournisseurs' ORDER BY Numcarnet");
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            pp = false;
                            String Numcarnet = result3.getString("Numcarnet");
                            String numcheque = result3.getString("numcheque");
                            String montant = result3.getString("Montant");
                            String mois5 = result3.getString("date");
                            this.totale += Integer.parseInt(montant);
                            montant = montant + " DT";
                            Object[] stg = new Object[]{mois5, Numcarnet, numcheque, montant};
                            this.dt1.addRow(stg);
                        }
                        this.numfin.setText("" + this.totale + " DT");
                        Object[] stg = new Object[]{"*******", "*******", "*******", "*******"};
                        this.dt1.addRow(stg);
                        Object[] stg2 = new Object[]{"", "", "Total =", this.totale};
                        this.dt1.addRow(stg2);
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                    }
                    this.existe = 1;
                } else if (mmm2.equals("00") && aaa1.equals("") && aaa2.equals("")) {
                    ResultSetMetaData resultMeta3;
                    ResultSet result3;
                    Statement state3;
                    JOptionPane jop3;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM ffournis WHERE MATRIC=" + this.jTextField1.getText());
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            pp = true;
                            String nom = result3.getString("NOM");
                            this.num.setText(nom);
                            this.numdebut.setText(result3.getString("NOMSOC"));
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                    }
                    if (pp) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Mecano='" + this.jTextField1.getText() + "' AND type='Fournisseurs' ");
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                pp = false;
                                String date = result3.getString("date");
                                System.out.println("date =" + date);
                                String mois6 = date.substring(3, date.length() - 5);
                                System.out.println("mois =" + mois6);
                                System.out.println("mmm1 =" + mmm1);
                                if (!mois6.equals(mmm1)) continue;
                                System.out.println("-------------------");
                                String numca = result3.getString("Numcarnet");
                                String numch = result3.getString("Numcheque");
                                this.banquee.setText("");
                                String montant = result3.getString("montant");
                                this.totale += Integer.parseInt(montant);
                                montant = montant + " DT";
                                Object[] stg = new Object[]{date, numca, numch, montant};
                                this.dt1.addRow(stg);
                            }
                            this.numfin.setText("" + this.totale + " DT");
                            Object[] stg = new Object[]{"*******", "*******", "*******", "*******"};
                            this.dt1.addRow(stg);
                            Object[] stg2 = new Object[]{"", "", "Total =", this.totale};
                            this.dt1.addRow(stg2);
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                        }
                    }
                    this.existe = 1;
                } else if (mmm2.equals("00") && aaa2.equals("")) {
                    ResultSetMetaData resultMeta3;
                    ResultSet result3;
                    JOptionPane jop3;
                    Statement state3;
                    System.out.println("jghffvnhj");
                    try {
                        System.out.println("mois selment nnnnnn");
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM ffournis WHERE MATRIC=" + this.jTextField1.getText());
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            pp = true;
                            String nom = result3.getString("NOM");
                            this.num.setText(nom);
                            this.numdebut.setText(result3.getString("NOMSOC"));
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Aucune cheque 111 " + e.getMessage());
                    }
                    if (!pp) {
                        JOptionPane jop310 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Matricule n'existe pas");
                    }
                    if (pp) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Mecano='" + this.jTextField1.getText() + "' AND type='Fournisseurs'");
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                pp = false;
                                String date = result3.getString("date");
                                String mois7 = date.substring(3, date.length() - 5);
                                String ann\u00e9es = date.substring(6, date.length());
                                String datechoisire = mmm1 + aaa1;
                                System.out.println("----------------------------------");
                                System.out.println(" date choisire : mois => " + mmm1 + "  annes  =>" + aaa1);
                                int ac = Integer.parseInt(aaa1);
                                int mc = Integer.parseInt(mmm1);
                                double MMch = Integer.parseInt(datechoisire);
                                String datebase = mois7 + ann\u00e9es;
                                double MMbd = Integer.parseInt(datebase);
                                int ab = Integer.parseInt(ann\u00e9es);
                                int mb = Integer.parseInt(mois7);
                                System.out.println(" date de base : mois => " + mois7 + "  annes  =>" + ann\u00e9es);
                                try {
                                    if (ab != ac || mc > mb) continue;
                                    String numca = result3.getString("Numcarnet");
                                    String numch = result3.getString("Numcheque");
                                    System.out.println(" N\u00b0 cheque =" + numch);
                                    this.banquee.setText("");
                                    String montant = result3.getString("montant");
                                    this.totale += Integer.parseInt(montant);
                                    montant = montant + " DT";
                                    Object[] stg = new Object[]{date, numca, numch, montant};
                                    this.dt1.addRow(stg);
                                }
                                catch (Exception e) {
                                    JOptionPane jop311 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreure :p " + e.getMessage());
                                }
                            }
                            this.numfin.setText("" + this.totale + " DT");
                            Object[] stg = new Object[]{"*******", "*******", "*******", "*******"};
                            this.dt1.addRow(stg);
                            Object[] stg2 = new Object[]{"", "", "Total =", this.totale};
                            this.dt1.addRow(stg2);
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Aucune cheque 2222 " + e.getMessage());
                        }
                    }
                } else if (mmm2.equals("00") && aaa2.equals("")) {
                    ResultSetMetaData resultMeta3;
                    ResultSet result3;
                    JOptionPane jop3;
                    Statement state3;
                    System.out.println("jghffvnhj");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM ffournis WHERE MATRIC=" + this.jTextField1.getText());
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            pp = true;
                            String nom = result3.getString("NOM");
                            this.num.setText(nom);
                            this.numdebut.setText(result3.getString("NOMSOC"));
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                    }
                    if (!pp) {
                        JOptionPane jop312 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Matricule n'existe pas");
                    }
                    if (pp) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Mecano='" + this.jTextField1.getText() + "' AND type='Fournisseurs'");
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                pp = false;
                                String date = result3.getString("date");
                                String mois8 = date.substring(3, date.length() - 5);
                                String ann\u00e9es = date.substring(6, date.length());
                                String datechoisire = mmm1 + aaa1;
                                double MMch = Integer.parseInt(datechoisire);
                                String datebase = mois8 + ann\u00e9es;
                                double MMbd = Integer.parseInt(datebase);
                                try {
                                    if (MMch > MMbd) continue;
                                    String numca = result3.getString("Numcarnet");
                                    String numch = result3.getString("Numcheque");
                                    this.banquee.setText("");
                                    String montant = result3.getString("montant");
                                    this.totale += Integer.parseInt(montant);
                                    montant = montant + " DT";
                                    Object[] stg = new Object[]{date, numca, numch, montant};
                                    this.dt1.addRow(stg);
                                }
                                catch (Exception e) {
                                    JOptionPane jop313 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreure :p " + e.getMessage());
                                }
                            }
                            this.numfin.setText("" + this.totale + " DT");
                            Object[] stg = new Object[]{"*******", "*******", "*******", "*******"};
                            this.dt1.addRow(stg);
                            Object[] stg2 = new Object[]{"", "", "Total =", this.totale};
                            this.dt1.addRow(stg2);
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                        }
                    }
                } else {
                    ResultSetMetaData resultMeta3;
                    ResultSet result3;
                    JOptionPane jop3;
                    Statement state3;
                    System.out.println("jghffvnhj");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM ffournis WHERE MATRIC=" + this.jTextField1.getText());
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            pp = true;
                            String nom = result3.getString("NOM");
                            this.num.setText(nom);
                            this.numdebut.setText(result3.getString("NOMSOC"));
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Aucune cheque " + e.getMessage());
                    }
                    if (!pp) {
                        JOptionPane jop314 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Matriculen'existe pas");
                    }
                    if (pp) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Mecano='" + this.jTextField1.getText() + "' AND type='Fournisseurs'");
                            resultMeta3 = result3.getMetaData();
                            int A1 = Integer.parseInt(aaa1);
                            int A2 = Integer.parseInt(aaa2);
                            boolean k = true;
                            if (A1 <= A2) {
                                while (result3.next()) {
                                    pp = false;
                                    String date = result3.getString("date");
                                    String mois9 = date.substring(3, date.length() - 5);
                                    String ann\u00e9es = date.substring(6, date.length());
                                    int adebut = Integer.parseInt(aaa1);
                                    int afin = Integer.parseInt(aaa2);
                                    int abaase = Integer.parseInt(ann\u00e9es);
                                    int mdebut = Integer.parseInt(mmm1);
                                    int mfin = Integer.parseInt(mmm2);
                                    int mbase = Integer.parseInt(mois9);
                                    try {
                                        if (abaase < adebut || abaase > afin || mbase < mdebut || mbase > mfin) continue;
                                        String numca = result3.getString("Numcarnet");
                                        String numch = result3.getString("Numcheque");
                                        this.banquee.setText("");
                                        String montant = result3.getString("montant");
                                        this.totale += Integer.parseInt(montant);
                                        montant = montant + " DT";
                                        Object[] stg = new Object[]{date, numca, numch, montant};
                                        this.dt1.addRow(stg);
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop315 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreure :p " + e.getMessage());
                                    }
                                }
                            } else {
                                JOptionPane jop316 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Date de fin inf\u00e9rieure a date de debut !!!!");
                                k = false;
                            }
                            if (k) {
                                this.numfin.setText("" + this.totale + " DT");
                                Object[] stg = new Object[]{"*******", "*******", "*******", "*******"};
                                this.dt1.addRow(stg);
                                Object[] stg2 = new Object[]{"", "", "Total =", this.totale};
                                this.dt1.addRow(stg2);
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Aucune cheque 3333" + e.getMessage());
                        }
                    }
                    this.existe = 1;
                }
            } else if (ch.equals("10")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                if (aaa1.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Primes Scolaires'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String num11 = result3.getString("num");
                            String debut11 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            Object[] stg = new Object[]{num11, debut11, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Primes Scolaires'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            if (datdebut.equals("") && datfin.equals("")) continue;
                            if (datfin.equals("")) {
                                int achoisiree;
                                String ann\u00e9esdebutt = datdebut.substring(6, datdebut.length());
                                adebutt = Integer.parseInt(ann\u00e9esdebutt);
                                if (adebutt > (achoisiree = Integer.parseInt(aaa1))) continue;
                                num = result3.getString("num");
                                debut = result3.getString("debut");
                                String fin = result3.getString("fin");
                                Object[] stg = new Object[]{num, debut, fin, datdebut, datfin};
                                dt1.addRow(stg);
                                continue;
                            }
                            String ann\u00e9esdebut = datdebut.substring(6, datdebut.length());
                            String ann\u00e9esfin = datfin.substring(6, datfin.length());
                            int adebut = Integer.parseInt(ann\u00e9esdebut);
                            int afin = Integer.parseInt(ann\u00e9esfin);
                            int achoisire = Integer.parseInt(aaa1);
                            if (adebut > achoisire || afin < achoisire) continue;
                            String num12 = result3.getString("num");
                            String debut12 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            Object[] stg = new Object[]{num12, debut12, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                }
            } else if (ch.equals("11")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 cheque");
                dt1.addColumn("Matricule");
                dt1.addColumn("Montant");
                dt1.addColumn("Date");
                dt1.addColumn("Date d'annulation");
                dt1.addColumn("observation");
                this.jTable1.setModel(dt1);
                if (aaa1.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM chequeannuller ORDER BY Numcarnet");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String numcarnet = result3.getString("NUMCARNET");
                            String numcheque = result3.getString("numcheque");
                            String mecano = result3.getString("Mecano");
                            String mont = result3.getString("Montant");
                            String dat = result3.getString("date");
                            String data = result3.getString("dateanulation");
                            String ob = result3.getString("type");
                            Object[] stg = new Object[]{numcarnet, numcheque, mecano, mont, dat, data, ob};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM chequeannuller ORDER BY Numcarnet");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String date = result3.getString("date");
                            String ann\u00e9es = date.substring(6, date.length());
                            if (!ann\u00e9es.equals(aaa1)) continue;
                            String numcarnet = result3.getString("NUMCARNET");
                            String numcheque = result3.getString("numcheque");
                            String mecano = result3.getString("Mecano");
                            String mont = result3.getString("Montant");
                            String data = result3.getString("dateanulation");
                            String ob = result3.getString("type");
                            Object[] stg = new Object[]{numcarnet, numcheque, mecano, mont, date, data, ob};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                }
            } else if (ch.equals("12")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                if (aaa1.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='P\u00e9ts Retrait\u00e9'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String num13 = result3.getString("num");
                            String debut13 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            Object[] stg = new Object[]{num13, debut13, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='P\u00e9ts Retrait\u00e9'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            if (datdebut.equals("") && datfin.equals("")) continue;
                            if (datfin.equals("")) {
                                int achoisiree;
                                String ann\u00e9esdebutt = datdebut.substring(6, datdebut.length());
                                adebutt = Integer.parseInt(ann\u00e9esdebutt);
                                if (adebutt > (achoisiree = Integer.parseInt(aaa1))) continue;
                                num = result3.getString("num");
                                debut = result3.getString("debut");
                                String fin = result3.getString("fin");
                                Object[] stg = new Object[]{num, debut, fin, datdebut, datfin};
                                dt1.addRow(stg);
                                continue;
                            }
                            String ann\u00e9esdebut = datdebut.substring(6, datdebut.length());
                            String ann\u00e9esfin = datfin.substring(6, datfin.length());
                            int adebut = Integer.parseInt(ann\u00e9esdebut);
                            int afin = Integer.parseInt(ann\u00e9esfin);
                            int achoisire = Integer.parseInt(aaa1);
                            if (adebut > achoisire || afin < achoisire) continue;
                            String num14 = result3.getString("num");
                            String debut14 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            Object[] stg = new Object[]{num14, debut14, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                }
            } else if (ch.equals("13")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    String ff = "1";
                    ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='banque BNA'");
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        String num15 = result3.getString("num");
                        String debut15 = result3.getString("debut");
                        String fin = result3.getString("fin");
                        String datdebut = result3.getString("datedebut");
                        String datfin = result3.getString("datefin");
                        Object[] stg = new Object[]{num15, debut15, fin, datdebut, datfin};
                        dt1.addRow(stg);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                }
            } else if (ch.equals("14")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    String ff = "1";
                    ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='banque BH'");
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        String num16 = result3.getString("num");
                        String debut16 = result3.getString("debut");
                        String fin = result3.getString("fin");
                        String datdebut = result3.getString("datedebut");
                        String datfin = result3.getString("datefin");
                        Object[] stg = new Object[]{num16, debut16, fin, datdebut, datfin};
                        dt1.addRow(stg);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                }
            } else if (ch.equals("15")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    String ff = "1";
                    ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='banque UIB'");
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        String num17 = result3.getString("num");
                        String debut17 = result3.getString("debut");
                        String fin = result3.getString("fin");
                        String datdebut = result3.getString("datedebut");
                        String datfin = result3.getString("datefin");
                        Object[] stg = new Object[]{num17, debut17, fin, datdebut, datfin};
                        dt1.addRow(stg);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                }
            } else if (ch.equals("16")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    String ff = "1";
                    ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='banque BIAT'");
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        String num18 = result3.getString("num");
                        String debut18 = result3.getString("debut");
                        String fin = result3.getString("fin");
                        String datdebut = result3.getString("datedebut");
                        String datfin = result3.getString("datefin");
                        Object[] stg = new Object[]{num18, debut18, fin, datdebut, datfin};
                        dt1.addRow(stg);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                }
            } else if (ch.equals("17")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("Num carnet");
                dt1.addColumn("N\u00b0 Debut");
                dt1.addColumn("N\u00b0 fin ");
                dt1.addColumn("Date Debut");
                dt1.addColumn("Date fin ");
                this.jTable1.setModel(dt1);
                if (aaa1.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Gestion de centre'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String num19 = result3.getString("num");
                            String debut19 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            Object[] stg = new Object[]{num19, debut19, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        String ff = "1";
                        ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation='Gestion de centre'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String datdebut = result3.getString("datedebut");
                            String datfin = result3.getString("datefin");
                            if (datdebut.equals("") && datfin.equals("")) continue;
                            if (datfin.equals("")) {
                                int achoisiree;
                                String ann\u00e9esdebutt = datdebut.substring(6, datdebut.length());
                                adebutt = Integer.parseInt(ann\u00e9esdebutt);
                                if (adebutt > (achoisiree = Integer.parseInt(aaa1))) continue;
                                num = result3.getString("num");
                                debut = result3.getString("debut");
                                String fin = result3.getString("fin");
                                Object[] stg = new Object[]{num, debut, fin, datdebut, datfin};
                                dt1.addRow(stg);
                                continue;
                            }
                            String ann\u00e9esdebut = datdebut.substring(6, datdebut.length());
                            String ann\u00e9esfin = datfin.substring(6, datfin.length());
                            int adebut = Integer.parseInt(ann\u00e9esdebut);
                            int afin = Integer.parseInt(ann\u00e9esfin);
                            int achoisire = Integer.parseInt(aaa1);
                            if (adebut > achoisire || afin < achoisire) continue;
                            String num20 = result3.getString("num");
                            String debut20 = result3.getString("debut");
                            String fin = result3.getString("fin");
                            Object[] stg = new Object[]{num20, debut20, fin, datdebut, datfin};
                            dt1.addRow(stg);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                    }
                }
            } else if (ch.equals("18")) {
                dt1 = new DefaultTableModel();
                dt1.addColumn("N\u00b0 carnet");
                dt1.addColumn("N\u00b0 Cheque");
                dt1.addColumn("Nombre de cheque");
                dt1.addColumn("cheque Sign\u00e9");
                dt1.addColumn("Banque");
                this.jTable1.setModel(dt1);
                if (this.jTextField1.getText().equals("")) {
                    JOptionPane jop23 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Saisir Mecano de l'adherent", "Attention", 0);
                } else {
                    JOptionPane jop3;
                    boolean pp = false;
                    this.num.setText(this.jTextField1.getText());
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state2 = conn22.createStatement();
                        ResultSet result2 = state2.executeQuery("SELECT * FROM chequeadherent WHERE mecano=" + this.jTextField1.getText());
                        ResultSetMetaData resultMeta2 = result2.getMetaData();
                        while (result2.next()) {
                            pp = true;
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "ereure !!" + e.getMessage());
                        pp = false;
                    }
                    if (!pp) {
                        JOptionPane.showMessageDialog(null, "aucun carnet de cheque !!");
                    } else {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state3 = conn2.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM chequeadherent WHERE mecano=" + this.jTextField1.getText());
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                String nbcarnet = result3.getString("nbcarnet");
                                String numch = result3.getString("ncheque");
                                String nbcheque = result3.getString("nbcheque");
                                String nbchequesugn = result3.getString("nbchequesigne");
                                String ban = result3.getString("ban");
                                Object[] stg = new Object[]{nbcarnet, numch, nbcheque, nbchequesugn, ban};
                                dt1.addRow(stg);
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                        }
                    }
                }
            }
            this.ok = 0;
        } else {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choisire recherche par ??  cliquez sur ok et remplire tous les champs puis cliquez sur le button recherche");
        }
        this.recherchee.setVisible(false);
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
        int nm = this.jTable1.getSelectedRow();
        System.out.println("\u00e8_____" + nm);
        String np = this.jTable1.getModel().getValueAt(nm, 0).toString();
        System.out.println("\u00e8_____" + np);
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void imprimerActionPerformed(ActionEvent evt) {
        boolean k = true;
        if (this.jComboBox3.getSelectedItem().equals("N\u00b0cheque")) {
            this.imprimer.setVisible(true);
            boolean g = this.jTextField1.getText().equals("");
            if (g) {
                k = false;
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Saisire un numero de cheque", "Attention", 0);
            }
            if (k) {
                Date actuellEe = new Date();
                SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
                String datdd = dateFormatt.format(actuellEe);
                this.d.setText(datdd);
                this.n1.setText(this.jTextField1.getText());
                this.n2.setText(this.jTextField1.getText());
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE numcheque=" + this.jTextField1.getText());
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        this.observation.setText(result3.getString("type"));
                        this.datecheque.setText(result3.getString("date"));
                        this.monatant.setText(result3.getString("Montant") + " DT");
                        String nomadh = result3.getString("Mecano");
                        this.mc.setText(nomadh);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            ResultSet result2 = state2.executeQuery("SELECT * FROM adherent WHERE MECANO=" + nomadh);
                            ResultSetMetaData resultMeta2 = result2.getMetaData();
                            while (result2.next()) {
                                this.nomad.setText(result2.getString("NOM"));
                                this.cin.setText(result2.getString("CIN"));
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
                        }
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Num cheque n'existe pas !!" + e.getMessage());
                }
                Impression1 ss2 = new Impression1(this.certificatat);
                ss2.actionPerformed(evt);
            }
        } else if (this.jComboBox3.getSelectedItem().equals("N\u00b0carnet")) {
            MessageFormat header = new MessageFormat("Liste des cheques pour le carnet N\u00b0" + this.numcarnetetat);
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Mecano")) {
            MessageFormat header = new MessageFormat("Etat des cheques pour le Mecano N\u00b0" + this.mecanoetat);
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Les nauveaux carnets")) {
            MessageFormat header = new MessageFormat("Etat des nauveaux carnets des cheques");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts Personnels")) {
            MessageFormat header = new MessageFormat("Etat des carnets des Pr\u00e9ts Personnels");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts Ouvries")) {
            MessageFormat header = new MessageFormat("Etat des carnets des Pr\u00e9ts Ouvries");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts FDD")) {
            MessageFormat header = new MessageFormat("Etat des carnets des Pr\u00e9ts FDD");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Fournisseurs")) {
            MessageFormat header = new MessageFormat("Etat des carnets des Fournisseurs");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Matricule fournisseur")) {
            MessageFormat header = new MessageFormat("Etat des cheques , Matricule fournisseur =" + this.matricetat);
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Les cheques annul\u00e9s")) {
            MessageFormat header = new MessageFormat("Etat des cheques annul\u00e9s");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Primes Scolaires")) {
            MessageFormat header = new MessageFormat("Etat des Primes Scolaires");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts Retrait\u00e9")) {
            MessageFormat header = new MessageFormat("Etat des Pr\u00e9ts Retrait\u00e9");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Banque BNA")) {
            MessageFormat header = new MessageFormat("Etat de Banque BNA");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Banque BH")) {
            MessageFormat header = new MessageFormat("Etat de Banque BH");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Banque UIB")) {
            MessageFormat header = new MessageFormat("Etat de Banque UIB");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Banque BIAT")) {
            MessageFormat header = new MessageFormat("Etat de Banque BIAT");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.jComboBox3.getSelectedItem().equals("Gestion de centre")) {
            MessageFormat header = new MessageFormat("Etat de Gestion de centre");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choisire recherche par numero de cheque puis Saisire Le Numero");
        }
    }

    private void ok1ActionPerformed(ActionEvent evt) {
        this.totale = 0;
        this.imprimer.setVisible(false);
        this.test = 0;
        this.jTextField1.setText("");
        this.a1.setText("");
        this.a2.setText("");
        this.me.setText("");
        if (this.jComboBox3.getSelectedItem().equals("N\u00b0carnet")) {
            this.ok = 1;
            this.jTextField1.enable(true);
            this.jLabel7.setText("N\u00b0carnet");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(false);
            this.a2.enable(false);
            this.recherchee.setVisible(true);
            System.out.println("cccc");
            this.nc.setText("N\u00b0 Carnet :");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("");
            this.j2.setText("N\u00b0 cheque Debut :");
            this.numdebut.setText("");
            this.j3.setText("N\u00b0 Cheque Fin :");
            this.numfin.setText("");
            this.j4.setText("Date debut :");
            this.datedebut.setText("");
            this.j5.setText("Date fin :");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Carnet adh\u00e9rent")) {
            this.ok = 1;
            this.jTextField1.enable(true);
            this.jLabel7.setText("Mecano :");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(false);
            this.a2.enable(false);
            this.recherchee.setVisible(true);
            this.nc.setText("Mecano :");
            this.num.setText("");
            this.j1.setText("");
            this.observ.setText("");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("N\u00b0cheque")) {
            this.ok = 1;
            this.jLabel7.setText("N\u00b0cheque");
            this.jTextField1.enable(true);
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(false);
            this.a2.enable(false);
            this.recherchee.setVisible(true);
            this.nc.setText("N\u00b0 Carnet :");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("");
            this.j2.setText("Date d'impression");
            this.numdebut.setText("");
            this.j3.setText("Montant:");
            this.numfin.setText("");
            this.j4.setText("NOm:");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("Mecano");
            this.nn2.setText("reference");
            this.me.enable(true);
        } else if (this.jComboBox3.getSelectedItem().equals("Mecano")) {
            this.ok = 1;
            this.recherchee.setVisible(true);
            this.jTextField1.enable(true);
            this.jLabel7.setText("Mecano");
            this.moisdebut.setText("Mois debut:");
            this.moisfin.setText("Mois fin:");
            this.annedebut.setText("Ann\u00e9e debut:");
            this.annefin.setText("Ann\u00e9e fin:");
            this.m1.enable(true);
            this.m2.enable(true);
            this.a1.enable(true);
            this.a2.enable(true);
            this.nc.setText("Nom :");
            this.num.setText("");
            this.j1.setText("");
            this.observ.setText("");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("Total de cheque :");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Gestion de centre")) {
            this.ok = 1;
            this.recherchee.setVisible(true);
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e:");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.nc.setText("Nom :");
            this.num.setText("");
            this.j1.setText("");
            this.observ.setText("Gestion de Centre");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Les nauveaux carnets")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(false);
            this.a2.enable(false);
            this.jLabel3.setText("");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("");
            this.observ.setText("");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts Personnels")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e :");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Pr\u00e9ts Personnels");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts Ouvries")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Pr\u00e9ts Ouvries");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts FDD")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e :");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Pr\u00e9ts FDD");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Fournisseurs")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Fournisseurs");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.recherchee.setVisible(true);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Matricule fournisseur")) {
            this.ok = 1;
            this.jTextField1.enable(true);
            this.jLabel7.setText("Mecano");
            this.moisdebut.setText("Mois debut");
            this.moisfin.setText("Mois fin");
            this.annedebut.setText("Ann\u00e9e debut");
            this.annefin.setText("Ann\u00e9e fin");
            this.m1.enable(true);
            this.m2.enable(true);
            this.a1.enable(true);
            this.a2.enable(true);
            this.nc.setText("Nom :");
            this.num.setText("");
            this.j1.setText("");
            this.observ.setText("");
            this.j2.setText("Nom soci\u00e9t\u00e9");
            this.numdebut.setText("");
            this.j3.setText("Total de cheque :");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.recherchee.setVisible(true);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Primes Scolaires")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Primes Scolaires");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Les cheques annul\u00e9s")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e :");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Les cheques annul\u00e9s");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Pr\u00e9ts Retrait\u00e9")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e :");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Pr\u00e9ts Retrait\u00e9");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Banque BNA")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e :");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Banque BNA");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Banque BH")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Banque BH");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Banque UIB")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Banque UIB");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else if (this.jComboBox3.getSelectedItem().equals("Banque BIAT")) {
            this.ok = 1;
            this.jTextField1.enable(false);
            this.jLabel7.setText("");
            this.moisdebut.setText("");
            this.moisfin.setText("");
            this.annedebut.setText("Ann\u00e9e");
            this.annefin.setText("");
            this.m1.enable(false);
            this.m2.enable(false);
            this.a1.enable(true);
            this.a2.enable(false);
            this.jLabel3.setText("Banque :");
            this.banquee.setText("");
            this.recherchee.setVisible(true);
            this.nc.setText("");
            this.num.setText("");
            this.j1.setText("Observation :");
            this.observ.setText("Banque BIAT");
            this.j2.setText("");
            this.numdebut.setText("");
            this.j3.setText("");
            this.numfin.setText("");
            this.j4.setText("");
            this.datedebut.setText("");
            this.j5.setText("");
            this.datefin.setText("");
            this.nn2.setText("");
            this.nn2.setText("");
            this.me.enable(false);
            this.me.setText("");
        } else {
            this.ok = 0;
            this.recherchee.setVisible(false);
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Recherche par ??", "Attention", 0);
        }
    }

    private void jComboBox3ActionPerformed(ActionEvent evt) {
    }

    private void m1ActionPerformed(ActionEvent evt) {
    }

}

