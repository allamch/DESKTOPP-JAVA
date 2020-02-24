/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class INKIRAT
extends JFrame {
    private JLabel banque;
    private JLabel ccb;
    private JButton jButton1;
    private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JTextField jTextField1;
    private JTextField jTextField32;
    private JTextField jTextField33;
    private JLabel nomm;
    private JLabel tell;

    public INKIRAT() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel4 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jTextField32 = new JTextField();
        this.jTextField33 = new JTextField();
        this.jLabel5 = new JLabel();
        this.jLabel18 = new JLabel();
        this.ccb = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel14 = new JLabel();
        this.nomm = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel22 = new JLabel();
        this.tell = new JLabel();
        this.jLabel25 = new JLabel();
        this.jLabel23 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel26 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jSeparator2 = new JSeparator();
        this.jPanel1 = new JPanel();
        this.jLabel4 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jLabel27 = new JLabel();
        this.jLabel28 = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jLabel34 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel37 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jLabel38 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTextArea1 = new JTextArea();
        this.jLabel39 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.jTextArea2 = new JTextArea();
        this.jLabel11 = new JLabel();
        this.banque = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jPanel2 = new JPanel();
        this.jButton6 = new JButton();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/ENTET.PNG")));
        this.jLabel7.setBackground(new Color(153, 153, 255));
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setForeground(new Color(0, 0, 255));
        this.jLabel7.setText("\u0631\u0642\u0645 \u0627\u0644\u0645\u0644\u0641");
        this.jLabel19.setFont(new Font("Tahoma", 1, 14));
        this.jLabel19.setForeground(new Color(0, 0, 204));
        this.jLabel19.setText("\u0631\u0642\u0645 \u0628.\u062a.\u0648");
        this.jTextField33.setFont(new Font("Tahoma", 1, 24));
        this.jLabel5.setBackground(new Color(153, 153, 255));
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setForeground(new Color(0, 0, 255));
        this.jLabel5.setText("\u0627\u0644\u0645\u0639\u0631\u0641 \u0627\u0644\u0627\u0644\u064a ");
        this.jLabel18.setFont(new Font("Tahoma", 1, 14));
        this.jLabel18.setForeground(new Color(0, 0, 255));
        this.jLabel18.setText("\u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u062c\u0627\u0631\u064a \u0628\u0627\u0644\u0628\u0646\u0643 \u0623\u0648 \u0627\u0644\u0628\u0631\u064a\u062f");
        this.ccb.setFont(new Font("Arial", 1, 14));
        this.ccb.setText("..................................");
        this.jLabel3.setFont(new Font("Arial", 1, 14));
        this.jLabel3.setText(".....................................");
        this.jLabel6.setFont(new Font("Tahoma", 1, 14));
        this.jLabel6.setText("\u0627\u0644\u0627\u0633\u0645 \u0648 \u0627\u0644\u0644\u0642\u0628");
        this.jLabel9.setFont(new Font("Arial", 1, 14));
        this.jLabel9.setText(".....................................");
        this.jLabel14.setFont(new Font("Tahoma", 1, 14));
        this.jLabel14.setText("\u0627\u0644\u0645\u0647\u0646\u0629");
        this.nomm.setFont(new Font("Arial", 1, 14));
        this.nomm.setText(".....................................");
        this.jLabel16.setFont(new Font("Tahoma", 1, 14));
        this.jLabel16.setText("\u0645\u0643\u0627\u0646\u0647\u0627");
        this.jLabel13.setFont(new Font("Arial", 1, 14));
        this.jLabel13.setText(".....................................");
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("\u0627\u0644\u0645\u0633\u062a\u0634\u0641\u0649");
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setText("\u062a\u0627\u0631\u064a\u062e \u0627\u0644\u0648\u0644\u0627\u062f\u0629");
        this.jLabel15.setFont(new Font("Arial", 1, 14));
        this.jLabel15.setText(".....................................");
        this.jLabel17.setFont(new Font("Arial", 1, 14));
        this.jLabel17.setText(".....................................");
        this.jLabel22.setFont(new Font("Tahoma", 1, 14));
        this.jLabel22.setText("\u0631\u0642\u0645 \u0627\u0644\u0647\u0627\u062a\u0641 \u0627\u0644\u062c\u0648\u0627\u0644");
        this.tell.setFont(new Font("Arial", 1, 14));
        this.tell.setText(".....................................");
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setText("\u0627\u0633\u0645 \u0627\u0644\u0632\u0648\u062c (\u0629)");
        this.jLabel23.setFont(new Font("Arial", 1, 14));
        this.jLabel23.setText(".....................................");
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("\u0627\u0644\u0639\u0646\u0648\u0627\u0646");
        this.jLabel26.setFont(new Font("Arial", 1, 14));
        this.jLabel26.setText(".....................................");
        this.jLabel29.setFont(new Font("Tahoma", 0, 18));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("\u0645\u0637\u0644\u0628 \u0627\u0646\u062e\u0631\u0627\u0637");
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jPanel1.setLayout(null);
        this.jLabel4.setText("\u0627\u0646\u064a \u0627\u0644\u0645\u0645\u0636\u064a \u0623\u0633\u0641\u0644\u0647 (\u0647\u0627)");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(460, 0, 115, 14);
        this.jLabel20.setFont(new Font("Arial", 1, 11));
        this.jLabel20.setText(".....................................");
        this.jPanel1.add(this.jLabel20);
        this.jLabel20.setBounds(330, 0, 111, 14);
        this.jLabel24.setText("\u0623\u0635\u0631\u062d \u0628\u0623\u0646\u064a \u0623\u0646\u062e\u0631\u0637 \u062a\u0644\u0642\u0627\u0626\u064a \u0628\u062a\u0639\u0627\u0648\u0646\u064a\u0629 \u0627\u0639\u0648\u0627\u0646 \u0627\u0644\u0635\u062d\u0629 \u0643\u0645\u0627 \u0623\u062a\u0639\u0647\u062f \u0639\u0644\u0649 \u0627\u0644\u0634\u0631\u0641    ");
        this.jPanel1.add(this.jLabel24);
        this.jLabel24.setBounds(0, 0, 322, 14);
        this.jLabel27.setText("\u0628\u0627\u0644\u0627\u0645\u062a\u062b\u0627\u0644 \u0644\u062c\u0645\u064a\u0639 \u0645\u0642\u062a\u0636\u064a\u0627\u062a \u0627\u0644\u0642\u0627\u0646\u0648\u0646 \u0627\u0644\u0623\u0633\u0627\u0633\u064a \u0627\u0644\u0635\u0627\u062f\u0631 \u0628\u0627\u0644\u0631\u0627\u0626\u062f \u0627\u0644\u0631\u0633\u0645\u064a \u0641\u064a  22 \u0641\u064a\u0641\u0631\u064a 1980 \u0628\u062a\u0627\u0631\u064a\u062e  4 \u0645\u0627\u0631\u0633 1980  ");
        this.jPanel1.add(this.jLabel27);
        this.jLabel27.setBounds(80, 20, 500, 20);
        this.jLabel28.setText("\u0643\u0645\u0627 \u0623\u0637\u0644\u0628 \u0645\u0646 \u0627\u0644\u0645\u0624\u0631\u062e (\u0627\u0644\u0645\u0635\u0627\u0644\u062d \u0627\u0644\u0645\u0631\u0643\u0632\u064a\u0629 \u0644\u0648\u0632\u0627\u0631\u0629 \u0627\u0644\u0635\u062d\u0629 - \u0627\u0644\u0645\u062f\u064a\u0631 \u0627\u0644\u062c\u0647\u0648\u064a \u0644\u0644\u0635\u062d\u0629 - \u0627\u0644\u0645\u062f\u064a\u0631 \u0627\u0644\u0639\u0627\u0645  \u0644\u0644\u0645\u0633\u062a\u0634\u0641\u064a - \u0645\u062f\u064a\u0631 \u0627\u0644\u0645\u0633\u062a\u0634\u0641\u0649 ");
        this.jPanel1.add(this.jLabel28);
        this.jLabel28.setBounds(10, 40, 570, 20);
        this.jLabel35.setFont(new Font("Tahoma", 0, 14));
        this.jLabel35.setText("\u0627\u0645\u0636\u0627\u0621 \u0627\u0644\u0645\u0646\u062e\u0631\u0637");
        this.jPanel1.add(this.jLabel35);
        this.jLabel35.setBounds(10, 100, 80, 17);
        this.jLabel30.setText("\u0627\u0644\u0645\u062d\u0644\u0649 ) \u0633\u062d\u0628 \u0643\u0644 \u0634\u0647\u0631 \u0645\u0639\u0644\u0648\u0645 \u0627\u0644\u0627\u0646\u062e\u0631\u0627\u0637 \u0648 \u062a\u062d\u0648\u064a\u0644\u0647 \u0625\u0644\u0649 \u062d\u0633\u0627\u0628 \u0627\u0644\u062a\u0639\u0627\u0648\u0646\u064a\u0629 \u0639\u0644\u0649 \u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u0628\u0631\u064a\u062f\u064a \u062a\u062d\u062a \u0639\u062f\u062f 39706 \u0637\u0628\u0642\u0627 \u0644\u0644\u0641\u0635\u0644 10 \u0645\u0646 ");
        this.jPanel1.add(this.jLabel30);
        this.jLabel30.setBounds(-3, 60, 573, 14);
        this.jLabel31.setText("\u0627\u0644\u0646\u0636\u0627\u0645 \u0627\u0644\u062f\u0627\u062e\u0644\u064a \u0648 \u0623\u0644\u062d \u0639\u0644\u0649 \u0627\u062d\u062a\u0631\u0627\u0645 \u0647\u0630\u0627 \u0627\u0644\u0639\u0642\u062f \u0648 \u0639\u062f\u0645 \u0625\u064a\u0642\u0627\u0641 \u0627\u0644\u062e\u0635\u0645 \u0641\u064a \u0643\u0644 \u0627\u0644\u0644\u0623\u062d\u0648\u0627\u0644 \u0627\u0644\u0627 \u0628\u0627\u0630\u0646 \u0645\u0646 \u0627\u0644\u062a\u0639\u0627\u0648\u0646\u064a\u0629 \u0637\u0628\u0642\u0627 \u0644\u0644\u0641\u0635\u0644 3 \u0645\u0646 \u0627\u0644\u0646\u0638\u0627\u0645");
        this.jPanel1.add(this.jLabel31);
        this.jLabel31.setBounds(0, 80, 570, 14);
        this.jLabel32.setText("\u0627\u0644\u0630\u0627\u062e\u0644\u064a \u0648 \u0627\u0644\u0641\u0635\u0644 48 \u0645\u0646 \u0627\u0644\u0642\u0627\u0646\u0648\u0646 \u0627\u0644\u0623\u0633\u0627\u0633\u064a.");
        this.jPanel1.add(this.jLabel32);
        this.jLabel32.setBounds(370, 100, 200, 14);
        this.jLabel33.setFont(new Font("Tahoma", 1, 11));
        this.jLabel33.setText("\u0645\u0644\u0627\u062d\u0638\u0629 :");
        this.jPanel1.add(this.jLabel33);
        this.jLabel33.setBounds(520, 130, 50, 14);
        this.jLabel34.setText("\u0623\u0635\u0631\u062d \u0623\u0646\u064a \u0642\u0645\u062a \u0628\u0642\u0631\u0627\u0621\u0629 \u0627\u0644\u0642\u0627\u0646\u0648\u0646 \u0627\u0644\u0623\u0633\u0627\u0633\u064a \u0648 \u0627\u0644\u0646\u0638\u0627\u0645 \u0627\u0644\u0630\u0627\u062e\u0644\u064a \u0642\u0628\u0644 \u062a\u0642\u062f\u064a\u0645 \u0645\u0637\u0644\u0628 \u0627\u0644\u0627\u0646\u062e\u0631\u0627\u0637.");
        this.jPanel1.add(this.jLabel34);
        this.jLabel34.setBounds(130, 130, 390, 14);
        this.jLabel36.setText("\u062a\u0645\u062a \u0627\u0644\u0645\u0635\u0627\u062f\u0642\u0629 \u0639\u0644\u0649 \u0627\u0644\u0642\u0627\u0646\u0648\u0646 \u0627\u0644\u0627\u0633\u0627\u0633\u064a \u0644\u0644\u062a\u0639\u0627\u0648\u0646\u064a\u0629 \u0628\u0645\u0642\u062a\u0636\u0649 \u0642\u0631\u0627\u0631 \u0648\u0632\u064a\u0631\u064a \u0627\u0644\u0645\u0627\u0644\u064a\u0629 \u0648 \u0627\u0644\u0634\u0624\u0648\u0646 \u0627\u0644\u0627\u062c\u062a\u0645\u0627\u0639\u064a\u0629 .");
        this.jPanel1.add(this.jLabel36);
        this.jLabel36.setBounds(120, 150, 450, 14);
        this.jLabel37.setText("\u0627\u0644\u0645\u0624\u0631\u062e \u0641\u064a 22 \u0641\u064a\u0641\u0631\u064a 1980 \u0648 \u0627\u0644\u0635\u0627\u062f\u0631 \u0628\u0627\u0644\u0631\u0627\u0626\u062f \u0627\u0644\u0631\u0633\u0645\u064a \u0639\u062f\u062f 14 \u0641\u064a 4 \u0645\u0627\u0631\u0633 1980, ");
        this.jPanel1.add(this.jLabel37);
        this.jLabel37.setBounds(190, 170, 370, 14);
        this.jPanel1.add(this.jTextField1);
        this.jTextField1.setBounds(0, 120, 110, 80);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setText("\u0623\u0633\u0645\u0627\u0621 \u0627\u0644\u0627\u0628\u0646\u0627\u0621");
        this.jTextArea1.setColumns(20);
        this.jTextArea1.setRows(5);
        this.jScrollPane1.setViewportView(this.jTextArea1);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setText("\u062a\u0627\u0631\u064a\u062e \u0627\u0644\u0648\u0644\u0627\u062f\u0629 ");
        this.jTextArea2.setColumns(20);
        this.jTextArea2.setRows(5);
        this.jScrollPane2.setViewportView(this.jTextArea2);
        this.jLabel11.setBackground(new Color(153, 153, 255));
        this.jLabel11.setFont(new Font("Tahoma", 1, 14));
        this.jLabel11.setForeground(new Color(0, 0, 255));
        this.jLabel11.setText("\u0627\u0644\u0645\u0639\u0631\u0641 \u0627\u0644\u0627\u0644\u064a ");
        this.banque.setText("................");
        this.jLabel21.setBackground(new Color(153, 153, 255));
        this.jLabel21.setFont(new Font("Tahoma", 1, 14));
        this.jLabel21.setForeground(new Color(0, 0, 255));
        this.jLabel21.setText("\u062a\u0627\u0631\u064a\u062e \u0627\u0644\u0627\u0635\u062f\u0627\u0631 \u0628.\u062a.\u0648");
        this.jLabel1.setText("........................");
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGap(69, 69, 69).addComponent(this.jLabel2, -1, 522, 32767).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, 581, 32767).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jSeparator2, -1, 581, 32767).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addGap(35, 35, 35).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel13).addGap(18, 18, 18).addComponent(this.jLabel10)).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel17, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel16).addGap(35, 35, 35))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel15).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel8)).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel9, -2, 166, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel14)))).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.nomm, -2, 252, -2).addGap(18, 18, 18).addComponent(this.jLabel6)).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel23, -2, 127, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel25).addGap(18, 18, 18).addComponent(this.tell).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel22)).addGroup(GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup().addComponent(this.jLabel26, -2, 369, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel12)).addGroup(jPanel4Layout.createSequentialGroup().addGap(15, 15, 15).addComponent(this.jScrollPane1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jScrollPane2, -2, -1, -2))).addContainerGap(40, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGap(63, 63, 63).addComponent(this.jLabel39, -2, 90, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 245, 32767).addComponent(this.jLabel38, -2, 80, -2).addGap(88, 88, 88)))).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(10, 10, 10).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel7)).addComponent(this.jTextField33, -2, 107, -2)).addGap(128, 128, 128).addComponent(this.jLabel29).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 68, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -2, 116, -2).addGap(20, 20, 20))).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addComponent(this.jLabel19).addGap(108, 108, 108)).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel21).addComponent(this.jTextField32, -2, 141, -2)).addGap(51, 51, 51)))).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel4Layout.createSequentialGroup().addGap(31, 31, 31).addComponent(this.banque, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel5).addGap(27, 27, 27).addComponent(this.jLabel3, -2, 225, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel11)).addGroup(jPanel4Layout.createSequentialGroup().addGap(47, 47, 47).addComponent(this.ccb, -1, 308, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel18))).addGap(62, 62, 62)).addComponent(this.jSeparator1, -1, 601, 32767));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2).addGap(11, 11, 11).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(7, 7, 7).addComponent(this.jLabel29)).addGroup(jPanel4Layout.createSequentialGroup().addGap(1, 1, 1).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel19).addGap(5, 5, 5).addComponent(this.jTextField32, -2, 36, -2)).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jLabel7).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField33, -2, 36, -2))))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel21).addComponent(this.jLabel1, -1, 19, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel11)).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3, -2, 24, -2).addComponent(this.jLabel5).addComponent(this.banque, -2, 20, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ccb, -2, 24, -2).addComponent(this.jLabel18, -2, 17, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 2, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel6).addComponent(this.nomm, -2, 24, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel14).addComponent(this.jLabel9, -2, 24, -2)).addGap(1, 1, 1)).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel13, -2, 24, -2).addComponent(this.jLabel10)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel8).addComponent(this.jLabel15, -2, 24, -2)).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel17, -2, 24, -2).addComponent(this.jLabel16))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.tell, -2, 24, -2).addComponent(this.jLabel22).addComponent(this.jLabel25).addComponent(this.jLabel23, -2, 24, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel12, -2, 17, -2).addComponent(this.jLabel26, -2, 24, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel38, -2, 20, -2).addComponent(this.jLabel39, -2, 20, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jScrollPane2, -2, -1, -2).addComponent(this.jScrollPane1, -2, -1, -2)).addGap(83, 83, 83).addComponent(this.jSeparator2, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel1, -2, 206, -2)));
        this.jButton6.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton6.setText("Quitter");
        this.jButton6.setToolTipText("Quitter");
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                INKIRAT.this.jButton6ActionPerformed(evt);
            }
        });
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                INKIRAT.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jButton6).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 177, 32767).addComponent(this.jButton1).addGap(104, 104, 104)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton6, -2, 47, -2).addComponent(this.jButton1, -2, 44, -2)).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.jPanel2, -2, -1, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel4, -2, 591, -2))).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel4, -1, -1, 32767)));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Properties props = new Properties();
        props.setProperty("awt.print.paperSize", "a4");
        props.setProperty("awt.print.destination", "printer");
        PrintJob demandeDImpression = this.getToolkit().getPrintJob(this, "Impression", props);
        System.out.println("demandeDImpression   :  " + demandeDImpression);
        if (demandeDImpression != null) {
            Graphics gImpr = demandeDImpression.getGraphics();
            this.jPanel4.printAll(gImpr);
            demandeDImpression.end();
        }
        this.setVisible(false);
    }

    public void setvalued(String nd, String ncin, String nom, String ncnr, String daten, String tel, String lieun, String LIEUTRAVAIL, String adress, String NOMCONJ, String tra, String rib, String nomenfant, String datenaienfant, String ch, String datecin) {
        this.ccb.setText(rib);
        this.jTextField33.setText(nd);
        this.jTextField32.setText(ncin);
        this.nomm.setText(nom);
        this.jLabel1.setText(datecin);
        this.jLabel20.setText(nom);
        this.jLabel3.setText(ncnr);
        this.jLabel15.setText(daten);
        this.tell.setText(tel);
        this.jLabel17.setText(lieun);
        this.jLabel13.setText(LIEUTRAVAIL);
        this.banque.setText(ch);
        this.jLabel26.setText(adress);
        this.jLabel23.setText(NOMCONJ);
        this.jLabel9.setText(tra);
        this.jTextArea2.setText(nomenfant);
        this.jTextArea1.setText(datenaienfant);
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(INKIRAT.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(INKIRAT.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(INKIRAT.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(INKIRAT.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new INKIRAT().setVisible(true);
            }
        });
    }

}

