/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.Impression1;

public class historiquevirmentretraite
extends JFrame {
    private JTable Table_Empoyee;
    private JPanel etat;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextField mo;

    public historiquevirmentretraite() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jPanel1 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jButton1 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.Table_Empoyee = new JTable();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.mo = new JTextField();
        this.etat = new JPanel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jButton4 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setFont(new Font("Tahoma", 3, 24));
        this.jLabel1.setText("Etat Virment Retraite");
        this.jPanel1.setBackground(new Color(204, 204, 204));
        this.jPanel1.setLayout(null);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setForeground(new Color(0, 51, 51));
        this.jLabel2.setText("Saisire le mois et l'ann\u00e9es :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(20, 7, 190, 30);
        this.jLabel3.setText("exemple: 04-2015");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(40, 30, 130, 14);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                historiquevirmentretraite.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(390, 10, 60, 70);
        this.Table_Empoyee.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.jScrollPane1.setViewportView(this.Table_Empoyee);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 100, 640, 380);
        this.jButton2.setText("Imprimer Tableaux");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                historiquevirmentretraite.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(530, 50, 130, 30);
        this.jButton3.setText("Imprimer l'etat");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                historiquevirmentretraite.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(530, 10, 120, 30);
        this.mo.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                historiquevirmentretraite.this.moActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mo);
        this.mo.setBounds(230, 10, 140, 30);
        this.etat.setLayout(null);
        this.jLabel4.setText("jLabel4");
        this.etat.add(this.jLabel4);
        this.jLabel4.setBounds(100, 32, 34, 14);
        this.jLabel5.setText("jLabel5");
        this.etat.add(this.jLabel5);
        this.jLabel5.setBounds(100, 52, 34, 14);
        this.jLabel6.setText("jLabel6");
        this.etat.add(this.jLabel6);
        this.jLabel6.setBounds(100, 72, 34, 14);
        this.jLabel9.setText("jLabel9");
        this.etat.add(this.jLabel9);
        this.jLabel9.setBounds(106, 152, 34, 14);
        this.jLabel10.setText("jLabel10");
        this.etat.add(this.jLabel10);
        this.jLabel10.setBounds(169, 152, 92, 14);
        this.jLabel11.setText("jLabel11");
        this.etat.add(this.jLabel11);
        this.jLabel11.setBounds(294, 152, 40, 14);
        this.jLabel12.setText("jLabel12");
        this.etat.add(this.jLabel12);
        this.jLabel12.setBounds(100, 305, 40, 14);
        this.jPanel1.add(this.etat);
        this.etat.setBounds(20, 140, 620, 340);
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/Button-Close-icon.png")));
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                historiquevirmentretraite.this.jButton4ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 661, 32767).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel1, -2, 286, -2).addGap(155, 155, 155).addComponent(this.jButton4))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 32, -2).addComponent(this.jButton4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -1, 504, 32767).addContainerGap()));
        this.pack();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            String bb = "";
            ResultSet result3 = state.executeQuery("SELECT * FROM etatvirmentr  WHERE mois='" + this.mo.getText() + "'");
            int k = 0;
            while (result3.next()) {
                k = 1;
                k = 2;
                for (int i = 1; i < 4; ++i) {
                    String m = result3.getString("mois");
                    String mont = result3.getString("montant");
                    String tir = result3.getString("TIREUR");
                    String num = result3.getString("numcheque");
                    this.jLabel10.setText(tir);
                    Impression1 ss = new Impression1(this.etat);
                    ss.jiji(evt);
                }
            }
            if (k == 0) {
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Aucune cheque pour cette date ", "Attention", 0);
            }
            if (k == 1) {
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Aucune cheque pour la banque " + bb, "Attention", 0);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat("Report Print");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.Table_Empoyee.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Cannot print ", e.getMessage());
        }
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        boolean g = this.mo.getText().equals("");
        if (g) {
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Saisire le mois et l'ann\u00e9es ", "Attention", 0);
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("Date");
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom");
                dt1.addColumn("Banque");
                dt1.addColumn("Montant");
                this.Table_Empoyee.setModel(dt1);
                ResultSet result3 = state.executeQuery("SELECT * FROM etatvirment  WHERE mois='" + this.mo.getText() + "'");
                boolean k = false;
                while (result3.next()) {
                    k = true;
                    String m = result3.getString("mois");
                    String mec = result3.getString("MECANO");
                    String nom = result3.getString("nom");
                    String ban = result3.getString("banque");
                    String mont = result3.getString("montant");
                    Object[] stg = new Object[]{m, mec, nom, ban, mont};
                    dt1.addRow(stg);
                }
                if (!k) {
                    JOptionPane jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "aucune Virment pour cette date ", "Attention", 0);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
            }
        }
    }

    private void moActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(historiquevirmentretraite.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(historiquevirmentretraite.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(historiquevirmentretraite.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(historiquevirmentretraite.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new historiquevirmentretraite().setVisible(true);
            }
        });
    }

}

