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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class caisseDroitFDDetat
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JButton ajoutcredit;
    private JTable ca;
    private JTextField cr;
    private JButton jButton1;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JTextField ob;

    public caisseDroitFDDetat() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.ca = new JTable();
        this.jButton4 = new JButton();
        this.jButton1 = new JButton();
        this.ajoutcredit = new JButton();
        this.jLabel1 = new JLabel();
        this.cr = new JTextField();
        this.jLabel2 = new JLabel();
        this.ob = new JTextField();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Etat de Caisse Droit FDD ");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(180, 0, 340, 20);
        this.jScrollPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createLineBorder(new Color(0, 0, 0))));
        this.jScrollPane1.setForeground(new Color(0, 153, 102));
        this.jScrollPane1.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 14));
        this.ca.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.ca.setFont(new Font("Tahoma", 0, 12));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}}, new String[]{"N\u00b0", "Annee", "date", "mecano", "Nom et prenom", "Debit", "Credit", "Total"}));
        this.ca.setGridColor(new Color(0, 0, 0));
        this.ca.setIntercellSpacing(new Dimension(2, 2));
        this.ca.setRowHeight(40);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseDroitFDDetat.this.caMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.ca);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 100, 780, 400);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton4.setText("Imprimer");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDroitFDDetat.this.jButton4ActionPerformed(evt);
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
                caisseDroitFDDetat.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(520, 30, 150, 30);
        this.ajoutcredit.setFont(new Font("Tahoma", 1, 12));
        this.ajoutcredit.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/Awicons-Vista-Artistic-Coin-add.png")));
        this.ajoutcredit.setText("Ajouter");
        this.ajoutcredit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDroitFDDetat.this.ajoutcreditActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.ajoutcredit);
        this.ajoutcredit.setBounds(400, 30, 120, 30);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setForeground(new Color(102, 0, 153));
        this.jLabel1.setText("Objet :");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(10, 60, 70, 30);
        this.cr.setFont(new Font("Tahoma", 1, 12));
        this.cr.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                caisseDroitFDDetat.this.crKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.cr);
        this.cr.setBounds(240, 30, 160, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 18));
        this.jLabel2.setForeground(new Color(102, 0, 153));
        this.jLabel2.setText("Saisir Debit de caisse :");
        this.jPanel16.add(this.jLabel2);
        this.jLabel2.setBounds(10, 32, 240, 30);
        this.ob.setFont(new Font("Tahoma", 1, 12));
        this.jPanel16.add(this.ob);
        this.ob.setBounds(80, 60, 590, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 800, 510);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        Date actuellEeddc = new Date();
        SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
        String dat = dateFormattddc.format(actuellEeddc);
        MessageFormat header = new MessageFormat("une Copie de l'etat de Caisse Droit Fixe  FDD");
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

    private void crKeyReleased(KeyEvent evt) {
        try {
            int mont = Integer.parseInt(this.cr.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.cr.setText("");
        }
    }

    private void ajoutcreditActionPerformed(ActionEvent evt) {
        if (this.cr.getText().length() < 5) {
            this.k = 0;
            JOptionPane.showMessageDialog(null, "Ajoutez 000");
        } else {
            JOptionPane jop1;
            Connection conn2;
            String p;
            Statement state2;
            Date actuellEee = new Date();
            SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
            String datsystem = dateFormatft.format(actuellEee);
            int total = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state2 = conn3.createStatement();
                p = "1";
                ResultSet result2 = state2.executeQuery("SELECT * FROM caissefdddroitfixe  WHERE n='" + p + "'");
                while (result2.next()) {
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
                state2.executeUpdate("UPDATE  caissefdddroitfixe SET n='0' ");
                this.k = 1;
            }
            catch (Exception e) {
                this.k = 0;
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de modification caisse: " + e.getMessage());
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state2 = conn2.createStatement();
                this.k = 1;
                p = "0";
                int tm = Integer.parseInt(this.cr.getText());
                String mm = "" + (total -= tm) + "";
                String debit = "-" + this.cr.getText();
                state2.executeUpdate("INSERT INTO caissefdddroitfixe(nbch,date,mecano,debit,credit,total,n,objet) VALUES('0','" + datsystem + "','0','" + debit + "','0','" + mm + "','1','" + this.ob.getText() + "')");
                this.cr.setText("");
            }
            catch (Exception e) {
                this.k = 0;
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse Drit fixe fdd fdd : " + e.getMessage());
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
            try {
                this.k = 0;
                Class.forName("com.mysql.jdbc.Driver");
                Statement state22 = conn4.createStatement();
                ResultSet result2 = state22.executeQuery("SELECT * FROM  caissefdddroitfixe  ");
                ResultSetMetaData resultMeta2 = result2.getMetaData();
                System.out.println("------------------------------");
                while (result2.next()) {
                    boolean kk = false;
                    this.k = 0;
                    String nom = "";
                    String date = result2.getString("date");
                    String Num = result2.getString("nbch");
                    String ann = result2.getString("anne");
                    String debit = result2.getString("debit");
                    if (!debit.equals("0")) {
                        debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                        kk = true;
                        nom = result2.getString("objet");
                    }
                    String credit = result2.getString("credit");
                    if (!credit.equals("0")) {
                        credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                    }
                    String totale = result2.getString("total");
                    totale = new StringBuilder(totale).insert(totale.length() - 3, ".").toString();
                    String mecano = result2.getString("mecano");
                    if (!kk) {
                        ResultSet result3;
                        Statement state3;
                        JOptionPane jop3;
                        ResultSetMetaData resultMeta3;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn4.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO='" + mecano + "'");
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                this.k = 1;
                                nom = result3.getString("nom");
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur ss" + e.getMessage());
                        }
                        if (this.k == 0) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state3 = conn4.createStatement();
                                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano='" + mecano + "'");
                                resultMeta3 = result3.getMetaData();
                                while (result3.next()) {
                                    nom = result3.getString("nom");
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur rr" + e.getMessage());
                            }
                        }
                    }
                    medelo.addRow(new Object[]{Num, ann, date, mecano, nom, debit, credit, totale});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Adherant n'existe pas" + e.getMessage());
                this.k = 0;
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
            this.k = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT * FROM  caissefdddroitfixe  ");
            ResultSetMetaData resultMeta2 = result2.getMetaData();
            System.out.println("------------------------------");
            while (result2.next()) {
                boolean kk = false;
                this.k = 0;
                String nom = "";
                String date = result2.getString("date");
                String Num = result2.getString("nbch");
                String ann = result2.getString("anne");
                String debit = result2.getString("debit");
                if (!debit.equals("0")) {
                    debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                    kk = true;
                    nom = result2.getString("objet");
                }
                String credit = result2.getString("credit");
                if (!credit.equals("0")) {
                    credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                }
                String totale = result2.getString("total");
                totale = new StringBuilder(totale).insert(totale.length() - 3, ".").toString();
                String mecano = result2.getString("mecano");
                if (!kk) {
                    JOptionPane jop3;
                    ResultSet result3;
                    Statement state3;
                    ResultSetMetaData resultMeta3;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO='" + mecano + "'");
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.k = 1;
                            nom = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur ss" + e.getMessage());
                    }
                    if (this.k == 0) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano='" + mecano + "'");
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur rr" + e.getMessage());
                        }
                    }
                }
                medelo.addRow(new Object[]{Num, ann, date, mecano, nom, debit, credit, totale});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "err caisse droit fixe" + e.getMessage());
            this.k = 0;
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

