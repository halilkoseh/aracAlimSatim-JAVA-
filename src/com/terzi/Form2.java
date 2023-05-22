package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 {

    private JFrame f;
    private JPanel panel1;
    private JLabel bmw;
    private JLabel mercedes;
    private JLabel ford;
    private JLabel renault;
    private JLabel tesla;
    private JLabel royce;
    private JLabel hummer;
    private JLabel bugatti;
    private JLabel porsche;
    private JRadioButton BMWRadioButton;
    private JRadioButton fordRadioButton;
    private JRadioButton mercedesBenzRadioButton;
    private JRadioButton renaultRadioButton;
    private JRadioButton teslaRadioButton;
    private JRadioButton rollsRoyceRadioButton;
    private JRadioButton hummerRadioButton;
    private JRadioButton bugattiRadioButton;
    private JRadioButton porscheRadioButton;
    private JLabel baslik;

    public Form2(){
        f=new JFrame("ADAMINDAN UYGULAMASI");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(500,500));
        f.setResizable(false);
        f.add(panel1);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        teslaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (teslaRadioButton.isSelected())
                {
                    new TESLA();
                }
            }
        });
        porscheRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (porscheRadioButton.isSelected())
                {
                    new PORSCHE();
                }
            }
        });
        renaultRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (renaultRadioButton.isSelected())
                {
                    new RENAULT();
                }
            }
        });
        BMWRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (BMWRadioButton.isSelected())
                {
                    new BMW();
                }
            }
        });
        fordRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fordRadioButton.isSelected())
                {
                    new FORD();
                }
            }
        });
        mercedesBenzRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mercedesBenzRadioButton.isSelected())
                {
                    new MERCEDES();
                }
            }
        });

        //teslaRadioButton

        mercedesBenzRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mercedesBenzRadioButton.isSelected())
                {
                    new MERCEDES();
                }
            }
        });

//rollsRoyceRadioButton
        rollsRoyceRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rollsRoyceRadioButton.isSelected())
                {
                    new ROOLS_ROYCE();
                }
            }
        });

//hummerRadioButton
        hummerRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hummerRadioButton.isSelected())
                {
                    new HUMMER();
                }
            }
        });
//bugattiRadioButton

        bugattiRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bugattiRadioButton.isSelected())
                {
                    new BUGATTI();
                }
            }
        });

    }


}
