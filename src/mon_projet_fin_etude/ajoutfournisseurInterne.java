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

public class ajoutfournisseurInterne
extends JPanel {
    private JButton Quitter;
    private JComboBox banque;
    private JButton jButton15;
    private JLabel jLabel1;
    private JLabel jLabel14;
    private JLabel jLabel18;
    private JLabel jLabel21;
    private JLabel jLabel23;
    private JLabel jLabel29;
    private JLabel jLabel32;
    private JPanel jPanel16;
    private JSeparator jSeparator2;
    private JTextField matt;
    private JTextField nomsociete;
    private JTextField objet;
    private JTextField rib;

    public ajoutfournisseurInterne() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel23 = new JLabel();
        this.rib = new JTextField();
        this.matt = new JTextField();
        this.jLabel18 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.jLabel29 = new JLabel();
        this.nomsociete = new JTextField();
        this.jLabel21 = new JLabel();
        this.jButton15 = new JButton();
        this.Quitter = new JButton();
        this.banque = new JComboBox();
        this.objet = new JTextField();
        this.jLabel32 = new JLabel();
        this.jLabel1 = new JLabel();
        this.setLayout(new CardLayout());
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "Ajouter fournisseur Interne", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel23.setFont(new Font("Tahoma", 1, 14));
        this.jLabel23.setText("Nom Fornisseur Interne:");
        this.jPanel16.add(this.jLabel23);
        this.jLabel23.setBounds(10, 100, 180, 17);
        this.rib.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.rib);
        this.rib.setBounds(260, 30, 290, 40);
        this.matt.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.matt);
        this.matt.setBounds(90, 40, 100, 30);
        this.jLabel18.setFont(new Font("Tahoma", 1, 18));
        this.jLabel18.setForeground(new Color(0, 0, 255));
        this.jLabel18.setText("RIB:");
        this.jPanel16.add(this.jLabel18);
        this.jLabel18.setBounds(200, 40, 50, 22);
        this.jPanel16.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 80, 760, 10);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("Banque :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(560, 40, 70, 20);
        this.nomsociete.setFont(new Font("Tahoma", 0, 14));
        this.nomsociete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseurInterne.this.nomsocieteActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomsociete);
        this.nomsociete.setBounds(190, 90, 410, 40);
        this.jLabel21.setBackground(new Color(153, 153, 255));
        this.jLabel21.setFont(new Font("Tahoma", 1, 14));
        this.jLabel21.setText("objet :");
        this.jPanel16.add(this.jLabel21);
        this.jLabel21.setBounds(10, 150, 160, 20);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Valider");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseurInterne.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(630, 90, 110, 40);
        this.Quitter.setFont(new Font("Tahoma", 1, 12));
        this.Quitter.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.Quitter.setText("Quitter");
        this.Quitter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseurInterne.this.QuitterActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.Quitter);
        this.Quitter.setBounds(630, 140, 110, 40);
        this.banque.setFont(new Font("Tahoma", 0, 18));
        this.banque.setModel(new DefaultComboBoxModel<String>(new String[]{"aucune", "BT", "BNA", "UIB", "BH", "ATB", "STB"}));
        this.banque.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseurInterne.this.banqueActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.banque);
        this.banque.setBounds(630, 40, 90, 30);
        this.objet.setFont(new Font("Tahoma", 0, 14));
        this.objet.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseurInterne.this.objetActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.objet);
        this.objet.setBounds(190, 140, 410, 40);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("Matricule :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(10, 40, 71, 30);
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/fornisseur/gest.png")));
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(210, 180, 380, 320);
        this.add((Component)this.jPanel16, "card2");
        this.getAccessibleContext().setAccessibleName("BULETIN D'ADHESION");
    }

    private void nomsocieteActionPerformed(ActionEvent evt) {
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
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
        String mat = this.matt.getText();
        String noms = this.nomsociete.getText();
        String ribs = this.rib.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            state.executeUpdate("INSERT INTO fornisseurinternt(MATRIC,rib,banque,nomf,objet)VALUES('" + mat + "','" + ribs + "','" + ch + "','" + noms + "','" + this.objet.getText() + "')");
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Succes d'ajouter  F.I ", "Information", 1);
            this.matt.setText("");
            this.rib.setText("");
            this.nomsociete.setText("");
            this.objet.setText("");
        }
        catch (Exception e) {
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur d'ajout  : " + e.getMessage());
        }
    }

    private void QuitterActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(img.getWidth(this), img.getHeight(this), 4);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void banqueActionPerformed(ActionEvent evt) {
        String[] messageStrings = new String[]{"bt", "bna", "biat"};
    }

    private void objetActionPerformed(ActionEvent evt) {
    }

}

