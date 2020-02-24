/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mon_projet_fin_etude;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author USER
 */
public class rechercherecugrl  extends JPanel{
    private JButton jButton2;
    private JButton jButton1;
    private JTextField jTextField1;
    private JLabel numre;
    private JLabel matr;
    private JLabel nom;
     private JLabel lib;
     private JLabel mc;  
      private JLabel tmc;  
    private JComboBox jComboBox1;
    private JLabel montant;
    private JLabel montantcaiss;
    private JLabel datrec;
    private JLabel gl;
    private JLabel tnumre;
    private JLabel tmatr;
    private JLabel tnom;
    private JLabel tlibell;
    private JLabel tgl;
    private JLabel tmontant;
    private JLabel tmontantcaiss;
    private JLabel tdatrec;
     private JPanel jPanel1;
    private JSeparator jSeparator1;
    public rechercherecugrl() {
        this.initComponents();
    }
    
    private void initComponents() {
    this.jButton1= new JButton();
    this.jTextField1= new JTextField();
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
    this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Mutuelle de la Santé : Recherche par reçu / grand livre",TitledBorder.CENTER, 0, new Font("Times New Roman", 1, 21),new Color(196, 0, 0)));
    this.jPanel1.setPreferredSize(new Dimension(860, 350));
    this.jPanel1.setLayout(null);     
    this.tnumre = new JLabel();
    this.tnom= new JLabel();
    this.tmatr= new JLabel();
    this.tdatrec= new JLabel();
    this.tmontant = new JLabel();
    this.tmontantcaiss=new JLabel();
    this.tlibell=new JLabel();
    this.tgl = new JLabel();
    this.jComboBox1= new JComboBox();
    this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{"N°Reçu", "Grand Livre"}));
    
    
    this.jSeparator1= new JSeparator(SwingConstants.VERTICAL);
    this.jPanel1.add(this.jSeparator1);
    jSeparator1.setPreferredSize(new Dimension(3,50));
    this.jSeparator1.setBorder(BorderFactory.createEmptyBorder(1, 0, 2, 0));
       
       
    
        this.jComboBox1.setBackground(new Color(153, 153, 255));
        this.jComboBox1.setFont(new Font("Times New Roman", 1, 18));
        this.jPanel1.add(this.jComboBox1);
        this.jComboBox1.setBounds(200, 50,150, 35);
    
        this.jTextField1.setFont(new Font("Times New Roman", 1, 18));
        this.jTextField1.setForeground(new Color(196, 0, 0));
        this.jPanel1.add(this.jTextField1);
        this.jTextField1.setBounds(350, 50,150, 35);
     
        this.jButton1.setFont(new Font("Times New Roman", 1, 18));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(500, 50,120, 35);
    
        
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                rechercherecugrl.this.jButton1ActionPerformed(evt);
            }
        });
        
        
        
        
        
        
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton2.setText("vider");
        this.jButton2.hide();
        this.jButton2.setToolTipText("Quitter");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                rechercherecugrl.this.jButton2ActionPerformed(evt);
            }
        });
         this.jPanel1.add(this.jButton2);
         this.jButton2.setBounds(620, 50,120, 35);
        
         
       this.numre.setBackground(new Color(153, 153, 255));
       this.numre.setFont(new Font("Times New Roman", 1, 18));
       this.numre.setForeground(new Color(0, 0, 255));
       this.numre.setText("N°Reçu :");
       this.jPanel1.add(this.numre);
       this.numre.setBounds(50, 120,150, 30);    
         
       this.matr.setBackground(new Color(153, 153, 255));
       this.matr.setFont(new Font("Times New Roman", 1, 18));
       this.matr.setForeground(new Color(0, 0, 255));
       this.matr.setText("Matricule :");
       this.jPanel1.add(this.matr);
       this.matr.setBounds(50, 160,150, 30);    
         
       
       
       this.nom.setBackground(new Color(153, 153, 255));
       this.nom.setFont(new Font("Times New Roman", 1, 18));
       this.nom.setForeground(new Color(0, 0, 255));
       this.nom.setText("Nom :");
       this.jPanel1.add(this.nom);
       this.nom.setBounds(50, 200,200, 30);  
       
       
       this.lib.setBackground(new Color(153, 153, 255));
       this.lib.setFont(new Font("Times New Roman", 1, 18));
       this.lib.setForeground(new Color(0, 0, 255));
       this.lib.setText("A Titre de  :");
       this.jPanel1.add(this.lib);
       this.lib.setBounds(50, 240,150, 30);  
         
       this.mc.setBackground(new Color(153, 153, 255));
       this.mc.setFont(new Font("Times New Roman", 1, 18));
       this.mc.setForeground(new Color(0, 0, 255));
       this.mc.setText("Mois Comptable :");
       this.jPanel1.add(this.mc);
       this.mc.setBounds(50, 280,150, 30); 
       
       this.montant.setBackground(new Color(153, 153, 255));
       this.montant.setFont(new Font("Times New Roman", 1, 18));
       this.montant.setForeground(new Color(0, 0, 255));
       this.montant.setText("Montant :");
       this.jPanel1.add(this.montant);
       this.montant.setBounds(480, 120,150, 30);
       
       
       this.montantcaiss.setBackground(new Color(153, 153, 255));
       this.montantcaiss.setFont(new Font("Times New Roman", 1, 18));
       this.montantcaiss.setForeground(new Color(0, 0, 255));
       this.montantcaiss.setText("Montant Caisse :");
       this.jPanel1.add(this.montantcaiss);
       this.montantcaiss.setBounds(480, 160,150, 30);
       
       this.datrec.setBackground(new Color(153, 153, 255));
       this.datrec.setFont(new Font("Times New Roman", 1, 18));
       this.datrec.setForeground(new Color(0, 0, 255));
       this.datrec.setText("Date :");
       this.jPanel1.add(this.datrec);
       this.datrec.setBounds(480, 200,150, 30);
       
       
       this.gl.setBackground(new Color(153, 153, 255));
       this.gl.setFont(new Font("Times New Roman", 1, 18));
       this.gl.setForeground(new Color(0, 0, 255));
       this.gl.setText("Grand Livre :");
       this.jPanel1.add(this.gl);
       this.gl.setBounds(480, 240,150, 30);
       
       
       
       this.tnumre.setFont(new Font("Times New Roman", 0, 18));
       this.tnumre.setText("........................");
       this.jPanel1.add(this.tnumre);
       this.tnumre.setBounds(200, 120, 180, 30);
       this.tmatr.setFont(new Font("Times New Roman", 0, 18));
       this.tmatr.setText("........................");
       this.jPanel1.add(this.tmatr);
       this.tmatr.setBounds(200, 160, 180, 30);
       
       this.tnom.setFont(new Font("Times New Roman", 0, 18));
       this.tnom.setText("........................");
       this.jPanel1.add(this.tnom);
       this.tnom.setBounds(200, 200, 250, 30);
       
       this.tlibell.setFont(new Font("Times New Roman", 0, 18));
       this.tlibell.setText("........................");
       this.jPanel1.add(this.tlibell);
       this.tlibell.setBounds(200, 240, 250, 30);
       
       this.tmc.setFont(new Font("Times New Roman", 0, 18));
       this.tmc.setText("........................");
       this.jPanel1.add(this.tmc);
       this.tmc.setBounds(200, 280, 180, 30);
       
       
       this.tmontant.setFont(new Font("Times New Roman", 0, 18));
       this.tmontant.setText("........................");
       this.tmontant.setBounds(630, 110, 290, 50);
       this.jPanel1.add(this.tmontant);
       
       
       this.tmontantcaiss.setFont(new Font("Times New Roman", 0, 18));
       this.tmontantcaiss.setText("........................");
       this.tmontantcaiss.setBounds(630, 150, 290, 50);
       this.jPanel1.add(this.tmontantcaiss);
       
       this.tdatrec.setFont(new Font("Times New Roman", 0, 18));
       this.tdatrec.setText("........................");
       this.tdatrec.setBounds(630, 190, 290, 50);
       this.jPanel1.add(this.tdatrec);
       
       
       this.tgl.setFont(new Font("Times New Roman", 0, 18));
       this.tgl.setText("........................");
       this.tgl.setBounds(630, 230, 290, 50);
       this.jPanel1.add(this.tgl);
       
    this.add(this.jPanel1);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.jTextField1.setText("");
        this.tnumre.setText("........................");
        this.tmatr.setText("........................");
        this.tnom.setText("........................");
        this.tlibell.setText("........................");
        this.montant.setText("Montant :");
        this.tmontant.setText("........................");
        this.tmc.setText("........................");
        this.tmontantcaiss.setText("........................");
        this.tdatrec.setText("........................");
        this.tgl.setText("........................");
        this.jButton2.hide();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        
         if (this.jComboBox1.getSelectedItem().equals("N°Reçu")) {
                int num = Integer.parseInt(this.jTextField1.getText());
                 Date actuellEee = new Date();
                  SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
                  String datddf = dateFormatft.format(actuellEee);
                  String ann = datddf.substring(6, datddf.length());
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT *  FROM  caissegenerale WHERE numrec=" + num+" and annee='"+ann+"' ");
                    ResultSetMetaData resultMeta = result.getMetaData();
      
                   List <String> lnom = new ArrayList<>();
                   while (result.next()) {
                   String nom =result.getString("nom");   
                   lnom.add(nom);
                   }
                   
                   if (lnom.isEmpty())
                   {
                        JOptionPane.showMessageDialog(null, "Le numéro de reçu n'existe pas  ", "Information", 1);
                    
                       this.tnumre.setText("........................");
                       this.tmatr.setText("........................");
                       this.tnom.setText("........................");
                       this.tlibell.setText("........................");
                       this.montant.setText("Montant :");
                       this.tmontant.setText("........................");
                       this.tmc.setText("........................");
                       this.tmontantcaiss.setText("........................");
                       this.tdatrec.setText("........................");
                       this.tgl.setText("........................");
                       this.jButton2.hide();
                        
                   }
                   else{
                    ResultSet result2 = state.executeQuery("SELECT *  FROM  caissegenerale WHERE numrec=" + num+" and annee='"+ann+"' ");
                    
                    while (result2.next()) {
                       this.tnom.setText(result2.getString("nom"));
                       this.tdatrec.setText(result2.getString("date"));
                       this.tmontantcaiss.setText(result2.getString("montantouverture"));
                       this.tmatr.setText(result2.getString("matricule"));
                       this.tlibell.setText(result2.getString("typepaiement"));
                       this.tgl.setText(result2.getString("grandlivre"));
                       int numr =result2.getInt("numrec");
                       String nrc=String.valueOf(numr);
                       this.tnumre.setText(nrc);
                       int mcomp = result2.getInt("moiscomptable");
                       String tmcomp=String.valueOf(mcomp);
                       this.tmc.setText(tmcomp);
                       String mt1 = result2.getString("credit");
                       String mt2=result2.getString("debit");
                       if (mt1.equals("0"))
                       {
                           this.montant.setText("Montant Débit :");
                           this.tmontant.setText(mt2);
                       }
                       else {
                           this.montant.setText("Montant Crédit :");
                           this.tmontant.setText(mt1);
                       }
                    
                    }
                     this.jButton2.show();
                   }
                   
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
         }
                else if ( this.jComboBox1.getSelectedItem().equals("Grand Livre")) {
                       
                        
                 Date actuellEee = new Date();
                  SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
                  String datddf = dateFormatft.format(actuellEee);
                  String ann = datddf.substring(6, datddf.length());
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                    Statement state = conn2.createStatement();
                    ResultSet result = state.executeQuery("SELECT *  FROM  caissegenerale WHERE grandlivre='" + this.jTextField1.getText()+"' and annee='"+ann+"' ");
                    ResultSetMetaData resultMeta = result.getMetaData();
                    
                  List <String> lnom = new ArrayList<>();
                   while (result.next()) {
                   String nom =result.getString("nom");   
                   lnom.add(nom);
                   }
                   
                   if (lnom.isEmpty())
                   {
                       JOptionPane.showMessageDialog(null, "Grand Livre n'existe pas  ", "Information", 1);
                       this.tnumre.setText("........................");
                       this.tmatr.setText("........................");
                       this.tnom.setText("........................");
                       this.tlibell.setText("........................");
                       this.montant.setText("Montant :");
                       this.tmontant.setText("........................");
                       this.tmc.setText("........................");
                       this.tmontantcaiss.setText("........................");
                       this.tdatrec.setText("........................");
                       this.tgl.setText("........................");
                       this.jButton2.hide();
                   }
                   else{
                    ResultSet result2 = state.executeQuery("SELECT *  FROM  caissegenerale WHERE grandlivre='" + this.jTextField1.getText()+"' and annee='"+ann+"' ");

                   while (result2.next()) {
                       this.tnom.setText(result2.getString("nom"));
                       this.tdatrec.setText(result2.getString("date"));
                       this.tmontantcaiss.setText(result2.getString("montantouverture"));
                       this.tmatr.setText(result2.getString("matricule"));
                       this.tlibell.setText(result2.getString("typepaiement"));
                       this.tgl.setText(result2.getString("grandlivre"));
                       int numr =result2.getInt("numrec");
                       String nrc=String.valueOf(numr);
                       this.tnumre.setText(nrc);
                       String mt1 = result2.getString("credit");
                       String mt2=result2.getString("debit");
                       int mcomp = result2.getInt("moiscomptable");
                       String tmcomp=String.valueOf(mcomp);
                       this.tmc.setText(tmcomp);
                       if (mt1.equals("0"))
                       {
                           this.montant.setText("Montant Débit :");
                           this.tmontant.setText(mt2);
                       }
                       else {
                           this.montant.setText("Montant Crédit :");
                           this.tmontant.setText(mt1);
                       }
                    
                    }
                     this.jButton2.show(); 
                   }
                    
                    }
                    catch (Exception e) {
                        JOptionPane jop3 = new JOptionPane();
                        JOptionPane.showMessageDialog(null, "erreur 1: " + e.getMessage());
                    }
                        
                
                        
                        }
        
      
      
      
     
    }
    
    
    
}
