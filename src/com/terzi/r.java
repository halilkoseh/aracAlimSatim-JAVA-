package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class r {

    private JPanel ry;
    private JButton satinal;

    private JFrame B;

    public r(){

        B=new JFrame("ROLLS ROYCE");
        B.setDefaultCloseOperation(EXIT_ON_CLOSE);
        B.setPreferredSize(new Dimension(1000,900));
        B.setResizable(true);

        B.add(ry);
        B.pack();
        B.setLocationRelativeTo(null);
        B.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });



    }

}
