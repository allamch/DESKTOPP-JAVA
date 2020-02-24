/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  com.toedter.calendar.JDateChooser
 */
package mon_projet_fin_etude;

import com.toedter.calendar.JDateChooser;
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
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ajoutercanciencheque
extends JPanel {
    private JDateChooser datecheque;
    private JButton jButton15;
    private JComboBox jComboBox3;
    private JLabel jLabel14;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel36;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JTable jTable1;
    private JTextField mecano;
    private JTextField montant;
    private JLabel n;
    private JLabel ncc;
    private JTextField numcarnet;
    private JTextField numcheque;
    private JComboBox observ;

    public ajoutercanciencheque() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.numcarnet = new JTextField();
        this.numcheque = new JTextField();
        this.jButton15 = new JButton();
        this.jLabel36 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel25 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel26 = new JLabel();
        this.jLabel27 = new JLabel();
        this.datecheque = new JDateChooser();
        this.jLabel28 = new JLabel();
        this.montant = new JTextField();
        this.jSeparator1 = new JSeparator();
        this.jLabel29 = new JLabel();
        this.jLabel31 = new JLabel();
        this.n = new JLabel();
        this.ncc = new JLabel();
        this.jLabel30 = new JLabel();
        this.observ = new JComboBox();
        this.jLabel32 = new JLabel();
        this.jComboBox3 = new JComboBox();
        this.setLayout(new CardLayout());
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "Ajouter un ancien cheque ", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.numcarnet.setFont(new Font("Tahoma", 0, 14));
        this.numcarnet.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercanciencheque.this.numcarnetActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.numcarnet);
        this.numcarnet.setBounds(90, 30, 80, 30);
        this.numcheque.setFont(new Font("Tahoma", 0, 14));
        this.numcheque.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercanciencheque.this.numchequeActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.numcheque);
        this.numcheque.setBounds(270, 30, 150, 30);
        this.jButton15.setFont(new Font("Tahoma", 1, 12));
        this.jButton15.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton15.setText("Valider");
        this.jButton15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercanciencheque.this.jButton15ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton15);
        this.jButton15.setBounds(620, 120, 110, 40);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setText("N\u00b0 Cheque  :");
        this.jPanel16.add(this.jLabel36);
        this.jLabel36.setBounds(180, 30, 100, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "Les cheques", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ajoutercanciencheque.this.jScrollPane1MouseClicked(evt);
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
                ajoutercanciencheque.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                ajoutercanciencheque.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                ajoutercanciencheque.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 170, 720, 320);
        this.jLabel25.setBackground(new Color(153, 153, 255));
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setText("N\u00b0 carnet :");
        this.jPanel16.add(this.jLabel25);
        this.jLabel25.setBounds(10, 40, 80, 20);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(490, 30, 70, 30);
        this.jLabel26.setBackground(new Color(153, 153, 255));
        this.jLabel26.setFont(new Font("Tahoma", 1, 14));
        this.jLabel26.setText("Date :");
        this.jPanel16.add(this.jLabel26);
        this.jLabel26.setBounds(210, 80, 50, 20);
        this.jLabel27.setBackground(new Color(153, 153, 255));
        this.jLabel27.setFont(new Font("Tahoma", 1, 14));
        this.jLabel27.setText("Montant :");
        this.jPanel16.add(this.jLabel27);
        this.jLabel27.setBounds(10, 80, 70, 20);
        this.datecheque.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add((Component)this.datecheque);
        this.datecheque.setBounds(260, 70, 150, 30);
        this.jLabel28.setBackground(new Color(153, 153, 255));
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setText("Observation :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(410, 80, 100, 20);
        this.montant.setFont(new Font("Tahoma", 0, 14));
        this.jPanel16.add(this.montant);
        this.montant.setBounds(90, 70, 110, 30);
        this.jPanel16.add(this.jSeparator1);
        this.jSeparator1.setBounds(10, 110, 710, 10);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 204));
        this.jLabel29.setText("N\u00b0carnet :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(20, 120, 80, 20);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setForeground(new Color(0, 0, 204));
        this.jLabel31.setText("N\u00b0 cheque :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(240, 120, 100, 20);
        this.n.setBackground(new Color(153, 153, 255));
        this.n.setFont(new Font("Tahoma", 1, 18));
        this.n.setForeground(new Color(0, 0, 204));
        this.n.setText("...................");
        this.jPanel16.add(this.n);
        this.n.setBounds(330, 120, 120, 20);
        this.ncc.setFont(new Font("Tahoma", 1, 18));
        this.ncc.setForeground(new Color(0, 0, 204));
        this.ncc.setText(".....................");
        this.jPanel16.add(this.ncc);
        this.ncc.setBounds(110, 110, 70, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setText("Banque :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(570, 30, 70, 20);
        this.observ.setFont(new Font("Tahoma", 0, 24));
        this.observ.setForeground(new Color(255, 0, 0));
        this.observ.setModel(new DefaultComboBoxModel<String>(new String[]{"................", "Pr\u00e9ts Personnels", "Pr\u00e9ts Ouvries", "Pr\u00e9ts FDD", "Pr\u00e9ts Retrait\u00e9", "Prime", "Primes Scolaires", "Fournisseurs", "Gestion de centre", "Banque UIB", "Banque BH", "Banque BNA", "Banque BIAT"}));
        this.observ.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercanciencheque.this.observActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.observ);
        this.observ.setBounds(510, 70, 220, 35);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setText("Mecano :");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(420, 30, 70, 20);
        this.jComboBox3.setFont(new Font("Tahoma", 0, 18));
        this.jComboBox3.setModel(new DefaultComboBoxModel<String>(new String[]{"BT", "ATB", "BH", "BNA", "BZ", "STB", "UIB", "UBCI", "BIAT", "Poste"}));
        this.jComboBox3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ajoutercanciencheque.this.jComboBox3ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jComboBox3);
        this.jComboBox3.setBounds(640, 30, 90, 30);
        this.add((Component)this.jPanel16, "card2");
        this.getAccessibleContext().setAccessibleName("BULETIN D'ADHESION");
    }

    private void numcarnetActionPerformed(ActionEvent evt) {
    }

    private void numchequeActionPerformed(ActionEvent evt) {
    }

    private void jButton15ActionPerformed(ActionEvent evt) {
        boolean g;
        String banque = (String)this.jComboBox3.getSelectedItem();
        System.out.println(banque);
        boolean k = true;
        boolean bl = g = this.numcarnet.getText().equals("") || this.numcheque.getText().equals("");
        if (g) {
            k = false;
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Remplire Tous Les Champs", "Attention", 0);
        }
        String ch = "";
        if (this.observ.getSelectedItem().equals("Pr\u00e9ts Personnels")) {
            ch = "Pr\u00e9ts Personnels";
        } else if (this.observ.getSelectedItem().equals("Pr\u00e9ts Ouvries")) {
            ch = "Pr\u00e9ts Ouvries";
        } else if (this.observ.getSelectedItem().equals("Pr\u00e9ts Retrait\u00e9s")) {
            ch = "Pr\u00e9ts Retrait\u00e9s";
        } else if (this.observ.getSelectedItem().equals("Pr\u00e9ts FDD")) {
            ch = "Pr\u00e9ts FDD";
        } else if (this.observ.getSelectedItem().equals("Primes MASP")) {
            ch = "Primes MASP";
        } else if (this.observ.getSelectedItem().equals("Primes Scolaires")) {
            ch = "Primes Scolaires";
        } else if (this.observ.getSelectedItem().equals("Prime")) {
            ch = "Prime";
        } else if (this.observ.getSelectedItem().equals("Primes Retrait\u00e9s")) {
            ch = "Primes Retrait\u00e9s";
        } else if (this.observ.getSelectedItem().equals("Compte UIB")) {
            ch = "Compte UIB";
        } else if (this.observ.getSelectedItem().equals("Compte BNA")) {
            ch = "Compte BNA";
        } else if (this.observ.getSelectedItem().equals("Compte BIAT")) {
            ch = "Compte BIAT";
        } else if (this.observ.getSelectedItem().equals("Compte BHP")) {
            ch = "Compte BH";
        } else if (this.observ.getSelectedItem().equals("Compte STB")) {
            ch = "Compte STB";
        } else if (this.observ.getSelectedItem().equals("Fournisseurs")) {
            ch = "Fournisseurs";
        } else if (this.observ.getSelectedItem().equals("Gestion de centre")) {
            ch = "Gestion Centre";
        } else if (this.observ.getSelectedItem().equals("Pr\u00e9ts Retrait\u00e9")) {
            ch = "P\u00e9ts Retrait\u00e9";
        } else if (this.observ.getSelectedItem().equals("Banque UIB")) {
            ch = "banque UIB";
        } else if (this.observ.getSelectedItem().equals("Banque BH")) {
            ch = "banque BH";
        } else if (this.observ.getSelectedItem().equals("Banque BH")) {
            ch = "banque BH";
        } else if (this.observ.getSelectedItem().equals("Banque BNA")) {
            ch = "banque BNA";
        } else if (this.observ.getSelectedItem().equals("Banque BIAT")) {
            ch = "banque BIAT";
        } else {
            ch = "";
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Choisire L'observation", "Attention", 0);
            k = false;
        }
        if (k) {
            JOptionPane jop1;
            String num = this.numcarnet.getText();
            String date = "";
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
            Date d1 = this.datecheque.getDate();
            try {
                date = f.format(d1);
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                boolean b = true;
                String p = "0";
                state.executeUpdate("INSERT INTO talondescheque(numcheque,Numcarnet,Mecano,Montant,date,type,p,banque) VALUES('" + this.numcheque.getText() + "','" + this.numcarnet.getText() + "','" + this.mecano.getText() + "','" + this.montant.getText() + "','" + date + "','" + ch + "','" + p + "','" + banque + "')");
                JOptionPane jop12 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Succes d'ajout ", "Information", 1);
                this.ncc.setText(this.numcarnet.getText());
                this.n.setText(this.numcheque.getText());
                this.numcheque.setText("");
                this.numcarnet.setText("");
                this.mecano.setText("");
                this.montant.setText("");
            }
            catch (Exception e) {
                jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout :N\u00b0 cheque deja existe " + e.getMessage());
            }
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("N\u00b0 cheque");
            dt1.addColumn("N\u00b0 Mecano ");
            dt1.addColumn("N\u00b0 Montant ");
            dt1.addColumn("Date ");
            this.jTable1.setModel(dt1);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state3 = conn3.createStatement();
                String ff = "1";
                ResultSet result3 = state3.executeQuery("SELECT * FROM talondescheque WHERE Numcarnet='" + num + "'");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    String numch = result3.getString("numcheque");
                    String mecano = result3.getString("Mecano");
                    String mont = result3.getString("Montant");
                    String d = result3.getString("date");
                    Object[] stg = new Object[]{numch, mecano, mont, d};
                    dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "carnet n'existe pas !!" + e.getMessage());
            }
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

    private void observActionPerformed(ActionEvent evt) {
    }

    private void jComboBox3ActionPerformed(ActionEvent evt) {
        String[] messageStrings = new String[]{"bt", "bna", "biat"};
    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(img.getWidth(this), img.getHeight(this), 4);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

}

