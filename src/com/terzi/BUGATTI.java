package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BUGATTI {
    private JPanel panel1;
    private JRadioButton BUGATTIDIVORadioButton;
    private JRadioButton BUGATTIMISTRALRadioButton;
    private JRadioButton BUGATTIVEYRONRadioButton;
    private JRadioButton BUGATTIROYALERadioButton;

    private JFrame f;

    public BUGATTI(){
        f=new JFrame("BUGATTI");
        //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(1000,900));
        f.setResizable(true);

        BUGATTIDIVORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new BUGATTI_DIVO();
            }});

        BUGATTIMISTRALRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new BUGATTIMISTRAL();
            }});

        BUGATTIVEYRONRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new BUGATTIVEYRON();
            }});
        BUGATTIROYALERadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new BugattiRoyale();
            }});
        //BUGATTIROYALERadioButton
        f.add(panel1);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }



}
