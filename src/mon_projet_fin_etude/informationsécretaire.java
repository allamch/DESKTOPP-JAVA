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
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class informations\u00e9cretaire
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
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPasswordField jPasswordField1;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextPane jTextPane1;

    public informations\u00e9cretaire() {
        this.setResizable(false);
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jTextField2 = new JTextField();
        this.jLabel1 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jPasswordField1 = new JPasswordField();
        this.jLabel5 = new JLabel();
        this.jButton2 = new JButton();
        this.jLabel8 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel4 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTextPane1 = new JTextPane();
        this.jLabel9 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jTextField3 = new JTextField();
        this.jLabel7 = new JLabel();
        this.jLabel3 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setTitle("Secr\u00e9taire");
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                informations\u00e9cretaire.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jLabel1.setFont(new Font("Tahoma", 1, 12));
        this.jLabel1.setText("Nom   : *");
        this.jTextField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                informations\u00e9cretaire.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jLabel5.setFont(new Font("Tahoma", 1, 12));
        this.jLabel5.setText("Adresse: ");
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.jButton2.setText("Annuler");
        this.jLabel8.setFont(new Font("Tahoma", 1, 11));
        this.jLabel8.setForeground(new Color(204, 0, 0));
        this.jLabel8.setText("(*) Champs obligatoires");
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton1.setText("Valider");
        this.jLabel4.setFont(new Font("Tahoma", 1, 12));
        this.jLabel4.setText("N\u00b0 t\u00e9lephone: *");
        this.jScrollPane1.setViewportView(this.jTextPane1);
        this.jLabel9.setIcon(new ImageIcon(this.getClass().getResource("/image/s.png")));
        this.jLabel6.setFont(new Font("Tahoma", 1, 12));
        this.jLabel6.setText("Mot de passe : *");
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                informations\u00e9cretaire.this.jTextField3ActionPerformed(evt);
            }
        });
        this.jLabel7.setFont(new Font("Tahoma", 1, 16));
        this.jLabel7.setText("Les informations du Secr\u00e9taire");
        this.jLabel3.setFont(new Font("Tahoma", 1, 12));
        this.jLabel3.setText("Pr\u00e9nom : *");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(42, 42, 42).addComponent(this.jLabel9)).addGroup(jPanel1Layout.createSequentialGroup().addGap(128, 128, 128).addComponent(this.jButton1, -2, 110, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton2, -2, 109, -2))).addContainerGap(34, 32767)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(53, 53, 53).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.jLabel1, -2, 126, -2).addComponent(this.jLabel4, -2, 106, -2).addComponent(this.jLabel6, -2, 118, -2).addComponent(this.jLabel5, -2, 110, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField1).addComponent(this.jTextField2).addComponent(this.jTextField3).addComponent(this.jPasswordField1, -2, 188, -2)).addComponent(this.jScrollPane1, -1, 188, 32767))).addComponent(this.jLabel8))).addComponent(this.jLabel7, GroupLayout.Alignment.TRAILING, -2, 265, -2)).addGap(53, 53, 53))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel9).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 274, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2, -2, 36, -2)).addGap(21, 21, 21)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel7, -2, 29, -2).addGap(41, 41, 41).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 23, -2).addComponent(this.jTextField1, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jTextField2, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.jTextField3, -2, -1, -2)).addGap(30, 30, 30).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6).addComponent(this.jPasswordField1, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel5).addComponent(this.jScrollPane1, -2, 50, -2)).addGap(10, 10, 10).addComponent(this.jLabel8).addContainerGap(66, 32767))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 391, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
        this.pack();
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField3ActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(informations\u00e9cretaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(informations\u00e9cretaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(informations\u00e9cretaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(informations\u00e9cretaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new informations\u00e9cretaire().setVisible(true);
            }
        });
    }

}

