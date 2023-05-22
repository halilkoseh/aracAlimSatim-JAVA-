package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MERCEDESE250 {
    private JLabel baslik;
    private JPanel panel1;
    private JLabel ozellik;
    private JLabel model;
    private JLabel yakit;
    private JLabel vites;
    private JLabel durum;
    private JLabel cekis;
    private JLabel fiyat;
    private JLabel aciklama;
    private JButton SATINALButton;
    private JLabel resim;
    private JFrame f;
    public MERCEDESE250(){
        f=new JFrame("ADAMINDAN UYGULAMASI");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(1000,1000));
        f.setResizable(false);
        f.add(panel1);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        SATINALButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ARACINIZ SEPETİNİZE EKLENMİŞTİR");
            }
        });
    }
}
