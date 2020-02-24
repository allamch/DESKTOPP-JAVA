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
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class etat
extends JPanel {
    int test = 0;
    String moiactueleenlettre = "";
    String moia = "";
    private JRadioButton D;
    private JRadioButton MC;
    private JTextField a1;
    private JTextField a2;
    private JLabel annedebut2;
    private JLabel annedebut3;
    private JLabel annefin;
    private JLabel annefin1;
    private ButtonGroup buttonGroup1;
    private ButtonGroup g1;
    private JComboBox j1;
    private JComboBox j2;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel16;
    private JPanel jPanel2;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JTextField jTextField1;
    private JComboBox m1;
    private JComboBox m2;
    private JLabel moisdebut;
    private JLabel moisfin;
    private JRadioButton pretfdd;
    private JRadioButton pretfdd1;
    private JRadioButton pretfdd2;

    public etat() {
        this.initComponents();
    }

    private void initComponents() {
        this.g1 = new ButtonGroup();
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel1 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jPanel2 = new JPanel();
        this.jPanel16 = new JPanel();
        this.jScrollPane2 = new JScrollPane();
        this.jTable1 = new JTable();
        this.m1 = new JComboBox();
        this.moisdebut = new JLabel();
        this.moisfin = new JLabel();
        this.m2 = new JComboBox();
        this.annedebut2 = new JLabel();
        this.annefin = new JLabel();
        this.a2 = new JTextField();
        this.a1 = new JTextField();
        this.annefin1 = new JLabel();
        this.annedebut3 = new JLabel();
        this.j2 = new JComboBox();
        this.j1 = new JComboBox();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel8 = new JLabel();
        this.pretfdd = new JRadioButton();
        this.pretfdd1 = new JRadioButton();
        this.pretfdd2 = new JRadioButton();
        this.jLabel9 = new JLabel();
        this.D = new JRadioButton();
        this.MC = new JRadioButton();
        this.jTextField1 = new JTextField();
        this.jPanel1.setLayout(null);
        this.jLabel7.setFont(new Font("Tahoma", 1, 24));
        this.jLabel7.setText("Etat des Prets");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(220, 0, 430, 29);
        this.jPanel2.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jScrollPane2.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane2.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane2.setName("");
        this.jScrollPane2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.jScrollPane2MouseClicked(evt);
            }
        });
        this.jTable1.setFont(new Font("Tahoma", 0, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}}, new String[]{"N\u00b0 BC", "Mecano", "Nom", "Date", "Montant", "BQ", "NB mois", "MC"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.setRowHeight(30);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                etat.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                etat.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane2.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(10, 120, 730, 400);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.setEnabled(false);
        this.m1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.m1MouseClicked(evt);
            }
        });
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etat.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.m1);
        this.m1.setBounds(470, 40, 50, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setText("Mois :");
        this.jPanel16.add(this.moisdebut);
        this.moisdebut.setBounds(420, 40, 50, 30);
        this.moisfin.setFont(new Font("Tahoma", 1, 14));
        this.moisfin.setForeground(new Color(153, 0, 0));
        this.moisfin.setText("Mois :");
        this.jPanel16.add(this.moisfin);
        this.moisfin.setBounds(420, 80, 50, 30);
        this.m2.setFont(new Font("Tahoma", 1, 12));
        this.m2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", ""}));
        this.m2.setEnabled(false);
        this.m2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.m2MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                etat.this.m2MouseEntered(evt);
            }
        });
        this.jPanel16.add(this.m2);
        this.m2.setBounds(470, 80, 50, 30);
        this.annedebut2.setFont(new Font("Tahoma", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 0));
        this.annedebut2.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annedebut2);
        this.annedebut2.setBounds(540, 40, 50, 30);
        this.annefin.setFont(new Font("Tahoma", 1, 14));
        this.annefin.setForeground(new Color(153, 0, 0));
        this.annefin.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annefin);
        this.annefin.setBounds(540, 80, 50, 30);
        this.a2.setEnabled(false);
        this.a2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.a2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a2);
        this.a2.setBounds(590, 80, 80, 30);
        this.a1.setEnabled(false);
        this.a1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.a1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a1);
        this.a1.setBounds(590, 40, 80, 30);
        this.annefin1.setFont(new Font("Tahoma", 1, 14));
        this.annefin1.setForeground(new Color(153, 0, 0));
        this.annefin1.setText("Jour:");
        this.jPanel16.add(this.annefin1);
        this.annefin1.setBounds(310, 80, 40, 30);
        this.annedebut3.setFont(new Font("Tahoma", 1, 14));
        this.annedebut3.setForeground(new Color(153, 0, 0));
        this.annedebut3.setText("Jour:");
        this.jPanel16.add(this.annedebut3);
        this.annedebut3.setBounds(310, 40, 40, 30);
        this.j2.setFont(new Font("Tahoma", 1, 12));
        this.j2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j2.setEnabled(false);
        this.j2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.j2MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                etat.this.j2MouseEntered(evt);
            }
        });
        this.jPanel16.add(this.j2);
        this.j2.setBounds(350, 80, 60, 30);
        this.j1.setFont(new Font("Tahoma", 1, 12));
        this.j1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j1.setEnabled(false);
        this.j1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.j1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.j1);
        this.j1.setBounds(350, 40, 60, 30);
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setForeground(new Color(102, 0, 102));
        this.jLabel1.setText("A :");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(270, 80, 30, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setForeground(new Color(102, 0, 102));
        this.jLabel3.setText("du :");
        this.jPanel16.add(this.jLabel3);
        this.jLabel3.setBounds(270, 40, 30, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etat.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(610, 10, 100, 30);
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setForeground(new Color(0, 51, 51));
        this.jLabel8.setText("Recherche par :");
        this.jPanel16.add(this.jLabel8);
        this.jLabel8.setBounds(10, 50, 110, 20);
        this.g1.add(this.pretfdd);
        this.pretfdd.setFont(new Font("Tahoma", 1, 14));
        this.pretfdd.setForeground(new Color(0, 0, 255));
        this.pretfdd.setText("Pret FDD");
        this.pretfdd.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.pretfddMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.pretfdd);
        this.pretfdd.setBounds(130, 10, 93, 20);
        this.g1.add(this.pretfdd1);
        this.pretfdd1.setFont(new Font("Tahoma", 1, 14));
        this.pretfdd1.setForeground(new Color(0, 0, 255));
        this.pretfdd1.setText("Cession Fournissrure");
        this.pretfdd1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.pretfdd1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.pretfdd1);
        this.pretfdd1.setBounds(420, 10, 190, 20);
        this.g1.add(this.pretfdd2);
        this.pretfdd2.setFont(new Font("Tahoma", 1, 14));
        this.pretfdd2.setForeground(new Color(0, 0, 255));
        this.pretfdd2.setText("Cession Sur Salaire");
        this.pretfdd2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.pretfdd2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.pretfdd2);
        this.pretfdd2.setBounds(240, 10, 160, 20);
        this.jLabel9.setFont(new Font("Tahoma", 1, 14));
        this.jLabel9.setForeground(new Color(0, 51, 51));
        this.jLabel9.setText("Choisire l'etat :");
        this.jPanel16.add(this.jLabel9);
        this.jLabel9.setBounds(10, 10, 110, 20);
        this.buttonGroup1.add(this.D);
        this.D.setFont(new Font("Tahoma", 1, 14));
        this.D.setText("Date");
        this.D.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.DMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                etat.this.DMouseEntered(evt);
            }
        });
        this.jPanel16.add(this.D);
        this.D.setBounds(130, 40, 60, 30);
        this.buttonGroup1.add(this.MC);
        this.MC.setFont(new Font("Tahoma", 1, 14));
        this.MC.setText("M.C");
        this.MC.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etat.this.MCMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.MC);
        this.MC.setBounds(200, 40, 60, 30);
        this.jTextField1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel16.add(this.jTextField1);
        this.jTextField1.setBounds(265, 40, 2, 70);
        this.jPanel2.add(this.jPanel16);
        this.jPanel16.setBounds(0, 30, 750, 530);
        this.jPanel1.add(this.jPanel2);
        this.jPanel2.setBounds(0, 0, 750, 570);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 760, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 577, -2).addContainerGap(-1, 32767)));
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane2MouseClicked(MouseEvent evt) {
        int nm = this.jTable1.getSelectedRow();
        System.out.println("\u00e8_____" + nm);
        String np = this.jTable1.getModel().getValueAt(nm, 0).toString();
        System.out.println("\u00e8_____" + np);
    }

    private void m1MouseClicked(MouseEvent evt) {
        if (this.pretfdd.isSelected() && this.MC.isSelected()) {
            System.out.println("************");
            this.j1.enable(false);
            this.j2.enable(false);
            this.m2.enable(false);
            this.a2.enable(false);
            this.m1.enable(true);
            this.a1.enable(true);
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom");
            dt1.addColumn("Montant");
            dt1.addColumn("NB-M");
            dt1.addColumn("D debut");
            dt1.addColumn("D fin");
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
            this.jTable1.setFillsViewportHeight(true);
            this.moiactueleenlettre = this.m1.getSelectedItem().toString().equals("01") ? "Janvier" : (this.m1.getSelectedItem().toString().equals("02") ? "F\u00e9vrier" : (this.m1.getSelectedItem().toString().equals("03") ? "Mars" : (this.m1.getSelectedItem().toString().equals("04") ? "Avril" : (this.m1.getSelectedItem().toString().equals("05") ? "Mai" : (this.m1.getSelectedItem().toString().equals("06") ? "Juin" : (this.m1.getSelectedItem().toString().equals("07") ? "Juillet" : (this.m1.getSelectedItem().toString().equals("08") ? "Ao\u00fbt" : (this.m1.getSelectedItem().toString().equals("09") ? "Septembre" : (this.m1.getSelectedItem().toString().equals("10") ? "Octobre" : (this.m1.getSelectedItem().toString().equals("11") ? "Novembre" : (this.m1.getSelectedItem().toString().equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
            String dated = this.moiactueleenlettre + "  " + this.a1.getText();
            System.out.println("date debut " + dated);
            int montantparmois = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int totale = 0;
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd WHERE datedebut ='" + dated + "' ORDER BY nbch");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    JOptionPane jop3;
                    Statement state3;
                    ResultSetMetaData resultMeta3;
                    ResultSet result3;
                    Connection conn3;
                    String dt = "";
                    dt = result2.getString("date");
                    y = true;
                    System.out.println("---------2222222222-----");
                    String nbc = result2.getString("nbch");
                    System.out.println("nbc = " + nbc);
                    String Mec = result2.getString("Mecano");
                    boolean kk = false;
                    String nom = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state3 = conn3.createStatement();
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
                    if (!kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state3 = conn3.createStatement();
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
                    String datedebutt = result2.getString("datedebut");
                    String datefinn = result2.getString("datefin");
                    System.out.println("*********************");
                    kk = false;
                    String montantbc = result2.getString("Montant");
                    System.out.println("Montant 1=  " + montantbc);
                    montantbc = montantbc.replaceAll(",", "");
                    System.out.println("Montant 2=  " + montantbc);
                    int t = Integer.parseInt(montantbc);
                    System.out.println("montant = " + montantbc);
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    System.out.println("montant 2= " + montantbc);
                    String nbmois = result2.getString("Nbmois");
                    int nb = Integer.parseInt(nbmois);
                    int mpm = t / nb;
                    montantparmois += mpm;
                    totale += t;
                    String Ncheque = result2.getString("numcheque");
                    Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                if (y) {
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        } else {
            this.a2.enable(false);
            try {
                Connection conn4 = null;
                try {
                    conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                }
                catch (SQLException ex) {
                    Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("N\u00b0");
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom");
                dt1.addColumn("Montant");
                dt1.addColumn("NB-M");
                dt1.addColumn("D debut");
                dt1.addColumn("D fin");
                dt1.addColumn("N\u00b0 cheque");
                dt1.addColumn("Dte");
                this.jTable1.setModel(dt1);
                this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                this.jTable1.setFillsViewportHeight(true);
                int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
                int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
                int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
                int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
                int anne1 = Integer.parseInt(this.a1.getText());
                int anne2 = Integer.parseInt(this.a2.getText());
                String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                int montantparmois = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    int totale = 0;
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                    System.out.println("dtt debut = " + datedebu);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date datedebut = sdf.parse(datedebu);
                    System.out.println("dtt fin = " + datedefi);
                    Date datedefin = sdf.parse(datedefi);
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd ORDER BY nbch");
                    System.out.println("-------55555555555555555-------");
                    boolean y = false;
                    while (result2.next()) {
                        ResultSetMetaData resultMeta3;
                        JOptionPane jop3;
                        Statement state3;
                        ResultSet result3;
                        String dt = "";
                        dt = result2.getString("date");
                        System.out.println("dt = " + dt);
                        Date d1 = sdf.parse(dt);
                        System.out.println("d1 = " + d1);
                        System.out.println("--------------");
                        if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                        y = true;
                        System.out.println("---------2222222222-----");
                        String nbc = result2.getString("nbch");
                        System.out.println("nbc = " + nbc);
                        String Mec = result2.getString("Mecano");
                        boolean kk = false;
                        String nom = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn4.createStatement();
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
                        if (!kk) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state3 = conn4.createStatement();
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
                        String datedebutt = result2.getString("datedebut");
                        String datefinn = result2.getString("datefin");
                        System.out.println("*********************");
                        kk = false;
                        String montantbc = result2.getString("Montant");
                        System.out.println("Montant 1=  " + montantbc);
                        montantbc = montantbc.replaceAll(",", "");
                        System.out.println("Montant 2=  " + montantbc);
                        int t = Integer.parseInt(montantbc);
                        System.out.println("montant = " + montantbc);
                        montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                        System.out.println("montant 2= " + montantbc);
                        String nbmois = result2.getString("Nbmois");
                        int nb = Integer.parseInt(nbmois);
                        int mpm = t / nb;
                        montantparmois += mpm;
                        totale += t;
                        String Ncheque = result2.getString("numcheque");
                        Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    }
                    if (y) {
                        String tt = "" + totale + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
                }
                String tt = "" + montantparmois + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
            }
            catch (Exception e) {
                // empty catch block
            }
        }
    }

    private void m1ActionPerformed(ActionEvent evt) {
    }

    private void m2MouseClicked(MouseEvent evt) {
        this.a2.enable(false);
        try {
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom");
            dt1.addColumn("Montant");
            dt1.addColumn("NB-M");
            dt1.addColumn("D debut");
            dt1.addColumn("D fin");
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
            this.jTable1.setFillsViewportHeight(true);
            int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
            int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
            int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
            int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
            int anne1 = Integer.parseInt(this.a1.getText());
            int anne2 = Integer.parseInt(this.a2.getText());
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            int montantparmois = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int totale = 0;
                Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn22.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd ORDER BY nbch");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    ResultSetMetaData resultMeta3;
                    JOptionPane jop3;
                    Statement state3;
                    ResultSet result3;
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    System.out.println("---------2222222222-----");
                    String nbc = result2.getString("nbch");
                    System.out.println("nbc = " + nbc);
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
                    if (!kk) {
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
                    String datedebutt = result2.getString("datedebut");
                    String datefinn = result2.getString("datefin");
                    System.out.println("*********************");
                    kk = false;
                    String montantbc = result2.getString("Montant");
                    System.out.println("Montant 1=  " + montantbc);
                    montantbc = montantbc.replaceAll(",", "");
                    System.out.println("Montant 2=  " + montantbc);
                    int t = Integer.parseInt(montantbc);
                    System.out.println("montant = " + montantbc);
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    System.out.println("montant 2= " + montantbc);
                    String nbmois = result2.getString("Nbmois");
                    int nb = Integer.parseInt(nbmois);
                    int mpm = t / nb;
                    montantparmois += mpm;
                    totale += t;
                    String Ncheque = result2.getString("numcheque");
                    Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                if (y) {
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
            String tt = "" + montantparmois + "";
            tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    private void a2MouseClicked(MouseEvent evt) {
        this.a2.enable(false);
        try {
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom");
            dt1.addColumn("Montant");
            dt1.addColumn("NB-M");
            dt1.addColumn("D debut");
            dt1.addColumn("D fin");
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
            this.jTable1.setFillsViewportHeight(true);
            int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
            int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
            int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
            int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
            int anne1 = Integer.parseInt(this.a1.getText());
            int anne2 = Integer.parseInt(this.a2.getText());
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            int montantparmois = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int totale = 0;
                Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn22.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd ORDER BY nbch");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    ResultSetMetaData resultMeta3;
                    JOptionPane jop3;
                    Statement state3;
                    ResultSet result3;
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    System.out.println("---------2222222222-----");
                    String nbc = result2.getString("nbch");
                    System.out.println("nbc = " + nbc);
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
                    if (!kk) {
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
                    String datedebutt = result2.getString("datedebut");
                    String datefinn = result2.getString("datefin");
                    System.out.println("*********************");
                    kk = false;
                    String montantbc = result2.getString("Montant");
                    System.out.println("Montant 1=  " + montantbc);
                    montantbc = montantbc.replaceAll(",", "");
                    System.out.println("Montant 2=  " + montantbc);
                    int t = Integer.parseInt(montantbc);
                    System.out.println("montant = " + montantbc);
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    System.out.println("montant 2= " + montantbc);
                    String nbmois = result2.getString("Nbmois");
                    int nb = Integer.parseInt(nbmois);
                    int mpm = t / nb;
                    montantparmois += mpm;
                    totale += t;
                    String Ncheque = result2.getString("numcheque");
                    Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                if (y) {
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
            String tt = "" + montantparmois + "";
            tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    private void a1MouseClicked(MouseEvent evt) {
        if (this.pretfdd.isSelected() && this.MC.isSelected()) {
            System.out.println("************");
            this.j1.enable(false);
            this.j2.enable(false);
            this.m2.enable(false);
            this.a2.enable(false);
            this.m1.enable(true);
            this.a1.enable(true);
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom");
            dt1.addColumn("Montant");
            dt1.addColumn("NB-M");
            dt1.addColumn("D debut");
            dt1.addColumn("D fin");
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
            this.jTable1.setFillsViewportHeight(true);
            this.moiactueleenlettre = this.m1.getSelectedItem().toString().equals("01") ? "Janvier" : (this.m1.getSelectedItem().toString().equals("02") ? "F\u00e9vrier" : (this.m1.getSelectedItem().toString().equals("03") ? "Mars" : (this.m1.getSelectedItem().toString().equals("04") ? "Avril" : (this.m1.getSelectedItem().toString().equals("05") ? "Mai" : (this.m1.getSelectedItem().toString().equals("06") ? "Juin" : (this.m1.getSelectedItem().toString().equals("07") ? "Juillet" : (this.m1.getSelectedItem().toString().equals("08") ? "Ao\u00fbt" : (this.m1.getSelectedItem().toString().equals("09") ? "Septembre" : (this.m1.getSelectedItem().toString().equals("10") ? "Octobre" : (this.m1.getSelectedItem().toString().equals("11") ? "Novembre" : (this.m1.getSelectedItem().toString().equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
            String dated = this.moiactueleenlettre + "  " + this.a1.getText();
            System.out.println("date debut " + dated);
            int montantparmois = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int totale = 0;
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd WHERE datedebut ='" + dated + "' ORDER BY nbch");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    JOptionPane jop3;
                    Statement state3;
                    ResultSetMetaData resultMeta3;
                    ResultSet result3;
                    Connection conn3;
                    String dt = "";
                    dt = result2.getString("date");
                    y = true;
                    System.out.println("---------2222222222-----");
                    String nbc = result2.getString("nbch");
                    System.out.println("nbc = " + nbc);
                    String Mec = result2.getString("Mecano");
                    boolean kk = false;
                    String nom = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state3 = conn3.createStatement();
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
                    if (!kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state3 = conn3.createStatement();
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
                    String datedebutt = result2.getString("datedebut");
                    String datefinn = result2.getString("datefin");
                    System.out.println("*********************");
                    kk = false;
                    String montantbc = result2.getString("Montant");
                    System.out.println("Montant 1=  " + montantbc);
                    montantbc = montantbc.replaceAll(",", "");
                    System.out.println("Montant 2=  " + montantbc);
                    int t = Integer.parseInt(montantbc);
                    System.out.println("montant = " + montantbc);
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    System.out.println("montant 2= " + montantbc);
                    String nbmois = result2.getString("Nbmois");
                    int nb = Integer.parseInt(nbmois);
                    int mpm = t / nb;
                    montantparmois += mpm;
                    totale += t;
                    String Ncheque = result2.getString("numcheque");
                    Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                if (y) {
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        } else {
            this.a2.enable(false);
            try {
                Connection conn4 = null;
                try {
                    conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                }
                catch (SQLException ex) {
                    Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("N\u00b0");
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom");
                dt1.addColumn("Montant");
                dt1.addColumn("NB-M");
                dt1.addColumn("D debut");
                dt1.addColumn("D fin");
                dt1.addColumn("N\u00b0 cheque");
                dt1.addColumn("Date");
                this.jTable1.setModel(dt1);
                this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                this.jTable1.setFillsViewportHeight(true);
                int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
                int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
                int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
                int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
                int anne1 = Integer.parseInt(this.a1.getText());
                int anne2 = Integer.parseInt(this.a2.getText());
                String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                int montantparmois = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    int totale = 0;
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                    System.out.println("dtt debut = " + datedebu);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date datedebut = sdf.parse(datedebu);
                    System.out.println("dtt fin = " + datedefi);
                    Date datedefin = sdf.parse(datedefi);
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd ORDER BY nbch");
                    System.out.println("-------55555555555555555-------");
                    boolean y = false;
                    while (result2.next()) {
                        ResultSetMetaData resultMeta3;
                        JOptionPane jop3;
                        Statement state3;
                        ResultSet result3;
                        String dt = "";
                        dt = result2.getString("date");
                        System.out.println("dt = " + dt);
                        Date d1 = sdf.parse(dt);
                        System.out.println("d1 = " + d1);
                        System.out.println("--------------");
                        if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                        y = true;
                        System.out.println("---------2222222222-----");
                        String nbc = result2.getString("nbch");
                        System.out.println("nbc = " + nbc);
                        String Mec = result2.getString("Mecano");
                        boolean kk = false;
                        String nom = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn4.createStatement();
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
                        if (!kk) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state3 = conn4.createStatement();
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
                        String datedebutt = result2.getString("datedebut");
                        String datefinn = result2.getString("datefin");
                        System.out.println("*********************");
                        kk = false;
                        String montantbc = result2.getString("Montant");
                        System.out.println("Montant 1=  " + montantbc);
                        montantbc = montantbc.replaceAll(",", "");
                        System.out.println("Montant 2=  " + montantbc);
                        int t = Integer.parseInt(montantbc);
                        System.out.println("montant = " + montantbc);
                        montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                        System.out.println("montant 2= " + montantbc);
                        String nbmois = result2.getString("Nbmois");
                        int nb = Integer.parseInt(nbmois);
                        int mpm = t / nb;
                        montantparmois += mpm;
                        totale += t;
                        String Ncheque = result2.getString("numcheque");
                        Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    }
                    if (y) {
                        String tt = "" + totale + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
                }
                String tt = "" + montantparmois + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
            }
            catch (Exception e) {
                // empty catch block
            }
        }
    }

    private void j2MouseClicked(MouseEvent evt) {
        this.a2.enable(false);
        try {
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom");
            dt1.addColumn("Montant");
            dt1.addColumn("NB-M");
            dt1.addColumn("D debut");
            dt1.addColumn("D fin");
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
            this.jTable1.setFillsViewportHeight(true);
            int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
            int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
            int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
            int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
            int anne1 = Integer.parseInt(this.a1.getText());
            int anne2 = Integer.parseInt(this.a2.getText());
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            int montantparmois = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int totale = 0;
                Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn22.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd ORDER BY nbch");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    ResultSetMetaData resultMeta3;
                    JOptionPane jop3;
                    Statement state3;
                    ResultSet result3;
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    System.out.println("---------2222222222-----");
                    String nbc = result2.getString("nbch");
                    System.out.println("nbc = " + nbc);
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
                    if (!kk) {
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
                    String datedebutt = result2.getString("datedebut");
                    String datefinn = result2.getString("datefin");
                    System.out.println("*********************");
                    kk = false;
                    String montantbc = result2.getString("Montant");
                    System.out.println("Montant 1=  " + montantbc);
                    montantbc = montantbc.replaceAll(",", "");
                    System.out.println("Montant 2=  " + montantbc);
                    int t = Integer.parseInt(montantbc);
                    System.out.println("montant = " + montantbc);
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    System.out.println("montant 2= " + montantbc);
                    String nbmois = result2.getString("Nbmois");
                    int nb = Integer.parseInt(nbmois);
                    int mpm = t / nb;
                    montantparmois += mpm;
                    totale += t;
                    String Ncheque = result2.getString("numcheque");
                    Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                if (y) {
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
            String tt = "" + montantparmois + "";
            tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    private void j1MouseClicked(MouseEvent evt) {
        this.a2.enable(false);
        try {
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom");
            dt1.addColumn("Montant");
            dt1.addColumn("NB-M");
            dt1.addColumn("D debut");
            dt1.addColumn("D fin");
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
            this.jTable1.setFillsViewportHeight(true);
            int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
            int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
            int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
            int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
            int anne1 = Integer.parseInt(this.a1.getText());
            int anne2 = Integer.parseInt(this.a2.getText());
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            int montantparmois = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int totale = 0;
                Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn22.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd ORDER BY nbch");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    ResultSetMetaData resultMeta3;
                    JOptionPane jop3;
                    Statement state3;
                    ResultSet result3;
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    System.out.println("---------2222222222-----");
                    String nbc = result2.getString("nbch");
                    System.out.println("nbc = " + nbc);
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
                    if (!kk) {
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
                    String datedebutt = result2.getString("datedebut");
                    String datefinn = result2.getString("datefin");
                    System.out.println("*********************");
                    kk = false;
                    String montantbc = result2.getString("Montant");
                    System.out.println("Montant 1=  " + montantbc);
                    montantbc = montantbc.replaceAll(",", "");
                    System.out.println("Montant 2=  " + montantbc);
                    int t = Integer.parseInt(montantbc);
                    System.out.println("montant = " + montantbc);
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    System.out.println("montant 2= " + montantbc);
                    String nbmois = result2.getString("Nbmois");
                    int nb = Integer.parseInt(nbmois);
                    int mpm = t / nb;
                    montantparmois += mpm;
                    totale += t;
                    String Ncheque = result2.getString("numcheque");
                    Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                if (y) {
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
            String tt = "" + montantparmois + "";
            tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat("Etat FDD Mois :" + this.m1.getSelectedItem().toString());
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void pretfddMouseClicked(MouseEvent evt) {
    }

    private void pretfdd1MouseClicked(MouseEvent evt) {
    }

    private void pretfdd2MouseClicked(MouseEvent evt) {
    }

    private void DMouseClicked(MouseEvent evt) {
        if (this.pretfdd.isSelected()) {
            this.j1.enable(true);
            this.j2.enable(true);
            this.m2.enable(true);
            this.a2.enable(true);
            Date actuellEe = new Date();
            SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
            String datdd = dateFormatt.format(actuellEe);
            String jours = datdd.substring(0, datdd.length() - 8);
            String mois2 = datdd.substring(3, datdd.length() - 5);
            int ms = Integer.parseInt(mois2);
            String jj = this.j1.getSelectedItem().toString();
            if (jj.equals("00")) {
                switch (ms) {
                    case 1: {
                        this.m1.setSelectedIndex(1);
                        this.m2.setSelectedIndex(1);
                        break;
                    }
                    case 2: {
                        this.m1.setSelectedIndex(2);
                        this.m2.setSelectedIndex(2);
                        break;
                    }
                    case 3: {
                        this.m1.setSelectedIndex(3);
                        this.m2.setSelectedIndex(3);
                        break;
                    }
                    case 4: {
                        this.m1.setSelectedIndex(4);
                        this.m2.setSelectedIndex(4);
                        break;
                    }
                    case 5: {
                        this.m1.setSelectedIndex(5);
                        this.m2.setSelectedIndex(5);
                        break;
                    }
                    case 6: {
                        this.m1.setSelectedIndex(6);
                        this.m2.setSelectedIndex(6);
                        break;
                    }
                    case 7: {
                        this.m1.setSelectedIndex(7);
                        this.m2.setSelectedIndex(7);
                        break;
                    }
                    case 8: {
                        this.m1.setSelectedIndex(8);
                        this.m2.setSelectedIndex(8);
                        break;
                    }
                    case 9: {
                        this.m1.setSelectedIndex(9);
                        this.m2.setSelectedIndex(9);
                        break;
                    }
                    case 10: {
                        this.m1.setSelectedIndex(10);
                        this.m2.setSelectedIndex(10);
                        break;
                    }
                    case 11: {
                        this.m1.setSelectedIndex(11);
                        this.m2.setSelectedIndex(11);
                        break;
                    }
                    case 12: {
                        this.m1.setSelectedIndex(12);
                        this.m2.setSelectedIndex(12);
                        break;
                    }
                    default: {
                        this.m1.setSelectedIndex(0);
                        this.m2.setSelectedIndex(0);
                    }
                }
                String ann\u00e9es = datdd.substring(6, datdd.length());
                this.a1.setText(ann\u00e9es);
                this.a2.setText(ann\u00e9es);
                int j = Integer.parseInt(jours);
                switch (j) {
                    case 1: {
                        this.j1.setSelectedIndex(1);
                        this.j2.setSelectedIndex(1);
                        break;
                    }
                    case 2: {
                        this.j1.setSelectedIndex(2);
                        this.j2.setSelectedIndex(2);
                        break;
                    }
                    case 3: {
                        this.j1.setSelectedIndex(3);
                        this.j2.setSelectedIndex(3);
                        break;
                    }
                    case 4: {
                        this.j1.setSelectedIndex(4);
                        this.j2.setSelectedIndex(4);
                        break;
                    }
                    case 5: {
                        this.j1.setSelectedIndex(5);
                        this.j2.setSelectedIndex(5);
                        break;
                    }
                    case 6: {
                        this.j1.setSelectedIndex(6);
                        this.j2.setSelectedIndex(6);
                        break;
                    }
                    case 7: {
                        this.j1.setSelectedIndex(7);
                        this.j2.setSelectedIndex(7);
                        break;
                    }
                    case 8: {
                        this.j1.setSelectedIndex(8);
                        this.j2.setSelectedIndex(8);
                        break;
                    }
                    case 9: {
                        this.j1.setSelectedIndex(9);
                        this.j2.setSelectedIndex(9);
                        break;
                    }
                    case 10: {
                        this.j1.setSelectedIndex(10);
                        this.j2.setSelectedIndex(10);
                        break;
                    }
                    case 11: {
                        this.j1.setSelectedIndex(11);
                        this.j2.setSelectedIndex(11);
                        break;
                    }
                    case 12: {
                        this.j1.setSelectedIndex(12);
                        this.j2.setSelectedIndex(12);
                        break;
                    }
                    case 13: {
                        this.j1.setSelectedIndex(13);
                        this.j2.setSelectedIndex(13);
                        break;
                    }
                    case 14: {
                        this.j1.setSelectedIndex(14);
                        this.j2.setSelectedIndex(14);
                        break;
                    }
                    case 15: {
                        this.j1.setSelectedIndex(15);
                        this.j2.setSelectedIndex(15);
                        break;
                    }
                    case 16: {
                        this.j1.setSelectedIndex(16);
                        this.j2.setSelectedIndex(16);
                        break;
                    }
                    case 17: {
                        this.j1.setSelectedIndex(17);
                        this.j2.setSelectedIndex(17);
                        break;
                    }
                    case 18: {
                        this.j1.setSelectedIndex(18);
                        this.j2.setSelectedIndex(18);
                        break;
                    }
                    case 19: {
                        this.j1.setSelectedIndex(19);
                        this.j2.setSelectedIndex(19);
                        break;
                    }
                    case 20: {
                        this.j1.setSelectedIndex(20);
                        this.j2.setSelectedIndex(20);
                        break;
                    }
                    case 21: {
                        this.j1.setSelectedIndex(21);
                        this.j2.setSelectedIndex(21);
                        break;
                    }
                    case 22: {
                        this.j1.setSelectedIndex(22);
                        this.j2.setSelectedIndex(22);
                        break;
                    }
                    case 23: {
                        this.j1.setSelectedIndex(23);
                        this.j2.setSelectedIndex(23);
                        break;
                    }
                    case 24: {
                        this.j1.setSelectedIndex(24);
                        this.j2.setSelectedIndex(24);
                        break;
                    }
                    case 25: {
                        this.j1.setSelectedIndex(25);
                        this.j2.setSelectedIndex(25);
                        break;
                    }
                    case 26: {
                        this.j1.setSelectedIndex(26);
                        this.j2.setSelectedIndex(26);
                        break;
                    }
                    case 27: {
                        this.j1.setSelectedIndex(27);
                        this.j2.setSelectedIndex(27);
                        break;
                    }
                    case 28: {
                        this.j1.setSelectedIndex(28);
                        this.j2.setSelectedIndex(28);
                        break;
                    }
                    case 29: {
                        this.j1.setSelectedIndex(29);
                        this.j2.setSelectedIndex(29);
                        break;
                    }
                    case 30: {
                        this.j1.setSelectedIndex(30);
                        this.j2.setSelectedIndex(30);
                        break;
                    }
                    case 31: {
                        this.j1.setSelectedIndex(31);
                        this.j2.setSelectedIndex(31);
                        break;
                    }
                    default: {
                        this.j1.setSelectedIndex(0);
                        this.j2.setSelectedIndex(0);
                    }
                }
            }
            this.a2.enable(false);
            try {
                Connection conn2 = null;
                try {
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                }
                catch (SQLException ex) {
                    Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.j1.enable(true);
                this.j2.enable(true);
                this.m1.enable(true);
                this.m2.enable(true);
                this.a1.enable(true);
                this.a2.enable(true);
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("N\u00b0");
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom");
                dt1.addColumn("Montant");
                dt1.addColumn("NB-M");
                dt1.addColumn("D debut");
                dt1.addColumn("D fin");
                dt1.addColumn("N\u00b0 cheque");
                dt1.addColumn("Date");
                this.jTable1.setModel(dt1);
                this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                this.jTable1.setFillsViewportHeight(true);
                String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                int montantparmois = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    int totale = 0;
                    Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn22.createStatement();
                    System.out.println("dtt debut = " + datedebu);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date datedebut = sdf.parse(datedebu);
                    System.out.println("dtt fin = " + datedefi);
                    Date datedefin = sdf.parse(datedefi);
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd ORDER BY nbch");
                    System.out.println("-------55555555555555555-------");
                    boolean y = false;
                    while (result2.next()) {
                        ResultSetMetaData resultMeta3;
                        ResultSet result3;
                        Statement state3;
                        JOptionPane jop3;
                        String dt = "";
                        dt = result2.getString("date");
                        System.out.println("dt = " + dt);
                        Date d1 = sdf.parse(dt);
                        System.out.println("d1 = " + d1);
                        System.out.println("--------------");
                        if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                        y = true;
                        System.out.println("---------2222222222-----");
                        String nbc = result2.getString("nbch");
                        System.out.println("nbc = " + nbc);
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
                        if (!kk) {
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
                        String datedebutt = result2.getString("datedebut");
                        String datefinn = result2.getString("datefin");
                        System.out.println("*********************");
                        kk = false;
                        String montantbc = result2.getString("Montant");
                        System.out.println("Montant 1=  " + montantbc);
                        montantbc = montantbc.replaceAll(",", "");
                        System.out.println("Montant 2=  " + montantbc);
                        int t = Integer.parseInt(montantbc);
                        System.out.println("montant = " + montantbc);
                        montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                        System.out.println("montant 2= " + montantbc);
                        String nbmois = result2.getString("Nbmois");
                        int nb = Integer.parseInt(nbmois);
                        int mpm = t / nb;
                        montantparmois += mpm;
                        totale += t;
                        String Ncheque = result2.getString("numcheque");
                        Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    }
                    if (y) {
                        String tt = "" + totale + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                        dt1.addRow(stg);
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
                }
                String tt = "" + montantparmois + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
            }
            catch (Exception e) {}
        } else if (this.pretfdd.isSelected() && this.MC.isSelected()) {
            this.j1.enable(false);
            this.j2.enable(false);
            this.m2.enable(false);
            this.a2.enable(false);
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom");
            dt1.addColumn("Montant");
            dt1.addColumn("NB-M");
            dt1.addColumn("D debut");
            dt1.addColumn("D fin");
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
            this.jTable1.setFillsViewportHeight(true);
            this.moiactueleenlettre = this.m1.equals("01") ? "Janvier" : (this.m1.equals("02") ? "F\u00e9vrier" : (this.m1.equals("03") ? "Mars" : (this.m1.equals("04") ? "Avril" : (this.m1.equals("05") ? "Mai" : (this.m1.equals("06") ? "Juin" : (this.m1.equals("07") ? "Juillet" : (this.m1.equals("08") ? "Ao\u00fbt" : (this.m1.equals("09") ? "Septembre" : (this.m1.equals("10") ? "Octobre" : (this.m1.equals("11") ? "Novembre" : (this.m1.equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
            String dated = this.moiactueleenlettre + "  " + this.a1.getText();
            int montantparmois = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int totale = 0;
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd WHERE datedebut ='" + dated + "' ORDER BY nbch");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    JOptionPane jop3;
                    Statement state3;
                    ResultSet result3;
                    Connection conn3;
                    String dt = "";
                    dt = result2.getString("date");
                    y = true;
                    System.out.println("---------2222222222-----");
                    String nbc = result2.getString("nbch");
                    System.out.println("nbc = " + nbc);
                    String Mec = result2.getString("Mecano");
                    boolean kk = false;
                    String nom = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state3 = conn3.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            kk = true;
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                    if (!kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state3 = conn3.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
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
                    String datedebutt = result2.getString("datedebut");
                    String datefinn = result2.getString("datefin");
                    System.out.println("*********************");
                    kk = false;
                    String montantbc = result2.getString("Montant");
                    System.out.println("Montant 1=  " + montantbc);
                    montantbc = montantbc.replaceAll(",", "");
                    System.out.println("Montant 2=  " + montantbc);
                    int t = Integer.parseInt(montantbc);
                    System.out.println("montant = " + montantbc);
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    System.out.println("montant 2= " + montantbc);
                    String nbmois = result2.getString("Nbmois");
                    int nb = Integer.parseInt(nbmois);
                    int mpm = t / nb;
                    montantparmois += mpm;
                    totale += t;
                    String Ncheque = result2.getString("numcheque");
                    Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                if (y) {
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void MCMouseClicked(MouseEvent evt) {
        System.out.println("33333333333333333");
        if (this.pretfdd.isSelected() && this.MC.isSelected()) {
            System.out.println("************");
            this.j1.enable(false);
            this.j2.enable(false);
            this.m2.enable(false);
            this.a2.enable(false);
            this.m1.enable(true);
            this.a1.enable(true);
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom");
            dt1.addColumn("Montant");
            dt1.addColumn("NB-M");
            dt1.addColumn("D debut");
            dt1.addColumn("D fin");
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
            this.jTable1.setFillsViewportHeight(true);
            this.moiactueleenlettre = this.m1.getSelectedItem().toString().equals("01") ? "Janvier" : (this.m1.getSelectedItem().toString().equals("02") ? "F\u00e9vrier" : (this.m1.getSelectedItem().toString().equals("03") ? "Mars" : (this.m1.getSelectedItem().toString().equals("04") ? "Avril" : (this.m1.getSelectedItem().toString().equals("05") ? "Mai" : (this.m1.getSelectedItem().toString().equals("06") ? "Juin" : (this.m1.getSelectedItem().toString().equals("07") ? "Juillet" : (this.m1.getSelectedItem().toString().equals("08") ? "Ao\u00fbt" : (this.m1.getSelectedItem().toString().equals("09") ? "Septembre" : (this.m1.getSelectedItem().toString().equals("10") ? "Octobre" : (this.m1.getSelectedItem().toString().equals("11") ? "Novembre" : (this.m1.getSelectedItem().toString().equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
            String dated = this.moiactueleenlettre + "  " + this.a1.getText();
            System.out.println("date debut " + dated);
            int montantparmois = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int totale = 0;
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd WHERE datedebut ='" + dated + "' ORDER BY nbch");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    ResultSet result3;
                    ResultSetMetaData resultMeta3;
                    Connection conn3;
                    JOptionPane jop3;
                    Statement state3;
                    String dt = "";
                    dt = result2.getString("date");
                    y = true;
                    System.out.println("---------2222222222-----");
                    String nbc = result2.getString("nbch");
                    System.out.println("nbc = " + nbc);
                    String Mec = result2.getString("Mecano");
                    boolean kk = false;
                    String nom = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state3 = conn3.createStatement();
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
                    if (!kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state3 = conn3.createStatement();
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
                    String datedebutt = result2.getString("datedebut");
                    String datefinn = result2.getString("datefin");
                    System.out.println("*********************");
                    kk = false;
                    String montantbc = result2.getString("Montant");
                    System.out.println("Montant 1=  " + montantbc);
                    montantbc = montantbc.replaceAll(",", "");
                    System.out.println("Montant 2=  " + montantbc);
                    int t = Integer.parseInt(montantbc);
                    System.out.println("montant = " + montantbc);
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    System.out.println("montant 2= " + montantbc);
                    String nbmois = result2.getString("Nbmois");
                    int nb = Integer.parseInt(nbmois);
                    int mpm = t / nb;
                    montantparmois += mpm;
                    totale += t;
                    String Ncheque = result2.getString("numcheque");
                    Object[] stg = new Object[]{nbc, Mec, nom, montantbc, nbmois, datedebutt, datefinn, Ncheque, dt};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                if (y) {
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    Object[] stg = new Object[]{"", "", "total =", tt, "", "", "", "", ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void m2MouseEntered(MouseEvent evt) {
    }

    private void j2MouseEntered(MouseEvent evt) {
    }

    private void DMouseEntered(MouseEvent evt) {
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

