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
import javax.swing.GroupLayout;
import javax.swing.JButton;
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

public class Mainleveancien
extends JPanel {
    private JTextField anne;
    private JTextField bq;
    private JTable ca;
    private JTextField date;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JScrollPane jScrollPane3;
    private JTextField mc;
    private JTextField mecano;
    private JTextField mont;
    private JTextField nbm;
    private JLabel nomt;
    private JTextField num;

    public Mainleveancien() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.nomt = new JLabel();
        this.mecano = new JTextField();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.num = new JTextField();
        this.jLabel6 = new JLabel();
        this.anne = new JTextField();
        this.jLabel7 = new JLabel();
        this.date = new JTextField();
        this.jLabel8 = new JLabel();
        this.mont = new JTextField();
        this.jLabel9 = new JLabel();
        this.mc = new JTextField();
        this.jLabel10 = new JLabel();
        this.nbm = new JTextField();
        this.jLabel11 = new JLabel();
        this.bq = new JTextField();
        this.jButton1 = new JButton();
        this.jScrollPane3 = new JScrollPane();
        this.ca = new JTable();
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tahoma", 0, 36));
        this.jLabel1.setForeground(new Color(51, 0, 153));
        this.jLabel1.setText("Ancien Main Lev\u00e9e");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(113, 0, 380, 31);
        this.nomt.setFont(new Font("Tahoma", 1, 14));
        this.nomt.setText("...............................................................");
        this.jPanel1.add(this.nomt);
        this.nomt.setBounds(260, 30, 420, 30);
        this.mecano.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                Mainleveancien.this.mecanoMouseClicked(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                Mainleveancien.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(130, 30, 120, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 18));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("N\u00b0 :");
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(30, 70, 60, 40);
        this.jLabel5.setFont(new Font("Tahoma", 1, 18));
        this.jLabel5.setForeground(new Color(153, 0, 153));
        this.jLabel5.setText("Mecano :");
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(20, 30, 100, 30);
        this.num.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.num);
        this.num.setBounds(130, 70, 110, 30);
        this.jLabel6.setFont(new Font("Tahoma", 1, 18));
        this.jLabel6.setForeground(new Color(153, 0, 153));
        this.jLabel6.setText("Ann\u00e9e :");
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(310, 70, 90, 40);
        this.anne.setFont(new Font("Tahoma", 0, 12));
        this.anne.setText("2017");
        this.jPanel1.add(this.anne);
        this.anne.setBounds(430, 70, 110, 30);
        this.jLabel7.setFont(new Font("Tahoma", 1, 18));
        this.jLabel7.setForeground(new Color(153, 0, 153));
        this.jLabel7.setText("Date :");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(30, 110, 90, 30);
        this.date.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.date);
        this.date.setBounds(130, 110, 140, 30);
        this.jLabel8.setFont(new Font("Tahoma", 1, 18));
        this.jLabel8.setForeground(new Color(153, 0, 153));
        this.jLabel8.setText("Montant :");
        this.jPanel1.add(this.jLabel8);
        this.jLabel8.setBounds(310, 110, 100, 30);
        this.mont.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.mont);
        this.mont.setBounds(430, 110, 140, 30);
        this.jLabel9.setFont(new Font("Tahoma", 1, 18));
        this.jLabel9.setForeground(new Color(153, 0, 153));
        this.jLabel9.setText("Mc :");
        this.jPanel1.add(this.jLabel9);
        this.jLabel9.setBounds(30, 190, 60, 30);
        this.mc.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.mc);
        this.mc.setBounds(130, 190, 140, 30);
        this.jLabel10.setFont(new Font("Tahoma", 1, 18));
        this.jLabel10.setForeground(new Color(153, 0, 153));
        this.jLabel10.setText("NB mois :");
        this.jPanel1.add(this.jLabel10);
        this.jLabel10.setBounds(310, 150, 100, 30);
        this.nbm.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.nbm);
        this.nbm.setBounds(430, 150, 140, 30);
        this.jLabel11.setFont(new Font("Tahoma", 1, 18));
        this.jLabel11.setForeground(new Color(153, 0, 153));
        this.jLabel11.setText("BQ :");
        this.jPanel1.add(this.jLabel11);
        this.jLabel11.setBounds(30, 150, 60, 30);
        this.bq.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.bq);
        this.bq.setBounds(130, 150, 140, 30);
        this.jButton1.setFont(new Font("Tahoma", 0, 18));
        this.jButton1.setText("Valider");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Mainleveancien.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(430, 190, 150, 30);
        this.jScrollPane3.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane3.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane3.setName("");
        this.jScrollPane3.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                Mainleveancien.this.jScrollPane3MouseClicked(evt);
            }
        });
        this.ca.setFont(new Font("Tahoma", 0, 13));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}}, new String[]{"N\u00b0", "Ann\u00e9e", "Mecanoo", "Nom", "CNR", "CIN", "Montant", "Date"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setRowHeight(30);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                Mainleveancien.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                Mainleveancien.this.caMouseEntered(evt);
            }
        });
        this.ca.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                Mainleveancien.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane3.setViewportView(this.ca);
        this.jPanel1.add(this.jScrollPane3);
        this.jScrollPane3.setBounds(0, 230, 690, 260);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 695, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 500, -2).addContainerGap(-1, 32767)));
    }

    private void mecanoMouseClicked(MouseEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        JOptionPane jop3;
        ResultSetMetaData resultMeta3;
        ResultSet result3;
        Statement state3;
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
        String datdd = dateFormatt.format(actuellEe);
        String ann\u00e9es = datdd.substring(6, datdd.length());
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
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("Ann\u00e9e");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("CNR");
        dt1.addColumn("Date");
        dt1.addColumn("Mont");
        dt1.addColumn("BQ");
        dt1.addColumn("NB");
        dt1.addColumn("Mc");
        this.ca.setModel(dt1);
        try {
            String cnr = "";
            String nom = "";
            String nume = "1";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn22.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  Mainleveetat  ORDER BY num  ");
            while (result2.next()) {
                nume = result2.getString("num");
                String anee = result2.getString("anne");
                String MECANO = result2.getString("MECANO");
                String datee = result2.getString("Date");
                String montt = result2.getString("mont");
                String bqq = result2.getString("bq");
                String nb = result2.getString("nbmois");
                String mcc = result2.getString("mc");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state32 = conn22.createStatement();
                    ResultSet result32 = state32.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + MECANO);
                    while (result32.next()) {
                        cnr = result32.getString("NCNR");
                        nom = result32.getString("nom");
                    }
                }
                catch (Exception e) {
                    // empty catch block
                }
                Object[] stg = new Object[]{nume, anee, MECANO, nom, cnr, datee, montt, bqq, nb, mcc};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
            this.num.setText(nume);
        }
        catch (Exception e) {
            JOptionPane jop32 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur prime" + e.getMessage());
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            state2.executeUpdate("INSERT INTO Mainleveetat(num,anne,mecano,Date,mont,bq,nbmois,mc) VALUES('" + this.num.getText() + "','" + this.anne.getText() + "','" + this.mecano.getText() + "','" + this.date.getText() + "','" + this.mont.getText() + "','" + this.bq.getText() + "','" + this.nbm.getText() + "','" + this.mc.getText() + "')");
        }
        catch (Exception e) {
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur d'ajout a talon de cheque : " + e.getMessage());
        }
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0");
        dt1.addColumn("Ann\u00e9e");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("CNR");
        dt1.addColumn("Date");
        dt1.addColumn("Mont");
        dt1.addColumn("BQ");
        dt1.addColumn("NB");
        dt1.addColumn("Mc");
        this.ca.setModel(dt1);
        try {
            String cnr = null;
            String nom = null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  Mainleveetat  ORDER BY num  ");
            while (result2.next()) {
                String nume = result2.getString("num");
                String anee = result2.getString("anne");
                String MECANO = result2.getString("MECANO");
                String datee = result2.getString("Date");
                String montt = result2.getString("mont");
                String bqq = result2.getString("bq");
                String nb = result2.getString("nbmois");
                String mcc = result2.getString("mc");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state3 = conn2.createStatement();
                    ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + MECANO);
                    while (result3.next()) {
                        cnr = result3.getString("NCNR");
                        nom = result3.getString("nom");
                    }
                }
                catch (Exception e) {
                    // empty catch block
                }
                Object[] stg = new Object[]{nume, anee, MECANO, nom, cnr, datee, montt, bqq, nb, mcc};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur prime" + e.getMessage());
        }
    }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane3MouseClicked(MouseEvent evt) {
    }

}

