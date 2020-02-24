/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class CustomPanel
extends JPanel {
    int progress = 0;

    public void UpdateProgress(int progress_value) {
        this.progress = progress_value;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.translate(this.getWidth() / 2, this.getHeight() / 2);
        g2.rotate(Math.toRadians(270.0));
        Arc2D.Float arc = new Arc2D.Float(2);
        Ellipse2D.Float circle = new Ellipse2D.Float(0.0f, 0.0f, 110.0f, 110.0f);
        arc.setFrameFromCenter(new Point(0, 0), new Point(120, 120));
        circle.setFrameFromCenter(new Point(0, 0), new Point(110, 110));
        arc.setAngleStart(1.0);
        arc.setAngleExtent((double)(- this.progress) * 3.6);
        g2.setColor(Color.red);
        g2.draw(arc);
        g2.fill(arc);
        g2.setColor(Color.WHITE);
        g2.draw(circle);
        g2.fill(circle);
        g2.setColor(Color.red);
        g2.rotate(Math.toRadians(90.0));
        g.setFont(new Font("Verdana", 0, 50));
        FontMetrics fm = g2.getFontMetrics();
        Rectangle2D r = fm.getStringBounds("" + this.progress + "%", g);
        int x = (0 - (int)r.getWidth()) / 2;
        int y = (0 - (int)r.getHeight()) / 2 + fm.getAscent();
        g2.drawString("" + this.progress + "%", x, y);
    }
}

