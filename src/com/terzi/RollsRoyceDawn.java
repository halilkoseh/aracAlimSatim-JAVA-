package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RollsRoyceDawn {
    private JPanel dawn;
    private JButton satinal;

    private JFrame w;

    public RollsRoyceDawn(){

        w=new JFrame("ROLLS ROYCE");
        w.setDefaultCloseOperation(EXIT_ON_CLOSE);
        w.setPreferredSize(new Dimension(1000,900));
        w.setResizable(true);

        w.add(dawn);
        w.pack();
        w.setLocationRelativeTo(null);
        w.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });



    }
}
