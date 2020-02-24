/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class dossierface1
extends JPanel {
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel33;
    private JLabel jLabel36;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel44;
    private JLabel jLabel46;
    private JLabel jLabel47;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel18;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTable jTable1;

    public dossierface1() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel18 = new JPanel();
        this.jLabel15 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel40 = new JLabel();
        this.jLabel41 = new JLabel();
        this.jLabel42 = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel44 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel46 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel47 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jSeparator1 = new JSeparator();
        this.jSeparator2 = new JSeparator();
        this.jLabel12 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jPanel18.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel18.setPreferredSize(new Dimension(684, 274));
        this.jPanel18.setLayout(null);
        this.jLabel15.setFont(new Font("Tahoma", 3, 14));
        this.jPanel18.add(this.jLabel15);
        this.jLabel15.setBounds(10, 240, 130, 0);
        this.jLabel33.setFont(new Font("Tahoma", 1, 14));
        this.jLabel33.setText("\u062a\u0627\u0631\u064a\u062e \u0627\u0644\u0648\u0644\u0627\u062f\u0629");
        this.jPanel18.add(this.jLabel33);
        this.jLabel33.setBounds(340, 390, 79, 17);
        this.jLabel36.setBackground(new Color(153, 153, 255));
        this.jLabel36.setFont(new Font("Tahoma", 1, 14));
        this.jLabel36.setForeground(new Color(0, 0, 255));
        this.jLabel36.setText("\u0627\u0644\u0645\u0639\u0631\u0641 \u0627\u0644\u0627\u0644\u064a ");
        this.jPanel18.add(this.jLabel36);
        this.jLabel36.setBounds(400, 110, 90, 20);
        this.jLabel38.setBackground(new Color(153, 153, 255));
        this.jLabel38.setFont(new Font("Tahoma", 1, 14));
        this.jLabel38.setText("\u0627\u0644\u0644\u0642\u0628");
        this.jPanel18.add(this.jLabel38);
        this.jLabel38.setBounds(140, 230, 50, 20);
        this.jLabel13.setFont(new Font("Tahoma", 1, 14));
        this.jLabel13.setText("\u0627\u0644\u0645\u0633\u062a\u0634\u0641\u0649");
        this.jPanel18.add(this.jLabel13);
        this.jLabel13.setBounds(340, 340, 78, 17);
        this.jLabel39.setBackground(new Color(153, 153, 255));
        this.jLabel39.setFont(new Font("Tahoma", 1, 14));
        this.jLabel39.setForeground(new Color(0, 0, 255));
        this.jLabel39.setText("\u0631\u0642\u0645 \u0627\u0644\u0645\u0644\u0641");
        this.jPanel18.add(this.jLabel39);
        this.jLabel39.setBounds(150, 110, 66, 17);
        this.jLabel19.setFont(new Font("Tahoma", 1, 14));
        this.jLabel19.setForeground(new Color(0, 0, 255));
        this.jLabel19.setText("\u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u062c\u0627\u0631\u064a \u0628\u0627\u0644\u0628\u0646\u0643 \u0623\u0648 \u0627\u0644\u0628\u0631\u064a\u062f");
        this.jPanel18.add(this.jLabel19);
        this.jLabel19.setBounds(340, 160, 178, 17);
        this.jLabel40.setBackground(new Color(153, 153, 255));
        this.jLabel40.setFont(new Font("Tahoma", 1, 14));
        this.jLabel40.setForeground(new Color(0, 0, 255));
        this.jLabel40.setText("\u0631\u0642\u0645 \u0628.\u062a");
        this.jPanel18.add(this.jLabel40);
        this.jLabel40.setBounds(140, 160, 70, 20);
        this.jLabel41.setBackground(new Color(153, 153, 255));
        this.jLabel41.setFont(new Font("Tahoma", 1, 14));
        this.jLabel41.setText("\u0627\u0644\u0645\u0647\u0646\u0629");
        this.jPanel18.add(this.jLabel41);
        this.jLabel41.setBounds(150, 280, 50, 20);
        this.jLabel42.setBackground(new Color(153, 153, 255));
        this.jLabel42.setFont(new Font("Tahoma", 1, 14));
        this.jLabel42.setText("\u0631\u0642\u0645 \u0627\u0644\u0647\u0627\u062a\u0641 ");
        this.jPanel18.add(this.jLabel42);
        this.jLabel42.setBounds(330, 280, 80, 20);
        this.jLabel1.setText(".....................;..........");
        this.jPanel18.add(this.jLabel1);
        this.jLabel1.setBounds(210, 150, 130, 30);
        this.jLabel2.setText("............................");
        this.jPanel18.add(this.jLabel2);
        this.jLabel2.setBounds(220, 330, 120, 30);
        this.jLabel3.setText("............................");
        this.jPanel18.add(this.jLabel3);
        this.jLabel3.setBounds(10, 150, 120, 30);
        this.jLabel4.setText("............................");
        this.jPanel18.add(this.jLabel4);
        this.jLabel4.setBounds(20, 110, 120, 30);
        this.jLabel5.setText(".................;...............");
        this.jPanel18.add(this.jLabel5);
        this.jLabel5.setBounds(240, 100, 150, 30);
        this.jLabel6.setText("............................");
        this.jPanel18.add(this.jLabel6);
        this.jLabel6.setBounds(220, 380, 120, 30);
        this.jLabel8.setText(".........");
        this.jPanel18.add(this.jLabel8);
        this.jLabel8.setBounds(20, 380, 40, 30);
        this.jLabel9.setText("............................");
        this.jPanel18.add(this.jLabel9);
        this.jLabel9.setBounds(220, 230, 120, 30);
        this.jLabel11.setText("............................");
        this.jPanel18.add(this.jLabel11);
        this.jLabel11.setBounds(210, 270, 120, 30);
        this.jLabel17.setText("............................");
        this.jPanel18.add(this.jLabel17);
        this.jLabel17.setBounds(10, 230, 120, 30);
        this.jLabel44.setBackground(new Color(153, 153, 255));
        this.jLabel44.setFont(new Font("Tahoma", 1, 14));
        this.jLabel44.setText("\u0627\u0644\u0627\u0633\u0645");
        this.jPanel18.add(this.jLabel44);
        this.jLabel44.setBounds(360, 230, 50, 20);
        this.jLabel16.setText("............................");
        this.jPanel18.add(this.jLabel16);
        this.jLabel16.setBounds(10, 330, 120, 30);
        this.jLabel46.setBackground(new Color(153, 153, 255));
        this.jLabel46.setFont(new Font("Tahoma", 1, 14));
        this.jLabel46.setText("\u0639\u062f\u062f \u0627\u0644\u0627\u0628\u0646\u0627\u0621 \u0641\u064a \u0627\u0644\u0643\u0641\u0644\u0629");
        this.jPanel18.add(this.jLabel46);
        this.jLabel46.setBounds(70, 380, 140, 20);
        this.jLabel7.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/homme.png")));
        this.jPanel18.add(this.jLabel7);
        this.jLabel7.setBounds(420, 220, 120, 160);
        this.jLabel10.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/mutu.PNG")));
        this.jPanel18.add(this.jLabel10);
        this.jLabel10.setBounds(30, 20, 40, 40);
        this.jLabel47.setBackground(new Color(153, 153, 255));
        this.jLabel47.setFont(new Font("Tahoma", 1, 14));
        this.jLabel47.setText("\u0627\u0633\u0645 \u0627\u0644\u0632\u0648\u062c(\u0629)");
        this.jPanel18.add(this.jLabel47);
        this.jLabel47.setBounds(130, 340, 90, 20);
        this.jLabel14.setText("............................");
        this.jPanel18.add(this.jLabel14);
        this.jLabel14.setBounds(20, 270, 130, 30);
        this.jPanel18.add(this.jSeparator1);
        this.jSeparator1.setBounds(0, 200, 530, 10);
        this.jPanel18.add(this.jSeparator2);
        this.jSeparator2.setBounds(0, 72, 530, 10);
        this.jLabel12.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/melaf.PNG")));
        this.jPanel18.add(this.jLabel12);
        this.jLabel12.setBounds(90, 0, 380, 70);
        this.jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "liste des prets", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane1.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane1.setName("");
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}}, new String[]{"Date pre", "N pret", "Montant pret", "N mois", "date 1er rembours", "date der remombors", "visa"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                dossierface1.this.jTable1MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                dossierface1.this.jTable1MouseEntered(evt);
            }
        });
        this.jTable1.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                dossierface1.this.jTable1AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jScrollPane1, -2, 389, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel18, -2, 534, -2)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jScrollPane1, -1, 442, 32767).addComponent(this.jPanel18, -1, -1, 32767)).addContainerGap()));
    }

    private void jTable1MouseClicked(MouseEvent evt) {
    }

    private void jTable1MouseEntered(MouseEvent evt) {
    }

    private void jTable1AncestorAdded(AncestorEvent evt) {
    }

}

