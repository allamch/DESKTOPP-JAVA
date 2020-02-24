
/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mon_projet_fin_etude.Atestationdepriseencharge;
import mon_projet_fin_etude.Autorisation;
import mon_projet_fin_etude.DemandeFDDretretait;
import mon_projet_fin_etude.STBRET;
import mon_projet_fin_etude.ajoutadherentretretait;
import mon_projet_fin_etude.ajoutercanciencheque;
import mon_projet_fin_etude.ajoutercarnetdecheque;
import mon_projet_fin_etude.ajoutfournisseur;
import mon_projet_fin_etude.atbbret;
import mon_projet_fin_etude.bhret;
import mon_projet_fin_etude.bnaret;
import mon_projet_fin_etude.bttret;
import mon_projet_fin_etude.caisseprimescolaireretretait;
import mon_projet_fin_etude.chequeretretait;
import mon_projet_fin_etude.cherchefournissseure;
import mon_projet_fin_etude.modiffournisure;
import mon_projet_fin_etude.modifieradherentretretait;
import mon_projet_fin_etude.montantvirementretraite;
import mon_projet_fin_etude.primescolaireRET;
import mon_projet_fin_etude.rechercheaderonretraite;
import mon_projet_fin_etude.recherchecarnedecheque;
import mon_projet_fin_etude.traiteretretait;
import mon_projet_fin_etude.uibbret;

