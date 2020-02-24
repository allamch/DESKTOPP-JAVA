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
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.recherchecarnedecheque;

public class primescolaireRET
extends JPanel {
    String nomadh = "";
    String ch = "";
    String mont = "";
    String parmois = "";
    int k = 1;
    int i = 0;
    int totall = 0;
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    String numcarnetreserver = "";
    double Nch;
    double Nfin;
    private JLabel DATEANE;
    private JTable ca;
    private JTable ca1;
    private JPanel cheque;
    private JLabel cinetat;
    private JLabel cnretat;
    private JLabel datecheque;
    private JLabel dateetat;
    private JTextField enfant1;
    private JTextField enfant2;
    private JPanel etat;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton7;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel27;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JTextField jTextField1;
    private JTextField jTextField10;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    private JTextField mecano;
    private JLabel mecanoetat;
    private JLabel mecc;
    private JLabel mecc1;
    private JLabel montantetat;
    private JLabel montantlettrecheque;
    private JLabel montchiffrecheque;
    private JLabel nomadh1;
    private JLabel nomadhcheque;
    private JLabel nometat;
    private JLabel numetat;
    private JTextField p;
    private JTextField ps;
    private JTextField u;

    public primescolaireRET() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jButton1 = new JButton();
        this.p = new JTextField();
        this.jLabel7 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.ps = new JTextField();
        this.jLabel8 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.u = new JTextField();
        this.jLabel9 = new JLabel();
        this.jSeparator3 = new JSeparator();
        this.jButton7 = new JButton();
        this.nomadh1 = new JLabel();
        this.jLabel27 = new JLabel();
        this.mecano = new JTextField();
        this.jPanel2 = new JPanel();
        this.etat = new JPanel();
        this.mecc1 = new JLabel();
        this.jLabel5 = new JLabel();
        this.dateetat = new JLabel();
        this.nometat = new JLabel();
        this.cnretat = new JLabel();
        this.montantetat = new JLabel();
        this.jTextField1 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jTextField3 = new JTextField();
        this.jTextField4 = new JTextField();
        this.jTextField5 = new JTextField();
        this.jTextField6 = new JTextField();
        this.jTextField7 = new JTextField();
        this.jTextField8 = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel6 = new JLabel();
        this.mecanoetat = new JLabel();
        this.numetat = new JLabel();
        this.cinetat = new JLabel();
        this.jTextField10 = new JTextField();
        this.jTextField9 = new JTextField();
        this.DATEANE = new JLabel();
        this.cheque = new JPanel();
        this.montantlettrecheque = new JLabel();
        this.montchiffrecheque = new JLabel();
        this.nomadhcheque = new JLabel();
        this.mecc = new JLabel();
        this.jLabel13 = new JLabel();
        this.datecheque = new JLabel();
        this.jScrollPane3 = new JScrollPane();
        this.ca = new JTable();
        this.jButton2 = new JButton();
        this.jScrollPane4 = new JScrollPane();
        this.ca1 = new JTable();
        this.enfant2 = new JTextField();
        this.jLabel11 = new JLabel();
        this.enfant1 = new JTextField();
        this.jLabel12 = new JLabel();
        this.jButton3 = new JButton();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 30));
        this.jLabel1.setForeground(new Color(51, 51, 255));
        this.jLabel1.setText("Prime Scolaire Retretait");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(340, 0, 380, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Mecano :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(30, 10, 70, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 11));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton1.setText("Ajouter");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(410, 30, 103, 40);
        this.p.setFont(new Font("Tahoma", 1, 12));
        this.jPanel1.add(this.p);
        this.p.setBounds(270, 90, 60, 30);
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("NB d'enfant \"Prime Primaire\":");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(20, 90, 250, 30);
        this.jPanel1.add(this.jSeparator1);
        this.jSeparator1.setBounds(0, 120, 340, 2);
        this.ps.setFont(new Font("Tahoma", 1, 12));
        this.jPanel1.add(this.ps);
        this.ps.setBounds(270, 130, 60, 30);
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setForeground(new Color(0, 0, 153));
        this.jLabel8.setText("NB d'enfant \"Prime Secandaire\" :");
        this.jPanel1.add(this.jLabel8);
        this.jLabel8.setBounds(20, 130, 250, 30);
        this.jPanel1.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 160, 340, 2);
        this.u.setFont(new Font("Tahoma", 1, 12));
        this.jPanel1.add(this.u);
        this.u.setBounds(270, 170, 60, 30);
        this.jLabel9.setFont(new Font("Tahoma", 1, 14));
        this.jLabel9.setForeground(new Color(0, 0, 153));
        this.jLabel9.setText("NB d'enfant \"Prime  Universitaire\":");
        this.jPanel1.add(this.jLabel9);
        this.jLabel9.setBounds(20, 170, 250, 30);
        this.jPanel1.add(this.jSeparator3);
        this.jSeparator3.setBounds(0, 200, 340, 2);
        this.jButton7.setFont(new Font("Tahoma", 1, 11));
        this.jButton7.setIcon(new ImageIcon(this.getClass().getResource("/image/Apps-accessories-text-editor-icon.png")));
        this.jButton7.setText("Historique");
        this.jButton7.setToolTipText("Quitter");
        this.jButton7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.jButton7ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton7);
        this.jButton7.setBounds(890, 30, 120, 40);
        this.nomadh1.setFont(new Font("Traditional Arabic", 1, 16));
        this.nomadh1.setForeground(new Color(102, 0, 51));
        this.nomadh1.setText(".........................................");
        this.jPanel1.add(this.nomadh1);
        this.nomadh1.setBounds(150, 50, 250, 30);
        this.jLabel27.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel27.setForeground(new Color(51, 0, 204));
        this.jLabel27.setText("Nom adherant :");
        this.jPanel1.add(this.jLabel27);
        this.jLabel27.setBounds(20, 50, 140, 29);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.mecanoActionPerformed(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyPressed(KeyEvent evt) {
                primescolaireRET.this.mecanoKeyPressed(evt);
            }

            @Override
            public void keyReleased(KeyEvent evt) {
                primescolaireRET.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(100, 10, 160, 30);
        this.etat.setBackground(new Color(255, 255, 255));
        this.etat.setLayout(null);
        this.etat.add(this.mecc1);
        this.mecc1.setBounds(180, 0, 60, 20);
        this.jLabel5.setFont(new Font("Tahoma", 1, 24));
        this.jLabel5.setText("ETAT DE PRIME SCOLAIRE");
        this.etat.add(this.jLabel5);
        this.jLabel5.setBounds(20, 10, 320, 20);
        this.dateetat.setFont(new Font("Tahoma", 0, 10));
        this.dateetat.setText("...............");
        this.etat.add(this.dateetat);
        this.dateetat.setBounds(20, 100, 60, 40);
        this.nometat.setFont(new Font("Tahoma", 0, 14));
        this.nometat.setText("............................................");
        this.etat.add(this.nometat);
        this.nometat.setBounds(100, 90, 180, 50);
        this.cnretat.setFont(new Font("Tahoma", 0, 12));
        this.cnretat.setText("....................");
        this.etat.add(this.cnretat);
        this.cnretat.setBounds(300, 90, 70, 50);
        this.montantetat.setFont(new Font("Tahoma", 0, 12));
        this.montantetat.setText("..................");
        this.etat.add(this.montantetat);
        this.montantetat.setBounds(390, 100, 72, 30);
        this.jTextField1.setFont(new Font("Tahoma", 1, 14));
        this.jTextField1.setText("      Date");
        this.jTextField1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.jTextField1ActionPerformed(evt);
            }
        });
        this.etat.add(this.jTextField1);
        this.jTextField1.setBounds(10, 60, 80, 30);
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etat.add(this.jTextField2);
        this.jTextField2.setBounds(10, 90, 80, 60);
        this.jTextField3.setFont(new Font("Tahoma", 1, 14));
        this.jTextField3.setText("              NOM ET PRENOM");
        this.jTextField3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.jTextField3ActionPerformed(evt);
            }
        });
        this.etat.add(this.jTextField3);
        this.jTextField3.setBounds(90, 60, 200, 30);
        this.jTextField4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etat.add(this.jTextField4);
        this.jTextField4.setBounds(90, 90, 200, 60);
        this.jTextField5.setFont(new Font("Tahoma", 1, 14));
        this.jTextField5.setText("     N\u00b0 CNR");
        this.jTextField5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.jTextField5ActionPerformed(evt);
            }
        });
        this.etat.add(this.jTextField5);
        this.jTextField5.setBounds(290, 60, 90, 30);
        this.jTextField6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etat.add(this.jTextField6);
        this.jTextField6.setBounds(290, 90, 90, 60);
        this.jTextField7.setFont(new Font("Tahoma", 1, 14));
        this.jTextField7.setText("  MONTANT");
        this.jTextField7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.jTextField7ActionPerformed(evt);
            }
        });
        this.etat.add(this.jTextField7);
        this.jTextField7.setBounds(380, 60, 90, 30);
        this.jTextField8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etat.add(this.jTextField8);
        this.jTextField8.setBounds(380, 90, 90, 60);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("Signature");
        this.etat.add(this.jLabel3);
        this.jLabel3.setBounds(334, 170, 70, 17);
        this.jLabel4.setFont(new Font("Tahoma", 1, 12));
        this.jLabel4.setText("Mecano :");
        this.etat.add(this.jLabel4);
        this.jLabel4.setBounds(190, 40, 70, 15);
        this.jLabel6.setFont(new Font("Tahoma", 1, 12));
        this.jLabel6.setText("N\u00b0:");
        this.etat.add(this.jLabel6);
        this.jLabel6.setBounds(20, 40, 30, 15);
        this.mecanoetat.setFont(new Font("Tahoma", 1, 11));
        this.mecanoetat.setText("..........");
        this.etat.add(this.mecanoetat);
        this.mecanoetat.setBounds(260, 40, 110, 20);
        this.numetat.setFont(new Font("Tahoma", 1, 11));
        this.numetat.setText("............");
        this.etat.add(this.numetat);
        this.numetat.setBounds(50, 40, 100, 20);
        this.cinetat.setFont(new Font("Tahoma", 0, 10));
        this.cinetat.setText("...........");
        this.etat.add(this.cinetat);
        this.cinetat.setBounds(480, 100, 60, 30);
        this.jTextField10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.etat.add(this.jTextField10);
        this.jTextField10.setBounds(470, 90, 80, 60);
        this.jTextField9.setFont(new Font("Tahoma", 1, 14));
        this.jTextField9.setText("  N\u00b0 CIN");
        this.jTextField9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.jTextField9ActionPerformed(evt);
            }
        });
        this.etat.add(this.jTextField9);
        this.jTextField9.setBounds(470, 60, 80, 30);
        this.DATEANE.setFont(new Font("Tahoma", 1, 24));
        this.DATEANE.setText("....../.......");
        this.etat.add(this.DATEANE);
        this.DATEANE.setBounds(350, 0, 170, 40);
        this.cheque.setBackground(new Color(255, 255, 255));
        this.cheque.setLayout(null);
        this.montantlettrecheque.setFont(new Font("Tahoma", 0, 12));
        this.montantlettrecheque.setText("................");
        this.cheque.add(this.montantlettrecheque);
        this.montantlettrecheque.setBounds(80, 50, 370, 20);
        this.montchiffrecheque.setFont(new Font("Arial Black", 0, 12));
        this.montchiffrecheque.setText("................");
        this.cheque.add(this.montchiffrecheque);
        this.montchiffrecheque.setBounds(350, 0, 110, 20);
        this.nomadhcheque.setFont(new Font("Tahoma", 1, 14));
        this.nomadhcheque.setText("...........................................................");
        this.cheque.add(this.nomadhcheque);
        this.nomadhcheque.setBounds(120, 70, 350, 20);
        this.cheque.add(this.mecc);
        this.mecc.setBounds(180, 0, 60, 20);
        this.jLabel13.setText("Mahdia ");
        this.cheque.add(this.jLabel13);
        this.jLabel13.setBounds(150, 160, 60, 14);
        this.datecheque.setFont(new Font("Tahoma", 0, 12));
        this.datecheque.setText("..............................");
        this.cheque.add(this.datecheque);
        this.datecheque.setBounds(200, 160, 170, 15);
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.cheque, -2, 660, -2).addComponent(this.etat, -2, 578, -2)).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.etat, -2, 200, -2).addGap(17, 17, 17).addComponent(this.cheque, -2, 176, -2).addContainerGap(-1, 32767)));
        this.jPanel1.add(this.jPanel2);
        this.jPanel2.setBounds(410, 80, 580, 190);
        this.jScrollPane3.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane3.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane3.setName("");
        this.jScrollPane3.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                primescolaireRET.this.jScrollPane3MouseClicked(evt);
            }
        });
        this.ca.setFont(new Font("Tahoma", 0, 12));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}}, new String[]{"N\u00b0", "Ann\u00e9e", "Mecanoo", "Nom", "CNR", "CIN", "Montant", "Date"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setRowHeight(30);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                primescolaireRET.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                primescolaireRET.this.caMouseEntered(evt);
            }
        });
        this.ca.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                primescolaireRET.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane3.setViewportView(this.ca);
        this.jPanel1.add(this.jScrollPane3);
        this.jScrollPane3.setBounds(390, 280, 690, 260);
        this.jButton2.setFont(new Font("Tahoma", 1, 11));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton2.setText("Terminer l'etat et imprimer");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(650, 30, 230, 40);
        this.jScrollPane4.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane4.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane4.setName("");
        this.jScrollPane4.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                primescolaireRET.this.jScrollPane4MouseClicked(evt);
            }
        });
        this.ca1.setFont(new Font("Tahoma", 0, 12));
        this.ca1.setModel(new DefaultTableModel(new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"N\u00b0", "Ann\u00e9e", "Date"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca1.setRowHeight(30);
        this.ca1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                primescolaireRET.this.ca1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                primescolaireRET.this.ca1MouseEntered(evt);
            }
        });
        this.ca1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                primescolaireRET.this.ca1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane4.setViewportView(this.ca1);
        this.jPanel1.add(this.jScrollPane4);
        this.jScrollPane4.setBounds(10, 290, 370, 250);
        this.jPanel1.add(this.enfant2);
        this.enfant2.setBounds(80, 250, 220, 30);
        this.jLabel11.setFont(new Font("Tahoma", 1, 12));
        this.jLabel11.setForeground(new Color(102, 0, 204));
        this.jLabel11.setText("Nom fils 2:");
        this.jPanel1.add(this.jLabel11);
        this.jLabel11.setBounds(10, 250, 110, 30);
        this.jPanel1.add(this.enfant1);
        this.enfant1.setBounds(80, 210, 220, 30);
        this.jLabel12.setFont(new Font("Tahoma", 1, 12));
        this.jLabel12.setForeground(new Color(102, 0, 204));
        this.jLabel12.setText("Nom fils 1:");
        this.jPanel1.add(this.jLabel12);
        this.jLabel12.setBounds(10, 210, 110, 30);
        this.jButton3.setFont(new Font("Tahoma", 1, 11));
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton3.setText("Imprimer ");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primescolaireRET.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(520, 30, 120, 40);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 1087, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, 553, 32767).addContainerGap()));
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        JOptionPane jop2;
        boolean g;
        JOptionPane jop22;
        String nomadhb = null;
        String numb = null;
        String cnrb = null;
        String cinb = null;
        String nummm = "";
        this.k = 1;
        Date actuellEed = new Date();
        SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
        String datddd = dateFormattd.format(actuellEed);
        String ann\u00e9es = datddd.substring(6, datddd.length());
        int anescolaire = Integer.parseInt(ann\u00e9es);
        this.DATEANE.setText(ann\u00e9es + "/" + ++anescolaire);
        String anescolb = ann\u00e9es + "/" + anescolaire;
        this.dateetat.setText(datddd);
        this.datecheque.setText(datddd);
        String dateb = datddd;
        if (this.k == 1 && (g = this.mecano.getText().equals(""))) {
            this.k = 0;
            JOptionPane jop23 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        }
        int pp = 1;
        int uu = 1;
        int ss = 1;
        int montantprime = 0;
        int kp = 0;
        int ks = 0;
        int ku = 0;
        if (this.p.getText().equals("")) {
            pp = 0;
            kp = 0;
        } else {
            String vp = this.p.getText();
            try {
                kp = 1;
                pp = Integer.parseInt(vp);
                montantprime += 20 * pp;
            }
            catch (Exception ex) {
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Nombre d'enfant Primaire Incorecte", "Attention", 0);
                this.k = 0;
            }
        }
        if (this.ps.getText().equals("")) {
            ss = 0;
            ks = 0;
        } else {
            String vs = this.ps.getText();
            try {
                ks = 1;
                ss = Integer.parseInt(vs);
                montantprime += 20 * ss;
            }
            catch (Exception ex) {
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Nombre d'enfant Secandaire Incorecte", "Attention", 0);
                this.k = 0;
            }
        }
        if (this.u.getText().equals("")) {
            uu = 0;
            ku = 0;
        } else {
            String vu = this.u.getText();
            try {
                ku = 1;
                uu = Integer.parseInt(vu);
                montantprime += 30 * uu;
            }
            catch (Exception ex) {
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Nombre d'enfant Universitaire Incorecte", "Attention", 0);
                this.k = 0;
            }
        }
        int kk = kp + ks + ku;
        System.out.println("nombre d'enfant :" + kk);
        if (kk > 0) {
            if (pp + ss + uu > 3) {
                this.k = 0;
                jop22 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Nombre d'enfant > 3", "Attention", 0);
            }
        } else {
            this.k = 0;
            jop22 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Zero enfant !!", "Attention", 0);
        }
        int kkk = pp + uu + ss;
        System.out.println("nb =" + kkk);
        if (kkk == 1) {
            this.enfant2.setText("");
            System.out.println("nb =1*****************");
            if (this.enfant1.getText().equals("")) {
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Sasire le nom d'enfant N\u00b01", "Attention", 0);
                this.k = 0;
            }
        } else if (kkk == 2) {
            if (this.enfant1.getText().equals("")) {
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Sasire le nom d'enfant N\u00b01", "Attention", 0);
                this.k = 0;
            }
            if (this.enfant2.getText().equals("")) {
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Sasire le nom d'enfant N\u00b02", "Attention", 0);
                this.k = 0;
            }
        }
        if (this.k == 1) {
            try {
                this.k = 1;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state3 = con.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM primescolaireretretait  WHERE Mecano=" + this.mecano.getText());
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    String anescoll = result3.getString("anescol");
                    System.out.println("anescol =" + anescoll);
                    if (!anescoll.equals(anescolb)) continue;
                    String montantp = result3.getString("montant");
                    int tm = montantp.length() - 3;
                    String diiV = montantp.substring(0, montantp.length() - 4);
                    String miilV = montantp.substring(tm, montantp.length());
                    montantp = diiV;
                    System.out.println("Montant san ,=" + montantp);
                    int MON = Integer.parseInt(montantp);
                    if (MON == 70) {
                        this.k = 0;
                        JOptionPane jop24 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Prime D\u00e9pase 70 D pour l'adherent" + this.nomadh1.getText(), "Attention", 0);
                        continue;
                    }
                    System.out.println("Montant =" + montantp);
                    int MONN = MON + montantprime;
                    if (MONN < 70) continue;
                    System.out.println("MON2 =" + MON);
                    montantprime = 70 - MON;
                    System.out.println("montantprime 1 =" + montantprime);
                }
            }
            catch (Exception e) {
                this.k = 0;
                JOptionPane.showMessageDialog(null, "erreur recherch prime exicte: " + e.getMessage());
            }
        }
        if (this.k == 1 && montantprime > 70) {
            montantprime = 70;
        }
        System.out.println("montantprime 2 =" + montantprime);
        String ssV = "" + montantprime + "000";
        int tV = ssV.length() - 3;
        String diiV = ssV.substring(0, ssV.length() - 3);
        String miilV = ssV.substring(tV, ssV.length());
        this.montchiffrecheque.setText("#" + diiV + "," + miilV + "#");
        this.montantetat.setText(diiV + "," + miilV);
        String montantb = diiV + miilV;
        Date actuellEedd = new Date();
        SimpleDateFormat dateFormattdd = new SimpleDateFormat("dd/MM/yyyy");
        String datdd = dateFormattdd.format(actuellEedd);
        int mon = Integer.parseInt(diiV);
        String adi = "";
        try {
            adi = Nombre.CALCULATE.getValue(mon, " Dinars ");
        }
        catch (Exception ex) {
            Logger.getLogger(primescolaireRET.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.montantlettrecheque.setText(adi);
        this.mecanoetat.setText(this.mecano.getText());
        String MECANOb = this.mecano.getText();
        if (this.k == 1) {
            JOptionPane jop3;
            JOptionPane jop1;
            block107 : {
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT MECANO  FROM  retretait WHERE mecano=" + this.mecano.getText());
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas (N dossier) ", "Information", 1);
                        this.k = 0;
                        break block107;
                    }
                    ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nometat.setText(result3.getString("nom"));
                            this.nomadhcheque.setText(result3.getString("nom"));
                            nomadhb = result3.getString("nom");
                            this.cnretat.setText(result3.getString("cnr"));
                            cnrb = result3.getString("cnr");
                            this.cinetat.setText(result3.getString("cin"));
                            cinb = result3.getString("cin");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                        this.k = 0;
                    }
                }
                catch (Exception e) {
                    JOptionPane jop32 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                    this.k = 0;
                }
            }
            int n = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state3 = conn3.createStatement();
                ResultSet result13 = state3.executeQuery("SELECT nb FROM primescolaireretretait  WHERE anescol='" + anescolb + "' AND MECANO='" + this.mecano.getText() + "'");
                String nbb = "";
                System.out.println("-----------------1----------");
                while (result13.next()) {
                    nbb = result13.getString("nb");
                    n = Integer.parseInt(nbb) + n;
                }
            }
            catch (Exception e) {
                JOptionPane jop33 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur calcule nb enfant !!: " + e.getMessage());
                this.k = 0;
            }
            int nb = n;
            System.out.println("nb d'enfant1 :" + nb);
            if (nb >= 2) {
                System.out.println("nb d'enfant2 :" + nb);
                this.k = 0;
                JOptionPane jop25 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "n'a pas le droit de prendre un autre prime scolaire pour le 3 eme fils", "Attention", 0);
            }
            int n1 = 0;
            int n2 = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state3 = conn4.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT num FROM primescolaireretretait  WHERE anescol='" + anescolb + "'");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                this.i = 0;
                while (result3.next()) {
                    nummm = result3.getString("num");
                    n1 = Integer.parseInt(nummm);
                    if (n1 > n2) {
                        n2 = n1;
                    }
                    this.i = 1;
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                this.i = 0;
            }
            numb = "" + ++n2 + "";
            this.numetat.setText(numb);
            if (this.k == 1) {
                JOptionPane jop = new JOptionPane();
                int option = JOptionPane.showConfirmDialog(null, "Adherent " + this.nomadh1.getText() + " / Montant de Prime " + montantprime + " DT ( N\u00b0:" + numb + " / ann\u00e9e :" + anescolb + ")", "Attention", 0, 3);
                if (option == 0) {
                    String p;
                    ResultSet result2;
                    Statement state2;
                    Connection conn2;
                    String typcarnet = "Primes Scolaires";
                    String numcc = "";
                    String deb = "";
                    int typena = 0;
                    System.out.println("type de compte 2 =" + typcarnet);
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn5.createStatement();
                        p = "0";
                        result2 = state2.executeQuery("SELECT * FROM comptecourant  WHERE observation='" + typcarnet + "' AND f='" + p + "'");
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
                            JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                        }
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
                                System.out.println("numero de cheque talon des cheque  =" + this.numerocheq);
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
                            Connection conn22;
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
                            int ji = this.firstcheque.indexOf(".");
                            if (jii != -1) {
                                System.out.println("ji =" + jii);
                                this.firstcheque = this.firstcheque.substring(0, this.firstcheque.length() - 2);
                                System.out.println("firstcheque =" + this.firstcheque);
                            }
                            if (this.k == 1) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state22 = conn22.createStatement();
                                    String p2 = "0";
                                    state22.executeUpdate("UPDATE  talondescheque SET p='" + p2 + "' WHERE numcheque='" + this.numerocheq + "'");
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
                                    conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state22 = conn22.createStatement();
                                    String banque = "banque";
                                    String p3 = "1";
                                    state22.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnet + "','" + this.mecano.getText() + "','" + montantb + "','" + datdd + "','" + typcarnet + "','" + p3 + "','" + banque + "')");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
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
                                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn2.createStatement();
                                    p = "0";
                                    state2.executeUpdate("UPDATE  talondescheque SET p='" + p + "' WHERE numcheque='" + this.numerocheq + "'");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
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
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                        }
                    }
                    Impression1 s = new Impression1(this.etat);
                    s.actionPerformed(evt);
                    JOptionPane.showMessageDialog(null, "Attention :  carnet de cheque N\u00b0:" + this.numcarnet + "  et N\u00b0 cheque :" + this.firstcheque + "", "Information", 1);
                    Impression1 sec = new Impression1(this.cheque);
                    sec.actionPerformed(evt);
                    this.k = 0;
                    int ll = 1;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn23 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state23 = conn23.createStatement();
                        String nn = "" + kkk + "";
                        state23.executeUpdate("INSERT INTO primescolaireretretait(MECANO,num,anescol,date,montant,pv,enfant1,enfant2,nb,numch,numetat) VALUES('" + MECANOb + "','" + numb + "','" + anescolb + "','" + dateb + "','" + montantb + "','" + ll + "','" + this.enfant1.getText() + "','" + this.enfant2.getText() + "','" + nn + "','" + this.firstcheque + "','0')");
                        this.k = 1;
                    }
                    catch (Exception e) {
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                    }
                    if (this.k == 1) {
                        Connection conn24;
                        Statement state24;
                        String p4;
                        int total = 0;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state24 = conn5.createStatement();
                            p4 = "1";
                            ResultSet result22 = state24.executeQuery("SELECT * FROM  caisseprimescolaireretretait  WHERE n='" + p4 + "'");
                            while (result22.next()) {
                                String ttt = result22.getString("total");
                                total = Integer.parseInt(ttt);
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            JOptionPane jop34 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant 66666666666666666666" + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn24 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state24 = conn24.createStatement();
                            p4 = "0";
                            state24.executeUpdate("UPDATE   caisseprimescolaireretretait SET n='0' ");
                            this.k = 1;
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modification caisse: " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn24 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state24 = conn24.createStatement();
                            this.k = 1;
                            System.out.println("m2 =" + montantb);
                            int tm = Integer.parseInt(montantb);
                            String mm = "" + (total -= tm) + "";
                            String z = "0";
                            String u = "1";
                            state24.executeUpdate("INSERT INTO  caisseprimescolaireretretait(date,mecano,debit,credit,total,annescolaire,num,n) VALUES('" + datdd + "','" + this.mecano.getText() + "','" + montantb + "','" + z + "','" + mm + "','" + anescolb + "','" + numb + "','" + u + "')");
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse prime scolaire : " + e.getMessage());
                        }
                    }
                    System.out.println("llll  i=" + this.i);
                    this.mecano.setText("");
                    this.p.setText("");
                    this.ps.setText("");
                    this.u.setText("");
                }
            }
        }
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField3ActionPerformed(ActionEvent evt) {
    }

    private void jTextField5ActionPerformed(ActionEvent evt) {
    }

    private void jTextField7ActionPerformed(ActionEvent evt) {
    }

    private void jTextField9ActionPerformed(ActionEvent evt) {
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void mecanoKeyPressed(KeyEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        this.p.setText("0");
        this.u.setText("0");
        this.ps.setText("0");
        Date actuellEed = new Date();
        SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
        String datddd = dateFormattd.format(actuellEed);
        String ann\u00e9es = datddd.substring(6, datddd.length());
        int anescolaire = Integer.parseInt(ann\u00e9es);
        this.DATEANE.setText(ann\u00e9es + "/" + ++anescolaire);
        String anescolb = ann\u00e9es + "/" + anescolaire;
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String cin = "";
            String cnr = "";
            String nom = "";
            this.k = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM  retretait  WHERE mecano=" + this.mecano.getText());
                while (result3.next()) {
                    this.k = 1;
                    this.nomadh1.setText(result3.getString("nom"));
                    cnr = result3.getString("cnr");
                    cin = result3.getString("cin");
                    nom = result3.getString("nom");
                }
            }
            catch (Exception e) {
                this.k = 0;
            }
            if (this.k == 0) {
                this.nomadh1.setText(".................");
            } else {
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("N\u00b0");
                dt1.addColumn("Ann\u00e9e");
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom et prenom");
                dt1.addColumn("CNR");
                dt1.addColumn("CIN");
                dt1.addColumn("Montant");
                dt1.addColumn("Date");
                this.ca.setModel(dt1);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn22.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM primescolaireretretait WHERE anescol='" + anescolb + "' ORDER BY num  ");
                    this.k = 0;
                    int totale = 0;
                    while (result2.next()) {
                        this.k = 1;
                        String num = result2.getString("num");
                        String anescol = result2.getString("anescol");
                        String MECANO = result2.getString("MECANO");
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state3 = conn2.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + MECANO);
                            while (result3.next()) {
                                this.k = 1;
                                cnr = result3.getString("cnr");
                                cin = result3.getString("cin");
                                nom = result3.getString("nom");
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                        }
                        String Montant = result2.getString("montant");
                        String date = result2.getString("date");
                        totale = Integer.parseInt(Montant) + totale;
                        Montant = new StringBuilder(Montant).insert(Montant.length() - 3, ".").toString();
                        Object[] stg = new Object[]{num, anescol, MECANO, nom, cnr, cin, Montant, date};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                    if (this.k == 1) {
                        String mt = "" + totale + "";
                        mt = new StringBuilder(mt).insert(mt.length() - 3, ".").toString() + " DT";
                        Object[] stg = new Object[]{"", "", "", "", "", "Totale", mt, ""};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur prime" + e.getMessage());
                }
                DefaultTableModel dt2 = new DefaultTableModel();
                dt2.addColumn("N\u00b0");
                dt2.addColumn("Date");
                dt2.addColumn("Enfant 1");
                dt2.addColumn("Enfant 2");
                dt2.addColumn("Montant");
                this.ca1.setModel(dt2);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn23 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn23.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM primescolaireretretait WHERE anescol='" + anescolb + "'AND MECANO='" + this.mecano.getText() + "' ORDER BY num  ");
                    this.k = 0;
                    int totale = 0;
                    while (result2.next()) {
                        this.k = 1;
                        String num = result2.getString("num");
                        String enfant1 = result2.getString("enfant1");
                        String enfant2 = result2.getString("enfant2");
                        String Montant = result2.getString("montant");
                        String date = result2.getString("date");
                        totale = Integer.parseInt(Montant) + totale;
                        Montant = new StringBuilder(Montant).insert(Montant.length() - 3, ".").toString();
                        Object[] stg = new Object[]{num, date, enfant1, enfant2, Montant};
                        dt2.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca1);
                    }
                    if (this.k == 1) {
                        String mt = "" + totale + "";
                        mt = new StringBuilder(mt).insert(mt.length() - 3, ".").toString() + " DT";
                        Object[] stg = new Object[]{"", "", "", "Totale", mt};
                        dt2.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca1);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur enfant" + e.getMessage());
                }
            }
            System.out.println("k=" + this.k);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.mecano.setText("");
        }
    }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane3MouseClicked(MouseEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
    }

    private void ca1MouseClicked(MouseEvent evt) {
    }

    private void ca1MouseEntered(MouseEvent evt) {
    }

    private void ca1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane4MouseClicked(MouseEvent evt) {
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
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

