package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HUMMER {
    private JPanel PNLL;
    private JRadioButton HUMMER2023RadioButton;
    private JRadioButton HUMMERH1RadioButton;
    private JRadioButton HUMMERH3RadioButton;
    private JRadioButton HUMMEREVRadioButton;


    private JFrame HH;


    public HUMMER(){
        HH=new JFrame("HUMMER");
        HH.setDefaultCloseOperation(EXIT_ON_CLOSE);
        HH.setPreferredSize(new Dimension(1000,900));
        HH.setResizable(true);

        HUMMER2023RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new Hummer2023();
            }});


        HUMMERH1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new HummerH1();
            }});

//HUMMERH3RadioButton


        HUMMERH3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new HummerH3();
            }});

//HUMMER EV

        HUMMEREVRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new HummerF();
            }});

        HH.add(PNLL);
        HH.pack();
        HH.setLocationRelativeTo(null);
        HH.setVisible(true);
    }
}
