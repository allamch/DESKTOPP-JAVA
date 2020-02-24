/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  com.mysql.jdbc.Connection
 *  com.mysql.jdbc.Statement
 */
package mon_projet_fin_etude;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;
import mon_projet_fin_etude.suppcessionfornisseuvalide;

public class suppcessionfornisseur
extends JPanel {
    private JTextField a1;
    private JLabel annedebut2;
    private JLabel annedebut3;
    private JComboBox j1;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JComboBox m1;
    private JTextField mat;
    private JTextField mec;
    private JLabel moisdebut;
    private JTextArea rai;

    public suppcessionfornisseur() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.mec = new JTextField();
        this.mat = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.rai = new JTextArea();
        this.jButton1 = new JButton();
        this.annedebut3 = new JLabel();
        this.j1 = new JComboBox();
        this.moisdebut = new JLabel();
        this.m1 = new JComboBox();
        this.annedebut2 = new JLabel();
        this.a1 = new JTextField();
        this.jScrollPane2 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton2 = new JButton();
        this.jLabel6 = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tempus Sans ITC", 1, 24));
        this.jLabel1.setForeground(new Color(204, 0, 204));
        this.jLabel1.setText("suppression cession fournisseur ");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(210, 0, 527, 43);
        this.jLabel2.setFont(new Font("SimHei", 2, 18));
        this.jLabel2.setForeground(new Color(153, 0, 153));
        this.jLabel2.setText("Mat fournisseur : ");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(260, 60, 162, 21);
        this.mec.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfornisseur.this.mecActionPerformed(evt);
            }
        });
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppcessionfornisseur.this.mecKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mec);
        this.mec.setBounds(90, 60, 150, 30);
        this.mat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfornisseur.this.matActionPerformed(evt);
            }
        });
        this.mat.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                suppcessionfornisseur.this.matKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mat);
        this.mat.setBounds(433, 60, 140, 30);
        this.jLabel3.setFont(new Font("SimHei", 2, 18));
        this.jLabel3.setForeground(new Color(153, 0, 153));
        this.jLabel3.setText("Mecano  :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(0, 60, 81, 21);
        this.jLabel4.setFont(new Font("SimHei", 2, 18));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("Raison de suppression: ");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(0, 160, 207, 21);
        this.jLabel5.setFont(new Font("SimHei", 2, 18));
        this.jLabel5.setForeground(new Color(153, 0, 153));
        this.jLabel5.setText("Date cession :");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(0, 110, 140, 20);
        this.rai.setColumns(20);
        this.rai.setRows(5);
        this.jScrollPane1.setViewportView(this.rai);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(210, 150, 370, 96);
        this.jButton1.setBackground(new Color(204, 255, 255));
        this.jButton1.setFont(new Font("Trebuchet MS", 1, 18));
        this.jButton1.setForeground(new Color(153, 0, 153));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/cession/supp.png")));
        this.jButton1.setText("supprimer ");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfornisseur.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(610, 160, 170, 39);
        this.annedebut3.setFont(new Font("Tahoma", 1, 14));
        this.annedebut3.setForeground(new Color(153, 0, 153));
        this.annedebut3.setText("Jour:");
        this.jPanel1.add(this.annedebut3);
        this.annedebut3.setBounds(160, 110, 40, 30);
        this.j1.setFont(new Font("Tahoma", 1, 12));
        this.j1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "tous"}));
        this.j1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppcessionfornisseur.this.j1MouseClicked(evt);
            }
        });
        this.jPanel1.add(this.j1);
        this.j1.setBounds(210, 110, 80, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 153));
        this.moisdebut.setText("Mois :");
        this.jPanel1.add(this.moisdebut);
        this.moisdebut.setBounds(300, 110, 50, 30);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppcessionfornisseur.this.m1MouseClicked(evt);
            }
        });
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfornisseur.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.m1);
        this.m1.setBounds(350, 110, 50, 30);
        this.annedebut2.setFont(new Font("Tahoma", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 153));
        this.annedebut2.setText("Ann\u00e9 :");
        this.jPanel1.add(this.annedebut2);
        this.annedebut2.setBounds(410, 110, 50, 30);
        this.jPanel1.add(this.a1);
        this.a1.setBounds(460, 110, 110, 30);
        this.jScrollPane2.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane2.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane2.setName("");
        this.jScrollPane2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppcessionfornisseur.this.jScrollPane2MouseClicked(evt);
            }
        });
        this.jTable1.setFont(new Font("Tahoma", 0, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null, null, null, null}}, new String[]{"Mecano", "Nom", "Matricule", "Nom fournisseur", "Date", "ref", "Premier mois", "dernier mois", "Montant", "Montant par mois", "nb mois", "Choix"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Boolean.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.setRowHeight(30);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                suppcessionfornisseur.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                suppcessionfornisseur.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                suppcessionfornisseur.this.jTable1AncestorAdded(evt);
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
        this.jScrollPane2.setBounds(0, 270, 860, 290);
        this.jButton2.setBackground(new Color(204, 255, 255));
        this.jButton2.setFont(new Font("Tahoma", 1, 14));
        this.jButton2.setForeground(new Color(153, 0, 153));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/cession/rech.PNG")));
        this.jButton2.setText("RECHERCHE");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfornisseur.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(610, 210, 170, 40);
        this.jLabel6.setIcon(new ImageIcon(this.getClass().getResource("/cession/purchase-guy.png")));
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(590, 10, 180, 170);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, 908, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 585, -2).addContainerGap(-1, 32767)));
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String datsystem;
        String Date2 = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
        String raison = "";
        Connection conn2 = null;
        try {
            conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        String login = "";
        raison = this.rai.getText();
        Date actuellEee = new Date();
        SimpleDateFormat dateFormatft = new SimpleDateFormat("yyyy-MM-dd");
        String datsupp = datsystem = dateFormatft.format(actuellEee);
        for (int i = 0; i < this.jTable1.getRowCount(); ++i) {
            String jb = this.jTable1.getModel().getValueAt(i, 11).toString();
            if (!jb.equals("true")) continue;
            String mecc = this.jTable1.getModel().getValueAt(i, 0).toString();
            String matt = this.jTable1.getModel().getValueAt(i, 2).toString();
            String mon = this.jTable1.getModel().getValueAt(i, 8).toString();
            String date = this.jTable1.getModel().getValueAt(i, 4).toString();
            String premierm = this.jTable1.getModel().getValueAt(i, 6).toString();
            String dernierm = this.jTable1.getModel().getValueAt(i, 7).toString();
            String nb = this.jTable1.getModel().getValueAt(i, 10).toString();
            String montantpar = this.jTable1.getModel().getValueAt(i, 9).toString();
            String REF = this.jTable1.getModel().getValueAt(i, 5).toString();
            suppcessionfornisseuvalide aa = new suppcessionfornisseuvalide();
            aa.setVisible(true);
            aa.setvalued(mecc, matt, mon, date, premierm, dernierm, nb, montantpar, REF, raison);
        }
    }

    private void mecActionPerformed(ActionEvent evt) {
    }

    private void matActionPerformed(ActionEvent evt) {
    }

    private void j1MouseClicked(MouseEvent evt) {
    }

    private void m1MouseClicked(MouseEvent evt) {
    }

    private void m1ActionPerformed(ActionEvent evt) {
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

    private void jButton2ActionPerformed(ActionEvent evt) {
        System.out.println("--++++++++++++++++++++++++++++++ ");
        try {
            String Date2 = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            Connection conn2 = null;
            try {
                conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("aaaaaaaaaaaaaa");
                Statement state3 = (Statement)conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM cessionfournisseur WHERE Mecano='" + this.mec.getText() + "' ");
                System.out.println("aaaaaaaaaaaaaa");
                DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
                DefaultTableModel medelo = (DefaultTableModel)this.jTable1.getModel();
                while (model.getRowCount() > 0) {
                    for (int i = 0; i < model.getRowCount(); ++i) {
                        model.removeRow(i);
                    }
                }
                while (result3.next()) {
                    System.out.println("aaaaaaaaaaaaaa");
                    String Mecano = result3.getString("Mecano");
                    String Nom = result3.getString("Nom");
                    String matricule = result3.getString("Matricule");
                    String DateE = result3.getString("date");
                    String REF = result3.getString("ref");
                    String premier = result3.getString("premiermois");
                    String kk = result3.getString("derniermois");
                    String Mon = result3.getString("Montant");
                    String montantpar = result3.getString("Montantparmois");
                    String pv = result3.getString("pv");
                    String Mois = result3.getString("mois");
                    String nb = result3.getString("Nbmois");
                    String nomMAtf = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state5 = (Statement)conn2.createStatement();
                        ResultSet result5 = state5.executeQuery("SELECT * FROM fournisseur WHERE MATRIC = '" + this.mat.getText() + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result5.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nomMAtf = result5.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                    }
                    medelo.addRow(new Object[]{Mecano, Nom, matricule, nomMAtf, DateE, REF, premier, kk, Mon, montantpar, Mois, nb, pv, false});
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : adh " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erer 1!!");
        }
    }

    private void mecKeyReleased(KeyEvent evt) {
        System.out.println("--++++++++++++++++++++++++++++++ ");
        try {
            String Date2 = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
            Connection conn2 = null;
            try {
                conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("aaaaaaaaaaaaaa");
                Statement state3 = (Statement)conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM cessionfournisseur WHERE Mecano='" + this.mec.getText() + "' ");
                System.out.println("aaaaaaaaaaaaaa");
                DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
                DefaultTableModel medelo = (DefaultTableModel)this.jTable1.getModel();
                while (model.getRowCount() > 0) {
                    for (int i = 0; i < model.getRowCount(); ++i) {
                        model.removeRow(i);
                    }
                }
                while (result3.next()) {
                    System.out.println("aaaaaaaaaaaaaa");
                    String Mecano = result3.getString("Mecano");
                    String Nom = result3.getString("Nom");
                    String matricule = result3.getString("Matricule");
                    String DateE = result3.getString("date");
                    String REF = result3.getString("ref");
                    String premier = result3.getString("premiermois");
                    String kk = result3.getString("derniermois");
                    String Mon = result3.getString("Montant");
                    String montantpar = result3.getString("Montantparmois");
                    String nb = result3.getString("Nbmois");
                    String nomMAtf = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state5 = (Statement)conn2.createStatement();
                        ResultSet result5 = state5.executeQuery("SELECT * FROM fournisseur WHERE MATRIC = '" + matricule + "'");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result5.next()) {
                            System.out.println("aaaaaaaaaaaaaa");
                            nomMAtf = result5.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                    }
                    medelo.addRow(new Object[]{Mecano, Nom, matricule, nomMAtf, DateE, REF, premier, kk, Mon, montantpar, nb, false});
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : adh " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erer 1!!");
        }
    }

    private void matKeyReleased(KeyEvent evt) {
        block21 : {
            try {
                Connection conn2 = null;
                try {
                    conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                }
                catch (SQLException ex) {
                    Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (this.mat.getText().equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("aaaaaaaaaaaaaa");
                        Statement state5 = (Statement)conn2.createStatement();
                        ResultSet result5 = state5.executeQuery("SELECT * FROM cessionfournisseur  WHERE Mecano='" + this.mec.getText() + "' ");
                        DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
                        DefaultTableModel medelo = (DefaultTableModel)this.jTable1.getModel();
                        while (model.getRowCount() > 0) {
                            for (int i = 0; i < model.getRowCount(); ++i) {
                                model.removeRow(i);
                            }
                        }
                        System.out.println("aaaaaaaaaaaaaa");
                        System.out.println("aaaaaaaaaaaaaa");
                        while (result5.next()) {
                            String Mecano = result5.getString("Mecano");
                            String Matfour = result5.getString("Matricule");
                            String Date2 = result5.getString("date");
                            String nom = result5.getString("Nom");
                            String premier = result5.getString("premiermois");
                            String Dernier = result5.getString("derniermois");
                            String mont = result5.getString("montant");
                            String montant = result5.getString("montantparmois");
                            String nb = result5.getString("nbmois");
                            String ref = result5.getString("ref");
                            System.out.println("aaaaaaaaaaaaaa");
                            String Nomfour = "";
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                System.out.println("aaaaaaaaaaaaaa");
                                Statement state6 = (Statement)conn2.createStatement();
                                ResultSet result6 = state6.executeQuery("SELECT * FROM fournisseur WHERE MATRIC = '" + this.mat.getText() + "'");
                                System.out.println("aaaaaaaaaaaaaa");
                                while (result6.next()) {
                                    System.out.println("aaaaaaaaaaaaaa");
                                    Nomfour = result5.getString("NOMSOC");
                                }
                            }
                            catch (Exception e) {
                                JOptionPane jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                            }
                            medelo.addRow(new Object[]{Mecano, nom, Matfour, Nomfour, Date2, ref, premier, Dernier, mont, montant, nb, false});
                            ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                        }
                        break block21;
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                        break block21;
                    }
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("aaaaaaaaaaaaaa");
                    Statement state5 = (Statement)conn2.createStatement();
                    ResultSet result5 = state5.executeQuery("SELECT * FROM cessionfournisseur  WHERE Matricule LIKE  '%" + this.mat.getText() + "%' ");
                    System.out.println("aaaaaaaaaaaaaa");
                    DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
                    DefaultTableModel medelo = (DefaultTableModel)this.jTable1.getModel();
                    while (model.getRowCount() > 0) {
                        for (int i = 0; i < model.getRowCount(); ++i) {
                            model.removeRow(i);
                        }
                    }
                    System.out.println("aaaaaaaaaaaaaa");
                    while (result5.next()) {
                        String Mecano = result5.getString("Mecano");
                        String Matfour = result5.getString("Matricule");
                        String Date3 = result5.getString("date");
                        String nom = result5.getString("Nom");
                        String premier = result5.getString("premiermois");
                        String Dernier = result5.getString("derniermois");
                        String mois2 = result5.getString("mois");
                        String mont = result5.getString("montant");
                        String montant = result5.getString("montantparmois");
                        String nb = result5.getString("nbmois");
                        String ref = result5.getString("ref");
                        String pv = result5.getString("pv");
                        System.out.println("aaaaaaaaaaaaaa");
                        String Nomfour = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            System.out.println("aaaaaaaaaaaaaa");
                            Statement state6 = (Statement)conn2.createStatement();
                            ResultSet result6 = state6.executeQuery("SELECT * FROM fournisseur WHERE MATRIC = '" + this.mat.getText() + "'");
                            System.out.println("aaaaaaaaaaaaaa");
                            while (result6.next()) {
                                System.out.println("aaaaaaaaaaaaaa");
                                Nomfour = result6.getString("NOMSOC");
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                        }
                        medelo.addRow(new Object[]{Mecano, nom, Matfour, Nomfour, Date3, ref, premier, Dernier, mont, montant, mois2, nb, pv, false});
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
    }

}

