package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BugattiRoyale {
    private JPanel ry;
    private JButton satinal;


    private JFrame r;

    public BugattiRoyale(){

        r=new JFrame("BUGATTI");
        r.setDefaultCloseOperation(EXIT_ON_CLOSE);
        r.setPreferredSize(new Dimension(1000,900));
        r.setResizable(true);

        r.add(ry);
        r.pack();
        r.setLocationRelativeTo(null);
        r.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });


    }

}
