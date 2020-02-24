/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class caisserecapj extends JPanel { 
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JTable jTable1;
    private JRadioButton dd;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private DefaultTableModel dt1;
    private JScrollPane jScrollPane1;
    
      public caisserecapj() {
        this.initComponents();
    }
     private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jTable1 = new JTable();
        this.jButton1= new JButton();
        this.jButton2= new JButton();
        this.jButton3= new JButton();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Mutuelle de la Santé : Récapitulation espèces du jour",TitledBorder.CENTER, 0, new Font("Times New Roman", 1, 21),new Color(196, 0, 0)));
        this.jPanel1.setPreferredSize(new Dimension(1005,540));
        this.jPanel1.setLayout(null);
        this.jScrollPane1 = new JScrollPane();
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Times New Roman", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
         
        this.jScrollPane1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisserecapj.this.jScrollPane1MouseClicked(evt);
            }
        });
        this.jTable1.setFont(new Font("Times New Roman", 0, 15));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}}, new String[]{"N\u00b0 Reçu", "Mecano", "Nom ","Libellé", "M.C","BQ" ,"Crédit", "Débit", "M.Caisse","Date","G.L"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class,Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.setRowHeight(45);
        this.jTable1.setShowGrid(true);
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                caisserecapj.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
              caisserecapj.this.caMouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                caisserecapj.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 110, 990, 420);
        
        
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/Capture.PNG")));
        this.jButton1.setText("Récapitulation du jour");
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(250, 50, 230, 35);
      
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisserecapj.this.jButton1ActionPerformed(evt);
            }
        });
        
        
        
        this.jButton2.setFont(new Font("Tahoma", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/print-icon.png")));
        this.jButton2.setText("Imprimer");
        this.jButton2.hide();
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(490,50, 170, 35);
        
          this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisserecapj.this.jButton2ActionPerformed(evt);
            }
        });
        
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        
        this.jButton3.setText("vider");
        this.jButton3.setToolTipText("Quitter");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisserecapj.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton3.setBounds(670,50, 170, 35);
        this.jPanel1.add(this.jButton3);
        this.jButton3.hide();
          
          
          
          
          
          
          
       this.add(jPanel1);
     }

    private void caMouseClicked(MouseEvent evt) {
    }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        
            Date actuellEee = new Date();
            SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
            String datact = dateFormatft.format(actuellEee);
            System.out.println("la date "+datact);
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N\u00b0 Reçu");
            this.dt1.addColumn("Matricule ");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Libellé");
            this.dt1.addColumn("M.C");
            this.dt1.addColumn("BQ");
            this.dt1.addColumn("Crédit");
            this.dt1.addColumn("Débit");
            this.dt1.addColumn("M.Caisse");
            this.dt1.addColumn("Date");
            this.dt1.addColumn("G.L");
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
                Statement state1 = conn2.createStatement();
                ResultSet result1 = state1.executeQuery("SELECT * FROM caissegenerale WHERE date  ='" +datact+ "'");
                
                 while (result1.next()) {
                    String numre=result1.getString("numrec");
                    String matricule = result1.getString("matricule");
                    String nom = result1.getString("nom");
                    String lib = result1.getString("typepaiement");
                    String mc=result1.getString("moiscomptable");
                    String bq = result1.getString("bq");
                    String cred =result1.getString("credit");
                    String deb =result1.getString("debit");
                    String mt =result1.getString("montantouverture");
                    String dt =result1.getString("date");
                    String gl =result1.getString("grandlivre");
                    Object[] stg = new Object[]{numre,matricule, nom, lib, mc,bq ,cred,deb,mt,dt,gl};
                    this.dt1.addRow(stg);
                    
                } 
                ColumnsAutoSizer.sizeColumnsToFit(this.jTable1); 
                this.jButton2.show();
                this.jButton3.show();
                

            
             }
             catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
            
            
            
            
    }
     private void jButton2ActionPerformed(ActionEvent evt) {
         Date actuellEee = new Date();
         SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
         String datact = dateFormatft.format(actuellEee);
        MessageFormat header = new MessageFormat("Récapitulation espèces du :"+datact);
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            this.jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch (PrinterException e) {
            System.err.format("Erreure d'mpresstion", e.getMessage());
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
 int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment vider ?", "Quitter", 0, 3);
        if (option == 0) {
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("N\u00b0 Reçu");
            this.dt1.addColumn("Matricule ");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Libellé");
            this.dt1.addColumn("M.C");
            this.dt1.addColumn("BQ");
            this.dt1.addColumn("Crédit");
            this.dt1.addColumn("Débit");
            this.dt1.addColumn("M.Caisse");
            this.dt1.addColumn("Date");
            this.dt1.addColumn("G.L");
            this.jTable1.setModel(this.dt1);
            this.jButton2.hide();
            this.jButton3.hide();
            
            
        }
    
    
    }
    
    
}
