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

public class uibbret
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
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JSeparator jSeparator2;
    private JTextField jTextField1;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    private JToggleButton jToggleButton1;
    private JLabel mecano;
    private JLabel nom;

    public uibbret() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jLabel11 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel25 = new JLabel();
        this.jTextField11 = new JTextField();
        this.jTextField3 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jToggleButton1 = new JToggleButton();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jLabel26 = new JLabel();
        this.d = new JLabel();
        this.jLabel28 = new JLabel();
        this.f = new JLabel();
        this.comantere = new JLabel();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.mecano = new JLabel();
        this.jLabel21 = new JLabel();
        this.jTextField4 = new JTextField();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.nom = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jTextField5 = new JTextField();
        this.jTextField6 = new JTextField();
        this.jTextField7 = new JTextField();
        this.jTextField8 = new JTextField();
        this.jTextField9 = new JTextField();
        this.jLabel22 = new JLabel();
        this.jLabel23 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jTextField10 = new JTextField();
        this.ccb = new JLabel();
        this.jLabel29 = new JLabel();
        this.jPanel2.setBackground(new Color(204, 204, 204));
        this.jLabel11.setFont(new Font("Tahoma", 0, 18));
        this.jLabel11.setForeground(new Color(0, 0, 255));
        this.jLabel11.setText("Numero Dossier");
        this.jLabel15.setFont(new Font("Tahoma", 0, 18));
        this.jLabel15.setForeground(new Color(0, 0, 255));
        this.jLabel15.setText("Nombre de virment");
        this.jLabel25.setFont(new Font("Tahoma", 0, 18));
        this.jLabel25.setForeground(new Color(0, 0, 255));
        this.jLabel25.setText("Numero de compte");
        this.jTextField11.setFont(new Font("Tahoma", 0, 24));
        this.jTextField11.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jTextField11ActionPerformed(evt);
            }
        });
        this.jTextField3.setFont(new Font("Tahoma", 0, 14));
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jTextField3ActionPerformed(evt);
            }
        });
        this.jTextField2.setFont(new Font("Tahoma", 0, 14));
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jToggleButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/search-purple-dark-icon.png")));
        this.jToggleButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jToggleButton1ActionPerformed(evt);
            }
        });
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/agt-imprimer-icone-9151-48.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jButton3ActionPerformed(evt);
            }
        });
        this.jLabel26.setText("date debut :");
        this.d.setText("........");
        this.jLabel28.setText("date fin :");
        this.f.setText("........");
        this.comantere.setFont(new Font("Tahoma", 0, 18));
        this.comantere.setForeground(new Color(204, 0, 0));
        this.comantere.setText(".........................................................");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel15).addComponent(this.jLabel11).addComponent(this.jLabel25)).addGap(39, 39, 39).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField3).addComponent(this.jTextField2, -2, 101, -2)).addGap(18, 18, 18).addComponent(this.jToggleButton1, -2, 57, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 65, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 66, -2)).addComponent(this.jTextField11))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel26).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel28).addGap(18, 18, 18).addComponent(this.f))).addGap(76, 76, 76).addComponent(this.comantere))).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton1, -2, 57, -2).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jTextField2, -2, 35, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField3, -2, 35, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel11).addGap(25, 25, 25).addComponent(this.jLabel15))).addComponent(this.jToggleButton1, -2, 59, -2).addComponent(this.jButton2, -2, 57, -2).addComponent(this.jButton3, -2, 57, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField11, -2, 35, -2).addComponent(this.jLabel25)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.comantere).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel26).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f)).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, -2).addComponent(this.jLabel28)))).addContainerGap()));
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jLabel1.setText("Union Internationale ");
        this.jLabel2.setText("de Banques");
        this.jLabel3.setFont(new Font("Tahoma", 0, 24));
        this.jLabel3.setText("ORDRE DE VIREMENT EN DINARS ");
        this.jLabel5.setFont(new Font("Arial", 0, 10));
        this.jLabel5.setText("\u0631\u0642\u0645 \u0627\u0644\u062d\u0633\u0627\u0628 \u0627\u0644\u0645\u062e\u0635\u0648\u0645 \u0645\u0646\u0647");
        this.jLabel6.setFont(new Font("Tahoma", 0, 10));
        this.jLabel6.setText("Numero de compte a debiter :");
        this.mecano.setText("......");
        this.jLabel21.setText("Virment simple");
        this.jTextField4.setText("   X");
        this.jLabel7.setFont(new Font("Arial", 0, 10));
        this.jLabel7.setText("\u0627\u0644\u0627\u0645\u0631 \u0628\u0639\u0645\u0644\u064a\u0629 \u0627\u0644\u062a\u062d\u0648\u064a\u0644");
        this.jLabel8.setFont(new Font("Tahoma", 0, 10));
        this.jLabel8.setText("donneur d'ordre :");
        this.nom.setFont(new Font("Tahoma", 1, 18));
        this.nom.setText(".................................................");
        this.jLabel9.setFont(new Font("Tahoma", 0, 10));
        this.jLabel9.setText("veuillez virer la somme de :");
        this.jLabel10.setFont(new Font("Arial", 0, 10));
        this.jLabel10.setText("\u0627\u0644\u0631\u062c\u0627\u0621 \u062a\u062d\u0648\u064a\u0644 \u0645\u0628\u0644\u063a");
        this.jLabel13.setFont(new Font("Arial", 0, 12));
        this.jLabel13.setText("\u0644\u0641\u0627\u0626\u062f\u0629");
        this.jLabel14.setFont(new Font("Tahoma", 0, 10));
        this.jLabel14.setText("en faveur  de :");
        this.jLabel16.setFont(new Font("Tahoma", 1, 18));
        this.jLabel16.setText("CENTRE SOCIAL  MAHDIA");
        this.jLabel17.setFont(new Font("Arial", 0, 12));
        this.jLabel17.setText("\u0643\u0634\u0641 \u0647\u0648\u064a\u0629 \u062d\u0633\u0627\u0628 \u0627\u0644\u0645\u0633\u062a\u0641\u064a\u062f");
        this.jLabel18.setFont(new Font("Tahoma", 0, 10));
        this.jLabel18.setText("RIB du b\u00e9n\u00e9ficiaire");
        this.jLabel19.setFont(new Font("Tahoma", 1, 18));
        this.jLabel19.setText("12  407   0000093001200 39 ");
        this.jTextField1.setText("             Date de l'operation");
        this.jTextField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jTextField7.setText("   Signature de l'ordonnateur");
        this.jTextField7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jTextField7ActionPerformed(evt);
            }
        });
        this.jTextField9.setText("Cachet et visa d\u00e9charge de l'UIB");
        this.jTextField9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                uibbret.this.jTextField9ActionPerformed(evt);
            }
        });
        this.jLabel23.setFont(new Font("Tahoma", 0, 10));
        this.jLabel23.setText("Montant en chifre :");
        this.jLabel24.setText("Virment Permanent");
        this.ccb.setFont(new Font("Tahoma", 1, 18));
        this.ccb.setText("...............................................");
        this.jLabel29.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/uibb.PNG")));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jSeparator2, -2, -1, -2).addGap(442, 442, 442)).addGroup(jPanel1Layout.createSequentialGroup().addGap(38, 38, 38).addComponent(this.jLabel22).addGap(267, 267, 267))).addGroup(jPanel1Layout.createSequentialGroup().addGap(219, 219, 219).addComponent(this.jLabel21).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField4, -2, 35, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(37, 37, 37).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel5)).addComponent(this.jLabel6).addGroup(jPanel1Layout.createSequentialGroup().addGap(16, 16, 16).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, -2).addComponent(this.jLabel10)).addComponent(this.jLabel8))).addGroup(jPanel1Layout.createSequentialGroup().addGap(27, 27, 27).addComponent(this.jLabel7)).addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44).addComponent(this.jLabel13)).addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jLabel14)).addComponent(this.jLabel17).addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel18)).addComponent(this.jLabel9)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(223, 223, 223).addComponent(this.jLabel24).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField10, -2, 24, -2)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel19).addComponent(this.jLabel16).addComponent(this.nom)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 75, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ccb, -1, 365, 32767))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel23).addGap(86, 86, 86)))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField1, -2, 173, -2).addComponent(this.jTextField5, -2, 177, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField6, -2, 160, -2).addComponent(this.jTextField7, -2, 156, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField9, -1, 180, 32767).addComponent(this.jTextField8, -1, 180, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel2).addGap(40, 40, 40).addComponent(this.jLabel3)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel1).addGap(207, 207, 207).addComponent(this.mecano))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel29))).addGap(25, 25, 25)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel22).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.mecano)).addGap(7, 7, 7).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.jLabel2))).addComponent(this.jLabel29)).addGap(10, 10, 10).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel21).addComponent(this.jTextField4, -2, 20, -2).addComponent(this.jTextField10, -2, 20, -2).addComponent(this.jLabel24)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel5, -2, 16, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel6)).addComponent(this.ccb, -2, 25, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel7, -2, 16, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel8).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel10, -2, 16, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel9).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel13, -2, 16, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel14).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel17, -2, 16, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel18)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.nom, -2, 25, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel23, -2, 15, -2).addGap(34, 34, 34).addComponent(this.jLabel16, -2, 24, -2).addGap(18, 18, 18).addComponent(this.jLabel19, -2, 23, -2))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jTextField9, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField8)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jTextField1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField5)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jTextField7, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField6, -2, 72, -2))).addGap(8, 8, 8).addComponent(this.jSeparator2, -2, 10, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, 591, -2).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jPanel1, -2, -1, -2))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -2, 425, -2).addContainerGap(-1, 32767)));
    }

    private void jTextField11ActionPerformed(ActionEvent evt) {
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
                    state3.executeUpdate("UPDATE retretait SET datedebut='" + datd + "' WHERE mecano=" + this.jTextField2.getText());
                    state3.executeUpdate("UPDATE retretait SET datefin='" + jj + "' WHERE mecano=" + this.jTextField2.getText());
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
                    ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE  mecano='" + this.jTextField2.getText() + "'");
                    System.out.println("**************--------------------***********");
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
                state.executeUpdate("UPDATE retretait SET rib='" + this.jTextField11.getText() + "' WHERE mecano=" + this.jTextField2.getText());
                this.ccb.setText(this.jTextField11.getText());
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

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField7ActionPerformed(ActionEvent evt) {
    }

    private void jTextField9ActionPerformed(ActionEvent evt) {
    }

}

