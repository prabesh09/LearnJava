package form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpForm extends JFrame {
    JLabel name, username, email, password, repass, account;
    JTextField nameField, userField, emailField;
    JPasswordField passField, reField;
    JButton loginBtn, signupBtn;

    SignUpForm(){
        name = new JLabel("Full Name");
        name.setBounds(20,20,150,20);
        add(name);

        nameField = new JTextField();
        nameField.setBounds(20,50,150,20);
        add(nameField);

        username = new JLabel("Username");
        username.setBounds(20,80,150,20);
        add(username);

        userField = new JTextField();
        userField.setBounds(20,110,150,20);
        add(userField);

        email = new JLabel("Email");
        email.setBounds(20,140,150,20);
        add(email);

        emailField = new JTextField();
        emailField.setBounds(20,170,150,20);
        add(emailField);

        password = new JLabel("Password");
        password.setBounds(20,200,150,20);
        add(password);

        passField = new JPasswordField();
        passField.setBounds(20,230,150,20);
        add(passField);

        repass = new JLabel("Confirm Password");
        repass.setBounds(20,260,150,20);
        add(repass);

        reField = new JPasswordField();
        reField.setBounds(20,290,150,20);
        add(reField);

        signupBtn = new JButton("SignUp");
        signupBtn.setBounds(20,330,150,20);
        add(signupBtn);

        account = new JLabel("Already have an account?");
        account.setBounds(20, 360, 150, 20);
        add(account);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(170, 360, 100, 20);
        add(loginBtn);

        RegisterUser user = new RegisterUser(this);
        signupBtn.addActionListener(user);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LogInForm();
            }
        });

        setTitle("User Registration");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
