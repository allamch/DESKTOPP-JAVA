/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
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
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class ETATbc
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private int NO_SUCH_PAGE;
    private Printable printableObject;
    private JTextField a1;
    private JTextField a2;
    private JLabel annedebut2;
    private JLabel annedebut3;
    private JLabel annefin;
    private JLabel annefin1;
    private JComboBox j1;
    private JComboBox j2;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField2;
    private JComboBox m1;
    private JComboBox m2;
    private JLabel moisdebut;
    private JLabel moisfin;

    public ETATbc() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel7 = new JLabel();
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
        this.jTextField2 = new JTextField();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton1 = new JButton();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Liste des Bons  Commandes ");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(290, 0, 360, 40);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATbc.this.m1MouseClicked(evt);
            }
        });
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ETATbc.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.m1);
        this.m1.setBounds(350, 40, 50, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setText("Mois :");
        this.jPanel16.add(this.moisdebut);
        this.moisdebut.setBounds(300, 40, 50, 30);
        this.moisfin.setFont(new Font("Tahoma", 1, 14));
        this.moisfin.setForeground(new Color(153, 0, 0));
        this.moisfin.setText("Mois :");
        this.jPanel16.add(this.moisfin);
        this.moisfin.setBounds(300, 80, 50, 30);
        this.m2.setFont(new Font("Tahoma", 1, 12));
        this.m2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", ""}));
        this.m2.setEnabled(false);
        this.m2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATbc.this.m2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.m2);
        this.m2.setBounds(350, 80, 50, 30);
        this.annedebut2.setFont(new Font("Tahoma", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 0));
        this.annedebut2.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annedebut2);
        this.annedebut2.setBounds(420, 40, 50, 30);
        this.annefin.setFont(new Font("Tahoma", 1, 14));
        this.annefin.setForeground(new Color(153, 0, 0));
        this.annefin.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annefin);
        this.annefin.setBounds(420, 80, 50, 30);
        this.a2.setEnabled(false);
        this.a2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATbc.this.a2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a2);
        this.a2.setBounds(470, 80, 80, 30);
        this.a1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATbc.this.a1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a1);
        this.a1.setBounds(470, 40, 80, 30);
        this.annefin1.setFont(new Font("Tahoma", 1, 14));
        this.annefin1.setForeground(new Color(153, 0, 0));
        this.annefin1.setText("Jour:");
        this.jPanel16.add(this.annefin1);
        this.annefin1.setBounds(190, 80, 40, 30);
        this.annedebut3.setFont(new Font("Tahoma", 1, 14));
        this.annedebut3.setForeground(new Color(153, 0, 0));
        this.annedebut3.setText("Jour:");
        this.jPanel16.add(this.annedebut3);
        this.annedebut3.setBounds(190, 40, 40, 30);
        this.j2.setFont(new Font("Tahoma", 1, 12));
        this.j2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j2.setEnabled(false);
        this.j2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATbc.this.j2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.j2);
        this.j2.setBounds(230, 80, 60, 30);
        this.j1.setFont(new Font("Tahoma", 1, 12));
        this.j1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATbc.this.j1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.j1);
        this.j1.setBounds(230, 40, 60, 30);
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ETATbc.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jTextField2);
        this.jTextField2.setBounds(160, 40, 2, 70);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setForeground(new Color(102, 0, 102));
        this.jLabel1.setText("Date fin :");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(20, 80, 130, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setForeground(new Color(102, 0, 102));
        this.jLabel3.setText("Date d\u00e9but :");
        this.jPanel16.add(this.jLabel3);
        this.jLabel3.setBounds(20, 40, 160, 30);
        this.jScrollPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createLineBorder(new Color(0, 0, 0))));
        this.jScrollPane1.setForeground(new Color(0, 153, 102));
        this.jScrollPane1.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 14));
        this.jTable1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jTable1.setFont(new Font("Tahoma", 0, 14));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.jTable1.setGridColor(new Color(0, 0, 0));
        this.jTable1.setRowHeight(40);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATbc.this.jTable1MouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(20, 120, 820, 400);
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ETATbc.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(580, 40, 100, 40);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, -30, 850, 1340);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void m1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void j1MouseClicked(MouseEvent evt) {
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
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
        int mois22 = Integer.parseInt(this.m2.getSelectedItem().toString());
        int anne1 = Integer.parseInt(this.a1.getText());
        int anne2 = Integer.parseInt(this.a2.getText());
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        if (anne2 < anne1 || anne2 == anne1 && (mois22 < mois1 || jour2 < jour1)) {
            int b = this.j1.getSelectedIndex();
            int b2 = this.m1.getSelectedIndex();
            this.j2.setSelectedIndex(b);
            this.m2.setSelectedIndex(b2);
            this.a2.setText(this.a1.getText());
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "date debut inferieure a date fin", "Information", 1);
        } else {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Nom");
            dt1.addColumn("FRS");
            dt1.addColumn("Fournisseur");
            dt1.addColumn("NBC");
            dt1.addColumn("Ann\u00e9e");
            dt1.addColumn("BQ");
            dt1.addColumn("M BC");
            dt1.addColumn("MC");
            dt1.addColumn("NB");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc ORDER BY datebc ");
                String mecano = "";
                int i = 0;
                int totale = 0;
                while (result2.next()) {
                    Statement state3;
                    ResultSet result3;
                    JOptionPane jop3;
                    ResultSetMetaData resultMeta3;
                    String dt = "";
                    dt = result2.getString("datebc");
                    System.out.println("datebc" + dt);
                    Date d1 = sdf.parse(dt);
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    System.out.println("*****************111111***************" + dt);
                    String n = result2.getString("nbc");
                    mecano = result2.getString("Mecano");
                    String montantbc = result2.getString("montantbc");
                    int t = Integer.parseInt(montantbc);
                    totale += t;
                    String stac = montantbc;
                    stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                    String matf = result2.getString("matf");
                    String anneesdebut = result2.getString("anneesdebut");
                    String bq = result2.getString("codeb");
                    String moisdebut = result2.getString("moisdebut");
                    String nbmois = result2.getString("nbmois");
                    String nom = "";
                    ++i;
                    boolean kk = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
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
                            result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
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
                    String nomsc = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state32 = conn2.createStatement();
                        ResultSet result32 = state32.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + matf);
                        ResultSetMetaData resultMeta32 = result32.getMetaData();
                        while (result32.next()) {
                            nomsc = result32.getString("NOMSOC");
                            kk = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop32 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                    Object[] stg = new Object[]{mecano, nom, matf, nomsc, n, anneesdebut, bq, stac, moisdebut, nbmois, dt};
                    dt1.addRow(stg);
                    mecano = "";
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", "", "", "Totale =", tt, "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                System.out.println("********************************");
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
            }
        }
        this.j2.enable(true);
        this.m2.enable(true);
        this.a2.enable(true);
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void m1MouseClicked(MouseEvent evt) {
        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
        int anne1 = Integer.parseInt(this.a1.getText());
        int anne2 = Integer.parseInt(this.a2.getText());
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        if (anne2 < anne1 || anne2 == anne1 && (mois2 < mois1 || jour2 < jour1)) {
            int b = this.j1.getSelectedIndex();
            int b2 = this.m1.getSelectedIndex();
            this.j2.setSelectedIndex(b);
            this.m2.setSelectedIndex(b2);
            this.a2.setText(this.a1.getText());
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "date debut inferieure a date fin", "Information", 1);
        } else {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Nom");
            dt1.addColumn("FRS");
            dt1.addColumn("Fournisseur");
            dt1.addColumn("NBC");
            dt1.addColumn("Ann\u00e9e");
            dt1.addColumn("BQ");
            dt1.addColumn("M BC");
            dt1.addColumn("MC");
            dt1.addColumn("NB");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc ORDER BY datebc ");
                String mecano = "";
                int i = 0;
                int totale = 0;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("datebc");
                    Date d1 = sdf.parse(dt);
                    if (d1.equals(datedebut) || d1.equals(datedefin) || datedebut.before(d1) && datedefin.after(d1)) {
                        Statement state3;
                        ResultSet result3;
                        JOptionPane jop3;
                        ResultSetMetaData resultMeta3;
                        System.out.println("*****************111111***************" + dt);
                        String n = result2.getString("nbc");
                        mecano = result2.getString("Mecano");
                        String montantbc = result2.getString("montantbc");
                        int t = Integer.parseInt(montantbc);
                        totale += t;
                        String stac = montantbc;
                        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                        String matf = result2.getString("matf");
                        String anneesdebut = result2.getString("anneesdebut");
                        String bq = result2.getString("codeb");
                        String moisdebut = result2.getString("moisdebut");
                        String nbmois = result2.getString("nbmois");
                        String nom = "";
                        ++i;
                        boolean kk = false;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
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
                                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
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
                        String nomsc = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state32 = conn2.createStatement();
                            ResultSet result32 = state32.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + matf);
                            ResultSetMetaData resultMeta32 = result32.getMetaData();
                            while (result32.next()) {
                                nomsc = result32.getString("NOMSOC");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop32 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                        Object[] stg = new Object[]{mecano, nom, matf, nomsc, n, anneesdebut, bq, stac, moisdebut, nbmois, dt};
                        dt1.addRow(stg);
                        mecano = "";
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                        continue;
                    }
                    System.out.println("*****************222222222222***************" + dt);
                }
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", "", "", "Totale =", tt, "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                System.out.println("********************************");
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 11111111111111" + e.getMessage());
            }
        }
    }

    private void a1MouseClicked(MouseEvent evt) {
        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
        int anne1 = Integer.parseInt(this.a1.getText());
        int anne2 = Integer.parseInt(this.a2.getText());
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        if (anne2 < anne1 || anne2 == anne1 && (mois2 < mois1 || jour2 < jour1)) {
            int b = this.j1.getSelectedIndex();
            int b2 = this.m1.getSelectedIndex();
            this.j2.setSelectedIndex(b);
            this.m2.setSelectedIndex(b2);
            this.a2.setText(this.a1.getText());
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "date debut inferieure a date fin", "Information", 1);
        } else {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Nom");
            dt1.addColumn("FRS");
            dt1.addColumn("Fournisseur");
            dt1.addColumn("NBC");
            dt1.addColumn("Ann\u00e9e");
            dt1.addColumn("BQ");
            dt1.addColumn("M BC");
            dt1.addColumn("MC");
            dt1.addColumn("NB");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc ORDER BY datebc ");
                String mecano = "";
                int i = 0;
                int totale = 0;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("datebc");
                    Date d1 = sdf.parse(dt);
                    if (d1.equals(datedebut) || d1.equals(datedefin) || datedebut.before(d1) && datedefin.after(d1)) {
                        Statement state3;
                        ResultSet result3;
                        JOptionPane jop3;
                        ResultSetMetaData resultMeta3;
                        System.out.println("*****************111111***************" + dt);
                        String n = result2.getString("nbc");
                        mecano = result2.getString("Mecano");
                        String montantbc = result2.getString("montantbc");
                        int t = Integer.parseInt(montantbc);
                        totale += t;
                        String stac = montantbc;
                        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                        String matf = result2.getString("matf");
                        String anneesdebut = result2.getString("anneesdebut");
                        String bq = result2.getString("codeb");
                        String moisdebut = result2.getString("moisdebut");
                        String nbmois = result2.getString("nbmois");
                        String nom = "";
                        ++i;
                        boolean kk = false;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
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
                                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
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
                        String nomsc = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state32 = conn2.createStatement();
                            ResultSet result32 = state32.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + matf);
                            ResultSetMetaData resultMeta32 = result32.getMetaData();
                            while (result32.next()) {
                                nomsc = result32.getString("NOMSOC");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop32 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                        Object[] stg = new Object[]{mecano, nom, matf, nomsc, n, anneesdebut, bq, stac, moisdebut, nbmois, dt};
                        dt1.addRow(stg);
                        mecano = "";
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                        continue;
                    }
                    System.out.println("*****************222222222222***************" + dt);
                }
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", "", "", "Totale =", tt, "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                System.out.println("********************************");
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 11111111111111" + e.getMessage());
            }
        }
    }

    private void j2MouseClicked(MouseEvent evt) {
        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
        int anne1 = Integer.parseInt(this.a1.getText());
        int anne2 = Integer.parseInt(this.a2.getText());
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        if (anne2 < anne1 || anne2 == anne1 && (mois2 < mois1 || jour2 < jour1)) {
            int b = this.j1.getSelectedIndex();
            int b2 = this.m1.getSelectedIndex();
            this.j2.setSelectedIndex(b);
            this.m2.setSelectedIndex(b2);
            this.a2.setText(this.a1.getText());
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "date debut inferieure a date fin", "Information", 1);
        } else {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Nom");
            dt1.addColumn("FRS");
            dt1.addColumn("Fournisseur");
            dt1.addColumn("NBC");
            dt1.addColumn("Ann\u00e9e");
            dt1.addColumn("BQ");
            dt1.addColumn("M BC");
            dt1.addColumn("MC");
            dt1.addColumn("NB");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc ORDER BY datebc ");
                String mecano = "";
                int i = 0;
                int totale = 0;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("datebc");
                    Date d1 = sdf.parse(dt);
                    if (d1.equals(datedebut) || d1.equals(datedefin) || datedebut.before(d1) && datedefin.after(d1)) {
                        Statement state3;
                        ResultSet result3;
                        JOptionPane jop3;
                        ResultSetMetaData resultMeta3;
                        System.out.println("*****************111111***************" + dt);
                        String n = result2.getString("nbc");
                        mecano = result2.getString("Mecano");
                        String montantbc = result2.getString("montantbc");
                        int t = Integer.parseInt(montantbc);
                        totale += t;
                        String stac = montantbc;
                        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                        String matf = result2.getString("matf");
                        String anneesdebut = result2.getString("anneesdebut");
                        String bq = result2.getString("codeb");
                        String moisdebut = result2.getString("moisdebut");
                        String nbmois = result2.getString("nbmois");
                        String nom = "";
                        ++i;
                        boolean kk = false;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
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
                                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
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
                        String nomsc = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state32 = conn2.createStatement();
                            ResultSet result32 = state32.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + matf);
                            ResultSetMetaData resultMeta32 = result32.getMetaData();
                            while (result32.next()) {
                                nomsc = result32.getString("NOMSOC");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop32 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                        Object[] stg = new Object[]{mecano, nom, matf, nomsc, n, anneesdebut, bq, stac, moisdebut, nbmois, dt};
                        dt1.addRow(stg);
                        mecano = "";
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                        continue;
                    }
                    System.out.println("*****************222222222222***************" + dt);
                }
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", "", "", "Totale =", tt, "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                System.out.println("********************************");
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 11111111111111" + e.getMessage());
            }
        }
    }

    public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        int fontHeight = g2.getFontMetrics().getHeight();
        int fontDescent = g2.getFontMetrics().getDescent();
        double pageHeight = pageFormat.getImageableHeight() - (double)fontHeight;
        double pageWidth = pageFormat.getImageableWidth();
        double tableWidth = this.jTable1.getColumnModel().getTotalColumnWidth();
        double scale = 1.0;
        if (tableWidth >= pageWidth) {
            scale = pageWidth / tableWidth;
        }
        double headerHeightOnPage = (double)this.jTable1.getTableHeader().getHeight() * scale;
        double tableWidthOnPage = tableWidth * scale;
        double oneRowHeight = (double)(this.jTable1.getRowHeight() + this.jTable1.getRowMargin()) * scale;
        int numRowsOnAPage = (int)((pageHeight - headerHeightOnPage) / oneRowHeight);
        double pageHeightForTable = oneRowHeight * (double)numRowsOnAPage;
        int totalNumPages = (int)Math.ceil((double)this.jTable1.getRowCount() / (double)numRowsOnAPage);
        if (pageIndex >= totalNumPages) {
            return this.NO_SUCH_PAGE;
        }
        g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        g2.drawString("Page: " + (pageIndex + 1), (int)pageWidth / 2 - 35, (int)(pageHeight + (double)fontHeight - (double)fontDescent));
        g2.translate(0.0, headerHeightOnPage);
        g2.translate(0.0, (double)(- pageIndex) * pageHeightForTable);
        if (pageIndex + 1 == totalNumPages) {
            int lastRowPrinted = numRowsOnAPage * pageIndex;
            int numRowsLeft = this.jTable1.getRowCount() - lastRowPrinted;
            g2.setClip(0, (int)(pageHeightForTable * (double)pageIndex), (int)Math.ceil(tableWidthOnPage), (int)Math.ceil(oneRowHeight * (double)numRowsLeft));
        } else {
            g2.setClip(0, (int)(pageHeightForTable * (double)pageIndex), (int)Math.ceil(tableWidthOnPage), (int)Math.ceil(pageHeightForTable));
        }
        g2.scale(scale, scale);
        this.jTable1.paint(g2);
        g2.scale(1.0 / scale, 1.0 / scale);
        g2.translate(0.0, (double)pageIndex * pageHeightForTable);
        g2.translate(0.0, - headerHeightOnPage);
        g2.setClip(0, 0, (int)Math.ceil(tableWidthOnPage), (int)Math.ceil(headerHeightOnPage));
        g2.scale(scale, scale);
        this.jTable1.getTableHeader().paint(g2);
        return 0;
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Date actuellEeddc = new Date();
        SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
        String dat = dateFormattddc.format(actuellEeddc);
        MessageFormat header = new MessageFormat("R\u00e9captulation de jours :(" + dat + ")");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void m2MouseClicked(MouseEvent evt) {
        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
        int anne1 = Integer.parseInt(this.a1.getText());
        int anne2 = Integer.parseInt(this.a2.getText());
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        if (anne2 < anne1 || anne2 == anne1 && (mois2 < mois1 || jour2 < jour1)) {
            int b = this.j1.getSelectedIndex();
            int b2 = this.m1.getSelectedIndex();
            this.j2.setSelectedIndex(b);
            this.m2.setSelectedIndex(b2);
            this.a2.setText(this.a1.getText());
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "date debut inferieure a date fin", "Information", 1);
        } else {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Nom");
            dt1.addColumn("FRS");
            dt1.addColumn("Fournisseur");
            dt1.addColumn("NBC");
            dt1.addColumn("Ann\u00e9e");
            dt1.addColumn("BQ");
            dt1.addColumn("M BC");
            dt1.addColumn("MC");
            dt1.addColumn("NB");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc ORDER BY datebc ");
                String mecano = "";
                int i = 0;
                int totale = 0;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("datebc");
                    Date d1 = sdf.parse(dt);
                    if (d1.equals(datedebut) || d1.equals(datedefin) || datedebut.before(d1) && datedefin.after(d1)) {
                        Statement state3;
                        ResultSet result3;
                        JOptionPane jop3;
                        ResultSetMetaData resultMeta3;
                        System.out.println("*****************111111***************" + dt);
                        String n = result2.getString("nbc");
                        mecano = result2.getString("Mecano");
                        String montantbc = result2.getString("montantbc");
                        int t = Integer.parseInt(montantbc);
                        totale += t;
                        String stac = montantbc;
                        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                        String matf = result2.getString("matf");
                        String anneesdebut = result2.getString("anneesdebut");
                        String bq = result2.getString("codeb");
                        String moisdebut = result2.getString("moisdebut");
                        String nbmois = result2.getString("nbmois");
                        String nom = "";
                        ++i;
                        boolean kk = false;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
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
                                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
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
                        String nomsc = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state32 = conn2.createStatement();
                            ResultSet result32 = state32.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + matf);
                            ResultSetMetaData resultMeta32 = result32.getMetaData();
                            while (result32.next()) {
                                nomsc = result32.getString("NOMSOC");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop32 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                        Object[] stg = new Object[]{mecano, nom, matf, nomsc, n, anneesdebut, bq, stac, moisdebut, nbmois, dt};
                        dt1.addRow(stg);
                        mecano = "";
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                        continue;
                    }
                    System.out.println("*****************222222222222***************" + dt);
                }
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", "", "", "Totale =", tt, "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                System.out.println("********************************");
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 11111111111111" + e.getMessage());
            }
        }
    }

    private void a2MouseClicked(MouseEvent evt) {
        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
        int anne1 = Integer.parseInt(this.a1.getText());
        int anne2 = Integer.parseInt(this.a2.getText());
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        if (anne2 < anne1 || anne2 == anne1 && (mois2 < mois1 || jour2 < jour1)) {
            int b = this.j1.getSelectedIndex();
            int b2 = this.m1.getSelectedIndex();
            this.j2.setSelectedIndex(b);
            this.m2.setSelectedIndex(b2);
            this.a2.setText(this.a1.getText());
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "date debut inferieure a date fin", "Information", 1);
        } else {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Nom");
            dt1.addColumn("FRS");
            dt1.addColumn("Fournisseur");
            dt1.addColumn("NBC");
            dt1.addColumn("Ann\u00e9e");
            dt1.addColumn("BQ");
            dt1.addColumn("M BC");
            dt1.addColumn("MC");
            dt1.addColumn("NB");
            dt1.addColumn("Date");
            this.jTable1.setModel(dt1);
            System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc ORDER BY datebc ");
                String mecano = "";
                int i = 0;
                int totale = 0;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("datebc");
                    Date d1 = sdf.parse(dt);
                    if (d1.equals(datedebut) || d1.equals(datedefin) || datedebut.before(d1) && datedefin.after(d1)) {
                        Statement state3;
                        ResultSet result3;
                        JOptionPane jop3;
                        ResultSetMetaData resultMeta3;
                        System.out.println("*****************111111***************" + dt);
                        String n = result2.getString("nbc");
                        mecano = result2.getString("Mecano");
                        String montantbc = result2.getString("montantbc");
                        int t = Integer.parseInt(montantbc);
                        totale += t;
                        String stac = montantbc;
                        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                        String matf = result2.getString("matf");
                        String anneesdebut = result2.getString("anneesdebut");
                        String bq = result2.getString("codeb");
                        String moisdebut = result2.getString("moisdebut");
                        String nbmois = result2.getString("nbmois");
                        String nom = "";
                        ++i;
                        boolean kk = false;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
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
                                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
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
                        String nomsc = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state32 = conn2.createStatement();
                            ResultSet result32 = state32.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + matf);
                            ResultSetMetaData resultMeta32 = result32.getMetaData();
                            while (result32.next()) {
                                nomsc = result32.getString("NOMSOC");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop32 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                        Object[] stg = new Object[]{mecano, nom, matf, nomsc, n, anneesdebut, bq, stac, moisdebut, nbmois, dt};
                        dt1.addRow(stg);
                        mecano = "";
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                        continue;
                    }
                    System.out.println("*****************222222222222***************" + dt);
                }
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", "", "", "Totale =", tt, "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                System.out.println("********************************");
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 11111111111111" + e.getMessage());
            }
        }
    }

}

