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

public class caissefddetatdecheque1
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
    private JLabel jLabel3;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JRadioButton nonvalider;
    private JLabel totallllllll;
    private JRadioButton tous;
    private JRadioButton valider;

    public caissefddetatdecheque1() {
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
        this.jLabel3 = new JLabel();
        this.totallllllll = new JLabel();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Etat des cheques FDD");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(280, 0, 330, 20);
        this.jScrollPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createLineBorder(new Color(0, 0, 0))));
        this.jScrollPane1.setForeground(new Color(0, 153, 102));
        this.jScrollPane1.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 14));
        this.ca.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.ca.setFont(new Font("Tahoma", 0, 12));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null}}, new String[]{"N\u00b0 CS", "Ann\u00e9e", "N\u00b0 carnet", "N\u00b0 cheque", "Date", "Mecano", "Nom", "Montant", "N\u00b0 G.L", "type", "valider"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Boolean.class};
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
                caissefddetatdecheque1.this.caMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.ca);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 70, 890, 440);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton4.setText("Imprimer");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefddetatdecheque1.this.jButton4ActionPerformed(evt);
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
                caissefddetatdecheque1.this.jButton2ActionPerformed(evt);
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
                caissefddetatdecheque1.this.tousMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.tous);
        this.tous.setBounds(110, 20, 60, 23);
        this.buttonGroup1.add(this.valider);
        this.valider.setFont(new Font("Tahoma", 1, 12));
        this.valider.setForeground(new Color(0, 0, 204));
        this.valider.setText("Cheque valider");
        this.valider.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissefddetatdecheque1.this.validerMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caissefddetatdecheque1.this.validerMouseEntered(evt);
            }
        });
        this.jPanel16.add(this.valider);
        this.valider.setBounds(170, 20, 120, 23);
        this.buttonGroup1.add(this.nonvalider);
        this.nonvalider.setFont(new Font("Tahoma", 1, 12));
        this.nonvalider.setForeground(new Color(0, 0, 204));
        this.nonvalider.setText("cheque non valider");
        this.nonvalider.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caissefddetatdecheque1.this.nonvaliderMouseClicked(evt);
            }
        });
        this.nonvalider.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefddetatdecheque1.this.nonvaliderActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nonvalider);
        this.nonvalider.setBounds(290, 20, 150, 23);
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setText("Recherche :");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(10, 10, 100, 40);
        this.aa.setFont(new Font("Tahoma", 0, 12));
        this.jPanel16.add(this.aa);
        this.aa.setBounds(550, 20, 90, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 12));
        this.jLabel2.setText("Ann\u00e9e :");
        this.jPanel16.add(this.jLabel2);
        this.jLabel2.setBounds(480, 20, 60, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 12));
        this.jLabel3.setText("Total :");
        this.jPanel16.add(this.jLabel3);
        this.jLabel3.setBounds(10, 44, 80, 20);
        this.totallllllll.setFont(new Font("Tahoma", 0, 18));
        this.totallllllll.setForeground(new Color(153, 0, 0));
        this.totallllllll.setText("....................................................");
        this.jPanel16.add(this.totallllllll);
        this.totallllllll.setBounds(110, 44, 320, 20);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 900, 520);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        if (this.tous.isSelected()) {
            Date actuellEeddc = new Date();
            SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
            String dat = dateFormattddc.format(actuellEeddc);
            MessageFormat header = new MessageFormat("Liste des tous les cheques des prets FDD");
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
            MessageFormat header = new MessageFormat("Liste des cheques prets FDD valid\u00e9s");
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
            MessageFormat header = new MessageFormat("Liste des cheques prets FDD non valid\u00e9s");
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
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.nonvalider.isSelected()) {
            Date actuellEed = new Date();
            SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
            String datddd = dateFormattd.format(actuellEed);
            String ann\u00e9es = datddd.substring(6, datddd.length());
            for (int i = 0; i < this.ca.getRowCount(); ++i) {
                String pp;
                Statement state2;
                String numkch = this.ca.getModel().getValueAt(i, 3).toString();
                System.out.println(numkch);
                String jt = "";
                try {
                    jt = this.ca.getModel().getValueAt(i, 10).toString();
                    System.out.println("t[" + i + ",9] ==> " + jt);
                }
                catch (Exception e) {
                    // empty catch block
                }
                if (!jt.equals("true")) continue;
                String numch = this.ca.getModel().getValueAt(i, 3).toString();
                String numGL = this.ca.getModel().getValueAt(i, 8).toString();
                System.out.println("numch : " + numch);
                System.out.println("numGL : " + numGL);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("-----------------------");
                    state2 = conn2.createStatement();
                    pp = "0";
                    state2.executeUpdate("UPDATE  etatdeschequefdd SET pv='" + pp + "' WHERE numch='" + numch + "'");
                    System.out.println("2222222222222222222222");
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("-----------------------");
                    state2 = conn2.createStatement();
                    pp = "0";
                    state2.executeUpdate("UPDATE   etatdeschequefdd SET numGL='" + numGL + "' WHERE numch='" + numch + "'");
                    System.out.println("2222222222222222222222");
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane.showMessageDialog(null, "erreur modifier N\u00b0grand livre" + e.getMessage());
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("-----------------------");
                    state2 = conn2.createStatement();
                    pp = "0";
                    state2.executeUpdate("UPDATE   etatdeschequefdd SET datevalidation='" + datddd + "' WHERE numch='" + numch + "'");
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
            try {
                int totale = 0;
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String pv = "1";
                ResultSet result2 = state2.executeQuery("SELECT * FROM etatdeschequefdd WHERE pv='" + pv + "' ORDER BY numch");
                ResultSetMetaData resultMeta2 = result2.getMetaData();
                System.out.println("------------------------------");
                this.k = 0;
                while (result2.next()) {
                    Statement state3;
                    ResultSet result3;
                    ResultSetMetaData resultMeta3;
                    String nom = "";
                    String date = result2.getString("date");
                    String pvv = result2.getString("pv");
                    String numch = result2.getString("numch");
                    String montant = result2.getString("montant");
                    totale = Integer.parseInt(montant) + totale;
                    montant = new StringBuilder(montant).insert(montant.length() - 3, ".").toString();
                    String numGL = result2.getString("numGL");
                    String mecano = result2.getString("MECANO");
                    String datevalidaion = result2.getString("datevalidation");
                    this.k = 0;
                    String ty = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            ty = "S";
                            this.k = 1;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                    if (this.k == 0) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                ty = "R";
                                nom = result3.getString("nom");
                            }
                        }
                        catch (Exception e) {
                            // empty catch block
                        }
                    }
                    String numcarnet = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state32 = conn2.createStatement();
                        ResultSet result32 = state32.executeQuery("SELECT * FROM  talondescheque  WHERE numcheque=" + numch);
                        ResultSetMetaData resultMeta32 = result32.getMetaData();
                        while (result32.next()) {
                            numcarnet = result32.getString("Numcarnet");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                    String numcs = "";
                    String annecs = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state33 = conn2.createStatement();
                        ResultSet result33 = state33.executeQuery("SELECT * FROM  demandefdd  WHERE numcheque='" + numch + "' AND anne='" + this.aa.getText() + "'");
                        ResultSetMetaData resultMeta33 = result33.getMetaData();
                        while (result33.next()) {
                            numcs = result33.getString("nbch");
                            annecs = result33.getString("anne");
                            medelo.addRow(new Object[]{numcs, annecs, numcarnet, numch, date, mecano, nom, montant, numGL, ty, false});
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
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            int totale = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT * FROM etatdeschequefdd  ORDER BY numch");
            ResultSetMetaData resultMeta2 = result2.getMetaData();
            System.out.println("------------------------------");
            this.k = 0;
            while (result2.next()) {
                ResultSetMetaData resultMeta3;
                Statement state3;
                ResultSet result3;
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
                this.k = 0;
                String ty = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                        ty = "S";
                        this.k = 1;
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            ty = "R";
                            nom = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        // empty catch block
                    }
                }
                String numcarnet = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state32 = conn2.createStatement();
                    ResultSet result32 = state32.executeQuery("SELECT * FROM  talondescheque  WHERE numcheque=" + numch);
                    ResultSetMetaData resultMeta32 = result32.getMetaData();
                    while (result32.next()) {
                        numcarnet = result32.getString("Numcarnet");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                String numcs = "";
                String annecs = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state33 = conn2.createStatement();
                    ResultSet result33 = state33.executeQuery("SELECT * FROM  demandefdd  WHERE numcheque='" + numch + "' AND anne='" + this.aa.getText() + "'");
                    ResultSetMetaData resultMeta33 = result33.getMetaData();
                    while (result33.next()) {
                        numcs = result33.getString("nbch");
                        annecs = result33.getString("anne");
                        medelo.addRow(new Object[]{numcs, annecs, numcarnet, numch, date, mecano, nom, montant, numGL, ty, b});
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
                this.totallllllll.setText(tt);
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
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            int totale = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            String pv = "1";
            ResultSet result2 = state2.executeQuery("SELECT * FROM etatdeschequefdd WHERE pv='" + pv + "' ORDER BY numch");
            ResultSetMetaData resultMeta2 = result2.getMetaData();
            System.out.println("------------------------------");
            this.k = 0;
            while (result2.next()) {
                ResultSetMetaData resultMeta3;
                Statement state3;
                ResultSet result3;
                String nom = "";
                String date = result2.getString("date");
                String pvv = result2.getString("pv");
                String numch = result2.getString("numch");
                String montant = result2.getString("montant");
                totale = Integer.parseInt(montant) + totale;
                montant = new StringBuilder(montant).insert(montant.length() - 3, ".").toString();
                String numGL = result2.getString("numGL");
                String mecano = result2.getString("MECANO");
                String datevalidaion = result2.getString("datevalidation");
                this.k = 0;
                String ty = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                        ty = "S";
                        this.k = 1;
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            ty = "R";
                            nom = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        // empty catch block
                    }
                }
                String numcarnet = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state32 = conn2.createStatement();
                    ResultSet result32 = state32.executeQuery("SELECT * FROM  talondescheque  WHERE numcheque=" + numch);
                    ResultSetMetaData resultMeta32 = result32.getMetaData();
                    while (result32.next()) {
                        numcarnet = result32.getString("Numcarnet");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                String numcs = "";
                String annecs = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state33 = conn2.createStatement();
                    ResultSet result33 = state33.executeQuery("SELECT * FROM  demandefdd  WHERE numcheque='" + numch + "' AND anne='" + this.aa.getText() + "'");
                    ResultSetMetaData resultMeta33 = result33.getMetaData();
                    while (result33.next()) {
                        numcs = result33.getString("nbch");
                        annecs = result33.getString("anne");
                        medelo.addRow(new Object[]{numcs, annecs, numcarnet, numch, date, mecano, nom, montant, numGL, ty, false});
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
                this.totallllllll.setText(tt);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "err selection" + e.getMessage());
            this.k = 0;
        }
    }

    private void validerMouseClicked(MouseEvent evt) {
        Date actuellEed = new Date();
        SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
        String datddd = dateFormattd.format(actuellEed);
        String ann\u00e9es = datddd.substring(6, datddd.length());
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            int totale = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            String pv = "0";
            ResultSet result2 = state2.executeQuery("SELECT * FROM etatdeschequefdd WHERE pv='" + pv + "' ORDER BY numch");
            ResultSetMetaData resultMeta2 = result2.getMetaData();
            System.out.println("------------------------------");
            this.k = 0;
            while (result2.next()) {
                ResultSetMetaData resultMeta3;
                Statement state3;
                ResultSet result3;
                String nom = "";
                String date = result2.getString("date");
                String pvv = result2.getString("pv");
                String numch = result2.getString("numch");
                String montant = result2.getString("montant");
                totale = Integer.parseInt(montant) + totale;
                montant = new StringBuilder(montant).insert(montant.length() - 3, ".").toString();
                String numGL = result2.getString("numGL");
                String mecano = result2.getString("MECANO");
                String datevalidaion = result2.getString("datevalidation");
                this.k = 0;
                String ty = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                        ty = "S";
                        this.k = 1;
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            ty = "R";
                            nom = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        // empty catch block
                    }
                }
                String numcarnet = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state32 = conn2.createStatement();
                    ResultSet result32 = state32.executeQuery("SELECT * FROM  talondescheque  WHERE numcheque=" + numch);
                    ResultSetMetaData resultMeta32 = result32.getMetaData();
                    while (result32.next()) {
                        numcarnet = result32.getString("Numcarnet");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                String numcs = "";
                String annecs = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state33 = conn2.createStatement();
                    ResultSet result33 = state33.executeQuery("SELECT * FROM  demandefdd  WHERE numcheque='" + numch + "' AND anne='" + this.aa.getText() + "'");
                    ResultSetMetaData resultMeta33 = result33.getMetaData();
                    while (result33.next()) {
                        numcs = result33.getString("nbch");
                        annecs = result33.getString("anne");
                        medelo.addRow(new Object[]{numcs, annecs, numcarnet, numch, date, mecano, nom, montant, numGL, ty, true});
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
                this.totallllllll.setText(tt);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "err selection" + e.getMessage());
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

