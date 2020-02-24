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
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.swing.JToggleButton;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.historiquevirmentretraite;

public class montantvirementsante
extends JPanel {
    String ch = "";
    String montant = "";
    private JLabel ATBlettre;
    private JLabel BNAchiffre;
    private JLabel STBchiffre;
    private JLabel STBlettre;
    private JLabel atbchiffre;
    private JLabel bhchiffre;
    private JLabel bhletre;
    private JLabel bnalettre;
    private JLabel btchiffre;
    private JLabel btenlettre;
    private JToggleButton imprimer;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox jComboBox1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JLabel uibchiffre;
    private JLabel uiblettre;

    public montantvirementsante() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jComboBox1 = new JComboBox();
        this.jLabel5 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel2 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jButton2 = new JButton();
        this.imprimer = new JToggleButton();
        this.jPanel2 = new JPanel();
        this.uibchiffre = new JLabel();
        this.uiblettre = new JLabel();
        this.btenlettre = new JLabel();
        this.btchiffre = new JLabel();
        this.bhletre = new JLabel();
        this.bhchiffre = new JLabel();
        this.atbchiffre = new JLabel();
        this.ATBlettre = new JLabel();
        this.BNAchiffre = new JLabel();
        this.bnalettre = new JLabel();
        this.STBlettre = new JLabel();
        this.STBchiffre = new JLabel();
        this.jTextField2 = new JTextField();
        this.jButton1 = new JButton();
        this.jButton3 = new JButton();
        this.jPanel1.setLayout(null);
        this.jLabel3.setFont(new Font("Tahoma", 0, 18));
        this.jLabel3.setForeground(new Color(0, 153, 255));
        this.jLabel3.setText("Numero Dossier");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(4, 16, 125, 22);
        this.jLabel4.setFont(new Font("Tahoma", 0, 18));
        this.jLabel4.setForeground(new Color(0, 153, 255));
        this.jLabel4.setText("Montant :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(320, 20, 77, 22);
        this.jTextField1.setFont(new Font("Tahoma", 0, 14));
        this.jTextField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirementsante.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jTextField1);
        this.jTextField1.setBounds(168, 11, 121, 35);
        this.jComboBox1.setFont(new Font("Tahoma", 0, 24));
        this.jComboBox1.setForeground(new Color(255, 0, 0));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{"aucune", "BT", "BNA", "UIB", "BH", "ATB", "STB"}));
        this.jComboBox1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirementsante.this.jComboBox1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jComboBox1);
        this.jComboBox1.setBounds(170, 60, 116, 35);
        this.jLabel5.setFont(new Font("Tahoma", 0, 18));
        this.jLabel5.setForeground(new Color(0, 153, 255));
        this.jLabel5.setText("Banque");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(10, 70, 59, 22);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "liste des adherents", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                montantvirementsante.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setBorder(BorderFactory.createTitledBorder(null, "", 2, 0));
        this.jTable1.setFont(new Font("Tahoma", 0, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"N dosier", "Nom ET PRENOM", "N\u00b0 de virement", "montant"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{String.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                montantvirementsante.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                montantvirementsante.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                montantvirementsante.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 190, 650, 360);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Liste des adherents de la banque:");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(60, 120, 258, 21);
        this.jLabel6.setFont(new Font("Tahoma", 1, 24));
        this.jLabel6.setForeground(new Color(204, 0, 0));
        this.jLabel6.setText("..........");
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(360, 110, 80, 29);
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirementsante.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(330, 60, 73, 33);
        this.imprimer.setFont(new Font("Tahoma", 1, 12));
        this.imprimer.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.imprimer.setText("Imprimer");
        this.imprimer.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirementsante.this.imprimerActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.imprimer);
        this.imprimer.setBounds(500, 150, 115, 40);
        this.jPanel2.setBackground(new Color(255, 255, 255));
        this.jPanel2.setLayout(null);
        this.uibchiffre.setFont(new Font("Tahoma", 1, 12));
        this.jPanel2.add(this.uibchiffre);
        this.uibchiffre.setBounds(350, 110, 250, 20);
        this.uiblettre.setFont(new Font("Tahoma", 1, 18));
        this.jPanel2.add(this.uiblettre);
        this.uiblettre.setBounds(69, 125, 410, 30);
        this.btenlettre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.btenlettre);
        this.btenlettre.setBounds(10, 160, 490, 20);
        this.btchiffre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.btchiffre);
        this.btchiffre.setBounds(90, 190, 170, 30);
        this.bhletre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.bhletre);
        this.bhletre.setBounds(10, 130, 340, 20);
        this.bhchiffre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.bhchiffre);
        this.bhchiffre.setBounds(370, 140, 130, 20);
        this.atbchiffre.setFont(new Font("Tahoma", 1, 12));
        this.jPanel2.add(this.atbchiffre);
        this.atbchiffre.setBounds(400, 310, 150, 30);
        this.ATBlettre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.ATBlettre);
        this.ATBlettre.setBounds(10, 220, 310, 30);
        this.BNAchiffre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.BNAchiffre);
        this.BNAchiffre.setBounds(120, 260, 100, 30);
        this.bnalettre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.bnalettre);
        this.bnalettre.setBounds(100, 300, 300, 30);
        this.STBlettre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.STBlettre);
        this.STBlettre.setBounds(20, 264, 430, 40);
        this.STBchiffre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.STBchiffre);
        this.STBchiffre.setBounds(110, 144, 300, 40);
        this.jPanel1.add(this.jPanel2);
        this.jPanel2.setBounds(0, 423, 640, 10);
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirementsante.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jTextField2);
        this.jTextField2.setBounds(410, 10, 220, 32);
        this.jButton1.setFont(new Font("Tahoma", 1, 11));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/ajouter rdv.png")));
        this.jButton1.setText("Ajouter");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirementsante.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(500, 50, 111, 41);
        this.jButton3.setFont(new Font("Tahoma", 1, 12));
        this.jButton3.setText("Historique");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                montantvirementsante.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(500, 100, 110, 40);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, 657, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, 589, -2).addContainerGap(-1, 32767)));
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
        String[] messageStrings = new String[]{"bt", "bna", "biat"};
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        if (this.jComboBox1.getSelectedItem().equals("BT")) {
            this.ch = "BT";
        } else if (this.jComboBox1.getSelectedItem().equals("BNA")) {
            this.ch = "BNA";
        } else if (this.jComboBox1.getSelectedItem().equals("UIB")) {
            this.ch = "UIB";
        } else if (this.jComboBox1.getSelectedItem().equals("BH")) {
            this.ch = "BH";
        } else if (this.jComboBox1.getSelectedItem().equals("ATB")) {
            this.ch = "ATB";
        } else if (this.jComboBox1.getSelectedItem().equals("aucune")) {
            this.ch = "";
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choisire la banque", "Attention", 0);
        }
        this.jLabel6.setText(this.ch);
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N dossier");
        dt1.addColumn("nom et prenom");
        dt1.addColumn("N\u00b0 de virement");
        dt1.addColumn("montant");
        this.jTable1.setModel(dt1);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("----------------------------");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state3 = conn2.createStatement();
            System.out.println("**********************************");
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE typbanque='" + this.ch + "'");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                int f = 0;
                String nbv = result3.getString("nbm");
                int n = Integer.parseInt(nbv);
                String fin = result3.getString("fin");
                f = Integer.parseInt(fin);
                if (n <= 0 || f != 1) continue;
                String nd = result3.getString("mecano");
                String monntant = result3.getString("montant");
                String NOM = result3.getString("nom");
                Object[] stg = new Object[]{nd, NOM, nbv, monntant};
                dt1.addRow(stg);
            }
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    private void imprimerActionPerformed(ActionEvent evt) {
        Date actuelle = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String datd = dateFormat.format(actuelle);
        String dateS = datd.substring(3, datd.length());
        System.out.println("date System= " + datd);
        System.out.println("date S = " + dateS);
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Attention il faut choisire l'imprimente HP par defaut", "Attention", 0, 3);
        if (option == 0) {
            if (this.jComboBox1.getSelectedItem().equals("BT")) {
                this.ch = "BT";
            } else if (this.jComboBox1.getSelectedItem().equals("BNA")) {
                this.ch = "BNA";
            } else if (this.jComboBox1.getSelectedItem().equals("UIB")) {
                this.ch = "UIB";
            } else if (this.jComboBox1.getSelectedItem().equals("BH")) {
                this.ch = "BH";
            } else if (this.jComboBox1.getSelectedItem().equals("ATB")) {
                this.ch = "ATB";
            } else if (this.jComboBox1.getSelectedItem().equals("STB")) {
                this.ch = "STB";
            } else if (this.jComboBox1.getSelectedItem().equals("aucune")) {
                this.ch = "";
            }
            if (this.ch == "") {
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Il faut choisire la banque", "Attention", 0);
            } else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    String bb = this.ch;
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE typbanque='" + bb + "'");
                    while (result3.next()) {
                        Statement stat;
                        Connection conn22;
                        JOptionPane jop3;
                        String adi;
                        String nmb = result3.getString("nbm");
                        String ff = result3.getString("fin");
                        int fff = Integer.parseInt(ff);
                        String nd = result3.getString("mecano");
                        String nomadh = result3.getString("nom");
                        int n = Integer.parseInt(nd);
                        int nombv = Integer.parseInt(nmb);
                        if (nombv <= 0 || fff != 1) continue;
                        this.montant = result3.getString("montant");
                        int fin = 0;
                        String b = "" + --nombv + "";
                        try {
                            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            stat = conn3.createStatement();
                            stat.executeUpdate("UPDATE adherent SET fin='" + fin + "' WHERE mecano='" + n + "'");
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modife fin : " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn22.createStatement();
                            String nb = "1";
                            String imprimeborde = "1";
                            state2.executeUpdate("INSERT INTO etatvirment(mois,banque,montant,MECANO,nom) VALUES('" + dateS + "','" + this.ch + "','" + this.montant + "','" + nd + "','" + nomadh + "')");
                        }
                        catch (Exception e) {
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                        }
                        try {
                            conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            stat = conn22.createStatement();
                            stat.executeUpdate("UPDATE adherent SET nbm='" + b + "' WHERE mecano='" + n + "'");
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modife nbm : " + e.getMessage());
                        }
                        System.out.println("montant =" + this.montant);
                        int t = this.montant.length() - 3;
                        System.out.println("long " + t);
                        String di = this.montant.substring(0, this.montant.length() - 3);
                        String mil = this.montant.substring(t, this.montant.length());
                        String mf = "#" + di + "," + mil + "#";
                        int nndi = Integer.parseInt(di);
                        int nnmi = Integer.parseInt(mil);
                        String mont = "";
                        String s = "";
                        if (mil.equals("000")) {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            mont = adi.toUpperCase();
                        } else {
                            adi = Nombre.CALCULATE.getValue(nndi, " Dinars ");
                            mont = adi + " et " + nnmi + " Millimes";
                        }
                        Impression1 ss = new Impression1(this.jPanel2);
                        try {
                            if (this.ch == "UIB") {
                                this.uibchiffre.setText(mf);
                                this.uiblettre.setText(mont);
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            } else if (this.ch == "BT") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText(mf);
                                this.btenlettre.setText(mont);
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            } else if (this.ch == "BH") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.bhchiffre.setText(mf);
                                this.bhletre.setText(mont);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            } else if (this.ch == "ATB") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.atbchiffre.setText(mf);
                                this.ATBlettre.setText(mont);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                            } else if (this.ch == "BNA") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.BNAchiffre.setText(mf);
                                this.bnalettre.setText(mont);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.STBchiffre.setText("");
                                this.STBlettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            } else if (this.ch == "STB") {
                                System.out.println("ch =" + this.ch);
                                System.out.println("btchiffre =" + this.montant);
                                this.STBchiffre.setText(mf);
                                this.STBlettre.setText(mont);
                                this.uibchiffre.setText("");
                                this.uiblettre.setText("");
                                this.btchiffre.setText("");
                                this.btenlettre.setText("");
                                this.bhchiffre.setText("");
                                this.bhletre.setText("");
                                this.BNAchiffre.setText("");
                                this.bnalettre.setText("");
                                this.atbchiffre.setText("");
                                this.ATBlettre.setText("");
                            }
                            ss.jiji(evt);
                            System.out.println("******************* montant **************** =" + this.montant);
                        }
                        catch (Exception e) {}
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                }
            }
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean b = true;
        if (this.jTextField1.getText().equals("") || this.jTextField2.getText().equals("")) {
            b = false;
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire tous les champs", "Attention", 0);
        } else {
            if (this.jComboBox1.getSelectedItem().equals("BT")) {
                this.ch = "BT";
            } else if (this.jComboBox1.getSelectedItem().equals("BNA")) {
                this.ch = "BNA";
            } else if (this.jComboBox1.getSelectedItem().equals("UIB")) {
                this.ch = "UIB";
            } else if (this.jComboBox1.getSelectedItem().equals("BH")) {
                this.ch = "BH";
            } else if (this.jComboBox1.getSelectedItem().equals("STB")) {
                this.ch = "STB";
            } else if (this.jComboBox1.getSelectedItem().equals("ATB")) {
                this.ch = "ATB";
            } else if (this.jComboBox1.getSelectedItem().equals("aucune")) {
                this.ch = "";
                b = false;
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Choisire la banque", "Attention", 0);
            }
            if (b) {
                JOptionPane jop3 = new JOptionPane();
                String lnom = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result3 = state.executeQuery("SELECT * FROM adherent  WHERE mecano='" + this.jTextField1.getText() + "'");
                    while (result3.next()) {
                        String nbv = result3.getString("nbm");
                        int n = Integer.parseInt(nbv);
                        String NOMA = result3.getString("NOM");
                        if (n > 0) {
                            try {
                                Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state2 = conn22.createStatement();
                                state2.executeUpdate("UPDATE adherent SET montant='" + this.jTextField2.getText() + "' WHERE mecano=" + this.jTextField1.getText());
                                state2.executeUpdate("UPDATE adherent SET typbanque='" + this.ch + "' WHERE mecano=" + this.jTextField1.getText());
                                int fin = 1;
                                state2.executeUpdate("UPDATE adherent SET fin='" + fin + "' WHERE mecano=" + this.jTextField1.getText());
                                this.jTextField2.setText("");
                                this.jTextField1.setText("");
                            }
                            catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "ereure  " + e.getMessage());
                            }
                            DefaultTableModel dt1 = new DefaultTableModel();
                            dt1.addColumn("N dossier");
                            dt1.addColumn("nom et prenom");
                            dt1.addColumn("N\u00b0 de virement");
                            dt1.addColumn("montant");
                            this.jTable1.setModel(dt1);
                            try {
                                this.jLabel6.setText(this.ch);
                                Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state4 = conn4.createStatement();
                                ResultSet result4 = state4.executeQuery("SELECT * FROM adherent  WHERE typbanque='" + this.ch + "'");
                                while (result4.next()) {
                                    String nbvv = result4.getString("nbm");
                                    int nn = Integer.parseInt(nbvv);
                                    String ff = result4.getString("fin");
                                    int fff = Integer.parseInt(ff);
                                    String nd = result4.getString("MECANO");
                                    if (nn <= 0 || fff != 1) continue;
                                    String montant = result4.getString("montant");
                                    String NOM = result4.getString("NOM");
                                    Object[] stg = new Object[]{nd, NOM, nbvv, montant};
                                    dt1.addRow(stg);
                                }
                                continue;
                            }
                            catch (Exception e) {
                                continue;
                            }
                        }
                        JOptionPane jop2 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Nombre de virment =0 => Adherent= " + NOMA, "Attention", 0);
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                }
            }
        }
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        historiquevirmentretraite a = new historiquevirmentretraite();
        a.show();
    }

    public static enum Nombre {
        ZERO(0, "zero"),
        UN(1, "un"),
        DEUX(2, "deux"),
        TROIX(3, "trois"),
        QUATRE(4, "quatre"),
        CINQ(5, "cinq"),
        SIX(6, "six"),
        SEPT(7, "sept"),
        HUIT(8, "huit"),
        NEUF(9, "neuf"),
        DIX(10, "dix"),
        ONZE(11, "onze"),
        DOUZE(12, "douze"),
        TREIZE(13, "treize"),
        QUATORZE(14, "quatorze"),
        QUINZE(15, "quinze"),
        SEIZE(16, "seize"),
        DIXSEPT(17, "dix-sept"),
        DIXHUIT(18, "dix-huit"),
        DIXNEUF(19, "dix-neuf"),
        VINGT(20, 29, "vingt"),
        TRENTE(30, 39, "trente"),
        QUARANTE(40, 49, "quarante"),
        CINQUANTE(50, 59, "cinquante"),
        SOIXANTE(60, 69, "soixante"),
        SOIXANTEDIX(70, 79, "soixante-dix", SOIXANTE),
        QUATREVINGT(80, 89, "quatre-vingt", "s"),
        QUATREVINGTDIX(90, 99, "quatre-vingt-dix", QUATREVINGT),
        DIXAINE(10, 99),
        CENT(100, 999, "cent", DIXAINE),
        MILLE(1000, 999999, "mille", CENT),
        MILLION(1000000, 99999999, "million", MILLE),
        MILLIARD(1000000000, Long.MAX_VALUE, "milliard", MILLION),
        CALCULATE{

            @Override
            protected String getValue(long value) throws Exception {
                if (value == 0) {
                    return ZERO.label;
                }
                return (value < 0 ? "moins " : "") + MILLIARD.getStringValue(Math.abs(value));
            }

            @Override
            protected String getValue(double value, String separator) throws Exception {
                if (value == 0.0) {
                    return ZERO.label + " " + separator;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(value < 0.0 ? "moins " : "");
                String vstr = Double.toString(value);
                int indexOf = vstr.indexOf(46);
                if (indexOf == -1) {
                    sb.append(MILLIARD.getStringValue((long)Math.abs(value)));
                    sb.append(" ");
                    sb.append(separator);
                } else {
                    sb.append(MILLIARD.getStringValue(Long.parseLong(vstr.substring(0, indexOf))));
                    sb.append(" ");
                    sb.append(separator);
                    String floatting = vstr.substring(indexOf + 1, indexOf + 3 >= vstr.length() ? vstr.length() : indexOf + 3) + (indexOf + 3 >= vstr.length() ? "0" : "");
                    long v = Long.parseLong(floatting);
                    if (v != 0) {
                        sb.append(" ");
                        sb.append(MILLIARD.getStringValue(v));
                    }
                }
                return sb.toString();
            }
        };
        
        protected long min;
        protected long max;
        protected String label;
        protected Nombre before;
        private String addMin;

        private Nombre() {
        }

        private Nombre(long v, String s) {
            this(v, v, s);
        }

        private Nombre(long min, long max) {
            this.min = min;
            this.max = max;
        }

        private Nombre(long min, long max, String label, Nombre before) {
            this(min, max, label);
            this.before = before;
        }

        private Nombre(long min, long max, String label, String addMin) {
            this(min, max, label);
            this.addMin = addMin;
        }

        private Nombre(long min, long max, String label) {
            this(min, max);
            this.label = label;
        }

        protected String getValue(long value) throws Exception {
            throw new Exception("Vous devez appeller la m\u00e9thode par l'\u00e9num\u00e9ration Chiffre.CALCULATE");
        }

        protected String getValue(double value, String separator) throws Exception {
            throw new Exception("Vous devez appeller la m\u00e9thode par l'\u00e9num\u00e9ration Chiffre.CALCULATE");
        }

        private String getStringValue(long value) {
            long v1 = value / this.min;
            if (v1 == 0 && this.before != null) {
                return this.before.getStringValue(value);
            }
            StringBuilder add = new StringBuilder();
            Nombre[] values = Nombre.values();
            if (value < 20) {
                return values[(int)value].label;
            }
            for (int i = 0; i < values.length; ++i) {
                Nombre nombre = values[i];
                if (value < 100 && nombre.min <= value && nombre.max >= value) {
                    if (value == nombre.min) {
                        return nombre.label + (nombre.addMin != null ? nombre.addMin : "");
                    }
                    if (nombre.before != null) {
                        StringBuilder sb = new StringBuilder(nombre.before.label);
                        sb.append(value - nombre.min + 10 == 11 && nombre.equals((Object)SOIXANTEDIX) ? " et " : "-");
                        sb.append(DIXAINE.getStringValue(value - nombre.min + 10));
                        return sb.toString();
                    }
                    StringBuilder sb = new StringBuilder(nombre.label);
                    sb.append(value - nombre.min == 1 && !nombre.equals((Object)QUATREVINGT) ? " et " : "-");
                    sb.append(value - nombre.min > 0 ? DIXAINE.getStringValue(value - nombre.min) : "");
                    return sb.toString();
                }
                if (nombre.min > v1 || nombre.max < v1 || value < 100) continue;
                if ((this.equals((Object)MILLE) || this.equals((Object)CENT)) && UN.equals((Object)nombre)) {
                    add.append(this.label);
                } else {
                    add.append(nombre.getStringValue(v1));
                    add.append(MILLIARD.equals((Object)this) && (MILLION.equals((Object)nombre) || MILLIARD.equals((Object)nombre)) ? " de" : "");
                    add.append(this.label != null ? " " + this.label : "");
                }
                add.append(value - v1 * this.min > 0 ? " " + this.before.getStringValue(value - v1 * this.min) : (v1 > 1 ? "s" : ""));
                return add.toString();
            }
            return add.toString();
        }

    }

}

