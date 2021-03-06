/*
Name: Davis Haden
Date: 9/15/2021
Desc: Main class which creates a JFrame object and presents it to the user.
 */
package com.company.davishaden;
import javax.swing.*;
public class Main {

    public static void main(String[] args){
        JFrame frame = new JFrame("Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PushCounterPanel panel = new PushCounterPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
