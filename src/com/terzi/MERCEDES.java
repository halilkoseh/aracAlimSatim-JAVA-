package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MERCEDES {
    private JPanel panel1;
    private JLabel baslik;
    private JLabel gt63s;
    private JLabel amga200;
    private JLabel e250;
    private JRadioButton MERCEDESGT63SRadioButton;
    private JRadioButton MERCEDESAMGA200RadioButton;
    private JRadioButton MERCEDESE250RadioButton;
    private JFrame f;
    public MERCEDES()
    {
        f=new JFrame("ADAMINDAN UYGULAMASI");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(600,500));
        f.setResizable(false);
        f.add(panel1);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        MERCEDESGT63SRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (MERCEDESGT63SRadioButton.isSelected())
                {
                    new MERSOGT63S();
                }
            }
        });
        MERCEDESAMGA200RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (MERCEDESAMGA200RadioButton.isSelected())
                {
                    new AMGA200();
                }
            }
        });
        MERCEDESE250RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (MERCEDESE250RadioButton.isSelected())
                {
                    new MERCEDESE250();
                }
            }
        });
    }
}
