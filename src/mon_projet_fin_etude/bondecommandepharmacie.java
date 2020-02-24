/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.URL;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mon_projet_fin_etude.ajouterbondecommandepharmacie;
import mon_projet_fin_etude.modifierbondecommandepharmacie;

public class bondecommandepharmacie
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    String matt = "";
    int k = 0;
    int kk = 0;
    int anedebut = 0;
    String type = "pharmacie";
    private JLabel aabc;
    private ajouterbondecommandepharmacie ajouterbondecommandepharmacie1;
    private JLabel bq;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JLabel dt;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JLabel mcc;
    private JLabel mecanomadh;
    private modifierbondecommandepharmacie modifierbondecommandepharmacie1;
    private JLabel mont;
    private JLabel nnbc;
    private JLabel nomadherant;
    private JLabel nomscc;

    public bondecommandepharmacie() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.buttonGroup2 = new ButtonGroup();
        this.jPanel1 = new JPanel();
        this.nnbc = new JLabel();
        this.aabc = new JLabel();
        this.mcc = new JLabel();
        this.nomscc = new JLabel();
        this.mont = new JLabel();
        this.bq = new JLabel();
        this.nomadherant = new JLabel();
        this.mecanomadh = new JLabel();
        this.dt = new JLabel();
        this.jLabel2 = new JLabel();
        this.jPanel2 = new JPanel();
        this.jButton3 = new JButton();
        this.jButton5 = new JButton();
        this.jButton4 = new JButton();
        this.jPanel3 = new JPanel();
        this.ajouterbondecommandepharmacie1 = new ajouterbondecommandepharmacie();
        this.modifierbondecommandepharmacie1 = new modifierbondecommandepharmacie();
        this.setLayout(null);
        this.jPanel1.setLayout(null);
        this.nnbc.setFont(new Font("Tahoma", 1, 12));
        this.nnbc.setText("........");
        this.jPanel1.add(this.nnbc);
        this.nnbc.setBounds(290, 10, 40, 30);
        this.aabc.setFont(new Font("Tahoma", 1, 12));
        this.aabc.setText("........");
        this.jPanel1.add(this.aabc);
        this.aabc.setBounds(350, 10, 50, 30);
        this.mcc.setFont(new Font("Tahoma", 1, 12));
        this.mcc.setText("...........");
        this.jPanel1.add(this.mcc);
        this.mcc.setBounds(500, 30, 70, 20);
        this.nomscc.setFont(new Font("Tahoma", 1, 12));
        this.nomscc.setText("........................................");
        this.jPanel1.add(this.nomscc);
        this.nomscc.setBounds(190, 50, 260, 20);
        this.mont.setFont(new Font("Tahoma", 1, 12));
        this.mont.setText("0.000");
        this.jPanel1.add(this.mont);
        this.mont.setBounds(500, 0, 100, 30);
        this.bq.setFont(new Font("Tahoma", 1, 12));
        this.bq.setText(".............");
        this.jPanel1.add(this.bq);
        this.bq.setBounds(500, 60, 70, 20);
        this.nomadherant.setFont(new Font("Tahoma", 1, 12));
        this.nomadherant.setText("............................................");
        this.jPanel1.add(this.nomadherant);
        this.nomadherant.setBounds(80, 110, 390, 30);
        this.mecanomadh.setFont(new Font("Tahoma", 1, 12));
        this.mecanomadh.setText("...............");
        this.jPanel1.add(this.mecanomadh);
        this.mecanomadh.setBounds(520, 110, 80, 30);
        this.dt.setFont(new Font("Tahoma", 1, 12));
        this.dt.setText("...............");
        this.jPanel1.add(this.dt);
        this.dt.setBounds(470, 180, 100, 30);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/image/pharmacie/phar.png")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(0, 0, 610, 270);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(250, 750, 610, 30);
        this.jPanel2.setLayout(null);
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/pharmacie/ajouter.png")));
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommandepharmacie.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton3);
        this.jButton3.setBounds(120, 0, 70, 60);
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/image/pharmacie/modifier.png")));
        this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommandepharmacie.this.jButton5ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton5);
        this.jButton5.setBounds(210, 0, 70, 60);
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/pharmacie/annuler.png")));
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                bondecommandepharmacie.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton4);
        this.jButton4.setBounds(300, 0, 70, 60);
        this.add(this.jPanel2);
        this.jPanel2.setBounds(220, 0, 470, 60);
        this.jPanel3.setLayout(new CardLayout());
        this.jPanel3.add((Component)this.ajouterbondecommandepharmacie1, "ajout");
        this.jPanel3.add((Component)this.modifierbondecommandepharmacie1, "modif");
        this.add(this.jPanel3);
        this.jPanel3.setBounds(0, 60, 1000, 570);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel3.getLayout();
        card.show(this.jPanel3, "ajout");
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel3.getLayout();
        card.show(this.jPanel3, "modif");
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
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

