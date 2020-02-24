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
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class modifiercheque
extends JFrame {
    private JComboBox forni;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel14;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel2;
    private JTextField matricule;
    private JTextField montant;
    private JTextField num;

    public modifiercheque() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jPanel2 = new JPanel();
        this.jLabel11 = new JLabel();
        this.montant = new JTextField();
        this.jLabel12 = new JLabel();
        this.jLabel14 = new JLabel();
        this.num = new JTextField();
        this.matricule = new JTextField();
        this.forni = new JComboBox();
        this.jLabel2 = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel3 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(204, 0, 0));
        this.jLabel1.setText("Fournisseur");
        this.jPanel2.setLayout(null);
        this.jLabel11.setFont(new Font("Tahoma", 1, 18));
        this.jLabel11.setText("N\u00b0 de cheque : ");
        this.jPanel2.add(this.jLabel11);
        this.jLabel11.setBounds(0, 10, 139, 22);
        this.jPanel2.add(this.montant);
        this.montant.setBounds(140, 80, 210, 30);
        this.jLabel12.setFont(new Font("Tahoma", 1, 18));
        this.jLabel12.setText("Matricule :");
        this.jPanel2.add(this.jLabel12);
        this.jLabel12.setBounds(0, 40, 97, 30);
        this.jLabel14.setFont(new Font("Tahoma", 1, 18));
        this.jLabel14.setText("Montant  :");
        this.jPanel2.add(this.jLabel14);
        this.jLabel14.setBounds(0, 80, 93, 30);
        this.jPanel2.add(this.num);
        this.num.setBounds(140, 0, 210, 30);
        this.jPanel2.add(this.matricule);
        this.matricule.setBounds(140, 40, 210, 30);
        this.forni.setFont(new Font("Tahoma", 0, 14));
        this.forni.setModel(new DefaultComboBoxModel<String>(new String[]{".........", "Nom", "Sociter"}));
        this.jPanel2.add(this.forni);
        this.forni.setBounds(140, 130, 100, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("fournisseur :");
        this.jPanel2.add(this.jLabel2);
        this.jLabel2.setBounds(0, 140, 90, 20);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/annuler/dessiner-modifier-crayon-ecrivez-icone-5630-32.png")));
        this.jButton1.setText("Valider la Modification");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifiercheque.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton1);
        this.jButton1.setBounds(90, 170, 210, 40);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/annuler/Close-icon.png")));
        this.jButton2.setText("Quitter");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifiercheque.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton2);
        this.jButton2.setBounds(310, 170, 110, 40);
        this.jLabel3.setFont(new Font("Tahoma", 1, 24));
        this.jLabel3.setForeground(new Color(204, 0, 0));
        this.jLabel3.setText("Modification de cheque");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(130, 130, 130).addComponent(this.jLabel1, -2, 160, -2)).addGroup(layout.createSequentialGroup().addGap(89, 89, 89).addComponent(this.jLabel3, -2, 326, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -2, 430, -2))).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel3, -2, 26, -2).addGap(4, 4, 4).addComponent(this.jLabel1, -2, 26, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel2, -2, 220, -2).addGap(11, 11, 11)));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean k = false;
        String nomfournisseur = "";
        try {
            Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state4 = conn4.createStatement();
            ResultSet result4 = state4.executeQuery("SELECT * FROM etatchequef  WHERE f='1' AND numcheque='" + this.num.getText() + "'");
            while (result4.next()) {
                k = true;
            }
        }
        catch (Exception e) {
            k = false;
            JOptionPane.showMessageDialog(null, "Numero de cheque n'existe pas  " + e.getMessage());
        }
        if (k) {
            Date actuellEe = new Date();
            SimpleDateFormat dateFormatt = new SimpleDateFormat("MM-yyyy");
            String datdd = dateFormatt.format(actuellEe);
            SimpleDateFormat dateFormatt2 = new SimpleDateFormat("dd-MM-yyyy");
            String datdd2 = dateFormatt.format(actuellEe);
            try {
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement stat = conn3.createStatement();
                String mat = this.matricule.getText();
                try {
                    Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state4 = conn4.createStatement();
                    ResultSet result4 = state4.executeQuery("SELECT * FROM ffournis  WHERE MATRIC='" + this.matricule.getText() + "'");
                    while (result4.next()) {
                        k = true;
                        if (this.forni.getSelectedItem().equals("Nom")) {
                            nomfournisseur = result4.getString("NOM");
                            continue;
                        }
                        if (!this.forni.getSelectedItem().equals("Sociter")) continue;
                        nomfournisseur = result4.getString("NOMSOC");
                    }
                }
                catch (Exception e) {
                    k = false;
                    JOptionPane.showMessageDialog(null, "Matricule de Fournisseur n'existe pas " + e.getMessage());
                }
                if (k) {
                    stat.executeUpdate("UPDATE etatchequef SET matric='" + this.matricule.getText() + "' WHERE numcheque='" + this.num.getText() + "'");
                    stat.executeUpdate("UPDATE etatchequef SET mois='" + datdd + "' WHERE numcheque='" + this.num.getText() + "'");
                    stat.executeUpdate("UPDATE etatchequef SET montant='" + this.montant.getText() + "' WHERE numcheque='" + this.num.getText() + "'");
                    stat.executeUpdate("UPDATE etatchequef SET TIREUR='" + nomfournisseur + "' WHERE numcheque='" + this.num.getText() + "'");
                    stat.executeUpdate("UPDATE talondescheque SET Mecano='" + this.matricule.getText() + "' WHERE numcheque='" + this.num.getText() + "'");
                    stat.executeUpdate("UPDATE talondescheque SET Montant='" + this.montant.getText() + "' WHERE numcheque='" + this.num.getText() + "'");
                    stat.executeUpdate("UPDATE talondescheque SET date='" + datdd2 + "' WHERE numcheque='" + this.num.getText() + "'");
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de modife fin : " + e.getMessage());
                k = false;
            }
        }
        JOptionPane jop1 = new JOptionPane();
        JOptionPane.showMessageDialog(null, "Succes de modification  ", "Information", 1);
        this.setVisible(false);
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
            Logger.getLogger(modifiercheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(modifiercheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(modifiercheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(modifiercheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new modifiercheque().setVisible(true);
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

