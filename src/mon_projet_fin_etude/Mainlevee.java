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
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import mon_projet_fin_etude.Impression1;

public class Mainlevee
extends JPanel {
    String nomadh = "";
    String ch = "";
    String mont = "";
    String parmois = "";
    int k = 1;
    private JLabel Adresse;
    private JLabel cin;
    private JLabel dateatt;
    private JLabel dateimpression;
    private JLabel etab;
    private JLabel globale1;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel100;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel33;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel45;
    private JLabel jLabel46;
    private JLabel jLabel58;
    private JLabel jLabel6;
    private JLabel jLabel62;
    private JLabel jLabel63;
    private JLabel jLabel71;
    private JLabel jLabel99;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JToggleButton jToggleButton1;
    private JPanel mainleveeee;
    private JLabel matricule;
    private JTextField mecano;
    private JLabel mecat;
    private JLabel montantglo;
    private JLabel nometprenom;
    private JLabel numr;
    private JLabel profession;
    private JLabel registre;

    public Mainlevee() {
        this.initComponents();
    }

    private void initComponents() {
        this.jToggleButton1 = new JToggleButton();
        this.jPanel2 = new JPanel();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.mecano = new JTextField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.mainleveeee = new JPanel();
        this.jLabel6 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel37 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jLabel40 = new JLabel();
        this.jLabel41 = new JLabel();
        this.nometprenom = new JLabel();
        this.matricule = new JLabel();
        this.jLabel58 = new JLabel();
        this.jLabel62 = new JLabel();
        this.jLabel71 = new JLabel();
        this.jLabel99 = new JLabel();
        this.jLabel100 = new JLabel();
        this.dateatt = new JLabel();
        this.jLabel42 = new JLabel();
        this.mecat = new JLabel();
        this.globale1 = new JLabel();
        this.cin = new JLabel();
        this.Adresse = new JLabel();
        this.profession = new JLabel();
        this.numr = new JLabel();
        this.jLabel43 = new JLabel();
        this.dateimpression = new JLabel();
        this.jLabel44 = new JLabel();
        this.montantglo = new JLabel();
        this.jLabel45 = new JLabel();
        this.registre = new JLabel();
        this.jLabel63 = new JLabel();
        this.jLabel46 = new JLabel();
        this.etab = new JLabel();
        this.jToggleButton1.setText("jToggleButton1");
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 30));
        this.jLabel1.setForeground(new Color(51, 51, 255));
        this.jLabel1.setText("Main Lev\u00e9e");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(140, 0, 180, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Mecano :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(30, 40, 70, 20);
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Mainlevee.this.mecanoActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(110, 40, 170, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Mainlevee.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(290, 40, 110, 30);
        this.jButton2.setText("Ajouter une ancienne cession");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Mainlevee.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(350, 80, 190, 23);
        this.mainleveeee.setBackground(new Color(255, 255, 255));
        this.mainleveeee.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.mainleveeee.setLayout(null);
        this.jLabel6.setFont(new Font("Tahoma", 1, 20));
        this.jLabel6.setText("MAIN  LEVEE");
        this.jLabel6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.mainleveeee.add(this.jLabel6);
        this.jLabel6.setBounds(200, 120, 140, 30);
        this.jLabel15.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/ENTET.PNG")));
        this.mainleveeee.add(this.jLabel15);
        this.jLabel15.setBounds(20, 10, 510, 52);
        this.jLabel33.setFont(new Font("Tahoma", 0, 14));
        this.jLabel33.setText("La pr\u00e9sidente du conseil d'administration de la Mutuelle de la Sant\u00e9 \"LA SOLIDARITE\"");
        this.mainleveeee.add(this.jLabel33);
        this.jLabel33.setBounds(10, 220, 530, 30);
        this.jLabel35.setFont(new Font("Tahoma", 0, 14));
        this.jLabel35.setText("d\u00e9clare certifie avoir re\u00e7ue toutes les garanties de la Main Lev\u00e9e");
        this.mainleveeee.add(this.jLabel35);
        this.jLabel35.setBounds(10, 260, 410, 20);
        this.jLabel36.setFont(new Font("Tahoma", 0, 14));
        this.jLabel36.setText("Demeurant \u00e0 :");
        this.mainleveeee.add(this.jLabel36);
        this.jLabel36.setBounds(10, 350, 100, 20);
        this.jLabel37.setFont(new Font("Tahoma", 0, 14));
        this.jLabel37.setText("A Monsieur / Madame:");
        this.mainleveeee.add(this.jLabel37);
        this.jLabel37.setBounds(10, 290, 140, 17);
        this.jLabel38.setFont(new Font("Tahoma", 0, 14));
        this.jLabel38.setText("Titulaire de carte d'identit\u00e9 n\u00b0:");
        this.mainleveeee.add(this.jLabel38);
        this.jLabel38.setBounds(10, 310, 190, 20);
        this.jLabel39.setFont(new Font("Tahoma", 0, 14));
        this.jLabel39.setText("Mecano :");
        this.mainleveeee.add(this.jLabel39);
        this.jLabel39.setBounds(370, 310, 60, 30);
        this.jLabel40.setFont(new Font("Tahoma", 0, 14));
        this.jLabel40.setText("Registre n\u00b0 :");
        this.mainleveeee.add(this.jLabel40);
        this.jLabel40.setBounds(330, 440, 80, 20);
        this.jLabel41.setFont(new Font("Tahoma", 0, 14));
        this.jLabel41.setText("Montant :");
        this.mainleveeee.add(this.jLabel41);
        this.jLabel41.setBounds(10, 390, 70, 20);
        this.nometprenom.setFont(new Font("Tahoma", 1, 14));
        this.nometprenom.setText("...............................................................");
        this.mainleveeee.add(this.nometprenom);
        this.nometprenom.setBounds(150, 290, 260, 20);
        this.matricule.setFont(new Font("Tahoma", 1, 14));
        this.matricule.setText("..............................");
        this.mainleveeee.add(this.matricule);
        this.matricule.setBounds(80, 330, 170, 20);
        this.jLabel58.setFont(new Font("Tahoma", 0, 14));
        this.jLabel58.setText("Dr / Le Service pr\u00e9t");
        this.mainleveeee.add(this.jLabel58);
        this.jLabel58.setBounds(350, 540, 140, 20);
        this.jLabel62.setFont(new Font("Tahoma", 0, 14));
        this.jLabel62.setText("et d'informer les services comp\u00e9tents du Minist\u00e9re de la Sant\u00e9 pour ex\u00e9cution .");
        this.mainleveeee.add(this.jLabel62);
        this.jLabel62.setBounds(10, 480, 530, 20);
        this.jLabel71.setFont(new Font("Tahoma", 0, 14));
        this.jLabel71.setText("Matricule :");
        this.mainleveeee.add(this.jLabel71);
        this.jLabel71.setBounds(10, 330, 70, 20);
        this.jLabel99.setFont(new Font("Tahoma", 0, 14));
        this.jLabel99.setText("Profession :");
        this.mainleveeee.add(this.jLabel99);
        this.jLabel99.setBounds(320, 370, 71, 20);
        this.jLabel100.setFont(new Font("Tahoma", 0, 14));
        this.jLabel100.setText("dont le si\u00e9ge social est \u00e0 TUNIS 7, Rue de Pologne -Bab Sadoun Tunis 1005 ");
        this.mainleveeee.add(this.jLabel100);
        this.jLabel100.setBounds(10, 240, 510, 30);
        this.dateatt.setFont(new Font("Tahoma", 1, 12));
        this.dateatt.setText("..................");
        this.mainleveeee.add(this.dateatt);
        this.dateatt.setBounds(130, 70, 140, 15);
        this.jLabel42.setFont(new Font("Tahoma", 0, 14));
        this.jLabel42.setText("Mahdia le :");
        this.mainleveeee.add(this.jLabel42);
        this.jLabel42.setBounds(50, 60, 70, 30);
        this.mecat.setFont(new Font("Tahoma", 1, 14));
        this.mecat.setText("............");
        this.mainleveeee.add(this.mecat);
        this.mecat.setBounds(430, 310, 90, 30);
        this.globale1.setFont(new Font("Tahoma", 1, 14));
        this.globale1.setText("............");
        this.mainleveeee.add(this.globale1);
        this.globale1.setBounds(80, 390, 450, 20);
        this.cin.setFont(new Font("Tahoma", 1, 14));
        this.cin.setText("............");
        this.mainleveeee.add(this.cin);
        this.cin.setBounds(200, 310, 170, 17);
        this.Adresse.setFont(new Font("Tahoma", 1, 14));
        this.Adresse.setText("......................");
        this.mainleveeee.add(this.Adresse);
        this.Adresse.setBounds(110, 350, 420, 20);
        this.profession.setFont(new Font("Tahoma", 1, 14));
        this.profession.setText("...............................................");
        this.mainleveeee.add(this.profession);
        this.profession.setBounds(400, 370, 140, 17);
        this.numr.setFont(new Font("Tahoma", 1, 14));
        this.numr.setText("............");
        this.mainleveeee.add(this.numr);
        this.numr.setBounds(410, 440, 120, 20);
        this.jLabel43.setFont(new Font("Tahoma", 0, 14));
        this.jLabel43.setText("Pour solder la cession sur salaire ");
        this.mainleveeee.add(this.jLabel43);
        this.jLabel43.setBounds(10, 410, 197, 20);
        this.dateimpression.setFont(new Font("Tahoma", 1, 14));
        this.dateimpression.setText("............");
        this.mainleveeee.add(this.dateimpression);
        this.dateimpression.setBounds(130, 440, 190, 20);
        this.jLabel44.setFont(new Font("Tahoma", 0, 14));
        this.jLabel44.setText("Etablisement :");
        this.mainleveeee.add(this.jLabel44);
        this.jLabel44.setBounds(10, 370, 90, 20);
        this.montantglo.setFont(new Font("Tahoma", 1, 14));
        this.montantglo.setText("............");
        this.mainleveeee.add(this.montantglo);
        this.montantglo.setBounds(210, 410, 110, 20);
        this.jLabel45.setFont(new Font("Tahoma", 0, 14));
        this.jLabel45.setText("qui \u00e9t\u00e9 effectu\u00e9e le");
        this.mainleveeee.add(this.jLabel45);
        this.jLabel45.setBounds(10, 440, 120, 20);
        this.registre.setFont(new Font("Tahoma", 1, 14));
        this.registre.setText("......................");
        this.mainleveeee.add(this.registre);
        this.registre.setBounds(410, 410, 120, 20);
        this.jLabel63.setFont(new Font("Tahoma", 0, 14));
        this.jLabel63.setText("Mr le greffier du TRIBUNAL CANTONAL DE MAHDIA est pri\u00e9 d'accepter ce Main Lev\u00e9e");
        this.mainleveeee.add(this.jLabel63);
        this.jLabel63.setBounds(10, 460, 530, 20);
        this.jLabel46.setFont(new Font("Tahoma", 0, 14));
        this.jLabel46.setText("sous n\u00b0 :");
        this.mainleveeee.add(this.jLabel46);
        this.jLabel46.setBounds(330, 410, 60, 20);
        this.etab.setFont(new Font("Tahoma", 1, 14));
        this.etab.setText("............");
        this.mainleveeee.add(this.etab);
        this.etab.setBounds(100, 370, 190, 20);
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel1, GroupLayout.Alignment.LEADING, -1, 546, 32767).addComponent(this.mainleveeee, GroupLayout.Alignment.LEADING, -2, 546, -2)).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jPanel1, -2, 111, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.mainleveeee, -2, 729, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, -1, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addContainerGap(-1, 32767)));
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Date actuellEed = new Date();
        SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
        String datddd = dateFormattd.format(actuellEed);
        SimpleDateFormat dateactuelle = new SimpleDateFormat("yyyyMM");
        this.dateatt.setText(datddd);
        String dat = dateactuelle.format(actuellEed);
        String moisactuel = dat.substring(dat.length() - 2, dat.length());
        String anneactuel = dat.substring(0, dat.length() - 2);
        System.out.println("mois actuelle :" + moisactuel + "--");
        System.out.println("anne actuelle :" + anneactuel + "--");
        boolean g = this.mecano.getText().equals("");
        if (g) {
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Saisire le Mecano ", "Attention", 0);
        } else {
            this.mecat.setText(this.mecano.getText());
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                ResultSetMetaData resultMeta2 = result2.getMetaData();
                while (result2.next()) {
                    this.nometprenom.setText(result2.getString("NOM"));
                    this.matricule.setText(result2.getString("NCNR"));
                    this.cin.setText(result2.getString("CIN"));
                    this.Adresse.setText(result2.getString("ADRES"));
                    this.profession.setText(result2.getString("TRVAIL"));
                    this.etab.setText(result2.getString("etab"));
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
            }
            int moisa = 0;
            int aneact = 0;
            int moisf = 0;
            int anef = 0;
            int nbdemois = 0;
            try {
                int nb;
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                ResultSet result3 = state.executeQuery("SELECT * FROM cession2  WHERE Mecano='" + this.mecano.getText() + "'");
                String mm = null;
                String annedenier = null;
                String moiddebut = "";
                String derniermois = null;
                String montantparsmois = "";
                while (result3.next()) {
                    derniermois = result3.getString("derniermois");
                    montantparsmois = result3.getString("montantparmois");
                    String montantglobale = result3.getString("Montant");
                    montantglobale = montantglobale.substring(0, montantglobale.length() - 3);
                    this.montantglo.setText(montantglobale + ",000");
                    System.out.println("montant globale ******** " + montantglobale + ",000");
                    System.out.println("---------------------------");
                    String r = result3.getString("ref");
                    String rr = r.substring(0, r.length() - 3);
                    String num = r.substring(r.length() - 2, r.length());
                    System.out.println("Registre ******** " + rr + " --");
                    System.out.println("Num registre ****** " + num + " --");
                    this.registre.setText(rr);
                    this.numr.setText(num);
                    this.dateimpression.setText(result3.getString("date"));
                }
                String montant = montantparsmois.substring(0, montantparsmois.length() - 4);
                int m = Integer.parseInt(montant);
                String moisdenier = derniermois.substring(0, derniermois.length() - 6);
                annedenier = derniermois.substring(derniermois.length() - 4, derniermois.length());
                System.out.println("***************" + moisdenier + "--");
                System.out.println("***************" + annedenier + "--");
                if (moisdenier.equals("Janvier")) {
                    mm = "01";
                } else if (moisdenier.equals("F\u00e9vrier")) {
                    mm = "02";
                } else if (moisdenier.equals("Mars")) {
                    mm = "03";
                } else if (moisdenier.equals("Avril")) {
                    mm = "04";
                } else if (moisdenier.equals("Mai")) {
                    mm = "03";
                } else if (moisdenier.equals("Juin")) {
                    mm = "06";
                } else if (moisdenier.equals("Juillet")) {
                    mm = "07";
                } else if (moisdenier.equals("Ao\u00fbt")) {
                    mm = "08";
                } else if (moisdenier.equals("Septembre")) {
                    mm = "09";
                } else if (moisdenier.equals("Octobre")) {
                    mm = "10";
                } else if (moisdenier.equals("Novembre")) {
                    mm = "11";
                } else if (moisdenier.equals("D\u00e9cembre")) {
                    mm = "12";
                } else {
                    mm = "0";
                    moisdenier.equals("Erreure");
                }
                moisa = Integer.parseInt(moisactuel);
                aneact = Integer.parseInt(anneactuel);
                System.out.println("***************");
                moisf = Integer.parseInt(mm);
                anef = Integer.parseInt(annedenier);
                System.out.println("***************" + moisf + "--");
                System.out.println("***************" + anef + "--");
                mm = annedenier + mm;
                System.out.println("***************" + mm + "--");
                System.out.println("***************" + dat + "--");
                int a = anef - aneact;
                if (a >= 1) {
                    nb = 12 - moisa;
                    nbdemois = moisf;
                    System.out.println("********nbdemois*******" + nbdemois);
                } else {
                    nb = moisf - moisa;
                }
                System.out.println("********nb*******" + nb);
                System.out.println("********nombre de mois = " + (nbdemois += nb));
                int montantglobalee = nbdemois * m;
                System.out.println("********Montant par mois = " + m);
                System.out.println("********Montant globale = " + montantglobalee);
                System.out.println("********Montant de main lev\u00e9e *******" + montantglobalee);
                String adi = Nombre.CALCULATE.getValue(montantglobalee, " Dinars ");
                this.globale1.setText("" + montantglobalee + ",000(" + adi.toUpperCase() + ")");
                JOptionPane.showMessageDialog(null, "Attention : Impression De Main lev\u00e9e ", "Information", 1);
                Impression1 sd = new Impression1(this.mainleveeee);
                sd.actionPerformed(evt);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn22.createStatement();
                    String p = "2";
                    state2.executeUpdate("INSERT INTO cession2(pv) VALUES('" + p + "')");
                }
                catch (Exception e) {
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'ajout le main lev\u00e9e a l'etat : " + e.getMessage());
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
            }
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
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

