package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FORDMUSTANG {
    private JPanel panel1;
    private JLabel mustangresim;
    private JLabel ozellik;
    private JLabel model;
    private JLabel yakit;
    private JLabel vites;
    private JLabel durum;
    private JLabel cekis;
    private JButton satinal;
    private JLabel baslik;
    private JLabel aciklama;
    private JLabel fiyat;
    private JFrame f;
    public FORDMUSTANG(){
        f=new JFrame("ADAMINDAN UYGULAMASI");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(1000,800));
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
