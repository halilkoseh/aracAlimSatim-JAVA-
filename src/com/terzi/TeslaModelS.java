package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TeslaModelS {
    private JPanel PL;
    private JList list1;
    private JList list2;
    private JButton satinal;

    private JFrame T;


    public TeslaModelS(){
        T=new JFrame("Tesla Model S");
        T.setDefaultCloseOperation(EXIT_ON_CLOSE);
        T.setPreferredSize(new Dimension(1000,900));
        T.setResizable(true);



        T.add(PL);
        T.pack();
        T.setLocationRelativeTo(null);
        T.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });
    }

}
