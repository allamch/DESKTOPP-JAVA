/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mon_projet_fin_etude;

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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author USER
 */
public class Paiementmultiple extends JPanel {
    private JPanel jPanel1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel19;
    private JLabel jLabel33;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel39;
    private JLabel jLabel40;
    private JLabel jLabel47;
    private JLabel codbq;
    private JLabel reg;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField mec;
    private JTextField treg;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel mecano2;
    private JLabel nomadh;
    private JLabel matf;
    private JLabel nomsoc;
    private JLabel montant;
    private JLabel montapayer;
    private JLabel reste;
    private JLabel jLabel34;
    private JLabel datepaiement;
    private JLabel nbc;
    String typebc ="esp";
    int k=1;
    double montanttotale;
    
    public Paiementmultiple() {
        this.initComponents();
    }

    private void initComponents() {
        this.mec = new JTextField(); 
        this.jButton1= new JButton();    
        this.jLabel10 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jLabel39 = new JLabel();
        this.mecano2 = new JLabel();
        this.matf = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel40 = new JLabel();
        this.nomadh = new JLabel();
        this.datepaiement = new JLabel();
        this.treg = new JTextField();
        this.reg = new JLabel();      
        this.jLabel19 = new JLabel();
        this.montant = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel33 = new JLabel();
        this.montapayer = new JLabel();
        this.nomsoc = new JLabel();
        this.reste= new JLabel();
        this.jLabel47= new JLabel();
        this.jLabel1= new JLabel();
        this.nbc= new JLabel();
        this.codbq= new JLabel();
        this.jLabel34= new JLabel();
        this.jButton2= new JButton();
        this.jButton3 = new JButton();
        this.jPanel1= new JPanel();
        montanttotale=0.0;
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Mutuelle de la Santé :Paiement Multiple",TitledBorder.CENTER, 0, new Font("Times New Roman", 1, 21),new Color(196, 0, 0)));
        this.jPanel1.setPreferredSize(new Dimension(1005,540));
        this.jPanel1.setLayout(null);     
        this.mec.setFont(new Font("Times New Roman", 1, 14));
        this.mec.setForeground(new Color(0, 0, 153));
        this.mec.setText("        Taper Mecano");
        this.mec.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                
                Paiementmultiple.this.mecMouseClicked(evt);
            }
        });
        this.mec.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Paiementmultiple.this.mecActionPerformed(evt);
            }
        });
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                Paiementmultiple.this.mecKeyReleased(evt);
            }
        });
        
        
        
        
        
        
         this.treg.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                
                Paiementmultiple.this.tregMouseClicked(evt);
            }
        });
        this.treg.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Paiementmultiple.this.tregActionPerformed(evt);
            }
        });
        this.treg.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                Paiementmultiple.this.tregKeyReleased(evt);
            }
        });
        
        
        
        
        
           
        this.jPanel1.add(this.mec);
        this.mec.setBounds(200,60, 180, 30);   
        this.jLabel10.setIcon(new ImageIcon(this.getClass().getResource("/image/adh/rechercheadh.gif")));
        this.jPanel1.add(this.jLabel10);
        this.jLabel10.setBounds(400, 30, 90, 90);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jTable1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        this.jTable1.setFont(new Font("Times New Roman", 0, 14));
       //this.jTable1.setMinimumSize(new Dimension(120, 600));
         this.jTable1.setRowHeight(30);
        this.jScrollPane1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {
                Paiementmultiple.this.jScrollPane1MouseClicked(evt);
            }
          });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{ null, null, null,null,null,null,null}, { null, null, null,null,null,null,null}, { null, null, null,null,null,null,null}, { null, null, null,null,null,null,null}, { null, null, null,null,null,null,null}}, new String[]{"Mecano", "Nom", "Matricule f","Nom FR", "N\u00b0 B.C ","Montant","D.Paiement","M.A.Payer","BQ", "valider"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class,Object.class, Boolean.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
               Paiementmultiple.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
               Paiementmultiple.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
               Paiementmultiple.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        jTable1.setRowHeight(1, 50);
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(40, 275, 950, 230);
     //  jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
   
        
        
        this.jLabel39.setBounds(50, 140, 66, 17);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel39.setForeground(new Color(0, 0, 255));
        this.jLabel39.setText("Mecano :");
         this.jPanel1.add(this.jLabel39);
        
        this.jLabel47.setBounds(50, 170, 200, 17);
        this.jLabel47.setBackground(new Color(153, 153, 255));
        this.jLabel47.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel47.setForeground(new Color(0, 0, 255));
        this.jLabel47.setText("BQ :");
        this.jPanel1.add(this.jLabel47);
        
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText("Nom et Prénom:");
        this.jPanel1.add(this.jLabel34);
        this.jLabel34.setBounds(50, 200, 300, 17);
        
        
        this.jLabel33.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel33.setForeground(new Color(0, 0, 255));
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setText("Montant à payer :");
        this.jPanel1.add(this.jLabel33);
        this.jLabel33.setBounds(400, 140,500, 17);
        
        
        this.reg.setFont(new Font("Times New Roman", 1, 14));
        this.reg.setForeground(new Color(0, 0, 255));
        this.reg.setBackground(new Color(153, 153, 255));
        this.reg.setText("Régisseur :");
        this.jPanel1.add(this.reg);
        this.reg.setBounds(400, 190,500, 17);   
        
        
        this.mecano2.setFont(new Font("Times New Roman", 1, 14));
        this.mecano2.setText("............................");
        this.jPanel1.add(this.mecano2);
        this.mecano2.setBounds(170, 135, 200, 30);
        
      
        this.codbq.setFont(new Font("Times New Roman", 1, 14));
        this.codbq.setText("............................");
        this.jPanel1.add(this.codbq);
        this.codbq.setBounds(170, 165, 230, 30);
        
        this.nomadh.setFont(new Font("Times New Roman", 1, 14));
        this.nomadh.setText("............................");
        this.jPanel1.add(this.nomadh);
        this.nomadh.setBounds(170, 195, 200, 30);
        
       
 
        
        this.montapayer.setFont(new Font("Times New Roman", 1, 14));
        this.montapayer.setText("...............................");
        this.jPanel1.add(this.montapayer);
        this.montapayer.setBounds(520, 135, 130, 30);
        
   
        this.treg.setFont(new Font("Times New Roman", 1, 14));
        this.jPanel1.add(this.treg);
        this.treg.setBounds(520, 182, 130, 30);
        this.treg.enable(false);
        
        
        this.jButton2.setFont(new Font("Times New Roman", 1, 12));
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/Actions-dialog-ok-icon.png")));
        this.jButton2.setText("Paiement en espèces");
        this.jButton2.setBounds(440, 230, 200, 30);
        this.jButton2.setToolTipText("Quitter");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Paiementmultiple.this.jButton2ActionPerformed(evt);
            }
        });
        
        
        this.jPanel1.add(this.jButton2);
        this.jButton1.setFont(new Font("Times New Roman", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton1.setText("vider");
        this.jButton1.setToolTipText("Quitter");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Paiementmultiple.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton1.setBounds(340,230, 100, 30);
        this.jPanel1.add(this.jButton1);
        
        
        this.add(this.jPanel1);
        
        
    }

    private void mecActionPerformed(ActionEvent evt) {
    }

    private void jTable1MouseClicked(MouseEvent evt) {
        this.treg.enable(true);
        int lign = this.jTable1.getSelectedRow();
        System.out.println(" lign =" + lign);
        String meco = this.jTable1.getModel().getValueAt(lign, 0).toString();
        this.mecano2.setText(meco);
        this.nomadh.setText(this.jTable1.getModel().getValueAt(lign, 1).toString());
        this.codbq.setText(this.jTable1.getModel().getValueAt(lign, 8).toString());
        
              
       
                
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
            Statement state4 = conn2.createStatement();
            Statement state1 = conn2.createStatement();
            int x=1;
            double mtparmt=0.0;
         this.treg.enable(true); 
        String matfiscal;
        matfiscal=this.jTable1.getModel().getValueAt(lign, 2).toString();
        String mont = this.montant.getText().replaceAll("\\,",".");
        System.out.println("matfis = "+ matfiscal);
         ResultSet result1 = state4.executeQuery("SELECT * FROM tranche WHERE matf = '"+matfiscal+"'And Mecano='"+meco+"' And etat='"+x+"' And type='"+typebc+"'" ); 
         while(result1.next())
         {
            String mt = result1.getString("montantparmois");
            mtparmt=mtparmt+Double.parseDouble(mt);
            System.out.println("totalpayé"+ mtparmt);
        
         }
               
       }  //double mttot = Double.parseDouble(mont);
               
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
         // this.montant1=0;
          List<Integer> listbc= new ArrayList<Integer>();
          int mec = Integer.parseInt(this.mec.getText());  
          this.mecano2.setText("............................");
          this.codbq.setText("............................");
          this.nomadh.setText("............................");
          this.montapayer.setText("............................");
          DefaultTableModel dt1 = (DefaultTableModel)this.jTable1.getModel(); 
           while (dt1.getRowCount() > 0) {
            for (int i = 0; i < dt1.getRowCount(); ++i) {
                dt1.removeRow(i);
            }
        }
           
          
           
           
            Connection conn2 = null;
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
            int x=0;
            boolean b = false;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state3 = conn2.createStatement();
                Statement state4 = conn2.createStatement();
                Statement state5 = conn2.createStatement();
                Statement state8 = conn2.createStatement();
                Statement state9 = conn2.createStatement();
                ResultSet result5 = state3.executeQuery("SELECT * FROM tranche WHERE MECANO  ='" + this.mec.getText() + "'  And etat ='"+x+"' And type='"+typebc+"'");
                int nbcommande=0;
                String matfis ="";
               while (result5.next()) {
                    int nb =result5.getInt("nbc"); 
                    String mt =result5.getString("matf"); 
                     nbcommande=nb;
                     matfis=mt;
                     System.out.println("nbcommande"+nbcommande);
                      
                 }
                ResultSet result3 = state3.executeQuery("SELECT * FROM tranche WHERE MECANO = '" + this.mec.getText() + "'  And etat ='"+x+"' and type='"+typebc+"'");
                
                ResultSet result4 = state4.executeQuery("SELECT * FROM tranche WHERE MECANO  ='" + this.mec.getText() + "'  And etat ='"+x+"' And nbc='"+ nbcommande+"'And matf='"+ matfis+"' And type='"+typebc+"'");
               
                  montanttotale=0.0;
              
                
        
                
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                double totale =0;
                double tt = 0;
                String mtparmois="";
                double mtpm=0;
                int k1 = 0;
                while (result4.next()) {
                      mtparmois=result4.getString("montantparmois");
                      System.out.println("montantpar mois ="+mtparmois);
                      mtpm=Double.parseDouble(mtparmois);
                      tt=tt+mtpm; 
                      System.out.println("tot à payer"+tt);
                 }
                  String NomFr="";
                while (result3.next()) {
                    String Mecano = this.mec.getText();
                    String nomadh = result3.getString("Nom");
                    String matf = result3.getString("matf");
                    if (matf.equals("Centre Mutuelle"))
                    {
                      NomFr= result3.getString("matf"); 
                    }
                    else {
                    int matfisc= Integer.parseInt(matf);
                    
                    ResultSet result8 = state5.executeQuery("SELECT * FROM fournisseur WHERE MATRIC = '" + matfisc + "'" ); 
                    while(result8.next())
                    {
                     NomFr = result8.getString("NOMSOC");
                    }
                    
                    }
                    String nbc = result3.getString("nbc");
                    String montant = result3.getString("montant");
                    String date =result3.getString("datepayement");
                    String montantparmois =result3.getString("montantparmois");
                    String cdbq=result3.getString("codebanque");
                    int nbmois = result3.getInt("nombredemois"); 
                    mtparmois=result3.getString("montantparmois");
                    mtpm=Double.parseDouble(mtparmois);
                    totale=totale+mtpm; 
                    Object[] stg = new Object[]{Mecano,nomadh, matf,NomFr, nbc, montant,date,montantparmois,cdbq,b};
                    dt1.addRow(stg);
                    k1++;
                } 
                String mtte=String.format("%.3f", montanttotale);
                String tte = String.format("%.3f", totale);
                 System.out.println("Totale = "+tt);
                  if (k1>= 1) {
                tte = String.format("%.3f", totale);
                //tte=tte+" DT";
                //mtte=mtte+" DT";
                Object[] stg = new Object[]{"", "", "","","","" ,"Reste à payer =>", tte,""};
                dt1.addRow(stg);
                   }
                  ColumnsAutoSizer.sizeColumnsToFit(this.jTable1); 
                 
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
       
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
       JOptionPane jop = new JOptionPane();
        
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment vider l'ecran?", "Quitter", 0, 3);
        if (option == 0) {
     
         DefaultTableModel dt1 = (DefaultTableModel)this.jTable1.getModel();
          while (dt1.getRowCount() > 0) {
            for (int i = 0; i < dt1.getRowCount(); ++i) {
                dt1.removeRow(i);
            }}
         // this.montant1=0;
          this.mecano2.setText("............................");
          this.nomadh.setText("............................");
          this.montapayer.setText("............................");
          this.codbq.setText("............................");
          this.treg.setText("");
          this.treg.enable(false);
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        
        Connection conn2=null;
        List<String> listmt = new ArrayList<>();
        List<Integer> listrec = new ArrayList<>();
        JOptionPane jop = new JOptionPane();
        Date actuellEee = new Date();
        SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
        String datddf = dateFormatft.format(actuellEee);
        System.out.println("date = " + datddf);
        String jours1 = datddf.substring(0, datddf.length() - 8);
        System.out.println("jours = " + jours1);
        int j1 = Integer.parseInt(jours1);
        System.out.println("j = " + j1);
        String moisc = datddf.substring(3, datddf.length() - 5);
        int moisdepai= Integer.parseInt(moisc);
        System.out.println("mois = " + moisc);
        String ann\u00e9es1="";
           
        System.out.println("ann\u00e9es = " + ann\u00e9es1);
        int moiscourant = Integer.parseInt(moisc);
        System.out.println("le mois comptable "+moiscourant);
        String moiscomp= String.valueOf(moiscourant);
        
        
       
        if (datddf.length()==10){
         ann\u00e9es1 = datddf.substring(6, datddf.length());
        }else
        {
         ann\u00e9es1 = datddf.substring(5, datddf.length());
        } 
        
        
        
        
        
        String ann = datddf.substring(6, datddf.length());
        String annpaiement ="";
        System.out.println("l'année "+annpaiement);
        
        String typpai = "";
        
         switch (moisdepai) {
                    case 1: {
                        typpai ="Pay Mois Janvier " + annpaiement;
                        break;
                    }
                    case 2: {
                        typpai ="Pay Mois F\u00e9vrier " + annpaiement;
                        break;
                    }
                    case 3: {
                        typpai ="Pay Mois Mars " + annpaiement;
                        break;
                    }
                    case 4: {
                        typpai ="Pay Mois Avril " + annpaiement;
                        break;
                    }
                    case 5: {
                        typpai ="Pay Mois Mai " + annpaiement;
                        break;
                    }
                    case 6: {
                        typpai ="Pay Mois Juin " + annpaiement;
                        break;
                    }
                    case 7: {
                       typpai ="Pay Mois Juillet " + annpaiement;
                        break;
                    }
                    case 8: {
                        typpai ="Pay Mois Ao\u00fbt " + annpaiement;
                        break;
                    }
                    case 9: {
                        typpai ="Pay Mois Septembre " + annpaiement;
                        break;
                    }
                    case 10: {
                        typpai ="Pay Mois Octobre " + annpaiement;
                        break;
                    }
                    case 11: {
                        typpai ="Pay Mois Novembre " + annpaiement;
                        break;
                    }
                    case 12: {
                       typpai ="Pay Mois D\u00e9cembre " + annpaiement;
                        break;
                    }
                    default: {
                       typpai="";
                    }
                }
        
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment valider le paiement?", "Quitter", 0, 3);
        if (option == 0) {
            int x=1;
             
            try {
                
                 double montant1=0;
              
                for (int i = 0; i < this.jTable1.getRowCount(); ++i) {
                String pp;
            
                String numkch = this.jTable1.getModel().getValueAt(i, 3).toString();
                System.out.println(numkch);
                String jt = "";
                try {
                    jt = this.jTable1.getModel().getValueAt(i,9).toString();
                    System.out.println("t[" + i + ",9] ==> " + jt);
                }
                catch (Exception e) {
                    // empty catch block
                }
                if (jt.equals("true"))
                {
                String montant = this.jTable1.getModel().getValueAt(i,7).toString();
                System.out.println(montant);
                Double mt1 = Double.parseDouble(montant);
                System.out.println("mt1 : " + mt1);
                montant1 = montant1 + mt1 ;
                String mttt=String.valueOf(montant1);
                 mttt = String.format("%.3f", montant1);
                System.out.println("montant calculé : " + montant1);
                String matf =this.jTable1.getModel().getValueAt(i, 2).toString();
                if (matf.equals("Centre Mutuelle")){
                    String nbc = this.jTable1.getModel().getValueAt(i, 4).toString();
                    String datpai = this.jTable1.getModel().getValueAt(i, 6).toString();
                   System.out.println("11111");
                   
                                if (this.k == 1) {
                                System.out.println("22222222");
                                Connection conn22;
                                conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                
                                Statement state24;
                                int total = 0;
                                try {
                                    System.out.println("333333333");
                                    Statement  state8 = conn22.createStatement();
                                    ResultSet result22 = state8.executeQuery("SELECT * FROM caissefdd  WHERE n='1'");
                                    System.out.println("444444444");
                                    while (result22.next()) {
                                        String ttt = result22.getString("total");
                                        total = Integer.parseInt(ttt);
                                    }
                                    
                                     System.out.println("555555555");
                                    
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane jop34 = new JOptionPane();
                                    JOptionPane.showMessageDialog(null, "erreur montant comptecourant 66666666666666666666" + e.getMessage());
                                }  
                                 try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state24 = conn22.createStatement();
                                    String p5 = "0";
                                    state24.executeUpdate("UPDATE  caissefdd SET n='0' ");
                                    this.k = 1;
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    JOptionPane.showMessageDialog(null, "erreur de modification caisse fdd : " + e.getMessage());
                                }
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn22 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                                    state24 = conn22.createStatement();
                                    this.k = 1;
                                    String montapayer = this.jTable1.getModel().getValueAt(i, 7).toString();
                                   
                                    String mtp1=montapayer.replace(".","");
                                     int mont1 = Integer.parseInt(mtp1) ;
                                    System.out.println("montant credit"+mont1);
                                    String mmm1 = "" + (total += mont1) + "";
                                    System.out.println("tttttttt"+mmm1);
                                    state24.executeUpdate("INSERT INTO caissefdd(date,mecano,debit,credit,total,n) VALUES('" + datddf + "','" + this.mecano2.getText() + "','0','"+mtp1+"','" + mmm1 + "','1')");
                                }
                                catch (Exception e) {
                                    this.k = 0;
                                    
                                    JOptionPane.showMessageDialog(null, "erreur d'ajout a l'etat de caisse fdd : " + e.getMessage());
                                }
                                }
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Class.forName("com.mysql.jdbc.Driver");                    
            Statement state2 = conn2.createStatement();
            
      
            state2.executeUpdate("UPDATE tranche SET etat='" +x+ "' WHERE Mecano='" + this.mecano2.getText() + "'AND nbc='" + nbc+ "'AND matf='" + matf + "' AND datepayement='"+datpai+"' And type='"+typebc+"'");
            
         
                
                }
                else {
                    String nbc = this.jTable1.getModel().getValueAt(i, 4).toString();
                    String datpai = this.jTable1.getModel().getValueAt(i, 6).toString();
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Class.forName("com.mysql.jdbc.Driver");                    
            Statement state2 = conn2.createStatement();
            state2.executeUpdate("UPDATE tranche SET etat='" +x+ "' WHERE Mecano='" + this.mecano2.getText() + "'AND nbc='" + nbc + "'AND matf='" + matf + "' AND datepayement='"+datpai+"' And type='"+typebc+"'");   
                    
                }
                } 
                }
                
             
            Statement state1 = conn2.createStatement();
            Statement state3 = conn2.createStatement();
            ResultSet result1 =state1.executeQuery("Select * from caissegenerale where annee='"+ann+"'  ");
             int nr =0;
             
             while (result1.next())
             {
                 nr= result1.getInt("numrec");
             }
           
          
             int numrecu = nr+1;
           String strnumrec =String.valueOf(numrecu);
           
           ResultSet result2 =state1.executeQuery("Select * from caissegenerale");
            
            while (result2.next())
            {
                 String mt = result2.getString("montantouverture").replaceAll("\\,",".");
                 listmt.add(mt);
            }
            
      
            String tt = listmt.get(listmt.size()-1);
            double mtt = Double.parseDouble(tt);
            System.out.println("total à inserer  "+mtt);
            mtt = mtt+montant1; 
            System.out.println("montant à payer "+montant1);
            System.out.println("num rec "+numrecu);
            String ttf = String.valueOf(mtt);
            String mtte=String.format("%.3f", mtt);
            System.out.println("total à inserer "+mtte);
            String grl="";
            String deb="0";
           
            String mtpay= String.valueOf(montant1);
            mtpay=String.format("%.3f", montant1);
            
            String matfis="Paiement Multiple";
            state3.executeUpdate("INSERT INTO caissegenerale(montantouverture,date,credit,debit,grandlivre,moiscomptable,nom,numrec,typepaiement,matf,matricule,annee,bq) VALUES('"+mtte+"','"+datddf+"','"+montapayer.getText()+"','"+deb+"','"+grl+"','"+moiscomp+"','"+this.nomadh.getText()+"','"+numrecu+"','"+typpai+"','"+matfis+"','"+this.mecano2.getText()+"','"+ann+"','"+this.codbq.getText()+"')");
            JOptionPane.showMessageDialog(null, "Paiement Effectué  ", "Information", 1);
            JavaCallJasperReport pr = new JavaCallJasperReport();
            pr.print1(strnumrec, ann, this.nomadh.getText(), this.mecano2.getText(), mtpay, typpai, this.treg.getText());
           } catch (SQLException ex) {
                Logger.getLogger(Paiementmultiple.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Paiementmultiple.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(Paiementmultiple.class.getName()).log(Level.SEVERE, null, ex);
            }
          
       
            try {
            int mec = Integer.parseInt(this.mec.getText());
         DefaultTableModel dt1 = (DefaultTableModel)this.jTable1.getModel();
            while (dt1.getRowCount() > 0) {
            for (int i = 0; i < dt1.getRowCount(); ++i) {
                dt1.removeRow(i);
            }}
          this.mecano2.setText("............................");
          this.nomadh.setText("............................");
          this.montapayer.setText("............................"); 
          this.codbq.setText("............................");
          this.treg.setText("");
          this.treg.enable(false);
            
            try {
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            }
            catch (SQLException ex) {
                Logger.getLogger(recherchecarnedecheque.class.getName()).log(Level.SEVERE, null, ex);
            }
             x=0;
             boolean b = false;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state3 = conn2.createStatement();
                Statement state4 = conn2.createStatement();
                Statement state5 = conn2.createStatement();
                Statement state8 = conn2.createStatement();
                Statement state9 = conn2.createStatement();
                ResultSet result5 = state3.executeQuery("SELECT * FROM tranche WHERE MECANO  ='" + this.mec.getText() + "'  And etat ='"+x+"' AND type='"+typebc+"'");
                int nbcommande=0;
                String matfis ="";
               while (result5.next()) {
                    int nb =result5.getInt("nbc"); 
                    String mt =result5.getString("matf"); 
                     nbcommande=nb;
                     matfis=mt;
                     System.out.println("nbcommande"+nbcommande);
                      
                 }
              
                ResultSet result3 = state3.executeQuery("SELECT * FROM tranche WHERE MECANO = '" + this.mec.getText() + "'  And etat ='"+x+"' And type='"+typebc+"'");
                
                ResultSet result4 = state4.executeQuery("SELECT * FROM tranche WHERE MECANO  ='" + this.mec.getText() + "'  And etat ='"+x+"' And nbc='"+ nbcommande+"'And matf='"+ matfis+"' And type='"+typebc+"'");
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                List<Integer> listbc= new ArrayList<Integer>();
                double totale =0;
                double tt = 0;
                String mtparmois="";
                double mtpm=0;
                int k1 = 0;   
                while (result4.next()) {
                      mtparmois=result4.getString("montantparmois");
                      System.out.println("montantpar mois ="+mtparmois);
                      mtpm=Double.parseDouble(mtparmois);
                      tt=tt+mtpm; 
                      System.out.println("tot à payer"+tt);
                 }
                 
            String NomFr="";
                while (result3.next()) {
                    String Mecano = this.mec.getText();
                    String nomadh = result3.getString("Nom");
                    String matf = result3.getString("matf");
                    if (matf.equals("Centre Mutuelle"))
                    {
                      NomFr= result3.getString("matf"); 
                    }
                    else {
                    int matfisc= Integer.parseInt(matf);
                    
                    ResultSet result8 = state5.executeQuery("SELECT * FROM fournisseur WHERE MATRIC = '" + matfisc + "'" ); 
                    while(result8.next())
                    {
                     NomFr = result8.getString("NOMSOC");
                    }
                    
                    }
                    String nbc = result3.getString("nbc");
                    String montant = result3.getString("montant");
                    String date =result3.getString("datepayement");
                    String montantparmois =result3.getString("montantparmois");
                    String cdbq=result3.getString("codebanque");
                    int nbmois = result3.getInt("nombredemois"); 
                    mtparmois=result3.getString("montantparmois");
                    mtpm=Double.parseDouble(mtparmois);
                    totale=totale+mtpm; 
                    Object[] stg = new Object[]{Mecano,nomadh, matf,NomFr, nbc, montant,date,montantparmois,cdbq,b};
                    dt1.addRow(stg);
                    k1++;
                }  
                String ttte=String.format("%.3f", montanttotale);
                String tte = String.format("%.3f", totale);
                 System.out.println("Totale = "+tt);
                  if (k1>= 1) {
                tte = String.format("%.3f", totale);
                //tte=tte+" DT";
                //ttte=ttte+" DT";
                Object[] stg = new Object[]{"", "", "","","","", "Reste à payer =>", tte,""};
                dt1.addRow(stg);
                   }
                  ColumnsAutoSizer.sizeColumnsToFit(this.jTable1); 
                 
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
    }

   

    private void tregKeyReleased(KeyEvent evt) {
    }

    private void tregActionPerformed(ActionEvent evt) {
    }

    private void tregMouseClicked(MouseEvent evt) {
              int allselected=0;
              double montant1=0;
              
                for (int i = 0; i < this.jTable1.getRowCount(); ++i) {
                String pp;
                Connection conn2;
                Statement state2;
                String numkch = this.jTable1.getModel().getValueAt(i, 3).toString();
                System.out.println(numkch);
                String jt = "";
                try {
                    jt = this.jTable1.getModel().getValueAt(i,9).toString();
                    System.out.println("t[" + i + ",9] ==> " + jt);
                }
                catch (Exception e) {
                    // empty catch block
                }
                if (!jt.equals("true")) continue;
                allselected=allselected+1;
                String montant = this.jTable1.getModel().getValueAt(i,7).toString();
                System.out.println(montant);
                Double mt1 = Double.parseDouble(montant);
                System.out.println("mt1 : " + mt1);
                montant1 = montant1 + mt1 ;
                String mttt=String.valueOf(montant1);
                 mttt = String.format("%.3f", montant1);
                System.out.println("montant calculé : " + montant1);
               this.montapayer.setText(mttt);    }
        
    }
}