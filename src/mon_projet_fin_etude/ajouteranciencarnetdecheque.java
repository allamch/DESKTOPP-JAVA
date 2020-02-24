/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  com.toedter.calendar.JDateChooser
 */
package mon_projet_fin_etude;

import com.toedter.calendar.JDateChooser;
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
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ajouteranciencarnetdecheque
extends JPanel {
    private JButton Quitter;
    private JComboBox bq;
    private JDateChooser daatdebut;
    private JDateChooser datefin;
    private JButton jButton15;
    private JLabel jLabel14;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel36;
    private JLabel jLabel6;
    private JPanel jPanel16;
    private JTextField numcarnet;
    private JTextField numdebut;
    private JTextField numfin;
    private JComboBox observ;

    public ajouteranciencarnetdecheque() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel24 = new JLabel();
        this.numdebut = new JTextField();
        this.numfin = new JTextField();
        this.jButton15 = new JButton();
        this.Quitter = new JButton();
        this.jLabel36 = new JLabel();
        this.bq = new JComboBox();
        this.jLabel6 = new JLabel();
        this.jLabel25 = new JLabel();
        this.numcarnet = new JTextField();
        this.jLabel26 = new JLabel();
        this.jLabel27 = new JLabel();
        this.datefin = new JDateChooser();
        this.daatdebut = new JDateChooser();
        this.observ = new JComboBox();
        this.jLabel28 = new JLabel();
        this.setLayout(new CardLayout());
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "Ajouter un ancien carnet de cheque", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel24.setBackground(new Color(153, 153, 255));
        this.jLabel24.setFont(new Font("Tahoma", 1, 14));
        this.jLabel24.setText("Date fin :");
        this.jPanel16.add(this.jLabel24);
        this.jLabel24.setBounds(360, 120, 90, 20);
        this.numdebut.setFont(new Font("Tahoma", 0, 14));
        this.numdebut.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouteranciencarnetdecheque.this.numdebutActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.numdebut);
        this.numdebut.setBounds(160, 80, 160, 30);
        this.numfin.setFont(new Font("Tahoma", 0, 14));
        this.numfin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouteranciencarnetdecheque.this.numfinActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.numfin);
        this.numfin.setBounds(160, 120, 160, 30);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Valider");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouteranciencarnetdecheque.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(410, 170, 110, 40);
        this.Quitter.setFont(new Font("Tahoma", 1, 12));
        this.Quitter.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.Quitter.setText("Quitter");
        this.Quitter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouteranciencarnetdecheque.this.QuitterActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.Quitter);
        this.Quitter.setBounds(530, 170, 110, 40);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setText("N\u00b0 Cheque Fin :");
        this.jPanel16.add(this.jLabel36);
        this.jLabel36.setBounds(10, 120, 110, 30);
        this.bq.setFont(new Font("Tahoma", 0, 24));
        this.bq.setForeground(new Color(255, 0, 0));
        this.bq.setModel(new DefaultComboBoxModel<String>(new String[]{"", "BT", "UIB", "STB", "BH", "BIAT", "BNA", "ATB", "BZ", "UBCI", "Attijari", "AMEN BANK", "Poste"}));
        this.bq.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouteranciencarnetdecheque.this.bqActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.bq);
        this.bq.setBounds(490, 40, 150, 35);
        this.jLabel6.setFont(new Font("Tahoma", 0, 18));
        this.jLabel6.setForeground(new Color(0, 153, 255));
        this.jLabel6.setText("Banque :");
        this.jPanel16.add(this.jLabel6);
        this.jLabel6.setBounds(360, 40, 90, 22);
        this.jLabel25.setBackground(new Color(153, 153, 255));
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setText("N\u00b0 carnet :");
        this.jPanel16.add(this.jLabel25);
        this.jLabel25.setBounds(10, 50, 140, 20);
        this.numcarnet.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.numcarnet);
        this.numcarnet.setBounds(160, 40, 120, 30);
        this.jLabel26.setBackground(new Color(153, 153, 255));
        this.jLabel26.setFont(new Font("Tahoma", 1, 14));
        this.jLabel26.setText("N\u00b0 cheque Debut :");
        this.jPanel16.add(this.jLabel26);
        this.jLabel26.setBounds(10, 90, 140, 20);
        this.jLabel27.setBackground(new Color(153, 153, 255));
        this.jLabel27.setFont(new Font("Tahoma", 1, 14));
        this.jLabel27.setText("Date debut :");
        this.jPanel16.add(this.jLabel27);
        this.jLabel27.setBounds(360, 80, 100, 20);
        this.jPanel16.add((Component)this.datefin);
        this.datefin.setBounds(490, 120, 150, 30);
        this.jPanel16.add((Component)this.daatdebut);
        this.daatdebut.setBounds(490, 80, 150, 30);
        this.observ.setFont(new Font("Tahoma", 0, 24));
        this.observ.setForeground(new Color(255, 0, 0));
        this.observ.setModel(new DefaultComboBoxModel<String>(new String[]{"................", "Pr\u00e9ts Personnels", "Pr\u00e9ts Ouvries", "Pr\u00e9ts FDD", "Pr\u00e9ts Retrait\u00e9", "Primes Scolaires", "Prime", "Fournisseurs", "Gestion de centre", "Banque UIB", "Banque BH", "Banque BNA", "Banque BIAT"}));
        this.observ.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouteranciencarnetdecheque.this.observActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.observ);
        this.observ.setBounds(120, 160, 220, 35);
        this.jLabel28.setBackground(new Color(153, 153, 255));
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setText("Observation :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(10, 170, 100, 20);
        this.add((Component)this.jPanel16, "card2");
        this.getAccessibleContext().setAccessibleName("BULETIN D'ADHESION");
    }

    private void numdebutActionPerformed(ActionEvent evt) {
    }

    private void numfinActionPerformed(ActionEvent evt) {
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        boolean g;
        boolean k = true;
        boolean bl = g = this.numdebut.getText().equals("") || this.numfin.getText().equals("") || this.numcarnet.getText().equals("");
        if (g) {
            k = false;
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        }
        if (k) {
            JOptionPane jop1;
            String observation = (String)this.observ.getSelectedItem();
            String banque = (String)this.bq.getSelectedItem();
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
            String dat1 = "";
            String dat2 = "";
            Date d1 = this.daatdebut.getDate();
            try {
                dat1 = f.format(d1);
            }
            catch (Exception e) {
                JOptionPane jop12 = new JOptionPane();
            }
            Date d2 = this.datefin.getDate();
            try {
                dat2 = f.format(d2);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
            }
            System.out.println("dat 1" + dat1);
            System.out.println("dat 2" + dat2);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                String pp = "1";
                state.executeUpdate("INSERT INTO comptecourant(num,debut,fin,datedebut,datefin,observation,f,ff,banque) VALUES('" + this.numcarnet.getText() + "','" + this.numdebut.getText() + "','" + this.numfin.getText() + "','" + dat1 + "','" + dat2 + "','" + observation + "','" + pp + "','" + pp + "','" + banque + "')");
                JOptionPane jop13 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Succes d'ajouter : N\u00b0 carnet= " + this.numcarnet.getText(), "Information", 1);
                this.numdebut.setText("");
                this.numfin.setText("");
                this.numcarnet.setText("");
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
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

    private void observActionPerformed(ActionEvent evt) {
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(img.getWidth(this), img.getHeight(this), 4);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

}

