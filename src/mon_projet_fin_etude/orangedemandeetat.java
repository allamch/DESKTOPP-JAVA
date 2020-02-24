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
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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

public class orangedemandeetat
extends JPanel {
    int k = 0;
    int n = 0;
    private ButtonGroup buttonGroup1;
    private JTable ca;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel18;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JRadioButton jRadioButton1;
    private JScrollPane jScrollPane4;
    private JTextField mec;
    private JLabel nomadh;
    private JTextField nserie;
    private JTextField num;

    public orangedemandeetat() {
        this.initComponents();
    }

    private void initComponents() {
        this.jRadioButton1 = new JRadioButton();
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jScrollPane4 = new JScrollPane();
        this.ca = new JTable();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.num = new JTextField();
        this.jLabel8 = new JLabel();
        this.nomadh = new JLabel();
        this.mec = new JTextField();
        this.nserie = new JTextField();
        this.jLabel18 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jRadioButton1.setText("jRadioButton1");
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tempus Sans ITC", 1, 30));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Liste des Commandes Orange");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(210, 0, 470, 50);
        this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/orange/valider cmd.PNG")));
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(850, 170, 240, 250);
        this.jLabel4.setIcon(new ImageIcon(this.getClass().getResource("/orange/service.PNG")));
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(10, 0, 63, 70);
        this.jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/orange/or.PNG")));
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(820, -20, 70, 80);
        this.jScrollPane4.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane4.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane4.setName("");
        this.jScrollPane4.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                orangedemandeetat.this.jScrollPane4MouseClicked(evt);
            }
        });
        this.ca.setFont(new Font("Sylfaen", 0, 14));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}}, new String[]{"Mecano", "NOM", "offre", "montant", "nb"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setRowHeight(25);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                orangedemandeetat.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                orangedemandeetat.this.caMouseEntered(evt);
            }
        });
        this.ca.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                orangedemandeetat.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane4.setViewportView(this.ca);
        this.jPanel1.add(this.jScrollPane4);
        this.jScrollPane4.setBounds(10, 130, 810, 370);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setForeground(new Color(0, 102, 0));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/orange/inventory.png")));
        this.jButton1.setText("Valider");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                orangedemandeetat.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(880, 110, 160, 50);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/orange/rech.jpg")));
        this.jButton2.setText("Recherche ");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                orangedemandeetat.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(880, 60, 160, 40);
        this.num.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.num);
        this.num.setBounds(590, 50, 150, 30);
        this.jLabel8.setFont(new Font("Tahoma", 0, 18));
        this.jLabel8.setForeground(new Color(0, 0, 204));
        this.jLabel8.setText("N\u00b0 tel :");
        this.jPanel1.add(this.jLabel8);
        this.jLabel8.setBounds(510, 50, 70, 30);
        this.nomadh.setFont(new Font("Tahoma", 0, 12));
        this.nomadh.setForeground(new Color(153, 0, 51));
        this.nomadh.setText(".......................................................................");
        this.jPanel1.add(this.nomadh);
        this.nomadh.setBounds(320, 50, 170, 30);
        this.mec.setFont(new Font("Tahoma", 1, 14));
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                orangedemandeetat.this.mecKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mec);
        this.mec.setBounds(200, 50, 110, 30);
        this.nserie.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.nserie);
        this.nserie.setBounds(200, 90, 400, 30);
        this.jLabel18.setFont(new Font("Tahoma", 0, 18));
        this.jLabel18.setForeground(new Color(0, 0, 204));
        this.jLabel18.setText("N\u00b0 serie :");
        this.jPanel1.add(this.jLabel18);
        this.jLabel18.setBounds(100, 90, 90, 30);
        this.jLabel7.setFont(new Font("Tahoma", 0, 18));
        this.jLabel7.setForeground(new Color(0, 0, 204));
        this.jLabel7.setText("Mecano :");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(100, 50, 90, 30);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 1074, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 520, -2).addContainerGap(-1, 32767)));
    }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane4MouseClicked(MouseEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Offre");
        dt1.addColumn("montant");
        dt1.addColumn("nbm");
        dt1.addColumn("type");
        dt1.addColumn("Obser");
        dt1.addColumn("date");
        this.ca.setModel(dt1);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            String r = "0";
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  forfaitdemadeorange  WHERE recu='" + r + "' ORDER BY date ");
            while (result2.next()) {
                Statement state3;
                ResultSet result3;
                JOptionPane jop3;
                this.k = 0;
                String mecano = result2.getString("mecano");
                String nomadh = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    while (result3.next()) {
                        this.k = 1;
                        nomadh = result3.getString("nom");
                    }
                }
                catch (Exception e) {
                    this.k = 0;
                    jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        while (result3.next()) {
                            this.k = 1;
                            nomadh = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 3" + e.getMessage());
                    }
                }
                String nomf = result2.getString("nomforfait");
                System.out.println("nomf =" + nomf);
                String mont = "";
                String nbm = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state32 = conn2.createStatement();
                    ResultSet result32 = state32.executeQuery("SELECT * FROM forfaitorange  WHERE nom='" + nomf + "'");
                    System.out.println("-------------------------------");
                    while (result32.next()) {
                        System.out.println("-----fdgdfg--------------------------");
                        mont = result32.getString("Montant");
                        mont = new StringBuilder(mont).insert(mont.length() - 3, ".").toString();
                        nbm = result32.getString("nbmois");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop32 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 2" + e.getMessage());
                }
                String type = result2.getString("type");
                String ob = result2.getString("obser");
                String ntel = result2.getString("ntel");
                String dt = result2.getString("date");
                Object[] stg = new Object[]{mecano, nomadh, nomf, mont, nbm, type, ob, dt};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
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
        try {
            Statement state3;
            ResultSet result3;
            String t = "";
            this.k = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mec.getText());
                while (result3.next()) {
                    this.k = 1;
                    t = "S";
                    this.nomadh.setText(result3.getString("nom"));
                }
            }
            catch (Exception e) {
                this.k = 0;
            }
            if (this.k == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mec.getText());
                    while (result3.next()) {
                        this.k = 1;
                        t = "R";
                        this.nomadh.setText(result3.getString("nom"));
                    }
                }
                catch (Exception e) {
                    // empty catch block
                }
            }
            if (this.k == 0) {
                this.nomadh.setText(".................");
            } else {
                DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
                DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
                while (medelo.getRowCount() > 0) {
                    for (int i = 0; i < model.getRowCount(); ++i) {
                        model.removeRow(i);
                    }
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn22.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM  forfaitorange ");
                    this.n = 0;
                    while (result2.next()) {
                        String nom = result2.getString("nom");
                        String nbm = result2.getString("nbmois");
                        String Montant = result2.getString("Montant");
                        Montant = new StringBuilder(Montant).insert(Montant.length() - 3, ".").toString();
                        String remarque = result2.getString("remarque");
                        int nb = 1;
                        medelo.addRow(new Object[]{nom, nbm, Montant, remarque, false, nb});
                        ++this.n;
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }
            System.out.println("k=" + this.k);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.mec.setText("");
        }
    }

}

