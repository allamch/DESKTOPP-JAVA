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
import mon_projet_fin_etude.caisseDroitFDDetat;
import mon_projet_fin_etude.caisseFDDDroitfixeconsultation;
import mon_projet_fin_etude.caisseFDDconsultation1;
import mon_projet_fin_etude.caisseFDDetat;
import mon_projet_fin_etude.caisseFDDrechercheparNum;
import mon_projet_fin_etude.caisseFDDrecherchepardat;
import mon_projet_fin_etude.caissefddetatdecheque1;
import mon_projet_fin_etude.caisseinterissefdd;

public class caissefdd
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private caisseDroitFDDetat caisseDroitFDDetat1;
    private caisseFDDDroitfixeconsultation caisseFDDDroitfixeconsultation1;
    private caisseFDDconsultation1 caisseFDDconsultation11;
    private caisseFDDetat caisseFDDetat1;
    private caisseFDDrechercheparNum caisseFDDrechercheparNum1;
    private caisseFDDrecherchepardat caisseFDDrecherchepardat1;
    private caissefddetatdecheque1 caissefddetatdecheque11;
    private caisseinterissefdd caisseinterissefdd1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JPanel jPanel1;
    private JPanel jPanel16;

    public caissefdd() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.caisseFDDconsultation11 = new caisseFDDconsultation1();
        this.caisseFDDetat1 = new caisseFDDetat();
        this.caissefddetatdecheque11 = new caissefddetatdecheque1();
        this.caisseinterissefdd1 = new caisseinterissefdd();
        this.caisseFDDrechercheparNum1 = new caisseFDDrechercheparNum();
        this.caisseFDDrecherchepardat1 = new caisseFDDrecherchepardat();
        this.caisseFDDDroitfixeconsultation1 = new caisseFDDDroitfixeconsultation();
        this.caisseDroitFDDetat1 = new caisseDroitFDDetat();
        this.jPanel1 = new JPanel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jButton6 = new JButton();
        this.jButton5 = new JButton();
        this.jButton7 = new JButton();
        this.jButton8 = new JButton();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(new CardLayout());
        this.jPanel16.add((Component)this.caisseFDDconsultation11, "card5");
        this.jPanel16.add((Component)this.caisseFDDetat1, "card4");
        this.jPanel16.add((Component)this.caissefddetatdecheque11, "card3");
        this.jPanel16.add((Component)this.caisseinterissefdd1, "card2");
        this.jPanel16.add((Component)this.caisseFDDrechercheparNum1, "card6");
        this.jPanel16.add((Component)this.caisseFDDrecherchepardat1, "card7");
        this.jPanel16.add((Component)this.caisseFDDDroitfixeconsultation1, "card8");
        this.jPanel16.add((Component)this.caisseDroitFDDetat1, "card9");
        this.add(this.jPanel16);
        this.jPanel16.setBounds(80, 0, 940, 570);
        this.jPanel1.setLayout(null);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/prime/date.PNG")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefdd.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(0, 120, 70, 60);
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/prime/et.png")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefdd.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(0, 60, 70, 60);
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/53731.png")));
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefdd.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(0, 180, 70, 60);
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/caisdfixe.PNG")));
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefdd.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton4);
        this.jButton4.setBounds(0, 340, 70, 60);
        this.jButton6.setText("ETAT");
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefdd.this.jButton6ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton6);
        this.jButton6.setBounds(0, 240, 70, 60);
        this.jButton5.setFont(new Font("Tahoma", 1, 8));
        this.jButton5.setText("droit fixe");
        this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefdd.this.jButton5ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton5);
        this.jButton5.setBounds(0, 520, 70, 50);
        this.jButton7.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/cais.PNG")));
        this.jButton7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefdd.this.jButton7ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton7);
        this.jButton7.setBounds(0, 0, 70, 60);
        this.jButton8.setIcon(new ImageIcon(this.getClass().getResource("/fdd/et.png")));
        this.jButton8.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caissefdd.this.jButton8ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton8);
        this.jButton8.setBounds(0, 400, 70, 60);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(10, 0, 70, 570);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card6");
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card4");
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card7");
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card8");
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card3");
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card2");
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
    }

    private void jButton8ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card9");
    }

    public void serch() {
        try {
            String requete = "Select * from ffournis  WHERE MATRIC LIKE ?";
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

