package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FORD {
    private JPanel panel1;
    private JLabel baslik;
    private JLabel fordmustang;
    private JLabel transit;
    private JLabel focus;
    private JRadioButton FORDMUSTANGRadioButton;
    private JRadioButton FORDTRANSITRadioButton;
    private JRadioButton FORDFOCUSRadioButton;
    private JFrame f;
    public FORD()
    {
        f=new JFrame("ADAMINDAN UYGULAMASI");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(600,500));
        f.setResizable(false);
        f.add(panel1);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        FORDMUSTANGRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(FORDMUSTANGRadioButton.isSelected())
                {
                    new FORDMUSTANG();
                }
            }
        });
        FORDTRANSITRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FORDTRANSITRadioButton.isSelected())
                {
                    new FORDTRANSIT();
                }
            }
        });
        FORDFOCUSRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FORDFOCUSRadioButton.isSelected())
                {
                    new FORDFOCUS();
                }
            }
        });
    }
}
