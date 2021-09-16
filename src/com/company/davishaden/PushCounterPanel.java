/*
Name: Davis Haden
Date: 9/15/2021
Desc: Panel class for buttons and label
 */
package com.company.davishaden;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class PushCounterPanel extends JPanel {
    private int count;
    private JButton push,pushReduce,closeWindow;
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
        closeWindow = new JButton("Close the Application!");
        closeWindow.addActionListener(new ButtonListener());
        label = new JLabel("Number: " + count);
        add(label);
        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(300, 100));
        buttonPanel.add(push);
        buttonPanel.add(pushReduce);
        buttonPanel.add(closeWindow);
        buttonPanel.setBackground(Color.black);
        add(buttonPanel);
        setBackground(Color.white);
        setPreferredSize(new Dimension(300, 120));
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
            if(event.getSource() == closeWindow){
                System.exit(0); //Closing the program
            }
        }
    }
}
