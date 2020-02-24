/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class ColumnsAutoSizer {
    public static void sizeColumnsToFit(JTable table) {
        ColumnsAutoSizer.sizeColumnsToFit(table, 5);
    }

    public static void sizeColumnsToFit(JTable table, int columnMargin) {
        JTableHeader tableHeader = table.getTableHeader();
        if (tableHeader == null) {
            return;
        }
        FontMetrics headerFontMetrics = tableHeader.getFontMetrics(tableHeader.getFont());
        int[] minWidths = new int[table.getColumnCount()];
        int[] maxWidths = new int[table.getColumnCount()];
        for (int columnIndex = 0; columnIndex < table.getColumnCount(); ++columnIndex) {
            int headerWidth = headerFontMetrics.stringWidth(table.getColumnName(columnIndex));
            minWidths[columnIndex] = headerWidth + columnMargin;
            int maxWidth = ColumnsAutoSizer.getMaximalRequiredColumnWidth(table, columnIndex, headerWidth);
            maxWidths[columnIndex] = Math.max(maxWidth, minWidths[columnIndex]) + columnMargin;
        }
        ColumnsAutoSizer.adjustMaximumWidths(table, minWidths, maxWidths);
        for (int i = 0; i < minWidths.length; ++i) {
            if (minWidths[i] > 0) {
                table.getColumnModel().getColumn(i).setMinWidth(minWidths[i]);
            }
            if (maxWidths[i] <= 0) continue;
            table.getColumnModel().getColumn(i).setMaxWidth(maxWidths[i]);
            table.getColumnModel().getColumn(i).setWidth(maxWidths[i]);
        }
    }

    private static void adjustMaximumWidths(JTable table, int[] minWidths, int[] maxWidths) {
        if (table.getWidth() > 0) {
            for (int breaker = 0; ColumnsAutoSizer.sum(maxWidths) > table.getWidth() && breaker < 10000; ++breaker) {
                int highestWidthIndex = ColumnsAutoSizer.findLargestIndex(maxWidths);
                int[] arrn = maxWidths;
                int n = highestWidthIndex;
                arrn[n] = arrn[n] - 1;
                maxWidths[highestWidthIndex] = Math.max(maxWidths[highestWidthIndex], minWidths[highestWidthIndex]);
            }
        }
    }

    private static int getMaximalRequiredColumnWidth(JTable table, int columnIndex, int headerWidth) {
        int maxWidth = headerWidth;
        TableColumn column = table.getColumnModel().getColumn(columnIndex);
        TableCellRenderer cellRenderer = column.getCellRenderer();
        if (cellRenderer == null) {
            cellRenderer = new DefaultTableCellRenderer();
        }
        for (int row = 0; row < table.getModel().getRowCount(); ++row) {
            Component rendererComponent = cellRenderer.getTableCellRendererComponent(table, table.getModel().getValueAt(row, columnIndex), false, false, row, columnIndex);
            double valueWidth = rendererComponent.getPreferredSize().getWidth();
            maxWidth = (int)Math.max((double)maxWidth, valueWidth);
        }
        return maxWidth;
    }

    private static int findLargestIndex(int[] widths) {
        int largestIndex = 0;
        int largestValue = 0;
        for (int i = 0; i < widths.length; ++i) {
            if (widths[i] <= largestValue) continue;
            largestIndex = i;
            largestValue = widths[i];
        }
        return largestIndex;
    }

    private static int sum(int[] widths) {
        int sum = 0;
        for (int width : widths) {
            sum += width;
        }
        return sum;
    }
}

