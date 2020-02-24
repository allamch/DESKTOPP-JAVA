/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class acceuil
        extends JFrame {

    public String typ;
    public String l;
    public String mp;
    private JRadioButton Re;
    private JRadioButton San;
    private ButtonGroup g1;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JTextField login1;
    private JPasswordField mppp;

    public acceuil() {
        this.initComponents();
    }

    private void initComponents() {
        
        this.g1 = new ButtonGroup();
        this.jLabel3 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel5 = new JLabel();
        this.login1 = new JTextField();
        this.San = new JRadioButton();
        this.Re = new JRadioButton();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.mppp = new JPasswordField();
        this.jLabel2 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.jMenuItem1 = new JMenuItem();
        this.setDefaultCloseOperation(3);
        this.setTitle("Authentification (Jihen brahem)");
        this.setMinimumSize(new Dimension(650, 400));
        this.getContentPane().setLayout(null);
        this.jLabel3.setBackground(new Color(255, 255, 255));
        this.jLabel3.setFont(new Font("Tahoma", 3, 18));
        this.jLabel3.setText("Login :");
        this.getContentPane().add(this.jLabel3);
        this.jLabel3.setBounds(230, 180, 140, 30);
        this.jLabel1.setBackground(new Color(255, 255, 255));
        this.jLabel1.setFont(new Font("Tahoma", 3, 18));
        this.jLabel1.setText("Mot de passe :");
        this.getContentPane().add(this.jLabel1);
        this.jLabel1.setBounds(230, 220, 140, 30);
        this.jLabel6.setBackground(new Color(255, 255, 255));
        this.jLabel6.setFont(new Font("Tahoma", 3, 18));
        this.jLabel6.setText("Type de Compte:");
        this.getContentPane().add(this.jLabel6);
        this.jLabel6.setBounds(230, 260, 175, 20);
        this.jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/image/acc/logo.PNG")));
        this.getContentPane().add(this.jLabel5);
        this.jLabel5.setBounds(10, 160, 190, 170);
        this.login1.setFont(new Font("Tahoma", 1, 14));
        this.getContentPane().add(this.login1);
        this.login1.setBounds(410, 180, 210, 30);
        this.g1.add(this.San);
        this.San.setFont(new Font("Tahoma", 1, 14));
        this.San.setText("Sant\u00e9");
        this.San.setContentAreaFilled(false);
        this.San.setCursor(new Cursor(0));
        this.San.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                acceuil.this.SanActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.San);
        this.San.setBounds(420, 260, 65, 25);
        this.g1.add(this.Re);
        this.Re.setFont(new Font("Tahoma", 1, 14));
        this.Re.setText("Retrait\u00e9");
        this.getContentPane().add(this.Re);
        this.Re.setBounds(510, 260, 81, 25);
        this.jButton1.setFont(new Font("Tahoma", 3, 14));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent evt) {
                acceuil.this.jButton1MouseEntered(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                acceuil.this.jButton1MouseExited(evt);
            }
        });
        this.jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                acceuil.this.jButton1ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton1);
        this.jButton1.setBounds(410, 300, 100, 33);
        this.jButton2.setFont(new Font("Tahoma", 3, 14));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.jButton2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent evt) {
                acceuil.this.jButton2MouseEntered(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                acceuil.this.jButton2MouseExited(evt);
            }
        });
        this.jButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                acceuil.this.jButton2ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton2);
        this.jButton2.setBounds(520, 300, 90, 33);
        this.mppp.setFont(new Font("Tahoma", 1, 14));
        this.getContentPane().add(this.mppp);
        this.mppp.setBounds(410, 220, 210, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 36));
        this.jLabel2.setForeground(new Color(51, 51, 255));
        this.jLabel2.setText("C");
        this.getContentPane().add(this.jLabel2);
        this.jLabel2.setBounds(100, 40, 30, 80);
        this.jLabel7.setFont(new Font("Tahoma", 1, 36));
        this.jLabel7.setForeground(new Color(0, 102, 204));
        this.jLabel7.setText("entre");
        this.getContentPane().add(this.jLabel7);
        this.jLabel7.setBounds(130, 40, 100, 80);
        this.jLabel8.setFont(new Font("Tahoma", 1, 36));
        this.jLabel8.setForeground(new Color(51, 51, 255));
        this.jLabel8.setText("S");
        this.getContentPane().add(this.jLabel8);
        this.jLabel8.setBounds(240, 40, 40, 80);
        this.jLabel9.setFont(new Font("Tahoma", 1, 36));
        this.jLabel9.setForeground(new Color(0, 102, 204));
        this.jLabel9.setText("ocial");
        this.getContentPane().add(this.jLabel9);
        this.jLabel9.setBounds(270, 40, 100, 80);
        this.jLabel10.setFont(new Font("Tahoma", 1, 36));
        this.jLabel10.setForeground(new Color(51, 51, 255));
        this.jLabel10.setText("M");
        this.getContentPane().add(this.jLabel10);
        this.jLabel10.setBounds(370, 40, 50, 80);
        this.jLabel11.setFont(new Font("Tahoma", 1, 36));
        this.jLabel11.setForeground(new Color(0, 102, 204));
        this.jLabel11.setText("ahdia");
        this.getContentPane().add(this.jLabel11);
        this.jLabel11.setBounds(410, 40, 120, 80);
        this.jLabel4.setIcon(new ImageIcon(this.getClass().getResource("/image/acc/blue-polygonal-background_1055-175.jpg")));
        this.jLabel4.setText("jhgjhkgjhghj");
        this.getContentPane().add(this.jLabel4);
        this.jLabel4.setBounds(0, 0, 630, 360);
        this.jMenu1.setForeground(new Color(0, 0, 204));
        this.jMenu1.setText("Gestion des comptes");
        this.jMenu1.setFont(new Font("Segoe UI", 1, 14));
        this.jMenuItem1.setFont(new Font("Segoe UI", 0, 14));
        this.jMenuItem1.setForeground(new Color(51, 102, 255));
        this.jMenuItem1.setIcon(new ImageIcon(this.getClass().getResource("/image/cl\u00e9.png")));
        this.jMenuItem1.setText("Modification de mot de passe");
        this.jMenuItem1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                acceuil.this.jMenuItem1ActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.jMenuItem1);
        this.jMenuBar1.add(this.jMenu1);
        this.setJMenuBar(this.jMenuBar1);
        this.pack();
    }

    private void jButton1MouseEntered(MouseEvent evt) {
    }

    private void jButton1MouseExited(MouseEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date actuellEeddc = new Date();
        SimpleDateFormat dateFormattddcd = new SimpleDateFormat("dd/MM/yyyy");
        String datdddc = dateFormattddcd.format(actuellEeddc);
        String dt = "09/01/2020";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date datefin = null;
        try {
            datefin = sdf.parse(dt);
        } catch (ParseException ex) {
            Logger.getLogger(acceuil.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date datsystem = null;
        try {
            datsystem = sdf.parse(datdddc);
        } catch (ParseException ex) {
            Logger.getLogger(acceuil.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (datsystem.before(datefin)) {
            boolean b = false;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT * FROM login  WHERE login='amal'");
                while (result2.next()) {
                    String ncnr = result2.getString("mp");
                    if (!ncnr.equals("132")) {
                        continue;
                    }
                    b = true;
                }
            } catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Er" + e.getMessage());
            }
            if (b) {
                boolean k = false;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state2 = conn2.createStatement();
                    ResultSet result2 = state2.executeQuery("SELECT * FROM login  WHERE login='" + this.login1.getText() + "' AND mp='" + this.mppp.getText() + "'");
                    while (result2.next()) {
                        k = true;
                        if (this.San.isSelected()) {
                            System.out.println("type de compts = " + this.typ);
                            sante a = new sante();
                            a.show();
                            this.setVisible(false);
                            continue;
                        }
                        if (!this.Re.isSelected()) {
                            continue;
                        }
                        System.out.println("type de compts = " + this.typ);
                        retretait c = new retretait();
                        c.show();
                        this.setVisible(false);
                    }
                } catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Erreure login/mot de passe" + e.getMessage());
                }
                if (!k) {
                    this.Re.setSelected(false);
                    this.San.setSelected(false);
                    this.login1.setText("");
                    this.mppp.setText("");
                    JOptionPane.showMessageDialog(null, "Erreure login/mot de passe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "  1   ");
            }
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state = conn2.createStatement();
                state.executeUpdate("UPDATE login SET mp='1' WHERE login='j'");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreure de connexion aux serveur");
            }
            JOptionPane.showMessageDialog(null, " 2     ");
        }
    }

    private void jButton2MouseEntered(MouseEvent evt) {
    }

    private void jButton2MouseExited(MouseEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void jMenuItem1ActionPerformed(ActionEvent evt) {
        this.setVisible(false);
        new mot_de_passe().setVisible(true);
    }

    private void SanActionPerformed(ActionEvent evt) {
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (!"Nimbus".equals(info.getName())) {
                    continue;
                }
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(acceuil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(acceuil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(acceuil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(acceuil.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                System.out.println("dfsdfs");
                new acceuil().setVisible(true);
            }
        });
    }

}
