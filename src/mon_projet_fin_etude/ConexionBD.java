/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Component;
import java.io.File;
import java.io.PrintStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ConexionBD {
    String filename = null;
    public static String path;
    public ImageIcon format = null;
    int s = 0;
    byte[] photo = null;

    public void filen() {
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Choisir une image png");
            chooser.setApproveButtonText("Ajouter une image");
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            path = this.filename = f.getAbsolutePath();
        }
        catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Veuiller choisir une images");
        }
    }

    public String getp() {
        return path;
    }
}

