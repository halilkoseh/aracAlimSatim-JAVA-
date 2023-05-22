package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FORDTRANSIT {
    private JFrame f;
    private JPanel panel1;
    private JLabel baslik;
    private JLabel fordtransit;
    private JLabel ozellik;
    private JLabel model;
    private JLabel vites;
    private JLabel yakit;
    private JLabel durum;
    private JLabel cekis;
    private JLabel fiyat;
    private JButton satinal;
    private JLabel aciklama;

    public FORDTRANSIT(){
            f=new JFrame("ADAMINDAN UYGULAMASI");
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.setPreferredSize(new Dimension(1000,900));
            f.setResizable(false);
            f.add(panel1);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        satinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });

    }
}
