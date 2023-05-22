package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RENAULT {
    private JFrame f;
    private JRadioButton RENAULTMEGANERadioButton;
    private JRadioButton RENAULTSYMBOLRadioButton;
    private JRadioButton RENAULTBROADWAYRadioButton;
    private JLabel baslik;
    private JLabel megane;
    private JLabel broadway;
    private JLabel symbol;
    private JPanel panel1;

    public RENAULT(){
        f=new JFrame("ADAMINDAN UYGULAMASI");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(600,500));
        f.setResizable(false);
        f.add(panel1);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        RENAULTMEGANERadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RENAULTMEGANERadioButton.isSelected())
                {
                    new MEGANE();
                }
            }
        });
        RENAULTBROADWAYRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RENAULTBROADWAYRadioButton.isSelected())
                {
                    new BROADWAY();
                }
            }
        });
        RENAULTSYMBOLRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RENAULTSYMBOLRadioButton.isSelected())
                {
                    new SYMBOL();
                }
            }
        });
    }
}
