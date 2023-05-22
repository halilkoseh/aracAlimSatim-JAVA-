package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TeslaModelX {

    private JPanel jk;
    private JList list1;
    private JButton satinal;

    private JFrame p;




    public TeslaModelX(){


        p=new JFrame("Tesla Model S");
        p.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setPreferredSize(new Dimension(1000,900));
        p.setResizable(true);

        p.add(jk);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });


    }
}
