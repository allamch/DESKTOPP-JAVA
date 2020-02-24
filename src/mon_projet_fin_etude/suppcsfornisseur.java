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
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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

public class suppcsfornisseur
extends JFrame {
    String mec = "";
    String num = "";
    String mat = "";
    String a = "";
    String raison = "";
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JPanel jPanel2;
    private JTextField l;
    private JPasswordField mp;

    public suppcsfornisseur() {
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
        this.jLabel4.setBounds(0, 0, 400, 43);
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
                suppcsfornisseur.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton2);
        this.jButton2.setBounds(90, 120, 110, 40);
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/boncommande/yes.PNG")));
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                suppcsfornisseur.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton3);
        this.jButton3.setBounds(200, 120, 110, 40);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, 396, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, 170, -2));
        this.pack();
    }

    public void setvalued(String mecano, String matf, String numbc, String abc, String raisup) {
        this.mec = mecano;
        this.mat = matf;
        this.num = numbc;
        this.a = abc;
        this.raison = raisup;
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        ResultSet result2;
        JOptionPane jop3;
        Statement state2;
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
            state2 = (Statement)conn2.createStatement();
            result2 = state2.executeQuery("SELECT * FROM login  WHERE login='" + this.l.getText() + "' AND mp='" + this.mp.getText() + "'");
            while (result2.next()) {
                k = true;
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Er" + e.getMessage());
        }
        if (k) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state2 = (Statement)conn2.createStatement();
                result2 = state2.executeQuery("SELECT * FROM bc WHERE Mecano='" + this.mec + "' AND nbc='" + this.num + "' AND matf='" + this.mat + "'AND anneesdebut='" + this.a + "'");
                while (result2.next()) {
                    JOptionPane jop1;
                    String Matfour = result2.getString("Matf");
                    String nnbc = result2.getString("nbc");
                    String datbc = result2.getString("datebc");
                    String moidebut = result2.getString("moisdebut");
                    String anndebut = result2.getString("anneesdebut");
                    String compt = result2.getString("accompte");
                    String montanbc = result2.getString("montantbc");
                    String montandevis = result2.getString("montantdevis");
                    String nbmois = result2.getString("nbmois");
                    String paiementpar = result2.getString("paimenpar");
                    String code = result2.getString("codeb");
                    String modebc = result2.getString("mode");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = (Statement)conn2.createStatement();
                        state3.executeUpdate("INSERT INTO  bandecommandehistorique(Mecano,Matf,nbc,datebc,moisdebut,anneesdebut,accompte,montantbc,montantdevis,nbmois,paimenpar,code,mode,raison,login) VALUES('" + this.mec + "','" + Matfour + "','" + this.num + "','" + datbc + "','" + moidebut + "','" + anndebut + "','" + compt + "','" + montanbc + "','" + montandevis + "','" + nbmois + "','" + paiementpar + "','" + code + "','" + modebc + "','" + this.raison + "','" + this.l.getText() + "')");
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Statement state7 = (Statement)conn2.createStatement();
                            state7.executeUpdate("DELETE  FROM bc WHERE Mecano='" + this.mec + "' AND  Matf='" + this.mat + "' AND nbc='" + this.num + "' AND anneesdebut='" + anndebut + "'");
                            jop1 = new JOptionPane();
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
                        jop1 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse : " + e.getMessage());
                    }
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de slection" + e.getMessage());
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
            Logger.getLogger(suppcsfornisseur.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(suppcsfornisseur.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(suppcsfornisseur.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(suppcsfornisseur.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new suppcsfornisseur().setVisible(true);
            }
        });
    }

}

