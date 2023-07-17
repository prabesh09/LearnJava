package form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUser implements ActionListener {
    SignUpForm form;

    RegisterUser(SignUpForm form){
        this.form = form;
    }

    public void actionPerformed(ActionEvent ae){
        String name = form.nameField.getText();
        String username = form.userField.getText();
        String email = form.emailField.getText();
        String password = new String(form.passField.getPassword());
        String repass = new String(form.reField.getPassword());

        if (new Database().checkDuplicate(username, email)){
            JOptionPane.showMessageDialog(null, "Username or email already exists.");
        }
        else if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || repass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all the required details.");
        }
        else if(!password.equals(repass)){
            JOptionPane.showMessageDialog(null, "The passwords didn't match");
        }
        else{
            new Database();
            new Database().insertInformation(name, username, email, password);
            JOptionPane.showMessageDialog(null, "User has been successfully registered");
        }
    }
}
