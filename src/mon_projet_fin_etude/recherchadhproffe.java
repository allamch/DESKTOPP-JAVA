/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
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
import mon_projet_fin_etude.recherchecarnedecheque;

public class recherchadhproffe
extends JPanel {
    public ImageIcon Format = null;
    private DefaultTableModel dt;
    private DefaultTableModel dt1;
    private int nump;
    private String nom;
    private String NOM;
    private String CINN;
    private String mecano;
    private String GSM;
    private String CSM;
    private String prenom;
    private String CNR;
    private Date dateR;
    private JLabel addres;
    private JLabel datnai;
    private JLabel hopital;
    private JLabel image;
    private JDesktopPane jDesktopPane1;
    private JLabel jLabel10;
    private JLabel jLabel13;
    private JLabel jLabel19;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel39;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel44;
    private JLabel jLabel46;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane4;
    private JTable jTable1;
    private JLabel lieunai;
    private JTextField mec;
    private JLabel mecano2;
    private JTextField nc;
    private JLabel ncin;
    private JLabel ncnr;
    private JTextField ncr;
    private JTextField nn;
    private JLabel nomc;
    private JLabel nomtpr;
    private JLabel profession;
    private JLabel rib;
    private JLabel tel;

    public recherchadhproffe() {
        this.initComponents();
    }

    private void initComponents() {
        this.mec = new JTextField();
        this.ncr = new JTextField();
        this.jLabel10 = new JLabel();
        this.nn = new JTextField();
        this.nc = new JTextField();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel39 = new JLabel();
        this.mecano2 = new JLabel();
        this.ncnr = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel40 = new JLabel();
        this.ncin = new JLabel();
        this.rib = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel44 = new JLabel();
        this.nomtpr = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel33 = new JLabel();
        this.datnai = new JLabel();
        this.lieunai = new JLabel();
        this.jLabel41 = new JLabel();
        this.profession = new JLabel();
        this.hopital = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel42 = new JLabel();
        this.nomc = new JLabel();
        this.tel = new JLabel();
        this.jLabel46 = new JLabel();
        this.jLabel32 = new JLabel();
        this.addres = new JLabel();
        this.jDesktopPane1 = new JDesktopPane();
        this.jScrollPane4 = new JScrollPane();
        this.image = new JLabel();
        this.setLayout(null);
        this.mec.setFont(new Font("Tahoma", 1, 14));
        this.mec.setForeground(new Color(0, 0, 153));
        this.mec.setText("        Taper Mecano");
        this.mec.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchadhproffe.this.mecMouseClicked(evt);
            }
        });
        this.mec.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                recherchadhproffe.this.mecActionPerformed(evt);
            }
        });
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchadhproffe.this.mecKeyReleased(evt);
            }
        });
        this.add(this.mec);
        this.mec.setBounds(0, 20, 180, 30);
        this.ncr.setFont(new Font("Tahoma", 1, 14));
        this.ncr.setForeground(new Color(0, 0, 153));
        this.ncr.setText("        Taper N\u00b0C.N.R");
        this.ncr.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchadhproffe.this.ncrMouseClicked(evt);
            }
        });
        this.ncr.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchadhproffe.this.ncrKeyReleased(evt);
            }
        });
        this.add(this.ncr);
        this.ncr.setBounds(0, 60, 180, 30);
        this.jLabel10.setIcon(new ImageIcon(this.getClass().getResource("/image/adh/rechercheadh.gif")));
        this.add(this.jLabel10);
        this.jLabel10.setBounds(180, 10, 90, 90);
        this.nn.setFont(new Font("Tahoma", 1, 14));
        this.nn.setForeground(new Color(0, 0, 153));
        this.nn.setText("        Taper Nom");
        this.nn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchadhproffe.this.nnMouseClicked(evt);
            }
        });
        this.nn.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchadhproffe.this.nnKeyReleased(evt);
            }
        });
        this.add(this.nn);
        this.nn.setBounds(270, 60, 190, 30);
        this.nc.setFont(new Font("Tahoma", 1, 14));
        this.nc.setForeground(new Color(0, 0, 153));
        this.nc.setText("        Taper N\u00b0CIN");
        this.nc.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchadhproffe.this.ncMouseClicked(evt);
            }
        });
        this.nc.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                recherchadhproffe.this.ncKeyReleased(evt);
            }
        });
        this.add(this.nc);
        this.nc.setBounds(270, 20, 190, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "liste des adh\u00e9rents", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchadhproffe.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Mecano", "N CIN", "Nom ET PRENOM", "CNR "}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                recherchadhproffe.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                recherchadhproffe.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                recherchadhproffe.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 90, 470, 420);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setForeground(new Color(0, 0, 255));
        this.jLabel39.setText("Mecano :");
        this.add(this.jLabel39);
        this.jLabel39.setBounds(490, 180, 66, 17);
        this.mecano2.setFont(new Font("Tahoma", 1, 14));
        this.mecano2.setText("............................");
        this.add(this.mecano2);
        this.mecano2.setBounds(570, 170, 120, 30);
        this.ncnr.setFont(new Font("Tahoma", 1, 14));
        this.ncnr.setText("..............................");
        this.add(this.ncnr);
        this.ncnr.setBounds(570, 200, 230, 30);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setForeground(new Color(0, 0, 255));
        this.jLabel36.setText("N\u00b0 C.N.R :");
        this.add(this.jLabel36);
        this.jLabel36.setBounds(490, 210, 70, 20);
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Tahoma", 1, 14));
        this.jLabel40.setForeground(new Color(0, 0, 255));
        this.jLabel40.setText("C.I.N :");
        this.add(this.jLabel40);
        this.jLabel40.setBounds(490, 240, 70, 20);
        this.ncin.setFont(new Font("Tahoma", 1, 14));
        this.ncin.setText("............................");
        this.add(this.ncin);
        this.ncin.setBounds(570, 230, 140, 30);
        this.rib.setFont(new Font("Tahoma", 1, 14));
        this.rib.setText(".............................................");
        this.add(this.rib);
        this.rib.setBounds(550, 260, 270, 30);
        this.jLabel19.setFont(new Font("Tahoma", 1, 14));
        this.jLabel19.setForeground(new Color(0, 0, 255));
        this.jLabel19.setText("RIB :");
        this.add(this.jLabel19);
        this.jLabel19.setBounds(490, 270, 60, 17);
        this.jLabel44.setBackground(new Color(153, 153, 255));
        this.jLabel44.setFont(new Font("Tahoma", 1, 14));
        this.jLabel44.setForeground(new Color(0, 0, 255));
        this.jLabel44.setText("Nom et prenom :");
        this.add(this.jLabel44);
        this.jLabel44.setBounds(490, 290, 150, 20);
        this.nomtpr.setFont(new Font("Tahoma", 1, 14));
        this.nomtpr.setForeground(new Color(102, 0, 0));
        this.nomtpr.setText(".....................................................");
        this.add(this.nomtpr);
        this.nomtpr.setBounds(490, 310, 330, 30);
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Tahoma", 1, 14));
        this.jLabel35.setText("Lieu de naissance :");
        this.add(this.jLabel35);
        this.jLabel35.setBounds(500, 360, 130, 20);
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setText("Date de naissance :");
        this.add(this.jLabel33);
        this.jLabel33.setBounds(500, 340, 150, 17);
        this.datnai.setFont(new Font("Tahoma", 0, 14));
        this.datnai.setText("............................");
        this.add(this.datnai);
        this.datnai.setBounds(650, 330, 120, 30);
        this.lieunai.setFont(new Font("Tahoma", 0, 14));
        this.lieunai.setText("............................");
        this.add(this.lieunai);
        this.lieunai.setBounds(650, 350, 130, 30);
        this.jLabel41.setBackground(new Color(153, 153, 255));
        this.jLabel41.setFont(new Font("Tahoma", 1, 14));
        this.jLabel41.setText("Prefession :");
        this.add(this.jLabel41);
        this.jLabel41.setBounds(500, 380, 90, 30);
        this.profession.setFont(new Font("Tahoma", 0, 14));
        this.profession.setText("............................");
        this.add(this.profession);
        this.profession.setBounds(590, 380, 190, 30);
        this.hopital.setFont(new Font("Tahoma", 0, 14));
        this.hopital.setText("............................");
        this.add(this.hopital);
        this.hopital.setBounds(590, 400, 180, 30);
        this.jLabel13.setFont(new Font("Tahoma", 1, 14));
        this.jLabel13.setText("Hopital :");
        this.add(this.jLabel13);
        this.jLabel13.setBounds(500, 410, 78, 17);
        this.jLabel42.setBackground(new Color(153, 153, 255));
        this.jLabel42.setFont(new Font("Tahoma", 1, 14));
        this.jLabel42.setText("N\u00b0 tel :");
        this.add(this.jLabel42);
        this.jLabel42.setBounds(500, 430, 80, 20);
        this.nomc.setFont(new Font("Tahoma", 0, 14));
        this.nomc.setText("............................");
        this.add(this.nomc);
        this.nomc.setBounds(610, 440, 170, 30);
        this.tel.setFont(new Font("Tahoma", 0, 14));
        this.tel.setText("............................");
        this.add(this.tel);
        this.tel.setBounds(590, 420, 120, 30);
        this.jLabel46.setBackground(new Color(153, 153, 255));
        this.jLabel46.setFont(new Font("Tahoma", 1, 14));
        this.jLabel46.setText("Nom conjoint :");
        this.add(this.jLabel46);
        this.jLabel46.setBounds(500, 450, 110, 20);
        this.jLabel32.setBackground(new Color(153, 153, 255));
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setText("Adresse :");
        this.add(this.jLabel32);
        this.jLabel32.setBounds(500, 470, 80, 30);
        this.addres.setFont(new Font("Tahoma", 0, 14));
        this.addres.setText(".......................................................................");
        this.add(this.addres);
        this.addres.setBounds(490, 490, 290, 30);
        this.image.setIcon(new ImageIcon(this.getClass().getResource("/image/bond de commande/rr.png")));
        this.jScrollPane4.setViewportView(this.image);
        this.jScrollPane4.setBounds(0, 0, 220, 150);
        this.jDesktopPane1.add((Component)this.jScrollPane4, JLayeredPane.DEFAULT_LAYER);
        this.add(this.jDesktopPane1);
        this.jDesktopPane1.setBounds(540, 10, 220, 150);
    }

    private void mecActionPerformed(ActionEvent evt) {
    }

    private void jTable1MouseClicked(MouseEvent evt) {
        int lign = this.jTable1.getSelectedRow();
        System.out.println(" ling =" + lign);
        String meco = this.jTable1.getModel().getValueAt(lign, 0).toString();
        this.mecano2.setText(meco);
        this.ncin.setText(this.jTable1.getModel().getValueAt(lign, 1).toString());
        this.nomtpr.setText(this.jTable1.getModel().getValueAt(lign, 2).toString());
        this.ncnr.setText(this.jTable1.getModel().getValueAt(lign, 3).toString());
        System.out.println(" mecano =" + meco);
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("aaaaaaaaaaaaaa");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE MECANO = '" + meco + "'");
            System.out.println("aaaaaaaaaaaaaa");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            boolean i = false;
            boolean c = false;
            while (result3.next()) {
                this.rib.setText(result3.getString("CCB"));
                this.datnai.setText(result3.getString("DATNAI"));
                this.lieunai.setText(result3.getString("LIEUNAI"));
                this.profession.setText(result3.getString("TRVAIL"));
                this.hopital.setText(result3.getString("LIEUTRAVAIL"));
                this.tel.setText(result3.getString("TEL"));
                this.nomc.setText(result3.getString("NOMCONJ"));
                this.addres.setText(result3.getString("ADRES"));
                byte[] imagedata = result3.getBytes("image");
                this.Format = new ImageIcon(imagedata);
                this.image.setIcon(this.Format);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
        }
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

    private void mecKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.mec.getText());
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("Mecano");
            this.dt1.addColumn("N\u00b0 CIN");
            this.dt1.addColumn("  Nom  et  Pr\u00e9nom");
            this.dt1.addColumn("  N\u00b0 C.N.R");
            this.jTable1.setModel(this.dt1);
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
                ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE MECANO LIKE '%" + this.mec.getText() + "%'");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                boolean i = false;
                boolean c = false;
                while (result3.next()) {
                    String ncnr = result3.getString("NCNR");
                    String CINN = result3.getString("CIN");
                    String nom = result3.getString("NOM");
                    String MECANO = result3.getString("MECANO");
                    Object[] stg = new Object[]{MECANO, CINN, nom, ncnr};
                    this.dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.mec.setText("");
        }
    }

    private void mecMouseClicked(MouseEvent evt) {
        this.mec.setText("");
        this.nn.setText("        Taper Nom");
        this.ncr.setText("        Taper N\u00b0C.N.R");
        this.nc.setText("        Taper N\u00b0CIN");
    }

    private void ncKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.nc.getText());
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("Mecano");
            this.dt1.addColumn("N\u00b0 CIN");
            this.dt1.addColumn("  Nom  et  Pr\u00e9nom");
            this.dt1.addColumn("  N\u00b0 C.N.R");
            this.jTable1.setModel(this.dt1);
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("aaaaaaaaaaaaaa");
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE CIN LIKE '%" + this.nc.getText() + "%'");
                System.out.println("aaaaaaaaaaaaaa");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    System.out.println("aaaaaaaaaaaaaa");
                    String ncnr = result3.getString("NCNR");
                    String CINN = result3.getString("CIN");
                    String nom = result3.getString("NOM");
                    String MECANO = result3.getString("MECANO");
                    Object[] stg = new Object[]{MECANO, CINN, nom, ncnr};
                    this.dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.nc.setText("");
        }
    }

    private void ncMouseClicked(MouseEvent evt) {
        this.mec.setText("        Taper Mecano");
        this.nn.setText("        Taper Nom");
        this.ncr.setText("        Taper N\u00b0C.N.R");
        this.nc.setText("");
    }

    private void ncrMouseClicked(MouseEvent evt) {
        this.mec.setText("        Taper Mecano");
        this.nn.setText("        Taper Nom");
        this.ncr.setText("");
        this.nc.setText("        Taper N\u00b0CIN");
    }

    private void nnMouseClicked(MouseEvent evt) {
        this.mec.setText("        Taper Mecano");
        this.nn.setText("");
        this.ncr.setText("        Taper N\u00b0C.N.R");
        this.nc.setText("        Taper N\u00b0CIN");
    }

    private void ncrKeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.ncr.getText());
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("Mecano");
            this.dt1.addColumn("N\u00b0 CIN");
            this.dt1.addColumn("  Nom  et  Pr\u00e9nom");
            this.dt1.addColumn("  N\u00b0 C.N.R");
            this.jTable1.setModel(this.dt1);
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("aaaaaaaaaaaaaa");
                Statement state3 = conn2.createStatement();
                ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE NCNR LIKE '%" + this.ncr.getText() + "%'");
                System.out.println("aaaaaaaaaaaaaa");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                boolean i = false;
                boolean c = false;
                while (result3.next()) {
                    System.out.println("aaaaaaaaaaaaaa");
                    String ncnr = result3.getString("NCNR");
                    String CINN = result3.getString("CIN");
                    String nom = result3.getString("NOM");
                    String MECANO = result3.getString("MECANO");
                    Object[] stg = new Object[]{MECANO, CINN, nom, ncnr};
                    this.dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepte que des chiffres !!");
            this.ncr.setText("");
        }
    }

    private void nnKeyReleased(KeyEvent evt) {
        this.dt1 = new DefaultTableModel();
        this.dt1.addColumn("Mecano");
        this.dt1.addColumn("N\u00b0 CIN");
        this.dt1.addColumn("  Nom  et  Pr\u00e9nom");
        this.dt1.addColumn("  N\u00b0 C.N.R");
        this.jTable1.setModel(this.dt1);
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("aaaaaaaaaaaaaa");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent WHERE NOM LIKE '%" + this.nn.getText() + "%'");
            System.out.println("aaaaaaaaaaaaaa");
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                System.out.println("aaaaaaaaaaaaaa");
                String ncnr = result3.getString("NCNR");
                String CINN = result3.getString("CIN");
                String nom = result3.getString("NOM");
                String MECANO = result3.getString("MECANO");
                Object[] stg = new Object[]{MECANO, CINN, nom, ncnr};
                this.dt1.addRow(stg);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
        }
    }

}

