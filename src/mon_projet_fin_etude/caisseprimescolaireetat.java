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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class caisseprimescolaireetat
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JTable ca;
    private JTextField credit;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JToggleButton jToggleButton1;

    public caisseprimescolaireetat() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.ca = new JTable();
        this.jButton4 = new JButton();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel1 = new JLabel();
        this.credit = new JTextField();
        this.jToggleButton1 = new JToggleButton();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Etat Caisse Prime scolaire ***");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(140, 0, 390, 20);
        this.jScrollPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createLineBorder(new Color(0, 0, 0))));
        this.jScrollPane1.setForeground(new Color(0, 153, 102));
        this.jScrollPane1.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 14));
        this.ca.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.ca.setFont(new Font("Tahoma", 0, 12));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}}, new String[]{"N\u00b0", "Ann\u00e9e scolaire", "date", "mecano", "N\u00b0 CNR", "Nom et prenom", "Debit", "Credit", "Total"}));
        this.ca.setGridColor(new Color(0, 0, 0));
        this.ca.setIntercellSpacing(new Dimension(2, 2));
        this.ca.setRowHeight(40);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimescolaireetat.this.caMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.ca);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 60, 780, 440);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton4.setText("Imprimer");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimescolaireetat.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton4);
        this.jButton4.setBounds(670, 30, 120, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/Capture.PNG")));
        this.jButton1.setText("Recherche");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimescolaireetat.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(520, 30, 150, 30);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/Awicons-Vista-Artistic-Coin-add.png")));
        this.jButton2.setText("Ajouter");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimescolaireetat.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton2);
        this.jButton2.setBounds(400, 30, 120, 30);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setForeground(new Color(102, 0, 153));
        this.jLabel1.setText("Saisir Le credit de caisse :");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(10, 32, 240, 30);
        this.credit.setFont(new Font("Tahoma", 1, 12));
        this.credit.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                caisseprimescolaireetat.this.creditKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.credit);
        this.credit.setBounds(240, 30, 160, 30);
        this.jToggleButton1.setFont(new Font("Tahoma", 1, 12));
        this.jToggleButton1.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/miseajour.PNG")));
        this.jToggleButton1.setText("Mise a jour de caisse");
        this.jToggleButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimescolaireetat.this.jToggleButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jToggleButton1);
        this.jToggleButton1.setBounds(560, 0, 220, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 800, 510);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        Date actuellEeddc = new Date();
        SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
        String dat = dateFormattddc.format(actuellEeddc);
        MessageFormat header = new MessageFormat("une Copie de l'etat de Caisse Prime Scolaire");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.ca.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void creditKeyReleased(KeyEvent evt) {
        try {
            int mont = Integer.parseInt(this.credit.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.credit.setText("");
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        if (this.credit.getText().length() < 5) {
            this.k = 0;
            JOptionPane.showMessageDialog(null, "Ajoutez 000");
        } else {
            JOptionPane jop1;
            Statement state2;
            Connection conn2;
            String p;
            Date actuellEee = new Date();
            SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
            String datsystem = dateFormatft.format(actuellEee);
            String annescoaie = "";
            int total = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state2 = conn3.createStatement();
                p = "1";
                ResultSet result2 = state2.executeQuery("SELECT * FROM caisseprimescolaire  WHERE n='" + p + "'");
                while (result2.next()) {
                    annescoaie = result2.getString("annescoaie");
                    String ttt = result2.getString("total");
                    total = Integer.parseInt(ttt);
                }
            }
            catch (Exception e) {
                this.k = 0;
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur select" + e.getMessage());
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state2 = conn2.createStatement();
                p = "0";
                state2.executeUpdate("UPDATE  caisseprimescolaire SET n='0' ");
                this.k = 1;
            }
            catch (Exception e) {
                this.k = 0;
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de modification caisse: " + e.getMessage());
            }
            this.k = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state2 = conn2.createStatement();
                this.k = 1;
                String pret = "0";
                String prime = "0";
                String mec = "";
                int tm = Integer.parseInt(this.credit.getText());
                String mm = "" + (total += tm) + "";
                state2.executeUpdate("INSERT INTO caisseprimescolaire(date,mecano,debit,credit,total,annescoaie,n) VALUES('" + datsystem + "','','" + prime + "','" + this.credit.getText() + "','" + mm + "','" + annescoaie + "','1')");
                this.credit.setText("");
                this.k = 1;
            }
            catch (Exception e) {
                this.k = 0;
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse : " + e.getMessage());
            }
            DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
            DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
            while (medelo.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            System.out.println("----------------------fgdfgh--------");
            Connection conn4 = null;
            try {
                conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (this.k == 1) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state22 = conn4.createStatement();
                    ResultSet result2 = state22.executeQuery("SELECT * FROM caisseprimescolaire  ");
                    ResultSetMetaData resultMeta2 = result2.getMetaData();
                    System.out.println("------------------------------");
                    while (result2.next()) {
                        boolean kk = true;
                        String nom = "";
                        String NCNR = "";
                        String date = result2.getString("date");
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
                        String totale = result2.getString("total");
                        if (!totale.equals("0")) {
                            totale = new StringBuilder(totale).insert(totale.length() - 3, ".").toString();
                        }
                        String mecano = result2.getString("mecano");
                        String num = result2.getString("num");
                        annescoaie = result2.getString("annescoaie");
                        if (mecano.equals("")) {
                            kk = false;
                        }
                        if (kk) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement state3 = conn4.createStatement();
                                ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                                ResultSetMetaData resultMeta3 = result3.getMetaData();
                                while (result3.next()) {
                                    nom = result3.getString("nom");
                                    NCNR = result3.getString("NCNR");
                                }
                            }
                            catch (Exception e) {
                                JOptionPane jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                            }
                        }
                        medelo.addRow(new Object[]{num, annescoaie, date, mecano, NCNR, nom, debit, credit, totale});
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                        ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "err1" + e.getMessage());
                    this.k = 0;
                }
            }
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
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
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT * FROM caisseprimescolaire  ");
            ResultSetMetaData resultMeta2 = result2.getMetaData();
            System.out.println("------------------------------");
            while (result2.next()) {
                boolean kk = true;
                String nom = "";
                String NCNR = "";
                String date = result2.getString("date");
                String debit = result2.getString("debit");
                if (!debit.equals("0")) {
                    debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                }
                String creditt = result2.getString("credit");
                if (!creditt.equals("0")) {
                    nom = "VIR MASP";
                    kk = false;
                    creditt = new StringBuilder(creditt).insert(creditt.length() - 3, ".").toString();
                }
                String total = result2.getString("total");
                if (!total.equals("0")) {
                    total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                }
                String mecano = result2.getString("mecano");
                String num = result2.getString("num");
                String annescoaie = result2.getString("annescoaie");
                if (mecano.equals("")) {
                    kk = false;
                }
                if (kk) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            NCNR = result3.getString("NCNR");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                }
                medelo.addRow(new Object[]{num, annescoaie, date, mecano, NCNR, nom, debit, creditt, total});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "err1" + e.getMessage());
            this.k = 0;
        }
    }

    private void jToggleButton1ActionPerformed(ActionEvent evt) {
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
        String datdd = dateFormatt.format(actuellEe);
        String ann\u00e9es = datdd.substring(6, datdd.length());
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
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT * FROM caisseprimescolaire  ");
            ResultSetMetaData resultMeta2 = result2.getMetaData();
            System.out.println("------------------------------");
            while (result2.next()) {
                boolean kk = true;
                String nom = "";
                String NCNR = "";
                String date = result2.getString("date");
                String debit = result2.getString("debit");
                if (!debit.equals("0")) {
                    debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                }
                String creditt = result2.getString("credit");
                if (!creditt.equals("0")) {
                    nom = "VIR MASP";
                    kk = false;
                    creditt = new StringBuilder(creditt).insert(creditt.length() - 3, ".").toString();
                }
                String total = result2.getString("total");
                if (!total.equals("0")) {
                    total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                }
                String mecano = result2.getString("mecano");
                String num = result2.getString("num");
                String annescoaie = result2.getString("annescoaie");
                if (mecano.equals("")) {
                    kk = false;
                }
                if (kk) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            NCNR = result3.getString("NCNR");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                }
                ++i;
                medelo.addRow(new Object[]{num, annescoaie, date, mecano, NCNR, nom, debit, creditt, total});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "err1" + e.getMessage());
            this.k = 0;
        }
        if (i > 1) {
            JOptionPane jop = new JOptionPane();
            int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment mettre \u00e0 jour le caisse?", "Quitter", 0, 3);
            if (option == 0) {
                JOptionPane jop1;
                int id2 = 0;
                int maxnumetat = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state2 = conn2.createStatement();
                    System.out.println("---------tghtrhythnj---------------------");
                    ResultSet result2 = state2.executeQuery("SELECT MAX(netat) FROM caisseprimescolairemasphistorique  ");
                    System.out.println("------------------------------");
                    if (result2.next()) {
                        id2 = result2.getInt(1);
                    }
                    System.out.println("------------------------------" + id2);
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "N\u00b0 n'existe pas" + e.getMessage());
                    this.k = 0;
                }
                maxnumetat = id2 + 1;
                System.out.println("Nn " + maxnumetat);
                JOptionPane.showMessageDialog(null, "Attention : Impression De l'etat de caisse ", "Information", 1);
                Date actuellEeddc = new Date();
                SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
                String dat = dateFormattddc.format(actuellEeddc);
                MessageFormat header = new MessageFormat("Etat de Caisse Prime Scolaire  N\u00b0" + maxnumetat + " / " + ann\u00e9es);
                MessageFormat footer = new MessageFormat("Page{0,number,integer}");
                try {
                    this.ca.print(JTable.PrintMode.FIT_WIDTH, header, footer);
                }
                catch (PrinterException e) {
                    System.err.format("Erreure d'mpresstion", e.getMessage());
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT * FROM caisseprimescolaire  ");
                    ResultSetMetaData resultMeta2 = result2.getMetaData();
                    System.out.println("------------------------------");
                    while (result2.next()) {
                        String date = result2.getString("date");
                        String debit = result2.getString("debit");
                        String credit = result2.getString("credit");
                        String total = result2.getString("total");
                        String mecano = result2.getString("mecano");
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state = conn2.createStatement();
                            state.executeUpdate("INSERT INTO caisseprimescolairemasphistorique(date,mecano,debit,credit,total,netat,anne) VALUES('" + date + "','" + mecano + "','" + debit + "','" + credit + "','" + total + "','" + maxnumetat + "','" + ann\u00e9es + "')");
                            this.k = 1;
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse : " + e.getMessage());
                        }
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Adherant n'existe pas" + e.getMessage());
                    this.k = 0;
                }
                if (this.k == 1) {
                    try {
                        Statement state = conn2.createStatement();
                        String n = "0";
                        state.executeUpdate("DELETE  FROM caisseprimescolaire WHERE n='" + n + "'");
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state2 = conn2.createStatement();
                            state2.executeUpdate("UPDATE  caisseprimescolaire SET mecano=''");
                            state2.executeUpdate("UPDATE  caisseprimescolaire SET num='0'");
                            state2.executeUpdate("UPDATE  caisseprimescolaire SET debit='0'");
                            state2.executeUpdate("UPDATE caisseprimescolaire SET credit='0'");
                            this.k = 1;
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                        }
                    }
                    catch (Exception e) {
                        this.k = 0;
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur de vider le caisse " + e.getMessage());
                    }
                }
            }
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

