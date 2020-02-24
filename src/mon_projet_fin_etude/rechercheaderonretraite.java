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
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Date;
import javax.accessibility.AccessibleContext;
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
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class rechercheaderonretraite
extends JPanel {
    private DefaultTableModel dt;
    private DefaultTableModel dt1;
    private int nump;
    private String nom;
    private String NOM;
    private String CINN;
    private String mecano;
    private String GSM;
    private String CSM;
    private String prenom;
    private String CNR;
    private Date dateR;
    private JLabel IMAGE;
    private JButton jButton14;
    private JComboBox jComboBox3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel46;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel17;
    private JPanel jPanel18;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JTable jTable1;
    private JTextField jTextField1;

    public rechercheaderonretraite() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel17 = new JPanel();
        this.jComboBox3 = new JComboBox();
        this.jLabel12 = new JLabel();
        this.jSeparator3 = new JSeparator();
        this.jButton14 = new JButton();
        this.jTextField1 = new JTextField();
        this.jPanel18 = new JPanel();
        this.jLabel15 = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jSeparator4 = new JSeparator();
        this.jLabel40 = new JLabel();
        this.jLabel41 = new JLabel();
        this.jLabel42 = new JLabel();
        this.jLabel43 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jLabel44 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jLabel16 = new JLabel();
        this.jLabel46 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.IMAGE = new JLabel();
        this.setLayout(null);
        this.jPanel17.setLayout(null);
        this.jComboBox3.setFont(new Font("Tahoma", 0, 14));
        this.jComboBox3.setForeground(new Color(0, 102, 255));
        this.jComboBox3.setModel(new DefaultComboBoxModel<String>(new String[]{"N dossier", "N cin", "NOM"}));
        this.jPanel17.add(this.jComboBox3);
        this.jComboBox3.setBounds(230, 10, 96, 23);
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("Recherche par :");
        this.jPanel17.add(this.jLabel12);
        this.jLabel12.setBounds(110, 10, 108, 27);
        this.jPanel17.add(this.jSeparator3);
        this.jSeparator3.setBounds(0, 58, 786, 2);
        this.jButton14.setFont(new Font("Tahoma", 1, 12));
        this.jButton14.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton14.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                rechercheaderonretraite.this.jButton14MouseClicked(evt);
            }
        });
        this.jButton14.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                rechercheaderonretraite.this.jButton14ActionPerformed(evt);
            }
        });
        this.jPanel17.add(this.jButton14);
        this.jButton14.setBounds(510, 10, 81, 33);
        this.jPanel17.add(this.jTextField1);
        this.jTextField1.setBounds(360, 10, 133, 29);
        this.add(this.jPanel17);
        this.jPanel17.setBounds(40, 0, 740, 50);
        this.jPanel18.setBorder(BorderFactory.createTitledBorder(null, "\u0628\u062d\u062b", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel18.setPreferredSize(new Dimension(684, 274));
        this.jPanel18.setLayout(null);
        this.jLabel15.setFont(new Font("Tahoma", 3, 14));
        this.jPanel18.add(this.jLabel15);
        this.jLabel15.setBounds(10, 240, 130, 0);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setText("Adresse :");
        this.jPanel18.add(this.jLabel32);
        this.jLabel32.setBounds(20, 240, 80, 20);
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setText("Date de naissance :");
        this.jPanel18.add(this.jLabel33);
        this.jLabel33.setBounds(410, 150, 150, 17);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setText("Lieu de naissance :");
        this.jPanel18.add(this.jLabel35);
        this.jLabel35.setBounds(490, 170, 130, 20);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setForeground(new Color(0, 0, 255));
        this.jLabel36.setText("N\u00b0 C.N.R :");
        this.jPanel18.add(this.jLabel36);
        this.jLabel36.setBounds(360, 20, 90, 20);
        this.jLabel13.setFont(new Font("Tahoma", 1, 14));
        this.jLabel13.setText("Hopital :");
        this.jPanel18.add(this.jLabel13);
        this.jLabel13.setBounds(20, 180, 78, 17);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setForeground(new Color(0, 0, 255));
        this.jLabel39.setText("Mecano :");
        this.jPanel18.add(this.jLabel39);
        this.jLabel39.setBounds(140, 30, 66, 17);
        this.jLabel19.setFont(new Font("Tahoma", 1, 14));
        this.jLabel19.setForeground(new Color(0, 0, 255));
        this.jLabel19.setText("RIB :");
        this.jPanel18.add(this.jLabel19);
        this.jLabel19.setBounds(360, 70, 60, 17);
        this.jPanel18.add(this.jSeparator4);
        this.jSeparator4.setBounds(0, 120, 720, 2);
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Tahoma", 1, 14));
        this.jLabel40.setForeground(new Color(0, 0, 255));
        this.jLabel40.setText("C.I.N :");
        this.jPanel18.add(this.jLabel40);
        this.jLabel40.setBounds(130, 70, 70, 20);
        this.jLabel41.setBackground(new Color(153, 153, 255));
        this.jLabel41.setFont(new Font("Tahoma", 1, 14));
        this.jLabel41.setText("Prefession :");
        this.jPanel18.add(this.jLabel41);
        this.jLabel41.setBounds(280, 180, 90, 20);
        this.jLabel42.setBackground(new Color(153, 153, 255));
        this.jLabel42.setFont(new Font("Tahoma", 1, 14));
        this.jLabel42.setText("N\u00b0 tel :");
        this.jPanel18.add(this.jLabel42);
        this.jLabel42.setBounds(390, 240, 80, 20);
        this.jLabel43.setBackground(new Color(153, 153, 255));
        this.jLabel43.setFont(new Font("Tahoma", 1, 14));
        this.jLabel43.setText("Nom enfant :");
        this.jPanel18.add(this.jLabel43);
        this.jLabel43.setBounds(20, 210, 100, 20);
        this.jLabel1.setText(".............................................");
        this.jPanel18.add(this.jLabel1);
        this.jLabel1.setBounds(420, 60, 270, 30);
        this.jLabel2.setText("............................");
        this.jPanel18.add(this.jLabel2);
        this.jLabel2.setBounds(150, 170, 120, 30);
        this.jLabel3.setText("............................");
        this.jPanel18.add(this.jLabel3);
        this.jLabel3.setBounds(210, 70, 130, 30);
        this.jLabel4.setText("............................");
        this.jPanel18.add(this.jLabel4);
        this.jLabel4.setBounds(230, 20, 120, 30);
        this.jLabel5.setFont(new Font("Tahoma", 0, 18));
        this.jLabel5.setText("..............................");
        this.jPanel18.add(this.jLabel5);
        this.jLabel5.setBounds(450, 10, 240, 30);
        this.jLabel6.setText("............................");
        this.jPanel18.add(this.jLabel6);
        this.jLabel6.setBounds(560, 140, 120, 30);
        this.jLabel7.setText("............................");
        this.jPanel18.add(this.jLabel7);
        this.jLabel7.setBounds(620, 160, 120, 30);
        this.jLabel8.setText("............................");
        this.jPanel18.add(this.jLabel8);
        this.jLabel8.setBounds(370, 170, 120, 30);
        this.jLabel9.setText(".....................................................");
        this.jPanel18.add(this.jLabel9);
        this.jLabel9.setBounds(190, 140, 220, 30);
        this.jLabel10.setText("............................................................");
        this.jPanel18.add(this.jLabel10);
        this.jLabel10.setBounds(120, 210, 240, 30);
        this.jLabel11.setText("............................");
        this.jPanel18.add(this.jLabel11);
        this.jLabel11.setBounds(470, 240, 120, 30);
        this.jLabel18.setText(".......................................................................");
        this.jPanel18.add(this.jLabel18);
        this.jLabel18.setBounds(90, 240, 290, 30);
        this.jLabel44.setBackground(new Color(153, 153, 255));
        this.jLabel44.setFont(new Font("Tahoma", 1, 14));
        this.jLabel44.setText("Nom et prenom :");
        this.jPanel18.add(this.jLabel44);
        this.jLabel44.setBounds(20, 150, 150, 20);
        this.jPanel18.add(this.jSeparator1);
        this.jSeparator1.setBounds(10, 320, 730, 2);
        this.jLabel16.setText("............................");
        this.jPanel18.add(this.jLabel16);
        this.jLabel16.setBounds(510, 210, 120, 30);
        this.jLabel46.setBackground(new Color(153, 153, 255));
        this.jLabel46.setFont(new Font("Tahoma", 1, 14));
        this.jLabel46.setText("Nom conjoint :");
        this.jPanel18.add(this.jLabel46);
        this.jLabel46.setBounds(390, 210, 110, 20);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "liste des adurant", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                rechercheaderonretraite.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}}, new String[]{"Num CIN", "N dosier", "Nom ET PRENOM", "CNR ", "GSM"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                rechercheaderonretraite.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                rechercheaderonretraite.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                rechercheaderonretraite.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel18.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 270, 720, 260);
        this.IMAGE.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/homme.png")));
        this.jPanel18.add(this.IMAGE);
        this.IMAGE.setBounds(10, 20, 110, 100);
        this.add(this.jPanel18);
        this.jPanel18.setBounds(4, 46, 780, 542);
        this.jPanel18.getAccessibleContext().setAccessibleName("");
    }

    private void jButton14MouseClicked(MouseEvent evt) {
    }

    private void jButton14ActionPerformed(ActionEvent evt) {
        block25 : {
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N dossier");
            this.dt1.addColumn("nom et prenom");
            this.dt1.addColumn("RIB");
            this.jTable1.setModel(this.dt1);
            if (this.jComboBox3.getSelectedItem().equals("N cin")) {
                int cin = Integer.parseInt(this.jTextField1.getText());
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT MECANO  FROM  retretait WHERE cin=" + cin);
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas(N CIN)  ", "Information", 1);
                        break block25;
                    }
                    cin = Integer.parseInt(ch1);
                    ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE cin=" + this.jTextField1.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String nom = result3.getString("rib");
                            this.jLabel1.setText(nom);
                            this.jLabel5.setText(result3.getString("cnr"));
                            String CINN = result3.getString("cin");
                            this.jLabel3.setText(CINN);
                            nom = result3.getString("nom");
                            this.jLabel9.setText(nom);
                            this.jLabel4.setText(result3.getString("mecano"));
                            this.jLabel6.setText(result3.getString("datenai"));
                            nom = result3.getString("ntel");
                            this.jLabel11.setText(nom);
                            this.jLabel7.setText(result3.getString("lieunaissance"));
                            nom = result3.getString("adres");
                            this.jLabel18.setText(nom);
                            this.jLabel16.setText(result3.getString("nomconjoinnt"));
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                }
            } else if (this.jComboBox3.getSelectedItem().equals("N dossier")) {
                int cin = Integer.parseInt(this.jTextField1.getText());
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn3.createStatement();
                    ResultSet result = state.executeQuery("SELECT MECANO  FROM  retretait WHERE mecano=" + cin);
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas (N dossier) ", "Information", 1);
                        break block25;
                    }
                    cin = Integer.parseInt(ch1);
                    ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.jTextField1.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String nom = result3.getString("rib");
                            this.jLabel1.setText(nom);
                            this.jLabel5.setText(result3.getString("cnr"));
                            String CINN = result3.getString("cin");
                            this.jLabel3.setText(CINN);
                            nom = result3.getString("nom");
                            this.jLabel9.setText(nom);
                            this.jLabel4.setText(result3.getString("mecano"));
                            this.jLabel6.setText(result3.getString("datenai"));
                            nom = result3.getString("ntel");
                            this.jLabel11.setText(nom);
                            this.jLabel7.setText(result3.getString("lieunaissance"));
                            nom = result3.getString("adres");
                            this.jLabel18.setText(nom);
                            this.jLabel16.setText(result3.getString("nomconjoinnt"));
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                }
            } else if (this.jComboBox3.getSelectedItem().equals("NOM")) {
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    String nom = this.jTextField1.getText();
                    nom = nom.toUpperCase();
                    Statement state = conn4.createStatement();
                    ResultSet result = state.executeQuery("SELECT *  FROM  retretait");
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        String firstName = result.getString("nom");
                        String mecano = result.getString("mecano");
                        int j = 0;
                        j = firstName.indexOf(nom);
                        if (j == -1) continue;
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn4.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            String CNR = result3.getString("rib");
                            this.NOM = result3.getString("nom");
                            mecano = result3.getString("mecano");
                            Object[] stg = new Object[]{mecano, this.NOM, CNR};
                            this.dt1.addRow(stg);
                        }
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                }
                System.out.println(" n fiche");
            }
        }
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
        int nm = this.jTable1.getSelectedRow();
        System.out.println("\u00e8_____" + nm);
        String np = this.jTable1.getModel().getValueAt(nm, 0).toString();
        System.out.println("\u00e8_____" + np);
    }

}

