/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class PrintRectangleResText
implements Printable {
    private static final double JAVA_DPI = 72.0;
    private Font font = new Font("Monospaced", 1, 16);
    private int resolution = 72;

    protected Rectangle restoreRealDpi(Graphics2D graphics, PageFormat pageFormat) {
        Rectangle retValue = new Rectangle();
        Rectangle deviceBounds = graphics.getDeviceConfiguration().getBounds();
        double pageWidth72Dpi = pageFormat.getWidth();
        double pageHeight72Dpi = pageFormat.getHeight();
        double widthResolution = 72.0 * deviceBounds.getWidth() / pageWidth72Dpi;
        double heightResolution = 72.0 * deviceBounds.getHeight() / pageHeight72Dpi;
        this.resolution = (int)Math.round((widthResolution + heightResolution) / 2.0);
        double realImageableX = pageFormat.getImageableX() * widthResolution / 72.0;
        double realImageableWidth = pageFormat.getImageableWidth() * widthResolution / 72.0;
        double realImageableY = pageFormat.getImageableY() * heightResolution / 72.0;
        double realImageableHeight = pageFormat.getImageableHeight() * heightResolution / 72.0;
        graphics.setTransform(new AffineTransform());
        switch (pageFormat.getOrientation()) {
            case 0: {
                double temp = realImageableX;
                realImageableX = realImageableY;
                realImageableY = temp;
                temp = realImageableWidth;
                realImageableWidth = realImageableHeight;
                realImageableHeight = temp;
                graphics.rotate(-1.5707963267948966);
                graphics.translate(- realImageableWidth + realImageableX, realImageableY);
                break;
            }
            case 2: {
                double temp = realImageableX;
                realImageableX = realImageableY;
                realImageableY = temp;
                temp = realImageableWidth;
                realImageableWidth = realImageableHeight;
                realImageableHeight = temp;
                graphics.rotate(1.5707963267948966);
                graphics.translate(realImageableX, realImageableY - realImageableHeight);
                break;
            }
            default: {
                graphics.translate(realImageableX, realImageableY);
            }
        }
        retValue.x = (int)Math.ceil(realImageableX);
        retValue.y = (int)Math.ceil(realImageableY);
        retValue.width = (int)Math.floor(realImageableWidth);
        retValue.height = (int)Math.floor(realImageableHeight);
        return retValue;
    }

    public void printText(Graphics2D graphics, String text, int x, int y) {
        Font computeFont;
        Font currentFont = graphics.getFont();
        double fontScale = (double)(this.resolution * currentFont.getSize()) / 5184.0;
        AffineTransform fontShapeTransform = new AffineTransform();
        fontShapeTransform.setToScale(fontScale, fontScale);
        Font sizeFont = computeFont = new Font(currentFont.getName(), currentFont.getStyle(), 72);
        if (this.font.isItalic()) {
            sizeFont = new Font(currentFont.getFontName(), currentFont.getStyle() - 2, 72);
        }
        Point2D.Double textPos = new Point2D.Double(x, y);
        FontRenderContext frc = graphics.getFontRenderContext();
        char[] carIterator = new char[1];
        int textLength = text.length();
        for (int i = 0; i < textLength; ++i) {
            text.getChars(i, i + 1, carIterator, 0);
            GlyphVector glyph = computeFont.createGlyphVector(frc, carIterator);
            graphics.translate(textPos.x, textPos.y);
            glyph.setGlyphTransform(0, fontShapeTransform);
            graphics.drawGlyphVector(glyph, 0.0f, 0.0f);
            graphics.translate(- textPos.x, - textPos.y);
            TextLayout layout = new TextLayout(new String(carIterator), sizeFont, frc);
            textPos.x += (double)layout.getAdvance() * fontScale;
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        int retValue = 1;
        switch (pageIndex) {
            case 0: {
                Graphics2D g2d = (Graphics2D)graphics;
                Rectangle margin = this.restoreRealDpi(g2d, pageFormat);
                graphics.setColor(Color.BLACK);
                graphics.drawRect(0, 0, margin.width, margin.height);
                graphics.setFont(this.font);
                this.printText(g2d, margin.toString(), 0, margin.height / 2);
                retValue = 0;
                break;
            }
            case 1: {
                Graphics2D g2d = (Graphics2D)graphics;
                Rectangle margin = this.restoreRealDpi(g2d, pageFormat);
                graphics.setColor(Color.BLACK);
                graphics.drawOval(0, 0, margin.width, margin.height);
                graphics.setFont(this.font);
                this.printText(g2d, margin.toString(), 0, margin.height / 2);
                retValue = 0;
                break;
            }
        }
        return retValue;
    }
}

