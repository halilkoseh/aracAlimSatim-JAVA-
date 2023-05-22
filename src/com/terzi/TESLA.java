package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TESLA {
    private JPanel PNL;
    private JRadioButton TESLAMODELSRadioButton;
    private JRadioButton citirHasarliTESLAMODELRadioButton;
    private JRadioButton TESLAMODELYRadioButton;
    private JRadioButton TESLAMODELXRadioButton;

    private JFrame H;


    public TESLA(){
        H=new JFrame("TESLA");
        H.setDefaultCloseOperation(EXIT_ON_CLOSE);
        H.setPreferredSize(new Dimension(1600,900));
        H.setResizable(true);

        TESLAMODELSRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new TeslaModelS();
            }});


        citirHasarliTESLAMODELRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new TeslaModel3();
            }});


        TESLAMODELYRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new TeslaModelY();
            }});

        TESLAMODELXRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new TeslaModelX();
            }});


        H.add(PNL);
        H.pack();
        H.setLocationRelativeTo(null);
        H.setVisible(true);
    }


}
