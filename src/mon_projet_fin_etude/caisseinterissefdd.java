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
import java.sql.Statement;
import java.text.MessageFormat;
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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;

public class caisseinterissefdd
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JTextField a1;
    private JTextField a2;
    private JLabel annedebut2;
    private JLabel annedebut3;
    private JLabel annedebut4;
    private JLabel annedebut5;
    private JComboBox j1;
    private JComboBox j2;
    private JButton jButton4;
    private JLabel jLabel3;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JComboBox m1;
    private JComboBox m2;
    private JLabel moisdebut;
    private JLabel moisdebut1;

    public caisseinterissefdd() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel7 = new JLabel();
        this.m1 = new JComboBox();
        this.moisdebut = new JLabel();
        this.annedebut2 = new JLabel();
        this.a1 = new JTextField();
        this.jLabel3 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton4 = new JButton();
        this.j1 = new JComboBox();
        this.annedebut3 = new JLabel();
        this.annedebut4 = new JLabel();
        this.j2 = new JComboBox();
        this.moisdebut1 = new JLabel();
        this.m2 = new JComboBox();
        this.annedebut5 = new JLabel();
        this.a2 = new JTextField();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Caisse : Droit fixe FDD");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(250, 0, 310, 30);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseinterissefdd.this.m1MouseClicked(evt);
            }
        });
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseinterissefdd.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.m1);
        this.m1.setBounds(410, 30, 50, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setText("Mois :");
        this.jPanel16.add(this.moisdebut);
        this.moisdebut.setBounds(360, 30, 50, 30);
        this.annedebut2.setFont(new Font("Tahoma", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 0));
        this.annedebut2.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annedebut2);
        this.annedebut2.setBounds(470, 30, 50, 30);
        this.a1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseinterissefdd.this.a1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caisseinterissefdd.this.a1MouseEntered(evt);
            }
        });
        this.jPanel16.add(this.a1);
        this.a1.setBounds(530, 30, 80, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setForeground(new Color(102, 0, 102));
        this.jLabel3.setText("Recherche par Date  :");
        this.jPanel16.add(this.jLabel3);
        this.jLabel3.setBounds(10, 30, 210, 30);
        this.jScrollPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createLineBorder(new Color(0, 0, 0))));
        this.jScrollPane1.setForeground(new Color(0, 153, 102));
        this.jScrollPane1.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 14));
        this.jTable1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jTable1.setFont(new Font("Tahoma", 0, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.jTable1.setGridColor(new Color(0, 0, 0));
        this.jTable1.setIntercellSpacing(new Dimension(2, 2));
        this.jTable1.setRowHeight(40);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseinterissefdd.this.jTable1MouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 110, 790, 390);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton4.setText("Imprimer");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseinterissefdd.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton4);
        this.jButton4.setBounds(630, 30, 120, 30);
        this.j1.setFont(new Font("Tahoma", 1, 12));
        this.j1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "tous"}));
        this.j1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseinterissefdd.this.j1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.j1);
        this.j1.setBounds(270, 30, 80, 30);
        this.annedebut3.setFont(new Font("Tahoma", 1, 14));
        this.annedebut3.setForeground(new Color(153, 0, 0));
        this.annedebut3.setText("Jour:");
        this.jPanel16.add(this.annedebut3);
        this.annedebut3.setBounds(220, 30, 40, 30);
        this.annedebut4.setFont(new Font("Tahoma", 1, 14));
        this.annedebut4.setForeground(new Color(153, 0, 0));
        this.annedebut4.setText("Jour:");
        this.jPanel16.add(this.annedebut4);
        this.annedebut4.setBounds(220, 70, 40, 30);
        this.j2.setFont(new Font("Tahoma", 1, 12));
        this.j2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "tous"}));
        this.j2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseinterissefdd.this.j2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.j2);
        this.j2.setBounds(270, 70, 80, 30);
        this.moisdebut1.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut1.setForeground(new Color(153, 0, 0));
        this.moisdebut1.setText("Mois :");
        this.jPanel16.add(this.moisdebut1);
        this.moisdebut1.setBounds(360, 70, 50, 30);
        this.m2.setFont(new Font("Tahoma", 1, 12));
        this.m2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseinterissefdd.this.m2MouseClicked(evt);
            }
        });
        this.m2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseinterissefdd.this.m2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.m2);
        this.m2.setBounds(410, 70, 50, 30);
        this.annedebut5.setFont(new Font("Tahoma", 1, 14));
        this.annedebut5.setForeground(new Color(153, 0, 0));
        this.annedebut5.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annedebut5);
        this.annedebut5.setBounds(470, 70, 50, 30);
        this.a2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseinterissefdd.this.a2MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caisseinterissefdd.this.a2MouseEntered(evt);
            }
        });
        this.jPanel16.add(this.a2);
        this.a2.setBounds(530, 70, 80, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 790, 510);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
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

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void a1MouseClicked(MouseEvent evt) {
        boolean i = false;
        System.out.println("--++++++++++++++++++++++++++++++ ");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("ann\u00e9e");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Montant");
        dt1.addColumn("Date");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        boolean montantparmois = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            System.out.println("dtt fin = " + datedefi);
            Date datedefin = sdf.parse(datedefi);
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  caissint\u00e9risefdd ORDER BY nbch");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                JOptionPane jop3;
                Connection conn3;
                ResultSetMetaData resultMeta3;
                ResultSet result3;
                Statement state3;
                String dt = "";
                dt = result2.getString("Date");
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
                String date = result2.getString("Date");
                String anne = result2.getString("anne");
                kk = false;
                String montantbc = result2.getString("Montantinterise");
                totale = Integer.parseInt(montantbc) + totale;
                Object[] stg = new Object[]{nbc, anne, Mec, nom, montantbc, date};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            if (y) {
                String tt = "" + totale + "000";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", tt, ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void m1ActionPerformed(ActionEvent evt) {
    }

    private void m1MouseClicked(MouseEvent evt) {
        boolean i = false;
        System.out.println("--++++++++++++++++++++++++++++++ ");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("ann\u00e9e");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Montant");
        dt1.addColumn("Date");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        boolean montantparmois = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            System.out.println("dtt fin = " + datedefi);
            Date datedefin = sdf.parse(datedefi);
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  caissint\u00e9risefdd ORDER BY nbch");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                JOptionPane jop3;
                Connection conn3;
                ResultSetMetaData resultMeta3;
                ResultSet result3;
                Statement state3;
                String dt = "";
                dt = result2.getString("Date");
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
                String date = result2.getString("Date");
                String anne = result2.getString("anne");
                kk = false;
                String montantbc = result2.getString("Montantinterise");
                totale = Integer.parseInt(montantbc) + totale;
                Object[] stg = new Object[]{nbc, anne, Mec, nom, montantbc, date};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            if (y) {
                String tt = "" + totale + "000";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", tt, ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void a1MouseEntered(MouseEvent evt) {
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
                    this.m2.setSelectedIndex(3);
                    break;
                }
                case 5: {
                    this.m1.setSelectedIndex(5);
                    this.m2.setSelectedIndex(3);
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
        boolean i = false;
        System.out.println("--++++++++++++++++++++++++++++++ ");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("ann\u00e9e");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Montant");
        dt1.addColumn("Date");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        boolean montantparmois = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            System.out.println("dtt fin = " + datedefi);
            Date datedefin = sdf.parse(datedefi);
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  caissint\u00e9risefdd ORDER BY nbch");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                Connection conn3;
                Statement state3;
                ResultSet result3;
                JOptionPane jop3;
                ResultSetMetaData resultMeta3;
                String dt = "";
                dt = result2.getString("Date");
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
                String date = result2.getString("Date");
                String anne = result2.getString("anne");
                kk = false;
                String montantbc = result2.getString("Montantinterise");
                totale = Integer.parseInt(montantbc) + totale;
                Object[] stg = new Object[]{nbc, anne, Mec, nom, montantbc, date};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            if (y) {
                String tt = "" + totale + "000";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", tt, ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void j2MouseClicked(MouseEvent evt) {
        boolean i = false;
        System.out.println("--++++++++++++++++++++++++++++++ ");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("ann\u00e9e");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Montant");
        dt1.addColumn("Date");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        boolean montantparmois = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            System.out.println("dtt fin = " + datedefi);
            Date datedefin = sdf.parse(datedefi);
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  caissint\u00e9risefdd ORDER BY nbch");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                JOptionPane jop3;
                Connection conn3;
                ResultSetMetaData resultMeta3;
                ResultSet result3;
                Statement state3;
                String dt = "";
                dt = result2.getString("Date");
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
                String date = result2.getString("Date");
                String anne = result2.getString("anne");
                kk = false;
                String montantbc = result2.getString("Montantinterise");
                totale = Integer.parseInt(montantbc) + totale;
                Object[] stg = new Object[]{nbc, anne, Mec, nom, montantbc, date};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            if (y) {
                String tt = "" + totale + "000";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", tt, ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void m2MouseClicked(MouseEvent evt) {
        boolean i = false;
        System.out.println("--++++++++++++++++++++++++++++++ ");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("ann\u00e9e");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Montant");
        dt1.addColumn("Date");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        boolean montantparmois = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            System.out.println("dtt fin = " + datedefi);
            Date datedefin = sdf.parse(datedefi);
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  caissint\u00e9risefdd ORDER BY nbch");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                JOptionPane jop3;
                Connection conn3;
                ResultSetMetaData resultMeta3;
                ResultSet result3;
                Statement state3;
                String dt = "";
                dt = result2.getString("Date");
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
                String date = result2.getString("Date");
                String anne = result2.getString("anne");
                kk = false;
                String montantbc = result2.getString("Montantinterise");
                totale = Integer.parseInt(montantbc) + totale;
                Object[] stg = new Object[]{nbc, anne, Mec, nom, montantbc, date};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            if (y) {
                String tt = "" + totale + "000";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", tt, ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void m2ActionPerformed(ActionEvent evt) {
    }

    private void a2MouseClicked(MouseEvent evt) {
        boolean i = false;
        System.out.println("--++++++++++++++++++++++++++++++ ");
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("ann\u00e9e");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Montant");
        dt1.addColumn("Date");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        boolean montantparmois = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            System.out.println("dtt fin = " + datedefi);
            Date datedefin = sdf.parse(datedefi);
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  caissint\u00e9risefdd ORDER BY nbch");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                JOptionPane jop3;
                Connection conn3;
                ResultSetMetaData resultMeta3;
                ResultSet result3;
                Statement state3;
                String dt = "";
                dt = result2.getString("Date");
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
                String date = result2.getString("Date");
                String anne = result2.getString("anne");
                kk = false;
                String montantbc = result2.getString("Montantinterise");
                totale = Integer.parseInt(montantbc) + totale;
                Object[] stg = new Object[]{nbc, anne, Mec, nom, montantbc, date};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            if (y) {
                String tt = "" + totale + "000";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", tt, ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void a2MouseEntered(MouseEvent evt) {
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

