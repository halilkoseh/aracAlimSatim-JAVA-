package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HummerH3 {
    private JPanel H3;
    private JButton satinal;

    private JFrame H33;

    public HummerH3(){

        H33=new JFrame("HUMMER");
        H33.setDefaultCloseOperation(EXIT_ON_CLOSE);
        H33.setPreferredSize(new Dimension(1000,900));
        H33.setResizable(true);

        H33.add(H3);
        H33.pack();
        H33.setLocationRelativeTo(null);
        H33.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });



    }
}
