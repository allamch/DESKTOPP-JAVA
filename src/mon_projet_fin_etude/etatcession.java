/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.recherchecarnedecheque;

public class etatcession
extends JFrame {
    String moiactueleenlettre = "";
    String moia = "";
    private JTextField Mecano;
    private JTextField Mecano1;
    private JTextField Mont1;
    private JTextField Mont10;
    private JTextField Mont11;
    private JTextField Mont12;
    private JTextField Mont13;
    private JTextField Mont14;
    private JTextField Mont15;
    private JTextField Mont2;
    private JTextField Mont3;
    private JTextField Mont4;
    private JTextField Mont5;
    private JTextField Mont6;
    private JTextField Mont7;
    private JTextField Mont8;
    private JTextField Mont9;
    private JTable Table_Empoyee;
    private ButtonGroup UUU;
    private JTextField cnr1;
    private JTextField cnr10;
    private JTextField cnr11;
    private JTextField cnr12;
    private JTextField cnr13;
    private JTextField cnr14;
    private JTextField cnr15;
    private JTextField cnr2;
    private JTextField cnr3;
    private JTextField cnr4;
    private JTextField cnr5;
    private JTextField cnr6;
    private JTextField cnr7;
    private JTextField cnr8;
    private JTextField cnr9;
    private JTextField dated1;
    private JTextField dated10;
    private JTextField dated11;
    private JTextField dated12;
    private JTextField dated13;
    private JTextField dated14;
    private JTextField dated15;
    private JTextField dated2;
    private JTextField dated3;
    private JTextField dated4;
    private JTextField dated5;
    private JTextField dated6;
    private JTextField dated7;
    private JTextField dated8;
    private JTextField dated9;
    private JLabel dateetanne;
    private JTextField datef1;
    private JTextField datef10;
    private JTextField datef11;
    private JTextField datef12;
    private JTextField datef13;
    private JTextField datef14;
    private JTextField datef15;
    private JTextField datef2;
    private JTextField datef3;
    private JTextField datef4;
    private JTextField datef5;
    private JTextField datef6;
    private JTextField datef7;
    private JTextField datef8;
    private JTextField datef9;
    private JRadioButton encore;
    private JPanel etat;
    private ButtonGroup g;
    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton4;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JTextField jTextField11;
    private JTextField jTextField14;
    private JTextField jTextField15;
    private JTextField jTextField18;
    private JTextField jTextField19;
    private JTextField jTextField20;
    private JRadioButton mahdia;
    private JLabel mini;
    private JTextField mo;
    private JTextField ne1;
    private JTextField ne10;
    private JTextField ne11;
    private JTextField ne12;
    private JTextField ne13;
    private JTextField ne14;
    private JTextField ne15;
    private JTextField ne2;
    private JTextField ne3;
    private JTextField ne4;
    private JTextField ne5;
    private JTextField ne6;
    private JTextField ne7;
    private JTextField ne8;
    private JTextField ne9;
    private JTextField nom1;
    private JTextField nom10;
    private JTextField nom11;
    private JTextField nom12;
    private JTextField nom13;
    private JTextField nom14;
    private JTextField nom15;
    private JTextField nom2;
    private JTextField nom3;
    private JTextField nom4;
    private JTextField nom5;
    private JTextField nom6;
    private JTextField nom7;
    private JTextField nom8;
    private JTextField nom9;
    private JTextField rab1;
    private JTextField rab10;
    private JTextField rab11;
    private JTextField rab12;
    private JTextField rab13;
    private JTextField rab14;
    private JTextField rab15;
    private JTextField rab2;
    private JTextField rab3;
    private JTextField rab4;
    private JTextField rab5;
    private JTextField rab6;
    private JTextField rab7;
    private JTextField rab8;
    private JTextField rab9;
    private JTextField ref1;
    private JTextField ref10;
    private JTextField ref11;
    private JTextField ref12;
    private JTextField ref13;
    private JTextField ref14;
    private JTextField ref15;
    private JTextField ref2;
    private JTextField ref3;
    private JTextField ref4;
    private JTextField ref5;
    private JTextField ref6;
    private JTextField ref7;
    private JTextField ref8;
    private JTextField ref9;
    private JRadioButton tous;
    private JRadioButton tunis;

    public etatcession() {
        this.initComponents();
    }

    private void initComponents() {
        this.g = new ButtonGroup();
        this.UUU = new ButtonGroup();
        this.jLabel1 = new JLabel();
        this.jPanel1 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jButton1 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.Table_Empoyee = new JTable();
        this.jButton3 = new JButton();
        this.mo = new JTextField();
        this.etat = new JPanel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jPanel4 = new JPanel();
        this.tunis = new JRadioButton();
        this.mahdia = new JRadioButton();
        this.jLabel8 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jPanel5 = new JPanel();
        this.encore = new JRadioButton();
        this.tous = new JRadioButton();
        this.jLabel17 = new JLabel();
        this.jComboBox1 = new JComboBox();
        this.jButton4 = new JButton();
        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();
        this.jLabel13 = new JLabel();
        this.Mecano1 = new JTextField();
        this.Mecano = new JTextField();
        this.jTextField11 = new JTextField();
        this.jTextField14 = new JTextField();
        this.jTextField15 = new JTextField();
        this.jTextField18 = new JTextField();
        this.jTextField19 = new JTextField();
        this.ne1 = new JTextField();
        this.cnr1 = new JTextField();
        this.ref1 = new JTextField();
        this.nom1 = new JTextField();
        this.rab1 = new JTextField();
        this.Mont1 = new JTextField();
        this.dated1 = new JTextField();
        this.ne2 = new JTextField();
        this.ref2 = new JTextField();
        this.nom2 = new JTextField();
        this.rab2 = new JTextField();
        this.Mont2 = new JTextField();
        this.dated2 = new JTextField();
        this.cnr3 = new JTextField();
        this.ref3 = new JTextField();
        this.rab3 = new JTextField();
        this.Mont3 = new JTextField();
        this.dated3 = new JTextField();
        this.ne4 = new JTextField();
        this.cnr4 = new JTextField();
        this.ref4 = new JTextField();
        this.nom4 = new JTextField();
        this.rab4 = new JTextField();
        this.Mont4 = new JTextField();
        this.dated4 = new JTextField();
        this.ne5 = new JTextField();
        this.cnr5 = new JTextField();
        this.ref5 = new JTextField();
        this.nom5 = new JTextField();
        this.rab5 = new JTextField();
        this.Mont5 = new JTextField();
        this.dated5 = new JTextField();
        this.cnr2 = new JTextField();
        this.ne3 = new JTextField();
        this.nom3 = new JTextField();
        this.ne6 = new JTextField();
        this.cnr6 = new JTextField();
        this.ref6 = new JTextField();
        this.nom6 = new JTextField();
        this.rab6 = new JTextField();
        this.Mont6 = new JTextField();
        this.dated6 = new JTextField();
        this.dated7 = new JTextField();
        this.Mont7 = new JTextField();
        this.rab7 = new JTextField();
        this.nom7 = new JTextField();
        this.ref7 = new JTextField();
        this.cnr7 = new JTextField();
        this.ne7 = new JTextField();
        this.ne8 = new JTextField();
        this.cnr8 = new JTextField();
        this.ref8 = new JTextField();
        this.nom8 = new JTextField();
        this.rab8 = new JTextField();
        this.Mont8 = new JTextField();
        this.dated8 = new JTextField();
        this.dated9 = new JTextField();
        this.Mont9 = new JTextField();
        this.rab9 = new JTextField();
        this.nom9 = new JTextField();
        this.ref9 = new JTextField();
        this.cnr9 = new JTextField();
        this.ne9 = new JTextField();
        this.ne10 = new JTextField();
        this.cnr10 = new JTextField();
        this.ref10 = new JTextField();
        this.nom10 = new JTextField();
        this.rab10 = new JTextField();
        this.Mont10 = new JTextField();
        this.dated10 = new JTextField();
        this.dated11 = new JTextField();
        this.Mont11 = new JTextField();
        this.rab11 = new JTextField();
        this.nom11 = new JTextField();
        this.ref11 = new JTextField();
        this.cnr11 = new JTextField();
        this.ne11 = new JTextField();
        this.ne12 = new JTextField();
        this.nom12 = new JTextField();
        this.rab12 = new JTextField();
        this.Mont12 = new JTextField();
        this.dated12 = new JTextField();
        this.ref12 = new JTextField();
        this.cnr12 = new JTextField();
        this.dateetanne = new JLabel();
        this.jLabel14 = new JLabel();
        this.mini = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel16 = new JLabel();
        this.ne13 = new JTextField();
        this.ne14 = new JTextField();
        this.jTextField20 = new JTextField();
        this.ne15 = new JTextField();
        this.cnr15 = new JTextField();
        this.cnr14 = new JTextField();
        this.cnr13 = new JTextField();
        this.ref13 = new JTextField();
        this.ref14 = new JTextField();
        this.ref15 = new JTextField();
        this.nom15 = new JTextField();
        this.nom14 = new JTextField();
        this.nom13 = new JTextField();
        this.rab13 = new JTextField();
        this.rab14 = new JTextField();
        this.rab15 = new JTextField();
        this.Mont15 = new JTextField();
        this.Mont14 = new JTextField();
        this.Mont13 = new JTextField();
        this.dated13 = new JTextField();
        this.dated14 = new JTextField();
        this.dated15 = new JTextField();
        this.datef1 = new JTextField();
        this.datef2 = new JTextField();
        this.datef3 = new JTextField();
        this.datef4 = new JTextField();
        this.datef5 = new JTextField();
        this.datef6 = new JTextField();
        this.datef7 = new JTextField();
        this.datef8 = new JTextField();
        this.datef9 = new JTextField();
        this.datef10 = new JTextField();
        this.datef11 = new JTextField();
        this.datef12 = new JTextField();
        this.datef13 = new JTextField();
        this.datef14 = new JTextField();
        this.datef15 = new JTextField();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setFont(new Font("Tahoma", 3, 24));
        this.jLabel1.setText("Etat des  Cessions");
        this.jPanel1.setLayout(null);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setForeground(new Color(0, 51, 51));
        this.jLabel2.setText("Choisire le mode de recherche :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(20, 110, 230, 20);
        this.jLabel3.setFont(new Font("Tahoma", 0, 14));
        this.jLabel3.setForeground(new Color(204, 0, 0));
        this.jLabel3.setText("exemple: 04/2015");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(360, 60, 130, 20);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton1.setText("Recherche");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(630, 10, 160, 30);
        this.Table_Empoyee.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.jScrollPane1.setViewportView(this.Table_Empoyee);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 150, 870, 430);
        this.jButton3.setFont(new Font("Tahoma", 1, 12));
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton3.setText("Imprimer l'etat");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(630, 40, 160, 30);
        this.mo.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.moActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mo);
        this.mo.setBounds(210, 50, 140, 30);
        this.etat.setLayout(null);
        this.jLabel4.setText("jLabel4");
        this.etat.add(this.jLabel4);
        this.jLabel4.setBounds(100, 32, 34, 14);
        this.jLabel5.setText("jLabel5");
        this.etat.add(this.jLabel5);
        this.jLabel5.setBounds(100, 52, 34, 14);
        this.jLabel6.setText("jLabel6");
        this.etat.add(this.jLabel6);
        this.jLabel6.setBounds(100, 72, 34, 14);
        this.jLabel9.setText("jLabel9");
        this.etat.add(this.jLabel9);
        this.jLabel9.setBounds(106, 152, 34, 14);
        this.jLabel10.setText("jLabel10");
        this.etat.add(this.jLabel10);
        this.jLabel10.setBounds(169, 152, 92, 14);
        this.jLabel11.setText("jLabel11");
        this.etat.add(this.jLabel11);
        this.jLabel11.setBounds(294, 152, 40, 14);
        this.jLabel12.setText("jLabel12");
        this.etat.add(this.jLabel12);
        this.jLabel12.setBounds(100, 305, 40, 14);
        this.jPanel1.add(this.etat);
        this.etat.setBounds(20, 140, 620, 340);
        this.jPanel4.setCursor(new Cursor(0));
        this.g.add(this.tunis);
        this.tunis.setFont(new Font("Tahoma", 1, 12));
        this.tunis.setText("Tunis");
        this.tunis.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.tunisActionPerformed(evt);
            }
        });
        this.g.add(this.mahdia);
        this.mahdia.setFont(new Font("Tahoma", 1, 12));
        this.mahdia.setText("Mahdia");
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(60, 60, 60).addComponent(this.tunis).addGap(37, 37, 37).addComponent(this.mahdia).addContainerGap(187, 32767)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.tunis).addComponent(this.mahdia)).addContainerGap(-1, 32767)));
        this.jPanel1.add(this.jPanel4);
        this.jPanel4.setBounds(180, 80, 410, 30);
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setForeground(new Color(0, 51, 51));
        this.jLabel8.setText("Choisire l'etat :");
        this.jPanel1.add(this.jLabel8);
        this.jLabel8.setBounds(20, 20, 110, 20);
        this.jLabel15.setFont(new Font("Tahoma", 1, 14));
        this.jLabel15.setForeground(new Color(0, 51, 51));
        this.jLabel15.setText("Minist\u00e9re de la sant\u00e9 :");
        this.jPanel1.add(this.jLabel15);
        this.jLabel15.setBounds(30, 90, 150, 20);
        this.UUU.add(this.encore);
        this.encore.setFont(new Font("Tahoma", 1, 12));
        this.encore.setText("qu'il n'est pas encore imprim\u00e9");
        this.UUU.add(this.tous);
        this.tous.setFont(new Font("Tahoma", 1, 12));
        this.tous.setText("Tous");
        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addGap(44, 44, 44).addComponent(this.tous).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767).addComponent(this.encore, -2, 206, -2).addContainerGap()));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.tous).addComponent(this.encore)).addContainerGap(-1, 32767)));
        this.jPanel1.add(this.jPanel5);
        this.jPanel5.setBounds(250, 110, 350, 30);
        this.jLabel17.setFont(new Font("Tahoma", 1, 14));
        this.jLabel17.setForeground(new Color(0, 51, 51));
        this.jLabel17.setText("Saisire le mois et l'ann\u00e9es :");
        this.jPanel1.add(this.jLabel17);
        this.jLabel17.setBounds(20, 60, 200, 20);
        this.jComboBox1.setFont(new Font("Tahoma", 1, 12));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{"Cession normale", "Fourniseur", "Tous"}));
        this.jPanel1.add(this.jComboBox1);
        this.jComboBox1.setBounds(210, 10, 140, 30);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/Button-Close-icon.png")));
        this.jButton4.setText("Quitter");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton4);
        this.jButton4.setBounds(630, 70, 160, 33);
        this.jPanel2.setLayout(null);
        this.jPanel3.setBackground(new Color(255, 255, 255));
        this.jPanel3.setLayout(null);
        this.jLabel13.setFont(new Font("Tahoma", 1, 12));
        this.jLabel13.setText("Du mois");
        this.jPanel3.add(this.jLabel13);
        this.jLabel13.setBounds(230, 120, 60, 20);
        this.Mecano1.setFont(new Font("Tahoma", 1, 11));
        this.Mecano1.setText("N\u00b0");
        this.Mecano1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.Mecano1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.Mecano1ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.Mecano1);
        this.Mecano1.setBounds(0, 140, 20, 30);
        this.Mecano.setFont(new Font("Tahoma", 1, 11));
        this.Mecano.setText("N\u00b0CNR");
        this.Mecano.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.Mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.MecanoActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.Mecano);
        this.Mecano.setBounds(20, 140, 80, 30);
        this.jTextField11.setFont(new Font("Tahoma", 1, 11));
        this.jTextField11.setText("Reference");
        this.jTextField11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField11.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.jTextField11ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jTextField11);
        this.jTextField11.setBounds(100, 140, 60, 30);
        this.jTextField14.setFont(new Font("Tahoma", 1, 11));
        this.jTextField14.setText("     Nom et Prenom");
        this.jTextField14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField14.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.jTextField14ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jTextField14);
        this.jTextField14.setBounds(160, 140, 140, 30);
        this.jTextField15.setFont(new Font("Tahoma", 1, 11));
        this.jTextField15.setText("Mensuel");
        this.jTextField15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.jTextField15ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jTextField15);
        this.jTextField15.setBounds(300, 140, 70, 30);
        this.jTextField18.setFont(new Font("Tahoma", 1, 11));
        this.jTextField18.setText("Montant");
        this.jTextField18.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField18.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.jTextField18ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jTextField18);
        this.jTextField18.setBounds(370, 140, 80, 30);
        this.jTextField19.setFont(new Font("Tahoma", 1, 11));
        this.jTextField19.setText("Date debut");
        this.jTextField19.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.jTextField19ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jTextField19);
        this.jTextField19.setBounds(450, 140, 70, 30);
        this.ne1.setText("1");
        this.ne1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne1);
        this.ne1.setBounds(0, 170, 20, 40);
        this.cnr1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr1);
        this.cnr1.setBounds(20, 170, 80, 40);
        this.ref1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref1);
        this.ref1.setBounds(100, 170, 60, 40);
        this.nom1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom1);
        this.nom1.setBounds(160, 170, 140, 40);
        this.rab1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab1);
        this.rab1.setBounds(300, 170, 70, 40);
        this.Mont1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont1);
        this.Mont1.setBounds(370, 170, 80, 40);
        this.dated1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated1);
        this.dated1.setBounds(450, 170, 70, 40);
        this.ne2.setText("2");
        this.ne2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne2);
        this.ne2.setBounds(0, 210, 20, 40);
        this.ref2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref2);
        this.ref2.setBounds(100, 210, 60, 40);
        this.nom2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom2);
        this.nom2.setBounds(160, 210, 140, 40);
        this.rab2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab2);
        this.rab2.setBounds(300, 210, 70, 40);
        this.Mont2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont2);
        this.Mont2.setBounds(370, 210, 80, 40);
        this.dated2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated2);
        this.dated2.setBounds(450, 210, 70, 40);
        this.cnr3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr3);
        this.cnr3.setBounds(20, 250, 80, 40);
        this.ref3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref3);
        this.ref3.setBounds(100, 250, 60, 40);
        this.rab3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab3);
        this.rab3.setBounds(300, 250, 70, 40);
        this.Mont3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont3);
        this.Mont3.setBounds(370, 250, 80, 40);
        this.dated3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated3);
        this.dated3.setBounds(450, 250, 70, 40);
        this.ne4.setText("4");
        this.ne4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ne4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.ne4ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.ne4);
        this.ne4.setBounds(0, 290, 20, 40);
        this.cnr4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr4);
        this.cnr4.setBounds(20, 290, 80, 40);
        this.ref4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref4);
        this.ref4.setBounds(100, 290, 60, 40);
        this.nom4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom4);
        this.nom4.setBounds(160, 290, 140, 40);
        this.rab4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab4);
        this.rab4.setBounds(300, 290, 70, 40);
        this.Mont4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont4);
        this.Mont4.setBounds(370, 290, 80, 40);
        this.dated4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated4);
        this.dated4.setBounds(450, 290, 70, 40);
        this.ne5.setText("5");
        this.ne5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne5);
        this.ne5.setBounds(0, 330, 20, 40);
        this.cnr5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr5);
        this.cnr5.setBounds(20, 330, 80, 40);
        this.ref5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref5);
        this.ref5.setBounds(100, 330, 60, 40);
        this.nom5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom5);
        this.nom5.setBounds(160, 330, 140, 40);
        this.rab5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab5);
        this.rab5.setBounds(300, 330, 70, 40);
        this.Mont5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont5);
        this.Mont5.setBounds(370, 330, 80, 40);
        this.dated5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated5);
        this.dated5.setBounds(450, 330, 70, 40);
        this.cnr2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr2);
        this.cnr2.setBounds(20, 210, 80, 40);
        this.ne3.setText("3");
        this.ne3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne3);
        this.ne3.setBounds(0, 250, 20, 40);
        this.nom3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom3);
        this.nom3.setBounds(160, 250, 140, 40);
        this.ne6.setText("6");
        this.ne6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne6);
        this.ne6.setBounds(0, 370, 20, 40);
        this.cnr6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr6);
        this.cnr6.setBounds(20, 370, 80, 40);
        this.ref6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref6);
        this.ref6.setBounds(100, 370, 60, 40);
        this.nom6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom6);
        this.nom6.setBounds(160, 370, 140, 40);
        this.rab6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab6);
        this.rab6.setBounds(300, 370, 70, 40);
        this.Mont6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont6);
        this.Mont6.setBounds(370, 370, 80, 40);
        this.dated6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated6);
        this.dated6.setBounds(450, 370, 70, 40);
        this.dated7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated7);
        this.dated7.setBounds(450, 410, 70, 40);
        this.Mont7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont7);
        this.Mont7.setBounds(370, 410, 80, 40);
        this.rab7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab7);
        this.rab7.setBounds(300, 410, 70, 40);
        this.nom7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom7);
        this.nom7.setBounds(160, 410, 140, 40);
        this.ref7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref7);
        this.ref7.setBounds(100, 410, 60, 40);
        this.cnr7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr7);
        this.cnr7.setBounds(20, 410, 80, 40);
        this.ne7.setText("7");
        this.ne7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne7);
        this.ne7.setBounds(0, 410, 20, 40);
        this.ne8.setText("8");
        this.ne8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne8);
        this.ne8.setBounds(0, 450, 20, 40);
        this.cnr8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr8);
        this.cnr8.setBounds(20, 450, 80, 40);
        this.ref8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref8);
        this.ref8.setBounds(100, 450, 60, 40);
        this.nom8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom8);
        this.nom8.setBounds(160, 450, 140, 40);
        this.rab8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab8);
        this.rab8.setBounds(300, 450, 70, 40);
        this.Mont8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont8);
        this.Mont8.setBounds(370, 450, 80, 40);
        this.dated8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated8);
        this.dated8.setBounds(450, 450, 70, 40);
        this.dated9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated9);
        this.dated9.setBounds(450, 490, 70, 40);
        this.Mont9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont9);
        this.Mont9.setBounds(370, 490, 80, 40);
        this.rab9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab9);
        this.rab9.setBounds(300, 490, 70, 40);
        this.nom9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom9);
        this.nom9.setBounds(160, 490, 140, 40);
        this.ref9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref9);
        this.ref9.setBounds(100, 490, 60, 40);
        this.cnr9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr9);
        this.cnr9.setBounds(20, 490, 80, 40);
        this.ne9.setText("9");
        this.ne9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ne9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.ne9ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.ne9);
        this.ne9.setBounds(0, 490, 20, 40);
        this.ne10.setText("10");
        this.ne10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ne10.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.ne10ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.ne10);
        this.ne10.setBounds(0, 530, 20, 40);
        this.cnr10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr10);
        this.cnr10.setBounds(20, 530, 80, 40);
        this.ref10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref10);
        this.ref10.setBounds(100, 530, 60, 40);
        this.nom10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom10);
        this.nom10.setBounds(160, 530, 140, 40);
        this.rab10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab10);
        this.rab10.setBounds(300, 530, 70, 40);
        this.Mont10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont10);
        this.Mont10.setBounds(370, 530, 80, 40);
        this.dated10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated10);
        this.dated10.setBounds(450, 530, 70, 40);
        this.dated11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated11);
        this.dated11.setBounds(450, 570, 70, 40);
        this.Mont11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont11);
        this.Mont11.setBounds(370, 570, 80, 40);
        this.rab11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab11);
        this.rab11.setBounds(300, 570, 70, 40);
        this.nom11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom11);
        this.nom11.setBounds(160, 570, 140, 40);
        this.ref11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref11);
        this.ref11.setBounds(100, 570, 60, 40);
        this.cnr11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr11);
        this.cnr11.setBounds(20, 570, 80, 40);
        this.ne11.setText("11");
        this.ne11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne11);
        this.ne11.setBounds(0, 570, 20, 40);
        this.ne12.setText("12");
        this.ne12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne12);
        this.ne12.setBounds(0, 610, 20, 40);
        this.nom12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom12);
        this.nom12.setBounds(160, 610, 140, 40);
        this.rab12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab12);
        this.rab12.setBounds(300, 610, 70, 40);
        this.Mont12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont12);
        this.Mont12.setBounds(370, 610, 80, 40);
        this.dated12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated12);
        this.dated12.setBounds(450, 610, 70, 40);
        this.ref12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref12);
        this.ref12.setBounds(100, 610, 60, 40);
        this.cnr12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr12);
        this.cnr12.setBounds(20, 610, 80, 40);
        this.dateetanne.setFont(new Font("Tahoma", 1, 12));
        this.dateetanne.setText("2015/2016");
        this.jPanel3.add(this.dateetanne);
        this.dateetanne.setBounds(290, 120, 130, 20);
        this.jLabel14.setFont(new Font("Tahoma", 1, 18));
        this.jLabel14.setText("Etat des Cessions");
        this.jPanel3.add(this.jLabel14);
        this.jLabel14.setBounds(230, 50, 160, 30);
        this.mini.setFont(new Font("Tahoma", 1, 16));
        this.jPanel3.add(this.mini);
        this.mini.setBounds(190, 80, 310, 20);
        this.jLabel7.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/ENTET.PNG")));
        this.jPanel3.add(this.jLabel7);
        this.jLabel7.setBounds(50, 10, 550, 40);
        this.jLabel16.setFont(new Font("Tahoma", 1, 14));
        this.jLabel16.setText("A accr\u00e9diter de compter");
        this.jPanel3.add(this.jLabel16);
        this.jLabel16.setBounds(220, 100, 180, 20);
        this.ne13.setText("13");
        this.ne13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ne13.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.ne13ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.ne13);
        this.ne13.setBounds(0, 650, 20, 40);
        this.ne14.setText("14");
        this.ne14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne14);
        this.ne14.setBounds(0, 690, 20, 40);
        this.jTextField20.setFont(new Font("Tahoma", 1, 11));
        this.jTextField20.setText("Date fin");
        this.jTextField20.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField20.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcession.this.jTextField20ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jTextField20);
        this.jTextField20.setBounds(520, 140, 60, 30);
        this.ne15.setText("15");
        this.ne15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ne15);
        this.ne15.setBounds(0, 730, 20, 40);
        this.cnr15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr15);
        this.cnr15.setBounds(20, 730, 80, 40);
        this.cnr14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr14);
        this.cnr14.setBounds(20, 690, 80, 40);
        this.cnr13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.cnr13);
        this.cnr13.setBounds(20, 650, 80, 40);
        this.ref13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref13);
        this.ref13.setBounds(100, 650, 60, 40);
        this.ref14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref14);
        this.ref14.setBounds(100, 690, 60, 40);
        this.ref15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.ref15);
        this.ref15.setBounds(100, 730, 60, 40);
        this.nom15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom15);
        this.nom15.setBounds(160, 730, 140, 40);
        this.nom14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom14);
        this.nom14.setBounds(160, 690, 140, 40);
        this.nom13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.nom13);
        this.nom13.setBounds(160, 650, 140, 40);
        this.rab13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab13);
        this.rab13.setBounds(300, 650, 70, 40);
        this.rab14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab14);
        this.rab14.setBounds(300, 690, 70, 40);
        this.rab15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.rab15);
        this.rab15.setBounds(300, 730, 70, 40);
        this.Mont15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont15);
        this.Mont15.setBounds(370, 730, 80, 40);
        this.Mont14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont14);
        this.Mont14.setBounds(370, 690, 80, 40);
        this.Mont13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.Mont13);
        this.Mont13.setBounds(370, 650, 80, 40);
        this.dated13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated13);
        this.dated13.setBounds(450, 650, 70, 40);
        this.dated14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated14);
        this.dated14.setBounds(450, 690, 70, 40);
        this.dated15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.dated15);
        this.dated15.setBounds(450, 730, 70, 40);
        this.datef1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef1);
        this.datef1.setBounds(520, 170, 60, 40);
        this.datef2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef2);
        this.datef2.setBounds(520, 210, 60, 40);
        this.datef3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef3);
        this.datef3.setBounds(520, 250, 60, 40);
        this.datef4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef4);
        this.datef4.setBounds(520, 290, 60, 40);
        this.datef5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef5);
        this.datef5.setBounds(520, 330, 60, 40);
        this.datef6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef6);
        this.datef6.setBounds(520, 370, 60, 40);
        this.datef7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef7);
        this.datef7.setBounds(520, 410, 60, 40);
        this.datef8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef8);
        this.datef8.setBounds(520, 450, 60, 40);
        this.datef9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef9);
        this.datef9.setBounds(520, 490, 60, 40);
        this.datef10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef10);
        this.datef10.setBounds(520, 530, 60, 40);
        this.datef11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef11);
        this.datef11.setBounds(520, 570, 60, 40);
        this.datef12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef12);
        this.datef12.setBounds(520, 610, 60, 40);
        this.datef13.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef13);
        this.datef13.setBounds(520, 650, 60, 40);
        this.datef14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef14);
        this.datef14.setBounds(520, 690, 60, 40);
        this.datef15.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel3.add(this.datef15);
        this.datef15.setBounds(520, 730, 60, 40);
        this.jPanel2.add(this.jPanel3);
        this.jPanel3.setBounds(43, -3, 610, 860);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.jPanel2, -2, 660, -2)).addGroup(layout.createSequentialGroup().addGap(321, 321, 321).addComponent(this.jLabel1, -2, 251, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, 875, 32767))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 32, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -2, 606, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel2, -2, 213, -2).addContainerGap(23, 32767)));
        this.pack();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        if (this.jComboBox1.getSelectedItem().equals("Cession normale")) {
            int mode = 0;
            if (this.tous.isSelected()) {
                mode = 1;
            } else if (this.encore.isSelected()) {
                mode = 2;
            }
            this.ne1.setVisible(false);
            this.cnr1.setVisible(false);
            this.ref1.setVisible(false);
            this.nom1.setVisible(false);
            this.rab1.setVisible(false);
            this.Mont1.setVisible(false);
            this.dated1.setVisible(false);
            this.datef1.setVisible(false);
            this.ne2.setVisible(false);
            this.cnr2.setVisible(false);
            this.ref2.setVisible(false);
            this.nom2.setVisible(false);
            this.rab2.setVisible(false);
            this.Mont2.setVisible(false);
            this.dated2.setVisible(false);
            this.datef2.setVisible(false);
            this.ne3.setVisible(false);
            this.cnr3.setVisible(false);
            this.ref3.setVisible(false);
            this.nom3.setVisible(false);
            this.rab3.setVisible(false);
            this.Mont3.setVisible(false);
            this.dated3.setVisible(false);
            this.datef3.setVisible(false);
            this.ne4.setVisible(false);
            this.cnr4.setVisible(false);
            this.ref4.setVisible(false);
            this.nom4.setVisible(false);
            this.rab4.setVisible(false);
            this.Mont4.setVisible(false);
            this.dated4.setVisible(false);
            this.datef4.setVisible(false);
            this.ne5.setVisible(false);
            this.cnr5.setVisible(false);
            this.ref5.setVisible(false);
            this.nom5.setVisible(false);
            this.rab5.setVisible(false);
            this.Mont5.setVisible(false);
            this.dated5.setVisible(false);
            this.datef5.setVisible(false);
            this.ne6.setVisible(false);
            this.cnr6.setVisible(false);
            this.ref6.setVisible(false);
            this.nom6.setVisible(false);
            this.rab6.setVisible(false);
            this.Mont6.setVisible(false);
            this.dated6.setVisible(false);
            this.datef6.setVisible(false);
            this.ne7.setVisible(false);
            this.cnr7.setVisible(false);
            this.ref7.setVisible(false);
            this.nom7.setVisible(false);
            this.rab7.setVisible(false);
            this.Mont7.setVisible(false);
            this.dated7.setVisible(false);
            this.datef7.setVisible(false);
            this.ne8.setVisible(false);
            this.cnr8.setVisible(false);
            this.ref8.setVisible(false);
            this.nom8.setVisible(false);
            this.rab8.setVisible(false);
            this.Mont8.setVisible(false);
            this.dated8.setVisible(false);
            this.datef8.setVisible(false);
            this.ne9.setVisible(false);
            this.cnr9.setVisible(false);
            this.ref9.setVisible(false);
            this.nom9.setVisible(false);
            this.rab9.setVisible(false);
            this.Mont9.setVisible(false);
            this.dated9.setVisible(false);
            this.datef9.setVisible(false);
            this.ne10.setVisible(false);
            this.cnr10.setVisible(false);
            this.ref10.setVisible(false);
            this.nom10.setVisible(false);
            this.rab10.setVisible(false);
            this.Mont10.setVisible(false);
            this.dated10.setVisible(false);
            this.datef10.setVisible(false);
            this.ne11.setVisible(false);
            this.cnr11.setVisible(false);
            this.ref11.setVisible(false);
            this.nom11.setVisible(false);
            this.rab11.setVisible(false);
            this.Mont11.setVisible(false);
            this.dated11.setVisible(false);
            this.datef11.setVisible(false);
            this.ne12.setVisible(false);
            this.cnr12.setVisible(false);
            this.ref12.setVisible(false);
            this.nom12.setVisible(false);
            this.rab12.setVisible(false);
            this.Mont12.setVisible(false);
            this.dated12.setVisible(false);
            this.datef12.setVisible(false);
            this.ne13.setVisible(false);
            this.cnr13.setVisible(false);
            this.ref13.setVisible(false);
            this.nom13.setVisible(false);
            this.rab13.setVisible(false);
            this.Mont13.setVisible(false);
            this.dated13.setVisible(false);
            this.datef13.setVisible(false);
            this.ne14.setVisible(false);
            this.cnr14.setVisible(false);
            this.ref14.setVisible(false);
            this.nom14.setVisible(false);
            this.rab14.setVisible(false);
            this.Mont14.setVisible(false);
            this.dated14.setVisible(false);
            this.datef14.setVisible(false);
            this.ne15.setVisible(false);
            this.cnr15.setVisible(false);
            this.ref15.setVisible(false);
            this.nom15.setVisible(false);
            this.rab15.setVisible(false);
            this.Mont15.setVisible(false);
            this.dated15.setVisible(false);
            this.datef15.setVisible(false);
            int minist\u00e9re = 0;
            if (this.tunis.isSelected()) {
                minist\u00e9re = 1;
            } else if (this.mahdia.isSelected()) {
                minist\u00e9re = 2;
            }
            if (mode == 0) {
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Choisir Le Mode de recherche", "Attention", 0);
            } else {
                if (minist\u00e9re == 0) {
                    JOptionPane jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Choisir Le minist\u00e9re de la sant\u00e9", "Attention", 0);
                }
                if (minist\u00e9re > 0) {
                    boolean g = this.mo.getText().equals("");
                    if (g) {
                        JOptionPane jop2 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Saisire le mois et l'ann\u00e9es ", "Attention", 0);
                    } else if (mode == 1) {
                        if (minist\u00e9re == 1) {
                            this.mini.setText("Minist\u00e9re de la Sant\u00e9 TUNIS");
                            String mec = "";
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state = conn2.createStatement();
                                DefaultTableModel dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                ResultSet result3 = state.executeQuery("SELECT * FROM cession2  WHERE premiermois='" + this.moiactueleenlettre + "'");
                                int k = 0;
                                int i = 0;
                                String lieutrvaille = "";
                                String travaille = "";
                                while (result3.next()) {
                                    if (i < 15) {
                                        mec = result3.getString("Mecano");
                                        System.out.println("mecano =" + mec);
                                    }
                                    ++k;
                                    String cnr = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement state3 = conn3.createStatement();
                                        ResultSet result4 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mec);
                                        while (result4.next()) {
                                            cnr = result4.getString("NCNR");
                                            travaille = result4.getString("TRVAIL");
                                            lieutrvaille = result4.getString("LIEUTRAVAIL");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur booo  " + e.getMessage());
                                    }
                                    System.out.println("-------------------------------------");
                                    int j = lieutrvaille.indexOf("SFAR");
                                    System.out.println("lieu de travaille =" + lieutrvaille);
                                    System.out.println("j =" + j);
                                    System.out.println("cadre de travaille =" + travaille);
                                    boolean jj = travaille.equals("Ouvrier");
                                    System.out.println("jj =" + jj);
                                    boolean test = true;
                                    if (jj && j > -1) {
                                        test = false;
                                    }
                                    if (!test) continue;
                                    ++i;
                                    try {
                                        k = 1;
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection connm = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement statem = connm.createStatement();
                                        String lk = "1";
                                        statem.executeUpdate("UPDATE cession2 SET i='1' WHERE MECANO='" + mec + "' AND premiermois='" + this.moiactueleenlettre + "'");
                                    }
                                    catch (Exception e) {
                                        k = 0;
                                        JOptionPane jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur modif **: " + e.getMessage());
                                    }
                                    String Nom = result3.getString("Nom");
                                    System.out.println("Nom =" + Nom);
                                    String ref = result3.getString("ref");
                                    String mparmois = result3.getString("montantparmois");
                                    String total = result3.getString("Montant");
                                    total = total.substring(0, total.length() - 3);
                                    total = total + ",000";
                                    String pm = result3.getString("premiermois");
                                    String andebut = pm.substring(pm.length() - 4, pm.length());
                                    pm = pm.substring(0, pm.length() - 6);
                                    System.out.println("pm =" + pm);
                                    this.moiactueleenlettre = pm.equals("Janvier") ? "01" : (pm.equals("F\u00e9vrier") ? "02" : (pm.equals("Mars") ? "03" : (pm.equals("Avril") ? "04" : (pm.equals("Mai") ? "05" : (pm.equals("Juin") ? "06" : (pm.equals("Juillet") ? "07" : (pm.equals("Ao\u00fbt") ? "08" : (pm.equals("Septembre") ? "09" : (pm.equals("Octobre") ? "10" : (pm.equals("Novembre") ? "11" : (pm.equals("D\u00e9cembre") ? "12" : "!!!!!!!!!!!")))))))))));
                                    System.out.println("moi et anne debut = " + this.moiactueleenlettre + "/" + andebut);
                                    this.moiactueleenlettre = this.moiactueleenlettre + "/" + andebut;
                                    String dm = result3.getString("derniermois");
                                    String anfin = dm.substring(dm.length() - 4, dm.length());
                                    dm = dm.substring(0, dm.length() - 6);
                                    this.moia = dm.equals("Janvier") ? "01" : (dm.equals("F\u00e9vrier") ? "02" : (dm.equals("Mars") ? "03" : (dm.equals("Avril") ? "04" : (dm.equals("Mai") ? "05" : (dm.equals("Juin") ? "06" : (dm.equals("Juillet") ? "07" : (dm.equals("Ao\u00fbt") ? "08" : (dm.equals("Septembre") ? "09" : (dm.equals("Octobre") ? "10" : (dm.equals("Novembre") ? "11" : (dm.equals("D\u00e9cembre") ? "12" : "!!!!!!!!!!!")))))))))));
                                    this.moia = this.moia + "/" + anfin;
                                    System.out.println("moi et anne FIN = " + this.moia);
                                    System.out.println("i =" + i);
                                    if (i == 1) {
                                        System.out.println("i =" + i);
                                        this.ne1.setText(" " + i);
                                        this.cnr1.setText(cnr);
                                        this.ref1.setText(ref);
                                        this.nom1.setText(Nom);
                                        this.rab1.setText(mparmois);
                                        this.Mont1.setText(total);
                                        this.dated1.setText(this.moiactueleenlettre);
                                        this.datef1.setText(this.moia);
                                        this.ne1.setVisible(true);
                                        this.cnr1.setVisible(true);
                                        this.ref1.setVisible(true);
                                        this.nom1.setVisible(true);
                                        this.rab1.setVisible(true);
                                        this.Mont1.setVisible(true);
                                        this.dated1.setVisible(true);
                                        this.datef1.setVisible(true);
                                        continue;
                                    }
                                    if (i == 2) {
                                        this.ne2.setText(" " + i);
                                        this.cnr2.setText(cnr);
                                        this.ref2.setText(ref);
                                        this.nom2.setText(Nom);
                                        this.rab2.setText(mparmois);
                                        this.Mont2.setText(total);
                                        this.dated2.setText(this.moiactueleenlettre);
                                        this.datef2.setText(this.moia);
                                        this.ne2.setVisible(true);
                                        this.cnr2.setVisible(true);
                                        this.ref2.setVisible(true);
                                        this.nom2.setVisible(true);
                                        this.rab2.setVisible(true);
                                        this.Mont2.setVisible(true);
                                        this.dated2.setVisible(true);
                                        this.datef2.setVisible(true);
                                        continue;
                                    }
                                    if (i == 3) {
                                        this.ne3.setText(" " + i);
                                        this.cnr3.setText(cnr);
                                        this.ref3.setText(ref);
                                        this.nom3.setText(Nom);
                                        this.rab3.setText(mparmois);
                                        this.Mont3.setText(total);
                                        this.dated3.setText(this.moiactueleenlettre);
                                        this.datef3.setText(this.moia);
                                        this.ne3.setVisible(true);
                                        this.cnr3.setVisible(true);
                                        this.ref3.setVisible(true);
                                        this.nom3.setVisible(true);
                                        this.rab3.setVisible(true);
                                        this.Mont3.setVisible(true);
                                        this.dated3.setVisible(true);
                                        this.datef3.setVisible(true);
                                        continue;
                                    }
                                    if (i == 4) {
                                        this.ne4.setText(" " + i);
                                        this.cnr4.setText(cnr);
                                        this.ref4.setText(ref);
                                        this.nom4.setText(Nom);
                                        this.rab4.setText(mparmois);
                                        this.Mont4.setText(total);
                                        this.dated4.setText(this.moiactueleenlettre);
                                        this.datef4.setText(this.moia);
                                        this.ne4.setVisible(true);
                                        this.cnr4.setVisible(true);
                                        this.ref4.setVisible(true);
                                        this.nom4.setVisible(true);
                                        this.rab4.setVisible(true);
                                        this.Mont4.setVisible(true);
                                        this.dated4.setVisible(true);
                                        this.datef4.setVisible(true);
                                        continue;
                                    }
                                    if (i == 5) {
                                        this.ne5.setText(" " + i);
                                        this.cnr5.setText(cnr);
                                        this.ref5.setText(ref);
                                        this.nom5.setText(Nom);
                                        this.rab5.setText(mparmois);
                                        this.Mont5.setText(total);
                                        this.dated5.setText(this.moiactueleenlettre);
                                        this.datef5.setText(this.moia);
                                        this.ne5.setVisible(true);
                                        this.cnr5.setVisible(true);
                                        this.ref5.setVisible(true);
                                        this.nom5.setVisible(true);
                                        this.rab5.setVisible(true);
                                        this.Mont5.setVisible(true);
                                        this.dated5.setVisible(true);
                                        this.datef5.setVisible(true);
                                        continue;
                                    }
                                    if (i == 6) {
                                        this.ne6.setText(" " + i);
                                        this.cnr6.setText(cnr);
                                        this.ref6.setText(ref);
                                        this.nom6.setText(Nom);
                                        this.rab6.setText(mparmois);
                                        this.Mont6.setText(total);
                                        this.dated6.setText(this.moiactueleenlettre);
                                        this.datef6.setText(this.moia);
                                        this.ne6.setVisible(true);
                                        this.cnr6.setVisible(true);
                                        this.ref6.setVisible(true);
                                        this.nom6.setVisible(true);
                                        this.rab6.setVisible(true);
                                        this.Mont6.setVisible(true);
                                        this.dated6.setVisible(true);
                                        this.datef6.setVisible(true);
                                        continue;
                                    }
                                    if (i == 7) {
                                        this.ne7.setText(" " + i);
                                        this.cnr7.setText(cnr);
                                        this.ref7.setText(ref);
                                        this.nom7.setText(Nom);
                                        this.rab7.setText(mparmois);
                                        this.Mont7.setText(total);
                                        this.dated7.setText(this.moiactueleenlettre);
                                        this.datef7.setText(this.moia);
                                        this.ne7.setVisible(true);
                                        this.cnr7.setVisible(true);
                                        this.ref7.setVisible(true);
                                        this.nom7.setVisible(true);
                                        this.rab7.setVisible(true);
                                        this.Mont7.setVisible(true);
                                        this.dated7.setVisible(true);
                                        this.datef7.setVisible(true);
                                        continue;
                                    }
                                    if (i == 8) {
                                        this.ne8.setText(" " + i);
                                        this.cnr8.setText(cnr);
                                        this.ref8.setText(ref);
                                        this.nom8.setText(Nom);
                                        this.rab8.setText(mparmois);
                                        this.Mont8.setText(total);
                                        this.dated8.setText(this.moiactueleenlettre);
                                        this.datef8.setText(this.moia);
                                        this.ne8.setVisible(true);
                                        this.cnr8.setVisible(true);
                                        this.ref8.setVisible(true);
                                        this.nom8.setVisible(true);
                                        this.rab8.setVisible(true);
                                        this.Mont8.setVisible(true);
                                        this.dated8.setVisible(true);
                                        this.datef8.setVisible(true);
                                        continue;
                                    }
                                    if (i == 9) {
                                        this.ne9.setText(" " + i);
                                        this.cnr9.setText(cnr);
                                        this.ref9.setText(ref);
                                        this.nom9.setText(Nom);
                                        this.rab9.setText(mparmois);
                                        this.Mont9.setText(total);
                                        this.dated9.setText(this.moiactueleenlettre);
                                        this.datef9.setText(this.moia);
                                        this.ne9.setVisible(true);
                                        this.cnr9.setVisible(true);
                                        this.ref9.setVisible(true);
                                        this.nom9.setVisible(true);
                                        this.rab9.setVisible(true);
                                        this.Mont9.setVisible(true);
                                        this.dated9.setVisible(true);
                                        this.datef9.setVisible(true);
                                        continue;
                                    }
                                    if (i == 10) {
                                        this.ne10.setText(" " + i);
                                        this.cnr10.setText(cnr);
                                        this.ref10.setText(ref);
                                        this.nom10.setText(Nom);
                                        this.rab10.setText(mparmois);
                                        this.Mont10.setText(total);
                                        this.dated10.setText(this.moiactueleenlettre);
                                        this.datef10.setText(this.moia);
                                        this.ne10.setVisible(true);
                                        this.cnr10.setVisible(true);
                                        this.ref10.setVisible(true);
                                        this.nom10.setVisible(true);
                                        this.rab10.setVisible(true);
                                        this.Mont10.setVisible(true);
                                        this.dated10.setVisible(true);
                                        this.datef10.setVisible(true);
                                        continue;
                                    }
                                    if (i == 11) {
                                        this.ne11.setText(" " + i);
                                        this.cnr11.setText(cnr);
                                        this.ref11.setText(ref);
                                        this.nom11.setText(Nom);
                                        this.rab11.setText(mparmois);
                                        this.Mont11.setText(total);
                                        this.dated11.setText(this.moiactueleenlettre);
                                        this.datef11.setText(this.moia);
                                        this.ne11.setVisible(true);
                                        this.cnr11.setVisible(true);
                                        this.ref11.setVisible(true);
                                        this.nom11.setVisible(true);
                                        this.rab11.setVisible(true);
                                        this.Mont11.setVisible(true);
                                        this.dated11.setVisible(true);
                                        this.datef11.setVisible(true);
                                        continue;
                                    }
                                    if (i == 12) {
                                        this.ne12.setText(" " + i);
                                        this.cnr12.setText(cnr);
                                        this.ref12.setText(ref);
                                        this.nom12.setText(Nom);
                                        this.rab12.setText(mparmois);
                                        this.Mont12.setText(total);
                                        this.dated12.setText(this.moiactueleenlettre);
                                        this.datef12.setText(this.moia);
                                        this.ne12.setVisible(true);
                                        this.cnr12.setVisible(true);
                                        this.ref12.setVisible(true);
                                        this.nom12.setVisible(true);
                                        this.rab12.setVisible(true);
                                        this.Mont12.setVisible(true);
                                        this.dated12.setVisible(true);
                                        this.datef12.setVisible(true);
                                        continue;
                                    }
                                    if (i == 13) {
                                        this.ne13.setText(" " + i);
                                        this.cnr13.setText(cnr);
                                        this.ref13.setText(ref);
                                        this.nom13.setText(Nom);
                                        this.rab13.setText(mparmois);
                                        this.Mont13.setText(total);
                                        this.dated13.setText(this.moiactueleenlettre);
                                        this.datef13.setText(this.moia);
                                        this.ne13.setVisible(true);
                                        this.cnr13.setVisible(true);
                                        this.ref13.setVisible(true);
                                        this.nom13.setVisible(true);
                                        this.rab13.setVisible(true);
                                        this.Mont13.setVisible(true);
                                        this.dated13.setVisible(true);
                                        this.datef13.setVisible(true);
                                        continue;
                                    }
                                    if (i == 14) {
                                        this.ne14.setText(" " + i);
                                        this.cnr14.setText(cnr);
                                        this.ref14.setText(ref);
                                        this.nom14.setText(Nom);
                                        this.rab14.setText(mparmois);
                                        this.Mont14.setText(total);
                                        this.dated14.setText(this.moiactueleenlettre);
                                        this.datef14.setText(this.moia);
                                        this.ne14.setVisible(true);
                                        this.cnr14.setVisible(true);
                                        this.ref14.setVisible(true);
                                        this.nom14.setVisible(true);
                                        this.rab14.setVisible(true);
                                        this.Mont14.setVisible(true);
                                        this.dated14.setVisible(true);
                                        this.datef14.setVisible(true);
                                        continue;
                                    }
                                    if (i != 15) continue;
                                    this.ne15.setText(" " + i);
                                    this.cnr15.setText(cnr);
                                    this.ref15.setText(ref);
                                    this.nom15.setText(Nom);
                                    this.rab15.setText(mparmois);
                                    this.Mont15.setText(total);
                                    this.dated15.setText(this.moiactueleenlettre);
                                    this.datef15.setText(this.moia);
                                    this.ne15.setVisible(true);
                                    this.cnr15.setVisible(true);
                                    this.ref15.setVisible(true);
                                    this.nom15.setVisible(true);
                                    this.rab15.setVisible(true);
                                    this.Mont15.setVisible(true);
                                    this.dated15.setVisible(true);
                                    this.datef15.setVisible(true);
                                }
                                if (k == 0) {
                                    JOptionPane jop2 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                JOptionPane jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                            JOptionPane.showMessageDialog(null, "Attention :  Impression De l'etat ", "Information", 1);
                            Impression1 secee = new Impression1(this.jPanel3);
                            secee.actionPerformed(evt);
                        } else if (minist\u00e9re == 2) {
                            this.mini.setText("Direction Regionale MAHDIA");
                            String mec = "";
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state = conn3.createStatement();
                                DefaultTableModel dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                ResultSet result3 = state.executeQuery("SELECT * FROM cession2  WHERE premiermois='" + this.moiactueleenlettre + "'");
                                int k = 0;
                                int i = 0;
                                String lieutrvaille = "";
                                String travaille = "";
                                while (result3.next()) {
                                    if (i < 15) {
                                        mec = result3.getString("Mecano");
                                        System.out.println("mecano =" + mec);
                                    }
                                    ++k;
                                    String cnr = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn32 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement state3 = conn32.createStatement();
                                        ResultSet result4 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mec);
                                        while (result4.next()) {
                                            cnr = result4.getString("NCNR");
                                            travaille = result4.getString("TRVAIL");
                                            lieutrvaille = result4.getString("LIEUTRAVAIL");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                                    }
                                    System.out.println("-------------------------------------");
                                    int j = lieutrvaille.indexOf("SFAR");
                                    System.out.println("lieu de travaille =" + lieutrvaille);
                                    System.out.println("j =" + j);
                                    System.out.println("cadre de travaille =" + travaille);
                                    boolean jj = travaille.equals("Ouvrier");
                                    System.out.println("jj =" + jj);
                                    if (!travaille.equals("Ouvrier") || j == -1) continue;
                                    ++i;
                                    try {
                                        k = 1;
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection connm = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement statem = connm.createStatement();
                                        String lk = "1";
                                        statem.executeUpdate("UPDATE cession2 SET i='1' WHERE MECANO='" + mec + "' AND premiermois='" + this.moiactueleenlettre + "'");
                                    }
                                    catch (Exception e) {
                                        k = 0;
                                        JOptionPane jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur modif **: " + e.getMessage());
                                    }
                                    String Nom = result3.getString("Nom");
                                    System.out.println("Nom =" + Nom);
                                    String ref = result3.getString("ref");
                                    String mparmois = result3.getString("montantparmois");
                                    String total = result3.getString("Montant");
                                    total = total.substring(0, total.length() - 3);
                                    total = total + ",000";
                                    String pm = result3.getString("premiermois");
                                    String andebut = pm.substring(pm.length() - 4, pm.length());
                                    pm = pm.substring(0, pm.length() - 6);
                                    System.out.println("pm =" + pm);
                                    this.moiactueleenlettre = pm.equals("Janvier") ? "01" : (pm.equals("F\u00e9vrier") ? "02" : (pm.equals("Mars") ? "03" : (pm.equals("Avril") ? "04" : (pm.equals("Mai") ? "05" : (pm.equals("Juin") ? "06" : (pm.equals("Juillet") ? "07" : (pm.equals("Ao\u00fbt") ? "08" : (pm.equals("Septembre") ? "09" : (pm.equals("Octobre") ? "10" : (pm.equals("Novembre") ? "11" : (pm.equals("D\u00e9cembre") ? "12" : "!!!!!!!!!!!")))))))))));
                                    System.out.println("moi et anne debut = " + this.moiactueleenlettre + "/" + andebut);
                                    this.moiactueleenlettre = this.moiactueleenlettre + "/" + andebut;
                                    String dm = result3.getString("derniermois");
                                    String anfin = dm.substring(dm.length() - 4, dm.length());
                                    dm = dm.substring(0, dm.length() - 6);
                                    this.moia = dm.equals("Janvier") ? "01" : (dm.equals("F\u00e9vrier") ? "02" : (dm.equals("Mars") ? "03" : (dm.equals("Avril") ? "04" : (dm.equals("Mai") ? "05" : (dm.equals("Juin") ? "06" : (dm.equals("Juillet") ? "07" : (dm.equals("Ao\u00fbt") ? "08" : (dm.equals("Septembre") ? "09" : (dm.equals("Octobre") ? "10" : (dm.equals("Novembre") ? "11" : (dm.equals("D\u00e9cembre") ? "12" : "!!!!!!!!!!!")))))))))));
                                    this.moia = this.moia + "/" + anfin;
                                    System.out.println("moi et anne FIN = " + this.moia);
                                    System.out.println("i =" + i);
                                    if (i == 1) {
                                        System.out.println("i =" + i);
                                        this.ne1.setText(" " + i);
                                        this.cnr1.setText(cnr);
                                        this.ref1.setText(ref);
                                        this.nom1.setText(Nom);
                                        this.rab1.setText(mparmois);
                                        this.Mont1.setText(total);
                                        this.dated1.setText(this.moiactueleenlettre);
                                        this.datef1.setText(this.moia);
                                        this.ne1.setVisible(true);
                                        this.cnr1.setVisible(true);
                                        this.ref1.setVisible(true);
                                        this.nom1.setVisible(true);
                                        this.rab1.setVisible(true);
                                        this.Mont1.setVisible(true);
                                        this.dated1.setVisible(true);
                                        this.datef1.setVisible(true);
                                        continue;
                                    }
                                    if (i == 2) {
                                        this.ne2.setText(" " + i);
                                        this.cnr2.setText(cnr);
                                        this.ref2.setText(ref);
                                        this.nom2.setText(Nom);
                                        this.rab2.setText(mparmois);
                                        this.Mont2.setText(total);
                                        this.dated2.setText(this.moiactueleenlettre);
                                        this.datef2.setText(this.moia);
                                        this.ne2.setVisible(true);
                                        this.cnr2.setVisible(true);
                                        this.ref2.setVisible(true);
                                        this.nom2.setVisible(true);
                                        this.rab2.setVisible(true);
                                        this.Mont2.setVisible(true);
                                        this.dated2.setVisible(true);
                                        this.datef2.setVisible(true);
                                        continue;
                                    }
                                    if (i == 3) {
                                        this.ne3.setText(" " + i);
                                        this.cnr3.setText(cnr);
                                        this.ref3.setText(ref);
                                        this.nom3.setText(Nom);
                                        this.rab3.setText(mparmois);
                                        this.Mont3.setText(total);
                                        this.dated3.setText(this.moiactueleenlettre);
                                        this.datef3.setText(this.moia);
                                        this.ne3.setVisible(true);
                                        this.cnr3.setVisible(true);
                                        this.ref3.setVisible(true);
                                        this.nom3.setVisible(true);
                                        this.rab3.setVisible(true);
                                        this.Mont3.setVisible(true);
                                        this.dated3.setVisible(true);
                                        this.datef3.setVisible(true);
                                        continue;
                                    }
                                    if (i == 4) {
                                        this.ne4.setText(" " + i);
                                        this.cnr4.setText(cnr);
                                        this.ref4.setText(ref);
                                        this.nom4.setText(Nom);
                                        this.rab4.setText(mparmois);
                                        this.Mont4.setText(total);
                                        this.dated4.setText(this.moiactueleenlettre);
                                        this.datef4.setText(this.moia);
                                        this.ne4.setVisible(true);
                                        this.cnr4.setVisible(true);
                                        this.ref4.setVisible(true);
                                        this.nom4.setVisible(true);
                                        this.rab4.setVisible(true);
                                        this.Mont4.setVisible(true);
                                        this.dated4.setVisible(true);
                                        this.datef4.setVisible(true);
                                        continue;
                                    }
                                    if (i == 5) {
                                        this.ne5.setText(" " + i);
                                        this.cnr5.setText(cnr);
                                        this.ref5.setText(ref);
                                        this.nom5.setText(Nom);
                                        this.rab5.setText(mparmois);
                                        this.Mont5.setText(total);
                                        this.dated5.setText(this.moiactueleenlettre);
                                        this.datef5.setText(this.moia);
                                        this.ne5.setVisible(true);
                                        this.cnr5.setVisible(true);
                                        this.ref5.setVisible(true);
                                        this.nom5.setVisible(true);
                                        this.rab5.setVisible(true);
                                        this.Mont5.setVisible(true);
                                        this.dated5.setVisible(true);
                                        this.datef5.setVisible(true);
                                        continue;
                                    }
                                    if (i == 6) {
                                        this.ne6.setText(" " + i);
                                        this.cnr6.setText(cnr);
                                        this.ref6.setText(ref);
                                        this.nom6.setText(Nom);
                                        this.rab6.setText(mparmois);
                                        this.Mont6.setText(total);
                                        this.dated6.setText(this.moiactueleenlettre);
                                        this.datef6.setText(this.moia);
                                        this.ne6.setVisible(true);
                                        this.cnr6.setVisible(true);
                                        this.ref6.setVisible(true);
                                        this.nom6.setVisible(true);
                                        this.rab6.setVisible(true);
                                        this.Mont6.setVisible(true);
                                        this.dated6.setVisible(true);
                                        this.datef6.setVisible(true);
                                        continue;
                                    }
                                    if (i == 7) {
                                        this.ne7.setText(" " + i);
                                        this.cnr7.setText(cnr);
                                        this.ref7.setText(ref);
                                        this.nom7.setText(Nom);
                                        this.rab7.setText(mparmois);
                                        this.Mont7.setText(total);
                                        this.dated7.setText(this.moiactueleenlettre);
                                        this.datef7.setText(this.moia);
                                        this.ne7.setVisible(true);
                                        this.cnr7.setVisible(true);
                                        this.ref7.setVisible(true);
                                        this.nom7.setVisible(true);
                                        this.rab7.setVisible(true);
                                        this.Mont7.setVisible(true);
                                        this.dated7.setVisible(true);
                                        this.datef7.setVisible(true);
                                        continue;
                                    }
                                    if (i == 8) {
                                        this.ne8.setText(" " + i);
                                        this.cnr8.setText(cnr);
                                        this.ref8.setText(ref);
                                        this.nom8.setText(Nom);
                                        this.rab8.setText(mparmois);
                                        this.Mont8.setText(total);
                                        this.dated8.setText(this.moiactueleenlettre);
                                        this.datef8.setText(this.moia);
                                        this.ne8.setVisible(true);
                                        this.cnr8.setVisible(true);
                                        this.ref8.setVisible(true);
                                        this.nom8.setVisible(true);
                                        this.rab8.setVisible(true);
                                        this.Mont8.setVisible(true);
                                        this.dated8.setVisible(true);
                                        this.datef8.setVisible(true);
                                        continue;
                                    }
                                    if (i == 9) {
                                        this.ne9.setText(" " + i);
                                        this.cnr9.setText(cnr);
                                        this.ref9.setText(ref);
                                        this.nom9.setText(Nom);
                                        this.rab9.setText(mparmois);
                                        this.Mont9.setText(total);
                                        this.dated9.setText(this.moiactueleenlettre);
                                        this.datef9.setText(this.moia);
                                        this.ne9.setVisible(true);
                                        this.cnr9.setVisible(true);
                                        this.ref9.setVisible(true);
                                        this.nom9.setVisible(true);
                                        this.rab9.setVisible(true);
                                        this.Mont9.setVisible(true);
                                        this.dated9.setVisible(true);
                                        this.datef9.setVisible(true);
                                        continue;
                                    }
                                    if (i == 10) {
                                        this.ne10.setText(" " + i);
                                        this.cnr10.setText(cnr);
                                        this.ref10.setText(ref);
                                        this.nom10.setText(Nom);
                                        this.rab10.setText(mparmois);
                                        this.Mont10.setText(total);
                                        this.dated10.setText(this.moiactueleenlettre);
                                        this.datef10.setText(this.moia);
                                        this.ne10.setVisible(true);
                                        this.cnr10.setVisible(true);
                                        this.ref10.setVisible(true);
                                        this.nom10.setVisible(true);
                                        this.rab10.setVisible(true);
                                        this.Mont10.setVisible(true);
                                        this.dated10.setVisible(true);
                                        this.datef10.setVisible(true);
                                        continue;
                                    }
                                    if (i == 11) {
                                        this.ne11.setText(" " + i);
                                        this.cnr11.setText(cnr);
                                        this.ref11.setText(ref);
                                        this.nom11.setText(Nom);
                                        this.rab11.setText(mparmois);
                                        this.Mont11.setText(total);
                                        this.dated11.setText(this.moiactueleenlettre);
                                        this.datef11.setText(this.moia);
                                        this.ne11.setVisible(true);
                                        this.cnr11.setVisible(true);
                                        this.ref11.setVisible(true);
                                        this.nom11.setVisible(true);
                                        this.rab11.setVisible(true);
                                        this.Mont11.setVisible(true);
                                        this.dated11.setVisible(true);
                                        this.datef11.setVisible(true);
                                        continue;
                                    }
                                    if (i == 12) {
                                        this.ne12.setText(" " + i);
                                        this.cnr12.setText(cnr);
                                        this.ref12.setText(ref);
                                        this.nom12.setText(Nom);
                                        this.rab12.setText(mparmois);
                                        this.Mont12.setText(total);
                                        this.dated12.setText(this.moiactueleenlettre);
                                        this.datef12.setText(this.moia);
                                        this.ne12.setVisible(true);
                                        this.cnr12.setVisible(true);
                                        this.ref12.setVisible(true);
                                        this.nom12.setVisible(true);
                                        this.rab12.setVisible(true);
                                        this.Mont12.setVisible(true);
                                        this.dated12.setVisible(true);
                                        this.datef12.setVisible(true);
                                        continue;
                                    }
                                    if (i == 13) {
                                        this.ne13.setText(" " + i);
                                        this.cnr13.setText(cnr);
                                        this.ref13.setText(ref);
                                        this.nom13.setText(Nom);
                                        this.rab13.setText(mparmois);
                                        this.Mont13.setText(total);
                                        this.dated13.setText(this.moiactueleenlettre);
                                        this.datef13.setText(this.moia);
                                        this.ne13.setVisible(true);
                                        this.cnr13.setVisible(true);
                                        this.ref13.setVisible(true);
                                        this.nom13.setVisible(true);
                                        this.rab13.setVisible(true);
                                        this.Mont13.setVisible(true);
                                        this.dated13.setVisible(true);
                                        this.datef13.setVisible(true);
                                        continue;
                                    }
                                    if (i == 14) {
                                        this.ne14.setText(" " + i);
                                        this.cnr14.setText(cnr);
                                        this.ref14.setText(ref);
                                        this.nom14.setText(Nom);
                                        this.rab14.setText(mparmois);
                                        this.Mont14.setText(total);
                                        this.dated14.setText(this.moiactueleenlettre);
                                        this.datef14.setText(this.moia);
                                        this.ne14.setVisible(true);
                                        this.cnr14.setVisible(true);
                                        this.ref14.setVisible(true);
                                        this.nom14.setVisible(true);
                                        this.rab14.setVisible(true);
                                        this.Mont14.setVisible(true);
                                        this.dated14.setVisible(true);
                                        this.datef14.setVisible(true);
                                        continue;
                                    }
                                    if (i != 15) continue;
                                    this.ne15.setText(" " + i);
                                    this.cnr15.setText(cnr);
                                    this.ref15.setText(ref);
                                    this.nom15.setText(Nom);
                                    this.rab15.setText(mparmois);
                                    this.Mont15.setText(total);
                                    this.dated15.setText(this.moiactueleenlettre);
                                    this.datef15.setText(this.moia);
                                    this.ne15.setVisible(true);
                                    this.cnr15.setVisible(true);
                                    this.ref15.setVisible(true);
                                    this.nom15.setVisible(true);
                                    this.rab15.setVisible(true);
                                    this.Mont15.setVisible(true);
                                    this.dated15.setVisible(true);
                                    this.datef15.setVisible(true);
                                }
                                if (k == 0) {
                                    JOptionPane jop2 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                JOptionPane jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                            JOptionPane.showMessageDialog(null, "Attention :  Impression De l'etat ", "Information", 1);
                            Impression1 secee = new Impression1(this.jPanel3);
                            secee.actionPerformed(evt);
                        }
                    } else if (mode == 2) {
                        if (minist\u00e9re == 1) {
                            this.mini.setText("Ministt\u00e9re de la Sant\u00e9 TUNIS");
                            String mec = "";
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state = conn4.createStatement();
                                DefaultTableModel dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                String ii = "0";
                                ResultSet result3 = state.executeQuery("SELECT * FROM cession2  WHERE premiermois='" + this.moiactueleenlettre + "' AND i='" + ii + "'");
                                int k = 0;
                                int i = 0;
                                String lieutrvaille = "";
                                String travaille = "";
                                while (result3.next()) {
                                    if (i < 15) {
                                        mec = result3.getString("Mecano");
                                        System.out.println("mecano =" + mec);
                                    }
                                    ++k;
                                    String cnr = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement state3 = conn3.createStatement();
                                        ResultSet result4 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mec);
                                        while (result4.next()) {
                                            cnr = result4.getString("NCNR");
                                            travaille = result4.getString("TRVAIL");
                                            lieutrvaille = result4.getString("LIEUTRAVAIL");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur booo  " + e.getMessage());
                                    }
                                    System.out.println("-------------------------------------");
                                    int j = lieutrvaille.indexOf("SFAR");
                                    System.out.println("lieu de travaille =" + lieutrvaille);
                                    System.out.println("j =" + j);
                                    System.out.println("cadre de travaille =" + travaille);
                                    boolean jj = travaille.equals("Ouvrier");
                                    System.out.println("jj =" + jj);
                                    boolean test = true;
                                    if (jj && j > -1) {
                                        test = false;
                                    }
                                    if (!test) continue;
                                    ++i;
                                    try {
                                        k = 1;
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection connm = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement statem = connm.createStatement();
                                        String lk = "1";
                                        statem.executeUpdate("UPDATE cession2 SET i='1' WHERE MECANO='" + mec + "' AND premiermois='" + this.moiactueleenlettre + "'");
                                    }
                                    catch (Exception e) {
                                        k = 0;
                                        JOptionPane jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur modif **: " + e.getMessage());
                                    }
                                    String Nom = result3.getString("Nom");
                                    System.out.println("Nom =" + Nom);
                                    String ref = result3.getString("ref");
                                    String mparmois = result3.getString("montantparmois");
                                    String total = result3.getString("Montant");
                                    total = total.substring(0, total.length() - 3);
                                    total = total + ",000";
                                    String pm = result3.getString("premiermois");
                                    String andebut = pm.substring(pm.length() - 4, pm.length());
                                    pm = pm.substring(0, pm.length() - 6);
                                    System.out.println("pm =" + pm);
                                    this.moiactueleenlettre = pm.equals("Janvier") ? "01" : (pm.equals("F\u00e9vrier") ? "02" : (pm.equals("Mars") ? "03" : (pm.equals("Avril") ? "04" : (pm.equals("Mai") ? "05" : (pm.equals("Juin") ? "06" : (pm.equals("Juillet") ? "07" : (pm.equals("Ao\u00fbt") ? "08" : (pm.equals("Septembre") ? "09" : (pm.equals("Octobre") ? "10" : (pm.equals("Novembre") ? "11" : (pm.equals("D\u00e9cembre") ? "12" : "!!!!!!!!!!!")))))))))));
                                    System.out.println("moi et anne debut = " + this.moiactueleenlettre + "/" + andebut);
                                    this.moiactueleenlettre = this.moiactueleenlettre + "/" + andebut;
                                    String dm = result3.getString("derniermois");
                                    String anfin = dm.substring(dm.length() - 4, dm.length());
                                    dm = dm.substring(0, dm.length() - 6);
                                    this.moia = dm.equals("Janvier") ? "01" : (dm.equals("F\u00e9vrier") ? "02" : (dm.equals("Mars") ? "03" : (dm.equals("Avril") ? "04" : (dm.equals("Mai") ? "05" : (dm.equals("Juin") ? "06" : (dm.equals("Juillet") ? "07" : (dm.equals("Ao\u00fbt") ? "08" : (dm.equals("Septembre") ? "09" : (dm.equals("Octobre") ? "10" : (dm.equals("Novembre") ? "11" : (dm.equals("D\u00e9cembre") ? "12" : "!!!!!!!!!!!")))))))))));
                                    this.moia = this.moia + "/" + anfin;
                                    System.out.println("moi et anne FIN = " + this.moia);
                                    System.out.println("i =" + i);
                                    if (i == 1) {
                                        System.out.println("i =" + i);
                                        this.ne1.setText(" " + i);
                                        this.cnr1.setText(cnr);
                                        this.ref1.setText(ref);
                                        this.nom1.setText(Nom);
                                        this.rab1.setText(mparmois);
                                        this.Mont1.setText(total);
                                        this.dated1.setText(this.moiactueleenlettre);
                                        this.datef1.setText(this.moia);
                                        this.ne1.setVisible(true);
                                        this.cnr1.setVisible(true);
                                        this.ref1.setVisible(true);
                                        this.nom1.setVisible(true);
                                        this.rab1.setVisible(true);
                                        this.Mont1.setVisible(true);
                                        this.dated1.setVisible(true);
                                        this.datef1.setVisible(true);
                                        continue;
                                    }
                                    if (i == 2) {
                                        this.ne2.setText(" " + i);
                                        this.cnr2.setText(cnr);
                                        this.ref2.setText(ref);
                                        this.nom2.setText(Nom);
                                        this.rab2.setText(mparmois);
                                        this.Mont2.setText(total);
                                        this.dated2.setText(this.moiactueleenlettre);
                                        this.datef2.setText(this.moia);
                                        this.ne2.setVisible(true);
                                        this.cnr2.setVisible(true);
                                        this.ref2.setVisible(true);
                                        this.nom2.setVisible(true);
                                        this.rab2.setVisible(true);
                                        this.Mont2.setVisible(true);
                                        this.dated2.setVisible(true);
                                        this.datef2.setVisible(true);
                                        continue;
                                    }
                                    if (i == 3) {
                                        this.ne3.setText(" " + i);
                                        this.cnr3.setText(cnr);
                                        this.ref3.setText(ref);
                                        this.nom3.setText(Nom);
                                        this.rab3.setText(mparmois);
                                        this.Mont3.setText(total);
                                        this.dated3.setText(this.moiactueleenlettre);
                                        this.datef3.setText(this.moia);
                                        this.ne3.setVisible(true);
                                        this.cnr3.setVisible(true);
                                        this.ref3.setVisible(true);
                                        this.nom3.setVisible(true);
                                        this.rab3.setVisible(true);
                                        this.Mont3.setVisible(true);
                                        this.dated3.setVisible(true);
                                        this.datef3.setVisible(true);
                                        continue;
                                    }
                                    if (i == 4) {
                                        this.ne4.setText(" " + i);
                                        this.cnr4.setText(cnr);
                                        this.ref4.setText(ref);
                                        this.nom4.setText(Nom);
                                        this.rab4.setText(mparmois);
                                        this.Mont4.setText(total);
                                        this.dated4.setText(this.moiactueleenlettre);
                                        this.datef4.setText(this.moia);
                                        this.ne4.setVisible(true);
                                        this.cnr4.setVisible(true);
                                        this.ref4.setVisible(true);
                                        this.nom4.setVisible(true);
                                        this.rab4.setVisible(true);
                                        this.Mont4.setVisible(true);
                                        this.dated4.setVisible(true);
                                        this.datef4.setVisible(true);
                                        continue;
                                    }
                                    if (i == 5) {
                                        this.ne5.setText(" " + i);
                                        this.cnr5.setText(cnr);
                                        this.ref5.setText(ref);
                                        this.nom5.setText(Nom);
                                        this.rab5.setText(mparmois);
                                        this.Mont5.setText(total);
                                        this.dated5.setText(this.moiactueleenlettre);
                                        this.datef5.setText(this.moia);
                                        this.ne5.setVisible(true);
                                        this.cnr5.setVisible(true);
                                        this.ref5.setVisible(true);
                                        this.nom5.setVisible(true);
                                        this.rab5.setVisible(true);
                                        this.Mont5.setVisible(true);
                                        this.dated5.setVisible(true);
                                        this.datef5.setVisible(true);
                                        continue;
                                    }
                                    if (i == 6) {
                                        this.ne6.setText(" " + i);
                                        this.cnr6.setText(cnr);
                                        this.ref6.setText(ref);
                                        this.nom6.setText(Nom);
                                        this.rab6.setText(mparmois);
                                        this.Mont6.setText(total);
                                        this.dated6.setText(this.moiactueleenlettre);
                                        this.datef6.setText(this.moia);
                                        this.ne6.setVisible(true);
                                        this.cnr6.setVisible(true);
                                        this.ref6.setVisible(true);
                                        this.nom6.setVisible(true);
                                        this.rab6.setVisible(true);
                                        this.Mont6.setVisible(true);
                                        this.dated6.setVisible(true);
                                        this.datef6.setVisible(true);
                                        continue;
                                    }
                                    if (i == 7) {
                                        this.ne7.setText(" " + i);
                                        this.cnr7.setText(cnr);
                                        this.ref7.setText(ref);
                                        this.nom7.setText(Nom);
                                        this.rab7.setText(mparmois);
                                        this.Mont7.setText(total);
                                        this.dated7.setText(this.moiactueleenlettre);
                                        this.datef7.setText(this.moia);
                                        this.ne7.setVisible(true);
                                        this.cnr7.setVisible(true);
                                        this.ref7.setVisible(true);
                                        this.nom7.setVisible(true);
                                        this.rab7.setVisible(true);
                                        this.Mont7.setVisible(true);
                                        this.dated7.setVisible(true);
                                        this.datef7.setVisible(true);
                                        continue;
                                    }
                                    if (i == 8) {
                                        this.ne8.setText(" " + i);
                                        this.cnr8.setText(cnr);
                                        this.ref8.setText(ref);
                                        this.nom8.setText(Nom);
                                        this.rab8.setText(mparmois);
                                        this.Mont8.setText(total);
                                        this.dated8.setText(this.moiactueleenlettre);
                                        this.datef8.setText(this.moia);
                                        this.ne8.setVisible(true);
                                        this.cnr8.setVisible(true);
                                        this.ref8.setVisible(true);
                                        this.nom8.setVisible(true);
                                        this.rab8.setVisible(true);
                                        this.Mont8.setVisible(true);
                                        this.dated8.setVisible(true);
                                        this.datef8.setVisible(true);
                                        continue;
                                    }
                                    if (i == 9) {
                                        this.ne9.setText(" " + i);
                                        this.cnr9.setText(cnr);
                                        this.ref9.setText(ref);
                                        this.nom9.setText(Nom);
                                        this.rab9.setText(mparmois);
                                        this.Mont9.setText(total);
                                        this.dated9.setText(this.moiactueleenlettre);
                                        this.datef9.setText(this.moia);
                                        this.ne9.setVisible(true);
                                        this.cnr9.setVisible(true);
                                        this.ref9.setVisible(true);
                                        this.nom9.setVisible(true);
                                        this.rab9.setVisible(true);
                                        this.Mont9.setVisible(true);
                                        this.dated9.setVisible(true);
                                        this.datef9.setVisible(true);
                                        continue;
                                    }
                                    if (i == 10) {
                                        this.ne10.setText(" " + i);
                                        this.cnr10.setText(cnr);
                                        this.ref10.setText(ref);
                                        this.nom10.setText(Nom);
                                        this.rab10.setText(mparmois);
                                        this.Mont10.setText(total);
                                        this.dated10.setText(this.moiactueleenlettre);
                                        this.datef10.setText(this.moia);
                                        this.ne10.setVisible(true);
                                        this.cnr10.setVisible(true);
                                        this.ref10.setVisible(true);
                                        this.nom10.setVisible(true);
                                        this.rab10.setVisible(true);
                                        this.Mont10.setVisible(true);
                                        this.dated10.setVisible(true);
                                        this.datef10.setVisible(true);
                                        continue;
                                    }
                                    if (i == 11) {
                                        this.ne11.setText(" " + i);
                                        this.cnr11.setText(cnr);
                                        this.ref11.setText(ref);
                                        this.nom11.setText(Nom);
                                        this.rab11.setText(mparmois);
                                        this.Mont11.setText(total);
                                        this.dated11.setText(this.moiactueleenlettre);
                                        this.datef11.setText(this.moia);
                                        this.ne11.setVisible(true);
                                        this.cnr11.setVisible(true);
                                        this.ref11.setVisible(true);
                                        this.nom11.setVisible(true);
                                        this.rab11.setVisible(true);
                                        this.Mont11.setVisible(true);
                                        this.dated11.setVisible(true);
                                        this.datef11.setVisible(true);
                                        continue;
                                    }
                                    if (i == 12) {
                                        this.ne12.setText(" " + i);
                                        this.cnr12.setText(cnr);
                                        this.ref12.setText(ref);
                                        this.nom12.setText(Nom);
                                        this.rab12.setText(mparmois);
                                        this.Mont12.setText(total);
                                        this.dated12.setText(this.moiactueleenlettre);
                                        this.datef12.setText(this.moia);
                                        this.ne12.setVisible(true);
                                        this.cnr12.setVisible(true);
                                        this.ref12.setVisible(true);
                                        this.nom12.setVisible(true);
                                        this.rab12.setVisible(true);
                                        this.Mont12.setVisible(true);
                                        this.dated12.setVisible(true);
                                        this.datef12.setVisible(true);
                                        continue;
                                    }
                                    if (i == 13) {
                                        this.ne13.setText(" " + i);
                                        this.cnr13.setText(cnr);
                                        this.ref13.setText(ref);
                                        this.nom13.setText(Nom);
                                        this.rab13.setText(mparmois);
                                        this.Mont13.setText(total);
                                        this.dated13.setText(this.moiactueleenlettre);
                                        this.datef13.setText(this.moia);
                                        this.ne13.setVisible(true);
                                        this.cnr13.setVisible(true);
                                        this.ref13.setVisible(true);
                                        this.nom13.setVisible(true);
                                        this.rab13.setVisible(true);
                                        this.Mont13.setVisible(true);
                                        this.dated13.setVisible(true);
                                        this.datef13.setVisible(true);
                                        continue;
                                    }
                                    if (i == 14) {
                                        this.ne14.setText(" " + i);
                                        this.cnr14.setText(cnr);
                                        this.ref14.setText(ref);
                                        this.nom14.setText(Nom);
                                        this.rab14.setText(mparmois);
                                        this.Mont14.setText(total);
                                        this.dated14.setText(this.moiactueleenlettre);
                                        this.datef14.setText(this.moia);
                                        this.ne14.setVisible(true);
                                        this.cnr14.setVisible(true);
                                        this.ref14.setVisible(true);
                                        this.nom14.setVisible(true);
                                        this.rab14.setVisible(true);
                                        this.Mont14.setVisible(true);
                                        this.dated14.setVisible(true);
                                        this.datef14.setVisible(true);
                                        continue;
                                    }
                                    if (i != 15) continue;
                                    this.ne15.setText(" " + i);
                                    this.cnr15.setText(cnr);
                                    this.ref15.setText(ref);
                                    this.nom15.setText(Nom);
                                    this.rab15.setText(mparmois);
                                    this.Mont15.setText(total);
                                    this.dated15.setText(this.moiactueleenlettre);
                                    this.datef15.setText(this.moia);
                                    this.ne15.setVisible(true);
                                    this.cnr15.setVisible(true);
                                    this.ref15.setVisible(true);
                                    this.nom15.setVisible(true);
                                    this.rab15.setVisible(true);
                                    this.Mont15.setVisible(true);
                                    this.dated15.setVisible(true);
                                    this.datef15.setVisible(true);
                                }
                                if (k == 0) {
                                    JOptionPane jop2 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                JOptionPane jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                            JOptionPane.showMessageDialog(null, "Attention :  Impression De l'etat ", "Information", 1);
                            Impression1 secee = new Impression1(this.jPanel3);
                            secee.actionPerformed(evt);
                        } else if (minist\u00e9re == 2) {
                            this.mini.setText("Direction Regionale MAHDIA");
                            String mec = "";
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state = conn5.createStatement();
                                DefaultTableModel dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                ResultSet result3 = state.executeQuery("SELECT * FROM cession2  WHERE premiermois='" + this.moiactueleenlettre + "'");
                                int k = 0;
                                int i = 0;
                                String lieutrvaille = "";
                                String travaille = "";
                                while (result3.next()) {
                                    if (i < 15) {
                                        mec = result3.getString("Mecano");
                                        System.out.println("mecano =" + mec);
                                    }
                                    ++k;
                                    String cnr = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement state3 = conn3.createStatement();
                                        ResultSet result4 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mec);
                                        while (result4.next()) {
                                            cnr = result4.getString("NCNR");
                                            travaille = result4.getString("TRVAIL");
                                            lieutrvaille = result4.getString("LIEUTRAVAIL");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                                    }
                                    System.out.println("-------------------------------------");
                                    int j = lieutrvaille.indexOf("SFAR");
                                    System.out.println("lieu de travaille =" + lieutrvaille);
                                    System.out.println("j =" + j);
                                    System.out.println("cadre de travaille =" + travaille);
                                    boolean jj = travaille.equals("Ouvrier");
                                    System.out.println("jj =" + jj);
                                    if (!travaille.equals("Ouvrier") || j == -1) continue;
                                    ++i;
                                    try {
                                        k = 1;
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection connm = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement statem = connm.createStatement();
                                        String lk = "1";
                                        statem.executeUpdate("UPDATE cession2 SET i='1' WHERE MECANO='" + mec + "' AND premiermois='" + this.moiactueleenlettre + "'");
                                    }
                                    catch (Exception e) {
                                        k = 0;
                                        JOptionPane jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur modif **: " + e.getMessage());
                                    }
                                    String Nom = result3.getString("Nom");
                                    System.out.println("Nom =" + Nom);
                                    String ref = result3.getString("ref");
                                    String mparmois = result3.getString("montantparmois");
                                    String total = result3.getString("Montant");
                                    total = total.substring(0, total.length() - 3);
                                    total = total + ",000";
                                    String pm = result3.getString("premiermois");
                                    String andebut = pm.substring(pm.length() - 4, pm.length());
                                    pm = pm.substring(0, pm.length() - 6);
                                    System.out.println("pm =" + pm);
                                    this.moiactueleenlettre = pm.equals("Janvier") ? "01" : (pm.equals("F\u00e9vrier") ? "02" : (pm.equals("Mars") ? "03" : (pm.equals("Avril") ? "04" : (pm.equals("Mai") ? "05" : (pm.equals("Juin") ? "06" : (pm.equals("Juillet") ? "07" : (pm.equals("Ao\u00fbt") ? "08" : (pm.equals("Septembre") ? "09" : (pm.equals("Octobre") ? "10" : (pm.equals("Novembre") ? "11" : (pm.equals("D\u00e9cembre") ? "12" : "!!!!!!!!!!!")))))))))));
                                    System.out.println("moi et anne debut = " + this.moiactueleenlettre + "/" + andebut);
                                    this.moiactueleenlettre = this.moiactueleenlettre + "/" + andebut;
                                    String dm = result3.getString("derniermois");
                                    String anfin = dm.substring(dm.length() - 4, dm.length());
                                    dm = dm.substring(0, dm.length() - 6);
                                    this.moia = dm.equals("Janvier") ? "01" : (dm.equals("F\u00e9vrier") ? "02" : (dm.equals("Mars") ? "03" : (dm.equals("Avril") ? "04" : (dm.equals("Mai") ? "05" : (dm.equals("Juin") ? "06" : (dm.equals("Juillet") ? "07" : (dm.equals("Ao\u00fbt") ? "08" : (dm.equals("Septembre") ? "09" : (dm.equals("Octobre") ? "10" : (dm.equals("Novembre") ? "11" : (dm.equals("D\u00e9cembre") ? "12" : "!!!!!!!!!!!")))))))))));
                                    this.moia = this.moia + "/" + anfin;
                                    System.out.println("moi et anne FIN = " + this.moia);
                                    System.out.println("i =" + i);
                                    if (i == 1) {
                                        System.out.println("i =" + i);
                                        this.ne1.setText(" " + i);
                                        this.cnr1.setText(cnr);
                                        this.ref1.setText(ref);
                                        this.nom1.setText(Nom);
                                        this.rab1.setText(mparmois);
                                        this.Mont1.setText(total);
                                        this.dated1.setText(this.moiactueleenlettre);
                                        this.datef1.setText(this.moia);
                                        this.ne1.setVisible(true);
                                        this.cnr1.setVisible(true);
                                        this.ref1.setVisible(true);
                                        this.nom1.setVisible(true);
                                        this.rab1.setVisible(true);
                                        this.Mont1.setVisible(true);
                                        this.dated1.setVisible(true);
                                        this.datef1.setVisible(true);
                                        continue;
                                    }
                                    if (i == 2) {
                                        this.ne2.setText(" " + i);
                                        this.cnr2.setText(cnr);
                                        this.ref2.setText(ref);
                                        this.nom2.setText(Nom);
                                        this.rab2.setText(mparmois);
                                        this.Mont2.setText(total);
                                        this.dated2.setText(this.moiactueleenlettre);
                                        this.datef2.setText(this.moia);
                                        this.ne2.setVisible(true);
                                        this.cnr2.setVisible(true);
                                        this.ref2.setVisible(true);
                                        this.nom2.setVisible(true);
                                        this.rab2.setVisible(true);
                                        this.Mont2.setVisible(true);
                                        this.dated2.setVisible(true);
                                        this.datef2.setVisible(true);
                                        continue;
                                    }
                                    if (i == 3) {
                                        this.ne3.setText(" " + i);
                                        this.cnr3.setText(cnr);
                                        this.ref3.setText(ref);
                                        this.nom3.setText(Nom);
                                        this.rab3.setText(mparmois);
                                        this.Mont3.setText(total);
                                        this.dated3.setText(this.moiactueleenlettre);
                                        this.datef3.setText(this.moia);
                                        this.ne3.setVisible(true);
                                        this.cnr3.setVisible(true);
                                        this.ref3.setVisible(true);
                                        this.nom3.setVisible(true);
                                        this.rab3.setVisible(true);
                                        this.Mont3.setVisible(true);
                                        this.dated3.setVisible(true);
                                        this.datef3.setVisible(true);
                                        continue;
                                    }
                                    if (i == 4) {
                                        this.ne4.setText(" " + i);
                                        this.cnr4.setText(cnr);
                                        this.ref4.setText(ref);
                                        this.nom4.setText(Nom);
                                        this.rab4.setText(mparmois);
                                        this.Mont4.setText(total);
                                        this.dated4.setText(this.moiactueleenlettre);
                                        this.datef4.setText(this.moia);
                                        this.ne4.setVisible(true);
                                        this.cnr4.setVisible(true);
                                        this.ref4.setVisible(true);
                                        this.nom4.setVisible(true);
                                        this.rab4.setVisible(true);
                                        this.Mont4.setVisible(true);
                                        this.dated4.setVisible(true);
                                        this.datef4.setVisible(true);
                                        continue;
                                    }
                                    if (i == 5) {
                                        this.ne5.setText(" " + i);
                                        this.cnr5.setText(cnr);
                                        this.ref5.setText(ref);
                                        this.nom5.setText(Nom);
                                        this.rab5.setText(mparmois);
                                        this.Mont5.setText(total);
                                        this.dated5.setText(this.moiactueleenlettre);
                                        this.datef5.setText(this.moia);
                                        this.ne5.setVisible(true);
                                        this.cnr5.setVisible(true);
                                        this.ref5.setVisible(true);
                                        this.nom5.setVisible(true);
                                        this.rab5.setVisible(true);
                                        this.Mont5.setVisible(true);
                                        this.dated5.setVisible(true);
                                        this.datef5.setVisible(true);
                                        continue;
                                    }
                                    if (i == 6) {
                                        this.ne6.setText(" " + i);
                                        this.cnr6.setText(cnr);
                                        this.ref6.setText(ref);
                                        this.nom6.setText(Nom);
                                        this.rab6.setText(mparmois);
                                        this.Mont6.setText(total);
                                        this.dated6.setText(this.moiactueleenlettre);
                                        this.datef6.setText(this.moia);
                                        this.ne6.setVisible(true);
                                        this.cnr6.setVisible(true);
                                        this.ref6.setVisible(true);
                                        this.nom6.setVisible(true);
                                        this.rab6.setVisible(true);
                                        this.Mont6.setVisible(true);
                                        this.dated6.setVisible(true);
                                        this.datef6.setVisible(true);
                                        continue;
                                    }
                                    if (i == 7) {
                                        this.ne7.setText(" " + i);
                                        this.cnr7.setText(cnr);
                                        this.ref7.setText(ref);
                                        this.nom7.setText(Nom);
                                        this.rab7.setText(mparmois);
                                        this.Mont7.setText(total);
                                        this.dated7.setText(this.moiactueleenlettre);
                                        this.datef7.setText(this.moia);
                                        this.ne7.setVisible(true);
                                        this.cnr7.setVisible(true);
                                        this.ref7.setVisible(true);
                                        this.nom7.setVisible(true);
                                        this.rab7.setVisible(true);
                                        this.Mont7.setVisible(true);
                                        this.dated7.setVisible(true);
                                        this.datef7.setVisible(true);
                                        continue;
                                    }
                                    if (i == 8) {
                                        this.ne8.setText(" " + i);
                                        this.cnr8.setText(cnr);
                                        this.ref8.setText(ref);
                                        this.nom8.setText(Nom);
                                        this.rab8.setText(mparmois);
                                        this.Mont8.setText(total);
                                        this.dated8.setText(this.moiactueleenlettre);
                                        this.datef8.setText(this.moia);
                                        this.ne8.setVisible(true);
                                        this.cnr8.setVisible(true);
                                        this.ref8.setVisible(true);
                                        this.nom8.setVisible(true);
                                        this.rab8.setVisible(true);
                                        this.Mont8.setVisible(true);
                                        this.dated8.setVisible(true);
                                        this.datef8.setVisible(true);
                                        continue;
                                    }
                                    if (i == 9) {
                                        this.ne9.setText(" " + i);
                                        this.cnr9.setText(cnr);
                                        this.ref9.setText(ref);
                                        this.nom9.setText(Nom);
                                        this.rab9.setText(mparmois);
                                        this.Mont9.setText(total);
                                        this.dated9.setText(this.moiactueleenlettre);
                                        this.datef9.setText(this.moia);
                                        this.ne9.setVisible(true);
                                        this.cnr9.setVisible(true);
                                        this.ref9.setVisible(true);
                                        this.nom9.setVisible(true);
                                        this.rab9.setVisible(true);
                                        this.Mont9.setVisible(true);
                                        this.dated9.setVisible(true);
                                        this.datef9.setVisible(true);
                                        continue;
                                    }
                                    if (i == 10) {
                                        this.ne10.setText(" " + i);
                                        this.cnr10.setText(cnr);
                                        this.ref10.setText(ref);
                                        this.nom10.setText(Nom);
                                        this.rab10.setText(mparmois);
                                        this.Mont10.setText(total);
                                        this.dated10.setText(this.moiactueleenlettre);
                                        this.datef10.setText(this.moia);
                                        this.ne10.setVisible(true);
                                        this.cnr10.setVisible(true);
                                        this.ref10.setVisible(true);
                                        this.nom10.setVisible(true);
                                        this.rab10.setVisible(true);
                                        this.Mont10.setVisible(true);
                                        this.dated10.setVisible(true);
                                        this.datef10.setVisible(true);
                                        continue;
                                    }
                                    if (i == 11) {
                                        this.ne11.setText(" " + i);
                                        this.cnr11.setText(cnr);
                                        this.ref11.setText(ref);
                                        this.nom11.setText(Nom);
                                        this.rab11.setText(mparmois);
                                        this.Mont11.setText(total);
                                        this.dated11.setText(this.moiactueleenlettre);
                                        this.datef11.setText(this.moia);
                                        this.ne11.setVisible(true);
                                        this.cnr11.setVisible(true);
                                        this.ref11.setVisible(true);
                                        this.nom11.setVisible(true);
                                        this.rab11.setVisible(true);
                                        this.Mont11.setVisible(true);
                                        this.dated11.setVisible(true);
                                        this.datef11.setVisible(true);
                                        continue;
                                    }
                                    if (i == 12) {
                                        this.ne12.setText(" " + i);
                                        this.cnr12.setText(cnr);
                                        this.ref12.setText(ref);
                                        this.nom12.setText(Nom);
                                        this.rab12.setText(mparmois);
                                        this.Mont12.setText(total);
                                        this.dated12.setText(this.moiactueleenlettre);
                                        this.datef12.setText(this.moia);
                                        this.ne12.setVisible(true);
                                        this.cnr12.setVisible(true);
                                        this.ref12.setVisible(true);
                                        this.nom12.setVisible(true);
                                        this.rab12.setVisible(true);
                                        this.Mont12.setVisible(true);
                                        this.dated12.setVisible(true);
                                        this.datef12.setVisible(true);
                                        continue;
                                    }
                                    if (i == 13) {
                                        this.ne13.setText(" " + i);
                                        this.cnr13.setText(cnr);
                                        this.ref13.setText(ref);
                                        this.nom13.setText(Nom);
                                        this.rab13.setText(mparmois);
                                        this.Mont13.setText(total);
                                        this.dated13.setText(this.moiactueleenlettre);
                                        this.datef13.setText(this.moia);
                                        this.ne13.setVisible(true);
                                        this.cnr13.setVisible(true);
                                        this.ref13.setVisible(true);
                                        this.nom13.setVisible(true);
                                        this.rab13.setVisible(true);
                                        this.Mont13.setVisible(true);
                                        this.dated13.setVisible(true);
                                        this.datef13.setVisible(true);
                                        continue;
                                    }
                                    if (i == 14) {
                                        this.ne14.setText(" " + i);
                                        this.cnr14.setText(cnr);
                                        this.ref14.setText(ref);
                                        this.nom14.setText(Nom);
                                        this.rab14.setText(mparmois);
                                        this.Mont14.setText(total);
                                        this.dated14.setText(this.moiactueleenlettre);
                                        this.datef14.setText(this.moia);
                                        this.ne14.setVisible(true);
                                        this.cnr14.setVisible(true);
                                        this.ref14.setVisible(true);
                                        this.nom14.setVisible(true);
                                        this.rab14.setVisible(true);
                                        this.Mont14.setVisible(true);
                                        this.dated14.setVisible(true);
                                        this.datef14.setVisible(true);
                                        continue;
                                    }
                                    if (i != 15) continue;
                                    this.ne15.setText(" " + i);
                                    this.cnr15.setText(cnr);
                                    this.ref15.setText(ref);
                                    this.nom15.setText(Nom);
                                    this.rab15.setText(mparmois);
                                    this.Mont15.setText(total);
                                    this.dated15.setText(this.moiactueleenlettre);
                                    this.datef15.setText(this.moia);
                                    this.ne15.setVisible(true);
                                    this.cnr15.setVisible(true);
                                    this.ref15.setVisible(true);
                                    this.nom15.setVisible(true);
                                    this.rab15.setVisible(true);
                                    this.Mont15.setVisible(true);
                                    this.dated15.setVisible(true);
                                    this.datef15.setVisible(true);
                                }
                                if (k == 0) {
                                    JOptionPane jop2 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                JOptionPane jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                            JOptionPane.showMessageDialog(null, "Attention :  Impression De l'etat ", "Information", 1);
                            Impression1 secee = new Impression1(this.jPanel3);
                            secee.actionPerformed(evt);
                        }
                    }
                }
            }
        } else if (this.jComboBox1.getSelectedItem().equals("Tous")) {
            MessageFormat header = new MessageFormat("Etat des Prets");
            MessageFormat footer = new MessageFormat("Page{0,number,integer}");
            try {
                this.Table_Empoyee.print(JTable.PrintMode.NORMAL, header, footer);
            }
            catch (PrinterException e) {
                System.err.format("Erreure d'mpresstion", e.getMessage());
            }
        }
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String nb;
        Connection conn2;
        String pm;
        Object[] stg;
        String total;
        String mpm;
        String ref;
        String dm;
        String mparmois;
        String mpm2;
        JOptionPane jop2;
        String ii;
        JOptionPane jop3;
        Statement state;
        String ref2;
        Object[] stg2;
        String Nom;
        JOptionPane jop22;
        String total2;
        String mecano;
        ResultSet result3;
        String mpm3;
        String lieutrvaille;
        ResultSet result4;
        int k;
        String anneactuel;
        String mecano2;
        String lieutrvaille2;
        String moisactuel;
        DefaultTableModel dt1;
        String nb2;
        Object[] stg3;
        int mode;
        String pm2;
        String cnr;
        String nb3;
        String Nom2;
        JOptionPane jop23;
        String total3;
        String travaille;
        String pm3;
        JOptionPane jop32;
        String dm2;
        String dat;
        String mparmois2;
        String dm3;
        conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn22 = null;
        try {
            conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.jComboBox1.getSelectedItem().equals("Cession normale")) {
            int minist\u00e9re = 0;
            if (this.tunis.isSelected()) {
                minist\u00e9re = 1;
            } else if (this.mahdia.isSelected()) {
                minist\u00e9re = 2;
            }
            mode = 0;
            if (this.tous.isSelected()) {
                mode = 1;
            } else if (this.encore.isSelected()) {
                mode = 2;
            }
            if (mode == 0) {
                jop23 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Choisir Le Mode de recherche", "Attention", 0);
            } else {
                if (minist\u00e9re == 0) {
                    JOptionPane jop24 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Choisir Le minist\u00e9re de la sant\u00e9", "Attention", 0);
                }
                if (minist\u00e9re > 0) {
                    boolean g = this.mo.getText().equals("");
                    if (g) {
                        jop22 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Saisire le mois et l'ann\u00e9es ", "Attention", 0);
                    } else if (mode == 1) {
                        if (minist\u00e9re == 1) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state = conn2.createStatement();
                                dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                dat = this.mo.getText();
                                moisactuel = dat.substring(0, dat.length() - 5);
                                anneactuel = dat.substring(dat.length() - 4, dat.length());
                                System.out.println("mois actuelle :" + moisactuel + "--");
                                System.out.println("anne actuelle :" + anneactuel + "--");
                                this.moiactueleenlettre = moisactuel.equals("01") ? "Janvier" : (moisactuel.equals("02") ? "F\u00e9vrier" : (moisactuel.equals("03") ? "Mars" : (moisactuel.equals("04") ? "Avril" : (moisactuel.equals("05") ? "Mai" : (moisactuel.equals("06") ? "Juin" : (moisactuel.equals("07") ? "Juillet" : (moisactuel.equals("08") ? "Ao\u00fbt" : (moisactuel.equals("09") ? "Septembre" : (moisactuel.equals("10") ? "Octobre" : (moisactuel.equals("11") ? "Novembre" : (moisactuel.equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
                                System.out.println("-----------------------");
                                System.out.println("date actuelle " + this.moiactueleenlettre + " " + anneactuel);
                                this.moiactueleenlettre = this.moiactueleenlettre + "  " + anneactuel;
                                System.out.println("date =" + this.moiactueleenlettre);
                                this.dateetanne.setText(this.moiactueleenlettre + "");
                                result3 = state.executeQuery("SELECT * FROM cession2  WHERE premiermois='" + this.moiactueleenlettre + "'");
                                k = 0;
                                while (result3.next()) {
                                    ++k;
                                    String cnr2 = "";
                                    mecano2 = result3.getString("Mecano");
                                    lieutrvaille2 = "";
                                    travaille = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state3 = conn2.createStatement();
                                        result4 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mecano2);
                                        while (result4.next()) {
                                            travaille = result4.getString("TRVAIL");
                                            lieutrvaille2 = result4.getString("LIEUTRAVAIL");
                                            cnr2 = result4.getString("NCNR");
                                        }
                                    }
                                    catch (Exception e) {
                                        jop32 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                                    }
                                    System.out.println("-------------------------------------");
                                    int j = lieutrvaille2.indexOf("SFAR");
                                    System.out.println("lieu de travaille =" + lieutrvaille2);
                                    System.out.println("j =" + j);
                                    System.out.println("cadre de travaille =" + travaille);
                                    boolean jj = travaille.equals("Ouvrier");
                                    System.out.println("jj =" + jj);
                                    boolean test = true;
                                    if (jj && j > -1) {
                                        test = false;
                                    }
                                    if (!test) continue;
                                    Nom = result3.getString("Nom");
                                    System.out.println("Nom =" + Nom);
                                    ref = result3.getString("ref");
                                    mparmois = result3.getString("montantparmois");
                                    mparmois = mparmois.substring(0, mparmois.length() - 4);
                                    total = result3.getString("Montant");
                                    total = total.substring(0, total.length() - 3);
                                    nb = result3.getString("Nbmois");
                                    pm = result3.getString("premiermois");
                                    dm = result3.getString("derniermois");
                                    mpm = result3.getString("montantparmois");
                                    stg = new Object[]{k, cnr2, Nom, ref, mparmois, total, pm, dm, mecano2};
                                    dt1.addRow(stg);
                                }
                                if (k == 0) {
                                    JOptionPane jop25 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                        } else if (minist\u00e9re == 2) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state = conn2.createStatement();
                                dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                dat = this.mo.getText();
                                moisactuel = dat.substring(0, dat.length() - 5);
                                anneactuel = dat.substring(dat.length() - 4, dat.length());
                                System.out.println("mois actuelle :" + moisactuel + "--");
                                System.out.println("anne actuelle :" + anneactuel + "--");
                                this.moiactueleenlettre = moisactuel.equals("01") ? "Janvier" : (moisactuel.equals("02") ? "F\u00e9vrier" : (moisactuel.equals("03") ? "Mars" : (moisactuel.equals("04") ? "Avril" : (moisactuel.equals("05") ? "Mai" : (moisactuel.equals("06") ? "Juin" : (moisactuel.equals("07") ? "Juillet" : (moisactuel.equals("08") ? "Ao\u00fbt" : (moisactuel.equals("09") ? "Septembre" : (moisactuel.equals("10") ? "Octobre" : (moisactuel.equals("11") ? "Novembre" : (moisactuel.equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
                                System.out.println("-----------------------");
                                System.out.println("date actuelle " + this.moiactueleenlettre + " " + anneactuel);
                                this.moiactueleenlettre = this.moiactueleenlettre + "  " + anneactuel;
                                System.out.println("date =" + this.moiactueleenlettre);
                                this.dateetanne.setText(this.moiactueleenlettre + "");
                                result3 = state.executeQuery("SELECT * FROM cession2  WHERE premiermois='" + this.moiactueleenlettre + "'");
                                int k2 = 0;
                                while (result3.next()) {
                                    ++k2;
                                    String cnr3 = "";
                                    mecano2 = result3.getString("Mecano");
                                    lieutrvaille2 = "";
                                    travaille = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state3 = conn2.createStatement();
                                        ResultSet result42 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mecano2);
                                        while (result42.next()) {
                                            travaille = result42.getString("TRVAIL");
                                            lieutrvaille2 = result42.getString("LIEUTRAVAIL");
                                            cnr3 = result42.getString("NCNR");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop33 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                                    }
                                    int j = lieutrvaille2.indexOf("TAHAR");
                                    if (!travaille.equals("Ouvrier") || j == -1) continue;
                                    String Nom3 = result3.getString("Nom");
                                    String ref3 = result3.getString("ref");
                                    String mparmois3 = result3.getString("montantparmois");
                                    mparmois3 = mparmois3.substring(0, mparmois3.length() - 4);
                                    total3 = result3.getString("Montant");
                                    total3 = total3.substring(0, total3.length() - 3);
                                    nb3 = result3.getString("Nbmois");
                                    pm3 = result3.getString("premiermois");
                                    dm3 = result3.getString("derniermois");
                                    mpm2 = result3.getString("montantparmois");
                                    k2 = 1;
                                    stg2 = new Object[]{k2, cnr3, Nom3, ref3, mparmois3, total3, pm3, dm3, mecano2};
                                    dt1.addRow(stg2);
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                        }
                    } else if (mode == 2) {
                        if (minist\u00e9re == 1) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state = conn2.createStatement();
                                dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                dat = this.mo.getText();
                                moisactuel = dat.substring(0, dat.length() - 5);
                                anneactuel = dat.substring(dat.length() - 4, dat.length());
                                System.out.println("mois actuelle :" + moisactuel + "--");
                                System.out.println("anne actuelle :" + anneactuel + "--");
                                this.moiactueleenlettre = moisactuel.equals("01") ? "Janvier" : (moisactuel.equals("02") ? "F\u00e9vrier" : (moisactuel.equals("03") ? "Mars" : (moisactuel.equals("04") ? "Avril" : (moisactuel.equals("05") ? "Mai" : (moisactuel.equals("06") ? "Juin" : (moisactuel.equals("07") ? "Juillet" : (moisactuel.equals("08") ? "Ao\u00fbt" : (moisactuel.equals("09") ? "Septembre" : (moisactuel.equals("10") ? "Octobre" : (moisactuel.equals("11") ? "Novembre" : (moisactuel.equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
                                System.out.println("-----------------------");
                                System.out.println("date actuelle " + this.moiactueleenlettre + " " + anneactuel);
                                this.moiactueleenlettre = this.moiactueleenlettre + "  " + anneactuel;
                                System.out.println("date =" + this.moiactueleenlettre);
                                this.dateetanne.setText(this.moiactueleenlettre + "");
                                ii = "0";
                                ResultSet result32 = state.executeQuery("SELECT * FROM cession2  WHERE premiermois='" + this.moiactueleenlettre + "' AND i='" + ii + "'");
                                int k3 = 0;
                                while (result32.next()) {
                                    ++k3;
                                    cnr = "";
                                    mecano = result32.getString("Mecano");
                                    lieutrvaille = "";
                                    String travaille2 = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state3 = conn2.createStatement();
                                        ResultSet result43 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mecano);
                                        while (result43.next()) {
                                            travaille2 = result43.getString("TRVAIL");
                                            lieutrvaille = result43.getString("LIEUTRAVAIL");
                                            cnr = result43.getString("NCNR");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop34 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                                    }
                                    System.out.println("-------------------------------------");
                                    int j = lieutrvaille.indexOf("SFAR");
                                    System.out.println("lieu de travaille =" + lieutrvaille);
                                    System.out.println("j =" + j);
                                    System.out.println("cadre de travaille =" + travaille2);
                                    boolean jj = travaille2.equals("Ouvrier");
                                    System.out.println("jj =" + jj);
                                    boolean test = true;
                                    if (jj && j > -1) {
                                        test = false;
                                    }
                                    if (!test) continue;
                                    Nom2 = result32.getString("Nom");
                                    System.out.println("Nom =" + Nom2);
                                    ref2 = result32.getString("ref");
                                    mparmois2 = result32.getString("montantparmois");
                                    mparmois2 = mparmois2.substring(0, mparmois2.length() - 4);
                                    total2 = result32.getString("Montant");
                                    total2 = total2.substring(0, total2.length() - 3);
                                    nb2 = result32.getString("Nbmois");
                                    pm2 = result32.getString("premiermois");
                                    dm2 = result32.getString("derniermois");
                                    mpm3 = result32.getString("montantparmois");
                                    stg3 = new Object[]{k3, cnr, Nom2, ref2, mparmois2, total2, pm2, dm2, mecano};
                                    dt1.addRow(stg3);
                                }
                                if (k3 == 0) {
                                    jop2 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                        } else if (minist\u00e9re == 2) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state = conn2.createStatement();
                                dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                dat = this.mo.getText();
                                moisactuel = dat.substring(0, dat.length() - 5);
                                anneactuel = dat.substring(dat.length() - 4, dat.length());
                                System.out.println("mois actuelle :" + moisactuel + "--");
                                System.out.println("anne actuelle :" + anneactuel + "--");
                                this.moiactueleenlettre = moisactuel.equals("01") ? "Janvier" : (moisactuel.equals("02") ? "F\u00e9vrier" : (moisactuel.equals("03") ? "Mars" : (moisactuel.equals("04") ? "Avril" : (moisactuel.equals("05") ? "Mai" : (moisactuel.equals("06") ? "Juin" : (moisactuel.equals("07") ? "Juillet" : (moisactuel.equals("08") ? "Ao\u00fbt" : (moisactuel.equals("09") ? "Septembre" : (moisactuel.equals("10") ? "Octobre" : (moisactuel.equals("11") ? "Novembre" : (moisactuel.equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
                                System.out.println("-----------------------");
                                System.out.println("date actuelle " + this.moiactueleenlettre + " " + anneactuel);
                                this.moiactueleenlettre = this.moiactueleenlettre + "  " + anneactuel;
                                System.out.println("date =" + this.moiactueleenlettre);
                                this.dateetanne.setText(this.moiactueleenlettre + "");
                                result3 = state.executeQuery("SELECT * FROM cession2  WHERE premiermois='" + this.moiactueleenlettre + "'");
                                int k4 = 0;
                                while (result3.next()) {
                                    ++k4;
                                    String cnr4 = "";
                                    mecano2 = result3.getString("Mecano");
                                    lieutrvaille2 = "";
                                    travaille = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state3 = conn2.createStatement();
                                        ResultSet result44 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mecano2);
                                        while (result44.next()) {
                                            travaille = result44.getString("TRVAIL");
                                            lieutrvaille2 = result44.getString("LIEUTRAVAIL");
                                            cnr4 = result44.getString("NCNR");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop35 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                                    }
                                    int j = lieutrvaille2.indexOf("TAHAR");
                                    if (!travaille.equals("Ouvrier") || j == -1) continue;
                                    String Nom4 = result3.getString("Nom");
                                    String ref4 = result3.getString("ref");
                                    String mparmois4 = result3.getString("montantparmois");
                                    mparmois4 = mparmois4.substring(0, mparmois4.length() - 4);
                                    total3 = result3.getString("Montant");
                                    total3 = total3.substring(0, total3.length() - 3);
                                    nb3 = result3.getString("Nbmois");
                                    pm3 = result3.getString("premiermois");
                                    dm3 = result3.getString("derniermois");
                                    mpm2 = result3.getString("montantparmois");
                                    stg2 = new Object[]{k4, cnr4, Nom4, ref4, mparmois4, total3, pm3, dm3, mecano2};
                                    dt1.addRow(stg2);
                                }
                                if (k4 == 0) {
                                    JOptionPane jop26 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                            }
                        }
                    }
                }
            }
        }
        if (this.jComboBox1.getSelectedItem().equals("Fourniseur")) {
            int minist\u00e9re = 0;
            if (this.tunis.isSelected()) {
                minist\u00e9re = 1;
            } else if (this.mahdia.isSelected()) {
                minist\u00e9re = 2;
            }
            mode = 0;
            if (this.tous.isSelected()) {
                mode = 1;
            } else if (this.encore.isSelected()) {
                mode = 2;
            }
            if (mode == 0) {
                jop23 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Choisir Le Mode de recherche", "Attention", 0);
            } else {
                if (minist\u00e9re == 0) {
                    jop23 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Choisir Le minist\u00e9re de la sant\u00e9", "Attention", 0);
                }
                if (minist\u00e9re > 0) {
                    String ref5;
                    String mparmois5;
                    String cnr5;
                    JOptionPane jop27;
                    String Nom5;
                    boolean g = this.mo.getText().equals("");
                    if (g) {
                        jop22 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Saisire le mois et l'ann\u00e9es ", "Attention", 0);
                    } else if (mode == 1) {
                        if (minist\u00e9re == 1) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state = conn2.createStatement();
                                dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                dat = this.mo.getText();
                                moisactuel = dat.substring(0, dat.length() - 5);
                                anneactuel = dat.substring(dat.length() - 4, dat.length());
                                System.out.println("mois actuelle :" + moisactuel + "--");
                                System.out.println("anne actuelle :" + anneactuel + "--");
                                this.moiactueleenlettre = moisactuel.equals("01") ? "Janvier" : (moisactuel.equals("02") ? "F\u00e9vrier" : (moisactuel.equals("03") ? "Mars" : (moisactuel.equals("04") ? "Avril" : (moisactuel.equals("05") ? "Mai" : (moisactuel.equals("06") ? "Juin" : (moisactuel.equals("07") ? "Juillet" : (moisactuel.equals("08") ? "Ao\u00fbt" : (moisactuel.equals("09") ? "Septembre" : (moisactuel.equals("10") ? "Octobre" : (moisactuel.equals("11") ? "Novembre" : (moisactuel.equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
                                System.out.println("-----------------------");
                                System.out.println("date actuelle " + this.moiactueleenlettre + " " + anneactuel);
                                this.moiactueleenlettre = this.moiactueleenlettre + "  " + anneactuel;
                                System.out.println("date =" + this.moiactueleenlettre);
                                this.dateetanne.setText(this.moiactueleenlettre + "");
                                result3 = state.executeQuery("SELECT * FROM cessionfournisseur  WHERE premiermois='" + this.moiactueleenlettre + "'");
                                k = 0;
                                while (result3.next()) {
                                    ++k;
                                    cnr5 = "";
                                    mecano2 = result3.getString("Mecano");
                                    lieutrvaille2 = "";
                                    travaille = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state3 = conn2.createStatement();
                                        ResultSet result45 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mecano2);
                                        while (result45.next()) {
                                            travaille = result45.getString("TRVAIL");
                                            lieutrvaille2 = result45.getString("LIEUTRAVAIL");
                                            cnr5 = result45.getString("NCNR");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop36 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur  1 " + e.getMessage());
                                    }
                                    System.out.println("-------------------------------------");
                                    int j = lieutrvaille2.indexOf("SFAR");
                                    System.out.println("lieu de travaille =" + lieutrvaille2);
                                    System.out.println("j =" + j);
                                    System.out.println("cadre de travaille =" + travaille);
                                    boolean jj = travaille.equals("Ouvrier");
                                    System.out.println("jj =" + jj);
                                    boolean test = true;
                                    if (jj && j > -1) {
                                        test = false;
                                    }
                                    System.out.println("zz");
                                    if (!test) continue;
                                    System.out.println("ffff");
                                    Nom = result3.getString("Nom");
                                    System.out.println("Nom =" + Nom);
                                    System.out.println("fggggf");
                                    ref = "11";
                                    mparmois = result3.getString("montantparmois");
                                    mparmois = mparmois.substring(0, mparmois.length() - 4);
                                    total = result3.getString("Montant");
                                    total = total.substring(0, total.length() - 3);
                                    nb = result3.getString("Nbmois");
                                    pm = result3.getString("premiermois");
                                    dm = result3.getString("derniermois");
                                    System.out.println("ffgghhf");
                                    Object[] stg4 = new Object[]{k, cnr5, Nom, ref, mparmois, total, pm, dm, mecano2};
                                    dt1.addRow(stg4);
                                }
                                if (k == 0) {
                                    jop27 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur  2  " + e.getMessage());
                            }
                        } else if (minist\u00e9re == 2) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state = conn2.createStatement();
                                dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                dat = this.mo.getText();
                                moisactuel = dat.substring(0, dat.length() - 5);
                                anneactuel = dat.substring(dat.length() - 4, dat.length());
                                System.out.println("mois actuelle :" + moisactuel + "--");
                                System.out.println("anne actuelle :" + anneactuel + "--");
                                this.moiactueleenlettre = moisactuel.equals("01") ? "Janvier" : (moisactuel.equals("02") ? "F\u00e9vrier" : (moisactuel.equals("03") ? "Mars" : (moisactuel.equals("04") ? "Avril" : (moisactuel.equals("05") ? "Mai" : (moisactuel.equals("06") ? "Juin" : (moisactuel.equals("07") ? "Juillet" : (moisactuel.equals("08") ? "Ao\u00fbt" : (moisactuel.equals("09") ? "Septembre" : (moisactuel.equals("10") ? "Octobre" : (moisactuel.equals("11") ? "Novembre" : (moisactuel.equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
                                System.out.println("-----------------------");
                                System.out.println("date actuelle " + this.moiactueleenlettre + " " + anneactuel);
                                this.moiactueleenlettre = this.moiactueleenlettre + "  " + anneactuel;
                                System.out.println("date =" + this.moiactueleenlettre);
                                this.dateetanne.setText(this.moiactueleenlettre + "");
                                result3 = state.executeQuery("SELECT * FROM cessionfournisseur  WHERE premiermois='" + this.moiactueleenlettre + "'");
                                k = 0;
                                while (result3.next()) {
                                    ++k;
                                    cnr5 = "";
                                    mecano2 = result3.getString("Mecano");
                                    lieutrvaille2 = "";
                                    travaille = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state3 = conn2.createStatement();
                                        result4 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mecano2);
                                        while (result4.next()) {
                                            travaille = result4.getString("TRVAIL");
                                            lieutrvaille2 = result4.getString("LIEUTRAVAIL");
                                            cnr5 = result4.getString("NCNR");
                                        }
                                    }
                                    catch (Exception e) {
                                        jop32 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur 3 " + e.getMessage());
                                    }
                                    int j = lieutrvaille2.indexOf("TAHAR");
                                    if (!travaille.equals("Ouvrier") || j == -1) continue;
                                    Nom5 = result3.getString("Nom");
                                    ref5 = result3.getString("ref");
                                    mparmois5 = result3.getString("montantparmois");
                                    mparmois5 = mparmois5.substring(0, mparmois5.length() - 4);
                                    total3 = result3.getString("Montant");
                                    total3 = total3.substring(0, total3.length() - 3);
                                    nb3 = result3.getString("Nbmois");
                                    pm3 = result3.getString("premiermois");
                                    dm3 = result3.getString("derniermois");
                                    mpm2 = result3.getString("montantparmois");
                                    stg2 = new Object[]{k, cnr5, Nom5, ref5, mparmois5, total3, pm3, dm3, mecano2};
                                    dt1.addRow(stg2);
                                }
                                if (k == 0) {
                                    jop27 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur 4 " + e.getMessage());
                            }
                        }
                    } else if (mode == 2) {
                        if (minist\u00e9re == 1) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state = conn2.createStatement();
                                dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                dat = this.mo.getText();
                                moisactuel = dat.substring(0, dat.length() - 5);
                                anneactuel = dat.substring(dat.length() - 4, dat.length());
                                System.out.println("mois actuelle :" + moisactuel + "--");
                                System.out.println("anne actuelle :" + anneactuel + "--");
                                this.moiactueleenlettre = moisactuel.equals("01") ? "Janvier" : (moisactuel.equals("02") ? "F\u00e9vrier" : (moisactuel.equals("03") ? "Mars" : (moisactuel.equals("04") ? "Avril" : (moisactuel.equals("05") ? "Mai" : (moisactuel.equals("06") ? "Juin" : (moisactuel.equals("07") ? "Juillet" : (moisactuel.equals("08") ? "Ao\u00fbt" : (moisactuel.equals("09") ? "Septembre" : (moisactuel.equals("10") ? "Octobre" : (moisactuel.equals("11") ? "Novembre" : (moisactuel.equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
                                System.out.println("-----------------------");
                                System.out.println("date actuelle " + this.moiactueleenlettre + " " + anneactuel);
                                this.moiactueleenlettre = this.moiactueleenlettre + "  " + anneactuel;
                                System.out.println("date =" + this.moiactueleenlettre);
                                this.dateetanne.setText(this.moiactueleenlettre + "");
                                ii = "0";
                                ResultSet result33 = state.executeQuery("SELECT * FROM cessionfournisseur  WHERE premiermois='" + this.moiactueleenlettre + "' AND i='" + ii + "'");
                                int k5 = 0;
                                while (result33.next()) {
                                    ++k5;
                                    cnr = "";
                                    mecano = result33.getString("Mecano");
                                    lieutrvaille = "";
                                    String travaille3 = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Statement state3 = conn2.createStatement();
                                        ResultSet result46 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mecano);
                                        while (result46.next()) {
                                            travaille3 = result46.getString("TRVAIL");
                                            lieutrvaille = result46.getString("LIEUTRAVAIL");
                                            cnr = result46.getString("NCNR");
                                        }
                                    }
                                    catch (Exception e) {
                                        JOptionPane jop37 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur 5 " + e.getMessage());
                                    }
                                    System.out.println("-------------------------------------");
                                    int j = lieutrvaille.indexOf("SFAR");
                                    System.out.println("lieu de travaille =" + lieutrvaille);
                                    System.out.println("j =" + j);
                                    System.out.println("cadre de travaille =" + travaille3);
                                    boolean jj = travaille3.equals("Ouvrier");
                                    System.out.println("jj =" + jj);
                                    boolean test = true;
                                    if (jj && j > -1) {
                                        test = false;
                                    }
                                    if (!test) continue;
                                    Nom2 = result33.getString("Nom");
                                    System.out.println("Nom =" + Nom2);
                                    ref2 = result33.getString("ref");
                                    mparmois2 = result33.getString("montantparmois");
                                    mparmois2 = mparmois2.substring(0, mparmois2.length() - 4);
                                    total2 = result33.getString("Montant");
                                    total2 = total2.substring(0, total2.length() - 3);
                                    nb2 = result33.getString("Nbmois");
                                    pm2 = result33.getString("premiermois");
                                    dm2 = result33.getString("derniermois");
                                    mpm3 = result33.getString("montantparmois");
                                    stg3 = new Object[]{k5, cnr, Nom2, ref2, mparmois2, total2, pm2, dm2, mecano};
                                    dt1.addRow(stg3);
                                }
                                if (k5 == 0) {
                                    jop2 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur 6 " + e.getMessage());
                            }
                        } else if (minist\u00e9re == 2) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                state = conn2.createStatement();
                                dt1 = new DefaultTableModel();
                                dt1.addColumn("Num");
                                dt1.addColumn("N\u00b0 C.N.R");
                                dt1.addColumn("Nom et prenom");
                                dt1.addColumn("Reference");
                                dt1.addColumn("Rabais Mensuel");
                                dt1.addColumn("Montant");
                                dt1.addColumn("Date d\u00e9but");
                                dt1.addColumn("Date fin");
                                dt1.addColumn("N\u00b0 Mecano");
                                dt1.addColumn("Remarque");
                                this.Table_Empoyee.setModel(dt1);
                                dat = this.mo.getText();
                                moisactuel = dat.substring(0, dat.length() - 5);
                                anneactuel = dat.substring(dat.length() - 4, dat.length());
                                System.out.println("mois actuelle :" + moisactuel + "--");
                                System.out.println("anne actuelle :" + anneactuel + "--");
                                this.moiactueleenlettre = moisactuel.equals("01") ? "Janvier" : (moisactuel.equals("02") ? "F\u00e9vrier" : (moisactuel.equals("03") ? "Mars" : (moisactuel.equals("04") ? "Avril" : (moisactuel.equals("05") ? "Mai" : (moisactuel.equals("06") ? "Juin" : (moisactuel.equals("07") ? "Juillet" : (moisactuel.equals("08") ? "Ao\u00fbt" : (moisactuel.equals("09") ? "Septembre" : (moisactuel.equals("10") ? "Octobre" : (moisactuel.equals("11") ? "Novembre" : (moisactuel.equals("12") ? "D\u00e9cembre" : "!!!!!!!!!!!")))))))))));
                                System.out.println("-----------------------");
                                System.out.println("date actuelle " + this.moiactueleenlettre + " " + anneactuel);
                                this.moiactueleenlettre = this.moiactueleenlettre + "  " + anneactuel;
                                System.out.println("date =" + this.moiactueleenlettre);
                                this.dateetanne.setText(this.moiactueleenlettre + "");
                                result3 = state.executeQuery("SELECT * FROM cessionfournisseur  WHERE premiermois='" + this.moiactueleenlettre + "'");
                                k = 0;
                                while (result3.next()) {
                                    ++k;
                                    cnr5 = "";
                                    mecano2 = result3.getString("Mecano");
                                    lieutrvaille2 = "";
                                    travaille = "";
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        result4 = state.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mecano2);
                                        while (result4.next()) {
                                            travaille = result4.getString("TRVAIL");
                                            lieutrvaille2 = result4.getString("LIEUTRAVAIL");
                                            cnr5 = result4.getString("NCNR");
                                        }
                                    }
                                    catch (Exception e) {
                                        jop32 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur 7 " + e.getMessage());
                                    }
                                    int j = lieutrvaille2.indexOf("TAHAR");
                                    if (!travaille.equals("Ouvrier") || j == -1) continue;
                                    Nom5 = result3.getString("Nom");
                                    ref5 = result3.getString("ref");
                                    mparmois5 = result3.getString("montantparmois");
                                    mparmois5 = mparmois5.substring(0, mparmois5.length() - 4);
                                    total3 = result3.getString("Montant");
                                    total3 = total3.substring(0, total3.length() - 3);
                                    nb3 = result3.getString("Nbmois");
                                    pm3 = result3.getString("premiermois");
                                    dm3 = result3.getString("derniermois");
                                    mpm2 = result3.getString("montantparmois");
                                    stg2 = new Object[]{k, cnr5, Nom5, ref5, mparmois5, total3, pm3, dm3, mecano2};
                                    dt1.addRow(stg2);
                                }
                                if (k == 0) {
                                    jop27 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "Aucune Cession Pour Cette Date ", "Attention", 0);
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur 8 " + e.getMessage());
                            }
                        }
                    }
                }
            }
        }
        if (this.jComboBox1.getSelectedItem().equals("Tous")) {
             dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0");
            dt1.addColumn("Date");
            dt1.addColumn("N\u00b0 C.N.R");
            dt1.addColumn("Nom  et   prenom");
            dt1.addColumn("Ref");
            dt1.addColumn("Mensuel");
            dt1.addColumn("Montant");
            dt1.addColumn("Date d\u00e9but");
            dt1.addColumn("Date fin");
            this.Table_Empoyee.setModel(dt1);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                 state = conn2.createStatement();
                 result3 = state.executeQuery("SELECT * FROM cession2");
                 k = 0;
                while (result3.next()) {
                    System.out.println("------------");
                    String mm = result3.getString("mois");
                    String moisbd = mm.substring(0, mm.length() - 5);
                    System.out.println("mois BD =" + moisbd);
                    int mb = Integer.parseInt(moisbd);
                    String annebd = mm.substring(mm.length() - 4, mm.length());
                    System.out.println("anne BD =" + annebd);
                    int ab = Integer.parseInt(annebd);
                    Date actuellEed = new Date();
                    String datddd = this.mo.getText();
                    String moisactuelle = datddd.substring(0, datddd.length() - 5);
                    System.out.println("mois  actuelle =" + moisactuelle);
                    int ma = Integer.parseInt(moisactuelle);
                    String anneac = datddd.substring(datddd.length() - 4, datddd.length());
                    System.out.println("anne atuelle=" + anneac);
                    int aa = Integer.parseInt(anneac);
                    if (ab != aa || ma > mb) continue;
                    ++k;
                    String d = result3.getString("date");
                     Nom = result3.getString("Nom");
                    System.out.println(" Nom =" + Nom);
                    System.out.println("________________");
                     cnr = null;
                     mecano = result3.getString("Mecano");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                         result4 = state3.executeQuery("SELECT * FROM   adherent WHERE MECANO=" + mecano);
                        while (result4.next()) {
                            cnr = result4.getString("NCNR");
                        }
                    }
                    catch (Exception e) {
                         jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 7 " + e.getMessage());
                    }
                    System.out.println("Nom =" + Nom);
                    ref = result3.getString("ref");
                    mparmois = result3.getString("montantparmois");
                    mparmois = mparmois.substring(0, mparmois.length() - 4);
                    mparmois = mparmois + " DT";
                    total = result3.getString("Montant");
                    total = total.substring(0, total.length() - 3);
                    total = total + " DT";
                    nb = result3.getString("Nbmois");
                    pm = result3.getString("premiermois");
                    dm = result3.getString("derniermois");
                    mpm = result3.getString("montantparmois");
                    stg = new Object[]{k, d, cnr, Nom, ref, mparmois, total, pm, dm};
                    dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                 jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
            }
        } else {
             jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choisir l'etat ", "Attention", 0);
        }
    }

    private void jTextField11ActionPerformed(ActionEvent evt) {
    }

    private void jTextField14ActionPerformed(ActionEvent evt) {
    }

    private void jTextField15ActionPerformed(ActionEvent evt) {
    }

    private void jTextField18ActionPerformed(ActionEvent evt) {
    }

    private void jTextField19ActionPerformed(ActionEvent evt) {
    }

    private void jTextField20ActionPerformed(ActionEvent evt) {
    }

    private void Mecano1ActionPerformed(ActionEvent evt) {
    }

    private void MecanoActionPerformed(ActionEvent evt) {
    }

    private void tunisActionPerformed(ActionEvent evt) {
    }

    private void moActionPerformed(ActionEvent evt) {
    }

    private void ne4ActionPerformed(ActionEvent evt) {
    }

    private void ne9ActionPerformed(ActionEvent evt) {
    }

    private void ne10ActionPerformed(ActionEvent evt) {
    }

    private void ne13ActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(etatcession.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(etatcession.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(etatcession.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(etatcession.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new etatcession().setVisible(true);
            }
        });
    }

}

