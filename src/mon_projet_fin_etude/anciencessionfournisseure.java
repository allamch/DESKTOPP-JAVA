/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  com.toedter.calendar.JDateChooser
 */
package mon_projet_fin_etude;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class anciencessionfournisseure
extends JFrame {
    private JTextField NBC;
    private JTextField cession;
    private JDateChooser datecession;
    private JDateChooser daterembourse;
    private JTextField dossier;
    private JButton jButton18;
    private JButton jButton19;
    private JLabel jLabel1;
    private JLabel jLabel17;
    private JLabel jLabel2;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel16;
    private JTextField mecano;
    private JTextField mensualit\u00e9;
    private JTextField nbmois;
    private JTextField numcheque;

    public anciencessionfournisseure() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel16 = new JPanel();
        this.jLabel17 = new JLabel();
        this.datecession = new JDateChooser();
        this.jButton19 = new JButton();
        this.jButton18 = new JButton();
        this.jLabel2 = new JLabel();
        this.mecano = new JTextField();
        this.jLabel28 = new JLabel();
        this.nbmois = new JTextField();
        this.jLabel5 = new JLabel();
        this.numcheque = new JTextField();
        this.jLabel4 = new JLabel();
        this.mensualit\u00e9 = new JTextField();
        this.jLabel29 = new JLabel();
        this.jLabel30 = new JLabel();
        this.cession = new JTextField();
        this.jLabel31 = new JLabel();
        this.daterembourse = new JDateChooser();
        this.jLabel32 = new JLabel();
        this.dossier = new JTextField();
        this.jLabel1 = new JLabel();
        this.jLabel3 = new JLabel();
        this.NBC = new JTextField();
        this.setDefaultCloseOperation(3);
        this.jPanel16.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Arial", 1, 21)));
        this.jPanel16.setPreferredSize(new Dimension(684, 274));
        this.jPanel16.setLayout(null);
        this.jLabel17.setFont(new Font("Tahoma", 3, 14));
        this.jPanel16.add(this.jLabel17);
        this.jLabel17.setBounds(10, 240, 130, 0);
        this.jPanel16.add((Component)this.datecession);
        this.datecession.setBounds(160, 200, 150, 30);
        this.jButton19.setFont(new Font("Tahoma", 1, 12));
        this.jButton19.setIcon(new ImageIcon(this.getClass().getResource("/image/24.png")));
        this.jButton19.setText("Valider");
        this.jButton19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                anciencessionfournisseure.this.jButton19ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton19);
        this.jButton19.setBounds(430, 200, 120, 40);
        this.jButton18.setFont(new Font("Tahoma", 1, 12));
        this.jButton18.setIcon(new ImageIcon(this.getClass().getResource("/image/remove.png")));
        this.jButton18.setText("QUITTER");
        this.jButton18.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                anciencessionfournisseure.this.jButton18ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.jButton18);
        this.jButton18.setBounds(430, 250, 120, 40);
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("Mecano :");
        this.jPanel16.add(this.jLabel2);
        this.jLabel2.setBounds(30, 40, 70, 20);
        this.mecano.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                anciencessionfournisseure.this.mecanoActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.mecano);
        this.mecano.setBounds(100, 80, 170, 30);
        this.jLabel28.setFont(new Font("Tahoma", 1, 14));
        this.jLabel28.setText("Date de cession :");
        this.jPanel16.add(this.jLabel28);
        this.jLabel28.setBounds(30, 200, 120, 30);
        this.nbmois.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                anciencessionfournisseure.this.nbmoisActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.nbmois);
        this.nbmois.setBounds(410, 130, 110, 30);
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("N\u00b0 de cheque  :");
        this.jPanel16.add(this.jLabel5);
        this.jLabel5.setBounds(30, 130, 130, 30);
        this.numcheque.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                anciencessionfournisseure.this.numchequeActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.numcheque);
        this.numcheque.setBounds(140, 130, 170, 30);
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("Montant :");
        this.jPanel16.add(this.jLabel4);
        this.jLabel4.setBounds(280, 80, 90, 30);
        this.mensualit\u00e9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                anciencessionfournisseure.this.mensualit\u00e9ActionPerformed(evt);
            }
        });
        this.jPanel16.add(this.mensualit\u00e9);
        this.mensualit\u00e9.setBounds(360, 80, 170, 30);
        this.jLabel29.setFont(new Font("Tahoma", 1, 14));
        this.jLabel29.setText("Date de la premier rembours :");
        this.jPanel16.add(this.jLabel29);
        this.jLabel29.setBounds(30, 170, 210, 30);
        this.jLabel30.setFont(new Font("Tahoma", 1, 14));
        this.jLabel30.setText("NB de mois :");
        this.jPanel16.add(this.jLabel30);
        this.jLabel30.setBounds(320, 130, 90, 30);
        this.jPanel16.add(this.cession);
        this.cession.setBounds(320, 240, 90, 30);
        this.jLabel31.setFont(new Font("Tahoma", 1, 14));
        this.jLabel31.setText("Cession N\u00b0:");
        this.jPanel16.add(this.jLabel31);
        this.jLabel31.setBounds(230, 240, 80, 30);
        this.jPanel16.add((Component)this.daterembourse);
        this.daterembourse.setBounds(280, 170, 170, 30);
        this.jLabel32.setFont(new Font("Tahoma", 1, 14));
        this.jLabel32.setText("Dossier N\u00b0:");
        this.jPanel16.add(this.jLabel32);
        this.jLabel32.setBounds(30, 240, 80, 30);
        this.jPanel16.add(this.dossier);
        this.dossier.setBounds(130, 240, 90, 30);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(0, 0, 153));
        this.jLabel1.setText("Ajouter une ancienne cession");
        this.jPanel16.add(this.jLabel1);
        this.jLabel1.setBounds(120, 0, 360, 29);
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("Mecano :");
        this.jPanel16.add(this.jLabel3);
        this.jLabel3.setBounds(30, 90, 70, 20);
        this.NBC.setFont(new Font("Tahoma", 1, 14));
        this.jPanel16.add(this.NBC);
        this.NBC.setBounds(100, 40, 130, 30);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel16, -2, 562, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel16, -1, 309, 32767).addContainerGap()));
        this.pack();
    }

    private void jButton19ActionPerformed(ActionEvent evt) {
        Connection conn2;
        JOptionPane jop1;
        String datcession = "";
        String Nom = "";
        String Montant = "";
        String dateremboursee = "";
        String moiddebut = "";
        String moisfin = "";
        String parmois = "";
        Montant = this.mensualit\u00e9.getText();
        boolean k = false;
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        Date d1 = this.datecession.getDate();
        Date d2 = this.daterembourse.getDate();
        try {
            datcession = f.format(d1);
        }
        catch (Exception e) {
            jop1 = new JOptionPane();
        }
        try {
            dateremboursee = f.format(d2);
        }
        catch (Exception e) {
            jop1 = new JOptionPane();
        }
        String moispremier = dateremboursee.substring(3, dateremboursee.length() - 5);
        String ann\u00e9espremier = dateremboursee.substring(6, dateremboursee.length());
        System.out.println("mois =" + moispremier);
        System.out.println("ann\u00e9es =" + ann\u00e9espremier);
        int moiaci = Integer.parseInt(moispremier);
        switch (moiaci) {
            case 1: {
                moiddebut = "Janvier  " + ann\u00e9espremier;
                break;
            }
            case 2: {
                moiddebut = "F\u00e9vrier  " + ann\u00e9espremier;
                break;
            }
            case 3: {
                moiddebut = "Mars  " + ann\u00e9espremier;
                break;
            }
            case 4: {
                moiddebut = "Avril  " + ann\u00e9espremier;
                break;
            }
            case 5: {
                moiddebut = "Mai  " + ann\u00e9espremier;
                break;
            }
            case 6: {
                moiddebut = "Juin  " + ann\u00e9espremier;
                break;
            }
            case 7: {
                moiddebut = "Juillet  " + ann\u00e9espremier;
                break;
            }
            case 8: {
                moiddebut = "Ao\u00fbt  " + ann\u00e9espremier;
                break;
            }
            case 9: {
                moiddebut = "Septembre  " + ann\u00e9espremier;
                break;
            }
            case 10: {
                moiddebut = "Octobre  " + ann\u00e9espremier;
                break;
            }
            case 11: {
                moiddebut = "Novembre  " + ann\u00e9espremier;
                break;
            }
            case 12: {
                moiddebut = "D\u00e9cembre  " + ann\u00e9espremier;
                break;
            }
            default: {
                moiddebut = "Erreur";
            }
        }
        int moisresu = Integer.parseInt(this.nbmois.getText());
        int kk = moiaci + moisresu;
        int aaa = Integer.parseInt(ann\u00e9espremier);
        while (kk > 12) {
            kk -= 12;
            ++aaa;
        }
        if (kk == 1) {
            kk = 12;
            --aaa;
        } else {
            --kk;
        }
        System.out.println("kk =" + kk);
        switch (kk) {
            case 1: {
                moisfin = "Janvier  " + aaa;
                break;
            }
            case 2: {
                moisfin = "F\u00e9vrier  " + aaa;
                break;
            }
            case 3: {
                moisfin = "Mars  " + aaa;
                break;
            }
            case 4: {
                moisfin = "Avril  " + aaa;
                break;
            }
            case 5: {
                moisfin = "Mai  " + aaa;
                break;
            }
            case 6: {
                moisfin = "Juin  " + aaa;
                break;
            }
            case 7: {
                moisfin = "Juillet  " + aaa;
                break;
            }
            case 8: {
                moisfin = "Ao\u00fbt  " + aaa;
                break;
            }
            case 9: {
                moisfin = "Septembre  " + aaa;
                break;
            }
            case 10: {
                moisfin = "Octobre  " + aaa;
                break;
            }
            case 11: {
                moisfin = "Novembre  " + aaa;
                break;
            }
            case 12: {
                moisfin = "D\u00e9cembre  " + aaa;
                break;
            }
            default: {
                moisfin = "";
            }
        }
        String Montgloba = Montant.substring(0, Montant.length() - 3);
        int montglobale = Integer.parseInt(Montgloba);
        int nbm = Integer.parseInt(this.nbmois.getText());
        int somme = montglobale / nbm;
        String ssV = "" + somme + "";
        int tV = ssV.length() - 3;
        System.out.println("ssV = " + ssV);
        parmois = ssV + ",000";
        String jours = datcession.substring(0, datcession.length() - 8);
        String mois2 = datcession.substring(3, datcession.length() - 5);
        String ann\u00e9es = datcession.substring(6, datcession.length());
        String dat = mois2 + "/" + ann\u00e9es;
        String reference = this.cession.getText() + "/" + this.dossier.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
            Statement state3 = conn2.createStatement();
            ResultSet result3 = state3.executeQuery("SELECT * FROM adherent  WHERE MECANO=" + this.mecano.getText());
            ResultSetMetaData resultMeta3 = result3.getMetaData();
            while (result3.next()) {
                Nom = result3.getString("NOM");
                k = true;
            }
        }
        catch (Exception e) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "erreur info adherent!!: " + e.getMessage());
            k = false;
        }
        if (k) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sante?useUnicode=true&characterEncoding=UTF-8", "root", "");
                Statement state = conn2.createStatement();
                int b = 1;
                state.executeUpdate("INSERT INTO cession2(NBC,mois,date,Mecano,Nom,Montant,Nbmois,premiermois,derniermois,montantparmois,ncheque,ref,pv) VALUES('" + this.NBC.getText() + "','" + dat + "','" + datcession + "','" + this.mecano.getText() + "','" + Nom + "','" + Montant + "','" + this.nbmois.getText() + "','" + moiddebut + "','" + moisfin + "','" + parmois + "','" + this.numcheque.getText() + "','" + reference + "','" + b + "')");
                JOptionPane jop12 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Succes d'ajouter   ", "Information", 1);
                this.setVisible(false);
            }
            catch (Exception e) {
                JOptionPane jop13 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "erreur d'ajout  : " + e.getMessage());
            }
        } else {
            JOptionPane jop14 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Adherant n'existe pas  : ");
        }
    }

    private void jButton18ActionPerformed(ActionEvent evt) {
        JOptionPane jop = new JOptionPane();
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Quitter?", "Quitter", 0, 3);
        if (option == 0) {
            this.setVisible(false);
        }
    }

    private void mecanoActionPerformed(ActionEvent evt) {
    }

    private void nbmoisActionPerformed(ActionEvent evt) {
    }

    private void numchequeActionPerformed(ActionEvent evt) {
    }

    private void mensualit\u00e9ActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(anciencessionfournisseure.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(anciencessionfournisseure.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(anciencessionfournisseure.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(anciencessionfournisseure.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new anciencessionfournisseure().setVisible(true);
            }
        });
    }

}

