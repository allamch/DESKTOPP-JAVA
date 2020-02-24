/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class caisseDebitCredit
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7 ;
    private JPanel jPanel1;
    private JPanel jPanel16;
    private debit debit1;
    private caisserecapj caisserecapj1;
    private caisserecapdat caisserecapdat1; 
    private rechercherecugrl rechercherecugrl1;
    private Grandlivre grandlivre1;
    private Rechercherecu rechercherecu1;
    private Paiementmultiple pai;
    public caisseDebitCredit() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jPanel1 = new JPanel();
        this.jButton2 = new JButton();
        this.jButton3= new JButton();
        this.jButton4 = new JButton();
        this.jButton1= new JButton();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();
        this.jButton7 = new JButton();
        this.debit1 = new debit();
        this.caisserecapj1 = new caisserecapj();
        this.caisserecapdat1= new caisserecapdat();
        this.rechercherecugrl1= new rechercherecugrl();
        this.grandlivre1=new Grandlivre();
        this.pai = new Paiementmultiple();
        this.rechercherecu1=new Rechercherecu();
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(800, 274));
        this.jPanel16.setLayout(new CardLayout());
        this.jPanel16.add((Component)this.debit1, "card1");
        this.jPanel16.add((Component)this.caisserecapj1,"card2");
        this.jPanel16.add((Component)this.caisserecapdat1,"card3");
        this.jPanel16.add((Component)this.rechercherecugrl1,"card4");
        this.jPanel16.add((Component)this.grandlivre1,"card5");
        this.jPanel16.add((Component)this.rechercherecu1,"card6");
        this.jPanel16.add((Component)this.pai,"card7");
        this.add(this.jPanel16);
        this.jPanel16.setBounds(80, 0, 1020, 570);
        this.setLayout(null);
        this.jPanel1.setLayout(null); 
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/cais.png")));
        this.jButton2.setBounds(0, 185, 80, 70);
        this.jPanel1.add(this.jButton1);
        
        
        
        
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/prime/date.png")));
         
         
        this.jButton3.setBounds(0, 260, 80, 70);
        this.jPanel1.add(this.jButton3);
        
        
        
           this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDebitCredit.this.jButton1ActionPerformed(evt);
            }
        });
        
        
        
        
        
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDebitCredit.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/ret/search2.png")));
        
       
        this.jButton4.setBounds(0, 335, 80, 70);
        this.jPanel1.add(this.jButton4);
           this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDebitCredit.this.jButton4ActionPerformed(evt);
            }
        });
        
       
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/image/grl2.png")));
         
         
        this.jButton5.setBounds(0, 410, 80, 70);
        this.jPanel1.add(this.jButton5);
       this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDebitCredit.this.jButton5ActionPerformed(evt);
            }
        });
           
           
           
             
        this.jButton6.setIcon(new ImageIcon(this.getClass().getResource("/image/search.png")));
         
        
        this.jButton6.setBounds(0,495, 80, 70);
        this.jPanel1.add(this.jButton6);
       this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDebitCredit.this.jButtonA6ctionPerformed(evt);
            }
        });
                  
        this.jButton7.setIcon(new ImageIcon(this.getClass().getResource("/image/Paiement.png")));
       
        
        this.jButton7.setBounds(0, 110, 80, 70);
        this.jPanel1.add(this.jButton7);
        this.jButton7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDebitCredit.this.jButtonA7ctionPerformed(evt);
            }
        });    
       
       
       
       
       
       
       
        this.jPanel1.add(this.jButton2);
        this.jButton1.setBounds(0,35, 80, 70);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/debit.PNG")));
         
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseDebitCredit.this.jButton2ActionPerformed(evt);
            }
        });
        
        this.add(this.jPanel1);
        this.jPanel1.setBounds(0, 0, 80, 570);
    }


    private void jButton1ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card1");
    }

 

    private void jButton2ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card2");
    }

    
    
      private void jButton3ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card3");
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
      CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card4");    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card5");
    }
 private void jButtonA6ctionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card6");
    }

    private void jButtonA7ctionPerformed(ActionEvent evt) {
CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card7");    }
}

