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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
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
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class Grandlivre extends JPanel {
    private JButton jButton2;
    private JButton jButton1;
    private JTextField recu;
    private JLabel numre;
    private JLabel matr;
    private JLabel nom;
     private JLabel lib;
     private JLabel mc;  
    private JLabel tmc;  
    private JLabel montant;
    private JLabel montantcaiss;
    private JLabel datrec;
    private JTable jTable1;
    private DefaultTableModel dt1;
    private JScrollPane jScrollPane1;
    private JLabel gl;
    private JLabel tnumre;
    private JLabel tmatr;
    private JLabel tnom;
    private JLabel tlibell;
    private JTextField tgl;
    private JLabel tmontant;
    private JLabel tmontantcaiss;
    private JLabel tdatrec;
     private JPanel jPanel1;
    private JSeparator jSeparator1;
     String ann="";
    public Grandlivre() {
        this.initComponents();
    }
    
    private void initComponents() {
    this.jButton1= new JButton();
    this.recu= new JTextField();
    this.jButton2= new JButton();
    this.numre = new JLabel();
    this.mc= new JLabel();
    this.tmc= new JLabel();
    this.nom= new JLabel();
    this.matr= new JLabel();
    this.datrec= new JLabel();
    this.montant = new JLabel();
    this.montantcaiss=new JLabel();
    this.lib=new JLabel();
    this.gl = new JLabel();
    this.jPanel1= new JPanel();
    this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Mutuelle de la Santé :Grand livre",TitledBorder.CENTER, 0, new Font("Times New Roman", 1, 21),new Color(196, 0, 0)));
    this.jPanel1.setPreferredSize(new Dimension(1005,540));
    this.jPanel1.setLayout(null);     
    this.tnumre = new JLabel();
    this.tnom= new JLabel();
    this.tmatr= new JLabel();
    this.tdatrec= new JLabel();
    this.tmontant = new JLabel();
    this.tmontantcaiss=new JLabel();
    this.tlibell=new JLabel();
    this.jTable1 = new JTable();
    this.tgl = new JTextField();
    this.jScrollPane1 = new JScrollPane();
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Times New Roman", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
         
   Date actuellEee = new Date();
    SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
   String datddf = dateFormatft.format(actuellEee);
    ann = datddf.substring(6, datddf.length());
    this.jSeparator1= new JSeparator(SwingConstants.VERTICAL);
    this.jPanel1.add(this.jSeparator1);
    jSeparator1.setPreferredSize(new Dimension(3,50));
    this.jSeparator1.setBorder(BorderFactory.createEmptyBorder(1, 0, 2, 0));
       
       
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
                 Grandlivre.this.caMouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
              Grandlivre.this.caMouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                Grandlivre.this.caAncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(10, 280, 990, 250);
  
    
        this.recu.setFont(new Font("Times New Roman", 1, 16));
        this.recu.setText("Tapez un N° de Reçu");
        this.recu.setForeground(new Color(196, 0, 0));
        this.jPanel1.add(this.recu);
        this.recu.setBounds(350, 50,180, 35);
     
            this.recu.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                
                Grandlivre.this.mecMouseClicked(evt);
            }
        });
        this.recu.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Grandlivre.this.mecActionPerformed(evt);
            }
        });
        this.recu.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                Grandlivre.this.recuKeyReleased(evt);
            }
        });
        
        
        
        
        
        this.jButton1.setFont(new Font("Times New Roman", 1, 16));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton1.setText("Valider");
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(800, 190,150, 40);
        this.jButton1.setToolTipText("Quitter");
        
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Grandlivre.this.jButton1ActionPerformed(evt);
            }
        });
        
        
        
        
        
        this.jButton2.setFont(new Font("Times New Roman", 1, 16)); 
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton2.setText("vider");
        this.jButton2.setToolTipText("Quitter");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Grandlivre.this.jButton2ActionPerformed(evt);
            }
        });
         this.jPanel1.add(this.jButton2);
         this.jButton2.setBounds(550, 50,120, 35);
        
         
       this.numre.setBackground(new Color(153, 153, 255));
       this.numre.setFont(new Font("Times New Roman", 1, 18));
       this.numre.setForeground(new Color(0, 0, 255));
       this.numre.setText("N°Reçu :");
       this.jPanel1.add(this.numre);
       this.numre.setBounds(50, 100,150, 30);    
         
       this.matr.setBackground(new Color(153, 153, 255));
       this.matr.setFont(new Font("Times New Roman", 1, 18));
       this.matr.setForeground(new Color(0, 0, 255));
       this.matr.setText("Matricule :");
       this.jPanel1.add(this.matr);
       this.matr.setBounds(50, 130,150, 30);    
         
       
       
       this.nom.setBackground(new Color(153, 153, 255));
       this.nom.setFont(new Font("Times New Roman", 1, 18));
       this.nom.setForeground(new Color(0, 0, 255));
       this.nom.setText("Nom :");
       this.jPanel1.add(this.nom);
       this.nom.setBounds(50, 160,200, 30);  
       
       
       this.lib.setBackground(new Color(153, 153, 255));
       this.lib.setFont(new Font("Times New Roman", 1, 18));
       this.lib.setForeground(new Color(0, 0, 255));
       this.lib.setText("A Titre de  :");
       this.jPanel1.add(this.lib);
       this.lib.setBounds(50, 190,150, 30);  
         
       this.mc.setBackground(new Color(153, 153, 255));
       this.mc.setFont(new Font("Times New Roman", 1, 18));
       this.mc.setForeground(new Color(0, 0, 255));
       this.mc.setText("Mois Comptable :");
       this.jPanel1.add(this.mc);
       this.mc.setBounds(50, 220,150, 30); 
       
       this.montant.setBackground(new Color(153, 153, 255));
       this.montant.setFont(new Font("Times New Roman", 1, 18));
       this.montant.setForeground(new Color(0, 0, 255));
       this.montant.setText("Montant :");
       this.jPanel1.add(this.montant);
       this.montant.setBounds(480, 100,150, 30);
       
       
       this.montantcaiss.setBackground(new Color(153, 153, 255));
       this.montantcaiss.setFont(new Font("Times New Roman", 1, 18));
       this.montantcaiss.setForeground(new Color(0, 0, 255));
       this.montantcaiss.setText("Montant Caisse :");
       this.jPanel1.add(this.montantcaiss);
       this.montantcaiss.setBounds(480, 130,150, 30);
       
       this.datrec.setBackground(new Color(153, 153, 255));
       this.datrec.setFont(new Font("Times New Roman", 1, 18));
       this.datrec.setForeground(new Color(0, 0, 255));
       this.datrec.setText("Date :");
       this.jPanel1.add(this.datrec);
       this.datrec.setBounds(480, 160,150, 30);
       
       
       this.gl.setBackground(new Color(153, 153, 255));
       this.gl.setFont(new Font("Times New Roman", 1, 18));
       this.gl.setForeground(new Color(0, 0, 255));
       this.gl.setText("Grand Livre :");
       this.jPanel1.add(this.gl);
       this.gl.setBounds(480, 195,150, 30);
       
       
       
       this.tnumre.setFont(new Font("Times New Roman", 0, 18));
       this.tnumre.setText("........................");
       this.jPanel1.add(this.tnumre);
       this.tnumre.setBounds(200, 100, 180, 30);
       this.tmatr.setFont(new Font("Times New Roman", 0, 18));
       this.tmatr.setText("........................");
       this.jPanel1.add(this.tmatr);
       this.tmatr.setBounds(200, 130, 180, 30);
       
       this.tnom.setFont(new Font("Times New Roman", 0, 18));
       this.tnom.setText("........................");
       this.jPanel1.add(this.tnom);
       this.tnom.setBounds(200, 160, 250, 30);
       
       this.tlibell.setFont(new Font("Times New Roman", 0, 18));
       this.tlibell.setText("........................");
       this.jPanel1.add(this.tlibell);
       this.tlibell.setBounds(200, 190, 250, 30);
       
       this.tmc.setFont(new Font("Times New Roman", 0, 18));
       this.tmc.setText("........................");
       this.jPanel1.add(this.tmc);
       this.tmc.setBounds(200, 220, 180, 30);
       
       
       this.tmontant.setFont(new Font("Times New Roman", 0, 18));
       this.tmontant.setText("........................");
       this.tmontant.setBounds(630, 90, 290, 50);
       this.jPanel1.add(this.tmontant);
       
       
       this.tmontantcaiss.setFont(new Font("Times New Roman", 0, 18));
       this.tmontantcaiss.setText("........................");
       this.tmontantcaiss.setBounds(630, 120, 290, 50);
       this.jPanel1.add(this.tmontantcaiss);
       
       this.tdatrec.setFont(new Font("Times New Roman", 0, 18));
       this.tdatrec.setText("........................");
       this.tdatrec.setBounds(630, 150, 290, 50);
       this.jPanel1.add(this.tdatrec);
       
       
       this.tgl.setFont(new Font("Times New Roman", 0, 18));
       this.tgl.setBounds(630, 190, 170, 40);
       this.jPanel1.add(this.tgl);
       aff();
       this.add(this.jPanel1);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        
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
        this.tnumre.setText("........................");
        this.tmatr.setText("........................");
        this.tnom.setText("........................");
        this.tlibell.setText("........................");
        this.montant.setText("Montant :");
        this.tmontant.setText("........................");
        this.tmc.setText("........................");
        this.tmontantcaiss.setText("........................");
        this.tdatrec.setText("........................");
        this.tgl.setText("");
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        int test=0;
        
                int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment valider ?", "Quitter", 0, 3);
        if (option == 0) {
            int x=1;
            try {
        Connection conn1;
        Statement state1;
        Statement state2;
        Class.forName("com.mysql.jdbc.Driver");
        
        conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
        state1 = conn1.createStatement();
        state2 = conn1.createStatement();
        
        ResultSet result22 = state2.executeQuery("SELECT * FROM caissegenerale  WHERE  annee='"+ann+"'");
                                    System.out.println("444444444");
                                    while (result22.next()) {
                                        String GL = result22.getString("grandlivre");
                                        if (GL.equals(this.tgl.getText()))
                                                {
                                                    test=1;
                                                    }
                                    }
        
        if(test==0)
        {
        int numrecu = Integer.parseInt(this.tnumre.getText());
        state1.executeUpdate("UPDATE caissegenerale SET grandlivre= '" +this.tgl.getText()+"' WHERE numrec="+numrecu+" and annee='"+ann+"'");
        JOptionPane.showMessageDialog(null,"Opération effectuée : ");
        this.tnumre.setText("........................");
        this.tmatr.setText("........................");
        this.tnom.setText("........................");
        this.tlibell.setText("........................");
        this.montant.setText("Montant :");
        this.tmontant.setText("........................");
        this.tmc.setText("........................");
        this.tmontantcaiss.setText("........................");
        this.tdatrec.setText("........................");
        this.tgl.setText("");
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
            if (this.recu.getText().equals("Tapez un N° de Reçu"))
            {
                aff();
            }
            else {
                int numr = Integer.parseInt(this.recu.getText());
                ResultSet result1 = state1.executeQuery("SELECT *  FROM  caissegenerale WHERE numrec=" +numr +" and annee='"+ann+"' ");
                
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
               
                

            
             }
        }
        else {
         JOptionPane.showMessageDialog(null, "Le numéro du grand livre existe " );
        }
            
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
    }
        
    } 
    private void mecMouseClicked(MouseEvent evt) {
        this.recu.setText("");  
    
  
            
    
    }

    private void mecActionPerformed(ActionEvent evt) {
        
        
        
        
    }

    

    private void caMouseClicked(MouseEvent evt) {
        int lign = this.jTable1.getSelectedRow();
        System.out.println(" lign =" + lign);
        String nrecu = this.jTable1.getModel().getValueAt(lign, 0).toString();
        this.tnumre.setText(nrecu);
        this.tmatr.setText(this.jTable1.getModel().getValueAt(lign, 1).toString());
        this.tnom.setText(this.jTable1.getModel().getValueAt(lign, 2).toString());
        this.tlibell.setText(this.jTable1.getModel().getValueAt(lign, 3).toString());
        this.tmc.setText(this.jTable1.getModel().getValueAt(lign, 4).toString());
        this.tmontantcaiss.setText(this.jTable1.getModel().getValueAt(lign, 8).toString()); 
        this.tdatrec.setText(this.jTable1.getModel().getValueAt(lign, 9).toString());
        this.tgl.setText(this.jTable1.getModel().getValueAt(lign,10).toString());        
        String mt1 = this.jTable1.getModel().getValueAt(lign, 6).toString();
        String mt2=this.jTable1.getModel().getValueAt(lign, 7).toString();
                 if (mt1.equals("0"))
                       {
                           this.montant.setText("Montant Débit :");
                           this.tmontant.setText(mt2);
                       }
                       else {
                           this.montant.setText("Montant Crédit :");
                           this.tmontant.setText(mt1);
                       }
        
        
        
        
        Date actuellEee = new Date();
        SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
        String datddf = dateFormatft.format(actuellEee);
         ann = datddf.substring(6, datddf.length());
        String mont = this.montant.getText().replaceAll("\\,",".");;
        System.out.println(" mecano =" + nrecu);
        Connection conn2 = null;
        
                }

    private void caMouseEntered(MouseEvent evt) {
    }

    private void caAncestorAdded(AncestorEvent evt) {
    }

    private void recuKeyReleased(KeyEvent evt) {
       
          this.tnumre.setText("............................");
          this.tdatrec.setText("............................");
          this.tlibell.setText("............................");
          this.tmatr.setText("............................");
          this.tgl.setText("");
          this.tnom.setText("........................");
          this.tmc.setText("............................");
          this.tmontant.setText("............................");
          this.tmontantcaiss.setText("............................");
           
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
                int numrecu=Integer.parseInt(this.recu.getText());
                ResultSet result1 = state1.executeQuery("SELECT *  FROM  caissegenerale WHERE numrec=" +numrecu+" and annee='"+ann+"' ");
                
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
               
                

            
             }
             catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
            
        }
          
         


public void aff(){
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
                ResultSet result1 = state1.executeQuery("SELECT *  FROM  caissegenerale WHERE annee='"+ann+"' ");
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
     
             }
             catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
}
}
