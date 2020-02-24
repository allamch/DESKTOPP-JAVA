/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  com.toedter.calendar.JDateChooser
 */
package mon_projet_fin_etude;

import com.toedter.calendar.JDateChooser;
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
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import mon_projet_fin_etude.ConexionBD;
import mon_projet_fin_etude.INKIRAT1;

public class modiadh
extends JPanel {
    String ch = "";
    String ch1 = "";
    public ImageIcon Format = null;
    int s = 0;
    public static byte[] photo;
    byte[] Imagedata;
    private JTextArea adresse;
    private JTextField agencee;
    private JComboBox banq;
    private JLabel banq1;
    private JButton btnpath;
    private JTextField cinn;
    private JTextField cnrps;
    private JTextField codepostale;
    private JDateChooser dateaniconj;
    private JLabel dateaniconj1;
    private JDateChooser datecin;
    private JDateChooser datedenais;
    private JLabel datedenais1;
    private JLabel dateeecin;
    private JTextArea dateenfant;
    private JTextField echlon;
    private JTextArea enfantt;
    private JTextField etablissement;
    private JTextField hobital;
    private JLabel img;
    private JButton jButton15;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JDesktopPane jDesktopPane1;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel14;
    private JLabel jLabel18;
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
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JSeparator jSeparator2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField lieunai;
    private JTextField mecano;
    private JTextField nomconj;
    private JTextField nomm;
    private JTextField ntel;
    private JTextField rib;
    private JTextField service;
    private JComboBox travail;
    private JLabel travail1;
    private JTextField txtpath;

    public modiadh() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel23 = new JLabel();
        this.jLabel22 = new JLabel();
        this.jLabel24 = new JLabel();
        this.rib = new JTextField();
        this.datecin = new JDateChooser();
        this.jLabel25 = new JLabel();
        this.jLabel26 = new JLabel();
        this.nomm = new JTextField();
        this.jLabel11 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel28 = new JLabel();
        this.jLabel18 = new JLabel();
        this.cnrps = new JTextField();
        this.jSeparator2 = new JSeparator();
        this.travail = new JComboBox();
        this.jLabel29 = new JLabel();
        this.lieunai = new JTextField();
        this.jLabel21 = new JLabel();
        this.nomconj = new JTextField();
        this.jLabel30 = new JLabel();
        this.jLabel31 = new JLabel();
        this.ntel = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.dateenfant = new JTextArea();
        this.cinn = new JTextField();
        this.jLabel32 = new JLabel();
        this.banq = new JComboBox();
        this.jLabel33 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.adresse = new JTextArea();
        this.jScrollPane3 = new JScrollPane();
        this.enfantt = new JTextArea();
        this.jLabel34 = new JLabel();
        this.datedenais = new JDateChooser();
        this.hobital = new JTextField();
        this.jLabel35 = new JLabel();
        this.dateaniconj = new JDateChooser();
        this.jLabel27 = new JLabel();
        this.echlon = new JTextField();
        this.jLabel36 = new JLabel();
        this.etablissement = new JTextField();
        this.jLabel37 = new JLabel();
        this.service = new JTextField();
        this.jButton19 = new JButton();
        this.jButton17 = new JButton();
        this.jButton18 = new JButton();
        this.dateeecin = new JLabel();
        this.dateaniconj1 = new JLabel();
        this.banq1 = new JLabel();
        this.datedenais1 = new JLabel();
        this.travail1 = new JLabel();
        this.agencee = new JTextField();
        this.jLabel38 = new JLabel();
        this.jLabel39 = new JLabel();
        this.codepostale = new JTextField();
        this.jTextField1 = new JTextField();
        this.jButton15 = new JButton();
        this.jLabel12 = new JLabel();
        this.jTextField2 = new JTextField();
        this.btnpath = new JButton();
        this.jDesktopPane1 = new JDesktopPane();
        this.jScrollPane4 = new JScrollPane();
        this.img = new JLabel();
        this.txtpath = new JTextField();
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel20.setBackground(new Color(153, 153, 255));
        this.jLabel20.setFont(new Font("Tahoma", 1, 14));
        this.jLabel20.setText("Etablissement Payeur :");
        this.jPanel16.add(this.jLabel20);
        this.jLabel20.setBounds(10, 370, 160, 30);
        this.jLabel23.setFont(new Font("Tahoma", 1, 14));
        this.jLabel23.setText("Date de naissance :");
        this.jPanel16.add(this.jLabel23);
        this.jLabel23.setBounds(20, 250, 140, 17);
        this.jLabel22.setBackground(new Color(153, 153, 255));
        this.jLabel22.setFont(new Font("Tahoma", 1, 14));
        this.jLabel22.setText("Nom conjoint :");
        this.jPanel16.add(this.jLabel22);
        this.jLabel22.setBounds(10, 410, 110, 20);
        this.jLabel24.setBackground(new Color(153, 153, 255));
        this.jLabel24.setFont(new Font("Tahoma", 1, 14));
        this.jLabel24.setText("Lieux de naissance :");
        this.jPanel16.add(this.jLabel24);
        this.jLabel24.setBounds(450, 250, 140, 20);
        this.rib.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.rib);
        this.rib.setBounds(380, 70, 250, 30);
        this.jPanel16.add((Component)this.datecin);
        this.datecin.setBounds(270, 150, 150, 30);
        this.jLabel25.setBackground(new Color(153, 153, 255));
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setForeground(new Color(0, 0, 255));
        this.jLabel25.setText("N\u00b0 : C.N.R ");
        this.jPanel16.add(this.jLabel25);
        this.jLabel25.setBounds(290, 110, 80, 20);
        this.jLabel26.setBackground(new Color(153, 153, 255));
        this.jLabel26.setFont(new Font("Tahoma", 1, 14));
        this.jLabel26.setText("Nom et Prenom :");
        this.jPanel16.add(this.jLabel26);
        this.jLabel26.setBounds(20, 200, 120, 20);
        this.nomm.setFont(new Font("Tahoma", 0, 14));
        this.nomm.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.nommActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomm);
        this.nomm.setBounds(150, 200, 350, 30);
        this.jLabel11.setFont(new Font("Tahoma", 1, 14));
        this.jLabel11.setText("Hopital  :");
        this.jPanel16.add(this.jLabel11);
        this.jLabel11.setBounds(530, 290, 62, 17);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(90, 70, 160, 30);
        this.jLabel28.setBackground(new Color(153, 153, 255));
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setForeground(new Color(0, 0, 255));
        this.jLabel28.setText("Mecano :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(20, 80, 62, 17);
        this.jLabel18.setFont(new Font("Tahoma", 1, 18));
        this.jLabel18.setForeground(new Color(0, 0, 255));
        this.jLabel18.setText("RIB:");
        this.jPanel16.add(this.jLabel18);
        this.jLabel18.setBounds(290, 80, 50, 22);
        this.cnrps.setFont(new Font("Tahoma", 0, 14));
        this.cnrps.setCursor(new Cursor(2));
        this.cnrps.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.cnrpsActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.cnrps);
        this.cnrps.setBounds(380, 110, 250, 30);
        this.jPanel16.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 190, 900, 10);
        this.travail.setFont(new Font("Tahoma", 1, 14));
        this.travail.setModel(new DefaultComboBoxModel<String>(new String[]{"Aucune", "Adjoint Technique", "Auxiliaire", "Attache", "Ouvrier", "Infirmier", "Infirmier Principal", "Tech.Superieur", "Commis", "Secretaire", "Administrateur Conseille", "Medecin", "Interne", "Resident", "Assistant", "Prof.Agrege", "Ingenieur Adjoint", "Retraite", "Directeur Executif"}));
        this.jPanel16.add(this.travail);
        this.travail.setBounds(280, 280, 180, 30);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("Banque :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(800, 210, 70, 20);
        this.lieunai.setFont(new Font("Tahoma", 0, 14));
        this.lieunai.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.lieunaiActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.lieunai);
        this.lieunai.setBounds(600, 240, 160, 30);
        this.jLabel21.setBackground(new Color(153, 153, 255));
        this.jLabel21.setFont(new Font("Tahoma", 1, 14));
        this.jLabel21.setText("Profession :");
        this.jPanel16.add(this.jLabel21);
        this.jLabel21.setBounds(20, 270, 90, 40);
        this.nomconj.setFont(new Font("Tahoma", 0, 14));
        this.nomconj.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.nomconjActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomconj);
        this.nomconj.setBounds(120, 410, 160, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setText("Echelon :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(530, 350, 70, 20);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setText("Date de naissance conjoint :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(300, 410, 210, 40);
        this.ntel.setFont(new Font("Tahoma", 0, 14));
        this.ntel.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.ntelActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.ntel);
        this.ntel.setBounds(600, 200, 160, 30);
        this.dateenfant.setColumns(20);
        this.dateenfant.setRows(5);
        this.jScrollPane1.setViewportView(this.dateenfant);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(450, 460, 270, 100);
        this.cinn.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.cinn);
        this.cinn.setBounds(90, 110, 160, 30);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("d\u00e9livr\u00e9 le :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(20, 150, 80, 30);
        this.banq.setFont(new Font("Tahoma", 0, 18));
        this.banq.setModel(new DefaultComboBoxModel<String>(new String[]{"Aucune", "ATB", "BT", "BH", "BNA", "BZ", "BIAT", "STB", "UIB", "UBCI", "Attijari", "AMEN", "Poste"}));
        this.banq.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.banqActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.banq);
        this.banq.setBounds(790, 260, 110, 40);
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setText("Nom Enfant :");
        this.jPanel16.add(this.jLabel33);
        this.jLabel33.setBounds(110, 440, 130, 20);
        this.adresse.setColumns(20);
        this.adresse.setRows(5);
        this.jScrollPane2.setViewportView(this.adresse);
        this.jPanel16.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(180, 320, 330, 40);
        this.enfantt.setColumns(20);
        this.enfantt.setRows(5);
        this.jScrollPane3.setViewportView(this.enfantt);
        this.jPanel16.add(this.jScrollPane3);
        this.jScrollPane3.setBounds(30, 460, 310, 100);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText(" C.I.N :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(20, 120, 60, 20);
        this.jPanel16.add((Component)this.datedenais);
        this.datedenais.setBounds(280, 240, 160, 30);
        this.hobital.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.hobitalActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.hobital);
        this.hobital.setBounds(600, 280, 160, 30);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setText("Date de naissance enfant :");
        this.jPanel16.add(this.jLabel35);
        this.jLabel35.setBounds(500, 440, 190, 20);
        this.jPanel16.add((Component)this.dateaniconj);
        this.dateaniconj.setBounds(600, 410, 170, 30);
        this.jLabel27.setBackground(new Color(153, 153, 255));
        this.jLabel27.setFont(new Font("Tahoma", 1, 14));
        this.jLabel27.setText("Code Postale :");
        this.jPanel16.add(this.jLabel27);
        this.jLabel27.setBounds(520, 320, 120, 20);
        this.echlon.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.echlonActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.echlon);
        this.echlon.setBounds(600, 350, 160, 30);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setText("N\u00b0 Tel :");
        this.jPanel16.add(this.jLabel36);
        this.jLabel36.setBounds(510, 200, 80, 30);
        this.etablissement.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.etablissementActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.etablissement);
        this.etablissement.setBounds(180, 370, 250, 30);
        this.jLabel37.setBackground(new Color(153, 153, 255));
        this.jLabel37.setFont(new Font("Tahoma", 1, 14));
        this.jLabel37.setText("Service :");
        this.jPanel16.add(this.jLabel37);
        this.jLabel37.setBounds(440, 380, 80, 30);
        this.service.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.serviceActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.service);
        this.service.setBounds(510, 380, 250, 30);
        this.jButton19.setFont(new Font("Tahoma", 1, 12));
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton19.setText("Valider");
        this.jButton19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton19);
        this.jButton19.setBounds(790, 440, 120, 40);
        this.jButton17.setFont(new Font("Tahoma", 1, 12));
        this.jButton17.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton17.setText("imprimer");
        this.jButton17.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.jButton17ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton17);
        this.jButton17.setBounds(790, 480, 120, 40);
        this.jButton18.setFont(new Font("Tahoma", 1, 12));
        this.jButton18.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.jButton18.setText("QUITTER");
        this.jButton18.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.jButton18ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton18);
        this.jButton18.setBounds(790, 520, 120, 40);
        this.dateeecin.setFont(new Font("Tahoma", 1, 14));
        this.dateeecin.setForeground(new Color(153, 51, 0));
        this.dateeecin.setText(".....................");
        this.jPanel16.add(this.dateeecin);
        this.dateeecin.setBounds(100, 150, 130, 30);
        this.dateaniconj1.setFont(new Font("Tahoma", 1, 14));
        this.dateaniconj1.setForeground(new Color(153, 51, 0));
        this.dateaniconj1.setText(".....................");
        this.jPanel16.add(this.dateaniconj1);
        this.dateaniconj1.setBounds(500, 410, 100, 30);
        this.banq1.setFont(new Font("Tahoma", 1, 14));
        this.banq1.setForeground(new Color(153, 51, 0));
        this.banq1.setText(".....................");
        this.jPanel16.add(this.banq1);
        this.banq1.setBounds(790, 230, 100, 20);
        this.datedenais1.setFont(new Font("Tahoma", 1, 14));
        this.datedenais1.setForeground(new Color(153, 51, 0));
        this.datedenais1.setText(".....................");
        this.jPanel16.add(this.datedenais1);
        this.datedenais1.setBounds(160, 240, 130, 30);
        this.travail1.setFont(new Font("Tahoma", 1, 14));
        this.travail1.setForeground(new Color(153, 51, 0));
        this.travail1.setText(".....................");
        this.jPanel16.add(this.travail1);
        this.travail1.setBounds(110, 280, 170, 20);
        this.agencee.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.agencee);
        this.agencee.setBounds(790, 350, 110, 30);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setForeground(new Color(0, 0, 255));
        this.jLabel38.setText("Agence :");
        this.jPanel16.add(this.jLabel38);
        this.jLabel38.setBounds(810, 310, 70, 20);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setText("Adresse Personnelle :");
        this.jPanel16.add(this.jLabel39);
        this.jLabel39.setBounds(20, 320, 160, 20);
        this.codepostale.setFont(new Font("Tahoma", 0, 14));
        this.codepostale.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.codepostaleActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.codepostale);
        this.codepostale.setBounds(630, 310, 100, 30);
        this.jPanel16.add(this.jTextField1);
        this.jTextField1.setBounds(260, 10, 179, 33);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton15.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                modiadh.this.jButton15MouseClicked(evt);
            }
        });
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(460, 10, 88, 38);
        this.jLabel12.setFont(new Font("Tahoma", 1, 18));
        this.jLabel12.setText("Recherche par Mecano:");
        this.jPanel16.add(this.jLabel12);
        this.jLabel12.setBounds(40, 10, 216, 27);
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel16.add(this.jTextField2);
        this.jTextField2.setBounds(778, 200, 2, 240);
        this.btnpath.setFont(new Font("Tahoma", 1, 14));
        this.btnpath.setText("Importation d'image");
        this.btnpath.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modiadh.this.btnpathActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.btnpath);
        this.btnpath.setBounds(690, 160, 210, 30);
        this.img.setIcon(new ImageIcon(this.getClass().getResource("/image/adh/rechercheadh.gif")));
        this.jScrollPane4.setViewportView(this.img);
        this.jScrollPane4.setBounds(0, 0, 220, 160);
        this.jDesktopPane1.add((Component)this.jScrollPane4, JLayeredPane.DEFAULT_LAYER);
        this.jPanel16.add(this.jDesktopPane1);
        this.jDesktopPane1.setBounds(680, 0, 220, 150);
        this.jPanel16.add(this.txtpath);
        this.txtpath.setBounds(430, 150, 240, 30);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel16, -1, 910, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel16, GroupLayout.Alignment.TRAILING, -1, 586, 32767));
    }

    private void jButton17ActionPerformed(ActionEvent evt) {
        Date actuelle = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String datd = dateFormat.format(actuelle);
        if (this.banq.getSelectedItem().equals("BT")) {
            this.ch = "BT";
        } else if (this.banq.getSelectedItem().equals("BNA")) {
            this.ch = "BNA";
        } else if (this.banq.getSelectedItem().equals("UIB")) {
            this.ch = "UIB";
        } else if (this.banq.getSelectedItem().equals("BH")) {
            this.ch = "BH";
        } else if (this.banq.getSelectedItem().equals("ATB")) {
            this.ch = "ATB";
        } else if (this.banq.getSelectedItem().equals("Aucune")) {
            this.ch = "";
        }
        INKIRAT1 a = new INKIRAT1();
        a.setVisible(true);
        a.setvalued(this.mecano.getText(), this.rib.getText(), this.cinn.getText(), this.cnrps.getText(), this.dateeecin.getText(), this.agencee.getText(), this.banq1.getText(), this.nomm.getText(), this.ntel.getText(), this.datedenais1.getText(), this.lieunai.getText(), this.travail1.getText(), this.hobital.getText(), this.adresse.getText(), this.codepostale.getText(), this.etablissement.getText(), this.echlon.getText(), this.service.getText(), this.nomconj.getText(), this.dateaniconj1.getText(), this.enfantt.getText(), this.dateenfant.getText());
        a.show();
    }

    private void jButton18ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void jButton19ActionPerformed(ActionEvent evt) {
        block46 : {
            JOptionPane jop1;
            Connection conn2;
            Statement state;
            this.jButton17.setVisible(true);
            Date dnai = this.datedenais.getDate();
            Date dcin = this.datecin.getDate();
            Date dconj = this.dateaniconj.getDate();
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-YYYY");
            String datenai = "";
            String dateconjoint = "";
            String datcin = "";
            try {
                datcin = f.format(dcin);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
            }
            try {
                datenai = f.format(dnai);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
            }
            try {
                dateconjoint = f.format(dconj);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
            }
            if (this.banq.getSelectedItem().equals("BT")) {
                this.ch1 = "BT";
            } else if (this.banq.getSelectedItem().equals("BNA")) {
                this.ch1 = "BNA";
            } else if (this.banq.getSelectedItem().equals("UIB")) {
                this.ch1 = "UIB";
            } else if (this.banq.getSelectedItem().equals("BH")) {
                this.ch1 = "BH";
            } else if (this.banq.getSelectedItem().equals("AMEN")) {
                this.ch1 = "AMEN BANK";
            } else if (this.banq.getSelectedItem().equals("ATB")) {
                this.ch1 = "ATB";
            } else if (this.banq.getSelectedItem().equals("BZ")) {
                this.ch1 = "Zitouna";
            } else if (this.banq.getSelectedItem().equals("STB")) {
                this.ch1 = "STB";
            } else if (this.banq.getSelectedItem().equals("UBCI")) {
                this.ch1 = "UBCI";
            } else if (this.banq.getSelectedItem().equals("BIAT")) {
                this.ch1 = "BIAT";
            } else if (this.banq.getSelectedItem().equals("Attijari")) {
                this.ch1 = "Attijari";
            } else if (this.banq.getSelectedItem().equals("Poste")) {
                this.ch1 = "Poste";
            } else if (this.banq.getSelectedItem().equals("Aucune")) {
                this.ch1 = "";
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state = conn2.createStatement();
                state.executeUpdate("UPDATE adherent SET MECANO='" + this.mecano.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET NOM='" + this.nomm.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET CIN='" + this.cinn.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET LIEUNAI='" + this.lieunai.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET NCNR='" + this.cnrps.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET NOMCONJ='" + this.nomconj.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET ADRES='" + this.adresse.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET TEL='" + this.ntel.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET CCB='" + this.rib.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                String tr = (String)this.travail.getSelectedItem();
                System.out.println("travaille 1 = " + tr);
                if (tr != "Aucune") {
                    state.executeUpdate("UPDATE adherent SET TRVAIL='" + tr + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                    System.out.println("travaille 2 = " + tr);
                }
                state.executeUpdate("UPDATE adherent SET LIEUTRAVAIL='" + this.hobital.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                if (this.ch1 != "") {
                    state.executeUpdate("UPDATE adherent SET typbanque='" + this.ch1 + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                }
                state.executeUpdate("UPDATE adherent SET enfant='" + this.enfantt.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET dateenfant='" + this.dateenfant.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                if (datcin != "") {
                    state.executeUpdate("UPDATE adherent SET LIVCIN='" + datcin + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                }
                if (datenai != "") {
                    state.executeUpdate("UPDATE adherent SET DATNAI='" + datenai + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                }
                state.executeUpdate("UPDATE adherent SET ech='" + this.echlon.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET serv='" + this.service.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                if (dateconjoint != "") {
                    state.executeUpdate("UPDATE adherent SET DATCONJ='" + dateconjoint + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                }
                state.executeUpdate("UPDATE adherent SET etab='" + this.etablissement.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET agence='" + this.agencee.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                System.out.println(photo);
                state.executeUpdate("UPDATE adherent SET image='" + photo + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                state.executeUpdate("UPDATE adherent SET codepostale='" + this.codepostale.getText() + "' WHERE MECANO='" + this.jTextField1.getText() + "'");
                JOptionPane jop12 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Succes de modification  ", "Information", 1);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de modification  : " + e.getMessage());
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                state = conn2.createStatement();
                ResultSet result = state.executeQuery("SELECT MECANO  FROM  adherent WHERE MECANO=" + this.mecano.getText());
                ResultSetMetaData resultMeta = result.getMetaData();
                while (result.next()) {
                    for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                        this.ch1 = result.getObject(i).toString();
                    }
                }
                if (this.ch1.equals("")) {
                    JOptionPane jop13 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Adheron n'existe pas (recherche par N dossier)", "Information", 1);
                    break block46;
                }
                this.ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.jTextField1.getText());
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        this.rib.setText(result3.getString("CCB"));
                        this.cnrps.setText(result3.getString("NCNR"));
                        this.cinn.setText(result3.getString("CIN"));
                        this.dateeecin.setText(result3.getString("LIVCIN"));
                        this.nomm.setText(result3.getString("NOM"));
                        this.mecano.setText(result3.getString("MECANO"));
                        this.banq1.setText(result3.getString("typbanque"));
                        this.datedenais1.setText(result3.getString("DATNAI"));
                        this.travail1.setText(result3.getString("TRVAIL"));
                        this.hobital.setText(result3.getString("LIEUTRAVAIL"));
                        this.enfantt.setText(result3.getString("enfant"));
                        this.dateenfant.setText(result3.getString("dateenfant"));
                        this.ntel.setText(result3.getString("TEL"));
                        this.lieunai.setText(result3.getString("LIEUNAI"));
                        this.echlon.setText(result3.getString("ech"));
                        this.service.setText(result3.getString("serv"));
                        this.adresse.setText(result3.getString("ADRES"));
                        this.nomconj.setText(result3.getString("NOMCONJ"));
                        this.dateaniconj1.setText(result3.getString("DATCONJ"));
                        this.etablissement.setText(result3.getString("etab"));
                        this.agencee.setText(result3.getString("agence"));
                        this.codepostale.setText(result3.getString("codepostale"));
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
    }

    private void nommActionPerformed(ActionEvent evt) {
    }

    private void cnrpsActionPerformed(ActionEvent evt) {
    }

    private void lieunaiActionPerformed(ActionEvent evt) {
    }

    private void nomconjActionPerformed(ActionEvent evt) {
    }

    private void ntelActionPerformed(ActionEvent evt) {
    }

    private void banqActionPerformed(ActionEvent evt) {
    }

    private void hobitalActionPerformed(ActionEvent evt) {
    }

    private void echlonActionPerformed(ActionEvent evt) {
    }

    private void etablissementActionPerformed(ActionEvent evt) {
    }

    private void serviceActionPerformed(ActionEvent evt) {
    }

    private void jButton15MouseClicked(MouseEvent evt) {
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        block8 : {
            this.jButton17.setVisible(false);
            int cin = Integer.parseInt(this.jTextField1.getText());
            String ch1 = "";
            String nom = "";
            String CINN = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                ResultSet result = state.executeQuery("SELECT MECANO  FROM  adherent WHERE MECANO=" + cin);
                ResultSetMetaData resultMeta = result.getMetaData();
                while (result.next()) {
                    for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                        ch1 = result.getObject(i).toString();
                    }
                }
                if (ch1.equals("")) {
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Adheron n'existe pas (recherche par N dossier)", "Information", 1);
                    break block8;
                }
                cin = Integer.parseInt(ch1);
                ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.jTextField1.getText());
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("CCB");
                        this.rib.setText(nom);
                        this.cnrps.setText(result3.getString("NCNR"));
                        CINN = result3.getString("CIN");
                        this.cinn.setText(CINN);
                        nom = result3.getString("LIVCIN");
                        this.dateeecin.setText(nom);
                        nom = result3.getString("NOM");
                        this.nomm.setText(nom);
                        this.mecano.setText(result3.getString("MECANO"));
                        this.banq1.setText(result3.getString("typbanque"));
                        this.datedenais1.setText(result3.getString("DATNAI"));
                        this.travail1.setText(result3.getString("TRVAIL"));
                        this.hobital.setText(result3.getString("LIEUTRAVAIL"));
                        this.enfantt.setText(result3.getString("enfant"));
                        this.dateenfant.setText(result3.getString("dateenfant"));
                        nom = result3.getString("TEL");
                        this.ntel.setText(nom);
                        this.lieunai.setText(result3.getString("LIEUNAI"));
                        nom = result3.getString("ech");
                        this.echlon.setText(nom);
                        nom = result3.getString("serv");
                        this.service.setText(nom);
                        nom = result3.getString("ADRES");
                        this.adresse.setText(nom);
                        this.nomconj.setText(result3.getString("NOMCONJ"));
                        this.dateaniconj1.setText(result3.getString("DATCONJ"));
                        this.etablissement.setText(result3.getString("etab"));
                        this.agencee.setText(result3.getString("agence"));
                        this.codepostale.setText(result3.getString("codepostale"));
                        String bb = result3.getString("image");
                        this.img.setIcon(new ImageIcon(bb));
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
    }

    private void codepostaleActionPerformed(ActionEvent evt) {
    }

    public void imagess() {
        ConexionBD v = new ConexionBD();
        v.filen();
        String vpath = v.getp();
        try {
            if (vpath != null) {
                this.img.setIcon(new ImageIcon(vpath));
                this.txtpath.setText(vpath);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnpathActionPerformed(ActionEvent evt) {
        this.imagess();
    }

}

