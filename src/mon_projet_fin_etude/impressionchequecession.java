/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
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
import mon_projet_fin_etude.Impression1;

public class impressionchequecession
extends JFrame {
    String numcheque = "";
    private JPanel cheque9;
    private JLabel datecheque;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel31;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JToggleButton jToggleButton1;
    private JTextField mecano;
    private JLabel mecc;
    private JLabel montantlettrecheque;
    private JLabel montchiffrecheque;
    private JLabel nomadhcheque;
    private JTextField reference;
    private JTextField registre;

    public impressionchequecession() {
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
        this.jPanel10 = new JPanel();
        this.cheque9 = new JPanel();
        this.montantlettrecheque = new JLabel();
        this.montchiffrecheque = new JLabel();
        this.nomadhcheque = new JLabel();
        this.mecc = new JLabel();
        this.jLabel31 = new JLabel();
        this.datecheque = new JLabel();
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
                impressionchequecession.this.mecanoActionPerformed(evt);
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
                impressionchequecession.this.registreActionPerformed(evt);
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
                impressionchequecession.this.jToggleButton1ActionPerformed(evt);
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
                impressionchequecession.this.referenceActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.reference);
        this.reference.setBounds(100, 90, 140, 30);
        this.jPanel10.setBackground(new Color(51, 102, 255));
        this.cheque9.setBackground(new Color(255, 255, 255));
        this.cheque9.setLayout(null);
        this.montantlettrecheque.setFont(new Font("Tahoma", 0, 12));
        this.montantlettrecheque.setText("................");
        this.cheque9.add(this.montantlettrecheque);
        this.montantlettrecheque.setBounds(80, 50, 390, 20);
        this.montchiffrecheque.setFont(new Font("Arial Black", 0, 12));
        this.montchiffrecheque.setText("................");
        this.cheque9.add(this.montchiffrecheque);
        this.montchiffrecheque.setBounds(350, 0, 110, 20);
        this.nomadhcheque.setFont(new Font("Tahoma", 1, 14));
        this.nomadhcheque.setText(".................................................................................");
        this.cheque9.add(this.nomadhcheque);
        this.nomadhcheque.setBounds(80, 70, 350, 20);
        this.cheque9.add(this.mecc);
        this.mecc.setBounds(180, 0, 60, 20);
        this.jLabel31.setText("Mahdia ");
        this.cheque9.add(this.jLabel31);
        this.jLabel31.setBounds(150, 160, 50, 14);
        this.datecheque.setFont(new Font("Tahoma", 0, 12));
        this.datecheque.setText("..............................");
        this.cheque9.add(this.datecheque);
        this.datecheque.setBounds(210, 160, 160, 15);
        GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
        this.jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.cheque9, -2, 406, -2).addContainerGap(-1, 32767)));
        jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addComponent(this.cheque9, -2, 141, -2).addContainerGap(-1, 32767)));
        this.jPanel1.add(this.jPanel10);
        this.jPanel10.setBounds(-10, 170, 430, 30);
        this.jButton2.setFont(new Font("Tahoma", 1, 14));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/cession/fermer-croix-supprimer-erreurs-sortie-icone-4368-16.png")));
        this.jButton2.setText("Quitter");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                impressionchequecession.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(310, 130, 120, 30);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 436, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 206, -2));
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
        boolean k = false;
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
            this.datecheque.setText(datddd);
            String mchbd = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                String p = "0";
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM cession2  WHERE Mecano='" + this.mecano.getText() + "' AND pv='" + p + "'");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                int i = 0;
                while (result3.next()) {
                    int monm;
                    String ref = result3.getString("ref");
                    System.out.println("reference=" + ref);
                    if (!ref.equals("")) continue;
                    this.numcheque = result3.getString("ncheque");
                    this.nomadhcheque.setText(result3.getString("Nom"));
                    String di = result3.getString("montant");
                    String di2 = result3.getString("MONT");
                    String red = result3.getString("redevance");
                    if (red.length() > 0) {
                        di = red.substring(0, red.length() - 3);
                        this.montchiffrecheque.setText("#" + di + ",000#");
                        try {
                            monm = Integer.parseInt(di);
                            mchbd = Nombre.CALCULATE.getValue(monm, " Dinars ");
                        }
                        catch (Exception ex) {
                            k = false;
                            JOptionPane.showMessageDialog(null, "erreur convertire montant en lettre ");
                        }
                        this.montantlettrecheque.setText(mchbd);
                        k = true;
                        i = 2;
                    } else if (di2.equals("")) {
                        di = di.substring(0, di.length() - 3);
                        i = 1;
                    } else {
                        di = di2.substring(0, di2.length() - 4);
                        this.montchiffrecheque.setText("#" + di + ",000#");
                        try {
                            monm = Integer.parseInt(di);
                            mchbd = Nombre.CALCULATE.getValue(monm, " Dinars ");
                        }
                        catch (Exception ex) {
                            k = false;
                            JOptionPane.showMessageDialog(null, "erreur convertire montant en lettre ");
                        }
                        this.montantlettrecheque.setText(mchbd);
                        k = true;
                        i = 2;
                    }
                    System.out.println("di = " + di);
                    if (k != false) continue;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state2 = conn2.createStatement();
                        ResultSet result2 = state2.executeQuery("SELECT * FROM montantcession2  WHERE md=" + di);
                        ResultSetMetaData resultMeta2 = result2.getMetaData();
                        String mff = "";
                        while (result2.next()) {
                            mff = result2.getString("mf");
                            System.out.println("mf=" + mff);
                            this.montchiffrecheque.setText("#" + mff + ",000#");
                        }
                        try {
                            int monm2 = Integer.parseInt(mff);
                            mchbd = Nombre.CALCULATE.getValue(monm2, " Dinars ");
                        }
                        catch (Exception ex) {
                            k = false;
                            JOptionPane.showMessageDialog(null, "erreur convertire montant en lettre ");
                        }
                        this.montantlettrecheque.setText(mchbd);
                        k = true;
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur montant F " + e.getMessage());
                    }
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
                k = false;
            }
            if (k) {
                try {
                    System.out.println("23555555");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    k = true;
                    String nb = "1";
                    String imprimeborde = "1";
                    String p = "0";
                    String f = "1";
                    state2.executeUpdate("UPDATE cession2 SET ref='" + referencee + "' WHERE MECANO='" + this.mecano.getText() + "'AND pv='" + p + "'");
                    state2.executeUpdate("UPDATE cession2 SET pv='" + f + "' WHERE MECANO='" + this.mecano.getText() + "'AND pv='" + p + "'");
                    String numcarnet = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM talondescheque  WHERE numcheque='" + this.numcheque + "'");
                        System.out.println("********************************** =");
                        while (result3.next()) {
                            numcarnet = result3.getString("Numcarnet");
                            k = true;
                        }
                         System.out.println("6666996655");
                    }
                    catch (Exception e) {
                        k = false;
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur montant numcheque et num carnet " + e.getMessage());
                    }
                    JOptionPane.showMessageDialog(null, "Impression :carnet de Cheque N\u00b0" + numcarnet + "  et N\u00b0 cheque =" + this.numcheque, "Information", 1);
                    Impression1 sec = new Impression1(this.cheque9);
                    sec.actionPerformed(evt);
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
            Logger.getLogger(impressionchequecession.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(impressionchequecession.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(impressionchequecession.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(impressionchequecession.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new impressionchequecession().setVisible(true);
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

