package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ROOLS_ROYCE {
    private JPanel RTr;
    private JFrame Q;

    private JRadioButton ROOLSROYCEPHANTOMRadioButton;
    private JRadioButton ROOLSROYCEGHOSTRadioButton;
    private JRadioButton ROOLSROYCEDAWNRadioButton;
    private JRadioButton ROOLSROYCEWRAITHRadioButton;




    public ROOLS_ROYCE(){
        Q=new JFrame("ROLLS ROYCE");
        Q.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Q.setPreferredSize(new Dimension(1000,900));
        Q.setResizable(true);

        ROOLSROYCEPHANTOMRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new r();
            }});

        //ROOLSROYCEGHOSTRadioButton

        ROOLSROYCEGHOSTRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new RollsRoyceGhost();
            }});

        //ROOLSROYCEDAWNRadioButton

        ROOLSROYCEDAWNRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new RollsRoyceDawn();
            }});

        ROOLSROYCEWRAITHRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new RollRoyceWraith();
            }});


        //ROOLSROYCEWRAITHRadioButton

        Q.add(RTr);
        Q.pack();
        Q.setLocationRelativeTo(null);
        Q.setVisible(true);

    }

}
