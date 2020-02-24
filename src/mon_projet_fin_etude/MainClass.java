/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.PrintStream;
import mon_projet_fin_etude.MyPrintable;

public class MainClass {
    public static void main(String[] args) throws Exception {
        PrinterJob pj = PrinterJob.getPrinterJob();
        PageFormat pf = pj.defaultPage();
        Paper paper = new Paper();
        double margin = 36.0;
        paper.setImageableArea(margin, margin, paper.getWidth() - margin * 2.0, paper.getHeight() - margin * 2.0);
        pf.setPaper(paper);
        pj.setPrintable(new MyPrintable(), pf);
        if (pj.printDialog()) {
            try {
                pj.print();
            }
            catch (PrinterException e) {
                System.out.println(e);
            }
        }
    }
}

