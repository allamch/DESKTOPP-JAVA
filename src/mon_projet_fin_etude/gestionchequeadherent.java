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
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;

public class gestionchequeadherent
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
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel2;
    private JProgressBar jProgressBar1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JComboBox m;
    private JTextField mecano;

    public gestionchequeadherent() {
        this.initComponents();
    }

    private void initComponents() {
        this.jButton5 = new JButton();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.mecano = new JTextField();
        this.jButton1 = new JButton();
        this.jLabel3 = new JLabel();
        this.jButton2 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton3 = new JButton();
        this.jLabel5 = new JLabel();
        this.m = new JComboBox();
        this.jLabel4 = new JLabel();
        this.a = new JTextField();
        this.jButton4 = new JButton();
        this.jProgressBar1 = new JProgressBar();
        this.jButton5.setText("jButton5");
        this.jPanel2.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Cloture de mois");
        this.jPanel2.add(this.jLabel1);
        this.jLabel1.setBounds(170, 10, 220, 40);
        this.jPanel2.add(this.mecano);
        this.mecano.setBounds(120, 60, 80, 35);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/gestion cheque/aaa.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                gestionchequeadherent.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton1);
        this.jButton1.setBounds(210, 50, 70, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setForeground(new Color(0, 0, 204));
        this.jLabel3.setText("Mecano :");
        this.jPanel2.add(this.jLabel3);
        this.jLabel3.setBounds(30, 50, 83, 35);
        this.jButton2.setFont(new Font("Tahoma", 1, 14));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton2.setText("Imprimer");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                gestionchequeadherent.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton2);
        this.jButton2.setBounds(300, 50, 150, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setForeground(new Color(255, 255, 255));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                gestionchequeadherent.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setFont(new Font("Tahoma", 0, 14));
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
        this.jTable1.setAlignmentX(10.0f);
        this.jTable1.setRowHeight(30);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                gestionchequeadherent.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                gestionchequeadherent.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                gestionchequeadherent.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel2.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 170, 700, 400);
        this.jButton3.setText("valider");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                gestionchequeadherent.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton3);
        this.jButton3.setBounds(460, 50, 65, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 18));
        this.jLabel5.setForeground(new Color(153, 0, 153));
        this.jLabel5.setText("mois :");
        this.jPanel2.add(this.jLabel5);
        this.jLabel5.setBounds(40, 90, 60, 40);
        this.m.setFont(new Font("Tahoma", 1, 14));
        this.m.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                gestionchequeadherent.this.mActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.m);
        this.m.setBounds(110, 100, 60, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 18));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("Ann\u00e9e :");
        this.jPanel2.add(this.jLabel4);
        this.jLabel4.setBounds(180, 100, 70, 40);
        this.a.setFont(new Font("Tahoma", 1, 14));
        this.jPanel2.add(this.a);
        this.a.setBounds(260, 100, 100, 30);
        this.jButton4.setFont(new Font("Tahoma", 1, 14));
        this.jButton4.setText("Cloture");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                gestionchequeadherent.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton4);
        this.jButton4.setBounds(380, 100, 130, 30);
        this.jProgressBar1.setFont(new Font("Tahoma", 1, 14));
        this.jProgressBar1.setForeground(new Color(0, 102, 51));
        this.jProgressBar1.setStringPainted(true);
        this.jPanel2.add(this.jProgressBar1);
        this.jProgressBar1.setBounds(10, 140, 700, 30);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -1, 757, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel2, -2, 588, -2)));
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        block31 : {
            Date actuellEeddc1 = new Date();
            SimpleDateFormat dateFormattddc1 = new SimpleDateFormat("MM/yyyy");
            String dat1 = dateFormattddc1.format(actuellEeddc1);
            Date actuellEeddc = new Date();
            SimpleDateFormat dateFormattddc = new SimpleDateFormat("MM/yyyy");
            String dat = dateFormattddc.format(actuellEeddc);
            String mo = dat.substring(0, dat.length() - 5);
            String a = dat.substring(3, dat.length());
            Double totale = 0.0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/cmd?useUnicode=true&characterEncoding=UTF-8", "root", "root");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc1 WHERE MatAD='" + this.mecano.getText() + "'");
                int aa = Integer.parseInt(a);
                int mm = Integer.parseInt(mo);
                while (result2.next()) {
                    this.k = 1;
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
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1111111" + e.getMessage());
            }
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Mecano");
            dt1.addColumn("Nom et prenom");
            dt1.addColumn("payment par");
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("Montant");
            this.jTable1.setModel(dt1);
            this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
            this.jTable1.setFillsViewportHeight(true);
            this.jTable1.getModel().addTableModelListener(new TableModelListener(){

                @Override
                public void tableChanged(TableModelEvent e) {
                    ColumnsAutoSizer.sizeColumnsToFit(gestionchequeadherent.this.jTable1);
                }
            });
            String nom = "";
            String moisactuel = dat.substring(0, dat.length() - 5);
            String anneactuel = dat.substring(dat.length() - 4, dat.length());
            System.out.println("mois actuelle :" + moisactuel + "--");
            System.out.println("anne actuelle :" + anneactuel + "--");
            this.moiactueleenlettre = moisactuel.equals("01") ? "Janvier  " + anneactuel : (moisactuel.equals("02") ? "F\u00e9vrier  " + anneactuel : (moisactuel.equals("03") ? "Mars  " + anneactuel : (moisactuel.equals("04") ? "Avril  " + anneactuel : (moisactuel.equals("05") ? "Mai  " + anneactuel : (moisactuel.equals("06") ? "Juin  " + anneactuel : (moisactuel.equals("07") ? "Juillet  " + anneactuel : (moisactuel.equals("08") ? "Ao\u00fbt  " + anneactuel : (moisactuel.equals("09") ? "Septembre  " + anneactuel : (moisactuel.equals("10") ? "Octobre  " + anneactuel : (moisactuel.equals("11") ? "Novembre  " + anneactuel : (moisactuel.equals("12") ? "D\u00e9cembre  " + anneactuel : "!!!!!!!!!!!")))))))))));
            boolean g = this.mecano.getText().equals("");
            if (g) {
                this.k = 0;
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
            } else {
                this.k = 0;
                try {
                    int max12;
                    ResultSet result2;
                    Connection conn2;
                    Statement state2;
                    JOptionPane jop3;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn3.createStatement();
                    ResultSet result = state.executeQuery("SELECT *  FROM  adherent WHERE MECANO=" + this.mecano.getText());
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        this.k = 1;
                        this.ch = "S";
                        nom = result.getString("NOM");
                    }
                    if (this.k == 0) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state22 = conn22.createStatement();
                            ResultSet result22 = state22.executeQuery("SELECT *  FROM  retretait WHERE mecano=" + this.mecano.getText());
                            while (result22.next()) {
                                this.k = 2;
                                this.ch = "R";
                                nom = result22.getString("nom");
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop32 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1 22222" + e.getMessage());
                        }
                    }
                    if (this.k == 0) {
                        JOptionPane jop33 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adherent n'existe pas !!");
                        break block31;
                    }
                    boolean j = false;
                    String numcarnet = "0";
                    String ncheque = "0";
                    String nch = "";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn2.createStatement();
                        System.out.println("11111111111111");
                        result2 = state2.executeQuery("SELECT * FROM chequeadherent WHERE mecano='" + this.mecano.getText() + "'");
                        System.out.println("11111222211111");
                         max12 = 0;
                        while (result2.next()) {
                            j = true;
                            numcarnet = result2.getString("nbcarnet");
                            ncheque = result2.getString("ncheque");
                            int max2 = Integer.parseInt(numcarnet);
                            if (max2 <= max12) continue;
                            max12 = max2;
                            nch = ncheque;
                        }
                        if (j) {
                            this.type = "CH ";
                            System.out.println("Mecano =" + this.mecano.getText());
                            System.out.println("N\u00b0 carnet =" + max12);
                            System.out.println("N\u00b0 cheque =" + nch);
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "3333" + e.getMessage());
                    }
                    j = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn2.createStatement();
                        System.out.println("moiactueleenlettre =" + this.moiactueleenlettre);
                        result2 = state2.executeQuery("SELECT *  FROM  cessionfournisseur WHERE mecano='" + this.mecano.getText() + "' AND  premiermois='" + this.moiactueleenlettre + "'");
                        max12 = 0;
                        while (result2.next()) {
                            j = true;
                        }
                        if (j) {
                            this.type = this.type + "/ CS ";
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1 4444" + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn2.createStatement();
                        result2 = state2.executeQuery("SELECT *  FROM  adherent WHERE MECANO='" + this.mecano.getText() + "'");
                        max12 = 0;
                        while (result2.next()) {
                            String nbvir = result2.getString("nbm");
                            max12 = Integer.parseInt(nbvir);
                            if (max12 <= 0) continue;
                            j = true;
                        }
                        if (j) {
                            this.type = this.type + "/ VIR ";
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1 55555" + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn2.createStatement();
                        state2.executeUpdate("INSERT gestioncheque(date,mecano,nom,type,cheq,mont) VALUES('" + dat1 + "','" + this.mecano.getText() + "','" + nom + "','" + this.type + "','" + nch + "','" + totale + "')");
                        JOptionPane jop1 = new JOptionPane();
                        this.mecano.setText("");
                        this.type = "";
                        totale = 0.0;
                    }
                    catch (Exception e) {
                        JOptionPane jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'ajout " + e.getMessage());
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        state2 = conn2.createStatement();
                        result2 = state2.executeQuery("SELECT *  FROM  gestioncheque ORDER BY mecano");
                        while (result2.next()) {
                            String Mecano = result2.getString("mecano");
                            String nomm = result2.getString("nom");
                            String type = result2.getString("type");
                            String nnumche = result2.getString("cheq");
                            String montmis = result2.getString("mont");
                            Object[] stg = new Object[]{Mecano, nomm, type, nnumche, montmis};
                            dt1.addRow(stg);
                            ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                    }
                    this.k = 0;
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        Date actuellEeddc = new Date();
        SimpleDateFormat dateFormattddc = new SimpleDateFormat("DD/MM/yyyy");
        String dat = dateFormattddc.format(actuellEeddc);
        MessageFormat header = new MessageFormat("Gestion Des cheque  ( " + dat + " )");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
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

    private void jButton3ActionPerformed(ActionEvent evt) {
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
        boolean j = false;
        Double totale = 0.0;
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Montant");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
        this.jTable1.getModel().addTableModelListener(new TableModelListener(){

            @Override
            public void tableChanged(TableModelEvent e) {
                ColumnsAutoSizer.sizeColumnsToFit(gestionchequeadherent.this.jTable1);
            }
        });
        System.out.println("nombread22222=" + this.nombread);
        this.k = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM   adherent ");
            int aa = Integer.parseInt(this.a.getText());
            int mm = Integer.parseInt(this.m.getSelectedItem().toString());
            boolean i = false;
            while (result2.next()) {
                ++this.x;
                this.k = 1;
                String MatAD = result2.getString("MECANO");
                String nom = result2.getString("NOM");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn1 = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/cmd?useUnicode=true&characterEncoding=UTF-8", "root", "root");
                    Statement state1 = conn1.createStatement();
                    ResultSet result1 = state1.executeQuery("SELECT *  FROM  bc1 WHERE  MatAD='" + MatAD + "'");
                    while (result1.next()) {
                        this.k = 1;
                        String datedebut = "";
                        datedebut = result1.getString("datedebut");
                        String datedefin = result1.getString("datefin");
                        if (datedebut.equals("") || datedefin.equals("")) continue;
                        int md = Integer.parseInt(datedebut.substring(3, datedebut.length() - 5));
                        int ad = Integer.parseInt(datedebut.substring(6, datedebut.length()));
                        int mf = Integer.parseInt(datedefin.substring(3, datedefin.length() - 5));
                        int af = Integer.parseInt(datedefin.substring(6, datedefin.length()));
                        if (!(ad < aa && aa < af || ad == aa && md <= mm && mf >= mm) && (af != aa || mf < mm)) continue;
                        i = true;
                        String m = result1.getString("Mantmois");
                        m = m.replace(",", ".");
                        Double Mantmois = Double.parseDouble(m);
                        totale = Mantmois + totale;
                        double num = gestionchequeadherent.myRound(totale, 2);
                    }
                    if (this.k == 0) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "Adherent n'existe pas !!");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
                if (!i) continue;
                System.out.println("---------*******************------");
                double porcentage = this.x * 100 / this.nombread;
                System.out.println("nombread=" + this.nombread);
                System.out.println("x=" + this.x);
                System.out.println("progrtessbar=" + porcentage);
                this.pp = (int)Math.round(porcentage);
                System.out.println("pp= " + this.pp);
                System.out.println("---------*******************------");
                Object[] stg = new Object[]{MatAD, nom, totale};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            Object[] stg = new Object[]{"****", "*********", "****"};
            dt1.addRow(stg);
            ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
    }

    private void mActionPerformed(ActionEvent evt) {
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
                gestionchequeadherent.this.k = 0;
                boolean j = false;
                Double totale = 0.0;
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom et prenom");
                dt1.addColumn("FR");
                dt1.addColumn("Mnt Mens");
                dt1.addColumn("totale");
                dt1.addColumn("BQ");
                gestionchequeadherent.this.jTable1.setModel(dt1);
                gestionchequeadherent.this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                gestionchequeadherent.this.jTable1.setFillsViewportHeight(true);
                gestionchequeadherent.this.jTable1.getModel().addTableModelListener(new TableModelListener(){

                    @Override
                    public void tableChanged(TableModelEvent e) {
                        ColumnsAutoSizer.sizeColumnsToFit(gestionchequeadherent.this.jTable1);
                    }
                });
                System.out.println("nombread22222=" + gestionchequeadherent.this.nombread);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT *  FROM   adherent ");
                    int aa = Integer.parseInt(gestionchequeadherent.this.a.getText());
                    int mm = Integer.parseInt(gestionchequeadherent.this.m.getSelectedItem().toString());
                    int i = 0;
                    while (result2.next()) {
                        ++gestionchequeadherent.this.x;
                        System.out.println("---------*******************------");
                        double porcentage = gestionchequeadherent.this.x * 100 / gestionchequeadherent.this.nombread;
                        System.out.println("nombread=" + gestionchequeadherent.this.nombread);
                        System.out.println("x=" + gestionchequeadherent.this.x);
                        System.out.println("progrtessbar=" + porcentage);
                        gestionchequeadherent.this.pp = (int)Math.round(porcentage);
                        System.out.println("pp= " + gestionchequeadherent.this.pp);
                        gestionchequeadherent.this.jProgressBar1.setValue(gestionchequeadherent.this.pp);
                        try {
                            Thread.sleep(50);
                        }
                        catch (InterruptedException ex) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur jp progresss" + ex.getMessage());
                        }
                        gestionchequeadherent.this.k = 1;
                        String MatAD = result2.getString("MECANO");
                        System.out.println("MECANO=" + MatAD);
                        String nom = result2.getString("NOM");
                        System.out.println("nom=" + nom);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn1 = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/cmd?useUnicode=true&characterEncoding=UTF-8", "root", "root");
                            Statement state1 = conn1.createStatement();
                            ResultSet result1 = state1.executeQuery("SELECT *  FROM  bc1 WHERE  MatAD='" + MatAD + "'");
                            i = 0;
                            int nupaymentadh = 0;
                            while (result1.next()) {
                                String BQ;
                                Object[] stg;
                                gestionchequeadherent.this.k = 1;
                                gestionchequeadherent.this.bqq = "";
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
                                gestionchequeadherent.this.bqq = BQ = result1.getString("BQ");
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
                            if (gestionchequeadherent.this.k == 0) {
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
                            gestionchequeadherent.this.numT = gestionchequeadherent.myRound(totale, 3);
                            System.out.println("---------*******************------");
                            Object[] stg = new Object[]{"----", "----", "----", "----", totale, gestionchequeadherent.this.bqq};
                            dt1.addRow(stg);
                            totale = 0.0;
                            ColumnsAutoSizer.sizeColumnsToFit(gestionchequeadherent.this.jTable1);
                        }
                        i = 0;
                    }
                    Object[] stg = new Object[]{"******", "*********", "******", "******", "*********", "****"};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(gestionchequeadherent.this.jTable1);
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }

        }).start();
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

