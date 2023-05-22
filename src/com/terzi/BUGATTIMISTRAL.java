package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BUGATTIMISTRAL {
    private JPanel mt;
    private JButton satinal;


    private JFrame ms;

    public BUGATTIMISTRAL() {

        ms=new JFrame("BUGATTI MISTRAL");
        ms.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ms.setPreferredSize(new Dimension(1000,900));
        ms.setResizable(true);
        ms.add(mt);
        ms.pack();
        ms.setLocationRelativeTo(null);
        ms.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });




    }

}
