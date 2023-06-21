package com.lsc.personal.tools.gui;

import javax.swing.*;
import java.awt.event.*;

public class GUITools extends JDialog {
    private JPanel contentPane;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JTextArea textArea2;


    public GUITools() {
        setContentPane(contentPane);
        setModal(true);

    }



    public static void main(String[] args) {
        GUITools dialog = new GUITools();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
