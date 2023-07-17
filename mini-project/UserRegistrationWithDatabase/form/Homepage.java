package form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame {
    Homepage(){
        JLabel label = new JLabel("Welcome to this app...");
        label.setBounds(20,30,150,30);
        add(label);

        JButton logout = new JButton("Log out");
        logout.setBounds(20, 60, 150, 20);
        add(logout);

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LogInForm();
            }
        });

        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setTitle("Homepage");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
