/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import mon_projet_fin_etude.Impression1;

public class INKIRATretetait
extends JFrame {
    private JLabel adresse;
    private JLabel banque;
    private JLabel c;
    private JLabel ccb;
    private JLabel ccb2;
    private JLabel cd;
    private JLabel cin;
    private JLabel cnrps;
    private JLabel date;
    private JLabel datenai;
    private JLabel dc;
    private JLabel dcin;
    private JLabel etabb;
    private JButton jButton1;
    private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel16;
    private JLabel jLabel2;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel32;
    private JLabel jLabel36;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel45;
    private JLabel jLabel46;
    private JLabel jLabel47;
    private JLabel jLabel48;
    private JLabel jLabel49;
    private JLabel jLabel5;
    private JLabel jLabel51;
    private JLabel jLabel52;
    private JLabel jLabel53;
    private JLabel jLabel54;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JLabel lieunai;
    private JLabel m;
    private JTextField mecano;
    private JLabel nbe;
    private JLabel nom;
    private JLabel nom2;
    private JLabel nomconj;
    private JLabel tell;

    public INKIRATretetait() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel4 = new JPanel();
        this.mecano = new JTextField();
        this.jLabel2 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.banque = new JLabel();
        this.jLabel6 = new JLabel();
        this.lieunai = new JLabel();
        this.jLabel8 = new JLabel();
        this.cin = new JLabel();
        this.etabb = new JLabel();
        this.cnrps = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.ccb = new JLabel();
        this.nom = new JLabel();
        this.jLabel16 = new JLabel();
        this.datenai = new JLabel();
        this.jLabel22 = new JLabel();
        this.tell = new JLabel();
        this.jLabel26 = new JLabel();
        this.dc = new JLabel();
        this.jLabel30 = new JLabel();
        this.dcin = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jLabel32 = new JLabel();
        this.nomconj = new JLabel();
        this.jLabel36 = new JLabel();
        this.nom2 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.jLabel41 = new JLabel();
        this.jLabel42 = new JLabel();
        this.jLabel43 = new JLabel();
        this.jLabel44 = new JLabel();
        this.jSeparator3 = new JSeparator();
        this.jLabel45 = new JLabel();
        this.jLabel46 = new JLabel();
        this.jLabel47 = new JLabel();
        this.jLabel48 = new JLabel();
        this.jLabel49 = new JLabel();
        this.date = new JLabel();
        this.jLabel51 = new JLabel();
        this.jLabel52 = new JLabel();
        this.jLabel24 = new JLabel();
        this.adresse = new JLabel();
        this.jLabel5 = new JLabel();
        this.cd = new JLabel();
        this.jLabel53 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel23 = new JLabel();
        this.nbe = new JLabel();
        this.ccb2 = new JLabel();
        this.jLabel54 = new JLabel();
        this.jLabel25 = new JLabel();
        this.m = new JLabel();
        this.jLabel27 = new JLabel();
        this.c = new JLabel();
        this.jPanel2 = new JPanel();
        this.jButton6 = new JButton();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.jPanel4.setLayout(null);
        this.mecano.setFont(new Font("Tahoma", 1, 24));
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                INKIRATretetait.this.mecanoActionPerformed(evt);
            }
        });
        this.jPanel4.add(this.mecano);
        this.mecano.setBounds(372, 12, 130, 35);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("N\u00b0 dossier :");
        this.jPanel4.add(this.jLabel2);
        this.jLabel2.setBounds(288, 12, 80, 17);
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/ret/mutuelle retrH.PNG")));
        this.jPanel4.add(this.jLabel1);
        this.jLabel1.setBounds(2, 2, 220, 50);
        this.jLabel3.setFont(new Font("Tahoma", 1, 28));
        this.jLabel3.setForeground(new Color(0, 0, 255));
        this.jLabel3.setText("Bulletin D'adh\u00e9sion");
        this.jPanel4.add(this.jLabel3);
        this.jLabel3.setBounds(132, 37, 290, 40);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("banque:");
        this.jPanel4.add(this.jLabel4);
        this.jLabel4.setBounds(300, 110, 60, 20);
        this.banque.setFont(new Font("Tahoma", 1, 12));
        this.banque.setText("..............");
        this.jPanel4.add(this.banque);
        this.banque.setBounds(370, 110, 160, 20);
        this.jLabel6.setFont(new Font("Tahoma", 1, 14));
        this.jLabel6.setText("N\u00b0 CIN :");
        this.jPanel4.add(this.jLabel6);
        this.jLabel6.setBounds(12, 77, 60, 20);
        this.lieunai.setFont(new Font("Tahoma", 1, 12));
        this.lieunai.setText("......................");
        this.jPanel4.add(this.lieunai);
        this.lieunai.setBounds(412, 205, 120, 20);
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setText("CCB :");
        this.jPanel4.add(this.jLabel8);
        this.jLabel8.setBounds(10, 110, 40, 17);
        this.cin.setFont(new Font("Tahoma", 1, 12));
        this.cin.setText("....................................");
        this.jPanel4.add(this.cin);
        this.cin.setBounds(72, 77, 200, 20);
        this.etabb.setFont(new Font("Tahoma", 1, 14));
        this.etabb.setText("N\u00b0           :");
        this.jPanel4.add(this.etabb);
        this.etabb.setBounds(10, 140, 67, 20);
        this.cnrps.setFont(new Font("Tahoma", 1, 12));
        this.cnrps.setText("....................................");
        this.jPanel4.add(this.cnrps);
        this.cnrps.setBounds(100, 140, 320, 20);
        this.jLabel12.setFont(new Font("Tahoma", 0, 12));
        this.jLabel12.setText("Date de naissance  :");
        this.jPanel4.add(this.jLabel12);
        this.jLabel12.setBounds(12, 205, 120, 15);
        this.jLabel13.setFont(new Font("Tahoma", 0, 12));
        this.jLabel13.setText("lieu de naissance :");
        this.jPanel4.add(this.jLabel13);
        this.jLabel13.setBounds(302, 205, 100, 20);
        this.ccb.setFont(new Font("Tahoma", 1, 12));
        this.ccb.setText("....................................");
        this.jPanel4.add(this.ccb);
        this.ccb.setBounds(60, 110, 230, 20);
        this.nom.setFont(new Font("Tahoma", 1, 12));
        this.nom.setText("....................................");
        this.jPanel4.add(this.nom);
        this.nom.setBounds(130, 180, 400, 30);
        this.jLabel16.setFont(new Font("Tahoma", 0, 12));
        this.jLabel16.setText("Nom & pr\u00e9nom :");
        this.jPanel4.add(this.jLabel16);
        this.jLabel16.setBounds(12, 185, 100, 15);
        this.datenai.setFont(new Font("Tahoma", 1, 12));
        this.datenai.setText("....................................");
        this.jPanel4.add(this.datenai);
        this.datenai.setBounds(142, 205, 160, 20);
        this.jLabel22.setFont(new Font("Tahoma", 0, 12));
        this.jLabel22.setText("Cotisation Mansuelle:");
        this.jPanel4.add(this.jLabel22);
        this.jLabel22.setBounds(300, 350, 120, 15);
        this.tell.setFont(new Font("Tahoma", 1, 12));
        this.tell.setText("....................................");
        this.jPanel4.add(this.tell);
        this.tell.setBounds(100, 290, 160, 20);
        this.jLabel26.setFont(new Font("Tahoma", 0, 12));
        this.jLabel26.setText("Date de naissance :");
        this.jPanel4.add(this.jLabel26);
        this.jLabel26.setBounds(300, 230, 110, 20);
        this.dc.setFont(new Font("Tahoma", 1, 12));
        this.dc.setText("......................");
        this.jPanel4.add(this.dc);
        this.dc.setBounds(420, 230, 100, 20);
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setText("D\u00e9livr\u00e9e le  :");
        this.jPanel4.add(this.jLabel30);
        this.jLabel30.setBounds(291, 77, 82, 20);
        this.dcin.setFont(new Font("Tahoma", 1, 12));
        this.dcin.setText("....................................");
        this.jPanel4.add(this.dcin);
        this.dcin.setBounds(391, 79, 125, 20);
        this.jPanel4.add(this.jSeparator1);
        this.jSeparator1.setBounds(2, 163, 556, 2);
        this.jLabel32.setFont(new Font("Tahoma", 0, 12));
        this.jLabel32.setText("Nom du conjoint :");
        this.jPanel4.add(this.jLabel32);
        this.jLabel32.setBounds(10, 230, 130, 15);
        this.nomconj.setFont(new Font("Tahoma", 1, 12));
        this.nomconj.setText("....................................");
        this.jPanel4.add(this.nomconj);
        this.nomconj.setBounds(140, 230, 160, 20);
        this.jLabel36.setFont(new Font("Tahoma", 0, 10));
        this.jLabel36.setText("L'Adh\u00e9rant(e)");
        this.jPanel4.add(this.jLabel36);
        this.jLabel36.setBounds(10, 420, 70, 13);
        this.nom2.setFont(new Font("Tahoma", 1, 12));
        this.nom2.setText("..........................................");
        this.jPanel4.add(this.nom2);
        this.nom2.setBounds(80, 420, 170, 15);
        this.jLabel38.setFont(new Font("Tahoma", 0, 10));
        this.jLabel38.setText("enti\u00e9remment et je m'engage a les respecter et ce a compter du mois de : ");
        this.jPanel4.add(this.jLabel38);
        this.jLabel38.setBounds(10, 460, 530, 13);
        this.jLabel39.setFont(new Font("Tahoma", 0, 10));
        this.jLabel39.setText("d\u00e9clare par le pr\u00e9sent Bulletin adh\u00e9rer a la Mutuelle des ");
        this.jPanel4.add(this.jLabel39);
        this.jLabel39.setBounds(260, 420, 280, 13);
        this.jPanel4.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 410, 556, 10);
        this.jLabel41.setFont(new Font("Tahoma", 0, 10));
        this.jLabel41.setText("Retrait\u00e9s  \"LA FRATERNITE\" apr\u00e9s avoir consult\u00e9 son statut et son r\u00e9glement interieur et ses prestations que j'approuve");
        this.jPanel4.add(this.jLabel41);
        this.jLabel41.setBounds(10, 440, 550, 13);
        this.jLabel42.setFont(new Font("Tahoma", 0, 10));
        this.jLabel42.setText(" des Retret\u00e9s \"LA FRATERNITE\"");
        this.jPanel4.add(this.jLabel42);
        this.jLabel42.setBounds(30, 540, 510, 13);
        this.jLabel43.setFont(new Font("Tahoma", 0, 10));
        this.jLabel43.setText("Je m'engage aussi a informer la Mutuelle de tout changement de mon compte bancaire ou Postal et de ne pas arr\u00e9ter");
        this.jPanel4.add(this.jLabel43);
        this.jLabel43.setBounds(20, 560, 520, 13);
        this.jLabel44.setFont(new Font("Tahoma", 0, 10));
        this.jLabel44.setText("2- ou Par virment au ccp 170 001 000 0000 31290 448");
        this.jPanel4.add(this.jLabel44);
        this.jLabel44.setBounds(10, 500, 530, 13);
        this.jPanel4.add(this.jSeparator3);
        this.jSeparator3.setBounds(0, 620, 560, 10);
        this.jLabel45.setFont(new Font("Tahoma", 0, 9));
        this.jLabel45.setText("Remarque :");
        this.jPanel4.add(this.jLabel45);
        this.jLabel45.setBounds(10, 720, 70, 10);
        this.jLabel46.setFont(new Font("Tahoma", 0, 9));
        this.jLabel46.setText("1980 J.O.RT N\u00b0 104 , date 29-31-1998.");
        this.jPanel4.add(this.jLabel46);
        this.jLabel46.setBounds(10, 750, 510, 10);
        this.jLabel47.setFont(new Font("Tahoma", 0, 9));
        this.jLabel47.setText("1/ Lire attentivement le R\u00e9glement Int\u00e9rieur de la Mutuelle");
        this.jPanel4.add(this.jLabel47);
        this.jLabel47.setBounds(10, 730, 290, 10);
        this.jLabel48.setFont(new Font("Tahoma", 0, 9));
        this.jLabel48.setText("2/Status approuv\u00e9s par Arr\u00e9t\u00e9 des Minist\u00e9res des Finances et des Affaires Sociales en date du 22/12/1998");
        this.jPanel4.add(this.jLabel48);
        this.jLabel48.setBounds(10, 740, 520, 10);
        this.jLabel49.setFont(new Font("Tahoma", 0, 14));
        this.jLabel49.setText("Mahdia Le :");
        this.jPanel4.add(this.jLabel49);
        this.jLabel49.setBounds(20, 640, 80, 17);
        this.date.setFont(new Font("Tahoma", 1, 12));
        this.date.setText("..................................");
        this.jPanel4.add(this.date);
        this.date.setBounds(120, 640, 136, 15);
        this.jLabel51.setFont(new Font("Tahoma", 1, 11));
        this.jLabel51.setText("Signature de l'Adh\u00e9rent");
        this.jPanel4.add(this.jLabel51);
        this.jLabel51.setBounds(400, 620, 151, 14);
        this.jLabel52.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jPanel4.add(this.jLabel52);
        this.jLabel52.setBounds(390, 640, 170, 90);
        this.jLabel24.setFont(new Font("Tahoma", 0, 12));
        this.jLabel24.setText("Adresse Personnelle  :");
        this.jPanel4.add(this.jLabel24);
        this.jLabel24.setBounds(10, 260, 130, 15);
        this.adresse.setFont(new Font("Tahoma", 1, 12));
        this.adresse.setText("....................................");
        this.jPanel4.add(this.adresse);
        this.adresse.setBounds(140, 260, 370, 20);
        this.jLabel5.setText("code postal :");
        this.jPanel4.add(this.jLabel5);
        this.jLabel5.setBounds(310, 284, 80, 20);
        this.cd.setFont(new Font("Tahoma", 1, 12));
        this.cd.setText("....................................");
        this.jPanel4.add(this.cd);
        this.cd.setBounds(390, 280, 160, 20);
        this.jLabel53.setFont(new Font("Tahoma", 0, 10));
        this.jLabel53.setText("1- Par virement de mon compte");
        this.jPanel4.add(this.jLabel53);
        this.jLabel53.setBounds(10, 480, 150, 13);
        this.jLabel7.setText(" au r\u00e9glement interieur. ");
        this.jPanel4.add(this.jLabel7);
        this.jLabel7.setBounds(10, 600, 520, 14);
        this.jLabel9.setText(" les virements ou les versement qu'apr\u00e9s l'accord \u00e9crit du conse\u00e9l d'administration conform\u00e9ment a l'arrticle 48");
        this.jPanel4.add(this.jLabel9);
        this.jLabel9.setBounds(10, 580, 550, 14);
        this.jLabel23.setFont(new Font("Tahoma", 0, 12));
        this.jLabel23.setText("N\u00b0 telephone :");
        this.jPanel4.add(this.jLabel23);
        this.jLabel23.setBounds(10, 290, 130, 15);
        this.nbe.setFont(new Font("Tahoma", 1, 12));
        this.nbe.setText("....................................");
        this.jPanel4.add(this.nbe);
        this.nbe.setBounds(170, 320, 280, 20);
        this.ccb2.setFont(new Font("Tahoma", 1, 12));
        this.ccb2.setText("......................................................................................");
        this.jPanel4.add(this.ccb2);
        this.ccb2.setBounds(180, 480, 360, 15);
        this.jLabel54.setFont(new Font("Tahoma", 0, 10));
        this.jLabel54.setText("3-  Par versement au compte n\u00b010005036186889778842  STB le  Belv\u00e9daire au nom de la Mutuelle ");
        this.jPanel4.add(this.jLabel54);
        this.jLabel54.setBounds(10, 520, 530, 13);
        this.jLabel25.setFont(new Font("Tahoma", 0, 12));
        this.jLabel25.setText("Nombre d'enfant a charge  :");
        this.jPanel4.add(this.jLabel25);
        this.jLabel25.setBounds(10, 320, 170, 15);
        this.m.setFont(new Font("Tahoma", 1, 12));
        this.m.setText("............................");
        this.jPanel4.add(this.m);
        this.m.setBounds(150, 350, 120, 20);
        this.jLabel27.setFont(new Font("Tahoma", 0, 12));
        this.jLabel27.setText("Montant de la Pension :");
        this.jPanel4.add(this.jLabel27);
        this.jLabel27.setBounds(10, 350, 140, 15);
        this.c.setFont(new Font("Tahoma", 1, 12));
        this.c.setText("............................");
        this.jPanel4.add(this.c);
        this.c.setBounds(420, 350, 120, 20);
        this.jButton6.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton6.setText("Quitter");
        this.jButton6.setToolTipText("Quitter");
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                INKIRATretetait.this.jButton6ActionPerformed(evt);
            }
        });
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                INKIRATretetait.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(this.jButton6, -2, 142, -2).addGap(83, 83, 83).addComponent(this.jButton1, -2, 129, -2).addContainerGap(108, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton6, -2, 47, -2).addComponent(this.jButton1, -2, 44, -2)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel4, -2, 561, -2).addComponent(this.jPanel2, -2, -1, -2)).addContainerGap(19, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(28, 28, 28).addComponent(this.jPanel4, -1, 788, 32767).addContainerGap()));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        JOptionPane jop1 = new JOptionPane();
        Impression1 s = new Impression1(this.jPanel4);
        s.actionPerformed(evt);
    }

    public void setvalued(String nd, String cinn, String datecin, String ribb, String banqu, String agence, String etab, String cnr, String nomm, String datenaic, String lieudn, String conjoint, String dateconjoint, String adress, String codepostale, String ntell, String nbenfant, String montant, String cm, String pr) {
        Date actuelle = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String datd = dateFormat.format(actuelle);
        this.date.setText(datd);
        this.mecano.setText(nd);
        this.cin.setText(cinn);
        this.dcin.setText(datecin);
        this.ccb.setText(ribb);
        this.ccb2.setText(ribb);
        this.banque.setText(banqu + " / " + agence);
        this.etabb.setText("N\u00b0 " + etab);
        this.cnrps.setText(cnr);
        this.nom.setText(nomm);
        this.nom2.setText(nomm);
        this.datenai.setText(datenaic);
        this.lieunai.setText(lieudn);
        this.nomconj.setText(conjoint);
        this.dc.setText(dateconjoint);
        this.adresse.setText(adress);
        this.cd.setText(codepostale);
        this.tell.setText(ntell);
        this.nbe.setText(nbenfant);
        this.m.setText(montant + " D");
        this.c.setText(cm + " D  / " + pr);
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void mecanoActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(INKIRATretetait.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(INKIRATretetait.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(INKIRATretetait.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(INKIRATretetait.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new INKIRATretetait().setVisible(true);
            }
        });
    }

}

