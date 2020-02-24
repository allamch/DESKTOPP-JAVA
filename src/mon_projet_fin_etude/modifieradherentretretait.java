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
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.accessibility.AccessibleContext;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class modifieradherentretretait
extends JPanel {
    private ButtonGroup ETAB;
    private JButton Quitter;
    private JTextArea adres;
    private JTextField agence;
    private JComboBox banque;
    private ButtonGroup bg;
    private JLabel bq;
    private JTextField cin1;
    private JTextField cm;
    private JRadioButton cn;
    private JTextField cnr;
    private JRadioButton cnss;
    private JTextField codepostale;
    private JLabel coti;
    private JDateChooser dateani;
    private JDateChooser dateaniconj;
    private JDateChooser datecin;
    private JLabel datecin1;
    private JLabel datenai;
    private JLabel datenaiconj1;
    private JLabel etabb;
    private JButton jButton15;
    private JButton jButton16;
    private JComboBox jComboBox3;
    private JLabel jLabel12;
    private JLabel jLabel14;
    private JLabel jLabel18;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JPanel jPanel1;
    private JPanel jPanel16;
    private JPanel jPanel17;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JTextField jTextField1;
    private JTextField lieunaissance;
    private JLabel mecano;
    private JTextField mp;
    private JTextField nom;
    private JTextField nombreenfant;
    private JTextField nomconjoint;
    private JTextField ntel;
    private JRadioButton parmois;
    private JRadioButton partrimestre;
    private JTextField rib;

    public modifieradherentretretait() {
        this.initComponents();
    }

    private void initComponents() {
        this.bg = new ButtonGroup();
        this.ETAB = new ButtonGroup();
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel23 = new JLabel();
        this.jLabel22 = new JLabel();
        this.jLabel24 = new JLabel();
        this.rib = new JTextField();
        this.datecin = new JDateChooser();
        this.jLabel25 = new JLabel();
        this.jLabel26 = new JLabel();
        this.nom = new JTextField();
        this.jLabel28 = new JLabel();
        this.jLabel18 = new JLabel();
        this.cnr = new JTextField();
        this.jSeparator2 = new JSeparator();
        this.jLabel29 = new JLabel();
        this.lieunaissance = new JTextField();
        this.nomconjoint = new JTextField();
        this.jLabel31 = new JLabel();
        this.ntel = new JTextField();
        this.jButton15 = new JButton();
        this.Quitter = new JButton();
        this.cin1 = new JTextField();
        this.jLabel32 = new JLabel();
        this.banque = new JComboBox();
        this.jLabel33 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.adres = new JTextArea();
        this.jLabel34 = new JLabel();
        this.dateani = new JDateChooser();
        this.jLabel35 = new JLabel();
        this.dateaniconj = new JDateChooser();
        this.jLabel27 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel38 = new JLabel();
        this.agence = new JTextField();
        this.jLabel39 = new JLabel();
        this.codepostale = new JTextField();
        this.nombreenfant = new JTextField();
        this.cm = new JTextField();
        this.jLabel40 = new JLabel();
        this.mp = new JTextField();
        this.jLabel41 = new JLabel();
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.parmois = new JRadioButton();
        this.partrimestre = new JRadioButton();
        this.jLabel30 = new JLabel();
        this.jPanel3 = new JPanel();
        this.cn = new JRadioButton();
        this.cnss = new JRadioButton();
        this.jPanel17 = new JPanel();
        this.jComboBox3 = new JComboBox();
        this.jLabel12 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jSeparator3 = new JSeparator();
        this.jButton16 = new JButton();
        this.jSeparator1 = new JSeparator();
        this.jSeparator4 = new JSeparator();
        this.mecano = new JLabel();
        this.datecin1 = new JLabel();
        this.etabb = new JLabel();
        this.datenai = new JLabel();
        this.coti = new JLabel();
        this.bq = new JLabel();
        this.datenaiconj1 = new JLabel();
        this.setLayout(new CardLayout());
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "Modification", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel23.setFont(new Font("Tahoma", 1, 14));
        this.jLabel23.setText("Date de naissance :");
        this.jPanel16.add(this.jLabel23);
        this.jLabel23.setBounds(10, 280, 140, 17);
        this.jLabel22.setBackground(new Color(153, 153, 255));
        this.jLabel22.setFont(new Font("Tahoma", 1, 14));
        this.jLabel22.setText("Nom conjoint :");
        this.jPanel16.add(this.jLabel22);
        this.jLabel22.setBounds(0, 420, 120, 20);
        this.jLabel24.setBackground(new Color(153, 153, 255));
        this.jLabel24.setFont(new Font("Tahoma", 1, 14));
        this.jLabel24.setText("Lieux de naissance :");
        this.jPanel16.add(this.jLabel24);
        this.jLabel24.setBounds(460, 280, 140, 20);
        this.rib.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.rib);
        this.rib.setBounds(260, 90, 290, 40);
        this.jPanel16.add((Component)this.datecin);
        this.datecin.setBounds(410, 140, 140, 30);
        this.jLabel25.setBackground(new Color(153, 153, 255));
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setForeground(new Color(0, 0, 255));
        this.jLabel25.setText("Etablissemeent payeur :");
        this.jPanel16.add(this.jLabel25);
        this.jLabel25.setBounds(10, 200, 180, 20);
        this.jLabel26.setBackground(new Color(153, 153, 255));
        this.jLabel26.setFont(new Font("Tahoma", 1, 14));
        this.jLabel26.setText("Nom et Prenom :");
        this.jPanel16.add(this.jLabel26);
        this.jLabel26.setBounds(10, 240, 120, 20);
        this.nom.setFont(new Font("Tahoma", 0, 14));
        this.nom.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.nomActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nom);
        this.nom.setBounds(140, 230, 350, 30);
        this.jLabel28.setBackground(new Color(153, 153, 255));
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setForeground(new Color(0, 0, 255));
        this.jLabel28.setText("Mecano :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(10, 100, 62, 17);
        this.jLabel18.setFont(new Font("Tahoma", 1, 18));
        this.jLabel18.setForeground(new Color(0, 0, 255));
        this.jLabel18.setText("RIB:");
        this.jPanel16.add(this.jLabel18);
        this.jLabel18.setBounds(210, 100, 50, 22);
        this.cnr.setFont(new Font("Tahoma", 0, 14));
        this.cnr.setCursor(new Cursor(2));
        this.cnr.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.cnrActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.cnr);
        this.cnr.setBounds(470, 190, 270, 30);
        this.jPanel16.add(this.jSeparator2);
        this.jSeparator2.setBounds(10, 220, 760, 2);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("Agence :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(570, 150, 70, 20);
        this.lieunaissance.setFont(new Font("Tahoma", 0, 14));
        this.lieunaissance.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.lieunaissanceActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.lieunaissance);
        this.lieunaissance.setBounds(600, 270, 160, 30);
        this.nomconjoint.setFont(new Font("Tahoma", 0, 14));
        this.nomconjoint.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.nomconjointActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomconjoint);
        this.nomconjoint.setBounds(120, 420, 230, 30);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setText("Date de naissance conjoint :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(360, 410, 210, 20);
        this.ntel.setFont(new Font("Tahoma", 0, 14));
        this.ntel.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.ntelActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.ntel);
        this.ntel.setBounds(600, 230, 160, 30);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Valider");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(500, 510, 110, 40);
        this.Quitter.setFont(new Font("Tahoma", 1, 12));
        this.Quitter.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.Quitter.setText("Quitter");
        this.Quitter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.QuitterActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.Quitter);
        this.Quitter.setBounds(620, 510, 110, 40);
        this.cin1.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.cin1);
        this.cin1.setBounds(60, 140, 160, 30);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("d\u00e9livr\u00e9 le :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(230, 140, 70, 30);
        this.banque.setFont(new Font("Tahoma", 0, 18));
        this.banque.setModel(new DefaultComboBoxModel<String>(new String[]{"Aucune", "ATB", "BT", "BH", "BNA", "BZ", "STB", "UIB", "UBCI", "BIAT", "Poste"}));
        this.banque.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.banqueActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.banque);
        this.banque.setBounds(640, 90, 110, 30);
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setText("Cotisation :");
        this.jPanel16.add(this.jLabel33);
        this.jLabel33.setBounds(10, 510, 90, 20);
        this.adres.setColumns(20);
        this.adres.setRows(5);
        this.jScrollPane2.setViewportView(this.adres);
        this.jPanel16.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(170, 360, 430, 50);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText(" C.I.N :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(0, 150, 60, 20);
        this.jPanel16.add((Component)this.dateani);
        this.dateani.setBounds(270, 280, 180, 30);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setText("NB Enfant a charger:");
        this.jPanel16.add(this.jLabel35);
        this.jLabel35.setBounds(10, 330, 150, 20);
        this.jPanel16.add((Component)this.dateaniconj);
        this.dateaniconj.setBounds(570, 430, 170, 30);
        this.jLabel27.setBackground(new Color(153, 153, 255));
        this.jLabel27.setFont(new Font("Tahoma", 1, 14));
        this.jLabel27.setText("Adresse Personnelle :");
        this.jPanel16.add(this.jLabel27);
        this.jLabel27.setBounds(10, 370, 160, 20);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setText("N\u00b0 Tel :");
        this.jPanel16.add(this.jLabel36);
        this.jLabel36.setBounds(510, 230, 80, 30);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setForeground(new Color(0, 0, 255));
        this.jLabel38.setText("Banque :");
        this.jPanel16.add(this.jLabel38);
        this.jLabel38.setBounds(560, 90, 70, 20);
        this.agence.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.agence);
        this.agence.setBounds(640, 150, 110, 30);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setText("Code Postale :");
        this.jPanel16.add(this.jLabel39);
        this.jLabel39.setBounds(630, 350, 120, 20);
        this.codepostale.setFont(new Font("Tahoma", 0, 14));
        this.codepostale.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.codepostaleActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.codepostale);
        this.codepostale.setBounds(640, 380, 100, 30);
        this.jPanel16.add(this.nombreenfant);
        this.nombreenfant.setBounds(180, 320, 160, 30);
        this.jPanel16.add(this.cm);
        this.cm.setBounds(550, 470, 190, 30);
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Tahoma", 1, 14));
        this.jLabel40.setText("Montant de la Pension  :");
        this.jPanel16.add(this.jLabel40);
        this.jLabel40.setBounds(10, 480, 170, 20);
        this.jPanel16.add(this.mp);
        this.mp.setBounds(190, 470, 190, 30);
        this.jLabel41.setBackground(new Color(153, 153, 255));
        this.jLabel41.setFont(new Font("Tahoma", 1, 14));
        this.jLabel41.setText("Cotisation Mansuelle :");
        this.jPanel16.add(this.jLabel41);
        this.jLabel41.setBounds(390, 470, 170, 20);
        this.jPanel16.add(this.jPanel1);
        this.jPanel1.setBounds(630, 110, 10, 10);
        this.jPanel2.setLayout(null);
        this.bg.add(this.parmois);
        this.parmois.setFont(new Font("Tahoma", 1, 12));
        this.parmois.setText("Par Mois");
        this.jPanel2.add(this.parmois);
        this.parmois.setBounds(10, 10, 90, 23);
        this.bg.add(this.partrimestre);
        this.partrimestre.setFont(new Font("Tahoma", 1, 12));
        this.partrimestre.setText("Par Trimestre");
        this.jPanel2.add(this.partrimestre);
        this.partrimestre.setBounds(110, 10, 160, 23);
        this.jPanel16.add(this.jPanel2);
        this.jPanel2.setBounds(220, 500, 270, 50);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("N\u00b0 :  ");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(430, 200, 40, 20);
        this.jPanel3.setLayout(null);
        this.ETAB.add(this.cn);
        this.cn.setFont(new Font("Tahoma", 1, 12));
        this.cn.setText("C.N.R.P.S");
        this.jPanel3.add(this.cn);
        this.cn.setBounds(10, 10, 83, 23);
        this.ETAB.add(this.cnss);
        this.cnss.setFont(new Font("Tahoma", 1, 12));
        this.cnss.setText("C.N.S.S");
        this.jPanel3.add(this.cnss);
        this.cnss.setBounds(130, 10, 69, 23);
        this.jPanel16.add(this.jPanel3);
        this.jPanel3.setBounds(180, 170, 240, 30);
        this.jComboBox3.setFont(new Font("Tahoma", 0, 14));
        this.jComboBox3.setForeground(new Color(0, 102, 255));
        this.jComboBox3.setModel(new DefaultComboBoxModel<String>(new String[]{"N dossier", "N cin"}));
        this.jLabel12.setFont(new Font("Tahoma", 1, 18));
        this.jLabel12.setText("Recherche par :");
        this.jButton16.setFont(new Font("Tahoma", 1, 12));
        this.jButton16.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton16.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                modifieradherentretretait.this.jButton16MouseClicked(evt);
            }
        });
        this.jButton16.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifieradherentretretait.this.jButton16ActionPerformed(evt);
            }
        });
        GroupLayout jPanel17Layout = new GroupLayout(this.jPanel17);
        this.jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addContainerGap().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.jLabel12).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jComboBox3, -2, 96, -2).addGap(31, 31, 31).addComponent(this.jTextField1, -2, 133, -2).addGap(18, 18, 18).addComponent(this.jButton16, -2, 88, -2).addContainerGap()).addGroup(jPanel17Layout.createSequentialGroup().addGap(772, 772, 772).addComponent(this.jSeparator3, -1, 1, 32767)))).addGroup(jPanel17Layout.createSequentialGroup().addComponent(this.jSeparator1, -2, 50, -2).addContainerGap(723, 32767)));
        jPanel17Layout.setVerticalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel12, -2, 27, -2).addComponent(this.jComboBox3, -2, 37, -2)).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel17Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(this.jSeparator3, -2, -1, -2).addContainerGap(-1, 32767)).addGroup(jPanel17Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSeparator1, -2, 10, -2)))).addGroup(jPanel17Layout.createSequentialGroup().addComponent(this.jTextField1, -2, 33, -2).addContainerGap(31, 32767)).addGroup(jPanel17Layout.createSequentialGroup().addComponent(this.jButton16, -2, 38, -2).addContainerGap()));
        this.jPanel16.add(this.jPanel17);
        this.jPanel17.setBounds(0, 20, 750, 40);
        this.jPanel16.add(this.jSeparator4);
        this.jSeparator4.setBounds(0, 70, 770, 10);
        this.mecano.setFont(new Font("Tahoma", 1, 14));
        this.mecano.setForeground(new Color(153, 0, 0));
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(80, 90, 120, 30);
        this.datecin1.setFont(new Font("Tahoma", 1, 14));
        this.datecin1.setForeground(new Color(153, 51, 0));
        this.datecin1.setText(".....................");
        this.jPanel16.add(this.datecin1);
        this.datecin1.setBounds(310, 140, 100, 30);
        this.etabb.setFont(new Font("Tahoma", 1, 14));
        this.etabb.setForeground(new Color(153, 51, 0));
        this.etabb.setText(".............................");
        this.jPanel16.add(this.etabb);
        this.etabb.setBounds(230, 200, 140, 17);
        this.datenai.setFont(new Font("Tahoma", 1, 14));
        this.datenai.setForeground(new Color(153, 51, 0));
        this.datenai.setText(".....................");
        this.jPanel16.add(this.datenai);
        this.datenai.setBounds(150, 280, 110, 30);
        this.coti.setFont(new Font("Tahoma", 1, 14));
        this.coti.setForeground(new Color(153, 51, 0));
        this.jPanel16.add(this.coti);
        this.coti.setBounds(100, 510, 110, 30);
        this.bq.setFont(new Font("Tahoma", 1, 14));
        this.bq.setForeground(new Color(153, 51, 0));
        this.bq.setText(".....................");
        this.jPanel16.add(this.bq);
        this.bq.setBounds(560, 120, 100, 30);
        this.datenaiconj1.setFont(new Font("Tahoma", 1, 14));
        this.datenaiconj1.setForeground(new Color(153, 51, 0));
        this.datenaiconj1.setText(".....................");
        this.jPanel16.add(this.datenaiconj1);
        this.datenaiconj1.setBounds(570, 410, 170, 20);
        this.add((Component)this.jPanel16, "card2");
        this.getAccessibleContext().setAccessibleName("BULETIN D'ADHESION");
    }

    private void nomActionPerformed(ActionEvent evt) {
    }

    private void cnrActionPerformed(ActionEvent evt) {
    }

    private void lieunaissanceActionPerformed(ActionEvent evt) {
    }

    private void ntelActionPerformed(ActionEvent evt) {
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        String parmoiss = "";
        String etab = "";
        Date actuelle = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String datd = dateFormat.format(actuelle);
        int l = 0;
        boolean ll = true;
        String ch = "";
        if (this.banque.getSelectedItem().equals("BT")) {
            ch = "BT";
        } else if (this.banque.getSelectedItem().equals("BNA")) {
            ch = "BNA";
        } else if (this.banque.getSelectedItem().equals("UIB")) {
            ch = "UIB";
        } else if (this.banque.getSelectedItem().equals("BH")) {
            ch = "BH";
        } else if (this.banque.getSelectedItem().equals("ATB")) {
            ch = "ATB";
        } else if (this.banque.getSelectedItem().equals("STB")) {
            ch = "STB";
        } else if (this.banque.getSelectedItem().equals("BZ")) {
            ch = "BZ";
        } else if (this.banque.getSelectedItem().equals("UBCI")) {
            ch = "UBCI";
        } else if (this.banque.getSelectedItem().equals("Poste")) {
            ch = "Poste";
        } else if (this.banque.getSelectedItem().equals("BIAT")) {
            ch = "BIAT";
        } else if (this.banque.getSelectedItem().equals("Aucune")) {
            ch = "";
        }
        System.out.println("l=" + l);
        if (this.parmois.isSelected()) {
            parmoiss = "par mois";
            l = 1;
        } else {
            l = 0;
        }
        System.out.println("l=" + l);
        if (l == 0) {
            if (this.partrimestre.isSelected()) {
                l = 1;
                parmoiss = "par trimestre";
            } else {
                l = 0;
            }
        }
        System.out.println("l=" + l);
        if (this.cn.isSelected()) {
            etab = "cnrps";
            ll = true;
        } else {
            ll = false;
        }
        if (!ll) {
            if (this.cnss.isSelected()) {
                ll = true;
                etab = "cnss";
            } else {
                ll = false;
            }
        }
        try {
            JOptionPane jop1;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            state.executeUpdate("UPDATE retretait SET rib='" + this.rib.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET agence='" + this.agence.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET cin='" + this.cin1.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET cnr='" + this.cnr.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET nom='" + this.nom.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET ntel='" + this.ntel.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET lieunaissance='" + this.lieunaissance.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET nombreenfant='" + this.nombreenfant.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET adres='" + this.adres.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET codepostale='" + this.codepostale.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET nomconjoinnt='" + this.nomconjoint.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET mp='" + this.mp.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            state.executeUpdate("UPDATE retretait SET cm='" + this.cm.getText() + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            if (l == 1) {
                System.out.println("pppppppppppp");
                state.executeUpdate("UPDATE retretait SET parmois='" + parmoiss + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            }
            if (ll) {
                state.executeUpdate("UPDATE retretait SET etab='" + etab + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            }
            if (ch != "") {
                state.executeUpdate("UPDATE retretait SET banque='" + ch + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            }
            Date dnai = this.dateani.getDate();
            Date dcin = this.datecin.getDate();
            Date dconj = this.dateaniconj.getDate();
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-YYYY");
            String datenaii = "";
            String dateconjointt = "";
            String datcinn = "";
            try {
                datcinn = f.format(dcin);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
            }
            try {
                datenaii = f.format(dnai);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
            }
            try {
                dateconjointt = f.format(dconj);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
            }
            if (datcinn != "") {
                state.executeUpdate("UPDATE retretait SET datecin='" + datcinn + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            }
            if (datenaii != "") {
                state.executeUpdate("UPDATE retretait SET datenai='" + datenaii + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            }
            if (dateconjointt != "") {
                state.executeUpdate("UPDATE retretait SET dateaniconj='" + dateconjointt + "' WHERE mecano='" + this.jTextField1.getText() + "'");
            }
            JOptionPane jop12 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Succes de modification  ", "Information", 1);
        }
        catch (Exception e) {
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur de modification  : " + e.getMessage());
        }
    }

    private void QuitterActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void banqueActionPerformed(ActionEvent evt) {
        String[] messageStrings = new String[]{"bt", "bna", "biat"};
    }

    private void codepostaleActionPerformed(ActionEvent evt) {
    }

    private void nomconjointActionPerformed(ActionEvent evt) {
    }

    private void jButton16MouseClicked(MouseEvent evt) {
    }

    private void jButton16ActionPerformed(ActionEvent evt) {
        block19 : {
            if (this.jComboBox3.getSelectedItem().equals("N cin")) {
                int cin = Integer.parseInt(this.jTextField1.getText());
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT MECANO  FROM  retretait WHERE cin=" + this.jTextField1.getText());
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas(recherche par N CIN)  ", "Information", 1);
                        break block19;
                    }
                    cin = Integer.parseInt(ch1);
                    ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE cin=" + this.jTextField1.getText());
                        while (result3.next()) {
                            this.mecano.setText(result3.getString("mecano"));
                            this.rib.setText(result3.getString("rib"));
                            this.agence.setText(result3.getString("agence"));
                            this.datecin1.setText(result3.getString("datecin"));
                            this.etabb.setText(result3.getString("etab"));
                            this.cin1.setText(result3.getString("cin"));
                            this.cnr.setText(result3.getString("cnr"));
                            this.bq.setText(result3.getString("banque"));
                            this.nom.setText(result3.getString("nom"));
                            this.ntel.setText(result3.getString("ntel"));
                            this.datenai.setText(result3.getString("datenai"));
                            this.lieunaissance.setText(result3.getString("lieunaissance"));
                            this.nombreenfant.setText(result3.getString("nombreenfant"));
                            this.adres.setText(result3.getString("adres"));
                            this.codepostale.setText(result3.getString("codepostale"));
                            this.nomconjoint.setText(result3.getString("nomconjoinnt"));
                            this.datenaiconj1.setText(result3.getString("dateaniconj"));
                            this.mp.setText(result3.getString("mp"));
                            this.cm.setText(result3.getString("cm"));
                            this.coti.setText(result3.getString("parmois"));
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                }
            } else if (this.jComboBox3.getSelectedItem().equals("N dossier")) {
                block20 : {
                    int cin = Integer.parseInt(this.jTextField1.getText());
                    String ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state = conn3.createStatement();
                        ResultSet result = state.executeQuery("SELECT mecano  FROM  retretait WHERE mecano=" + cin);
                        ResultSetMetaData resultMeta = result.getMetaData();
                        while (result.next()) {
                            for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                                ch1 = result.getObject(i).toString();
                            }
                        }
                        if (ch1.equals("")) {
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "Adheron n'existe pas (recherche par N dossier)", "Information", 1);
                            break block20;
                        }
                        ch1 = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state3 = conn3.createStatement();
                            ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + cin);
                            ResultSetMetaData resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                this.mecano.setText(result3.getString("mecano"));
                                this.rib.setText(result3.getString("rib"));
                                this.agence.setText(result3.getString("agence"));
                                this.datecin1.setText(result3.getString("datecin"));
                                this.etabb.setText(result3.getString("etab"));
                                this.cin1.setText(result3.getString("cin"));
                                this.cnr.setText(result3.getString("cnr"));
                                this.bq.setText(result3.getString("banque"));
                                this.nom.setText(result3.getString("nom"));
                                this.ntel.setText(result3.getString("ntel"));
                                this.datenai.setText(result3.getString("datenai"));
                                this.lieunaissance.setText(result3.getString("lieunaissance"));
                                this.nombreenfant.setText(result3.getString("nombreenfant"));
                                this.adres.setText(result3.getString("adres"));
                                this.codepostale.setText(result3.getString("codepostale"));
                                this.nomconjoint.setText(result3.getString("nomconjoinnt"));
                                this.datenaiconj1.setText(result3.getString("dateaniconj"));
                                this.mp.setText(result3.getString("mp"));
                                this.cm.setText(result3.getString("cm"));
                                this.coti.setText(result3.getString("parmois"));
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                    }
                }
                System.out.println(" n fiche");
            }
        }
    }

}

