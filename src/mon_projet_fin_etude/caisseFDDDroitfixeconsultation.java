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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import mon_projet_fin_etude.recherchecarnedecheque;

public class caisseFDDDroitfixeconsultation
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JLabel montant;

    public caisseFDDDroitfixeconsultation() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel1 = new JLabel();
        this.montant = new JLabel();
        this.jLabel3 = new JLabel();
        this.jButton2 = new JButton();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Consultation de Caisse Droit Fixe FDD");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(130, 0, 550, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/Capture.PNG")));
        this.jButton1.setText("Recherche");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseFDDDroitfixeconsultation.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(90, 70, 150, 30);
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setForeground(new Color(102, 0, 153));
        this.jLabel1.setText("Consult\u00e9:");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(0, 70, 120, 30);
        this.montant.setFont(new Font("Tahoma", 1, 18));
        this.montant.setForeground(new Color(102, 0, 0));
        this.montant.setText("............................................");
        this.jPanel16.add(this.montant);
        this.montant.setBounds(250, 50, 540, 60);
        this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/cc.PNG")));
        this.jPanel16.add(this.jLabel3);
        this.jLabel3.setBounds(170, 120, 400, 420);
        this.jButton2.setText("jButton2");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseFDDDroitfixeconsultation.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton2);
        this.jButton2.setBounds(10, 100, 73, 23);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 800, 550);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
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
            String nn = "1";
            System.out.println("---------------------fffrrrrr--------");
            ResultSet result2 = state2.executeQuery("SELECT * FROM caissefdddroitfixe  WHERE n='" + nn + "'");
            System.out.println("----------------------hhhhh--------");
            while (result2.next()) {
                System.out.println("----------------------fggggh--------");
                String total = result2.getString("total");
                total = new StringBuilder(total).insert(total.length() - 3, ".").toString();
                this.montant.setText(total + " DT");
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Montant n'existe pas" + e.getMessage());
            this.k = 0;
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            String Mec = "2017";
            ResultSet result3 = state3.executeQuery("SELECT * FROM demandefdd  WHERE anne='" + Mec + "'");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            int tot = 0;
            while (result3.next()) {
                String nbch = result3.getString("nbch");
                String Mecano = result3.getString("Mecano");
                String montant = result3.getString("Montant");
                String date = result3.getString("date");
                montant = montant.replaceAll(",", "");
                String mff = "";
                String md = "";
                String di = montant.substring(0, montant.length() - 3);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT * FROM montantcession2  WHERE md=" + di);
                    ResultSetMetaData resultMeta = result.getMetaData();
                    while (result.next()) {
                        mff = result.getString("mf");
                        md = result.getString("md");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur montant F " + e.getMessage());
                    this.k = 0;
                }
                int mdd = tot + Integer.parseInt(md);
                int mfff = tot + Integer.parseInt(mff);
                int droitfixe = mdd - mfff;
                mff = "" + droitfixe + "000";
                String totalee = "" + (tot += droitfixe) + "000";
                System.out.println("NB :" + nbch + " => droitfix = " + droitfixe + " totalee=" + totalee);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state1 = conn2.createStatement();
                    String nn = "0";
                    state1.executeUpdate("INSERT INTO  caissefdddroitfixe(nbch,anne,Mecano,debit,credit,total,date,n) VALUES('" + nbch + "','2017','" + Mecano + "','0','" + mff + "','" + totalee + "','" + date + "','" + nn + "')");
                    this.k = 1;
                }
                catch (Exception e) {
                    this.k = 0;
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur d'ajout caisse fdd : " + e.getMessage());
                }
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
        }
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

