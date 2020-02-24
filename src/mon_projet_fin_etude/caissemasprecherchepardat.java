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

public class caissemasprecherchepardat
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
    private JLabel annefin;
    private JLabel annefin1;
    private JTable ca;
    private JRadioButton dd;
    private JComboBox j1;
    private JComboBox j2;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JTextField jTextField2;
    private JComboBox m1;
    private JComboBox m2;
    private JLabel moisdebut;
    private JLabel moisfin;

    public caissemasprecherchepardat() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.ca = new JTable();
        this.jLabel30 = new JLabel();
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
        this.dd = new JRadioButton();
        this.jButton1 = new JButton();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissemasprecherchepardat.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.ca.setFont(new Font("Tahoma", 0, 12));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}}, new String[]{"Date", "Mecano", "N\u00b0 CNR", "Nom et prenom", "pret", "prime", "Debit", "Credit", "Total"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Boolean.class, Boolean.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setRowHeight(30);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissemasprecherchepardat.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caissemasprecherchepardat.this.caMouseEntered(evt);
            }
        });
        this.ca.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                caissemasprecherchepardat.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.ca);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 110, 750, 400);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("Recherche  :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(30, 30, 90, 30);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Consultation de l'historique de Caisse Pret MASP par date ");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(0, 0, 760, 30);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.setEnabled(false);
        this.m1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissemasprecherchepardat.this.m1MouseClicked(evt);
            }
        });
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissemasprecherchepardat.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.m1);
        this.m1.setBounds(430, 30, 50, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setText("Mois :");
        this.jPanel16.add(this.moisdebut);
        this.moisdebut.setBounds(380, 30, 50, 30);
        this.moisfin.setFont(new Font("Tahoma", 1, 14));
        this.moisfin.setForeground(new Color(153, 0, 0));
        this.moisfin.setText("Mois :");
        this.jPanel16.add(this.moisfin);
        this.moisfin.setBounds(380, 70, 50, 30);
        this.m2.setFont(new Font("Tahoma", 1, 12));
        this.m2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", ""}));
        this.m2.setEnabled(false);
        this.m2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissemasprecherchepardat.this.m2MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caissemasprecherchepardat.this.m2MouseEntered(evt);
            }
        });
        this.jPanel16.add(this.m2);
        this.m2.setBounds(430, 70, 50, 30);
        this.annedebut2.setFont(new Font("Tahoma", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 0));
        this.annedebut2.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annedebut2);
        this.annedebut2.setBounds(500, 30, 80, 30);
        this.annefin.setFont(new Font("Tahoma", 1, 14));
        this.annefin.setForeground(new Color(153, 0, 0));
        this.annefin.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annefin);
        this.annefin.setBounds(500, 70, 50, 30);
        this.a2.setEnabled(false);
        this.a2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissemasprecherchepardat.this.a2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a2);
        this.a2.setBounds(560, 70, 80, 30);
        this.a1.setEnabled(false);
        this.a1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissemasprecherchepardat.this.a1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a1);
        this.a1.setBounds(560, 30, 80, 30);
        this.annefin1.setFont(new Font("Tahoma", 1, 14));
        this.annefin1.setForeground(new Color(153, 0, 0));
        this.annefin1.setText("Jour:");
        this.jPanel16.add(this.annefin1);
        this.annefin1.setBounds(270, 70, 40, 30);
        this.annedebut3.setFont(new Font("Tahoma", 1, 14));
        this.annedebut3.setForeground(new Color(153, 0, 0));
        this.annedebut3.setText("Jour:");
        this.jPanel16.add(this.annedebut3);
        this.annedebut3.setBounds(270, 30, 40, 30);
        this.j2.setFont(new Font("Tahoma", 1, 12));
        this.j2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j2.setEnabled(false);
        this.j2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissemasprecherchepardat.this.j2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.j2);
        this.j2.setBounds(310, 70, 60, 30);
        this.j1.setFont(new Font("Tahoma", 1, 12));
        this.j1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j1.setEnabled(false);
        this.j1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissemasprecherchepardat.this.j1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.j1);
        this.j1.setBounds(310, 30, 60, 30);
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissemasprecherchepardat.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jTextField2);
        this.jTextField2.setBounds(220, 30, 2, 70);
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setForeground(new Color(102, 0, 102));
        this.jLabel1.setText("A :");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(230, 70, 30, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setForeground(new Color(102, 0, 102));
        this.jLabel3.setText("du :");
        this.jPanel16.add(this.jLabel3);
        this.jLabel3.setBounds(230, 30, 30, 30);
        this.dd.setFont(new Font("Tahoma", 1, 14));
        this.dd.setText("Date");
        this.dd.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissemasprecherchepardat.this.ddMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.dd);
        this.dd.setBounds(120, 30, 60, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissemasprecherchepardat.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(650, 30, 100, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 770, 520);
    }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
        int nm = this.ca.getSelectedRow();
        System.out.println("\u00e8_____" + nm);
        String np = this.ca.getModel().getValueAt(nm, 0).toString();
        System.out.println("\u00e8_____" + np);
    }

    private void m1MouseClicked(MouseEvent evt) {
        if (this.dd.isSelected()) {
            DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
            DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
            while (medelo.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM   caissemasphistorique ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String Mec = result2.getString("mecano");
                    boolean kk = true;
                    if (Mec.equals("")) {
                        kk = false;
                    }
                    String nom = "";
                    String cnr = "";
                    if (kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state3 = conn3.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                cnr = result3.getString("NCNR");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                    }
                    String pret = result2.getString("pret");
                    String prime = result2.getString("prime");
                    String debit = result2.getString("debit");
                    if (!debit.equals("0")) {
                        debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                    }
                    String credit = result2.getString("credit");
                    if (!credit.equals("0")) {
                        nom = "VIR MASP";
                        kk = false;
                        credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                    }
                    String total = result2.getString("total");
                    total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                    if (pret.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, true, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else if (prime.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, true, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void m1ActionPerformed(ActionEvent evt) {
    }

    private void m2MouseClicked(MouseEvent evt) {
        if (this.dd.isSelected()) {
            DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
            DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
            while (medelo.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM   caissemasphistorique ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String Mec = result2.getString("mecano");
                    boolean kk = true;
                    if (Mec.equals("")) {
                        kk = false;
                    }
                    String nom = "";
                    String cnr = "";
                    if (kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state3 = conn3.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                cnr = result3.getString("NCNR");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                    }
                    String pret = result2.getString("pret");
                    String prime = result2.getString("prime");
                    String debit = result2.getString("debit");
                    if (!debit.equals("0")) {
                        debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                    }
                    String credit = result2.getString("credit");
                    if (!credit.equals("0")) {
                        nom = "VIR MASP";
                        kk = false;
                        credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                    }
                    String total = result2.getString("total");
                    total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                    if (pret.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, true, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else if (prime.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, true, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
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

    private void a2MouseClicked(MouseEvent evt) {
        if (this.dd.isSelected()) {
            DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
            DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
            while (medelo.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM   caissemasphistorique ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String Mec = result2.getString("mecano");
                    boolean kk = true;
                    if (Mec.equals("")) {
                        kk = false;
                    }
                    String nom = "";
                    String cnr = "";
                    if (kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state3 = conn3.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                cnr = result3.getString("NCNR");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                    }
                    String pret = result2.getString("pret");
                    String prime = result2.getString("prime");
                    String debit = result2.getString("debit");
                    if (!debit.equals("0")) {
                        debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                    }
                    String credit = result2.getString("credit");
                    if (!credit.equals("0")) {
                        nom = "VIR MASP";
                        kk = false;
                        credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                    }
                    String total = result2.getString("total");
                    total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                    if (pret.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, true, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else if (prime.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, true, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void a1MouseClicked(MouseEvent evt) {
        if (this.dd.isSelected()) {
            DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
            DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
            while (medelo.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM   caissemasphistorique ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String Mec = result2.getString("mecano");
                    boolean kk = true;
                    if (Mec.equals("")) {
                        kk = false;
                    }
                    String nom = "";
                    String cnr = "";
                    if (kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state3 = conn3.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                cnr = result3.getString("NCNR");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                    }
                    String pret = result2.getString("pret");
                    String prime = result2.getString("prime");
                    String debit = result2.getString("debit");
                    if (!debit.equals("0")) {
                        debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                    }
                    String credit = result2.getString("credit");
                    if (!credit.equals("0")) {
                        nom = "VIR MASP";
                        kk = false;
                        credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                    }
                    String total = result2.getString("total");
                    total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                    if (pret.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, true, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else if (prime.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, true, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void j2MouseClicked(MouseEvent evt) {
        if (this.dd.isSelected()) {
            DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
            DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
            while (medelo.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM   caissemasphistorique ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String Mec = result2.getString("mecano");
                    boolean kk = true;
                    if (Mec.equals("")) {
                        kk = false;
                    }
                    String nom = "";
                    String cnr = "";
                    if (kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state3 = conn3.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                cnr = result3.getString("NCNR");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                    }
                    String pret = result2.getString("pret");
                    String prime = result2.getString("prime");
                    String debit = result2.getString("debit");
                    if (!debit.equals("0")) {
                        debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                    }
                    String credit = result2.getString("credit");
                    if (!credit.equals("0")) {
                        nom = "VIR MASP";
                        kk = false;
                        credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                    }
                    String total = result2.getString("total");
                    total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                    if (pret.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, true, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else if (prime.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, true, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void j1MouseClicked(MouseEvent evt) {
        if (this.dd.isSelected()) {
            DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
            DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
            while (medelo.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                System.out.println("dtt debut = " + datedebu);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date datedebut = sdf.parse(datedebu);
                System.out.println("dtt fin = " + datedefi);
                Date datedefin = sdf.parse(datedefi);
                ResultSet result2 = state2.executeQuery("SELECT *  FROM   caissemasphistorique ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result2.next()) {
                    String dt = "";
                    dt = result2.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String Mec = result2.getString("mecano");
                    boolean kk = true;
                    if (Mec.equals("")) {
                        kk = false;
                    }
                    String nom = "";
                    String cnr = "";
                    if (kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state3 = conn3.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                cnr = result3.getString("NCNR");
                                kk = true;
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                    }
                    String pret = result2.getString("pret");
                    String prime = result2.getString("prime");
                    String debit = result2.getString("debit");
                    if (!debit.equals("0")) {
                        debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                    }
                    String credit = result2.getString("credit");
                    if (!credit.equals("0")) {
                        nom = "VIR MASP";
                        kk = false;
                        credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                    }
                    String total = result2.getString("total");
                    total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                    if (pret.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, true, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else if (prime.equals("1")) {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, true, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    } else {
                        medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, false, debit, credit, total});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void ddMouseClicked(MouseEvent evt) {
        this.annedebut2.setText("ann\u00e9e");
        this.annefin.setText("ann\u00e9e");
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
        this.j1.enable(true);
        this.j2.enable(true);
        this.m1.enable(true);
        this.m2.enable(true);
        this.a1.enable(true);
        this.a2.enable(true);
        DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
        DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
        while (medelo.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); ++i) {
                model.removeRow(i);
            }
        }
        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            System.out.println("dtt debut = " + datedebu);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date datedebut = sdf.parse(datedebu);
            System.out.println("dtt fin = " + datedefi);
            Date datedefin = sdf.parse(datedefi);
            ResultSet result2 = state2.executeQuery("SELECT *  FROM   caissemasphistorique ");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            while (result2.next()) {
                String dt = "";
                dt = result2.getString("date");
                System.out.println("dt = " + dt);
                Date d1 = sdf.parse(dt);
                System.out.println("d1 = " + d1);
                System.out.println("--------------");
                if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                y = true;
                String Mec = result2.getString("mecano");
                boolean kk = true;
                if (Mec.equals("")) {
                    kk = false;
                }
                String nom = "";
                String cnr = "";
                if (kk) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            cnr = result3.getString("NCNR");
                            kk = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                }
                String pret = result2.getString("pret");
                String prime = result2.getString("prime");
                String debit = result2.getString("debit");
                if (!debit.equals("0")) {
                    debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                }
                String credit = result2.getString("credit");
                if (!credit.equals("0")) {
                    nom = "VIR MASP";
                    kk = false;
                    credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                }
                String total = result2.getString("total");
                total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                if (pret.equals("1")) {
                    medelo.addRow(new Object[]{dt, Mec, cnr, nom, true, false, debit, credit, total});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                } else if (prime.equals("1")) {
                    medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, true, debit, credit, total});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                } else {
                    medelo.addRow(new Object[]{dt, Mec, cnr, nom, false, false, debit, credit, total});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat("historique de caisse masp par date  ");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.ca.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
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

