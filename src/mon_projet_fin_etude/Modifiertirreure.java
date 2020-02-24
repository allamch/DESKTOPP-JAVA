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
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Modifiertirreure
extends JPanel {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JTabbedPane jTabbedPane1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;

    public Modifiertirreure() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jTextField4 = new JTextField();
        this.jLabel2 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel1 = new JLabel();
        this.jButton2 = new JButton();
        this.jTextField1 = new JTextField();
        this.jLabel7 = new JLabel();
        this.jTextField2 = new JTextField();
        this.jLabel4 = new JLabel();
        this.jTextField5 = new JTextField();
        this.jLabel3 = new JLabel();
        this.jTabbedPane1 = new JTabbedPane();
        this.jTextField3 = new JTextField();
        this.jLabel5 = new JLabel();
        this.jButton3 = new JButton();
        this.jPanel1.setLayout(null);
        this.jPanel1.add(this.jTextField4);
        this.jTextField4.setBounds(130, 160, 200, 20);
        this.jLabel2.setFont(new Font("Tahoma", 1, 12));
        this.jLabel2.setText("Delivr\u00e9 le  :*");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(10, 160, 75, 15);
        this.jLabel8.setFont(new Font("Tahoma", 1, 11));
        this.jLabel8.setForeground(new Color(204, 0, 0));
        this.jLabel8.setText("(*) Champs obligatoires");
        this.jPanel1.add(this.jLabel8);
        this.jLabel8.setBounds(10, 230, 135, 14);
        this.jLabel9.setIcon(new ImageIcon(this.getClass().getResource("/image/Head-physician-icon.png")));
        this.jPanel1.add(this.jLabel9);
        this.jLabel9.setBounds(10, 40, 61, 48);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton1.setText("Valider");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Modifiertirreure.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(60, 250, 110, 33);
        this.jLabel1.setFont(new Font("Tahoma", 1, 12));
        this.jLabel1.setText("Nom et pr\u00e9nom  : *");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(10, 85, 126, 23);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.jButton2.setText("Annuler");
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(200, 250, 109, 33);
        this.jTextField1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Modifiertirreure.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jTextField1);
        this.jTextField1.setBounds(130, 90, 200, 20);
        this.jLabel7.setFont(new Font("Tahoma", 3, 16));
        this.jLabel7.setText("Modifier Les informations ");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(90, 50, 246, 29);
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Modifiertirreure.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jTextField2);
        this.jTextField2.setBounds(130, 120, 200, 20);
        this.jLabel4.setFont(new Font("Tahoma", 1, 12));
        this.jLabel4.setText("N\u00b0 C.I.N : *");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(10, 120, 67, 15);
        this.jPanel1.add(this.jTextField5);
        this.jTextField5.setBounds(130, 200, 200, 20);
        this.jLabel3.setFont(new Font("Tahoma", 1, 12));
        this.jLabel3.setText("A * :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(10, 200, 40, 15);
        this.jPanel1.add(this.jTabbedPane1);
        this.jTabbedPane1.setBounds(0, -95, 360, 40);
        this.jTextField3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Modifiertirreure.this.jTextField3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jTextField3);
        this.jTextField3.setBounds(90, 10, 150, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 11));
        this.jLabel5.setForeground(new Color(0, 0, 102));
        this.jLabel5.setText("N\u00b0 C.I.N");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(24, 14, 50, 20);
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/recherche.png")));
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(260, 10, 50, 40);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, 380, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 298, -2).addContainerGap(-1, 32767)));
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jTextField3ActionPerformed(ActionEvent evt) {
    }

}

