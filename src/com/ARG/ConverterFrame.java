package com.ARG;

import javax.swing.*;
import java.awt.*;

public class ConverterFrame extends JFrame{
    private JComboBox comboBox1;
    private JTextField textField1;
    private JComboBox comboBox2;
    private JTextField textField2;
    private JButton convertButton;
    private JPanel jpanel;

    static final int SCREEN_WIDTH = 300;
    static final int SCREEN_HEIGHT = 300;

    public ConverterFrame(){

        this.setTitle("Temperature Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(jpanel);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.pack();

        //this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.lightGray);
        this.setFocusable(true);
    }

    public static void main(String[] args) {

        var frame = new ConverterFrame();

    }

}
