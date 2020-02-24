/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mon_projet_fin_etude;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
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
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author USER
 */
public class debit extends JPanel {
    private JLabel debit ;
    private JLabel mtcaisse;
    private JLabel codeb;
    private JLabel pren;
    private JLabel nm;
    private JLabel ci;
    private JLabel dliv;
    private JLabel lib;
    private JLabel regiss;
    private JLabel decrec;
    private JLabel jLabel;
    private JLabel mt;
    private int test ;
    private JTextField tcodeb;
    private JTextField tpren;
    private JTextField tnm;
    private JTextField tci;
    private JTextField tdliv;
    private JTextArea tlib;
    private JTextField tregiss;
    private JTextField tmnt ;
    private JComboBox comdecrec;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JDateChooser daliv;
    private JPanel jPanel1;
    private String str ="";
    private String nomp="";
    private String mtc="";
    private String centremut="Centre Mutuelle";
     public debit() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.mtcaisse = new JLabel();
        this.jLabel= new JLabel();
        this.debit= new JLabel();    
        this.ci= new JLabel();
        this.codeb= new JLabel();
        this.comdecrec= new JComboBox();
        this.decrec=new JLabel();
        this.dliv=new JLabel();
        this.nm=new JLabel();
        this.pren= new JLabel();
        this.regiss= new JLabel();
        this.mt= new JLabel();
        this.lib= new JLabel();
        this.tci= new JTextField();
        this.tcodeb= new JTextField();
        this.daliv = new JDateChooser();
        this.tdliv= new JTextField();
        this.tnm= new JTextField();
        this.tpren= new JTextField();
        this.tregiss= new JTextField();
        this.tmnt = new JTextField();
        this.tlib= new JTextArea();
        this.comdecrec= new JComboBox();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3= new JButton();
        test=0;
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Mutuelle de la Santé : Débit",TitledBorder.CENTER, 0, new Font("Times New Roman", 1, 21),new Color(196, 0, 0)));
      
        //this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel1.setPreferredSize(new Dimension(860, 350));
        this.jPanel1.setLayout(null);
        
        this.codeb.setBackground(new Color(153, 153, 255));
        this.codeb.setFont(new Font("Times New Roman", 1, 18));
        this.codeb.setForeground(new Color(0, 0, 255));
        this.codeb.setText("Code Banque :");
        this.jPanel1.add(this.codeb);
        this.codeb.setBounds(30, 50,150, 30);
        
       this.nm.setBackground(new Color(153, 153, 255));
       this.nm.setFont(new Font("Times New Roman", 1, 18));
       this.nm.setForeground(new Color(0, 0, 255));
       this.nm.setText("Nom :");
       this.jPanel1.add(this.nm);
       this.nm.setBounds(50, 90,150, 30); 
        
       this.pren.setBackground(new Color(153, 153, 255));
       this.pren.setFont(new Font("Times New Roman", 1, 18));
       this.pren.setForeground(new Color(0, 0, 255));
       this.pren.setText("Prénom :");
       this.jPanel1.add(this.pren);
       this.pren.setBounds(50, 130,150, 30);
       
       
       this.ci.setBackground(new Color(153, 153, 255));
       this.ci.setFont(new Font("Times New Roman", 1, 18));
       this.ci.setForeground(new Color(0, 0, 255));
       this.ci.setText("C.I.N :");
       this.jPanel1.add(this.ci);
       this.ci.setBounds(50, 170,150, 30);
        
        
        
       
       this.dliv.setBackground(new Color(153, 153, 255));
       this.dliv.setFont(new Font("Times New Roman", 1, 18));
       this.dliv.setForeground(new Color(0, 0, 255));
       this.dliv.setText("Livré le :");
       this.jPanel1.add(this.dliv);
       this.dliv.setBounds(50, 210,150, 30);
  
       
       
        
       this.jLabel.setBackground(new Color(153, 153, 255));
       this.jLabel.setFont(new Font("Times New Roman", 1, 20));
       this.jLabel.setForeground(new Color(206,0,0));
       this.jLabel.setText("Montant Caisse :");
       this.jPanel1.add(this.jLabel);
       this.jLabel.setBounds(480,50,150, 30);
       this.jLabel.hide();
       
