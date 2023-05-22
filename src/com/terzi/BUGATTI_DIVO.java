package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BUGATTI_DIVO {
    private JPanel bg;
    private JList list1;
    private JButton satinal;


    private JFrame b;
    public BUGATTI_DIVO(){

        b=new JFrame("BUGATTI");
        b.setDefaultCloseOperation(EXIT_ON_CLOSE);
        b.setPreferredSize(new Dimension(1000,900));
        b.setResizable(true);

        b.add(bg);
        b.pack();
        b.setLocationRelativeTo(null);
        b.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });


    }


}
