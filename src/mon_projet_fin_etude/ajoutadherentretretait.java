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
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.accessibility.AccessibleContext;
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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import mon_projet_fin_etude.INKIRATretetait;

public class ajoutadherentretretait
extends JPanel {
    String cmmm = "";
    String b = "";
    String codepostalee;
    String agencee;
    String cnrps;
    String nd;
    String cinn;
    String ribb;
    String nomm;
    String datenaicc;
    String dateconjointt;
    String lieudn;
    String ntell;
    String adress;
    String conjoint;
    String nbenfant;
    String montant;
    String cot;
    String cotm;
    String banquee;
    String cmm;
    String parmoiss;
    String etab;
    private ButtonGroup ETAB;
    private JButton Quitter;
    private JTextArea adres;
    private JTextField agence;
    private JComboBox banque;
    private ButtonGroup bg;
    private JTextField cin;
    private JTextField cm;
    private JRadioButton cn;
    private JTextField cnr;
    private JRadioButton cnss;
    private JTextField codepostale;
    private JDateChooser dani;
    private JDateChooser dcin;
    private JDateChooser dconj;
    private JButton jButton15;
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
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator2;
    private JTextField lieunaissance;
    private JTextField mecano;
    private JTextField mp;
    private JTextField nom;
    private JTextField nombreenfant;
    private JTextField nomconjoint;
    private JTextField ntel;
    private JRadioButton parmois;
    private JRadioButton partrimestre;
    private JTextField rib;

    public ajoutadherentretretait() {
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
        this.jLabel25 = new JLabel();
        this.jLabel26 = new JLabel();
        this.nom = new JTextField();
        this.mecano = new JTextField();
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
        this.cin = new JTextField();
        this.jLabel32 = new JLabel();
        this.banque = new JComboBox();
        this.jLabel33 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.adres = new JTextArea();
        this.jLabel34 = new JLabel();
        this.jLabel35 = new JLabel();
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
        this.dcin = new JDateChooser();
        this.dani = new JDateChooser();
        this.dconj = new JDateChooser();
        this.setLayout(new CardLayout());
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "BULETIN D'ADHESION (Retrait\u00e9)", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel23.setFont(new Font("Tahoma", 1, 14));
        this.jLabel23.setText("Date de naissance :");
        this.jPanel16.add(this.jLabel23);
        this.jLabel23.setBounds(10, 240, 140, 17);
        this.jLabel22.setBackground(new Color(153, 153, 255));
        this.jLabel22.setFont(new Font("Tahoma", 1, 14));
        this.jLabel22.setText("Nom conjoint :");
        this.jPanel16.add(this.jLabel22);
        this.jLabel22.setBounds(0, 390, 120, 20);
        this.jLabel24.setBackground(new Color(153, 153, 255));
        this.jLabel24.setFont(new Font("Tahoma", 1, 14));
        this.jLabel24.setText("Lieux de naissance :");
        this.jPanel16.add(this.jLabel24);
        this.jLabel24.setBounds(460, 240, 140, 20);
        this.rib.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.rib);
        this.rib.setBounds(260, 20, 290, 40);
        this.jLabel25.setBackground(new Color(153, 153, 255));
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setForeground(new Color(0, 0, 255));
        this.jLabel25.setText("Etablissemeent payeur :");
        this.jPanel16.add(this.jLabel25);
        this.jLabel25.setBounds(10, 130, 180, 20);
        this.jLabel26.setBackground(new Color(153, 153, 255));
        this.jLabel26.setFont(new Font("Tahoma", 1, 14));
        this.jLabel26.setText("Nom et Prenom :");
        this.jPanel16.add(this.jLabel26);
        this.jLabel26.setBounds(10, 200, 120, 20);
        this.nom.setFont(new Font("Tahoma", 0, 14));
        this.nom.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherentretretait.this.nomActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nom);
        this.nom.setBounds(140, 190, 350, 30);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(80, 30, 110, 30);
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
        this.jLabel18.setBounds(210, 30, 50, 22);
        this.cnr.setFont(new Font("Tahoma", 0, 14));
        this.cnr.setCursor(new Cursor(2));
        this.cnr.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherentretretait.this.cnrActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.cnr);
        this.cnr.setBounds(470, 120, 270, 30);
        this.jPanel16.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 170, 760, 10);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("Agence :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(560, 90, 70, 20);
        this.lieunaissance.setFont(new Font("Tahoma", 0, 14));
        this.lieunaissance.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherentretretait.this.lieunaissanceActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.lieunaissance);
        this.lieunaissance.setBounds(600, 230, 160, 30);
        this.nomconjoint.setFont(new Font("Tahoma", 0, 14));
        this.nomconjoint.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherentretretait.this.nomconjointActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomconjoint);
        this.nomconjoint.setBounds(120, 390, 230, 30);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setText("Date de naissance conjoint :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(370, 390, 210, 20);
        this.ntel.setFont(new Font("Tahoma", 0, 14));
        this.ntel.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherentretretait.this.ntelActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.ntel);
        this.ntel.setBounds(600, 190, 160, 30);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Valider");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherentretretait.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(500, 490, 110, 40);
        this.Quitter.setFont(new Font("Tahoma", 1, 12));
        this.Quitter.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.Quitter.setText("Quitter");
        this.Quitter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherentretretait.this.QuitterActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.Quitter);
        this.Quitter.setBounds(640, 490, 110, 40);
        this.cin.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.cin);
        this.cin.setBounds(70, 80, 160, 30);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("d\u00e9livr\u00e9 le :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(240, 80, 80, 30);
        this.banque.setFont(new Font("Tahoma", 0, 18));
        this.banque.setModel(new DefaultComboBoxModel<String>(new String[]{"Aucune", "ATB", "BT", "BH", "BNA", "BZ", "STB", "UIB", "UBCI", "BIAT", "Poste"}));
        this.banque.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherentretretait.this.banqueActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.banque);
        this.banque.setBounds(630, 30, 110, 30);
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setText("Cotisation :");
        this.jPanel16.add(this.jLabel33);
        this.jLabel33.setBounds(10, 490, 90, 20);
        this.adres.setColumns(20);
        this.adres.setRows(5);
        this.jScrollPane2.setViewportView(this.adres);
        this.jPanel16.add(this.jScrollPane2);
        this.jScrollPane2.setBounds(170, 320, 430, 50);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText(" C.I.N :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(10, 90, 60, 20);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setText("NB Enfant a charger:");
        this.jPanel16.add(this.jLabel35);
        this.jLabel35.setBounds(10, 290, 150, 20);
        this.jLabel27.setBackground(new Color(153, 153, 255));
        this.jLabel27.setFont(new Font("Tahoma", 1, 14));
        this.jLabel27.setText("Adresse Personnelle :");
        this.jPanel16.add(this.jLabel27);
        this.jLabel27.setBounds(10, 330, 160, 20);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setText("N\u00b0 Tel :");
        this.jPanel16.add(this.jLabel36);
        this.jLabel36.setBounds(510, 190, 80, 30);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setForeground(new Color(0, 0, 255));
        this.jLabel38.setText("Banque :");
        this.jPanel16.add(this.jLabel38);
        this.jLabel38.setBounds(560, 30, 70, 20);
        this.agence.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.agence);
        this.agence.setBounds(630, 80, 110, 30);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setText("Code Postale :");
        this.jPanel16.add(this.jLabel39);
        this.jLabel39.setBounds(630, 310, 120, 20);
        this.codepostale.setFont(new Font("Tahoma", 0, 14));
        this.codepostale.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutadherentretretait.this.codepostaleActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.codepostale);
        this.codepostale.setBounds(640, 340, 100, 30);
        this.jPanel16.add(this.nombreenfant);
        this.nombreenfant.setBounds(180, 280, 160, 30);
        this.jPanel16.add(this.cm);
        this.cm.setBounds(550, 440, 190, 30);
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Tahoma", 1, 14));
        this.jLabel40.setText("Montant de la Pension  :");
        this.jPanel16.add(this.jLabel40);
        this.jLabel40.setBounds(10, 440, 170, 20);
        this.jPanel16.add(this.mp);
        this.mp.setBounds(190, 430, 190, 30);
        this.jLabel41.setBackground(new Color(153, 153, 255));
        this.jLabel41.setFont(new Font("Tahoma", 1, 14));
        this.jLabel41.setText("Cotisation Mansuelle :");
        this.jPanel16.add(this.jLabel41);
        this.jLabel41.setBounds(390, 440, 170, 20);
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
        this.jPanel2.setBounds(100, 480, 270, 50);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("N\u00b0 :  ");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(430, 130, 40, 20);
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
        this.jPanel3.setBounds(180, 120, 240, 40);
        this.jPanel16.add((Component)this.dcin);
        this.dcin.setBounds(330, 70, 210, 40);
        this.jPanel16.add((Component)this.dani);
        this.dani.setBounds(150, 230, 260, 40);
        this.jPanel16.add((Component)this.dconj);
        this.dconj.setBounds(570, 380, 180, 40);
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
        JOptionPane jop1;
        Date actuelle = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String datd = dateFormat.format(actuelle);
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
        this.cnrps = this.cnr.getText();
        this.nd = this.mecano.getText();
        this.cinn = this.cin.getText();
        this.nomm = this.nom.getText();
        this.ntell = this.ntel.getText();
        this.ribb = this.rib.getText();
        this.banquee = ch;
        this.lieudn = this.lieunaissance.getText();
        this.nbenfant = this.nombreenfant.getText();
        this.adress = this.adres.getText();
        this.conjoint = this.nomconjoint.getText();
        this.agencee = this.agence.getText();
        this.codepostalee = this.codepostale.getText();
        this.montant = this.mp.getText();
        this.cmm = this.cm.getText();
        if (this.parmois.isSelected()) {
            this.parmoiss = "par mois";
        } else if (this.partrimestre.isSelected()) {
            this.parmoiss = "par trimestre";
        }
        if (this.cn.isSelected()) {
            this.etab = "cnrps";
        } else if (this.cnss.isSelected()) {
            this.etab = "cnss";
        }
        this.dateconjointt = "";
        this.datenaicc = "";
        Date d1 = this.dcin.getDate();
        Date d2 = this.dani.getDate();
        Date d3 = this.dconj.getDate();
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-YYYY");
        String datcin = "";
        try {
            datcin = f.format(d1);
        }
        catch (Exception e) {
            jop1 = new JOptionPane();
        }
        try {
            this.datenaicc = f.format(d2);
        }
        catch (Exception e) {
            jop1 = new JOptionPane();
        }
        try {
            this.dateconjointt = f.format(d3);
        }
        catch (Exception e) {
            jop1 = new JOptionPane();
        }
        this.cotm = this.cm.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            System.out.println("*******");
            String nbm = "0";
            state.executeUpdate("INSERT INTO retretait(mecano,rib,cin,datecin,cnr,etab,banque,agence,nom,ntel,datenai,lieunaissance,nombreenfant,adres,codepostale,nomconjoinnt,dateaniconj,mp,cm,parmois,nbm) VALUES('" + this.nd + "','" + this.ribb + "','" + this.cinn + "','" + datcin + "','" + this.cnrps + "','" + this.etab + "','" + this.banquee + "','" + this.agencee + "','" + this.nomm + "','" + this.ntell + "','" + this.datenaicc + "','" + this.lieudn + "','" + this.nbenfant + "','" + this.adress + "','" + this.codepostalee + "','" + this.conjoint + "','" + this.dateconjointt + "','" + this.montant + "','" + this.cmm + "','" + this.parmoiss + "','" + nbm + "')");
            JOptionPane jop12 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Succes d'ajout  ", "Information", 1);
            INKIRATretetait a = new INKIRATretetait();
            a.setVisible(true);
            a.setvalued(this.nd, this.cinn, datcin, this.ribb, this.banquee, this.agencee, this.etab, this.cnrps, this.nomm, this.datenaicc, this.lieudn, this.conjoint, this.dateconjointt, this.adress, this.codepostalee, this.ntell, this.nbenfant, this.montant, this.cmm, this.parmoiss);
            a.show();
            this.cnr.setText("");
            this.mecano.setText("");
            this.cin.setText("");
            this.nom.setText("");
            this.ntel.setText("");
            this.rib.setText("");
            this.lieunaissance.setText("");
            this.nombreenfant.setText("");
            this.adres.setText("");
            this.nomconjoint.setText("");
            this.agence.setText("");
            this.codepostale.setText("");
            this.mp.setText("");
            this.cm.setText("");
            this.parmois.setSelected(false);
            this.partrimestre.setSelected(false);
        }
        catch (Exception e) {
            jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "mecano existe  : " + e.getMessage());
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

    private void banqueActionPerformed(ActionEvent evt) {
        String[] messageStrings = new String[]{"bt", "bna", "biat"};
    }

    private void codepostaleActionPerformed(ActionEvent evt) {
    }

    private void nomconjointActionPerformed(ActionEvent evt) {
    }

}

