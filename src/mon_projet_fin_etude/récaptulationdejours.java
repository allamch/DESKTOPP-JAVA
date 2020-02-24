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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class r\u00e9captulationdejours
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JTextField a1;
    private JLabel annedebut2;
    private JLabel annedebut3;
    private JComboBox j1;
    private JButton jButton4;
    private JLabel jLabel3;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JComboBox m1;
    private JLabel moisdebut;

    public r\u00e9captulationdejours() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel7 = new JLabel();
        this.m1 = new JComboBox();
        this.moisdebut = new JLabel();
        this.annedebut2 = new JLabel();
        this.a1 = new JTextField();
        this.annedebut3 = new JLabel();
        this.j1 = new JComboBox();
        this.jLabel3 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton4 = new JButton();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("R\u00e9capitulation des jours");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(300, 0, 360, 27);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                r\u00e9captulationdejours.this.m1MouseClicked(evt);
            }
        });
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                r\u00e9captulationdejours.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.m1);
        this.m1.setBounds(340, 30, 50, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setText("Mois :");
        this.jPanel16.add(this.moisdebut);
        this.moisdebut.setBounds(290, 30, 50, 30);
        this.annedebut2.setFont(new Font("Tahoma", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 0));
        this.annedebut2.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annedebut2);
        this.annedebut2.setBounds(400, 30, 50, 30);
        this.a1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                r\u00e9captulationdejours.this.a1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a1);
        this.a1.setBounds(460, 30, 80, 30);
        this.annedebut3.setFont(new Font("Tahoma", 1, 14));
        this.annedebut3.setForeground(new Color(153, 0, 0));
        this.annedebut3.setText("Jour:");
        this.jPanel16.add(this.annedebut3);
        this.annedebut3.setBounds(180, 30, 40, 30);
        this.j1.setFont(new Font("Tahoma", 1, 12));
        this.j1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                r\u00e9captulationdejours.this.j1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                r\u00e9captulationdejours.this.j1MouseEntered(evt);
            }
        });
        this.jPanel16.add(this.j1);
        this.j1.setBounds(220, 30, 60, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setForeground(new Color(102, 0, 102));
        this.jLabel3.setText("Date d\u00e9but :");
        this.jPanel16.add(this.jLabel3);
        this.jLabel3.setBounds(40, 30, 120, 30);
        this.jScrollPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createLineBorder(new Color(0, 0, 0))));
        this.jScrollPane1.setForeground(new Color(0, 153, 102));
        this.jScrollPane1.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 14));
        this.jTable1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jTable1.setFont(new Font("Tahoma", 0, 9));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.jTable1.setGridColor(new Color(0, 0, 0));
        this.jTable1.setIntercellSpacing(new Dimension(2, 2));
        this.jTable1.setRowHeight(40);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                r\u00e9captulationdejours.this.jTable1MouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 70, 890, 410);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton4.setText("Imprimer");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                r\u00e9captulationdejours.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton4);
        this.jButton4.setBounds(570, 30, 120, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 900, 480);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat("R\u00e9captulation de jours :( " + this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText() + ")");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void j1MouseEntered(MouseEvent evt) {
    }

    private void j1MouseClicked(MouseEvent evt) {
        String moisd;
        String nbmois;
        String dtt;
        String mecano;
        Statement state2;
        String date;
        String moisdebut;
        ResultSet result3;
        String bq;
        String dt;
        Statement state3;
        JOptionPane jop3;
        String type;
        JOptionPane jop32;
        boolean kk;
        String nbmois2;
        String stac;
        ResultSetMetaData resultMeta3;
        String anneesdebut;
        String n;
        String nom;
        ResultSetMetaData resultMeta32;
        JOptionPane jop33;
        Object[] stg;
        Statement state32;
        String nom2;
        Statement state33;
        String matf;
        ResultSetMetaData resultMeta33;
        JOptionPane jop34;
        String anescol;
        JOptionPane jop35;
        ResultSet result32;
        String Mec;
        ResultSet result2;
        boolean kk2;
        String montantbc;
        ResultSet result22;
        Object[] stg2;
        ResultSet result33;
        String nomsc;
        String montantbc2;
        Statement state22;
        int i = 0;
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
            String ann\u00e9es = datdd.substring(6, datdd.length());
            this.a1.setText(ann\u00e9es);
            int j = Integer.parseInt(jours);
            switch (j) {
                case 1: {
                    this.j1.setSelectedIndex(1);
                    break;
                }
                case 2: {
                    this.j1.setSelectedIndex(2);
                    break;
                }
                case 3: {
                    this.j1.setSelectedIndex(3);
                    break;
                }
                case 4: {
                    this.j1.setSelectedIndex(4);
                    break;
                }
                case 5: {
                    this.j1.setSelectedIndex(5);
                    break;
                }
                case 6: {
                    this.j1.setSelectedIndex(6);
                    break;
                }
                case 7: {
                    this.j1.setSelectedIndex(7);
                    break;
                }
                case 8: {
                    this.j1.setSelectedIndex(8);
                    break;
                }
                case 9: {
                    this.j1.setSelectedIndex(9);
                    break;
                }
                case 10: {
                    this.j1.setSelectedIndex(10);
                    break;
                }
                case 11: {
                    this.j1.setSelectedIndex(11);
                    break;
                }
                case 12: {
                    this.j1.setSelectedIndex(12);
                    break;
                }
                case 13: {
                    this.j1.setSelectedIndex(13);
                    break;
                }
                case 14: {
                    this.j1.setSelectedIndex(14);
                    break;
                }
                case 15: {
                    this.j1.setSelectedIndex(15);
                    break;
                }
                case 16: {
                    this.j1.setSelectedIndex(16);
                    break;
                }
                case 17: {
                    this.j1.setSelectedIndex(17);
                    break;
                }
                case 18: {
                    this.j1.setSelectedIndex(18);
                    break;
                }
                case 19: {
                    this.j1.setSelectedIndex(19);
                    break;
                }
                case 20: {
                    this.j1.setSelectedIndex(20);
                    break;
                }
                case 21: {
                    this.j1.setSelectedIndex(11);
                    break;
                }
                case 22: {
                    this.j1.setSelectedIndex(22);
                    break;
                }
                case 23: {
                    this.j1.setSelectedIndex(23);
                    break;
                }
                case 24: {
                    this.j1.setSelectedIndex(24);
                    break;
                }
                case 25: {
                    this.j1.setSelectedIndex(25);
                    break;
                }
                case 26: {
                    this.j1.setSelectedIndex(26);
                    break;
                }
                case 27: {
                    this.j1.setSelectedIndex(27);
                    break;
                }
                case 28: {
                    this.j1.setSelectedIndex(28);
                    break;
                }
                case 29: {
                    this.j1.setSelectedIndex(29);
                    break;
                }
                case 30: {
                    this.j1.setSelectedIndex(30);
                    break;
                }
                case 31: {
                    this.j1.setSelectedIndex(31);
                    break;
                }
                default: {
                    this.j1.setSelectedIndex(0);
                }
            }
        }
        System.out.println("--++++++++++++++++++++++++++++++ ");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Mat");
        dt1.addColumn("Fournisseur");
        dt1.addColumn("NBC");
        dt1.addColumn("Ann\u00e9e");
        dt1.addColumn("BQ");
        dt1.addColumn("M BC");
        dt1.addColumn("MC");
        dt1.addColumn("Nb");
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
            state2 = conn2.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state2.executeQuery("SELECT *  FROM  bc  WHERE datebc='" + dtt + "' ORDER BY nbc");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                ResultSet result34;
                JOptionPane jop36;
                ResultSetMetaData resultMeta34;
                Statement state34;
                n = result22.getString("nbc");
                mecano = result22.getString("Mecano");
                String stac2 = montantbc = result22.getString("montantbc");
                stac2 = new StringBuilder(stac2).insert(stac2.length() - 3, ".").toString();
                String matf2 = result22.getString("matf");
                String anneesdebut2 = result22.getString("anneesdebut");
                String bq2 = result22.getString("codeb");
                String moisdebut2 = result22.getString("moisdebut");
                nbmois2 = result22.getString("nbmois");
                dt = "";
                dt = i == 0 ? result22.getString("datebc") : "";
                String nom3 = "";
                ++i;
                boolean kk3 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state34 = conn2.createStatement();
                    result34 = state34.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta34 = result34.getMetaData();
                    while (result34.next()) {
                        nom3 = result34.getString("nom");
                        kk3 = true;
                    }
                }
                catch (Exception e) {
                    jop36 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk3) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state34 = conn2.createStatement();
                        result34 = state34.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta34 = result34.getMetaData();
                        while (result34.next()) {
                            nom3 = result34.getString("nom");
                            kk3 = true;
                        }
                    }
                    catch (Exception e) {
                        jop36 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String nomsc2 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + matf2);
                    resultMeta33 = result3.getMetaData();
                    while (result3.next()) {
                        nomsc2 = result3.getString("NOMSOC");
                        kk3 = true;
                    }
                }
                catch (Exception e) {
                    jop34 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                stg = new Object[]{mecano, nom3, matf2, nomsc2, n, anneesdebut2, bq2, stac2, moisdebut2, nbmois2, dt};
                dt1.addRow(stg);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop35 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state2 = conn2.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state2.executeQuery("SELECT *  FROM cession2  WHERE date='" + dtt + "' ORDER BY NBC");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                n = result22.getString("NBC");
                mecano = result22.getString("mecano");
                montantbc = result22.getString("Montant");
                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                matf = "300";
                anneesdebut = result22.getString("annenbc");
                bq = result22.getString("ref");
                moisdebut = result22.getString("premiermois");
                moisd = moisdebut.substring(0, moisdebut.length() - 6);
                System.out.println("mois debut =" + moisd + "--");
                moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                nbmois2 = result22.getString("Nbmois");
                dt = "";
                dt = i == 0 ? result22.getString("date") : "";
                nomsc = "CS Sur salaire";
                nom2 = "";
                ++i;
                kk2 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta33 = result3.getMetaData();
                    while (result3.next()) {
                        nom2 = result3.getString("nom");
                        kk2 = true;
                    }
                }
                catch (Exception e) {
                    jop34 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta33 = result3.getMetaData();
                        while (result3.next()) {
                            nom2 = result3.getString("nom");
                            kk2 = true;
                        }
                    }
                    catch (Exception e) {
                        jop34 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                stg = new Object[]{mecano, nom2, matf, nomsc, n, anneesdebut, bq, montantbc, moisdebut, nbmois2, dt};
                dt1.addRow(stg);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop35 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur cs sur  salaire : " + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state2 = conn2.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state2.executeQuery("SELECT *  FROM cession2  WHERE date='" + dtt + "' ORDER BY n406");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                n = result22.getString("n406");
                if (!n.equals("0")) {
                    mecano = result22.getString("mecano");
                    montantbc = result22.getString("Montant");
                    montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                    matf = "406";
                    anneesdebut = result22.getString("anne406");
                    bq = result22.getString("bq406");
                    moisdebut = result22.getString("premiermois");
                    moisd = moisdebut.substring(0, moisdebut.length() - 6);
                    System.out.println("mois debut =" + moisd + "--");
                    moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                    nbmois2 = result22.getString("Nbmois");
                    dt = "";
                    dt = i == 0 ? result22.getString("date") : "";
                    nomsc = "CS:PYT Direct 406";
                    nom2 = "";
                    ++i;
                    kk2 = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                        resultMeta33 = result3.getMetaData();
                        while (result3.next()) {
                            nom2 = result3.getString("nom");
                            kk2 = true;
                        }
                    }
                    catch (Exception e) {
                        jop34 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                    if (this.k == 0) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                            resultMeta33 = result3.getMetaData();
                            while (result3.next()) {
                                nom2 = result3.getString("nom");
                                kk2 = true;
                            }
                        }
                        catch (Exception e) {
                            jop34 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                        }
                    }
                    stg = new Object[]{mecano, nom2, matf, nomsc, n, anneesdebut, bq, montantbc, moisdebut, nbmois2, dt};
                    dt1.addRow(stg);
                    mecano = "";
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
                System.out.println("********************************");
            }
        }
        catch (Exception e) {
            jop35 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur cs sur  salaire : " + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state2 = conn2.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state2.executeQuery("SELECT *  FROM demandefdd  WHERE date='" + dtt + "' ORDER BY nbch");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                ResultSet result35;
                Statement state35;
                ResultSetMetaData resultMeta35;
                JOptionPane jop37;
                n = result22.getString("nbch");
                mecano = result22.getString("Mecano");
                montantbc = result22.getString("Montant");
                String anneesdebut3 = result22.getString("anne");
                String bq3 = result22.getString("codeb");
                String moisdebut3 = result22.getString("datedebut");
                String moisd2 = moisdebut3.substring(0, moisdebut3.length() - 6);
                System.out.println("mois debut =" + moisd2 + "--");
                moisdebut3 = moisd2.equals("Janvier") ? "01" : (moisd2.equals("F\u00e9vrier") ? "02" : (moisd2.equals("Mars") ? "03" : (moisd2.equals("Avril") ? "04" : (moisd2.equals("Mai") ? "05" : (moisd2.equals("Juin") ? "06" : (moisd2.equals("Juillet") ? "07" : (moisd2.equals("Ao\u00fbt") ? "08" : (moisd2.equals("Septembre") ? "09" : (moisd2.equals("Octobre") ? "10" : (moisd2.equals("Novembre") ? "11" : (moisd2.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                nbmois = result22.getString("Nbmois");
                String dt2 = "";
                dt2 = i == 0 ? result22.getString("date") : "";
                String nom4 = "";
                ++i;
                boolean kk4 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state35 = conn2.createStatement();
                    result35 = state35.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta35 = result35.getMetaData();
                    while (result35.next()) {
                        nom4 = result35.getString("nom");
                        kk4 = true;
                    }
                }
                catch (Exception e) {
                    jop37 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state35 = conn2.createStatement();
                        result35 = state35.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta35 = result35.getMetaData();
                        while (result35.next()) {
                            nom4 = result35.getString("nom");
                            kk4 = true;
                        }
                    }
                    catch (Exception e) {
                        jop37 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String nomsc3 = "Pret FDD 230";
                stg2 = new Object[]{mecano, nom4, "230", nomsc3, n, anneesdebut3, bq3, montantbc, moisdebut3, nbmois, dt2};
                dt1.addRow(stg2);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop35 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        System.out.println("--++++++++++++++++++++++++++++++ ");
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
            state2 = conn2.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state2.executeQuery("SELECT *  FROM  caissemainlev\u00e9e  WHERE date='" + dtt + "' ORDER BY date");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                String Montant;
                String datdddc = result22.getString("date");
                String anne = datdddc.substring(datdddc.length() - 4, datdddc.length());
                String moiss = datdddc.substring(datdddc.length() - 2, datdddc.length());
                String Ncession = result22.getString("Ncession");
                mecano = result22.getString("Mecano");
                String stac3 = Montant = result22.getString("Montant");
                stac3 = new StringBuilder(stac3).insert(stac3.length() - 3, ".").toString();
                nbmois = result22.getString("nbmois");
                String nom5 = "";
                ++i;
                boolean kk5 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state33 = conn2.createStatement();
                    result32 = state33.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta32 = result32.getMetaData();
                    while (result32.next()) {
                        nom5 = result32.getString("nom");
                        kk5 = true;
                    }
                }
                catch (Exception e) {
                    jop33 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk5) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state33 = conn2.createStatement();
                        result32 = state33.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta32 = result32.getMetaData();
                        while (result32.next()) {
                            nom5 = result32.getString("nom");
                            kk5 = true;
                        }
                    }
                    catch (Exception e) {
                        jop33 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                Object[] stg3 = new Object[]{mecano, nom5, Ncession, "Main lev\u00e9e", "--", anne, "--", stac3, moiss, nbmois, ""};
                dt1.addRow(stg3);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop35 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur caisse : " + e.getMessage());
        }
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            boolean totale = false;
            Statement state23 = conn2.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            ResultSet result23 = state23.executeQuery("SELECT *  FROM   primesante  WHERE date='" + datedebu + "' ORDER BY n");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result23.next()) {
                String montantbc3;
                String dt3 = "";
                dt3 = result23.getString("date");
                System.out.println("dt = " + dt3);
                Date d1 = sdf.parse(dt3);
                System.out.println("d1 = " + d1);
                System.out.println("--------------");
                System.out.println("---------2222222222-----");
                String nbc = result23.getString("n");
                System.out.println("nbc = " + nbc);
                String Mec2 = result23.getString("Mecano");
                boolean kk6 = false;
                String nom6 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state33 = conn2.createStatement();
                    result32 = state33.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec2);
                    resultMeta32 = result32.getMetaData();
                    while (result32.next()) {
                        nom6 = result32.getString("nom");
                        kk6 = true;
                    }
                }
                catch (Exception e) {
                    jop33 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk6) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state33 = conn2.createStatement();
                        result32 = state33.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec2);
                        resultMeta32 = result32.getMetaData();
                        while (result32.next()) {
                            nom6 = result32.getString("nom");
                            kk6 = true;
                        }
                    }
                    catch (Exception e) {
                        jop33 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String date2 = result23.getString("Date");
                String type2 = result23.getString("type");
                kk6 = false;
                String annee = result23.getString("annee");
                String n2 = result23.getString("n");
                String stac4 = montantbc3 = result23.getString("Montant");
                stac4 = new StringBuilder(stac4).insert(stac4.length() - 3, ".").toString();
                Object[] stg4 = new Object[]{Mec2, nom6, "227", type2, n2, annee, "--", stac4, "---", "---", ""};
                dt1.addRow(stg4);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            JOptionPane jop38 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
        String datedebu2 = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            boolean totale = false;
            state22 = conn2.createStatement();
            result2 = state22.executeQuery("SELECT *  FROM   primescolaire  WHERE date='" + datedebu2 + "' ORDER BY num");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                String nbc = result2.getString("num");
                System.out.println("nbc = " + nbc);
                Mec = result2.getString("MECANO");
                anescol = result2.getString("anescol");
                kk = false;
                nom = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state32 = conn2.createStatement();
                    result33 = state32.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                    resultMeta3 = result33.getMetaData();
                    while (result33.next()) {
                        nom = result33.getString("nom");
                        kk = true;
                    }
                }
                catch (Exception e) {
                    jop32 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state32 = conn2.createStatement();
                        result33 = state32.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                        resultMeta3 = result33.getMetaData();
                        while (result33.next()) {
                            nom = result33.getString("nom");
                            kk = true;
                        }
                    }
                    catch (Exception e) {
                        jop32 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                date = result2.getString("Date");
                type = "Prime Scolaire S";
                kk = false;
                stac = montantbc2 = result2.getString("montant");
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                stg2 = new Object[]{Mec, nom, "213", type, nbc, anescol, "--", stac, "---", "---", ""};
                dt1.addRow(stg2);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            boolean totale = false;
            state22 = conn2.createStatement();
            result2 = state22.executeQuery("SELECT *  FROM   primescolaireretretait  WHERE date='" + datedebu2 + "' ORDER BY num");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                String nbc = result2.getString("num");
                System.out.println("nbc = " + nbc);
                Mec = result2.getString("MECANO");
                anescol = result2.getString("anescol");
                kk = false;
                nom = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state32 = conn2.createStatement();
                    result33 = state32.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                    resultMeta3 = result33.getMetaData();
                    while (result33.next()) {
                        nom = result33.getString("nom");
                        kk = true;
                    }
                }
                catch (Exception e) {
                    jop32 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                }
                date = result2.getString("Date");
                type = "Prime Scolaire RET";
                kk = false;
                stac = montantbc2 = result2.getString("montant");
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                stg2 = new Object[]{Mec, nom, "213", type, nbc, anescol, "--", stac, "---", "---", ""};
                dt1.addRow(stg2);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void a1MouseClicked(MouseEvent evt) {
        JOptionPane jop3;
        String Mec;
        JOptionPane jop32;
        ResultSet result2;
        boolean kk;
        JOptionPane jop33;
        Object[] stg;
        ResultSetMetaData resultMeta3;
        ResultSet result3;
        Statement state2;
        String bq;
        String moisdebut;
        Statement state3;
        String dt;
        Statement state22;
        String montantbc;
        String nom;
        ResultSetMetaData resultMeta32;
        String matf;
        JOptionPane jop34;
        String moisd;
        String dtt;
        ResultSet result32;
        String nom2;
        Connection conn2;
        String nbmois;
        ResultSet result22;
        String mecano;
        String anneesdebut;
        String n;
        int i = 0;
        System.out.println("--++++++++++++++++++++++++++++++ ");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Mat");
        dt1.addColumn("Fournisseur");
        dt1.addColumn("NBC");
        dt1.addColumn("Ann\u00e9e");
        dt1.addColumn("BQ");
        dt1.addColumn("M BC");
        dt1.addColumn("MC");
        dt1.addColumn("Nb");
        dt1.addColumn("Date");
        this.jTable1.setModel(dt1);
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
        Connection conn3 = null;
        try {
            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state22 = conn3.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state22.executeQuery("SELECT *  FROM  bc  WHERE datebc='" + dtt + "' ORDER BY nbc");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                Statement state32;
                n = result22.getString("nbc");
                mecano = result22.getString("Mecano");
                String stac = montantbc = result22.getString("montantbc");
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                String matf2 = result22.getString("matf");
                String anneesdebut2 = result22.getString("anneesdebut");
                String bq2 = result22.getString("codeb");
                String moisdebut2 = result22.getString("moisdebut");
                nbmois = result22.getString("nbmois");
                dt = "";
                dt = i == 0 ? result22.getString("datebc") : "";
                nom = "";
                ++i;
                boolean kk2 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state32 = conn3.createStatement();
                    result3 = state32.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta32 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                        kk2 = true;
                    }
                }
                catch (Exception e) {
                    jop32 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk2) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state32 = conn3.createStatement();
                        result3 = state32.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta32 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            kk2 = true;
                        }
                    }
                    catch (Exception e) {
                        jop32 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String nomsc = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn3.createStatement();
                    result32 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + matf2);
                    resultMeta3 = result32.getMetaData();
                    while (result32.next()) {
                        nomsc = result32.getString("NOMSOC");
                        kk2 = true;
                    }
                }
                catch (Exception e) {
                    jop34 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                stg = new Object[]{mecano, nom, matf2, nomsc, n, anneesdebut2, bq2, stac, moisdebut2, nbmois, dt};
                dt1.addRow(stg);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state22 = conn3.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state22.executeQuery("SELECT *  FROM cession2  WHERE date='" + dtt + "' ORDER BY NBC");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                n = result22.getString("NBC");
                mecano = result22.getString("mecano");
                montantbc = result22.getString("Montant");
                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                matf = "------";
                anneesdebut = result22.getString("annenbc");
                bq = result22.getString("ref");
                moisdebut = result22.getString("premiermois");
                moisd = moisdebut.substring(0, moisdebut.length() - 6);
                System.out.println("mois debut =" + moisd + "--");
                moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                nbmois = result22.getString("Nbmois");
                dt = "";
                dt = i == 0 ? result22.getString("date") : "";
                String nomsc = "CS Sur salaire";
                String nom3 = "";
                ++i;
                boolean kk3 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn3.createStatement();
                    result32 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta3 = result32.getMetaData();
                    while (result32.next()) {
                        nom3 = result32.getString("nom");
                        kk3 = true;
                    }
                }
                catch (Exception e) {
                    jop34 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn3.createStatement();
                        result32 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta3 = result32.getMetaData();
                        while (result32.next()) {
                            nom3 = result32.getString("nom");
                            kk3 = true;
                        }
                    }
                    catch (Exception e) {
                        jop34 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                stg = new Object[]{mecano, nom3, matf, nomsc, n, anneesdebut, bq, montantbc, moisdebut, nbmois, dt};
                dt1.addRow(stg);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur cs sur  salaire : " + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state22 = conn3.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state22.executeQuery("SELECT *  FROM demandefdd  WHERE date='" + dtt + "' ORDER BY nbch");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                Statement state33;
                n = result22.getString("nbch");
                mecano = result22.getString("Mecano");
                montantbc = result22.getString("Montant");
                matf = "------";
                anneesdebut = result22.getString("anne");
                bq = result22.getString("codeb");
                moisdebut = result22.getString("datedebut");
                moisd = moisdebut.substring(0, moisdebut.length() - 6);
                System.out.println("mois debut =" + moisd + "--");
                moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                nbmois = result22.getString("Nbmois");
                dt = "";
                dt = i == 0 ? result22.getString("date") : "";
                nom = "";
                ++i;
                boolean kk4 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state33 = conn3.createStatement();
                    result3 = state33.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta32 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                        kk4 = true;
                    }
                }
                catch (Exception e) {
                    jop32 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state33 = conn3.createStatement();
                        result3 = state33.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta32 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            kk4 = true;
                        }
                    }
                    catch (Exception e) {
                        jop32 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String nomsc = "Pret FDD 230";
                stg = new Object[]{mecano, nom, matf, nomsc, n, anneesdebut, bq, montantbc, moisdebut, nbmois, dt};
                dt1.addRow(stg);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        System.out.println("--++++++++++++++++++++++++++++++ ");
        this.jTable1.setModel(dt1);
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
        try {
            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state22 = conn3.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state22.executeQuery("SELECT *  FROM  caisseMainlev\u00e9e  WHERE date='" + dtt + "' ORDER BY date");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                Statement state34;
                JOptionPane jop35;
                String Montant;
                ResultSet result33;
                ResultSetMetaData resultMeta33;
                String datdddc = result22.getString("date");
                String anne = datdddc.substring(datdddc.length() - 4, datdddc.length());
                String moiss = datdddc.substring(datdddc.length() - 2, datdddc.length());
                String Ncession = result22.getString("Ncession");
                mecano = result22.getString("Mecano");
                String stac = Montant = result22.getString("Montant");
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                String nbmois2 = result22.getString("nbmois");
                nom2 = "";
                ++i;
                kk = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state34 = conn3.createStatement();
                    result33 = state34.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta33 = result33.getMetaData();
                    while (result33.next()) {
                        nom2 = result33.getString("nom");
                        kk = true;
                    }
                }
                catch (Exception e) {
                    jop35 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state34 = conn3.createStatement();
                        result33 = state34.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta33 = result33.getMetaData();
                        while (result33.next()) {
                            nom2 = result33.getString("nom");
                            kk = true;
                        }
                    }
                    catch (Exception e) {
                        jop35 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                Object[] stg2 = new Object[]{mecano, nom2, Ncession, "Main lev\u00e9e", "--", anne, "--", stac, moiss, nbmois2, ""};
                dt1.addRow(stg2);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            boolean totale = false;
            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state23 = conn22.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            ResultSet result23 = state23.executeQuery("SELECT *  FROM   primesante  WHERE date='" + datedebu + "' ORDER BY n");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result23.next()) {
                ResultSetMetaData resultMeta34;
                ResultSet result34;
                Statement state35;
                String montantbc2;
                JOptionPane jop36;
                String dt2 = "";
                dt2 = result23.getString("date");
                System.out.println("dt = " + dt2);
                Date d1 = sdf.parse(dt2);
                System.out.println("d1 = " + d1);
                System.out.println("--------------");
                System.out.println("---------2222222222-----");
                String nbc = result23.getString("n");
                System.out.println("nbc = " + nbc);
                String Mec2 = result23.getString("Mecano");
                kk = false;
                nom = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state35 = conn3.createStatement();
                    result34 = state35.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec2);
                    resultMeta34 = result34.getMetaData();
                    while (result34.next()) {
                        nom = result34.getString("nom");
                        kk = true;
                    }
                }
                catch (Exception e) {
                    jop36 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state35 = conn3.createStatement();
                        result34 = state35.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec2);
                        resultMeta34 = result34.getMetaData();
                        while (result34.next()) {
                            nom = result34.getString("nom");
                            kk = true;
                        }
                    }
                    catch (Exception e) {
                        jop36 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String date = result23.getString("Date");
                String type = result23.getString("type");
                kk = false;
                String stac = montantbc2 = result23.getString("Montant");
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                Object[] stg3 = new Object[]{Mec2, nom, "----", type, "--", "---", "--", stac, "---", "---", ""};
                dt1.addRow(stg3);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            JOptionPane jop37 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
        String datedebu2 = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            boolean totale = false;
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            state2 = conn2.createStatement();
            result2 = state2.executeQuery("SELECT *  FROM   primescolaire  WHERE date='" + datedebu2 + "' ORDER BY num");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                JOptionPane jop38;
                String montantbc3;
                Statement state36;
                ResultSetMetaData resultMeta35;
                ResultSet result35;
                String nbc = result2.getString("num");
                System.out.println("nbc = " + nbc);
                Mec = result2.getString("MECANO");
                boolean kk5 = false;
                String nom4 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state36 = conn3.createStatement();
                    result35 = state36.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                    resultMeta35 = result35.getMetaData();
                    while (result35.next()) {
                        nom4 = result35.getString("nom");
                        kk5 = true;
                    }
                }
                catch (Exception e) {
                    jop38 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk5) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state36 = conn3.createStatement();
                        result35 = state36.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                        resultMeta35 = result35.getMetaData();
                        while (result35.next()) {
                            nom4 = result35.getString("nom");
                            kk5 = true;
                        }
                    }
                    catch (Exception e) {
                        jop38 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String date = result2.getString("Date");
                String type = "Prime Scolaire S";
                kk5 = false;
                String stac = montantbc3 = result2.getString("montant");
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                Object[] stg4 = new Object[]{Mec, nom4, "----", type, "--", "---", "--", stac, "---", "---", ""};
                dt1.addRow(stg4);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            jop33 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            boolean totale = false;
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            state2 = conn2.createStatement();
            result2 = state2.executeQuery("SELECT *  FROM   primescolaireretretait  WHERE date='" + datedebu2 + "' ORDER BY num");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                String montantbc4;
                String nbc = result2.getString("num");
                System.out.println("nbc = " + nbc);
                Mec = result2.getString("MECANO");
                String anescol = result2.getString("anescol");
                boolean kk6 = false;
                nom2 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state37 = conn3.createStatement();
                    ResultSet result36 = state37.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                    ResultSetMetaData resultMeta36 = result36.getMetaData();
                    while (result36.next()) {
                        nom2 = result36.getString("nom");
                        kk6 = true;
                    }
                }
                catch (Exception e) {
                    JOptionPane jop39 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                }
                String date = result2.getString("Date");
                String type = "Prime Scolaire RET";
                kk6 = false;
                String stac = montantbc4 = result2.getString("montant");
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                stg = new Object[]{Mec, nom2, "213", type, nbc, anescol, "--", stac, "---", "---", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            jop33 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void m1ActionPerformed(ActionEvent evt) {
    }

    private void m1MouseClicked(MouseEvent evt) {
        JOptionPane jop3;
        String Mec;
        ResultSet result2;
        JOptionPane jop32;
        String stac;
        ResultSetMetaData resultMeta3;
        String date;
        ResultSetMetaData resultMeta32;
        Object[] stg;
        ResultSetMetaData resultMeta33;
        String nom;
        ResultSet result3;
        boolean kk;
        Statement state2;
        Statement state3;
        Statement state22;
        String montantbc;
        Statement state32;
        JOptionPane jop33;
        String nbmois;
        Statement state33;
        String dtt;
        String type;
        ResultSet result32;
        ResultSet result33;
        String dt;
        String montantbc2;
        String nbmois2;
        JOptionPane jop34;
        JOptionPane jop35;
        Connection conn2;
        ResultSet result22;
        String mecano;
        String n;
        boolean kk2;
        String anescol;
        int i = 0;
        System.out.println("--++++++++++++++++++++++++++++++ ");
        System.out.println("--++++++++++++++++++++++++++++++ ");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Mat");
        dt1.addColumn("Fournisseur");
        dt1.addColumn("NBC");
        dt1.addColumn("Ann\u00e9e");
        dt1.addColumn("BQ");
        dt1.addColumn("M BC");
        dt1.addColumn("MC");
        dt1.addColumn("Nb");
        dt1.addColumn("Date");
        this.jTable1.setModel(dt1);
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
        Connection conn3 = null;
        try {
            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state22 = conn3.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state22.executeQuery("SELECT *  FROM  bc  WHERE datebc='" + dtt + "' ORDER BY nbc");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                JOptionPane jop36;
                ResultSet result34;
                ResultSetMetaData resultMeta34;
                Statement state34;
                n = result22.getString("nbc");
                mecano = result22.getString("Mecano");
                String stac2 = montantbc = result22.getString("montantbc");
                stac2 = new StringBuilder(stac2).insert(stac2.length() - 3, ".").toString();
                String matf = result22.getString("matf");
                String anneesdebut = result22.getString("anneesdebut");
                String bq = result22.getString("codeb");
                String moisdebut = result22.getString("moisdebut");
                nbmois2 = result22.getString("nbmois");
                dt = "";
                dt = i == 0 ? result22.getString("datebc") : "";
                String nom2 = "";
                ++i;
                boolean kk3 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state34 = conn3.createStatement();
                    result34 = state34.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta34 = result34.getMetaData();
                    while (result34.next()) {
                        nom2 = result34.getString("nom");
                        kk3 = true;
                    }
                }
                catch (Exception e) {
                    jop36 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk3) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state34 = conn3.createStatement();
                        result34 = state34.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta34 = result34.getMetaData();
                        while (result34.next()) {
                            nom2 = result34.getString("nom");
                            kk3 = true;
                        }
                    }
                    catch (Exception e) {
                        jop36 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String nomsc = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn3.createStatement();
                    result33 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + matf);
                    resultMeta33 = result33.getMetaData();
                    while (result33.next()) {
                        nomsc = result33.getString("NOMSOC");
                        kk3 = true;
                    }
                }
                catch (Exception e) {
                    jop33 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                stg = new Object[]{mecano, nom2, matf, nomsc, n, anneesdebut, bq, stac2, moisdebut, nbmois2, dt};
                dt1.addRow(stg);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state22 = conn3.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state22.executeQuery("SELECT *  FROM cession2  WHERE date='" + dtt + "' ORDER BY NBC");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                n = result22.getString("NBC");
                mecano = result22.getString("mecano");
                montantbc = result22.getString("Montant");
                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                String matf = "------";
                String anneesdebut = result22.getString("annenbc");
                String bq = result22.getString("ref");
                String moisdebut = result22.getString("premiermois");
                String moisd = moisdebut.substring(0, moisdebut.length() - 6);
                System.out.println("mois debut =" + moisd + "--");
                moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                nbmois2 = result22.getString("Nbmois");
                dt = "";
                dt = i == 0 ? result22.getString("date") : "";
                String nomsc = "CS Sur salaire";
                String nom3 = "";
                ++i;
                boolean kk4 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn3.createStatement();
                    result33 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta33 = result33.getMetaData();
                    while (result33.next()) {
                        nom3 = result33.getString("nom");
                        kk4 = true;
                    }
                }
                catch (Exception e) {
                    jop33 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn3.createStatement();
                        result33 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta33 = result33.getMetaData();
                        while (result33.next()) {
                            nom3 = result33.getString("nom");
                            kk4 = true;
                        }
                    }
                    catch (Exception e) {
                        jop33 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                stg = new Object[]{mecano, nom3, matf, nomsc, n, anneesdebut, bq, montantbc, moisdebut, nbmois2, dt};
                dt1.addRow(stg);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur cs sur  salaire : " + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state22 = conn3.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state22.executeQuery("SELECT *  FROM demandefdd  WHERE date='" + dtt + "' ORDER BY nbch");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                n = result22.getString("nbch");
                mecano = result22.getString("Mecano");
                montantbc = result22.getString("Montant");
                String anneesdebut = result22.getString("anne");
                String bq = result22.getString("codeb");
                String moisdebut = result22.getString("datedebut");
                String moisd = moisdebut.substring(0, moisdebut.length() - 6);
                System.out.println("mois debut =" + moisd + "--");
                moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                nbmois = result22.getString("Nbmois");
                String dt2 = "";
                dt2 = i == 0 ? result22.getString("date") : "";
                String nom4 = "";
                ++i;
                boolean kk5 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state33 = conn3.createStatement();
                    result32 = state33.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta32 = result32.getMetaData();
                    while (result32.next()) {
                        nom4 = result32.getString("nom");
                        kk5 = true;
                    }
                }
                catch (Exception e) {
                    jop34 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state33 = conn3.createStatement();
                        result32 = state33.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta32 = result32.getMetaData();
                        while (result32.next()) {
                            nom4 = result32.getString("nom");
                            kk5 = true;
                        }
                    }
                    catch (Exception e) {
                        jop34 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String nomsc = "Pret FDD 230";
                Object[] stg2 = new Object[]{mecano, nom4, "230", nomsc, n, anneesdebut, bq, montantbc, moisdebut, nbmois, dt2};
                dt1.addRow(stg2);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        System.out.println("--++++++++++++++++++++++++++++++ ");
        this.jTable1.setModel(dt1);
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk ");
        try {
            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state22 = conn3.createStatement();
            dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            System.out.println("dtt = " + dtt);
            result22 = state22.executeQuery("SELECT *  FROM  caisseMainlev\u00e9e  WHERE date='" + dtt + "' ORDER BY date");
            System.out.println("********************************");
            mecano = "";
            while (result22.next()) {
                Statement state35;
                JOptionPane jop37;
                String Montant;
                ResultSet result35;
                ResultSetMetaData resultMeta35;
                String datdddc = result22.getString("date");
                String anne = datdddc.substring(datdddc.length() - 4, datdddc.length());
                String moiss = datdddc.substring(datdddc.length() - 2, datdddc.length());
                String Ncession = result22.getString("Ncession");
                mecano = result22.getString("Mecano");
                String stac3 = Montant = result22.getString("Montant");
                stac3 = new StringBuilder(stac3).insert(stac3.length() - 3, ".").toString();
                nbmois = result22.getString("nbmois");
                nom = "";
                ++i;
                kk2 = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state35 = conn3.createStatement();
                    result35 = state35.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta35 = result35.getMetaData();
                    while (result35.next()) {
                        nom = result35.getString("nom");
                        kk2 = true;
                    }
                }
                catch (Exception e) {
                    jop37 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk2) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state35 = conn3.createStatement();
                        result35 = state35.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta35 = result35.getMetaData();
                        while (result35.next()) {
                            nom = result35.getString("nom");
                            kk2 = true;
                        }
                    }
                    catch (Exception e) {
                        jop37 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                Object[] stg3 = new Object[]{mecano, nom, Ncession, "Main lev\u00e9e", "--", anne, "--", stac3, moiss, nbmois, ""};
                dt1.addRow(stg3);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            boolean totale = false;
            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state23 = conn22.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            ResultSet result23 = state23.executeQuery("SELECT *  FROM   primesante  WHERE date='" + datedebu + "' ORDER BY n");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result23.next()) {
                String montantbc3;
                String dt3 = "";
                dt3 = result23.getString("date");
                System.out.println("dt = " + dt3);
                Date d1 = sdf.parse(dt3);
                System.out.println("d1 = " + d1);
                System.out.println("--------------");
                System.out.println("---------2222222222-----");
                String nbc = result23.getString("n");
                System.out.println("nbc = " + nbc);
                String Mec2 = result23.getString("Mecano");
                kk2 = false;
                String nom5 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state33 = conn3.createStatement();
                    result32 = state33.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec2);
                    resultMeta32 = result32.getMetaData();
                    while (result32.next()) {
                        nom5 = result32.getString("nom");
                        kk2 = true;
                    }
                }
                catch (Exception e) {
                    jop34 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk2) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state33 = conn3.createStatement();
                        result32 = state33.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec2);
                        resultMeta32 = result32.getMetaData();
                        while (result32.next()) {
                            nom5 = result32.getString("nom");
                            kk2 = true;
                        }
                    }
                    catch (Exception e) {
                        jop34 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                String date2 = result23.getString("Date");
                String type2 = result23.getString("type");
                kk2 = false;
                String annee = result23.getString("annee");
                String n2 = result23.getString("n");
                String stac4 = montantbc3 = result23.getString("Montant");
                stac4 = new StringBuilder(stac4).insert(stac4.length() - 3, ".").toString();
                Object[] stg4 = new Object[]{Mec2, nom5, "227", type2, n2, annee, "--", stac4, "---", "---", ""};
                dt1.addRow(stg4);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            JOptionPane jop38 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
        String datedebu2 = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            boolean totale = false;
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            state2 = conn2.createStatement();
            result2 = state2.executeQuery("SELECT *  FROM   primescolaire  WHERE date='" + datedebu2 + "' ORDER BY num");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                String nbc = result2.getString("num");
                System.out.println("nbc = " + nbc);
                Mec = result2.getString("MECANO");
                anescol = result2.getString("anescol");
                kk = false;
                nom = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state32 = conn3.createStatement();
                    result3 = state32.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                        kk = true;
                    }
                }
                catch (Exception e) {
                    jop35 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (!kk) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state32 = conn3.createStatement();
                        result3 = state32.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            kk = true;
                        }
                    }
                    catch (Exception e) {
                        jop35 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                date = result2.getString("Date");
                type = "Prime Scolaire S";
                kk = false;
                stac = montantbc2 = result2.getString("montant");
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                stg = new Object[]{Mec, nom, "213", type, nbc, anescol, "--", stac, "---", "---", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            jop32 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            boolean totale = false;
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            state2 = conn2.createStatement();
            result2 = state2.executeQuery("SELECT *  FROM   primescolaireretretait  WHERE date='" + datedebu2 + "' ORDER BY num");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                String nbc = result2.getString("num");
                System.out.println("nbc = " + nbc);
                Mec = result2.getString("MECANO");
                anescol = result2.getString("anescol");
                kk = false;
                nom = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state32 = conn3.createStatement();
                    result3 = state32.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                        kk = true;
                    }
                }
                catch (Exception e) {
                    jop35 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                }
                date = result2.getString("Date");
                type = "Prime Scolaire RET";
                kk = false;
                stac = montantbc2 = result2.getString("montant");
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                stg = new Object[]{Mec, nom, "213", type, nbc, anescol, "--", stac, "---", "---", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            jop32 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

