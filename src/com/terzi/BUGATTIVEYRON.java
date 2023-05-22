package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BUGATTIVEYRON {
    private JPanel KN;
    private JButton satinal;


    private JFrame DF;

    public BUGATTIVEYRON(){

        DF=new JFrame("Tesla Model S");
        DF.setDefaultCloseOperation(EXIT_ON_CLOSE);
        DF.setPreferredSize(new Dimension(1000,900));
        DF.setResizable(true);

        DF.add(KN);
        DF.pack();
        DF.setLocationRelativeTo(null);
        DF.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });


    }
}
