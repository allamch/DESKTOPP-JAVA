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
import java.sql.ResultSetMetaData;
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

public class suppcessionfrhistorique
extends JPanel {
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JTextField mat;
    private JTextField mec;

    public suppcessionfrhistorique() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.mec = new JTextField();
        this.mat = new JTextField();
        this.jButton1 = new JButton();
        this.jScrollPane2 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel2 = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Snap ITC", 1, 24));
        this.jLabel1.setForeground(new Color(51, 51, 255));
        this.jLabel1.setText("Historique de cession fournisseur supprimer  ");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(220, 10, 760, 32);
        this.mec.setFont(new Font("Tahoma", 1, 18));
        this.mec.setForeground(new Color(0, 0, 204));
        this.mec.setText("Mecano");
        this.mec.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppcessionfrhistorique.this.mecMouseClicked(evt);
            }
        });
        this.mec.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfrhistorique.this.mecActionPerformed(evt);
            }
        });
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppcessionfrhistorique.this.mecKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mec);
        this.mec.setBounds(180, 50, 160, 28);
        this.mat.setFont(new Font("Tahoma", 1, 18));
        this.mat.setForeground(new Color(0, 0, 204));
        this.mat.setText("Taper Matf");
        this.mat.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppcessionfrhistorique.this.matMouseClicked(evt);
            }
        });
        this.mat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfrhistorique.this.matActionPerformed(evt);
            }
        });
        this.mat.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppcessionfrhistorique.this.matKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mat);
        this.mat.setBounds(580, 50, 150, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 18));
        this.jButton1.setForeground(new Color(102, 0, 204));
        this.jButton1.setText("TOUT");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfrhistorique.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton1.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppcessionfrhistorique.this.jButton1KeyReleased(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(380, 50, 150, 30);
        this.jScrollPane2.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane2.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane2.setName("");
        this.jScrollPane2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppcessionfrhistorique.this.jScrollPane2MouseClicked(evt);
            }
        });
        this.jTable1.setFont(new Font("Tahoma", 0, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null, null, null, null}}, new String[]{"Mecano", "Nom", "Matricule", "Date", "ref", "Premier mois", "dernier mois", "Montant", "Montant par mois", "mois", "nb mois", "datesupp", "raison", "login"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.setRowHeight(30);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppcessionfrhistorique.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                suppcessionfrhistorique.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                suppcessionfrhistorique.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane2.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(10, 100, 970, 390);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/cession/jhgfdt.PNG")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(0, 0, 160, 90);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 988, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 499, -2));
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
            dt1.addColumn("Date");
            dt1.addColumn("ref");
            dt1.addColumn("Premier mois");
            dt1.addColumn("Dernier mois");
            dt1.addColumn("Montant");
            dt1.addColumn("Montant par mois");
            dt1.addColumn("nb mois");
            dt1.addColumn("date supp");
            dt1.addColumn("raision");
            dt1.addColumn("login");
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
                ResultSet result3 = state3.executeQuery("SELECT * FROM cessionhistoriquesupp WHERE Mecano='" + this.mec.getText() + "' ");
                System.out.println("aaaaaaaaaaaaaa");
                while (result3.next()) {
                    System.out.println("aaaaaaaaaaaaaa");
                    String Mecano = result3.getString("Mecano");
                    String Matfour = result3.getString("Matf");
                    String Date2 = result3.getString("date");
                    String Nomfour = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state13 = conn2.createStatement();
                        ResultSet result13 = state13.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + Matfour);
                        ResultSetMetaData resultMeta13 = result13.getMetaData();
                        while (result13.next()) {
                            Nomfour = result13.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    boolean kk = false;
                    String nom = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state31 = conn2.createStatement();
                        ResultSet result31 = state31.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mecano);
                        ResultSetMetaData resultMeta31 = result3.getMetaData();
                        while (result31.next()) {
                            kk = true;
                            nom = result31.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        // empty catch block
                    }
                    if (!kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state32 = conn2.createStatement();
                            ResultSet result32 = state32.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mecano);
                            ResultSetMetaData resultMeta32 = result32.getMetaData();
                            while (result32.next()) {
                                kk = true;
                                nom = result32.getString("nom");
                            }
                        }
                        catch (Exception e) {
                            // empty catch block
                        }
                    }
                    String premier = result3.getString("premiermois");
                    String Dernier = result3.getString("derniermois");
                    String mont = result3.getString("montant");
                    String montant = result3.getString("montantparmois");
                    String nb = result3.getString("nbmois");
                    String ref = result3.getString("ref");
                    String datesup = result3.getString("Datsupp");
                    String Raison = result3.getString("raison");
                    String Login = result3.getString("login");
                    Object[] stg = new Object[]{Mecano, nom, Matfour, Nomfour, Date2, ref, premier, Dernier, mont, montant, nb, datesup, Raison, Login};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
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
            dt1.addColumn("Date");
            dt1.addColumn("ref");
            dt1.addColumn("Premier mois");
            dt1.addColumn("Dernier mois");
            dt1.addColumn("Montant");
            dt1.addColumn("Montant par mois");
            dt1.addColumn("nb mois");
            dt1.addColumn("date supp");
            dt1.addColumn("raision");
            dt1.addColumn("login");
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
                Statement state5 = conn2.createStatement();
                ResultSet result5 = state5.executeQuery("SELECT * FROM  cessionhistoriquesupp WHERE Matf LIKE '%" + this.mat.getText() + "%'");
                System.out.println("aaaaaaaaaaaaaa");
                System.out.println("aaaaaaaaaaaaaa");
                while (result5.next()) {
                    ResultSetMetaData resultMeta3;
                    ResultSet result3;
                    Statement state3;
                    String Mecano = result5.getString("Mecano");
                    String Matfour = result5.getString("Matf");
                    String Date2 = result5.getString("date");
                    String Nomfour = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state32 = conn2.createStatement();
                        ResultSet result32 = state32.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + Matfour);
                        ResultSetMetaData resultMeta32 = result32.getMetaData();
                        while (result32.next()) {
                            Nomfour = result32.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    boolean kk = false;
                    String nom = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mecano);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            kk = true;
                            nom = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        // empty catch block
                    }
                    if (!kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mecano);
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                kk = true;
                                nom = result3.getString("nom");
                            }
                        }
                        catch (Exception e) {
                            // empty catch block
                        }
                    }
                    String premier = result5.getString("premiermois");
                    String Dernier = result5.getString("derniermois");
                    String mont = result5.getString("montant");
                    String montant = result5.getString("montantparmois");
                    String nb = result5.getString("nbmois");
                    String ref = result5.getString("ref");
                    String datesup = result5.getString("Datsupp");
                    String Raison = result5.getString("raison");
                    String Login = result5.getString("login");
                    System.out.println("aaaaaaaaaaaaaa");
                    Object[] stg = new Object[]{Mecano, nom, Matfour, Nomfour, Date2, ref, premier, Dernier, mont, montant, nb, datesup, Raison, Login};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
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
        try {
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Mecano");
            dt1.addColumn("  Nom  et  Pr\u00e9nom");
            dt1.addColumn("matfour");
            dt1.addColumn("  Nom fournisseur");
            dt1.addColumn("Date");
            dt1.addColumn("ref");
            dt1.addColumn("Premier mois");
            dt1.addColumn("Dernier mois");
            dt1.addColumn("Montant");
            dt1.addColumn("Montant par mois");
            dt1.addColumn("nb mois");
            dt1.addColumn("date supp");
            dt1.addColumn("raision");
            dt1.addColumn("login");
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
                Statement state5 = conn2.createStatement();
                ResultSet result5 = state5.executeQuery("SELECT * FROM  cessionhistoriquesupp ORDER BY Datsupp");
                System.out.println("aaaaaaaaaaaaaa");
                while (result5.next()) {
                    ResultSetMetaData resultMeta3;
                    ResultSet result3;
                    Statement state3;
                    String Mecano = result5.getString("Mecano");
                    String Matfour = result5.getString("Matf");
                    String Date2 = result5.getString("date");
                    String Nomfour = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state32 = conn2.createStatement();
                        ResultSet result32 = state32.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + Matfour);
                        ResultSetMetaData resultMeta32 = result32.getMetaData();
                        while (result32.next()) {
                            Nomfour = result32.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    boolean kk = false;
                    String nom = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mecano);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            kk = true;
                            nom = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        // empty catch block
                    }
                    if (!kk) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mecano);
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                kk = true;
                                nom = result3.getString("nom");
                            }
                        }
                        catch (Exception e) {
                            // empty catch block
                        }
                    }
                    String premier = result5.getString("premiermois");
                    String Dernier = result5.getString("derniermois");
                    String mont = result5.getString("montant");
                    String montant = result5.getString("montantparmois");
                    String nb = result5.getString("nbmois");
                    String ref = result5.getString("ref");
                    String datesup = result5.getString("Datsupp");
                    String Raison = result5.getString("raison");
                    String Login = result5.getString("login");
                    Object[] stg = new Object[]{Mecano, nom, Matfour, Nomfour, Date2, ref, premier, Dernier, mont, montant, nb, datesup, Raison, Login};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : 1 " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erer 1!!");
        }
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane2MouseClicked(MouseEvent evt) {
        int nm = this.jTable1.getSelectedRow();
        System.out.println("\u00e8_____" + nm);
        String np = this.jTable1.getModel().getValueAt(nm, 0).toString();
        System.out.println("\u00e8_____" + np);
    }

    private void matActionPerformed(ActionEvent evt) {
    }

    private void mecMouseClicked(MouseEvent evt) {
        this.mec.setText("");
        this.mat.setText("Taper Matf");
    }

    private void matMouseClicked(MouseEvent evt) {
        this.mec.setText("Mecano");
        this.mat.setText("");
    }

}

