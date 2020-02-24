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
import mon_projet_fin_etude.caisseprimeetatdecheque1;
import mon_projet_fin_etude.caisseprimemaspconsultation;
import mon_projet_fin_etude.caisseprimemaspetat;
import mon_projet_fin_etude.caisseprimemasprechercheparNum;
import mon_projet_fin_etude.caisseprimemasprecherchepardat;

public class caisseprimemasp
extends JPanel {
    String ch = "";
    String ch1 = "";
    String t;
    int k = 0;
    String nb = "";
    String matt = "";
    String anned = "";
    private caisseprimeetatdecheque1 caisseprimeetatdecheque11;
    private caisseprimemaspconsultation caisseprimemaspconsultation1;
    private caisseprimemaspetat caisseprimemaspetat1;
    private caisseprimemasprechercheparNum caisseprimemasprechercheparNum1;
    private caisseprimemasprecherchepardat caisseprimemasprecherchepardat1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JPanel jPanel1;
    private JPanel jPanel16;

    public caisseprimemasp() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.caisseprimemaspconsultation1 = new caisseprimemaspconsultation();
        this.caisseprimemaspetat1 = new caisseprimemaspetat();
        this.caisseprimemasprecherchepardat1 = new caisseprimemasprecherchepardat();
        this.caisseprimemasprechercheparNum1 = new caisseprimemasprechercheparNum();
        this.caisseprimeetatdecheque11 = new caisseprimeetatdecheque1();
        this.jPanel1 = new JPanel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();
        this.setLayout(null);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(new CardLayout());
        this.jPanel16.add((Component)this.caisseprimemaspconsultation1, "card6");
        this.jPanel16.add((Component)this.caisseprimemaspetat1, "card3");
        this.jPanel16.add((Component)this.caisseprimemasprecherchepardat1, "card4");
        this.jPanel16.add((Component)this.caisseprimemasprechercheparNum1, "card5");
        this.jPanel16.add((Component)this.caisseprimeetatdecheque11, "card6");
        this.add(this.jPanel16);
        this.jPanel16.setBounds(90, 0, 930, 570);
        this.jPanel1.setLayout(null);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/prime/date.PNG")));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimemasp.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton1);
        this.jButton1.setBounds(0, 150, 70, 60);
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/prime/et.png")));
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimemasp.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton2);
        this.jButton2.setBounds(0, 80, 70, 60);
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/53731.png")));
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimemasp.this.jButton3ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton3);
        this.jButton3.setBounds(0, 220, 70, 60);
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/cais.PNG")));
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimemasp.this.jButton4ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton4);
        this.jButton4.setBounds(0, 10, 70, 60);
        this.jButton5.setIcon(new ImageIcon(this.getClass().getResource("/caissemasp/reset.PNG")));
        this.jPanel1.add(this.jButton5);
        this.jButton5.setBounds(0, 360, 70, 60);
        this.jButton6.setText("ETAT");
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                caisseprimemasp.this.jButton6ActionPerformed(evt);
            }
        });
        this.jPanel1.add(this.jButton6);
        this.jButton6.setBounds(0, 290, 70, 60);
        this.add(this.jPanel1);
        this.jPanel1.setBounds(10, 10, 70, 560);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card5");
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card3");
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card4");
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card6");
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel16.getLayout();
        card.show(this.jPanel16, "card6");
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

