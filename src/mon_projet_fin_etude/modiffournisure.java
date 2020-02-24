/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
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
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class modiffournisure
extends JPanel {
    String ch = "";
    private JTextArea adresc;
    private JTextArea adressep;
    private JComboBox banque;
    private JLabel banquea;
    private JTextField cinn;
    private JButton jButton14;
    private JButton jButton19;
    private JComboBox jComboBox3;
    private JLabel jLabel12;
    private JLabel jLabel14;
    private JLabel jLabel18;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel23;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel34;
    private JPanel jPanel16;
    private JPanel jPanel17;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JTextField jTextField1;
    private JTextField matt;
    private JTextField nbmois;
    private JTextField nomgerant;
    private JTextField nomsociete;
    private JTextField rem;
    private JTextField rib;
    private JTextField telc;
    private JTextField telp;

    public modiffournisure() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel17 = new JPanel();
        this.jComboBox3 = new JComboBox();
        this.jLabel12 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jButton14 = new JButton();
        this.jSeparator3 = new JSeparator();
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel23 = new JLabel();
        this.rib = new JTextField();
        this.jLabel26 = new JLabel();
        this.nomgerant = new JTextField();
        this.matt = new JTextField();
        this.jLabel28 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.jLabel29 = new JLabel();
        this.nomsociete = new JTextField();
        this.jLabel21 = new JLabel();
        this.jLabel30 = new JLabel();
        this.telp = new JTextField();
        this.cinn = new JTextField();
        this.jSeparator1 = new JSeparator();
        this.banque = new JComboBox();
        this.jScrollPane2 = new JScrollPane();
        this.adressep = new JTextArea();
        this.jLabel34 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.adresc = new JTextArea();
        this.jLabel31 = new JLabel();
        this.telc = new JTextField();
        this.jButton19 = new JButton();
        this.banquea = new JLabel();
        this.jLabel27 = new JLabel();
        this.rem = new JTextField();
        this.jLabel32 = new JLabel();
        this.nbmois = new JTextField();
        this.jPanel17.setLayout(null);
        this.jComboBox3.setFont(new Font("Tahoma", 0, 14));
        this.jComboBox3.setForeground(new Color(0, 102, 255));
        this.jComboBox3.setModel(new DefaultComboBoxModel<String>(new String[]{"Matricule", "N cin"}));
        this.jPanel17.add(this.jComboBox3);
        this.jComboBox3.setBounds(281, 11, 96, 46);
        this.jLabel12.setFont(new Font("Tahoma", 1, 18));
        this.jLabel12.setText("Recherche par :");
        this.jPanel17.add(this.jLabel12);
        this.jLabel12.setBounds(107, 20, 145, 27);
        this.jPanel17.add(this.jTextField1);
        this.jTextField1.setBounds(441, 15, 133, 43);
        this.jButton14.setFont(new Font("Tahoma", 1, 12));
        this.jButton14.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton14.setToolTipText("Recherche");
        this.jButton14.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                modiffournisure.this.jButton14MouseClicked(evt);
            }
        });
        this.jButton14.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiffournisure.this.jButton14ActionPerformed(evt);
            }
        });
        this.jPanel17.add(this.jButton14);
        this.jButton14.setBounds(612, 16, 88, 38);
        this.jPanel17.add(this.jSeparator3);
        this.jSeparator3.setBounds(0, 72, 803, 2);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "Modifier fournisseur", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel20.setBackground(new Color(153, 153, 255));
        this.jLabel20.setFont(new Font("Tahoma", 1, 14));
        this.jLabel20.setText("Adresse Personnelle :");
        this.jPanel16.add(this.jLabel20);
        this.jLabel20.setBounds(10, 280, 160, 20);
        this.jLabel23.setFont(new Font("Tahoma", 1, 14));
        this.jLabel23.setText("Nom societe :");
        this.jPanel16.add(this.jLabel23);
        this.jLabel23.setBounds(10, 190, 140, 17);
        this.rib.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.rib);
        this.rib.setBounds(260, 20, 290, 40);
        this.jLabel26.setBackground(new Color(153, 153, 255));
        this.jLabel26.setFont(new Font("Tahoma", 1, 14));
        this.jLabel26.setText("Remise  % :");
        this.jPanel16.add(this.jLabel26);
        this.jLabel26.setBounds(10, 330, 90, 30);
        this.nomgerant.setFont(new Font("Tahoma", 0, 14));
        this.nomgerant.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiffournisure.this.nomgerantActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomgerant);
        this.nomgerant.setBounds(290, 140, 410, 30);
        this.matt.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.matt);
        this.matt.setBounds(90, 30, 110, 30);
        this.jLabel28.setBackground(new Color(153, 153, 255));
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setForeground(new Color(0, 0, 255));
        this.jLabel28.setText("Matricule :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(10, 40, 71, 17);
        this.jLabel18.setFont(new Font("Tahoma", 1, 18));
        this.jLabel18.setForeground(new Color(0, 0, 255));
        this.jLabel18.setText("RIB:");
        this.jPanel16.add(this.jLabel18);
        this.jLabel18.setBounds(210, 30, 50, 22);
        this.jPanel16.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 110, 760, 10);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("Banque :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(560, 30, 70, 20);
        this.nomsociete.setFont(new Font("Tahoma", 0, 14));
        this.nomsociete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiffournisure.this.nomsocieteActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomsociete);
        this.nomsociete.setBounds(290, 180, 410, 30);
        this.jLabel21.setBackground(new Color(153, 153, 255));
        this.jLabel21.setFont(new Font("Tahoma", 1, 14));
        this.jLabel21.setText("Adresse Commerce :");
        this.jPanel16.add(this.jLabel21);
        this.jLabel21.setBounds(10, 230, 160, 20);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setText("N\u00b0 Tel  P :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(500, 280, 80, 20);
        this.telp.setFont(new Font("Tahoma", 0, 14));
        this.telp.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiffournisure.this.telpActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.telp);
        this.telp.setBounds(590, 270, 160, 30);
        this.cinn.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.cinn);
        this.cinn.setBounds(260, 70, 290, 30);
        this.jPanel16.add(this.jSeparator1);
        this.jSeparator1.setBounds(0, 320, 760, 10);
        this.banque.setFont(new Font("Tahoma", 0, 18));
        this.banque.setModel(new DefaultComboBoxModel<String>(new String[]{"aucune", "BT", "BNA", "UIB", "BH", "ATB", "STB"}));
        this.banque.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiffournisure.this.banqueActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.banque);
        this.banque.setBounds(630, 60, 90, 30);
        this.adressep.setColumns(20);
        this.adressep.setRows(5);
        this.jScrollPane2.setViewportView(this.adressep);
        this.jPanel16.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(170, 270, 320, 40);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText(" C.I.N :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(200, 70, 60, 30);
        this.adresc.setColumns(20);
        this.adresc.setRows(5);
        this.jScrollPane1.setViewportView(this.adresc);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(170, 220, 320, 40);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setText("N\u00b0 Tel  C :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(500, 230, 80, 20);
        this.telc.setFont(new Font("Tahoma", 0, 14));
        this.telc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiffournisure.this.telcActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.telc);
        this.telc.setBounds(590, 220, 160, 30);
        this.jButton19.setFont(new Font("Tahoma", 1, 12));
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton19.setText("Valider");
        this.jButton19.setToolTipText("Modifier");
        this.jButton19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiffournisure.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton19);
        this.jButton19.setBounds(610, 330, 110, 40);
        this.banquea.setFont(new Font("Tahoma", 1, 14));
        this.jPanel16.add(this.banquea);
        this.banquea.setBounds(640, 20, 80, 30);
        this.jLabel27.setBackground(new Color(153, 153, 255));
        this.jLabel27.setFont(new Font("Tahoma", 1, 14));
        this.jLabel27.setText("Nom et Prenom de Gerant :");
        this.jPanel16.add(this.jLabel27);
        this.jLabel27.setBounds(10, 150, 230, 20);
        this.rem.setFont(new Font("Tahoma", 0, 14));
        this.rem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiffournisure.this.remActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.rem);
        this.rem.setBounds(110, 330, 80, 30);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setText("Nombre de mois Max :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(240, 330, 160, 30);
        this.nbmois.setFont(new Font("Tahoma", 0, 14));
        this.nbmois.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiffournisure.this.nbmoisActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nbmois);
        this.nbmois.setBounds(410, 330, 130, 30);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel16, -2, 766, -2)).addComponent(this.jPanel17, -2, 740, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jPanel17, -2, 83, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jPanel16, -2, 386, -2).addContainerGap()));
    }

    private void jButton14ActionPerformed(ActionEvent evt) {
        block19 : {
            if (this.jComboBox3.getSelectedItem().equals("N cin")) {
                int cin = Integer.parseInt(this.jTextField1.getText());
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT MATRIC  FROM  ffournis WHERE CIN=" + cin);
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Fourinseure n'existe pas(recherche par N CIN)  ", "Information", 1);
                        break block19;
                    }
                    cin = Integer.parseInt(ch1);
                    ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM ffournis  WHERE CIN=" + this.jTextField1.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.matt.setText(result3.getString("MATRIC"));
                            this.rib.setText(result3.getString("rib"));
                            this.banquea.setText(result3.getString("banque"));
                            this.cinn.setText(result3.getString("CIN"));
                            this.cinn.setText(result3.getString("CIN"));
                            this.nomgerant.setText(result3.getString("NOM"));
                            this.nomsociete.setText(result3.getString("NOMSOC"));
                            this.adresc.setText(result3.getString("adresseCOM"));
                            this.adressep.setText(result3.getString("adresseDOM"));
                            this.telc.setText(result3.getString("TELCOM"));
                            this.telp.setText(result3.getString("TELDOM"));
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste de fourinissure " + e.getMessage());
                }
            } else if (this.jComboBox3.getSelectedItem().equals("Matricule")) {
                int cin = Integer.parseInt(this.jTextField1.getText());
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn3.createStatement();
                    ResultSet result = state.executeQuery("SELECT NOM  FROM  ffournis WHERE MATRIC=" + cin);
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Fourinseure n'existe pas(recherche par N CIN)  ", "Information", 1);
                        break block19;
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM ffournis  WHERE MATRIC=" + this.jTextField1.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.matt.setText(result3.getString("MATRIC"));
                            this.rib.setText(result3.getString("rib"));
                            this.banquea.setText(result3.getString("banque"));
                            this.cinn.setText(result3.getString("CIN"));
                            this.cinn.setText(result3.getString("CIN"));
                            this.nomgerant.setText(result3.getString("NOM"));
                            this.nomsociete.setText(result3.getString("NOMSOC"));
                            this.adresc.setText(result3.getString("adresseCOM"));
                            this.adressep.setText(result3.getString("adresseDOM"));
                            this.telc.setText(result3.getString("TELCOM"));
                            this.telp.setText(result3.getString("TELDOM"));
                            this.rem.setText(result3.getString("remise"));
                            this.nbmois.setText(result3.getString("nbmois"));
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste de fourinissure " + e.getMessage());
                }
            }
        }
    }

    private void jButton14MouseClicked(MouseEvent evt) {
    }

    private void jButton19ActionPerformed(ActionEvent evt) {
        String ch = "";
        if (this.banque.getSelectedItem().equals("BT")) {
            ch = "BT";
        } else if (this.banque.getSelectedItem().equals("BNA")) {
            ch = "BNA";
        } else if (this.banque.getSelectedItem().equals("UIB")) {
            ch = "UIB";
        } else if (this.banque.getSelectedItem().equals("BH")) {
            ch = "BH";
        } else if (this.banque.getSelectedItem().equals("ATB")) {
            ch = "ATB";
        } else if (this.banque.getSelectedItem().equals("aucune")) {
            ch = "";
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            state.executeUpdate("UPDATE ffournis SET MATRIC='" + this.matt.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET rib='" + this.rib.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET banque='" + ch + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET CIN='" + this.cinn.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET NOM='" + this.nomgerant.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET NOMSOC='" + this.nomsociete.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET adresseCOM='" + this.adresc.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET adresseDOM='" + this.adressep.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET TELCOM='" + this.telc.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET TELDOM='" + this.telp.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET remise='" + this.rem.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE ffournis SET nbmois='" + this.nbmois.getText() + "' WHERE MATRIC='" + this.jTextField1.getText() + "'");
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Succes de modification  ", "Information", 1);
        }
        catch (Exception e) {
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur de modification  : " + e.getMessage());
        }
    }

    private void nomgerantActionPerformed(ActionEvent evt) {
    }

    private void nomsocieteActionPerformed(ActionEvent evt) {
    }

    private void telpActionPerformed(ActionEvent evt) {
    }

    private void banqueActionPerformed(ActionEvent evt) {
        String[] messageStrings = new String[]{"bt", "bna", "biat"};
    }

    private void telcActionPerformed(ActionEvent evt) {
    }

    private void remActionPerformed(ActionEvent evt) {
    }

    private void nbmoisActionPerformed(ActionEvent evt) {
    }

}

