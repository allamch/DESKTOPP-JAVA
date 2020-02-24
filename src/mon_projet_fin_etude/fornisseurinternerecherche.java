/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.recherchecarnedecheque;

public class fornisseurinternerecherche
extends JPanel {
    public ImageIcon Format = null;
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
    private JLabel jLabel10;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField matt;
    private JTextField ncr;
    private JTextField nn;

    public fornisseurinternerecherche() {
        this.initComponents();
    }

    private void initComponents() {
        this.matt = new JTextField();
        this.ncr = new JTextField();
        this.jLabel10 = new JLabel();
        this.nn = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton1 = new JButton();
        this.setLayout(null);
        this.matt.setFont(new Font("Tahoma", 1, 14));
        this.matt.setForeground(new Color(0, 0, 153));
        this.matt.setText("        Taper MAT-FR");
        this.matt.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                fornisseurinternerecherche.this.mattMouseClicked(evt);
            }
        });
        this.matt.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                fornisseurinternerecherche.this.mattActionPerformed(evt);
            }
        });
        this.matt.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                fornisseurinternerecherche.this.mattKeyReleased(evt);
            }
        });
        this.add(this.matt);
        this.matt.setBounds(120, 10, 180, 30);
        this.ncr.setFont(new Font("Tahoma", 1, 14));
        this.ncr.setForeground(new Color(0, 0, 153));
        this.ncr.setText("        Taper N\u00b0C.N.R");
        this.ncr.setEnabled(false);
        this.ncr.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                fornisseurinternerecherche.this.ncrMouseClicked(evt);
            }
        });
        this.ncr.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                fornisseurinternerecherche.this.ncrKeyReleased(evt);
            }
        });
        this.add(this.ncr);
        this.ncr.setBounds(120, 60, 180, 30);
        this.jLabel10.setIcon(new ImageIcon(this.getClass().getResource("/image/adh/rechercheadh.gif")));
        this.add(this.jLabel10);
        this.jLabel10.setBounds(340, 0, 90, 90);
        this.nn.setFont(new Font("Tahoma", 1, 14));
        this.nn.setForeground(new Color(0, 0, 153));
        this.nn.setText("        Taper Nom");
        this.nn.setEnabled(false);
        this.nn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                fornisseurinternerecherche.this.nnMouseClicked(evt);
            }
        });
        this.nn.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                fornisseurinternerecherche.this.nnKeyReleased(evt);
            }
        });
        this.add(this.nn);
        this.nn.setBounds(460, 10, 190, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                fornisseurinternerecherche.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Mecano", "N CIN", "Nom ET PRENOM", "CNR "}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                fornisseurinternerecherche.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                fornisseurinternerecherche.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                fornisseurinternerecherche.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 100, 810, 420);
        this.jButton1.setText("Tous");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                fornisseurinternerecherche.this.jButton1ActionPerformed(evt);
            }
        });
        this.add(this.jButton1);
        this.jButton1.setBounds(460, 50, 190, 30);
    }

    private void mattActionPerformed(ActionEvent evt) {
    }

    private void jTable1MouseClicked(MouseEvent evt) {
        int lign = this.jTable1.getSelectedRow();
        System.out.println(" ling =" + lign);
        String meco = this.jTable1.getModel().getValueAt(lign, 0).toString();
        System.out.println(" mecano =" + meco);
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
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE MECANO = '" + meco + "'");
            System.out.println("aaaaaaaaaaaaaa");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            boolean i = false;
            boolean c = false;
            while (result3.next()) {
                byte[] imagedata = result3.getBytes("image");
                this.Format = new ImageIcon(imagedata);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
        }
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

    private void mattKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.matt.getText());
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("Mat");
            this.dt1.addColumn("Nom SC");
            this.dt1.addColumn("Banque");
            this.dt1.addColumn("rib");
            this.dt1.addColumn("Objet");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result3 = state3.executeQuery("SELECT * FROM  fornisseurinternt WHERE MATRIC LIKE '%" + this.matt.getText() + "%'");
                System.out.println("aaaaaaaaaaaaaa");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                boolean i = false;
                boolean c = false;
                while (result3.next()) {
                    System.out.println("aaaaaaaaaaaaaa");
                    String mat = result3.getString("MATRIC");
                    String rib = result3.getString("rib");
                    String nomf = result3.getString("nomf");
                    String banque = result3.getString("banque");
                    String objet = result3.getString("objet");
                    Object[] stg = new Object[]{mat, nomf, banque, rib, objet};
                    this.dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.matt.setText("");
        }
    }

    private void mattMouseClicked(MouseEvent evt) {
        this.matt.setText("");
        this.nn.setText("        Taper Nom");
        this.ncr.setText("        Taper N\u00b0C.N.R");
    }

    private void ncrMouseClicked(MouseEvent evt) {
        this.matt.setText("        Taper Mecano");
        this.nn.setText("        Taper Nom");
        this.ncr.setText("");
    }

    private void nnMouseClicked(MouseEvent evt) {
        this.matt.setText("        Taper Mecano");
        this.nn.setText("");
        this.ncr.setText("        Taper N\u00b0C.N.R");
    }

    private void ncrKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.ncr.getText());
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("Mecano");
            this.dt1.addColumn("N\u00b0 CIN");
            this.dt1.addColumn("  Nom  et  Pr\u00e9nom");
            this.dt1.addColumn("  N\u00b0 C.N.R");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE NCNR LIKE '%" + this.ncr.getText() + "%'");
                System.out.println("aaaaaaaaaaaaaa");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                boolean i = false;
                boolean c = false;
                while (result3.next()) {
                    System.out.println("aaaaaaaaaaaaaa");
                    String ncnr = result3.getString("NCNR");
                    String CINN = result3.getString("CIN");
                    String nom = result3.getString("NOM");
                    String MECANO = result3.getString("MECANO");
                    Object[] stg = new Object[]{MECANO, CINN, nom, ncnr};
                    this.dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.ncr.setText("");
        }
    }

    private void nnKeyReleased(KeyEvent evt) {
        this.dt1 = new DefaultTableModel();
        this.dt1.addColumn("Mecano");
        this.dt1.addColumn("N\u00b0 CIN");
        this.dt1.addColumn("  Nom  et  Pr\u00e9nom");
        this.dt1.addColumn("  N\u00b0 C.N.R");
        this.jTable1.setModel(this.dt1);
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
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE NOM LIKE '%" + this.nn.getText() + "%'");
            System.out.println("aaaaaaaaaaaaaa");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                System.out.println("aaaaaaaaaaaaaa");
                String ncnr = result3.getString("NCNR");
                String CINN = result3.getString("CIN");
                String nom = result3.getString("NOM");
                String MECANO = result3.getString("MECANO");
                Object[] stg = new Object[]{MECANO, CINN, nom, ncnr};
                this.dt1.addRow(stg);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        try {
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("Mat");
            this.dt1.addColumn("Nom SC");
            this.dt1.addColumn("Banque");
            this.dt1.addColumn("rib");
            this.dt1.addColumn("Objet");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result3 = state3.executeQuery("SELECT * FROM  fornisseurinternt ");
                System.out.println("aaaaaaaaaaaaaa");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                boolean i = false;
                boolean c = false;
                while (result3.next()) {
                    System.out.println("aaaaaaaaaaaaaa");
                    String mat = result3.getString("MATRIC");
                    String rib = result3.getString("rib");
                    String nomf = result3.getString("nomf");
                    String banque = result3.getString("banque");
                    String objet = result3.getString("objet");
                    Object[] stg = new Object[]{mat, nomf, banque, rib, objet};
                    this.dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.matt.setText("");
        }
    }

}

