package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Hummer2023 {
    private JPanel H1;
    private JButton satinal;


    private JFrame H11;

    public Hummer2023(){

        H11=new JFrame("HUMMER");
        H11.setDefaultCloseOperation(EXIT_ON_CLOSE);
        H11.setPreferredSize(new Dimension(1000,1100));
        H11.setResizable(true);

        H11.add(H1);
        H11.pack();
        H11.setLocationRelativeTo(null);
        H11.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });



    }

}
