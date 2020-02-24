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
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class caisseprimeetatdecheque1
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JTextField aa;
    private ButtonGroup buttonGroup1;
    private JTable ca;
    private JButton jButton2;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JRadioButton nonvalider;
    private JRadioButton tous;
    private JRadioButton valider;

    public caisseprimeetatdecheque1() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel16 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.ca = new JTable();
        this.jButton4 = new JButton();
        this.jButton2 = new JButton();
        this.tous = new JRadioButton();
        this.valider = new JRadioButton();
        this.nonvalider = new JRadioButton();
        this.jLabel1 = new JLabel();
        this.aa = new JTextField();
        this.jLabel2 = new JLabel();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Etat des cheques Pime M.A.S.P");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(190, 0, 490, 30);
        this.jScrollPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createLineBorder(new Color(0, 0, 0))));
        this.jScrollPane1.setForeground(new Color(0, 153, 102));
        this.jScrollPane1.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 14));
        this.ca.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.ca.setFont(new Font("Tahoma", 0, 12));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}}, new String[]{"N\u00b0 carnet", "N\u00b0 cheque", "Date", "Mecano", "Nom", "Montant", "N\u00b0 G.L", "type", "valider"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Boolean.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setGridColor(new Color(0, 0, 0));
        this.ca.setIntercellSpacing(new Dimension(2, 2));
        this.ca.setRowHeight(40);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimeetatdecheque1.this.caMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.ca);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 60, 880, 450);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton4.setText("Imprimer");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimeetatdecheque1.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton4);
        this.jButton4.setBounds(650, 20, 120, 30);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton2.setText("Valider");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimeetatdecheque1.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton2);
        this.jButton2.setBounds(770, 20, 110, 30);
        this.buttonGroup1.add(this.tous);
        this.tous.setFont(new Font("Tahoma", 1, 12));
        this.tous.setForeground(new Color(0, 0, 204));
        this.tous.setText("Tous");
        this.tous.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimeetatdecheque1.this.tousMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.tous);
        this.tous.setBounds(120, 30, 60, 23);
        this.buttonGroup1.add(this.valider);
        this.valider.setFont(new Font("Tahoma", 1, 12));
        this.valider.setForeground(new Color(0, 0, 204));
        this.valider.setText("Cheque valider");
        this.valider.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimeetatdecheque1.this.validerMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caisseprimeetatdecheque1.this.validerMouseEntered(evt);
            }
        });
        this.jPanel16.add(this.valider);
        this.valider.setBounds(180, 30, 120, 23);
        this.buttonGroup1.add(this.nonvalider);
        this.nonvalider.setFont(new Font("Tahoma", 1, 12));
        this.nonvalider.setForeground(new Color(0, 0, 204));
        this.nonvalider.setText("cheque non valider");
        this.nonvalider.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimeetatdecheque1.this.nonvaliderMouseClicked(evt);
            }
        });
        this.nonvalider.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimeetatdecheque1.this.nonvaliderActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nonvalider);
        this.nonvalider.setBounds(300, 30, 150, 23);
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setText("Recherche :");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(20, 20, 100, 40);
        this.aa.setFont(new Font("Tahoma", 0, 12));
        this.jPanel16.add(this.aa);
        this.aa.setBounds(550, 20, 90, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 12));
        this.jLabel2.setText("Ann\u00e9e :");
        this.jPanel16.add(this.jLabel2);
        this.jLabel2.setBounds(490, 20, 60, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 900, 520);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        if (this.tous.isSelected()) {
            Date actuellEeddc = new Date();
            SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
            String dat = dateFormattddc.format(actuellEeddc);
            MessageFormat header = new MessageFormat("Liste des tous les cheques des pr\u00e9ts ");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.ca.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.valider.isSelected()) {
            Date actuellEeddc = new Date();
            SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
            String dat = dateFormattddc.format(actuellEeddc);
            MessageFormat header = new MessageFormat("Liste des cheques prets valid\u00e9s");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.ca.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        } else if (this.nonvalider.isSelected()) {
            Date actuellEeddc = new Date();
            SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
            String dat = dateFormattddc.format(actuellEeddc);
            MessageFormat header = new MessageFormat("Liste des cheques prets non valid\u00e9s");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.ca.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        }
    }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        if (this.nonvalider.isSelected()) {
            Date actuellEed = new Date();
            SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
            String datddd = dateFormattd.format(actuellEed);
            String ann\u00e9es = datddd.substring(6, datddd.length());
            for (int i = 0; i < this.ca.getRowCount(); ++i) {
                Connection conn2;
                Statement state2;
                String pp;
                String numkch = this.ca.getModel().getValueAt(i, 2).toString();
                System.out.println(numkch);
                String jt = "";
                try {
                    jt = this.ca.getModel().getValueAt(i, 8).toString();
                    System.out.println("t[" + i + ",9] ==> " + jt);
                }
                catch (Exception e) {
                    // empty catch block
                }
                if (!jt.equals("true")) continue;
                String numch = this.ca.getModel().getValueAt(i, 1).toString();
                String numGL = this.ca.getModel().getValueAt(i, 6).toString();
                System.out.println("numch : " + numch);
                System.out.println("numGL : " + numGL);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    System.out.println("-----------------------");
                    state2 = conn2.createStatement();
                    pp = "0";
                    state2.executeUpdate("UPDATE etatdeschequeprimemasp SET pv='" + pp + "' WHERE numch='" + numch + "'");
                    System.out.println("2222222222222222222222");
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    System.out.println("-----------------------");
                    state2 = conn2.createStatement();
                    pp = "0";
                    state2.executeUpdate("UPDATE  etatdeschequeprimemasp  SET numGL='" + numGL + "' WHERE numch='" + numch + "'");
                    System.out.println("2222222222222222222222");
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane.showMessageDialog(null, "erreur modifier N\u00b0grand livre" + e.getMessage());
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    System.out.println("-----------------------");
                    state2 = conn2.createStatement();
                    pp = "0";
                    state2.executeUpdate("UPDATE  etatdeschequeprimemasp  SET datevalidation='" + datddd + "' WHERE numch='" + numch + "'");
                    System.out.println("2222222222222222222222");
                    continue;
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane.showMessageDialog(null, "erreur modifier date de validation" + e.getMessage());
                }
            }
            DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
            DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
            while (medelo.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            System.out.println("----------------------fgdfgh--------");
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                int totale = 0;
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String pv = "1";
                ResultSet result2 = state2.executeQuery("SELECT * FROM etatdeschequeprimemasp  WHERE pv='" + pv + "'");
                ResultSetMetaData resultMeta2 = result2.getMetaData();
                System.out.println("------------------------------");
                this.k = 0;
                while (result2.next()) {
                    String nom = "";
                    String date = result2.getString("date");
                    String numch = result2.getString("numch");
                    String montant = result2.getString("montant");
                    totale = Integer.parseInt(montant) + totale;
                    montant = new StringBuilder(montant).insert(montant.length() - 3, ".").toString();
                    String mecano = result2.getString("MECANO");
                    String numGL = result2.getString("numGL");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                    String numcarnet = "";
                    String typecarnet = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM  talondescheque  WHERE numcheque=" + numch);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            numcarnet = result3.getString("Numcarnet");
                            typecarnet = result3.getString("type");
                            medelo.addRow(new Object[]{numcarnet, numch, date, mecano, nom, montant, numGL, typecarnet, false});
                            ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                            ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                    this.k = 1;
                }
                if (this.k == 1) {
                    String tt = "" + totale + "";
                    tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                    medelo.addRow(new Object[]{"", "", "", "", "", "", "Total", tt});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "err1" + e.getMessage());
                this.k = 0;
            }
        } else {
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choissre liste des cheques non Valider", "Attention", 0);
        }
    }

    private void tousMouseClicked(MouseEvent evt) {
        Date actuellEed = new Date();
        SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
        String datddd = dateFormattd.format(actuellEed);
        String ann\u00e9es = datddd.substring(6, datddd.length());
        if (this.aa.getText().equals("")) {
            this.aa.setText(ann\u00e9es);
        }
        DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
        DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
        while (medelo.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); ++i) {
                model.removeRow(i);
            }
        }
        System.out.println("----------------------fgdfgh--------");
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int totale = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            String pv = "1";
            ResultSet result2 = state2.executeQuery("SELECT * FROM etatdeschequeprimemasp  ORDER BY numch");
            ResultSetMetaData resultMeta2 = result2.getMetaData();
            System.out.println("------------------------------");
            this.k = 0;
            while (result2.next()) {
                String nom = "";
                String date = result2.getString("date");
                String pvv = result2.getString("pv");
                boolean b = false;
                if (pvv.equals("0")) {
                    b = true;
                }
                String numch = result2.getString("numch");
                String montant = result2.getString("montant");
                totale = Integer.parseInt(montant) + totale;
                montant = new StringBuilder(montant).insert(montant.length() - 3, ".").toString();
                String numGL = result2.getString("numGL");
                String mecano = result2.getString("MECANO");
                String datevalidaion = result2.getString("datevalidation");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                String numcarnet = "";
                String typecarnet = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM  talondescheque  WHERE numcheque=" + numch);
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        numcarnet = result3.getString("Numcarnet");
                        typecarnet = result3.getString("type");
                        medelo.addRow(new Object[]{numcarnet, numch, date, mecano, nom, montant, numGL, typecarnet, b});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                this.k = 1;
            }
            if (this.k == 1) {
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                medelo.addRow(new Object[]{"", "", "", "", "", "", "Total", tt});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "err selection" + e.getMessage());
            this.k = 0;
        }
    }

    private void nonvaliderMouseClicked(MouseEvent evt) {
        Date actuellEed = new Date();
        SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
        String datddd = dateFormattd.format(actuellEed);
        String ann\u00e9es = datddd.substring(6, datddd.length());
        if (this.aa.getText().equals("")) {
            this.aa.setText(ann\u00e9es);
        }
        DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
        DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
        while (medelo.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); ++i) {
                model.removeRow(i);
            }
        }
        System.out.println("----------------------fgdfgh--------");
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int totale = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            String pv = "1";
            ResultSet result2 = state2.executeQuery("SELECT * FROM etatdeschequeprimemasp  WHERE pv='" + pv + "'");
            ResultSetMetaData resultMeta2 = result2.getMetaData();
            System.out.println("------------------------------");
            this.k = 0;
            while (result2.next()) {
                String nom = "";
                String date = result2.getString("date");
                String numch = result2.getString("numch");
                String montant = result2.getString("montant");
                totale = Integer.parseInt(montant) + totale;
                montant = new StringBuilder(montant).insert(montant.length() - 3, ".").toString();
                String mecano = result2.getString("MECANO");
                String numGL = result2.getString("numGL");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                String numcarnet = "";
                String typecarnet = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM  talondescheque  WHERE numcheque=" + numch);
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        numcarnet = result3.getString("Numcarnet");
                        typecarnet = result3.getString("type");
                        medelo.addRow(new Object[]{numcarnet, numch, date, mecano, nom, montant, numGL, typecarnet, false});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                this.k = 1;
            }
            if (this.k == 1) {
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                medelo.addRow(new Object[]{"", "", "", "", "", "", "Total", tt});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "err1" + e.getMessage());
            this.k = 0;
        }
    }

    private void validerMouseClicked(MouseEvent evt) {
        Date actuellEed = new Date();
        SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
        String datddd = dateFormattd.format(actuellEed);
        String ann\u00e9es = datddd.substring(6, datddd.length());
        if (this.aa.getText().equals("")) {
            this.aa.setText(ann\u00e9es);
        }
        DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
        DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
        while (medelo.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); ++i) {
                model.removeRow(i);
            }
        }
        System.out.println("----------------------fgdfgh--------");
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int totale = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            String pv = "0";
            ResultSet result2 = state2.executeQuery("SELECT * FROM etatdeschequeprimemasp  WHERE pv='" + pv + "' ORDER BY numch");
            ResultSetMetaData resultMeta2 = result2.getMetaData();
            System.out.println("------------------------------");
            this.k = 0;
            while (result2.next()) {
                String nom = "";
                String date = result2.getString("date");
                String numch = result2.getString("numch");
                String montant = result2.getString("montant");
                totale = Integer.parseInt(montant) + totale;
                montant = new StringBuilder(montant).insert(montant.length() - 3, ".").toString();
                String mecano = result2.getString("MECANO");
                String numGL = result2.getString("numGL");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                String numcarnet = "";
                String typecarnet = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM  talondescheque  WHERE numcheque=" + numch);
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        numcarnet = result3.getString("Numcarnet");
                        typecarnet = result3.getString("type");
                        medelo.addRow(new Object[]{numcarnet, numch, date, mecano, nom, montant, numGL, typecarnet, true});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                String numcs = "";
                String annecs = "";
                this.k = 1;
            }
            if (this.k == 1) {
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                medelo.addRow(new Object[]{"", "", "Total", tt});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "err1" + e.getMessage());
            this.k = 0;
        }
    }

    private void nonvaliderActionPerformed(ActionEvent evt) {
    }

    private void validerMouseEntered(MouseEvent evt) {
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

