/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

class MyPrintable
implements Printable {
    MyPrintable() {
    }

    @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) {
        if (pageIndex != 0) {
            return 1;
        }
        Graphics2D g2 = (Graphics2D)g;
        g2.setFont(new Font("Serif", 0, 36));
        g2.setPaint(Color.black);
        g2.drawString("www.java2s.com", 100, 100);
        Rectangle2D.Double outline = new Rectangle2D.Double(pf.getImageableX(), pf.getImageableY(), pf.getImageableWidth(), pf.getImageableHeight());
        g2.draw(outline);
        return 0;
    }
}

