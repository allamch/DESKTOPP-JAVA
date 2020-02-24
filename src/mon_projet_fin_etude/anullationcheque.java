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
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class anullationcheque
extends JPanel {
    public int nb;
    public int k = 0;
    public int b = 1;
    public int anp = 0;
    public int fnp = 0;
    public int nbch = 0;
    public int kj = 0;
    public int bj = 0;
    public String ch;
    public String montant;
    public String banquee;
    public String ban;
    public String nomeff = "";
    public String hf = "";
    public String ncineffe = "";
    public String delivrele = "";
    public String aa = "";
    String nb2 = "1";
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    String numcarnetreserver = "";
    double Nch;
    double Nfin;
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel6;
    private JTextField numdossier;

    public anullationcheque() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel6 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jPanel1 = new JPanel();
        this.jLabel3 = new JLabel();
        this.numdossier = new JTextField();
        this.jButton1 = new JButton();
        this.jLabel1 = new JLabel();
        this.jPanel6.setLayout(null);
        this.jLabel2.setFont(new Font("Tahoma", 1, 24));
        this.jLabel2.setForeground(new Color(153, 0, 51));
        this.jLabel2.setText("Annulation des cheques");
        this.jPanel6.add(this.jLabel2);
        this.jLabel2.setBounds(220, 10, 320, 30);
        this.jPanel1.setLayout(null);
        this.jLabel3.setFont(new Font("Tahoma", 0, 18));
        this.jLabel3.setForeground(new Color(0, 153, 255));
        this.jLabel3.setText("Numero de chque :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(10, 30, 160, 22);
        this.numdossier.setFont(new Font("Tahoma", 0, 14));
        this.numdossier.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                anullationcheque.this.numdossierActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.numdossier);
        this.numdossier.setBounds(210, 20, 210, 35);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setText("Valider l'annullation de cheque");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                anullationcheque.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(440, 20, 250, 40);
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/image/annuler/Capturen.PNG")));
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(190, 90, 300, 200);
        this.jPanel6.add(this.jPanel1);
        this.jPanel1.setBounds(10, 59, 741, 400);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel6, -2, 752, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel6, -2, 450, -2).addContainerGap(-1, 32767)));
    }

    private void numdossierActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String numcarnet = "";
        String Mecano = "";
        String Montant = "";
        String date = "";
        String dateanulation = "";
        String type = "";
        Date actuelle = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateanulation = dateFormat.format(actuelle);
        try {
            Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state4 = conn4.createStatement();
            ResultSet result4 = state4.executeQuery("SELECT * FROM talondescheque  WHERE numcheque='" + this.numdossier.getText() + "'");
            while (result4.next()) {
                this.k = 1;
                numcarnet = result4.getString("Numcarnet");
                Mecano = result4.getString("Mecano");
                Montant = result4.getString("Montant");
                date = result4.getString("date");
                type = result4.getString("type");
            }
        }
        catch (Exception e) {
            this.k = 0;
            JOptionPane.showMessageDialog(null, "Numero de cheque n'existe pas  " + e.getMessage());
        }
        if (this.k == 1) {
            JOptionPane jop = new JOptionPane();
            int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment annuler ce cheque ? N\u00b0carnet= " + numcarnet, "Quitter", 0, 3);
            if (option == 0) {
                Statement state4;
                Connection conn4;
                try {
                    conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    state4 = conn4.createStatement();
                    state4.executeUpdate("DELETE  FROM talondescheque WHERE numcheque=" + this.numdossier.getText());
                    this.k = 1;
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane.showMessageDialog(null, "Numero de cheque n'existe pas  " + e.getMessage());
                }
                if (this.k == 1) {
                    try {
                        conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state4 = conn4.createStatement();
                        state4.executeUpdate("INSERT INTO chequeannuller(numcheque,Numcarnet,Mecano,Montant,date,dateanulation,type) VALUES('" + this.numdossier.getText() + "','" + numcarnet + "','" + Mecano + "','" + Montant + "','" + date + "','" + dateanulation + "','" + type + "')");
                        this.k = 1;
                    }
                    catch (Exception e) {
                        this.k = 0;
                        this.numdossier.setText("");
                        JOptionPane.showMessageDialog(null, "erreure d'annulation  " + e.getMessage());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "N\u00b0 de cheque n'existe pas");
        }
        if (this.k == 1) {
            JOptionPane.showMessageDialog(null, "Succer d'annulation  ");
            this.numdossier.setText("");
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

