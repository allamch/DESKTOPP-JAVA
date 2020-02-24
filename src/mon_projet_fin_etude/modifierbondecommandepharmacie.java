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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class modifierbondecommandepharmacie
extends JPanel {
    String ch1 = "";
    String t;
    String matt = "";
    int k = 0;
    int kk = 0;
    int anedebut = 0;
    String type = "pharmacie";
    String mat = "";
    String n = "";
    String nbccc = "";
    private JPanel INFO;
    private JLabel MOIS;
    private JTextField a1;
    private JLabel aabc;
    private JLabel annedebut3;
    private JLabel bq;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JLabel dt;
    private JRadioButton g2;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel38;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator3;
    private JTable jTable1;
    private JComboBox m1;
    private JTextField matriculefr;
    private JLabel mcc;
    private JTextField mec;
    private JLabel mecanomadh;
    private JLabel moisdebut1;
    private JLabel mont;
    private JTextField montantbc;
    private JLabel nb;
    private JLabel nnbc;
    private JLabel nomadh;
    private JLabel nomadherant;
    private JLabel nomf;
    private JLabel noms;
    private JComboBox nomsc;
    private JLabel nomscc;
    private JLabel remisee;
    private JLabel remisee1;

    public modifierbondecommandepharmacie() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.buttonGroup2 = new ButtonGroup();
        this.INFO = new JPanel();
        this.jSeparator3 = new JSeparator();
        this.nomf = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel7 = new JLabel();
        this.noms = new JLabel();
        this.remisee = new JLabel();
        this.jLabel10 = new JLabel();
        this.nb = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.MOIS = new JLabel();
        this.remisee1 = new JLabel();
        this.jPanel16 = new JPanel();
        this.mec = new JTextField();
        this.jLabel38 = new JLabel();
        this.jLabel6 = new JLabel();
        this.nomadh = new JLabel();
        this.nomsc = new JComboBox();
        this.g2 = new JRadioButton();
        this.jLabel34 = new JLabel();
        this.m1 = new JComboBox();
        this.a1 = new JTextField();
        this.moisdebut1 = new JLabel();
        this.annedebut3 = new JLabel();
        this.jLabel35 = new JLabel();
        this.montantbc = new JTextField();
        this.jButton1 = new JButton();
        this.jLabel33 = new JLabel();
        this.jButton2 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.matriculefr = new JTextField();
        this.jLabel3 = new JLabel();
        this.jPanel1 = new JPanel();
        this.nnbc = new JLabel();
        this.aabc = new JLabel();
        this.mcc = new JLabel();
        this.nomscc = new JLabel();
        this.mont = new JLabel();
        this.bq = new JLabel();
        this.nomadherant = new JLabel();
        this.mecanomadh = new JLabel();
        this.dt = new JLabel();
        this.jLabel2 = new JLabel();
        this.setLayout(null);
        this.INFO.setBorder(BorderFactory.createTitledBorder(null, "Information Fornisseur", 0, 0, new Font("Agency FB", 1, 14), new Color(0, 0, 255)));
        this.INFO.setLayout(null);
        this.INFO.add(this.jSeparator3);
        this.jSeparator3.setBounds(132, 91, 4, 2);
        this.nomf.setFont(new Font("Tahoma", 1, 13));
        this.nomf.setForeground(new Color(153, 0, 0));
        this.nomf.setText("............................");
        this.INFO.add(this.nomf);
        this.nomf.setBounds(10, 90, 180, 28);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Nom fournisseur :");
        this.INFO.add(this.jLabel4);
        this.jLabel4.setBounds(10, 60, 130, 17);
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setText("Nom Sociter:");
        this.INFO.add(this.jLabel7);
        this.jLabel7.setBounds(10, 130, 130, 17);
        this.noms.setFont(new Font("Tahoma", 1, 13));
        this.noms.setForeground(new Color(153, 0, 0));
        this.noms.setText("............................");
        this.INFO.add(this.noms);
        this.noms.setBounds(10, 160, 190, 28);
        this.remisee.setFont(new Font("Tahoma", 1, 18));
        this.remisee.setForeground(new Color(153, 0, 0));
        this.remisee.setText("..........");
        this.INFO.add(this.remisee);
        this.remisee.setBounds(110, 190, 40, 28);
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("Remise :");
        this.INFO.add(this.jLabel10);
        this.jLabel10.setBounds(10, 200, 130, 17);
        this.nb.setFont(new Font("Tahoma", 1, 18));
        this.nb.setForeground(new Color(153, 0, 0));
        this.nb.setText("..........");
        this.INFO.add(this.nb);
        this.nb.setBounds(110, 230, 70, 28);
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("Jour d\u00e9but :");
        this.INFO.add(this.jLabel12);
        this.jLabel12.setBounds(10, 270, 90, 30);
        this.jLabel13.setFont(new Font("Tahoma", 1, 14));
        this.jLabel13.setText("Nb de mois:");
        this.INFO.add(this.jLabel13);
        this.jLabel13.setBounds(10, 240, 90, 17);
        this.MOIS.setFont(new Font("Tahoma", 1, 14));
        this.MOIS.setForeground(new Color(153, 0, 0));
        this.MOIS.setText("..............");
        this.INFO.add(this.MOIS);
        this.MOIS.setBounds(110, 264, 80, 40);
        this.remisee1.setFont(new Font("Tahoma", 1, 18));
        this.remisee1.setForeground(new Color(153, 0, 0));
        this.remisee1.setText("%");
        this.INFO.add(this.remisee1);
        this.remisee1.setBounds(150, 190, 30, 28);
        this.add(this.INFO);
        this.INFO.setBounds(10, 80, 200, 370);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.mec.setFont(new Font("Tahoma", 0, 14));
        this.mec.setEnabled(false);
        this.mec.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                modifierbondecommandepharmacie.this.mecMouseClicked(evt);
            }
        });
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                modifierbondecommandepharmacie.this.mecKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.mec);
        this.mec.setBounds(420, 100, 100, 30);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 18));
        this.jLabel38.setForeground(new Color(0, 102, 102));
        this.jLabel38.setText("Nom et prenom :");
        this.jPanel16.add(this.jLabel38);
        this.jLabel38.setBounds(90, 130, 160, 30);
        this.jLabel6.setFont(new Font("Snap ITC", 1, 24));
        this.jLabel6.setForeground(new Color(0, 0, 153));
        this.jLabel6.setText("Modifier: Bon de Commande  pharmacie");
        this.jPanel16.add(this.jLabel6);
        this.jLabel6.setBounds(80, 10, 580, 40);
        this.nomadh.setBackground(new Color(153, 153, 255));
        this.nomadh.setFont(new Font("Tahoma", 1, 18));
        this.nomadh.setForeground(new Color(0, 153, 51));
        this.nomadh.setText("................");
        this.jPanel16.add(this.nomadh);
        this.nomadh.setBounds(250, 130, 390, 30);
        this.nomsc.setFont(new Font("Tahoma", 1, 14));
        this.nomsc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                modifierbondecommandepharmacie.this.nomscMouseClicked(evt);
            }
        });
        this.nomsc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifierbondecommandepharmacie.this.nomscActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nomsc);
        this.nomsc.setBounds(140, 50, 240, 40);
        this.buttonGroup2.add(this.g2);
        this.g2.setText("jRadioButton7");
        this.jPanel16.add(this.g2);
        this.g2.setBounds(343, 360, 0, 23);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText("Mecano :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(340, 100, 80, 30);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.setEnabled(false);
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifierbondecommandepharmacie.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.m1);
        this.m1.setBounds(60, 100, 60, 30);
        this.a1.setFont(new Font("Tahoma", 1, 12));
        this.a1.setEnabled(false);
        this.a1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                modifierbondecommandepharmacie.this.a1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a1);
        this.a1.setBounds(210, 100, 100, 30);
        this.moisdebut1.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut1.setForeground(new Color(153, 0, 0));
        this.moisdebut1.setText("Mois :");
        this.jPanel16.add(this.moisdebut1);
        this.moisdebut1.setBounds(10, 100, 50, 30);
        this.annedebut3.setFont(new Font("Tahoma", 1, 14));
        this.annedebut3.setForeground(new Color(153, 0, 0));
        this.annedebut3.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annedebut3);
        this.annedebut3.setBounds(150, 100, 50, 30);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setForeground(new Color(0, 0, 255));
        this.jLabel35.setText("Montant :");
        this.jPanel16.add(this.jLabel35);
        this.jLabel35.setBounds(530, 100, 80, 30);
        this.montantbc.setFont(new Font("Tahoma", 0, 14));
        this.montantbc.setEnabled(false);
        this.montantbc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                modifierbondecommandepharmacie.this.montantbcMouseClicked(evt);
            }
        });
        this.montantbc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifierbondecommandepharmacie.this.montantbcActionPerformed(evt);
            }
        });
        this.montantbc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                modifierbondecommandepharmacie.this.montantbcKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.montantbc);
        this.montantbc.setBounds(610, 100, 130, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton1.setText("Modifier");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifierbondecommandepharmacie.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(500, 50, 110, 40);
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setForeground(new Color(0, 0, 255));
        this.jLabel33.setText("Nom Sociter :");
        this.jPanel16.add(this.jLabel33);
        this.jLabel33.setBounds(20, 50, 110, 40);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton2.setText("Imprimer");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifierbondecommandepharmacie.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton2);
        this.jButton2.setBounds(620, 50, 120, 40);
        this.jScrollPane1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), BorderFactory.createLineBorder(new Color(0, 0, 0))));
        this.jScrollPane1.setForeground(new Color(0, 153, 102));
        this.jScrollPane1.setViewportBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jScrollPane1.setFont(new Font("Tahoma", 1, 14));
        this.jTable1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.jTable1.setRowHeight(30);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                modifierbondecommandepharmacie.this.jTable1MouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(30, 170, 690, 310);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(210, 10, 770, 490);
        this.matriculefr.setFont(new Font("Tahoma", 1, 14));
        this.matriculefr.setForeground(new Color(153, 153, 153));
        this.matriculefr.setText("         Matricule");
        this.matriculefr.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                modifierbondecommandepharmacie.this.matriculefrMouseClicked(evt);
            }
        });
        this.matriculefr.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                modifierbondecommandepharmacie.this.matriculefrActionPerformed(evt);
            }
        });
        this.matriculefr.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                modifierbondecommandepharmacie.this.matriculefrKeyReleased(evt);
            }
        });
        this.add(this.matriculefr);
        this.matriculefr.setBounds(60, 30, 140, 40);
        this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/53734.png")));
        this.add(this.jLabel3);
        this.jLabel3.setBounds(10, 20, 50, 50);
        this.jPanel1.setLayout(null);
        this.nnbc.setFont(new Font("Tahoma", 1, 12));
        this.nnbc.setText("........");
        this.jPanel1.add(this.nnbc);
        this.nnbc.setBounds(290, 10, 40, 30);
        this.aabc.setFont(new Font("Tahoma", 1, 12));
        this.aabc.setText("........");
        this.jPanel1.add(this.aabc);
        this.aabc.setBounds(350, 10, 50, 30);
        this.mcc.setFont(new Font("Tahoma", 1, 12));
        this.mcc.setText("...........");
        this.jPanel1.add(this.mcc);
        this.mcc.setBounds(500, 30, 70, 20);
        this.nomscc.setFont(new Font("Tahoma", 1, 12));
        this.nomscc.setText("........................................");
        this.jPanel1.add(this.nomscc);
        this.nomscc.setBounds(190, 50, 260, 20);
        this.mont.setFont(new Font("Tahoma", 1, 12));
        this.mont.setText("0.000");
        this.jPanel1.add(this.mont);
        this.mont.setBounds(500, 0, 100, 30);
        this.bq.setFont(new Font("Tahoma", 1, 12));
        this.bq.setText(".............");
        this.jPanel1.add(this.bq);
        this.bq.setBounds(500, 60, 70, 20);
        this.nomadherant.setFont(new Font("Tahoma", 1, 12));
        this.nomadherant.setText("............................................");
        this.jPanel1.add(this.nomadherant);
        this.nomadherant.setBounds(80, 110, 390, 30);
        this.mecanomadh.setFont(new Font("Tahoma", 1, 12));
        this.mecanomadh.setText("...............");
        this.jPanel1.add(this.mecanomadh);
        this.mecanomadh.setBounds(520, 110, 80, 30);
        this.dt.setFont(new Font("Tahoma", 1, 12));
        this.dt.setText("...............");
        this.jPanel1.add(this.dt);
        this.dt.setBounds(470, 180, 100, 30);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/image/pharmacie/phar.png")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(0, 0, 610, 270);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(250, 750, 610, 30);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void matriculefrKeyReleased(KeyEvent evt) {
        DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.nomsc.getModel();
        cmbModel.removeAllElements();
        cmbModel.removeAllElements();
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean test = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + this.matriculefr.getText() + "' AND type='" + this.type + "'");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nomf.setText(result3.getString("NOMSOC"));
                this.noms.setText(result3.getString("NOMSOC"));
                this.remisee.setText(result3.getString("remise"));
                this.nb.setText(result3.getString("nbmois"));
                this.matt = this.matriculefr.getText();
                this.MOIS.setText(result3.getString("mois"));
                test = true;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
        }
        if (test) {
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            int i = 0;
            int n = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.nomsc.addItem("");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur  WHERE  type='" + this.type + "' ORDER BY NOMSOC");
                while (result2.next()) {
                    ++i;
                    this.nomsc.addItem(result2.getString("NOMSOC"));
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
            System.out.println("===============================");
            System.out.println("n= " + n);
            this.nomsc.setSelectedIndex(n);
            Date actuellEe = new Date();
            SimpleDateFormat dateFormatt = new SimpleDateFormat("yyyy");
            String datdd = dateFormatt.format(actuellEe);
            System.out.println("date = " + datdd);
        }
    }

    private void matriculefrMouseClicked(MouseEvent evt) {
        DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.nomsc.getModel();
        cmbModel.removeAllElements();
        cmbModel.removeAllElements();
        this.matriculefr.setText("");
        this.mec.setText("");
        this.nomadh.setText("................");
        this.nomf.setText("............................");
        this.noms.setText("............................");
        this.remisee.setText("..........");
        this.nb.setText("..........");
        this.MOIS.setText("..............");
        this.g2.setSelected(true);
    }

    private void matriculefrActionPerformed(ActionEvent evt) {
    }

    private void montantbcKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.montantbc.getText());
            this.jButton1.setVisible(true);
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
        }
    }

    private void montantbcActionPerformed(ActionEvent evt) {
    }

    private void montantbcMouseClicked(MouseEvent evt) {
        this.montantbc.setText("");
    }

    private void m1ActionPerformed(ActionEvent evt) {
    }

    private void nomscActionPerformed(ActionEvent evt) {
    }

    private void nomscMouseClicked(MouseEvent evt) {
        this.jLabel34.setVisible(false);
        this.jLabel35.setVisible(false);
        this.montantbc.setVisible(false);
        this.nomadh.setVisible(false);
        this.jLabel38.setVisible(false);
        this.jButton1.setVisible(false);
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
        String datdd = dateFormatt.format(actuellEe);
        String jours = datdd.substring(0, datdd.length() - 8);
        String mois2 = datdd.substring(3, datdd.length() - 5);
        int ms = Integer.parseInt(mois2);
        switch (ms) {
            case 1: {
                this.m1.setSelectedIndex(2);
                break;
            }
            case 2: {
                this.m1.setSelectedIndex(3);
                break;
            }
            case 3: {
                this.m1.setSelectedIndex(4);
                break;
            }
            case 4: {
                this.m1.setSelectedIndex(5);
                break;
            }
            case 5: {
                this.m1.setSelectedIndex(6);
                break;
            }
            case 6: {
                this.m1.setSelectedIndex(7);
                break;
            }
            case 7: {
                this.m1.setSelectedIndex(8);
                break;
            }
            case 8: {
                this.m1.setSelectedIndex(9);
                break;
            }
            case 9: {
                this.m1.setSelectedIndex(10);
                break;
            }
            case 10: {
                this.m1.setSelectedIndex(11);
                break;
            }
            case 11: {
                this.m1.setSelectedIndex(12);
                break;
            }
            case 12: {
                this.m1.setSelectedIndex(1);
                break;
            }
            default: {
                this.m1.setSelectedIndex(0);
            }
        }
        String ann\u00e9es = datdd.substring(6, datdd.length());
        this.a1.setText(ann\u00e9es);
        this.a1.enable(true);
        this.m1.enable(true);
        DefaultComboBoxModel cmbModel = (DefaultComboBoxModel)this.nomsc.getModel();
        cmbModel.removeAllElements();
        cmbModel.removeAllElements();
        this.matriculefr.setText("         Matricule");
        this.mec.setText("");
        this.nomadh.setText("................");
        this.nomf.setText("............................");
        this.noms.setText("............................");
        this.remisee.setText("..........");
        this.nb.setText("..........");
        this.MOIS.setText("..............");
        this.g2.setSelected(true);
        this.matriculefr.setText("         Matricule");
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.nomsc.addItem("");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur  WHERE  type='" + this.type + "' ORDER BY NOMSOC");
            while (result2.next()) {
                this.nomsc.addItem(result2.getString("NOMSOC"));
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
    }

    private void mecKeyReleased(KeyEvent evt) {
        this.jButton1.setVisible(false);
        this.nomadh.setVisible(true);
        this.jLabel38.setVisible(true);
        Connection conn2 = null;
        this.kk = 0;
        this.nomadh.setText(".................");
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSetMetaData resultMeta3;
            Statement state3;
            ResultSet result3;
            int montantnet = Integer.parseInt(this.mec.getText());
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mec.getText());
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.kk = 1;
                    this.t = "S";
                    this.nomadh.setText(result3.getString("nom"));
                }
            }
            catch (Exception e) {
                // empty catch block
            }
            if (this.k == 0) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mec.getText());
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        this.kk = 1;
                        this.t = "R";
                        this.nomadh.setText(result3.getString("nom"));
                    }
                }
                catch (Exception e) {
                    // empty catch block
                }
            }
            if (this.kk == 0) {
                this.nomadh.setText(".................");
            }
            System.out.println("k=" + this.k);
        }
        catch (Exception e) {
            this.kk = 0;
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.mec.setText("");
        }
        if (this.kk == 1) {
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            String ch = this.nomsc.getSelectedItem().toString();
            System.out.println("nomsc =" + ch);
            String mat = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur WHERE NOMSOC='" + ch + "'");
                while (result2.next()) {
                    mat = result2.getString("MATRIC");
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
            System.out.println("mat =" + mat);
            this.m1.setVisible(true);
            this.a1.setVisible(true);
            DefaultTableModel dt1 = new DefaultTableModel();
            dt1.addColumn("  NBC");
            dt1.addColumn("  Montant");
            dt1.addColumn("  MC");
            dt1.addColumn("  code");
            dt1.addColumn("  date");
            this.jTable1.setModel(dt1);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state2 = conn2.createStatement();
                String mmc = this.m1.getSelectedItem().toString();
                String aa = this.a1.getText();
                ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + mat + "' AND moisdebut='" + mmc + "' AND anneesdebut='" + aa + "'AND \tMecano='" + this.mec.getText() + "' ORDER BY nbc");
                System.out.println("********************************");
                while (result2.next()) {
                    String n = result2.getString("nbc");
                    String montantbc = result2.getString("montantbc");
                    String mc = result2.getString("moisdebut");
                    String code = result2.getString("codeb");
                    String dt = result2.getString("datebc");
                    this.kk = 0;
                    Object[] stg = new Object[]{n, montantbc, mc, code, dt};
                    dt1.addRow(stg);
                    ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
            }
        }
    }

    private void mecMouseClicked(MouseEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        String mat = "";
        System.out.println("---------------------------");
        String ch = this.nomsc.getSelectedItem().toString();
        System.out.print("-------------jkopkol--------------");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur WHERE NOMSOC='" + ch + "'");
            while (result2.next()) {
                mat = result2.getString("MATRIC");
                this.type = result2.getString("type");
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("yyyy");
        String datdd = dateFormatt.format(actuellEe);
        System.out.append("date = " + datdd);
        Date actuellEee = new Date();
        SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
        String datddf = dateFormatft.format(actuellEee);
        System.out.println("date = " + datddf);
        String jours = datddf.substring(0, datddf.length() - 8);
        System.out.println("jours = " + jours);
        int j = Integer.parseInt(jours);
        System.out.println("j = " + j);
        String mois2 = datddf.substring(3, datddf.length() - 5);
        System.out.println("mois = " + mois2);
        int ms = Integer.parseInt(mois2);
        System.out.println("ms = " + ms);
        String ann\u00e9es = datddf.substring(6, datddf.length());
        System.out.println("ann\u00e9es = " + ann\u00e9es);
        int moisdebutt = Integer.parseInt(mois2);
        this.anedebut = Integer.parseInt(ann\u00e9es);
        System.out.println("moisdebutt = " + moisdebutt);
        if (this.MOIS.getText().equals("13")) {
            if (j >= 13 && ++moisdebutt > 12) {
                moisdebutt = 1;
                ++this.anedebut;
            }
        } else if (this.MOIS.getText().equals("1") && j >= 1 && ++moisdebutt > 12) {
            moisdebutt = 1;
            ++this.anedebut;
        }
    }

    private void a1MouseClicked(MouseEvent evt) {
        JOptionPane jop3;
        this.jButton1.setVisible(false);
        this.mec.enable(false);
        this.jLabel34.setVisible(true);
        this.jLabel35.setVisible(false);
        this.montantbc.setVisible(false);
        this.nomadh.setVisible(false);
        this.jLabel38.setVisible(false);
        this.mec.setText("");
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ch = this.nomsc.getSelectedItem().toString();
        System.out.println("nomsc =" + ch);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  fournisseur WHERE NOMSOC='" + ch + "'");
            while (result2.next()) {
                this.mat = result2.getString("MATRIC");
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.mat);
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nomf.setText(result3.getString("NOMSOC"));
                this.noms.setText(result3.getString("NOMSOC"));
                this.remisee.setText(result3.getString("remise"));
                this.nb.setText(result3.getString("nbmois"));
                this.MOIS.setText(result3.getString("mois"));
                this.matt = this.matriculefr.getText();
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
        }
        System.out.println("mat =" + this.mat);
        this.m1.setVisible(true);
        this.a1.setVisible(true);
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("NBC");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Montant Bc");
        dt1.addColumn("Montant net");
        dt1.addColumn("MC");
        dt1.addColumn("Code");
        dt1.addColumn("Date");
        this.jTable1.setModel(dt1);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            String mmc = this.m1.getSelectedItem().toString();
            String aa = this.a1.getText();
            System.out.println("------------------------------------");
            System.out.println("mat =" + this.mat);
            System.out.println("mat =" + mmc);
            System.out.println("mat =" + aa);
            System.out.println("------------------------------------");
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.mat + "' AND moisdebut='" + mmc + "' AND anneesdebut='" + aa + "' ORDER BY nbc");
            System.out.println("********************************");
            String mecano = "";
            while (result2.next()) {
                JOptionPane jop32;
                ResultSet result3;
                Statement state3;
                ResultSetMetaData resultMeta3;
                String n = result2.getString("nbc");
                mecano = result2.getString("Mecano");
                System.out.println("nbc=" + n + "   ///  mecano =" + mecano);
                String montantbc = result2.getString("montantbc");
                String montantnet = result2.getString("montantdevis");
                montantnet = new StringBuilder(montantnet).insert(montantnet.length() - 3, ".").toString();
                String mc = result2.getString("moisdebut");
                String code = result2.getString("codeb");
                String dt = result2.getString("datebc");
                String nom = "";
                this.kk = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nom = result3.getString("nom");
                        this.kk = 1;
                    }
                }
                catch (Exception e) {
                    jop32 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nom = result3.getString("nom");
                            this.kk = 1;
                        }
                    }
                    catch (Exception e) {
                        jop32 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                    }
                }
                Object[] stg = new Object[]{n, mecano, nom, montantbc, montantnet, mc, code, dt};
                dt1.addRow(stg);
                mecano = "";
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
            }
            System.out.println("********************************");
        }
        catch (Exception e) {
            JOptionPane jop33 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        Date actuellEeddc = new Date();
        SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
        String dat = dateFormattddc.format(actuellEeddc);
        MessageFormat header = new MessageFormat("bon de commande pharmacie :" + this.mat + "(" + dat + ")");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void jTable1MouseClicked(MouseEvent evt) {
        int lign = this.jTable1.getSelectedRow();
        String m = this.jTable1.getModel().getValueAt(lign, 3).toString();
        this.nbccc = this.jTable1.getModel().getValueAt(lign, 0).toString();
        int mn = Integer.parseInt(m);
        if (mn == 0) {
            this.montantbc.setText(m);
            this.jLabel35.setVisible(true);
            this.montantbc.setVisible(true);
            this.jButton1.setVisible(false);
            this.montantbc.enable(true);
            System.out.println(" ling =" + lign);
            this.mec.setText(this.jTable1.getModel().getValueAt(lign, 1).toString());
        } else {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Montant d\u00e9j\u00e0 modifi\u00e9 !!");
            this.jLabel35.setVisible(false);
            this.montantbc.setVisible(false);
            this.jButton1.setVisible(false);
            this.montantbc.enable(false);
            this.montantbc.setText("");
            this.mec.setText("");
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        int r = Integer.parseInt(this.remisee.getText());
        int m = Integer.parseInt(this.montantbc.getText());
        int montantaprremise = m - m * r / 100;
        this.k = 0;
        JOptionPane jop12 = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Montant apres remise =" + montantaprremise, "Quitter", 0, 3);
        if (option == 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state2 = conn2.createStatement();
                this.k = 1;
                String nb = "1";
                String imprimeborde = "1";
                String p = "0";
                String f = "1";
                System.out.println("matf =" + this.mat);
                System.out.println("nbc =" + this.nbccc);
                System.out.println("anne =" + this.a1.getText());
                System.out.println("mecano =" + this.mec.getText());
                state2.executeUpdate("UPDATE bc SET montantbc='" + this.montantbc.getText() + "' WHERE matf='" + this.mat + "'AND \tnbc='" + this.nbccc + "'AND anneesdebut='" + this.a1.getText() + "'AND Mecano='" + this.mec.getText() + "'");
                state2.executeUpdate("UPDATE bc SET montantdevis='" + montantaprremise + "' WHERE matf='" + this.mat + "'AND \tnbc='" + this.nbccc + "'AND anneesdebut='" + this.a1.getText() + "'AND Mecano='" + this.mec.getText() + "'");
                this.k = 1;
            }
            catch (Exception e) {
                this.k = 0;
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur de modification a l'etat : " + e.getMessage());
            }
            if (this.k == 1) {
                System.out.println("succer de modification --------------------------");
                DefaultTableModel dt1 = new DefaultTableModel();
                dt1.addColumn("NBC");
                dt1.addColumn("Mecano");
                dt1.addColumn("Nom et prenom");
                dt1.addColumn("Montant bc");
                dt1.addColumn("Montant net");
                dt1.addColumn("MC");
                dt1.addColumn("Code");
                dt1.addColumn("Date");
                this.jTable1.setModel(dt1);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    String mmc = this.m1.getSelectedItem().toString();
                    String aa = this.a1.getText();
                    ResultSet result2 = state.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.mat + "' AND moisdebut='" + mmc + "' AND anneesdebut='" + aa + "' ORDER BY nbc");
                    String mecano = "";
                    while (result2.next()) {
                        JOptionPane jop3;
                        ResultSetMetaData resultMeta3;
                        ResultSet result3;
                        String n = result2.getString("nbc");
                        mecano = result2.getString("Mecano");
                        System.out.println("nbc=" + n + "   ///  mecano =" + mecano);
                        String montantbc = result2.getString("montantbc");
                        String montantdv = result2.getString("montantdevis");
                        String mc = result2.getString("moisdebut");
                        String code = result2.getString("codeb");
                        String dt = result2.getString("datebc");
                        String nom = "";
                        this.kk = 0;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn21 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn21.createStatement();
                            result3 = state2.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                            resultMeta3 = result3.getMetaData();
                            while (result3.next()) {
                                nom = result3.getString("nom");
                                this.kk = 1;
                            }
                        }
                        catch (Exception e) {
                            jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                        }
                        if (this.kk == 0) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state21 = conn3.createStatement();
                                result3 = state21.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                                resultMeta3 = result3.getMetaData();
                                while (result3.next()) {
                                    nom = result3.getString("nom");
                                    this.kk = 1;
                                }
                            }
                            catch (Exception e) {
                                jop3 = new JOptionPane();
                                JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                            }
                        }
                        Object[] stg = new Object[]{n, mecano, nom, montantbc, montantdv, mc, code, dt};
                        dt1.addRow(stg);
                        mecano = "";
                        ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                    }
                    this.jButton1.setVisible(false);
                    this.mec.setText("");
                    this.mec.setVisible(false);
                    this.jLabel34.setVisible(false);
                    this.jLabel35.setVisible(false);
                    this.montantbc.setVisible(false);
                    this.montantbc.setText("");
                    System.out.println("********************475274************");
                }
                catch (Exception e) {
                    JOptionPane jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
            }
        }
    }

    public static enum Nombre {
        ZERO(0, "zero"),
        UN(1, "un"),
        DEUX(2, "deux"),
        TROIX(3, "trois"),
        QUATRE(4, "quatre"),
        CINQ(5, "cinq"),
        SIX(6, "six"),
        SEPT(7, "sept"),
        HUIT(8, "huit"),
        NEUF(9, "neuf"),
        DIX(10, "dix"),
        ONZE(11, "onze"),
        DOUZE(12, "douze"),
        TREIZE(13, "treize"),
        QUATORZE(14, "quatorze"),
        QUINZE(15, "quinze"),
        SEIZE(16, "seize"),
        DIXSEPT(17, "dix-sept"),
        DIXHUIT(18, "dix-huit"),
        DIXNEUF(19, "dix-neuf"),
        VINGT(20, 29, "vingt"),
        TRENTE(30, 39, "trente"),
        QUARANTE(40, 49, "quarante"),
        CINQUANTE(50, 59, "cinquante"),
        SOIXANTE(60, 69, "soixante"),
        SOIXANTEDIX(70, 79, "soixante-dix", SOIXANTE),
        QUATREVINGT(80, 89, "quatre-vingt", "s"),
        QUATREVINGTDIX(90, 99, "quatre-vingt-dix", QUATREVINGT),
        DIXAINE(10, 99),
        CENT(100, 999, "cent", DIXAINE),
        MILLE(1000, 999999, "mille", CENT),
        MILLION(1000000, 99999999, "million", MILLE),
        MILLIARD(1000000000, Long.MAX_VALUE, "milliard", MILLION),
        CALCULATE{

            @Override
            protected String getValue(long value) throws Exception {
                if (value == 0) {
                    return ZERO.label;
                }
                return (value < 0 ? "moins " : "") + MILLIARD.getStringValue(Math.abs(value));
            }

            @Override
            protected String getValue(double value, String separator) throws Exception {
                if (value == 0.0) {
                    return ZERO.label + " " + separator;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(value < 0.0 ? "moins " : "");
                String vstr = Double.toString(value);
                int indexOf = vstr.indexOf(46);
                if (indexOf == -1) {
                    sb.append(MILLIARD.getStringValue((long)Math.abs(value)));
                    sb.append(" ");
                    sb.append(separator);
                } else {
                    sb.append(MILLIARD.getStringValue(Long.parseLong(vstr.substring(0, indexOf))));
                    sb.append(" ");
                    sb.append(separator);
                    String floatting = vstr.substring(indexOf + 1, indexOf + 3 >= vstr.length() ? vstr.length() : indexOf + 3) + (indexOf + 3 >= vstr.length() ? "0" : "");
                    long v = Long.parseLong(floatting);
                    if (v != 0) {
                        sb.append(" ");
                        sb.append(MILLIARD.getStringValue(v));
                    }
                }
                return sb.toString();
            }
        };
        
        protected long min;
        protected long max;
        protected String label;
        protected Nombre before;
        private String addMin;

        private Nombre() {
        }

        private Nombre(long v, String s) {
            this(v, v, s);
        }

        private Nombre(long min, long max) {
            this.min = min;
            this.max = max;
        }

        private Nombre(long min, long max, String label, Nombre before) {
            this(min, max, label);
            this.before = before;
        }

        private Nombre(long min, long max, String label, String addMin) {
            this(min, max, label);
            this.addMin = addMin;
        }

        private Nombre(long min, long max, String label) {
            this(min, max);
            this.label = label;
        }

        protected String getValue(long value) throws Exception {
            throw new Exception("Vous devez appeller la m\u00e9thode par l'\u00e9num\u00e9ration Chiffre.CALCULATE");
        }

        protected String getValue(double value, String separator) throws Exception {
            throw new Exception("Vous devez appeller la m\u00e9thode par l'\u00e9num\u00e9ration Chiffre.CALCULATE");
        }

        private String getStringValue(long value) {
            long v1 = value / this.min;
            if (v1 == 0 && this.before != null) {
                return this.before.getStringValue(value);
            }
            StringBuilder add = new StringBuilder();
            Nombre[] values = Nombre.values();
            if (value < 20) {
                return values[(int)value].label;
            }
            for (int i = 0; i < values.length; ++i) {
                Nombre nombre = values[i];
                if (value < 100 && nombre.min <= value && nombre.max >= value) {
                    if (value == nombre.min) {
                        return nombre.label + (nombre.addMin != null ? nombre.addMin : "");
                    }
                    if (nombre.before != null) {
                        StringBuilder sb = new StringBuilder(nombre.before.label);
                        sb.append(value - nombre.min + 10 == 11 && nombre.equals((Object)SOIXANTEDIX) ? " et " : "-");
                        sb.append(DIXAINE.getStringValue(value - nombre.min + 10));
                        return sb.toString();
                    }
                    StringBuilder sb = new StringBuilder(nombre.label);
                    sb.append(value - nombre.min == 1 && !nombre.equals((Object)QUATREVINGT) ? " et " : "-");
                    sb.append(value - nombre.min > 0 ? DIXAINE.getStringValue(value - nombre.min) : "");
                    return sb.toString();
                }
                if (nombre.min > v1 || nombre.max < v1 || value < 100) continue;
                if ((this.equals((Object)MILLE) || this.equals((Object)CENT)) && UN.equals((Object)nombre)) {
                    add.append(this.label);
                } else {
                    add.append(nombre.getStringValue(v1));
                    add.append(MILLIARD.equals((Object)this) && (MILLION.equals((Object)nombre) || MILLIARD.equals((Object)nombre)) ? " de" : "");
                    add.append(this.label != null ? " " + this.label : "");
                }
                add.append(value - v1 * this.min > 0 ? " " + this.before.getStringValue(value - v1 * this.min) : (v1 > 1 ? "s" : ""));
                return add.toString();
            }
            return add.toString();
        }

    }

}

