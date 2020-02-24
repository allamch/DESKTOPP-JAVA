/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ajoutercarnetchequeadherent
extends JPanel {
    String ch = "";
    private JButton Quitter;
    private JComboBox bq;
    private JButton jButton1;
    private JButton jButton15;
    private JLabel jLabel1;
    private JLabel jLabel14;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel29;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel6;
    private JPanel jPanel16;
    private JSeparator jSeparator1;
    private JTextField mecano;
    private JTextField nbcarnet;
    private JTextField nbcheque;
    private JTextField nbchequesigne;
    private JTextField numdebut;
    private JLabel saisire;

    public ajoutercarnetchequeadherent() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.numdebut = new JTextField();
        this.nbcheque = new JTextField();
        this.jButton15 = new JButton();
        this.Quitter = new JButton();
        this.jLabel36 = new JLabel();
        this.bq = new JComboBox();
        this.jLabel6 = new JLabel();
        this.jLabel25 = new JLabel();
        this.nbcarnet = new JTextField();
        this.jLabel26 = new JLabel();
        this.jLabel29 = new JLabel();
        this.mecano = new JTextField();
        this.jButton1 = new JButton();
        this.jSeparator1 = new JSeparator();
        this.jLabel1 = new JLabel();
        this.saisire = new JLabel();
        this.jLabel37 = new JLabel();
        this.nbchequesigne = new JTextField();
        this.setLayout(new CardLayout());
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "Ajouter les cheques des adh\u00e9rents", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.numdebut.setFont(new Font("Tahoma", 0, 14));
        this.numdebut.setEnabled(false);
        this.numdebut.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetchequeadherent.this.numdebutActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.numdebut);
        this.numdebut.setBounds(170, 190, 160, 30);
        this.nbcheque.setFont(new Font("Tahoma", 0, 14));
        this.nbcheque.setEnabled(false);
        this.nbcheque.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetchequeadherent.this.nbchequeActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nbcheque);
        this.nbcheque.setBounds(490, 190, 160, 30);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Ajouter");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetchequeadherent.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(480, 280, 130, 40);
        this.Quitter.setFont(new Font("Tahoma", 1, 12));
        this.Quitter.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.Quitter.setText("Quitter");
        this.Quitter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetchequeadherent.this.QuitterActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.Quitter);
        this.Quitter.setBounds(360, 280, 110, 40);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setText("Nombre de cheque sign\u00e9 :");
        this.jPanel16.add(this.jLabel36);
        this.jLabel36.setBounds(20, 230, 190, 30);
        this.bq.setFont(new Font("Tahoma", 0, 24));
        this.bq.setForeground(new Color(255, 0, 0));
        this.bq.setModel(new DefaultComboBoxModel<String>(new String[]{"", "BT", "UIB", "STB", "BH", "BIAT", "BNA", "ATB", "BZ", "UBCI", "Attijari", "AMEN BANK", "Poste"}));
        this.bq.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetchequeadherent.this.bqActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.bq);
        this.bq.setBounds(550, 230, 90, 35);
        this.jLabel6.setFont(new Font("Tahoma", 1, 14));
        this.jLabel6.setText("Banque :");
        this.jPanel16.add(this.jLabel6);
        this.jLabel6.setBounds(450, 240, 90, 17);
        this.jLabel25.setBackground(new Color(153, 153, 255));
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setText("Nombre de carnet :");
        this.jPanel16.add(this.jLabel25);
        this.jLabel25.setBounds(230, 40, 140, 20);
        this.nbcarnet.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.nbcarnet);
        this.nbcarnet.setBounds(380, 40, 90, 30);
        this.jLabel26.setBackground(new Color(153, 153, 255));
        this.jLabel26.setFont(new Font("Tahoma", 1, 14));
        this.jLabel26.setText("N\u00b0 cheque Debut :");
        this.jPanel16.add(this.jLabel26);
        this.jLabel26.setBounds(20, 190, 140, 20);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setText("Mecano :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(10, 40, 90, 20);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(100, 40, 120, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton1.setText("Valider");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetchequeadherent.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(510, 30, 110, 40);
        this.jPanel16.add(this.jSeparator1);
        this.jSeparator1.setBounds(10, 130, 630, 10);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setForeground(new Color(0, 0, 204));
        this.jLabel1.setText("Nom adherent : ");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(20, 80, 600, 30);
        this.saisire.setFont(new Font("Tahoma", 1, 18));
        this.saisire.setText("Saisire les donnes de carnet N\u00b0 :");
        this.jPanel16.add(this.saisire);
        this.saisire.setBounds(160, 140, 310, 22);
        this.jLabel37.setBackground(new Color(153, 153, 255));
        this.jLabel37.setFont(new Font("Tahoma", 1, 14));
        this.jLabel37.setText("Nombre de cheque :");
        this.jPanel16.add(this.jLabel37);
        this.jLabel37.setBounds(340, 190, 160, 30);
        this.nbchequesigne.setFont(new Font("Tahoma", 0, 14));
        this.nbchequesigne.setEnabled(false);
        this.nbchequesigne.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetchequeadherent.this.nbchequesigneActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nbchequesigne);
        this.nbchequesigne.setBounds(220, 230, 160, 30);
        this.add((Component)this.jPanel16, "card2");
        this.getAccessibleContext().setAccessibleName("BULETIN D'ADHESION");
    }

    private void numdebutActionPerformed(ActionEvent evt) {
    }

    private void nbchequeActionPerformed(ActionEvent evt) {
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        boolean g;
        String banque = (String)this.bq.getSelectedItem();
        int nb = Integer.parseInt(this.nbcarnet.getText());
        boolean bl = g = this.numdebut.getText().equals("") || this.nbcheque.getText().equals("") || this.nbchequesigne.getText().equals("") || banque.equals("");
        if (g) {
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                boolean b = true;
                String p = "0";
                String pp = "1";
                state.executeUpdate("INSERT INTO chequeadherent(`mecano`, `ncheque`, ` nbcheque`, ` nbchequesigne`, `ban`, `nbcarnet`, `type`) VALUES('" + this.mecano.getText() + "','" + this.numdebut.getText() + "','" + this.nbcheque.getText() + "','" + this.nbchequesigne.getText() + "','" + banque + "','" + nb + "','" + this.ch + "')");
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Succes d'ajouter : N\u00b0 carnet= " + nb, "Information", 1);
                this.numdebut.setText("");
                this.nbcheque.setText("");
                this.nbchequesigne.setText("");
                if (--nb > 0) {
                    jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Il faut ajouter le carnet  : N\u00b0 carnet= " + nb, "Information", 1);
                    this.saisire.setText("Saisire les donnes de carnet N\u00b0 :" + nb);
                    this.nbcarnet.setText("" + nb);
                } else {
                    this.mecano.setText("");
                    this.nbcarnet.setText("");
                    this.jLabel1.setText("");
                    this.saisire.setText("");
                }
            }
            catch (Exception e) {
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout :N\u00b0 carnet deja existe " + e.getMessage());
            }
        }
    }

    private void QuitterActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void bqActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean g;
        int nb = Integer.parseInt(this.nbcarnet.getText());
        int k = 1;
        boolean bl = g = this.mecano.getText().equals("") || this.nbcarnet.getText().equals("");
        if (g) {
            k = 0;
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        } else {
            k = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                ResultSet result = state.executeQuery("SELECT *  FROM  adherent WHERE MECANO=" + this.mecano.getText());
                ResultSetMetaData resultMeta = result.getMetaData();
                while (result.next()) {
                    ++k;
                    this.ch = "S";
                    this.jLabel1.setText("Nom adherent : " + result.getString("NOM"));
                    this.saisire.setText("Saisire les donnes de carnet N\u00b0 :" + nb);
                }
                if (k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state2 = conn22.createStatement();
                        ResultSet result2 = state2.executeQuery("SELECT *  FROM  retretait WHERE mecano=" + this.mecano.getText());
                        while (result2.next()) {
                            ++k;
                            this.ch = "R";
                            this.jLabel1.setText("Nom adherent : " + result2.getString("nom"));
                            this.saisire.setText("Saisire les donnes de carnet N\u00b0 :" + nb);
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                    }
                }
                if (k == 0) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Adherent n'existe pas !!");
                    this.jButton15.setVisible(false);
                } else {
                    this.numdebut.enable(true);
                    this.nbcheque.enable(true);
                    this.nbchequesigne.enable(true);
                    this.jButton15.setVisible(true);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
        }
    }

    private void nbchequesigneActionPerformed(ActionEvent evt) {
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(img.getWidth(this), img.getHeight(this), 4);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

}

