/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NewJFrame
extends JFrame {
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;

    public NewJFrame() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel2 = new JLabel();
        this.jButton1 = new JButton();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel2.setText("jLabel2");
        this.setDefaultCloseOperation(3);
        this.jButton1.setText("jButton1");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                NewJFrame.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel1.setBackground(new Color(255, 255, 255));
        this.jLabel1.setText("jLabel1");
        this.jLabel3.setText(".............");
        this.jLabel4.setText("\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5\u00b5");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 234, 32767).addComponent(this.jLabel3).addGap(47, 47, 47)).addGroup(jPanel1Layout.createSequentialGroup().addGap(151, 151, 151).addComponent(this.jLabel4, -2, 152, -2).addContainerGap(87, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jLabel3)).addGap(74, 74, 74).addComponent(this.jLabel4).addContainerGap(23, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(162, 162, 162).addComponent(this.jButton1)).addComponent(this.jPanel1, -1, -1, 32767)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jButton1).addGap(75, 75, 75).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(66, 32767)));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Properties props = new Properties();
        props.setProperty("awt.print.paperSize", "a4");
        props.setProperty("awt.print.destination", "printer");
        PrintJob demandeDImpression = this.getToolkit().getPrintJob(this, "Impression", props);
        System.out.println("demandeDImpression   :  " + demandeDImpression);
        Graphics gImpr = demandeDImpression.getGraphics();
        this.jPanel1.printAll(gImpr);
        demandeDImpression.end();
        this.setVisible(false);
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
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

}

