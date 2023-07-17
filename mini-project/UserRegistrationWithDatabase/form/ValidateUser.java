package form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidateUser implements ActionListener {
    LogInForm form;

    ValidateUser(LogInForm form){
        this.form = form;
    }

    public void actionPerformed(ActionEvent ae){
        String username = form.userField.getText();
        char[] pass = form.passField.getPassword();
        String password = new String(pass);

        if(new Database().checkUser(username, password)){
            form.dispose();
            new Homepage();
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect information");
        }
    }
}
