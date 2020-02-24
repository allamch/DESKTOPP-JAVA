/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mon_projet_fin_etude.Modifiertirreure;
import mon_projet_fin_etude.ajoutertirreure;

public class effectueepar
extends JFrame {
    private ajoutertirreure ajoutertirreure1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JPanel jPanel1;
    private JPanel jPanel7;
    private Modifiertirreure modifiertirreure1;

    public effectueepar() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel7 = new JPanel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jPanel1 = new JPanel();
        this.ajoutertirreure1 = new ajoutertirreure();
        this.modifiertirreure1 = new Modifiertirreure();
        this.setDefaultCloseOperation(3);
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/add-user-icon (1).png")));
        this.jButton1.setToolTipText("Ajouter tirreure");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                effectueepar.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setIcon(new ImageIcon("C:\\Users\\jihen\\Documents\\NetBeansProjects\\MUTUELLE\\src\\image\\Add-icon.png"));
        this.jButton2.setToolTipText("Modifier tirrure");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                effectueepar.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton3.setToolTipText("Recherche tirrure");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                effectueepar.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton4.setIcon(new ImageIcon(this.getClass().getResource("/image/er.png")));
        this.jButton4.setToolTipText("Supprimer tirrure");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                effectueepar.this.jButton4ActionPerformed(evt);
            }
        });
        GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1, -2, 58, -2).addComponent(this.jButton2, -2, 58, -2).addComponent(this.jButton3, -2, 58, -2).addComponent(this.jButton4, -2, 58, -2)).addContainerGap(-1, 32767)));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton1, -2, 47, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 47, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 47, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton4, -2, 47, -2).addContainerGap(-1, 32767)));
        this.jPanel1.setLayout(new CardLayout());
        this.jPanel1.add((Component)this.ajoutertirreure1, "card2");
        this.jPanel1.add((Component)this.modifiertirreure1, "modif");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel7, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -2, 354, -2)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel7, -2, -1, -2).addComponent(this.jPanel1, -2, 301, -2));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel1.getLayout();
        card.show(this.jPanel1, "ajou");
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        CardLayout card = (CardLayout)this.jPanel1.getLayout();
        card.show(this.jPanel1, "ajou");
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (!"Nimbus".equals(info.getName())) continue;
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(effectueepar.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(effectueepar.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(effectueepar.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(effectueepar.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new effectueepar().setVisible(true);
            }
        });
    }

}

