/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class imprimerdossier
extends JPanel {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JSeparator jSeparator1;
    private JTable jTable1;
    private JTable jTable2;
    private JTable jTable3;
    private JTextField jTextField1;

    public imprimerdossier() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel2 = new JLabel();
        this.jComboBox1 = new JComboBox();
        this.jButton1 = new JButton();
        this.jSeparator1 = new JSeparator();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jScrollPane3 = new JScrollPane();
        this.jTable3 = new JTable();
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("\u0645\u0639\u064a\u0627\u0631 \u0627\u0644\u0628\u062d\u062b");
        this.jComboBox1.setFont(new Font("Tahoma", 0, 14));
        this.jComboBox1.setForeground(new Color(0, 102, 255));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[]{"\u0631\u0642\u0645 \u0627\u0644\u0645\u0644\u0641", "\u0631\u0642\u0645 \u0628.\u062a"}));
        this.jButton1.setFont(new Font("Tahoma", 1, 12));
        this.jButton1.setIcon(new ImageIcon(this.getClass().getResource("/image/Zoom-icon.png")));
        this.jButton1.setText("\u0628\u062d\u062b");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                imprimerdossier.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/face1 (2).png")));
        this.jButton3.setIcon(new ImageIcon(this.getClass().getResource("/image/mutuelle/face1 (1).png")));
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setForeground(new Color(0, 153, 102));
        this.jLabel1.setText("\u0627\u0644\u0648\u062c\u0647\u0629 \u0627\u0644\u0627\u0645\u0645\u064a\u0629");
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setForeground(new Color(0, 153, 102));
        this.jLabel3.setText("\u0627\u0644\u0648\u062c\u0647\u0629 \u0627\u0644\u062e\u0644\u0641\u064a\u0629");
        this.jScrollPane3.setBorder(BorderFactory.createTitledBorder(null, "liste des adurant", 0, 0, new Font("Arial", 1, 14)));
        this.jScrollPane3.setViewportBorder(BorderFactory.createCompoundBorder());
        this.jScrollPane3.setName("");
        this.jTable3.setBorder(BorderFactory.createCompoundBorder());
        this.jTable3.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null}}, new String[]{"Num CIN", "N dosier", "Nom ET PRENOM", "CNR ", "GSM"}){
            Class[] types;
            {
                //super(x0, x1);
                this.types = new Class[]{Object.class, String.class, Object.class, Object.class, Object.class};
            }

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable3.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent evt) {
                imprimerdossier.this.jTable3MouseClicked(evt);
            }

            @Override
            public void mouseEntered(MouseEvent evt) {
                imprimerdossier.this.jTable3MouseEntered(evt);
            }
        });
        this.jTable3.addAncestorListener(new AncestorListener(){

            @Override
            public void ancestorMoved(AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(AncestorEvent evt) {
                imprimerdossier.this.jTable3AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        this.jScrollPane3.setViewportView(this.jTable3);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(73, 73, 73).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton3, -2, 118, -2).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel3))).addGap(86, 86, 86).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel1)).addComponent(this.jButton2, -2, 109, -2)).addContainerGap(146, 32767)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jButton1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField1, -2, 140, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jComboBox1, -2, 96, -2).addGap(30, 30, 30).addComponent(this.jLabel2, -2, 85, -2).addContainerGap(74, 32767)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jSeparator1, GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane3, GroupLayout.Alignment.LEADING, -1, 522, 32767)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jComboBox1, -2, -1, -2)).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField1, -2, 27, -2).addComponent(this.jButton1))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane3, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jSeparator1, -2, 11, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton3, -2, 113, -2).addComponent(this.jButton2, -2, 113, -2)).addGap(6, 6, 6).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jLabel1)).addContainerGap(19, 32767)));
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    }

    private void jTable3MouseClicked(MouseEvent evt) {
    }

    private void jTable3MouseEntered(MouseEvent evt) {
    }

    private void jTable3AncestorAdded(AncestorEvent evt) {
    }

}

