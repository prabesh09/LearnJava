import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WithinClass extends Frame implements ActionListener {
    TextField txtField;
    Label text;
    Button changeBtn;

    WithinClass() {
        setSize(400, 400);
        setTitle("Change Text");

        text = new Label("Change this text.");
        text.setBounds(10, 30, 150, 20);
        add(text);

        txtField = new TextField();
        txtField.setBounds(10, 60, 150, 20);
        add(txtField);

        changeBtn = new Button("Change Text");
        changeBtn.setBounds(10, 110, 150, 20);
        add(changeBtn);

        changeBtn.addActionListener(this);

        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String txt = txtField.getText();
        text.setText(txt.isEmpty() ? "Text Field is Empty!" : txt);
    }

    public static void main(String[] args) {
        new WithinClass();
    }
}