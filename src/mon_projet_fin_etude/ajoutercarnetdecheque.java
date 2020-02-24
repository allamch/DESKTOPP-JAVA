/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class ajoutercarnetdecheque
extends JPanel {
    private JButton Quitter;
    private JComboBox bq;
    private JButton jButton15;
    private JLabel jLabel14;
    private JLabel jLabel24;
    private JLabel jLabel36;
    private JLabel jLabel6;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField numdebut;
    private JTextField numfin;

    public ajoutercarnetdecheque() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel24 = new JLabel();
        this.numdebut = new JTextField();
        this.numfin = new JTextField();
        this.jButton15 = new JButton();
        this.Quitter = new JButton();
        this.jLabel36 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.bq = new JComboBox();
        this.jLabel6 = new JLabel();
        this.setLayout(new CardLayout());
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "Ajouter un nouveaux carnet de cheque", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel24.setBackground(new Color(153, 153, 255));
        this.jLabel24.setFont(new Font("Tahoma", 1, 14));
        this.jLabel24.setText("N\u00b0 cheque Debut :");
        this.jPanel16.add(this.jLabel24);
        this.jLabel24.setBounds(20, 50, 140, 20);
        this.numdebut.setFont(new Font("Tahoma", 0, 14));
        this.numdebut.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetdecheque.this.numdebutActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.numdebut);
        this.numdebut.setBounds(170, 40, 160, 30);
        this.numfin.setFont(new Font("Tahoma", 0, 14));
        this.numfin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetdecheque.this.numfinActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.numfin);
        this.numfin.setBounds(480, 40, 160, 30);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Valider");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetdecheque.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(410, 80, 110, 40);
        this.Quitter.setFont(new Font("Tahoma", 1, 12));
        this.Quitter.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.Quitter.setText("Quitter");
        this.Quitter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetdecheque.this.QuitterActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.Quitter);
        this.Quitter.setBounds(530, 80, 110, 40);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setText("N\u00b0 Cheque Fin :");
        this.jPanel16.add(this.jLabel36);
        this.jLabel36.setBounds(360, 40, 110, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "Les carnets des cheques", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajoutercarnetdecheque.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"N\u00b0 Carnet", "N\u00b0 debut", "N\u00b0 fin"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajoutercarnetdecheque.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                ajoutercarnetdecheque.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                ajoutercarnetdecheque.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 140, 630, 290);
        this.bq.setFont(new Font("Tahoma", 0, 24));
        this.bq.setForeground(new Color(255, 0, 0));
        this.bq.setModel(new DefaultComboBoxModel<String>(new String[]{"", "BT", "UIB", "STB", "BH", "BIAT", "BNA", "ATB", "BZ", "UBCI", "Attijari", "AMEN BANK", "Poste"}));
        this.bq.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercarnetdecheque.this.bqActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.bq);
        this.bq.setBounds(150, 80, 150, 35);
        this.jLabel6.setFont(new Font("Tahoma", 0, 18));
        this.jLabel6.setForeground(new Color(0, 153, 255));
        this.jLabel6.setText("Banque :");
        this.jPanel16.add(this.jLabel6);
        this.jLabel6.setBounds(40, 90, 90, 22);
        this.add((Component)this.jPanel16, "card2");
        this.getAccessibleContext().setAccessibleName("BULETIN D'ADHESION");
    }

    private void numdebutActionPerformed(ActionEvent evt) {
    }

    private void numfinActionPerformed(ActionEvent evt) {
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        boolean g;
        boolean k = true;
        boolean bl = g = this.numdebut.getText().equals("") || this.numfin.getText().equals("");
        if (g) {
            k = false;
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        }
        if (k) {
            Connection conn2;
            JOptionPane jop3;
            String numcarnet = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state3 = conn2.createStatement();
                String ff = "1";
                ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE ff='" + ff + "'");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    numcarnet = result3.getString("num");
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                String j = "0";
                state.executeUpdate("UPDATE comptecourant SET ff='" + j + "' WHERE num='" + numcarnet + "'");
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
            }
            System.out.println("num carnet =" + numcarnet);
            int numsuivant = Integer.parseInt(numcarnet);
            numcarnet = "" + ++numsuivant + "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn3.createStatement();
                boolean b = true;
                String p = "0";
                String pp = "1";
                state.executeUpdate("INSERT INTO comptecourant(num,debut,fin,f,ff) VALUES('" + numcarnet + "','" + this.numdebut.getText() + "','" + this.numfin.getText() + "','" + p + "','" + pp + "')");
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Succes d'ajouter : N\u00b0 carnet= " + numcarnet, "Information", 1);
                this.numdebut.setText("");
                this.numfin.setText("");
            }
            catch (Exception e) {
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout :N\u00b0 carnet deja existe " + e.getMessage());
            }
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("Num carnet");
            dt1.addColumn("N\u00b0 Debut");
            dt1.addColumn("N\u00b0 fin ");
            this.jTable1.setModel(dt1);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state3 = conn4.createStatement();
                String ff = "1";
                ResultSet result3 = state3.executeQuery("SELECT * FROM comptecourant WHERE observation=''");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    String num = result3.getString("num");
                    String debut = result3.getString("debut");
                    String fin = result3.getString("fin");
                    Object[] stg = new Object[]{num, debut, fin};
                    dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                JOptionPane jop32 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
            }
        }
    }

    private void QuitterActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
        int nm = this.jTable1.getSelectedRow();
        System.out.println("\u00e8_____" + nm);
        String np = this.jTable1.getModel().getValueAt(nm, 0).toString();
        System.out.println("\u00e8_____" + np);
    }

    private void bqActionPerformed(ActionEvent evt) {
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(img.getWidth(this), img.getHeight(this), 4);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

}

