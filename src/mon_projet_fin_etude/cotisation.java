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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import mon_projet_fin_etude.recherchecarnedecheque;

public class cotisation
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    String matt = "";
    int Ac = 0;
    int Md = 0;
    int Mb = 0;
    int k = 0;
    int kk = 0;
    int anedebut = 0;
    String type = "";
    private JLabel aabc;
    private JLabel bq;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JLabel dt;
    private JButton jButton1;
    private JLabel jLabel14;
    private JLabel jLabel2;
    private JLabel jLabel32;
    private JLabel jLabel34;
    private JLabel jLabel38;
    private JLabel jLabel43;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel16;
    private JLabel mcc;
    private JTextField mecano;
    private JLabel mecanomadh;
    private JLabel mont;
    private JTextField montantdevis;
    private JTextField nbmoi;
    private JLabel nnbc;
    private JLabel nomadh;
    private JLabel nomadherant;
    private JLabel nomscc;
    private JLabel sommeletre;

    public cotisation() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.buttonGroup2 = new ButtonGroup();
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.mecano = new JTextField();
        this.montantdevis = new JTextField();
        this.jLabel34 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel6 = new JLabel();
        this.nomadh = new JLabel();
        this.nbmoi = new JTextField();
        this.jLabel32 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel43 = new JLabel();
        this.jPanel1 = new JPanel();
        this.nnbc = new JLabel();
        this.aabc = new JLabel();
        this.mcc = new JLabel();
        this.nomscc = new JLabel();
        this.mont = new JLabel();
        this.bq = new JLabel();
        this.sommeletre = new JLabel();
        this.nomadherant = new JLabel();
        this.mecanomadh = new JLabel();
        this.dt = new JLabel();
        this.jLabel2 = new JLabel();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.mecano.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                cotisation.this.mecanoMouseClicked(evt);
            }
        });
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cotisation.this.mecanoActionPerformed(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                cotisation.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(90, 50, 110, 30);
        this.montantdevis.setFont(new Font("Tahoma", 0, 14));
        this.montantdevis.setEnabled(false);
        this.montantdevis.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                cotisation.this.montantdevisMouseClicked(evt);
            }
        });
        this.montantdevis.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cotisation.this.montantdevisActionPerformed(evt);
            }
        });
        this.montantdevis.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                cotisation.this.montantdevisKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.montantdevis);
        this.montantdevis.setBounds(100, 90, 130, 30);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText("Montant  :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(20, 90, 80, 30);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setForeground(new Color(0, 0, 255));
        this.jLabel38.setText("Nom et prenom :");
        this.jPanel16.add(this.jLabel38);
        this.jLabel38.setBounds(220, 50, 120, 30);
        this.jLabel6.setFont(new Font("Snap ITC", 1, 24));
        this.jLabel6.setForeground(new Color(0, 0, 153));
        this.jLabel6.setText("Ajouter cotisation des adherants");
        this.jPanel16.add(this.jLabel6);
        this.jLabel6.setBounds(150, 10, 530, 30);
        this.nomadh.setBackground(new Color(153, 153, 255));
        this.nomadh.setFont(new Font("Tahoma", 1, 14));
        this.nomadh.setForeground(new Color(153, 0, 0));
        this.nomadh.setText("................");
        this.jPanel16.add(this.nomadh);
        this.nomadh.setBounds(360, 50, 270, 30);
        this.nbmoi.setFont(new Font("Tahoma", 0, 14));
        this.nbmoi.setEnabled(false);
        this.nbmoi.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                cotisation.this.nbmoiMouseClicked(evt);
            }
        });
        this.nbmoi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cotisation.this.nbmoiActionPerformed(evt);
            }
        });
        this.nbmoi.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                cotisation.this.nbmoiKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.nbmoi);
        this.nbmoi.setBounds(330, 90, 100, 30);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setForeground(new Color(0, 0, 255));
        this.jLabel32.setText("Mecano :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(20, 60, 80, 17);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton1.setText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cotisation.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(600, 70, 130, 40);
        this.jLabel43.setBackground(new Color(153, 153, 255));
        this.jLabel43.setFont(new Font("Tahoma", 1, 14));
        this.jLabel43.setForeground(new Color(0, 0, 255));
        this.jLabel43.setText("NB mois :");
        this.jPanel16.add(this.jLabel43);
        this.jLabel43.setBounds(250, 90, 80, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(20, 20, 940, 530);
        this.jPanel1.setLayout(null);
        this.nnbc.setFont(new Font("Tahoma", 1, 12));
        this.nnbc.setText("........");
        this.jPanel1.add(this.nnbc);
        this.nnbc.setBounds(260, 0, 60, 30);
        this.aabc.setFont(new Font("Tahoma", 1, 12));
        this.aabc.setText("........");
        this.jPanel1.add(this.aabc);
        this.aabc.setBounds(340, 0, 80, 30);
        this.mcc.setFont(new Font("Tahoma", 1, 12));
        this.mcc.setText("...........");
        this.jPanel1.add(this.mcc);
        this.mcc.setBounds(480, 30, 70, 20);
        this.nomscc.setFont(new Font("Tahoma", 1, 12));
        this.nomscc.setText("........................................");
        this.jPanel1.add(this.nomscc);
        this.nomscc.setBounds(170, 34, 260, 40);
        this.mont.setFont(new Font("Tahoma", 1, 12));
        this.mont.setText("................");
        this.jPanel1.add(this.mont);
        this.mont.setBounds(480, 4, 110, 20);
        this.bq.setFont(new Font("Tahoma", 1, 12));
        this.bq.setText(".............");
        this.jPanel1.add(this.bq);
        this.bq.setBounds(480, 50, 70, 20);
        this.sommeletre.setFont(new Font("Tahoma", 1, 12));
        this.sommeletre.setText("......................................");
        this.jPanel1.add(this.sommeletre);
        this.sommeletre.setBounds(170, 94, 470, 30);
        this.nomadherant.setFont(new Font("Tahoma", 1, 12));
        this.nomadherant.setText("............................................");
        this.jPanel1.add(this.nomadherant);
        this.nomadherant.setBounds(80, 120, 310, 40);
        this.mecanomadh.setFont(new Font("Tahoma", 1, 12));
        this.mecanomadh.setText("...............");
        this.jPanel1.add(this.mecanomadh);
        this.mecanomadh.setBounds(450, 124, 80, 30);
        this.dt.setFont(new Font("Tahoma", 1, 12));
        this.dt.setText("...............");
        this.jPanel1.add(this.dt);
        this.dt.setBounds(450, 174, 100, 30);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/image/bc/a.jpg")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(0, 0, 660, 261);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(260, 640, 680, 10);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void montantdevisMouseClicked(MouseEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        Connection conn2 = null;
        this.kk = 0;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement state3;
            ResultSetMetaData resultMeta3;
            ResultSet result3;
            int montantnet = Integer.parseInt(this.mecano.getText());
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.kk = 1;
                    this.t = "S";
                    this.nomadh.setText(result3.getString("nom"));
                }
            }
            catch (Exception e) {
                // empty catch block
            }
            if (this.k == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        this.kk = 1;
                        this.t = "R";
                        this.nomadh.setText(result3.getString("nom"));
                    }
                }
                catch (Exception e) {
                    // empty catch block
                }
            }
            if (this.kk == 0) {
                this.nomadh.setText(".................");
            }
            System.out.println("k=" + this.k);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.mecano.setText("");
        }
    }

    private void nbmoiMouseClicked(MouseEvent evt) {
    }

    private void montantdevisActionPerformed(ActionEvent evt) {
    }

    private void nbmoiActionPerformed(ActionEvent evt) {
    }

    private void montantdevisKeyReleased(KeyEvent evt) {
    }

    private void nbmoiKeyReleased(KeyEvent evt) {
    }

    private void mecanoMouseClicked(MouseEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    }

    private void mecanoActionPerformed(ActionEvent evt) {
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

