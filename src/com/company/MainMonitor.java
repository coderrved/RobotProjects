package com.company;

import javax.swing.*;
import java.awt.*;

public class MainMonitor extends JFrame {

    public MainMonitor(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String args[]){

        UseOfGraphics graphics = new UseOfGraphics();
        MainMonitor mainMonitor = new MainMonitor("Use of Graphics");

        mainMonitor.setVisible(true);
        mainMonitor.setResizable(true);
        mainMonitor.setSize(600,625);
        mainMonitor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMonitor.add(graphics);
    }



}
