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
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
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

public class ajoutadherent1
extends JPanel {
    public ImageIcon Format = null;
    int s = 0;
    public static byte[] photo;
    byte[] Imagedata;
    private JButton Quitter;
    private JTextArea adresse;
    private JTextField agence;
    private JButton btnpath;
    private JTextField cinn;
    private JTextField cnrpss;
    private JTextField codepostale;
    private JDateChooser danii2;
    private JTextArea dateenfant;
    private JDateChooser dcinn1;
    private JDateChooser dconjj3;
    private JTextField echlon;
    private JTextArea enfantt;
    private JTextField etablissement;
    private JTextField hobital;
    private JLabel img;
    private JButton jButton15;
    private JComboBox jComboBox3;
    private JDesktopPane jDesktopPane1;
    private JLabel jLabel11;
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
    private JLabel jLabel40;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JSeparator jSeparator2;
    private JTextField jTextField2;
    private JTextField lieunai;
    private JTextField mecano;
    private JTextField nom;
    private JTextField nomconj;
    private JTextField ntel;
    private JTextField ribb;
    private JTextField service;
    private JComboBox trv;
    private JTextField txtpath;

    public ajoutadherent1() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel23 = new JLabel();
        this.jLabel22 = new JLabel();
        this.jLabel24 = new JLabel();
        this.ribb = new JTextField();
        this.jLabel25 = new JLabel();
        this.jLabel26 = new JLabel();
        this.nom = new JTextField();
        this.jLabel11 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel28 = new JLabel();
        this.jLabel18 = new JLabel();
        this.cnrpss = new JTextField();
        this.jSeparator2 = new JSeparator();
        this.trv = new JComboBox();
        this.jLabel29 = new JLabel();
        this.lieunai = new JTextField();
        this.jLabel21 = new JLabel();
        this.nomconj = new JTextField();
        this.jLabel30 = new JLabel();
        this.jLabel31 = new JLabel();
        this.ntel = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.dateenfant = new JTextArea();
        this.jButton15 = new JButton();
        this.Quitter = new JButton();
        this.cinn = new JTextField();
        this.jLabel32 = new JLabel();
        this.jComboBox3 = new JComboBox();
        this.jLabel33 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.adresse = new JTextArea();
        this.jScrollPane3 = new JScrollPane();
        this.enfantt = new JTextArea();
        this.jLabel34 = new JLabel();
        this.hobital = new JTextField();
        this.jLabel35 = new JLabel();
        this.jLabel27 = new JLabel();
        this.echlon = new JTextField();
        this.jLabel36 = new JLabel();
        this.etablissement = new JTextField();
        this.jLabel37 = new JLabel();
        this.service = new JTextField();
        this.jLabel38 = new JLabel();
        this.agence = new JTextField();
        this.jLabel39 = new JLabel();
        this.codepostale = new JTextField();
        this.jTextField2 = new JTextField();
        this.jDesktopPane1 = new JDesktopPane();
        this.jScrollPane4 = new JScrollPane();
        this.img = new JLabel();
        this.btnpath = new JButton();
        this.txtpath = new JTextField();
        this.jLabel40 = new JLabel();
        this.danii2 = new JDateChooser();
        this.dcinn1 = new JDateChooser();
        this.dconjj3 = new JDateChooser();
        this.setLayout(new CardLayout());
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "BULETIN D'ADHESION MUTUELLE", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel20.setBackground(new Color(153, 153, 255));
        this.jLabel20.setFont(new Font("Tahoma", 1, 14));
        this.jLabel20.setText("Etablissement Payeur :");
        this.jPanel16.add(this.jLabel20);
        this.jLabel20.setBounds(20, 350, 160, 30);
        this.jLabel23.setFont(new Font("Tahoma", 1, 14));
        this.jLabel23.setText("Date de naissance :");
        this.jPanel16.add(this.jLabel23);
        this.jLabel23.setBounds(20, 220, 140, 17);
        this.jLabel22.setBackground(new Color(153, 153, 255));
        this.jLabel22.setFont(new Font("Tahoma", 1, 14));
        this.jLabel22.setText("Nom conjoint :");
        this.jPanel16.add(this.jLabel22);
        this.jLabel22.setBounds(30, 410, 120, 20);
        this.jLabel24.setBackground(new Color(153, 153, 255));
        this.jLabel24.setFont(new Font("Tahoma", 1, 14));
        this.jLabel24.setText("Lieux de naissance :");
        this.jPanel16.add(this.jLabel24);
        this.jLabel24.setBounds(470, 220, 140, 20);
        this.ribb.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.ribb);
        this.ribb.setBounds(370, 30, 230, 30);
        this.jLabel25.setBackground(new Color(153, 153, 255));
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setForeground(new Color(0, 0, 255));
        this.jLabel25.setText("Adres img");
        this.jPanel16.add(this.jLabel25);
        this.jLabel25.setBounds(290, 110, 70, 20);
        this.jLabel26.setBackground(new Color(153, 153, 255));
        this.jLabel26.setFont(new Font("Tahoma", 1, 14));
        this.jLabel26.setText("Nom et Prenom :");
        this.jPanel16.add(this.jLabel26);
        this.jLabel26.setBounds(20, 180, 120, 20);
        this.nom.setFont(new Font("Tahoma", 0, 14));
        this.nom.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.nomActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nom);
        this.nom.setBounds(150, 170, 350, 30);
        this.jLabel11.setFont(new Font("Tahoma", 1, 14));
        this.jLabel11.setText("Hopital  :");
        this.jPanel16.add(this.jLabel11);
        this.jLabel11.setBounds(540, 260, 62, 17);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(90, 30, 160, 30);
        this.jLabel28.setBackground(new Color(153, 153, 255));
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setForeground(new Color(0, 0, 255));
        this.jLabel28.setText("Mecano :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(10, 40, 62, 17);
        this.jLabel18.setFont(new Font("Tahoma", 1, 18));
        this.jLabel18.setForeground(new Color(0, 0, 255));
        this.jLabel18.setText("RIB:");
        this.jPanel16.add(this.jLabel18);
        this.jLabel18.setBounds(290, 30, 50, 22);
        this.cnrpss.setFont(new Font("Tahoma", 0, 14));
        this.cnrpss.setCursor(new Cursor(2));
        this.cnrpss.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.cnrpssActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.cnrpss);
        this.cnrpss.setBounds(370, 70, 230, 30);
        this.jPanel16.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 150, 760, 10);
        this.trv.setFont(new Font("Tahoma", 1, 14));
        this.trv.setModel(new DefaultComboBoxModel<String>(new String[]{"Adjoint Technique", "Auxiliaire", "Attache", "Ouvrier", "Infirmier", "Infirmier Principal", "Tech.Superieur", "Commis", "Secretaire", "Administrateur Conseille", "Medecin", "Interne", "Resident", "Assistant", "Prof.Agrege", "Ingenieur Adjoint", "Directeur Executif"}));
        this.jPanel16.add(this.trv);
        this.trv.setBounds(110, 250, 180, 30);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("Agence :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(800, 290, 70, 20);
        this.lieunai.setFont(new Font("Tahoma", 0, 14));
        this.lieunai.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.lieunaiActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.lieunai);
        this.lieunai.setBounds(610, 210, 150, 30);
        this.jLabel21.setBackground(new Color(153, 153, 255));
        this.jLabel21.setFont(new Font("Tahoma", 1, 14));
        this.jLabel21.setText("Profession :");
        this.jPanel16.add(this.jLabel21);
        this.jLabel21.setBounds(20, 260, 100, 20);
        this.nomconj.setFont(new Font("Tahoma", 0, 14));
        this.nomconj.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.nomconjActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomconj);
        this.nomconj.setBounds(150, 400, 230, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setText("Echelon :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(300, 250, 80, 30);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setText("Date de naissance conjoint :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(400, 400, 210, 20);
        this.ntel.setFont(new Font("Tahoma", 0, 14));
        this.ntel.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.ntelActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.ntel);
        this.ntel.setBounds(610, 170, 150, 30);
        this.dateenfant.setColumns(20);
        this.dateenfant.setRows(5);
        this.jScrollPane1.setViewportView(this.dateenfant);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(380, 460, 270, 110);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Valider");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(770, 460, 110, 40);
        this.Quitter.setFont(new Font("Tahoma", 1, 12));
        this.Quitter.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.Quitter.setText("Quitter");
        this.Quitter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.QuitterActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.Quitter);
        this.Quitter.setBounds(770, 510, 110, 40);
        this.cinn.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.cinn);
        this.cinn.setBounds(90, 70, 160, 30);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("d\u00e9livr\u00e9 le :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(10, 110, 80, 30);
        this.jComboBox3.setFont(new Font("Tahoma", 0, 18));
        this.jComboBox3.setModel(new DefaultComboBoxModel<String>(new String[]{"Aucune", "ATB", "BT", "BH", "BNA", "BZ", "STB", "UIB", "UBCI", "BIAT", "Poste"}));
        this.jComboBox3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.jComboBox3ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jComboBox3);
        this.jComboBox3.setBounds(780, 240, 110, 30);
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setText("Nom Enfant :");
        this.jPanel16.add(this.jLabel33);
        this.jLabel33.setBounds(100, 440, 130, 20);
        this.adresse.setColumns(20);
        this.adresse.setRows(5);
        this.jScrollPane2.setViewportView(this.adresse);
        this.jPanel16.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(180, 300, 340, 40);
        this.enfantt.setColumns(20);
        this.enfantt.setRows(5);
        this.jScrollPane3.setViewportView(this.enfantt);
        this.jPanel16.add(this.jScrollPane3);
        this.jScrollPane3.setBounds(30, 460, 310, 110);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText(" C.I.N :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(10, 80, 60, 20);
        this.hobital.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.hobitalActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.hobital);
        this.hobital.setBounds(610, 250, 150, 30);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setText("Date de naissance enfant :");
        this.jPanel16.add(this.jLabel35);
        this.jLabel35.setBounds(420, 440, 190, 20);
        this.jLabel27.setBackground(new Color(153, 153, 255));
        this.jLabel27.setFont(new Font("Tahoma", 1, 14));
        this.jLabel27.setText("Adresse Personnelle :");
        this.jPanel16.add(this.jLabel27);
        this.jLabel27.setBounds(10, 280, 160, 20);
        this.echlon.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.echlonActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.echlon);
        this.echlon.setBounds(370, 250, 160, 30);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setText("N\u00b0 Tel :");
        this.jPanel16.add(this.jLabel36);
        this.jLabel36.setBounds(520, 170, 80, 30);
        this.etablissement.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.etablissementActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.etablissement);
        this.etablissement.setBounds(180, 350, 250, 30);
        this.jLabel37.setBackground(new Color(153, 153, 255));
        this.jLabel37.setFont(new Font("Tahoma", 1, 14));
        this.jLabel37.setText("Service :");
        this.jPanel16.add(this.jLabel37);
        this.jLabel37.setBounds(440, 360, 80, 30);
        this.service.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.serviceActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.service);
        this.service.setBounds(510, 360, 250, 30);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setForeground(new Color(0, 0, 255));
        this.jLabel38.setText("Banque :");
        this.jPanel16.add(this.jLabel38);
        this.jLabel38.setBounds(800, 210, 70, 20);
        this.agence.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.agence);
        this.agence.setBounds(780, 320, 110, 30);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setText("Code Postale :");
        this.jPanel16.add(this.jLabel39);
        this.jLabel39.setBounds(530, 300, 110, 30);
        this.codepostale.setFont(new Font("Tahoma", 0, 14));
        this.codepostale.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.codepostaleActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.codepostale);
        this.codepostale.setBounds(640, 300, 110, 30);
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel16.add(this.jTextField2);
        this.jTextField2.setBounds(768, 150, 2, 290);
        this.img.setIcon(new ImageIcon(this.getClass().getResource("/image/adh/rechercheadh.gif")));
        this.jScrollPane4.setViewportView(this.img);
        this.jScrollPane4.setBounds(0, 0, 230, 140);
        this.jDesktopPane1.add((Component)this.jScrollPane4, JLayeredPane.DEFAULT_LAYER);
        this.jPanel16.add(this.jDesktopPane1);
        this.jDesktopPane1.setBounds(660, 0, 230, 140);
        this.btnpath.setFont(new Font("Tahoma", 1, 14));
        this.btnpath.setText("Image");
        this.btnpath.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherent1.this.btnpathActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.btnpath);
        this.btnpath.setBounds(770, 150, 110, 30);
        this.jPanel16.add(this.txtpath);
        this.txtpath.setBounds(370, 110, 230, 30);
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Tahoma", 1, 14));
        this.jLabel40.setForeground(new Color(0, 0, 255));
        this.jLabel40.setText("N\u00b0 : C.N.R ");
        this.jPanel16.add(this.jLabel40);
        this.jLabel40.setBounds(290, 70, 80, 20);
        this.jPanel16.add((Component)this.danii2);
        this.danii2.setBounds(160, 210, 170, 30);
        this.jPanel16.add((Component)this.dcinn1);
        this.dcinn1.setBounds(90, 110, 160, 30);
        this.jPanel16.add((Component)this.dconjj3);
        this.dconjj3.setBounds(600, 400, 160, 30);
        this.add((Component)this.jPanel16, "card2");
        this.getAccessibleContext().setAccessibleName("BULETIN D'ADHESION");
    }

    private void nomActionPerformed(ActionEvent evt) {
    }

    private void cnrpssActionPerformed(ActionEvent evt) {
    }

    private void lieunaiActionPerformed(ActionEvent evt) {
    }

    private void nomconjActionPerformed(ActionEvent evt) {
    }

    private void ntelActionPerformed(ActionEvent evt) {
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        JOptionPane jop1;
        Date actuelle = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String datd = dateFormat.format(actuelle);
        String ch = "";
        if (this.jComboBox3.getSelectedItem().equals("BT")) {
            ch = "BT";
        } else if (this.jComboBox3.getSelectedItem().equals("BNA")) {
            ch = "BNA";
        } else if (this.jComboBox3.getSelectedItem().equals("UIB")) {
            ch = "UIB";
        } else if (this.jComboBox3.getSelectedItem().equals("BH")) {
            ch = "BH";
        } else if (this.jComboBox3.getSelectedItem().equals("ATB")) {
            ch = "ATB";
        } else if (this.jComboBox3.getSelectedItem().equals("STB")) {
            ch = "STB";
        } else if (this.jComboBox3.getSelectedItem().equals("BZ")) {
            ch = "BZ";
        } else if (this.jComboBox3.getSelectedItem().equals("UBCI")) {
            ch = "UBCI";
        } else if (this.jComboBox3.getSelectedItem().equals("Poste")) {
            ch = "Poste";
        } else if (this.jComboBox3.getSelectedItem().equals("BIAT")) {
            ch = "BIAT";
        } else if (this.jComboBox3.getSelectedItem().equals("Aucune")) {
            ch = "";
        }
        String dateconjoint = "";
        String datenaic = "";
        Date d1 = this.dcinn1.getDate();
        Date d2 = this.danii2.getDate();
        Date d3 = this.dconjj3.getDate();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        String datcin = "";
        try {
            datcin = f.format(d1);
        }
        catch (Exception e) {
            jop1 = new JOptionPane();
        }
        try {
            datenaic = f.format(d2);
        }
        catch (Exception e) {
            jop1 = new JOptionPane();
        }
        try {
            dateconjoint = f.format(d3);
        }
        catch (Exception e) {
            jop1 = new JOptionPane();
        }
        String mm = this.trv.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            String nbm = "0";
            state.executeUpdate("INSERT INTO adherent(MECANO,NOM,CIN,LIVCIN,DATNAI,LIEUNAI,NCNR,NOMCONJ,DATCONJ,ADRES,TEL,CCB,TRVAIL,LIEUTRAVAIL,typbanque,enfant,dateenfant,etab,serv,ech,datec,agence,codepostale,nbm,image) VALUES('" + this.mecano.getText() + "','" + this.nom.getText() + "','" + this.cinn.getText() + "','" + datcin + "','" + datenaic + "','" + this.lieunai.getText() + "','" + this.cnrpss.getText() + "','" + this.nomconj.getText() + "','" + dateconjoint + "','" + this.adresse.getText() + "','" + this.ntel.getText() + "','" + this.ribb.getText() + "','" + mm + "','" + this.hobital.getText() + "','" + ch + "','" + this.enfantt.getText() + "','" + this.dateenfant.getText() + "','" + this.etablissement.getText() + "','" + this.service.getText() + "','" + this.echlon.getText() + "','" + datd + "','" + this.agence.getText() + "','" + this.codepostale.getText() + "','" + nbm + "','" + this.txtpath.getText() + "')");
            JOptionPane jop12 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Succes d'ajout  ", "Information", 1);
            INKIRAT1 a = new INKIRAT1();
            a.setVisible(true);
            a.setvalued(this.mecano.getText(), this.ribb.getText(), this.cinn.getText(), this.cnrpss.getText(), datcin, this.agence.getText(), ch, this.nom.getText(), this.ntel.getText(), datenaic, this.lieunai.getText(), mm, this.hobital.getText(), this.adresse.getText(), this.codepostale.getText(), this.etablissement.getText(), this.echlon.getText(), this.service.getText(), this.nomconj.getText(), dateconjoint, this.enfantt.getText(), this.dateenfant.getText());
            a.show();
        }
        catch (Exception e) {
            JOptionPane jop13 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur d'ajout  : " + e.getMessage());
        }
    }

    private void QuitterActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(img.getWidth(this), img.getHeight(this), 4);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void jComboBox3ActionPerformed(ActionEvent evt) {
        String[] messageStrings = new String[]{"bt", "bna", "biat"};
    }

    private void hobitalActionPerformed(ActionEvent evt) {
    }

    private void echlonActionPerformed(ActionEvent evt) {
    }

    private void etablissementActionPerformed(ActionEvent evt) {
    }

    private void serviceActionPerformed(ActionEvent evt) {
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

