/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  com.mysql.jdbc.Connection
 *  com.mysql.jdbc.Statement
 */
package mon_projet_fin_etude;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mon_projet_fin_etude.recherchecarnedecheque;

public class orangesuppressiondemande
extends JPanel {
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JTextField ntel;

    public orangesuppressiondemande() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel5 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel7 = new JLabel();
        this.ntel = new JTextField();
        this.jLabel2 = new JLabel();
        this.jButton1 = new JButton();
        this.jPanel1.setLayout(null);
        this.jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/orange/or.PNG")));
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(570, 0, 70, 70);
        this.jLabel1.setFont(new Font("Tempus Sans ITC", 1, 30));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Suppression demande Orange");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(110, 0, 440, 40);
        this.jLabel4.setIcon(new ImageIcon(this.getClass().getResource("/orange/service.PNG")));
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(20, 0, 70, 80);
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setText("N\u00b0 Tel:");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(30, 80, 60, 40);
        this.ntel.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.ntel);
        this.ntel.setBounds(100, 80, 200, 40);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/orange/20403651_1912291548988708_739464188_n.png")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(220, 200, 320, 170);
        this.jButton1.setText("supprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                orangesuppressiondemande.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(320, 80, 190, 40);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 650, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, 462, 32767).addContainerGap()));
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Supprimer?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state7 = (Statement)conn2.createStatement();
                state7.executeUpdate("DELETE  FROM forfaitdemadeorange WHERE ntel='" + this.ntel.getText() + "'");
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Succes de suppression ", "Information", 1);
                this.setVisible(false);
            }
            catch (Exception e) {
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de vider le caisse " + e.getMessage());
            }
        }
    }

}

