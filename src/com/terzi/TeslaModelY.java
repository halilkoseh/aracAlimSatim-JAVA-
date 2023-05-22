package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TeslaModelY {
    private JPanel hj;
    private JList list1;
    private JButton satinal;

    private JFrame o;

    public TeslaModelY(){

        o=new JFrame("Tesla Model Y");
        o.setDefaultCloseOperation(EXIT_ON_CLOSE);
        o.setPreferredSize(new Dimension(1000,900));
        o.setResizable(true);

        o.add(hj);
        o.pack();
        o.setLocationRelativeTo(null);
        o.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });


    }
}
