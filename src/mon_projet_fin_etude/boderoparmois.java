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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;

public class boderoparmois
extends JPanel {
    String nomadh = "";
    String ch = "";
    String mont = "";
    String parmois = "";
    int k = 1;
    int num = 0;
    String codebbb = "";
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
    private JTextField a;
    private JTextField codeb;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel2;
    private JProgressBar jProgressBar1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JComboBox m;

    public boderoparmois() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.codeb = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.m = new JComboBox();
        this.jLabel5 = new JLabel();
        this.a = new JTextField();
        this.jLabel2 = new JLabel();
        this.jProgressBar1 = new JProgressBar();
        this.jButton4 = new JButton();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jPanel2.setLayout(null);
        this.jPanel2.add(this.codeb);
        this.codeb.setBounds(120, 40, 80, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                boderoparmois.this.jScrollPane1MouseClicked(evt);
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
                boderoparmois.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                boderoparmois.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                boderoparmois.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel2.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 160, 700, 430);
        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setForeground(new Color(153, 0, 153));
        this.jLabel3.setText("Ann\u00e9e :");
        this.jPanel2.add(this.jLabel3);
        this.jLabel3.setBounds(150, 90, 70, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 18));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("Bordereau :");
        this.jPanel2.add(this.jLabel4);
        this.jLabel4.setBounds(10, 40, 107, 40);
        this.m.setFont(new Font("Tahoma", 1, 14));
        this.m.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.jPanel2.add(this.m);
        this.m.setBounds(80, 90, 60, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 18));
        this.jLabel5.setForeground(new Color(153, 0, 153));
        this.jLabel5.setText("Mois :");
        this.jPanel2.add(this.jLabel5);
        this.jLabel5.setBounds(10, 90, 60, 30);
        this.a.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.a);
        this.a.setBounds(230, 90, 100, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 24));
        this.jLabel2.setForeground(new Color(102, 0, 102));
        this.jLabel2.setText("Affichage les Bordereaus");
        this.jPanel2.add(this.jLabel2);
        this.jLabel2.setBounds(210, 4, 370, 30);
        this.jProgressBar1.setFont(new Font("Tahoma", 1, 14));
        this.jProgressBar1.setForeground(new Color(0, 102, 51));
        this.jProgressBar1.setStringPainted(true);
        this.jPanel2.add(this.jProgressBar1);
        this.jProgressBar1.setBounds(10, 130, 700, 30);
        this.jButton4.setFont(new Font("Tahoma", 1, 14));
        this.jButton4.setText("Afficher le bordereau par d\u00e9taille");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                boderoparmois.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton4);
        this.jButton4.setBounds(210, 30, 270, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setText("Afficher le bordereau sans d\u00e9taille");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                boderoparmois.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton1);
        this.jButton1.setBounds(210, 60, 270, 30);
        this.jButton2.setFont(new Font("Tahoma", 1, 14));
        this.jButton2.setText("Imprimer");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                boderoparmois.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton2);
        this.jButton2.setBounds(360, 90, 140, 30);
        this.jButton3.setFont(new Font("Tahoma", 1, 11));
        this.jButton3.setText("Afficher tous les bordereaux ordonner par numero");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                boderoparmois.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton3);
        this.jButton3.setBounds(490, 30, 317, 30);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, 807, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -1, 602, 32767).addContainerGap()));
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private static double myRound(double value, int decimalPlaces) {
        if (decimalPlaces < 0) {
            return value;
        }
        double augmentation = Math.pow(10.0, decimalPlaces);
        return (double)Math.round(value * augmentation) / augmentation;
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
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
                boderoparmois.this.k = 0;
                boolean j = false;
                Double totale = 0.0;
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom et prenom");
                dt1.addColumn("FR");
                dt1.addColumn("Mnt Mens");
                dt1.addColumn("totale");
                dt1.addColumn("BQ");
                boderoparmois.this.jTable1.setModel(dt1);
                boderoparmois.this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                boderoparmois.this.jTable1.setFillsViewportHeight(true);
                boderoparmois.this.jTable1.getModel().addTableModelListener(new TableModelListener(){

                    @Override
                    public void tableChanged(TableModelEvent e) {
                        ColumnsAutoSizer.sizeColumnsToFit(boderoparmois.this.jTable1);
                    }
                });
                System.out.println("nombread22222=" + boderoparmois.this.nombread);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM   adherent ");
                    int aa = Integer.parseInt(boderoparmois.this.a.getText());
                    int mm = Integer.parseInt(boderoparmois.this.m.getSelectedItem().toString());
                    int i = 0;
                    while (result2.next()) {
                        ++boderoparmois.this.x;
                        System.out.println("---------*******************------");
                        double porcentage = boderoparmois.this.x * 100 / boderoparmois.this.nombread;
                        System.out.println("nombread=" + boderoparmois.this.nombread);
                        System.out.println("x=" + boderoparmois.this.x);
                        System.out.println("progrtessbar=" + porcentage);
                        boderoparmois.this.pp = (int)Math.round(porcentage);
                        System.out.println("pp= " + boderoparmois.this.pp);
                        boderoparmois.this.jProgressBar1.setValue(boderoparmois.this.pp);
                        try {
                            Thread.sleep(50);
                        }
                        catch (InterruptedException ex) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur jp progresss" + ex.getMessage());
                        }
                        boderoparmois.this.k = 1;
                        String MatAD = result2.getString("MECANO");
                        System.out.println("MECANO=" + MatAD);
                        String nom = result2.getString("NOM");
                        System.out.println("nom=" + nom);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn1 = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/cmd?useUnicode=true&characterEncoding=UTF-8", "root", "root");
                            Statement state1 = conn1.createStatement();
                            ResultSet result1 = state1.executeQuery("SELECT *  FROM  bc1 WHERE  MatAD='" + MatAD + "' AND BQ  ='" + boderoparmois.this.codeb.getText() + "'");
                            i = 0;
                            int nupaymentadh = 0;
                            while (result1.next()) {
                                String BQ;
                                Object[] stg;
                                boderoparmois.this.k = 1;
                                boderoparmois.this.bqq = "";
                                String datedebut = "";
                                datedebut = result1.getString("datedebut");
                                String datedefin = result1.getString("datefin");
                                System.out.println("datedebut=" + datedebut);
                                System.out.println("datedefin =" + datedefin);
                                if (datedebut.equals("") || datedefin.equals("")) continue;
                                int md = Integer.parseInt(datedebut.substring(3, datedebut.length() - 5));
                                int ad = Integer.parseInt(datedebut.substring(6, datedebut.length()));
                                int mf = Integer.parseInt(datedefin.substring(3, datedefin.length() - 5));
                                int af = Integer.parseInt(datedefin.substring(6, datedefin.length()));
                                if (!(ad < aa && aa < af || ad == aa && md <= mm && mf >= mm) && (af != aa || mf < mm)) continue;
                                i = 1;
                                String m = result1.getString("Mantmois");
                                String fr = result1.getString("MAT");
                                boderoparmois.this.bqq = BQ = result1.getString("BQ");
                                m = m.replace(",", ".");
                                Double Mantmois = Double.parseDouble(m);
                                totale = totale + Mantmois;
                                String llk = Mantmois + "";
                                System.out.println(llk);
                                if (llk.equals("0.0")) continue;
                                if (++nupaymentadh == 1) {
                                    stg = new Object[]{MatAD, nom, fr, Mantmois, "", ""};
                                    dt1.addRow(stg);
                                    continue;
                                }
                                stg = new Object[]{"", "", fr, Mantmois, "", ""};
                                dt1.addRow(stg);
                            }
                            if (boderoparmois.this.k == 0) {
                                JOptionPane jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Adherent n'existe pas !!");
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        System.out.println(" i= " + i);
                        if (i != 1) continue;
                        System.out.println("1111111111111111111111111111111111111");
                        String lk = totale + "";
                        System.out.println(lk);
                        System.out.println(" lk= " + lk);
                        if (!lk.equals("0.0")) {
                            boderoparmois.this.numT = boderoparmois.myRound(totale, 3);
                            System.out.println("---------*******************------");
                            Object[] stg = new Object[]{"----", "----", "----", "----", totale, boderoparmois.this.bqq};
                            dt1.addRow(stg);
                            totale = 0.0;
                            ColumnsAutoSizer.sizeColumnsToFit(boderoparmois.this.jTable1);
                        }
                        i = 0;
                    }
                    Object[] stg = new Object[]{"******", "*********", "******", "******", "*********", "****"};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(boderoparmois.this.jTable1);
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }

        }).start();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
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
                boderoparmois.this.k = 0;
                boolean j = false;
                Double totale = 0.0;
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom et prenom");
                dt1.addColumn("Montant");
                dt1.addColumn("G.L");
                dt1.addColumn("OBS");
                boderoparmois.this.jTable1.setModel(dt1);
                boderoparmois.this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                boderoparmois.this.jTable1.setFillsViewportHeight(true);
                boderoparmois.this.jTable1.getModel().addTableModelListener(new TableModelListener(){

                    @Override
                    public void tableChanged(TableModelEvent e) {
                        ColumnsAutoSizer.sizeColumnsToFit(boderoparmois.this.jTable1);
                    }
                });
                System.out.println("nombread22222=" + boderoparmois.this.nombread);
                try {
                    double t = 0.0;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM   adherent ");
                    int aa = Integer.parseInt(boderoparmois.this.a.getText());
                    int mm = Integer.parseInt(boderoparmois.this.m.getSelectedItem().toString());
                    int i = 0;
                    while (result2.next()) {
                        ++boderoparmois.this.x;
                        System.out.println("---------*******************------");
                        double porcentage = boderoparmois.this.x * 100 / boderoparmois.this.nombread;
                        System.out.println("nombread=" + boderoparmois.this.nombread);
                        System.out.println("x=" + boderoparmois.this.x);
                        System.out.println("progrtessbar=" + porcentage);
                        boderoparmois.this.pp = (int)Math.round(porcentage);
                        System.out.println("pp= " + boderoparmois.this.pp);
                        boderoparmois.this.jProgressBar1.setValue(boderoparmois.this.pp);
                        try {
                            Thread.sleep(50);
                        }
                        catch (InterruptedException ex) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur jp progresss" + ex.getMessage());
                        }
                        String fr = "";
                        boderoparmois.this.k = 1;
                        String MatAD = result2.getString("MECANO");
                        System.out.println("MECANO=" + MatAD);
                        String nom = result2.getString("NOM");
                        System.out.println("nom=" + nom);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn1 = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/cmd?useUnicode=true&characterEncoding=UTF-8", "root", "root");
                            Statement state1 = conn1.createStatement();
                            ResultSet result1 = state1.executeQuery("SELECT *  FROM  bc1 WHERE  MatAD='" + MatAD + "' AND BQ  ='" + boderoparmois.this.codeb.getText() + "'");
                            i = 0;
                            int nupaymentadh = 0;
                            while (result1.next()) {
                                String BQ;
                                boderoparmois.this.k = 1;
                                boderoparmois.this.bqq = "";
                                String datedebut = "";
                                datedebut = result1.getString("datedebut");
                                String datedefin = result1.getString("datefin");
                                System.out.println("datedebut=" + datedebut);
                                System.out.println("datedefin =" + datedefin);
                                if (datedebut.equals("") || datedefin.equals("")) continue;
                                int md = Integer.parseInt(datedebut.substring(3, datedebut.length() - 5));
                                int ad = Integer.parseInt(datedebut.substring(6, datedebut.length()));
                                int mf = Integer.parseInt(datedefin.substring(3, datedefin.length() - 5));
                                int af = Integer.parseInt(datedefin.substring(6, datedefin.length()));
                                if (!(ad < aa && aa < af || ad == aa && md <= mm && mf >= mm) && (af != aa || mf < mm)) continue;
                                i = 1;
                                String m = result1.getString("Mantmois");
                                fr = result1.getString("MAT");
                                boderoparmois.this.bqq = BQ = result1.getString("BQ");
                                m = m.replace(",", ".");
                                Double Mantmois = Double.parseDouble(m);
                                totale = totale + Mantmois;
                                String llk = Mantmois + "";
                                System.out.println(llk);
                                if (!llk.equals("0.0") && ++nupaymentadh != 1) continue;
                            }
                            if (boderoparmois.this.k == 0) {
                                JOptionPane jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "Adherent n'existe pas !!");
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        System.out.println(" i= " + i);
                        if (i != 1) continue;
                        System.out.println("1111111111111111111111111111111111111");
                        String lk = totale + "";
                        System.out.println(lk);
                        System.out.println(" lk= " + lk);
                        if (!lk.equals("0.0")) {
                            boderoparmois.this.numT = boderoparmois.myRound(totale, 3);
                            System.out.println("---------*******************------");
                            t += boderoparmois.this.numT;
                            Object[] stg = new Object[]{MatAD, nom, boderoparmois.this.numT, "    ", "    "};
                            dt1.addRow(stg);
                            totale = 0.0;
                            ColumnsAutoSizer.sizeColumnsToFit(boderoparmois.this.jTable1);
                        }
                        i = 0;
                    }
                    Object[] stg = new Object[]{"******", "*********", "******", "******", "*********", "****"};
                    dt1.addRow(stg);
                    boderoparmois.this.numT = boderoparmois.myRound(t, 3);
                    Object[] stg2 = new Object[]{"******", "Totale =", boderoparmois.this.numT, "******", "*********", "****"};
                    dt1.addRow(stg2);
                    ColumnsAutoSizer.sizeColumnsToFit(boderoparmois.this.jTable1);
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }

        }).start();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        String mg = this.m.getSelectedItem().toString() + "/" + this.a.getText();
        MessageFormat header = new MessageFormat("Mois comptable =" + mg + " (Banque =" + this.codeb.getText() + ")");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        int aa = Integer.parseInt(this.a.getText());
        int mm = Integer.parseInt(this.m.getSelectedItem().toString());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn21 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state21 = conn21.createStatement();
            ResultSet result21 = state21.executeQuery("SELECT *  FROM    codebanque ");
            while (result21.next()) {
                this.codebbb = result21.getString("CODE");
                System.out.println("code =======================================================" + this.codebbb);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn1 = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/cmd?useUnicode=true&characterEncoding=UTF-8", "root", "root");
                    Statement state1 = conn1.createStatement();
                    ResultSet result1 = state1.executeQuery("SELECT *  FROM  bc1 WHERE   BQ  ='" + this.codebbb + "'");
                    boolean nupaymentadh = false;
                    while (result1.next()) {
                        this.k = 1;
                        this.bqq = "";
                        String datedebut = "";
                        datedebut = result1.getString("datedebut");
                        String datedefin = result1.getString("datefin");
                        System.out.println("datedebut=" + datedebut);
                        System.out.println("datedefin =" + datedefin);
                        if (datedebut.equals("") || datedefin.equals("")) continue;
                        int md = Integer.parseInt(datedebut.substring(3, datedebut.length() - 5));
                        int ad = Integer.parseInt(datedebut.substring(6, datedebut.length()));
                        int mf = Integer.parseInt(datedefin.substring(3, datedefin.length() - 5));
                        int af = Integer.parseInt(datedefin.substring(6, datedefin.length()));
                        if (!(ad < aa && aa < af || ad == aa && md <= mm && mf >= mm) && (af != aa || mf < mm)) continue;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                        }
                        catch (Exception e) {
                            JOptionPane jop1 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
                        }
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
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

