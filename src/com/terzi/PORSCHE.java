package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PORSCHE {
    private JFrame f;
    private JPanel panel1;
    private JLabel boxster;
    private JLabel baslik;
    private JRadioButton PORSCHEPANAMERARadioButton;
    private JRadioButton PORSCHETAYCANRadioButton;
    private JRadioButton PORSCHEBOXSTERRadioButton;
    private JLabel taycan;
    private JLabel panamera;

    public PORSCHE(){
        f=new JFrame("ADAMINDAN UYGULAMASI");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(600,500));
        f.setResizable(false);
        f.add(panel1);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        PORSCHEBOXSTERRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (PORSCHEBOXSTERRadioButton.isSelected())
                {
                    new BOXSTER();
                }
            }
        });
        PORSCHEPANAMERARadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (PORSCHEPANAMERARadioButton.isSelected())
                {
                    new PANAMERA();
                }
            }
        });
        PORSCHETAYCANRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (PORSCHETAYCANRadioButton.isSelected())
                {
                    new TAYCAN();
                }
            }
        });
    }
}
