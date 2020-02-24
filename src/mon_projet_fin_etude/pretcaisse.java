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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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

public class pretcaisse
extends JPanel {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField mecano;
    private JLabel nom;

    public pretcaisse() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jButton3 = new JButton();
        this.jButton2 = new JButton();
        this.jButton1 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.mecano = new JTextField();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.nom = new JLabel();
        this.setLayout(null);
        this.jPanel1.setLayout(null);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Nom et Prenom :");
        this.jPanel1.add(this.jLabel2);
        this.jLabel2.setBounds(390, 60, 130, 30);
        this.jButton3.setFont(new Font("Tahoma", 1, 12));
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.jButton3.setText("Quitter");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                pretcaisse.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(570, 520, 105, 33);
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton2.setText("Valider");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                pretcaisse.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(440, 520, 111, 33);
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton1.setText("Recherche ");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                pretcaisse.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(250, 60, 130, 33);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jTable1.setFont(new Font("Tahoma", 1, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}}, new String[]{"Date Pret", "N\u00b0 Pret", "Montant Pret", "Nbr de mois", "Date d\u00e9but", "Date fin", "Total des pret", "Visa adherent"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                pretcaisse.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                pretcaisse.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                pretcaisse.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 100, 780, 410);
        this.jPanel1.add(this.mecano);
        this.mecano.setBounds(110, 60, 129, 27);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(0, 0, 204));
        this.jLabel1.setText("Pr\u00e9t / Caisse R\u00e9gionale Des Prets");
        this.jPanel1.add(this.jLabel1);
        this.jLabel1.setBounds(180, 10, 430, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("Saisire Mecano :");
        this.jPanel1.add(this.jLabel3);
        this.jLabel3.setBounds(0, 60, 130, 17);
        this.nom.setFont(new Font("Tahoma", 1, 18));
        this.nom.setForeground(new Color(204, 0, 0));
        this.jPanel1.add(this.nom);
        this.nom.setBounds(520, 50, 260, 40);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(10, 10, 790, 560);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("Date de Pret");
        dt1.addColumn("N\u00b0 de Pret");
        dt1.addColumn("Montant Pret");
        dt1.addColumn("Nb/M");
        dt1.addColumn("Date    d\u00e9but");
        dt1.addColumn("Date    fin");
        dt1.addColumn("Total de pret");
        dt1.addColumn("type");
        this.jTable1.setModel(dt1);
        boolean g = this.mecano.getText().equals("");
        if (g) {
            JOptionPane jop2 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Saisire Mecano ", "Attention", 0);
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                ResultSet result3 = state.executeQuery("SELECT * FROM cession2  WHERE Mecano='" + this.mecano.getText() + "'");
                int k = 0;
                int total = 0;
                System.out.println("k =" + k);
                System.out.println("*****************");
                while (result3.next()) {
                    System.out.println("------------------------");
                    System.out.println("k =" + ++k);
                    this.nom.setText(result3.getString("Nom"));
                    String datee = result3.getString("date");
                    System.out.println("*****************date " + datee);
                    String ref = result3.getString("ref");
                    System.out.println("*****************ref " + ref);
                    String Mont = result3.getString("Montant");
                    System.out.println("*****************Montant " + Mont);
                    Mont = Mont.substring(0, Mont.length() - 3);
                    total = Integer.parseInt(Mont) + total;
                    Mont = Mont + "  D";
                    System.out.println("*****************Mont " + Mont);
                    String totall = "" + total + "  D";
                    System.out.println("*****************totale " + total);
                    String nb = result3.getString("Nbmois");
                    System.out.println("***************** NB " + nb);
                    String pm = result3.getString("premiermois");
                    System.out.println("***************** 1 mois " + pm);
                    String dm = result3.getString("derniermois");
                    System.out.println("***************** derniermois " + dm);
                    Object[] stg = new Object[]{datee, ref, Mont, nb, pm, dm, totall, "CS-Pret"};
                    dt1.addRow(stg);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
            }
            Object[] stg = new Object[]{"----", "----", "----", "----", "----", "----", "----"};
            dt1.addRow(stg);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn3.createStatement();
                ResultSet result3 = state.executeQuery("SELECT * FROM cessionfournisseur  WHERE Mecano='" + this.mecano.getText() + "'");
                int k = 0;
                int total = 0;
                System.out.println("k =" + k);
                System.out.println("*****************");
                while (result3.next()) {
                    System.out.println("------------------------");
                    System.out.println("k =" + ++k);
                    this.nom.setText(result3.getString("Nom"));
                    String datee = result3.getString("date");
                    System.out.println("*****************date " + datee);
                    String ref = result3.getString("ref");
                    System.out.println("*****************ref " + ref);
                    String Mont = result3.getString("Montant");
                    System.out.println("*****************Montant " + Mont);
                    Mont = Mont.substring(0, Mont.length() - 3);
                    total = Integer.parseInt(Mont) + total;
                    Mont = Mont + "  D";
                    System.out.println("*****************Mont " + Mont);
                    String totall = "" + total + "  D";
                    System.out.println("*****************totale " + total);
                    String nb = result3.getString("Nbmois");
                    System.out.println("***************** NB " + nb);
                    String pm = result3.getString("premiermois");
                    System.out.println("***************** 1 mois " + pm);
                    String dm = result3.getString("derniermois");
                    System.out.println("***************** derniermois " + dm);
                    Object[] stg2 = new Object[]{datee, ref, Mont, nb, pm, dm, totall, "CS-FR"};
                    dt1.addRow(stg2);
                }
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur  " + e.getMessage());
            }
            Object[] stg2 = new Object[]{"----", "----", "----", "----", "----", "----", "----"};
            dt1.addRow(stg);
        }
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

}

