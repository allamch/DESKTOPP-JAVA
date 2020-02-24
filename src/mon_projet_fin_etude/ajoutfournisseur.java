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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ajoutfournisseur
extends JPanel {
    private JButton Quitter;
    private JTextArea adresc;
    private JTextArea adressep;
    private JComboBox banque;
    private JTextField cinn;
    private JButton jButton15;
    private JLabel jLabel14;
    private JLabel jLabel18;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel23;
    private JLabel jLabel26;
    private JLabel jLabel29;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel34;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTextField matt;
    private JTextField nomgerant;
    private JTextField nomsociete;
    private JTextField rib;
    private JTextField telc;
    private JTextField telp;

    public ajoutfournisseur() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel23 = new JLabel();
        this.rib = new JTextField();
        this.jLabel26 = new JLabel();
        this.nomgerant = new JTextField();
        this.matt = new JTextField();
        this.jLabel18 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.jLabel29 = new JLabel();
        this.nomsociete = new JTextField();
        this.jLabel21 = new JLabel();
        this.jLabel30 = new JLabel();
        this.telp = new JTextField();
        this.jButton15 = new JButton();
        this.Quitter = new JButton();
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
        this.jLabel32 = new JLabel();
        this.setLayout(new CardLayout());
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "Ajouter fournisseur", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel20.setBackground(new Color(153, 153, 255));
        this.jLabel20.setFont(new Font("Tahoma", 1, 14));
        this.jLabel20.setText("Adresse Personnelle :");
        this.jPanel16.add(this.jLabel20);
        this.jLabel20.setBounds(20, 320, 160, 20);
        this.jLabel23.setFont(new Font("Tahoma", 1, 14));
        this.jLabel23.setText("Nom societe :");
        this.jPanel16.add(this.jLabel23);
        this.jLabel23.setBounds(20, 230, 140, 17);
        this.rib.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.rib);
        this.rib.setBounds(260, 70, 290, 40);
        this.jLabel26.setBackground(new Color(153, 153, 255));
        this.jLabel26.setFont(new Font("Tahoma", 1, 14));
        this.jLabel26.setText("Nom et Prenom de Gerant :");
        this.jPanel16.add(this.jLabel26);
        this.jLabel26.setBounds(20, 190, 230, 20);
        this.nomgerant.setFont(new Font("Tahoma", 0, 14));
        this.nomgerant.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseur.this.nomgerantActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomgerant);
        this.nomgerant.setBounds(300, 180, 410, 30);
        this.matt.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.matt);
        this.matt.setBounds(90, 70, 100, 30);
        this.jLabel18.setFont(new Font("Tahoma", 1, 18));
        this.jLabel18.setForeground(new Color(0, 0, 255));
        this.jLabel18.setText("RIB:");
        this.jPanel16.add(this.jLabel18);
        this.jLabel18.setBounds(200, 80, 50, 22);
        this.jPanel16.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 160, 760, 10);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("Banque :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(560, 80, 70, 20);
        this.nomsociete.setFont(new Font("Tahoma", 0, 14));
        this.nomsociete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseur.this.nomsocieteActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomsociete);
        this.nomsociete.setBounds(300, 220, 410, 30);
        this.jLabel21.setBackground(new Color(153, 153, 255));
        this.jLabel21.setFont(new Font("Tahoma", 1, 14));
        this.jLabel21.setText("Adresse Commerce :");
        this.jPanel16.add(this.jLabel21);
        this.jLabel21.setBounds(20, 270, 160, 20);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setText("N\u00b0 Tel  P :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(510, 320, 80, 20);
        this.telp.setFont(new Font("Tahoma", 0, 14));
        this.telp.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseur.this.telpActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.telp);
        this.telp.setBounds(600, 320, 160, 30);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Valider");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseur.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(650, 370, 110, 40);
        this.Quitter.setFont(new Font("Tahoma", 1, 12));
        this.Quitter.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.Quitter.setText("Quitter");
        this.Quitter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseur.this.QuitterActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.Quitter);
        this.Quitter.setBounds(530, 370, 110, 40);
        this.cinn.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.cinn);
        this.cinn.setBounds(260, 120, 290, 30);
        this.jPanel16.add(this.jSeparator1);
        this.jSeparator1.setBounds(0, 360, 760, 10);
        this.banque.setFont(new Font("Tahoma", 0, 18));
        this.banque.setModel(new DefaultComboBoxModel<String>(new String[]{"aucune", "BT", "BNA", "UIB", "BH", "ATB", "STB"}));
        this.banque.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseur.this.banqueActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.banque);
        this.banque.setBounds(630, 80, 90, 30);
        this.adressep.setColumns(20);
        this.adressep.setRows(5);
        this.jScrollPane2.setViewportView(this.adressep);
        this.jPanel16.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(180, 310, 320, 40);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText(" C.I.N :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(200, 120, 50, 20);
        this.adresc.setColumns(20);
        this.adresc.setRows(5);
        this.jScrollPane1.setViewportView(this.adresc);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(180, 260, 320, 40);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setText("N\u00b0 Tel  C :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(510, 270, 80, 20);
        this.telc.setFont(new Font("Tahoma", 0, 14));
        this.telc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutfournisseur.this.telcActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.telc);
        this.telc.setBounds(600, 260, 160, 30);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("Matricule :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(10, 67, 71, 30);
        this.add((Component)this.jPanel16, "card2");
        this.getAccessibleContext().setAccessibleName("BULETIN D'ADHESION");
    }

    private void nomgerantActionPerformed(ActionEvent evt) {
    }

    private void nomsocieteActionPerformed(ActionEvent evt) {
    }

    private void telpActionPerformed(ActionEvent evt) {
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
        String cin = this.cinn.getText();
        String nomg = this.nomgerant.getText();
        String noms = this.nomsociete.getText();
        String ntelp = this.telp.getText();
        String adressp = this.adressep.getText();
        String ntelc = this.telc.getText();
        String adressc = this.adresc.getText();
        String ribs = this.rib.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            state.executeUpdate("INSERT INTO ffournis(MATRIC,CIN,NOM,NOMSOC,TELDOM,adresseDOM,TELCOM,adresseCOM,rib,banque) VALUES('" + mat + "','" + cin + "','" + nomg + "','" + noms + "','" + ntelp + "','" + adressp + "','" + ntelc + "','" + adressc + "','" + ribs + "','" + ch + "')");
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Succes d'ajouter   ", "Information", 1);
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

    private void telcActionPerformed(ActionEvent evt) {
    }

}

