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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class informationsant\u00e9
extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPasswordField jPasswordField1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField4;

    public informationsant\u00e9() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jTextField4 = new JTextField();
        this.jLabel2 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel1 = new JLabel();
        this.jButton2 = new JButton();
        this.jTextField1 = new JTextField();
        this.jLabel7 = new JLabel();
        this.jTextField2 = new JTextField();
        this.jPasswordField1 = new JPasswordField();
        this.jLabel4 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTextArea1 = new JTextArea();
        this.setDefaultCloseOperation(3);
        this.setTitle("Sant\u00e9");
        this.setMinimumSize(new Dimension(20, 20));
        this.jTextField4.setText("21 301 031");
        this.jLabel2.setFont(new Font("Tahoma", 1, 12));
        this.jLabel2.setText("Tel p\u00e9rsonnel :*");
        this.jLabel8.setFont(new Font("Tahoma", 1, 11));
        this.jLabel8.setForeground(new Color(204, 0, 0));
        this.jLabel8.setText("(*) Champs obligatoires");
        this.jLabel6.setFont(new Font("Tahoma", 1, 12));
        this.jLabel6.setText("Mot de passe : *");
        this.jLabel9.setIcon(new ImageIcon(this.getClass().getResource("/image/Head-physician-icon.png")));
        this.jLabel5.setFont(new Font("Tahoma", 1, 12));
        this.jLabel5.setText("Adresse: *");
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton1.setText("Valider");
        this.jLabel1.setFont(new Font("Tahoma", 1, 12));
        this.jLabel1.setText("Nom et pr\u00e9nom  : *");
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.jButton2.setText("Annuler");
        this.jTextField1.setText("Ahmed ben ahmed");
        this.jTextField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                informationsant\u00e9.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jLabel7.setFont(new Font("Tahoma", 3, 16));
        this.jLabel7.setText("Les informations ");
        this.jTextField2.setText("73 545 98 ");
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                informationsant\u00e9.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jPasswordField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                informationsant\u00e9.this.jPasswordField1ActionPerformed(evt);
            }
        });
        this.jLabel4.setFont(new Font("Tahoma", 1, 12));
        this.jLabel4.setText("Tel  : *");
        this.jTextArea1.setColumns(20);
        this.jTextArea1.setRows(5);
        this.jScrollPane1.setViewportView(this.jTextArea1);
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel9, -2, 61, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel7, -2, 246, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jButton1, -2, 110, -2).addGap(18, 18, 18).addComponent(this.jButton2, -2, 109, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -2, 126, -2).addComponent(this.jLabel6, -2, 118, -2)).addGap(7, 7, 7)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel5, -1, 129, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1, -1, 180, 32767).addComponent(this.jTextField1, -1, 180, 32767).addComponent(this.jPasswordField1, -1, 180, 32767))).addComponent(this.jLabel8).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel4).addGap(92, 92, 92).addComponent(this.jTextField2, -1, 180, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel2).addGap(36, 36, 36).addComponent(this.jTextField4, -1, 180, 32767))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel7, -2, 29, -2).addComponent(this.jLabel9)).addGap(26, 26, 26).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 23, -2).addComponent(this.jTextField1, -2, -1, -2)).addGap(31, 31, 31).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.jTextField2, -2, -1, -2)).addGap(30, 30, 30).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextField4, -2, -1, -2)).addGap(25, 25, 25).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPasswordField1, -2, -1, -2).addComponent(this.jLabel6)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1, -2, 62, -2).addComponent(this.jLabel5)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel8).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton2).addComponent(this.jButton1)).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.pack();
    }

    private void jPasswordField1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(informationsant\u00e9.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(informationsant\u00e9.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(informationsant\u00e9.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(informationsant\u00e9.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new informationsant\u00e9().setVisible(true);
            }
        });
    }

}

