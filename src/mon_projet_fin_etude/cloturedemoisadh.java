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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class cloturedemoisadh
extends JPanel {
    String nomadh = "";
    String ch = "";
    String mont = "";
    String parmois = "";
    int k = 1;
    int num = 0;
    int nombread = 0;
    String moiactueleenlettre = "";
    String type = "";
    String numerocheq = "";
    String numcarnet = "";
    String numfin = "";
    String mff = "";
    String firstcheque = "";
    int x = 0;
    int pp = 0;
    double numT = 0.0;
    String bqq = "";
    double Nch;
    double Nfin;
    String numcarnetreserver = "";
    private Timer t = null;
    private int count;
    private JTextField a;
    private JButton jButton2;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel2;
    private JProgressBar jProgressBar1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JComboBox m;

    public cloturedemoisadh() {
        this.initComponents();
    }

    private void initComponents() {
        this.jButton5 = new JButton();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jButton2 = new JButton();
        this.jLabel5 = new JLabel();
        this.m = new JComboBox();
        this.jLabel4 = new JLabel();
        this.a = new JTextField();
        this.jButton4 = new JButton();
        this.jProgressBar1 = new JProgressBar();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton5.setText("jButton5");
        this.jPanel2.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Cloture de mois \"Adherants\"  ");
        this.jPanel2.add(this.jLabel1);
        this.jLabel1.setBounds(260, -10, 360, 40);
        this.jButton2.setFont(new Font("Tahoma", 1, 14));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton2.setText("Imprimer");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cloturedemoisadh.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton2);
        this.jButton2.setBounds(740, 40, 150, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 18));
        this.jLabel5.setForeground(new Color(153, 0, 153));
        this.jLabel5.setText("mois :");
        this.jPanel2.add(this.jLabel5);
        this.jLabel5.setBounds(50, 30, 60, 40);
        this.m.setFont(new Font("Tahoma", 1, 14));
        this.m.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cloturedemoisadh.this.mActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.m);
        this.m.setBounds(120, 40, 60, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 18));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("Ann\u00e9e :");
        this.jPanel2.add(this.jLabel4);
        this.jLabel4.setBounds(190, 30, 70, 40);
        this.a.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.a);
        this.a.setBounds(290, 40, 100, 30);
        this.jButton4.setFont(new Font("Tahoma", 1, 14));
        this.jButton4.setText("Cloture");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                cloturedemoisadh.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton4);
        this.jButton4.setBounds(590, 40, 130, 30);
        this.jProgressBar1.setFont(new Font("Tahoma", 1, 14));
        this.jProgressBar1.setForeground(new Color(0, 102, 51));
        this.jProgressBar1.setStringPainted(true);
        this.jPanel2.add(this.jProgressBar1);
        this.jProgressBar1.setBounds(20, 70, 880, 30);
        this.jScrollPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createLineBorder(new Color(0, 0, 0))));
        this.jScrollPane1.setForeground(new Color(0, 153, 102));
        this.jScrollPane1.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 14));
        this.jTable1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jTable1.setFont(new Font("Tahoma", 0, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.jTable1.setGridColor(new Color(0, 0, 0));
        this.jTable1.setIntercellSpacing(new Dimension(2, 2));
        this.jTable1.setRowHeight(20);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                cloturedemoisadh.this.jTable1MouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel2.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 110, 890, 480);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -1, 915, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, GroupLayout.Alignment.TRAILING, -1, 599, 32767));
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat("Cloture de mois:( " + this.m.getSelectedItem().toString() + "/" + this.a.getText() + ")");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private static double myRound(double value, int decimalPlaces) {
        if (decimalPlaces < 0) {
            return value;
        }
        double augmentation = Math.pow(10.0, decimalPlaces);
        return (double)Math.round(value * augmentation) / augmentation;
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM   adherent ");
            while (result2.next()) {
                ++this.nombread;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        new Thread(new Runnable(){

            @Override
            public void run() {
                int nupaymentadh = 0;
                boolean j = false;
                int totale = 0;
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("N\u00b0");
                dt1.addColumn("Nom");
                dt1.addColumn("Mat");
                dt1.addColumn("Nom FR");
                dt1.addColumn("Mont");
                dt1.addColumn("N\u00b0C");
                dt1.addColumn("Men");
                dt1.addColumn("date debut");
                dt1.addColumn("date fin");
                dt1.addColumn("BQ");
                cloturedemoisadh.this.jTable1.setModel(dt1);
                int bccode = 0;
                Connection conn2 = null;
                try {
                    conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                }
                catch (SQLException ex) {
                    Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("nombread22222=" + cloturedemoisadh.this.nombread);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM   adherent ORDER BY MECANO ");
                    int aa = Integer.parseInt(cloturedemoisadh.this.a.getText());
                    int mm = Integer.parseInt(cloturedemoisadh.this.m.getSelectedItem().toString());
                    boolean i = false;
                    int cc = 0;
                    while (result2.next()) {
                        String codeb;
                        ResultSet result3;
                        Statement state3;
                        JOptionPane jop3;
                        Object[] stg;
                        ResultSetMetaData resultMeta3;
                        ++cloturedemoisadh.this.x;
                        cloturedemoisadh.this.k = 0;
                        nupaymentadh = 0;
                        double porcentage = cloturedemoisadh.this.x * 100 / cloturedemoisadh.this.nombread;
                        cloturedemoisadh.this.pp = (int)Math.round(porcentage);
                        cloturedemoisadh.this.jProgressBar1.setValue(cloturedemoisadh.this.pp);
                        try {
                            Thread.sleep(50);
                        }
                        catch (InterruptedException ex) {
                            JOptionPane jop32 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur jp progresss" + ex.getMessage());
                        }
                        System.out.println("---------------------------");
                        String MatAD = result2.getString("MECANO");
                        System.out.println("MECANO=" + MatAD);
                        String nom = result2.getString("NOM");
                        System.out.println("nom=" + nom);
                        cc = 0;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state22 = conn2.createStatement();
                            ResultSet result22 = state22.executeQuery("SELECT *  FROM  bc WHERE Mecano='" + MatAD + "' AND p='0'");
                            while (result22.next()) {
                                String datedebut = "";
                                int md = Integer.parseInt(result22.getString("moisdebut"));
                                System.out.println("md = " + md);
                                int ad = Integer.parseInt(result22.getString("anneesdebut"));
                                System.out.println("ad = " + ad);
                                int nbmois = Integer.parseInt(result22.getString("nbmois"));
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
                                int mu = Integer.parseInt(cloturedemoisadh.this.m.getSelectedItem().toString());
                                int au = Integer.parseInt(cloturedemoisadh.this.a.getText());
                                String nbc = result22.getString("nbc");
                                String na = nbc + " / " + ad;
                                System.out.println("nb M /ad = " + na);
                                int nn = mu - md + 1 + (au - ad) * 12;
                                String n = "" + nn + " / " + nbmois;
                                i = true;
                                cloturedemoisadh.this.k = 1;
                                cc = 1;
                                int montantparmois = (Integer.parseInt(result22.getString("montantbc")) - Integer.parseInt(result22.getString("accompte"))) / nbmois;
                                String stac = "" + montantparmois + "";
                                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                                totale = montantparmois + totale;
                                String matf = result22.getString("matf");
                                System.out.println("BC : matf= " + matf + " N\u00b0=" + na + "");
                                codeb = result22.getString("codeb");
                                codeb.toUpperCase();
                                if (codeb.indexOf("CS") == -1) {
                                    ++bccode;
                                }
                                String nomsc = "";
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
                                if (++nupaymentadh == 1) {
                                    stg = new Object[]{MatAD, nom, matf, nomsc, stac, na, n, db, df, codeb};
                                    dt1.addRow(stg);
                                    continue;
                                }
                                stg = new Object[]{"", "", matf, nomsc, stac, na, n, db, df, codeb};
                                dt1.addRow(stg);
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur bc :" + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM  cession2 WHERE mecano='" + MatAD + "'");
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                Object[] stg2;
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
                                int mu = Integer.parseInt(cloturedemoisadh.this.m.getSelectedItem().toString());
                                int au = Integer.parseInt(cloturedemoisadh.this.a.getText());
                                String codeb2 = result3.getString("bq406");
                                String na = nbc + " / " + ad;
                                int nn = mu - md + 1 + (au - ad) * 12;
                                String n = "" + nn + " / " + nbmois;
                                codeb2.toUpperCase();
                                if (codeb2.indexOf("CS") == -1) {
                                    ++bccode;
                                }
                                cloturedemoisadh.this.k = 1;
                                String maChaine = result3.getString("montantparmois");
                                maChaine = maChaine.replace(",", "");
                                int montantparmois = Integer.parseInt(maChaine);
                                System.out.println("montant= " + montantparmois);
                                String stac = "" + montantparmois + "";
                                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                                String nomsc = "";
                                totale = montantparmois + totale;
                                cc = 2;
                                if (++nupaymentadh == 1) {
                                    i = true;
                                    stg2 = new Object[]{MatAD, nom, "406", "CS Direct", stac, na, n, db, df, codeb2};
                                    dt1.addRow(stg2);
                                    continue;
                                }
                                i = true;
                                stg2 = new Object[]{"", "", "406", "CS Direct", stac, na, n, db, df, codeb2};
                                dt1.addRow(stg2);
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM  demandefdd WHERE Mecano='" + MatAD + "'");
                            while (result3.next()) {
                                String moisdebut = result3.getString("datedebut");
                                String moisd = moisdebut.substring(0, moisdebut.length() - 6);
                                String aaa = moisdebut.substring(moisdebut.length() - 4, moisdebut.length());
                                int ad = Integer.parseInt(aaa);
                                int nbmois = Integer.parseInt(result3.getString("Nbmois"));
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
                                if (datedebutt.compareTo(datet) != 0 && datefinn.compareTo(datet) != 0 && (!datedebutt.before(datet) || !datet.before(datefinn))) continue;
                                int mu = Integer.parseInt(cloturedemoisadh.this.m.getSelectedItem().toString());
                                int au = Integer.parseInt(cloturedemoisadh.this.a.getText());
                                String nbc = result3.getString("nbch");
                                String na = nbc + " / " + ad;
                                int nn = mu - md + 1 + (au - ad) * 12;
                                String n = "" + nn + " / " + nbmois;
                                System.out.println("fdd :N=" + na + "");
                                i = true;
                                cc = 2;
                                cloturedemoisadh.this.k = 1;
                                String maChaine = result3.getString("Montant");
                                maChaine = maChaine.replace(",", "");
                                int montantparmois = Integer.parseInt(maChaine) / nbmois;
                                codeb = result3.getString("codeb");
                                codeb.toUpperCase();
                                if (codeb.indexOf("CS") == -1) {
                                    ++bccode;
                                }
                                String stac = "" + montantparmois + "";
                                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                                totale = montantparmois + totale;
                                if (++nupaymentadh == 1) {
                                    stg = new Object[]{MatAD, nom, "230", "FDD", stac, na, n, db, df, ""};
                                    dt1.addRow(stg);
                                    continue;
                                }
                                stg = new Object[]{"", "", "230", "FDD", stac, na, n, db, df, ""};
                                dt1.addRow(stg);
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur fdd : " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM  cotisation WHERE Mecano='" + MatAD + "'");
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                Object[] stg3;
                                String m = result3.getString("montant");
                                String stac = m + "";
                                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                                int monts = Integer.parseInt(m);
                                totale = monts + totale;
                                cloturedemoisadh.this.k = 1;
                                i = true;
                                if (++nupaymentadh == 1) {
                                    stg3 = new Object[]{MatAD, nom, "", "cotitation", stac, "", "", "", "", ""};
                                    dt1.addRow(stg3);
                                } else {
                                    stg3 = new Object[]{"", "", "", "cotitation", stac, "", "", "", "", ""};
                                    dt1.addRow(stg3);
                                }
                                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur coti : " + e.getMessage());
                        }
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            state3 = conn2.createStatement();
                            result3 = state3.executeQuery("SELECT * FROM  forfaitdemadeorange WHERE mecano='" + MatAD + "'");
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                Object[] stg4;
                                String nomforfait = result3.getString("nomforfait");
                                String m = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Statement state4 = conn2.createStatement();
                                    ResultSet result4 = state4.executeQuery("SELECT * FROM  forfaitorange WHERE nom='" + nomforfait + "'");
                                    ResultSetMetaData resultMeta4 = result4.getMetaData();
                                    while (result4.next()) {
                                        m = result4.getString("Montant");
                                        i = true;
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
                                if (++nupaymentadh == 1) {
                                    stg4 = new Object[]{MatAD, nom, "", nomforfait, stac, "", "", "", "", ""};
                                    dt1.addRow(stg4);
                                } else {
                                    stg4 = new Object[]{"--", "", "", nomforfait, stac, "", "", "", "", ""};
                                    dt1.addRow(stg4);
                                }
                                ColumnsAutoSizer.sizeColumnsToFit(cloturedemoisadh.this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                        }
                        if (bccode >= 1 && cloturedemoisadh.this.k == 1 && (cc == 1 || cc == 2)) {
                            Object[] stg5 = new Object[]{"", "", "", "Droit Fixe", "0.600", ""};
                            dt1.addRow(stg5);
                            totale += 600;
                        }
                        bccode = 0;
                        if (!i) continue;
                        String lk = "" + totale + "";
                        if (!lk.equals("0.0")) {
                            cloturedemoisadh.this.numT = cloturedemoisadh.myRound(totale, 3);
                            String stac = "" + totale + "";
                            stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                            System.out.println("total =" + stac);
                            Object[] stg6 = new Object[]{"--", "--", "----", "total =>", stac, ""};
                            dt1.addRow(stg6);
                            totale = 0;
                            ColumnsAutoSizer.sizeColumnsToFit(cloturedemoisadh.this.jTable1);
                        }
                        i = false;
                    }
                    Object[] stg = new Object[]{"Fin", "Fin", "Fin", "Fin", "Fin", "Fin"};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(cloturedemoisadh.this.jTable1);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }
        }).start();
    }

    private void mActionPerformed(ActionEvent evt) {
    }

    private void jTable1MouseClicked(MouseEvent evt) {
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

