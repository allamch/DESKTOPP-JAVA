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
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class paiementespece extends JPanel {
    public ImageIcon Format = null;
    private DefaultTableModel dt1;
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
    
    public paiementespece() {
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
        this.setLayout(null);
        this.setSize( 1024, 768);
        montanttotale=0.0;
        this.mec.setFont(new Font("Times New Roman", 1, 14));
        this.mec.setForeground(new Color(0, 0, 153));
        this.mec.setText("        Taper Mecano");
        this.mec.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                
                paiementespece.this.mecMouseClicked(evt);
            }
        });
        this.mec.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                paiementespece.this.mecActionPerformed(evt);
            }
        });
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                paiementespece.this.mecKeyReleased(evt);
            }
        });
        
        this.add(this.mec);
        this.mec.setBounds(0,40, 180, 30);   
        this.jLabel10.setIcon(new ImageIcon(this.getClass().getResource("/image/adh/rechercheadh.gif")));
        this.add(this.jLabel10);
        this.jLabel10.setBounds(180, 10, 90, 90);
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
                paiementespece.this.jScrollPane1MouseClicked(evt);
            }
          });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{ null, null, null,null,null,null,null}, { null, null, null,null,null,null,null}, { null, null, null,null,null,null,null}, { null, null, null,null,null,null,null}, { null, null, null,null,null,null,null}}, new String[]{"Mecano", "Nom", "Matricule f", "N\u00b0 B.C ","Montant","D.Paiement","M.A.Payer","BQ"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                paiementespece.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                paiementespece.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
               paiementespece.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        jTable1.setRowHeight(1, 50);
        this.jScrollPane1.setViewportView(this.jTable1);
        this.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(0, 275, 650, 230);
     //  jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        
   
        
        
        this.jLabel39.setBounds(0, 100, 66, 17);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel39.setForeground(new Color(0, 0, 255));
        this.jLabel39.setText("Mecano :");
        this.add(this.jLabel39);
        
        this.jLabel47.setBounds(0, 130, 200, 17);
        this.jLabel47.setBackground(new Color(153, 153, 255));
        this.jLabel47.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel47.setForeground(new Color(0, 0, 255));
        this.jLabel47.setText("N\u00b0BC :");
        this.add(this.jLabel47);
        
        this.jLabel34.setBackground(new Color(153, 153, 255));
        this.jLabel34.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel34.setForeground(new Color(0, 0, 255));
        this.jLabel34.setText("Nom et Prénom:");
        this.add(this.jLabel34);
        this.jLabel34.setBounds(0, 160, 300, 17);
        
        
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel40.setForeground(new Color(0, 0, 255));
        this.jLabel40.setText("Matricule Fourn :");
        this.add(this.jLabel40);
        this.jLabel40.setBounds(0,190, 500, 17);
        
        this.jLabel19.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel19.setBackground(new Color(153, 153, 255));
        this.jLabel19.setForeground(new Color(0, 0, 255));
        this.jLabel19.setText("Nom Soc :");
        this.add(this.jLabel19);
        this.jLabel19.setBounds(0, 220, 500, 17);
        
        this.jLabel35.setBackground(new Color(153, 153, 255));
        this.jLabel35.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel35.setForeground(new Color(0, 0, 255));
        this.jLabel35.setText("Montant :");
        this.add(this.jLabel35);
        this.jLabel35.setBounds(0,250, 300, 17);
       
        
        this.jLabel36.setText("Date Paiement :");
        this.add(this.jLabel36);
        this.jLabel36.setBounds(400, 100,500, 17);
        this.jLabel36.setFont(new Font("Times New Roman", 1, 14)); 
        this.jLabel36.setForeground(new Color(0, 0, 255));
        this.jLabel36.setBackground(new Color(153, 153, 255));
        
        this.jLabel33.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel33.setForeground(new Color(0, 0, 255));
        this.jLabel33.setBackground(new Color(153, 153, 255));
        this.jLabel33.setText("Tranche :");
        this.add(this.jLabel33);
        this.jLabel33.setBounds(400, 130,500, 17);
        
        this.jLabel1.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel1.setForeground(new Color(0, 0, 255));
        this.jLabel1.setBackground(new Color(153, 153, 255));
        this.jLabel1.setText("Reste à payer :");
        this.add(this.jLabel1);
        this.jLabel1.setBounds(400, 160,500, 17);
        
        
        
        this.reg.setFont(new Font("Times New Roman", 1, 14));
        this.reg.setForeground(new Color(0, 0, 255));
        this.reg.setBackground(new Color(153, 153, 255));
        this.reg.setText("Régisseur :");
        this.add(this.reg);
        this.reg.setBounds(400, 190,500, 17);   
        
        
        this.mecano2.setFont(new Font("Times New Roman", 1, 14));
        this.mecano2.setText("............................");
        this.add(this.mecano2);
        this.mecano2.setBounds(140, 95, 200, 30);
        
      
        this.nbc.setFont(new Font("Times New Roman", 1, 14));
        this.nbc.setText("............................");
        this.add(this.nbc);
        this.nbc.setBounds(140, 125, 230, 30);
        
        this.nomadh.setFont(new Font("Times New Roman", 1, 14));
        this.nomadh.setText("............................");
        this.add(this.nomadh);
        this.nomadh.setBounds(140, 155, 200, 30);
        
        
        this.matf.setFont(new Font("Times New Roman", 1, 14));
        this.matf.setText("............................");
        this.add(this.matf);
        this.matf.setBounds(140, 185, 200, 30);
        
        
        this.nomsoc.setFont(new Font("Times New Roman", 1, 14));
        this.nomsoc.setText("............................");
        this.add(this.nomsoc);
        this.nomsoc.setBounds(140, 215, 200, 30);
        
        this.montant.setFont(new Font("Times New Roman", 1, 14));
        this.montant.setText("............................");
        this.add(this.montant);
        this.montant.setBounds(140, 245,  200, 30);
        
        this.datepaiement.setBounds(520, 92, 200, 30);
        this.datepaiement.setFont(new Font("Times New Roman", 1, 14));
        this.datepaiement.setText("............................");
        this.add(this.datepaiement);
        
        this.montapayer.setFont(new Font("Times New Roman", 1, 14));
        this.montapayer.setText("............................");
        this.add(this.montapayer);
        this.montapayer.setBounds(520, 122, 130, 30);
        
        this.reste.setFont(new Font("Times New Roman", 1, 14));
        this.reste.setText("............................");
        this.add(this.reste);
        this.reste.setBounds(520, 152, 130, 30);
        
        
        
        this.codbq.setFont(new Font("Times New Roman", 1, 14));
        this.codbq.setText("............................");
        this.add(this.codbq);
        this.codbq.hide();
        this.codbq.setBounds(520, 202, 130, 30);
        
        
        
        this.treg.setFont(new Font("Times New Roman", 1, 14));
        this.add(this.treg);
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
                paiementespece.this.jButton2ActionPerformed(evt);
            }
        });
        
        
        this.add(this.jButton2);
        this.jButton1.setFont(new Font("Times New Roman", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/viderrrrrrrrrrrrrrrrjjj.png")));
        this.jButton1.setText("vider");
        this.jButton1.setToolTipText("Quitter");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                paiementespece.this.jButton1ActionPerformed(evt);
            }
        });
         this.jButton1.setBounds(340,230, 100, 30);
        this.add(this.jButton1);
        
        
        
        
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
        this.nbc.setText(this.jTable1.getModel().getValueAt(lign, 3).toString());
        this.matf.setText(this.jTable1.getModel().getValueAt(lign, 2).toString());
        this.montant.setText(this.jTable1.getModel().getValueAt(lign, 4).toString());
        this.datepaiement.setText(this.jTable1.getModel().getValueAt(lign, 5).toString());
        this.montapayer.setText(this.jTable1.getModel().getValueAt(lign, 6).toString()); 
        this.codbq.setText(this.jTable1.getModel().getValueAt(lign, 7).toString());
        String matfiscal;
        matfiscal=this.matf.getText();
        String mont = this.montant.getText().replaceAll("\\,",".");;
       // int mtaf = Integer.parseInt(matfiscal);
        String mmmt = matfiscal;
        System.out.println("matfis = "+ mmmt);
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
             if (matfiscal.equals("Centre Mutuelle"))
         {
            
             this.nomsoc.hide();
             this.jLabel19.hide();
             this.matf.setText("Centre Mutuelle");
             this.jLabel40.setText("Prêt FDD :");
             System.out.println("le nom de la Soc centre Mutuelle");
         }
         else{
         this.treg.enable(true);
         int mtaf = Integer.parseInt(matfiscal);
         ResultSet result4 = state4.executeQuery("SELECT * FROM fournisseur WHERE MATRIC = '" + mtaf + "'" ); 
         //this.nomsoc.setText(".............");
         while (result4.next())
         {
             this.nomsoc.show();
             this.jLabel19.show();
             this.treg.enable(true);
             this.jLabel40.setText("Matricule Fourn :");
             this.nomsoc.setText(result4.getString("NOMSOC"));
             System.out.println("le nom de la Soc "+result4.getString("NOMSOC"));
             }
         }        
            
         ResultSet result1 = state4.executeQuery("SELECT * FROM tranche WHERE matf = '"+mmmt+"'And Mecano='"+this.mec.getText()+"' And etat='"+x+"' And type='"+typebc+"'" ); 
         while(result1.next())
         {
            String mt = result1.getString("montantparmois");
            mtparmt=mtparmt+Double.parseDouble(mt);
            System.out.println("total payé"+ mtparmt);
        
         }
         double mttot = Double.parseDouble(mont);
         
         double r = mttot-mtparmt;
         String a = String.valueOf(r);
         
         a = String.format("%.3f", r);
         this.reste.setText(a);
        
        }
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
           List<Integer> listbc= new ArrayList<Integer>();
          int mec = Integer.parseInt(this.mec.getText());  
          this.mecano2.setText("............................");
          this.nbc.setText("............................");
          this.nomadh.setText("............................");
          this.matf.setText("............................");
          this.montant.setText("............................");
          this.nomsoc.setText("............................");
          this.datepaiement.setText("............................");
          this.montapayer.setText("............................");
          this.reste.setText("............................");
          this.codbq.setText("............................");
            
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("Mecano");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Matricule f");
            this.dt1.addColumn("N\u00b0 B.C");
            this.dt1.addColumn("Montant");
            this.dt1.addColumn("D.Paiement");
            this.dt1.addColumn("M.A.Payer");
            this.dt1.addColumn("BQ");
            this.jTable1.setModel(this.dt1);
            Connection conn2 = null;
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
              
                
              //  ResultSet result6 = state5.executeQuery("SELECT distinct(nbc) FROM tranche WHERE MECANO  ='" + this.mec.getText() + "'  And etat ='"+x+"'  And type='"+typebc+"' "); 
                
             //   while(result6.next())
             //   {
               //     int b = result6.getInt("nbc");
               //     listbc.add(b);
                    
             //   }
             //   int m=0;
               
              //  while (m<listbc.size())
              //  {
               //     int nc=listbc.get(m);
                //    ResultSet result8 = state8.executeQuery("SELECT * FROM bc WHERE MECANO  ='" + this.mec.getText() + "'  And nbc='"+nc+"' And paimenpar='"+typebc+"'");
                 //   while(result8.next())
                //    {
                  //   String mt = result8.getString("montantbc");
                   //   if (mt.length() >= 3) {
                   //         mt = new StringBuilder(mt).insert(mt.length() - 3, ".").toString();
                     ///   }
                   //  System.out.println("mtt"+mt);
                  //   double t= Double.parseDouble(mt);
                    // montanttotale=montanttotale+t;
                    // System.out.println("mtttttt"+montanttotale);
                   // }
                  //  System.out.println(listbc.get(m));
                  //  System.out.println("nc"+nc);
                  //  m++;
               // }
                
                ResultSetMetaData resultMeta3 = result3.getMetaData();
                boolean i = false;
                boolean c = false;
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
                 
                while (result3.next()) {
                    String Mecano = this.mec.getText();
                    String nomadh = result3.getString("Nom");
                    String matf = result3.getString("matf");
                    String nbc = result3.getString("nbc");
                    String montant = result3.getString("montant");
                    String date =result3.getString("datepayement");
                    String montantparmois =result3.getString("montantparmois");
                    String cdbq=result3.getString("codebanque");
                    int nbmois = result3.getInt("nombredemois"); 
                    mtparmois=result3.getString("montantparmois");
                    mtpm=Double.parseDouble(mtparmois);
                    totale=totale+mtpm; 
                    Object[] stg = new Object[]{Mecano,nomadh, matf, nbc, montant,date,montantparmois,cdbq};
                    this.dt1.addRow(stg);
                    k1++;
                } 
                String mtte=String.format("%.3f", montanttotale);
                String tte = String.format("%.3f", totale);
                 System.out.println("Totale = "+tt);
                  if (k1>= 1) {
                tte = String.format("%.3f", totale);
                //tte=tte+" DT";
                //mtte=mtte+" DT";
                Object[] stg = new Object[]{"", "", "","","", "Reste à payer", tte};
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
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("Mecano");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Matricule f");
            this.dt1.addColumn("N\u00b0 B.C");
            this.dt1.addColumn("Montant");
            this.dt1.addColumn("D.Paiement");
            this.dt1.addColumn("M.A.Payer");
            this.dt1.addColumn("BQ");
            this.jTable1.setModel(this.dt1);
          this.mecano2.setText("............................");
          this.nbc.setText("............................");
          this.nomadh.setText("............................");
          this.matf.setText("............................");
          this.montant.setText("............................");
          this.nomsoc.setText("............................");
          this.datepaiement.setText("............................");
          this.montapayer.setText("............................");
          this.reste.setText("............................");
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
        String datpai = this.datepaiement.getText();
        Date actuellEee = new Date();
        SimpleDateFormat dateFormatft = new SimpleDateFormat("dd/MM/yyyy");
        String datddf = dateFormatft.format(actuellEee);
        System.out.println("date = " + datddf);
        String jours1 = datddf.substring(0, datddf.length() - 8);
        System.out.println("jours = " + jours1);
        int j1 = Integer.parseInt(jours1);
        System.out.println("j = " + j1);
        String moisc = datddf.substring(3, datddf.length() - 5);
        String moispai = datpai.substring(3, datpai.length() - 5);
        System.out.println("mmmm"+moispai);
        int moisdepai= Integer.parseInt(moispai);
        System.out.println("mois = " + moisc);
        String ann\u00e9es1="";
           
        System.out.println("ann\u00e9es = " + ann\u00e9es1);
        int moiscourant = Integer.parseInt(moisc);
        System.out.println("le mois comptable "+moiscourant);
        String moiscomp= String.valueOf(moiscourant);
        
        
       
        if (datpai.length()==10){
         ann\u00e9es1 = datddf.substring(6, datddf.length());
        }else
        {
         ann\u00e9es1 = datddf.substring(5, datddf.length());
        } 
        
        
        
        
        
        String ann = datddf.substring(6, datddf.length());
        String annpaiement ="";
        
         System.out.println("la longueur de datddf"+datpai.length());
         if (datpai.length()==10){
         annpaiement = datpai.substring(6, datpai.length());
        }else
        {
        annpaiement = datpai.substring(5, datpai.length());
        } 
      
        
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
                   String matfiscal;
                   matfiscal=this.matf.getText();
                if (matfiscal.equals("Centre Mutuelle"))
                {
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
                                    
                                    int mont1 = Integer.parseInt(this.montapayer.getText().replace(".","")) ;
                                    String mtp1=this.montapayer.getText().replace(".","");
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
            Statement state3 = conn2.createStatement();
            Statement state1 = conn2.createStatement();
            state2.executeUpdate("UPDATE tranche SET etat='" +x+ "' WHERE Mecano='" + this.mecano2.getText() + "'AND nbc='" + this.nbc.getText() + "'AND matf='" + this.matf.getText() + "' AND datepayement='"+this.datepaiement.getText()+"' And type='"+typebc+"'");
            
            ResultSet result1 =state1.executeQuery("Select * from caissegenerale where annee='"+ann+"'  ");
             int nr =0;
             while (result1.next())
             {
                 nr= result1.getInt("numrec");
             }
           
          
            int numrecu = nr+1;
            
            String strnumrec= String.valueOf(numrecu);
            ResultSet result2 =state1.executeQuery("Select * from caissegenerale");
            
            while (result2.next())
            {
                 String mt = result2.getString("montantouverture").replaceAll("\\,",".");
                 listmt.add(mt);
            }
            
       
            String tt = listmt.get(listmt.size()-1);
            double mtt = Double.parseDouble(tt);
            double tr = Double.parseDouble(montapayer.getText());
            System.out.println("total à inserer "+mtt);
            mtt = mtt+tr;
            System.out.println("total à inserer 2 "+mtt);
            System.out.println("num rec "+numrecu);
            String ttf = String.valueOf(mtt);
            String mtte=String.format("%.3f", mtt);
            System.out.println("total à inserer "+mtte);
            String grl="";
            String deb="0";
            state3.executeUpdate("INSERT INTO caissegenerale(montantouverture,date,credit,debit,grandlivre,moiscomptable,nom,numrec,typepaiement,matf,matricule,annee,bq) VALUES('"+mtte+"','"+datddf+"','"+montapayer.getText()+"','"+deb+"','"+grl+"','"+moiscomp+"','"+this.nomadh.getText()+"','"+numrecu+"','"+typpai+"','"+this.matf.getText()+"','"+this.mecano2.getText()+"','"+ann+"','"+this.codbq.getText()+"')");
   
            JOptionPane.showMessageDialog(null, "Paiement Tranche FDD Effectué   ", "Information", 1);
            JavaCallJasperReport pr = new JavaCallJasperReport();
            pr.print1(strnumrec, ann, this.nomadh.getText(), this.mecano2.getText(), montapayer.getText(), typpai, this.treg.getText());
                }
                else {
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Class.forName("com.mysql.jdbc.Driver");                    
            Statement state2 = conn2.createStatement();
            Statement state3 = conn2.createStatement();
            Statement state1 = conn2.createStatement();
            state2.executeUpdate("UPDATE tranche SET etat='" +x+ "' WHERE Mecano='" + this.mecano2.getText() + "'AND nbc='" + this.nbc.getText() + "'AND matf='" + this.matf.getText() + "' AND datepayement='"+this.datepaiement.getText()+"' And type='"+typebc+"'");
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
            double tr = Double.parseDouble(montapayer.getText());
            System.out.println("total à inserer  "+mtt);
            mtt = mtt+tr; 
            System.out.println("montant à payer "+tr);
            System.out.println("num rec "+numrecu);
            String ttf = String.valueOf(mtt);
            String mtte=String.format("%.3f", mtt);
            System.out.println("total à inserer "+mtte);
            String grl="";
            String deb="0";
           
            state3.executeUpdate("INSERT INTO caissegenerale(montantouverture,date,credit,debit,grandlivre,moiscomptable,nom,numrec,typepaiement,matf,matricule,annee,bq) VALUES('"+mtte+"','"+datddf+"','"+montapayer.getText()+"','"+deb+"','"+grl+"','"+moiscomp+"','"+this.nomadh.getText()+"','"+numrecu+"','"+typpai+"','"+this.matf.getText()+"','"+this.mecano2.getText()+"','"+ann+"','"+this.codbq.getText()+"')");
            JOptionPane.showMessageDialog(null, "Paiement Effectué  ", "Information", 1);
            JavaCallJasperReport pr = new JavaCallJasperReport();
            pr.print1(strnumrec, ann, this.nomadh.getText(), this.mecano2.getText(), montapayer.getText(), typpai, this.treg.getText());
           }
          
        }catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
    
            try {
            int mec = Integer.parseInt(this.mec.getText());
            this.dt1 = new DefaultTableModel();
            this.dt1.addColumn("Mecano");
            this.dt1.addColumn("Nom ");
            this.dt1.addColumn("Matricule f");
            this.dt1.addColumn("N\u00b0 B.C");
            this.dt1.addColumn("Montant");
            this.dt1.addColumn("D.Paiement");
            this.dt1.addColumn("M.A.Payer");
            this.dt1.addColumn("BQ");
            this.jTable1.setModel(this.dt1);
            
          this.mecano2.setText("............................");
          this.nbc.setText("............................");
          this.nomadh.setText("............................");
          this.matf.setText("............................");
          this.montant.setText("............................");
          this.nomsoc.setText("............................");
          this.datepaiement.setText("............................");
          this.montapayer.setText("............................");
          this.reste.setText("............................");
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
                boolean i = false;
                boolean c = false;
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
                 
                while (result3.next()) {
                    String Mecano = this.mec.getText();
                    String nomadh = result3.getString("Nom");
                    String matf = result3.getString("matf");
                    String nbc = result3.getString("nbc");
                    String montant = result3.getString("montant").replaceAll("\\,",".");
                    String date =result3.getString("datepayement");
                    String montantparmois =result3.getString("montantparmois").replaceAll("\\,",".");   
                    String codb =result3.getString("codebanque"); 
                    int nbmois = result3.getInt("nombredemois"); 
                    mtparmois=result3.getString("montantparmois");
                    mtpm=Double.parseDouble(mtparmois);
                    totale=totale+mtpm; 
                    Object[] stg = new Object[]{Mecano,nomadh, matf, nbc, montant,date,montantparmois,codb};
                    this.dt1.addRow(stg);
                    k1++;
                } 
                String ttte=String.format("%.3f", montanttotale);
                String tte = String.format("%.3f", totale);
                 System.out.println("Totale = "+tt);
                  if (k1>= 1) {
                tte = String.format("%.3f", totale);
                //tte=tte+" DT";
                //ttte=ttte+" DT";
                Object[] stg = new Object[]{"", "", "","","", "Reste à payer", tte};
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

         

}