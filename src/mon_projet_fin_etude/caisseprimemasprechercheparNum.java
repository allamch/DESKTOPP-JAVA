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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;

public class caisseprimemasprechercheparNum
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JTextField a1;
    private JTextField a2;
    private JLabel annedebut2;
    private JLabel annefin;
    private JTable ca;
    private JButton jButton1;
    private JLabel jLabel30;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JRadioButton nn;

    public caisseprimemasprechercheparNum() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.ca = new JTable();
        this.jLabel30 = new JLabel();
        this.jLabel7 = new JLabel();
        this.annedebut2 = new JLabel();
        this.annefin = new JLabel();
        this.a2 = new JTextField();
        this.a1 = new JTextField();
        this.nn = new JRadioButton();
        this.jButton1 = new JButton();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimemasprechercheparNum.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.ca.setFont(new Font("Tahoma", 0, 12));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null, null}}, new String[]{"N\u00b0", "Anne", "Date", "Mecano", "N\u00b0 CNR", "Nom et prenom", "Debit", "Credit", "total"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, Object.class, Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setRowHeight(30);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimemasprechercheparNum.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caisseprimemasprechercheparNum.this.caMouseEntered(evt);
            }
        });
        this.ca.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                caisseprimemasprechercheparNum.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.ca);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 70, 750, 440);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("Recherche  :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(30, 30, 90, 30);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Consultation de l'historique de Caisse Prime MASP par N\u00b0");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(0, 0, 750, 30);
        this.annedebut2.setFont(new Font("Tahoma", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 0));
        this.annedebut2.setText("N\u00b0 debut :");
        this.jPanel16.add(this.annedebut2);
        this.annedebut2.setBounds(240, 30, 80, 30);
        this.annefin.setFont(new Font("Tahoma", 1, 14));
        this.annefin.setForeground(new Color(153, 0, 0));
        this.annefin.setText("N\u00b0 fin :");
        this.jPanel16.add(this.annefin);
        this.annefin.setBounds(440, 30, 50, 30);
        this.a2.setEnabled(false);
        this.a2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimemasprechercheparNum.this.a2MouseClicked(evt);
            }
        });
        this.a2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimemasprechercheparNum.this.a2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.a2);
        this.a2.setBounds(490, 30, 110, 30);
        this.a1.setEnabled(false);
        this.a1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimemasprechercheparNum.this.a1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a1);
        this.a1.setBounds(320, 30, 110, 30);
        this.nn.setFont(new Font("Tahoma", 1, 14));
        this.nn.setText("N\u00b0");
        this.nn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseprimemasprechercheparNum.this.nnMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.nn);
        this.nn.setBounds(130, 30, 60, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimemasprechercheparNum.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(650, 30, 100, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 770, 520);
    }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
        int nm = this.ca.getSelectedRow();
        System.out.println("\u00e8_____" + nm);
        String np = this.ca.getModel().getValueAt(nm, 0).toString();
        System.out.println("\u00e8_____" + np);
    }

    private void a2MouseClicked(MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
        DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
        while (medelo.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); ++i) {
                model.removeRow(i);
            }
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            int n1 = totale = Integer.parseInt(this.a1.getText());
            int n2 = totale = Integer.parseInt(this.a2.getText());
            ResultSet result2 = state2.executeQuery("SELECT *  FROM   caisseprimemasphistorique WHERE netat BETWEEN " + n1 + " AND " + n2);
            System.out.println("-------55555555555555555-------");
            int n = n1;
            while (result2.next()) {
                totale = Integer.parseInt(result2.getString("netat"));
                int nn2 = totale;
                if (nn2 > n1) {
                    n1 = nn2;
                    medelo.addRow(new Object[]{"---", "---", "---", "---", "---", "---", "----", "----", "----"});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
                this.k = 1;
                boolean kk = true;
                System.out.println("------11111111111111-------");
                String nom = "";
                String NCNR = "";
                String num = result2.getString("netat");
                String anne = result2.getString("anne");
                String date = result2.getString("date");
                String debit = result2.getString("debit");
                if (!debit.equals("0")) {
                    debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                }
                String credit = result2.getString("credit");
                if (!credit.equals("0")) {
                    nom = "VIR MASP";
                    kk = false;
                    credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                }
                String total = result2.getString("total");
                total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                String mecano = result2.getString("mecano");
                if (mecano.equals("")) {
                    this.k = 0;
                }
                System.out.println("-------222222222222222222222222222-------");
                if (this.k == 1) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            NCNR = result3.getString("NCNR");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                }
                System.out.println("-------3333333333333333333333333-------");
                medelo.addRow(new Object[]{num, anne, date, mecano, NCNR, nom, debit, credit, total});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                System.out.println("-------78877777777777777-------");
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void a1MouseClicked(MouseEvent evt) {
        DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
        DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
        while (medelo.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); ++i) {
                model.removeRow(i);
            }
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            int n1 = totale = Integer.parseInt(this.a1.getText());
            int n2 = totale = Integer.parseInt(this.a2.getText());
            ResultSet result2 = state2.executeQuery("SELECT *  FROM   caisseprimemasphistorique WHERE netat BETWEEN " + n1 + " AND " + n2);
            System.out.println("-------55555555555555555-------");
            int n = n1;
            while (result2.next()) {
                totale = Integer.parseInt(result2.getString("netat"));
                int nn2 = totale;
                if (nn2 > n1) {
                    n1 = nn2;
                    medelo.addRow(new Object[]{"---", "---", "---", "---", "---", "---", "----", "----", "----"});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
                this.k = 1;
                boolean kk = true;
                System.out.println("------11111111111111-------");
                String nom = "";
                String NCNR = "";
                String num = result2.getString("netat");
                String anne = result2.getString("anne");
                String date = result2.getString("date");
                String debit = result2.getString("debit");
                if (!debit.equals("0")) {
                    debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                }
                String credit = result2.getString("credit");
                if (!credit.equals("0")) {
                    nom = "VIR MASP";
                    kk = false;
                    credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                }
                String total = result2.getString("total");
                total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                String mecano = result2.getString("mecano");
                if (mecano.equals("")) {
                    this.k = 0;
                }
                System.out.println("-------222222222222222222222222222-------");
                if (this.k == 1) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            NCNR = result3.getString("NCNR");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                }
                System.out.println("-------3333333333333333333333333-------");
                medelo.addRow(new Object[]{num, anne, date, mecano, NCNR, nom, debit, credit, total});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                System.out.println("-------78877777777777777-------");
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat("historique de caisse masp  ");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.ca.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void nnMouseClicked(MouseEvent evt) {
        this.a1.enable(true);
        this.a2.enable(true);
        this.a1.setText("1");
        this.a2.setText("1000");
        DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
        DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
        while (medelo.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); ++i) {
                model.removeRow(i);
            }
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int totale = 0;
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            int n1 = totale = Integer.parseInt(this.a1.getText());
            int n2 = totale = Integer.parseInt(this.a2.getText());
            ResultSet result2 = state2.executeQuery("SELECT *  FROM   caisseprimemasphistorique WHERE netat BETWEEN " + n1 + " AND " + n2);
            System.out.println("-------55555555555555555-------");
            int n = n1;
            while (result2.next()) {
                totale = Integer.parseInt(result2.getString("netat"));
                int nn2 = totale;
                if (nn2 > n1) {
                    n1 = nn2;
                    medelo.addRow(new Object[]{"---", "---", "---", "---", "---", "---", false, false, "----", "----", "----"});
                    ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                }
                this.k = 1;
                boolean kk = true;
                System.out.println("------11111111111111-------");
                String nom = "";
                String NCNR = "";
                String num = result2.getString("netat");
                String anne = result2.getString("anne");
                String date = result2.getString("date");
                String debit = result2.getString("debit");
                if (!debit.equals("0")) {
                    debit = new StringBuilder(debit).insert(debit.length() - 3, ".").toString();
                }
                String credit = result2.getString("credit");
                if (!credit.equals("0")) {
                    nom = "VIR MASP";
                    kk = false;
                    credit = new StringBuilder(credit).insert(credit.length() - 3, ".").toString();
                }
                String total = result2.getString("total");
                total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                String mecano = result2.getString("mecano");
                if (mecano.equals("")) {
                    this.k = 0;
                }
                System.out.println("-------222222222222222222222222222-------");
                if (this.k == 1) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            NCNR = result3.getString("NCNR");
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                    }
                }
                System.out.println("-------3333333333333333333333333-------");
                medelo.addRow(new Object[]{num, anne, date, mecano, NCNR, nom, debit, credit, total});
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
                System.out.println("-------78877777777777777-------");
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
        }
    }

    private void a2ActionPerformed(ActionEvent evt) {
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

