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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
public class TestCrud extends JPanel {
     private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
     private JTextField mec;
    public TestCrud()
    {
    }
    private void initcomponent()
    {
     this.jScrollPane1 = new JScrollPane();
     this.jTable1 = new JTable();
     this.jPanel1= new JPanel();
     this.mec = new JTextField(); 
     this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Test",TitledBorder.CENTER, 0, new Font("Times New Roman", 1, 21),new Color(196, 0, 0)));
     this.jPanel1.setPreferredSize(new Dimension(1005,540));
     this.jPanel1.setLayout(null); 
      this.jScrollPane1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {
               TestCrud.this.jScrollPane1MouseClicked(evt);
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
               TestCrud.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
               TestCrud.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
               TestCrud.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        
        this.mec.setFont(new Font("Times New Roman", 1, 14));
        this.mec.setForeground(new Color(0, 0, 153));
        this.mec.setText("        Taper Mecano");
        this.mec.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                
                TestCrud.this.mecMouseClicked(evt);
            }
        });
        this.mec.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
              TestCrud.this.mecActionPerformed(evt);
            }
        });
        this.mec.addKeyListener(new KeyAdapter(){

            @Override
            public void keyReleased(KeyEvent evt) {
                TestCrud.this.mecKeyReleased(evt);
            }
        });
        
        
        jTable1.setRowHeight(1, 50);
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jPanel1.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(40, 275, 950, 230);
     //  jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       this.add(this.jPanel1);
        
    }

    private void jScrollPane1MouseClicked(MouseEvent evt) {
        int nm = this.jTable1.getSelectedRow();
        System.out.println("\u00e8_____" + nm);
        String np = this.jTable1.getModel().getValueAt(nm, 0).toString();
        System.out.println("\u00e8_____" + np);
    }

    private void jTable1MouseClicked(MouseEvent evt) {
     int lign = this.jTable1.getSelectedRow();
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
        
        String matfiscal;
        matfiscal=this.jTable1.getModel().getValueAt(lign, 2).toString();
         ResultSet result1 = state4.executeQuery("SELECT * FROM adherent " ); 
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
        }    }

    private void jTable1MouseEntered(MouseEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mecMouseClicked(MouseEvent evt) {
        this.mec.setText("");    }

    private void mecActionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mecKeyReleased(KeyEvent evt) {
      int mec = Integer.parseInt(this.mec.getText()); 
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
            
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Statement state3 = conn2.createStatement();
                ResultSet result5 = state3.executeQuery("SELECT * FROM adherent WHERE MECANO  = '" + this.mec.getText() + "'");
                 while (result5.next()) {
                     
                 
                 }
              } catch (Exception e) {
                JOptionPane jop3 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur : " + e.getMessage());
            }
    }
    
}
