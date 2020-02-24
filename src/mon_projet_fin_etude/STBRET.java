/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  com.mysql.jdbc.Connection
 *  com.mysql.jdbc.ResultSetMetaData
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
import java.io.PrintStream;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.bna;

public class STBRET
extends JPanel {
    private String ch1;
    private String ch;
    public int nbm;
    public int calcul;
    private JLabel ccb;
    private JLabel comantere;
    private JLabel d;
    private JLabel f;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel3;
    private JLabel jLabel36;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JToggleButton jToggleButton1;
    private JLabel mecano;
    private JLabel nom;

    public STBRET() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jLabel11 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel22 = new JLabel();
        this.jTextField4 = new JTextField();
        this.jTextField3 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jToggleButton1 = new JToggleButton();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jLabel12 = new JLabel();
        this.jLabel36 = new JLabel();
        this.d = new JLabel();
        this.f = new JLabel();
        this.comantere = new JLabel();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel6 = new JLabel();
        this.ccb = new JLabel();
        this.nom = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.jLabel19 = new JLabel();
        this.mecano = new JLabel();
        this.jLabel24 = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel25 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jLabel5 = new JLabel();
        this.jSeparator3 = new JSeparator();
        this.jLabel8 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jSeparator4 = new JSeparator();
        this.jPanel2.setBackground(new Color(204, 204, 204));
        this.jLabel11.setFont(new Font("Tahoma", 0, 18));
        this.jLabel11.setForeground(new Color(0, 0, 255));
        this.jLabel11.setText("Numero Dossier");
        this.jLabel15.setFont(new Font("Tahoma", 0, 18));
        this.jLabel15.setForeground(new Color(0, 0, 255));
        this.jLabel15.setText("Nombre de virment");
        this.jLabel22.setFont(new Font("Tahoma", 0, 18));
        this.jLabel22.setForeground(new Color(0, 0, 255));
        this.jLabel22.setText("Numero de compte");
        this.jTextField4.setFont(new Font("Tahoma", 0, 24));
        this.jTextField4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                STBRET.this.jTextField4ActionPerformed(evt);
            }
        });
        this.jTextField3.setFont(new Font("Tahoma", 0, 14));
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                STBRET.this.jTextField3ActionPerformed(evt);
            }
        });
        this.jTextField2.setFont(new Font("Tahoma", 0, 14));
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                STBRET.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jToggleButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/search-purple-dark-icon.png")));
        this.jToggleButton1.setToolTipText("Recherche");
        this.jToggleButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                STBRET.this.jToggleButton1ActionPerformed(evt);
            }
        });
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/agt-imprimer-icone-9151-48.png")));
        this.jButton1.setToolTipText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                STBRET.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton2.setToolTipText("Modification");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                STBRET.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton3.setToolTipText("Vider l'ecron");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                STBRET.this.jButton3ActionPerformed(evt);
            }
        });
        this.jLabel12.setText("date debut :");
        this.jLabel36.setText("date fin :");
        this.d.setText("..............");
        this.f.setText(".............");
        this.comantere.setFont(new Font("Tahoma", 0, 18));
        this.comantere.setForeground(new Color(204, 0, 0));
        this.comantere.setText(".........................................................");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel15).addComponent(this.jLabel11).addComponent(this.jLabel22)).addGap(39, 39, 39).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField3).addComponent(this.jTextField2, -2, 101, -2)).addGap(18, 18, 18).addComponent(this.jToggleButton1, -2, 57, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 66, -2)).addComponent(this.jTextField4))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel12).addComponent(this.jLabel36)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f).addComponent(this.d)).addGap(39, 39, 39).addComponent(this.comantere))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton1, -2, 57, -2).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jTextField2, -2, 35, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField3, -2, 35, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel11).addGap(25, 25, 25).addComponent(this.jLabel15))).addComponent(this.jToggleButton1, -2, 59, -2).addComponent(this.jButton2, -2, 57, -2).addComponent(this.jButton3, -2, 57, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField4, -2, 35, -2).addComponent(this.jLabel22)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.comantere).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel12).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel36).addComponent(this.f))))));
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jPanel1.setLayout(null);
        this.jLabel1.setText("\u0627\u0644\u0634\u0631\u0643\u0629 \u0627\u0644\u062a\u0648\u0646\u0633\u064a\u0629 \u0644\u0644\u0628\u0646\u0643");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(28, 8, 104, 14);
        this.jLabel3.setFont(new Font("Tahoma", 0, 24));
        this.jLabel3.setText("ORDRE DE VIREMENT ");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(166, 29, 242, 29);
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(582, 56, 0, 0);
        this.jLabel6.setFont(new Font("Tahoma", 0, 12));
        this.jLabel6.setText("Nom et Prenom :");
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(32, 133, 95, 15);
        this.ccb.setFont(new Font("Tahoma", 1, 14));
        this.ccb.setText("............................................");
        this.jPanel1.add(this.ccb);
        this.ccb.setBounds(133, 82, 257, 34);
        this.nom.setFont(new Font("Tahoma", 1, 14));
        this.nom.setText("...........................................");
        this.jPanel1.add(this.nom);
        this.nom.setBounds(133, 122, 340, 34);
        this.jLabel10.setFont(new Font("Tahoma", 0, 12));
        this.jLabel10.setText("Veuillez effectuer les virements suivants :");
        this.jPanel1.add(this.jLabel10);
        this.jLabel10.setBounds(32, 178, 225, 15);
        this.jLabel13.setFont(new Font("Tahoma", 1, 14));
        this.jPanel1.add(this.jLabel13);
        this.jLabel13.setBounds(98, 369, 166, 0);
        this.jLabel14.setFont(new Font("Tahoma", 0, 14));
        this.jLabel14.setText("B\u00e9n\u00e9ficiaire :");
        this.jPanel1.add(this.jLabel14);
        this.jLabel14.setBounds(10, 263, 75, 17);
        this.jLabel16.setFont(new Font("Tahoma", 1, 14));
        this.jLabel16.setText("CENTRE SOCIAL DE MAHDIA");
        this.jPanel1.add(this.jLabel16);
        this.jLabel16.setBounds(91, 263, 204, 17);
        this.jLabel17.setFont(new Font("Tahoma", 0, 14));
        this.jLabel17.setText("N\u00b0 COMPTE :");
        this.jPanel1.add(this.jLabel17);
        this.jLabel17.setBounds(10, 286, 82, 17);
        this.jLabel18.setFont(new Font("Tahoma", 1, 14));
        this.jLabel18.setText("10501003021252378819");
        this.jPanel1.add(this.jLabel18);
        this.jLabel18.setBounds(98, 286, 180, 17);
        this.jPanel1.add(this.jSeparator2);
        this.jSeparator2.setBounds(1169, 423, 0, 10);
        this.jLabel19.setFont(new Font("Tahoma", 3, 11));
        this.jLabel19.setText("Signature :");
        this.jPanel1.add(this.jLabel19);
        this.jLabel19.setBounds(479, 266, 64, 14);
        this.mecano.setText("...........");
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(275, 8, 44, 14);
        this.jLabel24.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/stb-tunisie.jpg")));
        this.jPanel1.add(this.jLabel24);
        this.jLabel24.setBounds(520, 0, 46, 56);
        this.jLabel21.setFont(new Font("Tahoma", 0, 12));
        this.jLabel21.setText("N\u00b0 COMPTE :");
        this.jPanel1.add(this.jLabel21);
        this.jLabel21.setBounds(32, 93, 73, 15);
        this.jLabel25.setFont(new Font("Tahoma", 0, 12));
        this.jLabel25.setText("\u0631\u0642\u0645 \u0627\u0644\u062d\u0633\u0627\u0628 :");
        this.jPanel1.add(this.jLabel25);
        this.jLabel25.setBounds(469, 93, 70, 15);
        this.jLabel2.setFont(new Font("Tahoma", 0, 12));
        this.jLabel2.setText("\u0635\u0627\u062d\u0628 \u0627\u0644\u062d\u0633\u0627\u0628 :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(479, 133, 85, 15);
        this.jPanel1.add(this.jSeparator1);
        this.jSeparator1.setBounds(0, 162, 0, 10);
        this.jLabel5.setFont(new Font("Tahoma", 0, 12));
        this.jLabel5.setText("\u0623\u0631\u062c\u0648 \u062a\u062d\u0648\u064a\u0644 \u0627\u0644\u0645\u0628\u0644\u063a \u0627\u0644\u0627\u062a\u064a\u0629 :");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(417, 178, 120, 15);
        this.jPanel1.add(this.jSeparator3);
        this.jSeparator3.setBounds(6, 162, 571, 10);
        this.jLabel8.setText("Montant total en toutes lettres :");
        this.jPanel1.add(this.jLabel8);
        this.jLabel8.setBounds(10, 314, 155, 14);
        this.jPanel1.add(this.jTextField1);
        this.jTextField1.setBounds(476, 286, 90, 77);
        this.jPanel1.add(this.jSeparator4);
        this.jSeparator4.setBounds(0, 247, 577, 10);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jPanel1, -1, -1, 32767)).addComponent(this.jPanel2, GroupLayout.Alignment.LEADING, -2, 596, -2)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -2, 382, -2).addGap(80, 80, 80)));
    }

    private void jTextField4ActionPerformed(ActionEvent evt) {
    }

    private void jTextField3ActionPerformed(ActionEvent evt) {
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jToggleButton1ActionPerformed(ActionEvent evt) {
        block34 : {
            ResultSet result;
            Statement state;
            Connection conn2;
            String ch1 = "";
            String nbbb = "0";
            Locale locale = Locale.getDefault();
            Date actuelle = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String datd = dateFormat.format(actuelle);
            try {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                }
                catch (ClassNotFoundException ex) {
                    Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
                }
                Connection conn3 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = (Statement)conn3.createStatement();
                ResultSet result3 = state2.executeQuery("SELECT nbm FROM retretait  WHERE  mecano='" + this.jTextField2.getText() + "'");
                while (result3.next()) {
                    nbbb = result3.getString("nbm");
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
            }
            int l = datd.length();
            int nbb = Integer.parseInt(this.jTextField3.getText());
            String moifin = datd.substring(datd.length() - 5, datd.length() - 3);
            String anactuel = datd.substring(0, datd.length() - 6);
            System.out.println("nbm =" + nbbb);
            int dd = Integer.parseInt(moifin);
            int nnb = Integer.parseInt(nbbb);
            System.out.println("nnb =" + nnb);
            int j = 0;
            boolean k = false;
            System.out.println("---------------------------------------------");
            System.out.println("nbb:  " + nbb);
            System.out.println("nnb :  " + nnb);
            if (nbb > nnb) {
                j = nbb - nnb;
            }
            System.out.println("j :  " + j);
            String a = null;
            String m = null;
            System.out.println("---------------------------------------------");
            if (j > 0) {
                int aneac;
                int anfin;
                int moisf;
                k = true;
                this.d.setText(datd);
                System.out.println("----------------nbb+dd+j-------------------" + (dd + j));
                if (dd + j + nnb < 13) {
                    int s = nbb + dd;
                    System.out.println("date   fin  =" + anactuel + "-" + s + "-15");
                    this.f.setText(anactuel + "-" + s + "-15");
                    m = "" + s;
                    a = anactuel;
                } else if (dd + j + nnb < 25) {
                    aneac = Integer.parseInt(anactuel);
                    System.out.println("ane\u00e9s actuele=" + aneac);
                    anfin = aneac + 1;
                    System.out.println("ane\u00e9s fin=" + anfin);
                    moisf = nbb + dd - 12;
                    System.out.println("mois fin fin=" + moisf);
                    System.out.println("date   fin  =" + anfin + "-" + moisf + "-15");
                    this.f.setText("" + anfin + "-" + moisf + "-15");
                    m = "" + moisf;
                    a = "" + anfin;
                } else if (dd + j + nnb < 37) {
                    aneac = Integer.parseInt(anactuel);
                    anfin = aneac + 2;
                    moisf = nbb + dd - 24;
                    System.out.println("date   fin  =" + anfin + "-" + moisf + "-15");
                    this.f.setText("" + anfin + "-" + moisf + "-15");
                    m = "" + moisf;
                    a = "" + anfin;
                }
            }
            if (k) {
                String jj = a + "-" + m + "-15";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn4 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state3 = (Statement)conn4.createStatement();
                    state3.executeUpdate("UPDATE retretait SET datedebut='" + datd + "' WHERE mecano=" + this.jTextField2.getText());
                    state3.executeUpdate("UPDATE retretait SET datefin='" + jj + "' WHERE mecano=" + this.jTextField2.getText());
                }
                catch (Exception e) {
                    JOptionPane jop = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                }
            } else {
                String gg;
                try {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    }
                    catch (ClassNotFoundException ex) {
                        Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state4 = (Statement)conn2.createStatement();
                    ResultSet result5 = state4.executeQuery("SELECT datefin FROM retretait  WHERE  mecano='" + this.jTextField2.getText() + "'");
                    gg = "";
                    while (result5.next()) {
                        gg = result5.getString("datefin");
                    }
                    if (gg.equals("aucune")) {
                        System.out.println("date dans la base de donn\u00e9es =" + gg);
                        JOptionPane.showMessageDialog(null, "Attention: aucune virement en cours 'Payement espece'");
                    }
                    this.f.setText(gg);
                }
                catch (SQLException ex) {
                    Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    }
                    catch (ClassNotFoundException ex) {
                        Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    state = (Statement)conn2.createStatement();
                    result = state.executeQuery("SELECT datedebut FROM retretait  WHERE  mecano='" + this.jTextField2.getText() + "'");
                    while (result.next()) {
                        gg = result.getString("datedebut");
                        this.d.setText(gg);
                    }
                }
                catch (SQLException ex) {
                    Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.jButton1.setVisible(true);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state = (Statement)conn2.createStatement();
                result = state.executeQuery("SELECT nbm  FROM  retretait WHERE mecano='" + this.jTextField2.getText() + "'");
                com.mysql.jdbc.ResultSetMetaData resultMeta = (com.mysql.jdbc.ResultSetMetaData)result.getMetaData();
                while (result.next()) {
                    this.nbm = result.getInt("nbm");
                    System.out.println("nbm =" + this.nbm);
                }
                String is = this.jTextField3.getText();
                int i = Integer.parseInt(is);
                if (this.nbm >= i) {
                    this.jButton1.setVisible(false);
                    System.out.println("nbm =" + this.nbm);
                    System.out.println("i =" + i);
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Il reste " + this.nbm + " virement ", "Information", 1);
                    break block34;
                }
                this.calcul = i - this.nbm;
                int x = this.nbm + this.calcul;
                this.jButton1.setVisible(true);
                this.comantere.setText("attention il faut imprimer " + this.calcul + " Virment");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("*************************");
                    Statement state3 = (Statement)conn2.createStatement();
                    state3.executeUpdate("UPDATE retretait SET nbm='" + x + "' WHERE mecano=" + this.jTextField2.getText());
                    ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE  mecano='" + this.jTextField2.getText() + "'");
                    System.out.println("**************--------------------***********");
                    this.mecano.setText(this.jTextField2.getText());
                    while (result3.next()) {
                        this.nom.setText(result3.getString("nom"));
                        this.ccb.setText(result3.getString("rib"));
                        this.jTextField4.setText(result3.getString("rib"));
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
            }
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        JOptionPane jop1 = new JOptionPane();
        JOptionPane.showMessageDialog(null, "Attention : il faut imprimer " + this.calcul + " virment ", "Information", 1);
        Impression1 s = new Impression1(this.jPanel1);
        s.actionPerformed(evt);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        if (this.jTextField2.getText() != "") {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = (Statement)conn2.createStatement();
                state.executeUpdate("UPDATE retretait SET rib='" + this.jTextField4.getText() + "' WHERE mecano=" + this.jTextField2.getText());
                this.ccb.setText(this.jTextField4.getText());
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Attention : Saisire le numero de compte  ");
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        this.jTextField4.setText("");
        this.jTextField3.setText("");
        this.jTextField2.setText("");
        this.f.setText("......");
        this.d.setText("......");
        this.ccb.setText(".................");
        this.nom.setText(".................");
        this.mecano.setText(".....");
        this.comantere.setText("..............................");
    }

}