       this.mtcaisse.setBackground(new Color(153, 153, 255));
       this.mtcaisse.setFont(new Font("Times New Roman", 1, 22));
       this.mtcaisse.setForeground(new Color(206,0,0));
       this.mtcaisse.setText("...................");
       this.jPanel1.add(this.mtcaisse);
       this.mtcaisse.setBounds(640,50,150, 30);
       this.mtcaisse.hide();
       
       
       this.decrec.setBackground(new Color(153, 153, 255));
       this.decrec.setFont(new Font("Times New Roman", 1, 18));
       this.decrec.setForeground(new Color(0, 0, 255));
       this.decrec.setText("Bénéficiaire :");
       this.jPanel1.add(this.decrec);
       this.decrec.setBounds(400, 85,150, 30);
       
       
       this.lib.setBackground(new Color(153, 153, 255));
       this.lib.setFont(new Font("Times New Roman", 1, 18));
       this.lib.setForeground(new Color(0, 0, 255));
       this.lib.setText("Libellé :");
       this.jPanel1.add(this.lib);
       this.lib.setBounds(420, 130,150, 30);
       
       this.mt.setBackground(new Color(153, 153, 255));
       this.mt.setFont(new Font("Times New Roman", 1, 18));
       this.mt.setForeground(new Color(0, 0, 255));
       this.mt.setText("Montant :");
       this.jPanel1.add(this.mt);
       this.mt.setBounds(420, 170,150, 30);
       
       
       this.regiss.setBackground(new Color(153, 153, 255));
       this.regiss.setFont(new Font("Times New Roman", 1, 18));
       this.regiss.setForeground(new Color(0, 0, 255));
       this.regiss.setText("Le Régisseur :");
       this.jPanel1.add(this.regiss);
       this.regiss.setBounds(400, 210,150, 30);
       
       
        this.tcodeb.setFont(new Font("Times New Roman", 0, 16));
        this.jPanel1.add(this.tcodeb);
        this.tcodeb.setBounds(150, 50, 150, 30);
       
