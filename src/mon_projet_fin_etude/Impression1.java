/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Impression1
extends JPanel
implements Printable,
ActionListener {
    JPanel frameToPrint;

    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        if (page > 0) {
            return 1;
        }
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        this.frameToPrint.printAll(g);
        return 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            }
            catch (PrinterException ex) {
                // empty catch block
            }
        }
    }

    public void bb(ActionEvent e) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        boolean ok = job.printDialog();
        try {
            job.print();
        }
        catch (PrinterException ex) {
            JOptionPane jop3 = new JOptionPane();
            JOptionPane.showMessageDialog(null, "ereure  " + ex.getMessage());
        }
    }

    public void jiji(ActionEvent e) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        try {
            job.print();
        }
        catch (PrinterException ex) {
            // empty catch block
        }
    }

    public Impression1(JPanel f) {
        this.frameToPrint = f;
    }
}

