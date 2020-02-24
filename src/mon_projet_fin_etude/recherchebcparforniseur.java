/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class recherchebcparforniseur
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JTextField MATF;
    private JTextField MATF2;
    private JTextField a1;
    private JTextField acc;
    private JTextField annedebut1;
    private JLabel annedebut2;
    private JTextField codeactive;
    private JTextField codebc;
    private JTextField date;
    private JTextField dev;
    private JButton jButton19;
    private JButton jButton20;
    private JLabel jLabel2;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel39;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JComboBox m1;
    private JTextField mc;
    private JTextField mecano;
    private JLabel moisdebut;
    private JTextField montbc;
    private JTextField nbc;
    private JTextField nbmoi;
    private JLabel nf;
    private JLabel nomadh;

    public recherchebcparforniseur() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jButton19 = new JButton();
        this.jLabel6 = new JLabel();
        this.MATF2 = new JTextField();
        this.jLabel30 = new JLabel();
        this.jLabel7 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel28 = new JLabel();
        this.jLabel33 = new JLabel();
        this.mc = new JTextField();
        this.jLabel34 = new JLabel();
        this.jLabel39 = new JLabel();
        this.nbmoi = new JTextField();
        this.jLabel42 = new JLabel();
        this.codebc = new JTextField();
        this.jLabel41 = new JLabel();
        this.jLabel43 = new JLabel();
        this.annedebut1 = new JTextField();
        this.nbc = new JTextField();
        this.jLabel29 = new JLabel();
        this.MATF = new JTextField();
        this.jLabel31 = new JLabel();
        this.jButton20 = new JButton();
        this.dev = new JTextField();
        this.date = new JTextField();
        this.jLabel35 = new JLabel();
        this.montbc = new JTextField();
        this.nomadh = new JLabel();
        this.jLabel2 = new JLabel();
        this.codeactive = new JTextField();
        this.m1 = new JComboBox();
        this.moisdebut = new JLabel();
        this.annedebut2 = new JLabel();
        this.a1 = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel36 = new JLabel();
        this.acc = new JTextField();
        this.nf = new JLabel();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jButton19.setFont(new Font("Tahoma", 1, 12));
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton19);
        this.jButton19.setBounds(410, 30, 50, 33);
        this.jLabel6.setFont(new Font("Snap ITC", 1, 24));
        this.jLabel6.setForeground(new Color(0, 0, 153));
        this.jLabel6.setText("Modification ");
        this.jPanel16.add(this.jLabel6);
        this.jLabel6.setBounds(770, 10, 230, 30);
        this.MATF2.setFont(new Font("Tahoma", 0, 14));
        this.MATF2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.MATF2MouseClicked(evt);
            }
        });
        this.MATF2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.MATF2ActionPerformed(evt);
            }
        });
        this.MATF2.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.MATF2KeyReleased(evt);
            }
        });
        this.jPanel16.add(this.MATF2);
        this.MATF2.setBounds(60, 30, 90, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("Mat F :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(10, 30, 50, 30);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Modification Bon de Commande par fournisseur");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(40, 0, 620, 30);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.mecano.setEnabled(false);
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(830, 130, 170, 30);
        this.jLabel28.setBackground(new Color(153, 153, 255));
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setForeground(new Color(0, 0, 255));
        this.jLabel28.setText("Mecano :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(760, 120, 70, 30);
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setForeground(new Color(0, 0, 255));
        this.jLabel33.setText("Date BC :");
        this.jPanel16.add(this.jLabel33);
        this.jLabel33.setBounds(760, 170, 70, 30);
        this.mc.setFont(new Font("Tahoma", 0, 14));
        this.mc.setEnabled(false);
        this.mc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.mcMouseClicked(evt);
            }
        });
        this.mc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.mcActionPerformed(evt);
            }
        });
        this.mc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.mcKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.mc);
        this.mc.setBounds(830, 350, 50, 30);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText("M dev:");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(760, 210, 80, 30);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setForeground(new Color(0, 0, 255));
        this.jLabel39.setText("NBM:");
        this.jPanel16.add(this.jLabel39);
        this.jLabel39.setBounds(900, 390, 40, 30);
        this.nbmoi.setFont(new Font("Tahoma", 0, 14));
        this.nbmoi.setEnabled(false);
        this.nbmoi.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.nbmoiMouseClicked(evt);
            }
        });
        this.nbmoi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.nbmoiActionPerformed(evt);
            }
        });
        this.nbmoi.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.nbmoiKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.nbmoi);
        this.nbmoi.setBounds(940, 390, 60, 30);
        this.jLabel42.setBackground(new Color(153, 153, 255));
        this.jLabel42.setFont(new Font("Tahoma", 1, 14));
        this.jLabel42.setForeground(new Color(0, 0, 255));
        this.jLabel42.setText("BQ :");
        this.jPanel16.add(this.jLabel42);
        this.jLabel42.setBounds(760, 390, 30, 30);
        this.codebc.setFont(new Font("Tahoma", 0, 14));
        this.codebc.setEnabled(false);
        this.jPanel16.add(this.codebc);
        this.codebc.setBounds(830, 390, 60, 30);
        this.jLabel41.setBackground(new Color(153, 153, 255));
        this.jLabel41.setFont(new Font("Tahoma", 1, 14));
        this.jLabel41.setForeground(new Color(0, 0, 255));
        this.jLabel41.setText("MC :");
        this.jPanel16.add(this.jLabel41);
        this.jLabel41.setBounds(760, 350, 40, 30);
        this.jLabel43.setBackground(new Color(153, 153, 255));
        this.jLabel43.setFont(new Font("Tahoma", 1, 14));
        this.jLabel43.setForeground(new Color(0, 0, 255));
        this.jLabel43.setText("Ann\u00e9es :");
        this.jPanel16.add(this.jLabel43);
        this.jLabel43.setBounds(880, 350, 60, 30);
        this.annedebut1.setFont(new Font("Tahoma", 0, 14));
        this.annedebut1.setEnabled(false);
        this.annedebut1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.annedebut1MouseClicked(evt);
            }
        });
        this.annedebut1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.annedebut1ActionPerformed(evt);
            }
        });
        this.annedebut1.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.annedebut1KeyReleased(evt);
            }
        });
        this.jPanel16.add(this.annedebut1);
        this.annedebut1.setBounds(940, 350, 60, 30);
        this.nbc.setFont(new Font("Tahoma", 0, 14));
        this.nbc.setEnabled(false);
        this.nbc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.nbcMouseClicked(evt);
            }
        });
        this.nbc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.nbcActionPerformed(evt);
            }
        });
        this.nbc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.nbcKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.nbc);
        this.nbc.setBounds(950, 90, 50, 30);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("N\u00b0 BC :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(900, 90, 60, 30);
        this.MATF.setFont(new Font("Tahoma", 0, 14));
        this.MATF.setEnabled(false);
        this.MATF.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.MATFMouseClicked(evt);
            }
        });
        this.MATF.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.MATFActionPerformed(evt);
            }
        });
        this.MATF.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.MATFKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.MATF);
        this.MATF.setBounds(830, 90, 70, 30);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setForeground(new Color(0, 0, 255));
        this.jLabel31.setText("Mat F:");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(760, 90, 60, 30);
        this.jButton20.setFont(new Font("Tahoma", 1, 12));
        this.jButton20.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton20.setText("Modification");
        this.jButton20.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.jButton20ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton20);
        this.jButton20.setBounds(870, 480, 137, 30);
        this.dev.setFont(new Font("Tahoma", 0, 14));
        this.dev.setEnabled(false);
        this.dev.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.devMouseClicked(evt);
            }
        });
        this.dev.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.devActionPerformed(evt);
            }
        });
        this.dev.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.devKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.dev);
        this.dev.setBounds(830, 210, 170, 30);
        this.date.setFont(new Font("Tahoma", 0, 14));
        this.date.setEnabled(false);
        this.date.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.dateMouseClicked(evt);
            }
        });
        this.date.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.dateActionPerformed(evt);
            }
        });
        this.date.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.dateKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.date);
        this.date.setBounds(830, 170, 170, 30);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setForeground(new Color(0, 0, 255));
        this.jLabel35.setText("M bc:");
        this.jPanel16.add(this.jLabel35);
        this.jLabel35.setBounds(760, 250, 70, 30);
        this.montbc.setFont(new Font("Tahoma", 0, 14));
        this.montbc.setEnabled(false);
        this.montbc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.montbcMouseClicked(evt);
            }
        });
        this.montbc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.montbcActionPerformed(evt);
            }
        });
        this.montbc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.montbcKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.montbc);
        this.montbc.setBounds(830, 250, 170, 30);
        this.nomadh.setFont(new Font("Tahoma", 1, 12));
        this.nomadh.setForeground(new Color(102, 0, 0));
        this.jPanel16.add(this.nomadh);
        this.nomadh.setBounds(760, 40, 240, 40);
        this.jLabel2.setFont(new Font("Tahoma", 0, 14));
        this.jLabel2.setForeground(new Color(204, 0, 0));
        this.jLabel2.setText("Saisire code pour activer le modification :");
        this.jPanel16.add(this.jLabel2);
        this.jLabel2.setBounds(750, 440, 250, 40);
        this.codeactive.setFont(new Font("Tahoma", 1, 12));
        this.codeactive.setForeground(new Color(255, 255, 255));
        this.codeactive.addKeyListener(new KeyAdapter(){

            @Override
            public void keyPressed(KeyEvent evt) {
                recherchebcparforniseur.this.codeactiveKeyPressed(evt);
            }

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.codeactiveKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.codeactive);
        this.codeactive.setBounds(750, 480, 110, 30);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.setEnabled(false);
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.m1);
        this.m1.setBounds(200, 30, 50, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setText("Mois :");
        this.jPanel16.add(this.moisdebut);
        this.moisdebut.setBounds(150, 30, 50, 30);
        this.annedebut2.setFont(new Font("Tahoma", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 0));
        this.annedebut2.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annedebut2);
        this.annedebut2.setBounds(270, 30, 50, 30);
        this.a1.setEnabled(false);
        this.jPanel16.add(this.a1);
        this.a1.setBounds(320, 30, 80, 30);
        this.jScrollPane1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jTable1.setFont(new Font("Tahoma", 0, 14));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"Mecano", "Nom et prenom", "payment par"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.setMinimumSize(new Dimension(120, 150));
        this.jTable1.setRowHeight(25);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                recherchebcparforniseur.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                recherchebcparforniseur.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 70, 730, 460);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setForeground(new Color(0, 0, 255));
        this.jLabel36.setText("Accompte :");
        this.jPanel16.add(this.jLabel36);
        this.jLabel36.setBounds(750, 300, 80, 30);
        this.acc.setFont(new Font("Tahoma", 0, 14));
        this.acc.setEnabled(false);
        this.acc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchebcparforniseur.this.accMouseClicked(evt);
            }
        });
        this.acc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchebcparforniseur.this.accActionPerformed(evt);
            }
        });
        this.acc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchebcparforniseur.this.accKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.acc);
        this.acc.setBounds(830, 300, 170, 30);
        this.nf.setFont(new Font("Tahoma", 1, 14));
        this.nf.setForeground(new Color(153, 0, 51));
        this.nf.setText(".........................");
        this.jPanel16.add(this.nf);
        this.nf.setBounds(470, 40, 250, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 1010, 530);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jButton19ActionPerformed(ActionEvent evt) {
        this.nbc.enable(false);
        this.mecano.enable(false);
        this.date.enable(false);
        this.MATF.enable(false);
        this.annedebut1.enable(false);
        this.dev.enable(false);
        this.codebc.enable(false);
        this.nbmoi.enable(false);
        this.mc.enable(false);
        this.acc.enable(false);
        this.montbc.enable(false);
        this.acc.setText("");
        this.montbc.setText("");
        this.codeactive.setText("");
        this.nbc.setText("");
        this.mecano.setText("");
        this.date.setText("");
        this.MATF.setText("");
        this.annedebut1.setText("");
        this.dev.setText("");
        this.codebc.setText("");
        this.nbmoi.setText("");
        this.mc.setText("");
        this.nomadh.setText("");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0BC");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom");
        dt1.addColumn("datebc");
        dt1.addColumn("Mont-devis");
        dt1.addColumn("Mont-bc");
        dt1.addColumn("MC");
        dt1.addColumn("AD");
        dt1.addColumn("Accpt");
        dt1.addColumn("code B");
        dt1.addColumn("NB-M");
        this.jTable1.setModel(dt1);
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        String mm = this.m1.getSelectedItem().toString();
        if (mm.equals("00")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int totale = 0;
                Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn22.createStatement();
                System.out.println("matf='" + this.MATF2.getText());
                System.out.println("nneesdebut=" + this.a1.getText());
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' ORDER BY nbc");
                while (result2.next()) {
                    ResultSet result3;
                    Statement state3;
                    JOptionPane jop3;
                    ResultSetMetaData resultMeta3;
                    String nomadh = "";
                    int md = Integer.parseInt(result2.getString("moisdebut"));
                    String avance = result2.getString("accompte");
                    int ad = Integer.parseInt(result2.getString("anneesdebut"));
                    String nbc = result2.getString("nbc");
                    String Mec = result2.getString("Mecano");
                    boolean kk = false;
                    String nom = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            kk = true;
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                    if (this.k == 0) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                        }
                    }
                    String datebc = result2.getString("datebc");
                    System.out.println("*********************");
                    this.k = 0;
                    String montantbc = result2.getString("montantbc");
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    String montantdevis = result2.getString("montantdevis");
                    int ms = Integer.parseInt(montantdevis);
                    totale += ms;
                    montantdevis = new StringBuilder(montantdevis).insert(montantdevis.length() - 3, ".").toString();
                    String nbmois = result2.getString("nbmois");
                    String codeB = result2.getString("codeb");
                    Object[] stg = new Object[]{nbc, Mec, nom, datebc, montantdevis, montantbc, md, ad, avance, codeB, nbmois};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", "totale =", tt, "", "", "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
        } else {
            int totale = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn23 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn23.createStatement();
                System.out.println("matf='" + this.MATF2.getText());
                System.out.println("nneesdebut=" + this.a1.getText());
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' AND moisdebut='" + mm + "'  ORDER BY nbc");
                while (result2.next()) {
                    JOptionPane jop3;
                    ResultSetMetaData resultMeta3;
                    Statement state3;
                    ResultSet result3;
                    String nomadh = "";
                    String nbc = result2.getString("nbc");
                    String Mec = result2.getString("Mecano");
                    int md = Integer.parseInt(result2.getString("moisdebut"));
                    String avance = result2.getString("accompte");
                    int ad = Integer.parseInt(result2.getString("anneesdebut"));
                    boolean kk = false;
                    String nom = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            kk = true;
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                    if (this.k == 0) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                        }
                    }
                    String datebc = result2.getString("datebc");
                    System.out.println("*********************");
                    this.k = 0;
                    String montantbc = result2.getString("montantbc");
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    String montantdev = result2.getString("montantdevis");
                    int ms = Integer.parseInt(montantdev);
                    totale += ms;
                    montantdev = new StringBuilder(montantdev).insert(montantdev.length() - 3, ".").toString();
                    String nbmois = result2.getString("nbmois");
                    String codeB = result2.getString("codeb");
                    Object[] stg = new Object[]{nbc, Mec, nom, datebc, montantdev, montantbc, md, ad, avance, codeB, nbmois};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", "totale =", tt, "", "", "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
        }
    }

    private void MATF2KeyReleased(KeyEvent evt) {
        this.m1.setSelectedIndex(0);
        this.m1.enable(false);
        this.a1.enable(false);
        try {
            int montantnet = Integer.parseInt(this.MATF2.getText());
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
                ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.MATF2.getText());
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    String nomfr = result3.getString("NOMSOC");
                    this.nf.setText(nomfr);
                    test = true;
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
            }
            if (test) {
                this.m1.enable(true);
                this.a1.enable(true);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.a1.setText("");
        }
    }

    private void MATF2MouseClicked(MouseEvent evt) {
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
        String datdd = dateFormatt.format(actuellEe);
        String jours = datdd.substring(0, datdd.length() - 8);
        String mois2 = datdd.substring(3, datdd.length() - 5);
        int ms = Integer.parseInt(mois2);
        String ann\u00e9es = datdd.substring(6, datdd.length());
        this.a1.setText(ann\u00e9es);
        switch (ms) {
            case 1: {
                this.m1.setSelectedIndex(1);
                break;
            }
            case 2: {
                this.m1.setSelectedIndex(2);
                break;
            }
            case 3: {
                this.m1.setSelectedIndex(3);
                break;
            }
            case 4: {
                this.m1.setSelectedIndex(4);
                break;
            }
            case 5: {
                this.m1.setSelectedIndex(5);
                break;
            }
            case 6: {
                this.m1.setSelectedIndex(6);
                break;
            }
            case 7: {
                this.m1.setSelectedIndex(7);
                break;
            }
            case 8: {
                this.m1.setSelectedIndex(8);
                break;
            }
            case 9: {
                this.m1.setSelectedIndex(9);
                break;
            }
            case 10: {
                this.m1.setSelectedIndex(10);
                break;
            }
            case 11: {
                this.m1.setSelectedIndex(11);
                break;
            }
            case 12: {
                this.m1.setSelectedIndex(12);
                break;
            }
            default: {
                this.m1.setSelectedIndex(0);
            }
        }
    }

    private void MATF2ActionPerformed(ActionEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
    }

    private void mcMouseClicked(MouseEvent evt) {
    }

    private void mcActionPerformed(ActionEvent evt) {
    }

    private void mcKeyReleased(KeyEvent evt) {
    }

    private void nbmoiMouseClicked(MouseEvent evt) {
    }

    private void nbmoiActionPerformed(ActionEvent evt) {
    }

    private void nbmoiKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.nbmoi.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.nbmoi.setText("");
        }
    }

    private void annedebut1MouseClicked(MouseEvent evt) {
    }

    private void annedebut1ActionPerformed(ActionEvent evt) {
    }

    private void annedebut1KeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.a1.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.a1.setText("");
        }
    }

    private void nbcMouseClicked(MouseEvent evt) {
    }

    private void nbcKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.nbc.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.nbc.setText("");
        }
    }

    private void MATFMouseClicked(MouseEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.mecano.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Erreure : il faut saisir le Mecano d'adherent");
        } else if (this.k == 1) {
            this.MATF2.enable(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erreure : Adherent n'existe pas");
        }
    }

    private void MATFActionPerformed(ActionEvent evt) {
    }

    private void MATFKeyReleased(KeyEvent evt) {
    }

    private void jButton20ActionPerformed(ActionEvent evt) {
        block25 : {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                state.executeUpdate("UPDATE bc SET Mecano='" + this.mecano.getText() + "', matf='" + this.MATF.getText() + "', nbc='" + this.nbc.getText() + "', datebc='" + this.date.getText() + "', moisdebut='" + this.mc.getText() + "', anneesdebut='" + this.annedebut1.getText() + "', montantbc='" + this.montbc.getText() + "', montantdevis='" + this.dev.getText() + "', nbmois='" + this.nbmoi.getText() + "', codeb='" + this.codebc.getText() + "', accompte='" + this.acc.getText() + "' WHERE matf='" + this.matt + "' AND nbc='" + this.nb + "' AND anneesdebut='" + this.anned + "'");
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Succes de modification  ", "Information", 1);
                this.nb = "";
                this.matt = "";
                this.anned = "";
                this.nbc.enable(false);
                this.mecano.enable(false);
                this.date.enable(false);
                this.MATF.enable(false);
                this.annedebut1.enable(false);
                this.dev.enable(false);
                this.codebc.enable(false);
                this.nbmoi.enable(false);
                this.mc.enable(false);
                this.acc.enable(false);
                this.montbc.enable(false);
                this.acc.setText("");
                this.montbc.setText("");
                this.codeactive.setText("");
                this.nbc.setText("");
                this.mecano.setText("");
                this.date.setText("");
                this.MATF.setText("");
                this.annedebut1.setText("");
                this.dev.setText("");
                this.codebc.setText("");
                this.nbmoi.setText("");
                this.mc.setText("");
                this.nomadh.setText("");
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("N\u00b0BC");
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom");
                dt1.addColumn("datebc");
                dt1.addColumn("Mont-DEV");
                dt1.addColumn("Mont-BC");
                dt1.addColumn("MC");
                dt1.addColumn("AD");
                dt1.addColumn("Accpt");
                dt1.addColumn("code B");
                dt1.addColumn("NB-M");
                this.jTable1.setModel(dt1);
                try {
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                }
                catch (SQLException ex) {
                    Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                }
                String mm = this.m1.getSelectedItem().toString();
                if (mm.equals("00")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        int totale = 0;
                        Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state2 = conn22.createStatement();
                        System.out.println("matf='" + this.MATF2.getText());
                        System.out.println("nneesdebut=" + this.a1.getText());
                        ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' ORDER BY nbc");
                        while (result2.next()) {
                            JOptionPane jop3;
                            ResultSet result3;
                            ResultSetMetaData resultMeta3;
                            Statement state3;
                            String nomadh = "";
                            int md = Integer.parseInt(result2.getString("moisdebut"));
                            String avance = result2.getString("accompte");
                            int ad = Integer.parseInt(result2.getString("anneesdebut"));
                            String nbc = result2.getString("nbc");
                            String Mec = result2.getString("Mecano");
                            boolean kk = false;
                            String nom = "";
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state3 = conn2.createStatement();
                                result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                resultMeta3 = result3.getMetaData();
                                while (result3.next()) {
                                    nom = result3.getString("nom");
                                    kk = true;
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                            }
                            if (this.k == 0) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn2.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                    resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                }
                            }
                            String datebc = result2.getString("datebc");
                            System.out.println("*********************");
                            this.k = 0;
                            String montantbc = result2.getString("montantbc");
                            montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                            String montantDEV = result2.getString("montantdevis");
                            int ms = Integer.parseInt(montantDEV);
                            totale += ms;
                            montantDEV = new StringBuilder(montantDEV).insert(montantDEV.length() - 3, ".").toString();
                            String nbmois = result2.getString("nbmois");
                            String codeB = result2.getString("codeb");
                            Object[] stg = new Object[]{nbc, Mec, nom, datebc, montantDEV, montantbc, md, ad, avance, codeB, nbmois};
                            dt1.addRow(stg);
                            ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                        }
                        String tt = "" + totale + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "", "totale =", tt, "", "", "", "", ""};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                    }
                    break block25;
                }
                int totale = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn23 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn23.createStatement();
                    System.out.println("matf='" + this.MATF2.getText());
                    System.out.println("nneesdebut=" + this.a1.getText());
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' AND moisdebut='" + mm + "'  ORDER BY nbc");
                    while (result2.next()) {
                        ResultSetMetaData resultMeta3;
                        Statement state3;
                        ResultSet result3;
                        JOptionPane jop3;
                        String nomadh = "";
                        String nbc = result2.getString("nbc");
                        String Mec = result2.getString("Mecano");
                        int md = Integer.parseInt(result2.getString("moisdebut"));
                        String avance = result2.getString("accompte");
                        int ad = Integer.parseInt(result2.getString("anneesdebut"));
                        boolean kk = false;
                        String nom = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                        if (this.k == 0) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state3 = conn2.createStatement();
                                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                resultMeta3 = result3.getMetaData();
                                while (result3.next()) {
                                    nom = result3.getString("nom");
                                    kk = true;
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                            }
                        }
                        String datebc = result2.getString("datebc");
                        System.out.println("*********************");
                        this.k = 0;
                        String montantbc = result2.getString("montantbc");
                        montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                        String montdevi = result2.getString("montantdevis");
                        int ms = Integer.parseInt(montdevi);
                        totale += ms;
                        montdevi = new StringBuilder(montdevi).insert(montdevi.length() - 3, ".").toString();
                        String nbmois = result2.getString("nbmois");
                        String codeB = result2.getString("codeb");
                        Object[] stg = new Object[]{nbc, Mec, nom, datebc, montdevi, montantbc, md, ad, avance, codeB, nbmois};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    }
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    Object[] stg = new Object[]{"", "", "", "", "totale =", tt, "", "", "", "", ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }
            catch (Exception e) {
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de modification :Bon de commande d\u00e9ja existe : " + e.getMessage());
            }
        }
    }

    private void devMouseClicked(MouseEvent evt) {
    }

    private void devActionPerformed(ActionEvent evt) {
    }

    private void devKeyReleased(KeyEvent evt) {
    }

    private void dateMouseClicked(MouseEvent evt) {
    }

    private void dateActionPerformed(ActionEvent evt) {
    }

    private void dateKeyReleased(KeyEvent evt) {
    }

    private void montbcMouseClicked(MouseEvent evt) {
    }

    private void montbcActionPerformed(ActionEvent evt) {
    }

    private void montbcKeyReleased(KeyEvent evt) {
    }

    private void codeactiveKeyPressed(KeyEvent evt) {
    }

    private void codeactiveKeyReleased(KeyEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean kk = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String c = "code";
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM login  WHERE login='" + c + "' AND mp='" + this.codeactive.getText() + "'");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                kk = true;
            }
        }
        catch (Exception e) {
            // empty catch block
        }
        if (kk) {
            this.jButton20.setVisible(true);
        } else {
            this.jButton20.setVisible(false);
        }
    }

    private void m1ActionPerformed(ActionEvent evt) {
    }

    private void nbcActionPerformed(ActionEvent evt) {
    }

    private void jTable1MouseClicked(MouseEvent evt) {
        JOptionPane jop3;
        ResultSet result3;
        Statement state3;
        ResultSetMetaData resultMeta3;
        this.jButton20.setVisible(false);
        int lign = this.jTable1.getSelectedRow();
        System.out.println(" ling =" + lign);
        this.nbc.setText(this.jTable1.getModel().getValueAt(lign, 0).toString());
        this.nb = this.jTable1.getModel().getValueAt(lign, 0).toString();
        this.mecano.setText(this.jTable1.getModel().getValueAt(lign, 1).toString());
        String m = this.jTable1.getModel().getValueAt(lign, 1).toString();
        this.date.setText(this.jTable1.getModel().getValueAt(lign, 3).toString());
        this.MATF.setText(this.MATF2.getText());
        this.matt = this.MATF2.getText();
        String mbc = this.jTable1.getModel().getValueAt(lign, 4).toString().replace(".", "");
        this.dev.setText(mbc);
        String mnet = this.jTable1.getModel().getValueAt(lign, 5).toString().replace(".", "");
        this.montbc.setText(mnet);
        this.mc.setText(this.jTable1.getModel().getValueAt(lign, 6).toString());
        this.annedebut1.setText(this.jTable1.getModel().getValueAt(lign, 7).toString());
        this.anned = this.annedebut1.getText();
        this.acc.setText(this.jTable1.getModel().getValueAt(lign, 8).toString().replace(".", ""));
        this.codebc.setText(this.jTable1.getModel().getValueAt(lign, 9).toString());
        this.nbmoi.setText(this.jTable1.getModel().getValueAt(lign, 10).toString());
        this.k = 0;
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state3 = conn2.createStatement();
            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + m);
            resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nomadh.setText(result3.getString("nom"));
                this.k = 1;
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur S" + e.getMessage());
        }
        if (this.k == 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + m);
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.nomadh.setText(result3.getString("nom"));
                    this.k = 1;
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur R" + e.getMessage());
            }
        }
        this.k = 0;
        this.nbc.enable(true);
        this.mecano.enable(true);
        this.date.enable(true);
        this.MATF.enable(true);
        this.annedebut1.enable(true);
        this.dev.enable(true);
        this.codebc.enable(true);
        this.nbmoi.enable(true);
        this.mc.enable(true);
        this.montbc.enable(true);
        this.acc.enable(true);
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void accMouseClicked(MouseEvent evt) {
    }

    private void accActionPerformed(ActionEvent evt) {
    }

    private void accKeyReleased(KeyEvent evt) {
    }

}

