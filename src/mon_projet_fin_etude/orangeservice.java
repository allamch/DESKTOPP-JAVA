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
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

public class orangeservice
extends JPanel {
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JRadioButton jRadioButton1;
    private JScrollPane jScrollPane4;
    private JTable jTable4;
    private JTextField mont;
    private JTextField nbm;
    private JTextField nomf;
    private JTextField rem;

    public orangeservice() {
        this.initComponents();
    }

    private void initComponents() {
        this.jRadioButton1 = new JRadioButton();
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel2 = new JLabel();
        this.rem = new JTextField();
        this.jLabel3 = new JLabel();
        this.mont = new JTextField();
        this.jLabel7 = new JLabel();
        this.nomf = new JTextField();
        this.jLabel8 = new JLabel();
        this.nbm = new JTextField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jScrollPane4 = new JScrollPane();
        this.jTable4 = new JTable();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jRadioButton1.setText("jRadioButton1");
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tempus Sans ITC", 1, 30));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Les Forfait Orange");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(180, 0, 370, 40);
        this.jLabel4.setIcon(new ImageIcon(this.getClass().getResource("/orange/service.PNG")));
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(10, 0, 70, 80);
        this.jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/orange/or.PNG")));
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(570, 0, 70, 70);
        this.jLabel6.setFont(new Font("Tahoma", 0, 18));
        this.jLabel6.setForeground(new Color(0, 0, 204));
        this.jLabel6.setText("Service demand\u00e9s :");
        this.jPanel1.add(this.jLabel6);
        this.jLabel6.setBounds(80, 40, 170, 30);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Remarque :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(20, 150, 90, 30);
        this.rem.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.rem);
        this.rem.setBounds(170, 150, 390, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("Montant :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(320, 110, 80, 30);
        this.mont.setFont(new Font("Tahoma", 0, 12));
        this.mont.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                orangeservice.this.montKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mont);
        this.mont.setBounds(400, 110, 160, 30);
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setText("Nom Forfait:");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(20, 70, 90, 30);
        this.nomf.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.nomf);
        this.nomf.setBounds(170, 70, 390, 30);
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setText("Nombre de mois :");
        this.jPanel1.add(this.jLabel8);
        this.jLabel8.setBounds(20, 110, 130, 30);
        this.nbm.setFont(new Font("Tahoma", 0, 12));
        this.nbm.setText("24");
        this.nbm.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                orangeservice.this.nbmKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.nbm);
        this.nbm.setBounds(170, 110, 140, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/orange/t\u00e9l\u00e9chargement.jpg")));
        this.jButton1.setText("Ajouter");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                orangeservice.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(700, 30, 160, 40);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/orange/rech.jpg")));
        this.jButton2.setText("Recherche ");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                orangeservice.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(700, 90, 160, 40);
        this.jScrollPane4.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane4.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane4.setName("");
        this.jScrollPane4.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                orangeservice.this.jScrollPane4MouseClicked(evt);
            }
        });
        this.jTable4.setFont(new Font("Tahoma", 1, 18));
        this.jTable4.setModel(new DefaultTableModel(new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"nom", "nb mois", "montant"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable4.setRowHeight(25);
        this.jTable4.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                orangeservice.this.jTable4MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                orangeservice.this.jTable4MouseEntered(evt);
            }
        });
        this.jTable4.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                orangeservice.this.jTable4AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane4.setViewportView(this.jTable4);
        this.jPanel1.add(this.jScrollPane4);
        this.jScrollPane4.setBounds(0, 190, 640, 390);
        this.jLabel9.setIcon(new ImageIcon(this.getClass().getResource("/orange/et.png")));
        this.jPanel1.add(this.jLabel9);
        this.jLabel9.setBounds(650, 140, 220, 260);
        this.jLabel10.setIcon(new ImageIcon(this.getClass().getResource("/orange/ser.png")));
        this.jPanel1.add(this.jLabel10);
        this.jLabel10.setBounds(660, 300, 230, 270);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 937, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 584, 32767));
    }

    private void jTable4MouseClicked(MouseEvent evt) {
    }

    private void jTable4MouseEntered(MouseEvent evt) {
    }

    private void jTable4AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane4MouseClicked(MouseEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        if (this.mont.getText().length() <= 3) {
            JOptionPane.showMessageDialog(null, "Montant Incorrect !!");
        }
        if (this.nomf.getText().equals("") || this.nbm.getText().equals("") || this.mont.equals("")) {
            JOptionPane.showMessageDialog(null, "Remplir tous les champs");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                state.executeUpdate("INSERT INTO forfaitorange(nom,nbmois,Montant,remarque) VALUES('" + this.nomf.getText() + "','" + this.nbm.getText() + "','" + this.mont.getText() + "','" + this.rem.getText() + "')");
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Succes d'ajout  ", "Information", 1);
            }
            catch (Exception e) {
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout " + e.getMessage());
            }
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Nom");
            dt1.addColumn("NB mois");
            dt1.addColumn("Montant");
            dt1.addColumn("Remarque");
            this.jTable4.setModel(dt1);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  forfaitorange ");
                while (result2.next()) {
                    String nom = result2.getString("nom");
                    String nbm = result2.getString("nbmois");
                    String Montant = result2.getString("Montant");
                    Montant = new StringBuilder(Montant).insert(Montant.length() - 3, ".").toString();
                    String remarque = result2.getString("remarque");
                    Object[] stg = new Object[]{nom, nbm, Montant, remarque};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable4);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
        }
    }

    private void montKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.mont.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.mont.setText("");
        }
    }

    private void nbmKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.nbm.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.nbm.setText("");
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("Nom");
        dt1.addColumn("NB mois");
        dt1.addColumn("Montant");
        dt1.addColumn("Remarque");
        this.jTable4.setModel(dt1);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  forfaitorange ");
            while (result2.next()) {
                String nom = result2.getString("nom");
                String nbm = result2.getString("nbmois");
                String Montant = result2.getString("Montant");
                Montant = new StringBuilder(Montant).insert(Montant.length() - 3, ".").toString();
                String remarque = result2.getString("remarque");
                Object[] stg = new Object[]{nom, nbm, Montant, remarque};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable4);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
    }

}

