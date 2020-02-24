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
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import mon_projet_fin_etude.ColumnsAutoSizer;
import mon_projet_fin_etude.recherchecarnedecheque;

public class etatbcparfornissseur
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JTextField MATF2;
    private JTextField a1;
    private JTextField a2;
    private JLabel annedebut2;
    private JLabel annedebut3;
    private JLabel annefin;
    private JLabel annefin1;
    private ButtonGroup buttonGroup1;
    private JComboBox j1;
    private JComboBox j2;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel7;
    private JPanel jPanel16;
    private JRadioButton jRadioMC;
    private JRadioButton jRadiodate;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField2;
    private JComboBox m1;
    private JComboBox m2;
    private JLabel moisdebut;
    private JLabel moisfin;
    private JLabel nomscc;

    public etatbcparfornissseur() {
        this.initComponents();
    }

    private void initComponents() {
        this.buttonGroup1 = new ButtonGroup();
        this.jPanel16 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.MATF2 = new JTextField();
        this.jLabel30 = new JLabel();
        this.jLabel7 = new JLabel();
        this.m1 = new JComboBox();
        this.moisdebut = new JLabel();
        this.moisfin = new JLabel();
        this.m2 = new JComboBox();
        this.annedebut2 = new JLabel();
        this.annefin = new JLabel();
        this.a2 = new JTextField();
        this.a1 = new JTextField();
        this.annefin1 = new JLabel();
        this.annedebut3 = new JLabel();
        this.j2 = new JComboBox();
        this.j1 = new JComboBox();
        this.jTextField2 = new JTextField();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jRadioMC = new JRadioButton();
        this.jRadiodate = new JRadioButton();
        this.jButton1 = new JButton();
        this.nomscc = new JLabel();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setFont(new Font("Tahoma", 0, 12));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}, {null, null, null, null, null, null, null, null}}, new String[]{"N\u00b0 BC", "Mecano", "Nom", "Date", "Montant", "BQ", "NB mois", "MC"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.setRowHeight(30);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                etatbcparfornissseur.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                etatbcparfornissseur.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel16.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 130, 740, 370);
        this.MATF2.setFont(new Font("Tahoma", 0, 14));
        this.MATF2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.MATF2MouseClicked(evt);
            }
        });
        this.MATF2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatbcparfornissseur.this.MATF2ActionPerformed(evt);
            }
        });
        this.MATF2.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                etatbcparfornissseur.this.MATF2KeyReleased(evt);
            }
        });
        this.jPanel16.add(this.MATF2);
        this.MATF2.setBounds(170, 60, 100, 30);
        this.jLabel30.setBackground(new Color(153, 153, 255));
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setForeground(new Color(0, 0, 255));
        this.jLabel30.setText("Recherche  :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(30, 30, 90, 30);
        this.jLabel7.setFont(new Font("Snap ITC", 1, 20));
        this.jLabel7.setForeground(new Color(0, 0, 153));
        this.jLabel7.setText("Etat : Bon de Commande par fournisseur");
        this.jPanel16.add(this.jLabel7);
        this.jLabel7.setBounds(110, 0, 520, 30);
        this.m1.setFont(new Font("Tahoma", 1, 12));
        this.m1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " "}));
        this.m1.setEnabled(false);
        this.m1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.m1MouseClicked(evt);
            }
        });
        this.m1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatbcparfornissseur.this.m1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.m1);
        this.m1.setBounds(510, 50, 50, 30);
        this.moisdebut.setFont(new Font("Tahoma", 1, 14));
        this.moisdebut.setForeground(new Color(153, 0, 0));
        this.moisdebut.setText("Mois :");
        this.jPanel16.add(this.moisdebut);
        this.moisdebut.setBounds(460, 50, 50, 30);
        this.moisfin.setFont(new Font("Tahoma", 1, 14));
        this.moisfin.setForeground(new Color(153, 0, 0));
        this.moisfin.setText("Mois :");
        this.jPanel16.add(this.moisfin);
        this.moisfin.setBounds(460, 90, 50, 30);
        this.m2.setFont(new Font("Tahoma", 1, 12));
        this.m2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", ""}));
        this.m2.setEnabled(false);
        this.m2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.m2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.m2);
        this.m2.setBounds(510, 90, 50, 30);
        this.annedebut2.setFont(new Font("Tahoma", 1, 14));
        this.annedebut2.setForeground(new Color(153, 0, 0));
        this.annedebut2.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annedebut2);
        this.annedebut2.setBounds(580, 50, 50, 30);
        this.annefin.setFont(new Font("Tahoma", 1, 14));
        this.annefin.setForeground(new Color(153, 0, 0));
        this.annefin.setText("Ann\u00e9 :");
        this.jPanel16.add(this.annefin);
        this.annefin.setBounds(580, 90, 50, 30);
        this.a2.setEnabled(false);
        this.a2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.a2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a2);
        this.a2.setBounds(630, 90, 80, 30);
        this.a1.setEnabled(false);
        this.a1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.a1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.a1);
        this.a1.setBounds(630, 50, 80, 30);
        this.annefin1.setFont(new Font("Tahoma", 1, 14));
        this.annefin1.setForeground(new Color(153, 0, 0));
        this.annefin1.setText("Jour:");
        this.jPanel16.add(this.annefin1);
        this.annefin1.setBounds(350, 90, 40, 30);
        this.annedebut3.setFont(new Font("Tahoma", 1, 14));
        this.annedebut3.setForeground(new Color(153, 0, 0));
        this.annedebut3.setText("Jour:");
        this.jPanel16.add(this.annedebut3);
        this.annedebut3.setBounds(350, 50, 40, 30);
        this.j2.setFont(new Font("Tahoma", 1, 12));
        this.j2.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j2.setEnabled(false);
        this.j2.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.j2MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.j2);
        this.j2.setBounds(390, 90, 60, 30);
        this.j1.setFont(new Font("Tahoma", 1, 12));
        this.j1.setModel(new DefaultComboBoxModel<String>(new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " "}));
        this.j1.setEnabled(false);
        this.j1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.j1MouseClicked(evt);
            }
        });
        this.jPanel16.add(this.j1);
        this.j1.setBounds(390, 50, 60, 30);
        this.jTextField2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.jTextField2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatbcparfornissseur.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jTextField2);
        this.jTextField2.setBounds(298, 50, 2, 70);
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setForeground(new Color(102, 0, 102));
        this.jLabel1.setText("A :");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(310, 90, 30, 30);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setForeground(new Color(102, 0, 102));
        this.jLabel3.setText("du :");
        this.jPanel16.add(this.jLabel3);
        this.jLabel3.setBounds(310, 50, 30, 30);
        this.jLabel31.setBackground(new Color(153, 153, 255));
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setForeground(new Color(0, 0, 255));
        this.jLabel31.setText("Mat Fournisseur :");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(30, 60, 120, 30);
        this.buttonGroup1.add(this.jRadioMC);
        this.jRadioMC.setFont(new Font("Tahoma", 1, 14));
        this.jRadioMC.setText("M.C");
        this.jRadioMC.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.jRadioMCMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.jRadioMC);
        this.jRadioMC.setBounds(220, 30, 60, 30);
        this.buttonGroup1.add(this.jRadiodate);
        this.jRadiodate.setFont(new Font("Tahoma", 1, 14));
        this.jRadiodate.setText("Date");
        this.jRadiodate.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                etatbcparfornissseur.this.jRadiodateMouseClicked(evt);
            }
        });
        this.jPanel16.add(this.jRadiodate);
        this.jRadiodate.setBounds(160, 30, 60, 30);
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setText("Imprimer");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                etatbcparfornissseur.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton1);
        this.jButton1.setBounds(650, 10, 100, 30);
        this.nomscc.setFont(new Font("Tahoma", 1, 12));
        this.nomscc.setForeground(new Color(153, 0, 0));
        this.nomscc.setText(".......................................");
        this.jPanel16.add(this.nomscc);
        this.nomscc.setBounds(20, 94, 260, 20);
        this.add(this.jPanel16);
        this.jPanel16.setBounds(0, 0, 760, 510);
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
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

    private void MATF2KeyReleased(KeyEvent evt) {
        block104 : {
            this.m1.setSelectedIndex(0);
            this.m2.setSelectedIndex(0);
            this.j1.setSelectedIndex(0);
            this.j2.setSelectedIndex(0);
            this.a1.setText("");
            this.a2.setText("");
            if (this.jRadiodate.isSelected()) {
                Date actuellEe = new Date();
                SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
                String datdd = dateFormatt.format(actuellEe);
                String jours = datdd.substring(0, datdd.length() - 8);
                String mois2 = datdd.substring(3, datdd.length() - 5);
                int ms = Integer.parseInt(mois2);
                String jj = this.j1.getSelectedItem().toString();
                if (jj.equals("00")) {
                    switch (ms) {
                        case 1: {
                            this.m1.setSelectedIndex(1);
                            this.m2.setSelectedIndex(1);
                            break;
                        }
                        case 2: {
                            this.m1.setSelectedIndex(2);
                            this.m2.setSelectedIndex(2);
                            break;
                        }
                        case 3: {
                            this.m1.setSelectedIndex(3);
                            this.m2.setSelectedIndex(3);
                            break;
                        }
                        case 4: {
                            this.m1.setSelectedIndex(4);
                            this.m2.setSelectedIndex(4);
                            break;
                        }
                        case 5: {
                            this.m1.setSelectedIndex(5);
                            this.m2.setSelectedIndex(5);
                            break;
                        }
                        case 6: {
                            this.m1.setSelectedIndex(6);
                            this.m2.setSelectedIndex(6);
                            break;
                        }
                        case 7: {
                            this.m1.setSelectedIndex(7);
                            this.m2.setSelectedIndex(7);
                            break;
                        }
                        case 8: {
                            this.m1.setSelectedIndex(8);
                            this.m2.setSelectedIndex(8);
                            break;
                        }
                        case 9: {
                            this.m1.setSelectedIndex(9);
                            this.m2.setSelectedIndex(9);
                            break;
                        }
                        case 10: {
                            this.m1.setSelectedIndex(10);
                            this.m2.setSelectedIndex(10);
                            break;
                        }
                        case 11: {
                            this.m1.setSelectedIndex(11);
                            this.m2.setSelectedIndex(11);
                            break;
                        }
                        case 12: {
                            this.m1.setSelectedIndex(12);
                            this.m2.setSelectedIndex(12);
                            break;
                        }
                        default: {
                            this.m1.setSelectedIndex(0);
                            this.m2.setSelectedIndex(0);
                        }
                    }
                    String ann\u00e9es = datdd.substring(6, datdd.length());
                    this.a1.setText(ann\u00e9es);
                    this.a2.setText(ann\u00e9es);
                    int j = Integer.parseInt(jours);
                    switch (j) {
                        case 1: {
                            this.j1.setSelectedIndex(1);
                            this.j2.setSelectedIndex(1);
                            break;
                        }
                        case 2: {
                            this.j1.setSelectedIndex(2);
                            this.j2.setSelectedIndex(2);
                            break;
                        }
                        case 3: {
                            this.j1.setSelectedIndex(3);
                            this.j2.setSelectedIndex(3);
                            break;
                        }
                        case 4: {
                            this.j1.setSelectedIndex(4);
                            this.j2.setSelectedIndex(4);
                            break;
                        }
                        case 5: {
                            this.j1.setSelectedIndex(5);
                            this.j2.setSelectedIndex(5);
                            break;
                        }
                        case 6: {
                            this.j1.setSelectedIndex(6);
                            this.j2.setSelectedIndex(6);
                            break;
                        }
                        case 7: {
                            this.j1.setSelectedIndex(7);
                            this.j2.setSelectedIndex(7);
                            break;
                        }
                        case 8: {
                            this.j1.setSelectedIndex(8);
                            this.j2.setSelectedIndex(8);
                            break;
                        }
                        case 9: {
                            this.j1.setSelectedIndex(9);
                            this.j2.setSelectedIndex(9);
                            break;
                        }
                        case 10: {
                            this.j1.setSelectedIndex(10);
                            this.j2.setSelectedIndex(10);
                            break;
                        }
                        case 11: {
                            this.j1.setSelectedIndex(11);
                            this.j2.setSelectedIndex(11);
                            break;
                        }
                        case 12: {
                            this.j1.setSelectedIndex(12);
                            this.j2.setSelectedIndex(12);
                            break;
                        }
                        case 13: {
                            this.j1.setSelectedIndex(13);
                            this.j2.setSelectedIndex(13);
                            break;
                        }
                        case 14: {
                            this.j1.setSelectedIndex(14);
                            this.j2.setSelectedIndex(14);
                            break;
                        }
                        case 15: {
                            this.j1.setSelectedIndex(15);
                            this.j2.setSelectedIndex(15);
                            break;
                        }
                        case 16: {
                            this.j1.setSelectedIndex(16);
                            this.j2.setSelectedIndex(16);
                            break;
                        }
                        case 17: {
                            this.j1.setSelectedIndex(17);
                            this.j2.setSelectedIndex(17);
                            break;
                        }
                        case 18: {
                            this.j1.setSelectedIndex(18);
                            this.j2.setSelectedIndex(18);
                            break;
                        }
                        case 19: {
                            this.j1.setSelectedIndex(19);
                            this.j2.setSelectedIndex(19);
                            break;
                        }
                        case 20: {
                            this.j1.setSelectedIndex(20);
                            this.j2.setSelectedIndex(20);
                            break;
                        }
                        case 21: {
                            this.j1.setSelectedIndex(11);
                            this.j2.setSelectedIndex(11);
                            break;
                        }
                        case 22: {
                            this.j1.setSelectedIndex(22);
                            this.j2.setSelectedIndex(22);
                            break;
                        }
                        case 23: {
                            this.j1.setSelectedIndex(23);
                            this.j2.setSelectedIndex(23);
                            break;
                        }
                        case 24: {
                            this.j1.setSelectedIndex(24);
                            this.j2.setSelectedIndex(24);
                            break;
                        }
                        case 25: {
                            this.j1.setSelectedIndex(25);
                            this.j2.setSelectedIndex(25);
                            break;
                        }
                        case 26: {
                            this.j1.setSelectedIndex(26);
                            this.j2.setSelectedIndex(26);
                            break;
                        }
                        case 27: {
                            this.j1.setSelectedIndex(27);
                            this.j2.setSelectedIndex(27);
                            break;
                        }
                        case 28: {
                            this.j1.setSelectedIndex(28);
                            this.j2.setSelectedIndex(28);
                            break;
                        }
                        case 29: {
                            this.j1.setSelectedIndex(29);
                            this.j2.setSelectedIndex(29);
                            break;
                        }
                        case 30: {
                            this.j1.setSelectedIndex(30);
                            this.j2.setSelectedIndex(30);
                            break;
                        }
                        case 31: {
                            this.j1.setSelectedIndex(31);
                            this.j2.setSelectedIndex(31);
                            break;
                        }
                        default: {
                            this.j1.setSelectedIndex(0);
                            this.j2.setSelectedIndex(0);
                        }
                    }
                }
                this.nomscc.setText("..................");
                this.j1.enable(false);
                this.j2.enable(false);
                this.m1.enable(false);
                this.m2.enable(false);
                this.a1.enable(false);
                this.a2.enable(false);
                try {
                    DefaultTableModel dt1;
                    int montantnet = Integer.parseInt(this.MATF2.getText());
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
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.MATF2.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    if (test) {
                        this.j1.enable(true);
                        this.j2.enable(true);
                        this.m1.enable(true);
                        this.m2.enable(true);
                        this.a1.enable(true);
                        this.a2.enable(true);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
                        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
                        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
                        int mois22 = Integer.parseInt(this.m2.getSelectedItem().toString());
                        int anne1 = Integer.parseInt(this.a1.getText());
                        int anne2 = Integer.parseInt(this.a2.getText());
                        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                        int montantparmois = 0;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn22.createStatement();
                            System.out.println("matf= " + this.MATF2.getText());
                            System.out.println("nneesdebut=" + this.a1.getText());
                            String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                            System.out.println("dtt debut = " + datedebu);
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            Date datedebut = sdf.parse(datedebu);
                            System.out.println("dtt fin = " + datedefi);
                            Date datedefin = sdf.parse(datedefi);
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "'ORDER BY nbc");
                            System.out.println("-------55555555555555555-------");
                            boolean y = false;
                            while (result2.next()) {
                                ResultSet result3;
                                JOptionPane jop3;
                                Statement state3;
                                ResultSetMetaData resultMeta3;
                                String dt = "";
                                dt = result2.getString("datebc");
                                System.out.println("dt = " + dt);
                                Date d1 = sdf.parse(dt);
                                System.out.println("d1 = " + d1);
                                System.out.println("--------------");
                                if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                                y = true;
                                System.out.println("---------2222222222-----");
                                String nbc = result2.getString("nbc");
                                System.out.println("nbc = " + nbc);
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn2.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
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
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("*********************");
                                this.k = 0;
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1  :::  " + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block104;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {}
            } else if (this.jRadioMC.isSelected()) {
                int montantparmois = 0;
                this.nomscc.setText("................");
                this.j1.enable(false);
                this.j2.enable(false);
                this.m1.enable(true);
                this.m2.enable(false);
                this.a1.enable(true);
                this.a2.enable(false);
                Date actuellEe = new Date();
                SimpleDateFormat dateFormatt = new SimpleDateFormat("dd/MM/yyyy");
                String datdd = dateFormatt.format(actuellEe);
                String jours = datdd.substring(0, datdd.length() - 8);
                String mois3 = datdd.substring(3, datdd.length() - 5);
                int ms = Integer.parseInt(mois3);
                String jj = this.m1.getSelectedItem().toString();
                if (jj.equals("00")) {
                    switch (ms) {
                        case 1: {
                            this.m1.setSelectedIndex(1);
                            break;
                        }
                        case 2: {
                            this.m1.setSelectedIndex(2);
                            break;
                        }
                        case 3: {
                            this.m1.setSelectedIndex(3);
                            break;
                        }
                        case 4: {
                            this.m1.setSelectedIndex(4);
                            break;
                        }
                        case 5: {
                            this.m1.setSelectedIndex(5);
                            break;
                        }
                        case 6: {
                            this.m1.setSelectedIndex(6);
                            break;
                        }
                        case 7: {
                            this.m1.setSelectedIndex(7);
                            break;
                        }
                        case 8: {
                            this.m1.setSelectedIndex(8);
                            break;
                        }
                        case 9: {
                            this.m1.setSelectedIndex(9);
                            break;
                        }
                        case 10: {
                            this.m1.setSelectedIndex(10);
                            break;
                        }
                        case 11: {
                            this.m1.setSelectedIndex(11);
                            break;
                        }
                        case 12: {
                            this.m1.setSelectedIndex(12);
                            break;
                        }
                        default: {
                            this.m1.setSelectedIndex(0);
                        }
                    }
                    String ann\u00e9es = datdd.substring(6, datdd.length());
                    this.a1.setText(ann\u00e9es);
                    this.a2.setText(ann\u00e9es);
                }
                try {
                    DefaultTableModel dt1;
                    Connection conn3 = null;
                    try {
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    boolean test = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + this.MATF2.getText() + "'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                    if (test) {
                        this.j1.enable(false);
                        this.j2.enable(false);
                        this.m1.enable(true);
                        this.m2.enable(false);
                        this.a1.enable(true);
                        this.a2.enable(false);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc   WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' AND moisdebut='" + this.m1.getSelectedItem().toString() + "'");
                            boolean y = false;
                            while (result2.next()) {
                                Statement state3;
                                JOptionPane jop3;
                                ResultSet result3;
                                y = true;
                                String dt = "";
                                dt = result2.getString("datebc");
                                System.out.println("date bc = " + dt);
                                String nbc = result2.getString("nbc");
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn3.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn3.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("mois debuut " + mc);
                                this.k = 0;
                                System.out.println("------------------------");
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block104;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
                    this.MATF2.setText("");
                    this.a1.setText("");
                }
            }
        }
    }

    private void MATF2MouseClicked(MouseEvent evt) {
    }

    private void MATF2ActionPerformed(ActionEvent evt) {
    }

    private void m1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jRadiodateMouseClicked(MouseEvent evt) {
        this.MATF2.setText("");
        this.j1.enable(false);
        this.j2.enable(false);
        this.m1.enable(false);
        this.m2.enable(false);
        this.a1.enable(false);
        this.a2.enable(false);
        this.j1.setSelectedIndex(0);
        this.j2.setSelectedIndex(0);
        this.m1.setSelectedIndex(0);
        this.m2.setSelectedIndex(0);
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0BC");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom");
        dt1.addColumn("datebc");
        dt1.addColumn(" Montant BC ");
        dt1.addColumn(" Montant net ");
        dt1.addColumn("code B");
        dt1.addColumn("NB mois");
        dt1.addColumn("MC");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        MessageFormat header = new MessageFormat(this.nomscc.getText() + " (" + this.MATF2.getText() + ") Mois :" + this.m1.getSelectedItem().toString());
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void j1MouseClicked(MouseEvent evt) {
        block41 : {
            this.nomscc.setText("...................");
            int montantparmois = 0;
            if (this.jRadiodate.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    int montantnet = Integer.parseInt(this.MATF2.getText());
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
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.MATF2.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    if (test) {
                        this.j1.enable(true);
                        this.j2.enable(true);
                        this.m1.enable(true);
                        this.m2.enable(true);
                        this.a1.enable(true);
                        this.a2.enable(true);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
                        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
                        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
                        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
                        int anne1 = Integer.parseInt(this.a1.getText());
                        int anne2 = Integer.parseInt(this.a2.getText());
                        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn22.createStatement();
                            System.out.println("matf= " + this.MATF2.getText());
                            System.out.println("nneesdebut=" + this.a1.getText());
                            String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                            System.out.println("dtt debut = " + datedebu);
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            Date datedebut = sdf.parse(datedebu);
                            System.out.println("dtt fin = " + datedefi);
                            Date datedefin = sdf.parse(datedefi);
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "'ORDER BY nbc");
                            boolean y = false;
                            while (result2.next()) {
                                Statement state3;
                                ResultSet result3;
                                JOptionPane jop3;
                                ResultSetMetaData resultMeta3;
                                String dt = "";
                                dt = result2.getString("datebc");
                                Date d1 = sdf.parse(dt);
                                System.out.println("date bc = " + dt);
                                if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                                y = true;
                                String nbc = result2.getString("nbc");
                                System.out.println("nbc = " + nbc);
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn2.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn2.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("*********************");
                                this.k = 0;
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {}
            } else if (this.jRadioMC.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    Connection conn3 = null;
                    try {
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    boolean test = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + this.MATF2.getText() + "'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                    if (test) {
                        this.j1.enable(false);
                        this.j2.enable(false);
                        this.m1.enable(true);
                        this.m2.enable(false);
                        this.a1.enable(true);
                        this.a2.enable(false);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc   WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' AND moisdebut='" + this.m1.getSelectedItem().toString() + "'");
                            boolean y = false;
                            while (result2.next()) {
                                ResultSet result3;
                                JOptionPane jop3;
                                Statement state3;
                                y = true;
                                String dt = "";
                                dt = result2.getString("datebc");
                                System.out.println("date bc = " + dt);
                                String nbc = result2.getString("nbc");
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn3.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn3.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("mois debuut " + mc);
                                this.k = 0;
                                System.out.println("------------------------");
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
                }
            }
        }
    }

    private void m1MouseClicked(MouseEvent evt) {
        block41 : {
            this.nomscc.setText("...................");
            int montantparmois = 0;
            if (this.jRadiodate.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    int montantnet = Integer.parseInt(this.MATF2.getText());
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
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.MATF2.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    if (test) {
                        this.j1.enable(true);
                        this.j2.enable(true);
                        this.m1.enable(true);
                        this.m2.enable(true);
                        this.a1.enable(true);
                        this.a2.enable(true);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
                        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
                        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
                        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
                        int anne1 = Integer.parseInt(this.a1.getText());
                        int anne2 = Integer.parseInt(this.a2.getText());
                        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn22.createStatement();
                            System.out.println("matf= " + this.MATF2.getText());
                            System.out.println("nneesdebut=" + this.a1.getText());
                            String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                            System.out.println("dtt debut = " + datedebu);
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            Date datedebut = sdf.parse(datedebu);
                            System.out.println("dtt fin = " + datedefi);
                            Date datedefin = sdf.parse(datedefi);
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "'ORDER BY nbc");
                            boolean y = false;
                            while (result2.next()) {
                                Statement state3;
                                ResultSet result3;
                                JOptionPane jop3;
                                ResultSetMetaData resultMeta3;
                                String dt = "";
                                dt = result2.getString("datebc");
                                Date d1 = sdf.parse(dt);
                                System.out.println("date bc = " + dt);
                                if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                                y = true;
                                String nbc = result2.getString("nbc");
                                System.out.println("nbc = " + nbc);
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn2.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn2.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("*********************");
                                this.k = 0;
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {}
            } else if (this.jRadioMC.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    Connection conn3 = null;
                    try {
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    boolean test = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + this.MATF2.getText() + "'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                    if (test) {
                        this.j1.enable(false);
                        this.j2.enable(false);
                        this.m1.enable(true);
                        this.m2.enable(false);
                        this.a1.enable(true);
                        this.a2.enable(false);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc   WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' AND moisdebut='" + this.m1.getSelectedItem().toString() + "'");
                            boolean y = false;
                            while (result2.next()) {
                                ResultSet result3;
                                JOptionPane jop3;
                                Statement state3;
                                y = true;
                                String dt = "";
                                dt = result2.getString("datebc");
                                System.out.println("date bc = " + dt);
                                String nbc = result2.getString("nbc");
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn3.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn3.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("mois debuut " + mc);
                                this.k = 0;
                                System.out.println("------------------------");
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
                }
            }
        }
    }

    private void a1MouseClicked(MouseEvent evt) {
        block41 : {
            this.nomscc.setText("...................");
            int montantparmois = 0;
            if (this.jRadiodate.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    int montantnet = Integer.parseInt(this.MATF2.getText());
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
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.MATF2.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    if (test) {
                        this.j1.enable(true);
                        this.j2.enable(true);
                        this.m1.enable(true);
                        this.m2.enable(true);
                        this.a1.enable(true);
                        this.a2.enable(true);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
                        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
                        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
                        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
                        int anne1 = Integer.parseInt(this.a1.getText());
                        int anne2 = Integer.parseInt(this.a2.getText());
                        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn22.createStatement();
                            System.out.println("matf= " + this.MATF2.getText());
                            System.out.println("nneesdebut=" + this.a1.getText());
                            String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                            System.out.println("dtt debut = " + datedebu);
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            Date datedebut = sdf.parse(datedebu);
                            System.out.println("dtt fin = " + datedefi);
                            Date datedefin = sdf.parse(datedefi);
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "'ORDER BY nbc");
                            boolean y = false;
                            while (result2.next()) {
                                Statement state3;
                                ResultSet result3;
                                JOptionPane jop3;
                                ResultSetMetaData resultMeta3;
                                String dt = "";
                                dt = result2.getString("datebc");
                                Date d1 = sdf.parse(dt);
                                System.out.println("date bc = " + dt);
                                if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                                y = true;
                                String nbc = result2.getString("nbc");
                                System.out.println("nbc = " + nbc);
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn2.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn2.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("*********************");
                                this.k = 0;
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {}
            } else if (this.jRadioMC.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    Connection conn3 = null;
                    try {
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    boolean test = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + this.MATF2.getText() + "'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                    if (test) {
                        this.j1.enable(false);
                        this.j2.enable(false);
                        this.m1.enable(true);
                        this.m2.enable(false);
                        this.a1.enable(true);
                        this.a2.enable(false);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc   WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' AND moisdebut='" + this.m1.getSelectedItem().toString() + "'");
                            boolean y = false;
                            while (result2.next()) {
                                ResultSet result3;
                                JOptionPane jop3;
                                Statement state3;
                                y = true;
                                String dt = "";
                                dt = result2.getString("datebc");
                                System.out.println("date bc = " + dt);
                                String nbc = result2.getString("nbc");
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn3.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn3.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("mois debuut " + mc);
                                this.k = 0;
                                System.out.println("------------------------");
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
                }
            }
        }
    }

    private void j2MouseClicked(MouseEvent evt) {
        block41 : {
            this.nomscc.setText("...................");
            int montantparmois = 0;
            if (this.jRadiodate.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    int montantnet = Integer.parseInt(this.MATF2.getText());
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
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.MATF2.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    if (test) {
                        this.j1.enable(true);
                        this.j2.enable(true);
                        this.m1.enable(true);
                        this.m2.enable(true);
                        this.a1.enable(true);
                        this.a2.enable(true);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
                        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
                        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
                        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
                        int anne1 = Integer.parseInt(this.a1.getText());
                        int anne2 = Integer.parseInt(this.a2.getText());
                        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn22.createStatement();
                            System.out.println("matf= " + this.MATF2.getText());
                            System.out.println("nneesdebut=" + this.a1.getText());
                            String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                            System.out.println("dtt debut = " + datedebu);
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            Date datedebut = sdf.parse(datedebu);
                            System.out.println("dtt fin = " + datedefi);
                            Date datedefin = sdf.parse(datedefi);
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "'ORDER BY nbc");
                            boolean y = false;
                            while (result2.next()) {
                                Statement state3;
                                ResultSet result3;
                                JOptionPane jop3;
                                ResultSetMetaData resultMeta3;
                                String dt = "";
                                dt = result2.getString("datebc");
                                Date d1 = sdf.parse(dt);
                                System.out.println("date bc = " + dt);
                                if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                                y = true;
                                String nbc = result2.getString("nbc");
                                System.out.println("nbc = " + nbc);
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn2.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn2.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("*********************");
                                this.k = 0;
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {}
            } else if (this.jRadioMC.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    Connection conn3 = null;
                    try {
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    boolean test = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + this.MATF2.getText() + "'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                    if (test) {
                        this.j1.enable(false);
                        this.j2.enable(false);
                        this.m1.enable(true);
                        this.m2.enable(false);
                        this.a1.enable(true);
                        this.a2.enable(false);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc   WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' AND moisdebut='" + this.m1.getSelectedItem().toString() + "'");
                            boolean y = false;
                            while (result2.next()) {
                                ResultSet result3;
                                JOptionPane jop3;
                                Statement state3;
                                y = true;
                                String dt = "";
                                dt = result2.getString("datebc");
                                System.out.println("date bc = " + dt);
                                String nbc = result2.getString("nbc");
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn3.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn3.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("mois debuut " + mc);
                                this.k = 0;
                                System.out.println("------------------------");
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
                }
            }
        }
    }

    private void m2MouseClicked(MouseEvent evt) {
        block41 : {
            this.nomscc.setText("...................");
            int montantparmois = 0;
            if (this.jRadiodate.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    int montantnet = Integer.parseInt(this.MATF2.getText());
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
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.MATF2.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    if (test) {
                        this.j1.enable(true);
                        this.j2.enable(true);
                        this.m1.enable(true);
                        this.m2.enable(true);
                        this.a1.enable(true);
                        this.a2.enable(true);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
                        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
                        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
                        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
                        int anne1 = Integer.parseInt(this.a1.getText());
                        int anne2 = Integer.parseInt(this.a2.getText());
                        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn22.createStatement();
                            System.out.println("matf= " + this.MATF2.getText());
                            System.out.println("nneesdebut=" + this.a1.getText());
                            String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                            System.out.println("dtt debut = " + datedebu);
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            Date datedebut = sdf.parse(datedebu);
                            System.out.println("dtt fin = " + datedefi);
                            Date datedefin = sdf.parse(datedefi);
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "'ORDER BY nbc");
                            boolean y = false;
                            while (result2.next()) {
                                Statement state3;
                                ResultSet result3;
                                JOptionPane jop3;
                                ResultSetMetaData resultMeta3;
                                String dt = "";
                                dt = result2.getString("datebc");
                                Date d1 = sdf.parse(dt);
                                System.out.println("date bc = " + dt);
                                if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                                y = true;
                                String nbc = result2.getString("nbc");
                                System.out.println("nbc = " + nbc);
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn2.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn2.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("*********************");
                                this.k = 0;
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {}
            } else if (this.jRadioMC.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    Connection conn3 = null;
                    try {
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    boolean test = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + this.MATF2.getText() + "'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                    if (test) {
                        this.j1.enable(false);
                        this.j2.enable(false);
                        this.m1.enable(true);
                        this.m2.enable(false);
                        this.a1.enable(true);
                        this.a2.enable(false);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc   WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' AND moisdebut='" + this.m1.getSelectedItem().toString() + "'");
                            boolean y = false;
                            while (result2.next()) {
                                ResultSet result3;
                                JOptionPane jop3;
                                Statement state3;
                                y = true;
                                String dt = "";
                                dt = result2.getString("datebc");
                                System.out.println("date bc = " + dt);
                                String nbc = result2.getString("nbc");
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn3.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn3.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("mois debuut " + mc);
                                this.k = 0;
                                System.out.println("------------------------");
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
                }
            }
        }
    }

    private void a2MouseClicked(MouseEvent evt) {
        block41 : {
            this.nomscc.setText("...................");
            int montantparmois = 0;
            if (this.jRadiodate.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    int montantnet = Integer.parseInt(this.MATF2.getText());
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
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC=" + this.MATF2.getText());
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                    }
                    if (test) {
                        this.j1.enable(true);
                        this.j2.enable(true);
                        this.m1.enable(true);
                        this.m2.enable(true);
                        this.a1.enable(true);
                        this.a2.enable(true);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        int jour1 = Integer.parseInt(this.j1.getSelectedItem().toString());
                        int jour2 = Integer.parseInt(this.j2.getSelectedItem().toString());
                        int mois1 = Integer.parseInt(this.m1.getSelectedItem().toString());
                        int mois2 = Integer.parseInt(this.m2.getSelectedItem().toString());
                        int anne1 = Integer.parseInt(this.a1.getText());
                        int anne2 = Integer.parseInt(this.a2.getText());
                        String datedebu = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                        String datedefi = this.j2.getSelectedItem().toString() + "/" + this.m2.getSelectedItem().toString() + "/" + this.a2.getText();
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn22.createStatement();
                            System.out.println("matf= " + this.MATF2.getText());
                            System.out.println("nneesdebut=" + this.a1.getText());
                            String dtt = this.j1.getSelectedItem().toString() + "/" + this.m1.getSelectedItem().toString() + "/" + this.a1.getText();
                            System.out.println("dtt debut = " + datedebu);
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            Date datedebut = sdf.parse(datedebu);
                            System.out.println("dtt fin = " + datedefi);
                            Date datedefin = sdf.parse(datedefi);
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc  WHERE matf='" + this.MATF2.getText() + "'ORDER BY nbc");
                            boolean y = false;
                            while (result2.next()) {
                                Statement state3;
                                ResultSet result3;
                                JOptionPane jop3;
                                ResultSetMetaData resultMeta3;
                                String dt = "";
                                dt = result2.getString("datebc");
                                Date d1 = sdf.parse(dt);
                                System.out.println("date bc = " + dt);
                                if (!d1.equals(datedebut) && !d1.equals(datedefin) && (!datedebut.before(d1) || !datedefin.after(d1))) continue;
                                y = true;
                                String nbc = result2.getString("nbc");
                                System.out.println("nbc = " + nbc);
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn2.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn2.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("*********************");
                                this.k = 0;
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {}
            } else if (this.jRadioMC.isSelected()) {
                try {
                    DefaultTableModel dt1;
                    Connection conn3 = null;
                    try {
                        conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    boolean test = false;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Statement state3 = conn3.createStatement();
                        ResultSet result3 = state3.executeQuery("SELECT * FROM fournisseur  WHERE MATRIC='" + this.MATF2.getText() + "'");
                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                        while (result3.next()) {
                            this.nomscc.setText(result3.getString("NOM"));
                            test = true;
                        }
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                    if (test) {
                        this.j1.enable(false);
                        this.j2.enable(false);
                        this.m1.enable(true);
                        this.m2.enable(false);
                        this.a1.enable(true);
                        this.a2.enable(false);
                        dt1 = new DefaultTableModel();
                        dt1.addColumn("N\u00b0BC");
                        dt1.addColumn("Mecano");
                        dt1.addColumn("Nom");
                        dt1.addColumn("datebc");
                        dt1.addColumn("Montant");
                        dt1.addColumn("BQ");
                        dt1.addColumn("NB M");
                        dt1.addColumn("MC");
                        this.jTable1.setModel(dt1);
                        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                        this.jTable1.setFillsViewportHeight(true);
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            int totale = 0;
                            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                            Statement state2 = conn2.createStatement();
                            ResultSet result2 = state2.executeQuery("SELECT *  FROM  bc   WHERE matf='" + this.MATF2.getText() + "' AND anneesdebut='" + this.a1.getText() + "' AND moisdebut='" + this.m1.getSelectedItem().toString() + "'");
                            boolean y = false;
                            while (result2.next()) {
                                ResultSet result3;
                                JOptionPane jop3;
                                Statement state3;
                                y = true;
                                String dt = "";
                                dt = result2.getString("datebc");
                                System.out.println("date bc = " + dt);
                                String nbc = result2.getString("nbc");
                                String Mec = result2.getString("Mecano");
                                boolean kk = false;
                                String nom = "";
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    state3 = conn3.createStatement();
                                    result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + Mec);
                                    ResultSetMetaData resultMeta3 = result3.getMetaData();
                                    while (result3.next()) {
                                        nom = result3.getString("nom");
                                        kk = true;
                                    }
                                }
                                catch (Exception e) {
                                    jop3 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur s" + e.getMessage());
                                }
                                if (this.k == 0) {
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        state3 = conn3.createStatement();
                                        result3 = state3.executeQuery("SELECT * FROM retretait  WHERE mecano=" + Mec);
                                        ResultSetMetaData resultMeta3 = result3.getMetaData();
                                        while (result3.next()) {
                                            nom = result3.getString("nom");
                                            kk = true;
                                        }
                                    }
                                    catch (Exception e) {
                                        jop3 = new JOptionPane();
                                        JOptionPane.showMessageDialog(null, "erreur r" + e.getMessage());
                                    }
                                }
                                String mc = result2.getString("moisdebut");
                                System.out.println("mois debuut " + mc);
                                this.k = 0;
                                System.out.println("------------------------");
                                String montantbc = result2.getString("montantbc");
                                int t = Integer.parseInt(montantbc);
                                System.out.println("montant = " + montantbc);
                                montantbc = new StringBuilder(montantbc).insert(montantbc.length() - 3, ".").toString();
                                System.out.println("montant 2= " + montantbc);
                                String nbmois = result2.getString("nbmois");
                                int nb = Integer.parseInt(nbmois);
                                int mpm = t / nb;
                                montantparmois += mpm;
                                totale += t;
                                String codeB = result2.getString("codeb");
                                Object[] stg = new Object[]{nbc, Mec, nom, dt, montantbc, codeB, nbmois, mc};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                            if (y) {
                                String tt = "" + totale + "";
                                tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                                Object[] stg = new Object[]{"", "", "", "totale =", tt, "", "", ""};
                                dt1.addRow(stg);
                                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1);
                            }
                        }
                        catch (Exception e) {
                            JOptionPane jop3 = new JOptionPane();
                            JOptionPane.showMessageDialog(null, "erreur 1" + e.getMessage());
                        }
                        String tt = "" + montantparmois + "";
                        tt = new StringBuilder(tt).insert(tt.length() - 3, ".").toString();
                        Object[] stg = new Object[]{"", "", "", "M /mois =", tt, "", "", ""};
                        dt1.addRow(stg);
                        break block41;
                    }
                    this.j1.enable(false);
                    this.j2.enable(false);
                    this.m1.enable(false);
                    this.m2.enable(false);
                    this.a1.enable(false);
                    this.a2.enable(false);
                    this.j1.setSelectedIndex(0);
                    this.j2.setSelectedIndex(0);
                    this.m1.setSelectedIndex(0);
                    this.m2.setSelectedIndex(0);
                    dt1 = new DefaultTableModel();
                    dt1.addColumn("N\u00b0BC");
                    dt1.addColumn("Mecano");
                    dt1.addColumn("Nom");
                    dt1.addColumn("datebc");
                    dt1.addColumn(" Montant BC ");
                    dt1.addColumn(" Montant net ");
                    dt1.addColumn("code B");
                    dt1.addColumn("NB mois");
                    dt1.addColumn("MC");
                    this.jTable1.setModel(dt1);
                    this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
                    this.jTable1.setFillsViewportHeight(true);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "N'accepter que des chiffres !!");
                }
            }
        }
    }

    private void jRadioMCMouseClicked(MouseEvent evt) {
        this.MATF2.setText("");
        this.j1.enable(false);
        this.j2.enable(false);
        this.m1.enable(false);
        this.m2.enable(false);
        this.a1.enable(false);
        this.a2.enable(false);
        this.j1.setSelectedIndex(0);
        this.j2.setSelectedIndex(0);
        this.m1.setSelectedIndex(0);
        this.m2.setSelectedIndex(0);
        DefaultTableModel dt1 = new DefaultTableModel();
        dt1.addColumn("N\u00b0BC");
        dt1.addColumn("Mecano");
        dt1.addColumn("Nom");
        dt1.addColumn("datebc");
        dt1.addColumn(" Montant BC ");
        dt1.addColumn(" Montant net ");
        dt1.addColumn("code B");
        dt1.addColumn("NB mois");
        dt1.addColumn("MC");
        this.jTable1.setModel(dt1);
        this.jTable1.setPreferredScrollableViewportSize(new Dimension(500, 70));
        this.jTable1.setFillsViewportHeight(true);
    }

}

