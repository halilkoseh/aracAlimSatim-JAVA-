package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HummerF {
    private JPanel F;
    private JButton satinal;


    private JFrame F1;

    public HummerF(){

        F1=new JFrame("HUMMER");
        F1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        F1.setPreferredSize(new Dimension(1000,900));
        F1.setResizable(true);

        F1.add(F);
        F1.pack();
        F1.setLocationRelativeTo(null);
        F1.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });


    }
}
