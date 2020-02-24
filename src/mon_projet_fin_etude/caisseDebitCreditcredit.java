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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
import mon_projet_fin_etude.recherchecarnedecheque;

public class caisseDebitCreditcredit
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JButton consulter;
    private JButton jButton4;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField mecano;
    private JLabel nomt;

    public caisseDebitCreditcredit() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jButton4 = new JButton();
        this.mecano = new JTextField();
        this.consulter = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.nomt = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel2 = new JLabel();
        this.setLayout(null);
        this.jPanel2.setLayout(null);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton4.setText("Imprimer");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDebitCreditcredit.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton4);
        this.jButton4.setBounds(590, 30, 120, 30);
        this.mecano.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseDebitCreditcredit.this.mecanoMouseClicked(evt);
            }
        });
        this.mecano.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                caisseDebitCreditcredit.this.mecanoKeyReleased(evt);
            }
        });
        this.jPanel2.add(this.mecano);
        this.mecano.setBounds(100, 30, 110, 30);
        this.consulter.setIcon(new ImageIcon(this.getClass().getResource("/image/gestion cheque/aaa.png")));
        this.consulter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDebitCreditcredit.this.consulterActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.consulter);
        this.consulter.setBounds(530, 30, 50, 30);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseDebitCreditcredit.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"Mecano", "Nom et prenom", "payment par"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.setIntercellSpacing(new Dimension(2, 2));
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisseDebitCreditcredit.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                caisseDebitCreditcredit.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                caisseDebitCreditcredit.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel2.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 100, 710, 370);
        this.nomt.setFont(new Font("Tahoma", 1, 14));
        this.nomt.setText("...............................................................");
        this.jPanel2.add(this.nomt);
        this.nomt.setBounds(0, 60, 690, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 18));
        this.jLabel4.setForeground(new Color(153, 0, 153));
        this.jLabel4.setText("Mecano :");
        this.jPanel2.add(this.jLabel4);
        this.jLabel4.setBounds(3, 25, 90, 40);
        this.jLabel2.setFont(new Font("Tahoma", 1, 24));
        this.jLabel2.setForeground(new Color(102, 0, 102));
        this.jLabel2.setText("                               **Credit **");
        this.jPanel2.add(this.jLabel2);
        this.jLabel2.setBounds(100, -6, 610, 30);
        this.add(this.jPanel2);
        this.jPanel2.setBounds(0, 0, 730, 480);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
    }

    private void mecanoMouseClicked(MouseEvent evt) {
    }

    private void mecanoKeyReleased(KeyEvent evt) {
        ResultSet result3;
        JOptionPane jop3;
        Statement state3;
        ResultSetMetaData resultMeta3;
        Date actuellEe = new Date();
        SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
        String datdd = dateFormatt.format(actuellEe);
        String ann\u00e9es = datdd.substring(6, datdd.length());
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
            state3 = conn2.createStatement();
            result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
            resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                this.nomt.setText(result3.getString("nom"));
                kk = true;
            }
        }
        catch (Exception e) {
            jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
        }
        if (!kk) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                state3 = conn2.createStatement();
                result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + this.mecano.getText());
                resultMeta3 = result3.getMetaData();
                while (result3.next()) {
                    this.nomt.setText(result3.getString("nom"));
                    kk = true;
                }
            }
            catch (Exception e) {
                jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
            }
        }
    }

    private void consulterActionPerformed(ActionEvent evt) {
        boolean mmm = true;
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean cc = false;
        boolean j = false;
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("MAT");
        dt1.addColumn("Nom FR");
        dt1.addColumn("date debut");
        dt1.addColumn("NB M");
        dt1.addColumn("Montant");
        this.k = 0;
        this.jTable1.setModel(dt1);
        int totale = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            String p = "0";
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc WHERE Mecano='" + this.mecano.getText() + "' AND p='" + p + "'");
            cc = false;
            this.k = 0;
            while (result2.next()) {
                String datedebut = "";
                int md = Integer.parseInt(result2.getString("moisdebut"));
                System.out.println("md = " + md);
                int ad = Integer.parseInt(result2.getString("anneesdebut"));
                System.out.println("ad = " + ad);
                int nbmois = Integer.parseInt(result2.getString("nbmois"));
                System.out.println("nb mois = " + nbmois);
                int mf = 0;
                int af = 0;
                if (md + nbmois <= 12) {
                    mf = md + nbmois - 1;
                    af = ad;
                } else {
                    mf = md + nbmois - 1;
                    af = ad;
                    while (mf > 12) {
                        mf -= 12;
                        ++af;
                    }
                }
                System.out.println("mf = " + mf);
                System.out.println("af = " + af);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date datedebutt = sdf.parse("" + ad + "-" + md + "-01");
                String db = "" + md + "-" + ad;
                Date datefinn = sdf.parse("" + af + "-" + mf + "-01");
                String df = "" + mf + "-" + af;
                System.out.println("---------------------------");
                String nbc = result2.getString("nbc");
                this.k = 1;
                String avance = result2.getString("accompte");
                String acc = avance + "";
                if (acc.length() >= 3) {
                    acc = new StringBuilder(acc).insert(acc.length() - 3, ".").toString();
                }
                int montantparmois = (Integer.parseInt(result2.getString("montantbc")) - Integer.parseInt(result2.getString("accompte"))) / nbmois;
                System.out.println("montant= " + montantparmois);
                String stac = "" + montantparmois + "";
                stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
                totale = montantparmois + totale;
                cc = true;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
        String stac = "" + totale + "";
        stac = new StringBuilder(stac).insert(stac.length() - 3, ".").toString();
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

