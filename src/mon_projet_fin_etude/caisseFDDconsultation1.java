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

public class caisseFDDconsultation1
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JLabel montant;

    public caisseFDDconsultation1() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel7 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel1 = new JLabel();
        this.montant = new JLabel();
        this.jLabel3 = new JLabel();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Consultation de Caisse FDD");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(170, 0, 510, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/Capture.PNG")));
        this.jButton1.setText("Recherche");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseFDDconsultation1.this.jButton1ActionPerformed(evt);
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
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 800, 550);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        System.out.println("----------------------fgdfgh--------");
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
            ResultSet result2 = state2.executeQuery("SELECT * FROM caissefdd  WHERE n='1'");
            while (result2.next()) {
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

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

