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
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mon_projet_fin_etude.recherchecarnedecheque;

public class suppcessionfornisseuvalide
extends JFrame {
    String mecc;
    String matt;
    String mon;
    String date;
    String premierm;
    String dernierm;
    String nb;
    String montantpar;
    String REF;
    String MOIS;
    String PV;
    String raison;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JPanel jPanel2;
    private JTextField l;
    private JPasswordField mp;

    public suppcessionfornisseuvalide() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jLabel4 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.l = new JTextField();
        this.mp = new JPasswordField();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPanel2.setLayout(null);
        this.jLabel4.setFont(new Font("Tempus Sans ITC", 1, 24));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("\"Voulez-vous vraiment Supprimer?\"");
        this.jPanel2.add(this.jLabel4);
        this.jLabel4.setBounds(0, 0, 440, 30);
        this.jLabel1.setFont(new Font("Tahoma", 0, 18));
        this.jLabel1.setText("Mot passe :");
        this.jPanel2.add(this.jLabel1);
        this.jLabel1.setBounds(20, 80, 120, 30);
        this.jLabel2.setFont(new Font("Tahoma", 0, 18));
        this.jLabel2.setText("Login :");
        this.jPanel2.add(this.jLabel2);
        this.jLabel2.setBounds(20, 40, 90, 30);
        this.l.setFont(new Font("Tahoma", 0, 12));
        this.jPanel2.add(this.l);
        this.l.setBounds(130, 40, 180, 30);
        this.mp.setFont(new Font("Tahoma", 0, 12));
        this.jPanel2.add(this.mp);
        this.mp.setBounds(130, 80, 180, 30);
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/boncommande/non.PNG")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfornisseuvalide.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton2);
        this.jButton2.setBounds(200, 120, 110, 40);
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/boncommande/yes.PNG")));
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcessionfornisseuvalide.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton3);
        this.jButton3.setBounds(320, 120, 110, 40);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, 446, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, 181, 32767));
        this.pack();
    }

    public void setvalued(String mecc1, String matt1, String mon1, String date1, String premierm1, String dernierm1, String nb1, String montantpar1, String REF1, String raison1) {
        this.mecc = mecc1;
        this.matt = matt1;
        this.mon = mon1;
        this.date = date1;
        this.premierm = premierm1;
        this.dernierm = dernierm1;
        this.nb = nb1;
        this.montantpar = montantpar1;
        this.REF = REF1;
        this.raison = raison1;
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean k = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = (Statement)conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT * FROM login  WHERE login='" + this.l.getText() + "' AND mp='" + this.mp.getText() + "'");
            while (result2.next()) {
                k = true;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Er" + e.getMessage());
        }
        if (k) {
            String datsystem;
            Date actuellEee = new Date();
            SimpleDateFormat dateFormatft = new SimpleDateFormat("yyyy-MM-dd");
            String datsupp = datsystem = dateFormatft.format(actuellEee);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state3 = (Statement)conn2.createStatement();
                state3.executeUpdate("INSERT INTO  cessionhistoriquesupp (Mecano,Matf,date,premiermois,derniermois,ref,montant,montantparmois,nbmois,raison,Datsupp,login) VALUES ('" + this.mecc + "','" + this.matt + "','" + this.date + "','" + this.premierm + "','" + this.dernierm + "','" + this.REF + "','" + this.mon + "','" + this.montantpar + "','" + this.nb + "','" + this.raison + "','" + datsupp + "','" + this.l.getText() + "')");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state7 = (Statement)conn2.createStatement();
                    state7.executeUpdate("DELETE  FROM cessionfournisseur WHERE Mecano='" + this.mecc + "' AND  Matricule='" + this.matt + "'  AND date='" + this.date + "'");
                    System.out.println(this.mecc);
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Succes de suppression ", "Information", 1);
                    this.setVisible(false);
                }
                catch (Exception e) {
                    JOptionPane jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur de vider le caisse " + e.getMessage());
                }
            }
            catch (Exception e) {
                boolean K = false;
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse : " + e.getMessage());
            }
        } else {
            this.l.setText("");
            this.mp.setText("");
            JOptionPane.showMessageDialog(null, "login ou mot de passe incorrect !!");
        }
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
            Logger.getLogger(suppcessionfornisseuvalide.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(suppcessionfornisseuvalide.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(suppcessionfornisseuvalide.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(suppcessionfornisseuvalide.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new suppcessionfornisseuvalide().setVisible(true);
            }
        });
    }

}

