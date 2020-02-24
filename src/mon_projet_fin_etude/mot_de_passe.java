/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mon_projet_fin_etude.acceuil;
import mon_projet_fin_etude.recherchecarnedecheque;

public class mot_de_passe
extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JTextField login1;
    private JPasswordField mp1;
    private JPasswordField mp2;
    private JPasswordField mppp;

    public mot_de_passe() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.mp1 = new JPasswordField();
        this.mppp = new JPasswordField();
        this.mp2 = new JPasswordField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.login1 = new JTextField();
        this.setDefaultCloseOperation(3);
        this.setTitle("modifier mot de passe");
        this.setMinimumSize(new Dimension(460, 400));
        this.getContentPane().setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setText("Mise \u00e0 jour du mot de passe");
        this.getContentPane().add(this.jLabel1);
        this.jLabel1.setBounds(90, 30, 251, 22);
        this.jLabel3.setFont(new Font("Tahoma", 1, 12));
        this.jLabel3.setText("Ancien Mot de passe:*");
        this.getContentPane().add(this.jLabel3);
        this.jLabel3.setBounds(20, 140, 139, 15);
        this.jLabel4.setFont(new Font("Tahoma", 1, 12));
        this.jLabel4.setText("Nouveau Mot de passe:*");
        this.jLabel4.setPreferredSize(new Dimension(70, 10));
        this.getContentPane().add(this.jLabel4);
        this.jLabel4.setBounds(20, 170, 160, 20);
        this.jLabel5.setFont(new Font("Tahoma", 1, 12));
        this.jLabel5.setText("Retaper le mot de passe:*");
        this.getContentPane().add(this.jLabel5);
        this.jLabel5.setBounds(20, 220, 161, 15);
        this.getContentPane().add(this.mp1);
        this.mp1.setBounds(190, 170, 190, 30);
        this.mppp.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                mot_de_passe.this.mpppActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.mppp);
        this.mppp.setBounds(190, 120, 190, 30);
        this.getContentPane().add(this.mp2);
        this.mp2.setBounds(190, 210, 190, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 11));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton1.setText("Valider");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                mot_de_passe.this.jButton1ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton1);
        this.jButton1.setBounds(170, 250, 99, 33);
        this.jButton2.setFont(new Font("Tahoma", 1, 11));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.jButton2.setText("Annuler\n");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                mot_de_passe.this.jButton2ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton2);
        this.jButton2.setBounds(280, 250, 105, 33);
        this.jLabel6.setFont(new Font("Tahoma", 1, 12));
        this.jLabel6.setForeground(new Color(153, 0, 0));
        this.jLabel6.setText("(*) Champs obligatoires");
        this.getContentPane().add(this.jLabel6);
        this.jLabel6.setBounds(12, 250, 150, 20);
        this.jLabel7.setIcon(new ImageIcon(this.getClass().getResource("/image/modify-key-icon (1).png")));
        this.getContentPane().add(this.jLabel7);
        this.jLabel7.setBounds(20, 10, 48, 48);
        this.jLabel8.setFont(new Font("Tahoma", 1, 12));
        this.jLabel8.setText("Login :*");
        this.getContentPane().add(this.jLabel8);
        this.jLabel8.setBounds(20, 100, 50, 15);
        this.getContentPane().add(this.login1);
        this.login1.setBounds(190, 80, 190, 30);
        this.pack();
    }

    private void mpppActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.setVisible(false);
        acceuil c = new acceuil();
        c.show();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        JOptionPane jop3;
        Statement state2;
        ResultSet result2;
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean k = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state2 = conn2.createStatement();
            result2 = state2.executeQuery("SELECT * FROM login  WHERE login='" + this.login1.getText() + "'");
            while (result2.next()) {
                k = true;
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Er 1" + e.getMessage());
        }
        if (!k) {
            this.login1.setText("");
            this.mppp.setText("");
            this.mp1.setText("");
            this.mp2.setText("");
            JOptionPane.showMessageDialog(null, "Erreur: Login Incorrect ");
        } else {
            k = false;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state2 = conn2.createStatement();
                result2 = state2.executeQuery("SELECT * FROM login  WHERE login='" + this.login1.getText() + "' AND mp='" + this.mppp.getText() + "'");
                while (result2.next()) {
                    k = true;
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Er 2" + e.getMessage());
            }
            if (k) {
                if (this.mp1.getText().equals(this.mp2.getText())) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement stat = conn2.createStatement();
                        stat.executeUpdate("UPDATE login SET mp='" + this.mp2.getText() + "' WHERE login='" + this.login1.getText() + "' AND mp='" + this.mppp.getText() + "'");
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Succes de modification  ", "Information", 1);
                        this.setVisible(false);
                        acceuil c = new acceuil();
                        c.show();
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Er M " + e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Erreur: Retaper le mot de passe !! ");
                    this.login1.setText("");
                    this.mppp.setText("");
                    this.mp1.setText("");
                    this.mp2.setText("");
                }
            } else {
                this.login1.setText("");
                this.mppp.setText("");
                this.mp1.setText("");
                this.mp2.setText("");
                JOptionPane.showMessageDialog(null, "Erreur: Ancien Mot de passe Incorrect !! ");
            }
        }
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (!"Nimbus".equals(info.getName())) continue;
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(mot_de_passe.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(mot_de_passe.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(mot_de_passe.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(mot_de_passe.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new mot_de_passe().setVisible(true);
            }
        });
    }

}

