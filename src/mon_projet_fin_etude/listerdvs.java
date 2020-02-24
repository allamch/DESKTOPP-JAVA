/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
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
import javax.swing.GroupLayout;
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
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public final class listerdvs
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
    private JButton jButton1;
    private JComboBox jComboBox1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;

    public listerdvs() {
        this.initComponents();
    }

    private void initComponents() {
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel2 = new JLabel();
        this.jButton1 = new JButton();
        this.jTextField1 = new JTextField();
        this.jComboBox1 = new JComboBox();
        this.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Agency FB", 3, 18)));
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "liste des adurant", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
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
                listerdvs.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                listerdvs.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                listerdvs.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Recherche par :");
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                listerdvs.this.jButton1MouseClicked(evt);
            }
        });
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                listerdvs.this.jButton1ActionPerformed(evt);
            }
        });
        this.jComboBox1.setFont(new Font("Tahoma", 0, 14));
        this.jComboBox1.setForeground(new Color(0, 102, 255));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{"N dossier", "N cin", "nom"}));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 569, 32767)).addGroup(layout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.jLabel2).addGap(29, 29, 29).addComponent(this.jComboBox1, -2, 96, -2).addGap(92, 92, 92).addComponent(this.jTextField1, -2, 133, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, 32767).addComponent(this.jButton1, -2, 81, -2))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(44, 44, 44).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2, -2, 27, -2).addComponent(this.jTextField1, -2, 29, -2).addComponent(this.jComboBox1, -2, -1, -2))).addGap(15, 15, 15).addComponent(this.jScrollPane1, -1, 216, 32767)));
        this.jScrollPane1.getAccessibleContext().setAccessibleName("liste des ad\u00e9ron");
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jButton1MouseClicked(MouseEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.dt1 = new DefaultTableModel();
        this.dt1.addColumn("Num cin ");
        this.dt1.addColumn("N dossier");
        this.dt1.addColumn("nom et prenom");
        this.dt1.addColumn("CNR");
        this.dt1.addColumn("GSM");
        this.jTable1.setModel(this.dt1);
        if (this.jComboBox1.getSelectedItem().equals("N cin")) {
            block25 : {
                int cin = Integer.parseInt(this.jTextField1.getText());
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mutuelle", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT MECANO  FROM  sante WHERE CIN=" + cin);
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas ", "Information", 1);
                        break block25;
                    }
                    cin = Integer.parseInt(ch1);
                    ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM sante  WHERE CIN=" + this.jTextField1.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            System.out.println("nom =" + this.nom);
                            this.CNR = result3.getString("CNR");
                            this.nom = result3.getString("NOM");
                            this.GSM = result3.getString("CSM");
                            this.CINN = result3.getString("MECANO");
                            Object[] stg = new Object[]{cin, this.CINN, this.nom, this.CNR, this.GSM};
                            this.dt1.addRow(stg);
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
            }
            System.out.println(" n fiche");
        } else if (this.jComboBox1.getSelectedItem().equals("N dossier")) {
            block26 : {
                int cin = Integer.parseInt(this.jTextField1.getText());
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante", "root", "");
                    Statement state = conn3.createStatement();
                    ResultSet result = state.executeQuery("SELECT MECANO  FROM  adherent WHERE MECANO=" + cin);
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas ", "Information", 1);
                        break block26;
                    }
                    cin = Integer.parseInt(ch1);
                    ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.jTextField1.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            System.out.println("nom =" + this.nom);
                            this.CNR = result3.getString("NCNR");
                            this.nom = result3.getString("NOM");
                            this.GSM = result3.getString("TEL");
                            this.CINN = result3.getString("CIN");
                            Object[] stg = new Object[]{this.CINN, cin, this.nom, this.CNR, this.GSM};
                            this.dt1.addRow(stg);
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
            }
            System.out.println(" n fiche");
        } else if (this.jComboBox1.getSelectedItem().equals("nom")) {
            String ch1 = "";
            System.out.println("******************************");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante", "root", "");
                this.nom = this.jTextField1.getText();
                this.nom = this.nom.toUpperCase();
                System.out.println("i-----nom =" + this.nom);
                Statement state = conn4.createStatement();
                System.out.println("*********------------*********************");
                ResultSet result = state.executeQuery("SELECT *  FROM  adherent");
                ResultSetMetaData resultMeta = result.getMetaData();
                while (result.next()) {
                    String firstName = result.getString("NOM");
                    String mecano = result.getString("MECANO");
                    int j = 0;
                    j = firstName.indexOf(this.nom);
                    System.out.println("i-----nom =" + this.nom);
                    System.out.println("i-----ch1 =" + firstName);
                    System.out.println("i--------j = =" + j);
                    if (j == -1) continue;
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn4.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        this.CNR = result3.getString("NCNR");
                        this.NOM = result3.getString("NOM");
                        this.GSM = result3.getString("TEL");
                        mecano = result3.getString("MECANO");
                        this.CINN = result3.getString("CIN");
                        System.out.println("____________________  INSERTION   ____________");
                        Object[] stg = new Object[]{this.CINN, mecano, this.NOM, this.CNR, this.GSM};
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

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

}

