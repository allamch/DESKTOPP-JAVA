/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
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
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class historiqueprime
extends JFrame {
    private JTable Tablerecap;
    private JTextField anescolb;
    private JTable ca;
    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JLabel netat;

    public historiqueprime() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.ca = new JTable();
        this.jButton4 = new JButton();
        this.jButton1 = new JButton();
        this.jLabel1 = new JLabel();
        this.anescolb = new JTextField();
        this.jLabel2 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.Tablerecap = new JTable();
        this.jButton3 = new JButton();
        this.jButton5 = new JButton();
        this.netat = new JLabel();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setLayout(null);
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null}, {null, null, null, null, null, null}, {null, null, null, null, null, null}, {null, null, null, null, null, null}}, new String[]{"N\u00b0", "Mecano", "Nom et prenom", "N\u00b0 CNR", "N\u00b0 CIN", "Montant"}));
        this.jScrollPane1.setViewportView(this.ca);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(320, 100, 670, 420);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/Button-Close-icon.png")));
        this.jButton4.setText("Quitter");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                historiqueprime.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton4);
        this.jButton4.setBounds(580, 40, 130, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton1.setText("Recherche");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                historiqueprime.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(420, 40, 150, 30);
        this.jLabel1.setFont(new Font("Tahoma", 3, 24));
        this.jLabel1.setText("Historique des etats des Primes Scolaire");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(130, 0, 540, 32);
        this.jPanel1.add(this.anescolb);
        this.anescolb.setBounds(230, 40, 120, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 18));
        this.jLabel2.setText("L'ann\u00e9e Scolaire :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(60, 40, 170, 30);
        this.Tablerecap.setModel(new DefaultTableModel(new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"N\u00b0 page", "Date d'impression", "Montant"}));
        this.Tablerecap.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                historiqueprime.this.TablerecapMouseClicked(evt);
            }
        });
        this.jScrollPane2.setViewportView(this.Tablerecap);
        this.jPanel1.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(10, 80, 280, 440);
        this.jButton3.setFont(new Font("Tahoma", 1, 11));
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton3.setText("Imprimer  Recap");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                historiqueprime.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(710, 40, 160, 30);
        this.jButton5.setFont(new Font("Tahoma", 1, 11));
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton5.setText("Imprimer ");
        this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                historiqueprime.this.jButton5ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton5);
        this.jButton5.setBounds(870, 40, 120, 30);
        this.netat.setFont(new Font("Tahoma", 1, 14));
        this.netat.setText("N\u00b0 :...........................");
        this.jPanel1.add(this.netat);
        this.netat.setBounds(320, 74, 140, 20);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 1005, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 533, -2).addContainerGap(-1, 32767)));
        this.pack();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("Date d'impression");
        dt1.addColumn("Montant");
        this.Tablerecap.setModel(dt1);
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object cin = null;
        Object cnr = null;
        Object nom = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn22.createStatement();
            String kl = "0";
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  recapitulationdesetasdeprisscolira WHERE annescol='" + this.anescolb.getText() + "' ORDER BY numetata ");
            boolean k = false;
            int totale = 0;
            while (result2.next()) {
                k = true;
                String num = result2.getString("numetata");
                String dateimprime = result2.getString("dateimprime");
                String montant = result2.getString("montant");
                totale += Integer.parseInt(montant);
                montant = new StringBuilder(montant).insert(montant.length() - 3, ".").toString();
                Object[] stg = new Object[]{num, dateimprime, montant};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.Tablerecap);
            }
            if (k) {
                String mt = "" + totale + "";
                mt = new StringBuilder(mt).insert(mt.length() - 3, ".").toString() + " DT";
                Object[] stg = new Object[]{"", "Totale", mt};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.Tablerecap);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur prime" + e.getMessage());
        }
    }

    private void TablerecapMouseClicked(MouseEvent evt) {
        int lign = this.Tablerecap.getSelectedRow();
        String num = this.Tablerecap.getModel().getValueAt(lign, 0).toString();
        this.netat.setText("N\u00b0 :" + num);
        if (num.equals("")) {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Ann\u00e9e");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom et prenom");
            dt1.addColumn("CNR");
            dt1.addColumn("CIN");
            dt1.addColumn("Montant");
            dt1.addColumn("Date");
            this.ca.setModel(dt1);
        } else {
            System.out.println("num =" + num);
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            String cin = "";
            String cnr = "";
            String nom = "";
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Ann\u00e9e");
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom et prenom");
            dt1.addColumn("CNR");
            dt1.addColumn("CIN");
            dt1.addColumn("Montant");
            dt1.addColumn("Date");
            this.ca.setModel(dt1);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn22.createStatement();
                String kl = "0";
                ResultSet result2 = state2.executeQuery("SELECT *  FROM   primescolaire WHERE anescol='" + this.anescolb.getText() + "' AND Numetat='" + num + "' ORDER BY num  ");
                boolean k = false;
                int totale = 0;
                while (result2.next()) {
                    k = true;
                    String anescol = result2.getString("anescol");
                    String MECANO = result2.getString("MECANO");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + MECANO);
                        while (result3.next()) {
                            k = true;
                            cnr = result3.getString("NCNR");
                            cin = result3.getString("CIN");
                            nom = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        k = false;
                    }
                    String Montant = result2.getString("montant");
                    String date = result2.getString("date");
                    totale = Integer.parseInt(Montant) + totale;
                    Montant = new StringBuilder(Montant).insert(Montant.length() - 3, ".").toString();
                    Object[] stg = new Object[]{num, anescol, MECANO, nom, cnr, cin, Montant, date};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
                if (k) {
                    String mt = "" + totale + "";
                    mt = new StringBuilder(mt).insert(mt.length() - 3, ".").toString() + " DT";
                    Object[] stg = new Object[]{"", "", "", "", "", "Totale", mt, ""};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur prime" + e.getMessage());
            }
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat("R\u00e9caputulation des Etats des primes scolaire " + this.netat.getText() + "Ann\u00e9e:" + this.anescolb);
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.Tablerecap.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat("Etat des primes scolaire " + this.netat.getText() + "Ann\u00e9e:" + this.anescolb);
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.ca.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (!"Nimbus".equals(info.getName())) continue;
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(historiqueprime.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(historiqueprime.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(historiqueprime.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(historiqueprime.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new historiqueprime().setVisible(true);
            }
        });
    }

}

