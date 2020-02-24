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

public class ETATBONCOMMANDE
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JTextField MATF2;
    private JTextField annedebut;
    private JButton jButton19;
    private JLabel jLabel30;
    private JLabel jLabel40;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel nomadh;

    public ETATBONCOMMANDE() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jButton19 = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.MATF2 = new JTextField();
        this.jLabel40 = new JLabel();
        this.jLabel30 = new JLabel();
        this.annedebut = new JTextField();
        this.jLabel7 = new JLabel();
        this.nomadh = new JLabel();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jButton19.setFont(new Font("Tahoma", 1, 12));
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton19.setText("Recherche");
        this.jButton19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ETATBONCOMMANDE.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton19);
        this.jButton19.setBounds(330, 90, 130, 33);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "Liste des bons commandes", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATBONCOMMANDE.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setFont(new Font("Tahoma", 1, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}}, new String[]{"N\u00b0 BC", "Mecano", "Date", "Montant", "BQ", "NB mois", "MC"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATBONCOMMANDE.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                ETATBONCOMMANDE.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                ETATBONCOMMANDE.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 130, 680, 420);
        this.MATF2.setFont(new Font("Tahoma", 0, 14));
        this.MATF2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATBONCOMMANDE.this.MATF2MouseClicked(evt);
            }
        });
        this.MATF2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ETATBONCOMMANDE.this.MATF2ActionPerformed(evt);
            }
        });
        this.MATF2.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ETATBONCOMMANDE.this.MATF2KeyReleased(evt);
            }
        });
        this.jPanel16.add(this.MATF2);
        this.MATF2.setBounds(250, 50, 210, 30);
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Tahoma", 1, 14));
        this.jLabel40.setForeground(new Color(0, 0, 255));
        this.jLabel40.setText("Ann\u00e9es :");
        this.jPanel16.add(this.jLabel40);
        this.jLabel40.setBounds(100, 90, 70, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("Mat Fournisseur :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(100, 50, 140, 30);
        this.annedebut.setFont(new Font("Tahoma", 0, 14));
        this.annedebut.setText("2017");
        this.annedebut.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                ETATBONCOMMANDE.this.annedebutMouseClicked(evt);
            }
        });
        this.annedebut.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                ETATBONCOMMANDE.this.annedebutActionPerformed(evt);
            }
        });
        this.annedebut.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                ETATBONCOMMANDE.this.annedebutKeyReleased(evt);
            }
        });
        this.jPanel16.add(this.annedebut);
        this.annedebut.setBounds(250, 90, 70, 30);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 24));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Recherche Bon de Commande");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(110, 10, 460, 30);
        this.nomadh.setFont(new Font("Tahoma", 1, 18));
        this.nomadh.setForeground(new Color(102, 0, 0));
        this.jPanel16.add(this.nomadh);
        this.nomadh.setBounds(660, 44, 330, 30);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(-6, 1, 1010, 560);
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

    private void MATF2KeyReleased(KeyEvent evt) {
        try {
            int montantnet = Integer.parseInt(this.annedebut.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
            this.annedebut.setText("");
        }
    }

    private void MATF2MouseClicked(MouseEvent evt) {
    }

    private void MATF2ActionPerformed(ActionEvent evt) {
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

    private void annedebutActionPerformed(ActionEvent evt) {
    }

    private void annedebutMouseClicked(MouseEvent evt) {
    }

}

