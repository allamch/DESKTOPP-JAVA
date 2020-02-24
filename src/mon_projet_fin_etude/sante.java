/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import mon_projet_fin_etude.DemandeFDD;
import mon_projet_fin_etude.ETATbc;
import mon_projet_fin_etude.Mainleveancien;
import mon_projet_fin_etude.ORDEREDEPAYMENTANCIENCESSION;
import mon_projet_fin_etude.STB;
import mon_projet_fin_etude.ajoutadherent1;
import mon_projet_fin_etude.ajouteranciencarnetdecheque;
import mon_projet_fin_etude.ajoutercanciencheque;
import mon_projet_fin_etude.ajoutercarnetchequeadherent;
import mon_projet_fin_etude.ajoutercarnetdecheque;
import mon_projet_fin_etude.ajoutfournisseur;
import mon_projet_fin_etude.ajoutfournisseurInterne;
import mon_projet_fin_etude.ancienBC;
import mon_projet_fin_etude.anullationcheque;
import mon_projet_fin_etude.atbb1;
import mon_projet_fin_etude.bh;
import mon_projet_fin_etude.bna;
import mon_projet_fin_etude.boderoparmois;
import mon_projet_fin_etude.bondecommande;
import mon_projet_fin_etude.bondecommandepharmacie;
import mon_projet_fin_etude.btt;
import mon_projet_fin_etude.caissefdd;
import mon_projet_fin_etude.caissemasp;
import mon_projet_fin_etude.caissepretetatdecheque;
import mon_projet_fin_etude.caisseprimemasp;
import mon_projet_fin_etude.caisseprimescolaire;
import mon_projet_fin_etude.cessionsursalire;
import mon_projet_fin_etude.cessionsursalire2;
import mon_projet_fin_etude.cheque;
import mon_projet_fin_etude.cherchefournissseure;
import mon_projet_fin_etude.cloturedemois;
import mon_projet_fin_etude.cloturedemoisadh;
import mon_projet_fin_etude.cloturedemoisdetouslesfor;
import mon_projet_fin_etude.consultationfr;
import mon_projet_fin_etude.consultationpaymentadh;
import mon_projet_fin_etude.consultationpaymentadhmodi;
import mon_projet_fin_etude.etatbcparfornissseur;
import mon_projet_fin_etude.etatdecession;
import mon_projet_fin_etude.etatdesprets;
import mon_projet_fin_etude.fornisseurinternerecherche;
import mon_projet_fin_etude.fourniseueinterneajoutservice;
import mon_projet_fin_etude.modiadh;
import mon_projet_fin_etude.modiffournisure;
import mon_projet_fin_etude.mois;
import mon_projet_fin_etude.moisfinnn;
import mon_projet_fin_etude.montantvirementsante;
import mon_projet_fin_etude.orangedemande;
import mon_projet_fin_etude.orangedemandeetat;
import mon_projet_fin_etude.orangeetatdedeuxans;
import mon_projet_fin_etude.orangeetatdepaiment;
import mon_projet_fin_etude.orangeservice;
import mon_projet_fin_etude.orangesuppressiondemande;
import mon_projet_fin_etude.pretcaisse;
import mon_projet_fin_etude.primedecirconcision;
import mon_projet_fin_etude.primededece;
import mon_projet_fin_etude.primedehandicap\u00e9;
import mon_projet_fin_etude.primedemariage;
import mon_projet_fin_etude.primedenaissance;
import mon_projet_fin_etude.primederetraite;
import mon_projet_fin_etude.primeetatsante;
import mon_projet_fin_etude.primescolaire;
import mon_projet_fin_etude.primesociale;
import mon_projet_fin_etude.recherchadhproffe;
import mon_projet_fin_etude.recherchebcparforniseur;
import mon_projet_fin_etude.recherchecarnedecheque;
import mon_projet_fin_etude.recherchefddparforniseur1;
import mon_projet_fin_etude.r\u00e9captulationdejours;
import mon_projet_fin_etude.suppbc;
import mon_projet_fin_etude.suppcessionfornisseur;
import mon_projet_fin_etude.suppcessionfrhistorique;
import mon_projet_fin_etude.suppebchistorique;
import mon_projet_fin_etude.traite;
import mon_projet_fin_etude.uibb;

