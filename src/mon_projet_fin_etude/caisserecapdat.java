/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class caisserecapdat extends JPanel {
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
    private JTable jTable1;
    private JRadioButton dd;
    private JComboBox j1;
    private JComboBox j2;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextField jTextField2;
    private JButton jButton2;
    private JComboBox m1;
    private JComboBox m2;
    private JLabel moisdebut;
    private JLabel moisfin;
    private DefaultTableModel dt1;
     public caisserecapdat() {
        this.initComponents();
    }
    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
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
        this.jButton2 = new JButton();
        this.setLayout(null);
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Mutuelle de la Santé : Récapitulation Espèces par date",TitledBorder.CENTER, 0, new Font("Times New Roman", 1, 21),new Color(196, 0, 0)));

        this.jPanel1.setPreferredSize(new Dimension(1000,540));
        this.jPanel1.setLayout(null);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisserecapdat.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setFont(new Font("Times New Roman", 0, 15));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}}, new String[]{"N\u00b0 Reçu", "Mecano", "Nom ","Libellé", "M.C","BQ", "Crédit", "Débit", "M.Caisse","Date","G.L"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.setRowHeight(45);
        this.jTable1.setShowGrid(true);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisserecapdat.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caisserecapdat.this.caMouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                caisserecapdat.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 110, 990, 400);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("Recherche  :");
        this.jPanel1.add(this.jLabel30);
        this.jLabel30.setBounds(30, 30, 90, 30);
        this.m1.setFont(new Font("Times New Roman", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.setEnabled(false);
        this.m1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisserecapdat.this.m1MouseClicked(evt);
            }
        });
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
               caisserecapdat.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.m1);
        this.m1.setBounds(430, 30, 50, 30);
        this.moisdebut.setFont(new Font("Times New Roman", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setText("Mois :");
        this.jPanel1.add(this.moisdebut);
        this.moisdebut.setBounds(380, 30, 50, 30);
        this.moisfin.setFont(new Font("Times New Roman", 1, 14));
        this.moisfin.setForeground(new Color(153, 0, 0));
        this.moisfin.setText("Mois :");
        this.jPanel1.add(this.moisfin);
        this.moisfin.setBounds(380, 70, 50, 30);
        this.m2.setFont(new Font("Times New Roman", 1, 12));
        this.m2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", ""}));
        this.m2.setEnabled(false);
        this.m2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisserecapdat.this.m2MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caisserecapdat.this.m2MouseEntered(evt);
            }
        });
        this.jPanel1.add(this.m2);
        this.m2.setBounds(430, 70, 50, 30);
        this.annedebut2.setFont(new Font("Times New Roman", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 0));
        this.annedebut2.setText("Année :");
        this.jPanel1.add(this.annedebut2);
        this.annedebut2.setBounds(500, 30, 80, 30);
        this.annefin.setFont(new Font("Times New Roman", 1, 14));
        this.annefin.setForeground(new Color(153, 0, 0));
        this.annefin.setText("Année :");
        this.jPanel1.add(this.annefin);
        this.annefin.setBounds(500, 70, 50, 30);
        this.a2.setEnabled(false);
        this.a2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisserecapdat.this.a2MouseClicked(evt);
            }
        });
        this.jPanel1.add(this.a2);
        this.a2.setBounds(560, 70, 80, 30);
        this.a1.setEnabled(false);
        this.a1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
               caisserecapdat.this.a1MouseClicked(evt);
            }
        });
        this.jPanel1.add(this.a1);
        this.a1.setBounds(560, 30, 80, 30);
        this.annefin1.setFont(new Font("Times New Roman", 1, 14));
        this.annefin1.setForeground(new Color(153, 0, 0));
        this.annefin1.setText("Jour:");
        this.jPanel1.add(this.annefin1);
        this.annefin1.setBounds(270, 70, 40, 30);
        this.annedebut3.setFont(new Font("Times New Roman", 1, 14));
        this.annedebut3.setForeground(new Color(153, 0, 0));
        this.annedebut3.setText("Jour:");
        this.jPanel1.add(this.annedebut3);
        this.annedebut3.setBounds(270, 30, 40, 30);
        this.j2.setFont(new Font("Times New Roman", 1, 12));
        this.j2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j2.setEnabled(false);
        this.j2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisserecapdat.this.j2MouseClicked(evt);
            }
        });
        this.jPanel1.add(this.j2);
        this.j2.setBounds(310, 70, 60, 30);
        this.j1.setFont(new Font("Times New Roman", 1, 12));
        this.j1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j1.setEnabled(false);
        this.j1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
               caisserecapdat.this.j1MouseClicked(evt);
            }
        });
        this.jPanel1.add(this.j1);
        this.j1.setBounds(310, 30, 60, 30);
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisserecapdat.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jTextField2);
        this.jTextField2.setBounds(220, 30, 2, 70);
        this.jLabel1.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel1.setForeground(new Color(102, 0, 102));
        this.jLabel1.setText("A :");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(230, 70, 30, 30);
        this.jLabel3.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel3.setForeground(new Color(102, 0, 102));
        this.jLabel3.setText("du :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(230, 30, 30, 30);
        this.dd.setFont(new Font("Times New Roman", 1, 14));
        this.dd.setText("Date");
        this.dd.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
              caisserecapdat.this.ddMouseClicked(evt);
            }
        });
        this.jPanel1.add(this.dd);
        this.dd.setBounds(120, 30, 60, 30);
        this.jButton1.setFont(new Font("Times New Roman", 1, 14));
        this.jButton1.setText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisserecapdat.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(680, 30, 150, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.hide();
        this.add(this.jPanel1);
       this.jPanel1.setBounds(0, 0, 1005,520);
        
        
        
        this.jButton2.setFont(new Font("Times New Roman", 1, 14));
        this.jButton2.setText("Vider");
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton2.hide();
           this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisserecapdat.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(680, 70, 150, 30);
        
        
    }

    
    
    
    
    
    
    private void caMouseClicked(MouseEvent evt) {
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
        int nm = this.jTable1.getSelectedRow();
        System.out.println("\u00e8_____" + nm);
        String np = this.jTable1.getModel().getValueAt(nm, 0).toString();
        System.out.println("\u00e8_____" + np);
    }

    private void m1MouseClicked(MouseEvent evt) {
          
        if (this.dd.isSelected()) {
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N\u00b0 Reçu");
            this.dt1.addColumn("Matricule ");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Libellé");
            this.dt1.addColumn("M.C");
            this.dt1.addColumn("BQ");
            this.dt1.addColumn("Crédit");
            this.dt1.addColumn("Débit");
            this.dt1.addColumn("M.Caisse");
            this.dt1.addColumn("Date");
            this.dt1.addColumn("G.L");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result1 = state2.executeQuery("SELECT *  FROM   caissegenerale ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result1.next()) {
                    String debit;
                    String dt = "";
                    dt = result1.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String numre=result1.getString("numrec");
                    String matricule = result1.getString("matricule");
                    String nom = result1.getString("nom");
                    String lib = result1.getString("typepaiement");
                    String mc=result1.getString("moiscomptable");
                    String bq =result1.getString("bq");
                    String cred =result1.getString("credit");
                    String deb =result1.getString("debit");
                    String mt =result1.getString("montantouverture");
                    String dt11 =result1.getString("date");
                    String gl =result1.getString("grandlivre");
                    Object[] stg = new Object[]{numre,matricule, nom, lib, mc,bq,cred,deb,mt,dt11,gl};
                    this.dt1.addRow(stg);
                    
                } 
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1); 
                 this.jButton1.show();
                this.jButton2.show();
                
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
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N\u00b0 Reçu");
            this.dt1.addColumn("Matricule ");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Libellé");
            this.dt1.addColumn("M.C");
             this.dt1.addColumn("BQ");
            this.dt1.addColumn("Crédit");
            this.dt1.addColumn("Débit");
            this.dt1.addColumn("M.Caisse");
            this.dt1.addColumn("Date");
            this.dt1.addColumn("G.L");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result1 = state2.executeQuery("SELECT *  FROM   caissegenerale ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result1.next()) {
                    String debit;
                    String dt = "";
                    dt = result1.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String numre=result1.getString("numrec");
                    String matricule = result1.getString("matricule");
                    String nom = result1.getString("nom");
                    String lib = result1.getString("typepaiement");
                    String mc=result1.getString("moiscomptable");
                    String bq=result1.getString("bq");
                    String cred =result1.getString("credit");
                    String deb =result1.getString("debit");
                    String mt =result1.getString("montantouverture");
                    String dt11 =result1.getString("date");
                    String gl =result1.getString("grandlivre");
                    Object[] stg = new Object[]{numre,matricule, nom, lib, mc,bq,cred,deb,mt,dt11,gl};
                    this.dt1.addRow(stg);
                    
                } 
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1); 
                this.jButton1.show();
                 this.jButton2.show();
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
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N\u00b0 Reçu");
            this.dt1.addColumn("Matricule ");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Libellé");
            this.dt1.addColumn("M.C");
            this.dt1.addColumn("BQ");
            this.dt1.addColumn("Crédit");
            this.dt1.addColumn("Débit");
            this.dt1.addColumn("M.Caisse");
            this.dt1.addColumn("Date");
            this.dt1.addColumn("G.L");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result1 = state2.executeQuery("SELECT *  FROM   caissegenerale ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result1.next()) {
                    String debit;
                    String dt = "";
                    dt = result1.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String numre=result1.getString("numrec");
                    String matricule = result1.getString("matricule");
                    String nom = result1.getString("nom");
                    String lib = result1.getString("typepaiement");
                    String mc=result1.getString("moiscomptable");
                    String bq=result1.getString("bq");
                    String cred =result1.getString("credit");
                    String deb =result1.getString("debit");
                    String mt =result1.getString("montantouverture");
                    String dt11 =result1.getString("date");
                    String gl =result1.getString("grandlivre");
                    Object[] stg = new Object[]{numre,matricule, nom, lib, mc,bq,cred,deb,mt,dt11,gl};
                    this.dt1.addRow(stg);
                    
                } 
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1); 
                 this.jButton1.show();
                 this.jButton2.show();
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void a1MouseClicked(MouseEvent evt) {
      if (this.dd.isSelected()) {
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N\u00b0 Reçu");
            this.dt1.addColumn("Matricule ");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Libellé");
            this.dt1.addColumn("M.C");
            this.dt1.addColumn("BQ");
            this.dt1.addColumn("Crédit");
            this.dt1.addColumn("Débit");
            this.dt1.addColumn("M.Caisse");
            this.dt1.addColumn("Date");
            this.dt1.addColumn("G.L");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result1 = state2.executeQuery("SELECT *  FROM   caissegenerale ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result1.next()) {
                    String debit;
                    String dt = "";
                    dt = result1.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String numre=result1.getString("numrec");
                    String matricule = result1.getString("matricule");
                    String nom = result1.getString("nom");
                    String lib = result1.getString("typepaiement");
                    String mc=result1.getString("moiscomptable");
                    String bq=result1.getString("bq");
                    String cred =result1.getString("credit");
                    String deb =result1.getString("debit");
                    String mt =result1.getString("montantouverture");
                    String dt11 =result1.getString("date");
                    String gl =result1.getString("grandlivre");
                    Object[] stg = new Object[]{numre,matricule, nom, lib, mc,bq,cred,deb,mt,dt11,gl};
                    this.dt1.addRow(stg);
                    
                } 
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1); 
                 this.jButton1.show();
                 this.jButton2.show();
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void j2MouseClicked(MouseEvent evt) {
         if (this.dd.isSelected()) {
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N\u00b0 Reçu");
            this.dt1.addColumn("Matricule ");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Libellé");
            this.dt1.addColumn("M.C");
            this.dt1.addColumn("BQ");
            this.dt1.addColumn("Crédit");
            this.dt1.addColumn("Débit");
            this.dt1.addColumn("M.Caisse");
            this.dt1.addColumn("Date");
            this.dt1.addColumn("G.L");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result1 = state2.executeQuery("SELECT *  FROM   caissegenerale ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result1.next()) {
                    String debit;
                    String dt = "";
                    dt = result1.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String numre=result1.getString("numrec");
                    String matricule = result1.getString("matricule");
                    String nom = result1.getString("nom");
                    String lib = result1.getString("typepaiement");
                    String mc=result1.getString("moiscomptable");
                    String bq=result1.getString("bq");
                    String cred =result1.getString("credit");
                    String deb =result1.getString("debit");
                    String mt =result1.getString("montantouverture");
                    String dt11 =result1.getString("date");
                    String gl =result1.getString("grandlivre");
                    Object[] stg = new Object[]{numre,matricule, nom, lib, mc,bq,cred,deb,mt,dt11,gl};
                    this.dt1.addRow(stg);
                    
                } 
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1); 
                 this.jButton1.show();
                 this.jButton2.show();
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void j1MouseClicked(MouseEvent evt) {
      if (this.dd.isSelected()) {
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N\u00b0 Reçu");
            this.dt1.addColumn("Matricule ");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Libellé");
            this.dt1.addColumn("M.C");
            this.dt1.addColumn("BQ");
            this.dt1.addColumn("Crédit");
            this.dt1.addColumn("Débit");
            this.dt1.addColumn("M.Caisse");
            this.dt1.addColumn("Date");
            this.dt1.addColumn("G.L");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result1 = state2.executeQuery("SELECT *  FROM   caissegenerale ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result1.next()) {
                    String debit;
                    String dt = "";
                    dt = result1.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String numre=result1.getString("numrec");
                    String matricule = result1.getString("matricule");
                    String nom = result1.getString("nom");
                    String lib = result1.getString("typepaiement");
                    String mc=result1.getString("moiscomptable");
                    String bq=result1.getString("bq");
                    String cred =result1.getString("credit");
                    String deb =result1.getString("debit");
                    String mt =result1.getString("montantouverture");
                    String dt11 =result1.getString("date");
                    String gl =result1.getString("grandlivre");
                    Object[] stg = new Object[]{numre,matricule, nom, lib, mc,bq,cred,deb,mt,dt11,gl};
                    this.dt1.addRow(stg);
                    
                } 
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                 this.jButton1.show();
                 this.jButton2.show();
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
           if (this.dd.isSelected()) {
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N\u00b0 Reçu");
            this.dt1.addColumn("Matricule ");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Libellé");
            this.dt1.addColumn("M.C");
             this.dt1.addColumn("BQ");
            this.dt1.addColumn("Crédit");
            this.dt1.addColumn("Débit");
            this.dt1.addColumn("M.Caisse");
            this.dt1.addColumn("Date");
            this.dt1.addColumn("G.L");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result1 = state2.executeQuery("SELECT *  FROM   caissegenerale ");
                System.out.println("-------55555555555555555-------");
                boolean y = false;
                while (result1.next()) {
                    String debit;
                    String dt = "";
                    dt = result1.getString("date");
                    System.out.println("dt = " + dt);
                    Date d1 = sdf.parse(dt);
                    System.out.println("d1 = " + d1);
                    System.out.println("--------------");
                    if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                    y = true;
                    String numre=result1.getString("numrec");
                    String matricule = result1.getString("matricule");
                    String nom = result1.getString("nom");
                    String lib = result1.getString("typepaiement");
                    String mc=result1.getString("moiscomptable");
                    String bq=result1.getString("bq");
                    String cred =result1.getString("credit");
                    String deb =result1.getString("debit");
                    String mt =result1.getString("montantouverture");
                    String dt11 =result1.getString("date");
                    String gl =result1.getString("grandlivre");
                    Object[] stg = new Object[]{numre,matricule, nom, lib, mc,bq,cred,deb,mt,dt11,gl};
                    this.dt1.addRow(stg);
                    
                } 
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1); 
                 this.jButton1.show();
                 this.jButton2.show();
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
            }
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat("Historique caisse espèces par date  ");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
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

    private void jButton2ActionPerformed(ActionEvent evt) {
         int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment vider ?", "Quitter", 0, 3);
        if (option == 0) {
        
        this.dd.setSelected(false);
        this.a1.setText("");
        this.a2.setText("");
        this.j1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.j1.enable(false);
        this.j2.enable(false);
        this.m1.enable(false);
        this.m2.enable(false);
        this.a1.enable(false);
        this.a2.enable(false);
        this.dt1 = new DefaultTableModel();
        this.dt1.addColumn("N\u00b0 Reçu");
        this.dt1.addColumn("Matricule ");
        this.dt1.addColumn("Nom ");
        this.dt1.addColumn("Libellé");
        this.dt1.addColumn("M.C");
        this.dt1.addColumn("BQ");
        this.dt1.addColumn("Crédit");
        this.dt1.addColumn("Débit");
        this.dt1.addColumn("M.Caisse");
        this.dt1.addColumn("Date");
        this.dt1.addColumn("G.L");
        this.jTable1.setModel(this.dt1);
        this.jButton1.hide();
        this.jButton2.hide();
        
        }
        
    }

}


    
    

