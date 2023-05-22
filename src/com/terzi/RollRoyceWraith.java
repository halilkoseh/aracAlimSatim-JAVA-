package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RollRoyceWraith {
    private JPanel R11;
    private JButton satinal;

    private JFrame R1;

    public RollRoyceWraith(){

        R1=new JFrame("ROLLS ROYCE");
        R1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        R1.setPreferredSize(new Dimension(1000,900));
        R1.setResizable(true);

        R1.add(R11);
        R1.pack();
        R1.setLocationRelativeTo(null);
        R1.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });




    }
}
