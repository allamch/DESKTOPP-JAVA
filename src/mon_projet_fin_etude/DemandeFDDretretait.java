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
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.cessionsursalire;
import mon_projet_fin_etude.miseajourmontant;

public class DemandeFDDretretait
extends JPanel {
    String nomadh = "";
    String ch = "";
    String mont = "";
    int k = 1;
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    String numcarnetreserver = "";
    double Nch;
    double Nfin;
    int num = 1;
    private JLabel date1;
    private JLabel date2;
    private JLabel datesy;
    private JLabel datt;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
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
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel36;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JSeparator jSeparator1;
    private JTextField mat;
    private JLabel matricule;
    private JTextField mecano;
    private JLabel mecc;
    private JLabel mecc1;
    private JTextField mensualit\u00e9;
    private JLabel montletcheque;
    private JLabel monttchifrecheque;
    private JLabel nbmm;
    private JTextField nbmois;
    private JLabel ncina;
    private JLabel nomadherentcheque;
    private JLabel nomm;
    private JLabel nompre;
    private JLabel numces;
    private JLabel prm;
    private JLabel total;

    public DemandeFDDretretait() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.nbmois = new JTextField();
        this.mensualit\u00e9 = new JTextField();
        this.jButton1 = new JButton();
        this.jButton6 = new JButton();
        this.jButton2 = new JButton();
        this.mat = new JTextField();
        this.jLabel3 = new JLabel();
        this.jPanel4 = new JPanel();
        this.jLabel6 = new JLabel();
        this.jLabel11 = new JLabel();
        this.numces = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel25 = new JLabel();
        this.datt = new JLabel();
        this.jLabel9 = new JLabel();
        this.date2 = new JLabel();
        this.jLabel20 = new JLabel();
        this.total = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel22 = new JLabel();
        this.nbmm = new JLabel();
        this.jLabel23 = new JLabel();
        this.prm = new JLabel();
        this.jLabel24 = new JLabel();
        this.ncina = new JLabel();
        this.jLabel16 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jLabel17 = new JLabel();
        this.date1 = new JLabel();
        this.jLabel26 = new JLabel();
        this.nompre = new JLabel();
        this.jLabel28 = new JLabel();
        this.matricule = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jLabel32 = new JLabel();
        this.nomm = new JLabel();
        this.mecc = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel27 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jPanel3 = new JPanel();
        this.montletcheque = new JLabel();
        this.monttchifrecheque = new JLabel();
        this.nomadherentcheque = new JLabel();
        this.mecc1 = new JLabel();
        this.jLabel7 = new JLabel();
        this.datesy = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setText("Demande FDD");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(200, 0, 190, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Mecano :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(0, 40, 70, 20);
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                DemandeFDDretretait.this.mecanoActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(80, 40, 170, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Montant :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(260, 40, 90, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("NB de mois :");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(10, 80, 90, 30);
        this.nbmois.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                DemandeFDDretretait.this.nbmoisActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.nbmois);
        this.nbmois.setBounds(100, 80, 60, 30);
        this.mensualit\u00e9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                DemandeFDDretretait.this.mensualit\u00e9ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mensualit\u00e9);
        this.mensualit\u00e9.setBounds(350, 40, 160, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                DemandeFDDretretait.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(390, 80, 110, 30);
        this.jButton6.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton6.setText("vider");
        this.jButton6.setToolTipText("Quitter");
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                DemandeFDDretretait.this.jButton6ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton6);
        this.jButton6.setBounds(220, 120, 90, 40);
        this.jButton2.setText("Mise a jour montant");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                DemandeFDDretretait.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(330, 120, 160, 40);
        this.mat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                DemandeFDDretretait.this.matActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mat);
        this.mat.setBounds(290, 80, 80, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("1 er mois :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(210, 80, 80, 30);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setLayout(null);
        this.jLabel6.setFont(new Font("Tahoma", 1, 18));
        this.jLabel6.setForeground(new Color(0, 102, 204));
        this.jLabel6.setText("S/C de la Mutuelle  DES RETRAITES");
        this.jPanel4.add(this.jLabel6);
        this.jLabel6.setBounds(120, 70, 340, 30);
        this.jLabel11.setFont(new Font("Tahoma", 0, 14));
        this.jLabel11.setText("tir\u00e9  BT Mahdia titre de pret 231");
        this.jPanel4.add(this.jLabel11);
        this.jLabel11.setBounds(310, 450, 210, 30);
        this.numces.setFont(new Font("Tahoma", 1, 12));
        this.numces.setText("Mahdia le ");
        this.jPanel4.add(this.numces);
        this.numces.setBounds(360, 10, 170, 30);
        this.jLabel19.setFont(new Font("Tahoma", 0, 14));
        this.jLabel19.setText("mensualit\u00e9s");
        this.jPanel4.add(this.jLabel19);
        this.jLabel19.setBounds(450, 190, 80, 30);
        this.jLabel25.setFont(new Font("Tahoma", 0, 14));
        this.jLabel25.setText("atteste avoir recue le cheque N\u00b0");
        this.jPanel4.add(this.jLabel25);
        this.jLabel25.setBounds(0, 450, 200, 30);
        this.datt.setFont(new Font("Tahoma", 0, 12));
        this.datt.setText("......................");
        this.jPanel4.add(this.datt);
        this.datt.setBounds(80, 14, 140, 20);
        this.jLabel9.setFont(new Font("Tahoma", 1, 18));
        this.jLabel9.setForeground(new Color(0, 51, 204));
        this.jLabel9.setText("A Mme La Pr\u00e9sidente de la FDD Mahdia");
        this.jPanel4.add(this.jLabel9);
        this.jLabel9.setBounds(110, 40, 400, 30);
        this.date2.setFont(new Font("Tahoma", 1, 14));
        this.date2.setText("..........................");
        this.jPanel4.add(this.date2);
        this.date2.setBounds(330, 240, 210, 30);
        this.jLabel20.setFont(new Font("Tahoma", 0, 14));
        this.jLabel20.setText("au");
        this.jPanel4.add(this.jLabel20);
        this.jLabel20.setBounds(300, 240, 20, 30);
        this.total.setFont(new Font("Tahoma", 1, 14));
        this.total.setText(".................................................................");
        this.jPanel4.add(this.total);
        this.total.setBounds(20, 190, 260, 20);
        this.jLabel21.setFont(new Font("Tahoma", 0, 14));
        this.jLabel21.setText("remboursable sur ");
        this.jPanel4.add(this.jLabel21);
        this.jLabel21.setBounds(290, 190, 110, 30);
        this.jLabel22.setFont(new Font("Tahoma", 0, 14));
        this.jLabel22.setText("de ");
        this.jPanel4.add(this.jLabel22);
        this.jLabel22.setBounds(0, 190, 20, 30);
        this.nbmm.setFont(new Font("Tahoma", 1, 14));
        this.nbmm.setText(".......");
        this.jPanel4.add(this.nbmm);
        this.nbmm.setBounds(410, 190, 40, 30);
        this.jLabel23.setFont(new Font("Tahoma", 0, 14));
        this.jLabel23.setText("a raison de :");
        this.jPanel4.add(this.jLabel23);
        this.jLabel23.setBounds(0, 210, 80, 30);
        this.prm.setFont(new Font("Tahoma", 1, 14));
        this.prm.setText("..................");
        this.jPanel4.add(this.prm);
        this.prm.setBounds(80, 210, 190, 30);
        this.jLabel24.setFont(new Font("Tahoma", 0, 14));
        this.jLabel24.setText("A compter du ");
        this.jPanel4.add(this.jLabel24);
        this.jLabel24.setBounds(0, 240, 90, 30);
        this.ncina.setFont(new Font("Tahoma", 1, 14));
        this.ncina.setText("..........................");
        this.jPanel4.add(this.ncina);
        this.ncina.setBounds(200, 450, 110, 30);
        this.jLabel16.setText("Signature ");
        this.jPanel4.add(this.jLabel16);
        this.jLabel16.setBounds(340, 510, 80, 14);
        this.jPanel4.add(this.jSeparator1);
        this.jSeparator1.setBounds(0, 420, 540, 10);
        this.jLabel17.setFont(new Font("Tahoma", 0, 14));
        this.jLabel17.setText("vient par la pr\u00e9sente vous demander de bien vouloir m'accorder un pr\u00e9t");
        this.jPanel4.add(this.jLabel17);
        this.jLabel17.setBounds(0, 170, 550, 30);
        this.date1.setFont(new Font("Tahoma", 1, 14));
        this.date1.setText("..........................");
        this.jPanel4.add(this.date1);
        this.date1.setBounds(90, 240, 190, 30);
        this.jLabel26.setFont(new Font("Tahoma", 0, 14));
        this.jLabel26.setText("je soussign\u00e9 :");
        this.jPanel4.add(this.jLabel26);
        this.jLabel26.setBounds(0, 150, 90, 30);
        this.nompre.setFont(new Font("Tahoma", 1, 14));
        this.nompre.setText(".....................................");
        this.jPanel4.add(this.nompre);
        this.nompre.setBounds(90, 150, 170, 30);
        this.jLabel28.setFont(new Font("Tahoma", 0, 14));
        this.jLabel28.setText("Objet: Demande de pr\u00e9t ");
        this.jPanel4.add(this.jLabel28);
        this.jLabel28.setBounds(10, 130, 170, 30);
        this.matricule.setFont(new Font("Tahoma", 1, 14));
        this.matricule.setText("..........................");
        this.jPanel4.add(this.matricule);
        this.matricule.setBounds(320, 150, 110, 30);
        this.jLabel30.setFont(new Font("Tahoma", 0, 14));
        this.jLabel30.setText("matricule");
        this.jPanel4.add(this.jLabel30);
        this.jLabel30.setBounds(260, 150, 60, 30);
        this.jLabel31.setText("Signature ");
        this.jPanel4.add(this.jLabel31);
        this.jLabel31.setBounds(270, 280, 80, 14);
        this.jLabel32.setFont(new Font("Tahoma", 0, 14));
        this.jLabel32.setText("je soussign\u00e9 :");
        this.jPanel4.add(this.jLabel32);
        this.jLabel32.setBounds(0, 430, 90, 30);
        this.nomm.setFont(new Font("Tahoma", 1, 14));
        this.nomm.setText("..........................");
        this.jPanel4.add(this.nomm);
        this.nomm.setBounds(80, 430, 210, 30);
        this.mecc.setFont(new Font("Tahoma", 1, 14));
        this.mecc.setText("..........................");
        this.jPanel4.add(this.mecc);
        this.mecc.setBounds(350, 430, 110, 30);
        this.jLabel36.setFont(new Font("Tahoma", 0, 14));
        this.jLabel36.setText("Mecano");
        this.jPanel4.add(this.jLabel36);
        this.jLabel36.setBounds(290, 430, 50, 30);
        this.jLabel27.setFont(new Font("Tahoma", 0, 14));
        this.jLabel27.setText("par mois . ");
        this.jPanel4.add(this.jLabel27);
        this.jLabel27.setBounds(280, 210, 70, 30);
        this.jLabel14.setFont(new Font("Tahoma", 0, 12));
        this.jLabel14.setText("Mahdia le ");
        this.jPanel4.add(this.jLabel14);
        this.jLabel14.setBounds(20, 20, 60, 15);
        this.jLabel15.setFont(new Font("Tahoma", 0, 12));
        this.jLabel15.setText("Mahdia le ");
        this.jPanel4.add(this.jLabel15);
        this.jLabel15.setBounds(20, 20, 60, 15);
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel4, -2, 544, -2).addComponent(this.jPanel1, -2, 534, -2)).addContainerGap(12, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, 168, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel4, -2, 389, -2).addGap(254, 254, 254)));
        this.jPanel3.setBackground(new Color(255, 255, 255));
        this.jPanel3.setLayout(null);
        this.montletcheque.setFont(new Font("Tahoma", 0, 12));
        this.montletcheque.setText("................");
        this.jPanel3.add(this.montletcheque);
        this.montletcheque.setBounds(80, 50, 370, 20);
        this.monttchifrecheque.setFont(new Font("Arial Black", 0, 12));
        this.monttchifrecheque.setText("................");
        this.jPanel3.add(this.monttchifrecheque);
        this.monttchifrecheque.setBounds(350, 0, 110, 20);
        this.nomadherentcheque.setFont(new Font("Tahoma", 1, 14));
        this.nomadherentcheque.setText(".........................................................");
        this.jPanel3.add(this.nomadherentcheque);
        this.nomadherentcheque.setBounds(120, 70, 300, 20);
        this.jPanel3.add(this.mecc1);
        this.mecc1.setBounds(180, 0, 60, 20);
        this.jLabel7.setText("Mahdia ");
        this.jPanel3.add(this.jLabel7);
        this.jLabel7.setBounds(150, 160, 60, 14);
        this.datesy.setFont(new Font("Tahoma", 0, 12));
        this.datesy.setText("..............................");
        this.jPanel3.add(this.datesy);
        this.datesy.setBounds(200, 160, 170, 15);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3, -2, 546, -2).addComponent(this.jPanel2, -2, -1, -2)).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jPanel2, -2, 594, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jPanel3, -2, 132, -2).addContainerGap()));
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void nbmoisActionPerformed(ActionEvent evt) {
    }

    private void mensualit\u00e9ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean g;
        JOptionPane jop1;
        JOptionPane jop2;
        String ch1 = "";
        this.k = 1;
        boolean bl = g = this.mecano.getText().equals("") || this.mensualit\u00e9.getText().equals("") || this.nbmois.getText().equals("");
        if (g) {
            this.k = 0;
            jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        } else if (this.mensualit\u00e9.getText().length() < 4) {
            jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Montant Incorrecte", "Attention", 0);
            this.k = 0;
        }
        String mmontant = this.mensualit\u00e9.getText() + "";
        int t = mmontant.length() - 3;
        String di = mmontant.substring(0, mmontant.length() - 3);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            ResultSet result = state.executeQuery("SELECT md  FROM  montantcession2 WHERE md=" + di);
            ResultSetMetaData resultMeta = result.getMetaData();
            while (result.next()) {
                for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                    ch1 = result.getObject(i).toString();
                }
            }
            if (ch1.equals("")) {
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Montant n'existe  ", "Information", 1);
                this.k = 0;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur montant D " + e.getMessage());
            this.k = 0;
        }
        if (this.k == 1) {
            String ann\u00e9es;
            String datdd;
            block128 : {
                int aa;
                this.total.setText(this.mensualit\u00e9.getText());
                Date actuellEe = new Date();
                SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
                datdd = dateFormatt.format(actuellEe);
                this.datt.setText(datdd);
                this.nbmm.setText(this.nbmois.getText());
                this.mecc.setText(this.mecano.getText());
                String jours = datdd.substring(0, datdd.length() - 8);
                System.out.println("jours =" + jours);
                int j = Integer.parseInt(jours);
                String mois2 = datdd.substring(3, datdd.length() - 5);
                int ms = Integer.parseInt(mois2);
                ann\u00e9es = datdd.substring(6, datdd.length());
                System.out.println("mois =" + mois2);
                System.out.println("ann\u00e9es =" + ann\u00e9es);
                int moiaci = Integer.parseInt(mois2);
                int mm = Integer.parseInt(mois2);
                int aaa = aa = Integer.parseInt(ann\u00e9es);
                boolean kl = false;
                if (this.mat.getText().equals("")) {
                    kl = true;
                } else {
                    kl = false;
                    moiaci = Integer.parseInt(this.mat.getText());
                    System.out.println("moiaci =" + moiaci);
                    System.out.println("mm =" + mm);
                    if (moiaci < mm) {
                        System.out.println("okkkkkkkkkkkkkk");
                        moiaci = 1;
                        ++aaa;
                        ++aa;
                    }
                }
                if (kl && j > 15) {
                    moiaci = moiaci + 1 < 13 ? ++moiaci : 1;
                }
                int moisresu = Integer.parseInt(this.nbmois.getText());
                int kk = moiaci + moisresu;
                if (ms > moiaci) {
                    ++aaa;
                    ++aa;
                }
                while (kk > 12) {
                    kk -= 12;
                    ++aaa;
                }
                System.out.println("kk =" + kk);
                System.out.println("aa =" + aaa);
                switch (moiaci) {
                    case 1: {
                        this.date1.setText("Janvier  " + aa);
                        break;
                    }
                    case 2: {
                        this.date1.setText("F\u00e9vrier  " + aa);
                        break;
                    }
                    case 3: {
                        this.date1.setText("Mars  " + aa);
                        break;
                    }
                    case 4: {
                        this.date1.setText("Avril  " + aa);
                        break;
                    }
                    case 5: {
                        this.date1.setText("Mai  " + aa);
                        break;
                    }
                    case 6: {
                        this.date1.setText("Juin  " + aa);
                        break;
                    }
                    case 7: {
                        this.date1.setText("Juillet  " + aa);
                        break;
                    }
                    case 8: {
                        this.date1.setText("Ao\u00fbt  " + aa);
                        break;
                    }
                    case 9: {
                        this.date1.setText("Septembre  " + aa);
                        break;
                    }
                    case 10: {
                        this.date1.setText("Octobre  " + aa);
                        break;
                    }
                    case 11: {
                        this.date1.setText("Novembre  " + aa);
                        break;
                    }
                    case 12: {
                        this.date1.setText("D\u00e9cembre  " + aa);
                        break;
                    }
                    default: {
                        this.date1.setText("");
                    }
                }
                if (kk == 1) {
                    kk = 12;
                    --aaa;
                } else {
                    --kk;
                }
                switch (kk) {
                    case 1: {
                        this.date2.setText("Janvier  " + aaa);
                        break;
                    }
                    case 2: {
                        this.date2.setText("F\u00e9vrier  " + aaa);
                        break;
                    }
                    case 3: {
                        this.date2.setText("Mars  " + aaa);
                        break;
                    }
                    case 4: {
                        this.date2.setText("Avril  " + aaa);
                        break;
                    }
                    case 5: {
                        this.date2.setText("Mai  " + aaa);
                        break;
                    }
                    case 6: {
                        this.date2.setText("Juin  " + aaa);
                        break;
                    }
                    case 7: {
                        this.date2.setText("Juillet  " + aaa);
                        break;
                    }
                    case 8: {
                        this.date2.setText("Ao\u00fbt  " + aaa);
                        break;
                    }
                    case 9: {
                        this.date2.setText("Septembre  " + aaa);
                        break;
                    }
                    case 10: {
                        this.date2.setText("Octobre  " + aaa);
                        break;
                    }
                    case 11: {
                        this.date2.setText("Novembre  " + aaa);
                        break;
                    }
                    case 12: {
                        this.date2.setText("D\u00e9cembre  " + aaa);
                        break;
                    }
                    default: {
                        this.date2.setText("");
                    }
                }
                this.num = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    String p = "1";
                    System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                    Statement state2 = conn3.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT * FROM demandefdd ");
                    while (result2.next()) {
                        this.k = 1;
                        String mmD = result2.getString("datedebut");
                        String annebd = mmD.substring(mmD.length() - 4, mmD.length());
                        System.out.println("anne BD =" + annebd);
                        int ab = Integer.parseInt(annebd);
                        if (ab != aa) continue;
                        String n = result2.getString("nbch");
                        int n2 = Integer.parseInt(n);
                        if (n2 > this.num) {
                            this.num = n2;
                        }
                        System.out.println("numero de cheque fin =" + this.num);
                    }
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                }
                System.out.println("numero de 4 =" + this.num);
                ++this.num;
                System.out.println("numero de1 =" + this.num);
                this.numces.setText("DC :" + this.num + "/ 230 / " + aaa);
                System.out.println("numero  =" + this.num);
                String mec = this.mecano.getText();
                int nbm = Integer.parseInt(this.nbmois.getText());
                int montparmoi = Integer.parseInt(this.mensualit\u00e9.getText());
                int somme = montparmoi / nbm;
                String ss = "" + somme + "";
                int tt = ss.length() - 3;
                String dii = ss.substring(0, ss.length() - 3);
                String miil = ss.substring(tt, ss.length());
                this.ch = "( " + dii + "," + miil + " DT )";
                this.prm.setText(dii + "," + miil + "DT");
                String mil = mmontant.substring(t, mmontant.length());
                this.mont = di + "," + mil;
                int mon = Integer.parseInt(di);
                String adi = "";
                try {
                    adi = Nombre.CALCULATE.getValue(mon, " Dinars ");
                }
                catch (Exception ex) {
                    Logger.getLogger(cessionsursalire.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.total.setText(adi + " (" + this.mont + " DT )");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn4.createStatement();
                    ResultSet result = state.executeQuery("SELECT mecano  FROM  retretait WHERE mecano=" + this.mecc.getText());
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas (N dossier) ", "Information", 1);
                        this.k = 0;
                        break block128;
                    }
                    ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn4.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nompre.setText(result3.getString("nom"));
                            this.nomm.setText(result3.getString("nom"));
                            this.nomadh = result3.getString("nom");
                            this.matricule.setText(result3.getString("cnr"));
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                        this.k = 0;
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                    this.k = 0;
                }
            }
            String montantt = "";
            int montantinteret = 0;
            if (this.k == 1) {
                this.k = 1;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state3 = conn5.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM montantcession2  WHERE md=" + di);
                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                    String mff = "";
                    while (result3.next()) {
                        mff = result3.getString("mf");
                        montantinteret = Integer.parseInt(di) - Integer.parseInt(mff);
                        montantt = "" + montantinteret + "000";
                        this.monttchifrecheque.setText("#" + mff + ",000#");
                    }
                    String mchbd = "";
                    try {
                        int monm = Integer.parseInt(mff);
                        mchbd = Nombre.CALCULATE.getValue(monm, " Dinars ");
                    }
                    catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "erreur convertire montant en lettre ");
                    }
                    this.montletcheque.setText(mchbd);
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur montant F " + e.getMessage());
                    this.k = 0;
                }
            }
            if (this.k == 1) {
                JOptionPane jop = new JOptionPane();
                int option = JOptionPane.showConfirmDialog(null, "Adherent " + this.nomadh + " / Montant= " + this.ch + "DT Par Mois", "Quitter", 0, 3);
                if (option == 0) {
                    JOptionPane jop3;
                    ResultSet result2;
                    Connection conn6;
                    Statement state2;
                    String p;
                    Statement state22;
                    String numcc = "";
                    String deb = "";
                    int typena = 0;
                    String typcarnet = "Pr\u00e9ts FDD";
                    System.out.println("type de compte 2 =" + typcarnet);
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn6.createStatement();
                        p = "0";
                        result2 = state2.executeQuery("SELECT * FROM comptecourant  WHERE observation='" + typcarnet + "' AND f='" + p + "'");
                        typena = 1;
                        while (result2.next()) {
                            this.numcarnet = result2.getString("num");
                            this.numerocheq = result2.getString("debut");
                            deb = result2.getString("datedebut");
                            this.k = 1;
                        }
                    }
                    catch (Exception e) {
                        this.k = 0;
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                    }
                    if (deb.equals("")) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn6.createStatement();
                            state2.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                    } else {
                        typena = 2;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn6.createStatement();
                            p = "1";
                            result2 = state2.executeQuery("SELECT * FROM talondescheque  WHERE type='" + typcarnet + "' AND p='" + p + "'");
                            System.out.println("********************************** =");
                            while (result2.next()) {
                                this.numerocheq = result2.getString("numcheque");
                                System.out.println("numero de cheque talon des cheque  =" + this.numerocheq);
                                this.numcarnet = result2.getString("Numcarnet");
                                this.k = 1;
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur montant numcheque et num carnet " + e.getMessage());
                        }
                    }
                    if (this.k == 1) {
                        Connection conn2;
                        String p2;
                        try {
                            this.Nch = Integer.parseInt(this.numerocheq);
                            if (typena == 2) {
                                this.Nch += 1.0;
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 1 " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state2 = conn6.createStatement();
                            p = "1";
                            System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                            result2 = state2.executeQuery("SELECT * FROM comptecourant  WHERE num='" + this.numcarnet + "'");
                            while (result2.next()) {
                                this.numfin = result2.getString("fin");
                                System.out.println("numero de cheque fin =" + this.numfin);
                                this.k = 1;
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                        }
                        try {
                            this.Nfin = Integer.parseInt(this.numfin);
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de d\u00e9terminer numero de cheque 2  " + e.getMessage());
                        }
                        if (this.Nfin >= this.Nch) {
                            Statement state23;
                            Connection conn22;
                            if (this.Nfin == this.Nch) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn2.createStatement();
                                    p = "1";
                                    state2.executeUpdate("UPDATE  comptecourant SET f='" + p + "' WHERE num='" + this.numcarnet + "'");
                                    state2.executeUpdate("UPDATE  comptecourant SET datefin='" + datdd + "' WHERE num='" + this.numcarnet + "'");
                                    this.k = 1;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn222 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                        Statement state222 = conn222.createStatement();
                                        System.out.println("numero de carnet de cheque  =" + this.numcarnet);
                                        ResultSet result22 = state2.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
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
                                                    this.k = 0;
                                                    JOptionPane jop32 = new JOptionPane();
                                                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                                }
                                            }
                                            ++kkk;
                                        }
                                    }
                                    catch (Exception e) {
                                        this.k = 0;
                                        JOptionPane jop33 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                                    }
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop1 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                            this.firstcheque = "" + this.Nch + "";
                            int ji = 0;
                            ji = this.firstcheque.indexOf(".");
                            if (ji != -1) {
                                System.out.println("ji =" + ji);
                                this.firstcheque = this.firstcheque.substring(0, this.firstcheque.length() - 2);
                                System.out.println("firstcheque =" + this.firstcheque);
                                this.ncina.setText(this.firstcheque);
                            }
                            if (this.k == 1) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state23 = conn22.createStatement();
                                    p2 = "0";
                                    state23.executeUpdate("UPDATE  talondescheque SET p='" + p2 + "' WHERE numcheque='" + this.numerocheq + "'");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop1 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                            if (this.k == 1) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state23 = conn22.createStatement();
                                    String ba = "BT";
                                    String p3 = "1";
                                    String mdi = di + "000";
                                    state23.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnet + "','" + this.mecano.getText() + "','" + mdi + "','" + datdd + "','" + typcarnet + "','" + p3 + "','" + ba + "')");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop1 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                }
                            }
                        } else {
                            this.k = 0;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                state2 = conn6.createStatement();
                                p = "0";
                                System.out.println("type type  =" + typcarnet);
                                result2 = state2.executeQuery("SELECT * FROM comptecourant  WHERE f='" + p + "' AND observation ='" + typcarnet + "'");
                                while (result2.next()) {
                                    this.numcarnetreserver = result2.getString("num");
                                    this.firstcheque = result2.getString("debut");
                                    System.out.println("numero de carnet cheque reserve 1 =" + this.numcarnetreserver);
                                    this.k = 1;
                                }
                            }
                            catch (Exception e) {
                                this.k = 0;
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur montant comptecourant " + e.getMessage());
                            }
                            if (this.numcarnetreserver.equals("")) {
                                System.out.println("numero de carnet cheque reserve 2 =" + this.numcarnetreserver);
                                jop1 = new JOptionPane();
                                this.k = 0;
                                JOptionPane.showMessageDialog(null, "Aucune carnet de cheque: il faut ajouter un nouveaux carnet");
                            } else {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn2.createStatement();
                                    p = "0";
                                    state2.executeUpdate("UPDATE  talondescheque SET p='" + p + "' WHERE numcheque='" + this.numerocheq + "'");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop1 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn2.createStatement();
                                    String ba = "BT";
                                    p2 = "1";
                                    String mmff = this.mff + "000";
                                    state2.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.firstcheque + "','" + this.numcarnetreserver + "','" + this.mecano.getText() + "','" + mmff + "','" + datdd + "','" + typcarnet + "','" + p2 + "','" + ba + "')");
                                    this.k = 1;
                                    this.numcarnet = this.numcarnetreserver;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop1 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                                }
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state2 = conn2.createStatement();
                                    p = "0";
                                    state2.executeUpdate("UPDATE  comptecourant SET datedebut='" + datdd + "' WHERE num='" + this.numcarnetreserver + "'");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    jop1 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur de modification : " + e.getMessage());
                                }
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Impression de demande N\u00b0 :" + this.num, "Information", 1);
                    jop1 = new JOptionPane();
                    jop1 = new JOptionPane();
                    Impression1 s = new Impression1(this.jPanel4);
                    s.actionPerformed(evt);
                    JOptionPane jop22 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Attention :  carnet de cheque N\u00b0:" + this.numcarnet + "  et N\u00b0 cheque :" + this.firstcheque + "", "Information", 1);
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state22 = conn2.createStatement();
                        this.k = 1;
                        String nb = "1";
                        String imprimeborde = "1";
                        state22.executeUpdate("INSERT INTO demandefdd(nbch,Mecano,anne,Montant,numcheque,NBmois,datedebut,datefin,date) VALUES('" + this.num + "','" + this.mecano.getText() + "','" + ann\u00e9es + "','" + this.mont + "','" + this.firstcheque + "','" + this.nbmois.getText() + "','" + this.date1.getText() + "','" + this.date2.getText() + "','" + datdd + "')");
                    }
                    catch (Exception e) {
                        this.k = 0;
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                    }
                    if (this.k == 1) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn7 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state22 = conn7.createStatement();
                            this.k = 1;
                            String pv = "1";
                            String mffd = this.mff + "000";
                            state22.executeUpdate("INSERT INTO etatdeschequefdd(Mecano,date,montant,pv,numch) VALUES('" + this.mecano.getText() + "','" + datdd + "','" + this.mensualit\u00e9.getText() + "','" + pv + "','" + this.firstcheque + "')");
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a etatdeschequepretmasp : " + e.getMessage());
                        }
                    }
                    if (this.k == 1) {
                        Statement state24;
                        Connection conn8;
                        int totalee = 0;
                        String nb = "0";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn8 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state24 = conn8.createStatement();
                            String p4 = "1";
                            ResultSet result22 = state24.executeQuery("SELECT * FROM caissefdddroitfixe WHERE n='" + p4 + "'");
                            while (result22.next()) {
                                nb = result22.getString("nbch");
                                String ttt = result22.getString("total");
                                totalee = Integer.parseInt(ttt);
                            }
                        }
                        catch (Exception e) {
                            this.k = 0;
                            JOptionPane jop34 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur montant comptecourant 66666666666666666666" + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            state24 = conn2.createStatement();
                            String p5 = "0";
                            state24.executeUpdate("UPDATE  caissefdddroitfixe SET n='0' ");
                            this.k = 1;
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur de modification caisse fdd : " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn8 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state1 = conn8.createStatement();
                            String nn = "1";
                            state1.executeUpdate("INSERT INTO  caissefdddroitfixe(nbch,anne,Mecano,debit,credit,total,date,n) VALUES('" + this.num + "','" + ann\u00e9es + "','" + this.mecano.getText() + "','0','" + montantt + "','" + (totalee += Integer.parseInt(montantt)) + "','" + datdd + "','" + nn + "')");
                            this.k = 1;
                        }
                        catch (Exception e) {
                            this.k = 0;
                            jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout caisse fdd : " + e.getMessage());
                        }
                    }
                    this.datesy.setText(datdd);
                    this.nomadherentcheque.setText(this.nomadh);
                    Impression1 sv = new Impression1(this.jPanel3);
                    sv.actionPerformed(evt);
                    this.mecano.setText("");
                    this.mensualit\u00e9.setText("");
                    this.nbmois.setText("");
                    this.monttchifrecheque.setText("");
                    this.montletcheque.setText("");
                    this.datesy.setText("");
                    this.nomadherentcheque.setText("");
                    this.nompre.setText("");
                    this.matricule.setText("");
                    this.total.setText("");
                    this.nbmm.setText("");
                    this.prm.setText("");
                    this.date1.setText("");
                    this.date2.setText("");
                    this.matricule.setText("................................");
                    this.ncina.setText("................................");
                }
            }
        }
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment vider l'ecran?", "Quitter", 0, 3);
        if (option == 0) {
            this.mecano.setText("");
            this.mensualit\u00e9.setText("");
            this.nbmois.setText("");
            this.monttchifrecheque.setText("");
            this.montletcheque.setText("");
            this.datesy.setText("");
            this.nomadherentcheque.setText("");
            this.nompre.setText("");
            this.matricule.setText("");
            this.total.setText("");
            this.nbmm.setText("");
            this.prm.setText("");
            this.date1.setText("");
            this.date2.setText("");
            this.matricule.setText("................................");
            this.ncina.setText("................................");
            this.mecano.setText("");
            this.mensualit\u00e9.setText("");
            this.nbmois.setText("");
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        miseajourmontant a = new miseajourmontant();
        a.show();
    }

    private void matActionPerformed(ActionEvent evt) {
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

