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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class orangeetatdedeuxans
extends JPanel {
    int k = 0;
    int n = 0;
    private ButtonGroup buttonGroup1;
    private JTable ca;
    private JButton jButton2;
    private JButton jButton4;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JRadioButton jRadioButton1;
    private JScrollPane jScrollPane4;

    public orangeetatdedeuxans() {
        this.initComponents();
    }

    private void initComponents() {
        this.jRadioButton1 = new JRadioButton();
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jScrollPane4 = new JScrollPane();
        this.ca = new JTable();
        this.jButton2 = new JButton();
        this.jButton4 = new JButton();
        this.jRadioButton1.setText("jRadioButton1");
        this.jPanel1.setLayout(null);
        this.jLabel1.setFont(new Font("Tempus Sans ITC", 1, 30));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Etat des paiments \"Orange\" par adherant  ****");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(20, 0, 680, 40);
        this.jScrollPane4.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane4.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane4.setName("");
        this.jScrollPane4.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                orangeetatdedeuxans.this.jScrollPane4MouseClicked(evt);
            }
        });
        this.ca.setFont(new Font("Sylfaen", 0, 12));
        this.ca.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}}, new String[]{"Mecano", "NOM", "offre", "montant", "nb"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.ca.setRowHeight(25);
        this.ca.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                orangeetatdedeuxans.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                orangeetatdedeuxans.this.caMouseEntered(evt);
            }
        });
        this.ca.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                orangeetatdedeuxans.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane4.setViewportView(this.ca);
        this.jPanel1.add(this.jScrollPane4);
        this.jScrollPane4.setBounds(0, 40, 990, 450);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/orange/rech.jpg")));
        this.jButton2.setText("Recherche ");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                orangeetatdedeuxans.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(680, 0, 140, 40);
        this.jButton4.setFont(new Font("Tahoma", 1, 12));
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton4.setText("Imprimer");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                orangeetatdedeuxans.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton4);
        this.jButton4.setBounds(830, 0, 120, 40);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, 998, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 494, -2).addContainerGap(-1, 32767)));
    }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane4MouseClicked(MouseEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        Connection conn2 = null;
        try {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        }
        catch (SQLException ex) {
            Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0 tel");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom et prenom");
        dt1.addColumn("Offre");
        dt1.addColumn("montant");
        dt1.addColumn("nbm");
        dt1.addColumn("type");
        dt1.addColumn("N\u00b0 serie");
        dt1.addColumn("date");
        dt1.addColumn("NB/J");
        dt1.addColumn("NB/M");
        this.ca.setModel(dt1);
        int total = 0;
        String nbmois = "0";
        boolean b = false;
        String mmmm = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Statement state2 = conn2.createStatement();
            String r = "1";
            ResultSet result2 = state2.executeQuery("SELECT *  FROM  forfaitdemadeorange  WHERE recu='" + r + "' ORDER BY ntel ");
            total = 0;
            while (result2.next()) {
                Statement state3;
                ResultSet result3;
                JOptionPane jop3;
                long nombredemois = 0;
                long nbjours;
                this.k = 0;
                String mecano = result2.getString("mecano");
                String nomadh = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    state3 = conn2.createStatement();
                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + mecano);
                    while (result3.next()) {
                        this.k = 1;
                        nomadh = result3.getString("nom");
                    }
                }
                catch (Exception e) {
                    this.k = 0;
                    jop3 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                }
                if (this.k == 0) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        state3 = conn2.createStatement();
                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + mecano);
                        while (result3.next()) {
                            this.k = 1;
                            nomadh = result3.getString("nom");
                        }
                    }
                    catch (Exception e) {
                        jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 3" + e.getMessage());
                    }
                }
                String nomf = result2.getString("nomforfait");
                String mont = "";
                String nbm = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement state32 = conn2.createStatement();
                    ResultSet result32 = state32.executeQuery("SELECT * FROM forfaitorange  WHERE nom='" + nomf + "'");
                    mmmm = "0";
                    while (result32.next()) {
                        nbmois = result32.getString("nbmois");
                        mmmm = mont = result32.getString("Montant");
                        mont = new StringBuilder(mont).insert(mont.length() - 3, ".").toString();
                        nbm = result32.getString("nbmois");
                    }
                }
                catch (Exception e) {
                    JOptionPane jop32 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "erreur 2" + e.getMessage());
                }
                String type = result2.getString("type");
                String ob = result2.getString("obser");
                String ntel = result2.getString("ntel");
                String dt = result2.getString("date");
                this.k = 1;
                String jours = dt.substring(dt.length() - 2, dt.length());
                String mois2 = dt.substring(dt.length() - 5, dt.length() - 3);
                String anne = dt.substring(0, dt.length() - 6);
                int a = Integer.parseInt(anne);
                int j = Integer.parseInt(jours);
                int m = Integer.parseInt(mois2);
                Date date1 = new GregorianCalendar(a, m, j, 23, 59).getTime();
                Date today = new Date();
                long diff = today.getTime() - date1.getTime();
                int nn = Integer.parseInt(nbmois);
                System.out.println("nombredemois : " + nombredemois);
                int i = 0;
                System.out.println("i : " + i);
                for (nombredemois = nbjours = (long)(nn * 30) - diff / 86400000; nombredemois > 30; nombredemois -= 30) {
                    System.out.println("i : " + ++i);
                }
                System.out.println("------------------------------------------");
                if (i > 2) continue;
                total = Integer.parseInt(mmmm) + total;
                String nbn = "" + nbjours + "j";
                String nserie = result2.getString("nserie");
                Object[] stg = new Object[]{ntel, mecano, nomadh, nomf, mont, nbm, type, nserie, dt, nbn, i};
                dt1.addRow(stg);
                b = true;
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
            if (b) {
                String m = "" + total + "";
                String montt = new StringBuilder(m).insert(m.length() - 3, ".").toString();
                Object[] stg = new Object[]{"", "", "", "total =>", montt, "", "", "", "", "", ""};
                dt1.addRow(stg);
                ColumnsAutoSizer.sizeColumnsToFit(this.ca);
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
        }
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        Date actuellEeddc = new Date();
        SimpleDateFormat dateFormattddc = new SimpleDateFormat("dd/MM/yyyy");
        String dat = dateFormattddc.format(actuellEeddc);
        MessageFormat header = new MessageFormat("Etat de paiment Orange (date: " + dat + " )");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.ca.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

}

