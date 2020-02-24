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
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class recherchefddparforniseur1
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JLabel annefdd;
    private JTable ca;
    private JTextField codebc;
    private JButton jButton19;
    private JButton jButton20;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel42;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JTextField mec;
    private JLabel nfdd;
    private JLabel nom;
    private JLabel nomadh;

    public recherchefddparforniseur1() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jButton19 = new JButton();
        this.mec = new JTextField();
        this.jLabel30 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel42 = new JLabel();
        this.codebc = new JTextField();
        this.jButton20 = new JButton();
        this.nomadh = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.ca = new JTable();
        this.nom = new JLabel();
        this.nfdd = new JLabel();
        this.jLabel31 = new JLabel();
        this.jLabel32 = new JLabel();
        this.annefdd = new JLabel();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jButton19.setFont(new Font("Tahoma", 1, 12));
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchefddparforniseur1.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton19);
        this.jButton19.setBounds(170, 30, 70, 33);
        this.mec.setFont(new Font("Tahoma", 0, 14));
        this.mec.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchefddparforniseur1.this.mecMouseClicked(evt);
            }
        });
        this.mec.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchefddparforniseur1.this.mecActionPerformed(evt);
            }
        });
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchefddparforniseur1.this.mecKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.mec);
        this.mec.setBounds(80, 30, 80, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("N\u00b0 fdd :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(10, 60, 60, 40);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Modification Code banque FDD ");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(160, 0, 500, 30);
        this.jLabel42.setBackground(new Color(153, 153, 255));
        this.jLabel42.setFont(new Font("Tahoma", 1, 14));
        this.jLabel42.setForeground(new Color(0, 0, 255));
        this.jLabel42.setText("BQ :");
        this.jPanel16.add(this.jLabel42);
        this.jLabel42.setBounds(450, 30, 30, 30);
        this.codebc.setFont(new Font("Tahoma", 0, 14));
        this.codebc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchefddparforniseur1.this.codebcActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.codebc);
        this.codebc.setBounds(490, 30, 100, 30);
        this.jButton20.setFont(new Font("Tahoma", 1, 12));
        this.jButton20.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton20.setText("Modification");
        this.jButton20.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchefddparforniseur1.this.jButton20ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton20);
        this.jButton20.setBounds(600, 30, 137, 30);
        this.nomadh.setFont(new Font("Tahoma", 1, 12));
        this.nomadh.setForeground(new Color(102, 0, 0));
        this.jPanel16.add(this.nomadh);
        this.nomadh.setBounds(760, 40, 240, 40);
        this.jScrollPane1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchefddparforniseur1.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.ca.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.ca.setFont(new Font("Tahoma", 0, 14));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"Mecano", "Nom et prenom", "payment par"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setMinimumSize(new Dimension(120, 150));
        this.ca.setRowHeight(25);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchefddparforniseur1.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                recherchefddparforniseur1.this.caMouseEntered(evt);
            }
        });
        this.ca.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                recherchefddparforniseur1.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.ca);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 110, 740, 410);
        this.nom.setFont(new Font("Tahoma", 1, 14));
        this.nom.setForeground(new Color(153, 0, 51));
        this.nom.setText(".........................");
        this.jPanel16.add(this.nom);
        this.nom.setBounds(250, 30, 190, 30);
        this.nfdd.setFont(new Font("Tahoma", 1, 14));
        this.nfdd.setText("......................");
        this.jPanel16.add(this.nfdd);
        this.nfdd.setBounds(80, 64, 130, 30);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setForeground(new Color(0, 0, 255));
        this.jLabel31.setText("Mat adh :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(10, 30, 80, 30);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("Ann\u00e9e :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(250, 60, 60, 40);
        this.annefdd.setFont(new Font("Tahoma", 1, 14));
        this.annefdd.setText("......................");
        this.jPanel16.add(this.annefdd);
        this.annefdd.setBounds(320, 60, 130, 40);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 760, 530);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jButton19ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("Ann\u00e9e");
        dt1.addColumn("NB-M");
        dt1.addColumn("D debut");
        dt1.addColumn("D fin");
        dt1.addColumn("Montant");
        dt1.addColumn("N\u00b0 cheque");
        dt1.addColumn("Date");
        dt1.addColumn("BQ");
        this.ca.setModel(dt1);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM demandefdd WHERE Mecano ='" + this.mec.getText() + "' ORDER BY nbch");
            System.out.println("-------55555555555555555-------");
            boolean y = false;
            int montantparmois = 0;
            while (result2.next()) {
                String dt = "";
                dt = result2.getString("date");
                y = true;
                System.out.println("---------2222222222-----");
                String nbc = result2.getString("nbch");
                System.out.println("nbc = " + nbc);
                boolean kk = false;
                String nom = "";
                String datedebutt = result2.getString("datedebut");
                String anne = result2.getString("anne");
                String datefinn = result2.getString("datefin");
                System.out.println("*********************");
                kk = false;
                String montantbc = result2.getString("Montant");
                System.out.println("Montant 1=  " + montantbc);
                montantbc = montantbc.replaceAll(",", "");
                System.out.println("Montant 2=  " + montantbc);
                int t = Integer.parseInt(montantbc);
                System.out.println("montant = " + montantbc);
                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                System.out.println("montant 2= " + montantbc);
                String nbmois = result2.getString("Nbmois");
                int nb = Integer.parseInt(nbmois);
                int mpm = t / nb;
                montantparmois += mpm;
                totale += t;
                String codeb = result2.getString("codeb");
                String Ncheque = result2.getString("numcheque");
                Object[] stg = new Object[]{nbc, anne, nbmois, datedebutt, datefinn, montantbc, Ncheque, dt, codeb};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
            if (y) {
                String tt = "" + totale + "";
                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "", "total =", tt, "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void mecKeyReleased(KeyEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean kk = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mec.getText());
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nom.setText(result3.getString("nom"));
                kk = true;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
        }
    }

    private void mecMouseClicked(MouseEvent evt) {
    }

    private void mecActionPerformed(ActionEvent evt) {
    }

    private void jButton20ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state = conn2.createStatement();
            state.executeUpdate("UPDATE demandefdd SET codeb='" + this.codebc.getText() + "' WHERE Mecano='" + this.mec.getText() + "' AND nbch='" + this.nfdd.getText() + "' AND anne='" + this.annefdd.getText() + "'");
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(recherchefddparforniseur1.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void caMouseClicked(MouseEvent evt) {
        int lign = this.ca.getSelectedRow();
        this.codebc.setText(this.ca.getModel().getValueAt(lign, 8).toString());
        this.nfdd.setText(this.ca.getModel().getValueAt(lign, 0).toString());
        this.annefdd.setText(this.ca.getModel().getValueAt(lign, 1).toString());
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void codebcActionPerformed(ActionEvent evt) {
    }

}

