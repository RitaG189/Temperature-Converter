package com.ARG;

import javax.swing.*;

public class ConverterFrame extends JFrame {

    public ConverterFrame() {

        this.add(new ConverterPanel());
        this.setTitle("Temperature Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
