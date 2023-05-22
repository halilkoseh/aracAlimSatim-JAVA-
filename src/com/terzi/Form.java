package com.terzi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Form extends JDialog{

    private JFrame f;
    private JPanel abo;
    private JLabel baslik;
    private JLabel k_ad;
    private JButton girişYapButton;
    private JTextField tfEmail;
    private JPasswordField pfPassword;
    private JLabel k_sifre;
    private JCheckBox şifreyiGösterCheckBox;
    private JButton btnCancel;


    public Form(JFrame parent)
    {

        super(parent);
        setTitle("Login");
        setContentPane(abo);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Color c=new Color(4,36,83);
        abo.setBackground(c);
        abo.setBounds(0,0,450,474);
        şifreyiGösterCheckBox.setBackground(c);
        şifreyiGösterCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (şifreyiGösterCheckBox.isSelected())
                {
                    pfPassword.setEchoChar((char)0);
                }
                else{
                    pfPassword.setEchoChar('*');
                }
            }
        });

        girişYapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = tfEmail.getText();
                String password = String.valueOf(pfPassword.getPassword());

                user = getAuthenticatedUser(email, password);

                if (user != null) {
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(Form.this,
                            "Email or Password Invalid",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public User user;
    private User getAuthenticatedUser(String email, String password) {
        User user = null;

        final String DB_URL = "jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.name = resultSet.getString("name");
                user.email = resultSet.getString("email");
                user.phone = resultSet.getString("phone");
                user.address = resultSet.getString("address");
                user.password = resultSet.getString("password");
                if (tfEmail.getText().equals(user.email)&&pfPassword.getText().equals(user.password))
                {
                    JOptionPane.showMessageDialog(null,"ADAMINDAN UYGULAMASINA HOŞGELDİNİZ SAYIN:\n"+user.name);
                    new Form2();
                }
                else{
                    JOptionPane.showMessageDialog(null,"yanlış girdiniz");
                }
            }

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }


        return user;
    }

    public static void main(String[] args) {
        Form loginForm = new Form(null);
        User user = loginForm.user;
        if (user != null) {
            System.out.println("Successful Authentication of: " + user.name);
            System.out.println("          Email: " + user.email);
            System.out.println("          Phone: " + user.phone);
            System.out.println("          Address: " + user.address);
        }
        else {
            System.out.println("Authentication canceled");
        }


    }

}
