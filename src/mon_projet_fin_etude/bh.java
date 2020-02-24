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
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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

public class bh
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
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JSeparator jSeparator1;
    private JTextField jTextField15;
    private JTextField jTextField16;
    private JTextField jTextField17;
    private JTextField jTextField18;
    private JTextField jTextField19;
    private JTextField jTextField2;
    private JTextField jTextField20;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JToggleButton jToggleButton1;
    private JLabel mecano;
    private JLabel nom;

    public bh() {
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
        this.jLabel25 = new JLabel();
        this.d = new JLabel();
        this.jLabel26 = new JLabel();
        this.f = new JLabel();
        this.comantere = new JLabel();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.nom = new JLabel();
        this.jTextField15 = new JTextField();
        this.jTextField16 = new JTextField();
        this.jTextField17 = new JTextField();
        this.jTextField18 = new JTextField();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jTextField19 = new JTextField();
        this.jLabel27 = new JLabel();
        this.jTextField20 = new JTextField();
        this.jLabel28 = new JLabel();
        this.jLabel29 = new JLabel();
        this.mecano = new JLabel();
        this.ccb = new JLabel();
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
                bh.this.jTextField4ActionPerformed(evt);
            }
        });
        this.jTextField3.setFont(new Font("Tahoma", 0, 14));
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jTextField3ActionPerformed(evt);
            }
        });
        this.jTextField2.setFont(new Font("Tahoma", 0, 14));
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jToggleButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/search-purple-dark-icon.png")));
        this.jToggleButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jToggleButton1ActionPerformed(evt);
            }
        });
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/agt-imprimer-icone-9151-48.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jButton3ActionPerformed(evt);
            }
        });
        this.jLabel25.setText("date debut :");
        this.d.setText("........");
        this.jLabel26.setText("date fin :");
        this.f.setText("........");
        this.comantere.setFont(new Font("Tahoma", 0, 18));
        this.comantere.setForeground(new Color(204, 0, 0));
        this.comantere.setText(".........................................................");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel15).addComponent(this.jLabel11).addComponent(this.jLabel22)).addGap(39, 39, 39).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField3).addComponent(this.jTextField2, -2, 101, -2)).addGap(18, 18, 18).addComponent(this.jToggleButton1, -2, 57, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 66, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jTextField4).addContainerGap()))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel25).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel26).addGap(18, 18, 18).addComponent(this.f))).addGap(39, 39, 39).addComponent(this.comantere)))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton1, -2, 57, -2).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jTextField2, -2, 35, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField3, -2, 35, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel11).addGap(25, 25, 25).addComponent(this.jLabel15))).addComponent(this.jToggleButton1, -2, 59, -2).addComponent(this.jButton2, -2, 57, -2).addComponent(this.jButton3, -2, 57, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField4, -2, 35, -2).addComponent(this.jLabel22)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.comantere).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel25).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f)).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, -2).addComponent(this.jLabel26)))));
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setText("\u0623\u0645\u0631 \u0628\u0627\u0644\u062a\u062d\u0648\u064a\u0644");
        this.jLabel2.setFont(new Font("Tahoma", 1, 18));
        this.jLabel2.setText("ORDRE DE VIREMENT");
        this.jLabel4.setText("Compte N\u00b0");
        this.jLabel5.setText("Overt au nom de Mr");
        this.jLabel6.setText("\u0644\u0635\u0627\u062d\u0628(\u062a)\u0647");
        this.nom.setFont(new Font("Tahoma", 1, 18));
        this.nom.setText("............................................................");
        this.jTextField15.setText("      EN LETTRES                                                                 \u0628\u0644\u0633\u0627\u0646 \u0627\u0644\u0642\u0644\u0645 ");
        this.jTextField16.setText("      EN CHIFFRES          \u0628\u0627\u0644\u0623\u0631\u0642\u0627\u0645");
        this.jTextField16.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jTextField16ActionPerformed(evt);
            }
        });
        this.jTextField17.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jTextField17ActionPerformed(evt);
            }
        });
        this.jTextField18.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jTextField18ActionPerformed(evt);
            }
        });
        this.jLabel8.setText("En faveur de M");
        this.jLabel9.setText("Banque");
        this.jLabel10.setText(".................................");
        this.jLabel12.setText("\u0627\u0644\u0641\u0631\u0639");
        this.jLabel13.setFont(new Font("Tahoma", 1, 18));
        this.jLabel13.setText("CENTRE SOCIAL DE MAHDIA");
        this.jLabel14.setText("\u0644\u0641\u0627\u0626\u062f\u0629 \u0627\u0644\u0633\u064a\u062f(\u0629)");
        this.jLabel16.setText("\u0627\u0644\u0628\u0646\u0643");
        this.jLabel17.setText("\u064eAgence");
        this.jLabel18.setFont(new Font("Tahoma", 1, 12));
        this.jLabel18.setText("Mahdia");
        this.jLabel19.setText("RIB");
        this.jLabel20.setFont(new Font("Tahoma", 1, 18));
        this.jLabel20.setText("14 501 501 1007 02510 6 11");
        this.jLabel21.setText("\u0645\u0639\u0631\u0641 \u0627\u0644\u0647\u0648\u064a\u0629 \u0627\u0644\u0628\u0646\u0643\u064a\u0629");
        this.jLabel24.setText("Signature du Donneur d'ordre");
        this.jTextField19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jTextField19ActionPerformed(evt);
            }
        });
        this.jLabel27.setText("Signature du\u0650 Controleur");
        this.jTextField20.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bh.this.jTextField20ActionPerformed(evt);
            }
        });
        this.jLabel28.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/bhh.PNG")));
        this.jLabel29.setText("Mahdia Le ...............");
        this.mecano.setText("..........");
        this.ccb.setFont(new Font("Tahoma", 1, 18));
        this.ccb.setText("....................................................");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel19).addGap(59, 59, 59).addComponent(this.jLabel20, -2, 287, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel8).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel9).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel10, -2, 135, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel16).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel17))).addGap(34, 34, 34).addComponent(this.jLabel18, -2, 75, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel21, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, -2).addComponent(this.jLabel14)).addGroup(jPanel1Layout.createSequentialGroup().addGap(65, 65, 65).addComponent(this.jLabel12)))))).addContainerGap(92, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel28).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(94, 94, 94).addComponent(this.jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(55, 55, 55).addComponent(this.jLabel2))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(47, 47, 47).addComponent(this.jLabel29)).addGroup(jPanel1Layout.createSequentialGroup().addGap(81, 81, 81).addComponent(this.mecano))).addContainerGap(88, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField19, -1, 142, 32767).addComponent(this.jLabel24)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 202, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField20, -1, 115, 32767).addComponent(this.jLabel27, GroupLayout.Alignment.TRAILING)).addGap(89, 89, 89)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jSeparator1, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel5).addGap(6, 6, 6).addComponent(this.nom, -2, 340, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel6)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jTextField17, GroupLayout.Alignment.LEADING).addComponent(this.jTextField15, GroupLayout.Alignment.LEADING, -1, 358, 32767).addComponent(this.jLabel13, -2, 265, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField18, -1, 164, 32767).addComponent(this.jTextField16)))))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel4).addGap(18, 18, 18).addComponent(this.ccb, -2, 340, -2).addContainerGap(138, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.mecano)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jLabel29))).addComponent(this.jLabel28)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 5, -2).addGap(19, 19, 19).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.ccb)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.nom).addComponent(this.jLabel6)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField15, -2, -1, -2).addComponent(this.jTextField16, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField18).addComponent(this.jTextField17, -1, 41, 32767)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel8).addComponent(this.jLabel13, -2, 22, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel9).addComponent(this.jLabel10).addComponent(this.jLabel16).addComponent(this.jLabel17).addComponent(this.jLabel18)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel19).addComponent(this.jLabel20))).addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15).addComponent(this.jLabel14).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel12).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel21))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel24).addComponent(this.jLabel27)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField20).addComponent(this.jTextField19, -1, 48, 32767)).addGap(20, 20, 20)));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, -1, -2).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jPanel1, -2, -1, -2)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(23, 32767)));
    }

    private void jTextField4ActionPerformed(ActionEvent evt) {
    }

    private void jTextField3ActionPerformed(ActionEvent evt) {
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jToggleButton1ActionPerformed(ActionEvent evt) {
        block34 : {
            Connection conn2;
            Statement state;
            ResultSet result;
            String ch1 = "";
            String nbbb = null;
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
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn3.createStatement();
                ResultSet result3 = state2.executeQuery("SELECT nbm FROM adherent  WHERE  MECANO='" + this.jTextField2.getText() + "'");
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
            int dd = Integer.parseInt(moifin);
            int nnb = Integer.parseInt(nbbb);
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
                    System.out.println("je suis laaaaaaaaaaaaaaaaaaaaaa");
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
                    System.out.println("booooooooooooboooooooooboooo");
                    Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state3 = conn4.createStatement();
                    state3.executeUpdate("UPDATE adherent SET datedebut='" + datd + "' WHERE MECANO=" + this.jTextField2.getText());
                    state3.executeUpdate("UPDATE adherent SET datefin='" + jj + "' WHERE MECANO=" + this.jTextField2.getText());
                }
                catch (Exception e) {
                    JOptionPane jop = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                }
            } else {
                String gg;
                System.out.println("kooooooooooookoooooooookkkkkkkkkkoooo");
                try {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    }
                    catch (ClassNotFoundException ex) {
                        Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state4 = conn2.createStatement();
                    ResultSet result5 = state4.executeQuery("SELECT datefin FROM adherent  WHERE  MECANO='" + this.jTextField2.getText() + "'");
                    gg = "";
                    while (result5.next()) {
                        System.out.println("\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8");
                        gg = result5.getString("datefin");
                    }
                    System.out.println("gggggggggg =" + gg);
                    if (gg.equals("aucune")) {
                        System.out.println("date dans la base de donn\u00e9es =" + gg);
                        JOptionPane.showMessageDialog(null, "Attention: aucune virement en cours 'Payement espece'");
                    }
                    this.f.setText(gg);
                    System.out.println("\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8\u00e8");
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
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    state = conn2.createStatement();
                    result = state.executeQuery("SELECT datedebut FROM adherent  WHERE  MECANO='" + this.jTextField2.getText() + "'");
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
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state = conn2.createStatement();
                result = state.executeQuery("SELECT nbm  FROM  adherent WHERE MECANO='" + this.jTextField2.getText() + "'");
                ResultSetMetaData resultMeta = result.getMetaData();
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
                    Statement state3 = conn2.createStatement();
                    state3.executeUpdate("UPDATE adherent SET nbm='" + x + "' WHERE MECANO=" + this.jTextField2.getText());
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE  MECANO='" + this.jTextField2.getText() + "'");
                    System.out.println("**************--------------------***********");
                    this.mecano.setText(this.jTextField2.getText());
                    while (result3.next()) {
                        this.nom.setText(result3.getString("nom"));
                        this.ccb.setText(result3.getString("CCB"));
                        this.jTextField4.setText(result3.getString("CCB"));
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
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                state.executeUpdate("UPDATE adherent SET CCB='" + this.jTextField4.getText() + "' WHERE MECANO=" + this.jTextField2.getText());
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
        this.comantere.setText("............................");
    }

    private void jTextField16ActionPerformed(ActionEvent evt) {
    }

    private void jTextField19ActionPerformed(ActionEvent evt) {
    }

    private void jTextField20ActionPerformed(ActionEvent evt) {
    }

    private void jTextField18ActionPerformed(ActionEvent evt) {
    }

    private void jTextField17ActionPerformed(ActionEvent evt) {
    }

}

