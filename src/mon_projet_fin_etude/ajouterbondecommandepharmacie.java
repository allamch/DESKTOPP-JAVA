/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.bna;
import mon_projet_fin_etude.recherchecarnedecheque;

public class ajouterbondecommandepharmacie
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    String matt = "";
    int k = 0;
    int kk = 0;
    int anedebut = 0;
    String type = "pharmacie";
    private JRadioButton CH;
    private JRadioButton CS;
    private JPanel INFO;
    private JLabel MOIS;
    private JRadioButton VR;
    private JLabel aabc;
    private JRadioButton acc;
    private JLabel bq;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JTextField codebc;
    private JLabel dt;
    private JRadioButton esp;
    private JRadioButton g2;
    private JButton jButton1;
    private JButton jButton2;
    private JComboBox jComboBox1;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel38;
    private JLabel jLabel4;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabelref;
    private JLabel jLabelreg;
    private JPanel jPanel1;
    private JPanel jPanel16;
    private JSeparator jSeparator3;
    private JLabel matff;
    private JTextField matriculefr;
    private JLabel mcc;
    private JTextField mecano;
    private JLabel mecanomadh;
    private JTextField moisdebut;
    private JLabel mont;
    private JLabel nb;
    private JLabel nbc;
    private JLabel nbmmmm;
    private JLabel nnbc;
    private JLabel nomadh;
    private JLabel nomadherant;
    private JLabel nomf;
    private JLabel noms;
    private JLabel nomscc;
    private JTextField ref;
    private JTextField reg;
    private JLabel remisee;
    private JLabel remisee1;

    public ajouterbondecommandepharmacie() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.buttonGroup2 = new ButtonGroup();
        this.INFO = new JPanel();
        this.jSeparator3 = new JSeparator();
        this.nomf = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel7 = new JLabel();
        this.noms = new JLabel();
        this.remisee = new JLabel();
        this.jLabel10 = new JLabel();
        this.nb = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.MOIS = new JLabel();
        this.remisee1 = new JLabel();
        this.jPanel16 = new JPanel();
        this.mecano = new JTextField();
        this.jLabel38 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel29 = new JLabel();
        this.nomadh = new JLabel();
        this.jLabel42 = new JLabel();
        this.jLabelreg = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel41 = new JLabel();
        this.codebc = new JTextField();
        this.jComboBox1 = new JComboBox();
        this.jLabel32 = new JLabel();
        this.nbc = new JLabel();
        this.matff = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.nbmmmm = new JLabel();
        this.moisdebut = new JTextField();
        this.jLabel43 = new JLabel();
        this.CH = new JRadioButton();
        this.VR = new JRadioButton();
        this.CS = new JRadioButton();
        this.g2 = new JRadioButton();
        this.reg = new JTextField();
        this.jLabel44 = new JLabel();
        this.jLabelref = new JLabel();
        this.ref = new JTextField();
        this.acc = new JRadioButton();
        this.esp = new JRadioButton();
        this.jLabel31 = new JLabel();
        this.matriculefr = new JTextField();
        this.jLabel3 = new JLabel();
        this.jPanel1 = new JPanel();
        this.nnbc = new JLabel();
        this.aabc = new JLabel();
        this.mcc = new JLabel();
        this.nomscc = new JLabel();
        this.mont = new JLabel();
        this.bq = new JLabel();
        this.nomadherant = new JLabel();
        this.mecanomadh = new JLabel();
        this.dt = new JLabel();
        this.jLabel2 = new JLabel();
        this.setLayout(null);
        this.INFO.setBorder(BorderFactory.createTitledBorder(null, "Information Fornisseur", 0, 0, new Font("Agency FB", 1, 14), new Color(0, 0, 255)));
        this.INFO.setLayout(null);
        this.INFO.add(this.jSeparator3);
        this.jSeparator3.setBounds(132, 91, 4, 2);
        this.nomf.setFont(new Font("Tahoma", 1, 13));
        this.nomf.setForeground(new Color(153, 0, 0));
        this.nomf.setText("............................");
        this.INFO.add(this.nomf);
        this.nomf.setBounds(10, 90, 180, 28);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Nom fournisseur :");
        this.INFO.add(this.jLabel4);
        this.jLabel4.setBounds(10, 60, 130, 17);
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setText("Nom Sociter:");
        this.INFO.add(this.jLabel7);
        this.jLabel7.setBounds(10, 130, 130, 17);
        this.noms.setFont(new Font("Tahoma", 1, 13));
        this.noms.setForeground(new Color(153, 0, 0));
        this.noms.setText("............................");
        this.INFO.add(this.noms);
        this.noms.setBounds(10, 160, 190, 28);
        this.remisee.setFont(new Font("Tahoma", 1, 18));
        this.remisee.setForeground(new Color(153, 0, 0));
        this.remisee.setText("..........");
        this.INFO.add(this.remisee);
        this.remisee.setBounds(110, 190, 40, 28);
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("Remise :");
        this.INFO.add(this.jLabel10);
        this.jLabel10.setBounds(10, 200, 130, 17);
        this.nb.setFont(new Font("Tahoma", 1, 18));
        this.nb.setForeground(new Color(153, 0, 0));
        this.nb.setText("..........");
        this.INFO.add(this.nb);
        this.nb.setBounds(110, 230, 70, 28);
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("Jour d\u00e9but :");
        this.INFO.add(this.jLabel12);
        this.jLabel12.setBounds(10, 270, 90, 30);
        this.jLabel13.setFont(new Font("Tahoma", 1, 14));
        this.jLabel13.setText("Nb de mois:");
        this.INFO.add(this.jLabel13);
        this.jLabel13.setBounds(10, 240, 90, 17);
        this.MOIS.setFont(new Font("Tahoma", 1, 14));
        this.MOIS.setForeground(new Color(153, 0, 0));
        this.MOIS.setText("..............");
        this.INFO.add(this.MOIS);
        this.MOIS.setBounds(110, 264, 80, 40);
        this.remisee1.setFont(new Font("Tahoma", 1, 18));
        this.remisee1.setForeground(new Color(153, 0, 0));
        this.remisee1.setText("%");
        this.INFO.add(this.remisee1);
        this.remisee1.setBounds(150, 190, 30, 28);
        this.add(this.INFO);
        this.INFO.setBounds(10, 60, 200, 340);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.mecano.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajouterbondecommandepharmacie.this.mecanoMouseClicked(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ajouterbondecommandepharmacie.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(130, 150, 170, 30);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setForeground(new Color(0, 0, 255));
        this.jLabel38.setText("Nom et prenom :");
        this.jPanel16.add(this.jLabel38);
        this.jLabel38.setBounds(370, 150, 120, 30);
        this.jLabel6.setFont(new Font("Snap ITC", 1, 24));
        this.jLabel6.setForeground(new Color(0, 0, 153));
        this.jLabel6.setText("Ajouter: Bon de Commande  pharmacie");
        this.jPanel16.add(this.jLabel6);
        this.jLabel6.setBounds(80, 10, 580, 40);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("N\u00b0 BC :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(620, 90, 60, 30);
        this.nomadh.setBackground(new Color(153, 153, 255));
        this.nomadh.setFont(new Font("Tahoma", 1, 14));
        this.nomadh.setForeground(new Color(153, 0, 0));
        this.nomadh.setText("................");
        this.jPanel16.add(this.nomadh);
        this.nomadh.setBounds(500, 150, 230, 30);
        this.jLabel42.setBackground(new Color(153, 153, 255));
        this.jLabel42.setFont(new Font("Tahoma", 1, 14));
        this.jLabel42.setForeground(new Color(0, 0, 255));
        this.jLabel42.setText("Code banque :");
        this.jPanel16.add(this.jLabel42);
        this.jLabel42.setBounds(330, 200, 110, 30);
        this.jLabelreg.setBackground(new Color(153, 153, 255));
        this.jLabelreg.setFont(new Font("Tahoma", 1, 14));
        this.jLabelreg.setForeground(new Color(0, 0, 255));
        this.jLabelreg.setText("Registre :");
        this.jPanel16.add(this.jLabelreg);
        this.jLabelreg.setBounds(254, 300, 66, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("Mat Fournisseur :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(390, 87, 130, 30);
        this.jLabel41.setBackground(new Color(153, 153, 255));
        this.jLabel41.setFont(new Font("Tahoma", 1, 14));
        this.jLabel41.setForeground(new Color(0, 0, 255));
        this.jLabel41.setText("Mois debut:");
        this.jPanel16.add(this.jLabel41);
        this.jLabel41.setBounds(10, 200, 90, 30);
        this.codebc.setFont(new Font("Tahoma", 0, 14));
        this.codebc.setEnabled(false);
        this.codebc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajouterbondecommandepharmacie.this.codebcMouseClicked(evt);
            }
        });
        this.codebc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyPressed(KeyEvent evt) {
                ajouterbondecommandepharmacie.this.codebcKeyPressed(evt);
            }
        });
        this.jPanel16.add(this.codebc);
        this.codebc.setBounds(440, 200, 90, 30);
        this.jComboBox1.setFont(new Font("Tahoma", 1, 14));
        this.jComboBox1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajouterbondecommandepharmacie.this.jComboBox1MouseClicked(evt);
            }
        });
        this.jComboBox1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouterbondecommandepharmacie.this.jComboBox1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jComboBox1);
        this.jComboBox1.setBounds(130, 90, 230, 40);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("Mecano :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(10, 160, 80, 17);
        this.nbc.setFont(new Font("Tahoma", 1, 18));
        this.nbc.setForeground(new Color(102, 0, 0));
        this.nbc.setText(".....");
        this.jPanel16.add(this.nbc);
        this.nbc.setBounds(680, 90, 60, 30);
        this.matff.setFont(new Font("Tahoma", 1, 18));
        this.matff.setForeground(new Color(102, 0, 0));
        this.matff.setText(".......");
        this.jPanel16.add(this.matff);
        this.matff.setBounds(520, 80, 90, 40);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouterbondecommandepharmacie.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(590, 250, 120, 40);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton2.setText("Vider");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouterbondecommandepharmacie.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton2);
        this.jButton2.setBounds(490, 250, 90, 40);
        this.nbmmmm.setFont(new Font("Tahoma", 1, 18));
        this.nbmmmm.setForeground(new Color(0, 102, 0));
        this.nbmmmm.setText("............");
        this.jPanel16.add(this.nbmmmm);
        this.nbmmmm.setBounds(630, 200, 80, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 18));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setEnabled(false);
        this.jPanel16.add(this.moisdebut);
        this.moisdebut.setBounds(130, 190, 100, 30);
        this.jLabel43.setBackground(new Color(153, 153, 255));
        this.jLabel43.setFont(new Font("Tahoma", 1, 14));
        this.jLabel43.setForeground(new Color(0, 0, 255));
        this.jLabel43.setText("NB mois :");
        this.jPanel16.add(this.jLabel43);
        this.jLabel43.setBounds(550, 200, 80, 30);
        this.buttonGroup2.add(this.CH);
        this.CH.setFont(new Font("Tahoma", 1, 14));
        this.CH.setText("cheque");
        this.CH.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajouterbondecommandepharmacie.this.CHMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.CH);
        this.CH.setBounds(160, 240, 93, 25);
        this.buttonGroup2.add(this.VR);
        this.VR.setFont(new Font("Tahoma", 1, 14));
        this.VR.setText("Virment");
        this.VR.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajouterbondecommandepharmacie.this.VRMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.VR);
        this.VR.setBounds(260, 240, 93, 25);
        this.buttonGroup2.add(this.CS);
        this.CS.setFont(new Font("Tahoma", 1, 14));
        this.CS.setText("Cession");
        this.CS.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajouterbondecommandepharmacie.this.CSMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.CS);
        this.CS.setBounds(360, 240, 93, 25);
        this.buttonGroup2.add(this.g2);
        this.g2.setText("jRadioButton7");
        this.jPanel16.add(this.g2);
        this.g2.setBounds(343, 360, 0, 23);
        this.reg.setFont(new Font("Tahoma", 1, 12));
        this.jPanel16.add(this.reg);
        this.reg.setBounds(330, 300, 110, 30);
        this.jLabel44.setBackground(new Color(153, 153, 255));
        this.jLabel44.setFont(new Font("Tahoma", 1, 14));
        this.jLabel44.setForeground(new Color(0, 0, 255));
        this.jLabel44.setText("Mode de paiement :");
        this.jPanel16.add(this.jLabel44);
        this.jLabel44.setBounds(10, 230, 140, 40);
        this.jLabelref.setBackground(new Color(153, 153, 255));
        this.jLabelref.setFont(new Font("Tahoma", 1, 14));
        this.jLabelref.setForeground(new Color(0, 0, 255));
        this.jLabelref.setText("R\u00e9ference :");
        this.jPanel16.add(this.jLabelref);
        this.jLabelref.setBounds(20, 300, 80, 30);
        this.ref.setFont(new Font("Tahoma", 1, 12));
        this.jPanel16.add(this.ref);
        this.ref.setBounds(110, 300, 110, 30);
        this.buttonGroup2.add(this.acc);
        this.acc.setFont(new Font("Tahoma", 1, 14));
        this.acc.setText("/COMPT");
        this.acc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajouterbondecommandepharmacie.this.accMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.acc);
        this.acc.setBounds(210, 270, 85, 25);
        this.buttonGroup2.add(this.esp);
        this.esp.setFont(new Font("Tahoma", 1, 14));
        this.esp.setText("Esp\u00e9ce");
        this.esp.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajouterbondecommandepharmacie.this.espMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.esp);
        this.esp.setBounds(320, 270, 73, 25);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setForeground(new Color(0, 0, 255));
        this.jLabel31.setText("Nom Sociter :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(10, 90, 110, 40);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(230, 20, 740, 380);
        this.matriculefr.setFont(new Font("Tahoma", 1, 14));
        this.matriculefr.setForeground(new Color(153, 153, 153));
        this.matriculefr.setText("         Matricule");
        this.matriculefr.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajouterbondecommandepharmacie.this.matriculefrMouseClicked(evt);
            }
        });
        this.matriculefr.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajouterbondecommandepharmacie.this.matriculefrActionPerformed(evt);
            }
        });
        this.matriculefr.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ajouterbondecommandepharmacie.this.matriculefrKeyReleased(evt);
            }
        });
        this.add(this.matriculefr);
        this.matriculefr.setBounds(70, 10, 140, 40);
        this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/53734.png")));
        this.add(this.jLabel3);
        this.jLabel3.setBounds(10, 0, 50, 50);
        this.jPanel1.setLayout(null);
        this.nnbc.setFont(new Font("Tahoma", 1, 12));
        this.nnbc.setText("........");
        this.jPanel1.add(this.nnbc);
        this.nnbc.setBounds(290, 10, 40, 30);
        this.aabc.setFont(new Font("Tahoma", 1, 12));
        this.aabc.setText("........");
        this.jPanel1.add(this.aabc);
        this.aabc.setBounds(350, 10, 50, 30);
        this.mcc.setFont(new Font("Tahoma", 1, 12));
        this.mcc.setText("...........");
        this.jPanel1.add(this.mcc);
        this.mcc.setBounds(500, 30, 70, 20);
        this.nomscc.setFont(new Font("Tahoma", 1, 12));
        this.nomscc.setText("........................................");
        this.jPanel1.add(this.nomscc);
        this.nomscc.setBounds(190, 50, 260, 20);
        this.mont.setFont(new Font("Tahoma", 1, 12));
        this.mont.setText("0.000");
        this.jPanel1.add(this.mont);
        this.mont.setBounds(500, 0, 100, 30);
        this.bq.setFont(new Font("Tahoma", 1, 12));
        this.bq.setText(".............");
        this.jPanel1.add(this.bq);
        this.bq.setBounds(500, 60, 70, 20);
        this.nomadherant.setFont(new Font("Tahoma", 1, 12));
        this.nomadherant.setText("............................................");
        this.jPanel1.add(this.nomadherant);
        this.nomadherant.setBounds(80, 110, 390, 30);
        this.mecanomadh.setFont(new Font("Tahoma", 1, 12));
        this.mecanomadh.setText("...............");
        this.jPanel1.add(this.mecanomadh);
        this.mecanomadh.setBounds(520, 110, 80, 30);
        this.dt.setFont(new Font("Tahoma", 1, 12));
        this.dt.setText("...............");
        this.jPanel1.add(this.dt);
        this.dt.setBounds(470, 180, 100, 30);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/image/pharmacie/phar.png")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(0, 0, 610, 270);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(250, 750, 610, 30);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void matriculefrKeyReleased(KeyEvent evt) {
        DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
        cmbModel.removeAllElements();
        cmbModel.removeAllElements();
        this.matff.setText(".....");
        this.nbc.setText(".....");
        this.moisdebut.setText("");
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean test = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + this.matriculefr.getText() + "'");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nomf.setText(result3.getString("NOMSOC"));
                this.noms.setText(result3.getString("NOMSOC"));
                this.remisee.setText(result3.getString("remise"));
                this.nb.setText(result3.getString("nbmois"));
                this.matff.setText(this.matriculefr.getText());
                this.matt = this.matriculefr.getText();
                this.MOIS.setText(result3.getString("mois"));
                test = true;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
        }
        if (test) {
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            int i = 0;
            int n = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.jComboBox1.addItem("");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur  WHERE  type='" + this.type + "' ORDER BY NOMSOC");
                while (result2.next()) {
                    ++i;
                    this.jComboBox1.addItem(result2.getString("NOMSOC"));
                    if (!this.matff.getText().equals(result2.getString("MATRIC"))) continue;
                    n = i;
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
            System.out.println("===============================");
            System.out.println("n= " + n);
            this.jComboBox1.setSelectedIndex(n);
            Date actuellEe = new Date();
            SimpleDateFormat dateFormatt = new SimpleDateFormat("yyyy");
            String datdd = dateFormatt.format(actuellEe);
            System.out.println("date = " + datdd);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc WHERE matf='" + this.matff.getText() + "' AND anneesdebut='" + datdd + "'");
                String nbn = "0";
                while (result2.next()) {
                    nbn = result2.getString("nbc");
                }
                int m = Integer.parseInt(nbn) + 1;
                System.out.println("nbn= " + nbn);
                this.nbc.setText("" + m + "");
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
        }
    }

    private void matriculefrMouseClicked(MouseEvent evt) {
        DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
        cmbModel.removeAllElements();
        cmbModel.removeAllElements();
        this.jButton1.setVisible(false);
        this.matff.setText(".......");
        this.nbc.setText(".....");
        this.matriculefr.setText("");
        this.mecano.setText("");
        this.nomadh.setText("................");
        this.nbmmmm.setText("................");
        this.moisdebut.enable(false);
        this.moisdebut.setText("");
        this.codebc.setText("");
        this.codebc.enable(false);
        this.nomf.setText("............................");
        this.noms.setText("............................");
        this.remisee.setText("..........");
        this.nb.setText("..........");
        this.MOIS.setText("..............");
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(true);
        this.jLabelreg.setVisible(true);
        this.g2.setSelected(true);
        this.CH.setSelected(false);
        this.VR.setAutoscrolls(false);
        this.CS.setVisible(false);
        this.esp.setAutoscrolls(false);
        this.acc.setVisible(false);
    }

    private void matriculefrActionPerformed(ActionEvent evt) {
    }

    private void espMouseClicked(MouseEvent evt) {
        this.jButton1.setVisible(true);
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(false);
        this.jLabelreg.setVisible(false);
    }

    private void accMouseClicked(MouseEvent evt) {
        this.jButton1.setVisible(true);
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(false);
        this.jLabelreg.setVisible(false);
    }

    private void CSMouseClicked(MouseEvent evt) {
        this.jButton1.setVisible(true);
        this.ref.setVisible(true);
        this.reg.setVisible(true);
        this.jLabelref.setVisible(true);
        this.jLabelreg.setVisible(true);
    }

    private void VRMouseClicked(MouseEvent evt) {
        this.jButton1.setVisible(true);
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(false);
        this.jLabelreg.setVisible(false);
        String nbbb = "";
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            ResultSet result3 = state.executeQuery("SELECT nbm FROM adherent  WHERE  MECANO='" + this.mecano.getText() + "'");
            while (result3.next()) {
                nbbb = result3.getString("nbm");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(bna.class.getName()).log(Level.SEVERE, null, ex);
        }
        int nnb = 0;
        try {
            nnb = Integer.parseInt(nbbb);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EREEURE : " + e.getMessage());
        }
    }

    private void CHMouseClicked(MouseEvent evt) {
        this.jButton1.setVisible(true);
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(false);
        this.jLabelreg.setVisible(false);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane jop12 = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment vider l'\u00e9cran", "Quitter", 0, 3);
        if (option == 0) {
            DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
            cmbModel.removeAllElements();
            cmbModel.removeAllElements();
            this.jButton1.setVisible(false);
            this.matff.setText(".......");
            this.nbc.setText(".....");
            this.matriculefr.setText("         Matricule");
            this.mecano.setText("");
            this.nomadh.setText("................");
            this.nbmmmm.setText("................");
            this.moisdebut.enable(false);
            this.moisdebut.setText("");
            this.codebc.setText("");
            this.codebc.enable(false);
            this.nomf.setText("............................");
            this.noms.setText("............................");
            this.remisee.setText("..........");
            this.nb.setText("..........");
            this.MOIS.setText("..............");
            this.ref.setVisible(false);
            this.reg.setVisible(false);
            this.jLabelref.setVisible(true);
            this.jLabelreg.setVisible(true);
            this.g2.setSelected(true);
            this.CH.setSelected(false);
            this.VR.setAutoscrolls(false);
            this.CS.setVisible(false);
            this.esp.setAutoscrolls(false);
            this.acc.setVisible(false);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String modpaim = "";
        boolean t = false;
        if (this.CH.isSelected()) {
            t = true;
            modpaim = "cheque";
        } else if (this.CS.isSelected()) {
            JOptionPane jop1;
            modpaim = "cs";
            t = true;
            if (this.ref.getText().equals("")) {
                t = false;
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "attention il faut saisir reference", "Information", 1);
            }
            if (this.reg.getText().equals("")) {
                t = false;
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "attention il faut saisir N\u00b0 registre", "Information", 1);
            }
        } else if (this.VR.isSelected()) {
            modpaim = "Vr";
            t = true;
        } else if (this.acc.isSelected()) {
            modpaim = "/cmpt";
            t = true;
        } else if (this.esp.isSelected()) {
            modpaim = "esp";
            t = true;
        } else {
            JOptionPane.showMessageDialog(null, "Choisir la mode de paiement");
            t = false;
        }
        if (t) {
            JOptionPane jop12 = new JOptionPane();
            int option = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment imprimer ce bonde de commande", "Quitter", 0, 3);
            if (option == 0) {
                String referencee = this.ref.getText() + "/" + this.reg.getText();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    this.k = 1;
                    String nb = "1";
                    String imprimeborde = "1";
                    String p = "0";
                    String f = "1";
                    state2.executeUpdate("UPDATE cessionfournisseur SET ref='" + referencee + "' WHERE Mecano='" + this.mecano.getText() + "'AND Matricule='" + this.matff.getText() + "'AND pv='" + p + "'");
                    state2.executeUpdate("UPDATE cessionfournisseur SET pv='" + f + "' WHERE Mecano='" + this.mecano.getText() + "'AND Matricule='" + this.matff.getText() + "'AND pv='" + p + "'");
                    String numcarnet = "";
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                }
                Date actuellEee = new Date();
                SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
                String datddf = dateFormatft.format(actuellEee);
                this.dt.setText(datddf);
                this.nnbc.setText(this.nbc.getText());
                this.aabc.setText("" + this.anedebut + "");
                this.bq.setText(this.codebc.getText());
                this.mcc.setText(this.moisdebut.getText());
                this.nomscc.setText(this.noms.getText());
                this.nomadherant.setText(this.nomadh.getText());
                this.mecanomadh.setText(this.mecano.getText());
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    String nbm = "000";
                    state.executeUpdate("INSERT INTO bc(Mecano,matf,nbc,datebc,moisdebut,anneesdebut,accompte,montantbc,montantdevis,nbmois,codeb,paimenpar,mode) VALUES('" + this.mecano.getText() + "','" + this.matff.getText() + "','" + this.nbc.getText() + "','" + datddf + "','" + this.moisdebut.getText() + "','" + this.aabc.getText() + "','" + nbm + "','" + nbm + "','" + nbm + "','" + this.nb.getText() + "','" + this.codebc.getText() + "','" + modpaim + "','" + modpaim + "')");
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Succes d'ajouter  ", "Information", 1);
                    Impression1 sv = new Impression1(this.jPanel1);
                    sv.actionPerformed(evt);
                    DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
                    cmbModel.removeAllElements();
                    cmbModel.removeAllElements();
                    this.jButton1.setVisible(false);
                    this.matff.setText(".......");
                    this.nbc.setText(".....");
                    this.matriculefr.setText("         Matricule");
                    this.mecano.setText("");
                    this.nomadh.setText("................");
                    this.nbmmmm.setText("................");
                    this.moisdebut.enable(false);
                    this.moisdebut.setText("");
                    this.codebc.setText("");
                    this.codebc.enable(false);
                    this.nomf.setText("............................");
                    this.noms.setText("............................");
                    this.remisee.setText("..........");
                    this.nb.setText("..........");
                    this.MOIS.setText("..............");
                    this.ref.setVisible(false);
                    this.reg.setVisible(false);
                    this.jLabelref.setVisible(true);
                    this.jLabelreg.setVisible(true);
                    this.g2.setSelected(true);
                    this.CH.setSelected(false);
                    this.VR.setAutoscrolls(false);
                    this.CS.setVisible(false);
                    this.esp.setAutoscrolls(false);
                    this.acc.setVisible(false);
                }
                catch (Exception e) {
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'ajout  :bon de commande d\u00e9ja exicte " + e.getMessage());
                }
            }
        }
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
    }

    private void jComboBox1MouseClicked(MouseEvent evt) {
        DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.jComboBox1.getModel();
        cmbModel.removeAllElements();
        cmbModel.removeAllElements();
        this.jButton1.setVisible(false);
        this.matff.setText(".......");
        this.nbc.setText(".....");
        this.matriculefr.setText("         Matricule");
        this.mecano.setText("");
        this.nomadh.setText("................");
        this.nbmmmm.setText("................");
        this.moisdebut.enable(false);
        this.moisdebut.setText("");
        this.codebc.setText("");
        this.codebc.enable(false);
        this.nomf.setText("............................");
        this.noms.setText("............................");
        this.remisee.setText("..........");
        this.nb.setText("..........");
        this.MOIS.setText("..............");
        this.ref.setVisible(false);
        this.reg.setVisible(false);
        this.jLabelref.setVisible(true);
        this.jLabelreg.setVisible(true);
        this.g2.setSelected(true);
        this.CH.setSelected(false);
        this.VR.setSelected(false);
        this.CS.setSelected(false);
        this.esp.setSelected(false);
        this.acc.setSelected(false);
        this.matff.setText(".......");
        this.nbc.setText(".......");
        this.matriculefr.setText("         Matricule");
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.jComboBox1.addItem("");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur  WHERE  type='" + this.type + "' ORDER BY NOMSOC");
            while (result2.next()) {
                this.jComboBox1.addItem(result2.getString("NOMSOC"));
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
    }

    private void codebcKeyPressed(KeyEvent evt) {
        if (!this.codebc.getText().equals("")) {
            try {
                int montantnet = Integer.parseInt(this.codebc.getText());
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!" + e);
                this.codebc.setText("");
            }
        }
    }

    private void codebcMouseClicked(MouseEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        Connection conn2 = null;
        this.kk = 0;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement state3;
            ResultSetMetaData resultMeta3;
            ResultSet result3;
            int montantnet = Integer.parseInt(this.mecano.getText());
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.kk = 1;
                    this.t = "S";
                    this.nomadh.setText(result3.getString("nom"));
                }
            }
            catch (Exception e) {
                // empty catch block
            }
            if (this.k == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        this.kk = 1;
                        this.t = "R";
                        this.nomadh.setText(result3.getString("nom"));
                    }
                }
                catch (Exception e) {
                    // empty catch block
                }
            }
            if (this.kk == 0) {
                this.nomadh.setText(".................");
            }
            System.out.println("k=" + this.k);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.mecano.setText("");
        }
    }

    private void mecanoMouseClicked(MouseEvent evt) {
        JOptionPane jop3;
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        String mat = "";
        System.out.println("---------------------------");
        String ch = this.jComboBox1.getSelectedItem().toString();
        System.out.print("-------------jkopkol--------------");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur WHERE NOMSOC='" + ch + "'");
            while (result2.next()) {
                mat = result2.getString("MATRIC");
                this.type = result2.getString("type");
                this.matff.setText(mat);
            }
        }
        catch (Exception e) {
            JOptionPane jop32 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("yyyy");
        String datdd = dateFormatt.format(actuellEe);
        System.out.append("date = " + datdd);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc WHERE matf='" + this.matff.getText() + "' AND anneesdebut='" + datdd + "'");
            String nbn = "0";
            while (result2.next()) {
                nbn = result2.getString("nbc");
            }
            int m = Integer.parseInt(nbn) + 1;
            this.nbc.setText("" + m + "");
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.matff.getText());
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nomf.setText(result3.getString("NOMSOC"));
                this.noms.setText(result3.getString("NOMSOC"));
                this.remisee.setText(result3.getString("remise"));
                this.nb.setText(result3.getString("nbmois"));
                this.nbmmmm.setText(result3.getString("nbmois"));
                this.MOIS.setText(result3.getString("mois"));
                this.matt = this.matriculefr.getText();
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
        }
        Date actuellEee = new Date();
        SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
        String datddf = dateFormatft.format(actuellEee);
        System.out.println("date = " + datddf);
        String jours = datddf.substring(0, datddf.length() - 8);
        System.out.println("jours = " + jours);
        int j = Integer.parseInt(jours);
        System.out.println("j = " + j);
        String mois2 = datddf.substring(3, datddf.length() - 5);
        System.out.println("mois = " + mois2);
        int ms = Integer.parseInt(mois2);
        System.out.println("ms = " + ms);
        String ann\u00e9es = datddf.substring(6, datddf.length());
        System.out.println("ann\u00e9es = " + ann\u00e9es);
        int moisdebutt = Integer.parseInt(mois2);
        this.codebc.enable(true);
        this.anedebut = Integer.parseInt(ann\u00e9es);
        System.out.println("moisdebutt = " + moisdebutt);
        if (this.MOIS.getText().equals("13")) {
            if (j >= 13 && ++moisdebutt > 12) {
                moisdebutt = 1;
                ++this.anedebut;
            }
        } else if (this.MOIS.getText().equals("1") && j >= 1 && ++moisdebutt > 12) {
            moisdebutt = 1;
            ++this.anedebut;
        }
        this.moisdebut.enable(true);
        this.moisdebut.setText("0" + moisdebutt);
    }

    public static enum Nombre {
        ZERO(0, "zero"),
        UN(1, "un"),
        DEUX(2, "deux"),
        TROIX(3, "trois"),
        QUATRE(4, "quatre"),
        CINQ(5, "cinq"),
        SIX(6, "six"),
        SEPT(7, "sept"),
        HUIT(8, "huit"),
        NEUF(9, "neuf"),
        DIX(10, "dix"),
        ONZE(11, "onze"),
        DOUZE(12, "douze"),
        TREIZE(13, "treize"),
        QUATORZE(14, "quatorze"),
        QUINZE(15, "quinze"),
        SEIZE(16, "seize"),
        DIXSEPT(17, "dix-sept"),
        DIXHUIT(18, "dix-huit"),
        DIXNEUF(19, "dix-neuf"),
        VINGT(20, 29, "vingt"),
        TRENTE(30, 39, "trente"),
        QUARANTE(40, 49, "quarante"),
        CINQUANTE(50, 59, "cinquante"),
        SOIXANTE(60, 69, "soixante"),
        SOIXANTEDIX(70, 79, "soixante-dix", SOIXANTE),
        QUATREVINGT(80, 89, "quatre-vingt", "s"),
        QUATREVINGTDIX(90, 99, "quatre-vingt-dix", QUATREVINGT),
        DIXAINE(10, 99),
        CENT(100, 999, "cent", DIXAINE),
        MILLE(1000, 999999, "mille", CENT),
        MILLION(1000000, 99999999, "million", MILLE),
        MILLIARD(1000000000, Long.MAX_VALUE, "milliard", MILLION),
        CALCULATE{

            @Override
            protected String getValue(long value) throws Exception {
                if (value == 0) {
                    return ZERO.label;
                }
                return (value < 0 ? "moins " : "") + MILLIARD.getStringValue(Math.abs(value));
            }

            @Override
            protected String getValue(double value, String separator) throws Exception {
                if (value == 0.0) {
                    return ZERO.label + " " + separator;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(value < 0.0 ? "moins " : "");
                String vstr = Double.toString(value);
                int indexOf = vstr.indexOf(46);
                if (indexOf == -1) {
                    sb.append(MILLIARD.getStringValue((long)Math.abs(value)));
                    sb.append(" ");
                    sb.append(separator);
                } else {
                    sb.append(MILLIARD.getStringValue(Long.parseLong(vstr.substring(0, indexOf))));
                    sb.append(" ");
                    sb.append(separator);
                    String floatting = vstr.substring(indexOf + 1, indexOf + 3 >= vstr.length() ? vstr.length() : indexOf + 3) + (indexOf + 3 >= vstr.length() ? "0" : "");
                    long v = Long.parseLong(floatting);
                    if (v != 0) {
                        sb.append(" ");
                        sb.append(MILLIARD.getStringValue(v));
                    }
                }
                return sb.toString();
            }
        };
        
        protected long min;
        protected long max;
        protected String label;
        protected Nombre before;
        private String addMin;

        private Nombre() {
        }

        private Nombre(long v, String s) {
            this(v, v, s);
        }

        private Nombre(long min, long max) {
            this.min = min;
            this.max = max;
        }

        private Nombre(long min, long max, String label, Nombre before) {
            this(min, max, label);
            this.before = before;
        }

        private Nombre(long min, long max, String label, String addMin) {
            this(min, max, label);
            this.addMin = addMin;
        }

        private Nombre(long min, long max, String label) {
            this(min, max);
            this.label = label;
        }

        protected String getValue(long value) throws Exception {
            throw new Exception("Vous devez appeller la m\u00e9thode par l'\u00e9num\u00e9ration Chiffre.CALCULATE");
        }

        protected String getValue(double value, String separator) throws Exception {
            throw new Exception("Vous devez appeller la m\u00e9thode par l'\u00e9num\u00e9ration Chiffre.CALCULATE");
        }

        private String getStringValue(long value) {
            long v1 = value / this.min;
            if (v1 == 0 && this.before != null) {
                return this.before.getStringValue(value);
            }
            StringBuilder add = new StringBuilder();
            Nombre[] values = Nombre.values();
            if (value < 20) {
                return values[(int)value].label;
            }
            for (int i = 0; i < values.length; ++i) {
                Nombre nombre = values[i];
                if (value < 100 && nombre.min <= value && nombre.max >= value) {
                    if (value == nombre.min) {
                        return nombre.label + (nombre.addMin != null ? nombre.addMin : "");
                    }
                    if (nombre.before != null) {
                        StringBuilder sb = new StringBuilder(nombre.before.label);
                        sb.append(value - nombre.min + 10 == 11 && nombre.equals((Object)SOIXANTEDIX) ? " et " : "-");
                        sb.append(DIXAINE.getStringValue(value - nombre.min + 10));
                        return sb.toString();
                    }
                    StringBuilder sb = new StringBuilder(nombre.label);
                    sb.append(value - nombre.min == 1 && !nombre.equals((Object)QUATREVINGT) ? " et " : "-");
                    sb.append(value - nombre.min > 0 ? DIXAINE.getStringValue(value - nombre.min) : "");
                    return sb.toString();
                }
                if (nombre.min > v1 || nombre.max < v1 || value < 100) continue;
                if ((this.equals((Object)MILLE) || this.equals((Object)CENT)) && UN.equals((Object)nombre)) {
                    add.append(this.label);
                } else {
                    add.append(nombre.getStringValue(v1));
                    add.append(MILLIARD.equals((Object)this) && (MILLION.equals((Object)nombre) || MILLIARD.equals((Object)nombre)) ? " de" : "");
                    add.append(this.label != null ? " " + this.label : "");
                }
                add.append(value - v1 * this.min > 0 ? " " + this.before.getStringValue(value - v1 * this.min) : (v1 > 1 ? "s" : ""));
                return add.toString();
            }
            return add.toString();
        }

    }

}

