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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import mon_projet_fin_etude.Impression1;

public class ORDEREDEPAYMENTANCIENCESSION
extends JPanel {
    String nomadh = "";
    String ch = "";
    String mont = "";
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    String numcarnetreserver = "";
    double Nch;
    double Nfin;
    int k = 1;
    private JLabel date1;
    private JLabel date2;
    private JLabel date3;
    private JLabel date4;
    private JLabel datt;
    private JButton jButton1;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel36;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JSeparator jSeparator1;
    private JTextField mat;
    private JLabel matricule;
    private JTextField mecano;
    private JLabel mecc;
    private JTextField mensualit\u00e9;
    private JTextField mensualit\u00e91;
    private JTextField nbmois;
    private JLabel ncina;
    private JLabel nomm;
    private JLabel nompre;
    private JLabel total;

    public ORDEREDEPAYMENTANCIENCESSION() {
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
        this.mat = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jComboBox1 = new JComboBox();
        this.jLabel8 = new JLabel();
        this.jComboBox2 = new JComboBox();
        this.mensualit\u00e91 = new JTextField();
        this.jLabel12 = new JLabel();
        this.jPanel4 = new JPanel();
        this.jLabel11 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel25 = new JLabel();
        this.datt = new JLabel();
        this.jLabel9 = new JLabel();
        this.date2 = new JLabel();
        this.jLabel20 = new JLabel();
        this.total = new JLabel();
        this.jLabel22 = new JLabel();
        this.jLabel23 = new JLabel();
        this.jLabel24 = new JLabel();
        this.ncina = new JLabel();
        this.jLabel16 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jLabel17 = new JLabel();
        this.date1 = new JLabel();
        this.jLabel26 = new JLabel();
        this.nompre = new JLabel();
        this.matricule = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jLabel32 = new JLabel();
        this.nomm = new JLabel();
        this.mecc = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel10 = new JLabel();
        this.date3 = new JLabel();
        this.date4 = new JLabel();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setText("Ordre de payment d'une ancienne redevance sur pret");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(10, 0, 500, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Mecano :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(10, 90, 70, 20);
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ORDEREDEPAYMENTANCIENCESSION.this.mecanoActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(80, 80, 90, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Montant  de payment:");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(190, 80, 160, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("NB de mois :");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(20, 160, 90, 30);
        this.nbmois.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ORDEREDEPAYMENTANCIENCESSION.this.nbmoisActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.nbmois);
        this.nbmois.setBounds(120, 160, 80, 30);
        this.mensualit\u00e9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ORDEREDEPAYMENTANCIENCESSION.this.mensualit\u00e9ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mensualit\u00e9);
        this.mensualit\u00e9.setBounds(350, 80, 160, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ORDEREDEPAYMENTANCIENCESSION.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(400, 160, 110, 33);
        this.mat.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ORDEREDEPAYMENTANCIENCESSION.this.matActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mat);
        this.mat.setBounds(290, 160, 80, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("1 er mois :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(210, 160, 80, 30);
        this.jLabel6.setFont(new Font("Tahoma", 1, 12));
        this.jLabel6.setForeground(new Color(51, 0, 255));
        this.jLabel6.setText("Nouvaux pret :");
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(250, 40, 110, 30);
        this.jComboBox1.setFont(new Font("Tahoma", 1, 14));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{"Pret cession", "pret fournisseur", "pret FDD"}));
        this.jPanel1.add(this.jComboBox1);
        this.jComboBox1.setBounds(370, 40, 130, 30);
        this.jLabel8.setFont(new Font("Tahoma", 1, 12));
        this.jLabel8.setForeground(new Color(51, 0, 255));
        this.jLabel8.setText("A titre de :");
        this.jPanel1.add(this.jLabel8);
        this.jLabel8.setBounds(10, 40, 70, 30);
        this.jComboBox2.setFont(new Font("Tahoma", 1, 14));
        this.jComboBox2.setModel(new DefaultComboBoxModel<String>(new String[]{"Pret cession", "pret fournisseur", "pret FDD"}));
        this.jPanel1.add(this.jComboBox2);
        this.jComboBox2.setBounds(80, 40, 130, 30);
        this.mensualit\u00e91.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ORDEREDEPAYMENTANCIENCESSION.this.mensualit\u00e91ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mensualit\u00e91);
        this.mensualit\u00e91.setBounds(220, 120, 160, 30);
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("Montant de nouveaux pret :");
        this.jPanel1.add(this.jLabel12);
        this.jLabel12.setBounds(10, 120, 200, 30);
        this.jPanel4.setBackground(new Color(255, 255, 255));
        this.jPanel4.setLayout(null);
        this.jLabel11.setFont(new Font("Tahoma", 0, 14));
        this.jLabel11.setText("tir\u00e9  BT Mahdia titre de pret 231");
        this.jPanel4.add(this.jLabel11);
        this.jLabel11.setBounds(310, 450, 210, 30);
        this.jLabel13.setFont(new Font("Tahoma", 0, 12));
        this.jLabel13.setText("Mahdia le ");
        this.jPanel4.add(this.jLabel13);
        this.jLabel13.setBounds(20, 20, 60, 15);
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
        this.jLabel9.setText("           redevance sur pr\u00e8t");
        this.jPanel4.add(this.jLabel9);
        this.jLabel9.setBounds(110, 70, 400, 30);
        this.date2.setFont(new Font("Tahoma", 1, 14));
        this.date2.setText("..........................");
        this.jPanel4.add(this.date2);
        this.date2.setBounds(140, 190, 360, 30);
        this.jLabel20.setFont(new Font("Tahoma", 0, 14));
        this.jLabel20.setText("au");
        this.jPanel4.add(this.jLabel20);
        this.jLabel20.setBounds(250, 220, 20, 20);
        this.total.setFont(new Font("Tahoma", 1, 14));
        this.total.setText(".................................................................");
        this.jPanel4.add(this.total);
        this.total.setBounds(430, 173, 100, 17);
        this.jLabel22.setFont(new Font("Tahoma", 0, 14));
        this.jLabel22.setText("a titre de payment de ");
        this.jPanel4.add(this.jLabel22);
        this.jLabel22.setBounds(0, 190, 150, 30);
        this.jLabel23.setFont(new Font("Tahoma", 0, 14));
        this.jLabel23.setText("pour les mois de :");
        this.jPanel4.add(this.jLabel23);
        this.jLabel23.setBounds(0, 210, 120, 30);
        this.jLabel24.setFont(new Font("Tahoma", 0, 14));
        this.jLabel24.setText("et ce sur le pr\u00e9t n\u00b0");
        this.jPanel4.add(this.jLabel24);
        this.jLabel24.setBounds(0, 240, 130, 30);
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
        this.jLabel17.setText("Autorise par ce ordre de Centre Social Mahdia de retenir la somme de ");
        this.jPanel4.add(this.jLabel17);
        this.jLabel17.setBounds(0, 170, 430, 30);
        this.date1.setFont(new Font("Tahoma", 1, 14));
        this.date1.setText("..........................");
        this.jPanel4.add(this.date1);
        this.date1.setBounds(120, 240, 190, 30);
        this.jLabel26.setFont(new Font("Tahoma", 0, 14));
        this.jLabel26.setText("je soussign\u00e9 :");
        this.jPanel4.add(this.jLabel26);
        this.jLabel26.setBounds(0, 150, 90, 30);
        this.nompre.setFont(new Font("Tahoma", 1, 14));
        this.nompre.setText(".....................................");
        this.jPanel4.add(this.nompre);
        this.nompre.setBounds(90, 150, 170, 30);
        this.matricule.setFont(new Font("Tahoma", 1, 14));
        this.matricule.setText("..........................");
        this.jPanel4.add(this.matricule);
        this.matricule.setBounds(390, 150, 110, 30);
        this.jLabel30.setFont(new Font("Tahoma", 0, 14));
        this.jLabel30.setText("Matricule");
        this.jPanel4.add(this.jLabel30);
        this.jLabel30.setBounds(330, 150, 60, 30);
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
        this.jLabel10.setFont(new Font("Tahoma", 1, 18));
        this.jLabel10.setForeground(new Color(0, 51, 204));
        this.jLabel10.setText("Ordre de payment d'une ancienne");
        this.jPanel4.add(this.jLabel10);
        this.jLabel10.setBounds(110, 40, 400, 30);
        this.date3.setFont(new Font("Tahoma", 1, 14));
        this.date3.setText("..........................");
        this.jPanel4.add(this.date3);
        this.date3.setBounds(110, 220, 130, 20);
        this.date4.setFont(new Font("Tahoma", 1, 14));
        this.date4.setText("..........................");
        this.jPanel4.add(this.date4);
        this.date4.setBounds(280, 220, 190, 20);
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 534, -2).addComponent(this.jPanel4, -2, 544, -2)).addContainerGap(12, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, 258, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel4, -2, 307, -2).addGap(254, 254, 254)));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, 594, -2).addContainerGap(149, 32767)));
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void nbmoisActionPerformed(ActionEvent evt) {
    }

    private void mensualit\u00e9ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Impression1 sec = new Impression1(this.jPanel4);
        sec.actionPerformed(evt);
    }

    private void matActionPerformed(ActionEvent evt) {
    }

    private void mensualit\u00e91ActionPerformed(ActionEvent evt) {
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

