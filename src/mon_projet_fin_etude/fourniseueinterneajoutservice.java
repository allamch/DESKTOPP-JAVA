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
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class fourniseueinterneajoutservice
extends JPanel {
    private JButton Quitter;
    private JTextField cb;
    private JButton jButton15;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JPanel jPanel1;
    private JTextField mat;
    private JTextField mec;
    private JTextField mont;

    public fourniseueinterneajoutservice() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel33 = new JLabel();
        this.mat = new JTextField();
        this.mont = new JTextField();
        this.jLabel34 = new JLabel();
        this.mec = new JTextField();
        this.jLabel35 = new JLabel();
        this.cb = new JTextField();
        this.jButton15 = new JButton();
        this.Quitter = new JButton();
        this.jLabel2 = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setForeground(new Color(51, 0, 204));
        this.jLabel1.setText("Demande d'un  Service : Fournisseur interne");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(133, 0, 424, 32);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("Matricule FR.I :");
        this.jPanel1.add(this.jLabel32);
        this.jLabel32.setBounds(310, 60, 120, 30);
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setForeground(new Color(0, 0, 255));
        this.jLabel33.setText("Montant :");
        this.jPanel1.add(this.jLabel33);
        this.jLabel33.setBounds(310, 100, 120, 30);
        this.mat.setFont(new Font("Tahoma", 0, 14));
        this.jPanel1.add(this.mat);
        this.mat.setBounds(420, 60, 250, 30);
        this.mont.setFont(new Font("Tahoma", 0, 14));
        this.jPanel1.add(this.mont);
        this.mont.setBounds(420, 100, 250, 30);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText("Mecano :");
        this.jPanel1.add(this.jLabel34);
        this.jLabel34.setBounds(20, 60, 62, 30);
        this.mec.setFont(new Font("Tahoma", 0, 14));
        this.jPanel1.add(this.mec);
        this.mec.setBounds(100, 60, 180, 30);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setForeground(new Color(0, 0, 255));
        this.jLabel35.setText("Code banque :");
        this.jPanel1.add(this.jLabel35);
        this.jLabel35.setBounds(20, 100, 120, 30);
        this.cb.setFont(new Font("Tahoma", 0, 14));
        this.jPanel1.add(this.cb);
        this.cb.setBounds(130, 100, 90, 30);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Valider");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                fourniseueinterneajoutservice.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton15);
        this.jButton15.setBounds(430, 150, 110, 40);
        this.Quitter.setFont(new Font("Tahoma", 1, 12));
        this.Quitter.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.Quitter.setText("Quitter");
        this.Quitter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                fourniseueinterneajoutservice.this.QuitterActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.Quitter);
        this.Quitter.setBounds(550, 150, 110, 40);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/fornisseur/d.png")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(70, 70, 620, 490);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 688, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 541, 32767));
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        Date actuellEed = new Date();
        SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
        String datddd = dateFormattd.format(actuellEed);
        String dateS = datddd.substring(3, datddd.length());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            state.executeUpdate("INSERT INTO  bcfornisseurinterne(Matricule,mecano,Montant,datebc,codeb)VALUES('" + this.mat.getText() + "','" + this.mec.getText() + "','" + this.mont.getText() + "','" + dateS + "','" + this.cb.getText() + "')");
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Succes d'ajout demande d'un Service F.I ", "Information", 1);
            this.mat.setText("");
            this.mec.setText("");
            this.mont.setText("");
            this.cb.setText("");
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

}

