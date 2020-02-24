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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class etatcheque
extends JFrame {
    private JTable Table_Empoyee;
    private JComboBox bq;
    private JPanel etat;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextField mo;

    public etatcheque() {
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
        this.jComboBox1 = new JComboBox();
        this.jLabel7 = new JLabel();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jLabel8 = new JLabel();
        this.mo = new JTextField();
        this.bq = new JComboBox();
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
        this.jLabel1.setText("Etat Cheque");
        this.jPanel1.setBackground(new Color(204, 204, 204));
        this.jPanel1.setLayout(null);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setForeground(new Color(0, 51, 51));
        this.jLabel2.setText("Saisire le mois et l'ann\u00e9es :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(20, 7, 190, 20);
        this.jLabel3.setText("exemple: 04-2015");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(40, 30, 150, 14);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcheque.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(590, 10, 60, 30);
        this.Table_Empoyee.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.jScrollPane1.setViewportView(this.Table_Empoyee);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 100, 640, 380);
        this.jComboBox1.setFont(new Font("Tahoma", 0, 24));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{".........", "Centre", "Fournisseur"}));
        this.jComboBox1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcheque.this.jComboBox1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jComboBox1);
        this.jComboBox1.setBounds(230, 50, 140, 35);
        this.jLabel7.setFont(new Font("Tahoma", 0, 18));
        this.jLabel7.setForeground(new Color(0, 51, 51));
        this.jLabel7.setText("Banque :");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(390, 10, 80, 22);
        this.jButton2.setText("Imprimer Tableaux");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcheque.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(390, 53, 130, 30);
        this.jButton3.setText("Imprimer l'etat");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcheque.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(530, 53, 120, 30);
        this.jLabel8.setFont(new Font("Tahoma", 0, 18));
        this.jLabel8.setForeground(new Color(0, 51, 51));
        this.jLabel8.setText("A l'ordre de :");
        this.jPanel1.add(this.jLabel8);
        this.jLabel8.setBounds(70, 60, 110, 22);
        this.mo.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcheque.this.moActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.mo);
        this.mo.setBounds(230, 10, 140, 30);
        this.bq.setFont(new Font("Tahoma", 0, 24));
        this.bq.setForeground(new Color(255, 0, 0));
        this.bq.setModel(new DefaultComboBoxModel<String>(new String[]{"", "BT", "BNA", "UIB", "BH", "ATB", "STB"}));
        this.bq.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatcheque.this.bqActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.bq);
        this.bq.setBounds(470, 10, 80, 35);
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
                etatcheque.this.jButton4ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 661, 32767).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel1, -2, 198, -2).addGap(178, 178, 178).addComponent(this.jButton4))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 32, -2).addComponent(this.jButton4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -1, 504, 32767).addContainerGap()));
        this.pack();
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        try {
            JOptionPane jop2;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state = conn2.createStatement();
            String bb = "";
            ResultSet result3 = state.executeQuery("SELECT * FROM etatcheque  WHERE mois='" + this.mo.getText() + "'");
            int k = 0;
            while (result3.next()) {
                k = 1;
                String b = result3.getString("banque");
                if (!this.bq.getSelectedItem().equals(b)) continue;
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
                jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Aucune cheque pour cette date ", "Attention", 0);
            }
            if (k == 1) {
                jop2 = new JOptionPane();
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
        } else if (this.jComboBox1.getSelectedItem().equals("Centre")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("Date");
                dt1.addColumn("Nom fornisseure");
                dt1.addColumn("Montant");
                dt1.addColumn("Num cheque");
                dt1.addColumn("Banque");
                this.Table_Empoyee.setModel(dt1);
                ResultSet result3 = state.executeQuery("SELECT * FROM etatcheque  WHERE mois='" + this.mo.getText() + "'");
                boolean k = false;
                while (result3.next()) {
                    k = true;
                    String m = result3.getString("mois");
                    String mont = result3.getString("montant");
                    String tir = result3.getString("TIREUR");
                    String num = result3.getString("numcheque");
                    String b = result3.getString("banque");
                    Object[] stg = new Object[]{m, tir, mont, num, b};
                    dt1.addRow(stg);
                }
                if (!k) {
                    JOptionPane jop2 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "aucune cheque pour cette date ", "Attention", 0);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
            }
        } else if (!this.jComboBox1.getSelectedItem().equals("Adherent")) {
            if (this.jComboBox1.getSelectedItem().equals("Fournisseur")) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn3.createStatement();
                    DefaultTableModel dt1 = new DefaultTableModel();
                    dt1.addColumn("Date");
                    dt1.addColumn("Nom fornisseure");
                    dt1.addColumn("montant");
                    dt1.addColumn("banque");
                    this.Table_Empoyee.setModel(dt1);
                    ResultSet result3 = state.executeQuery("SELECT * FROM etatchequef  WHERE mois='" + this.mo.getText() + "'");
                    boolean k = false;
                    while (result3.next()) {
                        k = true;
                        String m = result3.getString("mois");
                        String mont = result3.getString("montant");
                        String tir = result3.getString("TIREUR");
                        String b = result3.getString("banque");
                        Object[] stg = new Object[]{m, tir, mont, b};
                        dt1.addRow(stg);
                    }
                    if (!k) {
                        JOptionPane jop2 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "aucune cheque pour cette date ", "Attention", 0);
                    }
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
                }
            } else if (!this.jComboBox1.getSelectedItem().equals("Non adherent")) {
                JOptionPane jop2 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "A l'ordre de ???", "Attention", 0);
            }
        }
    }

    private void moActionPerformed(ActionEvent evt) {
    }

    private void bqActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(etatcheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(etatcheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(etatcheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(etatcheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new etatcheque().setVisible(true);
            }
        });
    }

}

