/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  com.mysql.jdbc.Connection
 *  com.mysql.jdbc.Statement
 */
package mon_projet_fin_etude;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import mon_projet_fin_etude.recherchecarnedecheque;
import mon_projet_fin_etude.suppbcvalider;

public class suppbc
extends JPanel {
    private JTextField a;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextField mat;
    private JTextField mec;
    private JTextField num;
    private JTextArea rai;

    public suppbc() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.mec = new JTextField();
        this.mat = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.num = new JTextField();
        this.jLabel5 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.rai = new JTextArea();
        this.jButton1 = new JButton();
        this.a = new JTextField();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tempus Sans ITC", 1, 36));
        this.jLabel1.setForeground(new Color(153, 0, 153));
        this.jLabel1.setText("suppression de bande commande ");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(97, 0, 580, 43);
        this.jLabel2.setFont(new Font("SimHei", 2, 18));
        this.jLabel2.setForeground(new Color(153, 0, 153));
        this.jLabel2.setText("Mat fournisseur : ");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(270, 80, 162, 21);
        this.mec.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppbc.this.mecActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mec);
        this.mec.setBounds(95, 72, 150, 30);
        this.mat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppbc.this.matActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mat);
        this.mat.setBounds(470, 70, 140, 30);
        this.jLabel3.setFont(new Font("SimHei", 2, 18));
        this.jLabel3.setForeground(new Color(153, 0, 153));
        this.jLabel3.setText("Mecano  :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(10, 76, 81, 21);
        this.jLabel4.setFont(new Font("SimHei", 2, 18));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("Raison de suppression: ");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(10, 180, 207, 21);
        this.num.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppbc.this.numActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.num);
        this.num.setBounds(95, 120, 150, 30);
        this.jLabel5.setFont(new Font("SimHei", 2, 18));
        this.jLabel5.setForeground(new Color(153, 0, 153));
        this.jLabel5.setText("Ann\u00e9e bande commande:");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(270, 130, 189, 20);
        this.rai.setColumns(20);
        this.rai.setRows(5);
        this.jScrollPane1.setViewportView(this.rai);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(220, 170, 307, 96);
        this.jButton1.setFont(new Font("Trebuchet MS", 1, 18));
        this.jButton1.setForeground(new Color(204, 0, 255));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/boncommande/20030982_1904122083138988_2011977613_n.png")));
        this.jButton1.setText("supprimer ");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppbc.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(560, 310, 170, 39);
        this.a.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppbc.this.aActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.a);
        this.a.setBounds(470, 120, 145, 30);
        this.jLabel6.setFont(new Font("SimHei", 2, 18));
        this.jLabel6.setForeground(new Color(153, 0, 153));
        this.jLabel6.setText("N\u00b0BC:");
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(20, 120, 70, 21);
        this.jLabel7.setIcon(new ImageIcon(this.getClass().getResource("/boncommande/20045984_1904122486472281_1560774584_n.png")));
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(180, 230, 360, 140);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 740, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 376, -2));
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String raison = "";
        boolean k = false;
        Connection conn2 = null;
        try {
            conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = (Statement)conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT * FROM bc WHERE Mecano='" + this.mec.getText() + "' AND nbc='" + this.num.getText() + "' AND matf='" + this.mat.getText() + "'AND anneesdebut='" + this.a.getText() + "'");
            while (result2.next()) {
                k = true;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur de slection" + e.getMessage());
        }
        if (k) {
            suppbcvalider aa = new suppbcvalider();
            aa.setVisible(true);
            aa.setvalued(this.mec.getText(), this.mat.getText(), this.num.getText(), this.a.getText(), this.rai.getText());
        } else {
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Bon de commande n'existe pas", "Information", 1);
        }
    }

    private void mecActionPerformed(ActionEvent evt) {
    }

    private void matActionPerformed(ActionEvent evt) {
    }

    private void numActionPerformed(ActionEvent evt) {
    }

    private void aActionPerformed(ActionEvent evt) {
    }

}

