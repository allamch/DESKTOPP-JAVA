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

public class bulletin
extends JFrame {
    private JLabel adresse;
    private JLabel ccb;
    private JLabel cin;
    private JLabel cnrps;
    private JLabel datconj;
    private JLabel datecin;
    private JLabel datenai;
    private JLabel hobital;
    private JButton jButton1;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel16;
    private JLabel jLabel18;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel32;
    private JLabel jLabel34;
    private JLabel jLabel35;
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
    private JLabel jLabel50;
    private JLabel jLabel51;
    private JLabel jLabel52;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JTextArea jTextArea2;
    private JTextArea jTextArea3;
    private JLabel lieunai;
    private JTextField mecano;
    private JLabel nom2;
    private JLabel nomconj;
    private JLabel nomm;
    private JLabel tell;
    private JLabel travail;

    public bulletin() {
        this.initComponents();
    }

    private void initComponents() {
        this.jButton5 = new JButton();
        this.jButton1 = new JButton();
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.lieunai = new JLabel();
        this.jLabel8 = new JLabel();
        this.cin = new JLabel();
        this.jLabel10 = new JLabel();
        this.cnrps = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.ccb = new JLabel();
        this.nomm = new JLabel();
        this.jLabel16 = new JLabel();
        this.datenai = new JLabel();
        this.jLabel18 = new JLabel();
        this.hobital = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel22 = new JLabel();
        this.jLabel23 = new JLabel();
        this.travail = new JLabel();
        this.tell = new JLabel();
        this.jLabel26 = new JLabel();
        this.jLabel27 = new JLabel();
        this.jLabel28 = new JLabel();
        this.datconj = new JLabel();
        this.jLabel30 = new JLabel();
        this.datecin = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jLabel32 = new JLabel();
        this.nomconj = new JLabel();
        this.jLabel34 = new JLabel();
        this.jLabel35 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.jTextArea2 = new JTextArea();
        this.jLabel36 = new JLabel();
        this.nom2 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jSeparator2 = new JSeparator();
        this.jScrollPane3 = new JScrollPane();
        this.jTextArea3 = new JTextArea();
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
        this.jLabel50 = new JLabel();
        this.jLabel51 = new JLabel();
        this.jLabel52 = new JLabel();
        this.jLabel24 = new JLabel();
        this.adresse = new JLabel();
        this.setDefaultCloseOperation(3);
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton5.setText("Quitter");
        this.jButton5.setToolTipText("Quitter");
        this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bulletin.this.jButton5ActionPerformed(evt);
            }
        });
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bulletin.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 538, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 765, 32767));
        this.jPanel2.setBackground(new Color(255, 255, 255));
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/TU.PNG")));
        this.jLabel2.setFont(new Font("Tahoma", 1, 24));
        this.jLabel2.setText("N\u00b0 dossier :");
        this.mecano.setFont(new Font("Tahoma", 1, 24));
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bulletin.this.mecanoActionPerformed(evt);
            }
        });
        this.jLabel3.setFont(new Font("Tahoma", 1, 24));
        this.jLabel3.setForeground(new Color(0, 0, 255));
        this.jLabel3.setText("BULETIN D'ADHESION");
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("banque:");
        this.jLabel5.setText("..............");
        this.jLabel6.setFont(new Font("Tahoma", 1, 14));
        this.jLabel6.setText("N\u00b0 CIN :");
        this.lieunai.setText("......................");
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setText("CCB :");
        this.cin.setText("....................................");
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("N\u00b0 CNRPS :");
        this.cnrps.setText("....................................");
        this.jLabel12.setFont(new Font("Tahoma", 0, 12));
        this.jLabel12.setText("Date de naissance  :");
        this.jLabel13.setFont(new Font("Tahoma", 0, 12));
        this.jLabel13.setText("lieu de naissance :");
        this.ccb.setText("....................................");
        this.nomm.setText("....................................");
        this.jLabel16.setFont(new Font("Tahoma", 0, 12));
        this.jLabel16.setText("Nom & pr\u00e9nom :");
        this.datenai.setText("....................................");
        this.jLabel18.setFont(new Font("Tahoma", 0, 12));
        this.jLabel18.setText("Etablissement Payeur :");
        this.hobital.setText("....................................");
        this.jLabel20.setFont(new Font("Tahoma", 0, 12));
        this.jLabel20.setText("Service :");
        this.jLabel21.setText("......................");
        this.jLabel22.setFont(new Font("Tahoma", 0, 12));
        this.jLabel22.setText("N\u00b0 telephone :");
        this.jLabel23.setFont(new Font("Tahoma", 0, 12));
        this.jLabel23.setText("Grade ou Cat\u00e9gorie   :");
        this.travail.setText("....................................");
        this.tell.setText("....................................");
        this.jLabel26.setFont(new Font("Tahoma", 0, 12));
        this.jLabel26.setText("Date de naissance :");
        this.jLabel27.setFont(new Font("Tahoma", 0, 12));
        this.jLabel27.setText("Echelon:");
        this.jLabel28.setText("......................");
        this.datconj.setText("......................");
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setText("D\u00e9livr\u00e9e le  :");
        this.datecin.setText("....................................");
        this.jLabel32.setFont(new Font("Tahoma", 0, 12));
        this.jLabel32.setText("Nom du conjoint :");
        this.nomconj.setText("....................................");
        this.jLabel34.setText("Date de naissance :");
        this.jLabel35.setText("Pr\u00e9nom des Enfants :");
        this.jTextArea2.setColumns(20);
        this.jTextArea2.setRows(5);
        this.jScrollPane2.setViewportView(this.jTextArea2);
        this.jLabel36.setText("L'Adh\u00e9rant(e)");
        this.nom2.setFont(new Font("Tahoma", 1, 11));
        this.nom2.setText("..........................................");
        this.jLabel38.setText("notamment les Articles 37 et 48 , a cet effet j'autorise mon Employeur de retenir le montant de ma cotisation");
        this.jLabel39.setText("d\u00e9clare par le pr\u00e9sent Bulletin adh\u00e9rer a la Mutuelle des ");
        this.jTextArea3.setColumns(20);
        this.jTextArea3.setRows(5);
        this.jScrollPane3.setViewportView(this.jTextArea3);
        this.jLabel41.setText("Agents de la Sant\u00e9 Publique et prendre de ce fait l'engagement sur l'honneur de me conformer a ses Status et");
        this.jLabel42.setText("retenus op\u00e9r\u00e9es sur mon salaire que sur notification de la part de la Mutuelle.");
        this.jLabel43.setText(" mensuelle conform\u00e9ment aux conditions stipul\u00e9es a l'Article 10 du Reglement Interieur de la Mutuelle et de ");
        this.jLabel44.setText("les verser mensuellement a la caisse de la dite Mutuelle, a savoir C.C.P.N\u00b0 397-06 et de ne pas cesser les");
        this.jLabel45.setFont(new Font("Tahoma", 1, 11));
        this.jLabel45.setText("Remarque :");
        this.jLabel46.setText("1980 J.O.RT N\u00b0 14 Mardi 4 Mars 1980.");
        this.jLabel47.setText("1/ Lire attentivement le R\u00e9glement Int\u00e9rieur de la Mutuelle");
        this.jLabel48.setText("2/Status approuv\u00e9s par Arr\u00e9t\u00e9 des Minist\u00e9res des Finances et des Affaires Sociales en date du 22 F\u00e9vrier");
        this.jLabel49.setFont(new Font("Tahoma", 0, 14));
        this.jLabel49.setText("Mahdia Le :");
        this.jLabel50.setText("..................................");
        this.jLabel51.setFont(new Font("Tahoma", 1, 11));
        this.jLabel51.setText("Signature de l'Adh\u00e9rent");
        this.jLabel52.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jLabel24.setFont(new Font("Tahoma", 0, 12));
        this.jLabel24.setText("Adresse Personnelle  :");
        this.adresse.setText("....................................");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel1, -2, 190, -2).addGap(50, 50, 50).addComponent(this.jLabel2, -2, 150, -2).addComponent(this.mecano, -2, 130, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(130, 130, 130).addComponent(this.jLabel3, -2, 290, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel6, -2, 60, -2).addComponent(this.cin, -2, 150, -2).addGap(70, 70, 70).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel30).addGroup(jPanel2Layout.createSequentialGroup().addGap(80, 80, 80).addComponent(this.datecin, -2, 160, -2)))).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel8, -2, 40, -2).addGap(10, 10, 10).addComponent(this.ccb, -2, 220, -2).addGap(10, 10, 10).addComponent(this.jLabel10).addGap(10, 10, 10).addComponent(this.cnrps, -2, 150, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel4, -2, 60, -2).addComponent(this.jLabel5, -2, 60, -2)).addComponent(this.jSeparator1, -2, 540, -2).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel16, -2, 100, -2).addGap(40, 40, 40).addComponent(this.nomm, -2, 310, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel12, -2, 120, -2).addGap(20, 20, 20).addComponent(this.datenai, -2, 150, -2).addComponent(this.jLabel13, -2, 100, -2).addGap(10, 10, 10).addComponent(this.lieunai, -2, 120, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel18, -2, 130, -2).addGap(10, 10, 10).addComponent(this.hobital, -2, 150, -2).addComponent(this.jLabel20, -2, 90, -2).addGap(20, 20, 20).addComponent(this.jLabel21, -2, 120, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel23, -2, 120, -2).addGap(20, 20, 20).addComponent(this.travail, -2, 150, -2).addComponent(this.jLabel27, -2, 100, -2).addGap(10, 10, 10).addComponent(this.jLabel28, -2, 120, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel32, -2, 130, -2).addGap(10, 10, 10).addComponent(this.nomconj, -2, 150, -2).addComponent(this.jLabel26, -2, 110, -2).addGap(20, 20, 20).addComponent(this.datconj, -2, 100, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel24, -2, 130, -2).addGap(10, 10, 10).addComponent(this.adresse, -2, 360, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel22, -2, 130, -2).addGap(10, 10, 10).addComponent(this.tell, -2, 230, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(70, 70, 70).addComponent(this.jLabel35, -2, 110, -2).addGap(160, 160, 160).addComponent(this.jLabel34, -2, 110, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jScrollPane3, -2, 220, -2).addGap(50, 50, 50).addComponent(this.jScrollPane2, -2, 220, -2)).addComponent(this.jSeparator2, -2, 540, -2).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel36, -2, 70, -2).addComponent(this.nom2, -2, 170, -2).addComponent(this.jLabel39, -2, 280, -2)).addComponent(this.jLabel41, -2, 530, -2).addComponent(this.jLabel38, -2, 530, -2).addComponent(this.jLabel43, -2, 520, -2).addComponent(this.jLabel44, -2, 530, -2).addComponent(this.jLabel42, -2, 530, -2).addComponent(this.jSeparator3, -2, 540, -2).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel49, -2, 80, -2)).addComponent(this.jLabel45, -2, 70, -2)).addComponent(this.jLabel50).addGap(14, 14, 14).addComponent(this.jLabel51, -2, 120, -2).addGap(10, 10, 10).addComponent(this.jLabel52, -2, 140, -2)).addComponent(this.jLabel47, -2, 290, -2).addComponent(this.jLabel48, -2, 520, -2).addComponent(this.jLabel46, -2, 510, -2));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -2, 50, -2).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.mecano, -2, 40, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGap(40, 40, 40).addComponent(this.jLabel3, -2, 40, -2))).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6, -2, 20, -2).addComponent(this.cin, -2, 20, -2).addComponent(this.jLabel30, -2, 20, -2).addComponent(this.datecin, -2, 20, -2)).addGap(10, 10, 10).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel8).addComponent(this.ccb, -2, 20, -2).addComponent(this.jLabel10, -2, 20, -2).addComponent(this.cnrps, -2, 20, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel4, -2, 20, -2).addComponent(this.jLabel5, -2, 20, -2)).addGap(10, 10, 10).addComponent(this.jSeparator1, -2, -1, -2).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel16).addComponent(this.nomm, -2, 20, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel12).addComponent(this.datenai, -2, 20, -2).addComponent(this.jLabel13, -2, 20, -2).addComponent(this.lieunai, -2, 20, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel18).addComponent(this.hobital, -2, 20, -2).addComponent(this.jLabel20, -2, 20, -2).addComponent(this.jLabel21, -2, 20, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel23).addComponent(this.travail, -2, 20, -2).addComponent(this.jLabel27, -2, 20, -2).addComponent(this.jLabel28, -2, 20, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel32).addComponent(this.nomconj, -2, 20, -2).addComponent(this.jLabel26, -2, 20, -2).addComponent(this.datconj, -2, 20, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel24).addComponent(this.adresse, -2, 20, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel22).addComponent(this.tell, -2, 20, -2)).addGap(30, 30, 30).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel35).addComponent(this.jLabel34)).addGap(6, 6, 6).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane3, -2, 80, -2).addComponent(this.jScrollPane2, -2, 80, -2)).addGap(10, 10, 10).addComponent(this.jSeparator2, -2, -1, -2).addGap(8, 8, 8).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel36).addComponent(this.nom2).addComponent(this.jLabel39)).addGap(6, 6, 6).addComponent(this.jLabel41).addGap(6, 6, 6).addComponent(this.jLabel38).addGap(6, 6, 6).addComponent(this.jLabel43).addGap(6, 6, 6).addComponent(this.jLabel44).addGap(6, 6, 6).addComponent(this.jLabel42).addGap(6, 6, 6).addComponent(this.jSeparator3, -2, -1, -2).addGap(8, 8, 8).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel49).addGap(83, 83, 83).addComponent(this.jLabel45)).addComponent(this.jLabel50).addGroup(jPanel2Layout.createSequentialGroup().addGap(50, 50, 50).addComponent(this.jLabel51)).addComponent(this.jLabel52, -2, 120, -2)).addComponent(this.jLabel47).addGap(6, 6, 6).addComponent(this.jLabel48).addGap(6, 6, 6).addComponent(this.jLabel46)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(97, 97, 97).addComponent(this.jButton1, -2, 124, -2).addGap(101, 101, 101).addComponent(this.jButton5, -2, 134, -2).addContainerGap(92, 32767)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, -1, 32767)).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, 538, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1, -2, 46, -2).addComponent(this.jButton5, -2, 47, -2)).addGap(15, 15, 15).addComponent(this.jPanel2, -2, 743, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Properties props = new Properties();
        props.setProperty("awt.print.paperSize", "a4");
        props.setProperty("awt.print.destination", "printer");
        System.out.println(props);
        PrintJob demandeDImpression = this.getToolkit().getPrintJob(this, "impression", props);
        if (demandeDImpression != null) {
            try {
                Graphics gImpr = demandeDImpression.getGraphics();
                this.jPanel1.printAll(gImpr);
            }
            catch (Exception e) {
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout  : " + e.getMessage());
            }
            demandeDImpression.end();
        }
        this.setVisible(false);
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
            Logger.getLogger(bulletin.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(bulletin.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(bulletin.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(bulletin.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new bulletin().setVisible(true);
            }
        });
    }

}

