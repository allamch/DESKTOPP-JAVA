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
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.Border;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.recherchecarnedecheque;

public class primedenaissance
extends JPanel {
    String nomenfant = "";
    String dateenfant = "";
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    String montt = "";
    double Nch;
    double Nfin;
    String numcarnetreserver = "";
    private JPanel ETATPRIME;
    private JLabel adh3;
    private JLabel adh4;
    private JLabel bebe1;
    private JLabel cinetat2;
    private JLabel cnr1;
    private JLabel cnr2;
    private JLabel d11;
    private JTextField d2;
    private JDateChooser datebebe;
    private JLabel datesy;
    private JTextField etabetat2;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel167;
    private JLabel jLabel168;
    private JLabel jLabel169;
    private JLabel jLabel17;
    private JLabel jLabel170;
    private JLabel jLabel172;
    private JLabel jLabel173;
    private JLabel jLabel174;
    private JLabel jLabel175;
    private JLabel jLabel176;
    private JLabel jLabel177;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel22;
    private JLabel jLabel24;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel21;
    private JPanel jPanel22;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JSeparator jSeparator11;
    private JSeparator jSeparator12;
    private JTextField jTextField43;
    private JTextField jTextField44;
    private JTextField jTextField46;
    private JTextField jTextField47;
    private JTextField jTextField48;
    private JTextField jTextField49;
    private JTextField jTextField50;
    private JTextField jTextField51;
    private JTextField jTextField53;
    private JTextField jTextField54;
    private JTextField jTextField55;
    private JTextField jTextField56;
    private JLabel m1;
    private JLabel m2;
    private JLabel m3;
    private JTextField mecano;
    private JLabel mecanoetat7;
    private JLabel mecc1;
    private JTextField mont;
    private JLabel mont1;
    private JLabel mont2;
    private JLabel montletcheque;
    private JLabel monttchifrecheque;
    private JLabel nomad2;
    private JLabel nomadh;
    private JLabel nomadherentcheque;
    private JTextField nombebe;
    private JLabel nu;
    private JLabel numchequeetat1;

    public primedenaissance() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel4 = new JLabel();
        this.mont = new JTextField();
        this.jLabel5 = new JLabel();
        this.nombebe = new JTextField();
        this.nomadh = new JLabel();
        this.datebebe = new JDateChooser();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel26 = new JLabel();
        this.jLabel27 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.d11 = new JLabel();
        this.nu = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel18 = new JLabel();
        this.bebe1 = new JLabel();
        this.cnr1 = new JLabel();
        this.nomad2 = new JLabel();
        this.jLabel22 = new JLabel();
        this.m1 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jLabel28 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jPanel22 = new JPanel();
        this.jLabel177 = new JLabel();
        this.ETATPRIME = new JPanel();
        this.jLabel167 = new JLabel();
        this.jSeparator11 = new JSeparator();
        this.jLabel168 = new JLabel();
        this.jLabel169 = new JLabel();
        this.adh3 = new JLabel();
        this.m3 = new JLabel();
        this.jLabel170 = new JLabel();
        this.numchequeetat1 = new JLabel();
        this.jLabel172 = new JLabel();
        this.jPanel21 = new JPanel();
        this.jLabel173 = new JLabel();
        this.jSeparator12 = new JSeparator();
        this.jLabel174 = new JLabel();
        this.jTextField43 = new JTextField();
        this.m2 = new JLabel();
        this.cnr2 = new JLabel();
        this.mont1 = new JLabel();
        this.adh4 = new JLabel();
        this.cinetat2 = new JLabel();
        this.jTextField44 = new JTextField();
        this.d2 = new JTextField();
        this.jTextField46 = new JTextField();
        this.jTextField47 = new JTextField();
        this.jTextField48 = new JTextField();
        this.jTextField49 = new JTextField();
        this.jTextField50 = new JTextField();
        this.jTextField51 = new JTextField();
        this.etabetat2 = new JTextField();
        this.jTextField53 = new JTextField();
        this.jTextField54 = new JTextField();
        this.jTextField55 = new JTextField();
        this.jTextField56 = new JTextField();
        this.mecanoetat7 = new JLabel();
        this.jLabel175 = new JLabel();
        this.jLabel176 = new JLabel();
        this.mont2 = new JLabel();
        this.jPanel4 = new JPanel();
        this.montletcheque = new JLabel();
        this.monttchifrecheque = new JLabel();
        this.nomadherentcheque = new JLabel();
        this.mecc1 = new JLabel();
        this.jLabel11 = new JLabel();
        this.datesy = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tempus Sans ITC", 1, 36));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Prime de naissance ");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(120, 20, 328, 33);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/prime/Capture.PNG")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(440, 40, 170, 150);
        this.jLabel3.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel3.setForeground(new Color(51, 0, 204));
        this.jLabel3.setText("Mecano :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(20, 70, 80, 29);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.mecanoActionPerformed(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyPressed(KeyEvent evt) {
                primedenaissance.this.mecanoKeyPressed(evt);
            }

            @Override
            public void keyReleased(KeyEvent evt) {
                primedenaissance.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(110, 70, 90, 30);
        this.jLabel4.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel4.setForeground(new Color(51, 0, 204));
        this.jLabel4.setText("Montant :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(210, 70, 80, 29);
        this.mont.setFont(new Font("Tahoma", 0, 14));
        this.mont.setEnabled(false);
        this.mont.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.montActionPerformed(evt);
            }
        });
        this.mont.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                primedenaissance.this.montKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mont);
        this.mont.setBounds(290, 70, 100, 30);
        this.jLabel5.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel5.setForeground(new Color(51, 0, 204));
        this.jLabel5.setText("Nom  de b\u00e9b\u00e9 :");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(20, 160, 140, 29);
        this.nombebe.setFont(new Font("Tahoma", 0, 14));
        this.nombebe.setEnabled(false);
        this.nombebe.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                primedenaissance.this.nombebeMouseClicked(evt);
            }
        });
        this.nombebe.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.nombebeActionPerformed(evt);
            }
        });
        this.nombebe.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                primedenaissance.this.nombebeKeyReleased(evt);
            }

            @Override
            public void keyTyped(KeyEvent evt) {
                primedenaissance.this.nombebeKeyTyped(evt);
            }
        });
        this.jPanel1.add(this.nombebe);
        this.nombebe.setBounds(180, 160, 250, 30);
        this.nomadh.setFont(new Font("Traditional Arabic", 0, 16));
        this.nomadh.setForeground(new Color(102, 0, 51));
        this.nomadh.setText(".........................................");
        this.jPanel1.add(this.nomadh);
        this.nomadh.setBounds(150, 120, 290, 30);
        this.jPanel1.add((Component)this.datebebe);
        this.datebebe.setBounds(180, 200, 140, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/prime/valider2.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(340, 200, 120, 40);
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/prime/quitter .PNG")));
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(460, 200, 120, 40);
        this.jLabel26.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel26.setForeground(new Color(51, 0, 204));
        this.jLabel26.setText("Date de naissance :");
        this.jPanel1.add(this.jLabel26);
        this.jLabel26.setBounds(20, 200, 150, 29);
        this.jLabel27.setFont(new Font("Traditional Arabic", 1, 18));
        this.jLabel27.setForeground(new Color(51, 0, 204));
        this.jLabel27.setText("Nom adherant :");
        this.jPanel1.add(this.jLabel27);
        this.jLabel27.setBounds(20, 120, 140, 29);
        this.jPanel3.setLayout(null);
        this.jPanel2.setBackground(new Color(255, 255, 255));
        this.jPanel2.setLayout(null);
        this.jLabel7.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/ENTET.PNG")));
        this.jPanel2.add(this.jLabel7);
        this.jLabel7.setBounds(50, 10, 480, 52);
        this.jLabel8.setFont(new Font("Tahoma", 0, 14));
        this.jLabel8.setText("Je suis le (a) nom\u00e9 :");
        this.jPanel2.add(this.jLabel8);
        this.jLabel8.setBounds(10, 270, 130, 17);
        this.jLabel9.setFont(new Font("Tahoma", 0, 18));
        this.jLabel9.setForeground(new Color(0, 0, 204));
        this.jLabel9.setText("A Mme la pr\u00e9sidente de la Mutuelle de la sant\u00e9 Tunis");
        this.jPanel2.add(this.jLabel9);
        this.jLabel9.setBounds(90, 90, 420, 22);
        this.jLabel10.setFont(new Font("Tahoma", 0, 12));
        this.jLabel10.setText("Prime N\u00b0:");
        this.jPanel2.add(this.jLabel10);
        this.jLabel10.setBounds(410, 60, 60, 15);
        this.d11.setFont(new Font("Tahoma", 0, 12));
        this.d11.setText("......................");
        this.jPanel2.add(this.d11);
        this.d11.setBounds(60, 60, 120, 15);
        this.nu.setFont(new Font("Tahoma", 0, 12));
        this.nu.setText("......................");
        this.jPanel2.add(this.nu);
        this.nu.setBounds(470, 60, 80, 15);
        this.jLabel13.setFont(new Font("Tahoma", 0, 12));
        this.jLabel13.setText("Mahdia le :");
        this.jPanel2.add(this.jLabel13);
        this.jLabel13.setBounds(0, 60, 70, 15);
        this.jLabel14.setFont(new Font("Tahoma", 1, 14));
        this.jLabel14.setText("Pi\u00e9ce jointes :");
        this.jPanel2.add(this.jLabel14);
        this.jLabel14.setBounds(40, 167, 100, 20);
        this.jLabel15.setFont(new Font("Tahoma", 0, 14));
        this.jLabel15.setText("Extrait de naissance ");
        this.jPanel2.add(this.jLabel15);
        this.jLabel15.setBounds(140, 167, 230, 20);
        this.jLabel16.setFont(new Font("Tahoma", 0, 14));
        this.jLabel16.setText("J'ai l'honneur de venir par la pr\u00e9sente vous demander de bien vouloir m'octroyer la prime ");
        this.jPanel2.add(this.jLabel16);
        this.jLabel16.setBounds(10, 210, 580, 17);
        this.jLabel17.setFont(new Font("Tahoma", 0, 14));
        this.jLabel17.setText("de naissance aff\u00e9rente \u00e0 mon fils ");
        this.jPanel2.add(this.jLabel17);
        this.jLabel17.setBounds(10, 240, 200, 17);
        this.jLabel18.setFont(new Font("Tahoma", 0, 14));
        this.jLabel18.setText("N\u00b0 CNR :");
        this.jPanel2.add(this.jLabel18);
        this.jLabel18.setBounds(20, 300, 60, 17);
        this.bebe1.setFont(new Font("Tahoma", 1, 14));
        this.bebe1.setText(".............................");
        this.jPanel2.add(this.bebe1);
        this.bebe1.setBounds(210, 230, 320, 30);
        this.cnr1.setFont(new Font("Tahoma", 1, 14));
        this.cnr1.setText(".............................");
        this.jPanel2.add(this.cnr1);
        this.cnr1.setBounds(80, 300, 210, 17);
        this.nomad2.setFont(new Font("Tahoma", 1, 14));
        this.nomad2.setText(".............................");
        this.jPanel2.add(this.nomad2);
        this.nomad2.setBounds(140, 267, 440, 20);
        this.jLabel22.setFont(new Font("Tahoma", 0, 14));
        this.jLabel22.setText("Mecano:");
        this.jPanel2.add(this.jLabel22);
        this.jLabel22.setBounds(320, 300, 60, 17);
        this.m1.setFont(new Font("Tahoma", 1, 14));
        this.m1.setText(".............................");
        this.jPanel2.add(this.m1);
        this.m1.setBounds(380, 300, 170, 17);
        this.jLabel24.setFont(new Font("Tahoma", 1, 14));
        this.jLabel24.setText("Meilleurs   salutations");
        this.jPanel2.add(this.jLabel24);
        this.jLabel24.setBounds(310, 330, 180, 30);
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setText("Objet:");
        this.jPanel2.add(this.jLabel28);
        this.jLabel28.setBounds(40, 140, 50, 17);
        this.jLabel29.setFont(new Font("Tahoma", 0, 14));
        this.jLabel29.setText("Demande de la prime de naissance ");
        this.jPanel2.add(this.jLabel29);
        this.jLabel29.setBounds(90, 140, 230, 17);
        this.jPanel22.setBackground(new Color(255, 255, 255));
        this.jPanel22.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jLabel177.setFont(new Font("Tahoma", 1, 14));
        this.jLabel177.setText("Signature ");
        GroupLayout jPanel22Layout = new GroupLayout(this.jPanel22);
        this.jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup().addContainerGap(30, 32767).addComponent(this.jLabel177, -2, 80, -2).addGap(28, 28, 28)));
        jPanel22Layout.setVerticalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.jLabel177, -2, 30, -2).addContainerGap(78, 32767)));
        this.jPanel2.add(this.jPanel22);
        this.jPanel22.setBounds(410, 380, 140, 110);
        this.jPanel3.add(this.jPanel2);
        this.jPanel2.setBounds(0, 20, 590, 520);
        this.ETATPRIME.setBackground(new Color(255, 255, 255));
        this.ETATPRIME.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.setLayout(null);
        this.jLabel167.setFont(new Font("Tahoma", 1, 24));
        this.jLabel167.setText("PHOTOCOPIE DU CHEQUE");
        this.ETATPRIME.add(this.jLabel167);
        this.jLabel167.setBounds(120, 550, 320, 30);
        this.jSeparator11.setBackground(new Color(0, 0, 0));
        this.jSeparator11.setForeground(new Color(0, 0, 0));
        this.ETATPRIME.add(this.jSeparator11);
        this.jSeparator11.setBounds(0, 230, 580, 10);
        this.jLabel168.setFont(new Font("Tahoma", 1, 24));
        this.jLabel168.setText("ETAT DE  PAYEMENT EN ESPECE");
        this.ETATPRIME.add(this.jLabel168);
        this.jLabel168.setBounds(70, 40, 420, 30);
        this.jLabel169.setFont(new Font("Tahoma", 0, 14));
        this.jLabel169.setText("Matricule :");
        this.ETATPRIME.add(this.jLabel169);
        this.jLabel169.setBounds(420, 310, 70, 30);
        this.adh3.setFont(new Font("Tahoma", 1, 14));
        this.adh3.setText("......................");
        this.ETATPRIME.add(this.adh3);
        this.adh3.setBounds(110, 310, 310, 30);
        this.m3.setFont(new Font("Tahoma", 1, 14));
        this.m3.setText("......................");
        this.ETATPRIME.add(this.m3);
        this.m3.setBounds(490, 310, 80, 30);
        this.jLabel170.setFont(new Font("Tahoma", 0, 14));
        this.jLabel170.setText("Je Soussign\u00e9 :");
        this.ETATPRIME.add(this.jLabel170);
        this.jLabel170.setBounds(20, 310, 90, 30);
        this.numchequeetat1.setFont(new Font("Tahoma", 1, 14));
        this.numchequeetat1.setText("......................");
        this.ETATPRIME.add(this.numchequeetat1);
        this.numchequeetat1.setBounds(270, 340, 260, 30);
        this.jLabel172.setFont(new Font("Tahoma", 0, 14));
        this.jLabel172.setText("tir\u00e9 sur B.T mahdia a titre de prime de naissance.");
        this.ETATPRIME.add(this.jLabel172);
        this.jLabel172.setBounds(10, 370, 310, 30);
        this.jPanel21.setBackground(new Color(255, 255, 255));
        this.jPanel21.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jLabel173.setFont(new Font("Tahoma", 1, 14));
        this.jLabel173.setText("Signature ");
        GroupLayout jPanel21Layout = new GroupLayout(this.jPanel21);
        this.jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup().addContainerGap(28, 32767).addComponent(this.jLabel173, -2, 80, -2).addContainerGap()));
        jPanel21Layout.setVerticalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addComponent(this.jLabel173, -2, 30, -2).addContainerGap(78, 32767)));
        this.ETATPRIME.add(this.jPanel21);
        this.jPanel21.setBounds(450, 410, 120, 110);
        this.jSeparator12.setBackground(new Color(0, 0, 0));
        this.jSeparator12.setForeground(new Color(0, 0, 0));
        this.ETATPRIME.add(this.jSeparator12);
        this.jSeparator12.setBounds(0, 532, 580, 10);
        this.jLabel174.setFont(new Font("Tahoma", 1, 24));
        this.jLabel174.setText("SERVICE DES  PRIMES ");
        this.ETATPRIME.add(this.jLabel174);
        this.jLabel174.setBounds(120, 260, 320, 30);
        this.jTextField43.setFont(new Font("Tahoma", 1, 12));
        this.jTextField43.setText("  Date");
        this.jTextField43.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField43.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.jTextField43ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField43);
        this.jTextField43.setBounds(10, 100, 60, 30);
        this.m2.setFont(new Font("Tahoma", 0, 10));
        this.m2.setText(".........");
        this.ETATPRIME.add(this.m2);
        this.m2.setBounds(79, 150, 30, 27);
        this.cnr2.setFont(new Font("Tahoma", 0, 12));
        this.cnr2.setText("...............");
        this.ETATPRIME.add(this.cnr2);
        this.cnr2.setBounds(280, 150, 70, 27);
        this.mont1.setFont(new Font("Tahoma", 0, 10));
        this.mont1.setText("..........");
        this.ETATPRIME.add(this.mont1);
        this.mont1.setBounds(450, 150, 50, 27);
        this.adh4.setFont(new Font("Tahoma", 0, 10));
        this.adh4.setText("..............");
        this.ETATPRIME.add(this.adh4);
        this.adh4.setBounds(130, 140, 140, 40);
        this.cinetat2.setFont(new Font("Tahoma", 0, 10));
        this.cinetat2.setText("...........");
        this.ETATPRIME.add(this.cinetat2);
        this.cinetat2.setBounds(510, 150, 60, 27);
        this.jTextField44.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField44);
        this.jTextField44.setBounds(120, 130, 150, 60);
        this.d2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.d2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.d2ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.d2);
        this.d2.setBounds(10, 130, 60, 60);
        this.jTextField46.setFont(new Font("Tahoma", 1, 12));
        this.jTextField46.setText("    Nom et Prenom");
        this.jTextField46.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField46.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.jTextField46ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField46);
        this.jTextField46.setBounds(120, 100, 150, 30);
        this.jTextField47.setFont(new Font("Tahoma", 1, 12));
        this.jTextField47.setText("  N\u00b0CIN");
        this.jTextField47.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField47.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.jTextField47ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField47);
        this.jTextField47.setBounds(500, 100, 70, 30);
        this.jTextField48.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField48);
        this.jTextField48.setBounds(500, 130, 70, 60);
        this.jTextField49.setFont(new Font("Tahoma", 1, 12));
        this.jTextField49.setText("Mecano");
        this.jTextField49.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField49.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.jTextField49ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField49);
        this.jTextField49.setBounds(70, 100, 50, 30);
        this.jTextField50.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField50);
        this.jTextField50.setBounds(70, 130, 50, 60);
        this.jTextField51.setFont(new Font("Tahoma", 1, 12));
        this.jTextField51.setText("Etablissement");
        this.jTextField51.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField51.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.jTextField51ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField51);
        this.jTextField51.setBounds(350, 100, 90, 30);
        this.etabetat2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.etabetat2);
        this.etabetat2.setBounds(350, 130, 90, 60);
        this.jTextField53.setFont(new Font("Tahoma", 1, 12));
        this.jTextField53.setText("    N\u00b0 CNR");
        this.jTextField53.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField53.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.jTextField53ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField53);
        this.jTextField53.setBounds(270, 100, 80, 30);
        this.jTextField54.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField54);
        this.jTextField54.setBounds(270, 130, 80, 60);
        this.jTextField55.setFont(new Font("Tahoma", 1, 12));
        this.jTextField55.setText("Montant");
        this.jTextField55.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField55.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                primedenaissance.this.jTextField55ActionPerformed(evt);
            }
        });
        this.ETATPRIME.add(this.jTextField55);
        this.jTextField55.setBounds(440, 100, 60, 30);
        this.jTextField56.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ETATPRIME.add(this.jTextField56);
        this.jTextField56.setBounds(440, 130, 60, 60);
        this.mecanoetat7.setFont(new Font("Tahoma", 0, 10));
        this.mecanoetat7.setText(".............");
        this.ETATPRIME.add(this.mecanoetat7);
        this.mecanoetat7.setBounds(80, 150, 50, 27);
        this.jLabel175.setFont(new Font("Tahoma", 0, 14));
        this.jLabel175.setText("Certifie avoir recu l'original du ch\u00e9que N\u00b0");
        this.ETATPRIME.add(this.jLabel175);
        this.jLabel175.setBounds(10, 340, 250, 30);
        this.jLabel176.setFont(new Font("Tahoma", 0, 14));
        this.jLabel176.setText("avec un montant de :");
        this.ETATPRIME.add(this.jLabel176);
        this.jLabel176.setBounds(10, 400, 140, 30);
        this.mont2.setFont(new Font("Tahoma", 1, 14));
        this.mont2.setText("......................");
        this.ETATPRIME.add(this.mont2);
        this.mont2.setBounds(150, 400, 290, 30);
        this.jPanel3.add(this.ETATPRIME);
        this.ETATPRIME.setBounds(10, 550, 580, 740);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setLayout(null);
        this.montletcheque.setFont(new Font("Tahoma", 0, 12));
        this.montletcheque.setText("................");
        this.jPanel4.add(this.montletcheque);
        this.montletcheque.setBounds(80, 50, 370, 20);
        this.monttchifrecheque.setFont(new Font("Arial Black", 0, 12));
        this.monttchifrecheque.setText("................");
        this.jPanel4.add(this.monttchifrecheque);
        this.monttchifrecheque.setBounds(350, 0, 110, 20);
        this.nomadherentcheque.setFont(new Font("Tahoma", 1, 14));
        this.nomadherentcheque.setText(".........................................................");
        this.jPanel4.add(this.nomadherentcheque);
        this.nomadherentcheque.setBounds(120, 70, 300, 20);
        this.jPanel4.add(this.mecc1);
        this.mecc1.setBounds(180, 0, 60, 20);
        this.jLabel11.setText("Mahdia ");
        this.jPanel4.add(this.jLabel11);
        this.jLabel11.setBounds(150, 160, 60, 14);
        this.datesy.setFont(new Font("Tahoma", 0, 12));
        this.datesy.setText("..............................");
        this.jPanel4.add(this.datesy);
        this.datesy.setBounds(200, 160, 170, 15);
        this.jPanel3.add(this.jPanel4);
        this.jPanel4.setBounds(30, 1310, 420, 160);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jPanel3, -1, 600, 32767)).addComponent(this.jPanel1, GroupLayout.Alignment.LEADING, -2, 610, -2)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 251, -2).addGap(31, 31, 31).addComponent(this.jPanel3, -2, 1438, -2).addContainerGap(-1, 32767)));
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void montActionPerformed(ActionEvent evt) {
    }

    private void nombebeActionPerformed(ActionEvent evt) {
        String stac = this.mont.getText();
        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
        this.mont.setText(stac + " DT");
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean k = false;
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Attention :voulez vouz vraiment imprimer une prime de" + this.mont.getText() + ")", "Attention", 0, 3);
        if (option == 0) {
            k = true;
        }
        if (k) {
            JOptionPane jop1;
            Date d1 = this.datebebe.getDate();
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
            String dat = "";
            try {
                dat = f.format(d1);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Saisire le date de naissance de b\u00e9b\u00e9  : ");
                k = false;
            }
            Date actuellEee = new Date();
            SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
            String datsystem = dateFormatft.format(actuellEee);
            String ann\u00e9es = datsystem.substring(6, datsystem.length());
            this.d11.setText(datsystem);
            this.d2.setText(datsystem);
            if (k) {
                Statement state2;
                String p;
                Connection conn2;
                Statement state22;
                ResultSet result2;
                Connection conn22;
                String p2;
                Connection conn23;
                Statement state23;
                String deb = "";
                String typcarnet = "Primes";
                k = false;
                int typena = 0;
                System.out.println("type de compte 2 =" + typcarnet);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    state23 = conn5.createStatement();
                    p2 = "0";
                    result2 = state23.executeQuery("SELECT * FROM comptecourant  WHERE observation='" + typcarnet + "' AND f='" + p2 + "'");
                    typena = 1;
                    while (result2.next()) {
                        this.numcarnet = result2.getString("num");
                        this.numerocheq = result2.getString("debut");
                        deb = result2.getString("datedebut");
                        k = true;
                    }
                }
                catch (Exception e) {
                    k = false;
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
                if (deb.equals("")) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state23 = conn22.createStatement();
                        p2 = "0";
                        state23.executeUpdate("UPDATE  talondescheque SET p='" + p2 + "' WHERE p='1'");
                        k = true;
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state23 = conn6.createStatement();
                        state23.executeUpdate("UPDATE  comptecourant SET datedebut='" + datsystem + "' WHERE num='" + this.numcarnet + "'");
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                    }
                } else {
                    typena = 2;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn7 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state23 = conn7.createStatement();
                        p2 = "1";
                        result2 = state23.executeQuery("SELECT * FROM talondescheque  WHERE type='" + typcarnet + "' AND p='" + p2 + "'");
                        System.out.println("********************************** =");
                        while (result2.next()) {
                            this.numerocheq = result2.getString("numcheque");
                            System.out.println("numero de cheque talon des cheque  =" + this.numerocheq);
                            this.numcarnet = result2.getString("Numcarnet");
                            k = true;
                        }
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane.showMessageDialog(null, "erreur montant numcheque et num carnet " + e.getMessage());
                    }
                }
                if (k) {
                    try {
                        this.Nch = Integer.parseInt(this.numerocheq);
                        if (typena == 2) {
                            this.Nch += 1.0;
                        }
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 1 " + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn8 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state23 = conn8.createStatement();
                        p2 = "1";
                        System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                        result2 = state23.executeQuery("SELECT * FROM comptecourant  WHERE num='" + this.numcarnet + "'");
                        while (result2.next()) {
                            this.numfin = result2.getString("fin");
                            System.out.println("numero de cheque fin =" + this.numfin);
                            k = true;
                        }
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                    }
                    try {
                        this.Nfin = Integer.parseInt(this.numfin);
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 2  " + e.getMessage());
                    }
                    if (this.Nfin >= this.Nch) {
                        if (this.Nfin == this.Nch) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                state23 = conn22.createStatement();
                                p2 = "1";
                                state23.executeUpdate("UPDATE  comptecourant SET f='" + p2 + "' WHERE num='" + this.numcarnet + "'");
                                state23.executeUpdate("UPDATE  comptecourant SET datefin='" + datsystem + "' WHERE num='" + this.numcarnet + "'");
                                k = true;
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection conn222 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    Statement state222 = conn222.createStatement();
                                    System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                                    ResultSet result22 = state23.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
                                    int kkk = 1;
                                    while (result22.next()) {
                                        if (kkk == 1) {
                                            String nauveaucarnet = result22.getString("num");
                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                Connection conn21 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                                Statement state21 = conn21.createStatement();
                                                state21.executeUpdate("UPDATE  comptecourant SET observation='" + typcarnet + "' WHERE num='" + nauveaucarnet + "'");
                                            }
                                            catch (Exception e) {
                                                k = false;
                                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                            }
                                        }
                                        ++kkk;
                                    }
                                }
                                catch (Exception e) {
                                    k = false;
                                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                }
                            }
                            catch (Exception e) {
                                k = false;
                                JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                            }
                        }
                        this.firstcheque = "" + this.Nch + "";
                        int jii = 0;
                        int ji = this.firstcheque.indexOf(".");
                        if (jii != -1) {
                            System.out.println("ji =" + jii);
                            this.firstcheque = this.firstcheque.substring(0, this.firstcheque.length() - 2);
                            System.out.println("firstcheque =" + this.firstcheque);
                        }
                        if (k) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                conn23 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                state2 = conn23.createStatement();
                                p = "0";
                                state2.executeUpdate("UPDATE  talondescheque SET p='" + p + "' WHERE numcheque='" + this.numerocheq + "'");
                                k = true;
                            }
                            catch (Exception e) {
                                k = false;
                                JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                            }
                        }
                        if (k) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                conn23 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                state2 = conn23.createStatement();
                                String banque = "banque";
                                String p3 = "1";
                                this.numchequeetat1.setText(this.firstcheque);
                                state2.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnet + "','" + this.mecano.getText() + "','" + this.montt + "','" + datsystem + "','" + typcarnet + "','" + p3 + "','" + banque + "')");
                                k = true;
                            }
                            catch (Exception e) {
                                k = false;
                                JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                            }
                        }
                    } else {
                        k = false;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn9 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state23 = conn9.createStatement();
                            p2 = "0";
                            System.out.println("type type  =" + typcarnet);
                            result2 = state23.executeQuery("SELECT * FROM comptecourant  WHERE f='" + p2 + "' AND observation ='" + typcarnet + "'");
                            while (result2.next()) {
                                this.numcarnetreserver = result2.getString("num");
                                this.firstcheque = result2.getString("debut");
                                System.out.println("numero de carnet cheque reserve 1 =" + this.numcarnetreserver);
                                k = true;
                            }
                        }
                        catch (Exception e) {
                            k = false;
                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                        }
                        if (this.numcarnetreserver.equals("")) {
                            System.out.println("numero de carnet cheque reserve 2 =" + this.numcarnetreserver);
                            k = false;
                            JOptionPane.showMessageDialog(null, "Aucune carnet de cheque: il faut ajouter un nouveaux carnet");
                        } else {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                state23 = conn22.createStatement();
                                p2 = "0";
                                state23.executeUpdate("UPDATE  talondescheque SET p='" + p2 + "' WHERE numcheque='" + this.numerocheq + "'");
                                k = true;
                            }
                            catch (Exception e) {
                                k = false;
                                JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                            }
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                state23 = conn22.createStatement();
                                p2 = "0";
                                state23.executeUpdate("UPDATE  comptecourant SET datedebut='" + datsystem + "' WHERE num='" + this.numcarnetreserver + "'");
                                k = true;
                            }
                            catch (Exception e) {
                                k = false;
                                JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                            }
                        }
                    }
                }
                if (k) {
                    String nummm = "";
                    String n = "";
                    boolean i = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT n FROM primesante  WHERE annee='" + ann\u00e9es + "'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nummm = result3.getString("n");
                            i = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                        i = false;
                    }
                    if (!i) {
                        n = "1";
                    } else {
                        int ni = Integer.parseInt(nummm);
                        n = "" + ++ni + "";
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn24 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state = conn24.createStatement();
                        this.nu.setText(n + "/" + ann\u00e9es);
                        String type = "prime de naissance";
                        System.out.println("aaaaaaaaaaaaaaa");
                        state.executeUpdate("INSERT INTO  primesante (n,annee,Mecano,Montant,type,date) VALUES ('" + n + "','" + ann\u00e9es + "','" + this.mecano.getText() + "','" + this.montt + "','" + type + "','" + datsystem + "')");
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Succes d'ajout ", "Information", 1);
                        Impression1 s = new Impression1(this.jPanel2);
                        s.actionPerformed(evt);
                        Impression1 sS = new Impression1(this.ETATPRIME);
                        sS.actionPerformed(evt);
                    }
                    catch (Exception e) {
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'ajout :" + e.getMessage());
                    }
                    String di = this.montt.substring(0, this.montt.length() - 3);
                    String mchbd = "";
                    try {
                        int monm = Integer.parseInt(di);
                        mchbd = Nombre.CALCULATE.getValue(monm, " Dinars ");
                    }
                    catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "erreur convertire montant en lettre ");
                    }
                    this.montletcheque.setText(mchbd);
                    this.monttchifrecheque.setText("#" + this.mont.getText() + " #");
                    JOptionPane.showMessageDialog(null, "Attention :  carnet de cheque N\u00b0:" + this.numcarnet + "  et N\u00b0 cheque :" + this.firstcheque + "", "Information", 1);
                }
                Impression1 sv = new Impression1(this.jPanel4);
                sv.actionPerformed(evt);
                this.nomenfant = this.nomenfant + " -- " + this.nombebe.getText();
                this.dateenfant = this.dateenfant + " -- " + dat;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    state22 = conn2.createStatement();
                    String p4 = "0";
                    state22.executeUpdate("UPDATE  adherent SET enfant='" + this.nomenfant + "' WHERE MECANO='" + this.mecano.getText() + "'");
                    state22.executeUpdate("UPDATE  adherent SET dateenfant='" + this.dateenfant + "' WHERE MECANO='" + this.mecano.getText() + "'");
                }
                catch (Exception e) {
                    k = false;
                    JOptionPane.showMessageDialog(null, "erreur de modification nom d'enfant: " + e.getMessage());
                }
                if (k) {
                    int total = 0;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn4.createStatement();
                        p = "1";
                        ResultSet result22 = state2.executeQuery("SELECT * FROM caisseprimemasp  WHERE n='" + p + "'");
                        while (result22.next()) {
                            String ttt = result22.getString("total");
                            total = Integer.parseInt(ttt);
                        }
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur montant comptecourant 66666666666666666666" + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn23 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn23.createStatement();
                        p = "0";
                        state2.executeUpdate("UPDATE caisseprimemasp SET n='0' ");
                        k = true;
                    }
                    catch (Exception e) {
                        k = false;
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur de modification caisse: " + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn23 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn23.createStatement();
                        k = true;
                        String pret = "0";
                        String prime = "1";
                        System.out.println("m2 =" + this.montt);
                        int tm = Integer.parseInt(this.montt);
                        String mm = "" + (total -= tm) + "";
                        state2.executeUpdate("INSERT INTO caisseprimemasp(date,mecano,debit,credit,total,n) VALUES('" + datsystem + "','" + this.mecano.getText() + "','" + this.montt + "','000','" + mm + "','1')");
                        this.mecano.setText("");
                        this.mont.setText("");
                        this.nombebe.setText("");
                        this.nomadh.setText("...............");
                    }
                    catch (Exception e) {
                        k = false;
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse : " + e.getMessage());
                    }
                }
                if (k) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state22 = conn2.createStatement();
                        k = true;
                        String pv = "1";
                        String mffd = this.mff + "000";
                        state22.executeUpdate("INSERT INTO etatdeschequeprimemasp(Mecano,date,montant,pv,numch) VALUES('" + this.mecano.getText() + "','" + datsystem + "','" + mffd + "','" + pv + "','" + this.firstcheque + "')");
                    }
                    catch (Exception e) {
                        k = false;
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'ajout a etatdeschequepretmasp : " + e.getMessage());
                    }
                }
            }
        }
    }

    private void jTextField43ActionPerformed(ActionEvent evt) {
    }

    private void d2ActionPerformed(ActionEvent evt) {
    }

    private void jTextField46ActionPerformed(ActionEvent evt) {
    }

    private void jTextField47ActionPerformed(ActionEvent evt) {
    }

    private void jTextField49ActionPerformed(ActionEvent evt) {
    }

    private void jTextField51ActionPerformed(ActionEvent evt) {
    }

    private void jTextField53ActionPerformed(ActionEvent evt) {
    }

    private void jTextField55ActionPerformed(ActionEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        this.m1.setText(this.mecano.getText());
        this.m2.setText(this.mecano.getText());
        this.m3.setText(this.mecano.getText());
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean k = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                k = true;
                this.nomadh.setText(result3.getString("nom"));
                this.nomadherentcheque.setText(result3.getString("nom"));
                this.nomad2.setText(result3.getString("nom"));
                this.adh3.setText(result3.getString("nom"));
                this.adh4.setText(result3.getString("nom"));
                this.cnr1.setText(result3.getString("NCNR"));
                this.cnr2.setText(result3.getString("NCNR"));
                this.etabetat2.setText(result3.getString("etab"));
                this.cinetat2.setText(result3.getString("CIN"));
                this.nomenfant = result3.getString("enfant");
                this.dateenfant = result3.getString("dateenfant");
            }
        }
        catch (Exception e) {
            // empty catch block
        }
        if (k) {
            this.mont.enable(true);
        }
    }

    private void montKeyReleased(KeyEvent evt) {
        this.nombebe.setText("");
        this.nombebe.enable(false);
        try {
            int montantnet = Integer.parseInt(this.mont.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.mont.setText("");
        }
    }

    private void nombebeMouseClicked(MouseEvent evt) {
        if (this.mont.getText().indexOf("DT") == -1) {
            if (this.mont.getText().length() < 5) {
                JOptionPane.showMessageDialog(null, "Ajoutez 000");
            } else {
                String stac;
                this.nombebe.enable(true);
                this.montt = stac = this.mont.getText();
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                this.mont.setText(stac + " DT");
                this.mont1.setText(this.mont.getText());
                this.mont2.setText(this.mont.getText());
            }
        }
    }

    private void nombebeKeyReleased(KeyEvent evt) {
        this.bebe1.setText(this.nombebe.getText());
    }

    private void nombebeKeyTyped(KeyEvent evt) {
    }

    private void mecanoKeyPressed(KeyEvent evt) {
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