public class retretait
extends JFrame {
    private ajoutadherentretretait ajoutadherentretretait1;
    private ajoutercanciencheque ajoutercanciencheque1;
    private ajoutercarnetdecheque ajoutercarnetdecheque1;
    private ajoutfournisseur ajoutfournisseur1;
    private atbbret atbbret1;
    private Atestationdepriseencharge atestationdepriseencharge1;
    private Autorisation autorisation1;
    private bhret bhret1;
    private bnaret bnaret1;
    private bttret bttret1;
    private bttret bttret2;
    private caisseprimescolaireretretait caisseprimescolaireretretait1;
    private chequeretretait chequeretretait1;
    private cherchefournissseure cherchefournissseure1;
    private DemandeFDDretretait demandeFDDretretait1;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton21;
    private JButton jButton22;
    private JButton jButton23;
    private JButton jButton24;
    private JButton jButton25;
    private JButton jButton26;
    private JButton jButton27;
    private JButton jButton28;
    private JButton jButton29;
    private JButton jButton3;
    private JButton jButton30;
    private JButton jButton31;
    private JButton jButton32;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel14;
    private JPanel jPanel15;
    private JPanel jPanel16;
    private JPanel jPanel17;
    private JPanel jPanel18;
    private JPanel jPanel19;
    private JPanel jPanel2;
    private JPanel jPanel20;
    private JPanel jPanel21;
    private JPanel jPanel22;
    private JPanel jPanel23;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JSeparator jSeparator1;
    private JTabbedPane jTabbedPane1;
    private JToolBar jToolBar1;
    private JToolBar jToolBar2;
    private JToolBar jToolBar3;
    private JToolBar jToolBar4;
    private JToolBar jToolBar5;
    private JToolBar jToolBar6;
    private JToolBar jToolBar7;
    private JToolBar jToolBar8;
    private modiffournisure modiffournisure1;
    private modifieradherentretretait modifieradherentretretait1;
    private montantvirementretraite montantvirementretraite1;
    private JButton primescolaire;
    private primescolaireRET primescolaireRET1;
    private rechercheaderonretraite rechercheaderonretraite1;
    private recherchecarnedecheque recherchecarnedecheque1;
    private STBRET sTBRET1;
    private traiteretretait traiteretretait1;
    private uibbret uibbret1;

    public retretait() {
        this.initComponents();
    }

    private void initComponents() {
        this.jTabbedPane1 = new JTabbedPane();
        this.jToolBar2 = new JToolBar();
        this.jPanel2 = new JPanel();
        this.jPanel7 = new JPanel();
        this.jButton1 = new JButton();
        this.jButton3 = new JButton();
        this.jButton5 = new JButton();
        this.jButton4 = new JButton();
        this.jButton14 = new JButton();
        this.jButton9 = new JButton();
        this.jPanel4 = new JPanel();
        this.ajoutadherentretretait1 = new ajoutadherentretretait();
        this.rechercheaderonretraite1 = new rechercheaderonretraite();
        this.modifieradherentretretait1 = new modifieradherentretretait();
        this.jLabel2 = new JLabel();
        this.jToolBar1 = new JToolBar();
        this.jPanel3 = new JPanel();
        this.jPanel8 = new JPanel();
        this.jPanel9 = new JPanel();
        this.atestationdepriseencharge1 = new Atestationdepriseencharge();
        this.demandeFDDretretait1 = new DemandeFDDretretait();
        this.traiteretretait1 = new traiteretretait();
        this.autorisation1 = new Autorisation();
        this.jSeparator1 = new JSeparator();
        this.jPanel10 = new JPanel();
        this.jButton12 = new JButton();
        this.jButton13 = new JButton();
        this.jButton11 = new JButton();
        this.jButton10 = new JButton();
        this.jButton20 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel3 = new JLabel();
        this.jToolBar3 = new JToolBar();
        this.jPanel1 = new JPanel();
        this.jPanel6 = new JPanel();
        this.jPanel5 = new JPanel();
        this.primescolaire = new JButton();
        this.jPanel20 = new JPanel();
        this.primescolaireRET1 = new primescolaireRET();
        this.jToolBar4 = new JToolBar();
        this.jPanel12 = new JPanel();
        this.jPanel11 = new JPanel();
        this.jButton15 = new JButton();
        this.jButton16 = new JButton();
        this.jButton17 = new JButton();
        this.jButton18 = new JButton();
        this.jButton19 = new JButton();
        this.jButton21 = new JButton();
        this.jButton22 = new JButton();
        this.jButton26 = new JButton();
        this.jPanel13 = new JPanel();
        this.bttret2 = new bttret();
        this.sTBRET1 = new STBRET();
        this.atbbret1 = new atbbret();
        this.bhret1 = new bhret();
        this.bnaret1 = new bnaret();
        this.bttret1 = new bttret();
        this.uibbret1 = new uibbret();
        this.jLabel5 = new JLabel();
        this.jToolBar5 = new JToolBar();
        this.jPanel14 = new JPanel();
        this.jPanel15 = new JPanel();
        this.ajoutercarnetdecheque1 = new ajoutercarnetdecheque();
        this.ajoutercanciencheque1 = new ajoutercanciencheque();
        this.recherchecarnedecheque1 = new recherchecarnedecheque();
        this.chequeretretait1 = new chequeretretait();
        this.jPanel23 = new JPanel();
        this.jButton27 = new JButton();
        this.jButton28 = new JButton();
        this.jButton29 = new JButton();
        this.jButton30 = new JButton();
        this.jButton31 = new JButton();
        this.jButton6 = new JButton();
        this.jButton32 = new JButton();
        this.jToolBar6 = new JToolBar();
        this.jPanel16 = new JPanel();
        this.jLabel1 = new JLabel();
        this.montantvirementretraite1 = new montantvirementretraite();
        this.jToolBar7 = new JToolBar();
        this.jPanel18 = new JPanel();
        this.jPanel19 = new JPanel();
        this.jButton7 = new JButton();
        this.jButton8 = new JButton();
        this.jButton23 = new JButton();
        this.jButton24 = new JButton();
        this.jButton25 = new JButton();
        this.jPanel21 = new JPanel();
        this.modiffournisure1 = new modiffournisure();
        this.cherchefournissseure1 = new cherchefournissseure();
        this.ajoutfournisseur1 = new ajoutfournisseur();
        this.jToolBar8 = new JToolBar();
        this.jPanel17 = new JPanel();
        this.jPanel22 = new JPanel();
        this.caisseprimescolaireretretait1 = new caisseprimescolaireretretait();
        this.setDefaultCloseOperation(3);
        this.setTitle("Mutuelle des Retretes ");
        this.jTabbedPane1.setCursor(new Cursor(0));
        this.jTabbedPane1.setFont(new Font("Arial", 1, 18));
        this.jToolBar2.setRollover(true);
        this.jPanel7.setLayout(null);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/add-user-icon (1).png")));
        this.jButton1.setToolTipText("Ajouter Adherent Sant\u00e9");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel7.add(this.jButton1);
        this.jButton1.setBounds(10, 20, 81, 57);
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/Hd search.png")));
        this.jButton3.setToolTipText("Chercher Adherent");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel7.add(this.jButton3);
        this.jButton3.setBounds(10, 180, 81, 57);
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton5.setToolTipText("Quitter");
        this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton5ActionPerformed(evt);
            }
        });
        this.jPanel7.add(this.jButton5);
        this.jButton5.setBounds(10, 430, 81, 57);
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/delete-user-icon.png")));
        this.jButton4.setToolTipText("Supprimer Adherent");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel7.add(this.jButton4);
        this.jButton4.setBounds(10, 260, 81, 57);
        this.jButton14.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton14.setToolTipText("Modifier Adherent");
        this.jButton14.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton14ActionPerformed(evt);
            }
        });
        this.jPanel7.add(this.jButton14);
        this.jButton14.setBounds(10, 90, 81, 66);
        this.jButton9.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton9.setToolTipText("Retour");
        this.jButton9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton9ActionPerformed(evt);
            }
        });
        this.jPanel7.add(this.jButton9);
        this.jButton9.setBounds(10, 340, 80, 60);
        this.jPanel4.setLayout(new CardLayout());
        this.jPanel4.add((Component)this.ajoutadherentretretait1, "ajouret");
        this.jPanel4.add((Component)this.rechercheaderonretraite1, "rechr");
        this.jPanel4.add((Component)this.modifieradherentretretait1, "modifret");
        this.jLabel2.setFont(new Font("Tahoma", 1, 18));
        this.jLabel2.setForeground(new Color(153, 0, 51));
        this.jLabel2.setText("Mutuelle Des Retraites");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel7, -2, 105, -2).addGap(22, 22, 22).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel4, -2, 774, -2).addComponent(this.jLabel2, -2, 557, -2)).addGap(921, 921, 921)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel7, -2, 519, -2).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.jLabel2, -2, 25, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jPanel4, -2, 571, -2))).addContainerGap()));
        this.jToolBar2.add(this.jPanel2);
        this.jTabbedPane1.addTab("Adherent", new ImageIcon(this.getClass().getResource("/image/contacts-evolution-icone-9100-48.png")), this.jToolBar2);
        this.jToolBar1.setRollover(true);
        this.jPanel9.setLayout(new CardLayout());
        this.jPanel9.add((Component)this.atestationdepriseencharge1, "attestaion");
        this.jPanel9.add((Component)this.demandeFDDretretait1, "fddr");
        this.jPanel9.add((Component)this.traiteretretait1, "trret");
        this.jPanel9.add((Component)this.autorisation1, "Auto");
        this.jPanel10.setLayout(null);
        this.jButton12.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/Nouveau dossier/3.png")));
        this.jButton12.setToolTipText("demande FDD");
        this.jButton12.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton12ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton12);
        this.jButton12.setBounds(10, 260, 70, 61);
        this.jButton13.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton13.setToolTipText("Quitter");
        this.jPanel10.add(this.jButton13);
        this.jButton13.setBounds(10, 400, 70, 57);
        this.jButton11.setText("Traite");
        this.jButton11.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton11ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton11);
        this.jButton11.setBounds(10, 330, 70, 50);
        this.jButton10.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/Nouveau dossier/cession2.png")));
        this.jButton10.setToolTipText("Attestaion de prise en charge");
        this.jButton10.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton10ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton10);
        this.jButton10.setBounds(10, 60, 70, 50);
        this.jButton20.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/Nouveau dossier/cession1.png")));
        this.jButton20.setToolTipText("Autorisation de prelevement d'office");
        this.jButton20.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton20ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton20);
        this.jButton20.setBounds(10, 120, 65, 50);
        this.jButton2.setText("jButton2");
        this.jPanel10.add(this.jButton2);
        this.jButton2.setBounds(13, 180, 60, 50);
        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setForeground(new Color(153, 0, 51));
        this.jLabel3.setText("Mutuelle Des Retrait\u00e9s");
        GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel10, -2, 92, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jSeparator1, -1, 918, 32767).addComponent(this.jPanel9, GroupLayout.Alignment.TRAILING, -2, 751, -2).addComponent(this.jLabel3, GroupLayout.Alignment.TRAILING, -2, 650, -2)).addContainerGap()));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel10, -1, 573, 32767)).addGroup(GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(this.jLabel3, -2, 25, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel9, -2, 509, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jSeparator1, -2, 10, -2))).addContainerGap(59, 32767)));
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel8, -1, -1, 32767).addContainerGap()));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel8, -2, -1, -2)));
        this.jToolBar1.add(this.jPanel3);
        this.jTabbedPane1.addTab("Pret", new ImageIcon(this.getClass().getResource("/image/mutuelle/especes-monnaie-sac-a-main-portefeuille-icone-6745-64.png")), this.jToolBar1);
        this.jToolBar3.setBackground(new Color(227, 226, 226));
        this.jToolBar3.setRollover(true);
        this.jPanel1.setBackground(new Color(227, 226, 226));
        this.jPanel1.setLayout(new BorderLayout());
        this.primescolaire.setIcon(new ImageIcon(this.getClass().getResource("/prime/graduation-hat.png")));
        this.primescolaire.setToolTipText("Prime Scolaire");
        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.primescolaire, -2, 67, -2).addContainerGap(-1, 32767)));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.primescolaire, -2, 56, -2).addContainerGap(408, 32767)));
        this.jPanel20.setLayout(new CardLayout());
        this.jPanel20.add((Component)this.primescolaireRET1, "card2");
        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel5, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel20, -2, 883, -2).addContainerGap(66, 32767)));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel20, -2, 586, -2).addComponent(this.jPanel5, -2, -1, -2)).addContainerGap(17, 32767)));
        this.jPanel1.add((Component)this.jPanel6, "Center");
        this.jToolBar3.add(this.jPanel1);
        this.jTabbedPane1.addTab("Prime", new ImageIcon(this.getClass().getResource("/image/mutuelle/cadeaux.png")), this.jToolBar3);
        this.jToolBar4.setRollover(true);
        this.jPanel12.setVerifyInputWhenFocusTarget(false);
        this.jPanel11.setBackground(new Color(204, 204, 204));
        this.jPanel11.setLayout(null);
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/btt.png")));
        this.jButton15.setToolTipText("BT");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton15);
        this.jButton15.setBounds(10, 0, 64, 53);
        this.jButton16.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/uibb.PNG")));
        this.jButton16.setToolTipText("UIB");
        this.jButton16.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton16ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton16);
        this.jButton16.setBounds(10, 60, 64, 53);
        this.jButton17.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/bhh.PNG")));
        this.jButton17.setToolTipText("BH");
        this.jButton17.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton17ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton17);
        this.jButton17.setBounds(10, 120, 64, 53);
        this.jButton18.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/bnaa.jpg")));
        this.jButton18.setToolTipText("BNA");
        this.jButton18.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton18ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton18);
        this.jButton18.setBounds(10, 240, 64, 53);
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/atb.PNG")));
        this.jButton19.setToolTipText("ATB");
        this.jButton19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton19);
        this.jButton19.setBounds(10, 180, 64, 53);
        this.jButton21.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/stb-tunisie.jpg")));
        this.jButton21.setToolTipText("STB");
        this.jButton21.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton21ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton21);
        this.jButton21.setBounds(10, 300, 64, 53);
        this.jButton22.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/biatt.PNG")));
        this.jButton22.setToolTipText("BIAT");
        this.jButton22.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton22ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton22);
        this.jButton22.setBounds(10, 360, 64, 53);
        this.jButton26.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton26.setToolTipText("Quitter");
        this.jButton26.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton26ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton26);
        this.jButton26.setBounds(10, 430, 64, 57);
        this.jPanel13.setLayout(new CardLayout());
        this.jPanel13.add((Component)this.bttret2, "btr");
        this.jPanel13.add((Component)this.sTBRET1, "stbr");
        this.jPanel13.add((Component)this.atbbret1, "atbr");
        this.jPanel13.add((Component)this.bhret1, "bhr");
        this.jPanel13.add((Component)this.bnaret1, "bnar");
        this.jPanel13.add((Component)this.bttret1, "btr");
        this.jPanel13.add((Component)this.uibbret1, "uibr");
        this.jLabel5.setFont(new Font("Tahoma", 1, 18));
        this.jLabel5.setForeground(new Color(153, 0, 51));
        this.jLabel5.setText("Mutuelle Des Retrait\u00e9s");
        GroupLayout jPanel12Layout = new GroupLayout(this.jPanel12);
        this.jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addComponent(this.jPanel11, -2, 82, -2).addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addGap(248, 248, 248).addComponent(this.jLabel5)).addGroup(jPanel12Layout.createSequentialGroup().addGap(49, 49, 49).addComponent(this.jPanel13, -2, -1, -2))).addGap(1089, 1089, 1089)));
        jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.jPanel11, -2, 501, -2)).addGroup(jPanel12Layout.createSequentialGroup().addComponent(this.jLabel5).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel13, -2, 520, -2))).addContainerGap()));
        this.jToolBar4.add(this.jPanel12);
        this.jTabbedPane1.addTab(" ", new ImageIcon(this.getClass().getResource("/image/mutuelle/virementbancaire.png")), this.jToolBar4);
        this.jToolBar5.setRollover(true);
        this.jPanel15.setLayout(new CardLayout());
        this.jPanel15.add((Component)this.ajoutercarnetdecheque1, "ajoutcarnetcheque");
        this.jPanel15.add((Component)this.ajoutercanciencheque1, "anciencheque");
        this.jPanel15.add((Component)this.recherchecarnedecheque1, "recherchecarnet");
        this.jPanel15.add((Component)this.chequeretretait1, "card5");
        this.jPanel23.setLayout(null);
        this.jButton27.setIcon(new ImageIcon(this.getClass().getResource("/image/add-user-icon (1).png")));
        this.jButton27.setToolTipText("Ajouter un nouveaux carnet de cheque");
        this.jButton27.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton27ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton27);
        this.jButton27.setBounds(10, 30, 81, 57);
        this.jButton28.setIcon(new ImageIcon(this.getClass().getResource("/image/Hd search.png")));
        this.jButton28.setToolTipText("Chercher des cheque");
        this.jButton28.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton28ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton28);
        this.jButton28.setBounds(10, 180, 81, 57);
        this.jButton29.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton29.setToolTipText("Quitter");
        this.jButton29.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton29ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton29);
        this.jButton29.setBounds(10, 462, 80, 57);
        this.jButton30.setIcon(new ImageIcon(this.getClass().getResource("/image/delete-user-icon.png")));
        this.jButton30.setToolTipText("Supprimer des cheques");
        this.jButton30.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton30ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton30);
        this.jButton30.setBounds(10, 250, 81, 57);
        this.jButton31.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton31.setToolTipText("Modifier un carnet de cheque");
        this.jButton31.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton31ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton31);
        this.jButton31.setBounds(10, 100, 81, 66);
        this.jButton6.setIcon(new ImageIcon(this.getClass().getResource("/image/gestion cheque/imprimante-icone-6110-48.png")));
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton6ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton6);
        this.jButton6.setBounds(10, 320, 80, 57);
        this.jButton32.setFont(new Font("Tahoma", 1, 12));
        this.jButton32.setText("Ajouter");
        this.jButton32.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton32ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton32);
        this.jButton32.setBounds(10, 390, 79, 60);
        GroupLayout jPanel14Layout = new GroupLayout(this.jPanel14);
        this.jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel23, -2, 99, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel15, -1, 931, 32767).addContainerGap()));
        jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.jPanel23, -2, 559, -2)).addGroup(jPanel14Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel15, -2, 565, -2))).addContainerGap(29, 32767)));
        this.jToolBar5.add(this.jPanel14);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/image/gestion cheque/gest.png")), this.jToolBar5);
        this.jToolBar6.setRollover(true);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Imprimer Montant Virement Bancaire");
        GroupLayout jPanel16Layout = new GroupLayout(this.jPanel16);
        this.jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel16Layout.createSequentialGroup().addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel16Layout.createSequentialGroup().addGap(166, 166, 166).addComponent(this.jLabel1)).addGroup(jPanel16Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(this.montantvirementretraite1, -2, 746, -2))).addContainerGap(244, 32767)));
        jPanel16Layout.setVerticalGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel16Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.montantvirementretraite1, -2, -1, -2).addContainerGap(-1, 32767)));
        this.jToolBar6.add(this.jPanel16);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/image/mutuelle/v.png")), this.jToolBar6);
        this.jToolBar7.setRollover(true);
        this.jButton7.setIcon(new ImageIcon(this.getClass().getResource("/image/add-user-icon (1).png")));
        this.jButton7.setToolTipText("Ajouter Fornisseure");
        this.jButton7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton7ActionPerformed(evt);
            }
        });
        this.jButton8.setIcon(new ImageIcon(this.getClass().getResource("/image/Hd search.png")));
        this.jButton8.setToolTipText("Chercher Fournisseurs");
        this.jButton8.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton8ActionPerformed(evt);
            }
        });
        this.jButton23.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton23.setToolTipText("Quitter");
        this.jButton23.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton23ActionPerformed(evt);
            }
        });
        this.jButton24.setIcon(new ImageIcon(this.getClass().getResource("/image/delete-user-icon.png")));
        this.jButton24.setToolTipText("Supprimer Fournisseurs");
        this.jButton24.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton24ActionPerformed(evt);
            }
        });
        this.jButton25.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton25.setToolTipText("Modifier Fournisseurs");
        this.jButton25.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                retretait.this.jButton25ActionPerformed(evt);
            }
        });
        GroupLayout jPanel19Layout = new GroupLayout(this.jPanel19);
        this.jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addContainerGap().addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButton25, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jButton8, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jButton7, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap(20, 32767)).addGroup(jPanel19Layout.createSequentialGroup().addComponent(this.jButton23, -1, -1, 32767).addGap(20, 20, 20)).addGroup(jPanel19Layout.createSequentialGroup().addComponent(this.jButton24, -1, -1, 32767).addGap(20, 20, 20)))));
        jPanel19Layout.setVerticalGroup(jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton7).addGap(18, 18, 18).addComponent(this.jButton25, -2, 66, -2).addGap(34, 34, 34).addComponent(this.jButton8).addGap(28, 28, 28).addComponent(this.jButton24).addGap(26, 26, 26).addComponent(this.jButton23).addContainerGap(119, 32767)));
        this.jPanel21.setLayout(new CardLayout());
        this.jPanel21.add((Component)this.modiffournisure1, "modiff");
        this.jPanel21.add((Component)this.cherchefournissseure1, "cherf");
        this.jPanel21.add((Component)this.ajoutfournisseur1, "ajouf");
        GroupLayout jPanel18Layout = new GroupLayout(this.jPanel18);
        this.jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel19, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel21, -2, 738, -2).addContainerGap(179, 32767)));
        jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addContainerGap().addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel21, -1, 592, 32767).addComponent(this.jPanel19, -2, -1, -2)).addContainerGap()));
        this.jToolBar7.add(this.jPanel18);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/image/mutuelle/Icone fournisseurs.png")), this.jToolBar7);
        this.jToolBar8.setRollover(true);
        this.jPanel22.setLayout(new CardLayout());
        this.jPanel22.add((Component)this.caisseprimescolaireretretait1, "card2");
        GroupLayout jPanel17Layout = new GroupLayout(this.jPanel17);
        this.jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel22, -1, 1036, 32767).addContainerGap()));
        jPanel17Layout.setVerticalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addComponent(this.jPanel22, -1, 603, 32767).addContainerGap()));
        this.jToolBar8.add(this.jPanel17);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/caissemasp/ccccc.PNG")), this.jToolBar8);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jTabbedPane1, -1, 1074, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jTabbedPane1, -2, 717, 32767).addContainerGap()));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Locale.setDefault(new Locale("ar", ""));
        JFrame secretaire = new JFrame("ff");
        CardLayout card = (CardLayout)this.jPanel4.getLayout();
        card.show(this.jPanel4, "ajouret");
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel4.getLayout();
        card.show(this.jPanel4, "rechr");
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel4.getLayout();
        card.show(this.jPanel4, "sup");
    }

    private void jButton14ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel4.getLayout();
        card.show(this.jPanel4, "modifret");
    }

    private void jButton12ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "fddr");
    }

    private void jButton11ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "trret");
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "btr");
    }

    private void jButton16ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "uibr");
    }

    private void jButton17ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "bhr");
    }

    private void jButton18ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "bnar");
    }

    private void jButton19ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "atbr");
    }

    private void jButton21ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "stbr");
    }

    private void jButton22ActionPerformed(ActionEvent evt) {
    }

    private void jButton26ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel21.getLayout();
        card.show(this.jPanel21, "ajouf");
    }

    private void jButton8ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel21.getLayout();
        card.show(this.jPanel21, "cherf");
    }

    private void jButton23ActionPerformed(ActionEvent evt) {
    }

    private void jButton24ActionPerformed(ActionEvent evt) {
    }

    private void jButton25ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel21.getLayout();
        card.show(this.jPanel21, "modiff");
    }

    private void jButton9ActionPerformed(ActionEvent evt) {
    }

    private void jButton10ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "attestaion");
    }

    private void jButton20ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "Auto");
    }

    private void jButton27ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "ajoutcarnetcheque");
    }

    private void jButton28ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "recherchecarnet");
    }

    private void jButton29ActionPerformed(ActionEvent evt) {
    }

    private void jButton30ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "anullercheque");
    }

    private void jButton31ActionPerformed(ActionEvent evt) {
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "card5");
    }

    private void jButton32ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "anciencheque");
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
            Logger.getLogger(retretait.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(retretait.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(retretait.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(retretait.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new retretait().setVisible(true);
            }
        });
    }

}

