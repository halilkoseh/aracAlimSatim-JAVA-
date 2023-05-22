package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HummerH1 {
    private JPanel H2;
    private JButton satinal;


    private JFrame H22;

    public HummerH1(){

        H22=new JFrame("HUMMER");
        H22.setDefaultCloseOperation(EXIT_ON_CLOSE);
        H22.setPreferredSize(new Dimension(1000,900));
        H22.setResizable(true);

        H22.add(H2);
        H22.pack();
        H22.setLocationRelativeTo(null);
        H22.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });



    }
}
