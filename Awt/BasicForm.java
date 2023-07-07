import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BasicForm {
    Frame frame;
    Label name, lName, age, description;
    TextField nameField, lNameField, ageField, descriptionField;
    Button submitBtn, resetBtn;

    BasicForm() {
        frame = new Frame("Form");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        name = new Label("First Name:");
        name.setBounds(20, 50, 80, 20);
        frame.add(name);

        nameField = new TextField();
        nameField.setBounds(120, 50, 150, 20);
        frame.add(nameField);

        lName = new Label("Last Name:");
        lName.setBounds(20, 80, 80, 20);
        frame.add(lName);

        lNameField = new TextField();
        lNameField.setBounds(120, 80, 150, 20);
        frame.add(lNameField);

        age = new Label("Age:");
        age.setBounds(20, 110, 80, 20);
        frame.add(age);

        ageField = new TextField();
        ageField.setBounds(120, 110, 150, 20);
        frame.add(ageField);

        description = new Label("Description:");
        description.setBounds(20, 140, 80, 20);
        frame.add(description);

        descriptionField = new TextField();
        descriptionField.setBounds(120, 140, 150, 60);
        frame.add(descriptionField);

        submitBtn = new Button("Submit");
        submitBtn.setBounds(50, 220, 80, 30);
        frame.add(submitBtn);

        resetBtn = new Button("Reset");
        resetBtn.setBounds(150, 220, 80, 30);
        frame.add(resetBtn);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new BasicForm();
    }
}