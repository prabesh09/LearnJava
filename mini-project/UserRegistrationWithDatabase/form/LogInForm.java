package form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInForm extends JFrame {
    JLabel username, password, account;
    JTextField userField;
    JPasswordField passField;
    JButton loginBtn, signupBtn;

    public LogInForm(){
        username = new JLabel("Username");
        username.setBounds(20,20,150,20);
        add(username);

        userField = new JTextField();
        userField.setBounds(20,50,150,20);
        add(userField);

        password = new JLabel("Password");
        password.setBounds(20,80, 150,20);
        add(password);

        passField = new JPasswordField();
        passField.setBounds(20,110,150,20);
        add(passField);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(20,150,150,20);
        add(loginBtn);

        account = new JLabel("Don't have an account?");
        account.setBounds(20, 180, 150, 20);
        add(account);

        signupBtn = new JButton("SignUp");
        signupBtn.setBounds(170, 180, 100, 20);
        add(signupBtn);

        ValidateUser user = new ValidateUser(this);
        loginBtn.addActionListener(user);
        signupBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new SignUpForm();
            }
        });

        setTitle("Login form");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
