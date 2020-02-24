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

public class atbbret
extends JPanel {
    private String ch1;
    private String ch;
    public int nbm;
    public int calcul;
    private JTextField ccb;
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
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel45;
    private JLabel jLabel46;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JSeparator jSeparator5;
    private JSeparator jSeparator6;
    private JSeparator jSeparator7;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField12;
    private JTextField jTextField13;
    private JTextField jTextField14;
    private JTextField jTextField15;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JToggleButton jToggleButton1;
    private JLabel mecano;
    private JTextField nom;

    public atbbret() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.mecano = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel24 = new JLabel();
        this.nom = new JTextField();
        this.jLabel25 = new JLabel();
        this.jLabel7 = new JLabel();
        this.ccb = new JTextField();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jLabel14 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel26 = new JLabel();
        this.jTextField11 = new JTextField();
        this.jLabel27 = new JLabel();
        this.jLabel28 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jLabel34 = new JLabel();
        this.jSeparator3 = new JSeparator();
        this.jLabel35 = new JLabel();
        this.jTextField10 = new JTextField();
        this.jLabel36 = new JLabel();
        this.jTextField12 = new JTextField();
        this.jTextField13 = new JTextField();
        this.jLabel37 = new JLabel();
        this.jSeparator4 = new JSeparator();
        this.jLabel38 = new JLabel();
        this.jTextField14 = new JTextField();
        this.jTextField15 = new JTextField();
        this.jLabel39 = new JLabel();
        this.jLabel40 = new JLabel();
        this.jSeparator5 = new JSeparator();
        this.jSeparator6 = new JSeparator();
        this.jSeparator7 = new JSeparator();
        this.jLabel41 = new JLabel();
        this.jLabel42 = new JLabel();
        this.jLabel43 = new JLabel();
        this.jLabel44 = new JLabel();
        this.jLabel45 = new JLabel();
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
        this.jLabel23 = new JLabel();
        this.jLabel46 = new JLabel();
        this.d = new JLabel();
        this.f = new JLabel();
        this.comantere = new JLabel();
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jLabel1.setText("\u0627\u0644\u0628\u0646\u0643 \u0627\u0644\u0639\u0631\u0628\u064a \u0627\u0644\u062a\u0648\u0646\u0633\u064a");
        this.jLabel2.setText("Arabe Tunisian Bank");
        this.jLabel3.setFont(new Font("Tahoma", 0, 24));
        this.jLabel3.setText("ORDRE DE VIREMENT ");
        this.jLabel13.setFont(new Font("Tahoma", 1, 14));
        this.mecano.setText("...........");
        this.jLabel21.setFont(new Font("Tahoma", 1, 24));
        this.jLabel21.setText("\u0623\u0645\u0631 \u062a\u062d\u0648\u064a\u0644");
        this.jLabel24.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/atb.PNG")));
        this.nom.setFont(new Font("Tahoma", 1, 14));
        this.nom.setText("...............................................");
        this.nom.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.nomActionPerformed(evt);
            }
        });
        this.jLabel25.setText("Ordonnateur   \u0627\u0644\u0623\u0645\u0631     ");
        this.jLabel7.setText("N\u00b0 de compte");
        this.ccb.setFont(new Font("Tahoma", 1, 14));
        this.jLabel9.setFont(new Font("Tahoma", 0, 8));
        this.jLabel9.setText("Pour le d\u00e9bit de mon compte, je  vous prie d'ex\u00e9cuter");
        this.jLabel10.setFont(new Font("Tahoma", 0, 8));
        this.jLabel10.setText(" un virement en faveur du b\u00e9n\u00e9ficiare  indiqu\u00e9 ");
        this.jLabel12.setFont(new Font("Tahoma", 0, 8));
        this.jLabel12.setText(" et dans les conditions ci-mentionn\u00e9es.");
        this.jLabel16.setFont(new Font("Tahoma", 0, 8));
        this.jLabel16.setText("\u0627\u0631\u062c\u0648 \u0627\u0635\u062f\u0627\u0631 \u062a\u062d\u0648\u064a\u0644 \u062d\u0633\u0628 \u0627\u0644\u0634\u0631\u0648\u0637 \u0627\u0644\u0645\u0628\u0646\u064a\u0629 ");
        this.jLabel17.setFont(new Font("Tahoma", 0, 8));
        this.jLabel17.setText("\u0627\u062f\u0646\u0647 \u0644\u0635\u0627\u0644\u062d \u0627\u0644\u0645\u0633\u062a\u0641\u064a\u062f \u0627\u0644\u0645\u0630\u0643\u0648\u0631 \u0648 \u0633\u062d\u0628 ");
        this.jLabel18.setFont(new Font("Tahoma", 0, 8));
        this.jLabel18.setText("\u0627\u0644\u0645\u0628\u0644\u063a \u0645\u0646 \u062d\u0633\u0627\u0628\u064a \u0644\u062f\u064a\u0643\u0645");
        this.jLabel14.setFont(new Font("Tahoma", 0, 10));
        this.jLabel14.setText("Montant");
        this.jLabel19.setFont(new Font("Tahoma", 1, 12));
        this.jLabel19.setForeground(new Color(255, 255, 255));
        this.jLabel19.setText("........................................................");
        this.jLabel26.setFont(new Font("Tahoma", 0, 10));
        this.jLabel26.setText("\u0627\u0644\u0645\u0628\u0644\u063a");
        this.jTextField11.setText("Motif    ..............................................................");
        this.jTextField11.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.jTextField11ActionPerformed(evt);
            }
        });
        this.jLabel27.setText("Mahdia Le ");
        this.jLabel28.setText("B\u00e9n\u00e9ficiaire");
        this.jLabel29.setText("B\u00e9n\u00e9ficiaire");
        this.jLabel30.setText("\u0627\u0644\u0645\u0633\u062a\u0641\u064a\u062f");
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setText("CENTRE SOCIAL");
        this.jLabel32.setText("Agence");
        this.jLabel33.setText("\u0641\u0631\u0639");
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setText("MAHDIA");
        this.jLabel35.setFont(new Font("Tahoma", 0, 8));
        this.jLabel35.setText("Code Agence");
        this.jTextField10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setFont(new Font("Tahoma", 0, 8));
        this.jLabel36.setText("N\u00b0 de compte");
        this.jTextField12.setFont(new Font("Tahoma", 1, 14));
        this.jTextField13.setFont(new Font("Tahoma", 1, 14));
        this.jLabel37.setFont(new Font("Tahoma", 0, 8));
        this.jLabel37.setText("Cl\u00e9");
        this.jLabel38.setText("CONDITIONS D'EXECUTION");
        this.jTextField14.setFont(new Font("Tahoma", 0, 8));
        this.jTextField14.setText("\u0639\u0627\u062f\u064a         V.NORMALV");
        this.jTextField14.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.jTextField14ActionPerformed(evt);
            }
        });
        this.jTextField15.setFont(new Font("Tahoma", 0, 8));
        this.jTextField15.setText(" \u0623\u062e\u0631\u0649          AUTRES");
        this.jTextField15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.jTextField15ActionPerformed(evt);
            }
        });
        this.jLabel39.setFont(new Font("Tahoma", 0, 8));
        this.jLabel39.setText("\u0644\u062a\u062d\u0648\u064a\u0644\u0627\u062a \u0627\u0644\u062f\u0627\u0626\u0645\u0629");
        this.jLabel40.setFont(new Font("Tahoma", 0, 8));
        this.jLabel40.setText("Pour les virments permanents");
        this.jLabel41.setText("Montant en chifre");
        this.jLabel42.setText("............................................");
        this.jLabel43.setText("P\u00e9riode");
        this.jLabel44.setFont(new Font("Tahoma", 0, 8));
        this.jLabel44.setText("d\u00e9but : .................................................");
        this.jLabel45.setFont(new Font("Tahoma", 0, 8));
        this.jLabel45.setText("fin    : .................................................");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jSeparator1, -2, 344, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel14).addGap(8, 8, 8).addComponent(this.jLabel19).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel26)).addComponent(this.jTextField11, -2, 314, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.nom, GroupLayout.Alignment.LEADING, -2, 314, -2).addComponent(this.ccb, -2, 314, -2)).addComponent(this.jLabel27)).addGap(20, 20, 20).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel42).addComponent(this.jLabel41).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jTextField14, -2, 93, -2).addGap(18, 18, 18).addComponent(this.jTextField15, -2, -1, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(31, 31, 31).addComponent(this.jLabel38)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.jTextField10, -2, 31, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField12, -2, 111, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField13, -2, 35, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel35).addGap(27, 27, 27).addComponent(this.jLabel36).addGap(52, 52, 52).addComponent(this.jLabel37)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jSeparator5, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel40).addGap(28, 28, 28).addComponent(this.jLabel39)))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 379, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel43).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel44)).addComponent(this.jLabel45)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel13, -2, 166, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(112, 112, 112).addComponent(this.jLabel4)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 175, 32767).addComponent(this.jSeparator2, -2, -1, -2).addGap(111, 111, 111)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(184, 184, 184).addComponent(this.jLabel29).addGap(47, 47, 47)))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel21).addComponent(this.jSeparator3, -2, 198, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(42, 42, 42).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel30).addComponent(this.jLabel31))).addComponent(this.jSeparator4, -2, 184, -2).addComponent(this.jSeparator7, -2, 191, -2))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel24).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jLabel2)).addGap(29, 29, 29).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(88, 88, 88).addComponent(this.mecano)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel28).addComponent(this.jLabel3)).addGroup(jPanel1Layout.createSequentialGroup().addGap(174, 174, 174).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jSeparator6, -2, 198, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel32).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel34).addGap(18, 18, 18).addComponent(this.jLabel33))))).addGap(133, 133, 133)))).addGroup(jPanel1Layout.createSequentialGroup().addGap(99, 99, 99).addComponent(this.jLabel25)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel9).addComponent(this.jLabel10).addComponent(this.jLabel12)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel18).addComponent(this.jLabel17))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel16, -2, 143, -2)))).addGroup(jPanel1Layout.createSequentialGroup().addGap(114, 114, 114).addComponent(this.jLabel7))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel24).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.mecano).addComponent(this.jLabel1)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(7, 7, 7).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jLabel21))).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2))))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel25).addComponent(this.jLabel28))).addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel30))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.nom, -2, 36, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel32).addComponent(this.jLabel4).addComponent(this.jLabel33))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel31).addGap(18, 18, 18).addComponent(this.jLabel34))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.jSeparator3, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel35).addComponent(this.jLabel36).addComponent(this.jLabel37)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField10, -2, -1, -2).addComponent(this.jTextField12, -2, -1, -2).addComponent(this.jTextField13, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator4, -2, 10, -2).addGap(2, 2, 2).addComponent(this.jLabel38).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField14, -2, 23, -2).addComponent(this.jTextField15, -2, 24, -2)).addGap(7, 7, 7).addComponent(this.jSeparator5, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel40).addComponent(this.jLabel39)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator6, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel43).addGap(29, 29, 29)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel44).addGap(2, 2, 2).addComponent(this.jLabel45).addGap(6, 6, 6))).addGap(2, 2, 2).addComponent(this.jSeparator7, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel41).addGap(6, 6, 6).addComponent(this.jLabel42).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jSeparator2, -2, 10, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel13).addGap(108, 108, 108)))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel7).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ccb, -2, 30, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel9).addComponent(this.jLabel16)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel10).addComponent(this.jLabel17)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel12).addComponent(this.jLabel18)).addGap(18, 18, 18).addComponent(this.jSeparator1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel14).addComponent(this.jLabel19).addComponent(this.jLabel26)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField11, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel27)))).addGroup(jPanel1Layout.createSequentialGroup().addGap(360, 360, 360).addComponent(this.jLabel29))).addContainerGap()));
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
                atbbret.this.jTextField4ActionPerformed(evt);
            }
        });
        this.jTextField3.setFont(new Font("Tahoma", 0, 14));
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.jTextField3ActionPerformed(evt);
            }
        });
        this.jTextField2.setFont(new Font("Tahoma", 0, 14));
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jToggleButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/search-purple-dark-icon.png")));
        this.jToggleButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.jToggleButton1ActionPerformed(evt);
            }
        });
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/agt-imprimer-icone-9151-48.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                atbbret.this.jButton3ActionPerformed(evt);
            }
        });
        this.jLabel23.setText("date debut :");
        this.jLabel46.setText("date fin :");
        this.d.setText("..............");
        this.f.setText(".............");
        this.comantere.setFont(new Font("Tahoma", 0, 18));
        this.comantere.setForeground(new Color(204, 0, 0));
        this.comantere.setText(".........................................................");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel15).addComponent(this.jLabel11).addComponent(this.jLabel22)).addGap(39, 39, 39).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField3).addComponent(this.jTextField2, -2, 101, -2)).addGap(18, 18, 18).addComponent(this.jToggleButton1, -2, 57, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 66, -2)).addComponent(this.jTextField4, -2, 372, -2))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel23).addComponent(this.jLabel46)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f).addComponent(this.d)).addGap(39, 39, 39).addComponent(this.comantere)))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton1, -2, 57, -2).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jTextField2, -2, 35, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField3, -2, 35, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel11).addGap(25, 25, 25).addComponent(this.jLabel15))).addComponent(this.jToggleButton1, -2, 59, -2).addComponent(this.jButton2, -2, 57, -2).addComponent(this.jButton3, -2, 57, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField4, -2, 35, -2).addComponent(this.jLabel22)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.comantere).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel23).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel46).addComponent(this.f))))));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, -1, -2).addComponent(this.jPanel1, -2, 578, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -2, 418, -2).addContainerGap(17, 32767)));
    }

    private void nomActionPerformed(ActionEvent evt) {
    }

    private void jTextField11ActionPerformed(ActionEvent evt) {
    }

    private void jTextField14ActionPerformed(ActionEvent evt) {
    }

    private void jTextField15ActionPerformed(ActionEvent evt) {
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
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn3.createStatement();
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
            int dd = Integer.parseInt(moifin);
            int nnb = Integer.parseInt(nbbb);
            int j = 0;
            boolean k = false;
            System.out.println("nbb:  " + nbb);
            System.out.println("nnb :  " + nnb);
            if (nbb > nnb) {
                j = nbb - nnb;
            }
            System.out.println("j :  " + j);
            String a = null;
            String m = null;
            if (j > 0) {
                int aneac;
                int anfin;
                int moisf;
                k = true;
                this.d.setText(datd);
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
                    Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state3 = conn4.createStatement();
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
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state4 = conn2.createStatement();
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
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    state = conn2.createStatement();
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
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state = conn2.createStatement();
                result = state.executeQuery("SELECT nbm  FROM  retretait WHERE mecano='" + this.jTextField2.getText() + "'");
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
                    state3.executeUpdate("UPDATE retretait SET nbm='" + x + "' WHERE mecano=" + this.jTextField2.getText());
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE  mecano='" + this.jTextField2.getText() + "'");
                    System.out.println("**************---------888888888888888888-----------***********");
                    this.mecano.setText(this.jTextField2.getText());
                    while (result3.next()) {
                        this.nom.setText(result3.getString("nom"));
                        this.ccb.setText(result3.getString("rib"));
                        this.jTextField11.setText(result3.getString("rib"));
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
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            ResultSet result = state.executeQuery("SELECT nbm  FROM  retretait WHERE mecano='" + this.jTextField2.getText() + "'");
            ResultSetMetaData resultMeta = result.getMetaData();
            while (result.next()) {
                this.nbm = result.getInt("nbm");
            }
            if (this.nbm == 0) {
                JOptionPane.showMessageDialog(null, "Aucune  virment a imprimer: nombre de mois =0", "Information", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Attention : il faut imprimer " + this.nbm + " virment ", "Information", 1);
                Impression1 s = new Impression1(this.jPanel1);
                s.actionPerformed(evt);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        if (this.jTextField2.getText() != "") {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
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

