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

public class bnaret
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
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField7;
    private JToggleButton jToggleButton1;
    private JLabel mecano;
    private JLabel nom;

    public bnaret() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.mecano = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel25 = new JLabel();
        this.jLabel26 = new JLabel();
        this.jTextField7 = new JTextField();
        this.jSeparator1 = new JSeparator();
        this.jLabel27 = new JLabel();
        this.jLabel28 = new JLabel();
        this.jTextField10 = new JTextField();
        this.jLabel29 = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jTextField11 = new JTextField();
        this.jLabel32 = new JLabel();
        this.ccb = new JLabel();
        this.nom = new JLabel();
        this.jLabel35 = new JLabel();
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
        this.comantere = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel36 = new JLabel();
        this.d = new JLabel();
        this.f = new JLabel();
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jLabel2.setText("\u0627\u0644\u0628\u0646\u0643 \u0627\u0644\u0648\u0637\u0646\u064a \u0627\u0644\u0641\u0644\u0627\u062d\u064a");
        this.jLabel3.setFont(new Font("Tahoma", 0, 24));
        this.jLabel3.setText("ORDRE DE VIREMENT ");
        this.jLabel13.setFont(new Font("Tahoma", 1, 14));
        this.mecano.setText("...........");
        this.jLabel21.setFont(new Font("Tahoma", 1, 11));
        this.jLabel21.setText("\u0623\u0645\u0631 \u0628\u0627\u0644\u062a\u062d\u0648\u064a\u0644");
        this.jLabel24.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/BNA2.jpg")));
        this.jLabel5.setText("Agence de : Mahdia");
        this.jLabel6.setText("Nom           : ");
        this.jLabel7.setText("Adresse     : Mahdia");
        this.jLabel8.setText("\u062d\u0633\u0627\u0628\u064a \u0627\u0644\u062c\u0627\u0631\u064a \u0639\u062f\u062f ");
        this.jLabel9.setFont(new Font("Tahoma", 1, 14));
        this.jLabel9.setText("........................");
        this.jLabel10.setFont(new Font("Tahoma", 0, 12));
        this.jLabel10.setText("\u0625\u062d\u0627\u0644\u0629 \u0645\u0628\u0644\u063a \u0642\u062f\u0631\u0647 ");
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText(".............................");
        this.jLabel14.setFont(new Font("Tahoma", 0, 12));
        this.jLabel14.setText("\u0644\u0641\u0627\u0626\u062f\u0629");
        this.jLabel16.setFont(new Font("Tahoma", 1, 14));
        this.jLabel16.setText(".................................");
        this.jLabel17.setText("\u0644\u0630\u064a");
        this.jLabel18.setFont(new Font("Tahoma", 1, 14));
        this.jLabel18.setText(".......................................................................");
        this.jLabel19.setFont(new Font("Tahoma", 0, 12));
        this.jLabel19.setText("Veuillez par le d\u00e9bit de mon compte N\u00b0");
        this.jLabel25.setText("Virer au compte de : ");
        this.jLabel26.setText("Chez la Banque Nationale Agricole a  MAHDIA  Compte N\u00b0");
        this.jTextField7.setFont(new Font("Tahoma", 1, 12));
        this.jTextField7.setText("  03 501 016 0101 003739 58 B");
        this.jTextField7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bnaret.this.jTextField7ActionPerformed(evt);
            }
        });
        this.jLabel27.setText("\u0627\u0644\u0645\u0628\u0644\u063a");
        this.jLabel28.setText("La somme de");
        this.jLabel29.setText("En lettre :");
        this.jLabel30.setText("En chifre");
        this.jLabel31.setText("Motif de l'op\u00e9ration :...............................................................\u0628\u0633\u0628\u0628 \u0627\u0644\u0639\u0645\u0644\u064a\u0629 ");
        this.jTextField11.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bnaret.this.jTextField11ActionPerformed(evt);
            }
        });
        this.jLabel32.setText("Signature");
        this.ccb.setFont(new Font("Tahoma", 1, 14));
        this.ccb.setText(".....................................................................");
        this.nom.setFont(new Font("Tahoma", 1, 14));
        this.nom.setText("....................");
        this.jLabel35.setFont(new Font("Tahoma", 1, 18));
        this.jLabel35.setText("CENTRE SOCIAL DE MAHDIA");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(98, 98, 98).addComponent(this.jLabel13, -2, 166, -2).addGap(240, 240, 240)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel18, -2, 308, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel21).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel12, -2, 128, -2).addGap(28, 28, 28).addComponent(this.jLabel10, -2, 97, -2).addGap(2, 2, 2)))).addGap(16, 16, 16).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel17).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel16)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.mecano).addComponent(this.jLabel9)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel8).addComponent(this.jLabel24))))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel2).addGap(56, 56, 56).addComponent(this.jLabel3))).addGap(297, 297, 297).addComponent(this.jLabel4))).addGap(40, 40, 40)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jSeparator2, -2, -1, -2).addGap(176, 176, 176)))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel19).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ccb, -2, 248, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel14)).addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel5).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel6).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.nom)).addComponent(this.jLabel7))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel25).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel35)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel26).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField7, -2, 217, -2)))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jSeparator1, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel28)).addGroup(jPanel1Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(this.jLabel27))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jTextField10, -2, 6, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel29).addComponent(this.jLabel30))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel31))).addGap(39, 39, 39).addComponent(this.jTextField11, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jLabel32, -2, 70, -2)))).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.mecano).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(42, 42, 42).addComponent(this.jLabel4)).addComponent(this.jLabel2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel21))).addGap(16, 16, 16).addComponent(this.jLabel5).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6, -2, 14, -2).addComponent(this.nom)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel7)).addComponent(this.jLabel24, -2, 59, -2)).addGap(30, 30, 30).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel12).addComponent(this.jLabel9).addComponent(this.jLabel10, -2, 17, -2).addComponent(this.jLabel8)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel17).addComponent(this.jLabel18).addComponent(this.jLabel16)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel19).addComponent(this.ccb).addComponent(this.jLabel14)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel25).addComponent(this.jLabel35)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel26).addComponent(this.jTextField7, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, -1, -2).addGap(8, 8, 8).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(this.jLabel27).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel28, -2, 21, -2)).addComponent(this.jTextField10, -2, 50, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel30).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel29))).addGap(18, 18, 18).addComponent(this.jLabel31).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel13).addGap(108, 108, 108)).addComponent(this.jSeparator2, -2, 10, -2))).addComponent(this.jTextField11, -2, 88, -2).addComponent(this.jLabel32)).addContainerGap()));
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
                bnaret.this.jTextField4ActionPerformed(evt);
            }
        });
        this.jTextField3.setFont(new Font("Tahoma", 0, 14));
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bnaret.this.jTextField3ActionPerformed(evt);
            }
        });
        this.jTextField2.setFont(new Font("Tahoma", 0, 14));
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bnaret.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jToggleButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/search-purple-dark-icon.png")));
        this.jToggleButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bnaret.this.jToggleButton1ActionPerformed(evt);
            }
        });
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/agt-imprimer-icone-9151-48.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bnaret.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bnaret.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bnaret.this.jButton3ActionPerformed(evt);
            }
        });
        this.comantere.setFont(new Font("Tahoma", 0, 18));
        this.comantere.setForeground(new Color(204, 0, 0));
        this.comantere.setText(".........................................................");
        this.jLabel1.setText("date debut :");
        this.jLabel36.setText("date fin :");
        this.d.setText("..............");
        this.f.setText(".............");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel15).addComponent(this.jLabel11).addComponent(this.jLabel22).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jLabel36)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f).addComponent(this.d)))).addGap(39, 39, 39).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField3).addComponent(this.jTextField2, -2, 101, -2)).addGap(18, 18, 18).addComponent(this.jToggleButton1, -2, 57, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 66, -2)).addComponent(this.comantere).addComponent(this.jTextField4, -1, 390, 32767)).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton1, -2, 57, -2).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jTextField2, -2, 35, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField3, -2, 35, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel11).addGap(25, 25, 25).addComponent(this.jLabel15))).addComponent(this.jToggleButton1, -2, 59, -2).addComponent(this.jButton2, -2, 57, -2).addComponent(this.jButton3, -2, 57, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField4, -2, 35, -2).addComponent(this.jLabel22)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.comantere).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel36).addComponent(this.f)))).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, 596, -2).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jPanel1, -2, 571, -2))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -1, 406, 32767)));
    }

    private void jTextField7ActionPerformed(ActionEvent evt) {
    }

    private void jTextField11ActionPerformed(ActionEvent evt) {
    }

    private void jTextField4ActionPerformed(ActionEvent evt) {
    }

    private void jTextField3ActionPerformed(ActionEvent evt) {
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jToggleButton1ActionPerformed(ActionEvent evt) {
        block35 : {
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
                    Logger.getLogger(bnaret.class.getName()).log(Level.SEVERE, null, ex);
                }
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn3.createStatement();
                ResultSet result3 = state2.executeQuery("SELECT nbm FROM retretait  WHERE  mecano='" + this.jTextField2.getText() + "'");
                while (result3.next()) {
                    nbbb = result3.getString("nbm");
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(bnaret.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("nbbb = " + nbbb);
            if (nbbb.equals("null")) {
                nbbb = "0";
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
                        Logger.getLogger(bnaret.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state4 = conn2.createStatement();
                    ResultSet result5 = state4.executeQuery("SELECT datefin FROM retretait  WHERE  mecano='" + this.jTextField2.getText() + "'");
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
                    Logger.getLogger(bnaret.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    }
                    catch (ClassNotFoundException ex) {
                        Logger.getLogger(bnaret.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(bnaret.class.getName()).log(Level.SEVERE, null, ex);
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
                    break block35;
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
                    ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE  mecano='" + this.jTextField2.getText() + "'");
                    System.out.println("**************--------------------***********");
                    this.mecano.setText(this.jTextField2.getText());
                    while (result3.next()) {
                        this.nom.setText(result3.getString("nom"));
                        this.ccb.setText(result3.getString("rib"));
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

