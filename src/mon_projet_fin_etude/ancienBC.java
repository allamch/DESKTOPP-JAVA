/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  com.toedter.calendar.JDateChooser
 */
package mon_projet_fin_etude;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import mon_projet_fin_etude.recherchecarnedecheque;

public class ancienBC
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    private JPanel INFO;
    private JTextField MATF2;
    private JTextField annedebut;
    private JTextField codeactive;
    private JTextField codebc;
    private JDateChooser datebc;
    private JButton jButton19;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel14;
    private JLabel jLabel2;
    private JLabel jLabel25;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator3;
    private JTable jTable1;
    private JTextField matriculefr;
    private JComboBox md;
    private JTextField mecano;
    private JTextField montantbc;
    private JTextField montnet;
    private JLabel nb;
    private JTextField nbc;
    private JTextField nbmoi;
    private JLabel nomadh;
    private JLabel nomf;
    private JLabel noms;
    private JLabel remisee;

    public ancienBC() {
        this.initComponents();
    }

    private void initComponents() {
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
        this.jLabel1 = new JLabel();
        this.jPanel16 = new JPanel();
        this.jLabel14 = new JLabel();
        this.jLabel25 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel28 = new JLabel();
        this.montnet = new JTextField();
        this.montantbc = new JTextField();
        this.jLabel34 = new JLabel();
        this.jButton19 = new JButton();
        this.jLabel38 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel29 = new JLabel();
        this.MATF2 = new JTextField();
        this.jLabel40 = new JLabel();
        this.nomadh = new JLabel();
        this.nbmoi = new JTextField();
        this.jLabel42 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jLabel30 = new JLabel();
        this.nbc = new JTextField();
        this.md = new JComboBox();
        this.jLabel41 = new JLabel();
        this.annedebut = new JTextField();
        this.codebc = new JTextField();
        this.jLabel2 = new JLabel();
        this.codeactive = new JTextField();
        this.datebc = new JDateChooser();
        this.matriculefr = new JTextField();
        this.jLabel3 = new JLabel();
        this.setLayout(null);
        this.INFO.setBorder(BorderFactory.createTitledBorder(null, "Information Fornisseur", 0, 0, new Font("Agency FB", 1, 14), new Color(0, 0, 255)));
        this.INFO.setLayout(null);
        this.INFO.add(this.jSeparator3);
        this.jSeparator3.setBounds(132, 91, 4, 2);
        this.nomf.setFont(new Font("Tahoma", 1, 11));
        this.nomf.setForeground(new Color(51, 51, 255));
        this.nomf.setText("............................");
        this.INFO.add(this.nomf);
        this.nomf.setBounds(10, 90, 140, 28);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Nom fournisseur :");
        this.INFO.add(this.jLabel4);
        this.jLabel4.setBounds(10, 60, 130, 17);
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setText("Nom Sociter:");
        this.INFO.add(this.jLabel7);
        this.jLabel7.setBounds(10, 130, 130, 17);
        this.noms.setFont(new Font("Tahoma", 1, 11));
        this.noms.setForeground(new Color(51, 51, 255));
        this.noms.setText("............................");
        this.INFO.add(this.noms);
        this.noms.setBounds(10, 160, 140, 28);
        this.remisee.setFont(new Font("Tahoma", 1, 14));
        this.remisee.setForeground(new Color(51, 51, 255));
        this.remisee.setText("............................");
        this.INFO.add(this.remisee);
        this.remisee.setBounds(10, 230, 130, 28);
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("Remise :");
        this.INFO.add(this.jLabel10);
        this.jLabel10.setBounds(10, 200, 130, 17);
        this.nb.setFont(new Font("Tahoma", 1, 14));
        this.nb.setForeground(new Color(51, 51, 255));
        this.nb.setText("............................");
        this.INFO.add(this.nb);
        this.nb.setBounds(10, 300, 130, 28);
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("Nb de mois:");
        this.INFO.add(this.jLabel12);
        this.jLabel12.setBounds(10, 270, 120, 17);
        this.jLabel1.setBackground(new Color(153, 153, 153));
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/image2.png")));
        this.INFO.add(this.jLabel1);
        this.jLabel1.setBounds(0, 360, 140, 130);
        this.add(this.INFO);
        this.INFO.setBounds(10, 50, 160, 510);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel14.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel14);
        this.jLabel14.setBounds(10, 240, 130, 0);
        this.jLabel25.setBackground(new Color(153, 153, 255));
        this.jLabel25.setFont(new Font("Tahoma", 1, 14));
        this.jLabel25.setForeground(new Color(0, 0, 255));
        this.jLabel25.setText("Montant apres remise :");
        this.jPanel16.add(this.jLabel25);
        this.jLabel25.setBounds(400, 110, 160, 30);
        this.mecano.setFont(new Font("Tahoma", 0, 14));
        this.mecano.addContainerListener(new ContainerAdapter(){

            @Override
            public void componentAdded(ContainerEvent evt) {
                ancienBC.this.mecanoComponentAdded(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ancienBC.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(120, 30, 170, 30);
        this.jLabel28.setBackground(new Color(153, 153, 255));
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setForeground(new Color(0, 0, 255));
        this.jLabel28.setText("Mecano :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(10, 40, 80, 17);
        this.montnet.setFont(new Font("Tahoma", 0, 14));
        this.montnet.setCursor(new Cursor(2));
        this.montnet.setEnabled(false);
        this.montnet.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ancienBC.this.montnetMouseClicked(evt);
            }
        });
        this.montnet.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ancienBC.this.montnetActionPerformed(evt);
            }
        });
        this.montnet.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ancienBC.this.montnetKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.montnet);
        this.montnet.setBounds(570, 110, 210, 30);
        this.montantbc.setFont(new Font("Tahoma", 0, 14));
        this.montantbc.setEnabled(false);
        this.montantbc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ancienBC.this.montantbcMouseClicked(evt);
            }
        });
        this.montantbc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ancienBC.this.montantbcActionPerformed(evt);
            }
        });
        this.montantbc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ancienBC.this.montantbcKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.montantbc);
        this.montantbc.setBounds(120, 110, 170, 30);
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Tahoma", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText("Montant devis :");
        this.jPanel16.add(this.jLabel34);
        this.jLabel34.setBounds(10, 110, 130, 30);
        this.jButton19.setFont(new Font("Tahoma", 1, 12));
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton19.setText("Valider");
        this.jButton19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ancienBC.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton19);
        this.jButton19.setBounds(640, 190, 120, 40);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setForeground(new Color(0, 0, 255));
        this.jLabel38.setText("Nom et prenom :");
        this.jPanel16.add(this.jLabel38);
        this.jLabel38.setBounds(10, 190, 130, 30);
        this.jLabel6.setFont(new Font("Snap ITC", 1, 24));
        this.jLabel6.setForeground(new Color(0, 0, 153));
        this.jLabel6.setText("Ajout une Ancien Bon de Commande");
        this.jPanel16.add(this.jLabel6);
        this.jLabel6.setBounds(110, 0, 530, 30);
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setForeground(new Color(0, 0, 255));
        this.jLabel33.setText("Date BC :");
        this.jPanel16.add(this.jLabel33);
        this.jLabel33.setBounds(10, 70, 110, 30);
        this.jPanel16.add(this.jSeparator1);
        this.jSeparator1.setBounds(10, 240, 790, 10);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "Liste des bons commandes", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ancienBC.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setFont(new Font("Tahoma", 1, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}}, new String[]{"N\u00b0 BC", "Mecano", "Nom Adherent", "Montant", "Nb mois"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ancienBC.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                ancienBC.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                ancienBC.this.jTable1AncestorAdded(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 250, 780, 300);
        this.jLabel29.setBackground(new Color(153, 153, 255));
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setForeground(new Color(0, 0, 255));
        this.jLabel29.setText("N\u00b0 BC :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(650, 30, 60, 30);
        this.MATF2.setFont(new Font("Tahoma", 0, 14));
        this.MATF2.setEnabled(false);
        this.MATF2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ancienBC.this.MATF2MouseClicked(evt);
            }
        });
        this.MATF2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ancienBC.this.MATF2ActionPerformed(evt);
            }
        });
        this.MATF2.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ancienBC.this.MATF2KeyReleased(evt);
            }
        });
        this.jPanel16.add(this.MATF2);
        this.MATF2.setBounds(570, 30, 80, 30);
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Tahoma", 1, 14));
        this.jLabel40.setForeground(new Color(0, 0, 255));
        this.jLabel40.setText("Ann\u00e9es :");
        this.jPanel16.add(this.jLabel40);
        this.jLabel40.setBounds(650, 70, 70, 30);
        this.nomadh.setBackground(new Color(153, 153, 255));
        this.nomadh.setFont(new Font("Tahoma", 1, 14));
        this.nomadh.setForeground(new Color(153, 0, 0));
        this.nomadh.setText("................");
        this.jPanel16.add(this.nomadh);
        this.nomadh.setBounds(140, 190, 300, 30);
        this.nbmoi.setFont(new Font("Tahoma", 0, 14));
        this.nbmoi.setEnabled(false);
        this.nbmoi.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ancienBC.this.nbmoiMouseClicked(evt);
            }
        });
        this.nbmoi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ancienBC.this.nbmoiActionPerformed(evt);
            }
        });
        this.nbmoi.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ancienBC.this.nbmoiKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.nbmoi);
        this.nbmoi.setBounds(120, 150, 170, 30);
        this.jLabel42.setBackground(new Color(153, 153, 255));
        this.jLabel42.setFont(new Font("Tahoma", 1, 14));
        this.jLabel42.setForeground(new Color(0, 0, 255));
        this.jLabel42.setText("Code banque :");
        this.jPanel16.add(this.jLabel42);
        this.jLabel42.setBounds(450, 150, 110, 30);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setForeground(new Color(0, 0, 255));
        this.jLabel39.setText("NB mois :");
        this.jPanel16.add(this.jLabel39);
        this.jLabel39.setBounds(10, 150, 80, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("Mat Fournisseur :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(440, 40, 140, 17);
        this.nbc.setFont(new Font("Tahoma", 0, 14));
        this.nbc.setEnabled(false);
        this.nbc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ancienBC.this.nbcMouseClicked(evt);
            }
        });
        this.nbc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ancienBC.this.nbcKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.nbc);
        this.nbc.setBounds(710, 30, 70, 30);
        this.md.setFont(new Font("Tahoma", 1, 14));
        this.md.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        this.md.setEnabled(false);
        this.jPanel16.add(this.md);
        this.md.setBounds(570, 70, 60, 30);
        this.jLabel41.setBackground(new Color(153, 153, 255));
        this.jLabel41.setFont(new Font("Tahoma", 1, 14));
        this.jLabel41.setForeground(new Color(0, 0, 255));
        this.jLabel41.setText("Mois debut:");
        this.jPanel16.add(this.jLabel41);
        this.jLabel41.setBounds(440, 70, 110, 30);
        this.annedebut.setFont(new Font("Tahoma", 0, 14));
        this.annedebut.setEnabled(false);
        this.annedebut.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ancienBC.this.annedebutMouseClicked(evt);
            }
        });
        this.annedebut.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ancienBC.this.annedebutActionPerformed(evt);
            }
        });
        this.annedebut.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ancienBC.this.annedebutKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.annedebut);
        this.annedebut.setBounds(710, 70, 70, 30);
        this.codebc.setFont(new Font("Tahoma", 0, 14));
        this.codebc.setEnabled(false);
        this.jPanel16.add(this.codebc);
        this.codebc.setBounds(570, 150, 210, 30);
        this.jLabel2.setFont(new Font("Tahoma", 0, 14));
        this.jLabel2.setForeground(new Color(204, 0, 0));
        this.jLabel2.setText("Saisire code pour activer le modification :");
        this.jPanel16.add(this.jLabel2);
        this.jLabel2.setBounds(330, 160, 250, 40);
        this.codeactive.setFont(new Font("Tahoma", 1, 12));
        this.codeactive.setForeground(new Color(255, 255, 255));
        this.codeactive.addKeyListener(new KeyAdapter(){

            @Override
            public void keyPressed(KeyEvent evt) {
                ancienBC.this.codeactiveKeyPressed(evt);
            }

            @Override
            public void keyReleased(KeyEvent evt) {
                ancienBC.this.codeactiveKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.codeactive);
        this.codeactive.setBounds(460, 190, 170, 30);
        this.jPanel16.add((Component)this.datebc);
        this.datebc.setBounds(120, 70, 170, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(174, 1, 790, 560);
        this.matriculefr.setForeground(new Color(153, 153, 153));
        this.matriculefr.setText("         Matricule");
        this.matriculefr.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ancienBC.this.matriculefrMouseClicked(evt);
            }
        });
        this.matriculefr.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ancienBC.this.matriculefrActionPerformed(evt);
            }
        });
        this.matriculefr.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ancienBC.this.matriculefrKeyReleased(evt);
            }
        });
        this.add(this.matriculefr);
        this.matriculefr.setBounds(50, 10, 110, 30);
        this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/53734.png")));
        this.add(this.jLabel3);
        this.jLabel3.setBounds(0, -10, 50, 70);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jButton19ActionPerformed(ActionEvent evt) {
        boolean pp = false;
        if (this.codebc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Code banque vide !!");
        } else {
            Date d1 = this.datebc.getDate();
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
            String dat = "";
            try {
                dat = f.format(d1);
            }
            catch (Exception e) {
                JOptionPane jop1 = new JOptionPane();
            }
            String bq = "";
            String type = "";
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.k = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                int nb = Integer.parseInt(this.nbmoi.getText());
                int montantnet = Integer.parseInt(this.montnet.getText());
                int prixparmois = montantnet / nb;
                JOptionPane jop = new JOptionPane();
                int option = JOptionPane.showConfirmDialog(null, "Attention : Montant par mois=" + prixparmois, "Attention", 0, 3);
                if (option == 0) {
                    Statement state = conn2.createStatement();
                    String nbm = "0";
                    state.executeUpdate("INSERT INTO bc(Mecano,matf,nbc,datebc,moisdebut,anneesdebut,montantbc,montantdevis,nbmois,codeb) VALUES('" + this.mecano.getText() + "','" + this.MATF2.getText() + "','" + this.nbc.getText() + "','" + dat + "','" + this.md.getSelectedItem().toString() + "','" + this.annedebut.getText() + "','" + this.montnet.getText() + "','" + this.montantbc.getText() + "','" + this.nbmoi.getText() + "','" + this.codebc.getText() + "')");
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Succes d'ajouter  ", "Information", 1);
                    pp = true;
                }
            }
            catch (Exception e) {
                pp = false;
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout  :bon de commande d\u00e9ja exicte " + e.getMessage());
            }
        }
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0BC");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom Adherent");
        dt1.addColumn("Montant");
        dt1.addColumn("NB mois");
        dt1.addColumn("code B");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state2 = conn2.createStatement();
            System.out.println("matf='" + this.MATF2.getText());
            System.out.println("nneesdebut=" + this.annedebut.getText());
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.annedebut.getText() + "'  ORDER BY nbc");
            while (result2.next()) {
                ResultSetMetaData resultMeta3;
                ResultSet result3;
                Statement state3;
                JOptionPane jop3;
                String nomadh = "";
                String nbc = result2.getString("nbc");
                String Mec = result2.getString("Mecano");
                System.out.println("*********************");
                this.k = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        nomadh = result3.getString("nom");
                        this.k = 1;
                    }
                }
                catch (Exception e) {
                    jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur S" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                        resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            nomadh = result3.getString("nom");
                            this.k = 1;
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur R" + e.getMessage());
                    }
                }
                String montant = result2.getString("montantdevis");
                String nbmois = result2.getString("nbmois");
                String codeB = result2.getString("codeb");
                Object[] stg = new Object[]{nbc, Mec, nomadh, montant, nbmois, codeB};
                dt1.addRow(stg);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        if (pp) {
            this.mecano.setText("");
            this.MATF2.setText("");
            this.nbc.setText("");
            this.md.setSelectedIndex(0);
            this.annedebut.setText("");
            this.montantbc.setText("");
            this.montnet.setText("");
            this.nbmoi.setText("");
            this.codebc.setText("");
            this.MATF2.enable(false);
            this.nbc.enable(false);
            this.md.enable(false);
            this.annedebut.enable(false);
            this.montantbc.enable(false);
            this.montnet.enable(false);
            this.nbmoi.enable(false);
            this.codebc.enable(false);
        }
    }

    private void montnetActionPerformed(ActionEvent evt) {
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

    private void matriculefrKeyReleased(KeyEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM ffournis  WHERE MATRIC=" + this.matriculefr.getText());
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.MATF2.setText(this.matriculefr.getText());
                this.nomf.setText(result3.getString("NOMSOC"));
                this.noms.setText(result3.getString("NOMSOC"));
                this.remisee.setText(result3.getString("remise"));
                this.nb.setText(result3.getString("nbmois"));
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
        }
    }

    private void matriculefrMouseClicked(MouseEvent evt) {
        this.matriculefr.setText("");
    }

    private void matriculefrActionPerformed(ActionEvent evt) {
    }

    private void MATF2KeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.MATF2.getText());
            this.k = 0;
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM ffournis  WHERE MATRIC=" + this.MATF2.getText());
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.nomf.setText(result3.getString("NOMSOC"));
                    this.noms.setText(result3.getString("NOMSOC"));
                    this.remisee.setText(result3.getString("remise"));
                    this.nb.setText(result3.getString("nbmois"));
                    this.k = 1;
                    this.nbc.enable(true);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.MATF2.setText("");
        }
    }

    private void MATF2MouseClicked(MouseEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.mecano.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Erreure : il faut saisir le Mecano d'adherent");
        } else if (this.k == 1) {
            this.MATF2.enable(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erreure : Adherent n'existe pas");
        }
    }

    private void montantbcMouseClicked(MouseEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.annedebut.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Erreure :Ann\u00e9e d\u00e9but vide");
        } else {
            Date d1 = this.datebc.getDate();
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
            String dat = "";
            try {
                dat = f.format(d1);
            }
            catch (Exception e) {
                JOptionPane jop1 = new JOptionPane();
            }
            String ann = dat.substring(6, dat.length());
            System.out.println("ann =" + ann);
            int annabc = Integer.parseInt(ann);
            int anndeut = Integer.parseInt(this.annedebut.getText());
            String moisbc = dat.substring(3, dat.length() - 5);
            String moisdebut = this.md.getSelectedItem().toString();
            System.out.println("moisbc =" + moisbc);
            System.out.println("moisdebut =" + moisdebut);
            int mb = Integer.parseInt(moisbc);
            int mdb = Integer.parseInt(moisdebut);
            this.nbmoi.enable(true);
        }
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        this.jButton19.setVisible(false);
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement state3;
            ResultSetMetaData resultMeta3;
            ResultSet result3;
            int montantnet = Integer.parseInt(this.mecano.getText());
            this.k = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.k = 1;
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
                    result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                    resultMeta3 = result3.getMetaData();
                    while (result3.next()) {
                        this.k = 1;
                        this.t = "R";
                        this.nomadh.setText(result3.getString("nom"));
                    }
                }
                catch (Exception e) {
                    // empty catch block
                }
            }
            if (this.k == 0) {
                this.nomadh.setText(".................");
            }
            System.out.println("k=" + this.k);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.mecano.setText("");
        }
    }

    private void nbcMouseClicked(MouseEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.MATF2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Erreure : il faut saisir le Matricule de Fournisseur");
        } else if (this.k == 1) {
            this.nbc.enable(true);
            this.datebc.setEnabled(true);
            this.md.enable(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erreure : Fournisseur n'existe pas");
        }
    }

    private void annedebutMouseClicked(MouseEvent evt) {
        this.annedebut.enable(true);
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.md.getSelectedItem().equals("00")) {
            JOptionPane.showMessageDialog(null, "Erreure :Premier Mois Incorrect");
        } else {
            this.montantbc.enable(true);
            this.montnet.enable(true);
        }
    }

    private void nbmoiMouseClicked(MouseEvent evt) {
        if (this.montnet.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Erreure : il faut ajouter trois 000 pour le montant de Montant Net");
            this.montnet.enable(false);
        } else {
            this.codebc.enable(true);
            this.montnet.enable(true);
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (this.montantbc.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Erreure : il faut saisir le Montant BC");
            } else if (this.montnet.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Erreure : il faut saisir le  Montant Net");
            } else {
                int montantbcc = Integer.parseInt(this.montantbc.getText());
                int montantnet = Integer.parseInt(this.montnet.getText());
                System.out.println("montantbcc " + montantbcc);
                System.out.println("montantnet " + montantnet);
                if (montantbcc < montantnet) {
                    System.out.println("montantnet!!!!!!!!!!!!!!!!! " + montantnet);
                    JOptionPane.showMessageDialog(null, "Erreure :Montant Net Supperieur a Montant BC");
                } else {
                    System.out.println("montantnet 555555555" + montantnet);
                }
            }
        }
    }

    private void MATF2ActionPerformed(ActionEvent evt) {
    }

    private void montantbcActionPerformed(ActionEvent evt) {
    }

    private void nbmoiActionPerformed(ActionEvent evt) {
    }

    private void montantbcKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.montantbc.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.montantbc.setText("");
        }
        this.montnet.setText(this.montantbc.getText());
    }

    private void montnetKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.montnet.getText());
            this.nbmoi.enable(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.montnet.setText("");
        }
    }

    private void nbcKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.nbc.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.nbc.setText("");
        }
    }

    private void annedebutKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.annedebut.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.annedebut.setText("");
        }
    }

    private void nbmoiKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.nbmoi.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.nbmoi.setText("");
        }
    }

    private void montnetMouseClicked(MouseEvent evt) {
        if (this.montantbc.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Erreure : il faut ajouter trois 000 pour le montant de Monatant BC");
            this.montnet.enable(false);
        } else {
            this.montnet.enable(true);
        }
    }

    private void annedebutActionPerformed(ActionEvent evt) {
    }

    private void codeactiveKeyPressed(KeyEvent evt) {
    }

    private void codeactiveKeyReleased(KeyEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean kk = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String c = "code";
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM login  WHERE login='" + c + "' AND mp='" + this.codeactive.getText() + "'");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                kk = true;
            }
        }
        catch (Exception e) {
            // empty catch block
        }
        if (kk) {
            this.jButton19.setVisible(true);
        } else {
            this.jButton19.setVisible(false);
        }
    }

    private void mecanoComponentAdded(ContainerEvent evt) {
    }

}

