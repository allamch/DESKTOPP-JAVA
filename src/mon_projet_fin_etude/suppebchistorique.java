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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
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
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class suppebchistorique
extends JPanel {
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField mat;
    private JTextField mec;
    private JTextField num;

    public suppebchistorique() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.mec = new JTextField();
        this.num = new JTextField();
        this.mat = new JTextField();
        this.jLabel2 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton1 = new JButton();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Snap ITC", 1, 24));
        this.jLabel1.setForeground(new Color(51, 51, 255));
        this.jLabel1.setText("Historique de bon de commande  ");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(250, 0, 478, 32);
        this.mec.setFont(new Font("Tahoma", 1, 18));
        this.mec.setForeground(new Color(0, 0, 204));
        this.mec.setText("    Mecano");
        this.mec.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppebchistorique.this.mecMouseClicked(evt);
            }
        });
        this.mec.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppebchistorique.this.mecActionPerformed(evt);
            }
        });
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppebchistorique.this.mecKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mec);
        this.mec.setBounds(240, 50, 160, 28);
        this.num.setFont(new Font("Tahoma", 1, 18));
        this.num.setForeground(new Color(0, 0, 204));
        this.num.setText("      N\u00b0 BC");
        this.num.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppebchistorique.this.numMouseClicked(evt);
            }
        });
        this.num.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppebchistorique.this.numKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.num);
        this.num.setBounds(240, 100, 160, 29);
        this.mat.setFont(new Font("Tahoma", 1, 18));
        this.mat.setForeground(new Color(0, 0, 204));
        this.mat.setText("Mat fournisseur");
        this.mat.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppebchistorique.this.matMouseClicked(evt);
            }
        });
        this.mat.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppebchistorique.this.matKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mat);
        this.mat.setBounds(570, 50, 160, 30);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/boncommande/rech.png")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(410, 30, 150, 120);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppebchistorique.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}}, new String[]{"Mecano", "Nom et prenom", "Matfour", "Nom fournisseur", "date bc", "num bc", "raison", "login"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.setRowHeight(24);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppebchistorique.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                suppebchistorique.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                suppebchistorique.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jTable1.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppebchistorique.this.jTable1KeyReleased(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 150, 950, 350);
        this.jButton1.setFont(new Font("Tahoma", 1, 18));
        this.jButton1.setForeground(new Color(102, 0, 204));
        this.jButton1.setText("TOUT");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppebchistorique.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton1.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppebchistorique.this.jButton1KeyReleased(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(570, 100, 160, 30);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, GroupLayout.Alignment.TRAILING, -1, 966, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, 506, 32767).addContainerGap()));
    }

    private void mecActionPerformed(ActionEvent evt) {
    }

    private void mecKeyReleased(KeyEvent evt) {
        try {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Mecano");
            dt1.addColumn("  Nom  et  Pr\u00e9nom");
            dt1.addColumn("matfour");
            dt1.addColumn("  Nom fournisseur");
            dt1.addColumn("num BC");
            dt1.addColumn("date BC");
            dt1.addColumn("raison");
            dt1.addColumn("login");
            dt1.addColumn("Date supp");
            this.jTable1.setModel(dt1);
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("aaaaaaaaaaaaaa");
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM bandecommandehistorique  WHERE Mecano LIKE '%" + this.mec.getText() + "%'");
                System.out.println("aaaaaaaaaaaaaa");
                while (result3.next()) {
                    JOptionPane jop3;
                    System.out.println("aaaaaaaaaaaaaa");
                    String Mecano = result3.getString("Mecano");
                    String Matfour = result3.getString("Matf");
                    String DateBC = result3.getString("datebc");
                    String NumBC = result3.getString("nbc");
                    String Raison = result3.getString("raison");
                    String Login = result3.getString("login");
                    String Datesupp = result3.getString("Datsupp");
                    String nom = "";
                    String nomMAtf = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state4 = conn2.createStatement();
                        ResultSet result4 = state4.executeQuery("SELECT * FROM adherent WHERE Mecano ='" + Mecano + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result4.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nom = result4.getString("NOM");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : adh " + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state5 = conn2.createStatement();
                        ResultSet result5 = state5.executeQuery("SELECT * FROM fournisseur WHERE MATRIC ='" + Matfour + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result5.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nomMAtf = result5.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : fr" + e.getMessage());
                    }
                    Object[] stg = new Object[]{Mecano, nom, Matfour, nomMAtf, NumBC, DateBC, Raison, Login, Datesupp};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erer 1!!");
        }
    }

    private void matKeyReleased(KeyEvent evt) {
        try {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Mecano");
            dt1.addColumn("  Nom  et  Pr\u00e9nom");
            dt1.addColumn("matfour");
            dt1.addColumn("  Nom fournisseur");
            dt1.addColumn("num BC");
            dt1.addColumn("date BC");
            dt1.addColumn("raison");
            dt1.addColumn("login");
            dt1.addColumn("Date supp");
            this.jTable1.setModel(dt1);
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("aaaaaaaaaaaaaa");
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM bandecommandehistorique WHERE Matf LIKE '%" + this.mat.getText() + "%'");
                System.out.println("aaaaaaaaaaaaaa");
                while (result3.next()) {
                    JOptionPane jop3;
                    System.out.println("aaaaaaaaaaaaaa");
                    String Mecano = result3.getString("Mecano");
                    String Matfour = result3.getString("Matf");
                    String DateBC = result3.getString("datebc");
                    String NumBC = result3.getString("nbc");
                    String Raison = result3.getString("raison");
                    String Login = result3.getString("login");
                    String Datesupp = result3.getString("Datsupp");
                    String nom = "";
                    String nomMAtf = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state4 = conn2.createStatement();
                        ResultSet result4 = state4.executeQuery("SELECT * FROM adherent WHERE Mecano='" + Mecano + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result4.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nom = result4.getString("NOM");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state5 = conn2.createStatement();
                        ResultSet result5 = state5.executeQuery("SELECT * FROM fournisseur WHERE MATRIC = '" + this.mat.getText() + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result5.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nomMAtf = result5.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                    }
                    Object[] stg = new Object[]{Mecano, nom, Matfour, nomMAtf, NumBC, DateBC, Raison, Login, Datesupp};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
        }
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void jTable1KeyReleased(KeyEvent evt) {
    }

    private void numKeyReleased(KeyEvent evt) {
        try {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Mecano");
            dt1.addColumn("  Nom  et  Pr\u00e9nom");
            dt1.addColumn("matfour");
            dt1.addColumn("  Nom fournisseur");
            dt1.addColumn("num BC");
            dt1.addColumn("date BC");
            dt1.addColumn("raison");
            dt1.addColumn("login");
            dt1.addColumn("Date supp");
            this.jTable1.setModel(dt1);
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("aaaaaaaaaaaaaa");
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM bandecommandehistorique WHERE nbc LIKE '%" + this.num.getText() + "%'");
                System.out.println("aaaaaaaaaaaaaa");
                while (result3.next()) {
                    JOptionPane jop3;
                    System.out.println("aaaaaaaaaaaaaa");
                    String Mecano = result3.getString("Mecano");
                    String Matfour = result3.getString("Matf");
                    String DateBC = result3.getString("datebc");
                    String NumBC = result3.getString("nbc");
                    String Raison = result3.getString("raison");
                    String Login = result3.getString("login");
                    String Datesupp = result3.getString("Datsupp");
                    String nom = "";
                    String nomMAtf = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state4 = conn2.createStatement();
                        ResultSet result4 = state4.executeQuery("SELECT * FROM adherent WHERE Mecano='" + Mecano + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result4.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nom = result4.getString("NOM");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state5 = conn2.createStatement();
                        ResultSet result5 = state5.executeQuery("SELECT * FROM fournisseur WHERE MATRIC = '" + Matfour + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result5.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nomMAtf = result5.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                    }
                    Object[] stg = new Object[]{Mecano, nom, Matfour, nomMAtf, NumBC, DateBC, Raison, Login, Datesupp};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
        }
    }

    private void jButton1KeyReleased(KeyEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.mec.setText("    Mecano");
        this.mat.setText("Mat fournisseur");
        this.num.setText("    Mecano");
        try {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Mecano");
            dt1.addColumn("  Nom  et  Pr\u00e9nom");
            dt1.addColumn("matfour");
            dt1.addColumn("  Nom fournisseur");
            dt1.addColumn("num BC");
            dt1.addColumn("date BC");
            dt1.addColumn("raison");
            dt1.addColumn("login");
            dt1.addColumn("Date supp");
            this.jTable1.setModel(dt1);
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("aaaaaaaaaaaaaa");
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM bandecommandehistorique ORDER BY Datsupp");
                System.out.println("aaaaaaaaaaaaaa");
                while (result3.next()) {
                    JOptionPane jop3;
                    System.out.println("aaaaaaaaaaaaaa");
                    String Mecano = result3.getString("Mecano");
                    String Matfour = result3.getString("Matf");
                    String DateBC = result3.getString("datebc");
                    String NumBC = result3.getString("nbc");
                    String Raison = result3.getString("raison");
                    String Login = result3.getString("login");
                    String Datesupp = result3.getString("Datsupp");
                    String nom = "";
                    String nomMAtf = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state4 = conn2.createStatement();
                        ResultSet result4 = state4.executeQuery("SELECT * FROM adherent WHERE Mecano ='" + Mecano + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result4.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nom = result4.getString("NOM");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : adh " + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state5 = conn2.createStatement();
                        ResultSet result5 = state5.executeQuery("SELECT * FROM fournisseur WHERE MATRIC ='" + Matfour + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result5.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nomMAtf = result5.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : fr" + e.getMessage());
                    }
                    Object[] stg = new Object[]{Mecano, nom, Matfour, nomMAtf, NumBC, DateBC, Raison, Login, Datesupp};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erer 1!!");
        }
    }

    private void mecMouseClicked(MouseEvent evt) {
        this.mec.setText("");
        this.mat.setText("Mat fournisseur");
        this.num.setText("      N\u00b0 BC");
    }

    private void matMouseClicked(MouseEvent evt) {
        this.mec.setText("    Mecano");
        this.mat.setText("");
        this.num.setText("      N\u00b0 BC");
    }

    private void numMouseClicked(MouseEvent evt) {
        this.mec.setText("    Mecano");
        this.mat.setText("Mat fournisseur");
        this.num.setText("");
    }

}

