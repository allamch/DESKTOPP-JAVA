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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.cessionsursalire;

public class traiteretretait
extends JPanel {
    private JLabel Datedebut;
    private JLabel Datefin;
    private JButton Quitter;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextField mecano;
    private JTextField montant;
    private JLabel montantchiffre;
    private JLabel montantlettre;
    private JLabel nomadh;
    private JLabel numcompteadh;

    public traiteretretait() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel11 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel10 = new JLabel();
        this.montant = new JTextField();
        this.Quitter = new JButton();
        this.jButton1 = new JButton();
        this.jPanel2 = new JPanel();
        this.jLabel2 = new JLabel();
        this.montantchiffre = new JLabel();
        this.numcompteadh = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.montantlettre = new JLabel();
        this.nomadh = new JLabel();
        this.jLabel9 = new JLabel();
        this.Datedebut = new JLabel();
        this.Datefin = new JLabel();
        this.setLayout(null);
        this.jPanel1.setMinimumSize(new Dimension(0, 0));
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(0, 102, 102));
        this.jLabel1.setText("Lettre de change");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(150, 0, 235, 26);
        this.jLabel11.setFont(new Font("Tahoma", 1, 18));
        this.jLabel11.setText("Mecano :");
        this.jPanel1.add(this.jLabel11);
        this.jLabel11.setBounds(30, 50, 83, 22);
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(130, 40, 210, 37);
        this.jLabel10.setFont(new Font("Tahoma", 1, 18));
        this.jLabel10.setText("Montant :");
        this.jPanel1.add(this.jLabel10);
        this.jLabel10.setBounds(30, 90, 88, 22);
        this.jPanel1.add(this.montant);
        this.montant.setBounds(130, 90, 210, 36);
        this.Quitter.setText("Quitter");
        this.jPanel1.add(this.Quitter);
        this.Quitter.setBounds(375, 80, 120, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("Imprimer ");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                traiteretretait.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(375, 40, 120, 33);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(0, 0, 510, 160);
        this.jPanel2.setBackground(new Color(255, 255, 255));
        this.jPanel2.setLayout(null);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Mahdia");
        this.jPanel2.add(this.jLabel2);
        this.jLabel2.setBounds(240, 20, 120, 20);
        this.montantchiffre.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.montantchiffre);
        this.montantchiffre.setBounds(394, 64, 110, 30);
        this.numcompteadh.setFont(new Font("Tahoma", 1, 14));
        this.numcompteadh.setText("05501000014534634714");
        this.jPanel2.add(this.numcompteadh);
        this.numcompteadh.setBounds(134, 67, 210, 20);
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("C.S.Mahdia");
        this.jPanel2.add(this.jLabel5);
        this.jLabel5.setBounds(20, 104, 100, 30);
        this.jLabel6.setFont(new Font("Tahoma", 1, 14));
        this.jLabel6.setText("Centre Social Mahdia");
        this.jPanel2.add(this.jLabel6);
        this.jLabel6.setBounds(200, 114, 170, 20);
        this.montantlettre.setFont(new Font("Tahoma", 1, 14));
        this.montantlettre.setText("MILLE   Dinars");
        this.jPanel2.add(this.montantlettre);
        this.montantlettre.setBounds(20, 134, 460, 30);
        this.nomadh.setFont(new Font("Tahoma", 1, 14));
        this.nomadh.setText("Ali ouaz");
        this.jPanel2.add(this.nomadh);
        this.nomadh.setBounds(200, 224, 300, 30);
        this.jLabel9.setFont(new Font("Tahoma", 1, 14));
        this.jLabel9.setText("Mahdia");
        this.jPanel2.add(this.jLabel9);
        this.jLabel9.setBounds(370, 184, 100, 30);
        this.Datedebut.setText("Date debut");
        this.jPanel2.add(this.Datedebut);
        this.Datedebut.setBounds(240, 40, 100, 20);
        this.jPanel2.add(this.Datefin);
        this.Datefin.setBounds(120, 40, 100, 20);
        this.add(this.jPanel2);
        this.jPanel2.setBounds(0, 170, 520, 310);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        JOptionPane jop2;
        boolean g;
        boolean k = true;
        boolean bl = g = this.mecano.getText().equals("") || this.montant.getText().equals("");
        if (g) {
            k = false;
            jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        } else if (this.montant.getText().length() < 4) {
            jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Montant Incorrecte", "Attention", 0);
            k = false;
        }
        if (k) {
            block29 : {
                Date actuellEe = new Date();
                SimpleDateFormat dateFormatt = new SimpleDateFormat("dd-MM-yyyy");
                String datdd = dateFormatt.format(actuellEe);
                String ann\u00e9es = datdd.substring(6, datdd.length());
                System.out.println("ann\u00e9es =" + ann\u00e9es);
                String mois2 = datdd.substring(3, datdd.length() - 5);
                int moiactuelle = Integer.parseInt(mois2);
                this.Datedebut.setText(datdd);
                int aa = Integer.parseInt(ann\u00e9es);
                int kk = moiactuelle + 3;
                while (kk > 12) {
                    kk -= 12;
                    ++aa;
                }
                System.out.println("kk =" + kk);
                System.out.println("aa =" + aa);
                String moiddebut = "";
                String moisfin = "";
                switch (kk) {
                    case 1: {
                        moisfin = "30-01-" + aa;
                        break;
                    }
                    case 2: {
                        moisfin = "28-02-" + aa;
                        break;
                    }
                    case 3: {
                        moisfin = "30-03-" + aa;
                        break;
                    }
                    case 4: {
                        moisfin = "30-04-" + aa;
                        break;
                    }
                    case 5: {
                        moisfin = "30-05-" + aa;
                        break;
                    }
                    case 6: {
                        moisfin = "30-06-" + aa;
                        break;
                    }
                    case 7: {
                        moisfin = "30-07-" + aa;
                        break;
                    }
                    case 8: {
                        moisfin = "30-08-" + aa;
                        break;
                    }
                    case 9: {
                        moisfin = "30-09-" + aa;
                        break;
                    }
                    case 10: {
                        moisfin = "30-10-" + aa;
                        break;
                    }
                    case 11: {
                        moisfin = "30-11-" + aa;
                        break;
                    }
                    case 12: {
                        moisfin = "30-12-" + aa;
                        break;
                    }
                    default: {
                        moisfin = "Erreur";
                    }
                }
                this.Datefin.setText(moisfin);
                String ss = this.montant.getText();
                int tt = ss.length() - 3;
                String dii = ss.substring(0, ss.length() - 3);
                String miil = ss.substring(tt, ss.length());
                this.montantchiffre.setText(dii + "," + miil + "DT");
                String mmontant = this.montant.getText() + "";
                int t = mmontant.length() - 3;
                String di = mmontant.substring(0, mmontant.length() - 3);
                String mil = mmontant.substring(t, mmontant.length());
                String mont = di + "," + mil;
                int mon = Integer.parseInt(di);
                String adi = "";
                try {
                    adi = Nombre.CALCULATE.getValue(mon, " Dinars ");
                }
                catch (Exception ex) {
                    Logger.getLogger(cessionsursalire.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.montantlettre.setText(adi);
                String ch1 = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT mecano  FROM  retretait WHERE mecano=" + this.mecano.getText());
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        for (int i = 1; i <= resultMeta.getColumnCount(); ++i) {
                            ch1 = result.getObject(i).toString();
                        }
                    }
                    if (ch1.equals("")) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adheron n'existe pas ", "Information", 1);
                        k = false;
                        break block29;
                    }
                    ch1 = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn2.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomadh.setText(result3.getString("nom"));
                            this.numcompteadh.setText(result3.getString("rib"));
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                        k = false;
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'afficher la liste d'adheren " + e.getMessage());
                    k = false;
                }
            }
            Impression1 ss2 = new Impression1(this.jPanel2);
            ss2.actionPerformed(evt);
            this.setVisible(false);
        }
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

