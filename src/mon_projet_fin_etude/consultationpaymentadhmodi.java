/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class consultationpaymentadhmodi
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
    private JTable ca;
    private JButton jButton1;
    private JButton jButton3;
    private JCheckBox jCheckBox1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1;
    private JComboBox m;
    private JLabel matf;
    private JTextField mecano;
    private JLabel nomt;
    private JLabel numc;

    public consultationpaymentadhmodi() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.mecano = new JTextField();
        this.jButton1 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.ca = new JTable();
        this.nomt = new JLabel();
        this.numc = new JLabel();
        this.jLabel4 = new JLabel();
        this.m = new JComboBox();
        this.jLabel5 = new JLabel();
        this.a = new JTextField();
        this.jLabel2 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jButton3 = new JButton();
        this.jLabel7 = new JLabel();
        this.matf = new JLabel();
        this.jLabel8 = new JLabel();
        this.jCheckBox1 = new JCheckBox();
        this.jPanel2.setLayout(null);
        this.mecano.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                consultationpaymentadhmodi.this.mecanoMouseClicked(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                consultationpaymentadhmodi.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel2.add(this.mecano);
        this.mecano.setBounds(100, 30, 110, 30);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/gestion cheque/aaa.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                consultationpaymentadhmodi.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton1);
        this.jButton1.setBounds(540, 30, 50, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                consultationpaymentadhmodi.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}}, new String[]{"MatF", "Nom SC", "Montant", "Date debut", "Date fin", "Mens", "N\u00b0 C", "ACC", "Codebc"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setIntercellSpacing(new Dimension(2, 2));
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                consultationpaymentadhmodi.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                consultationpaymentadhmodi.this.caMouseEntered(evt);
            }
        });
        this.ca.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                consultationpaymentadhmodi.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.ca);
        this.jPanel2.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 110, 720, 320);
        this.nomt.setFont(new Font("Tahoma", 1, 14));
        this.nomt.setText("...............................................................");
        this.jPanel2.add(this.nomt);
        this.nomt.setBounds(10, 60, 350, 17);
        this.numc.setFont(new Font("Tahoma", 1, 18));
        this.numc.setForeground(new Color(153, 0, 153));
        this.numc.setText("matF");
        this.jPanel2.add(this.numc);
        this.numc.setBounds(180, 80, 140, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 18));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("Mecano :");
        this.jPanel2.add(this.jLabel4);
        this.jLabel4.setBounds(3, 25, 90, 40);
        this.m.setFont(new Font("Tahoma", 1, 14));
        this.m.setModel(new DefaultComboBoxModel<String>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m.setEnabled(false);
        this.m.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                consultationpaymentadhmodi.this.mMouseClicked(evt);
            }
        });
        this.jPanel2.add(this.m);
        this.m.setBounds(280, 30, 60, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 18));
        this.jLabel5.setForeground(new Color(153, 0, 153));
        this.jLabel5.setText("mois :");
        this.jPanel2.add(this.jLabel5);
        this.jLabel5.setBounds(220, 30, 60, 35);
        this.a.setFont(new Font("Tahoma", 1, 14));
        this.a.setEnabled(false);
        this.jPanel2.add(this.a);
        this.a.setBounds(440, 30, 100, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 24));
        this.jLabel2.setForeground(new Color(102, 0, 102));
        this.jLabel2.setText("Consultation paiement des adherants  par mois");
        this.jPanel2.add(this.jLabel2);
        this.jLabel2.setBounds(70, -6, 570, 30);
        this.jTextField1.setFont(new Font("Tahoma", 1, 10));
        this.jPanel2.add(this.jTextField1);
        this.jTextField1.setBounds(550, 70, 90, 30);
        this.jButton3.setText("Modifier");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                consultationpaymentadhmodi.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton3);
        this.jButton3.setBounds(620, 30, 80, 30);
        this.jLabel7.setFont(new Font("Tahoma", 1, 18));
        this.jLabel7.setForeground(new Color(153, 0, 153));
        this.jLabel7.setText("Code  :");
        this.jPanel2.add(this.jLabel7);
        this.jLabel7.setBounds(480, 70, 70, 30);
        this.matf.setFont(new Font("Tahoma", 1, 18));
        this.matf.setForeground(new Color(153, 0, 153));
        this.matf.setText("matF");
        this.jPanel2.add(this.matf);
        this.matf.setBounds(10, 80, 140, 30);
        this.jLabel8.setFont(new Font("Tahoma", 1, 18));
        this.jLabel8.setForeground(new Color(153, 0, 153));
        this.jLabel8.setText("Ann\u00e9e :");
        this.jPanel2.add(this.jLabel8);
        this.jLabel8.setBounds(360, 30, 70, 35);
        this.jCheckBox1.setFont(new Font("Tahoma", 1, 14));
        this.jCheckBox1.setText("Valider");
        this.jPanel2.add(this.jCheckBox1);
        this.jCheckBox1.setBounds(390, 73, 81, 30);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, 737, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, 436, -2));
    }

    private void caMouseClicked(MouseEvent evt) {
        int lign = this.ca.getSelectedRow();
        String m = this.ca.getModel().getValueAt(lign, 8).toString();
        this.matf.setText(this.ca.getModel().getValueAt(lign, 0).toString());
        this.numc.setText(this.ca.getModel().getValueAt(lign, 6).toString());
        this.jTextField1.setText(m);
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        int cc = 0;
        int aa = Integer.parseInt(this.a.getText());
        if (this.m.getSelectedItem().toString().equals("00")) {
            this.ch = this.a.getText();
            boolean j = false;
            this.k = 0;
            for (int i = 1; i <= 12; ++i) {
                Statement state3;
                ResultSet result3;
                JOptionPane jop3;
                ResultSetMetaData resultMeta3;
                int totale = 0;
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
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc WHERE Mecano='" + this.mecano.getText() + "'");
                    cc = 0;
                    this.k = 0;
                    while (result2.next()) {
                        String datedebut = "";
                        int md = Integer.parseInt(result2.getString("moisdebut"));
                        System.out.println("md = " + md);
                        int ad = Integer.parseInt(result2.getString("anneesdebut"));
                        System.out.println("ad = " + ad);
                        int nbmois = Integer.parseInt(result2.getString("nbmois"));
                        System.out.println("nb mois = " + nbmois);
                        int mf = 0;
                        int af = 0;
                        if (md + nbmois <= 12) {
                            mf = md + nbmois - 1;
                            af = ad;
                        } else {
                            mf = md + nbmois - 1;
                            af = ad;
                            while (mf > 12) {
                                mf -= 12;
                                ++af;
                            }
                        }
                        System.out.println("mf = " + mf);
                        System.out.println("af = " + af);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date datedebutt = sdf.parse("" + ad + "-" + md + "-01");
                        String db = "" + md + "-" + ad;
                        Date datefinn = sdf.parse("" + af + "-" + mf + "-01");
                        String df = "" + mf + "-" + af;
                        Date datet = sdf.parse("" + aa + "-" + mm + "-01");
                        String duti = "" + mm + "-" + aa;
                        if (datedebutt.compareTo(datet) != 0 && datefinn.compareTo(datet) != 0 && (!datedebutt.before(datet) || !datet.before(datefinn))) continue;
                        System.out.println("---------------------------");
                        int mu = Integer.parseInt(this.m.getSelectedItem().toString());
                        int au = Integer.parseInt(this.a.getText());
                        String nbc = result2.getString("nbc");
                        String na = nbc + " / " + ad;
                        int nn = mu - md + 1 + (au - ad) * 12;
                        String n = "" + nn + " / " + nbmois;
                        this.k = 1;
                        String avance = result2.getString("accompte");
                        String acc = avance + "";
                        if (acc.length() >= 3) {
                            acc = new StringBuilder(acc).insert(acc.length() - 3, ".").toString();
                        }
                        int montantparmois = (Integer.parseInt(result2.getString("montantbc")) - Integer.parseInt(result2.getString("accompte"))) / nbmois;
                        System.out.println("montant= " + montantparmois);
                        String stac = "" + montantparmois + "";
                        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                        totale = montantparmois + totale;
                        cc = 1;
                    }
                }
                catch (Exception e) {
                    jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM  demandefdd WHERE Mecano='" + this.mecano.getText() + "'");
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        String moisdebut = result3.getString("datedebut");
                        String moisd = moisdebut.substring(0, moisdebut.length() - 6);
                        String aaa = moisdebut.substring(moisdebut.length() - 4, moisdebut.length());
                        System.out.println("mois debut =" + moisd);
                        System.out.println("a = " + aaa);
                        int ad = Integer.parseInt(aaa);
                        int nbmois = Integer.parseInt(result3.getString("Nbmois"));
                        System.out.println("mois debut =" + moisd + "--");
                        moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                        int md = Integer.parseInt(moisdebut);
                        int mf = 0;
                        int af = 0;
                        if (md + nbmois <= 12) {
                            mf = md + nbmois - 1;
                            af = ad;
                        } else {
                            mf = md + nbmois - 1;
                            af = ad;
                            while (mf > 12) {
                                mf -= 12;
                                ++af;
                            }
                        }
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date datedebutt = sdf.parse("" + ad + "-" + md + "-01");
                        String db = "" + md + "-" + ad;
                        Date datefinn = sdf.parse("" + af + "-" + mf + "-01");
                        String df = "" + mf + "-" + af;
                        Date datet = sdf.parse("" + aa + "-" + mm + "-01");
                        String duti = "" + mm + "-" + aa;
                        if (datedebutt.compareTo(datet) != 0 && datefinn.compareTo(datet) != 0 && (!datedebutt.before(datet) || !datet.before(datefinn))) continue;
                        System.out.println("---------------------------");
                        int mu = Integer.parseInt(this.m.getSelectedItem().toString());
                        int au = Integer.parseInt(this.a.getText());
                        String nbc = result3.getString("nbch");
                        String na = nbc + " / " + ad;
                        int nn = mu - md + 1 + (au - ad) * 12;
                        String n = "" + nn + " / " + nbmois;
                        this.k = 1;
                        String maChaine = result3.getString("Montant");
                        maChaine = maChaine.replace(",", "");
                        int montantparmois = Integer.parseInt(maChaine) / nbmois;
                        System.out.println("montant= " + montantparmois);
                        String stac = "" + montantparmois + "";
                        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                        cc = 2;
                        totale = montantparmois + totale;
                        cc = 1;
                    }
                }
                catch (Exception e) {
                    jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM  cession2 WHERE mecano='" + this.mecano.getText() + "'");
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        String nbc = result3.getString("n406");
                        if (nbc.equals("0")) continue;
                        String moisdebut = result3.getString("premiermois");
                        String moisd = moisdebut.substring(0, moisdebut.length() - 6);
                        String aaa = moisdebut.substring(moisdebut.length() - 4, moisdebut.length());
                        System.out.println("mois debut =" + moisd);
                        System.out.println("a = " + aaa);
                        int ad = Integer.parseInt(aaa);
                        int nbmois = Integer.parseInt(result3.getString("Nbmois"));
                        System.out.println("mois debut =" + moisd + "--");
                        moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                        int md = Integer.parseInt(moisdebut);
                        int mf = 0;
                        int af = 0;
                        if (md + nbmois <= 12) {
                            mf = md + nbmois - 1;
                            af = ad;
                        } else {
                            mf = md + nbmois - 1;
                            af = ad;
                            while (mf > 12) {
                                mf -= 12;
                                ++af;
                            }
                        }
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date datedebutt = sdf.parse("" + ad + "-" + md + "-01");
                        String db = "" + md + "-" + ad;
                        Date datefinn = sdf.parse("" + af + "-" + mf + "-01");
                        String df = "" + mf + "-" + af;
                        Date datet = sdf.parse("" + aa + "-" + mm + "-01");
                        String duti = "" + mm + "-" + aa;
                        if (datedebutt.compareTo(datet) != 0 && datefinn.compareTo(datet) != 0 && (!datedebutt.before(datet) || !datet.before(datefinn))) continue;
                        System.out.println("---------------------------");
                        int mu = Integer.parseInt(this.m.getSelectedItem().toString());
                        int au = Integer.parseInt(this.a.getText());
                        String codeb = result3.getString("bq406");
                        String na = nbc + " / " + ad;
                        int nn = mu - md + 1 + (au - ad) * 12;
                        String n = "" + nn + " / " + nbmois;
                        this.k = 1;
                        String maChaine = result3.getString("montantparmois");
                        maChaine = maChaine.replace(",", "");
                        int montantparmois = Integer.parseInt(maChaine);
                        System.out.println("montant= " + montantparmois);
                        String stac = "" + montantparmois + "";
                        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                        String nomsc = "";
                        totale = montantparmois + totale;
                    }
                }
                catch (Exception e) {
                    jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                }
                System.out.println("-----jjjjjjjjjjjjjjjjjjjjj--------");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("------------------------ffffffffffff-------");
                    state3 = conn2.createStatement();
                    System.out.println("--------dss-----------------------");
                    result3 = state3.executeQuery("SELECT * FROM  cotisation WHERE Mecano='" + this.mecano.getText() + "'");
                    System.out.println("-------------------dddddddddd------------");
                    resultMeta3 = result3.getMetaData();
                    System.out.println("------------------------sssssssssss-------");
                    while (result3.next()) {
                        String m = result3.getString("montant");
                        String stac = m + "";
                        int monts = Integer.parseInt(m);
                        totale = monts + totale;
                        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                    }
                }
                catch (Exception e) {
                    jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                }
                if (this.k == 1 && (cc == 1 || cc == 2)) {
                    totale += 600;
                }
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM  forfaitdemadeorange WHERE mecano='" + this.mecano.getText() + "'");
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        String nomforfait = result3.getString("nomforfait");
                        String m = "";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state4 = conn2.createStatement();
                            ResultSet result4 = state4.executeQuery("SELECT * FROM  forfaitorange WHERE nom='" + nomforfait + "'");
                            ResultSetMetaData resultMeta4 = result4.getMetaData();
                            while (result4.next()) {
                                m = result4.getString("Montant");
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop32 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 2: " + e.getMessage());
                        }
                        String stac = m + "";
                        int monts = Integer.parseInt(m);
                        totale = monts + totale;
                    }
                }
                catch (Exception e) {
                    jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                }
                String stac = "" + totale + "";
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                Object[] stg = new Object[]{i, stac};
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        } else {
            ResultSet result3;
            Statement state3;
            ResultSetMetaData resultMeta3;
            JOptionPane jop3;
            this.ch = this.m.getSelectedItem().toString() + "/" + this.a.getText();
            boolean j = false;
            int totale = 0;
            DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
            DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
            while (medelo.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }
            this.k = 0;
            String matf = "";
            int mm = Integer.parseInt(this.m.getSelectedItem().toString());
            System.out.println("mm= " + mm);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc WHERE Mecano='" + this.mecano.getText() + "'");
                this.k = 0;
                while (result2.next()) {
                    String datedebut = "";
                    int md = Integer.parseInt(result2.getString("moisdebut"));
                    System.out.println("md = " + md);
                    int ad = Integer.parseInt(result2.getString("anneesdebut"));
                    System.out.println("ad = " + ad);
                    int nbmois = Integer.parseInt(result2.getString("nbmois"));
                    System.out.println("nb mois = " + nbmois);
                    int mf = 0;
                    int af = 0;
                    if (md + nbmois <= 12) {
                        mf = md + nbmois - 1;
                        af = ad;
                    } else {
                        mf = md + nbmois - 1;
                        af = ad;
                        while (mf > 12) {
                            mf -= 12;
                            ++af;
                        }
                    }
                    System.out.println("mf = " + mf);
                    System.out.println("af = " + af);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date datedebutt = sdf.parse("" + ad + "-" + md + "-01");
                    String db = "" + md + "-" + ad;
                    Date datefinn = sdf.parse("" + af + "-" + mf + "-01");
                    String df = "" + mf + "-" + af;
                    Date datet = sdf.parse("" + aa + "-" + mm + "-01");
                    String duti = "" + mm + "-" + aa;
                    if (datedebutt.compareTo(datet) != 0 && datefinn.compareTo(datet) != 0 && (!datedebutt.before(datet) || !datet.before(datefinn))) continue;
                    System.out.println("---------------------------");
                    int mu = Integer.parseInt(this.m.getSelectedItem().toString());
                    int au = Integer.parseInt(this.a.getText());
                    String nbc = result2.getString("nbc");
                    String na = nbc + " / " + ad;
                    int nn = mu - md + 1 + (au - ad) * 12;
                    String n = "" + nn + " / " + nbmois;
                    matf = result2.getString("matf");
                    this.k = 1;
                    String codeb = result2.getString("codeb");
                    String avance = result2.getString("accompte");
                    String acc = avance + "";
                    if (acc.length() >= 3) {
                        acc = new StringBuilder(acc).insert(acc.length() - 3, ".").toString();
                    }
                    int montantparmois = (Integer.parseInt(result2.getString("montantbc")) - Integer.parseInt(result2.getString("accompte"))) / nbmois;
                    System.out.println("montant= " + montantparmois);
                    String stac = "" + montantparmois + "";
                    stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                    String nomsc = "";
                    totale = montantparmois + totale;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state32 = conn2.createStatement();
                        ResultSet result32 = state32.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + matf + "'");
                        ResultSetMetaData resultMeta32 = result32.getMetaData();
                        while (result32.next()) {
                            nomsc = result32.getString("NOMSOC");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop33 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                    cc = 1;
                    medelo.addRow(new Object[]{matf, nomsc, stac, db, df, n, na, acc, codeb, false});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM  demandefdd WHERE Mecano='" + this.mecano.getText() + "'");
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    String moisdebut = result3.getString("datedebut");
                    String moisd = moisdebut.substring(0, moisdebut.length() - 6);
                    String aaa = moisdebut.substring(moisdebut.length() - 4, moisdebut.length());
                    System.out.println("mois debut =" + moisd);
                    System.out.println("a = " + aaa);
                    int ad = Integer.parseInt(aaa);
                    int nbmois = Integer.parseInt(result3.getString("Nbmois"));
                    System.out.println("mois debut =" + moisd + "--");
                    moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                    int md = Integer.parseInt(moisdebut);
                    int mf = 0;
                    int af = 0;
                    if (md + nbmois <= 12) {
                        mf = md + nbmois - 1;
                        af = ad;
                    } else {
                        mf = md + nbmois - 1;
                        af = ad;
                        while (mf > 12) {
                            mf -= 12;
                            ++af;
                        }
                    }
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date datedebutt = sdf.parse("" + ad + "-" + md + "-01");
                    String db = "" + md + "-" + ad;
                    Date datefinn = sdf.parse("" + af + "-" + mf + "-01");
                    String df = "" + mf + "-" + af;
                    Date datet = sdf.parse("" + aa + "-" + mm + "-01");
                    String duti = "" + mm + "-" + aa;
                    if (datedebutt.compareTo(datet) != 0 && datefinn.compareTo(datet) != 0 && (!datedebutt.before(datet) || !datet.before(datefinn))) continue;
                    System.out.println("---------------------------");
                    int mu = Integer.parseInt(this.m.getSelectedItem().toString());
                    int au = Integer.parseInt(this.a.getText());
                    String nbc = result3.getString("nbch");
                    String na = nbc + " / " + ad;
                    int nn = mu - md + 1 + (au - ad) * 12;
                    String n = "" + nn + " / " + nbmois;
                    this.k = 1;
                    String maChaine = result3.getString("Montant");
                    maChaine = maChaine.replace(",", "");
                    int montantparmois = Integer.parseInt(maChaine) / nbmois;
                    System.out.println("montant= " + montantparmois);
                    String stac = "" + montantparmois + "";
                    stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                    String nomsc = "";
                    totale = montantparmois + totale;
                    cc = 2;
                    medelo.addRow(new Object[]{"230", " Pret FDD", stac, db, df, n, na, "", "", false});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM  cession2 WHERE mecano='" + this.mecano.getText() + "'");
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    String n406 = result3.getString("n406");
                    if (n406.equals("0")) continue;
                    String moisdebut = result3.getString("premiermois");
                    String moisd = moisdebut.substring(0, moisdebut.length() - 6);
                    String aaa = moisdebut.substring(moisdebut.length() - 4, moisdebut.length());
                    System.out.println("mois debut =" + moisd);
                    System.out.println("a = " + aaa);
                    int ad = Integer.parseInt(aaa);
                    int nbmois = Integer.parseInt(result3.getString("Nbmois"));
                    System.out.println("mois debut =" + moisd + "--");
                    moisdebut = moisd.equals("Janvier") ? "01" : (moisd.equals("F\u00e9vrier") ? "02" : (moisd.equals("Mars") ? "03" : (moisd.equals("Avril") ? "04" : (moisd.equals("Mai") ? "05" : (moisd.equals("Juin") ? "06" : (moisd.equals("Juillet") ? "07" : (moisd.equals("Ao\u00fbt") ? "08" : (moisd.equals("Septembre") ? "09" : (moisd.equals("Octobre") ? "10" : (moisd.equals("Novembre") ? "11" : (moisd.equals("D\u00e9cembre") ? "12" : "00")))))))))));
                    int md = Integer.parseInt(moisdebut);
                    int mf = 0;
                    int af = 0;
                    if (md + nbmois <= 12) {
                        mf = md + nbmois - 1;
                        af = ad;
                    } else {
                        mf = md + nbmois - 1;
                        af = ad;
                        while (mf > 12) {
                            mf -= 12;
                            ++af;
                        }
                    }
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date datedebutt = sdf.parse("" + ad + "-" + md + "-01");
                    String db = "" + md + "-" + ad;
                    Date datefinn = sdf.parse("" + af + "-" + mf + "-01");
                    String df = "" + mf + "-" + af;
                    Date datet = sdf.parse("" + aa + "-" + mm + "-01");
                    String duti = "" + mm + "-" + aa;
                    if (datedebutt.compareTo(datet) != 0 && datefinn.compareTo(datet) != 0 && (!datedebutt.before(datet) || !datet.before(datefinn))) continue;
                    System.out.println("---------------------------");
                    int mu = Integer.parseInt(this.m.getSelectedItem().toString());
                    int au = Integer.parseInt(this.a.getText());
                    String nbc = result3.getString("n406");
                    String codeb = result3.getString("bq406");
                    String na = nbc + " / " + ad;
                    int nn = mu - md + 1 + (au - ad) * 12;
                    String n = "" + nn + " / " + nbmois;
                    this.k = 1;
                    String maChaine = result3.getString("montantparmois");
                    maChaine = maChaine.replace(",", "");
                    int montantparmois = Integer.parseInt(maChaine);
                    System.out.println("montant= " + montantparmois);
                    String stac = "" + montantparmois + "";
                    stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                    String nomsc = "";
                    totale = montantparmois + totale;
                    cc = 2;
                    medelo.addRow(new Object[]{"406", "CS:PYT Direct", stac, db, df, n, na, "", codeb, false});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
            }
            System.out.println("-----jjjjjjjjjjjjjjjjjjjjj--------");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("------------------------ffffffffffff-------");
                state3 = conn2.createStatement();
                System.out.println("--------dss-----------------------");
                result3 = state3.executeQuery("SELECT * FROM  cotisation WHERE Mecano='" + this.mecano.getText() + "'");
                System.out.println("-------------------dddddddddd------------");
                resultMeta3 = result3.getMetaData();
                System.out.println("------------------------sssssssssss-------");
                while (result3.next()) {
                    String m = result3.getString("montant");
                    String stac = m + "";
                    int monts = Integer.parseInt(m);
                    totale = monts + totale;
                    stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                    medelo.addRow(new Object[]{"--", " Cotitation", stac, "", "", "", "", "", false});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
            }
            if (this.k == 1 && (cc == 1 || cc == 2)) {
                medelo.addRow(new Object[]{"--", "Droit fix", "0.600", "", "", "", "", "", "", false});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                totale += 600;
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM  forfaitdemadeorange WHERE mecano='" + this.mecano.getText() + "'");
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    String nomforfait = result3.getString("nomforfait");
                    String m = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state4 = conn2.createStatement();
                        ResultSet result4 = state4.executeQuery("SELECT * FROM  forfaitorange WHERE nom='" + nomforfait + "'");
                        ResultSetMetaData resultMeta4 = result4.getMetaData();
                        while (result4.next()) {
                            m = result4.getString("Montant");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop34 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 2: " + e.getMessage());
                    }
                    String stac = m + "";
                    int monts = Integer.parseInt(m);
                    totale = monts + totale;
                    stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                    medelo.addRow(new Object[]{"--", nomforfait, stac, "", "", "", "", "", "", false});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
            }
            String tt = "" + totale + "";
            tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
            medelo.addRow(new Object[]{"", "Total", tt, "", "", "", "", "", "", false});
            ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            ColumnsAutoSizer.sizeColumnsToFit(this.ca);
        }
    }

    private void mecanoMouseClicked(MouseEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        ResultSet result3;
        JOptionPane jop3;
        Statement state3;
        ResultSetMetaData resultMeta3;
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
        String datdd = dateFormatt.format(actuellEe);
        String ann\u00e9es = datdd.substring(6, datdd.length());
        this.a.setText(ann\u00e9es);
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante", "root", "");
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

    private void mMouseClicked(MouseEvent evt) {
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nbccc = this.numc.getText();
        String nb = nbccc.substring(0, nbccc.length() - 5);
        System.out.println(nb);
        String ann = this.numc.getText();
        String an = nbccc.substring(nbccc.length() - 3, nbccc.length());
        System.out.println(an);
        JOptionPane jop12 = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment modifier ", "Quitter", 0, 3);
        if (option == 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                state2.executeUpdate("UPDATE bc SET codeb='" + this.jTextField1.getText() + "' WHERE matf='" + this.matf.getText() + "'AND \tnbc='" + nb + "'AND anneesdebut='" + an + "'AND Mecano='" + this.mecano.getText() + "'");
                this.k = 1;
            }
            catch (Exception e) {
                this.k = 0;
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de modification a l'etat : " + e.getMessage());
            }
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