public class sante
extends JFrame {
    private ajoutadherent1 ajoutadherent1;
    private ajoutadherent1 ajoutadherent11;
    private ajouteranciencarnetdecheque ajouteranciencarnetdecheque1;
    private ajoutercanciencheque ajoutercanciencheque1;
    private ajoutercarnetchequeadherent ajoutercarnetchequeadherent1;
    private ajoutercarnetdecheque ajoutercarnetdecheque1;
    private ajoutfournisseur ajoutfournisseur1;
    private ajoutfournisseurInterne ajoutfournisseurInterne1;
    private ancienBC ancienBC1;
    private anullationcheque anullationcheque1;
    private atbb1 atbb11;
    private caisseDebitCredit debitCredit;
    private bh bh1;
    private bna bna1;
    private boderoparmois boderoparmois1;
    private bondecommande bondecommande1;
    private bondecommandepharmacie bondecommandepharmacie1;
    private btt btt1;
    private caissefdd caissefdd1;
    private caissemasp caissemasp1;
    private caissepretetatdecheque caissepretetatdecheque1;
    private caisseprimemasp caisseprimemasp1;
    private caisseprimescolaire caisseprimescolaire1;
    private cessionsursalire cessionsursalire1;
    private cessionsursalire2 cessionsursalire21;
    private cheque cheque1;
    private cherchefournissseure cherchefournissseure1;
    private cloturedemois cloturedemois1;
    private cloturedemoisdetouslesfor cloturedemoisdetouslesfor1;
    private cloturedemoisadh cloturedemoisf1;
    private consultationfr consultationfr1;
    private consultationpaymentadh consultationpaymentadh1;
    private consultationpaymentadhmodi consultationpaymentadhmodi1;
    private DemandeFDD demandeFDD1;
    private ETATbc eTATbc1;
    private etatbcparfornissseur etatbcparfornissseur1;
    private etatdecession etatdecession1;
    private etatdesprets etatdesprets1;
    private fornisseurinternerecherche fornisseurinternerecherche1;
    private fourniseueinterneajoutservice fourniseueinterneajoutservice1;
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
    private JButton jButton33;
    private JButton jButton34;
    private JButton jButton35;
    private JButton jButton36;
    private JButton jButton37;
    private JButton jButton38;
    private JButton jButton39;
    private JButton jButton4;
    private JButton jButton40;
    private JButton jButton41;
    private JButton jButton42;
    private JButton jButton43;
    private JButton jButton44;
    private JButton jButton45;
    private JButton jButton46;
    private JButton jButton47;
    private JButton jButton48;
    private JButton jButton49;
    private JButton jButton5;
    private JButton jButton50;
    private JButton jButton51;
    private JButton jButton52;
    private JButton jButton53;
    private JButton jButton54;
    private JButton jButton55;
    private JButton jButton56;
    private JButton jButton57;
    private JButton jButton58;
    private JButton jButton59;
    private JButton jButton6;
    private JButton jButton60;
    private JButton jButton61;
    private JButton jButton62;
    private JButton jButton63;
    private JButton jButton64;
    private JButton jButton65;
    private JButton jButton66;
    private JButton jButton67;
    private JButton jButton68;
    private JButton jButton69;
    private JButton jButton7;
    private JButton jButton70;
    private JButton jButton71;
    private JButton jButton72;
    private JButton jButton73;
    private JButton jButton74;
    private JButton jButton75;
    private JButton jButton76;
    private JButton jButton77;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
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
    private JPanel jPanel24;
    private JPanel jPanel25;
    private JPanel jPanel26;
    private JPanel jPanel27;
    private JPanel jPanel28;
    private JPanel jPanel29;
    private JPanel jPanel3;
    private JPanel jPanel30;
    private JPanel jPanel31;
    private JPanel jPanel32;
    private JPanel jPanel33;
    private JPanel jPanel34;
    private JPanel jPanel35;
    private JPanel jPanel36;
    private JPanel jPanel37;
    private JPanel jPanel38;
    private JPanel jPanel39;
    private JPanel jPanel4;
    private JPanel jPanel40;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JPanel jPanel120;
    private JSeparator jSeparator1;
    private JTabbedPane jTabbedPane1;
    private JToolBar jToolBar1;
    private JToolBar jToolBar10;
    private JToolBar jToolBar11;
    private JToolBar jToolBar12;
    private JToolBar jToolBar2;
    private JToolBar jToolBar3;
    private JToolBar jToolBar4;
    private JToolBar jToolBar5;
    private JToolBar jToolBar6;
    private JToolBar jToolBar7;
    private JToolBar jToolBar8;
    private JToolBar jToolBar9;
    private Mainleveancien mainleveancien1;
    private modiadh modiadh1;
    private modiffournisure modiffournisure1;
    private mois mois1;
    private moisfinnn moisfinnn1;
    private montantvirementsante montantvirementsante2;
    private ORDEREDEPAYMENTANCIENCESSION oRDEREDEPAYMENTANCIENCESSION1;
    private orangedemande orangedemande1;
    private orangedemandeetat orangedemandeetat1;
    private orangeetatdedeuxans orangeetatdedeuxans1;
    private orangeetatdepaiment orangeetatdepaiment1;
    private orangeservice orangeservice1;
    private orangesuppressiondemande orangesuppressiondemande1;
    private primedecirconcision primedecirconcision1;
    private primededece primededece1;
    private primedehandicap\u00e9 primedehandicap\u00e91;
    private primedemariage primedemariage1;
    private primedenaissance primedenaissance1;
    private primederetraite primederetraite1;
    private primeetatsante primeetatsante1;
    private JButton primescolaire;
    private primescolaire primescolaire1;
    private primesociale primesociale1;
    private paiementespece paiementespece1;
    private recherchadhproffe recherchadhproffe1;
    private recherchebcparforniseur recherchebcparforniseur1;
    private recherchecarnedecheque recherchecarnedecheque1;
    private recherchefddparforniseur1 recherchefddparforniseur11;
    private r\u00e9captulationdejours r\u00e9captulationdejours1;
    private STB sTB1;
    private pretcaisse supp1;
    private suppbc suppbc1;
    private suppcessionfornisseur suppcessionfornisseur1;
    private suppcessionfrhistorique suppcessionfrhistorique1;
    private suppebchistorique suppebchistorique1;
    private traite traite1;
    private uibb uibb1;

    public sante() {
        this.initComponents();
    }

    private void initComponents() {
        this.ajoutadherent1 = new ajoutadherent1();
        this.jTabbedPane1 = new JTabbedPane();
        this.jToolBar2 = new JToolBar();
        this.jPanel2 = new JPanel();
        this.jPanel7 = new JPanel();
        this.jButton1 = new JButton();
        this.jButton3 = new JButton();
        this.jButton5 = new JButton();
        this.jButton4 = new JButton();
        this.jButton14 = new JButton();
        this.jPanel4 = new JPanel();
        this.modiadh1 = new modiadh();
        this.recherchadhproffe1 = new recherchadhproffe();
        this.supp1 = new pretcaisse();
        this.ajoutadherent11 = new ajoutadherent1();
        this.jPanel22 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jToolBar1 = new JToolBar();
        this.jPanel3 = new JPanel();
        this.jPanel8 = new JPanel();
        this.jPanel9 = new JPanel();
        this.demandeFDD1 = new DemandeFDD();
        this.traite1 = new traite();
        this.cessionsursalire1 = new cessionsursalire();
        this.etatdecession1 = new etatdecession();
        this.oRDEREDEPAYMENTANCIENCESSION1 = new ORDEREDEPAYMENTANCIENCESSION();
        this.suppcessionfornisseur1 = new suppcessionfornisseur();
        this.suppcessionfrhistorique1 = new suppcessionfrhistorique();
        this.etatdesprets1 = new etatdesprets();
        this.recherchefddparforniseur11 = new recherchefddparforniseur1();
        this.cessionsursalire21 = new cessionsursalire2();
        this.mainleveancien1 = new Mainleveancien();
        this.jPanel10 = new JPanel();
        this.jButton10 = new JButton();
        this.jButton12 = new JButton();
        this.jButton13 = new JButton();
        this.jButton9 = new JButton();
        this.jButton11 = new JButton();
        this.jButton48 = new JButton();
        this.jButton68 = new JButton();
        this.jButton70 = new JButton();
        this.jButton75 = new JButton();
        this.jButton77 = new JButton();
        this.jLabel6 = new JLabel();
        this.jToolBar3 = new JToolBar();
        this.jPanel1 = new JPanel();
        this.jPanel6 = new JPanel();
        this.jPanel16 = new JPanel();
        this.primescolaire1 = new primescolaire();
        this.primedenaissance1 = new primedenaissance();
        this.primedemariage1 = new primedemariage();
        this.primesociale1 = new primesociale();
        this.primedehandicap\u00e91 = new primedehandicap\u00e9();
        this.primededece1 = new primededece();
        this.primedecirconcision1 = new primedecirconcision();
        this.primederetraite1 = new primederetraite();
        this.primeetatsante1 = new primeetatsante();
        this.jPanel5 = new JPanel();
        this.primescolaire = new JButton();
        this.jButton50 = new JButton();
        this.jButton51 = new JButton();
        this.jButton52 = new JButton();
        this.jButton53 = new JButton();
        this.jButton54 = new JButton();
        this.jButton55 = new JButton();
        this.jButton56 = new JButton();
        this.jButton57 = new JButton();
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
        this.jButton31 = new JButton();
        this.jPanel13 = new JPanel();
        this.jPanel120= new JPanel();
        this.paiementespece1= new paiementespece();
        this.btt1 = new btt();
        this.sTB1 = new STB();
        this.atbb11 = new atbb1();
        this.bh1 = new bh();
        this.bna1 = new bna();
        this.uibb1 = new uibb();
        this.montantvirementsante2 = new montantvirementsante();
        this.jLabel5 = new JLabel();
        this.jToolBar5 = new JToolBar();
        this.jPanel14 = new JPanel();
        this.jPanel15 = new JPanel();
        this.ajoutercarnetdecheque1 = new ajoutercarnetdecheque();
        this.cheque1 = new cheque();
        this.recherchecarnedecheque1 = new recherchecarnedecheque();
        this.anullationcheque1 = new anullationcheque();
        this.ajoutercanciencheque1 = new ajoutercanciencheque();
        this.ajouteranciencarnetdecheque1 = new ajouteranciencarnetdecheque();
        this.ajoutercarnetchequeadherent1 = new ajoutercarnetchequeadherent();
        this.jPanel23 = new JPanel();
        this.jButton20 = new JButton();
        this.jButton27 = new JButton();
        this.jButton28 = new JButton();
        this.jButton29 = new JButton();
        this.jButton30 = new JButton();
        this.jButton2 = new JButton();
        this.jButton32 = new JButton();
        this.jButton34 = new JButton();
        this.jLabel8 = new JLabel();
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
        this.jLabel9 = new JLabel();
        this.jToolBar6 = new JToolBar();
        this.jPanel24 = new JPanel();
        this.jPanel17 = new JPanel();
        this.cloturedemois1 = new cloturedemois();
        this.mois1 = new mois();
        this.moisfinnn1 = new moisfinnn();
        this.boderoparmois1 = new boderoparmois();
        this.jPanel20 = new JPanel();
        this.jButton36 = new JButton();
        this.jButton39 = new JButton();
        this.jButton37 = new JButton();
        this.jButton38 = new JButton();
        this.jToolBar8 = new JToolBar();
        this.jPanel25 = new JPanel();
        this.jPanel26 = new JPanel();
        this.jButton40 = new JButton();
        this.jButton41 = new JButton();
        this.jButton42 = new JButton();
        this.jButton43 = new JButton();
        this.jButton44 = new JButton();
        this.jButton45 = new JButton();
        this.jButton64 = new JButton();
        this.jButton65 = new JButton();
        this.jPanel27 = new JPanel();
        this.recherchebcparforniseur1 = new recherchebcparforniseur();
        this.bondecommande1 = new bondecommande();
        this.bondecommandepharmacie1 = new bondecommandepharmacie();
        this.eTATbc1 = new ETATbc();
        this.etatbcparfornissseur1 = new etatbcparfornissseur();
        this.suppbc1 = new suppbc();
        this.suppebchistorique1 = new suppebchistorique();
        this.ancienBC1 = new ancienBC();
        this.jToolBar11 = new JToolBar();
        this.jPanel34 = new JPanel();
        this.jPanel35 = new JPanel();
        this.jButton62 = new JButton();
        this.jButton63 = new JButton();
        this.jButton66 = new JButton();
        this.jButton67 = new JButton();
        this.jButton69 = new JButton();
        this.jButton33 = new JButton();
        this.jPanel36 = new JPanel();
        this.orangeservice1 = new orangeservice();
        this.orangedemande1 = new orangedemande();
        this.orangedemandeetat1 = new orangedemandeetat();
        this.orangeetatdepaiment1 = new orangeetatdepaiment();
        this.orangesuppressiondemande1 = new orangesuppressiondemande();
        this.orangeetatdedeuxans1 = new orangeetatdedeuxans();
        this.jToolBar9 = new JToolBar();
        this.jPanel28 = new JPanel();
        this.jPanel29 = new JPanel();
        this.r\u00e9captulationdejours1 = new r\u00e9captulationdejours();
        this.caissemasp1 = new caissemasp();
        this.caisseprimescolaire1 = new caisseprimescolaire();
        this.caissepretetatdecheque1 = new caissepretetatdecheque();
        this.caissefdd1 = new caissefdd();
        this.debitCredit= new caisseDebitCredit();
        this.caisseprimemasp1 = new caisseprimemasp();
        this.jPanel30 = new JPanel();
        this.jButton49 = new JButton();
        this.jButton58 = new JButton();
        this.jButton47 = new JButton();
        this.jButton46 = new JButton();
        this.jButton71 = new JButton();
        this.jButton6 = new JButton();
        this.jButton76 = new JButton();
        this.jToolBar10 = new JToolBar();
        this.jPanel33 = new JPanel();
        this.jPanel31 = new JPanel();
        this.consultationpaymentadh1 = new consultationpaymentadh();
        this.cloturedemoisf1 = new cloturedemoisadh();
        this.consultationfr1 = new consultationfr();
        this.cloturedemoisdetouslesfor1 = new cloturedemoisdetouslesfor();
        this.consultationpaymentadhmodi1 = new consultationpaymentadhmodi();
        this.jPanel32 = new JPanel();
        this.jButton59 = new JButton();
        this.jButton60 = new JButton();
        this.jButton61 = new JButton();
        this.jButton35 = new JButton();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jToolBar12 = new JToolBar();
        this.jPanel37 = new JPanel();
        this.jPanel38 = new JPanel();
        this.jPanel39 = new JPanel();
        this.jButton72 = new JButton();
        this.jButton73 = new JButton();
        this.jButton74 = new JButton();
        this.jPanel40 = new JPanel();
        this.fornisseurinternerecherche1 = new fornisseurinternerecherche();
        this.fourniseueinterneajoutservice1 = new fourniseueinterneajoutservice();
        this.ajoutfournisseurInterne1 = new ajoutfournisseurInterne();
        this.setDefaultCloseOperation(3);
        this.setTitle("Mutuelle de la Sant\u00e9");
        this.setMinimumSize(new Dimension(1200, 800));
        this.jTabbedPane1.setCursor(new Cursor(0));
        this.jTabbedPane1.setFont(new Font("Arial", 1, 18));
        this.jTabbedPane1.setMaximumSize(new Dimension(32800, 32800));
        this.jToolBar2.setRollover(true);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/add-user-icon (1).png")));
        this.jButton1.setToolTipText("Ajouter Adherent Sant\u00e9");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/Hd search.png")));
        this.jButton3.setToolTipText("Chercher Adherent");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton5.setToolTipText("Quitter");
        this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton5ActionPerformed(evt);
            }
        });
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/delete-user-icon.png")));
        this.jButton4.setToolTipText("Pret Caisse");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton4ActionPerformed(evt);
            }
        });
        this.jButton14.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton14.setToolTipText("Modifier Adherent");
        this.jButton14.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton14ActionPerformed(evt);
            }
        });
        GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jButton5, -1, -1, 32767).addGap(20, 20, 20)).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jButton1).addContainerGap(20, 32767)).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jButton14, -1, -1, 32767).addGap(20, 20, 20)).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jButton4, -1, -1, 32767).addGap(20, 20, 20)).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jButton3, -1, -1, 32767).addGap(20, 20, 20)))));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup().addGap(30, 30, 30).addComponent(this.jButton1).addGap(26, 26, 26).addComponent(this.jButton14, -2, 66, -2).addGap(39, 39, 39).addComponent(this.jButton3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, 32767).addComponent(this.jButton4).addGap(46, 46, 46).addComponent(this.jButton5).addGap(41, 41, 41)));
        this.jPanel4.setLayout(new CardLayout());
        this.jPanel4.add((Component)this.modiadh1, "mod");
        this.jPanel4.add((Component)this.recherchadhproffe1, "rech");
        this.jPanel4.add((Component)this.supp1, "sup");
        this.jPanel4.add((Component)this.ajoutadherent11, "ajou");
        this.jLabel7.setFont(new Font("Tahoma", 1, 18));
        this.jLabel7.setForeground(new Color(153, 0, 51));
        this.jLabel7.setText("Mutuelle de la Sant\u00e9  :Gestion des Adherents ");
        GroupLayout jPanel22Layout = new GroupLayout(this.jPanel22);
        this.jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addGap(104, 104, 104).addComponent(this.jLabel7, -2, 439, -2).addContainerGap(129, 32767)));
        jPanel22Layout.setVerticalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel7, -2, 25, -2).addContainerGap()));
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel7, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel22, -2, -1, -2).addComponent(this.jPanel4, -2, -1, -2)).addContainerGap(142, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel7, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jPanel22, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel4, -2, 560, -2))).addContainerGap(-1, 32767)));
        this.jToolBar2.add(this.jPanel2);
        this.jTabbedPane1.addTab("Adherent", new ImageIcon(this.getClass().getResource("/image/contacts-evolution-icone-9100-48.png")), this.jToolBar2);
        this.jToolBar1.setRollover(true);
        this.jPanel9.setLayout(new CardLayout());
        this.jPanel9.add((Component)this.demandeFDD1, "fdd");
        this.jPanel120.add((Component)this.paiementespece1,"pai");
        this.jPanel9.add((Component)this.traite1, "traite");
        this.jPanel9.add((Component)this.cessionsursalire1, "card2");
        this.jPanel9.add((Component)this.etatdecession1, "card6");
        this.jPanel9.add((Component)this.oRDEREDEPAYMENTANCIENCESSION1, "card8");
        this.jPanel9.add((Component)this.suppcessionfornisseur1, "card10");
        this.jPanel9.add((Component)this.suppcessionfrhistorique1, "card11");
        this.jPanel9.add((Component)this.etatdesprets1, "card9");
        this.jPanel9.add((Component)this.recherchefddparforniseur11, "card11");
        this.jPanel9.add((Component)this.cessionsursalire21, "card4");
        this.jPanel9.add((Component)this.mainleveancien1, "card12");
        this.jPanel10.setLayout(null);
        this.jButton10.setIcon(new ImageIcon(this.getClass().getResource("/image/cession/cession2.png")));
        this.jButton10.setToolTipText("Cession Sur Salaire 1");
        this.jButton10.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton10ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton10);
        this.jButton10.setBounds(10, 60, 70, 50);
        this.jButton12.setIcon(new ImageIcon(this.getClass().getResource("/image/cession/3.png")));
        this.jButton12.setToolTipText("demande FDD");
        this.jButton12.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton12ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton12);
        this.jButton12.setBounds(10, 230, 70, 61);
        this.jButton13.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton13.setToolTipText("Quitter");
        this.jPanel10.add(this.jButton13);
        this.jButton13.setBounds(10, 530, 70, 57);
        this.jButton9.setIcon(new ImageIcon(this.getClass().getResource("/image/cession/cession1.png")));
        this.jButton9.setToolTipText("Cession sur salaire 2");
        this.jButton9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton9ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton9);
        this.jButton9.setBounds(10, 10, 70, 50);
        this.jButton11.setIcon(new ImageIcon(this.getClass().getResource("/image/cession/alertes-icone-3795-48.png")));
        this.jButton11.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton11ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton11);
        this.jButton11.setBounds(10, 290, 70, 57);
        this.jButton48.setFont(new Font("Tahoma", 1, 11));
        this.jButton48.setIcon(new ImageIcon(this.getClass().getResource("/prime/et.png")));
        this.jButton48.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton48ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton48);
        this.jButton48.setBounds(10, 350, 70, 60);
        this.jButton68.setIcon(new ImageIcon(this.getClass().getResource("/boncommande/hist.PNG")));
        this.jButton68.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton68ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton68);
        this.jButton68.setBounds(10, 170, 70, 60);
        this.jButton70.setText("sup cs-f");
        this.jButton70.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton70ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton70);
        this.jButton70.setBounds(10, 110, 70, 60);
        this.jButton75.setText("M-fdd");
        this.jButton75.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton75ActionPerformed(evt);
            }
        });
        this.jPanel10.add(this.jButton75);
        this.jButton75.setBounds(10, 420, 70, 50);
        this.jButton77.setText("405");
        this.jButton77.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton77ActionPerformed(evt);
            }
        });
       this.jPanel10.add(this.jButton77);
        this.jButton77.setBounds(10, 470, 70, 50);
        this.jLabel6.setFont(new Font("Tahoma", 1, 18));
        this.jLabel6.setForeground(new Color(153, 0, 51));
        this.jLabel6.setText("Mutuelle de la Sant\u00e9 : Gestion des Prets ");
        GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel10, -2, 92, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGap(148, 148, 148).addComponent(this.jLabel6, -2, 394, -2)).addGroup(jPanel8Layout.createSequentialGroup().addGap(6, 6, 6).addComponent(this.jPanel9, -2, 1019, -2))).addContainerGap()));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.jLabel6, -2, 25, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel9, -2, 565, -2)).addComponent(this.jPanel10, -2, 588, -2)).addContainerGap(-1, 32767)));
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel8, -1, 1199, 32767));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jPanel8, -1, -1, 32767).addContainerGap()));
        this.jToolBar1.add(this.jPanel3);
        this.jTabbedPane1.addTab("Pret", new ImageIcon(this.getClass().getResource("/image/mutuelle/especes-monnaie-sac-a-main-portefeuille-icone-6745-64.png")), this.jToolBar1);
        this.jToolBar3.setBackground(new Color(227, 226, 226));
        this.jToolBar3.setRollover(true);
        this.jPanel16.setLayout(new CardLayout());
        this.jPanel16.add((Component)this.primescolaire1, "card3");
        this.jPanel16.add((Component)this.primedenaissance1, "card2");
        this.jPanel16.add((Component)this.primedemariage1, "card4");
        this.jPanel16.add((Component)this.primesociale1, "card5");
        this.jPanel16.add((Component)this.primedehandicap\u00e91, "card6");
        this.jPanel16.add((Component)this.primededece1, "card7");
        this.jPanel16.add((Component)this.primedecirconcision1, "card8");
        this.jPanel16.add((Component)this.primederetraite1, "card9");
        this.jPanel16.add((Component)this.primeetatsante1, "card10");
        this.jPanel5.setLayout(null);
        this.primescolaire.setIcon(new ImageIcon(this.getClass().getResource("/prime/graduation-hat.png")));
        this.primescolaire.setToolTipText("Prime Scolaire");
        this.primescolaire.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.primescolaireActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.primescolaire);
        this.primescolaire.setBounds(10, 0, 70, 50);
        this.jButton50.setIcon(new ImageIcon(this.getClass().getResource("/prime/y.PNG")));
        this.jButton50.setToolTipText("Prime de naisance");
        this.jButton50.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton50ActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.jButton50);
        this.jButton50.setBounds(10, 50, 70, 60);
        this.jButton51.setIcon(new ImageIcon(this.getClass().getResource("/prime/m.png")));
        this.jButton51.setToolTipText("Prime de mariage");
        this.jButton51.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton51ActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.jButton51);
        this.jButton51.setBounds(10, 110, 70, 60);
        this.jButton52.setIcon(new ImageIcon(this.getClass().getResource("/prime/ok.PNG")));
        this.jButton52.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton52ActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.jButton52);
        this.jButton52.setBounds(10, 170, 70, 70);
        this.jButton53.setIcon(new ImageIcon(this.getClass().getResource("/prime/ght.PNG")));
        this.jButton53.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton53ActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.jButton53);
        this.jButton53.setBounds(10, 240, 70, 60);
        this.jButton54.setIcon(new ImageIcon(this.getClass().getResource("/prime/deces.PNG")));
        this.jButton54.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton54ActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.jButton54);
        this.jButton54.setBounds(10, 300, 70, 60);
        this.jButton55.setIcon(new ImageIcon(this.getClass().getResource("/prime/Social-Services.PNG")));
        this.jButton55.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton55ActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.jButton55);
        this.jButton55.setBounds(10, 360, 70, 60);
        this.jButton56.setIcon(new ImageIcon(this.getClass().getResource("/prime/r.png")));
        this.jButton56.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton56ActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.jButton56);
        this.jButton56.setBounds(10, 420, 70, 60);
        this.jButton57.setIcon(new ImageIcon(this.getClass().getResource("/prime/et.png")));
        this.jButton57.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton57ActionPerformed(evt);
            }
        });
        this.jPanel5.add(this.jButton57);
        this.jButton57.setBounds(10, 480, 70, 60);
        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.jPanel5, -2, 81, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel16, -2, 1077, -2).addContainerGap(-1, 32767)));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel5, -1, 608, 32767).addComponent(this.jPanel16, -2, 608, -2)).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jPanel6, -2, -1, -2).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel6, -1, -1, 32767));
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
                sante.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton15);
        this.jButton15.setBounds(10, 10, 64, 53);
        this.jButton16.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/uibb.PNG")));
        this.jButton16.setToolTipText("UIB");
        this.jButton16.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton16ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton16);
        this.jButton16.setBounds(10, 70, 64, 53);
        this.jButton17.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/bhh.PNG")));
        this.jButton17.setToolTipText("BH");
        this.jButton17.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton17ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton17);
        this.jButton17.setBounds(10, 130, 64, 53);
        this.jButton18.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/bnaa.jpg")));
        this.jButton18.setToolTipText("BNA");
        this.jButton18.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton18ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton18);
        this.jButton18.setBounds(10, 250, 64, 53);
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/atb.PNG")));
        this.jButton19.setToolTipText("ATB");
        this.jButton19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton19);
        this.jButton19.setBounds(10, 190, 64, 53);
        this.jButton21.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/stb-tunisie.jpg")));
        this.jButton21.setToolTipText("STB");
        this.jButton21.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton21ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton21);
        this.jButton21.setBounds(10, 310, 64, 53);
        this.jButton22.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/biatt.PNG")));
        this.jButton22.setToolTipText("BIAT");
        this.jButton22.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton22ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton22);
        this.jButton22.setBounds(10, 370, 64, 53);
        this.jButton26.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/especes.PNG")));
        this.jButton26.setToolTipText("Espèces");
        this.jButton26.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton26ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton26);
        this.jButton26.setBounds(10, 500, 64, 57);
        this.jButton31.setIcon(new ImageIcon(this.getClass().getResource("/image/gestion cheque/imprimante-icone-6110-48 (1).png")));
        this.jButton31.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton31ActionPerformed(evt);
            }
        });
        this.jPanel11.add(this.jButton31);
        this.jButton31.setBounds(10, 430, 70, 57);
        this.jPanel13.setBackground(new Color(0, 51, 204));
        this.jPanel13.setLayout(new CardLayout());
        this.btt1.setForeground(new Color(255, 0, 153));
        this.jPanel13.add((Component)this.btt1, "bts");
        this.jPanel13.add((Component)this.sTB1, "stbs");
        this.jPanel13.add((Component)this.atbb11, "atbs");
        this.jPanel13.add((Component)this.bh1, "bhs");
        this.jPanel13.add((Component)this.bna1, "bnas");
        this.jPanel13.add((Component)this.uibb1, "uibs");
        this.jPanel13.add((Component)this.montantvirementsante2, "montantvirment");
        this.jPanel13.add((Component)this.paiementespece1, "pai");
        this.jLabel5.setFont(new Font("Tahoma", 1, 18));
        this.jLabel5.setForeground(new Color(153, 0, 51));
        this.jLabel5.setText("Mutuelle de la Sant\u00e9 :Gestion des Virments ");
        GroupLayout jPanel12Layout = new GroupLayout(this.jPanel12);
        this.jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addGap(232, 232, 232).addComponent(this.jLabel5, -2, 401, -2)).addGroup(jPanel12Layout.createSequentialGroup().addGap(164, 164, 164).addComponent(this.jPanel13, -2, 728, -2)).addComponent(this.jPanel11, -2, 82, -2)).addContainerGap(307, 32767)));
        jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addComponent(this.jLabel5, -2, 25, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel13, -2, 798, -2)).addGroup(jPanel12Layout.createSequentialGroup().addGap(28, 28, 28).addComponent(this.jPanel11, -2, 573, -2))).addContainerGap(-1, 32767)));
        this.jToolBar4.add(this.jPanel12);
        this.jTabbedPane1.addTab(" ", new ImageIcon(this.getClass().getResource("/image/mutuelle/virementbancaire.png")), this.jToolBar4);
        this.jToolBar5.setRollover(true);
        this.jPanel15.setLayout(new CardLayout());
        this.jPanel15.add((Component)this.ajoutercarnetdecheque1, "ajoutcarnetcheque");
        this.jPanel15.add((Component)this.cheque1, "cheque");
        this.jPanel15.add((Component)this.recherchecarnedecheque1, "recherchecarnet");
        this.jPanel15.add((Component)this.anullationcheque1, "anullercheque");
        this.jPanel15.add((Component)this.ajoutercanciencheque1, "anciencheque");
        this.jPanel15.add((Component)this.ajouteranciencarnetdecheque1, "ajoutcarnet");
        this.jPanel15.add((Component)this.ajoutercarnetchequeadherent1, "adh");
        this.jPanel23.setLayout(null);
        this.jButton20.setIcon(new ImageIcon(this.getClass().getResource("/image/add-user-icon (1).png")));
        this.jButton20.setToolTipText("Ajouter un nouveaux carnet de cheque");
        this.jButton20.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton20ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton20);
        this.jButton20.setBounds(10, 10, 81, 57);
        this.jButton27.setIcon(new ImageIcon(this.getClass().getResource("/image/Hd search.png")));
        this.jButton27.setToolTipText("Chercher des cheque");
        this.jButton27.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton27ActionPerformed(evt);
            }
            
        });
        this.jPanel23.add(this.jButton27);
        this.jButton27.setBounds(10, 140, 81, 57);
        this.jButton28.setIcon(new ImageIcon(this.getClass().getResource("/image/secretaire.png")));
        this.jButton28.setToolTipText("Quitter");
        this.jButton28.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton28ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton28);
        this.jButton28.setBounds(10, 450, 80, 50);
        this.jButton29.setIcon(new ImageIcon(this.getClass().getResource("/image/delete-user-icon.png")));
        this.jButton29.setToolTipText("Supprimer des cheques");
        this.jButton29.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton29ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton29);
        this.jButton29.setBounds(10, 200, 81, 57);
        this.jButton30.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton30.setToolTipText("Modifier un carnet de cheque");
        this.jButton30.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton30ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton30);
        this.jButton30.setBounds(10, 70, 81, 66);
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/gestion cheque/imprimante-icone-6110-48.png")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton2);
        this.jButton2.setBounds(10, 260, 80, 57);
        this.jButton32.setFont(new Font("Tahoma", 1, 12));
        this.jButton32.setIcon(new ImageIcon(this.getClass().getResource("/image/gestion cheque/modifier cheque.png")));
        this.jButton32.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton32ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton32);
        this.jButton32.setBounds(10, 380, 81, 60);
        this.jButton34.setIcon(new ImageIcon(this.getClass().getResource("/image/gestion cheque/modifier carnet.png")));
        this.jButton34.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton34ActionPerformed(evt);
            }
        });
        this.jPanel23.add(this.jButton34);
        this.jButton34.setBounds(10, 320, 80, 60);
        this.jLabel8.setFont(new Font("Tahoma", 1, 18));
        this.jLabel8.setForeground(new Color(153, 0, 51));
        this.jLabel8.setText("Mutuelle de la Sant\u00e9 :Gestion des cheques");
        GroupLayout jPanel14Layout = new GroupLayout(this.jPanel14);
        this.jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(this.jPanel23, -2, 99, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel14Layout.createSequentialGroup().addGap(143, 143, 143).addComponent(this.jLabel8, -2, 401, -2)).addGroup(jPanel14Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jPanel15, -2, 782, -2))).addContainerGap(286, 32767)));
        jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup().addGroup(jPanel14Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel23, -1, 579, 32767).addGroup(jPanel14Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.jLabel8, -2, 25, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel15, -1, 522, 32767))).addContainerGap()));
        this.jToolBar5.add(this.jPanel14);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/image/gestion cheque/gest.png")), this.jToolBar5);
        this.jToolBar7.setRollover(true);
        this.jButton7.setIcon(new ImageIcon(this.getClass().getResource("/image/add-user-icon (1).png")));
        this.jButton7.setToolTipText("Ajouter Fornisseure");
        this.jButton7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton7ActionPerformed(evt);
            }
        });
        this.jButton8.setIcon(new ImageIcon(this.getClass().getResource("/image/Hd search.png")));
        this.jButton8.setToolTipText("Chercher Fournisseurs");
        this.jButton8.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton8ActionPerformed(evt);
            }
        });
        this.jButton23.setIcon(new ImageIcon(this.getClass().getResource("/image/Exit-icon.png")));
        this.jButton23.setToolTipText("Quitter");
        this.jButton23.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton23ActionPerformed(evt);
            }
        });
        this.jButton24.setIcon(new ImageIcon(this.getClass().getResource("/image/delete-user-icon.png")));
        this.jButton24.setToolTipText("Supprimer Fournisseurs");
        this.jButton24.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton24ActionPerformed(evt);
            }
        });
        this.jButton25.setIcon(new ImageIcon(this.getClass().getResource("/image/Edit.png")));
        this.jButton25.setToolTipText("Modifier Fournisseurs");
        this.jButton25.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton25ActionPerformed(evt);
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
        this.jLabel9.setFont(new Font("Tahoma", 1, 18));
        this.jLabel9.setForeground(new Color(153, 0, 51));
        this.jLabel9.setText("Mutuelle de la Sant\u00e9 :Gestion des Fournisseurs");
        GroupLayout jPanel18Layout = new GroupLayout(this.jPanel18);
        this.jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel19, -2, -1, -2).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jPanel21, -2, 738, -2)).addGroup(jPanel18Layout.createSequentialGroup().addGap(145, 145, 145).addComponent(this.jLabel9, -2, 441, -2))).addContainerGap(322, 32767)));
        jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addContainerGap().addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addComponent(this.jLabel9, -2, 25, -2).addGap(28, 28, 28).addComponent(this.jPanel21, -2, -1, -2)).addComponent(this.jPanel19, -2, -1, -2)).addContainerGap(40, 32767)));
        this.jToolBar7.add(this.jPanel18);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/image/mutuelle/fffff.png")), this.jToolBar7);
        this.jToolBar6.setRollover(true);
        this.jPanel17.setLayout(new CardLayout());
        this.jPanel17.add((Component)this.cloturedemois1, "card5");
        this.jPanel17.add((Component)this.mois1, "card4");
        this.jPanel17.add((Component)this.moisfinnn1, "card5");
        this.jPanel17.add((Component)this.boderoparmois1, "card6");
        this.jButton36.setIcon(new ImageIcon(this.getClass().getResource("/image/cloture/payment.jpg")));
        this.jButton36.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton36ActionPerformed(evt);
            }
        });
        this.jButton39.setFont(new Font("Tahoma", 1, 11));
        this.jButton39.setText("Bordereau");
        this.jButton39.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton39ActionPerformed(evt);
            }
        });
        this.jButton37.setText("jButton37");
        this.jButton37.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton37ActionPerformed(evt);
            }
        });
        this.jButton38.setText("jButton38");
        this.jButton38.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton38ActionPerformed(evt);
            }
        });
        GroupLayout jPanel20Layout = new GroupLayout(this.jPanel20);
        this.jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel20Layout.createSequentialGroup().addContainerGap().addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel20Layout.createSequentialGroup().addComponent(this.jButton36, -2, 73, -2).addContainerGap(28, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup().addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton37).addComponent(this.jButton39, 0, 0, 32767)).addGap(22, 22, 22)).addGroup(jPanel20Layout.createSequentialGroup().addComponent(this.jButton38).addContainerGap(22, 32767)))));
        jPanel20Layout.setVerticalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel20Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton36).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton39, -2, 48, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton37, -2, 51, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton38, -2, 40, -2).addContainerGap(389, 32767)));
        GroupLayout jPanel24Layout = new GroupLayout(this.jPanel24);
        this.jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addComponent(this.jPanel20, -2, -1, -2).addContainerGap(1088, 32767)).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addGap(107, 107, 107).addComponent(this.jPanel17, -1, 1082, 32767).addContainerGap())));
        jPanel24Layout.setVerticalGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addComponent(this.jPanel20, -2, -1, -2).addContainerGap(-1, 32767)).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel17, -2, 593, -2).addContainerGap(20, 32767))));
        this.jToolBar6.add(this.jPanel24);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/image/gestion cheque/JKHGJ.png")), this.jToolBar6);
        this.jToolBar8.setRollover(true);
        this.jPanel26.setLayout(null);
        this.jButton40.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/boutique-en-ligne.png")));
        this.jButton40.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton40ActionPerformed(evt);
            }
        });
        this.jPanel26.add(this.jButton40);
        this.jButton40.setBounds(0, 10, 70, 50);
        this.jButton41.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/modifier-rechercher-remplacer-icone-7609-48.png")));
        this.jButton41.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton41ActionPerformed(evt);
            }
        });
        this.jPanel26.add(this.jButton41);
        this.jButton41.setBounds(0, 70, 70, 60);
        this.jButton42.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/boncommande.PNG")));
        this.jButton42.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton42ActionPerformed(evt);
            }
        });
        this.jPanel26.add(this.jButton42);
        this.jButton42.setBounds(0, 140, 70, 50);
        this.jButton43.setIcon(new ImageIcon(this.getClass().getResource("/image/pharmacie/51460.png")));
        this.jButton43.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton43ActionPerformed(evt);
            }
        });
        this.jPanel26.add(this.jButton43);
        this.jButton43.setBounds(0, 200, 70, 50);
        this.jButton44.setIcon(new ImageIcon(this.getClass().getResource("/prime/et.png")));
        this.jButton44.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton44ActionPerformed(evt);
            }
        });
        this.jPanel26.add(this.jButton44);
        this.jButton44.setBounds(0, 260, 70, 60);
        this.jButton45.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/rec herchebc.png")));
        this.jButton45.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton45ActionPerformed(evt);
            }
        });
        this.jPanel26.add(this.jButton45);
        this.jButton45.setBounds(0, 330, 70, 60);
        this.jButton64.setIcon(new ImageIcon(this.getClass().getResource("/boncommande/delete.PNG")));
        this.jButton64.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton64ActionPerformed(evt);
            }
        });
        this.jPanel26.add(this.jButton64);
        this.jButton64.setBounds(0, 400, 70, 60);
        this.jButton65.setIcon(new ImageIcon(this.getClass().getResource("/boncommande/hist.PNG")));
        this.jButton65.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton65ActionPerformed(evt);
            }
        });
        this.jPanel26.add(this.jButton65);
        this.jButton65.setBounds(0, 470, 70, 60);
        this.jPanel27.setLayout(new CardLayout());
        this.jPanel27.add((Component)this.recherchebcparforniseur1, "recherchebc");
        this.jPanel27.add((Component)this.bondecommande1, "card4");
        this.jPanel27.add((Component)this.bondecommandepharmacie1, "card5");
        this.jPanel27.add((Component)this.eTATbc1, "etatbc");
        this.jPanel27.add((Component)this.etatbcparfornissseur1, "card7");
        this.jPanel27.add((Component)this.suppbc1, "card8");
        this.jPanel27.add((Component)this.suppebchistorique1, "card9");
        this.jPanel27.add((Component)this.ancienBC1, "ajoubc");
        GroupLayout jPanel25Layout = new GroupLayout(this.jPanel25);
        this.jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel25Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel26, -2, 72, -2).addGap(18, 18, 18).addComponent(this.jPanel27, -1, 1099, 32767)));
        jPanel25Layout.setVerticalGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel25Layout.createSequentialGroup().addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel27, -2, 591, -2).addGroup(jPanel25Layout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.jPanel26, -2, 561, -2))).addContainerGap(-1, 32767)));
        this.jToolBar8.add(this.jPanel25);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/image/bond de commande/bon_de_commande.gif")), this.jToolBar8);
        this.jToolBar11.setRollover(true);
        this.jPanel35.setLayout(null);
        this.jButton62.setIcon(new ImageIcon(this.getClass().getResource("/orange/s.PNG")));
        this.jButton62.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton62ActionPerformed(evt);
            }
        });
        this.jPanel35.add(this.jButton62);
        this.jButton62.setBounds(2, 11, 70, 59);
        this.jButton63.setIcon(new ImageIcon(this.getClass().getResource("/orange/demande.PNG")));
        this.jButton63.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton63ActionPerformed(evt);
            }
        });
        this.jPanel35.add(this.jButton63);
        this.jButton63.setBounds(0, 80, 70, 60);
        this.jButton66.setIcon(new ImageIcon(this.getClass().getResource("/orange/unnamed.png")));
        this.jButton66.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton66ActionPerformed(evt);
            }
        });
        this.jPanel35.add(this.jButton66);
        this.jButton66.setBounds(0, 150, 70, 60);
        this.jButton67.setIcon(new ImageIcon(this.getClass().getResource("/prime/et.png")));
        this.jButton67.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton67ActionPerformed(evt);
            }
        });
        this.jPanel35.add(this.jButton67);
        this.jButton67.setBounds(0, 220, 70, 60);
        this.jButton69.setIcon(new ImageIcon(this.getClass().getResource("/orange/supprimer-icone-5656-128.png")));
        this.jButton69.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton69ActionPerformed(evt);
            }
        });
        this.jPanel35.add(this.jButton69);
        this.jButton69.setBounds(10, 360, 60, 50);
        this.jButton33.setText("jButton33");
        this.jButton33.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton33ActionPerformed(evt);
            }
        });
        this.jPanel35.add(this.jButton33);
        this.jButton33.setBounds(0, 290, 60, 50);
        this.jPanel36.setLayout(new CardLayout());
        this.jPanel36.add((Component)this.orangeservice1, "card2");
        this.jPanel36.add((Component)this.orangedemande1, "card3");
        this.jPanel36.add((Component)this.orangedemandeetat1, "card4");
        this.jPanel36.add((Component)this.orangeetatdepaiment1, "card5");
        this.jPanel36.add((Component)this.orangesuppressiondemande1, "card6");
        this.jPanel36.add((Component)this.orangeetatdedeuxans1, "card7");
        GroupLayout jPanel34Layout = new GroupLayout(this.jPanel34);
        this.jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(jPanel34Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel34Layout.createSequentialGroup().addComponent(this.jPanel35, -2, 70, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel36, -1, 1113, 32767).addContainerGap()));
        jPanel34Layout.setVerticalGroup(jPanel34Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup().addGroup(jPanel34Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel36, -1, 579, 32767).addComponent(this.jPanel35, -1, 579, 32767)).addContainerGap()));
        this.jToolBar11.add(this.jPanel34);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/orange/Capture.PNG")), this.jToolBar11);
        this.jToolBar9.setRollover(true);
        this.jPanel29.setLayout(new CardLayout());
        this.jPanel29.add((Component)this.r\u00e9captulationdejours1, "card2");
        this.jPanel29.add((Component)this.caissemasp1, "card5");
        this.jPanel29.add((Component)this.caisseprimescolaire1, "card6");
        this.jPanel29.add((Component)this.caissepretetatdecheque1, "card7");
        this.jPanel29.add((Component)this.caissefdd1, "card7");
        this.jPanel29.add((Component)this.caisseprimemasp1, "card8");
        this.jPanel29.add((Component)this.debitCredit, "card9");
        this.jButton49.setFont(new Font("Tahoma", 1, 12));
        this.jButton49.setForeground(new Color(0, 0, 204));
        this.jButton49.setText("Caisse FDD");
        this.jButton49.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton49ActionPerformed(evt);
            }
        });
        this.jButton58.setFont(new Font("Tahoma", 1, 12));
        this.jButton58.setForeground(new Color(0, 0, 204));
        this.jButton58.setText("Caisse MASP");
        this.jButton58.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton58ActionPerformed(evt);
            }
        });
        this.jButton47.setFont(new Font("Tahoma", 1, 12));
        this.jButton47.setForeground(new Color(0, 0, 204));
        this.jButton47.setText("Caisse Main Lev\u00e9e");
        this.jButton47.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton47ActionPerformed(evt);
            }
        });
        this.jButton46.setFont(new Font("Tahoma", 1, 12));
        this.jButton46.setForeground(new Color(0, 0, 204));
        this.jButton46.setText("R\u00e9captulation de jour");
        this.jButton46.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton46ActionPerformed(evt);
            }
        });
        this.jButton71.setFont(new Font("Tahoma", 1, 12));
        this.jButton71.setForeground(new Color(0, 0, 204));
        this.jButton71.setText("Caisse Prime scolaire");
        this.jButton71.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton71ActionPerformed(evt);
            }
        });
        this.jButton6.setFont(new Font("Tahoma", 1, 12));
        this.jButton6.setForeground(new Color(0, 0, 153));
        this.jButton6.setText("Débit/Crédit");
        
        
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton6ActionPerformed(evt);
            }
        });
        
        this.jButton76.setFont(new Font("Tahoma", 1, 12));
        this.jButton76.setForeground(new Color(0, 0, 204));
        this.jButton76.setText("Caisse Prime");
        this.jButton76.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton76ActionPerformed(evt);
            }
        });
        GroupLayout jPanel30Layout = new GroupLayout(this.jPanel30);
        this.jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(jPanel30Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel30Layout.createSequentialGroup().addComponent(this.jButton46).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton49).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton47).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton58).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton76).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton71).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton6, -2, 180, -2).addContainerGap(124, 32767)));
        jPanel30Layout.setVerticalGroup(jPanel30Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton46, -1, -1, 32767).addComponent(this.jButton49, -1, -1, 32767).addComponent(this.jButton47).addComponent(this.jButton58, -1, -1, 32767).addComponent(this.jButton76).addComponent(this.jButton71, -1, -1, 32767).addComponent(this.jButton6));
        GroupLayout jPanel28Layout = new GroupLayout(this.jPanel28);
        this.jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(jPanel28Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel28Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel29, -2, 1096, -2).addContainerGap(93, 32767)).addGroup(jPanel28Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel28Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel30, -2, -1, -2).addContainerGap(141, 32767))));
        jPanel28Layout.setVerticalGroup(jPanel28Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel28Layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jPanel29, -2, 591, -2).addContainerGap(-1, 32767)).addGroup(jPanel28Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel28Layout.createSequentialGroup().addComponent(this.jPanel30, -2, -1, -2).addContainerGap(591, 32767))));
        this.jToolBar9.add(this.jPanel28);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/caissemasp/ccccc.PNG")), this.jToolBar9);
        this.jToolBar10.setRollover(true);
        this.jPanel31.setLayout(new CardLayout());
        this.jPanel31.add((Component)this.consultationpaymentadh1, "card2");
        this.jPanel31.add((Component)this.cloturedemoisf1, "card3");
        this.jPanel31.add((Component)this.consultationfr1, "card4");
        this.jPanel31.add((Component)this.cloturedemoisdetouslesfor1, "card5");
        this.jPanel31.add((Component)this.consultationpaymentadhmodi1, "card6");
        this.jPanel32.setLayout(null);
        this.jButton59.setIcon(new ImageIcon(this.getClass().getResource("/consultation paiment/pyment adh.PNG")));
        this.jButton59.setToolTipText("Consultation Paiement de l'adherant");
        this.jButton59.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton59ActionPerformed(evt);
            }
        });
        this.jPanel32.add(this.jButton59);
        this.jButton59.setBounds(10, 40, 70, 61);
        this.jButton60.setIcon(new ImageIcon(this.getClass().getResource("/consultation paiment/f.PNG")));
        this.jButton60.setToolTipText("Consultation des bon de comande par fornisseur");
        this.jButton60.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton60ActionPerformed(evt);
            }
        });
        this.jPanel32.add(this.jButton60);
        this.jButton60.setBounds(10, 270, 70, 63);
        this.jButton61.setIcon(new ImageIcon(this.getClass().getResource("/consultation paiment/cloyure.PNG")));
        this.jButton61.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton61ActionPerformed(evt);
            }
        });
        this.jPanel32.add(this.jButton61);
        this.jButton61.setBounds(10, 110, 70, 63);
        this.jButton35.setIcon(new ImageIcon(this.getClass().getResource("/consultation paiment/fr.PNG")));
        this.jButton35.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton35ActionPerformed(evt);
            }
        });
        this.jPanel32.add(this.jButton35);
        this.jButton35.setBounds(10, 340, 70, 61);
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setForeground(new Color(153, 0, 0));
        this.jLabel1.setText("Adherant");
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setForeground(new Color(153, 0, 0));
        this.jLabel2.setText("Fornisseur");
        GroupLayout jPanel33Layout = new GroupLayout(this.jPanel33);
        this.jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(jPanel33Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel33Layout.createSequentialGroup().addContainerGap().addGroup(jPanel33Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jSeparator1, -2, 85, -2).addComponent(this.jLabel1).addComponent(this.jLabel2)).addContainerGap(1104, 32767)).addGroup(jPanel33Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel33Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel32, -2, 90, -2).addContainerGap(1099, 32767))).addGroup(jPanel33Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup().addContainerGap(231, 32767).addComponent(this.jPanel31, -2, 958, -2).addContainerGap())));
        jPanel33Layout.setVerticalGroup(jPanel33Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel33Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.jLabel1).addGap(180, 180, 180).addComponent(this.jSeparator1, -2, 8, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel2).addContainerGap(398, 32767)).addGroup(jPanel33Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel33Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel32, -2, 635, -2).addContainerGap(-1, 32767))).addGroup(jPanel33Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel33Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jPanel31, -2, 635, -2).addContainerGap(-1, 32767))));
        this.jToolBar10.add(this.jPanel33);
        this.jTabbedPane1.addTab("", new ImageIcon(this.getClass().getResource("/consultation paiment/Capture.PNG")), this.jToolBar10);
        this.jToolBar12.setRollover(true);
        this.jPanel39.setLayout(null);
        this.jButton72.setIcon(new ImageIcon(this.getClass().getResource("/image/add-user-icon (1).png")));
        this.jButton72.setToolTipText("Ajouter Fornisseure");
        this.jButton72.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton72ActionPerformed(evt);
            }
        });
        this.jPanel39.add(this.jButton72);
        this.jButton72.setBounds(10, 10, 70, 57);
        this.jButton73.setIcon(new ImageIcon(this.getClass().getResource("/image/Hd search.png")));
        this.jButton73.setToolTipText("Chercher Fournisseurs");
        this.jButton73.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton73ActionPerformed(evt);
            }
        });
        this.jPanel39.add(this.jButton73);
        this.jButton73.setBounds(10, 70, 70, 57);
        this.jButton74.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/boncommande.PNG")));
        this.jButton74.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                sante.this.jButton74ActionPerformed(evt);
            }
        });
        this.jPanel39.add(this.jButton74);
        this.jButton74.setBounds(10, 130, 70, 50);
        this.jPanel40.setLayout(new CardLayout());
        this.jPanel40.add((Component)this.fornisseurinternerecherche1, "card3");
        this.jPanel40.add((Component)this.fourniseueinterneajoutservice1, "card4");
        this.jPanel40.add((Component)this.ajoutfournisseurInterne1, "card2");
        GroupLayout jPanel38Layout = new GroupLayout(this.jPanel38);
        this.jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(jPanel38Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel38Layout.createSequentialGroup().addComponent(this.jPanel39, -2, 83, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel40, -1, 1090, 32767).addContainerGap()));
        jPanel38Layout.setVerticalGroup(jPanel38Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel39, -1, 579, 32767).addGroup(jPanel38Layout.createSequentialGroup().addComponent(this.jPanel40, -1, 568, 32767).addGap(11, 11, 11)));
        GroupLayout jPanel37Layout = new GroupLayout(this.jPanel37);
        this.jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(jPanel37Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel37Layout.createSequentialGroup().addComponent(this.jPanel38, -1, -1, 32767).addContainerGap()));
        jPanel37Layout.setVerticalGroup(jPanel37Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel37Layout.createSequentialGroup().addComponent(this.jPanel38, -1, -1, 32767).addContainerGap()));
        this.jToolBar12.add(this.jPanel37);
        this.jTabbedPane1.addTab("F.I", this.jToolBar12);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane1, -1, 1217, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jTabbedPane1, -2, 680, 32767).addContainerGap()));
        this.setBounds(0, 0, 1206, 722);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Locale.setDefault(new Locale("ar", ""));
        JFrame secretaire = new JFrame("ff");
        CardLayout card = (CardLayout)this.jPanel4.getLayout();
        card.show(this.jPanel4, "ajou");
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel4.getLayout();
        card.show(this.jPanel4, "rech");
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
        card.show(this.jPanel4, "mod");
    }

    private void jButton10ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "card2");
    }

    private void jButton12ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "fdd");
    }

    private void jButton9ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "card4");
    }

    private void jButton11ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "traite");
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "bts");
    }

    private void jButton16ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "uibs");
    }

    private void jButton17ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "bhs");
    }

    private void jButton18ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "bnas");
    }

    private void jButton19ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "atbs");
    }

    private void jButton21ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "stbs");
    }

    private void jButton22ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "amal");
    }

    private void jButton26ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
       // int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
      //  if (option == 0) {
          //  this.setVisible(false);
        //}
           CardLayout card = (CardLayout)this.jPanel13.getLayout();
           card.show(this.jPanel13, "pai");
        
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

    private void jButton20ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "ajoutcarnetcheque");
    }

    private void jButton27ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "recherchecarnet");
    }

    private void jButton28ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "adh");
    }

    private void jButton29ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "anullercheque");
    }

    private void jButton30ActionPerformed(ActionEvent evt) {
    }

    private void jButton31ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel13.getLayout();
        card.show(this.jPanel13, "montantvirment");
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "cheque");
    }

    private void jButton32ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "anciencheque");
    }

    private void jButton34ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel15.getLayout();
        card.show(this.jPanel15, "ajoutcarnet");
    }

    private void jButton36ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel17.getLayout();
        card.show(this.jPanel17, "reches");
    }

    private void jButton37ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel17.getLayout();
        card.show(this.jPanel17, "card4");
    }

    private void jButton38ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel17.getLayout();
        card.show(this.jPanel17, "card5");
    }

    private void jButton39ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel17.getLayout();
        card.show(this.jPanel17, "card6");
    }

    private void jButton40ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel27.getLayout();
        card.show(this.jPanel27, "ajoubc");
    }

    private void jButton41ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel27.getLayout();
        card.show(this.jPanel27, "recherchebc");
    }

    private void jButton42ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel27.getLayout();
        card.show(this.jPanel27, "card4");
    }

    private void jButton43ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel27.getLayout();
        card.show(this.jPanel27, "card5");
    }

    private void jButton44ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel27.getLayout();
        card.show(this.jPanel27, "etatbc");
    }

    private void jButton45ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel27.getLayout();
        card.show(this.jPanel27, "card7");
    }

    private void jButton46ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel29.getLayout();
        card.show(this.jPanel29, "card2");
    }

    private void jButton47ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel29.getLayout();
        card.show(this.jPanel29, "card3");
    }

    private void jButton48ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "card9");
    }

    private void jButton49ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel29.getLayout();
        card.show(this.jPanel29, "card7");
    }

    private void jButton50ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card2");
    }

    private void primescolaireActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card3");
    }

    private void jButton51ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card4");
    }

    private void jButton53ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card8");
    }

    private void jButton55ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card5");
    }

    private void jButton52ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card6");
    }

    private void jButton54ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card7");
    }

    private void jButton56ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card9");
    }

    private void jButton57ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card10");
    }

    private void jButton58ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel29.getLayout();
        card.show(this.jPanel29, "card5");
    }

    private void jButton61ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel31.getLayout();
        card.show(this.jPanel31, "card3");
    }

    private void jButton60ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel31.getLayout();
        card.show(this.jPanel31, "card4");
    }

    private void jButton59ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel31.getLayout();
        card.show(this.jPanel31, "card2");
    }

    private void jButton35ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel31.getLayout();
        card.show(this.jPanel31, "card5");
    }

    private void jButton64ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel27.getLayout();
        card.show(this.jPanel27, "card8");
    }

    private void jButton62ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel36.getLayout();
        card.show(this.jPanel36, "card2");
    }

    private void jButton63ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel36.getLayout();
        card.show(this.jPanel36, "card3");
    }

    private void jButton65ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel27.getLayout();
        card.show(this.jPanel27, "card9");
    }

    private void jButton66ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel36.getLayout();
        card.show(this.jPanel36, "card4");
    }

    private void jButton67ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel36.getLayout();
        card.show(this.jPanel36, "card5");
    }

    private void jButton69ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel36.getLayout();
        card.show(this.jPanel36, "card6");
    }

    private void jButton68ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "card11");
    }

    private void jButton70ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "card10");
    }

    private void jButton71ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel29.getLayout();
        card.show(this.jPanel29, "card6");
    }

    private void jButton33ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel36.getLayout();
        card.show(this.jPanel36, "card7");
    }

    private void jButton72ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel40.getLayout();
        card.show(this.jPanel40, "card2");
    }

    private void jButton73ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel40.getLayout();
        card.show(this.jPanel40, "card3");
    }

    private void jButton74ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel40.getLayout();
        card.show(this.jPanel40, "card4");
    }

    private void jButton75ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "card11");
    }

    private void jButton76ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel29.getLayout();
        card.show(this.jPanel29, "card8");
    }

    private void jButton77ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel9.getLayout();
        card.show(this.jPanel9, "card12");
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
            Logger.getLogger(sante.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(sante.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(sante.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(sante.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){
            Date actuellEe = new Date();
            DateFormat dateFormatt = new SimpleDateFormat("dd-MM-yyyy");
            String datdd = this.dateFormatt.format(this.actuellEe);
            String di = this.datdd.substring(3, this.datdd.length() - 5);
            int b = Integer.parseInt(this.di);

            @Override
            public void run() {
                System.out.println("b=" + this.b);
            }
        });
        new sante().setVisible(true);
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel29.getLayout();
        card.show(this.jPanel29, "card9");    }

}

