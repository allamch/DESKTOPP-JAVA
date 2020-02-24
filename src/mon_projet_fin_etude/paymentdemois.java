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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.recherchecarnedecheque;

public class paymentdemois
extends JPanel {
    String nomadh = "";
    String ch = "";
    String mont = "";
    String parmois = "";
    int k = 0;
    int num = 0;
    String moiactueleenlettre = "";
    String type = "";
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    double Nch;
    double Nfin;
    String numcarnetreserver = "";
    private JTextField a;
    private JButton jButton1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JComboBox m;
    private JTextField mecano;
    private JLabel nomt;

    public paymentdemois() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.mecano = new JTextField();
        this.jButton1 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.nomt = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.m = new JComboBox();
        this.jLabel5 = new JLabel();
        this.a = new JTextField();
        this.jLabel2 = new JLabel();
        this.jPanel2.setLayout(null);
        this.mecano.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                paymentdemois.this.mecanoMouseClicked(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                paymentdemois.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel2.add(this.mecano);
        this.mecano.setBounds(130, 40, 110, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/gestion cheque/aaa.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                paymentdemois.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton1);
        this.jButton1.setBounds(630, 40, 50, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                paymentdemois.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"Mecano", "Nom et prenom", "payment par"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                paymentdemois.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                paymentdemois.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                paymentdemois.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel2.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 110, 700, 400);
        this.nomt.setFont(new Font("Tahoma", 1, 14));
        this.nomt.setText("...............................................................");
        this.jPanel2.add(this.nomt);
        this.nomt.setBounds(90, 80, 590, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setForeground(new Color(153, 0, 153));
        this.jLabel3.setText("Ann\u00e9e :");
        this.jPanel2.add(this.jLabel3);
        this.jLabel3.setBounds(430, 40, 70, 35);
        this.jLabel4.setFont(new Font("Tahoma", 1, 18));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("Mecano :");
        this.jPanel2.add(this.jLabel4);
        this.jLabel4.setBounds(30, 40, 83, 35);
        this.m.setFont(new Font("Tahoma", 1, 14));
        this.m.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m.setEnabled(false);
        this.jPanel2.add(this.m);
        this.m.setBounds(350, 40, 60, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 18));
        this.jLabel5.setForeground(new Color(153, 0, 153));
        this.jLabel5.setText("mois :");
        this.jPanel2.add(this.jLabel5);
        this.jLabel5.setBounds(280, 40, 60, 35);
        this.a.setFont(new Font("Tahoma", 1, 14));
        this.a.setEnabled(false);
        this.jPanel2.add(this.a);
        this.a.setBounds(510, 40, 100, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 24));
        this.jLabel2.setForeground(new Color(102, 0, 102));
        this.jLabel2.setText("Consultation payments des adherents ");
        this.jPanel2.add(this.jLabel2);
        this.jLabel2.setBounds(120, 4, 460, 30);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, 717, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -1, 501, 32767).addContainerGap()));
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.nomt.setText(".........................");
        if (this.m.getSelectedItem().toString().equals("00")) {
            this.nomt.setText("..............................");
            this.ch = this.a.getText();
            boolean j = false;
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Mois");
            dt1.addColumn("Monatnt");
            this.k = 0;
            this.jTable1.setModel(dt1);
            int aa = Integer.parseInt(this.a.getText());
            for (int i = 1; i <= 12; ++i) {
                Double totale = 0.0;
                int mm = i;
                System.out.println("Voici la ligne " + i);
                switch (i) {
                    case 1: {
                        this.ch = "Janvier";
                        break;
                    }
                    case 2: {
                        this.ch = "F\u00e9vrier";
                        break;
                    }
                    case 3: {
                        this.ch = "Mars";
                        break;
                    }
                    case 4: {
                        this.ch = "Avril";
                        break;
                    }
                    case 5: {
                        this.ch = "Mai";
                        break;
                    }
                    case 6: {
                        this.ch = "Juin";
                        break;
                    }
                    case 7: {
                        this.ch = "Juillet";
                        break;
                    }
                    case 8: {
                        this.ch = "Ao\u00fbt";
                        break;
                    }
                    case 9: {
                        this.ch = "Septembre";
                        break;
                    }
                    case 10: {
                        this.ch = "Octobre";
                        break;
                    }
                    case 11: {
                        this.ch = "Novembre";
                        break;
                    }
                    case 12: {
                        this.ch = "D\u00e9cembre";
                        break;
                    }
                    default: {
                        this.ch = "Invalid month";
                    }
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/cmd?useUnicode=true&characterEncoding=UTF-8", "root", "root");
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc1 WHERE MatAD='" + this.mecano.getText() + "'");
                    while (result2.next()) {
                        this.k = 1;
                        this.nomt.setText(result2.getString("NomAD"));
                        String datedebut = "";
                        datedebut = result2.getString("datedebut");
                        String datedefin = result2.getString("datefin");
                        if (datedebut.equals("") || datedefin.equals("")) {
                            System.out.println("---------*******************------");
                            continue;
                        }
                        int md = Integer.parseInt(datedebut.substring(3, datedebut.length() - 5));
                        int ad = Integer.parseInt(datedebut.substring(6, datedebut.length()));
                        int mf = Integer.parseInt(datedefin.substring(3, datedefin.length() - 5));
                        int af = Integer.parseInt(datedefin.substring(6, datedefin.length()));
                        if (!(ad < aa && aa < af || ad == aa && md <= mm && mf >= mm) && (af != aa || mf < mm)) continue;
                        System.out.println("---------------------------");
                        System.out.println("datedebut=" + datedebut);
                        System.out.println("datefin=" + datedefin);
                        String MAT = result2.getString("MAT");
                        String NOMSOC = result2.getString("NOMSOC");
                        String m = result2.getString("Mantmois");
                        System.out.println("montant= " + m);
                        m = m.replace(",", ".");
                        Double Mantmois = Double.parseDouble(m);
                        System.out.println("Montant par mois :" + m);
                        totale = Mantmois + totale;
                    }
                    if (this.k == 0) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adherent n'existe pas !!");
                        this.nomt.setText(".........................");
                    }
                    Object[] stg = new Object[]{this.ch, totale};
                    dt1.addRow(stg);
                    continue;
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }
        } else {
            this.ch = this.m.getSelectedItem().toString() + "/" + this.a.getText();
            boolean j = false;
            Double totale = 0.0;
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Matricule");
            dt1.addColumn("Nom sociter");
            dt1.addColumn("Monatnt");
            dt1.addColumn("date debut");
            dt1.addColumn("date fin");
            this.k = 0;
            this.jTable1.setModel(dt1);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/cmd?useUnicode=true&characterEncoding=UTF-8", "root", "root");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc1 WHERE MatAD='" + this.mecano.getText() + "'");
                int aa = Integer.parseInt(this.a.getText());
                int mm = Integer.parseInt(this.m.getSelectedItem().toString());
                while (result2.next()) {
                    this.k = 1;
                    this.nomt.setText(result2.getString("NomAD"));
                    String datedebut = "";
                    datedebut = result2.getString("datedebut");
                    String datedefin = result2.getString("datefin");
                    if (datedebut.equals("") || datedefin.equals("")) {
                        System.out.println("---------*******************------");
                        continue;
                    }
                    int md = Integer.parseInt(datedebut.substring(3, datedebut.length() - 5));
                    int ad = Integer.parseInt(datedebut.substring(6, datedebut.length()));
                    int mf = Integer.parseInt(datedefin.substring(3, datedefin.length() - 5));
                    int af = Integer.parseInt(datedefin.substring(6, datedefin.length()));
                    if (!(ad < aa && aa < af || ad == aa && md <= mm && mf >= mm) && (af != aa || mf < mm)) continue;
                    System.out.println("---------------------------");
                    System.out.println("datedebut=" + datedebut);
                    System.out.println("datefin=" + datedefin);
                    String MAT = result2.getString("MAT");
                    String NOMSOC = result2.getString("NOMSOC");
                    String m = result2.getString("Mantmois");
                    System.out.println("montant= " + m);
                    m = m.replace(",", ".");
                    Double Mantmois = Double.parseDouble(m);
                    System.out.println("Montant par mois :" + m);
                    totale = Mantmois + totale;
                    Object[] stg = new Object[]{MAT, NOMSOC, m, datedebut, datedefin};
                    dt1.addRow(stg);
                }
                if (this.k == 0) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Adherent n'existe pas !!");
                    this.nomt.setText(".........................");
                }
                Object[] stg = new Object[]{"****", "totale =>", totale, "****", "****"};
                dt1.addRow(stg);
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
        }
    }

    private void mecanoMouseClicked(MouseEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        JOptionPane jop3;
        Statement state3;
        ResultSetMetaData resultMeta3;
        ResultSet result3;
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean kk = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            state3 = conn2.createStatement();
            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
            resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nomt.setText(result3.getString("nom"));
                kk = true;
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
        }
        if (!kk) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.nomt.setText(result3.getString("nom"));
                    kk = true;
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
            }
        }
        if (kk) {
            this.m.enable(true);
            this.a.enable(true);
        } else {
            this.m.enable(false);
            this.a.enable(false);
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

