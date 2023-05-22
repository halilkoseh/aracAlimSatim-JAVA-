package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RollsRoyceGhost {
    private JPanel pnl2;
    private JButton satinal;
    private JFrame bhj;

    public RollsRoyceGhost(){

        bhj=new JFrame("ROLLS ROYCE");
        bhj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        bhj.setPreferredSize(new Dimension(1000,900));
        bhj.setResizable(true);

        bhj.add(pnl2);
        bhj.pack();
        bhj.setLocationRelativeTo(null);
        bhj.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });



    }
}
