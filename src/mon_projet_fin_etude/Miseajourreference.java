/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Miseajourreference
extends JFrame {
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JToggleButton jToggleButton1;
    private JTextField mecano;
    private JTextField reference;
    private JTextField registre;

    public Miseajourreference() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel4 = new JLabel();
        this.registre = new JTextField();
        this.jToggleButton1 = new JToggleButton();
        this.jLabel5 = new JLabel();
        this.reference = new JTextField();
        this.jButton2 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setText("Impression cheque Cession ");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(94, 11, 289, 33);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Mecano :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(10, 50, 70, 20);
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Miseajourreference.this.mecanoActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(100, 50, 140, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Registre :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(250, 90, 70, 30);
        this.registre.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Miseajourreference.this.registreActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.registre);
        this.registre.setBounds(320, 90, 90, 30);
        this.jToggleButton1.setFont(new Font("Tahoma", 0, 14));
        this.jToggleButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jToggleButton1.setText("Imprimer");
        this.jToggleButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Miseajourreference.this.jToggleButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jToggleButton1);
        this.jToggleButton1.setBounds(180, 130, 120, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("Reference :");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(10, 90, 90, 30);
        this.reference.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Miseajourreference.this.referenceActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.reference);
        this.reference.setBounds(100, 90, 140, 30);
        this.jButton2.setFont(new Font("Tahoma", 1, 14));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/cession/fermer-croix-supprimer-erreurs-sortie-icone-4368-16.png")));
        this.jButton2.setText("Quitter");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Miseajourreference.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(310, 130, 120, 30);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 438, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 173, -2).addContainerGap(-1, 32767)));
        this.pack();
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void registreActionPerformed(ActionEvent evt) {
    }

    private void referenceActionPerformed(ActionEvent evt) {
    }

    private void jToggleButton1ActionPerformed(ActionEvent evt) {
        boolean g;
        boolean k = true;
        boolean bl = g = this.mecano.getText().equals("") || this.reference.getText().equals("") || this.registre.getText().equals("");
        if (g) {
            k = false;
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        } else {
            String referencee = this.reference.getText() + "/" + this.registre.getText();
            Date actuellEed = new Date();
            SimpleDateFormat dateFormattd = new SimpleDateFormat("dd/MM/yyyy");
            String datddd = dateFormattd.format(actuellEed);
            String mchbd = "";
            if (k) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    k = true;
                    String nb = "1";
                    String imprimeborde = "1";
                    String p = "0";
                    String f = "1";
                    state2.executeUpdate("UPDATE cessionfournisseur SET ref='" + referencee + "' WHERE MECANO='" + this.mecano.getText() + "'AND pv='" + p + "'");
                    state2.executeUpdate("UPDATE cessionfournisseur SET pv='" + f + "' WHERE MECANO='" + this.mecano.getText() + "'AND pv='" + p + "'");
                }
                catch (Exception e) {
                    k = false;
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat : " + e.getMessage());
                }
            }
        }
        if (!k) {
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Aucune Cession ");
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
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
            Logger.getLogger(Miseajourreference.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(Miseajourreference.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(Miseajourreference.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Miseajourreference.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new Miseajourreference().setVisible(true);
            }
        });
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

