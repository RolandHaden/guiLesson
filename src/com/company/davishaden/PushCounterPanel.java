package com.company.davishaden;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class PushCounterPanel extends JPanel {
    private int count;
    private JButton push,pushReduce;
    private JLabel label;
    private JPanel buttonPanel;
    private JPanel mainPanel;
    int colorCode = 0;

    /**
     * Constructor: Sets up the GUI.
     */
    public PushCounterPanel() {
        count = 0;
        push = new JButton("Increase!");
        push.addActionListener(new ButtonListener());
        pushReduce = new JButton("Reduce!");
        pushReduce.addActionListener(new ButtonListener());
        label = new JLabel("Number: " + count);
        add(label);
        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(300, 100));
        buttonPanel.add(push);
        buttonPanel.add(pushReduce);
        buttonPanel.setBackground(Color.black);
        add(buttonPanel);
        setBackground(Color.white);
        setPreferredSize(new Dimension(300, 60));
    }
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == push) {
                count++;
                setBackground(new Color((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)));
                label.setText("Number: " + count);

            }
            if(event.getSource() == pushReduce){
                count--;
                setBackground(new Color((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)));
                label.setText("Number: " + count);
            }
        }
    }
}
