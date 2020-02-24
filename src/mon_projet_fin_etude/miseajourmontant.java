/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class miseajourmontant
extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JTextField jTextField1;
    private JTextField jTextField2;

    public miseajourmontant() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setForeground(new Color(0, 0, 204));
        this.jLabel1.setText("Insert nouveaux montant");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(95, 11, 260, 23);
        this.jTextField1.setFont(new Font("Tahoma", 0, 14));
        this.jPanel1.add(this.jTextField1);
        this.jTextField1.setBounds(180, 40, 150, 31);
        this.jTextField2.setFont(new Font("Tahoma", 0, 14));
        this.jPanel1.add(this.jTextField2);
        this.jTextField2.setBounds(180, 90, 150, 31);
        this.jButton1.setText("Valider");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                miseajourmontant.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(190, 130, 100, 30);
        this.jButton2.setText("Quitter");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                miseajourmontant.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(310, 130, 90, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Montant de pret :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(10, 48, 140, 17);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("Montant avec frais :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(10, 100, 170, 17);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, 413, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 182, -2));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean g;
        String ch1 = "";
        boolean k = false;
        boolean bl = g = this.jTextField1.getText().equals("") || this.jTextField2.getText().equals("");
        if (g) {
            k = false;
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                ResultSet result = state.executeQuery("SELECT *  FROM montantcession2 WHERE md=" + this.jTextField1.getText());
                ResultSetMetaData resultMeta = result.getMetaData();
                while (result.next()) {
                    for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                        ch1 = result.getObject(i).toString();
                    }
                }
                if (ch1.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state2 = conn22.createStatement();
                        String md = this.jTextField1.getText();
                        String mf = this.jTextField2.getText();
                        state2.executeUpdate("INSERT INTO montantcession2(md,mf) VALUES('" + md + "','" + mf + "')");
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Succes d'ajout: ");
                    }
                    catch (Exception e) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'ajout : " + e.getMessage());
                    }
                } else {
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, " Montant existe deja !!", "Information", 1);
                    k = false;
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                k = false;
            }
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
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
            Logger.getLogger(miseajourmontant.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(miseajourmontant.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(miseajourmontant.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(miseajourmontant.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new miseajourmontant().setVisible(true);
            }
        });
    }

}