          this.tcodeb.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                debit.this.tcodebMouseClicked(evt);
            }
        });
        
        
        
       this.tnm.setFont(new Font("Times New Roman", 0, 16));
       this.jPanel1.add(this.tnm);
       this.tnm.setBounds(150, 90, 180, 30);
       this.tpren.setFont(new Font("Times New Roman", 0, 16));
       this.jPanel1.add(this.tpren);
       this.tpren.setBounds(150, 130, 180, 30);
       
       this.tci.setFont(new Font("Times New Roman", 0, 16));
       this.jPanel1.add(this.tci);
       this.tci.setBounds(150, 170, 180, 30);
       
       this.daliv.setFont(new Font("Times New Roman", 0, 16));
       this.jPanel1.add((Component)this.daliv);
       this.daliv.setBounds(150, 210, 180, 30);
       
       
       this.comdecrec.setFont(new Font("Times New Roman", 1, 16)); 
       this.comdecrec.setModel(new DefaultComboBoxModel<String>(new String[]{"Aucun", "Non Inscrit", "Mutuelle de la santé", "Mutuelle de retraité"}));
       this.comdecrec.setBounds(520, 85, 170, 30);
       this.jPanel1.add(comdecrec);
       
       
       
       
       this.tlib.setFont(new Font("Times New Roman", 0, 16));
       this.tlib.setBounds(520, 120, 290, 50);
       this.jPanel1.add(this.tlib);
       
       
       
        this.tmnt.setFont(new Font("Times New Roman", 0, 16));
        this.tmnt.setBounds(520,170,180, 30);
        this.jPanel1.add(this.tmnt);
        
        
       this.tregiss.setFont(new Font("Times New Roman", 0, 16));
       this.tregiss.setBounds(520,210,180, 30);
       this.jPanel1.add(this.tregiss);
       
        this.tregiss.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                debit.this.tregissMouseClicked(evt);
            }
        });
      
       
       
       
       
            
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton1.setFont(new Font("Times New Roman", 1, 12));
        this.jButton1.setText("vider");
        this.jButton1.setToolTipText("Quitter");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                debit.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton1.setBounds(260,260, 140, 30);
        this.jPanel1.add(this.jButton1);
        
        this.jButton2.setFont(new Font("Times New Roman", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton2.setText("Valider");
        this.jButton2.hide();
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(440, 260, 140, 30);
        this.jButton2.setToolTipText("Quitter");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                debit.this.jButton2ActionPerformed(evt);
            }
        });
        
         
  
        
        
            
            
            
        this.add(jPanel1);
    }
    
    
    
    
    
    
    
    private void jButton1ActionPerformed(ActionEvent evt) {
          this.jLabel.hide();
          this.mtcaisse.hide();
          this.tnm.setText("");
          this.tpren.setText("");
          this.tci.setText("");
          this.tmnt.setText("");
          this.tregiss.setText("");
          this.tlib.setText("");
          this.daliv.setDate(null);
          this.tcodeb.setText("");
          this.comdecrec.setModel(new DefaultComboBoxModel<String>(new String[]{"Aucun", "Non Inscrit", "Mutuelle de la santé", "Mutuelle de retraité"}));
          this.jButton2.hide();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
       
        Date actuellEee = new Date();
        SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
        String datddf = dateFormatft.format(actuellEee);
        System.out.println("date = " + datddf);
        String jours1 = datddf.substring(0, datddf.length() - 8);
        System.out.println("jours = " + jours1);
        int j1 = Integer.parseInt(jours1);
        System.out.println("j = " + j1);
        String moisc = datddf.substring(3, datddf.length() - 5);
        System.out.println("mois = " + moisc);
        String ann\u00e9es1 = datddf.substring(6, datddf.length());
        System.out.println("ann\u00e9es = " + ann\u00e9es1);
        int moiscourant = Integer.parseInt(moisc);
        System.out.println("le mois comptable "+moiscourant);
        String moiscomp= String.valueOf(moiscourant);
        String ann = datddf.substring(6, datddf.length());
       if (test==0)
       {
       JOptionPane.showMessageDialog(null, "Erreur : Veuillez vérifier le montant ");
       this.jButton2.enable(false);
       
       }
       else {
           this.jButton2.enable(true);
        if (this.tcodeb.getText().equals("")&&this.tnm.getText().equals("")&&this.tpren.getText().equals("")&&this.tmnt.getText().equals("")&&this.tlib.getText().equals("")&&this.tregiss.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null, "Veuillez remplir les champs : Champs vides ");
        }
        else {
             int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment valider ?", "Quitter", 0, 3);
        if (option == 0) {
        try {
            
            JOptionPane jop1;
            int mt = Integer.parseInt(this.tmnt.getText());
             str = Integer.toString(mt);
             str = new StringBuilder(str).insert(str.length() - 3, ".").toString();
             System.out.println("str --------****------------" + str);
               double mtc = Double.parseDouble(this.mtcaisse.getText());
             System.out.println("mtc --------****------------" + this.mtcaisse.getText());
             double mtdebit = Double.parseDouble(str);
               String mttdebit=String.format("%.3f", mtdebit);
             System.out.println("mtdebit --------****------------" + mttdebit);
           if (mtc<mtdebit)
            {
            JOptionPane.showMessageDialog(null, "Erreur : Le Montant est supérieur au montant de la caisse ");
           }
           else 
           {
            mtc = mtc-mtdebit;
           
            String mmtc = String.format("%.3f", mtc);
         
            String cred="0";
            String grl ="";
            nomp=this.tnm.getText()+" "+this.tpren.getText();
            System.out.println("le nom "+nomp);
            Date d1 = this.daliv.getDate();
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
            String datcin = "";
             try {
                datcin = f.format(d1);
               }
               catch (Exception e) {
                  jop1 = new JOptionPane();
              }
             
             System.out.println("la date "+datcin);
             System.out.println(" --------111111------------" );
           
          
           
           
             Connection conn3 = null;
            try {
             conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            int x=0;
            try {
           Class.forName("com.mysql.jdbc.Driver");
           Statement state1 = conn3.createStatement();
           Statement state2 = conn3.createStatement();
           Statement state3 = conn3.createStatement();
       
            String value = this.comdecrec.getSelectedItem().toString();
            state1.executeUpdate("INSERT INTO debit(codebq,nom,cin,dateliv,declarere,regisseur,date,montant,montantcaisse) VALUES('"+this.tcodeb.getText()+"','"+nomp+"','"+this.tci.getText()+"','"+datcin+"','"+value+"','"+this.tregiss.getText()+"','"+datddf+"','"+str+"','"+mmtc+"')");
            System.out.println(" --------22222------------" );
            ResultSet result1 = state3.executeQuery("Select * from caissegenerale where annee='"+ann+"'");
             int nr =0;
             while (result1.next())
             {
                 nr= result1.getInt("numrec");
             }
            int numrecu = nr+1;
            String strnumre=String.valueOf(numrecu);
            state2.executeUpdate("INSERT INTO caissegenerale(montantouverture,date,credit,debit,grandlivre,moiscomptable,nom,numrec,typepaiement,matf,matricule,annee,bq) VALUES('"+mmtc+"','"+datddf+"','"+cred+"','"+str+"','"+grl+"','"+moiscomp+"','"+nomp+"','"+numrecu+"','"+this.tlib.getText()+"','"+centremut+"','"+this.tci.getText()+"','"+ann+"','"+this.tcodeb.getText()+"')");
            
            System.out.println(" --------33333333------------" );
            this.mtcaisse.setText(mmtc.replaceAll(",",".")); 
            JOptionPane.showMessageDialog(null, "Operation effectuée  ", "Information", 1);
              JavaCallJasperReport pr = new JavaCallJasperReport();
              pr.print2(strnumre, ann,this.tcodeb.getText(), nomp, this.tci.getText(),datcin,value,str,this.tlib.getText());
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
        
           }
            
            
            
           this.jButton2.hide();
           this.tcodeb.setText("");
           this.tnm.setText("");
           this.tpren.setText("");
           this.tlib.setText("");
           this.tci.setText("");
           this.tregiss.setText("");
           this.tmnt.setText("");
           this.daliv.setDate(null);
           this.comdecrec.setModel(new DefaultComboBoxModel<String>(new String[]{"Aucun", "Non Inscrit", "Mutuelle de la santé", "Mutuelle de retraité"}));
            this.jLabel.hide();
            this.mtcaisse.hide();
                   
        } 
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Erreur d'insertion  ", "Information", 1);
        }
        
        
        }
        }
        }
        
    }

    private void tregissMouseClicked(MouseEvent evt) {
        
        try{
        
        int mt = Integer.parseInt(this.tmnt.getText());
        System.out.println("le montant "+mt);
        if (this.tmnt.getText().length() <= 3) {
                JOptionPane.showMessageDialog(null, "Erreur : il faut ajouter trois 000 pour le montant de Montant ");
                this.jButton2.hide();
            }else 
        {
             
             str = Integer.toString(mt);
             str = new StringBuilder(str).insert(str.length() - 3, ".").toString();
             System.out.println("str --------****------------" + str);
             
        }
       double mtc = Double.parseDouble(this.mtcaisse.getText());
       System.out.println("mtc --------****------------" + this.mtcaisse.getText());
       double mtdebit = Double.parseDouble(str);
       String mttdebit=String.format("%.3f", mtdebit);
        System.out.println("mtdebit --------****------------" + mttdebit);
        if (mtc<mtdebit)
        {
            JOptionPane.showMessageDialog(null, "Erreur : Le Montant est supérieur au montant de la caisse ");
            this.jButton2.hide();
       }
        else {
            test=1;
            this.jButton2.show();
        }
        
        
        }
        catch(Exception ex){
            this.jButton2.hide();
             JOptionPane.showMessageDialog(null, "Erreur : Le champ Montant n'accepte que des chiffres ");
            
        }
        
        
        
        
        
    }

    private void tcodebMouseClicked(MouseEvent evt) {
        Connection conn2 = null;
    String mtc="";
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            int x=0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state3 = conn2.createStatement();
        
         ResultSet result5 = state3.executeQuery("SELECT * FROM caissegenerale");
              
               while (result5.next()) {
                    mtc = result5.getString("montantouverture").replaceAll(",",".");
                 } 
               this.jLabel.show();
               this.mtcaisse.setText(mtc);
               this.mtcaisse.show();
             
            }
            catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
    }

    
}
