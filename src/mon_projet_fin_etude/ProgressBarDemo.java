/*
 * Decompiled with CFR 0_123.
 */
package mon_projet_fin_etude;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.border.Border;

public class ProgressBarDemo
extends JPanel
implements ActionListener,
PropertyChangeListener {
    private JProgressBar progressBar;
    private JButton startButton = new JButton("Start");
    private JTextArea taskOutput;
    private Task task;

    public ProgressBarDemo() {
        super(new BorderLayout());
        this.startButton.setActionCommand("start");
        this.startButton.addActionListener(this);
        this.progressBar = new JProgressBar(0, 100);
        this.progressBar.setValue(0);
        this.progressBar.setStringPainted(true);
        this.taskOutput = new JTextArea(5, 20);
        this.taskOutput.setMargin(new Insets(5, 5, 5, 5));
        this.taskOutput.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(this.startButton);
        panel.add(this.progressBar);
        this.add((Component)panel, "First");
        this.add((Component)new JScrollPane(this.taskOutput), "Center");
        this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        this.startButton.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(3));
        this.task = new Task();
        this.task.addPropertyChangeListener(this);
        this.task.execute();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer)evt.getNewValue();
            this.progressBar.setValue(progress);
            this.taskOutput.append(String.format("Completed %d%% of task.\n", this.task.getProgress()));
        }
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("ProgressBarDemo");
        frame.setDefaultCloseOperation(3);
        ProgressBarDemo newContentPane = new ProgressBarDemo();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                ProgressBarDemo.createAndShowGUI();
            }
        });
    }

    class Task
    extends SwingWorker<Void, Void> {
        Task() {
        }

        @Override
        public Void doInBackground() {
            Random random = new Random();
            int progress = 0;
            this.setProgress(0);
            while (progress < 100) {
                try {
                    Thread.sleep(random.nextInt(1000));
                }
                catch (InterruptedException ignore) {
                    // empty catch block
                }
                this.setProgress(Math.min(progress += random.nextInt(10), 100));
            }
            return null;
        }

        @Override
        public void done() {
            Toolkit.getDefaultToolkit().beep();
            ProgressBarDemo.this.startButton.setEnabled(true);
            ProgressBarDemo.this.setCursor(null);
            ProgressBarDemo.this.taskOutput.append("Done!\n");
        }
    }

}

