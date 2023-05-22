package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMW {
    private JLabel baslik;
    private JPanel panel1;
    private JLabel m5;
    private JLabel f80;
    private JLabel i218;
    private JRadioButton BMWM5RadioButton;
    private JRadioButton BMW320İRadioButton;
    private JRadioButton BMW218iRadioButton;
    private JFrame f;
    public BMW(){
        f=new JFrame("ADAMINDAN UYGULAMASI");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(600,500));
        f.setResizable(false);
        f.add(panel1);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        BMW218iRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (BMW218iRadioButton.isSelected())
                {
                    new BMW218İ();
                }
            }
        });
        BMWM5RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (BMWM5RadioButton.isSelected())
                {
                    new BMWM5();
                }
            }
        });
        BMW320İRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (BMW320İRadioButton.isSelected())
                {
                    new BMW320İ();
                }
            }
        });
    }
}
