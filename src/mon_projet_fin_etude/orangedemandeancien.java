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
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
import mon_projet_fin_etude.Impression1;
import mon_projet_fin_etude.recherchecarnedecheque;

public class orangedemandeancien
extends JPanel {
    int k = 0;
    int n = 0;
    private JRadioButton ac;
    private JCheckBox acd;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JTable ca;
    private JLabel cnrps;
    private JLabel dd;
    private JLabel etablissement;
    private JLabel hobital;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel2;
    private JLabel jLabel21;
    private JLabel jLabel23;
    private JLabel jLabel25;
    private JLabel jLabel27;
    private JLabel jLabel3;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JScrollPane jScrollPane4;
    private JTextField mec;
    private JLabel mecano;
    private JLabel ncin;
    private JLabel nom;
    private JLabel nomadh;
    private JLabel ob;
    private JTextField obs;
    private JRadioButton pr;
    private JCheckBox prd;
    private JLabel s1;
    private JLabel s2;
    private JLabel s3;
    private JLabel s4;

    public orangedemandeancien() {
        this.initComponents();
    }

    private void initComponents() {
        this.jRadioButton1 = new JRadioButton();
        this.buttonGroup1 = new ButtonGroup();
        this.buttonGroup2 = new ButtonGroup();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.pr = new JRadioButton();
        this.ac = new JRadioButton();
        this.mec = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.nomadh = new JLabel();
        this.jScrollPane4 = new JScrollPane();
        this.ca = new JTable();
        this.jLabel2 = new JLabel();
        this.jButton1 = new JButton();
        this.jLabel7 = new JLabel();
        this.obs = new JTextField();
        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.prd = new JCheckBox();
        this.acd = new JCheckBox();
        this.jLabel12 = new JLabel();
        this.dd = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel17 = new JLabel();
        this.cnrps = new JLabel();
        this.mecano = new JLabel();
        this.ncin = new JLabel();
        this.jLabel21 = new JLabel();
        this.hobital = new JLabel();
        this.jLabel23 = new JLabel();
        this.nom = new JLabel();
        this.jLabel25 = new JLabel();
        this.s4 = new JLabel();
        this.jLabel27 = new JLabel();
        this.ob = new JLabel();
        this.s1 = new JLabel();
        this.s3 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel33 = new JLabel();
        this.etablissement = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel37 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jLabel40 = new JLabel();
        this.jLabel41 = new JLabel();
        this.jLabel42 = new JLabel();
        this.jLabel43 = new JLabel();
        this.s2 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jRadioButton2 = new JRadioButton();
        this.jRadioButton3 = new JRadioButton();
        this.jRadioButton4 = new JRadioButton();
        this.jRadioButton1.setText("jRadioButton1");
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tempus Sans ITC", 1, 30));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Demande d'un Service Orange");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(100, 0, 440, 40);
        this.buttonGroup1.add(this.pr);
        this.pr.setFont(new Font("Tahoma", 0, 18));
        this.pr.setText("Prolongation");
        this.jPanel1.add(this.pr);
        this.pr.setBounds(320, 40, 140, 20);
        this.buttonGroup1.add(this.ac);
        this.ac.setFont(new Font("Tahoma", 0, 18));
        this.ac.setText("Acquisition");
        this.jPanel1.add(this.ac);
        this.ac.setBounds(140, 40, 140, 20);
        this.mec.setFont(new Font("Tahoma", 1, 14));
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                orangedemandeancien.this.mecKeyReleased(evt);
            }
        });
        this.jPanel1.add(this.mec);
        this.mec.setBounds(130, 70, 110, 30);
        this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/orange/ser.png")));
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(650, 250, 230, 270);
        this.jLabel4.setIcon(new ImageIcon(this.getClass().getResource("/orange/service.PNG")));
        this.jPanel1.add(this.jLabel4);
        this.jLabel4.setBounds(20, 0, 70, 70);
        this.jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/orange/or.PNG")));
        this.jPanel1.add(this.jLabel5);
        this.jLabel5.setBounds(570, -10, 70, 70);
        this.nomadh.setFont(new Font("Tahoma", 0, 12));
        this.nomadh.setForeground(new Color(153, 0, 51));
        this.nomadh.setText(".......................................................................");
        this.jPanel1.add(this.nomadh);
        this.nomadh.setBounds(250, 64, 390, 40);
        this.jScrollPane4.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane4.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane4.setName("");
        this.jScrollPane4.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                orangedemandeancien.this.jScrollPane4MouseClicked(evt);
            }
        });
        this.ca.setFont(new Font("Sylfaen", 0, 18));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null}, {null, null, null, null, null, null}, {null, null, null, null, null, null}, {null, null, null, null, null, null}, {null, null, null, null, null, null}}, new String[]{"nom offre orange", "nb mois", "Montant", "Remarque", "choix", "nb"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Boolean.class, Integer.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setRowHeight(25);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                orangedemandeancien.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                orangedemandeancien.this.caMouseEntered(evt);
            }
        });
        this.ca.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                orangedemandeancien.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane4.setViewportView(this.ca);
        this.jPanel1.add(this.jScrollPane4);
        this.jScrollPane4.setBounds(10, 150, 640, 390);
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/orange/et.png")));
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(640, 90, 220, 260);
        this.jButton1.setFont(new Font("Tahoma", 0, 12));
        this.jButton1.setForeground(new Color(0, 102, 0));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/orange/cmd.PNG")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                orangedemandeancien.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(680, 10, 220, 60);
        this.jLabel7.setFont(new Font("Tahoma", 0, 18));
        this.jLabel7.setForeground(new Color(0, 0, 204));
        this.jLabel7.setText("Mecano :");
        this.jPanel1.add(this.jLabel7);
        this.jLabel7.setBounds(10, 70, 90, 30);
        this.obs.setFont(new Font("Tahoma", 0, 12));
        this.jPanel1.add(this.obs);
        this.obs.setBounds(130, 110, 210, 30);
        this.jPanel3.setBackground(new Color(255, 255, 255));
        this.jPanel3.setLayout(null);
        this.jLabel10.setFont(new Font("Tempus Sans ITC", 1, 18));
        this.jLabel10.setText("Demande d'un Service ORANGE ");
        this.jPanel3.add(this.jLabel10);
        this.jLabel10.setBounds(160, 100, 290, 40);
        this.jLabel11.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/ENTET.PNG")));
        this.jPanel3.add(this.jLabel11);
        this.jLabel11.setBounds(60, 10, 490, 60);
        this.prd.setFont(new Font("Tahoma", 1, 14));
        this.prd.setText("Prolongation");
        this.jPanel3.add(this.prd);
        this.prd.setBounds(360, 140, 120, 30);
        this.acd.setFont(new Font("Tahoma", 1, 14));
        this.acd.setText("Acquisition");
        this.jPanel3.add(this.acd);
        this.acd.setBounds(130, 140, 120, 30);
        this.jLabel12.setFont(new Font("Tahoma", 1, 12));
        this.jLabel12.setText("Mahdia, le ");
        this.jPanel3.add(this.jLabel12);
        this.jLabel12.setBounds(20, 70, 74, 24);
        this.dd.setFont(new Font("Tahoma", 1, 14));
        this.dd.setText("...........................................");
        this.jPanel3.add(this.dd);
        this.dd.setBounds(90, 70, 180, 20);
        this.jLabel14.setFont(new Font("Tahoma", 1, 12));
        this.jLabel14.setText("Identifiant Unique:");
        this.jPanel3.add(this.jLabel14);
        this.jLabel14.setBounds(20, 190, 116, 24);
        this.jLabel15.setFont(new Font("Tahoma", 1, 12));
        this.jLabel15.setText("Mecano:");
        this.jPanel3.add(this.jLabel15);
        this.jLabel15.setBounds(20, 220, 51, 24);
        this.jLabel16.setFont(new Font("Tahoma", 1, 12));
        this.jLabel16.setText("CIN:");
        this.jPanel3.add(this.jLabel16);
        this.jLabel16.setBounds(20, 250, 30, 24);
        this.jLabel17.setFont(new Font("Tahoma", 1, 12));
        this.jLabel17.setText("CIN:");
        this.jPanel3.add(this.jLabel17);
        this.jLabel17.setBounds(20, 250, 30, 24);
        this.cnrps.setFont(new Font("Tahoma", 1, 14));
        this.cnrps.setText("......................................");
        this.jPanel3.add(this.cnrps);
        this.cnrps.setBounds(150, 190, 450, 20);
        this.mecano.setFont(new Font("Tahoma", 1, 14));
        this.mecano.setText("......................................");
        this.jPanel3.add(this.mecano);
        this.mecano.setBounds(80, 220, 170, 20);
        this.ncin.setFont(new Font("Tahoma", 1, 14));
        this.ncin.setText("......................................");
        this.jPanel3.add(this.ncin);
        this.ncin.setBounds(50, 250, 170, 20);
        this.jLabel21.setFont(new Font("Tahoma", 1, 12));
        this.jLabel21.setText("Lieu de travail:");
        this.jPanel3.add(this.jLabel21);
        this.jLabel21.setBounds(390, 310, 100, 24);
        this.hobital.setFont(new Font("Tahoma", 1, 14));
        this.hobital.setText("....................................................................");
        this.jPanel3.add(this.hobital);
        this.hobital.setBounds(490, 310, 130, 20);
        this.jLabel23.setFont(new Font("Tahoma", 1, 12));
        this.jLabel23.setText("Nom:");
        this.jPanel3.add(this.jLabel23);
        this.jLabel23.setBounds(20, 280, 40, 24);
        this.nom.setFont(new Font("Tahoma", 1, 14));
        this.nom.setText("......................................");
        this.jPanel3.add(this.nom);
        this.nom.setBounds(60, 280, 560, 20);
        this.jLabel25.setFont(new Font("Tahoma", 1, 12));
        this.jLabel25.setText("SERVICE DEMANDES:");
        this.jPanel3.add(this.jLabel25);
        this.jLabel25.setBounds(20, 350, 150, 24);
        this.s4.setFont(new Font("Tahoma", 1, 14));
        this.s4.setText("*.................................................................");
        this.jPanel3.add(this.s4);
        this.s4.setBounds(20, 430, 260, 20);
        this.jLabel27.setFont(new Font("Tahoma", 1, 12));
        this.jLabel27.setText("Mutuelle DE LA SANTE MAHDIA ");
        this.jPanel3.add(this.jLabel27);
        this.jLabel27.setBounds(100, 450, 200, 24);
        this.ob.setFont(new Font("Tahoma", 1, 14));
        this.ob.setText("......................................");
        this.jPanel3.add(this.ob);
        this.ob.setBounds(110, 500, 550, 20);
        this.s1.setFont(new Font("Tahoma", 1, 14));
        this.s1.setText("*.................................................................");
        this.jPanel3.add(this.s1);
        this.s1.setBounds(20, 370, 260, 20);
        this.s3.setFont(new Font("Tahoma", 1, 14));
        this.s3.setText("*.................................................................");
        this.jPanel3.add(this.s3);
        this.s3.setBounds(20, 410, 260, 20);
        this.jLabel31.setFont(new Font("Tahoma", 1, 12));
        this.jLabel31.setText("SIGNATURE ");
        this.jPanel3.add(this.jLabel31);
        this.jLabel31.setBounds(350, 670, 80, 30);
        this.jLabel32.setFont(new Font("Tahoma", 1, 12));
        this.jLabel32.setText("Plus de 24 mois/GSM");
        this.jPanel3.add(this.jLabel32);
        this.jLabel32.setBounds(20, 590, 670, 30);
        this.jLabel33.setFont(new Font("Tahoma", 1, 12));
        this.jLabel33.setText("Livraison \u00e0:");
        this.jPanel3.add(this.jLabel33);
        this.jLabel33.setBounds(20, 450, 80, 24);
        this.etablissement.setFont(new Font("Tahoma", 1, 14));
        this.etablissement.setText("......................................");
        this.jPanel3.add(this.etablissement);
        this.etablissement.setBounds(120, 310, 220, 20);
        this.jLabel35.setFont(new Font("Tahoma", 1, 12));
        this.jLabel35.setText("N\u00b0t\u00e9l\u00e9phone:");
        this.jPanel3.add(this.jLabel35);
        this.jLabel35.setBounds(20, 480, 80, 24);
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setText("......................................");
        this.jPanel3.add(this.jLabel36);
        this.jLabel36.setBounds(110, 480, 170, 20);
        this.jLabel37.setFont(new Font("Tahoma", 1, 12));
        this.jLabel37.setText("Observations:");
        this.jPanel3.add(this.jLabel37);
        this.jLabel37.setBounds(20, 500, 90, 24);
        this.jLabel38.setFont(new Font("Tahoma", 1, 12));
        this.jLabel38.setText("Observations:");
        this.jPanel3.add(this.jLabel38);
        this.jLabel38.setBounds(20, 500, 90, 24);
        this.jLabel39.setFont(new Font("Tahoma", 1, 12));
        this.jLabel39.setText("Je m'engage a autoriser mon employeur de retour ma participation sur mon salaire ");
        this.jPanel3.add(this.jLabel39);
        this.jLabel39.setBounds(20, 530, 670, 24);
        this.jLabel40.setFont(new Font("Tahoma", 1, 12));
        this.jLabel40.setText("au profil du centre social compte n\u00b0 08501 00021 10 50813 4 77 domicile \u00e0 la BIAT");
        this.jPanel3.add(this.jLabel40);
        this.jLabel40.setBounds(20, 550, 670, 24);
        this.jLabel41.setFont(new Font("Tahoma", 1, 12));
        this.jLabel41.setText("Plus de 12 mois /Internet");
        this.jPanel3.add(this.jLabel41);
        this.jLabel41.setBounds(20, 610, 360, 24);
        this.jLabel42.setFont(new Font("Tahoma", 1, 12));
        this.jLabel42.setText(" Mahdia et ceux jusqu'a demande de r\u00e9siliation de  ma port comme suit :");
        this.jPanel3.add(this.jLabel42);
        this.jLabel42.setBounds(10, 570, 670, 24);
        this.jLabel43.setFont(new Font("Tahoma", 1, 12));
        this.jLabel43.setText("Adminitration:");
        this.jPanel3.add(this.jLabel43);
        this.jLabel43.setBounds(20, 310, 100, 24);
        this.s2.setFont(new Font("Tahoma", 1, 14));
        this.s2.setText("*.................................................................");
        this.jPanel3.add(this.s2);
        this.s2.setBounds(20, 390, 260, 20);
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel3, -2, 678, -2).addContainerGap(12, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel3, -2, 730, -2).addContainerGap()));
        this.jPanel1.add(this.jPanel2);
        this.jPanel2.setBounds(70, 540, 700, 10);
        this.jLabel9.setFont(new Font("Tahoma", 0, 18));
        this.jLabel9.setForeground(new Color(0, 0, 204));
        this.jLabel9.setText("Paiment par :");
        this.jPanel1.add(this.jLabel9);
        this.jLabel9.setBounds(360, 110, 110, 30);
        this.jLabel13.setFont(new Font("Tahoma", 0, 18));
        this.jLabel13.setForeground(new Color(0, 0, 204));
        this.jLabel13.setText("Observation :");
        this.jPanel1.add(this.jLabel13);
        this.jLabel13.setBounds(10, 110, 110, 30);
        this.buttonGroup2.add(this.jRadioButton2);
        this.jRadioButton2.setFont(new Font("Tahoma", 1, 14));
        this.jRadioButton2.setText("Cs");
        this.jPanel1.add(this.jRadioButton2);
        this.jRadioButton2.setBounds(470, 105, 50, 40);
        this.buttonGroup2.add(this.jRadioButton3);
        this.jRadioButton3.setFont(new Font("Tahoma", 1, 14));
        this.jRadioButton3.setText("Vir");
        this.jPanel1.add(this.jRadioButton3);
        this.jRadioButton3.setBounds(520, 105, 45, 40);
        this.buttonGroup2.add(this.jRadioButton4);
        this.jRadioButton4.setFont(new Font("Tahoma", 1, 14));
        this.jRadioButton4.setText("Cheq");
        this.jPanel1.add(this.jRadioButton4);
        this.jRadioButton4.setBounds(570, 105, 70, 40);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 936, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 548, -2).addContainerGap(-1, 32767)));
    }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane4MouseClicked(MouseEvent evt) {
    }

    private void mecKeyReleased(KeyEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!this.pr.isSelected()) {
            try {
                Statement state3;
                ResultSet result3;
                String t = "";
                this.k = 0;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mec.getText());
                    while (result3.next()) {
                        this.k = 1;
                        t = "S";
                        this.nomadh.setText(result3.getString("nom"));
                    }
                }
                catch (Exception e) {
                    this.k = 0;
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mec.getText());
                        while (result3.next()) {
                            this.k = 1;
                            t = "R";
                            this.nomadh.setText(result3.getString("nom"));
                        }
                    }
                    catch (Exception e) {
                        // empty catch block
                    }
                }
                if (this.k == 0) {
                    this.nomadh.setText(".................");
                } else {
                    DefaultTableModel model = (DefaultTableModel)this.ca.getModel();
                    DefaultTableModel medelo = (DefaultTableModel)this.ca.getModel();
                    while (medelo.getRowCount() > 0) {
                        for (int i = 0; i < model.getRowCount(); ++i) {
                            model.removeRow(i);
                        }
                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                        Statement state2 = conn22.createStatement();
                        ResultSet result2 = state2.executeQuery("SELECT *  FROM  forfaitorange ");
                        this.n = 0;
                        while (result2.next()) {
                            String nom = result2.getString("nom");
                            String nbm = result2.getString("nbmois");
                            String Montant = result2.getString("Montant");
                            Montant = new StringBuilder(Montant).insert(Montant.length() - 3, ".").toString();
                            String remarque = result2.getString("remarque");
                            int nb = 1;
                            medelo.addRow(new Object[]{nom, nbm, Montant, remarque, false, nb});
                            ++this.n;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                    }
                }
                System.out.println("k=" + this.k);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
                this.mec.setText("");
            }
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Date actuellEee = new Date();
        SimpleDateFormat dateFormatft = new SimpleDateFormat("yyyy/MM/dd");
        String datsystem = dateFormatft.format(actuellEee);
        this.dd.setText(datsystem);
        boolean kk = false;
        if (this.ac.isSelected() || this.pr.isSelected()) {
            if (this.k == 1) {
                int nb = 0;
                for (int i = 0; i < this.ca.getRowCount(); ++i) {
                    String jt = this.ca.getModel().getValueAt(i, 4).toString();
                    System.out.println("t[" + i + ",4] ==> " + jt);
                    if (!jt.equals("true")) continue;
                    ++nb;
                }
                if (nb == 0) {
                    JOptionPane.showMessageDialog(null, "Choisire au minimum un forfait ");
                }
                System.out.println("nb =" + nb);
                if (nb <= 4) {
                    int np = 0;
                    for (int i = 0; i < this.ca.getRowCount(); ++i) {
                        String jt = this.ca.getModel().getValueAt(i, 4).toString();
                        System.out.println("t[" + i + ",4] ==> " + jt);
                        if (!jt.equals("true")) continue;
                        String nbn = this.ca.getModel().getValueAt(i, 5).toString();
                        int nn = Integer.parseInt(nbn);
                        System.out.println("nbn " + nbn);
                        for (int j = 0; j <= nn; ++j) {
                            ++np;
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                Statement state2 = conn2.createStatement();
                                Object nomf = this.ca.getModel().getValueAt(i, 0);
                                if (np == 1) {
                                    this.s1.setText("* " + nomf);
                                } else if (np == 2) {
                                    this.s2.setText("* " + nomf);
                                } else if (np == 3) {
                                    this.s3.setText("* " + nomf);
                                } else {
                                    this.s4.setText("* " + nomf);
                                }
                                System.out.println("ref " + nomf);
                                String p = "0";
                                String type = "";
                                String r = "";
                                if (this.ac.isSelected()) {
                                    type = "Acquisition";
                                    this.acd.setSelected(true);
                                } else {
                                    type = "Prolongation";
                                    this.acd.setSelected(false);
                                }
                                state2.executeUpdate("INSERT INTO forfaitdemadeorange(mecano,nomforfait,type,recu,obser,date,ntel,nserie) VALUES('" + this.mec.getText() + "','" + nomf + "','" + type + "','" + p + "','" + this.obs.getText() + "','" + datsystem + "','" + r + "','" + r + "')");
                                kk = true;
                                continue;
                            }
                            catch (Exception e) {
                                this.k = 0;
                                JOptionPane.showMessageDialog(null, "erreur 3: " + e.getMessage());
                            }
                        }
                    }
                } else {
                    System.out.println("nb =" + nb);
                    JOptionPane.showMessageDialog(null, "Au maximum 4 forfait pour chaque demande");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Saisie mecano valide");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selection 'Acquisition' OU 'Prolongation' ??");
        }
        if (kk) {
            this.ob.setText(this.obs.getText());
            this.mecano.setText(this.mec.getText());
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mec.getText());
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.cnrps.setText(result3.getString("NCNR"));
                    this.ncin.setText(result3.getString("CIN"));
                    this.nom.setText(result3.getString("NOM"));
                    this.hobital.setText(result3.getString("LIEUTRAVAIL"));
                    this.etablissement.setText(result3.getString("etab"));
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
            JOptionPane jop1 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Succes d'ajout ", "Information", 1);
            Impression1 s = new Impression1(this.jPanel3);
            s.actionPerformed(evt);
        }
    }

}

